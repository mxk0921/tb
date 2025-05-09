package com.etao.feimagesearch.structure.capture;

import android.content.Context;
import android.util.Size;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.MNNManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.agh;
import tb.hdd;
import tb.kk0;
import tb.l53;
import tb.lg4;
import tb.m2d;
import tb.ok1;
import tb.p3e;
import tb.pdc;
import tb.qk0;
import tb.qlb;
import tb.slb;
import tb.svm;
import tb.t2o;
import tb.uck;
import tb.vpt;
import tb.web;
import tb.x9d;
import tb.yr3;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CaptureManager implements qk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean b0 = true;
    public boolean U;
    public Size W;

    /* renamed from: a  reason: collision with root package name */
    public web f4871a;
    public qlb b;
    public m2d c;
    public uck d;
    public pdc e;
    public p3e f;
    public x9d g;
    public slb h;
    public ViewGroup i;
    public boolean n;
    public volatile ExecutorService x;
    public final Set<hdd> j = new HashSet(2);
    public int k = 1;
    public String l = "";
    public volatile boolean m = false;
    public volatile boolean o = true;
    public volatile boolean p = true;
    public Boolean q = null;
    public Boolean r = null;
    public boolean s = false;
    public c t = null;
    public RealtimeModelLoadListener u = null;
    public final List<qk0> v = new ArrayList(5);
    public boolean w = false;
    public volatile boolean y = false;
    public Boolean z = null;
    public Integer A = null;
    public Boolean B = null;
    public Boolean C = null;
    public Boolean D = null;
    public Boolean E = null;
    public Boolean F = null;
    public String G = null;
    public Long H = null;
    public Boolean I = null;
    public Boolean J = null;
    public final kk0 K = new kk0();
    public Boolean M = null;
    public boolean N = false;
    public svm O = null;
    public Float P = null;
    public Boolean Q = null;
    public Boolean R = null;
    public boolean S = false;
    public boolean T = false;
    public boolean V = false;
    public final ok1 X = new ok1();
    public Boolean Y = null;
    public Boolean Z = null;
    public Boolean a0 = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface RealtimeModelLoadListener {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public enum LoadState {
            BUILD_SUCCESS,
            BUILD_FAILED,
            DESTROYED;
            
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(LoadState loadState, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/structure/capture/CaptureManager$RealtimeModelLoadListener$LoadState");
            }

            public static LoadState valueOf(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (LoadState) ipChange.ipc$dispatch("b9f33834", new Object[]{str});
                }
                return (LoadState) Enum.valueOf(LoadState.class, str);
            }
        }

        void a(LoadState loadState);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/structure/capture/CaptureManager$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (CaptureManager.a(CaptureManager.this) != null) {
                CaptureManager.b(CaptureManager.this).addView(CaptureManager.a(CaptureManager.this).getRootView());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f4872a = 0;

        public b(CaptureManager captureManager) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder("plt_capture_");
            int i = this.f4872a;
            this.f4872a = 1 + i;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setPriority(10);
            return thread;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
        void e(int i, boolean z);
    }

    static {
        t2o.a(481297492);
        t2o.a(481297511);
    }

    public static /* synthetic */ m2d a(CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2d) ipChange.ipc$dispatch("e776999c", new Object[]{captureManager});
        }
        return captureManager.c;
    }

    public static /* synthetic */ ViewGroup b(CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("bf3de887", new Object[]{captureManager});
        }
        return captureManager.i;
    }

    public Set<hdd> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("54a39692", new Object[]{this});
        }
        return this.j;
    }

    public void A0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541e3c3c", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public p3e B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p3e) ipChange.ipc$dispatch("a9455297", new Object[]{this});
        }
        return this.f;
    }

    public void B0(p3e p3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2975c5f", new Object[]{this, p3eVar});
        } else {
            this.f = p3eVar;
        }
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3d75fe", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f1de1ce", new Object[]{this});
            return;
        }
        m2d m2dVar = this.c;
        if (m2dVar != null) {
            m2dVar.stop();
        }
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b1ae101", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public synchronized void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea567119", new Object[]{this});
        } else {
            this.m = false;
        }
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("248873a2", new Object[]{this})).booleanValue();
        }
        if (this.C == null) {
            this.C = Boolean.valueOf(lg4.z());
        }
        return this.C.booleanValue();
    }

    public void E0(qk0 qk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb2cd3e", new Object[]{this, qk0Var});
        } else {
            ((ArrayList) this.v).remove(qk0Var);
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5022783", new Object[]{this})).booleanValue();
        }
        if (this.D == null) {
            this.D = Boolean.valueOf(lg4.a0());
        }
        return this.D.booleanValue();
    }

    public void F0(hdd hddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb27d84d", new Object[]{this, hddVar});
        } else {
            ((HashSet) this.j).remove(hddVar);
        }
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f498257", new Object[]{this})).booleanValue();
        }
        if (this.z == null) {
            this.z = Boolean.valueOf(lg4.j0());
        }
        return this.z.booleanValue();
    }

    public void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12a6ce5", new Object[]{this});
        } else {
            this.t = null;
        }
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4c5b076", new Object[]{this})).booleanValue();
        }
        if (this.E == null) {
            this.E = Boolean.valueOf(lg4.p0());
        }
        return this.E.booleanValue();
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63745682", new Object[]{this})).booleanValue();
        }
        if (this.F == null) {
            this.F = Boolean.valueOf(lg4.r1());
        }
        return this.F.booleanValue();
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5bad1c5", new Object[]{this})).booleanValue();
        }
        return this.V;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c08c79af", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b0c854b", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d20a3bcf", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.Y;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(lg4.U0());
        this.Y = valueOf;
        return valueOf.booleanValue();
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b03d9d", new Object[]{this})).booleanValue();
        }
        if (this.q == null) {
            this.q = Boolean.valueOf(lg4.J4());
        }
        return this.q.booleanValue();
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad0872f7", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.Z;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean R = lg4.R();
        this.Z = Boolean.valueOf(R);
        return R;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f92a94", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.a0;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean P = lg4.P();
        this.a0 = Boolean.valueOf(P);
        return P;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0136546", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de5308d9", new Object[]{this})).booleanValue();
        }
        if (this.k == 0) {
            return true;
        }
        return false;
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e287248", new Object[]{this})).booleanValue();
        }
        if (this.r == null) {
            this.r = Boolean.valueOf(lg4.V0());
        }
        return this.r.booleanValue();
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caf9b464", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public synchronized boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33ac8004", new Object[]{this})).booleanValue();
        } else if (this.m) {
            return false;
        } else {
            this.m = true;
            return true;
        }
    }

    public void V(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a43b19b", new Object[]{this, new Integer(i)});
            return;
        }
        m2d m2dVar = this.c;
        if (m2dVar != null && i == 3) {
            m2dVar.f();
        }
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a6e6a", new Object[]{this});
            return;
        }
        this.N = true;
        svm svmVar = this.O;
        if (svmVar != null) {
            svmVar.a();
        }
    }

    public final void X(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ffae28", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        MNNManager.Companion.a().f(i);
        c cVar = this.t;
        if (cVar != null) {
            cVar.e(i, z);
        }
    }

    public void Z(RealtimeModelLoadListener.LoadState loadState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01d4cc2", new Object[]{this, loadState});
            return;
        }
        IpChange ipChange2 = RealtimeModelLoadListener.LoadState.$ipChange;
        RealtimeModelLoadListener realtimeModelLoadListener = this.u;
        if (realtimeModelLoadListener != null) {
            realtimeModelLoadListener.a(loadState);
        }
    }

    public void a0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48efd057", new Object[]{this, new Boolean(z)});
            return;
        }
        this.s = z;
        if (this.c != null && this.r.booleanValue()) {
            X(this.k, z);
        }
    }

    public void b0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae5ddc3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.U = true;
        this.V = z;
    }

    @Override // tb.qk0
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e159fe4", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.v).iterator();
        while (it.hasNext()) {
            ((qk0) it.next()).c();
        }
    }

    public void c0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b229216", new Object[]{this, new Boolean(z)});
            return;
        }
        this.S = true;
        if (z) {
            this.T = true;
        }
    }

    public void d0(qk0 qk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba64c165", new Object[]{this, qk0Var});
        } else {
            ((ArrayList) this.v).add(qk0Var);
        }
    }

    public void e(Context context) {
        uck uckVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1000fc80", new Object[]{this, context});
        } else if (t() != 2 && this.c == null && (uckVar = this.d) != null) {
            this.c = uckVar.create(context);
            vpt.g("addView", new a());
        }
    }

    public void e0(uck uckVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5838f3e6", new Object[]{this, uckVar});
        } else if (uckVar != null) {
            this.d = uckVar;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4244e525", new Object[]{this})).booleanValue();
        }
        if (this.B == null) {
            if (b0) {
                this.B = Boolean.valueOf(lg4.a());
            } else {
                this.B = Boolean.TRUE;
            }
        }
        return this.B.booleanValue();
    }

    public void f0(hdd hddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a93206", new Object[]{this, hddVar});
        } else {
            ((HashSet) this.j).add(hddVar);
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("805356b8", new Object[]{this})).booleanValue();
        }
        if (this.Q == null) {
            this.Q = Boolean.valueOf(lg4.G());
        }
        return this.Q.booleanValue();
    }

    public void g0(svm svmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af002e7", new Object[]{this, svmVar});
        } else if (this.N) {
            svmVar.a();
        } else {
            this.O = svmVar;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66973ade", new Object[]{this})).booleanValue();
        }
        if (this.R == null) {
            this.R = Boolean.valueOf(lg4.b0());
        }
        return this.R.booleanValue();
    }

    public void h0(RealtimeModelLoadListener realtimeModelLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7292ea76", new Object[]{this, realtimeModelLoadListener});
        } else {
            this.u = realtimeModelLoadListener;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("483ca854", new Object[]{this})).booleanValue();
        }
        if (this.J == null) {
            this.J = Boolean.valueOf(lg4.p1());
        }
        return this.J.booleanValue();
    }

    public void i0(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e64732", new Object[]{this, cVar});
        } else {
            this.t = cVar;
        }
    }

    public Future<?> j(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("c822bfe3", new Object[]{this, runnable});
        }
        if (this.w) {
            return null;
        }
        if (this.x == null) {
            this.x = new ThreadPoolExecutor(3, 5, 4L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(this));
        }
        return this.x.submit(runnable);
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b4ea93", new Object[]{this});
            return;
        }
        agh.h("CaptureManager", "releaseObjectDetector");
        m2d m2dVar = this.c;
        if (m2dVar != null) {
            this.i.removeView(m2dVar.getRootView());
            this.c.destroy();
            this.c = null;
        }
    }

    public web k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (web) ipChange.ipc$dispatch("4b9ea2f7", new Object[]{this});
        }
        return this.f4871a;
    }

    public void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82db94e8", new Object[]{this});
            return;
        }
        this.T = false;
        this.S = false;
        this.U = false;
        this.V = false;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46d4c73c", new Object[]{this});
        }
        if (this.G == null) {
            this.G = lg4.D1();
        }
        return this.G;
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba21ddb", new Object[]{this});
            return;
        }
        m2d m2dVar = this.c;
        if (m2dVar != null) {
            m2dVar.f();
        }
    }

    public kk0 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kk0) ipChange.ipc$dispatch("a95a4347", new Object[]{this});
        }
        return this.K;
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24640d39", new Object[]{this});
            return;
        }
        m2d m2dVar = this.c;
        if (m2dVar != null) {
            m2dVar.resume();
        }
    }

    public x9d n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x9d) ipChange.ipc$dispatch("f269017", new Object[]{this});
        }
        return this.g;
    }

    public void n0(web webVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46d72a9", new Object[]{this, webVar});
        } else {
            this.f4871a = webVar;
        }
    }

    public Size o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("933bd78b", new Object[]{this});
        }
        return this.W;
    }

    public void o0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92bd513f", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public qlb p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qlb) ipChange.ipc$dispatch("5bb5e117", new Object[]{this});
        }
        return this.b;
    }

    public void p0(x9d x9dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44eb23f", new Object[]{this, x9dVar});
        } else {
            this.g = x9dVar;
        }
    }

    public slb q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (slb) ipChange.ipc$dispatch("609a5dc7", new Object[]{this});
        }
        return this.h;
    }

    public void q0(Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d7b8ea", new Object[]{this, size});
        }
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf49bdac", new Object[]{this})).intValue();
        }
        if (this.A == null) {
            this.A = Integer.valueOf(lg4.R1());
        }
        return this.A.intValue();
    }

    public void r0(Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df420c3f", new Object[]{this, size});
        } else {
            this.W = size;
        }
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6499dd90", new Object[]{this});
        }
        return this.l;
    }

    public void s0(qlb qlbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864d1afb", new Object[]{this, qlbVar});
        } else {
            this.b = qlbVar;
        }
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3327aecc", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public void t0(slb slbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef7320f9", new Object[]{this, slbVar});
        } else {
            this.h = slbVar;
        }
    }

    public float u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8ebac01", new Object[]{this})).floatValue();
        }
        if (this.P == null) {
            this.P = Float.valueOf(lg4.g2());
        }
        return this.P.floatValue();
    }

    public void u0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4048e6", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3bc359b", new Object[]{this})).booleanValue();
        }
        if (this.M == null) {
            this.M = Boolean.valueOf(lg4.m1());
        }
        return this.M.booleanValue();
    }

    public void v0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a538be", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        X(i, this.s);
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("779332c7", new Object[]{this})).booleanValue();
        }
        if (this.I == null) {
            this.I = Boolean.valueOf(lg4.L0());
        }
        return this.I.booleanValue();
    }

    public void w0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b46222", new Object[]{this, viewGroup});
        } else {
            this.i = viewGroup;
        }
    }

    public pdc x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pdc) ipChange.ipc$dispatch("209c1ec7", new Object[]{this});
        }
        return this.e;
    }

    public void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2efadc1", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public long y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83e1b3a7", new Object[]{this})).longValue();
        }
        if (this.H == null) {
            this.H = Long.valueOf(lg4.I2());
        }
        return this.H.longValue();
    }

    public void y0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b4035", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public m2d z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2d) ipChange.ipc$dispatch("1fe23ec9", new Object[]{this});
        }
        return this.c;
    }

    public void z0(pdc pdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620d8d23", new Object[]{this, pdcVar});
        } else {
            this.e = pdcVar;
        }
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        agh.h("CaptureManager", "onDestroy");
        this.w = true;
        if (this.x != null) {
            ((ThreadPoolExecutor) this.x).shutdownNow();
        }
    }

    public Map<String, String> d(yr3 yr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e60331f3", new Object[]{this, yr3Var});
        }
        HashMap hashMap = new HashMap();
        ok1 ok1Var = this.X;
        if (ok1Var != null) {
            Map<String, String> a2 = ok1Var.a(this.T, this.S, this.U, this.V, true);
            if (!a2.isEmpty()) {
                hashMap.putAll(a2);
            }
        }
        hashMap.put("isreshoot", String.valueOf(yr3Var.isFromNoFrontRetake(true)));
        hashMap.put("lst_unvalid", l53.m());
        return hashMap;
    }
}
