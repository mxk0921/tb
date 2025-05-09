package com.uploader.export;

import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ConcurrentHashMap;
import tb.w6e;
import tb.xg8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UploaderGlobal {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_INSTANCE_TYPE = 0;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Context f14543a;
    public static final ConcurrentHashMap<Integer, xg8> b;
    public static final ConcurrentHashMap<Integer, xg8> c;
    public static final ConcurrentHashMap<Integer, xg8> d;
    public static final ConcurrentHashMap<Integer, w6e> e = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface Definition {
    }

    static {
        ConcurrentHashMap<Integer, xg8> concurrentHashMap = new ConcurrentHashMap<>();
        b = concurrentHashMap;
        ConcurrentHashMap<Integer, xg8> concurrentHashMap2 = new ConcurrentHashMap<>();
        c = concurrentHashMap2;
        ConcurrentHashMap<Integer, xg8> concurrentHashMap3 = new ConcurrentHashMap<>();
        d = concurrentHashMap3;
        concurrentHashMap.put(0, new xg8(0, "21646297", "arup.m.taobao.com", "59.82.31.182"));
        concurrentHashMap2.put(0, new xg8(1, "21646297", "pre-arup.m.taobao.com", "59.82.17.132"));
        concurrentHashMap3.put(0, new xg8(2, "4272", "daily.arup.m.alibaba.net", "100.69.167.214"));
    }

    public static w6e a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w6e) ipChange.ipc$dispatch("e4bb2c46", new Object[]{num});
        }
        return e.get(num);
    }

    public static xg8 b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xg8) ipChange.ipc$dispatch("9794b0e7", new Object[]{new Integer(i), new Integer(i2)});
        }
        if (i == 1) {
            return c.get(Integer.valueOf(i2));
        }
        if (i != 2) {
            return b.get(Integer.valueOf(i2));
        }
        return d.get(Integer.valueOf(i2));
    }

    public static w6e c(w6e w6eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w6e) ipChange.ipc$dispatch("a53f91d", new Object[]{w6eVar});
        }
        return e.put(Integer.valueOf(w6eVar.getEnvironment().getInstanceType()), w6eVar);
    }

    public static xg8 d(int i, int i2, String str) {
        ConcurrentHashMap<Integer, xg8> concurrentHashMap;
        xg8 put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xg8) ipChange.ipc$dispatch("5c7e6e16", new Object[]{new Integer(i), new Integer(i2), str});
        }
        if (i == 1) {
            concurrentHashMap = c;
        } else if (i != 2) {
            concurrentHashMap = b;
        } else {
            concurrentHashMap = d;
        }
        synchronized (concurrentHashMap) {
            xg8 xg8Var = concurrentHashMap.get(Integer.valueOf(i2));
            put = concurrentHashMap.put(Integer.valueOf(i2), new xg8(i, str, xg8Var.c, xg8Var.d, xg8Var.e));
        }
        return put;
    }

    public static xg8 e(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xg8) ipChange.ipc$dispatch("5ec07a3b", new Object[]{new Integer(i), str});
        }
        return d(i, 0, str);
    }

    public static Context f() {
        if (f14543a != null) {
            return f14543a;
        }
        synchronized (UploaderGlobal.class) {
            if (f14543a != null) {
                return f14543a;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                f14543a = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return f14543a;
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else if (context != null) {
            f14543a = context.getApplicationContext();
        }
    }
}
