package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface snd {
    void a(JSONObject jSONObject, wcc wccVar);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void d();

    void destroy();

    @Deprecated
    DXRootView getDX3SearchView();

    Object getValueFromSearchBarData(String str);

    boolean isDX3SearchViewReady();

    void partialRefreshWidgetNode(String str);
}
