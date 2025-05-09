package com.taobao.tao.stream;

import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.k7j;
import tb.l7j;
import tb.m7j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IMtopStreamListener extends MtopListener {
    void onError(k7j k7jVar, int i, Object obj);

    void onFinish(l7j l7jVar, int i, Object obj);

    void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj);
}
