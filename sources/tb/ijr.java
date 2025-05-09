package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ijr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAOBAO_LIVE_AB_GROUP = "taobaolive";
    public static final String TBLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    static {
        t2o.a(295699264);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20cba4cd", new Object[0])).intValue();
        }
        return zqq.j(v2s.o().p().b("tblive", "backTopInterval", "12"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8f02ad3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableGoodsIntimacyCoin", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb9c4ef", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "goodsEnableTopBanner", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2204eec3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableLiveShopSku", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6ec7ff9", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableTabTopPop", "true"));
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77e7b9ec", new Object[0]);
        }
        return v2s.o().p().b("tblive", "importantTemplates", "taolive_important_event_red_pocket,taolive_important_event_seckill,taolive_important_event_public_benefit,taolive_important_event_full_link,taolive_important_event_hongbao");
    }

    public static String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6311391f", new Object[]{str, str2});
        }
        return v2s.o().p() != null ? v2s.o().p().b("tblive", str, str2) : str2;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c59fd4", new Object[0]);
        }
        return g("searchGoodsHint", "搜索商品/序号");
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13b6f89e", new Object[0])).booleanValue();
        }
        return zqq.c(g("isSpeakingToTimeMove", "false"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("732c56f3", new Object[0])).booleanValue();
        }
        return zqq.c(g("itemCategoryEnable", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21a188e8", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "showTabTop", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53ac1553", new Object[0])).booleanValue();
        }
        return zqq.c(g("tbliveGoodListFrameTracerSwitch", "true"));
    }
}
