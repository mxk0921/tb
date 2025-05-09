package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface nwb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(DXRootView dXRootView);
    }

    void a(Context context, String str, a aVar);

    DinamicXEngine getDynamicXEngine();

    void renderDX(DXRootView dXRootView, JSONObject jSONObject);
}
