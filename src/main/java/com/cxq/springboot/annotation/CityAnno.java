package com.cxq.springboot.annotation;

import java.lang.annotation.*;

/**
 * Created by wangyang on 2019/5/31.
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CityAnno {

//    /**
//     * 操作标识
//     *
//     * @return
//     */
//    String operate() default "";
//
//    /**
//     * 来源
//     *
//     * @return
//     */
//    String source() default "";
//
//    /**
//     * 阶段
//     *
//     * @return
//     */
//    String stage() default "";
//
//    /**
//     * 描述
//     *
//     * @return
//     */
//    String describe() default "";

}
