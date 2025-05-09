package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.struct.ViewWidget;
import tb.lz1;

/* JADX WARN: Incorrect field signature: TIP; */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class txh<V extends View, SELF, P extends lz1<SELF>, MODEL, IP extends P> extends ViewWidget<V, MODEL, SELF> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile lz1 l;

    static {
        t2o.a(481297463);
    }

    public /* synthetic */ txh(Activity activity, Object obj, Object obj2, xfw xfwVar, boolean z, int i, a07 a07Var) {
        this(activity, obj, obj2, xfwVar, (i & 16) != 0 ? true : z);
    }

    public static /* synthetic */ Object ipc$super(txh txhVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1794064906:
                super.M();
                return null;
            case -1065474324:
                super.O();
                return null;
            case 731174045:
                super.L();
                return null;
            case 1083424568:
                super.K();
                return null;
            case 1209752480:
                super.N();
                return null;
            case 1250151579:
                super.G();
                return null;
            case 1316643293:
                super.P();
                return null;
            case 2086342279:
                super.J();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/struct/MVPWidget");
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        j0(h0(this));
        super.G();
    }

    @Override // tb.vz
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5b0e87", new Object[]{this});
            return;
        }
        super.J();
        i0().e();
    }

    @Override // tb.vz
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        super.K();
        i0().I();
    }

    @Override // tb.vz
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
            return;
        }
        super.L();
        i0().J();
    }

    @Override // tb.vz
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
            return;
        }
        super.M();
        i0().K();
    }

    @Override // tb.vz
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481b5ba0", new Object[]{this});
            return;
        }
        super.N();
        i0().f();
    }

    @Override // tb.vz
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07e26ec", new Object[]{this});
            return;
        }
        super.O();
        i0().g();
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7a61dd", new Object[]{this});
            return;
        }
        super.P();
        i0().F();
    }

    /* JADX WARN: Incorrect return type in method signature: (TSELF;)TIP; */
    public abstract lz1 h0(Object obj);

    /* JADX WARN: Incorrect return type in method signature: ()TIP; */
    public final lz1 i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lz1) ipChange.ipc$dispatch("9cd8c7e", new Object[]{this});
        }
        lz1 lz1Var = this.l;
        if (lz1Var != null) {
            return lz1Var;
        }
        ckf.y("presenter");
        throw null;
    }

    /* JADX WARN: Incorrect types in method signature: (TIP;)V */
    public final void j0(lz1 lz1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b7b3c8", new Object[]{this, lz1Var});
            return;
        }
        ckf.g(lz1Var, "<set-?>");
        this.l = lz1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txh(Activity activity, Object obj, MODEL model, xfw xfwVar, boolean z) {
        super(activity, obj, model, xfwVar, z, false, 32, null);
        ckf.g(activity, "activity");
    }
}
