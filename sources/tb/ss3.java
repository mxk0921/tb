package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.sq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ss3 extends py1 implements vi7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_BEGIN_DETECT = 6;
    public static final int EVENT_END_DETECT = 5;
    public static final String PREFIX = "planB_";
    public final CaptureManager B;
    public volatile fzb D;
    public final String e;
    public final Context f;
    public xox h;
    public volatile int j;
    public volatile int k;
    public volatile int l;
    public volatile int m;
    public volatile boolean n;
    public r70 p;
    public d q;
    public final FrameLayout s;
    public ss3 x;
    public final int g = lg4.j3();
    public volatile boolean i = true;
    public long o = Long.MAX_VALUE;
    public int r = 0;
    public final AtomicBoolean t = new AtomicBoolean(true);
    public final AtomicBoolean u = new AtomicBoolean(false);
    public long v = System.currentTimeMillis();
    public long w = lg4.B1();
    public volatile boolean y = false;
    public final long z = lg4.E3();
    public boolean A = false;
    public final Handler C = new a(Looper.getMainLooper());
    public final AtomicBoolean E = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/ClassicObjectDetector$1");
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
                    agh.r("AutoDetect", ss3.l(ss3.this), "change SilenceStatus false");
                    ss3 ss3Var = ss3.this;
                    ss3Var.A = false;
                    fzb fzbVar = ss3Var.D;
                    if (fzbVar != null) {
                        fzbVar.f();
                    }
                }
            } else if (ss3.i(ss3.this) >= ss3.k(ss3.this)) {
                fzb fzbVar2 = ss3.this.D;
                if (fzbVar2 != null) {
                    fzbVar2.a();
                }
            } else {
                ss3.j(ss3.this);
                c4p.C("AutoDetect", "no region retry", new Object[0]);
                ss3.this.B(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ss3 ss3Var = ss3.this;
            ss3.m(ss3Var, ss3Var.w());
            ss3.this.v();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28246a;

        public c(String str) {
            this.f28246a = str;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            agh.h(this.f28246a, "onLayoutChange");
            ss3.this.h(view.getWidth(), view.getHeight());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface d<INPUT, OUTPUT> extends sio<INPUT, OUTPUT> {
    }

    static {
        t2o.a(730857628);
        t2o.a(481296904);
    }

    public ss3(Context context, String str, CaptureManager captureManager) {
        this.f = context;
        this.e = str;
        this.B = captureManager;
        VExecutors.defaultSharedThreadPool().submit(new b());
        this.p = new r70(context, this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addOnLayoutChangeListener(new c(str));
    }

    public static /* synthetic */ int i(ss3 ss3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("485ae26d", new Object[]{ss3Var})).intValue();
        }
        return ss3Var.r;
    }

    public static /* synthetic */ Object ipc$super(ss3 ss3Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -558272972) {
            super.resume();
            return null;
        } else if (hashCode == 1713617801) {
            super.stop();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/intelli/ClassicObjectDetector");
        }
    }

    public static /* synthetic */ int j(ss3 ss3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce094875", new Object[]{ss3Var})).intValue();
        }
        int i = ss3Var.r;
        ss3Var.r = 1 + i;
        return i;
    }

    public static /* synthetic */ int k(ss3 ss3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d082ee", new Object[]{ss3Var})).intValue();
        }
        return ss3Var.g;
    }

    public static /* synthetic */ String l(ss3 ss3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2947b8a4", new Object[]{ss3Var});
        }
        return ss3Var.e;
    }

    public static /* synthetic */ xox m(ss3 ss3Var, xox xoxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xox) ipChange.ipc$dispatch("2869d217", new Object[]{ss3Var, xoxVar});
        }
        ss3Var.h = xoxVar;
        return xoxVar;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8908459", new Object[]{this});
            return;
        }
        d dVar = this.q;
        if (dVar != null) {
            ((sq0.b) dVar).e();
        }
        B(false);
        this.C.removeMessages(5);
        this.r = 0;
    }

    public void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5accd30", new Object[]{this, new Boolean(z)});
            return;
        }
        this.t.set(z);
        ss3 ss3Var = this.x;
        if (ss3Var != null) {
            ss3Var.B(z);
        }
    }

    @Override // tb.py1, tb.m2d
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dda5ecb", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.l = i;
        this.m = i2;
        ss3 ss3Var = this.x;
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
        this.E.set(true);
        this.D = fzbVar;
        A();
        this.E.set(false);
        ss3 ss3Var = this.x;
        if (ss3Var != null) {
            ss3Var.c(fzbVar);
        }
    }

    @Override // tb.py1, tb.m2d
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9175398", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = z;
        ss3 ss3Var = this.x;
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
        agh.a(this.e, "destroy");
        r70 r70Var = this.p;
        if (r70Var != null) {
            r70Var.a();
        }
        xox xoxVar = this.h;
        if (xoxVar != null) {
            xoxVar.b();
        }
        this.C.removeCallbacksAndMessages(null);
        this.f26395a = false;
        q();
    }

    @Override // tb.py1, tb.m2d
    public FrameLayout getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        return this.s;
    }

    @Override // tb.py1
    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b50c471", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        String str = this.e;
        agh.h(str, "setRootViewSize: width=" + i + ", height=" + i2);
        this.j = i;
        this.k = i2;
        ss3 ss3Var = this.x;
        if (ss3Var != null) {
            ss3Var.h(i, i2);
        }
    }

    public abstract void n(byte[] bArr, int i, int i2, boolean z, int i3, fzb fzbVar);

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("506d3f88", new Object[]{this})).booleanValue();
        }
        ss3 ss3Var = this.x;
        if (ss3Var == null || !ss3Var.u.get()) {
            return false;
        }
        return true;
    }

    @Override // tb.vi7
    public void onDeviceMove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c6e40d", new Object[]{this});
        } else if (!this.y && !this.d) {
            A();
            fzb fzbVar = this.D;
            if (fzbVar != null) {
                fzbVar.onDeviceMove();
            }
            this.n = false;
            this.o = Long.MAX_VALUE;
        }
    }

    @Override // tb.vi7
    public void onDeviceStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ab3537", new Object[]{this});
        } else if (!this.y && !this.d) {
            this.n = true;
            this.o = System.currentTimeMillis();
        }
    }

    public final int p(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15a834a1", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        xox xoxVar = this.h;
        if (xoxVar != null && xoxVar.a(bArr, i, i2)) {
            return 3;
        }
        return 4;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d391c9", new Object[]{this});
            return;
        }
        ss3 ss3Var = this.x;
        if (ss3Var != null) {
            ss3Var.destroy();
            this.x = null;
        }
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f72fd49", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return true;
        }
        return this.A;
    }

    @Override // tb.py1, tb.m2d
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        super.resume();
        ss3 ss3Var = this.x;
        if (ss3Var != null) {
            ss3Var.resume();
        }
        if (this.p == null) {
            this.p = new r70(this.f, this);
        }
    }

    public abstract float s();

    public abstract long t();

    public abstract long u();

    public abstract void v();

    public abstract xox w();

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a825e60", new Object[]{this})).booleanValue();
        }
        return this.t.get();
    }

    public void y(r7l r7lVar, jl0 jl0Var, qu3 qu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b59658f", new Object[]{this, r7lVar, jl0Var, qu3Var});
            return;
        }
        agh.a(this.e, "onFindObject");
        fzb fzbVar = this.D;
        if (r7lVar == null || fzbVar == null) {
            B(false);
        } else if (r7lVar.d != null && r7lVar.b != null) {
            HashMap<String, String> hashMap = new HashMap<>(5);
            if (qu3Var != null) {
                hashMap.put(qu3.KEY, qu3Var.a());
            } else {
                hashMap.put(qu3.KEY, "unknown");
            }
            fzbVar.g(PhotoFrom.Values.AUTO_DETECT, jl0Var, r7lVar.b, r7lVar.d, hashMap);
        } else if (lg4.b4()) {
            this.C.sendEmptyMessageDelayed(5, this.z);
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1aebc8", new Object[]{this});
            return;
        }
        this.f26395a = true;
        long a2 = uk1.a(this.f);
        this.w = a2;
        if (a2 > 0) {
            this.A = true;
            this.C.sendEmptyMessageDelayed(6, a2);
        } else {
            this.C.sendEmptyMessage(6);
        }
        this.b = Long.valueOf(System.currentTimeMillis());
        String str = this.e;
        agh.h(str, "onReceiveFirstFrame-----silenceTime = " + this.w);
        mzu.n(p73.f25916a, "pltFirstCameraFrameIn", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "object_detect");
        agh.r("AutoDetect", "pltFirstCameraFrameIn", "taskName: object_detect");
        ss3 ss3Var = this.x;
        if (ss3Var != null) {
            ss3Var.z();
        }
    }

    @Override // tb.py1, tb.m2d
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        super.stop();
        agh.a(this.e, "stop");
        this.C.removeMessages(6);
        this.f26395a = false;
        if (this.w > 0) {
            this.A = true;
        }
        r70 r70Var = this.p;
        if (r70Var != null) {
            r70Var.a();
            this.p = null;
        }
        ss3 ss3Var = this.x;
        if (ss3Var != null) {
            ss3Var.stop();
        }
    }

    @Override // tb.py1, tb.m2d
    public void b(byte[] bArr, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0130b9", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (!this.f26395a) {
            z();
        }
        if (!this.y || !o()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.v;
            if (j < u()) {
                String str = this.e;
                agh.a(str, "interval = " + j);
                return;
            }
            this.v = currentTimeMillis;
            fzb fzbVar = this.D;
            if (fzbVar == null || this.E.get()) {
                agh.a(this.e, "flow is null ");
            } else if (!this.u.get()) {
                agh.a(this.e, "not build success yet");
            } else if (this.d) {
                agh.a(this.e, "stoped");
            } else {
                boolean z2 = ipe.c(bArr, i, i2, s()) == 1;
                if (z2) {
                    fzbVar.i();
                } else {
                    fzbVar.c();
                }
                if (z2 && fzbVar.h()) {
                    c4p.C(this.e, "当前帧亮度太低，检测结束", new Object[0]);
                    B(false);
                    this.o = Long.MAX_VALUE;
                } else if (!this.i || this.j == 0 || this.k == 0) {
                    String str2 = this.e;
                    c4p.C(str2, "focused = " + this.i + ", viewWidth = " + this.j + ", viewHeight = " + this.k, new Object[0]);
                } else if (r()) {
                    if (this.B.q() != null) {
                        if (this.e.toLowerCase().contains(qu3.ALINN)) {
                            this.B.q().o(true);
                        } else {
                            this.B.q().h(true);
                        }
                    }
                    agh.a(this.e, "drop frame");
                } else if (this.j * this.k == 0) {
                    String str3 = this.e;
                    agh.a(str3, "viewWidth = " + this.j + ", viewHeight");
                } else if (x()) {
                    c4p.C(this.e, "模型任务未完成，检测结束", new Object[0]);
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis() - this.o;
                    if (!this.n || currentTimeMillis2 < t()) {
                        String str4 = this.e;
                        agh.a(str4, "autoDetectProcess: not stable enough time " + currentTimeMillis2 + ", deviceStable " + this.n);
                    } else if (p(bArr, i, i2) == 3) {
                        n(bArr, i, i2, z, i3, fzbVar);
                    }
                }
            }
        } else {
            this.x.b(bArr, z, i, i2, i3);
        }
    }
}
