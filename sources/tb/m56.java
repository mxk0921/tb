package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m56 extends k56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596465);
    }

    public static /* synthetic */ Object ipc$super(m56 m56Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -140879297) {
            return super.g((tn6) objArr[0], (l56) objArr[1]);
        }
        if (hashCode == 739807324) {
            super.l((tn6) objArr[0], (View) objArr[1], (l56) objArr[2], (l56) objArr[3]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic_v35/widget/DXNanoSliderLayoutComponentDesc");
    }

    @Override // tb.k56
    /* renamed from: o */
    public View g(tn6 tn6Var, l56 l56Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f79a5a3f", new Object[]{this, tn6Var, l56Var});
        }
        View o = super.g(tn6Var, l56Var);
        ((knd) o).getScrollViewImpl().S(true);
        return o;
    }

    @Override // tb.k56
    /* renamed from: p */
    public void l(tn6 tn6Var, View view, l56 l56Var, l56 l56Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c18905c", new Object[]{this, tn6Var, view, l56Var, l56Var2});
            return;
        }
        super.l(tn6Var, view, l56Var, l56Var2);
        knd kndVar = (knd) view;
        kndVar.getScrollViewImpl().J(l56Var2.f);
        kndVar.getScrollViewImpl().L(l56Var2.h);
        kndVar.getScrollViewImpl().H(l56Var2.i);
        kndVar.getScrollViewImpl().M(l56Var2.j);
        if (!l56Var2.i || !l56Var2.h || l56Var2.j <= 1000) {
            kndVar.getScrollViewImpl().A();
            return;
        }
        kndVar.getScrollViewImpl().y();
        kndVar.getScrollViewImpl().K(tn6Var.i().getEngine());
        kndVar.getScrollViewImpl().X();
    }
}
