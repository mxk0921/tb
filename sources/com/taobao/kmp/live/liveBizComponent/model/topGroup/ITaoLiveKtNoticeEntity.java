package com.taobao.kmp.live.liveBizComponent.model.topGroup;

import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001aX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtNoticeEntity;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "noticeType", "Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/TaoLiveKtNoticeEntityType;", "getNoticeType", "()Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/TaoLiveKtNoticeEntityType;", "setNoticeType", "(Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/TaoLiveKtNoticeEntityType;)V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "showDuration", "", "getShowDuration", "()I", "setShowDuration", "(I)V", "repeatTime", "getRepeatTime", "setRepeatTime", "isSelfLiveRoom", "setSelfLiveRoom", "noticeModel", "Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtDxNoticeModel;", "getNoticeModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtDxNoticeModel;", "setNoticeModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtDxNoticeModel;)V", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtNoticeEntity extends ITaoLiveKtOutViewModel {
    ITaoLiveKtDxNoticeModel getNoticeModel();

    TaoLiveKtNoticeEntityType getNoticeType();

    int getRepeatTime();

    int getShowDuration();

    String getText();

    String isSelfLiveRoom();

    void setNoticeModel(ITaoLiveKtDxNoticeModel iTaoLiveKtDxNoticeModel);

    void setNoticeType(TaoLiveKtNoticeEntityType taoLiveKtNoticeEntityType);

    void setRepeatTime(int i);

    void setSelfLiveRoom(String str);

    void setShowDuration(int i);

    void setText(String str);
}
