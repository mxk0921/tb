package com.taobao.kmp.live.liveBizComponent.service.biz.comment;

import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentQueue;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "readComment", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "isEmpty", "", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtCommentQueue extends ITaoLiveKtOutViewModel {
    boolean isEmpty();

    TaoLiveKtCommentEntity readComment();
}
