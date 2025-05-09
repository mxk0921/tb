package com.alipay.mobile.common.monitor.api.reflect;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceInfoReflector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f4008a;
    public static Method b;
    public static Method c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;

    public static String getmDid(Context context) {
        Class<?> cls;
        Class<?> cls2;
        String str = null;
        if (context == null) {
            return null;
        }
        long uptimeMillis = h ? 0L : SystemClock.uptimeMillis();
        if (f4008a == null) {
            try {
                f4008a = DeviceInfoReflector.class.getClassLoader().loadClass("com.alipay.mobile.common.info.DeviceInfo");
            } catch (Throwable th) {
                if (!d) {
                    d = true;
                    LoggerFactory.getTraceLogger().error("DeviceInfoReflector", "init", th);
                }
            }
        }
        if (b == null && (cls2 = f4008a) != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod("createInstance", Context.class);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable th2) {
                if (!e) {
                    e = true;
                    LoggerFactory.getTraceLogger().error("DeviceInfoReflector", "init", th2);
                }
            }
        }
        if (c == null && (cls = f4008a) != null) {
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("getmDid", new Class[0]);
                c = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (Throwable th3) {
                if (!f) {
                    f = true;
                    LoggerFactory.getTraceLogger().error("DeviceInfoReflector", "init", th3);
                }
            }
        }
        Method method = b;
        if (!(method == null || c == null)) {
            try {
                Object invoke = c.invoke(method.invoke(null, context), new Object[0]);
                if (invoke != null) {
                    str = (String) invoke;
                }
            } catch (Throwable th4) {
                if (!g) {
                    g = true;
                    LoggerFactory.getTraceLogger().error("DeviceInfoReflector", "getmDid", th4);
                }
            }
        }
        if (!h) {
            h = true;
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info("DeviceInfoReflector", processAlias + ", getmDid, spend: " + uptimeMillis2);
        }
        return str;
    }
}
