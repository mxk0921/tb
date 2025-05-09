package com.taobao.kmp.live.liveBizComponent.service.biz.comment;

import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import kotlin.Metadata;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J<\u0010\u000f\u001a\u00020\u00042+\u0010\u000e\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tj\u0004\u0018\u0001`\rH&¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0017\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001d\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0006R\u001c\u0010 \u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0006¨\u0006!"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentShowPriority;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "", "value", "Ltb/xhv;", "postAnchorResponseShow", "(Z)V", "postEveryBodySayHidden", "postHotSaleHidden", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "priority", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveCommentPriorityChanged;", "changed", "listenStatus", "(Ltb/g1a;)V", "getBottomHidden", "()Z", "setBottomHidden", "bottomHidden", "getHotSaleHidden", "setHotSaleHidden", "hotSaleHidden", "getEveryBodySayHidden", "setEveryBodySayHidden", "everyBodySayHidden", "getAnchorTopShowing", "setAnchorTopShowing", "anchorTopShowing", "getAnchorResponseShowing", "setAnchorResponseShowing", "anchorResponseShowing", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtCommentShowPriority extends ITaoLiveKtOutViewModel {
    boolean getAnchorResponseShowing();

    boolean getAnchorTopShowing();

    boolean getBottomHidden();

    boolean getEveryBodySayHidden();

    boolean getHotSaleHidden();

    void listenStatus(g1a<? super ITaoLiveKtCommentShowPriority, xhv> g1aVar);

    void postAnchorResponseShow(boolean z);

    void postEveryBodySayHidden(boolean z);

    void postHotSaleHidden(boolean z);

    void setAnchorResponseShowing(boolean z);

    void setAnchorTopShowing(boolean z);

    void setBottomHidden(boolean z);

    void setEveryBodySayHidden(boolean z);

    void setHotSaleHidden(boolean z);
}
