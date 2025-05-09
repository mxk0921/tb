package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iw7 implements u0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151191);
        t2o.a(478151173);
    }

    @Override // tb.u0c
    public void a(t0c t0cVar, boolean z, boolean z2, IDMComponent iDMComponent, IDMComponent iDMComponent2, IDMComponent iDMComponent3) {
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7058b6eb", new Object[]{this, t0cVar, new Boolean(z), new Boolean(z2), iDMComponent, iDMComponent2, iDMComponent3});
            return;
        }
        int indexOf = t0cVar.h().indexOf(iDMComponent2);
        if (!kw7.q(iDMComponent3) || (!kw7.A(iDMComponent2) && !kw7.t(iDMComponent2))) {
            z3 = false;
        } else {
            z3 = true;
        }
        t0cVar.b(false, iDMComponent3, iDMComponent2, indexOf, z3);
        if (t0cVar.a().isEmpty()) {
            t0cVar.k(0, "", true);
        } else {
            t0cVar.k(4, b(iDMComponent3, iDMComponent2), true);
        }
    }

    public final String b(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4978faf2", new Object[]{this, iDMComponent, iDMComponent2});
        }
        return Localization.q(R.string.taobao_app_1028_1_21635);
    }
}
