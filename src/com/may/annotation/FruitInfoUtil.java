package com.may.annotation;

import org.springframework.core.annotation.AnnotationUtils;

import java.awt.*;
import java.lang.reflect.Field;

public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = "水果名称：";
        String strFruitColor = "水果颜色：";
        StringBuilder strFruitProvider = new StringBuilder("水果供应商：");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fruitColor().name();
                System.out.println(strFruitColor);
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider = strFruitProvider.append("供应商编号：").append(fruitProvider.id()).append("；供应商名称：").append(
                        fruitProvider.name()).append("；供应商地址：").append(fruitProvider.address());
                System.out.println(strFruitProvider);
            }
        }
    }
    public static void main(String[] args) {
        FruitInfoUtil.getFruitInfo(Apple.class);

        //判断一个类是否有某个注解*****该工具类还有其他工具方法
//        Component annotation = AnnotationUtils.findAnnotation(Apple.class, Component.class);
//        if (annotation != null) {
//            System.out.println("Apple类的注解为Comment注解类，且注解值annotation = " + annotation.value());
//        }
    }

}
