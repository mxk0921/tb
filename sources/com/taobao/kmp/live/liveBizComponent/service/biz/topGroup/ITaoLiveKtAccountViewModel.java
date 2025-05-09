package com.taobao.kmp.live.liveBizComponent.service.biz.topGroup;

import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtFansClubModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtIntimacyModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtSubscribeModel;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010<\u001a\u00020\u0003H&J\b\u0010=\u001a\u00020\u0003H&J\b\u0010>\u001a\u00020?H&J\b\u0010@\u001a\u00020\u0003H&J$\u0010A\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030Bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`CH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u0018\u0010\u001f\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u0018\u0010!\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0005\"\u0004\b#\u0010\u0007R\u001a\u0010$\u001a\u0004\u0018\u00010%X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u0004\u0018\u00010+X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00100\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R\u0018\u00103\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R\u001a\u00106\u001a\u0004\u0018\u000107X¦\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006D"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountViewModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "avatarUrl", "", "getAvatarUrl", "()Ljava/lang/String;", "setAvatarUrl", "(Ljava/lang/String;)V", "avatarAtmosphereUrl", "getAvatarAtmosphereUrl", "setAvatarAtmosphereUrl", "accountName", "getAccountName", "setAccountName", "vIconUrl", "getVIconUrl", "setVIconUrl", "enableHideWatchNums", "", "getEnableHideWatchNums", "()Z", "setEnableHideWatchNums", "(Z)V", "onlineCount", "", "getOnlineCount", "()J", "setOnlineCount", "(J)V", "isFollowed", "setFollowed", "isTopFavored", "setTopFavored", "topFavoredUrl", "getTopFavoredUrl", "setTopFavoredUrl", "subscribeModel", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeModel;", "getSubscribeModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeModel;", "setSubscribeModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeModel;)V", "fansClubModel", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtFansClubModel;", "getFansClubModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtFansClubModel;", "setFansClubModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtFansClubModel;)V", "widgetInstalled", "getWidgetInstalled", "setWidgetInstalled", "widgetAddition", "getWidgetAddition", "setWidgetAddition", "intimacyModel", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtIntimacyModel;", "getIntimacyModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtIntimacyModel;", "setIntimacyModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtIntimacyModel;)V", "fetchInfoText", "fetchInfoIconUrl", "fetchAccountFollowType", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtAccountFollowType;", "fetchFollowButtonText", "fetchOfficialTrackParams", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtAccountViewModel extends ITaoLiveKtOutViewModel {
    TaoLiveKtAccountFollowType fetchAccountFollowType();

    String fetchFollowButtonText();

    String fetchInfoIconUrl();

    String fetchInfoText();

    HashMap<String, String> fetchOfficialTrackParams();

    String getAccountName();

    String getAvatarAtmosphereUrl();

    String getAvatarUrl();

    boolean getEnableHideWatchNums();

    TaoLiveKtFansClubModel getFansClubModel();

    TaoLiveKtIntimacyModel getIntimacyModel();

    long getOnlineCount();

    TaoLiveKtSubscribeModel getSubscribeModel();

    String getTopFavoredUrl();

    String getVIconUrl();

    boolean getWidgetAddition();

    boolean getWidgetInstalled();

    boolean isFollowed();

    boolean isTopFavored();

    void setAccountName(String str);

    void setAvatarAtmosphereUrl(String str);

    void setAvatarUrl(String str);

    void setEnableHideWatchNums(boolean z);

    void setFansClubModel(TaoLiveKtFansClubModel taoLiveKtFansClubModel);

    void setFollowed(boolean z);

    void setIntimacyModel(TaoLiveKtIntimacyModel taoLiveKtIntimacyModel);

    void setOnlineCount(long j);

    void setSubscribeModel(TaoLiveKtSubscribeModel taoLiveKtSubscribeModel);

    void setTopFavored(boolean z);

    void setTopFavoredUrl(String str);

    void setVIconUrl(String str);

    void setWidgetAddition(boolean z);

    void setWidgetInstalled(boolean z);
}
