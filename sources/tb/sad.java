package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface sad {
    void addPopMessageListenerByMain(IPopViewService.a aVar);

    void onPopTabSelected();

    void onPopTabUnSelected();

    void removePopMessageListenerByMain(IPopViewService.a aVar);

    void triggerPopRemoveByMain(String str);

    void triggerPopShowByMain(int i, JSONObject jSONObject);
}
