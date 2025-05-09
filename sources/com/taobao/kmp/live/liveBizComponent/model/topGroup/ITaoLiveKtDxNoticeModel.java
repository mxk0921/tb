package com.taobao.kmp.live.liveBizComponent.model.topGroup;

import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import java.util.Map;
import kotlin.Metadata;
import tb.ksl;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u0018\u0010\u0014\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R(\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR\u001a\u0010!\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u001a\u0010$\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\rR(\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001d¨\u0006*"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtDxNoticeModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "showCountPerDay", "", "getShowCountPerDay", "()I", "setShowCountPerDay", "(I)V", "sourceLiveId", "", "getSourceLiveId", "()Ljava/lang/String;", "setSourceLiveId", "(Ljava/lang/String;)V", "showGap", "getShowGap", "setShowGap", "priority", "getPriority", "setPriority", "showDuration", "getShowDuration", "setShowDuration", "utParams", "", "", "getUtParams", "()Ljava/util/Map;", "setUtParams", "(Ljava/util/Map;)V", "fromAccountId", "getFromAccountId", "setFromAccountId", "bizType", "getBizType", "setBizType", "dxName", "getDxName", "setDxName", ksl.PARSER_KEY_DX_DATA, "getDxData", "setDxData", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtDxNoticeModel extends ITaoLiveKtOutViewModel {
    String getBizType();

    Map<String, Object> getDxData();

    String getDxName();

    String getFromAccountId();

    int getPriority();

    int getShowCountPerDay();

    int getShowDuration();

    int getShowGap();

    String getSourceLiveId();

    Map<String, Object> getUtParams();

    void setBizType(String str);

    void setDxData(Map<String, ? extends Object> map);

    void setDxName(String str);

    void setFromAccountId(String str);

    void setPriority(int i);

    void setShowCountPerDay(int i);

    void setShowDuration(int i);

    void setShowGap(int i);

    void setSourceLiveId(String str);

    void setUtParams(Map<String, ? extends Object> map);
}
