package com.taobao.kmp.live.liveBizComponent.service.biz.liveResource;

import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiViewModel;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\u0005J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/liveResource/ITaoLiveKtEmojiManager;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ltb/xhv;", "prepareRecentUsedEmojis", "()V", "prepareRecentNormalSection", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem;", "item", "addRecentUsedEmoji", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem;)V", "cacheRecentUsedEmojiIfNeeded", "", "key", "matchedEmoji", "(Ljava/lang/String;)Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem;", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiViewModel;", "getEmojiViewModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiViewModel;", "emojiViewModel", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtEmojiManager extends Serializable {
    void addRecentUsedEmoji(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem);

    void cacheRecentUsedEmojiIfNeeded();

    TaoLiveKtEmojiViewModel getEmojiViewModel();

    TaoLiveKtEmojiIconItem matchedEmoji(String str);

    void prepareRecentNormalSection();

    void prepareRecentUsedEmojis();
}
