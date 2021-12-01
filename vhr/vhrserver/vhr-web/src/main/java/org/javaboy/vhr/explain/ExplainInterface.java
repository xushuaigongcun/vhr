package org.javaboy.vhr.explain;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author xushuai
 * @date 2021年12月01日 9:40 上午
 * 自定义注解
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface ExplainInterface {
    String value() default "";
}
