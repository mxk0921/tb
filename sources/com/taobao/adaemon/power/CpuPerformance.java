package com.taobao.adaemon.power;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import anet.channel.entity.EventType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.e;
import com.taobao.adaemon.g;
import com.taobao.atools.StaticHook;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.f;
import tb.hkq;
import tb.oxn;
import tb.s55;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CpuPerformance {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Object g;
    public static Method h;
    public static long i;

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f6162a = {1077936128, 1};
    public static final int[] b = {1086324736, 1, 1077936128, 1, 1082146816, EventType.ALL, 1082147072, EventType.ALL, 1082130432, EventType.ALL, 1082130688, EventType.ALL, 1082130944, EventType.ALL, 1082147328, EventType.ALL};
    public static final int[] c = {21037056, 1, 4194304, 3000000, 4194560, 3000000, 4194816, 3000000};
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final AtomicBoolean e = new AtomicBoolean();
    public static final AtomicBoolean f = new AtomicBoolean();
    public static final LinkedHashMap<Long, Object> j = new LinkedHashMap<Long, Object>() { // from class: com.taobao.adaemon.power.CpuPerformance.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/CpuPerformance$1");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Long, Object> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() > oxn.s().g()) {
                return true;
            }
            return false;
        }
    };

    static {
        t2o.a(349175917);
    }

    public static int c(int i2, int[] iArr) throws Throwable {
        int i3;
        if (f.get()) {
            i3 = ((Integer) h.invoke(g, 0, Integer.valueOf(i2), iArr)).intValue();
        } else {
            i3 = ((Integer) h.invoke(g, Integer.valueOf(i2), iArr)).intValue();
        }
        s55.i("CpuPerformance", "perfLockAcquire ret = " + i3, new Object[0]);
        return i3;
    }

    public static void a(int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e43fb77", new Object[]{new Integer(i2)});
        } else if (oxn.s().D() && f.i()) {
            b(g.l());
            int i3 = -1;
            if (e.get()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < i) {
                    s55.i("CpuPerformance", "boostCpu ing", new Object[0]);
                    return;
                }
                int g2 = oxn.s().g();
                LinkedHashMap<Long, Object> linkedHashMap = j;
                if (linkedHashMap.size() >= g2) {
                    long longValue = elapsedRealtime - linkedHashMap.keySet().iterator().next().longValue();
                    if (longValue < 60000) {
                        s55.i("CpuPerformance", "boostCpu", "limit", Integer.valueOf(g2), "time diff", Long.valueOf(longValue));
                        return;
                    }
                }
                linkedHashMap.put(Long.valueOf(elapsedRealtime), null);
                int max = Math.max(0, Math.min(3000, i2));
                i = elapsedRealtime + max;
                s55.i("CpuPerformance", "boostCpu start", "duration", Integer.valueOf(max));
                try {
                    if (f.get()) {
                        i3 = c(max, c);
                    } else {
                        int c2 = c(max, f6162a);
                        c(max, b);
                        i3 = c2;
                    }
                } catch (Throwable th) {
                    s55.h("CpuPerformance", "boostCpu err: ", th, new Object[0]);
                }
            } else {
                s55.i("CpuPerformance", "boostCpu not support", new Object[0]);
            }
            String str2 = e.f;
            if (i3 > 0) {
                str = "success";
            } else {
                str = "failure";
            }
            hkq.b(e.MODULE_NAME, str2, str, vu3.b.GEO_NOT_SUPPORT);
        }
    }

    public static void b(Context context) {
        Class<?> cls;
        AtomicBoolean atomicBoolean = f;
        if (context != null && Build.VERSION.SDK_INT >= 28 && oxn.s().D() && !d.getAndSet(true)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = Build.BRAND;
            try {
                if ("vivo".equals(str)) {
                    cls = Class.forName("com.vivo.framework.vperf.VivoPerfManager");
                } else if ("OPPO".equals(str)) {
                    cls = Class.forName("com.qualcomm.qti.Performance");
                } else {
                    cls = Class.forName("android.util.BoostFramework");
                }
            } catch (Throwable unused) {
                cls = null;
            }
            if (cls == null) {
                s55.i("CpuPerformance", "init, boostCls==null", new Object[0]);
                return;
            }
            s55.i("CpuPerformance", "init, boostCls = ".concat(cls.getName()), new Object[0]);
            try {
                if (atomicBoolean.get()) {
                    Class cls2 = Integer.TYPE;
                    h = StaticHook.g(cls, "perfLockAcquire", cls2, cls2, int[].class);
                } else {
                    h = StaticHook.g(cls, "perfLockAcquire", Integer.TYPE, int[].class);
                }
                if (h == null) {
                    s55.i("CpuPerformance", "init failure, acquireMtd is NULL", new Object[0]);
                    return;
                }
                if (atomicBoolean.get()) {
                    g = StaticHook.g(cls, "getInstance", new Class[0]).invoke(null, new Object[0]);
                } else {
                    Constructor d2 = StaticHook.d(cls, Context.class);
                    if (d2 != null) {
                        g = d2.newInstance(context);
                    } else {
                        g = StaticHook.d(cls, new Class[0]).newInstance(new Object[0]);
                    }
                }
                if ("OPPO".equals(str) && !atomicBoolean.get()) {
                    Method g2 = StaticHook.g(cls, "connectPerfServiceLocked", new Class[0]);
                    if (g2 != null) {
                        g2.setAccessible(true);
                        g2.invoke(g, new Object[0]);
                    }
                    Field m = StaticHook.m(g.getClass(), "sIsUntrustedDomain");
                    if (m != null) {
                        m.setAccessible(true);
                        m.set(null, Boolean.TRUE);
                    }
                    Field m2 = StaticHook.m(g.getClass(), "RestrictUnTrustedAppAccess");
                    if (m2 != null) {
                        m2.setAccessible(true);
                        m2.set(null, Boolean.FALSE);
                    }
                    Field i2 = StaticHook.i(g.getClass(), "mForWeixinTabOnly");
                    if (i2 != null) {
                        i2.setAccessible(true);
                        i2.set(g, Boolean.TRUE);
                    }
                }
                e.set(true);
                s55.i("CpuPerformance", "initSuccess", "spent", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (Throwable th) {
                s55.h("CpuPerformance", "init err: ", th, new Object[0]);
            }
        }
    }
}
