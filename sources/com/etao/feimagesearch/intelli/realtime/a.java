package com.etao.feimagesearch.intelli.realtime;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.realtime.DataPool;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.nn.MNNManager;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.agh;
import tb.an2;
import tb.c4p;
import tb.fzb;
import tb.gph;
import tb.ipe;
import tb.jl0;
import tb.kl0;
import tb.lg4;
import tb.py1;
import tb.sio;
import tb.sle;
import tb.t2o;
import tb.ukn;
import tb.vkn;
import tb.xkn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a extends py1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final gph f;
    public volatile int g;
    public volatile int h;
    public volatile int i;
    public volatile int j;
    public e k;
    public final FrameLayout m;
    public volatile fzb s;
    public final f u;
    public final CaptureManager w;
    public final int e = lg4.j3();
    public int l = 0;
    public final AtomicBoolean n = new AtomicBoolean(true);
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final LinkedBlockingQueue<DataPool.a> p = new LinkedBlockingQueue<>();
    public final DataPool q = DataPool.Companion.a();
    public final Handler r = new HandlerC0239a(Looper.getMainLooper());
    public final AtomicBoolean t = new AtomicBoolean(false);
    public boolean v = false;

    /* compiled from: Taobao */
    /* renamed from: com.etao.feimagesearch.intelli.realtime.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class HandlerC0239a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public HandlerC0239a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(HandlerC0239a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/realtime/RealTimeObjectDetector$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i != 5) {
                if (i == 6) {
                    Object obj = message.obj;
                    if (obj instanceof Boolean) {
                        a.p(a.this, ((Boolean) obj).booleanValue());
                    }
                }
            } else if (a.i(a.this) >= a.k(a.this)) {
                fzb o = a.o(a.this);
                if (o != null) {
                    o.a();
                }
            } else {
                a.j(a.this);
                c4p.C("realtime_RealTimeObjectDetector", "没检测到主体，开始重试", new Object[0]);
                a.p(a.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            a.r(a.this, view.getWidth());
            a.t(a.this, view.getHeight());
            agh.h("realtime_RealTimeObjectDetector", "onLayoutChange viewWidth: " + a.q(a.this) + ", viewHeight: " + a.s(a.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements an2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.an2
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fb7f373", new Object[]{this});
            } else {
                agh.c("realtime_RealTimeObjectDetector", "onBuildFailed");
            }
        }

        @Override // tb.an2
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("911f63fa", new Object[]{this});
                return;
            }
            agh.c("realtime_RealTimeObjectDetector", "onMainBuildFailed");
            a.x(a.this).a();
        }

        @Override // tb.an2
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60cbb67a", new Object[]{this});
                return;
            }
            agh.h("realtime_RealTimeObjectDetector", "onBuildSucceed");
            a.u(a.this).u(a.this);
        }

        @Override // tb.an2
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c5256d3", new Object[]{this});
                return;
            }
            a.v(a.this).set(true);
            a.w(a.this, Boolean.FALSE);
            agh.h("realtime_RealTimeObjectDetector", "post RealtimeAlgoModelReady");
            a.x(a.this).b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements MNNManager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.etao.feimagesearch.nn.MNNManager.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be56d7bc", new Object[]{this});
                return;
            }
            agh.a("realtime_RealTimeObjectDetector", "cv task ready");
            a.l(a.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements sio<ukn, xkn> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f4756a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final AtomicBoolean f;
        public final DataPool.a g;

        static {
            t2o.a(730857680);
            t2o.a(481297309);
        }

        public e(byte[] bArr, boolean z, int i, int i2, int i3) {
            this.f = new AtomicBoolean(false);
            this.f4756a = bArr;
            this.b = z;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.g = null;
        }

        public static /* synthetic */ void e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88dd398", new Object[]{eVar});
            } else {
                eVar.f();
            }
        }

        @Override // tb.sio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd4c9849", new Object[]{this});
            } else {
                agh.c("realtime_RealTimeObjectDetector", "onErrorMain");
            }
        }

        public final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
            } else {
                this.f.set(true);
            }
        }

        /* renamed from: h */
        public void d(xkn xknVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36d61b41", new Object[]{this, xknVar});
            }
        }

        /* renamed from: i */
        public xkn a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xkn) ipChange.ipc$dispatch("e9ce2a37", new Object[]{this});
            }
            return null;
        }

        /* renamed from: j */
        public ukn b() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ukn) ipChange.ipc$dispatch("326eaf74", new Object[]{this});
            }
            if (this.g != null) {
                return new ukn(null, new kl0(this.g.a()), null);
            }
            byte[] bArr = this.f4756a;
            if (bArr == null) {
                return new ukn(null, null, null);
            }
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            fzb o = a.o(a.this);
            if (o == null || o.b()) {
                z = true;
            } else {
                z = false;
            }
            return new ukn(new sle(bArr2, this.b, this.c, this.d, a.q(a.this), a.s(a.this), a.m(a.this), a.n(a.this), this.e, z), null, null);
        }

        public final void k(xkn xknVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e9893e3", new Object[]{this, xknVar});
                return;
            }
            if (xknVar == null) {
                agh.c("realtime_RealTimeObjectDetector", "optimizeOutput is null");
            } else if (xknVar.b() != null && xknVar.b().b() != null) {
                a.u(a.this).w(xknVar.b());
            } else if (this.g == null) {
                agh.a("realtime_RealTimeObjectDetector", "optimizeOutput.getObjects() is null");
            } else if (xknVar.a() != null) {
                this.g.b().a(xknVar.a());
            } else {
                this.g.b().onFailed();
            }
            a.w(a.this, Boolean.FALSE);
        }

        /* renamed from: g */
        public void onFinish(xkn xknVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8a909c9", new Object[]{this, xknVar});
            } else if (!this.f.get()) {
                agh.a("realtime_RealTimeObjectDetector", "onFinish");
                if (xknVar == null || a.o(a.this) == null) {
                    a.p(a.this, false);
                } else {
                    k(xknVar);
                }
            }
        }

        @Override // tb.sio
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            agh.c("realtime_RealTimeObjectDetector", "onError");
            a.p(a.this, false);
        }

        public e(DataPool.a aVar) {
            this.f = new AtomicBoolean(false);
            this.f4756a = null;
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.g = aVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface f {
        void a();

        void b();
    }

    static {
        t2o.a(730857675);
    }

    public a(Context context, f fVar, CaptureManager captureManager) {
        this.u = fVar;
        this.w = captureManager;
        this.f = new gph("plt_search", String.valueOf(context.hashCode()));
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addOnLayoutChangeListener(new b());
    }

    public static /* synthetic */ int i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a8acf70", new Object[]{aVar})).intValue();
        }
        return aVar.l;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -558272972) {
            super.resume();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/realtime/RealTimeObjectDetector");
    }

    public static /* synthetic */ int j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5174b78", new Object[]{aVar})).intValue();
        }
        int i = aVar.l;
        aVar.l = 1 + i;
        return i;
    }

    public static /* synthetic */ int k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1db682b1", new Object[]{aVar})).intValue();
        }
        return aVar.e;
    }

    public static /* synthetic */ void l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0a77ed", new Object[]{aVar});
        } else {
            aVar.A();
        }
    }

    public static /* synthetic */ int m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72362b21", new Object[]{aVar})).intValue();
        }
        return aVar.i;
    }

    public static /* synthetic */ int n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5561de62", new Object[]{aVar})).intValue();
        }
        return aVar.j;
    }

    public static /* synthetic */ fzb o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzb) ipChange.ipc$dispatch("afa6ddc0", new Object[]{aVar});
        }
        return aVar.s;
    }

    public static /* synthetic */ void p(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9daff194", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.H(z);
        }
    }

    public static /* synthetic */ int q(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7399c74", new Object[]{aVar})).intValue();
        }
        return aVar.g;
    }

    public static /* synthetic */ int r(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91bb27d3", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.g = i;
        return i;
    }

    public static /* synthetic */ int s(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa654fb5", new Object[]{aVar})).intValue();
        }
        return aVar.h;
    }

    public static /* synthetic */ int t(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1405dcb2", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.h = i;
        return i;
    }

    public static /* synthetic */ DataPool u(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataPool) ipChange.ipc$dispatch("61beb023", new Object[]{aVar});
        }
        return aVar.q;
    }

    public static /* synthetic */ AtomicBoolean v(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("3e121684", new Object[]{aVar});
        }
        return aVar.o;
    }

    public static /* synthetic */ void w(a aVar, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3925a8", new Object[]{aVar, bool});
        } else {
            aVar.B(bool);
        }
    }

    public static /* synthetic */ f x(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("c171f797", new Object[]{aVar});
        }
        return aVar.u;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6d4867", new Object[]{this});
            return;
        }
        NetConfig netConfig = new NetConfig();
        netConfig.name = "plt_search";
        netConfig.type = "plt_search";
        this.f.g(netConfig, new c());
    }

    public final void B(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773e8347", new Object[]{this, bool});
        } else if (Thread.currentThread().isDaemon()) {
            Message obtainMessage = this.r.obtainMessage();
            obtainMessage.what = 6;
            obtainMessage.obj = bool;
            this.r.sendMessage(obtainMessage);
        } else {
            H(bool.booleanValue());
        }
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a825e60", new Object[]{this})).booleanValue();
        }
        return this.n.get();
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848c04e0", new Object[]{this});
            return;
        }
        DataPool.a poll = this.p.poll();
        if (poll != null) {
            B(Boolean.TRUE);
            F(poll);
        }
    }

    public final void F(DataPool.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5578c508", new Object[]{this, aVar});
            return;
        }
        e eVar = new e(aVar);
        agh.h("realtime_RealTimeObjectDetector", "processAlgoMsg");
        vkn.Companion.a();
        this.f.j("plt_search", "inputAlgo", null, eVar);
        this.k = eVar;
    }

    public final void H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5accd30", new Object[]{this, new Boolean(z)});
            return;
        }
        this.n.set(z);
        if (!z) {
            this.f.a();
            E();
        }
    }

    @Override // tb.py1, tb.m2d
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dda5ecb", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.i = i;
        this.j = i2;
    }

    @Override // tb.py1, tb.m2d
    public void c(fzb fzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62b543", new Object[]{this, fzbVar});
            return;
        }
        this.t.set(true);
        this.s = fzbVar;
        G();
        this.t.set(false);
    }

    @Override // tb.py1, tb.m2d
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9175398", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.py1, tb.m2d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        agh.h("realtime_RealTimeObjectDetector", "call destroy");
        this.p.clear();
        this.q.s();
        this.f.h();
    }

    @Override // tb.py1, tb.m2d
    public FrameLayout getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        return this.m;
    }

    public void y(DataPool.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7d8102", new Object[]{this, aVar});
            return;
        }
        if (this.p.size() > 100) {
            this.p.poll();
        }
        agh.h("realtime_RealTimeObjectDetector", "addAlgoMsg ");
        this.p.add(aVar);
    }

    public void D(Bitmap bitmap, List<RectF> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e931630d", new Object[]{this, bitmap, list, str});
            return;
        }
        agh.h("realtime_RealTimeObjectDetector", "onDetectFinish");
        fzb fzbVar = this.s;
        if (fzbVar != null && !this.d) {
            fzbVar.g(PhotoFrom.Values.META_SIGHT, new jl0("plt_search", ""), bitmap, list, new HashMap<>(5));
            this.d = true;
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8908459", new Object[]{this});
            return;
        }
        agh.h("realtime_RealTimeObjectDetector", "resetDetect");
        e eVar = this.k;
        if (eVar != null) {
            e.e(eVar);
        }
        B(Boolean.FALSE);
        this.r.removeMessages(5);
        this.l = 0;
    }

    @Override // tb.py1, tb.m2d
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        super.resume();
        if (!this.v) {
            this.v = true;
            MNNManager.Companion.a().j("plt_search", new d());
        }
    }

    public final void z(byte[] bArr, boolean z, int i, int i2, int i3, boolean z2, fzb fzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca39f363", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z2), fzbVar});
        } else if (!this.o.get()) {
            agh.h("realtime_RealTimeObjectDetector", "autoDetectProcess: " + this.o.get());
        } else if (C()) {
            agh.h("realtime_RealTimeObjectDetector", "Detecting");
        } else {
            fzbVar.d();
            this.r.removeMessages(5);
            B(Boolean.TRUE);
            e eVar = new e(bArr, z, i, i2, i3);
            this.f.j("plt_search", "detectFrame", null, eVar);
            this.k = eVar;
            fzbVar.e();
        }
    }

    @Override // tb.py1, tb.m2d
    public void b(byte[] bArr, boolean z, int i, int i2, int i3) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0130b9", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        fzb fzbVar = this.s;
        if (fzbVar == null || this.t.get()) {
            StringBuilder sb = new StringBuilder("flow is null ");
            if (fzbVar != null) {
                z2 = false;
            }
            sb.append(z2);
            c4p.C("realtime_RealTimeObjectDetector", sb.toString(), new Object[0]);
        } else if (this.d) {
            agh.h("realtime_RealTimeObjectDetector", "stoped");
        } else {
            boolean z3 = ipe.c(bArr, i, i2, this.w.u()) == 1;
            if (z3) {
                fzbVar.i();
            } else {
                fzbVar.c();
            }
            if (this.g * this.h == 0) {
                agh.h("realtime_RealTimeObjectDetector", "viewWidth is zero");
            } else {
                z(bArr, z, i, i2, i3, z3, fzbVar);
            }
        }
    }
}
