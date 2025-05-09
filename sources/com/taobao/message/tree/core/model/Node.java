package com.taobao.message.tree.core.model;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface Node {
    String getAttachTreeId();

    Map<String, String> getComputed();

    String getConfigData();

    Map<String, Object> getExt();

    String getNodeId();

    String getParentId();

    String getType();

    String getUniqueKey();

    void setAttachTreeId(String str);
}
