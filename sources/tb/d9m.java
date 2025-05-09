package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.alphavideo.AlphaVideoProxy;
import com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy;
import com.taobao.android.live.plugin.proxy.bclink.BCLinkProxy;
import com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy;
import com.taobao.android.live.plugin.proxy.bottom.BottomProxy;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.comments.CommentsProxy;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import com.taobao.android.live.plugin.proxy.debugPanel.DebugPanelProxy;
import com.taobao.android.live.plugin.proxy.debugPanel.IDebugPanelProxy;
import com.taobao.android.live.plugin.proxy.evocation.EvocationProxy;
import com.taobao.android.live.plugin.proxy.evocation.IEvocationProxy;
import com.taobao.android.live.plugin.proxy.fullscreen.FullScreenProxy;
import com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy;
import com.taobao.android.live.plugin.proxy.gift.GiftProxy;
import com.taobao.android.live.plugin.proxy.gift.IGiftProxy;
import com.taobao.android.live.plugin.proxy.good.GoodProxy;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.android.live.plugin.proxy.input.IInputProxy;
import com.taobao.android.live.plugin.proxy.input.InputProxy;
import com.taobao.android.live.plugin.proxy.jsbridgeDispatcher.IJSBridgeDispatcherProxy;
import com.taobao.android.live.plugin.proxy.jsbridgeDispatcher.JSBridgeDispatcherProxy;
import com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy;
import com.taobao.android.live.plugin.proxy.jump302.Jump302Proxy;
import com.taobao.android.live.plugin.proxy.kmp.CommentSendProxy;
import com.taobao.android.live.plugin.proxy.kmp.ICommentSendProxy;
import com.taobao.android.live.plugin.proxy.kmp.TaoLiveKtBridgeProxy;
import com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy;
import com.taobao.android.live.plugin.proxy.livehome.TaoLiveHomePageProxy;
import com.taobao.android.live.plugin.proxy.multiLink.MultiLinkProxy;
import com.taobao.android.live.plugin.proxy.multipk.IMultiPkLinkProxy;
import com.taobao.android.live.plugin.proxy.multipk.MultiPkLinkProxy;
import com.taobao.android.live.plugin.proxy.notice.INotice4Proxy;
import com.taobao.android.live.plugin.proxy.notice.INoticeProxy;
import com.taobao.android.live.plugin.proxy.notice.Notice4Proxy;
import com.taobao.android.live.plugin.proxy.notice.NoticeProxy;
import com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy;
import com.taobao.android.live.plugin.proxy.officialLive.OfficialLiveEntryProxy;
import com.taobao.android.live.plugin.proxy.panel.IPanelProxy;
import com.taobao.android.live.plugin.proxy.panel.PanelProxy;
import com.taobao.android.live.plugin.proxy.pklink.IPkLinkProxy;
import com.taobao.android.live.plugin.proxy.pklink.PkLinkProxy;
import com.taobao.android.live.plugin.proxy.projectscreen.IProjectScreenProxy;
import com.taobao.android.live.plugin.proxy.projectscreen.ProjectScreenProxy;
import com.taobao.android.live.plugin.proxy.rank.IRankProxy;
import com.taobao.android.live.plugin.proxy.rank.RankProxy;
import com.taobao.android.live.plugin.proxy.replayshifttext.IReplaySiftTextProxy;
import com.taobao.android.live.plugin.proxy.replayshifttext.ReplayShiftTextProxy;
import com.taobao.android.live.plugin.proxy.reward.IRewardProxy;
import com.taobao.android.live.plugin.proxy.reward.RewardProxy;
import com.taobao.android.live.plugin.proxy.room.BTypeRoomProxy;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.SmartLandingProxy;
import com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy;
import com.taobao.android.live.plugin.proxy.smartlayer.SmartLayerServiceProxy;
import com.taobao.android.live.plugin.proxy.taoliveactionutils.ITaoLiveActionUtilsProxy;
import com.taobao.android.live.plugin.proxy.taoliveactionutils.TaoLiveActionUtilsProxy;
import com.taobao.android.live.plugin.proxy.taolivemore.ITaoliveMoreBTypeProxy;
import com.taobao.android.live.plugin.proxy.taolivemore.TaoliveMoreBTypeProxy;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.InteractiveProxy;
import com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy;
import com.taobao.android.live.plugin.proxy.topbar.TopBarProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.android.live.plugin.proxy.universal.UniversalProxy;
import com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy;
import com.taobao.android.live.plugin.proxy.usertask.UserTaskProxy;
import com.taobao.android.live.plugin.proxy.voiceroom.IVoiceRoomProxy;
import com.taobao.android.live.plugin.proxy.voiceroom.VoiceRoomProxy;
import com.taobao.kmp.live.flexa.liveroom.ITaoLiveKtBridgeProxy;
import com.taobao.kmp.live.flexa.openArch.IOpenArchProxy;
import com.taobao.kmp.live.flexa.powermsg.IOpenArchMessageProxy;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d9m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355112);
        try {
            if (!FlexaLiveX.o().p().contains(FlexaLiveX.TAOLIVE_HOMEPAGE)) {
                FlexaLiveX.o().z(FlexaLiveX.TAOLIVE_HOMEPAGE, false, null);
                TLog.loge("TBLive", "PluginProxyManager", "TAOLIVE_HOMEPAGE has not been loaded once, load");
            } else {
                TLog.loge("TBLive", "PluginProxyManager", "TAOLIVE_HOMEPAGE has been loaded once");
            }
            if (!FlexaLiveX.o().p().contains(FlexaLiveX.ATYPE)) {
                FlexaLiveX.o().z(FlexaLiveX.ATYPE, false, null);
                TLog.loge("TBLive", "PluginProxyManager", "AType has not been loaded once, load");
            } else {
                TLog.loge("TBLive", "PluginProxyManager", "AType has been loaded once");
            }
            if (!FlexaLiveX.o().p().contains(FlexaLiveX.BTYPE)) {
                FlexaLiveX.o().z(FlexaLiveX.BTYPE, false, null);
                TLog.loge("TBLive", "PluginProxyManager", "BType has not been loaded once, load");
                return;
            }
            TLog.loge("TBLive", "PluginProxyManager", "BType has been loaded once");
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("TBLive", "PluginProxyManager", th);
        }
    }

    public static IProjectScreenProxy A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IProjectScreenProxy) ipChange.ipc$dispatch("548c04a4", new Object[0]);
        }
        return ProjectScreenProxy.getInstance();
    }

    public static IRankProxy B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRankProxy) ipChange.ipc$dispatch("96b9b8e3", new Object[0]);
        }
        return RankProxy.getInstance();
    }

    public static IReplaySiftTextProxy C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IReplaySiftTextProxy) ipChange.ipc$dispatch("c3b5b9d7", new Object[0]);
        }
        return ReplayShiftTextProxy.getInstance();
    }

    public static IRewardProxy D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRewardProxy) ipChange.ipc$dispatch("dd4164ac", new Object[0]);
        }
        return RewardProxy.getInstance();
    }

    public static ISmartLandingProxy E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLandingProxy) ipChange.ipc$dispatch("c2ecb6a9", new Object[0]);
        }
        return SmartLandingProxy.getInstance();
    }

    public static ISmartLayerServiceProxy F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartLayerServiceProxy) ipChange.ipc$dispatch("f29df79f", new Object[0]);
        }
        return SmartLayerServiceProxy.getInstance();
    }

    public static ITaoLiveActionUtilsProxy G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveActionUtilsProxy) ipChange.ipc$dispatch("beed4126", new Object[0]);
        }
        return TaoLiveActionUtilsProxy.getInstance();
    }

    public static ITaoLiveHomePageProxy H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveHomePageProxy) ipChange.ipc$dispatch("23cee73c", new Object[0]);
        }
        return TaoLiveHomePageProxy.getInstance();
    }

    public static ITaoLiveKtBridgeProxy I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtBridgeProxy) ipChange.ipc$dispatch("fa549935", new Object[0]);
        }
        return TaoLiveKtBridgeProxy.getInstance();
    }

    public static ITaoliveMoreBTypeProxy J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoliveMoreBTypeProxy) ipChange.ipc$dispatch("36717354", new Object[0]);
        }
        return TaoliveMoreBTypeProxy.getInstance();
    }

    public static ITopBarProxy K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITopBarProxy) ipChange.ipc$dispatch("90620d79", new Object[0]);
        }
        return TopBarProxy.getInstance();
    }

    public static IUniversalProxy L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUniversalProxy) ipChange.ipc$dispatch("570836aa", new Object[0]);
        }
        return UniversalProxy.getInstance();
    }

    public static IUserTaskProxy M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUserTaskProxy) ipChange.ipc$dispatch("681b180f", new Object[0]);
        }
        return UserTaskProxy.getInstance();
    }

    public static IVoiceRoomProxy N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IVoiceRoomProxy) ipChange.ipc$dispatch("7e2ef26c", new Object[0]);
        }
        return VoiceRoomProxy.getInstance();
    }

    public static IOpenArchMessageProxy O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOpenArchMessageProxy) ipChange.ipc$dispatch("c019260e", new Object[0]);
        }
        return I().getOpenArchMessageProxy();
    }

    public static IOpenArchProxy P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOpenArchProxy) ipChange.ipc$dispatch("220c832", new Object[0]);
        }
        return I().getOpenArchProxy();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4b13e4e", new Object[0]);
        } else if (I() != null) {
            I().clearBizManager();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3c110f", new Object[0]);
        } else if (I() != null) {
            I().clearSwitchRoomManager();
        }
    }

    public static IAlphaVideoProxy c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlphaVideoProxy) ipChange.ipc$dispatch("ec20f676", new Object[0]);
        }
        return AlphaVideoProxy.getInstance();
    }

    public static IBCLinkProxy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBCLinkProxy) ipChange.ipc$dispatch("31a1c950", new Object[0]);
        }
        return BCLinkProxy.getInstance();
    }

    public static IBTypeRoomProxy e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBTypeRoomProxy) ipChange.ipc$dispatch("651c7ccc", new Object[0]);
        }
        return BTypeRoomProxy.getInstance();
    }

    public static ITaoLiveKtComponentOpenService f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtComponentOpenService) ipChange.ipc$dispatch("950a88f8", new Object[0]);
        }
        if (I() != null) {
            return I().getBizManager();
        }
        return null;
    }

    public static IBottomProxy g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBottomProxy) ipChange.ipc$dispatch("9b2d80a0", new Object[0]);
        }
        return BottomProxy.getInstance();
    }

    public static ICommentSendProxy h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICommentSendProxy) ipChange.ipc$dispatch("30e81c7f", new Object[0]);
        }
        return CommentSendProxy.getInstance();
    }

    public static ICommentsProxy i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICommentsProxy) ipChange.ipc$dispatch("f018f03b", new Object[0]);
        }
        return CommentsProxy.getInstance();
    }

    public static IDebugPanelProxy j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDebugPanelProxy) ipChange.ipc$dispatch("85eaa672", new Object[0]);
        }
        return DebugPanelProxy.getInstance();
    }

    public static IEvocationProxy k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEvocationProxy) ipChange.ipc$dispatch("89678a0f", new Object[0]);
        }
        return EvocationProxy.getInstance();
    }

    public static IFullScreenProxy l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFullScreenProxy) ipChange.ipc$dispatch("b4e0f110", new Object[0]);
        }
        return FullScreenProxy.getInstance();
    }

    public static IGiftProxy m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IGiftProxy) ipChange.ipc$dispatch("42fc27ef", new Object[0]);
        }
        return GiftProxy.getInstance();
    }

    public static IGoodProxy n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IGoodProxy) ipChange.ipc$dispatch("43cb7c96", new Object[0]);
        }
        return GoodProxy.getInstance();
    }

    public static IInputProxy o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInputProxy) ipChange.ipc$dispatch("e02cd4c9", new Object[0]);
        }
        return InputProxy.getInstance();
    }

    public static IInteractiveProxy p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy) ipChange.ipc$dispatch("bf3fb5bb", new Object[0]);
        }
        return InteractiveProxy.getInstance();
    }

    public static IJSBridgeDispatcherProxy q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IJSBridgeDispatcherProxy) ipChange.ipc$dispatch("57b4162a", new Object[0]);
        }
        return JSBridgeDispatcherProxy.getInstance();
    }

    public static IJump302Proxy r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IJump302Proxy) ipChange.ipc$dispatch("237be926", new Object[0]);
        }
        return Jump302Proxy.getInstance();
    }

    public static nyd s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nyd) ipChange.ipc$dispatch("f744bf14", new Object[0]);
        }
        if (I() != null) {
            return I().getSwitchRoomManager();
        }
        return null;
    }

    public static MultiLinkProxy t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiLinkProxy) ipChange.ipc$dispatch("5c098d45", new Object[0]);
        }
        return MultiLinkProxy.getInstance();
    }

    public static IMultiPkLinkProxy u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMultiPkLinkProxy) ipChange.ipc$dispatch("128d94a7", new Object[0]);
        }
        return MultiPkLinkProxy.getInstance();
    }

    public static INotice4Proxy v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INotice4Proxy) ipChange.ipc$dispatch("3b041b8f", new Object[0]);
        }
        return Notice4Proxy.getInstance();
    }

    public static INoticeProxy w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INoticeProxy) ipChange.ipc$dispatch("9f33eee7", new Object[0]);
        }
        return NoticeProxy.getInstance();
    }

    public static IOfficialLiveEntryProxy x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOfficialLiveEntryProxy) ipChange.ipc$dispatch("fc389e30", new Object[0]);
        }
        return OfficialLiveEntryProxy.getInstance();
    }

    public static IPanelProxy y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPanelProxy) ipChange.ipc$dispatch("f3a791c3", new Object[0]);
        }
        return PanelProxy.getInstance();
    }

    public static IPkLinkProxy z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPkLinkProxy) ipChange.ipc$dispatch("982b703e", new Object[0]);
        }
        return PkLinkProxy.getInstance();
    }
}
