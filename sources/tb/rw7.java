package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rw7 implements u0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151192);
        t2o.a(478151173);
    }

    @Override // tb.u0c
    public void a(t0c t0cVar, boolean z, boolean z2, IDMComponent iDMComponent, IDMComponent iDMComponent2, IDMComponent iDMComponent3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7058b6eb", new Object[]{this, t0cVar, new Boolean(z), new Boolean(z2), iDMComponent, iDMComponent2, iDMComponent3});
            return;
        }
        boolean a2 = kw7.a(iDMComponent, t0cVar.e());
        kw7.A(iDMComponent);
        if (!kw7.y(iDMComponent3) || !a2) {
            if (!kw7.y(iDMComponent3) && kw7.y(iDMComponent)) {
                if (z) {
                    t0cVar.k(2, Localization.q(R.string.taobao_app_1028_1_21643), true);
                } else {
                    t0cVar.k(1, Localization.q(R.string.taobao_app_1028_1_21627), false);
                }
            }
        } else if (z) {
            t0cVar.k(2, Localization.q(R.string.taobao_app_1028_1_21643), true);
        } else {
            t0cVar.k(1, Localization.q(R.string.taobao_app_1028_1_21624), false);
        }
    }
}
