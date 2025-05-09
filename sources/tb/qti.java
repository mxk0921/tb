package tb;

import android.content.Context;
import android.os.Process;
import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.e;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qti {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RATE_DEFAULT = 0;
    public static final int RATE_HIGH = 10102;
    public static final int RATE_MIDDLE = 20201;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f26920a = new AtomicBoolean();
    public static volatile Object b;
    public static volatile Class c;
    public static Method d;
    public static Method e;
    public static int f;

    static {
        t2o.a(349175931);
    }

    public static void a() {
        if (!f26920a.getAndSet(true)) {
            try {
                Context r = re.r();
                PathClassLoader pathClassLoader = new PathClassLoader("/system/framework/MiuiBooster.jar", ClassLoader.getSystemClassLoader());
                Class<?> loadClass = pathClassLoader.loadClass("com.miui.performance.MiuiBooster");
                b = loadClass.newInstance();
                try {
                    c = pathClassLoader.loadClass("com.miui.performance.IThermalEventCallBack");
                } catch (Throwable unused) {
                }
                Class<?> cls = Integer.TYPE;
                Boolean bool = (Boolean) loadClass.getDeclaredMethod(iu2.CALENDAR_EVENT_PERMISSION_CHECK, String.class, cls).invoke(b, r.getPackageName(), Integer.valueOf(Process.myUid()));
                boolean booleanValue = bool.booleanValue();
                s55.i("MiBridge", "init permission", "result", bool);
                if (booleanValue) {
                    e.f.b("miui-speed");
                } else {
                    e.f.a("miui-speed", null);
                }
                Class<?> loadClass2 = pathClassLoader.loadClass("com.miui.performance.DeviceLevelUtils");
                f = ((Integer) loadClass2.getDeclaredMethod(PerformanceAbility.API_GET_DEVICE_LEVEL, cls).invoke(loadClass2.getConstructor(Context.class).newInstance(r), 1)).intValue();
            } catch (Throwable th) {
                s55.h("MiBridge", "init err", th, new Object[0]);
            }
        }
    }

    public static int b(rti rtiVar) {
        boolean z;
        a();
        int i = -3;
        try {
            if (e != null || b == null || c == null) {
                z = false;
            } else {
                e = b.getClass().getDeclaredMethod("registerThermalEventCallback", Integer.TYPE, c);
                z = true;
            }
            if (e != null) {
                i = ((Integer) e.invoke(b, Integer.valueOf(Process.myUid()), rtiVar.a(c))).intValue();
                if (z) {
                    if (i == 0) {
                        e.f.b("miui-registerThermalEventCallback");
                    } else {
                        e.f.a("miui-registerThermalEventCallback", null);
                    }
                }
            }
        } catch (Throwable th) {
            s55.h("MiBridge", "registerThermalEventCallback err", th, new Object[0]);
        }
        s55.i("MiBridge", "registerThermalEventCallback", rb.RESULT_KEY, Integer.valueOf(i), "method", e);
        return i;
    }

    public static int c(int i) {
        boolean z;
        a();
        int i2 = f;
        int i3 = -3;
        if (i2 == 2 || i2 == 3) {
            try {
                if (d != null || b == null) {
                    z = false;
                } else {
                    Class<?> cls = b.getClass();
                    Class<?> cls2 = Integer.TYPE;
                    d = cls.getDeclaredMethod("setDynamicRefreshRateScene", cls2, String.class, cls2);
                    z = true;
                }
                Method method = d;
                if (method != null) {
                    i3 = ((Integer) method.invoke(b, Integer.valueOf(Process.myUid()), re.r().getPackageName(), Integer.valueOf(i))).intValue();
                    if (z) {
                        if (i3 == 0) {
                            e.f.b("miui-setScene");
                        } else {
                            e.f.a("miui-setScene", null);
                        }
                    }
                }
            } catch (Throwable th) {
                s55.h("MiBridge", "setFrameRate err", th, new Object[0]);
            }
            s55.i("MiBridge", ExtTransportOffice.METHOD_SETSCENE, rb.RESULT_KEY, Integer.valueOf(i3), "rate", Integer.valueOf(i), "method", d);
            return i3;
        }
        s55.i("MiBridge", "setScene return", m09.TASK_TYPE_LEVEL, Integer.valueOf(i2));
        return -3;
    }
}
