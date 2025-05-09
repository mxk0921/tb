package com.taobao.weex.ui;

import com.taobao.weex.bridge.Invoker;
import com.taobao.weex.bridge.JavascriptInvokable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IFComponentHolder extends ComponentCreator, JavascriptInvokable {
    Invoker getPropertyInvoker(String str);

    void loadIfNonLazy();
}
