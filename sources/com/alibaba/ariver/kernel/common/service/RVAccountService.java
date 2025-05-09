package com.alibaba.ariver.kernel.common.service;

import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.Proxiable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface RVAccountService extends Proxiable {
    String getNick(Node node);

    String getUserAvatar(Node node);

    String getUserId(Node node);

    boolean isLogin(Node node);
}
