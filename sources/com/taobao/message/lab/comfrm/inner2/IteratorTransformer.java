package com.taobao.message.lab.comfrm.inner2;

import com.taobao.message.lab.comfrm.core.Action;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IteratorTransformer<T> {
    ItemState transform(Action action, SharedState sharedState, T t, ItemState itemState);
}
