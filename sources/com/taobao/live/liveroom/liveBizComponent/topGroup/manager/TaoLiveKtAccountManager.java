package com.taobao.live.liveroom.liveBizComponent.topGroup.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.weex_uikit.widget.video.c;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtFansClubModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtIntimacyModel;
import com.taobao.kmp.live.liveBizComponent.model.topAccount.TaoLiveKtSubscribeModel;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.kmp.live.liveBizComponent.service.base.TaoLiveKtMsgSubType;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountViewModel;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.TaoLiveKtAccountActionType;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.TaoLiveKtAccountFollowType;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.live.liveroom.liveBizComponent.topGroup.manager.TaoLiveKtAccountManager;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.cxs;
import tb.czs;
import tb.dg6;
import tb.e3t;
import tb.eqz;
import tb.exs;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010(\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u00072)\u0010'\u001a%\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\n\u0018\u00010!j\u0004\u0018\u0001`&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b,\u0010\u001fJ\u0019\u0010.\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J/\u00100\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b0\u0010\u0010J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010<\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u00109R$\u0010>\u001a\u0004\u0018\u00010=8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CRG\u0010G\u001a'\u0012\u0015\u0012\u0013\u0018\u00010D¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020\n\u0018\u00010!j\u0004\u0018\u0001`F8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010O\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtAccountManager;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountManager;", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;", "<init>", "()V", "", "", "", "data", "Ltb/xhv;", "handleRefreshIntimacy", "(Ljava/util/Map;)V", "", "subType", "handleWatchNumText", "(JLjava/util/Map;)V", "handleRefreshFansClub", "", c.ATTR_DELAY_TIME, "delaySubscribeRequest", "(I)V", "handleRefreshSubscribe", "startSubscribeHideCountdown", "triggerSubscribeButtonHide", "delayShowWidget", "handleWidgetShow", "handleWidgetHide", "Ltb/czs;", "model", "trackOfficialShow", "(Ltb/czs;)V", "actionTypeName", "Lkotlin/Function1;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtAccountActionType;", "Lkotlin/ParameterName;", "name", "actionType", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveAccountActionCallback;", "callback", "buttonClicked", "(Ljava/lang/String;Ltb/g1a;)V", "getName", "()Ljava/lang/String;", "updateLiveDetail", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", "updateUpDownSwitchModel", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;)V", "didRevLivePowerMsg", "", "isPortrait", "onScreenOrientationChanged", "(Z)V", "tag", "handleEvent", "(Ljava/lang/String;)V", "SUBSCRIBE_REQUEST_DELAY_TAG", "Ljava/lang/String;", "SUBSCRIBE_BUTTON_HIDE_TAG", "SHOW_WIDGET_TAG", "HIDE_WIDGET_TAG", "Lcom/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtAccountViewModel;", "accountViewModel", "Lcom/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtAccountViewModel;", "getAccountViewModel", "()Lcom/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtAccountViewModel;", "setAccountViewModel", "(Lcom/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtAccountViewModel;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountViewModel;", "viewModel", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveAccountUpdateCallback;", "accountViewModelUpdated", "Ltb/g1a;", "getAccountViewModelUpdated", "()Ltb/g1a;", "setAccountViewModelUpdated", "(Ltb/g1a;)V", "getHasFansClub", "()Z", "hasFansClub", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtAccountManager extends TaoLiveKtComponent implements ITaoLiveKtAccountManager, ITaoLiveKtGlobalTimerHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private g1a<? super ITaoLiveKtAccountViewModel, xhv> accountViewModelUpdated;
    private final String SUBSCRIBE_REQUEST_DELAY_TAG = "subscribeRequestDelayTag";
    private final String SUBSCRIBE_BUTTON_HIDE_TAG = "subscribeButtonHideTag";
    private final String SHOW_WIDGET_TAG = "showWidgetTag";
    private final String HIDE_WIDGET_TAG = "hideWidgetTag";
    private TaoLiveKtAccountViewModel accountViewModel = new TaoLiveKtAccountViewModel();

    static {
        t2o.a(1010827382);
        t2o.a(1003487356);
        t2o.a(1003487277);
    }

    private final void delayShowWidget(int i) {
        ITaoLiveKtGlobalTimer b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77b5458", new Object[]{this, new Integer(i)});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (b = bizContext.b()) != null) {
            b.delayEvent(this, this.SHOW_WIDGET_TAG, i * 1000);
        }
    }

    private final void delaySubscribeRequest(int i) {
        ITaoLiveKtGlobalTimer b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cd16d4", new Object[]{this, new Integer(i)});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (b = bizContext.b()) != null) {
            b.delayEvent(this, this.SUBSCRIBE_REQUEST_DELAY_TAG, i * 1000);
        }
    }

    private final boolean getHasFansClub() {
        czs a2;
        KMPJsonObject s;
        KMPJsonObject jsonObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8522fba5", new Object[]{this})).booleanValue();
        }
        exs bizContext = getBizContext();
        if (bizContext == null || (a2 = bizContext.a()) == null || (s = a2.s()) == null || (jsonObject = s.getJsonObject("admireInfo")) == null) {
            return false;
        }
        return ckf.b(jsonObject.getBoolean("hasFansClub"), Boolean.TRUE);
    }

    private final void handleRefreshFansClub() {
        String str;
        czs a2;
        KMPJsonObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0ee950", new Object[]{this});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        exs bizContext = getBizContext();
        if (bizContext == null || (a2 = bizContext.a()) == null || (c = a2.c()) == null || (str = c.getString(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID)) == null) {
            str = "";
        }
        linkedHashMap.put("encodeAnchorId", str);
        cxs.INSTANCE.c(linkedHashMap, new g1a() { // from class: tb.wws
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv handleRefreshFansClub$lambda$0;
                handleRefreshFansClub$lambda$0 = TaoLiveKtAccountManager.handleRefreshFansClub$lambda$0(TaoLiveKtAccountManager.this, (TaoLiveKtFansClubModel) obj);
                return handleRefreshFansClub$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv handleRefreshFansClub$lambda$0(TaoLiveKtAccountManager taoLiveKtAccountManager, TaoLiveKtFansClubModel taoLiveKtFansClubModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f423fe3e", new Object[]{taoLiveKtAccountManager, taoLiveKtFansClubModel});
        }
        TaoLiveKtAccountViewModel accountViewModel = taoLiveKtAccountManager.getAccountViewModel();
        if (accountViewModel != null) {
            accountViewModel.setFansClubModel(taoLiveKtFansClubModel);
        }
        g1a<ITaoLiveKtAccountViewModel, xhv> accountViewModelUpdated = taoLiveKtAccountManager.getAccountViewModelUpdated();
        if (accountViewModelUpdated != null) {
            accountViewModelUpdated.invoke(taoLiveKtAccountManager.getAccountViewModel());
        }
        return xhv.INSTANCE;
    }

    private final void handleRefreshIntimacy(Map<String, ? extends Object> map) {
        String str;
        String str2;
        TaoLiveKtIntimacyModel intimacyModel;
        TaoLiveKtIntimacyModel intimacyModel2;
        TaoLiveKtIntimacyModel intimacyModel3;
        KMPJsonObject jsonObject;
        String string;
        KMPJsonObject jsonObject2;
        KMPJsonObject jsonObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644eba7", new Object[]{this, map});
        } else if (map != null) {
            if (!(map instanceof Object)) {
                map = null;
            }
            KMPJsonObject jsonObject4 = new KMPJsonObject(map).getJsonObject("data");
            String str3 = "";
            if (jsonObject4 == null || (jsonObject3 = jsonObject4.getJsonObject("intimacyLevel")) == null || (str = jsonObject3.getString("intimacyIconFavor")) == null) {
                str = str3;
            }
            if (jsonObject4 == null || (jsonObject2 = jsonObject4.getJsonObject("intimacyLevel")) == null || (str2 = jsonObject2.getString("intimacyIconNormal")) == null) {
                str2 = str3;
            }
            if (!(jsonObject4 == null || (jsonObject = jsonObject4.getJsonObject("intimacyLevel")) == null || (string = jsonObject.getString("code")) == null)) {
                str3 = string;
            }
            TaoLiveKtAccountViewModel accountViewModel = getAccountViewModel();
            if (!(accountViewModel == null || (intimacyModel3 = accountViewModel.getIntimacyModel()) == null)) {
                intimacyModel3.setIntimacyIconFavor(str);
            }
            TaoLiveKtAccountViewModel accountViewModel2 = getAccountViewModel();
            if (!(accountViewModel2 == null || (intimacyModel2 = accountViewModel2.getIntimacyModel()) == null)) {
                intimacyModel2.setIntimacyIconNormal(str2);
            }
            TaoLiveKtAccountViewModel accountViewModel3 = getAccountViewModel();
            if (!(accountViewModel3 == null || (intimacyModel = accountViewModel3.getIntimacyModel()) == null)) {
                intimacyModel.setLevelDesc(str3);
            }
            g1a<ITaoLiveKtAccountViewModel, xhv> accountViewModelUpdated = getAccountViewModelUpdated();
            if (accountViewModelUpdated != null) {
                accountViewModelUpdated.invoke(getAccountViewModel());
            }
        }
    }

    private final void handleRefreshSubscribe() {
        String str;
        czs a2;
        String i;
        czs a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b203fe", new Object[]{this});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        exs bizContext = getBizContext();
        String str2 = "";
        if (bizContext == null || (a3 = bizContext.a()) == null || (str = a3.m()) == null) {
            str = str2;
        }
        linkedHashMap.put("liveId", str);
        exs bizContext2 = getBizContext();
        if (!(bizContext2 == null || (a2 = bizContext2.a()) == null || (i = a2.i()) == null)) {
            str2 = i;
        }
        linkedHashMap.put("liveSource", str2);
        cxs.INSTANCE.e(linkedHashMap, new g1a() { // from class: tb.uws
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv handleRefreshSubscribe$lambda$1;
                handleRefreshSubscribe$lambda$1 = TaoLiveKtAccountManager.handleRefreshSubscribe$lambda$1(TaoLiveKtAccountManager.this, (TaoLiveKtSubscribeModel) obj);
                return handleRefreshSubscribe$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv handleRefreshSubscribe$lambda$1(TaoLiveKtAccountManager taoLiveKtAccountManager, TaoLiveKtSubscribeModel taoLiveKtSubscribeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("983b842b", new Object[]{taoLiveKtAccountManager, taoLiveKtSubscribeModel});
        }
        TaoLiveKtAccountViewModel accountViewModel = taoLiveKtAccountManager.getAccountViewModel();
        if (accountViewModel != null) {
            accountViewModel.setSubscribeModel(taoLiveKtSubscribeModel);
        }
        g1a<ITaoLiveKtAccountViewModel, xhv> accountViewModelUpdated = taoLiveKtAccountManager.getAccountViewModelUpdated();
        if (accountViewModelUpdated != null) {
            accountViewModelUpdated.invoke(taoLiveKtAccountManager.getAccountViewModel());
        }
        taoLiveKtAccountManager.startSubscribeHideCountdown();
        return xhv.INSTANCE;
    }

    private final void handleWidgetHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47007f75", new Object[]{this});
            return;
        }
        TaoLiveKtAccountViewModel accountViewModel = getAccountViewModel();
        if (accountViewModel != null) {
            accountViewModel.setWidgetDelayShow$tao_live_crossplatform_foundation_release(false);
        }
        g1a<ITaoLiveKtAccountViewModel, xhv> accountViewModelUpdated = getAccountViewModelUpdated();
        if (accountViewModelUpdated != null) {
            accountViewModelUpdated.invoke(getAccountViewModel());
        }
    }

    private final void handleWidgetShow() {
        TaoLiveKtSubscribeModel taoLiveKtSubscribeModel;
        ITaoLiveKtGlobalTimer b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8a27b0", new Object[]{this});
            return;
        }
        TaoLiveKtAccountViewModel accountViewModel = getAccountViewModel();
        if (accountViewModel != null) {
            taoLiveKtSubscribeModel = accountViewModel.getSubscribeModel();
        } else {
            taoLiveKtSubscribeModel = null;
        }
        if (taoLiveKtSubscribeModel == null) {
            TaoLiveKtAccountViewModel accountViewModel2 = getAccountViewModel();
            if (accountViewModel2 != null) {
                accountViewModel2.setWidgetDelayShow$tao_live_crossplatform_foundation_release(true);
            }
            g1a<ITaoLiveKtAccountViewModel, xhv> accountViewModelUpdated = getAccountViewModelUpdated();
            if (accountViewModelUpdated != null) {
                accountViewModelUpdated.invoke(getAccountViewModel());
            }
            exs bizContext = getBizContext();
            if (bizContext != null && (b = bizContext.b()) != null) {
                b.delayEvent(this, this.HIDE_WIDGET_TAG, 15000L);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtAccountManager taoLiveKtAccountManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2022875330) {
            super.onScreenOrientationChanged(((Boolean) objArr[0]).booleanValue());
            return null;
        } else if (hashCode == 567228013) {
            super.updateLiveDetail((czs) objArr[0]);
            return null;
        } else if (hashCode == 1437299332) {
            super.updateUpDownSwitchModel((TaoLiveKtSwitchModel) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtAccountManager");
        }
    }

    private final void startSubscribeHideCountdown() {
        ITaoLiveKtGlobalTimer b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182f1ee", new Object[]{this});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (b = bizContext.b()) != null) {
            b.delayEvent(this, this.SUBSCRIBE_BUTTON_HIDE_TAG, 15000L);
        }
    }

    private final void triggerSubscribeButtonHide() {
        TaoLiveKtIntimacyModel taoLiveKtIntimacyModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723a5d2d", new Object[]{this});
            return;
        }
        TaoLiveKtAccountViewModel accountViewModel = getAccountViewModel();
        czs czsVar = null;
        if (accountViewModel != null) {
            accountViewModel.setSubscribeModel(null);
        }
        g1a<ITaoLiveKtAccountViewModel, xhv> accountViewModelUpdated = getAccountViewModelUpdated();
        if (accountViewModelUpdated != null) {
            accountViewModelUpdated.invoke(getAccountViewModel());
        }
        eqz eqzVar = eqz.INSTANCE;
        TaoLiveKtAccountViewModel accountViewModel2 = getAccountViewModel();
        if (accountViewModel2 != null) {
            taoLiveKtIntimacyModel = accountViewModel2.getIntimacyModel();
        } else {
            taoLiveKtIntimacyModel = null;
        }
        exs bizContext = getBizContext();
        if (bizContext != null) {
            czsVar = bizContext.a();
        }
        if (eqzVar.a(taoLiveKtIntimacyModel, czsVar)) {
            delayShowWidget(10);
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountManager
    public void buttonClicked(String str, g1a<? super TaoLiveKtAccountActionType, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949f072c", new Object[]{this, str, g1aVar});
        } else if (str != null && ckf.b(str, "AddFansClub")) {
            handleRefreshFansClub();
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void didRevLivePowerMsg(long j, Map<String, ? extends Object> map) {
        TaoLiveKtAccountFollowType taoLiveKtAccountFollowType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d149c7d4", new Object[]{this, new Long(j), map});
        } else if (j == TaoLiveKtMsgSubType.RoomWatchNumPv.getValue() || j == TaoLiveKtMsgSubType.JoinFansNotify.getValue() || j == TaoLiveKtMsgSubType.OldOfficialRoomWatchNumPv.getValue()) {
            handleWatchNumText(j, map);
        } else if (j == TaoLiveKtMsgSubType.UpdateFansClubState.getValue()) {
            TaoLiveKtAccountViewModel accountViewModel = getAccountViewModel();
            if (accountViewModel != null) {
                taoLiveKtAccountFollowType = accountViewModel.fetchAccountFollowType();
            } else {
                taoLiveKtAccountFollowType = null;
            }
            if (taoLiveKtAccountFollowType == TaoLiveKtAccountFollowType.JoinedFansClub) {
                handleRefreshFansClub();
            }
        } else if (j == TaoLiveKtMsgSubType.ActivityMessage.getValue()) {
            handleRefreshIntimacy(map);
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountManager
    public g1a<ITaoLiveKtAccountViewModel, xhv> getAccountViewModelUpdated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("19cc5187", new Object[]{this});
        }
        return this.accountViewModelUpdated;
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ITaoLiveKtAccountManager";
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler
    public void handleEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba63e63", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tag");
        if (ckf.b(str, this.SUBSCRIBE_REQUEST_DELAY_TAG)) {
            handleRefreshSubscribe();
        } else if (ckf.b(str, this.SUBSCRIBE_BUTTON_HIDE_TAG)) {
            triggerSubscribeButtonHide();
        } else if (ckf.b(str, this.SHOW_WIDGET_TAG)) {
            handleWidgetShow();
        } else if (ckf.b(str, this.HIDE_WIDGET_TAG)) {
            handleWidgetHide();
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void onScreenOrientationChanged(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876d5f3e", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onScreenOrientationChanged(z);
        TaoLiveKtAccountViewModel accountViewModel = getAccountViewModel();
        if (accountViewModel != null) {
            exs bizContext = getBizContext();
            if (bizContext == null || !bizContext.e()) {
                z2 = false;
            }
            accountViewModel.setPortrait$tao_live_crossplatform_foundation_release(z2);
        }
        g1a<ITaoLiveKtAccountViewModel, xhv> accountViewModelUpdated = getAccountViewModelUpdated();
        if (accountViewModelUpdated != null) {
            accountViewModelUpdated.invoke(getAccountViewModel());
        }
    }

    public void setAccountViewModel(TaoLiveKtAccountViewModel taoLiveKtAccountViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2541627", new Object[]{this, taoLiveKtAccountViewModel});
        } else {
            this.accountViewModel = taoLiveKtAccountViewModel;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountManager
    public void setAccountViewModelUpdated(g1a<? super ITaoLiveKtAccountViewModel, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c814bb6f", new Object[]{this, g1aVar});
        } else {
            this.accountViewModelUpdated = g1aVar;
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveDetail(czs czsVar) {
        TaoLiveKtIntimacyModel taoLiveKtIntimacyModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cf366d", new Object[]{this, czsVar});
            return;
        }
        super.updateLiveDetail(czsVar);
        TaoLiveKtAccountViewModel accountViewModel = getAccountViewModel();
        if (accountViewModel != null) {
            accountViewModel.mkAccountViewModel$tao_live_crossplatform_foundation_release(czsVar);
        }
        if (getHasFansClub()) {
            handleRefreshFansClub();
        }
        e3t e3tVar = e3t.INSTANCE;
        delaySubscribeRequest(e3tVar.B());
        eqz eqzVar = eqz.INSTANCE;
        TaoLiveKtAccountViewModel accountViewModel2 = getAccountViewModel();
        czs czsVar2 = null;
        if (accountViewModel2 != null) {
            taoLiveKtIntimacyModel = accountViewModel2.getIntimacyModel();
        } else {
            taoLiveKtIntimacyModel = null;
        }
        exs bizContext = getBizContext();
        if (bizContext != null) {
            czsVar2 = bizContext.a();
        }
        if (eqzVar.a(taoLiveKtIntimacyModel, czsVar2)) {
            delayShowWidget(e3tVar.I());
        }
        trackOfficialShow(czsVar);
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateUpDownSwitchModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ab7284", new Object[]{this, taoLiveKtSwitchModel});
            return;
        }
        super.updateUpDownSwitchModel(taoLiveKtSwitchModel);
        TaoLiveKtAccountViewModel accountViewModel = getAccountViewModel();
        if (accountViewModel != null) {
            accountViewModel.setSwitchModel(taoLiveKtSwitchModel);
        }
    }

    private final void trackOfficialShow(czs czsVar) {
        String str;
        String str2;
        ITaoLiveKtUtManager d;
        ITaoLiveKtUtManager d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7733119a", new Object[]{this, czsVar});
        } else if (czsVar != null && czsVar.y()) {
            if (czsVar.z()) {
                str = "official_icon";
            } else {
                str = "former_icon";
            }
            exs bizContext = getBizContext();
            HashMap<String, String> hashMap = null;
            if (!(bizContext == null || (d2 = bizContext.d()) == null)) {
                TaoLiveKtAccountViewModel accountViewModel = getAccountViewModel();
                ITaoLiveKtUtManager.a.a(d2, str, null, accountViewModel != null ? accountViewModel.fetchOfficialTrackParams() : null, 2, null);
            }
            TaoLiveKtAccountViewModel accountViewModel2 = getAccountViewModel();
            if (accountViewModel2 != null && !accountViewModel2.isFollowed()) {
                if (czsVar.z()) {
                    str2 = dg6.EVENT_OFFICIAL_FOLLOW;
                } else {
                    str2 = "former_follow";
                }
                exs bizContext2 = getBizContext();
                if (bizContext2 != null && (d = bizContext2.d()) != null) {
                    TaoLiveKtAccountViewModel accountViewModel3 = getAccountViewModel();
                    if (accountViewModel3 != null) {
                        hashMap = accountViewModel3.fetchOfficialTrackParams();
                    }
                    ITaoLiveKtUtManager.a.a(d, str2, null, hashMap, 2, null);
                }
            }
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountManager
    public TaoLiveKtAccountViewModel getAccountViewModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtAccountViewModel) ipChange.ipc$dispatch("cfcb8589", new Object[]{this}) : this.accountViewModel;
    }

    private final void handleWatchNumText(long j, Map<String, ? extends Object> map) {
        long j2;
        long j3;
        g1a<ITaoLiveKtAccountViewModel, xhv> accountViewModelUpdated;
        TaoLiveKtAccountViewModel accountViewModel;
        czs a2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad379114", new Object[]{this, new Long(j), map});
        } else if (map != null) {
            exs bizContext = getBizContext();
            boolean z2 = (bizContext == null || (a2 = bizContext.a()) == null || !a2.A()) ? false : true;
            TaoLiveKtAccountViewModel accountViewModel2 = getAccountViewModel();
            Long valueOf = accountViewModel2 != null ? Long.valueOf(accountViewModel2.getOldOfficialViewCount$tao_live_crossplatform_foundation_release()) : null;
            TaoLiveKtAccountViewModel accountViewModel3 = getAccountViewModel();
            long viewCount$tao_live_crossplatform_foundation_release = accountViewModel3 != null ? accountViewModel3.getViewCount$tao_live_crossplatform_foundation_release() : 0L;
            if (!(map instanceof Object)) {
                map = null;
            }
            KMPJsonObject kMPJsonObject = new KMPJsonObject(map);
            if (j == TaoLiveKtMsgSubType.OldOfficialRoomWatchNumPv.getValue()) {
                Long l = kMPJsonObject.getLong("pv");
                j2 = l != null ? l.longValue() : 0L;
                j3 = 0;
            } else {
                Long l2 = kMPJsonObject.getLong("pageViewCount");
                j3 = l2 != null ? l2.longValue() : 0L;
                j2 = 0;
            }
            if (z2 && j2 > 0 && (valueOf == null || valueOf.longValue() != j2)) {
                TaoLiveKtAccountViewModel accountViewModel4 = getAccountViewModel();
                if (accountViewModel4 != null) {
                    accountViewModel4.setOldOfficialViewCount$tao_live_crossplatform_foundation_release(j2);
                }
                TaoLiveKtAccountViewModel accountViewModel5 = getAccountViewModel();
                if (accountViewModel5 != null) {
                    accountViewModel5.setOnlineCount(j2);
                }
            } else if (j3 <= 0 || j3 <= viewCount$tao_live_crossplatform_foundation_release) {
                z = false;
            } else {
                TaoLiveKtAccountViewModel accountViewModel6 = getAccountViewModel();
                if (accountViewModel6 != null) {
                    accountViewModel6.setViewCount$tao_live_crossplatform_foundation_release(j3);
                }
                TaoLiveKtAccountViewModel accountViewModel7 = getAccountViewModel();
                if (accountViewModel7 != null) {
                    accountViewModel7.setOnlineCount(j3);
                }
            }
            String string = kMPJsonObject.getString("viewCountFormat");
            if (string == null) {
                string = "";
            }
            if (string.length() > 0 && (accountViewModel = getAccountViewModel()) != null) {
                accountViewModel.setOnlineCountFormated$tao_live_crossplatform_foundation_release(string);
            }
            if (z && (accountViewModelUpdated = getAccountViewModelUpdated()) != null) {
                accountViewModelUpdated.invoke(getAccountViewModel());
            }
        }
    }
}
