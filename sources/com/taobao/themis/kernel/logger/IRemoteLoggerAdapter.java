package com.taobao.themis.kernel.logger;

import com.alibaba.fastjson.JSONObject;
import tb.n8s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IRemoteLoggerAdapter extends n8s {
    void criticalError(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject);

    void d(String str, String str2, String str3, String str4, JSONObject jSONObject);

    void e(String str, String str2, String str3, String str4, JSONObject jSONObject);

    void i(String str, String str2, String str3, String str4, JSONObject jSONObject);

    void v(String str, String str2, String str3, String str4, JSONObject jSONObject);

    void w(String str, String str2, String str3, String str4, JSONObject jSONObject);
}
