package pers.caijx.reflect.method;

/**
 * Created by Administrator on 2017/11/26/026.
 */
public class ClassDemo3 {

    public static void main(String[] args) {
        String type = "hello";
        ClassUtil.printFieldMessage(type);

        Integer n1 = 1;
        ClassUtil.printMethodMessage(n1);
    }
}
