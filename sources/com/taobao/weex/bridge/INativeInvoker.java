package com.taobao.weex.bridge;

import com.alibaba.fastjson.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface INativeInvoker {
    Object invoke(Object obj, Invoker invoker, JSONArray jSONArray) throws Exception;

    void setDispatchCallback(Boolean bool);
}
