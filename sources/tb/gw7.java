package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gw7 implements u0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151189);
        t2o.a(478151173);
    }

    @Override // tb.u0c
    public void a(t0c t0cVar, boolean z, boolean z2, IDMComponent iDMComponent, IDMComponent iDMComponent2, IDMComponent iDMComponent3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7058b6eb", new Object[]{this, t0cVar, new Boolean(z), new Boolean(z2), iDMComponent, iDMComponent2, iDMComponent3});
        } else if (z) {
            if (kw7.t(iDMComponent3) || kw7.A(iDMComponent3)) {
                t0cVar.k(2, Localization.q(R.string.taobao_app_1028_1_21643), true);
            } else if (kw7.a(iDMComponent, t0cVar.e())) {
                t0cVar.k(2, Localization.q(R.string.taobao_app_1028_1_21624), true);
            } else {
                t0cVar.k(2, Localization.q(R.string.taobao_app_1028_1_21627), true);
            }
        } else if (!kw7.A(iDMComponent)) {
            t0cVar.k(1, Localization.q(R.string.taobao_app_1028_1_21630), true);
        } else if (kw7.z(iDMComponent3, iDMComponent)) {
            t0cVar.k(1, Localization.q(R.string.taobao_app_1028_1_21630), true);
        } else {
            t0cVar.k(4, Localization.q(R.string.taobao_app_1028_1_21626), true);
        }
    }
}
