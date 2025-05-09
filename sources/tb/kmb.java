package tb;

import android.app.Activity;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.view.ViewManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class kmb extends kz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ga3 h = null;
    public String i = null;

    static {
        t2o.a(479199243);
    }

    public kmb(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(kmb kmbVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/ICartPresenter");
    }

    public abstract void J(boolean z);

    public abstract AbilityHubAdapter K();

    @Deprecated
    public abstract Handler L();

    public abstract ml1 M();

    public final ga3 N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ga3) ipChange.ipc$dispatch("ebc31257", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new ga3(this);
        }
        return this.h;
    }

    public final String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d209fdf3", new Object[]{this});
        }
        String str = this.i;
        if (str != null) {
            return str;
        }
        Activity context = getContext();
        if (context != null) {
            this.i = String.valueOf(context.hashCode());
        } else {
            this.i = String.valueOf(hashCode());
        }
        return this.i;
    }

    /* renamed from: P */
    public abstract zxb d();

    public abstract rc8 Q();

    public abstract Fragment R();

    public abstract f8e S();

    public abstract g8e T();

    public abstract vqm U();

    public abstract y0n V();

    public abstract QueryParamsManager W();

    public abstract f4p X();

    public abstract blq Y();

    /* renamed from: Z */
    public ViewManager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewManager) ipChange.ipc$dispatch("1ec08c63", new Object[]{this});
        }
        return (ViewManager) this.c;
    }

    public abstract void a0();

    public abstract boolean b0();

    public abstract void c0();

    public abstract void d0(ux uxVar, boolean z);

    public abstract void e0(boolean z);

    public abstract void f0(boolean z, Map<String, String> map, ux uxVar);

    public abstract void g0(yc3 yc3Var, ux uxVar);

    @Override // tb.kz1, tb.fdd
    public abstract Activity getContext();

    public abstract void h0(boolean z);

    @Deprecated
    public abstract void i0(boolean z, Map<String, String> map, ux uxVar);

    public abstract void j0();

    public abstract void k0(IDMComponent iDMComponent, lcu lcuVar, boolean z, ux uxVar, Object obj);

    public abstract void l0(fe3 fe3Var, ux uxVar);

    public abstract void m0(Fragment fragment);

    public abstract void n0(f8e f8eVar);

    public abstract void o0(IDMComponent iDMComponent, lcu lcuVar, boolean z, ux uxVar, Object obj);
}
