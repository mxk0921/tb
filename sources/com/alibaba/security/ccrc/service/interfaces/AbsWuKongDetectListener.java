package com.alibaba.security.ccrc.service.interfaces;

import com.alibaba.security.ccrc.service.model.AbsWukongActionRiskResult;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class AbsWuKongDetectListener implements OnWuKongDetectListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.security.ccrc.service.interfaces.OnWuKongDetectListener
    public void onActionTrigger(AbsWukongActionRiskResult absWukongActionRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e24978", new Object[]{this, absWukongActionRiskResult});
        }
    }
}
