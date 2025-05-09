package com.taobao.weex.dom;

import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.component.WXComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface RenderContext {
    WXComponent getComponent(String str);

    WXSDKInstance getInstance();

    WXComponent unregisterComponent(String str);
}
