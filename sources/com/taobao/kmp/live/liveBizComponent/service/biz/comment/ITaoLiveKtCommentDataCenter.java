package com.taobao.kmp.live.liveBizComponent.service.biz.comment;

import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\u00020\t8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentDataCenter;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "readAnchorResponse", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "readAnchorTopMsg", "Ltb/xhv;", "cleanCritical", "()V", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentShowPriority;", "getPriority", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentShowPriority;", "setPriority", "(Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentShowPriority;)V", "priority", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtAtmosphereQueue;", "getEnterAtmospheres", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtAtmosphereQueue;", "enterAtmospheres", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentQueue;", "getAnchorResponses", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentQueue;", "anchorResponses", "getAnchorTopMessages", "anchorTopMessages", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtCommentDataCenter extends ITaoLiveKtOutViewModel {
    void cleanCritical();

    ITaoLiveKtCommentQueue getAnchorResponses();

    ITaoLiveKtCommentQueue getAnchorTopMessages();

    ITaoLiveKtAtmosphereQueue getEnterAtmospheres();

    ITaoLiveKtCommentShowPriority getPriority();

    TaoLiveKtCommentEntity readAnchorResponse();

    TaoLiveKtCommentEntity readAnchorTopMsg();

    void setPriority(ITaoLiveKtCommentShowPriority iTaoLiveKtCommentShowPriority);
}
