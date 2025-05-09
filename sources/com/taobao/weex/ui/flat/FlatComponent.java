package com.taobao.weex.ui.flat;

import com.taobao.weex.ui.flat.widget.Widget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface FlatComponent<T extends Widget> {
    T getOrCreateFlatWidget();

    boolean promoteToView(boolean z);
}
