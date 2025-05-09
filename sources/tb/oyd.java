package tb;

import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface oyd {
    void buildInitTppParams(Map<String, ? extends Object> map);

    void liveRoomSwitched();

    void requestRecommendModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel, String str, Map<String, ? extends Object> map);

    void setMFirstInitParams(Map<String, ? extends Object> map);

    void setMMockUserId(String str);

    void setResponseHandleCompletionCallBack(w1a<? super Boolean, ? super String, ? super List<z3t>, xhv> w1aVar);

    void setTppParamsBuildCallback(g1a<? super Map<String, ? extends Object>, xhv> g1aVar);

    void start();

    void stop();
}
