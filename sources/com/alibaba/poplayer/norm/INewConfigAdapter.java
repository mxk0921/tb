package com.alibaba.poplayer.norm;

import java.util.Map;
import java.util.Set;
import tb.opb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface INewConfigAdapter {
    String getConfigItemById(String str);

    Set<String> getConfigsIdSet();

    String getCurConfigVersion();

    Map<String, Set<String>> getUriConfigsMap();

    void init();

    void startFetchConfig(opb opbVar);
}
