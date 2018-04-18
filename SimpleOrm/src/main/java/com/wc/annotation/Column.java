package com.wc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)//用于描述域
public @interface Column {
	// 字段名称,这里暂时只需要用到这个
	String value();
}
