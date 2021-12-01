package org.javaboy.vhr.test;
import org.javaboy.vhr.explain.Vadiate;


import java.lang.reflect.Field;

/**
 * @author xushuai
 * @date 2021年12月01日 5:09 下午
 */
public class UserCheck {
    public static boolean check(User user){
        if (user == null){
            System.out.println("!!!user对象不能为空");
            return false;
        }
        Field[] declaredFields = User.class.getDeclaredFields();

            if (declaredFields != null && declaredFields.length>0){
                for (Field declaredField : declaredFields) {
                    //如果有注解，就校验
                    if (declaredField.isAnnotationPresent(Vadiate.class)){
                        Vadiate annotation = declaredField.getAnnotation(Vadiate.class);
                        System.out.println(declaredField.getName()+"adasd");
                        if (declaredField.getName().equals("name")){
                            System.out.println(user.getName().length());
                        if(user.getName().length()> annotation.max()|| user.getName().length()<annotation.min()){
                            System.out.println("长度必须大于1小于10");
                            return false;
                        }
                    }
                }}}
        return true;
        }


    }


