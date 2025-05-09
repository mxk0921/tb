package tb;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.media.IMediaService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class ici extends uq9 implements trc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String G = "MediaCard";
    public final tei A;
    public final uei B;
    public final IMediaService C;
    private v5m F;
    private r83 t0;
    public final Handler z = new Handler(Looper.getMainLooper());
    public boolean D = false;
    public final HashMap<String, String> E = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f21238a;
        public final /* synthetic */ boolean b;

        public a(boolean z, boolean z2) {
            this.f21238a = z;
            this.b = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ici iciVar = ici.this;
            if (!iciVar.D) {
                iciVar.D = true;
                iciVar.onRequestMediaPlayer(iciVar);
            }
            ici iciVar2 = ici.this;
            iciVar2.onStartMedia(iciVar2, this.f21238a, this.b);
        }
    }

    static {
        t2o.a(468713899);
        t2o.a(468714525);
    }

    public ici(FluidContext fluidContext) {
        super(fluidContext);
        this.A = new tei(fluidContext);
        this.B = new uei(fluidContext);
        this.C = (IMediaService) fluidContext.getService(IMediaService.class);
        this.t0 = new r83(fluidContext, this);
        if (Y0()) {
            this.F = new v5m(fluidContext, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e7af5e", new Object[]{this});
        } else {
            onPauseMedia(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8eca4f9", new Object[]{this});
        } else if (!this.D) {
            this.D = true;
            onRequestMediaPlayer(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d518aba", new Object[]{this});
        } else {
            onStopMedia(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef2f6dc", new Object[]{this});
        } else {
            onUTPairsUpdate(this);
        }
    }

    public static /* synthetic */ Object ipc$super(ici iciVar, String str, Object... objArr) {
        if (str.hashCode() == 610311722) {
            super.onBindData((uq9) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/base/MediaCard");
    }

    public void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685a9964", new Object[]{this});
        } else if (this.t) {
            N0();
        }
    }

    public void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8757d12d", new Object[]{this});
        } else if (h0() && this.t) {
            V0(true);
        }
    }

    public Handler D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.z;
    }

    public tei E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tei) ipChange.ipc$dispatch("e4e1575f", new Object[]{this});
        }
        return this.A;
    }

    public uei F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uei) ipChange.ipc$dispatch("16a8169", new Object[]{this});
        }
        return this.B;
    }

    public IMediaService G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaService) ipChange.ipc$dispatch("46aa5771", new Object[]{this});
        }
        return this.C;
    }

    public int H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1c9b5fd", new Object[]{this})).intValue();
        }
        return -1;
    }

    public v5m I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v5m) ipChange.ipc$dispatch("1a8accc7", new Object[]{this});
        }
        return this.F;
    }

    public final void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef88b115", new Object[]{this});
        } else {
            Q0(new Runnable() { // from class: tb.fci
                @Override // java.lang.Runnable
                public final void run() {
                    ici.this.J0();
                }
            });
        }
    }

    public final void O0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43ff07a", new Object[]{this, new Boolean(z)});
            return;
        }
        onRecyclePlayer(this, z);
        this.D = false;
    }

    public final void P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262ee7af", new Object[]{this});
        } else {
            Q0(new Runnable() { // from class: tb.eci
                @Override // java.lang.Runnable
                public final void run() {
                    ici.this.K0();
                }
            });
        }
    }

    public void Q0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{this, runnable});
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.z.post(runnable);
        }
    }

    public void R0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66275ed", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public final void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb47641", new Object[]{this});
        } else {
            onShowCover(this);
        }
    }

    public final void U0(int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7656e799", new Object[]{this, new Integer(i), new Integer(i2), drawable, str});
        } else {
            onShowFirstCover(this, i, i2, drawable, str);
        }
    }

    public final void V0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20eabcb", new Object[]{this, new Boolean(z)});
        } else {
            W0(z, false);
        }
    }

    public final void W0(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc78069", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            Q0(new a(z, z2));
        }
    }

    public final void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a5c89", new Object[]{this});
        } else {
            Q0(new Runnable() { // from class: tb.hci
                @Override // java.lang.Runnable
                public final void run() {
                    ici.this.L0();
                }
            });
        }
    }

    public boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af2faec0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void Z0(Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2f5f41", new Object[]{this, bool, bool2});
        }
    }

    public final void a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3d21ea", new Object[]{this});
        } else {
            Q0(new Runnable() { // from class: tb.gci
                @Override // java.lang.Runnable
                public final void run() {
                    ici.this.M0();
                }
            });
        }
    }

    public void k(qy0 qy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec31384", new Object[]{this, qy0Var});
        }
    }

    @Override // tb.uq9
    public void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c09d33", new Object[]{this});
        } else {
            P0();
        }
    }

    @Override // tb.uq9, tb.ulb, tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
            return;
        }
        super.onBindData(uq9Var, aVar, i);
        if (((IDataService) this.f29555a.getService(IDataService.class)).getConfig().j().C) {
            Z0(Boolean.TRUE, Boolean.FALSE);
        }
    }

    @Override // tb.trc
    public void onDataUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
            return;
        }
        ir9.b(G, "onDataUpdate - " + X());
        this.A.onDataUpdate(uq9Var);
        this.C.onDataUpdate(uq9Var);
    }

    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
            return;
        }
        this.A.onPauseMedia(uq9Var);
        this.C.onPauseMedia(uq9Var);
    }

    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        this.A.onRecyclePlayer(uq9Var, z);
        this.C.onRecyclePlayer(uq9Var, z);
    }

    public void onRequestMediaPlayer(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
            return;
        }
        this.A.onRequestMediaPlayer(uq9Var);
        this.C.onRequestMediaPlayer(uq9Var);
    }

    @Override // tb.trc
    public void onShowCover(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b0cef3", new Object[]{this, uq9Var});
            return;
        }
        this.A.onShowCover(uq9Var);
        this.C.onShowCover(uq9Var);
    }

    @Override // tb.trc
    public void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e3629", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), drawable, str});
            return;
        }
        this.A.onShowFirstCover(uq9Var, i, i2, drawable, str);
        this.C.onShowFirstCover(uq9Var, i, i2, drawable, str);
    }

    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.A.onStartMedia(uq9Var, z, z2);
        this.C.onStartMedia(uq9Var, z, z2);
    }

    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
            return;
        }
        this.A.onStopMedia(uq9Var);
        this.C.onStopMedia(uq9Var);
    }

    @Override // tb.trc
    public void onUTPairsUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55533c7c", new Object[]{this, uq9Var});
            return;
        }
        this.A.onUTPairsUpdate(uq9Var);
        this.C.onUTPairsUpdate(uq9Var);
    }

    public void u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23daa75c", new Object[]{this, new Float(f)});
        }
    }

    public void update12003UtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aceb7f0", new Object[]{this, map});
        }
    }
}
