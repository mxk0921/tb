package com.taobao.live.liveroom.liveBizComponent.topGroup.manager;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtFansClubModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtIntimacyModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtSubscribeDataSourceModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtSubscribeModel;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.TaoLiveKtAccountFollowType;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.czs;
import tb.dun;
import tb.e3t;
import tb.eqz;
import tb.l1t;
import tb.ns3;
import tb.pus;
import tb.smh;
import tb.t2o;
import tb.tvr;
import tb.z9u;
import tb.zys;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0006J+\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\"\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b \u0010!R2\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010/R\"\u00103\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b4\u0010/R$\u00105\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010,\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010/R\"\u00109\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010:\u001a\u0004\bE\u0010<\"\u0004\bF\u0010>R\"\u0010G\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bG\u0010<\"\u0004\bH\u0010>R\"\u0010I\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010,\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010/R$\u0010M\u001a\u0004\u0018\u00010L8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010Z\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010:\u001a\u0004\b[\u0010<\"\u0004\b\\\u0010>R\"\u0010]\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u0010:\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R$\u0010a\u001a\u0004\u0018\u00010`8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010g\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010,\u001a\u0004\bh\u0010\u0006\"\u0004\bi\u0010/R\"\u0010j\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010:\u001a\u0004\bk\u0010<\"\u0004\bl\u0010>R\"\u0010m\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010@\u001a\u0004\bn\u0010B\"\u0004\bo\u0010DR\"\u0010p\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010@\u001a\u0004\bq\u0010B\"\u0004\br\u0010DR\"\u0010s\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010:\u001a\u0004\bt\u0010<\"\u0004\bu\u0010>R\u0016\u0010v\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010:R\u0016\u0010w\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010:R$\u0010y\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u0019\u0010\u007f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0082\u0001\u001a\u0002088BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010<R\u0016\u0010\u0084\u0001\u001a\u0002088BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010<¨\u0006\u0085\u0001"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtAccountViewModel;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountViewModel;", "<init>", "()V", "", "generateWatchNumText", "()Ljava/lang/String;", "", "count", "onlineLimitNumberFormat", "(J)Ljava/lang/String;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtAccountFollowType;", "fetchTopFavoredFollowType", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtAccountFollowType;", "fetchFollowedFollowType", "fetchDianTaoFollowType", "Ltb/xhv;", "mkAccountViewModelForOfficialMain", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "broadCasterObj", "getAccountName", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)Ljava/lang/String;", "fetchInfoText", "fetchInfoIconUrl", "fetchAccountFollowType", "fetchFollowButtonText", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fetchOfficialTrackParams", "()Ljava/util/HashMap;", "Ltb/czs;", "detail", "mkAccountViewModel$tao_live_crossplatform_foundation_release", "(Ltb/czs;)V", "mkAccountViewModel", "", "", "originData", "Ljava/util/Map;", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "avatarUrl", "Ljava/lang/String;", "getAvatarUrl", "setAvatarUrl", "(Ljava/lang/String;)V", "avatarAtmosphereUrl", "getAvatarAtmosphereUrl", "setAvatarAtmosphereUrl", "accountName", "setAccountName", "vIconUrl", "getVIconUrl", "setVIconUrl", "", "enableHideWatchNums", "Z", "getEnableHideWatchNums", "()Z", "setEnableHideWatchNums", "(Z)V", "onlineCount", "J", "getOnlineCount", "()J", "setOnlineCount", "(J)V", "isFollowed", "setFollowed", "isTopFavored", "setTopFavored", "topFavoredUrl", "getTopFavoredUrl", "setTopFavoredUrl", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeModel;", "subscribeModel", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeModel;", "getSubscribeModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeModel;", "setSubscribeModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtSubscribeModel;)V", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtFansClubModel;", "fansClubModel", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtFansClubModel;", "getFansClubModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtFansClubModel;", "setFansClubModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtFansClubModel;)V", "widgetInstalled", "getWidgetInstalled", "setWidgetInstalled", "widgetAddition", "getWidgetAddition", "setWidgetAddition", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtIntimacyModel;", "intimacyModel", "Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtIntimacyModel;", "getIntimacyModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtIntimacyModel;", "setIntimacyModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/topAccount/TaoLiveKtIntimacyModel;)V", "onlineCountFormated", "getOnlineCountFormated$tao_live_crossplatform_foundation_release", "setOnlineCountFormated$tao_live_crossplatform_foundation_release", "widgetDelayShow", "getWidgetDelayShow$tao_live_crossplatform_foundation_release", "setWidgetDelayShow$tao_live_crossplatform_foundation_release", "viewCount", "getViewCount$tao_live_crossplatform_foundation_release", "setViewCount$tao_live_crossplatform_foundation_release", "oldOfficialViewCount", "getOldOfficialViewCount$tao_live_crossplatform_foundation_release", "setOldOfficialViewCount$tao_live_crossplatform_foundation_release", "isPortrait", "isPortrait$tao_live_crossplatform_foundation_release", "setPortrait$tao_live_crossplatform_foundation_release", "showWidgetTip", "contributionEnabled", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", smh.switchModel, "Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", "getSwitchModel", "()Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", "setSwitchModel", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;)V", "detailModel", "Ltb/czs;", "getShowSubscribe", "showSubscribe", "getCanShowWidgetIcon", "canShowWidgetIcon", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtAccountViewModel implements ITaoLiveKtAccountViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean contributionEnabled;
    private czs detailModel;
    private boolean enableHideWatchNums;
    private TaoLiveKtFansClubModel fansClubModel;
    private TaoLiveKtIntimacyModel intimacyModel;
    private boolean isFollowed;
    private boolean isTopFavored;
    private long oldOfficialViewCount;
    private long onlineCount;
    private Map<String, ? extends Object> originData;
    private boolean showWidgetTip;
    private TaoLiveKtSubscribeModel subscribeModel;
    private TaoLiveKtSwitchModel switchModel;
    private long viewCount;
    private boolean widgetAddition;
    private boolean widgetDelayShow;
    private boolean widgetInstalled;
    private String avatarUrl = "";
    private String avatarAtmosphereUrl = "";
    private String accountName = "";
    private String vIconUrl = "";
    private String topFavoredUrl = "https://gw.alicdn.com/imgextra/i1/O1CN012lbhFk1ZOmUqLCsmn_!!6000000003185-2-tps-200-112.png";
    private String onlineCountFormated = "";
    private boolean isPortrait = true;

    static {
        t2o.a(1010827383);
        t2o.a(1003487358);
    }

    private final TaoLiveKtAccountFollowType fetchDianTaoFollowType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAccountFollowType) ipChange.ipc$dispatch("db2e2957", new Object[]{this});
        }
        TaoLiveKtAccountFollowType taoLiveKtAccountFollowType = TaoLiveKtAccountFollowType.UnFavor;
        if (!this.isPortrait) {
            return taoLiveKtAccountFollowType;
        }
        if (getIntimacyModel() != null && eqz.INSTANCE.a(getIntimacyModel(), this.detailModel)) {
            return TaoLiveKtAccountFollowType.IntimacyWithUnFavor;
        }
        if (getFansClubModel() != null) {
            return TaoLiveKtAccountFollowType.JoinedFansClubWithUnFavor;
        }
        return taoLiveKtAccountFollowType;
    }

    private final TaoLiveKtAccountFollowType fetchFollowedFollowType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAccountFollowType) ipChange.ipc$dispatch("207fe6a3", new Object[]{this});
        }
        TaoLiveKtAccountFollowType taoLiveKtAccountFollowType = TaoLiveKtAccountFollowType.None;
        if (getCanShowWidgetIcon()) {
            return TaoLiveKtAccountFollowType.WidgetSubscribed;
        }
        if (zys.INSTANCE.b()) {
            return fetchDianTaoFollowType();
        }
        if (!this.isPortrait) {
            return taoLiveKtAccountFollowType;
        }
        if (getIntimacyModel() != null && eqz.INSTANCE.a(getIntimacyModel(), this.detailModel)) {
            return TaoLiveKtAccountFollowType.Intimacy;
        }
        if (getFansClubModel() != null) {
            return TaoLiveKtAccountFollowType.JoinedFansClub;
        }
        return taoLiveKtAccountFollowType;
    }

    private final TaoLiveKtAccountFollowType fetchTopFavoredFollowType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAccountFollowType) ipChange.ipc$dispatch("986829eb", new Object[]{this});
        }
        TaoLiveKtAccountFollowType taoLiveKtAccountFollowType = TaoLiveKtAccountFollowType.None;
        if (!this.isPortrait) {
            return taoLiveKtAccountFollowType;
        }
        if (getIntimacyModel() != null && eqz.INSTANCE.a(getIntimacyModel(), this.detailModel)) {
            return TaoLiveKtAccountFollowType.Intimacy;
        }
        if (getFansClubModel() != null) {
            return TaoLiveKtAccountFollowType.JoinedFansClub;
        }
        return taoLiveKtAccountFollowType;
    }

    private final boolean getCanShowWidgetIcon() {
        boolean z;
        czs czsVar;
        czs czsVar2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("934f97f", new Object[]{this})).booleanValue();
        }
        if ((!getWidgetInstalled() || !getWidgetAddition()) && !this.contributionEnabled && this.showWidgetTip && (czsVar = this.detailModel) != null && !czsVar.C() && (czsVar2 = this.detailModel) != null && !czsVar2.z() && !zys.INSTANCE.b()) {
            z = true;
        } else {
            z = false;
        }
        if (!eqz.INSTANCE.a(getIntimacyModel(), this.detailModel)) {
            return z;
        }
        if (this.widgetDelayShow && z) {
            z2 = true;
        }
        return z2;
    }

    private final boolean getShowSubscribe() {
        TaoLiveKtSubscribeDataSourceModel dataSource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4420c22", new Object[]{this})).booleanValue();
        }
        TaoLiveKtSubscribeModel subscribeModel = getSubscribeModel();
        if (subscribeModel == null || (dataSource = subscribeModel.getDataSource()) == null || !dataSource.getShowPanel() || !this.isPortrait) {
            return false;
        }
        return true;
    }

    private final String onlineLimitNumberFormat(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6636f0b", new Object[]{this, new Long(j)});
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j >= 10000000) {
            return "1000万+";
        }
        double rint = Math.rint(j / 1000.0d);
        StringBuilder sb = new StringBuilder();
        sb.append(rint / 10.0d);
        sb.append((char) 19975);
        return sb.toString();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public TaoLiveKtAccountFollowType fetchAccountFollowType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAccountFollowType) ipChange.ipc$dispatch("864d0da", new Object[]{this});
        }
        TaoLiveKtAccountFollowType taoLiveKtAccountFollowType = TaoLiveKtAccountFollowType.UnFollow;
        if (getShowSubscribe()) {
            return TaoLiveKtAccountFollowType.Unsubscribed;
        }
        if (isTopFavored()) {
            return fetchTopFavoredFollowType();
        }
        if (isFollowed()) {
            return fetchFollowedFollowType();
        }
        return taoLiveKtAccountFollowType;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public String fetchFollowButtonText() {
        TaoLiveKtSubscribeModel subscribeModel;
        TaoLiveKtSubscribeDataSourceModel dataSource;
        String buttonText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e1cc84f", new Object[]{this});
        }
        if (!getShowSubscribe() || getSubscribeModel() == null || (subscribeModel = getSubscribeModel()) == null || (dataSource = subscribeModel.getDataSource()) == null || (buttonText = dataSource.getButtonText()) == null) {
            return "";
        }
        return buttonText;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public HashMap<String, String> fetchOfficialTrackParams() {
        String str;
        String str2;
        String str3;
        String str4;
        KMPJsonObject q;
        String string;
        KMPJsonObject q2;
        KMPJsonObject q3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("91fc4ed6", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        czs czsVar = this.detailModel;
        String str5 = "";
        if (czsVar == null || (str = czsVar.m()) == null) {
            str = str5;
        }
        hashMap.put("feed_id", str);
        czs czsVar2 = this.detailModel;
        if (czsVar2 == null || (str2 = czsVar2.a()) == null) {
            str2 = str5;
        }
        hashMap.put(z9u.KEY_ACCOUNT_ID, str2);
        czs czsVar3 = this.detailModel;
        if (czsVar3 == null || (q3 = czsVar3.q()) == null || (str3 = q3.getString("officialLiveId")) == null) {
            str3 = str5;
        }
        hashMap.put("officialLiveId", str3);
        czs czsVar4 = this.detailModel;
        if (czsVar4 == null || (q2 = czsVar4.q()) == null || (str4 = q2.getString("accountId")) == null) {
            str4 = str5;
        }
        hashMap.put("officialAccountId", str4);
        czs czsVar5 = this.detailModel;
        if (!(czsVar5 == null || (q = czsVar5.q()) == null || (string = q.getString("officialLive")) == null)) {
            str5 = string;
        }
        hashMap.put("officialLive", str5);
        hashMap.put("type", "accountArea");
        return hashMap;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("680b717", new Object[]{this}) : this.accountName;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public String getAvatarAtmosphereUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d991bcdb", new Object[]{this});
        }
        return this.avatarAtmosphereUrl;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public String getAvatarUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4164059", new Object[]{this});
        }
        return this.avatarUrl;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public boolean getEnableHideWatchNums() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca1bdc0c", new Object[]{this})).booleanValue();
        }
        return this.enableHideWatchNums;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public TaoLiveKtFansClubModel getFansClubModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtFansClubModel) ipChange.ipc$dispatch("9f1680fe", new Object[]{this});
        }
        return this.fansClubModel;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public TaoLiveKtIntimacyModel getIntimacyModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtIntimacyModel) ipChange.ipc$dispatch("6aa3cb9a", new Object[]{this});
        }
        return this.intimacyModel;
    }

    public final long getOldOfficialViewCount$tao_live_crossplatform_foundation_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5acad542", new Object[]{this})).longValue();
        }
        return this.oldOfficialViewCount;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public long getOnlineCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2255ec1", new Object[]{this})).longValue();
        }
        return this.onlineCount;
    }

    public final String getOnlineCountFormated$tao_live_crossplatform_foundation_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a739a4e4", new Object[]{this});
        }
        return this.onlineCountFormated;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public TaoLiveKtSubscribeModel getSubscribeModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSubscribeModel) ipChange.ipc$dispatch("67f1aabe", new Object[]{this});
        }
        return this.subscribeModel;
    }

    public final TaoLiveKtSwitchModel getSwitchModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("e33cc350", new Object[]{this});
        }
        return this.switchModel;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public String getTopFavoredUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14504748", new Object[]{this});
        }
        return this.topFavoredUrl;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public String getVIconUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8968a63", new Object[]{this});
        }
        return this.vIconUrl;
    }

    public final long getViewCount$tao_live_crossplatform_foundation_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bd605a8", new Object[]{this})).longValue();
        }
        return this.viewCount;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public boolean getWidgetAddition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df312be1", new Object[]{this})).booleanValue();
        }
        return this.widgetAddition;
    }

    public final boolean getWidgetDelayShow$tao_live_crossplatform_foundation_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1fc428a", new Object[]{this})).booleanValue();
        }
        return this.widgetDelayShow;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public boolean getWidgetInstalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c07efeb", new Object[]{this})).booleanValue();
        }
        return this.widgetInstalled;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public boolean isFollowed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62030ee5", new Object[]{this})).booleanValue();
        }
        return this.isFollowed;
    }

    public final boolean isPortrait$tao_live_crossplatform_foundation_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f38b4429", new Object[]{this})).booleanValue();
        }
        return this.isPortrait;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public boolean isTopFavored() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0b3f89d", new Object[]{this})).booleanValue();
        }
        return this.isTopFavored;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setAccountName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14d5aa7", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.accountName = str;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setAvatarAtmosphereUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207b5963", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.avatarAtmosphereUrl = str;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setAvatarUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef86a5", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.avatarUrl = str;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setEnableHideWatchNums(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292d20d8", new Object[]{this, new Boolean(z)});
        } else {
            this.enableHideWatchNums = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setFansClubModel(TaoLiveKtFansClubModel taoLiveKtFansClubModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8dd24", new Object[]{this, taoLiveKtFansClubModel});
        } else {
            this.fansClubModel = taoLiveKtFansClubModel;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setFollowed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad564bdb", new Object[]{this, new Boolean(z)});
        } else {
            this.isFollowed = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setIntimacyModel(TaoLiveKtIntimacyModel taoLiveKtIntimacyModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1690f764", new Object[]{this, taoLiveKtIntimacyModel});
        } else {
            this.intimacyModel = taoLiveKtIntimacyModel;
        }
    }

    public final void setOldOfficialViewCount$tao_live_crossplatform_foundation_release(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a914d2aa", new Object[]{this, new Long(j)});
        } else {
            this.oldOfficialViewCount = j;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setOnlineCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168386a3", new Object[]{this, new Long(j)});
        } else {
            this.onlineCount = j;
        }
    }

    public final void setOnlineCountFormated$tao_live_crossplatform_foundation_release(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284aa17a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.onlineCountFormated = str;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public void setOriginData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371348ec", new Object[]{this, map});
        } else {
            this.originData = map;
        }
    }

    public final void setPortrait$tao_live_crossplatform_foundation_release(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37458517", new Object[]{this, new Boolean(z)});
        } else {
            this.isPortrait = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setSubscribeModel(TaoLiveKtSubscribeModel taoLiveKtSubscribeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93bccca", new Object[]{this, taoLiveKtSubscribeModel});
        } else {
            this.subscribeModel = taoLiveKtSubscribeModel;
        }
    }

    public final void setSwitchModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bec0de0", new Object[]{this, taoLiveKtSwitchModel});
        } else {
            this.switchModel = taoLiveKtSwitchModel;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setTopFavored(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523ec723", new Object[]{this, new Boolean(z)});
        } else {
            this.isTopFavored = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setTopFavoredUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa588396", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.topFavoredUrl = str;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setVIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5181c73", new Object[]{this, str});
        } else {
            this.vIconUrl = str;
        }
    }

    public final void setViewCount$tao_live_crossplatform_foundation_release(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2770c09c", new Object[]{this, new Long(j)});
        } else {
            this.viewCount = j;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setWidgetAddition(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5539c20b", new Object[]{this, new Boolean(z)});
        } else {
            this.widgetAddition = z;
        }
    }

    public final void setWidgetDelayShow$tao_live_crossplatform_foundation_release(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4286611a", new Object[]{this, new Boolean(z)});
        } else {
            this.widgetDelayShow = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public void setWidgetInstalled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f49eed9", new Object[]{this, new Boolean(z)});
        } else {
            this.widgetInstalled = z;
        }
    }

    private final String generateWatchNumText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9e1b880", new Object[]{this});
        }
        if (this.onlineCountFormated.length() > 0) {
            return this.onlineCountFormated;
        }
        String onlineLimitNumberFormat = onlineLimitNumberFormat(getOnlineCount());
        czs czsVar = this.detailModel;
        if (czsVar == null || !czsVar.A()) {
            return onlineLimitNumberFormat + "观看";
        }
        return "今日观看" + onlineLimitNumberFormat;
    }

    private final String getAccountName(KMPJsonObject kMPJsonObject) {
        String string;
        String string2;
        Collection<Object> values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba2fc099", new Object[]{this, kMPJsonObject});
        }
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (e3t.INSTANCE.u()) {
            TaoLiveKtSwitchModel taoLiveKtSwitchModel = this.switchModel;
            if ((taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getWhiteUserDataMap() : null) != null) {
                TaoLiveKtSwitchModel taoLiveKtSwitchModel2 = this.switchModel;
                Map<String, Object> whiteUserDataMap = taoLiveKtSwitchModel2 != null ? taoLiveKtSwitchModel2.getWhiteUserDataMap() : null;
                if (!(whiteUserDataMap == null || (values = whiteUserDataMap.values()) == null)) {
                    for (Object obj : values) {
                        String str2 = obj instanceof String ? (String) obj : null;
                        if (str2 == null) {
                            str2 = str;
                        }
                        sb.append(str2);
                    }
                }
                if (!(kMPJsonObject == null || (string2 = kMPJsonObject.getString("accountName")) == null)) {
                    str = string2;
                }
                sb.append(str);
                String sb2 = sb.toString();
                ckf.f(sb2, "toString(...)");
                return sb2;
            }
        }
        return (kMPJsonObject == null || (string = kMPJsonObject.getString("accountName")) == null) ? str : string;
    }

    private final void mkAccountViewModelForOfficialMain() {
        String str;
        String str2;
        Boolean bool;
        Long l;
        Long l2;
        String string;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9257b8df", new Object[]{this});
            return;
        }
        czs czsVar = this.detailModel;
        String str3 = null;
        KMPJsonObject q = czsVar != null ? czsVar.q() : null;
        String str4 = "";
        if (q == null || (str = q.getString("officialHeadImg")) == null) {
            str = str4;
        }
        setAvatarUrl(str);
        setAvatarAtmosphereUrl(str4);
        if (q == null || (str2 = q.getString("accountName")) == null) {
            str2 = str4;
        }
        setAccountName(str2);
        KMPJsonArray jsonArray = q != null ? q.getJsonArray("vicons") : null;
        if (tvr.c(jsonArray) || (jsonArray != null && jsonArray.size() == 0)) {
            str3 = str4;
        } else if (jsonArray != null) {
            str3 = jsonArray.getString(0);
        }
        setVIconUrl(str3);
        if (!(q == null || (string = q.getString("viewCountFormat")) == null)) {
            str4 = string;
        }
        this.onlineCountFormated = str4;
        long j = 0;
        setOnlineCount((q == null || (l2 = q.getLong("pvCount")) == null) ? 0L : l2.longValue());
        if (!(q == null || (l = q.getLong("pvCount")) == null)) {
            j = l.longValue();
        }
        this.viewCount = j;
        if (!(q == null || (bool = q.getBoolean("follow")) == null)) {
            z = bool.booleanValue();
        }
        setFollowed(z);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public String fetchInfoIconUrl() {
        czs czsVar;
        KMPJsonObject q;
        String string;
        TaoLiveKtSubscribeDataSourceModel dataSource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad6da52b", new Object[]{this});
        }
        if (!getShowSubscribe() || getSubscribeModel() == null) {
            czs czsVar2 = this.detailModel;
            if (czsVar2 == null || !czsVar2.z() || (czsVar = this.detailModel) == null || (q = czsVar.q()) == null || (string = q.getString("officialLiveSquareIcon")) == null) {
                return "";
            }
        } else {
            TaoLiveKtSubscribeModel subscribeModel = getSubscribeModel();
            if (subscribeModel == null || (dataSource = subscribeModel.getDataSource()) == null || (string = dataSource.getIcon()) == null) {
                return "";
            }
        }
        return string;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel
    public String fetchInfoText() {
        KMPJsonObject q;
        String string;
        TaoLiveKtSubscribeDataSourceModel dataSource;
        String subTitle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3788ae44", new Object[]{this});
        }
        if (getShowSubscribe() && getSubscribeModel() != null) {
            TaoLiveKtSubscribeModel subscribeModel = getSubscribeModel();
            return (subscribeModel == null || (dataSource = subscribeModel.getDataSource()) == null || (subTitle = dataSource.getSubTitle()) == null) ? "" : subTitle;
        } else if (isFollowed() && getCanShowWidgetIcon() && eqz.INSTANCE.a(getIntimacyModel(), this.detailModel)) {
            return "添加为桌面主播";
        } else {
            czs czsVar = this.detailModel;
            if (czsVar == null || !czsVar.z()) {
                return generateWatchNumText();
            }
            czs czsVar2 = this.detailModel;
            return (czsVar2 == null || (q = czsVar2.q()) == null || (string = q.getString("activityName")) == null) ? "" : string;
        }
    }

    public final void mkAccountViewModel$tao_live_crossplatform_foundation_release(czs czsVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Long l;
        Long l2;
        String str5;
        Long l3;
        Long l4;
        Boolean bool;
        Boolean bool2;
        KMPJsonObject jsonObject;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Long l5;
        Boolean bool6;
        KMPJsonObject jsonObject2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ecf7b5", new Object[]{this, czsVar});
            return;
        }
        this.detailModel = czsVar;
        Serializable serializable = null;
        KMPJsonObject c = czsVar != null ? czsVar.c() : null;
        KMPJsonObject s = czsVar != null ? czsVar.s() : null;
        if (c == null || (str = c.getString("headImg")) == null) {
            str = "";
        }
        setAvatarUrl(str);
        if (c == null || (jsonObject2 = c.getJsonObject("atmosphere")) == null || (str2 = jsonObject2.getString("headIcon")) == null) {
            str2 = "";
        }
        setAvatarAtmosphereUrl(str2);
        setAccountName(getAccountName(c));
        KMPJsonArray jsonArray = c != null ? c.getJsonArray("vicons") : null;
        if (tvr.c(jsonArray) || (jsonArray != null && jsonArray.size() == 0)) {
            str3 = "";
        } else {
            str3 = jsonArray != null ? jsonArray.getString(0) : null;
        }
        setVIconUrl(str3);
        setEnableHideWatchNums((s == null || (bool6 = s.getBoolean("enableHideWatchNums")) == null) ? false : bool6.booleanValue());
        long j = 0;
        setOnlineCount((s == null || (l5 = s.getLong("viewCount")) == null) ? 0L : l5.longValue());
        KMPJsonObject jsonObject3 = c != null ? c.getJsonObject("widgetTip") : null;
        setWidgetAddition((jsonObject3 == null || (bool5 = jsonObject3.getBoolean("widgetAddition")) == null) ? false : bool5.booleanValue());
        this.showWidgetTip = (jsonObject3 == null || (bool4 = jsonObject3.getBoolean("showWidgetTip")) == null) ? false : bool4.booleanValue();
        this.contributionEnabled = (s == null || (jsonObject = s.getJsonObject("admireInfo")) == null || (bool3 = jsonObject.getBoolean("contributionEnabled")) == null) ? false : bool3.booleanValue();
        setFollowed((c == null || (bool2 = c.getBoolean("follow")) == null) ? false : bool2.booleanValue());
        if (!(c == null || (bool = c.getBoolean("topFollow")) == null)) {
            z = bool.booleanValue();
        }
        setTopFavored(z);
        czs czsVar2 = this.detailModel;
        if (czsVar2 != null && czsVar2.z()) {
            mkAccountViewModelForOfficialMain();
        } else if (czsVar == null || !czsVar.A()) {
            this.viewCount = (s == null || (l2 = s.getLong("viewCount")) == null) ? 0L : l2.longValue();
            if (!(s == null || (l = s.getLong("viewCount")) == null)) {
                j = l.longValue();
            }
            setOnlineCount(j);
            if (s == null || (str4 = s.getString("viewCountFormat")) == null) {
                str4 = "";
            }
            this.onlineCountFormated = str4;
        } else {
            this.oldOfficialViewCount = (s == null || (l4 = s.getLong("taolivePv")) == null) ? 0L : l4.longValue();
            if (!(s == null || (l3 = s.getLong("taolivePv")) == null)) {
                j = l3.longValue();
            }
            setOnlineCount(j);
            if (s == null || (str5 = s.getString("taolivePvFormat")) == null) {
                str5 = "";
            }
            this.onlineCountFormated = str5;
        }
        KMPJsonObject jsonObject4 = s != null ? s.getJsonObject("intimacyData") : null;
        l1t l1tVar = l1t.INSTANCE;
        if (jsonObject4 != null && !jsonObject4.isEmpty()) {
            try {
                serializable = KMPJSONUtils_androidKt.decodeFromJsonObject(a.Companion, jsonObject4, dun.b(TaoLiveKtIntimacyModel.class));
            } catch (Exception e) {
                pus pusVar = pus.INSTANCE;
                String valueOf = String.valueOf(((ns3) dun.b(l1tVar.getClass())).getSimpleName());
                pusVar.f(valueOf, "", "modelFromKMPJsonObject === " + e.getMessage() + ", data === " + jsonObject4);
            }
        }
        setIntimacyModel((TaoLiveKtIntimacyModel) serializable);
    }
}
