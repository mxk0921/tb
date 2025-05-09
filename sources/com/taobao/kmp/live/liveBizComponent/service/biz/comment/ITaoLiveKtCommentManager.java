package com.taobao.kmp.live.liveBizComponent.service.biz.comment;

import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendResponse;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.g1a;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J%\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016RA\u0010\"\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018j\u0004\u0018\u0001`\u001d8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!RG\u0010)\u001a-\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020$\u0018\u00010#¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018j\u0004\u0018\u0001`&8&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!RV\u00102\u001a<\u0012\u0013\u0012\u00110+¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0015\u0012\u0013\u0018\u00010$¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0006\u0018\u00010*j\u0004\u0018\u0001`-8&@&X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101RO\u00107\u001a5\u0012#\u0012!\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018j\u0004\u0018\u0001`48&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!¨\u00068"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentManager;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "", "", "config", "Ltb/xhv;", "setupCommentOpen", "(Ljava/util/Map;)V", "", "data", "updateDetailTrivialComment", "startManager", "()V", "stopManager", "showNoticesIfNeeded", "", "getEnableCommentBiz", "()Z", "enableCommentBiz", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentDataCenter;", "getCommentDataCenter", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentDataCenter;", "commentDataCenter", "Lkotlin/Function1;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveKtCommentDriverResult;", "Lkotlin/ParameterName;", "name", "response", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveCommentDriverCallback;", "getDriverCallback", "()Ltb/g1a;", "setDriverCallback", "(Ltb/g1a;)V", "driverCallback", "", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "locals", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveCommentLocalDriverCallback;", "getLocalDriverCallback", "setLocalDriverCallback", "localDriverCallback", "Lkotlin/Function2;", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResponse;", "entity", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/TaoLiveCommentSendLocalRev;", "getLocalSendCallback", "()Ltb/u1a;", "setLocalSendCallback", "(Ltb/u1a;)V", "localSendCallback", "hotSaleResult", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveCommentHotSaleCallback;", "getHotSaleCallBack", "setHotSaleCallBack", "hotSaleCallBack", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtCommentManager extends Serializable {
    ITaoLiveKtCommentDataCenter getCommentDataCenter();

    g1a<TaoLiveKtCommentDriverResult, xhv> getDriverCallback();

    boolean getEnableCommentBiz();

    g1a<Map<String, ? extends Object>, xhv> getHotSaleCallBack();

    g1a<List<TaoLiveKtCommentEntity>, xhv> getLocalDriverCallback();

    u1a<TaoLiveKtCommentSendResponse, TaoLiveKtCommentEntity, xhv> getLocalSendCallback();

    void setDriverCallback(g1a<? super TaoLiveKtCommentDriverResult, xhv> g1aVar);

    void setHotSaleCallBack(g1a<? super Map<String, ? extends Object>, xhv> g1aVar);

    void setLocalDriverCallback(g1a<? super List<TaoLiveKtCommentEntity>, xhv> g1aVar);

    void setLocalSendCallback(u1a<? super TaoLiveKtCommentSendResponse, ? super TaoLiveKtCommentEntity, xhv> u1aVar);

    void setupCommentOpen(Map<String, String> map);

    void showNoticesIfNeeded();

    void startManager();

    void stopManager();

    void updateDetailTrivialComment(Map<String, ? extends Object> map);
}
