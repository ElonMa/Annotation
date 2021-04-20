package com.may.annotation;

import java.lang.annotation.*;

/**
 * 元注解
 * 1.@Target,
 * 2.@Retention,
 * 3.@Documented,
 * 4.@Inherited
 * @author Administrator
 */


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {

    /**
     * 颜色枚举
     */
    enum Color {
        BLUE, RED, GREEN
    }

    /**
     * 颜色注解
     *
     * @return
     */
    Color fruitColor() default Color.GREEN;


}



