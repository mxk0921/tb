package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.perf.MnnOnceDetectRecord;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.mnn.autodetect.SmartAutoDetectObjectUnit;
import com.etao.feimagesearch.nn.MNNManager;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class z4q extends py1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c Companion = new c(null);
    public boolean C;
    public final f G;
    public boolean I;
    public final Context e;
    public final CaptureManager f;
    public final gph g;
    public volatile int i;
    public volatile int j;
    public volatile int k;
    public volatile int l;
    public d m;
    public final FrameLayout n;
    public volatile fzb q;
    public boolean u;
    public ss3 w;
    public final NetConfig x;
    public volatile boolean h = true;
    public final AtomicBoolean o = new AtomicBoolean(true);
    public final AtomicBoolean p = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean s = new AtomicBoolean(false);
    public long t = lg4.B1();
    public final AtomicBoolean v = new AtomicBoolean(true);
    public final long y = System.currentTimeMillis();
    public long z = System.currentTimeMillis();
    public final g73 A = new g73();
    public final boolean B = lg4.T();
    public boolean D = true;
    public boolean E = true;
    public final qu3 F = new qu3(qu3.MNN);
    public final Handler H = new e(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements yuc<pk1, rk1> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yuc
        public xuc<pk1, rk1> a(NetConfig netConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xuc) ipChange.ipc$dispatch("42424eec", new Object[]{this, netConfig});
            }
            ckf.g(netConfig, "netConfig");
            return SmartAutoDetectObjectUnit.Companion.a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else {
                z4q.this.h(view.getWidth(), view.getHeight());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c {
        static {
            t2o.a(730857642);
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class d implements sio<pk1, rk1> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f32537a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;
        public final AtomicBoolean f = new AtomicBoolean(false);
        public final /* synthetic */ z4q g;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements g1a<Boolean, xhv> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ rk1 f32538a;
            public final /* synthetic */ long b;
            public final /* synthetic */ z4q c;

            public a(rk1 rk1Var, long j, z4q z4qVar) {
                this.f32538a = rk1Var;
                this.b = j;
                this.c = z4qVar;
            }

            public void a(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
                } else if (this.f32538a.t()) {
                    ol1.INSTANCE.a(MnnOnceDetectRecord.Companion.a(this.b, this.f32538a.i(), true));
                    ol1.r(z4q.u(this.c), z4q.t(this.c), true, SystemClock.elapsedRealtime());
                    z4q.v(this.c);
                    if (lg4.H4()) {
                        z4q.x(this.c, false);
                    }
                } else {
                    ol1.INSTANCE.a(MnnOnceDetectRecord.Companion.a(this.b, this.f32538a.i(), false));
                    z4q.x(this.c, false);
                }
            }

            @Override // tb.g1a
            public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
                a(bool.booleanValue());
                return xhv.INSTANCE;
            }
        }

        static {
            t2o.a(730857643);
            t2o.a(481297309);
        }

        public d(z4q z4qVar, byte[] bArr, int i, int i2, boolean z, int i3) {
            ckf.g(z4qVar, "this$0");
            ckf.g(bArr, "yuvData");
            this.g = z4qVar;
            this.f32537a = bArr;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        @Override // tb.sio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd4c9849", new Object[]{this});
            } else {
                agh.c("SmartAutoDetector", "onErrorMain");
            }
        }

        public final void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
            } else {
                this.f.set(true);
            }
        }

        /* renamed from: g */
        public void d(rk1 rk1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6e3da01", new Object[]{this, rk1Var});
            }
        }

        /* renamed from: h */
        public rk1 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rk1) ipChange.ipc$dispatch("bb813f77", new Object[]{this});
            }
            return null;
        }

        @Override // tb.sio
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            agh.c("SmartAutoDetector", "onError");
            z4q.x(this.g, false);
        }

        /* renamed from: f */
        public void onFinish(rk1 rk1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("710c4489", new Object[]{this, rk1Var});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            z4q z4qVar = this.g;
            if (!z4qVar.c) {
                z4qVar.c = true;
                mzu.n(p73.f25916a, "pltFirstObjectDetect", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera");
                agh.r("AutoDetect", "pltFirstObjectDetect", "taskName: plt_smart_camera");
            }
            if (!this.f.get()) {
                fzb k = z4q.k(this.g);
                if (rk1Var == null || k == null) {
                    z4q.x(this.g, false);
                    return;
                }
                slb q = this.g.B().q();
                if (q != null) {
                    q.s(rk1Var);
                }
                ol1 ol1Var = ol1.INSTANCE;
                long g = elapsedRealtime - ol1Var.g();
                g73 q2 = z4q.q(this.g);
                Long c = rk1Var.c();
                q2.d(c == null ? 0L : c.longValue());
                rk1Var.x(Long.valueOf(g));
                TLogTracker.f("SmartLens", "DetectEnd", rk1Var.toString());
                if (!rk1Var.u()) {
                    ol1Var.a(MnnOnceDetectRecord.Companion.a(g, rk1Var.i(), false));
                    z4q.x(this.g, false);
                    return;
                }
                z4q z4qVar2 = this.g;
                k.j(rk1Var, new a(rk1Var, g, z4qVar2), z4qVar2.g());
            }
        }

        /* renamed from: i */
        public pk1 b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pk1) ipChange.ipc$dispatch("e229d234", new Object[]{this});
            }
            pk1 pk1Var = new pk1();
            pk1Var.u(new byte[this.f32537a.length]);
            System.arraycopy(this.f32537a, 0, pk1Var.i(), 0, this.f32537a.length);
            pk1Var.t(this.b);
            pk1Var.m(this.c);
            pk1Var.s(z4q.s(this.g));
            pk1Var.r(z4q.r(this.g));
            pk1Var.q(z4q.p(this.g));
            pk1Var.p(z4q.o(this.g));
            pk1Var.k(this.d);
            pk1Var.j(this.e);
            pk1Var.l(this.g.B().C());
            fzb k = z4q.k(this.g);
            pk1Var.n(k == null || k.b());
            if (z4q.n(this.g).getAndSet(false)) {
                agh.h("SmartAutoDetector", "reset algorithm");
                pk1Var.o(true);
            }
            return pk1Var;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/SmartAutoDetector$handler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            agh.h("SmartAutoDetector", ckf.p("received message ", Integer.valueOf(message.what)));
            if (message.what == 6) {
                agh.r("AutoDetect", "SmartAutoDetector", "change SilenceStatus false");
                z4q.y(z4q.this, false);
                fzb k = z4q.k(z4q.this);
                if (k != null) {
                    k.f();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements MNNManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.etao.feimagesearch.nn.MNNManager.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be56d7bc", new Object[]{this});
            } else {
                z4q.i(z4q.this);
            }
        }
    }

    static {
        t2o.a(730857639);
    }

    public z4q(Context context, CaptureManager captureManager) {
        ckf.g(context, "context");
        ckf.g(captureManager, "captureManager");
        this.e = context;
        this.f = captureManager;
        NetConfig netConfig = new NetConfig();
        this.x = netConfig;
        f fVar = new f();
        this.G = fVar;
        netConfig.name = "plt_smart_camera";
        netConfig.type = "plt_smart_camera";
        twi.b("plt_smart_camera", new a());
        mzu.n(p73.f25916a, "needCallPrepare", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera");
        agh.r("AutoDetect", "needCallPrepare", "taskName:plt_smart_camera");
        this.g = new gph("plt_smart_camera", String.valueOf(context.hashCode()));
        MNNManager.Companion.a().j("plt_smart_camera", fVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addOnLayoutChangeListener(new b());
        this.w = new sq0(context, captureManager);
    }

    public static final /* synthetic */ void i(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b782812", new Object[]{z4qVar});
        } else {
            z4qVar.A();
        }
    }

    public static /* synthetic */ Object ipc$super(z4q z4qVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -558272972) {
            super.resume();
            return null;
        } else if (hashCode == 1713617801) {
            super.stop();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/intelli/SmartAutoDetector");
        }
    }

    public static final /* synthetic */ ss3 j(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ss3) ipChange.ipc$dispatch("85f31bcc", new Object[]{z4qVar});
        }
        return z4qVar.w;
    }

    public static final /* synthetic */ fzb k(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzb) ipChange.ipc$dispatch("4a5fa129", new Object[]{z4qVar});
        }
        return z4qVar.q;
    }

    public static final /* synthetic */ AtomicBoolean l(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("77745781", new Object[]{z4qVar});
        }
        return z4qVar.v;
    }

    public static final /* synthetic */ AtomicBoolean m(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("6c4c469b", new Object[]{z4qVar});
        }
        return z4qVar.p;
    }

    public static final /* synthetic */ AtomicBoolean n(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("95bd3172", new Object[]{z4qVar});
        }
        return z4qVar.s;
    }

    public static final /* synthetic */ int o(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fa11780", new Object[]{z4qVar})).intValue();
        }
        return z4qVar.l;
    }

    public static final /* synthetic */ int p(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11ee1711", new Object[]{z4qVar})).intValue();
        }
        return z4qVar.k;
    }

    public static final /* synthetic */ g73 q(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g73) ipChange.ipc$dispatch("e78d5955", new Object[]{z4qVar});
        }
        return z4qVar.A;
    }

    public static final /* synthetic */ int r(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("328507a4", new Object[]{z4qVar})).intValue();
        }
        return z4qVar.j;
    }

    public static final /* synthetic */ int s(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79926d", new Object[]{z4qVar})).intValue();
        }
        return z4qVar.i;
    }

    public static final /* synthetic */ boolean t(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49d343db", new Object[]{z4qVar})).booleanValue();
        }
        return z4qVar.D;
    }

    public static final /* synthetic */ boolean u(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("668f999a", new Object[]{z4qVar})).booleanValue();
        }
        return z4qVar.E;
    }

    public static final /* synthetic */ void v(z4q z4qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f3f4ec9", new Object[]{z4qVar});
        } else {
            z4qVar.E();
        }
    }

    public static final /* synthetic */ void w(z4q z4qVar, ss3 ss3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d909bc", new Object[]{z4qVar, ss3Var});
        } else {
            z4qVar.w = ss3Var;
        }
    }

    public static final /* synthetic */ void x(z4q z4qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c614a34", new Object[]{z4qVar, new Boolean(z)});
        } else {
            z4qVar.G(z);
        }
    }

    public static final /* synthetic */ void y(z4q z4qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c223819", new Object[]{z4qVar, new Boolean(z)});
        } else {
            z4qVar.u = z;
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d42c96", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.y;
        mzu.n(p73.f25916a, "callPrepare", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera", HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(currentTimeMillis));
        agh.r("AutoDetect", "callPrepare", "mnnStatus:taskName:plt_smart_camera,waitTime:" + currentTimeMillis);
        this.g.g(this.x, new a5q(this, System.currentTimeMillis()));
    }

    public final CaptureManager B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("479518ba", new Object[]{this});
        }
        return this.f;
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a825e60", new Object[]{this})).booleanValue();
        }
        return this.o.get();
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dafcf0d", new Object[]{this});
        } else if (this.B) {
            v63.a(this.A.b(), this.A.a());
            this.A.c();
        }
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5accd30", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o.set(z);
        if (!z) {
            this.g.a();
        }
    }

    @Override // tb.py1, tb.m2d
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dda5ecb", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.k = i;
        this.l = i2;
        ss3 ss3Var = this.w;
        if (ss3Var != null) {
            ss3Var.a(i, i2);
        }
    }

    @Override // tb.py1, tb.m2d
    public void c(fzb fzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62b543", new Object[]{this, fzbVar});
            return;
        }
        ckf.g(fzbVar, "flow");
        this.r.set(true);
        this.q = fzbVar;
        ss3 ss3Var = this.w;
        if (ss3Var != null) {
            ss3Var.c(fzbVar);
        }
        F();
        this.r.set(false);
    }

    @Override // tb.py1, tb.m2d
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9175398", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        ss3 ss3Var = this.w;
        if (ss3Var != null) {
            ss3Var.d(z);
        }
    }

    @Override // tb.py1, tb.m2d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.s.set(false);
        this.g.h();
        ss3 ss3Var = this.w;
        if (ss3Var != null) {
            ss3Var.destroy();
        }
        this.w = null;
        MNNManager.Companion.a().l(this.G);
        this.H.removeMessages(6);
        this.u = false;
        this.f26395a = false;
    }

    @Override // tb.py1, tb.m2d
    public qu3 g() {
        qu3 qu3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qu3) ipChange.ipc$dispatch("3941f463", new Object[]{this});
        }
        if (!this.v.get()) {
            return this.F.b(this.f.R(), this.u);
        }
        ss3 ss3Var = this.w;
        if (ss3Var == null) {
            qu3Var = null;
        } else {
            qu3Var = ss3Var.g();
        }
        if (qu3Var == null) {
            return new qu3(null, 1, null).b(this.f.R(), this.u);
        }
        return qu3Var;
    }

    @Override // tb.py1, tb.m2d
    public FrameLayout getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.py1
    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b50c471", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.i = i;
        this.j = i2;
        ss3 ss3Var = this.w;
        if (ss3Var != null) {
            ss3Var.h(i, i2);
        }
    }

    @Override // tb.py1, tb.m2d
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        super.resume();
        ss3 ss3Var = this.w;
        if (ss3Var != null) {
            ss3Var.resume();
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1aebc8", new Object[]{this});
            return;
        }
        long a2 = uk1.a(this.e);
        this.t = a2;
        agh.h("SmartAutoDetector", ckf.p("onReceiveFirstFrame-----silenceTime = ", Long.valueOf(a2)));
        if (this.t > 0) {
            this.u = true;
            this.H.removeMessages(6);
            this.H.sendEmptyMessageDelayed(6, this.t);
        } else {
            this.H.removeMessages(6);
            this.H.sendEmptyMessage(6);
        }
        ss3 ss3Var = this.w;
        if (ss3Var != null) {
            ss3Var.z();
        }
        mzu.n(p73.f25916a, "pltFirstCameraFrameIn", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera");
        agh.r("AutoDetect", "pltFirstCameraFrameIn", "taskName: plt_smart_camera");
    }

    public final void F() {
        fzb fzbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8908459", new Object[]{this});
            return;
        }
        agh.h("SmartAutoDetector", "resetDetect");
        d dVar = this.m;
        if (dVar != null) {
            dVar.e();
        }
        G(false);
        if (!this.u && (fzbVar = this.q) != null) {
            fzbVar.f();
        }
    }

    @Override // tb.py1, tb.m2d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7059d467", new Object[]{this});
            return;
        }
        agh.r("AutoDetect", "SmartAutoDetector", "resetAlgorithm");
        this.s.set(true);
    }

    public final void z(byte[] bArr, int i, int i2, boolean z, int i3, fzb fzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cd5203", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), fzbVar});
        } else if (this.p.get()) {
            SystemClock.elapsedRealtime();
            fzbVar.d();
            G(true);
            d dVar = new d(this, bArr, i, i2, z, i3);
            this.g.j("plt_smart_camera", "detectFrame", null, dVar);
            this.m = dVar;
            fzbVar.e();
        }
    }

    @Override // tb.py1, tb.m2d
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        agh.h("SmartAutoDetector", "stop");
        super.stop();
        ss3 ss3Var = this.w;
        if (ss3Var != null) {
            ss3Var.stop();
        }
        this.H.removeMessages(6);
        if (this.t > 0) {
            this.u = true;
        }
        this.f26395a = false;
    }

    @Override // tb.py1, tb.m2d
    public void b(byte[] bArr, boolean z, int i, int i2, int i3) {
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0130b9", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ckf.g(bArr, "yuvData");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.f26395a) {
            ol1.p(Long.valueOf(elapsedRealtime));
            this.f26395a = true;
            this.I = true;
            D();
            if (this.C) {
                this.D = false;
                this.E = false;
            } else {
                this.C = true;
                l53.d dVar = l53.Companion;
                if (!dVar.f()) {
                    this.E = true;
                    dVar.h(true);
                } else {
                    this.E = false;
                }
                if (dVar.e()) {
                    this.D = true;
                    dVar.g(false);
                } else {
                    this.D = false;
                }
            }
            z2 = true;
        } else {
            this.A.e(System.currentTimeMillis() - this.z);
            z2 = false;
        }
        this.z = System.currentTimeMillis();
        fzb fzbVar = this.q;
        if (fzbVar == null || this.r.get()) {
            if (fzbVar != null) {
                z3 = false;
            }
            c4p.C("SmartAutoDetector", ckf.p("flow is null ", Boolean.valueOf(z3)), new Object[0]);
            return;
        }
        if (this.v.get()) {
            if (z2) {
                ol1.q(0);
            }
            ol1.l(this.I, false, elapsedRealtime);
            this.I = false;
            ss3 ss3Var = this.w;
            if (ss3Var != null) {
                ss3Var.b(bArr, z, i, i2, i3);
                return;
            }
        }
        if (!this.u && this.p.get() && !this.d && !C()) {
            if (ipe.d(bArr, i, i2, 40) == 1) {
                fzbVar.i();
            } else {
                fzbVar.c();
            }
            if (this.i == 0 || this.j == 0) {
                c4p.C("SmartAutoDetector", "长宽未初始化", new Object[0]);
            } else if (this.h) {
                if (z2) {
                    ol1.q(1);
                }
                ol1.l(this.I, true, elapsedRealtime);
                this.I = false;
                z(bArr, i, i2, z, i3, fzbVar);
            }
        }
    }
}
