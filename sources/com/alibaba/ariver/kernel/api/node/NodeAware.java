package com.alibaba.ariver.kernel.api.node;

import com.alibaba.ariver.kernel.api.node.Node;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface NodeAware<T extends Node> {
    Class<T> getNodeType();

    void setNode(WeakReference<T> weakReference);
}
