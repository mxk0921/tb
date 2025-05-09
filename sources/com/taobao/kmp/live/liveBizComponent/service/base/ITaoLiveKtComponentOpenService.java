package com.taobao.kmp.live.liveBizComponent.service.base;

import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent;
import com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend;
import com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentTrack;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountManager;
import java.util.List;
import kotlin.Metadata;
import tb.lyd;
import tb.myd;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtComponentOpenService;", "Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;", "", "config", "Ltb/xhv;", "install", "(Ljava/lang/String;)V", "", "", "revMsgSubTypes", "()Ljava/util/List;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentSend;", "getCommentSender", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentSend;", "commentSender", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentTrack;", "getCommentTracker", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentTrack;", "commentTracker", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentManager;", "getCommentManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentManager;", "commentManager", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/liveResource/ITaoLiveKtEmojiManager;", "getEmojiManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/liveResource/ITaoLiveKtEmojiManager;", "emojiManager", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountManager;", "getAccountManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountManager;", "accountManager", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeManager;", "getLikeManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeManager;", "likeManager", "Ltb/myd;", "getNoticeManager", "()Ltb/myd;", "noticeManager", "Ltb/lyd;", "getGiftBandManager", "()Ltb/lyd;", "giftBandManager", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtComponentOpenService extends ITaoLiveKtComponent {
    ITaoLiveKtAccountManager getAccountManager();

    ITaoLiveKtCommentManager getCommentManager();

    ITaoLiveKtCommentSend getCommentSender();

    ITaoLiveKtCommentTrack getCommentTracker();

    ITaoLiveKtEmojiManager getEmojiManager();

    lyd getGiftBandManager();

    ITaoLiveKtLikeManager getLikeManager();

    myd getNoticeManager();

    void install(String str);

    List<Long> revMsgSubTypes();
}
