package com.taobao.favorites.favoritesdk.base;

import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface CacheLisener extends MtopListener {
    void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj);
}
