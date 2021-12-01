package org.javaboy.vhr.explain;

import java.lang.annotation.*;

/**
 *
 * @author xushuai
 * @date 2021/12/1 1:35 下午
 * @param null
 * @return null
 */
@Documented
@Inherited
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Init {
    public String value() default "123";
}
