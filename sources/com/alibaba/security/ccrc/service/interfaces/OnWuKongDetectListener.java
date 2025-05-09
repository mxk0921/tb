package com.alibaba.security.ccrc.service.interfaces;

import com.alibaba.security.ccrc.service.model.AbsWukongActionRiskResult;
import com.alibaba.security.ccrc.service.model.WukongDetectFinishRiskResult;
import com.alibaba.security.ccrc.service.model.WukongRiskUploadResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface OnWuKongDetectListener {
    void onActionTrigger(AbsWukongActionRiskResult absWukongActionRiskResult);

    void onDetectFinish(WukongDetectFinishRiskResult wukongDetectFinishRiskResult);

    void onRiskUpload(WukongRiskUploadResult wukongRiskUploadResult);
}
