package com.taobao.android.weex.mega;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.WeexValue;
import tb.f4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface MegaModule extends WeexModule {
    void asyncCall(String str, String str2, JSONObject jSONObject, f4x f4xVar);

    WeexValue syncCall(String str, String str2, JSONObject jSONObject);
}
