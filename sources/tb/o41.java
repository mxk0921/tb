package tb;

import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.atools.Constants;
import com.taobao.atools.StaticHook;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o41 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f25132a = new AtomicBoolean();
    public static volatile Context b;

    static {
        t2o.a(398458885);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!f25132a.getAndSet(true)) {
            c0.h(a());
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1871d3ff", new Object[]{context});
        } else if (context != null && b == null) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            if (context != null && b == null) {
                b = context;
            }
            b();
        }
    }

    public static Context a() {
        if (b != null) {
            return b;
        }
        synchronized (o41.class) {
            try {
                b = ActivityThread.currentApplication();
                if (b == null) {
                    try {
                        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
                        if (currentActivityThread != null) {
                            b = currentActivityThread.getApplication();
                        }
                    } catch (Exception e) {
                        l2u.instance.d("AppContext", "currentActivityThread err", e, new Object[0]);
                    }
                }
                if (b == null) {
                    try {
                        b = (Application) StaticHook.g(ActivityThread.class, "getApplication", new Class[0]).invoke(StaticHook.g(ActivityThread.class, ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(ActivityThread.class, new Object[0]), new Object[0]);
                    } catch (Exception e2) {
                        l2u.instance.d("AppContext", "reflect err", e2, new Object[0]);
                    }
                }
                if (b == null && LauncherRuntime.g != null) {
                    l2u.instance.e("AppContext", "LauncherRuntime.sContext is not null", pg1.ATOM_stack, cp.c(Thread.currentThread().getStackTrace()));
                    hkq.b(Constants.MODULE, Constants.POINT_FULL_VERIFY, "context-launch", vu3.b.GEO_NOT_SUPPORT);
                    c(LauncherRuntime.g);
                }
            }
        }
        if (b == null) {
            l2u.instance.e("AppContext", "mContext is null", pg1.ATOM_stack, cp.c(Thread.currentThread().getStackTrace()));
            hkq.b(Constants.MODULE, Constants.POINT_FULL_VERIFY, "context", vu3.b.GEO_NOT_SUPPORT);
        }
        return b;
    }
}
