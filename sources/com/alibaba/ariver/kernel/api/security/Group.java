package com.alibaba.ariver.kernel.api.security;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Group {
    void assignPermissions(Map<String, ? extends Permission> map);

    String description();

    String groupName();

    Map<String, ? extends Permission> permissions();
}
