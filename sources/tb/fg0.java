package tb;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.perf.MnnOnceDetectRecord;
import com.etao.feimagesearch.mnn.AdvanceAutoDetectObjectUnit;
import com.etao.feimagesearch.mnn.AutoDetectExtraInfoCache;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.nn.MNNManager;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fg0 extends py1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c Companion = new c(null);
    public boolean C;
    public final g G;
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
    public final v69 x;
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
    public final Handler H = new f(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements yuc<q7l, r7l> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yuc
        public xuc<q7l, r7l> a(NetConfig netConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xuc) ipChange.ipc$dispatch("42424eec", new Object[]{this, netConfig});
            }
            ckf.g(netConfig, "netConfig");
            return AdvanceAutoDetectObjectUnit.Companion.a();
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
                fg0.this.h(view.getWidth(), view.getHeight());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c {
        static {
            t2o.a(730857619);
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class d implements sio<q7l, r7l> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f19262a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;
        public final AtomicBoolean f = new AtomicBoolean(false);
        public final /* synthetic */ fg0 g;

        static {
            t2o.a(730857620);
            t2o.a(481297309);
        }

        public d(fg0 fg0Var, byte[] bArr, int i, int i2, boolean z, int i3) {
            ckf.g(fg0Var, "this$0");
            ckf.g(bArr, "yuvData");
            this.g = fg0Var;
            this.f19262a = bArr;
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
                agh.c("AdvanceObjectDetector", "onErrorMain");
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
        public void d(r7l r7lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("735d5420", new Object[]{this, r7lVar});
            }
        }

        /* renamed from: h */
        public r7l a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r7l) ipChange.ipc$dispatch("aee24bf0", new Object[]{this});
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
            agh.c("AdvanceObjectDetector", "onError");
            fg0.y(this.g, false);
        }

        /* renamed from: i */
        public q7l b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q7l) ipChange.ipc$dispatch("e47eea1b", new Object[]{this});
            }
            q7l q7lVar = new q7l();
            byte[] bArr = this.f19262a;
            byte[] bArr2 = new byte[bArr.length];
            q7lVar.f26562a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            q7lVar.c = this.b;
            q7lVar.d = this.c;
            q7lVar.e = fg0.t(this.g);
            q7lVar.f = fg0.s(this.g);
            fg0.q(this.g);
            fg0.p(this.g);
            q7lVar.b = this.d;
            q7lVar.g = this.e;
            fzb l = fg0.l(this.g);
            q7lVar.h = l == null || l.b();
            if (fg0.o(this.g).getAndSet(false)) {
                agh.h("AdvanceObjectDetector", "reset algorithm");
                q7lVar.i = true;
            }
            return q7lVar;
        }

        /* renamed from: f */
        public void onFinish(r7l r7lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebae7498", new Object[]{this, r7lVar});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            fg0 fg0Var = this.g;
            if (!fg0Var.c) {
                fg0Var.c = true;
                mzu.n(p73.f25916a, "pltFirstObjectDetect", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
                agh.r("AutoDetect", "pltFirstObjectDetect", "taskName: plt_autodetect");
            }
            if (!this.f.get()) {
                ol1 ol1Var = ol1.INSTANCE;
                long g = elapsedRealtime - ol1Var.g();
                fzb l = fg0.l(this.g);
                if (r7lVar == null || l == null) {
                    ol1Var.a(MnnOnceDetectRecord.Companion.a(g, null, false));
                    fg0.y(this.g, false);
                    return;
                }
                slb q = this.g.C().q();
                if (q != null) {
                    q.b("plt_autodetect", false);
                }
                fg0.r(this.g).d(r7lVar.c);
                String str = r7lVar.f;
                if (str == null) {
                    str = "";
                }
                List<RectF> list = r7lVar.d;
                if (list == null || list.isEmpty()) {
                    ol1Var.a(MnnOnceDetectRecord.Companion.a(g, r7lVar.i, false));
                    fg0.y(this.g, false);
                    return;
                }
                fg0.o(this.g).set(true);
                mzu.n(p73.f25916a, "Advance_Object_Mnn", 19999, BaseMnnRunUnit.KEY_TASK_NAME, r7lVar.g, BaseMnnRunUnit.KEY_TASK_CID, r7lVar.h);
                HashMap<String, String> hashMap = new HashMap<>(10);
                hashMap.put(qu3.KEY, fg0.k(this.g).a());
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(AutoDetectExtraInfoCache.EXTRA_INFO_KEY, str);
                }
                String M3 = lg4.M3();
                ckf.f(M3, "getTrustTerminalAlgoConfig()");
                l.g(PhotoFrom.Values.AUTO_DETECT, new jl0("plt_autodetect", M3), r7lVar.b, r7lVar.d, hashMap);
                ol1Var.a(MnnOnceDetectRecord.Companion.a(g, r7lVar.i, true));
                ol1.r(fg0.v(this.g), fg0.u(this.g), false, SystemClock.elapsedRealtime());
                fg0.w(this.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/AdvanceObjectDetector$handler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            agh.h("AdvanceObjectDetector", ckf.p("received message ", Integer.valueOf(message.what)));
            if (message.what == 6) {
                agh.r("AutoDetect", "AdvanceObjectDetector", "change SilenceStatus false");
                fg0.z(fg0.this, false);
                fzb l = fg0.l(fg0.this);
                if (l != null) {
                    l.f();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements MNNManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.etao.feimagesearch.nn.MNNManager.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be56d7bc", new Object[]{this});
            } else {
                fg0.i(fg0.this);
            }
        }
    }

    static {
        t2o.a(730857616);
    }

    public fg0(Context context, CaptureManager captureManager) {
        ckf.g(context, "context");
        ckf.g(captureManager, "captureManager");
        this.e = context;
        this.f = captureManager;
        v69 v69Var = new v69();
        this.x = v69Var;
        g gVar = new g();
        this.G = gVar;
        v69Var.name = "plt_autodetect";
        v69Var.type = "plt_autodetect";
        twi.b("plt_autodetect", new a());
        mzu.n(p73.f25916a, "needCallPrepare", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
        agh.r("AutoDetect", "needCallPrepare", "taskName:plt_autodetect");
        this.g = new gph(v69Var.name, String.valueOf(context.hashCode()));
        MNNManager.Companion.a().j("plt_autodetect", gVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addOnLayoutChangeListener(new b());
        this.w = new sq0(context, captureManager);
    }

    public static final /* synthetic */ void i(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f923929", new Object[]{fg0Var});
        } else {
            fg0Var.B();
        }
    }

    public static /* synthetic */ Object ipc$super(fg0 fg0Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -558272972) {
            super.resume();
            return null;
        } else if (hashCode == 1713617801) {
            super.stop();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/intelli/AdvanceObjectDetector");
        }
    }

    public static final /* synthetic */ ss3 j(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ss3) ipChange.ipc$dispatch("a3212095", new Object[]{fg0Var});
        }
        return fg0Var.w;
    }

    public static final /* synthetic */ qu3 k(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qu3) ipChange.ipc$dispatch("1743a69e", new Object[]{fg0Var});
        }
        return fg0Var.F;
    }

    public static final /* synthetic */ fzb l(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzb) ipChange.ipc$dispatch("f9dd6272", new Object[]{fg0Var});
        }
        return fg0Var.q;
    }

    public static final /* synthetic */ AtomicBoolean m(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("adf42c58", new Object[]{fg0Var});
        }
        return fg0Var.v;
    }

    public static final /* synthetic */ AtomicBoolean n(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("88aafe72", new Object[]{fg0Var});
        }
        return fg0Var.p;
    }

    public static final /* synthetic */ AtomicBoolean o(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("676ca5c9", new Object[]{fg0Var});
        }
        return fg0Var.s;
    }

    public static final /* synthetic */ int p(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e70f317", new Object[]{fg0Var})).intValue();
        }
        return fg0Var.l;
    }

    public static final /* synthetic */ int q(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c21c228", new Object[]{fg0Var})).intValue();
        }
        return fg0Var.k;
    }

    public static final /* synthetic */ g73 r(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g73) ipChange.ipc$dispatch("52a95de", new Object[]{fg0Var});
        }
        return fg0Var.A;
    }

    public static final /* synthetic */ int s(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fd8313b", new Object[]{fg0Var})).intValue();
        }
        return fg0Var.j;
    }

    public static final /* synthetic */ int t(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87882f84", new Object[]{fg0Var})).intValue();
        }
        return fg0Var.i;
    }

    public static final /* synthetic */ boolean u(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fbfea72", new Object[]{fg0Var})).booleanValue();
        }
        return fg0Var.D;
    }

    public static final /* synthetic */ boolean v(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56cd48b1", new Object[]{fg0Var})).booleanValue();
        }
        return fg0Var.E;
    }

    public static final /* synthetic */ void w(fg0 fg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99692c60", new Object[]{fg0Var});
        } else {
            fg0Var.F();
        }
    }

    public static final /* synthetic */ void x(fg0 fg0Var, ss3 ss3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af33813", new Object[]{fg0Var, ss3Var});
        } else {
            fg0Var.w = ss3Var;
        }
    }

    public static final /* synthetic */ void y(fg0 fg0Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942372fd", new Object[]{fg0Var, new Boolean(z)});
        } else {
            fg0Var.H(z);
        }
    }

    public static final /* synthetic */ void z(fg0 fg0Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc40e662", new Object[]{fg0Var, new Boolean(z)});
        } else {
            fg0Var.u = z;
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d42c96", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.y;
        mzu.n(p73.f25916a, "callPrepare", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect", HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(currentTimeMillis));
        agh.r("AutoDetect", "callPrepare", "mnnStatus:taskName:plt_autodetect,waitTime:" + currentTimeMillis);
        this.g.g(this.x, new e(System.currentTimeMillis()));
    }

    public final CaptureManager C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("479518ba", new Object[]{this});
        }
        return this.f;
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a825e60", new Object[]{this})).booleanValue();
        }
        return this.o.get();
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dafcf0d", new Object[]{this});
        } else if (this.B) {
            v63.a(this.A.b(), this.A.a());
            this.A.c();
        }
    }

    public final void H(boolean z) {
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
        G();
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements an2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;

        public e(long j) {
            this.b = j;
        }

        @Override // tb.an2
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c5256d3", new Object[]{this});
            } else {
                agh.h("AdvanceObjectDetector", "mnnNetWorker onMainBuildSucceed");
            }
        }

        @Override // tb.an2
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("911f63fa", new Object[]{this});
            } else {
                agh.c("AdvanceObjectDetector", "mnnNetWorker onMainBuildFailed");
            }
        }

        @Override // tb.an2
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fb7f373", new Object[]{this});
                return;
            }
            agh.r("AutoDetect", "AdvanceObjectDetector", "mnnNetWorker onBuildFailed");
            mzu.n(p73.f25916a, "prepareFailed_plt_autodetect", 19999, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(System.currentTimeMillis() - this.b));
            fg0.m(fg0.this).set(true);
            fg0.y(fg0.this, false);
        }

        @Override // tb.an2
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60cbb67a", new Object[]{this});
                return;
            }
            agh.r("AutoDetect", "AdvanceObjectDetector", "mnnNetWorker onBuildSucceed");
            if (!caa.q() || !lg4.I0()) {
                fg0.n(fg0.this).set(true);
                mzu.n(p73.f25916a, "prepareSuccess_plt_autodetect", 19999, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(System.currentTimeMillis() - this.b));
                fg0.m(fg0.this).set(false);
                fg0.y(fg0.this, false);
                ss3 j = fg0.j(fg0.this);
                if (j != null) {
                    j.destroy();
                }
                fg0.x(fg0.this, null);
                return;
            }
            agh.c("AdvanceObjectDetector", "Mock MNN build failed");
            a();
        }
    }

    public final void A(byte[] bArr, int i, int i2, boolean z, int i3, fzb fzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cd5203", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), fzbVar});
        } else if (this.p.get()) {
            SystemClock.elapsedRealtime();
            fzbVar.d();
            H(true);
            d dVar = new d(this, bArr, i, i2, z, i3);
            this.g.j("plt_autodetect", "detectFrame", null, dVar);
            this.m = dVar;
            fzbVar.e();
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1aebc8", new Object[]{this});
            return;
        }
        long a2 = uk1.a(this.e);
        this.t = a2;
        agh.h("AdvanceObjectDetector", ckf.p("onReceiveFirstFrame-----silenceTime = ", Long.valueOf(a2)));
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
        mzu.n(p73.f25916a, "pltFirstCameraFrameIn", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
        agh.r("AutoDetect", "pltFirstCameraFrameIn", "taskName: plt_autodetect");
    }

    public final void G() {
        fzb fzbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8908459", new Object[]{this});
            return;
        }
        agh.h("AdvanceObjectDetector", "resetDetect");
        d dVar = this.m;
        if (dVar != null) {
            dVar.e();
        }
        H(false);
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
        agh.r("AutoDetect", "AdvanceObjectDetector", "resetAlgorithm");
        this.s.set(true);
    }

    @Override // tb.py1, tb.m2d
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        agh.h("AdvanceObjectDetector", "stop");
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
            E();
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
            c4p.C("AdvanceObjectDetector", ckf.p("flow is null ", Boolean.valueOf(z3)), new Object[0]);
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
        if (z2) {
            ol1.q(1);
        }
        if (this.u) {
            slb q = this.f.q();
            if (q != null) {
                q.b("plt_autodetect", true);
            }
        } else if (this.p.get() && !this.d && !D()) {
            if (ipe.c(bArr, i, i2, this.f.u()) == 1) {
                fzbVar.i();
            } else {
                fzbVar.c();
            }
            if (this.i == 0 || this.j == 0) {
                c4p.C("AdvanceObjectDetector", "长宽未初始化", new Object[0]);
            } else if (this.h) {
                ol1.l(this.I, true, elapsedRealtime);
                this.I = false;
                A(bArr, i, i2, z, i3, fzbVar);
            }
        }
    }
}
