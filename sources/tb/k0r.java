package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.comments.CommentsProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k0r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIVEROOM_AB_GROUP = "taobaolive";
    public static final String LIVEROOM_ORANGE_GROUP = "tblive";
    public static final String TAG = "SwitchConfig";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    static {
        t2o.a(806355843);
    }

    public static final long C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bcce888", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "TBLVCommentCritDelayTime", "2000"));
    }

    public static String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15bddac7", new Object[0]);
        }
        return v2s.o().p().b("tblive", "commentReportUrl", "https://market.m.taobao.com/app/msd/buyer-aqcenter/report.html#/poplayer?reportType=COMMENT");
    }

    public static String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cccc1893", new Object[0]);
        }
        return v2s.o().p().b("tblive", "directOpenPoplayerUrl", "poplayer://202008AQtbLiveReport?openType=directly&uuid=202008AQtbLiveReport&type=webview");
    }

    public static Long G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("f76203db", new Object[0]);
        }
        return Long.valueOf(zqq.h(v2s.o().p().b("tblive", "importantEventIntervalTime", String.valueOf(((CommentsProxy) d9m.i()).getImportantMessageIntervalTime()))));
    }

    public static Long H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("12d5e1de", new Object[0]);
        }
        return Long.valueOf(zqq.h(v2s.o().p().b("tblive", "importantEventTimeoutTime", String.valueOf(((CommentsProxy) d9m.i()).getImportantMessageTimeoutTime()))));
    }

    public static int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e745888e", new Object[0])).intValue();
        }
        try {
            return zqq.j(v2s.o().p().b("tblive", "InputMaxLimitNumber", "50"));
        } catch (Exception e) {
            o3s.d(TAG, "exception:" + e.getMessage());
            return 50;
        }
    }

    public static long K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6447aab4", new Object[0])).longValue();
        }
        return zqq.j(v2s.o().p().b("tblive", "taoliveLinkCallCountDown", "15"));
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1220bc5b", new Object[0])).booleanValue();
        }
        String b = v2s.o().p().b("tblive", "LinkLiveUnsupportDevice", "");
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = b.split(";");
        if (split != null && split.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Long M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("8429a9c0", new Object[0]);
        }
        return Long.valueOf(zqq.h(v2s.o().p().b("tblive", "linkSeiTimeOutDuration", String.valueOf(20000L))));
    }

    public static String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cbb6588", new Object[0]);
        }
        return v2s.o().p().b("tblive", "liveRoomCommentInputPlaceholder", "平台提倡文明用语，请温柔发言哦～");
    }

    public static String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e109996e", new Object[0]);
        }
        return v2s.o().p().b("tblive", "screenLikePositionInfoLandscape", "254-364-73-0.25");
    }

    public static String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2029fdee", new Object[0]);
        }
        return v2s.o().p().b("tblive", "screenLikePositionInfoPortrait", "44-44-218-0.13");
    }

    public static int R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fb7ef91", new Object[0])).intValue();
        }
        return zqq.j(v2s.o().p().b("tblive", "superedFansMinLevel", "19"));
    }

    public static boolean T(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87f05293", new Object[]{str, str2, str3})).booleanValue();
        }
        return zqq.c(v2s.o().c().b(str, str2, str3, "false"));
    }

    public static final int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98356113", new Object[0])).intValue();
        }
        return zqq.j(v2s.o().p().b("tblive", "LikeDelayTime", "6"));
    }

    public static int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c4c0b9a", new Object[0])).intValue();
        }
        return zqq.j(v2s.o().p().b("tblive", "longNoticeRepeatCount", "3"));
    }

    public static int W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c037e8a2", new Object[0])).intValue();
        }
        return zqq.g(v2s.o().p().b("tblive", "shortNoticeDuration", "8"), 8);
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("753adaa9", new Object[0])).longValue();
        }
        return yqq.m(v2s.o().p().b("tblive", "anchorTopResponseDisplayTime", "15"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52dabbe3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "DisablePublishComment", "false"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a733435", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "defaultLinkArtcBackCamera", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d25a42", new Object[0])).booleanValue();
        }
        if (giv.c().b()) {
            return true;
        }
        return zqq.c(v2s.o().p().b("tblive", "enableFavoriteFunction", "false"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b4544f3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableFixMultiLinkDynamicLayout", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e145fa53", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableHandleSEIErrorDataShowView", "true"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4716d3cc", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableTaoLiveTreasureLinkEntrance", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b0da6b4", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableTaoLiveBCLinkEntrance", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0eea17b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableLiveLinkBackgroundImageMask", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d7a986", new Object[0])).booleanValue();
        }
        try {
            return zqq.c(v2s.o().p().b("tblive", "enableNewDynamicSticker", "true"));
        } catch (Exception e) {
            o3s.b(TAG, "enableNewDynamicSticker catch exception:" + e.getMessage());
            return false;
        }
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8007b560", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableNoBreakLink", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b50e0da0", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enablePopRightBottomLikeFeedback", "false"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47a0eac1", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enablePopScreenLikeFeedback", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78cfcc0c", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "forbiddenRemoteLikeAtmosWhenBottomLikeClicked", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd5a790a", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableRemoteOnlineLimitNumberFormat", "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f00004a6", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "EnableLinkLiveSEIDetect", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cc995de", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableSetBackgroundHoleAreaInErrorData", "true"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ae9d53", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "TBLiveBBPKMaskISAvailable", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8520b9f", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableStatusBarAdaptive", "true"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12d35645", new Object[0])).booleanValue();
        }
        try {
            return zqq.c(v2s.o().p().b("tblive", "enableStickerCommentCombine", "true"));
        } catch (Exception e) {
            o3s.b(TAG, "enableStickerCommentCombine catch exception:" + e.getMessage());
            return false;
        }
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("342a3a9a", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableUploadLiveMuteParams", "true"));
    }

    public static int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40863a65", new Object[0])).intValue();
        }
        return zqq.j(v2s.o().p().b("tblive", "BelovedFansMinLevel", "13"));
    }
}
