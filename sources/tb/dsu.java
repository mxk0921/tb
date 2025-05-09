package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.external.UCPReachViewOpenState;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface dsu {
    boolean isEnabled();

    UCPReachViewOpenState openReachView(JSONObject jSONObject, JSONObject jSONObject2);

    void registerStateSynchronizer(k3e k3eVar);
}
