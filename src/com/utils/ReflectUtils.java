package com.utils;

import org.apache.commons.lang3.reflect.MethodUtils;

/**
 * Created by yhf on 2015/9/15.
 */
public class ReflectUtils {

    public static Object invokeMethod(final Object object, final String methodName) {
        try {
            return MethodUtils.invokeMethod(object, methodName);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object invokeMethod(final Object object, final String methodName,
                                      Object... args) {
        try {
            return MethodUtils.invokeMethod(object, methodName, args);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object invokeExactStaticMethod(final Class<?> cls, final String methodName,
                                                 Object... args) {
        try {
            return MethodUtils.invokeStaticMethod(cls, methodName, args);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
