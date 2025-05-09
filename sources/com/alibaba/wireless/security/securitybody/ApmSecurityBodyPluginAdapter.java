package com.alibaba.wireless.security.securitybody;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ApmSecurityBodyPluginAdapter {

    /* renamed from: а  reason: contains not printable characters */
    private static Object f368;

    /* renamed from: б  reason: contains not printable characters */
    private static Method f369;

    /* renamed from: в  reason: contains not printable characters */
    private static Method f370;

    public static void init() {
        try {
            Class<?> cls = Class.forName("com.alibaba.wireless.security.framework.SGApmMonitorManager");
            if (cls != null) {
                Method method = cls.getMethod("getInstance", new Class[0]);
                f369 = cls.getMethod("monitorStart", String.class);
                f370 = cls.getMethod("monitorEnd", String.class);
                if (method != null) {
                    f368 = method.invoke(cls, new Object[0]);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void monitorEnd(String str) {
        try {
            if (f368 != null && f370 != null) {
                f370.invoke(f368, str);
            }
        } catch (Exception unused) {
        }
    }

    public static void monitorStart(String str) {
        try {
            if (f368 != null && f369 != null) {
                f369.invoke(f368, str);
            }
        } catch (Exception unused) {
        }
    }
}
