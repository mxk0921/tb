package com.alibaba.wireless.security.middletierplugin;

import java.lang.reflect.Method;

/* renamed from: com.alibaba.wireless.security.middletierplugin.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0146 {

    /* renamed from: а  reason: contains not printable characters */
    private static Object f252;

    /* renamed from: б  reason: contains not printable characters */
    private static Method f253;

    /* renamed from: в  reason: contains not printable characters */
    private static Method f254;

    /* renamed from: а  reason: contains not printable characters */
    public static void m152() {
        try {
            Class<?> cls = Class.forName("com.alibaba.wireless.security.framework.SGApmMonitorManager");
            if (cls != null) {
                Method method = cls.getMethod("getInstance", new Class[0]);
                f253 = cls.getMethod("monitorStart", String.class);
                f254 = cls.getMethod("monitorEnd", String.class);
                if (method != null) {
                    f252 = method.invoke(cls, new Object[0]);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    public static void m153(String str) {
        try {
            if (f252 != null && f254 != null) {
                f254.invoke(f252, str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: в  reason: contains not printable characters */
    public static void m154(String str) {
        try {
            if (f252 != null && f253 != null) {
                f253.invoke(f252, str);
            }
        } catch (Exception unused) {
        }
    }
}
