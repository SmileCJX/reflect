package pers.caijx.reflect.method;

/**
 * Created by Administrator on 2017/11/26/026.
 */
public class ClassDemo4 {

    public static void main(String[] args) {
        ClassUtil.printFieldMessage("hello");
        System.out.println("-------------------");
        ClassUtil.printFieldMessage(new Integer(1));
    }
}
