package org.javaboy.vhr.explain;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Vadiate {
    public int max() default 10;
    public  int min() default 1;
    public boolean isNotNull() default true;
}
