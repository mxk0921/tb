package com.alibaba.poplayer.norm;

import tb.opb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IConfigAdapter {
    String getConfigItemById(String str);

    String getConfigsIdSetString();

    void init(opb opbVar);

    void startFetchConfig();
}
