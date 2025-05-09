package com.alibaba.ariver.kernel.api.node;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ValueStore {
    boolean containsKey(String str);

    boolean getBooleanValue(String str);

    int getIntValue(String str);

    JSONArray getJsonArrayValue(String str);

    JSONObject getJsonValue(String str);

    long getLongValue(String str);

    String getStringValue(String str);

    void putBooleanValue(String str, boolean z);

    void putIntValue(String str, int i);

    void putJsonArrayValue(String str, JSONArray jSONArray);

    void putJsonValue(String str, JSONObject jSONObject);

    void putLongValue(String str, long j);

    void putStringValue(String str, String str2);
}
