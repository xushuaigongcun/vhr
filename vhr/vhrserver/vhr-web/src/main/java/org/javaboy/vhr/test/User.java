package org.javaboy.vhr.test;

import org.javaboy.vhr.explain.Init;
import org.javaboy.vhr.explain.Vadiate;

/**
 * @author xushuai
 * @date 2021年12月01日 1:38 下午
 */
public class User {
    @Vadiate(min = 1,max = 10)
    private String name;
    private String age;

    public String getName() {
        return name;
    }
   @Init(value = "xushuai6666666666666")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
  @Init(value = "123")
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user = UserFactory.create();


        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(UserCheck.check(user));
    }
}
