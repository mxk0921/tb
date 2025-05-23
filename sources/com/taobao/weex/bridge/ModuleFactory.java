package com.taobao.weex.bridge;

import com.taobao.weex.common.WXModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ModuleFactory<T extends WXModule> extends JavascriptInvokable {
    T buildInstance() throws IllegalAccessException, InstantiationException;
}
