package pers.caijx.reflect.method;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/11/26/026.
 */
public class MethodDemo1 {

    public static void main(String[] args) {
        //要获取print(int,int)方法，1要获取一个方法就是获取类的信息，获取类的信息首先要获取类的类类型
        A a1 = new A();
        Class c = a1.getClass();
        /**
         * 2.获取方法，名称和参数列表来决定
         * getMethod获取的是public的方法
         *
         */
        try {
//            Method m = c.getMethod("print",new Class[]{int.class,int.class});
            Method m = c.getMethod("print",int.class,int.class);
            //方法的反射操作
//            a1.print(1,2);方法的反射操作是用m对象来进行方法调用和a1.print调用的效果完全相同
            //方法如果没有返回值返回null，有返回值返回具体的返回值
//            Object o = m.invoke(a1,new Object[]{10,20});
            Object o = m.invoke(a1,10,20);
            System.out.println("----------------------------");
            //获取方法print(String,String)
            Method m2 = c.getMethod("print",String.class,String.class);
            //用方法进行反射操作
            o = m2.invoke(a1,new Object[]{"Hello","world"});
            System.out.println("---------------------------");
            Method m3 = c.getMethod("print");
//            o = m3.invoke(a1);
            o = m3.invoke(a1,new Object[]{});
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class A {

    public void print() {
        System.out.println("Hello world!!!!");
    }

    public void print(int a,int b) {
        System.out.println(a + b);
    }

    public void print(String a,String b) {
        System.out.println(a.toUpperCase() + "," + b.toUpperCase());
    }
}
