package com.may.annotation;

import java.lang.annotation.*;

/**
 * @author Administrator
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {

    /**
     * 供应商编号
     *
     * @return
     */
    public int id() default -1;

    /**
     * 供应商编号
     *
     * @return
     */
    public String name() default "";

    /**
     * 供应商地址
     *
     * @return
     */
    public String address() default "";

}
