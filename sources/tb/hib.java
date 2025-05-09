package tb;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface hib {
    Page getOuterPage();

    Resource getResource(String str);

    String getViewId();

    void onCreate(Map<String, String> map);

    void onDestroy();

    void onParamChanged(String[] strArr, String[] strArr2);

    void sendEvent(String str, String str2, JSONObject jSONObject, IEmbedCallback iEmbedCallback);
}
