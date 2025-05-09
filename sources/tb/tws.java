package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, String> f29007a;
    public static List<String> b;
    public static String c = null;
    public static String d = null;
    public static String e = null;
    public static String f = null;
    public static String g = null;
    public static String h = null;
    public static Boolean i;
    public static List<String> j;
    public static String k;
    public static List<String> l;
    public static List<String> m;

    static {
        t2o.a(295699955);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55761c4b", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableUpdateShowEntranceSize", "true"));
    }

    public static int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d939bf65", new Object[0])).intValue();
        }
        return zqq.g(v2s.o().p().b("tblive", "H5AliveContainerRefreshCount", "10"), 10);
    }

    public static int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f48ee0e", new Object[0])).intValue();
        }
        return zqq.j(v2s.o().p().b("tblive", "H5MaxLoadTime", "10"));
    }

    public static String D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3145d047", new Object[]{str, str2});
        }
        return TextUtils.isEmpty(str) ? str2 : v2s.o().p().b("tblive", str, str2);
    }

    public static boolean E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f541cc9", new Object[]{str})).booleanValue();
        }
        if (b == null) {
            String F = F();
            if (!TextUtils.isEmpty(F)) {
                b = Arrays.asList(F.split(";"));
            }
        }
        List<String> list = b;
        if (list != null) {
            return !list.contains(str);
        }
        return true;
    }

    public static String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("984697b7", new Object[0]);
        }
        return v2s.o().p().b("tblive", "interactPanelShowBlack", "");
    }

    public static HashMap<String, String> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b66f0e03", new Object[0]);
        }
        if (f29007a == null) {
            f29007a = (HashMap) fkx.f(H(), HashMap.class);
        }
        return f29007a;
    }

    public static String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5d87132", new Object[0]);
        }
        return v2s.o().p().b("tblive", "interactiveRightComponentMap2", "{\"normal\": \"taolive_normal_countdown_comp\",\"viewpager\": \"taolive_viewpager_horizontal_comp\",\"countdown\": \"taolive_normal_countdown_comp\",\"progress\": \"taolive_progress_comp\"}");
    }

    public static int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10e46ede", new Object[0])).intValue();
        }
        return zqq.j(v2s.o().p().b("tblive", "interactiveRightComponentSize1010", "3"));
    }

    public static boolean J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7111c20d", new Object[]{str})).booleanValue();
        }
        if (j == null) {
            String K = K();
            if (!TextUtils.isEmpty(K)) {
                j = Arrays.asList(K.split(";"));
            }
        }
        List<String> list = j;
        if (list == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9c53b71", new Object[0]);
        }
        return v2s.o().p().b("tblive", "interactiveShowingComponentOrange", "@ali/alivemodx-live-packet-rain");
    }

    public static String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd6d5e2f", new Object[0]);
        }
        String str = f;
        if (str != null) {
            return str;
        }
        String b2 = v2s.o().p().b("tblive", "intimacyBeanComponentClickName", "@ali/alivemodx-live-beans-exchange");
        f = b2;
        return b2;
    }

    public static String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91a4382e", new Object[0]);
        }
        String str = e;
        if (str != null) {
            return str;
        }
        String b2 = v2s.o().p().b("tblive", "intimacyCoinComponentClickName", "@ali/alivemodx-live-intimate-beans");
        e = b2;
        return b2;
    }

    public static String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61647ad1", new Object[0]);
        }
        String str = c;
        if (str != null) {
            return str;
        }
        String b2 = v2s.o().p().b("tblive", "intimacyCoinComponentFedName", "@ali/alivemodx-live-intimate-beans");
        c = b2;
        return b2;
    }

    public static String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3809a8c6", new Object[0]);
        }
        String str = d;
        if (str != null) {
            return str;
        }
        String b2 = v2s.o().p().b("tblive", "intimacyCoinComponentName", "alivemodx-live-intimate-beans");
        d = b2;
        return b2;
    }

    public static boolean P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f52be88", new Object[]{str})).booleanValue();
        }
        if (l == null) {
            String Q = Q();
            if (!TextUtils.isEmpty(Q)) {
                l = Arrays.asList(Q.split(";"));
            }
        }
        List<String> list = l;
        if (list == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static String Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3a3ce56", new Object[0]);
        }
        return v2s.o().p().b("tblive", "needCheckJsBridgeTokenOrange", "setPenetrateAlpha;startVideo;pauseVideo;resumeVideo;muteVideo;destroyVideo;refreshRoom;enableUpDownSwitch;enableLeftRightSwitch;switchRoom;closeRoom;interactiveInitComponentWithParam;interactUpdateEntranceView;interactUpdateEntranceAnimateView;componentAllLoadFinish;showGoodsList;closeGoodsListWeexView;navToURL;showSharePanel;sendComments;invokeEditor;closeEditor;sendLocalGiftMessage;interactiveRenderFinishComponentWithParam");
    }

    public static boolean R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a32a44f2", new Object[]{str})).booleanValue();
        }
        if (m == null) {
            String S = S();
            if (!TextUtils.isEmpty(S)) {
                m = Arrays.asList(S.split(";"));
            }
        }
        List<String> list = m;
        if (list == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public static String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eabd152c", new Object[0]);
        }
        return v2s.o().p().b("tblive", "needCheckLiveTokenEventOrange", "TBLiveWVPlugin.Event.Alive.DidAttached;TBLiveWVPlugin.Event.Alive.WillDeAlloc");
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("730a5a11", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "notifyMsgEntranceChanged", "true"));
        }
        return false;
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58219a71", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "openJsApiUt", "true"));
        }
        return false;
    }

    public static float V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58c7be0", new Object[0])).floatValue();
        }
        return zqq.e(v2s.o().p().b("tblive", "openWebViewLayerHeight", "0.6666"));
    }

    public static boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25eb842f", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "openWebViewLayerXY", "true"));
    }

    public static String X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea90d2c0", new Object[0]);
        }
        String str = h;
        if (str != null) {
            return str;
        }
        String b2 = v2s.o().p().b("tblive", "sRankComponentClickFedName", "@ali/alivemodx-live-rank");
        h = b2;
        return b2;
    }

    public static String Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d27601a", new Object[0]);
        }
        String str = g;
        if (str != null) {
            return str;
        }
        String b2 = v2s.o().p().b("tblive", "rankComponentFedName", "@ali/alivemodx-live-rank");
        g = b2;
        return b2;
    }

    public static boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0ae085", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableTbliveLayerThemis", "false"));
        }
        return false;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("925f8781", new Object[0]);
        }
        String str = k;
        if (str != null) {
            return str;
        }
        String b2 = v2s.o().p().b("tblive", "ADSComponentName", "@ali/rax-live-ads");
        k = b2;
        return b2;
    }

    public static String a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a8cfb4", new Object[0]);
        }
        return v2s.o().p().b("tblive", "forceCsrStrKey", "force_csr");
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b3865f7", new Object[0]);
        }
        if (v2s.o().p() != null) {
            return v2s.o().p().b("tblive", "checkALiveJSBridgeToken", "alive_token_20231225");
        }
        return "alive_token_20231225";
    }

    public static String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ab25562", new Object[0]);
        }
        return v2s.o().p().b("tblive", "forceCsrStrValue", "true");
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2397e2b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(N(), str) || TextUtils.equals(O(), str)) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cd7cf1d", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "disableSmallWindowJumpUrl", "false"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a905416", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableALiveJSBridgeTokenCheck", "false"));
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16f3381a", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableCloseCheckIsNeedShowByMtop", "true"));
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fef97dd", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableComponentListJSBOpt", "true"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbf0c923", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableDefaultAliveBridge", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69ca986a", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableGetAlphaAtXY", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b74eae1", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableGetTempBitmap", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd390b16", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableGetViewBitmapOnlyActionDown", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5ec53c2", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableH5ContainerV2ActionReport", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0f38eab", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableH5ScrollStateChanged", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71541580", new Object[0])).booleanValue();
        }
        if (i == null) {
            i = Boolean.valueOf(zqq.c(v2s.o().p().b("tblive", "enableInteractiveShowingComponentList", "true")));
        }
        return i.booleanValue();
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4718bfac", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableIntimacyBeanBridgeMsg", "false"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8549dba9", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableIntimacyControllerDestroyFix", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca2212f2", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableJSBridgeALiveTokenCheck", "false"));
        }
        return false;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51826e4d", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableNewGetComponentList", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a14fcc5", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableOpenMoreWebViewLayer", "true"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c341281", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enablePadFoldNewAliveH5Container", "false"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fb9d227", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableRightComponentRefreshOpt", "true"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30e3c76b", new Object[0])).booleanValue();
        }
        if (v2s.o().p() != null) {
            return zqq.c(v2s.o().p().b("tblive", "enableRightEntranceAnim", "true"));
        }
        return false;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8fa370e", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableRefund", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eacd6b63", new Object[0])).booleanValue();
        }
        return v2s.o().p() != null && zqq.c(v2s.o().p().b("tblive", "enableThemisContainerV3", "false")) && zqq.c(v2s.o().c().c("taolive", "tao_live_enable_themis_container_module", "tao_live_enable_themis_container", "false"));
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f0e5141", new Object[]{context})).booleanValue();
        }
        return (!vc.j(context) || u()) && zqq.c(v2s.o().p().b("tblive", "enableNewAliveH5ContainerV2", "false")) && zqq.c(v2s.o().c().c("taolive", "tao_live_enable_whole_alive_module", "tao_live_home_enable_whole_alive", "false"));
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72981397", new Object[]{context})).booleanValue();
        }
        return r(context) && zqq.c(v2s.o().p().b("tblive", "enablePowerMsgLiveToken", "false"));
    }
}
