package kz.halyk.annotations;

import kz.halyk.enums.Operation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ArithmeticAnnotation {

    boolean isCorrect();

    Operation correctOperationToApply();

}
