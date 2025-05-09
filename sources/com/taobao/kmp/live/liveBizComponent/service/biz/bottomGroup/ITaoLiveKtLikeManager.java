package com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup;

import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006H&¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017j\u0004\u0018\u0001`\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006\""}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeManager;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ltb/xhv;", "triggerAddFavorAction", "()V", "", "", "", "params", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeInputModel;", "fetchLikeInput", "(Ljava/util/Map;)Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeInputModel;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeViewModel;", "getLikeViewModel", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeViewModel;", "likeViewModel", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeInputProtocol;", "getLikeInputImpl", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeInputProtocol;", "setLikeInputImpl", "(Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeInputProtocol;)V", "likeInputImpl", "Lkotlin/Function0;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveLikeRemoteCountUpdateCallback;", "getLikeRemoteCountUpdateCallback", "()Ltb/d1a;", "setLikeRemoteCountUpdateCallback", "(Ltb/d1a;)V", "likeRemoteCountUpdateCallback", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveLikeUploadCallback;", "getLikeUploadCallback", "setLikeUploadCallback", "likeUploadCallback", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtLikeManager extends Serializable {
    TaoLiveKtLikeInputModel fetchLikeInput(Map<String, ? extends Object> map);

    ITaoLiveKtLikeInputProtocol getLikeInputImpl();

    d1a<xhv> getLikeRemoteCountUpdateCallback();

    d1a<xhv> getLikeUploadCallback();

    TaoLiveKtLikeViewModel getLikeViewModel();

    void setLikeInputImpl(ITaoLiveKtLikeInputProtocol iTaoLiveKtLikeInputProtocol);

    void setLikeRemoteCountUpdateCallback(d1a<xhv> d1aVar);

    void setLikeUploadCallback(d1a<xhv> d1aVar);

    void triggerAddFavorAction();
}
