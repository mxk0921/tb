package com.taobao.taolive.sdk.business;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.y6j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IRemoteExtendListener extends INetDataObject {
    void dataParseBegin(long j);

    void responseReceive(y6j y6jVar);
}
