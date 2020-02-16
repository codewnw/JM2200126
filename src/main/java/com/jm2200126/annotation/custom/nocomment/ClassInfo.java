package com.jm2200126.annotation.custom.nocomment;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface ClassInfo {

	String author() default "Foo";

	String[] reviewers() default { "Fowler" };

	int version() default 0;

	String createdDate() default "01-Jan-2020";
}
