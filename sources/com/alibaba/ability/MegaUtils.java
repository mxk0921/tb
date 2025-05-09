package com.alibaba.ability;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.a;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.eji;
import tb.njg;
import tb.pg1;
import tb.rsq;
import tb.ssq;
import tb.t2o;
import tb.tsq;
import tb.vu3;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class MegaUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f1874a;
    public static final MegaUtils INSTANCE = new MegaUtils();
    public static final njg b = a.b(MegaUtils$sMegaSchedule$2.INSTANCE);
    public static final njg c = a.b(MegaUtils$sAbilitySchedule$2.INSTANCE);
    public static final njg d = a.b(MegaUtils$sHandler$2.INSTANCE);

    static {
        t2o.a(144703499);
    }

    public static /* synthetic */ void A(Runnable runnable, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf96920", new Object[]{runnable, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        z(runnable, j);
    }

    @JvmStatic
    public static final void B(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67c667b", new Object[]{runnable});
            return;
        }
        ckf.g(runnable, "r");
        eji.j(INSTANCE.t(), runnable, 0L, null, 6, null);
    }

    @JvmStatic
    public static final void C(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7009ba81", new Object[]{runnable});
            return;
        }
        ckf.g(runnable, "r");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        ckf.f(mainLooper, "Looper.getMainLooper()");
        if (currentThread != mainLooper.getThread()) {
            runnable.run();
        } else {
            eji.j(INSTANCE.v(), runnable, 0L, null, 6, null);
        }
    }

    @JvmStatic
    public static final void D(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ef8e1b", new Object[]{runnable});
            return;
        }
        ckf.g(runnable, "r");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        ckf.f(mainLooper, "Looper.getMainLooper()");
        if (currentThread != mainLooper.getThread()) {
            runnable.run();
        } else {
            B(runnable);
        }
    }

    @JvmStatic
    public static final void E(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0c5cd1", new Object[]{context});
            return;
        }
        ckf.g(context, "context");
        f1874a = context;
    }

    @JvmStatic
    public static final Double F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("eac8c0d3", new Object[]{str});
        }
        String E = tsq.E(str, ",", "", false, 4, null);
        if (!tsq.I(E, "0x", false, 2, null) && !tsq.I(E, "-0x", false, 2, null)) {
            return rsq.k(E);
        }
        Integer n = ssq.n(tsq.G(E, "0x", "", false, 4, null), 16);
        if (n != null) {
            return Double.valueOf(n.intValue());
        }
        return null;
    }

    @JvmStatic
    public static final Double b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("fdda1399", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : vu3.b.GEO_NOT_SUPPORT);
        } else if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        } else {
            if (obj instanceof String) {
                Double F = F((String) obj);
                if (F != null) {
                    return F;
                }
                throw new RuntimeException("parse double fail, data = [" + obj + ']');
            }
            throw new RuntimeException("parse double fail, data = [" + obj + ']');
        }
    }

    @JvmStatic
    public static final Float c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("6744a175", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return Float.valueOf(((Boolean) obj).booleanValue() ? 1.0f : 0.0f);
        } else if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        } else {
            if (obj instanceof String) {
                Double F = F((String) obj);
                if (F != null) {
                    return Float.valueOf((float) F.doubleValue());
                }
                throw new RuntimeException("parse int fail, data = [" + obj + ']');
            }
            throw new RuntimeException("parse float fail, data = [" + obj + ']');
        }
    }

    @JvmStatic
    public static final Integer d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("c56f2f26", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            Double F = F((String) obj);
            if (F != null) {
                return Integer.valueOf((int) F.doubleValue());
            }
            throw new RuntimeException("parse int fail, data = [" + obj + ']');
        }
        throw new RuntimeException("parse int fail, data = [" + obj + ']');
    }

    @JvmStatic
    public static final Long e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("deff1183", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return 0L;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return Long.valueOf(Long.parseLong((String) obj));
        }
        throw new RuntimeException("parse long fail, data = [" + obj + ']');
    }

    @JvmStatic
    public static final Context f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[0]);
        }
        Context context = f1874a;
        if (context != null) {
            return context;
        }
        Application y = INSTANCE.y();
        if (y == null) {
            return null;
        }
        f1874a = y;
        return y;
    }

    @JvmStatic
    public static final Boolean g(Map<String, ? extends Object> map, String str, Boolean bool) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e82001", new Object[]{map, str, bool});
        }
        ckf.g(str, "key");
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        Boolean a2 = a(obj);
        if (a2 != null) {
            return a2;
        }
        return bool;
    }

    @JvmStatic
    public static final Boolean h(Map<String, ? extends Object> map, String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("70d6d461", new Object[]{map, str, bool});
        }
        ckf.g(str, "key");
        try {
            return g(map, str, bool);
        } catch (Throwable unused) {
            return bool;
        }
    }

    @JvmStatic
    public static final Double i(Map<String, ? extends Object> map, String str, Double d2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("dda6d98", new Object[]{map, str, d2});
        }
        ckf.g(str, "key");
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        Double b2 = b(obj);
        if (b2 != null) {
            return b2;
        }
        return d2;
    }

    @JvmStatic
    public static final Double j(Map<String, ? extends Object> map, String str, Double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("6202d7c2", new Object[]{map, str, d2});
        }
        ckf.g(str, "key");
        try {
            return i(map, str, d2);
        } catch (Throwable unused) {
            return d2;
        }
    }

    @JvmStatic
    public static final Float k(Map<String, ? extends Object> map, String str, Float f) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("8f3e18e5", new Object[]{map, str, f});
        }
        ckf.g(str, "key");
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        Float c2 = c(obj);
        if (c2 != null) {
            return c2;
        }
        return f;
    }

    @JvmStatic
    public static final Integer l(Map<String, ? extends Object> map, String str, Integer num) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("40a452ae", new Object[]{map, str, num});
        }
        ckf.g(str, "key");
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        Integer d2 = d(obj);
        if (d2 != null) {
            return d2;
        }
        return num;
    }

    @JvmStatic
    public static final Integer m(Map<String, ? extends Object> map, String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2d7c3a7c", new Object[]{map, str, num});
        }
        ckf.g(str, "key");
        try {
            return l(map, str, num);
        } catch (Throwable unused) {
            return num;
        }
    }

    @JvmStatic
    public static final List<Object> n(Map<String, ? extends Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2809df1c", new Object[]{map, str});
        }
        ckf.g(str, "key");
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return (List) obj;
    }

    @JvmStatic
    public static final List<Object> o(Map<String, ? extends Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a8e6fb00", new Object[]{map, str});
        }
        ckf.g(str, "key");
        try {
            return n(map, str);
        } catch (Throwable unused) {
            return yz3.i();
        }
    }

    @JvmStatic
    public static final Long p(Map<String, ? extends Object> map, String str, Long l) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("9e1db1ad", new Object[]{map, str, l});
        }
        ckf.g(str, "key");
        if (map != null) {
            obj = map.get(str);
        } else {
            obj = null;
        }
        Long e = e(obj);
        if (e != null) {
            return e;
        }
        return l;
    }

    @JvmStatic
    public static final Long q(Map<String, ? extends Object> map, String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("ba8a9c0d", new Object[]{map, str, l});
        }
        ckf.g(str, "key");
        try {
            return p(map, str, l);
        } catch (Throwable unused) {
            return l;
        }
    }

    @JvmStatic
    public static final Map<String, Object> r(Map<String, ? extends Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aa5275d2", new Object[]{map, str});
        }
        ckf.g(str, "key");
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return (Map) obj;
    }

    @JvmStatic
    public static final Map<String, Object> s(Map<String, ? extends Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2c1d638a", new Object[]{map, str});
        }
        ckf.g(str, "key");
        try {
            return r(map, str);
        } catch (Throwable unused) {
            return kotlin.collections.a.h();
        }
    }

    @JvmStatic
    public static final String w(Map<String, ? extends Object> map, String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84435958", new Object[]{map, str, str2});
        }
        ckf.g(str, "key");
        if (map == null || (obj = map.get(str)) == null) {
            return str2;
        }
        return obj.toString();
    }

    @JvmStatic
    public static final String x(Map<String, ? extends Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9961f402", new Object[]{map, str, str2});
        }
        ckf.g(str, "key");
        return w(map, str, str2);
    }

    @JvmStatic
    public static final void z(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3979c9c", new Object[]{runnable, new Long(j)});
            return;
        }
        ckf.g(runnable, "run");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        ckf.f(mainLooper, "Looper.getMainLooper()");
        if (currentThread == mainLooper.getThread() && j == 0) {
            runnable.run();
        } else {
            INSTANCE.u().postDelayed(runnable, j);
        }
    }

    public final eji t() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("c342bd28", new Object[]{this});
        } else {
            value = c.getValue();
        }
        return (eji) value;
    }

    public final Handler u() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("cb7b4b72", new Object[]{this});
        } else {
            value = d.getValue();
        }
        return (Handler) value;
    }

    public final eji v() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("523e53c6", new Object[]{this});
        } else {
            value = b.getValue();
        }
        return (eji) value;
    }

    public final Application y() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            ckf.f(declaredMethod, "activityThread.getDeclar…(\"currentActivityThread\")");
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            ckf.f(declaredField, "activityThread.getDeclar…ld(\"mInitialApplication\")");
            declaredField.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            ckf.f(invoke, "currentActivityThread.invoke(null)");
            Object obj = declaredField.get(invoke);
            ckf.f(obj, "mInitialApplication.get(current)");
            return (Application) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @JvmStatic
    public static final Boolean a(Object obj) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("234daa35", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (obj instanceof String) {
            if (!ckf.b("False", obj) && !ckf.b("false", obj) && !ckf.b("0", obj) && !ckf.b("null", obj) && !ckf.b(pg1.ATOM_EXT_Null, obj) && !ckf.b("nil", obj)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else {
            throw new RuntimeException("parse boolean fail, data = [" + obj + ']');
        }
    }
}
