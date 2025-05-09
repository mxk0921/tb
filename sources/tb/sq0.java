package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.bean.YuvDiffCheckerConfig;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ss3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class sq0 extends ss3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public rq0 F;
    public final qu3 G = new qu3(qu3.ALINN);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements an2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.an2
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c5256d3", new Object[]{this});
            }
        }

        @Override // tb.an2
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("911f63fa", new Object[]{this});
            }
        }

        @Override // tb.an2
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60cbb67a", new Object[]{this});
                return;
            }
            agh.r("AutoDetect", "planB_AliNNObjectDetector", "buildAlinnNetwork: onMainBuildSucceed");
            if (!caa.q() || !lg4.I4()) {
                sq0.this.u.set(true);
                sq0.this.q();
                return;
            }
            agh.c("planB_AliNNObjectDetector", "mock alinn not build failed");
            a();
        }

        @Override // tb.an2
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fb7f373", new Object[]{this});
                return;
            }
            agh.r("AutoDetect", "planB_AliNNObjectDetector", "buildAlinnNetwork: onBuildFailed");
            sq0.this.u.set(false);
            sq0.this.y = true;
        }
    }

    static {
        t2o.a(730857624);
    }

    public sq0(Context context, CaptureManager captureManager) {
        super(context, "planB_AliNNObjectDetector", captureManager);
        this.x = new tbo(context, captureManager);
    }

    public static /* synthetic */ qu3 C(sq0 sq0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qu3) ipChange.ipc$dispatch("8eba6bea", new Object[]{sq0Var});
        }
        return sq0Var.G;
    }

    public static /* synthetic */ Object ipc$super(sq0 sq0Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1915068725:
                sq0Var.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1481951945:
                sq0Var.onDeviceStable();
                return null;
            case -1458089064:
                sq0Var.d(((Boolean) objArr[0]).booleanValue());
                return null;
            case -558272972:
                sq0Var.resume();
                return null;
            case -172787659:
                return sq0Var.getRootView();
            case 241349955:
                sq0Var.c((fzb) objArr[0]);
                return null;
            case 365356045:
                sq0Var.onDeviceMove();
                return null;
            case 453062841:
                sq0Var.b((byte[]) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 756739016:
                sq0Var.z();
                return null;
            case 1532019825:
                sq0Var.h(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1713617801:
                sq0Var.stop();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/AliNNObjectDetector");
        }
    }

    public final void D(NetConfig netConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb255bd", new Object[]{this, netConfig});
            return;
        }
        rq0 rq0Var = new rq0(netConfig.type);
        this.F = rq0Var;
        rq0Var.e(netConfig, new a());
    }

    @Override // tb.ss3, tb.py1, tb.m2d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        rq0 rq0Var = this.F;
        if (rq0Var != null) {
            rq0Var.f();
            this.F = null;
        }
    }

    @Override // tb.py1, tb.m2d
    public qu3 g() {
        qu3 qu3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qu3) ipChange.ipc$dispatch("3941f463", new Object[]{this});
        }
        if (!this.y) {
            return this.G.b(this.B.R(), this.A);
        }
        ss3 ss3Var = this.x;
        if (ss3Var == null) {
            qu3Var = null;
        } else {
            qu3Var = ss3Var.g();
        }
        if (qu3Var == null) {
            return new qu3().b(this.B.R(), this.A);
        }
        return qu3Var;
    }

    @Override // tb.ss3
    public void n(byte[] bArr, int i, int i2, boolean z, int i3, fzb fzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cd5203", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), fzbVar});
        } else if (this.F != null) {
            this.C.removeMessages(5);
            B(true);
            b bVar = new b(bArr, i, i2, z, i3);
            this.F.g("festival_intelli", "detectFrame", null, bVar);
            this.q = bVar;
            fzbVar.e();
        }
    }

    @Override // tb.ss3
    public float s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be0042fd", new Object[]{this})).floatValue();
        }
        return this.B.u();
    }

    @Override // tb.ss3
    public long t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd66e0b2", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // tb.ss3
    public long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81c688cf", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // tb.ss3
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28339085", new Object[]{this});
            return;
        }
        v69 v69Var = new v69();
        v69Var.name = "festival_intelli";
        v69Var.type = "Object";
        D(v69Var);
        ss3 ss3Var = this.x;
        if (ss3Var != null) {
            ss3Var.v();
        }
    }

    @Override // tb.ss3
    public xox w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xox) ipChange.ipc$dispatch("85bc8d9f", new Object[]{this});
        }
        YuvDiffCheckerConfig S3 = lg4.S3();
        return new xox(S3.graySize, 10, S3.frameCountThreshold, S3.timeThreshold);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements ss3.d<q7l, r7l> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f28215a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;
        public final AtomicBoolean f = new AtomicBoolean(false);

        static {
            t2o.a(730857626);
            t2o.a(730857632);
        }

        public b(byte[] bArr, int i, int i2, boolean z, int i3) {
            this.f28215a = bArr;
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
            }
        }

        public void e() {
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

        /* renamed from: i */
        public q7l b() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q7l) ipChange.ipc$dispatch("e47eea1b", new Object[]{this});
            }
            q7l q7lVar = new q7l();
            byte[] bArr = this.f28215a;
            byte[] bArr2 = new byte[bArr.length];
            q7lVar.f26562a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            q7lVar.c = this.b;
            q7lVar.d = this.c;
            q7lVar.e = sq0.this.j;
            q7lVar.f = sq0.this.k;
            int i = sq0.this.l;
            int i2 = sq0.this.m;
            q7lVar.b = this.d;
            q7lVar.g = this.e;
            fzb fzbVar = sq0.this.D;
            if (fzbVar == null || fzbVar.b()) {
                z = true;
            }
            q7lVar.h = z;
            return q7lVar;
        }

        @Override // tb.sio
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                sq0.this.B(false);
            }
        }

        /* renamed from: f */
        public void onFinish(r7l r7lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebae7498", new Object[]{this, r7lVar});
                return;
            }
            sq0 sq0Var = sq0.this;
            if (!sq0Var.c) {
                sq0Var.c = true;
                mzu.n(p73.f25916a, "pltFirstObjectDetect", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "object_detect");
                agh.r("AutoDetect", "pltFirstObjectDetect", "taskName: object_detect");
            }
            if (!this.f.get()) {
                if (sq0.this.B.q() != null) {
                    sq0.this.B.q().o(false);
                }
                jl0 jl0Var = new jl0("object_detect", "");
                sq0 sq0Var2 = sq0.this;
                sq0Var2.y(r7lVar, jl0Var, sq0.C(sq0Var2));
            }
        }
    }
}
