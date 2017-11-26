package pers.caijx.reflect.method;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/11/26/026.
 */
public class MethodDemo4 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        Class c1 = list.getClass();
        Class c2 = list1.getClass();
        System.out.println(c1 == c2);
        //反射的操作都是编译之后的操作
        //c1 == c2 结果返回true说明编译之后集合的泛型是去泛型化的
        //Java中集合的泛型，是防止错误输入的，只有在编译阶段有效
        //绕过编译就无效
        //验证，通过方法的反射来操作，绕过编译
        try {
            Method m = c1.getMethod("add", Object.class);
            m.invoke(list1, 100); //绕过编译就绕过了泛型
            System.out.println(list1.size());
            System.out.println(list1);
            //现在不能这样遍历
//            for (String s : list1) {
//                System.out.println(s);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
