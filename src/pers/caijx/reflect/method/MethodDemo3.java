package pers.caijx.reflect.method;

/**
 * Created by Administrator on 2017/11/26/026.
 */
public class MethodDemo3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        User u1 = new User("zhangsan", "123456", 30);
        System.out.println(BeanUtil.getValueByPropertyName(u1, "username"));
        System.out.println(BeanUtil.getValueByPropertyName(u1, "userpass"));
        System.out.println(BeanUtil.getValueByPropertyName(u1, "age"));
    }

}