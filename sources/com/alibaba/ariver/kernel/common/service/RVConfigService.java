package com.alibaba.ariver.kernel.common.service;

import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface RVConfigService extends Proxiable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface OnConfigChangeListener {
        void onChange(String str);
    }

    void clearProcessCache();

    String getConfig(String str, String str2);

    String getConfig(String str, String str2, OnConfigChangeListener onConfigChangeListener);

    boolean getConfigBoolean(String str, boolean z);

    JSONArray getConfigJSONArray(String str);

    JSONObject getConfigJSONObject(String str);

    String getConfigWithProcessCache(String str, String str2);

    void putConfigCache(String str, String str2);
}
