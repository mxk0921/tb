package com.taobao.favorites.favoritesdk.base;

import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ResultListener extends MtopListener {
    void onError(int i, MtopResponse mtopResponse, Object obj);

    void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj);

    void onSystemError(int i, MtopResponse mtopResponse, Object obj);
}
