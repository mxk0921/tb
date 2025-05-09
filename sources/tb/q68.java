package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.event.EventType;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import java.io.File;
import java.lang.reflect.Method;
import mtopsdk.mtop.stat.MtopMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q68 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26539a = false;
    public volatile boolean b = false;
    public volatile boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(961544244);
        }

        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (n.j().q()) {
                ogh.q(n.j().q());
            }
            n.j().d();
            ku0.p();
            ku0.q();
            ku0.o();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.alibaba.ut.abtest.a f26540a;
        private final boolean b;

        static {
            t2o.a(961544245);
        }

        public c(com.alibaba.ut.abtest.a aVar, boolean z) {
            this.f26540a = aVar;
            this.b = z;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8296f99", new Object[]{this});
                return;
            }
            try {
                LocalBroadcastManager.getInstance(n.j().b()).sendBroadcast(new Intent(EVO.ACTION_INITIALIZE_COMPLETE));
            } catch (Throwable th) {
                ku0.j("EVO.BackgroundInit.notifyInitializeComplete", th);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #3 {all -> 0x0036, blocks: (B:7:0x0027, B:9:0x002b, B:14:0x0039, B:15:0x0044, B:17:0x0052, B:19:0x00a7, B:21:0x00b8, B:23:0x00c2, B:24:0x00cf, B:26:0x00e3, B:28:0x00ed, B:29:0x00f1, B:18:0x005b), top: B:38:0x0027 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.q68.c.run():void");
        }
    }

    static {
        t2o.a(961544242);
    }

    public static /* synthetic */ void a(q68 q68Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61e2d16", new Object[]{q68Var});
        } else {
            q68Var.j();
        }
    }

    public static /* synthetic */ boolean b(q68 q68Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eed40f1f", new Object[]{q68Var, new Boolean(z)})).booleanValue();
        }
        q68Var.c = z;
        return z;
    }

    public final void c(com.alibaba.ut.abtest.a aVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b355ae", new Object[]{this, aVar, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            new c(aVar, z2).run();
        } else {
            ydt.b(new c(aVar, z2));
        }
    }

    public final void f(Context context) {
        if (new File("/data/local/tmp/.yixiu_test_sdk_open").exists()) {
            try {
                if (context instanceof Application) {
                    Method declaredMethod = Class.forName("com.alibaba.abtest_android_test.TestUTABTest").getDeclaredMethod("init", Application.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(null, (Application) context);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40980980", new Object[]{this})).booleanValue();
        }
        return this.f26539a;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
        }
        if (!i() || !this.c) {
            return false;
        }
        return true;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b513f06", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ad7e80", new Object[]{this});
            return;
        }
        try {
            ogh.g("EVOInitiator", "accs: registerDataListener");
            GlobalClientInfo.getInstance(n.j().b()).registerService(EvoAccsService.SERVICE_ID, EvoAccsService.class.getName());
        } catch (Exception e) {
            ku0.j("EVO.listenAccs", e);
        }
    }

    public void d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109ddfc4", new Object[]{this, context, new Boolean(z)});
        } else if (!this.f26539a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ogh.g("EVOInitiator", "SDK第一阶段初始化开始。");
            n j = n.j();
            j.t(context);
            j.A();
            f(context);
            j.a().v(context);
            boolean c2 = uym.c(context);
            j.x(z);
            j.k().l(c2);
            qo8.s().v();
            this.f26539a = true;
            ogh.g("EVOInitiator", "一休启动第一阶段耗时（所有实验之前的初始化）: " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms，是否是主进程：" + c2);
        }
    }

    public void e(Context context, com.alibaba.ut.abtest.a aVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("699823ca", new Object[]{this, context, aVar, new Boolean(z)});
        } else if (this.b) {
            ogh.l("EVOInitiator", "SDK已初始化或正在进行中。");
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (z) {
                str = "是";
            } else {
                str = "否";
            }
            ogh.g("EVOInitiator", "SDK第二阶段初始化开始。是否同步初始化：".concat(str));
            bpm.e(context, "context is null");
            bpm.e(aVar, "configuration is null");
            boolean c2 = uym.c(context);
            if (n.j().s() || c2) {
                n.j().w(aVar.e());
                n.j().v(aVar.g());
                n.j().a().f(context);
                if (c2 || !n.j().s()) {
                    n.j().g().b(EventType.ExperimentV5Data, new ko8());
                    n.j().g().b(EventType.BetaExperimentV5Data, new eo8());
                    n.j().g().b(EventType.User, new hrv());
                }
                ogh.e("EVOInitiator", "当前环境：" + n.j().f());
                try {
                    o.L();
                    if (aVar.f() != null) {
                        n.j().a().L(aVar.f());
                    }
                    n.j().k().l(c2);
                    if (c2 || !n.j().s()) {
                        n.j().u(n.j().a().getMethod());
                        if (!sau.b()) {
                            rau.b();
                        }
                        try {
                            p3v.getInstance().registerListener(new buv());
                        } catch (Throwable th) {
                            ogh.h("EVOInitiator", "UT页面生命周期监听注册失败，请升级ut-analytics>=6.5.8.26。", th);
                            ku0.j("EVO.UTTrackerListenerRegister", th);
                        }
                        tt6.a();
                        n.j().h();
                    }
                    try {
                        MtopMonitor.addHeaderMonitor(new gau());
                    } catch (Throwable th2) {
                        if (c2) {
                            ogh.i("EVOInitiator", "初始化MTOP监听失败，不依赖无痕埋点功能请忽略。" + th2.getMessage());
                        } else {
                            ogh.g("EVOInitiator", "初始化MTOP监听失败，不依赖无痕埋点功能请忽略。" + th2.getMessage());
                        }
                    }
                    this.b = true;
                    c(aVar, z, c2);
                    ogh.g("EVOInitiator", "SDK第二阶段初始化耗时：" + (SystemClock.uptimeMillis() - uptimeMillis) + "ms");
                } catch (Throwable th3) {
                    ku0.j("EVO.ABDatabaseInit", th3);
                    n.j().a().u(true);
                }
            } else {
                ogh.g("EVOInitiator", "未开启多进程支持，只允许主进程初始化SDK。主进程：否，配置开启多进程支持：否");
            }
        }
    }
}
