package pers.caijx.reflect.method;

/**
 * Created by Administrator on 2017/11/26/026.
 */
public class ClassDemo2 {

    public static void main(String[] args) {
        Class c1 = int.class;  //int类的类类型
        Class c2 = String.class;  //String类的类型
        Class c3 = double.class;
        Class c4 = Double.class;
        Class c5 = void.class;

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());  //不包含包名的类的名称
        System.out.println(c5.getName());
    }
}
