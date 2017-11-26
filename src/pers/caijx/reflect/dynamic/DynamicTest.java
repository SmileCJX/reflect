package pers.caijx.reflect.dynamic;

/**
 * Created by Administrator on 2017/11/26/026.
 */
public class DynamicTest {

    public static void main(String[] args) {
        try {
            Class instance = Class.forName("pers.caijx.reflect.dynamic.Word");
            OfficeInterface officeInterface = (OfficeInterface) instance.newInstance();
            officeInterface.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
