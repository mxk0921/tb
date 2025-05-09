package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hw7 implements u0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151190);
        t2o.a(478151173);
    }

    @Override // tb.u0c
    public void a(t0c t0cVar, boolean z, boolean z2, IDMComponent iDMComponent, IDMComponent iDMComponent2, IDMComponent iDMComponent3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7058b6eb", new Object[]{this, t0cVar, new Boolean(z), new Boolean(z2), iDMComponent, iDMComponent2, iDMComponent3});
            return;
        }
        t0cVar.b(false, iDMComponent3, iDMComponent2, t0cVar.h().indexOf(iDMComponent2), true);
        if (t0cVar.a().isEmpty()) {
            t0cVar.k(0, "", true);
        } else {
            t0cVar.k(4, Localization.q(R.string.taobao_app_1028_1_21626), true);
        }
    }
}
