package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class gmb implements osc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199629);
        t2o.a(525337675);
    }

    @Override // tb.cfb
    public void B(AlertConfirmInfo alertConfirmInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2958b9b", new Object[]{this, alertConfirmInfo});
        } else {
            ckf.g(alertConfirmInfo, "result");
        }
    }

    @Override // tb.cfb
    public void J(AlertConfirmInfo alertConfirmInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5529a063", new Object[]{this, alertConfirmInfo});
        } else {
            ckf.g(alertConfirmInfo, "result");
        }
    }

    @Override // tb.jdb
    public void O(ErrorResult errorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
        } else {
            ckf.g(errorResult, "result");
        }
    }
}
