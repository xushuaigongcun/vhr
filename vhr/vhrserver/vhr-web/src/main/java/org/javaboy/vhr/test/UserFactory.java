package org.javaboy.vhr.test;

import org.javaboy.vhr.explain.Init;

import java.lang.reflect.Method;

/**
 * @author xushuai
 * @date 2021年12月01日 4:27 下午
 */
public class UserFactory {
    public static  User create() {
        User user = new User();
        //通过反射获取user类中的所有方法
        Method[] methods = User.class.getDeclaredMethods();
        try {
            for (Method method : methods) {
                //如果有注解就吧注解里的数据复制到user对象里
                if (method.isAnnotationPresent(Init.class)) {
                    Init annotation = method.getAnnotation(Init.class);
                    method.invoke(user, annotation.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
        return user;
    }
}
