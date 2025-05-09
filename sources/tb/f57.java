package tb;

import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f57 implements ouo, buj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean h = true;

    /* renamed from: a  reason: collision with root package name */
    public final huo f19020a;
    public final rst b;
    public final huo c;
    public huo d;
    public boolean e;
    public final int f;
    public final int g;

    static {
        t2o.a(620757066);
        t2o.a(620757121);
    }

    public f57(huo huoVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this(huoVar, i, i2, i3, i4, i5, i6, i7, i8, -1);
    }

    @Override // tb.ouo
    public huo a() {
        huo huoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("b4aa5061", new Object[]{this});
        }
        if (this.d == null) {
            if (h) {
                huoVar = new h6v();
            } else {
                huoVar = new g6v();
            }
            this.d = huoVar;
        }
        return this.d;
    }

    @Override // tb.ouo
    public huo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("cae3015f", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ouo
    public huo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("d14c83a9", new Object[]{this});
        }
        return this.f19020a;
    }

    @Override // tb.buj
    public synchronized void d(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1772fc9", new Object[]{this, new Boolean(z)});
        } else if (this.e == z) {
            if (z) {
                str = "SLOW";
            } else {
                str = "FAST";
            }
            fiv.f(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "network speed not changed, still %s", str);
        } else {
            if (z) {
                fiv.f(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "network speed changed from FAST to SLOW", new Object[0]);
                this.b.e(this.g);
            } else {
                fiv.f(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "network speed changed from SLOW to FAST", new Object[0]);
                this.b.e(this.f);
            }
            this.e = z;
        }
    }

    @Override // tb.ouo
    public huo e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("982faad1", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.ouo
    public huo f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("1dc31d59", new Object[]{this});
        }
        return this.f19020a;
    }

    public f57(huo huoVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this(huoVar, i, i2, i3, i4, i5, i6, i7, i8, i9, false);
    }

    public f57(huo huoVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        this(huoVar, i, i2, i3, i4, i5, i6, i7, i8, i9, z, true);
    }

    public f57(huo huoVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2) {
        if (huoVar == null || z) {
            this.f19020a = new gh3("Phenix-Scheduler", i, i2, i3, i4, i5);
        } else {
            this.f19020a = new y5i(huoVar, i2, i4, i5);
        }
        this.f = i7;
        this.g = i8;
        if (i9 > 0) {
            this.b = new dpl(this.f19020a, i7, i9, z);
        } else {
            this.b = new hk2(this.f19020a, i7);
        }
        if (!z || z2) {
            this.c = new hk2(this.f19020a, i6);
        } else {
            this.c = this.f19020a;
        }
    }
}
