package com.taobao.message.lab.comfrm.inner;

import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface Render<VIEW> {
    VIEW getView();

    void render(ViewObject viewObject, EventDispatcher eventDispatcher);
}
