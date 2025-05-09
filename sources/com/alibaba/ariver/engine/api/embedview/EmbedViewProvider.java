package com.alibaba.ariver.engine.api.embedview;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.Proxiable;

/* compiled from: Taobao */
@DefaultImpl("com.alibaba.ariver.integration.embedview.DefaultEmbedViewProvider")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface EmbedViewProvider extends Proxiable {
    IEmbedView createEmbedView(String str, Node node);
}
