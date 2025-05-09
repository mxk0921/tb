package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex_framework.MUSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface h2c {
    void destroy();

    View getView();

    void onAttach(MUSDKInstance mUSDKInstance);

    void onBindData(JSONObject jSONObject);

    void onReceivedMessage(String str, JSONObject jSONObject);

    void setJSEventDelegate(jqf jqfVar);
}
