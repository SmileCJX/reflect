package pers.caijx.reflect.classtest;

/**
 * Created by Administrator on 2017/11/26/026.
 */
public class ClassDemo1 {

    public static void main(String[] args) {
        Foo foo = new Foo();
        //第一种表达方式---》任何一个类都有一个隐含的静态成员
        Class c1 = Foo.class;
        //知道该类的对象，通过getClass()方法
        Class c2 = foo.getClass();
        //c1,c2表示Foo类的类类型（Class type）
        //万事万物皆对象，类也是对象，是Class类的实例对象，这个对象称为类的类类型
        //一个类只有可能是Class类的一个实例对象
        System.out.println(c1 == c2);

        Class c3 = null;
        try {
            c3 = Class.forName("pers.caijx.reflect.classtest.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c2 == c3);

        try {
            //通过该类的类类型创建该类的实例-----》通过c1,c2,c3创建Foo的实例
            Foo foo2 = (Foo) c1.newInstance();
            foo2.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Foo {

    public void print() {
        System.out.println("Foo");
    }
}
