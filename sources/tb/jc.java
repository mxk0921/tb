package tb;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.data.battery.SensorManager;
import com.taobao.monitor.impl.data.savemode.SaveModeMonitor;
import com.taobao.monitor.impl.data.thread.LooperObserver;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.MemoryDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.e;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.g;
import com.taobao.monitor.impl.trace.h;
import com.taobao.monitor.impl.trace.i;
import com.taobao.monitor.impl.trace.j;
import com.taobao.monitor.impl.trace.l;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21909a;
    public static boolean b;
    public static final List<Observer> c = new ArrayList();
    public static final x51 d = new x51();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            if (nca.f == 0) {
                jhg.W = "WARM";
                jc.a().e("WARM");
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MessageQueue.IdleHandler f21910a;

        public b(MessageQueue.IdleHandler idleHandler) {
            this.f21910a = idleHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Looper.myQueue().addIdleHandler(this.f21910a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f21911a;

        public c(List list) {
            this.f21911a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sb0.a(this.f21911a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            jc.b();
            jc.c();
            jc.d();
            jc.e();
        }
    }

    public static /* synthetic */ x51 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x51) ipChange.ipc$dispatch("35b0303f", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            h();
        }
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            n();
        }
    }

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            q();
        }
    }

    public static /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906ef47b", new Object[0]);
        } else {
            p();
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816e5fc2", new Object[0]);
        } else {
            w9a.g().f().post(new d());
        }
    }

    public static void g(Application application, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47f095d", new Object[]{application, map});
        } else if (!f21909a) {
            f21909a = true;
            o(application, map);
            k();
            i();
            f();
            l(application);
            j(c);
            a21.a();
            m();
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1237c418", new Object[0]);
            return;
        }
        yq7.a(ic.CLOCKED_MEMORY_DISPATCHER, new MemoryDispatcher());
        new SaveModeMonitor();
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe08de", new Object[0]);
            return;
        }
        yq7.a(ic.APPLICATION_LOW_MEMORY_DISPATCHER, new com.taobao.monitor.impl.trace.b());
        ApplicationBackgroundChangedDispatcher applicationBackgroundChangedDispatcher = new ApplicationBackgroundChangedDispatcher();
        yq7.a(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER, applicationBackgroundChangedDispatcher);
        yq7.a(ic.PAGE_FIRST_FRAME_DISPATCHER, new e());
        yq7.a(ic.ACTIVITY_FPS_DISPATCHER, new cw8());
        yq7.a(ic.WINDOW_EVENT_DISPATCHER, new l());
        yq7.a(ic.PAGE_RENDER_DISPATCHER, new j());
        yq7.a(ic.PAGE_LEAVE_DISPATCHER, new PageLeaveDispatcher());
        lb0 lb0Var = new lb0();
        lb0Var.addListener(new ghg());
        yq7.a(ic.ACTIVITY_LIFECYCLE_DISPATCHER, lb0Var);
        yq7.a(ic.FRAGMENT_LIFECYCLE_DISPATCHER, new f());
        com.taobao.monitor.impl.trace.d dVar = new com.taobao.monitor.impl.trace.d();
        dVar.addListener(new enl());
        dVar.addListener(new ejw());
        yq7.a(ic.CUSTOM_PAGE_LIFECYCLE_DISPATCHER, dVar);
        yq7.a(ic.IMAGE_STAGE_DISPATCHER, new g());
        l1m.b().a(new k1m());
        yq7.a(ic.NETWORK_STAGE_DISPATCHER, new i());
        qtj.b().d(new ptj());
        j5j.a().c(new ptj());
        yq7.a(ic.LOOPER_HEAVY_MSG_DISPATCHER, new h());
        com.taobao.monitor.impl.trace.c cVar = new com.taobao.monitor.impl.trace.c();
        yq7.a(ic.BATTERY_DISPATCHER, cVar);
        SensorManager.setBatteryDispatcher(cVar);
        dca dcaVar = new dca();
        applicationBackgroundChangedDispatcher.addListener(dcaVar);
        dVar.addListener(dcaVar);
        cVar.addListener(dcaVar);
    }

    public static void j(List<Observer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1e6c3", new Object[]{list});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i <= 28 || (!"212200".equals(w9a.g().e()) && i <= 30)) {
            s(new c(list));
        }
    }

    public static void k() {
        MessageQueue queue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b220c4", new Object[0]);
        } else if (!b) {
            b = true;
            a aVar = new a();
            Looper mainLooper = Looper.getMainLooper();
            if (Build.VERSION.SDK_INT >= 23) {
                queue = mainLooper.getQueue();
                queue.addIdleHandler(aVar);
                return;
            }
            new Handler(mainLooper).post(new b(aVar));
        }
    }

    public static void l(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b3763e", new Object[]{application});
            return;
        }
        mb0 mb0Var = new mb0(application);
        application.registerActivityLifecycleCallbacks(mb0Var);
        ((ArrayList) c).add(mb0Var);
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ac967e", new Object[0]);
        } else if (Build.VERSION.SDK_INT >= 29 && o48.p) {
            LooperObserver.init();
        }
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e42c6d", new Object[0]);
        } else {
            nca.n = System.getProperty("oppoCPUResource", "false");
        }
    }

    public static void p() {
        long startUptimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138dfe57", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            startUptimeMillis = Process.getStartUptimeMillis();
            nca.i = startUptimeMillis;
            d.i(System.currentTimeMillis() - (SystemClock.uptimeMillis() - nca.i));
        } else {
            long a2 = xym.a();
            d.i(a2);
            if (a2 != -1) {
                nca.i = out.a() - (System.currentTimeMillis() - a2);
            } else {
                nca.i = out.a() - Process.getElapsedCpuTime();
            }
        }
        d.h(nca.i);
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a8f538", new Object[0]);
        } else if (o48.e) {
            gc.b().c(new u3x());
        }
    }

    public static String r(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("219c7c2a", new Object[]{map});
        }
        if (map != null) {
            nca.h = rrl.a(map.get("appVersion"), "unknown");
            Object obj = map.get("deviceId");
            if (obj instanceof String) {
                String str = (String) obj;
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                } catch (Exception unused) {
                }
                return "ALI_APM/" + str + "/monitor/procedure";
            }
        }
        return "ALI_APM/device-id/monitor/procedure";
    }

    public static void s(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d874b96e", new Object[]{runnable});
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            w9a.g().i().postAtFrontOfQueue(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(android.app.Application r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.jc.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "362f8203"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r11
            r4[r0] = r12
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            long r2 = tb.out.a()
            tb.nca.l = r2
            tb.x51 r2 = tb.jc.d
            java.lang.String r3 = "COLD"
            r2.e(r3)
            long r3 = android.os.SystemClock.uptimeMillis()
            r2.f(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.g(r3)
            java.lang.String r3 = "launchStartTime"
            java.lang.Object r3 = r12.get(r3)
            r4 = -1
            long r6 = tb.rrl.f(r3, r4)
            long r6 = tb.out.b(r6)
            tb.nca.j = r6
            tb.rrt r3 = tb.rrt.a()
            tb.w9a r6 = tb.w9a.g()
            android.os.Handler r6 = r6.f()
            android.os.Looper r6 = r6.getLooper()
            r3.f(r6)
            java.lang.String r12 = r(r12)
            tb.w9a r3 = tb.w9a.g()
            r3.l(r12)
            tb.emv r3 = tb.emv.a()
            r3.d(r12)
            tb.w9a r12 = tb.w9a.g()
            android.content.SharedPreferences r12 = r12.k()
            java.lang.String r3 = "appVersion"
            java.lang.String r6 = ""
            java.lang.String r7 = r12.getString(r3, r6)
            java.lang.String r8 = "lastAppVersion"
            java.lang.String r6 = r12.getString(r8, r6)
            android.content.SharedPreferences$Editor r9 = r12.edit()
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 == 0) goto L_0x0097
            tb.nca.b = r0
            tb.nca.d = r0
            java.lang.String r0 = "NEW"
            tb.nca.g = r0
            java.lang.String r0 = tb.nca.h
            r9.putString(r3, r0)
            goto L_0x00b1
        L_0x0097:
            java.lang.String r10 = tb.nca.h
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L_0x00b5
            tb.nca.b = r1
            tb.nca.d = r0
            java.lang.String r0 = "UPDATE"
            tb.nca.g = r0
            java.lang.String r0 = tb.nca.h
            r9.putString(r3, r0)
            r9.putString(r8, r7)
            tb.nca.e = r7
        L_0x00b1:
            r9.apply()
            goto L_0x00bf
        L_0x00b5:
            tb.nca.b = r1
            tb.nca.d = r1
            java.lang.String r0 = "NONE"
            tb.nca.g = r0
            tb.nca.e = r6
        L_0x00bf:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00cc
            tb.e81 r0 = tb.e81.b()
            r0.g(r8, r6)
        L_0x00cc:
            java.lang.String r0 = "lastStartProcessTime"
            long r0 = r12.getLong(r0, r4)
            tb.nca.m = r0
            boolean r12 = tb.nca.d
            r2.a(r12)
            boolean r12 = tb.nca.b
            r2.b(r12)
            long r0 = tb.nca.m
            r2.d(r0)
            tb.e81 r12 = tb.e81.b()
            java.lang.String r0 = "mobileModel"
            java.lang.String r1 = android.os.Build.MODEL
            r12.g(r0, r1)
            tb.uml r12 = tb.uml.c()
            tb.sml r0 = new tb.sml
            r0.<init>()
            r12.d(r0)
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r12 = "android"
            java.lang.String r0 = "content"
            java.lang.String r1 = "id"
            int r11 = r11.getIdentifier(r0, r1, r12)
            tb.nca.t = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jc.o(android.app.Application, java.util.Map):void");
    }
}
