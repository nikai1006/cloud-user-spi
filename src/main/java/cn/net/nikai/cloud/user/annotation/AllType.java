package cn.net.nikai.cloud.user.annotation;

import io.swagger.annotations.Example;

public @interface AllType {

    String stringType();

    int intType();

    long longType();

    short shortType();

    double doubleType();

    float floatType();

    char charType();

    byte byteType();

    boolean booleanType();

    Class classType();

    Example antType();

    String[] stringTypes();

    int[] intTypes();

    long[] longTypes();

    short[] shortTypes();

    double[] doubleTypes();

    float[] floatTypes();

    char[] charTypes();

    byte[] byteTypes();

    boolean[] booleanTypes();

    Class[] classTypes();

    Example[] antTypes();
}
