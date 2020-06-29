package me.xenforu.kelo.command.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * made by Xen for Kelo
 * at 1/3/2020
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CommandManifest {
    String label();
    String description() default "Not found!";
    String[] handles() default {};
}
