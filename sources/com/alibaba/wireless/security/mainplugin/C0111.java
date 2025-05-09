package com.alibaba.wireless.security.mainplugin;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.alibaba.wireless.security.mainplugin.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0111 {

    /* renamed from: а  reason: contains not printable characters */
    private static Object f47;

    /* renamed from: б  reason: contains not printable characters */
    private static Method f48;

    /* renamed from: в  reason: contains not printable characters */
    private static Method f49;

    /* renamed from: г  reason: contains not printable characters */
    private static Field f50;

    /* renamed from: д  reason: contains not printable characters */
    private static Class f51;

    /* renamed from: а  reason: contains not printable characters */
    public static Object m64() {
        try {
            if (f51 != null) {
                Field[] declaredFields = f51.getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Field field = declaredFields[i];
                    if (!field.isSynthetic() && !field.getType().isPrimitive() && !Modifier.isStatic(field.getModifiers()) && Modifier.isPrivate(field.getModifiers()) && !Modifier.isFinal(field.getModifiers()) && !field.getType().getPackage().getName().startsWith("android.") && !field.getType().getPackage().getName().startsWith("java.")) {
                        Class<?>[] interfaces = field.getType().getInterfaces();
                        if (interfaces.length > 0 && "com.alibaba.wireless.security.framework.ISGPluginManager".equals(interfaces[0].getName())) {
                            f50 = field;
                            break;
                        }
                    }
                    i++;
                }
            }
            if (f47 == null || f50 == null) {
                return null;
            }
            f50.setAccessible(true);
            return f50.get(f47);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    public static void m65() {
        try {
            Class<?> cls = Class.forName("com.alibaba.wireless.security.framework.SGApmMonitorManager");
            f51 = cls;
            if (cls != null) {
                Method method = cls.getMethod("getInstance", new Class[0]);
                f48 = f51.getMethod("monitorStart", String.class);
                f49 = f51.getMethod("monitorEnd", String.class);
                if (method != null) {
                    f47 = method.invoke(f51, new Object[0]);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: в  reason: contains not printable characters */
    public static void m66(String str) {
        try {
            if (f47 != null && f49 != null) {
                f49.invoke(f47, str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    public static void m67(String str) {
        try {
            if (f47 != null && f48 != null) {
                f48.invoke(f47, str);
            }
        } catch (Exception unused) {
        }
    }
}
