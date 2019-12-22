package com.java4all.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * @author ITyunqing
 * @email 1186355422@qq.com
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Idempotent {

    boolean isIdempotent() default false;

    int expireTime() default 6;

    TimeUnit timeUnit() default TimeUnit.SECONDS;

    String info() default "Don’t repeat operate, try again later!";

    boolean delKey() default false;

}
