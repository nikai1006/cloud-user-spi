package cn.net.nikai.cloud.user.annotation;

import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AllType {

    String stringType() default "";

    int intType() default 0;

    long longType() default 0;

    short shortType() default 0;

    double doubleType() default 0;

    float floatType() default 0;

    char charType() default '0';

    byte byteType() default 0;

    boolean booleanType() default false;

    Class classType() default Void.class;

    Example antType() default @Example(value = @ExampleProperty(mediaType = "", value = ""));

    Sex enumType() default Sex.GIRL;

    String[] stringTypes() default {};

    int[] intTypes() default {};

    long[] longTypes() default {};

    short[] shortTypes() default {};

    double[] doubleTypes() default {};

    float[] floatTypes() default {};

    char[] charTypes() default {};

    byte[] byteTypes() default {};

    boolean[] booleanTypes() default {};

    Class[] classTypes() default {};

    Example[] antTypes() default {};

    Sex[] enumTypes() default {};
}
