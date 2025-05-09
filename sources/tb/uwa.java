package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uwa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HighlightListCard = "listCard";
    public static final String TAOLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    static {
        t2o.a(779092715);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb65643", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enbaleHighlightfixSjsditemId", "true"));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("975994ad", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "fixDestoryMMLeak", "true"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17159322", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "fixUpDownSwitchByHighlight", "true"));
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c25e92be", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "EnableBackToLiveForTimeShift1", "true"));
    }

    public static String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76b9e348", new Object[0]);
        }
        return v2s.o().p().b("tblive", "tbLiveRoomReportUrl", "https://market.m.taobao.com/app/msd/buyer-aqcenter/report.html?bizSource=taobao#/poplayer");
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("217e6872", new Object[0])).booleanValue();
        }
        return d4s.e("highlightIntelligencePlay", true);
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1950759", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "highlightUIRedesignOrangeByServer", true);
    }

    public static double I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("205adc1a", new Object[0])).doubleValue();
        }
        return zqq.e(v2s.o().p().b("tblive", "highlightViewPageHeigh", "0.75"));
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a43a366", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "timeShiftGuideSwitch", "true"));
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("624800c7", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "closeHighlightDXScrollableOpt", false);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4785898", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9023fc1e", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableCurPreOldHighlight", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73c3cd88", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableDemoteHighlight2", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b61d020", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableDestoryLocalAdapter", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d2f789b", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHideActionByTab3", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6281a917", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHighlightEmptyCard", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d0facb3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHighlightExternalAdvertising", "false"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("165246c8", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableHighlightKeyPointId", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b682441", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHighlightPreloadTimeMoveNew", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b930adac", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHighlightSkipAddCard", "false"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceee07fa", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHiglightGoodsKeyPointId", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae8816a3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHiglightSpmFix", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb0ff65c", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableHiglightSpmSwitch", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("939280f4", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableItemExtDataSwitch", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72c3e514", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableLeftTouchforbid", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86858fca", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableLiveSourceABSwitch", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e304860", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enablePadAdapterHighlight", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4ec99b3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enablePlayRateFun", "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("126eb771", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enablePoplayerReportNewUrl", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361a479", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableRightTouchfobid", "true"));
    }

    public static boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b0c9040", new Object[]{str})).booleanValue();
        }
        return !HighlightListCard.equals(u(str));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("780a5856", new Object[0])).booleanValue();
        }
        return vvs.b("goodlist", "sourceDataOpt", true);
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("917d1f21", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "isShowedLabelInfoListForNewTimeMoving1", "true"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef63b9fc", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableTimeShiftNewPlayControll", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70ceac8a", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableTrackUtilsError", "true"));
    }

    public static String u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35d924a5", new Object[]{str});
        }
        if (!vvs.b("tblive", "highlightSingleCardSwitchNew", false) && a(vvs.i("tblive", "highlightCardTypeAList", "homepage.discover.itemcard.display,homepage.discover.itemcard_insert.display,homepage.discover.itemcard_insert_interest.display,tpp_88.itemdisplay,mainsearchlive.itemdisplay,mainsearchlive"), str)) {
            return "CardStyleA";
        }
        return HighlightListCard;
    }

    public static boolean G(VideoInfo videoInfo) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a056c37", new Object[]{videoInfo})).booleanValue();
        }
        return !vvs.b("tblive", "taoliveHighlightSingleGoodsCardClose", false) && ((videoInfo == null || (timeMovingPlayInfo = videoInfo.timeMovingPlayInfo) == null || (map = timeMovingPlayInfo.abResultMap) == null) ? false : "2".equals(map.get("renderSingleCardByGoods")));
    }
}
