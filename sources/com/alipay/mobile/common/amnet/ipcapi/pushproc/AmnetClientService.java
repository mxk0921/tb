package com.alipay.mobile.common.amnet.ipcapi.pushproc;

import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface AmnetClientService {
    int getConnState();

    boolean isAmnetActiveted();

    void notifyResultFeedback(ResultFeedback resultFeedback);

    @Deprecated
    void post(AmnetPost amnetPost);

    Map<String, String> postWithResult(AmnetPost amnetPost);

    void setAmnetActiveted(boolean z);
}
