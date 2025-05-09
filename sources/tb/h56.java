package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic_v35.view.DXNanoScrollerIndicator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h56 extends nu<DXNanoScrollerIndicator, j56> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596454);
    }

    public static /* synthetic */ Object ipc$super(h56 h56Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/widget/DXNanoScrollerIndicatorComponentDesc");
    }

    @Override // tb.nu
    public lrb c(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrb) ipChange.ipc$dispatch("bf1820b2", new Object[]{this, tn6Var});
        }
        return new i56(tn6Var);
    }

    @Override // tb.nu
    public wij d(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wij) ipChange.ipc$dispatch("83bb1c71", new Object[]{this, tn6Var});
        }
        return new vn6(tn6Var);
    }

    @Override // tb.nu
    public void h(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98922cf0", new Object[]{this, tn6Var});
        }
    }

    @Override // tb.nu
    public void i(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255ebac0", new Object[]{this, tn6Var});
        }
    }

    @Override // tb.nu
    public boolean j(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f966a59b", new Object[]{this, tn6Var})).booleanValue();
        }
        ((DXNanoScrollerIndicator) tn6Var.d()).setScrollBarTrackColor(tn6Var.i().getBackGroundColor());
        return true;
    }

    /* renamed from: m */
    public j56 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j56) ipChange.ipc$dispatch("c2e97a28", new Object[]{this});
        }
        return new j56();
    }

    /* renamed from: n */
    public DXNanoScrollerIndicator f(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXNanoScrollerIndicator) ipChange.ipc$dispatch("4ca601a5", new Object[]{this, tn6Var});
        }
        return new DXNanoScrollerIndicator(tn6Var.a());
    }

    /* renamed from: o */
    public void l(tn6 tn6Var, DXNanoScrollerIndicator dXNanoScrollerIndicator, j56 j56Var, j56 j56Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd3da04", new Object[]{this, tn6Var, dXNanoScrollerIndicator, j56Var, j56Var2});
            return;
        }
        double d = j56Var2.b;
        if (d != j56Var.b) {
            dXNanoScrollerIndicator.setIndicatorRatio(d);
        }
        rl6 rl6Var = (rl6) tn6Var.i();
        int i = j56Var2.f21764a;
        if (i != j56Var.f21764a) {
            dXNanoScrollerIndicator.setScrollBarThumbColor(rl6Var.tryFetchDarkModeColor(maj.INDICATOR_COLOR, 2, i));
        }
    }
}
