package com.taobao.mrt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.mrt.service.LogService;
import java.io.File;
import java.util.Map;
import tb.bzn;
import tb.cqh;
import tb.eqh;
import tb.kgh;
import tb.mqh;
import tb.mwv;
import tb.t2o;
import tb.tq0;
import tb.u8o;
import tb.xdh;
import tb.xqh;
import tb.zqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MRT {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_MRT_STATE = "com.taobao.mrt.mrtstate";

    /* renamed from: a  reason: collision with root package name */
    public static String f11137a;
    public static Context b = null;
    public static boolean c = false;
    public static boolean d = false;
    public static volatile boolean e = false;
    public static boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements tq0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f11138a;

        public a(Context context) {
            this.f11138a = context;
        }

        @Override // tb.tq0
        public void onFailed(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1866fce3", new Object[]{this, exc});
                return;
            }
            kgh.c("MRT", "AliNNPython init failed");
            MRT.b(false);
        }

        @Override // tb.tq0
        public void onSuccess(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (!MRT.a()) {
                mqh.n();
                MRT.c();
                MRT.d();
                MRT.b(bzn.d().c("mrt").i());
                kgh.j("MRT", "Load Lib With RemoteSo -" + MRT.a());
                if (mwv.c(this.f11138a)) {
                    AliNNPython.nativeRedirectStdioToLogCat();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cqh.c();
            }
        }
    }

    static {
        t2o.a(577765378);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return c;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            n();
        }
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            k();
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a00afb3", new Object[]{str});
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            kgh.a("MRT", "add python path:" + str);
            AliNNPython.addPythonPath(str);
        } catch (Exception e2) {
            kgh.d("MRT", "addPythonPath", e2);
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8686261a", new Object[0])).booleanValue();
        }
        if (zqh.d().b() == null) {
            return false;
        }
        return true;
    }

    public static Context g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return b;
    }

    public static synchronized boolean h(Context context) {
        synchronized (MRT.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("609fd215", new Object[]{context})).booleanValue();
            } else if (e) {
                return true;
            } else {
                if (context == null) {
                    return false;
                }
                if (!f()) {
                    kgh.s("MRT", "MRT.init() need some necessary configuration");
                    return false;
                }
                e = true;
                j();
                xqh.f();
                b = context.getApplicationContext();
                boolean c2 = mwv.c(context);
                d = c2;
                if (c2) {
                    kgh.q(LogService.LogReceiver.Console);
                } else {
                    kgh.q(LogService.LogReceiver.None);
                }
                l(context);
                AliNNPython.registerPythonInitCallback(new a(context));
                AliNNPython.initialize(context);
                cqh.e();
                eqh.b().a(new b(), 1000);
                m();
                if (!AliNNPython.nativeAvailable()) {
                    return false;
                }
                return true;
            }
        }
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[0])).booleanValue();
        }
        return c;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1018317", new Object[0])).booleanValue();
        }
        return d;
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d625a72", new Object[0]);
            return;
        }
        zqh.d().f("Log", new xdh());
        zqh.d().f("Resource", new u8o());
    }

    public static void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c68e97", new Object[]{context});
        } else if (context != null) {
            try {
                LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.mrt.MRT.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/MRT$3");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                            return;
                        }
                        MRT.f = true;
                        kgh.a("MRT", "config arrived");
                    }
                }, new IntentFilter("com.taobao.mrt.cv_task_ready"));
            } catch (Throwable th) {
                kgh.t("MRT", "", th);
            }
        }
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b5e1e1", new Object[0]);
            return;
        }
        kgh.a("MRT", "sendMRTInitState!!! + " + c);
        Intent intent = new Intent(ACTION_MRT_STATE);
        intent.putExtra("result", c);
        LocalBroadcastManager.getInstance(b).sendBroadcast(intent);
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84692772", new Object[0]);
            return;
        }
        e(mqh.f);
        e(mqh.e);
        e(mqh.b);
    }
}
