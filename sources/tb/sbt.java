package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sbt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f27933a = null;
    public static Boolean b;

    static {
        t2o.a(779093714);
    }

    public static String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef6eb84b", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "liveRoomExtraSaltParam", "581BEC0C930BF1AFEB40B4A08C8FB142");
    }

    public static String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48b71f85", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "RecentlyWatchTime", "60000");
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec882ebd", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "TBLiveReplaceItemUrlParam", "true"));
    }

    public static String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2596792", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "ShareWeexHeight", "520");
    }

    public static String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4961d193", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "ShareWeexWidth", "420");
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("615c8475", new Object[0])).longValue();
        }
        return yqq.m(OrangeConfig.getInstance().getConfig("tblive", "cacheLimitSize", "300000000"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ee12221", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "checkControllerDestroy", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52ed05c7", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "checkGoodsDefaultCpsTcpInfo", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9613e17c", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableABTestWhiteList", "true")) || hw0.l();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0b1336", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableAddNewtonsEncryptionParams", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c97954", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableAppendNewtonsParams", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed4a7f47", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "FootprintSwitch", "false"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5254d571", new Object[0])).booleanValue();
        }
        return v2s.o().p() != null && yqq.h(v2s.o().p().b("tblive", "enableGlobalReportLive", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ca0aa9b", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableH5EmbedLiveRoom", "false"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0ef883b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enableHighlightTcp", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee70f11b", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", ItemCardViewHolder.KEY_FEATURE_ENABLE_INSIDE_DETAIL, "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2e004a7", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enable_live_insidedetail", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af9743b4", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableModifyNewtonsParams", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82b1c897", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableNewBitmapLoadType", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9743dd1f", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableOfficialBusinessParams", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fd9f5c6", new Object[0])).booleanValue();
        }
        if (b == null) {
            if (yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enableOrangeMock", "true")) || hw0.l()) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("380c662a", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "enablePadAdapter", "true"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e537e4f", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "RecentlyWatchSwitch", "false"));
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d6bc00d", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "FootprintTime", "3000");
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7dfb1b3", new Object[0]);
        }
        return v2s.o().p().b("tblive", "bgStreamingLeakDelaySeconds", "10");
    }

    public static String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91fafe2f", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "goodsDefaultCpsTcpInfo", "{\"taobao\":{\"businessScenceId4Activity\":\"61\",\"tcpBid\":\"19\",\"context\":{\"lightShopStoreId\":\"\"},\"businessScenceId\":\"59\"},\"tmall\":{\"businessScenceId4Activity\":\"61\",\"tcpBid\":\"19\",\"context\":{\"lightShopStoreId\":\"\"},\"businessScenceId\":\"59\"}}");
    }

    public static String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("449c03fd", new Object[0]);
        }
        if (TextUtils.isEmpty(f27933a)) {
            f27933a = OrangeConfig.getInstance().getConfig("tblive", "liveShareDescriptionImage", "https://gw.alicdn.com/imgextra/i4/O1CN01znUC2I26JdBCZ2PIh_!!6000000007641-2-tps-384-88.png");
        }
        return f27933a;
    }

    public static String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be24170e", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive", "needReplaceInsideUrls", "h5.m.taobao.com/awp/core/detail.htm");
    }

    public static String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c3d9a84", new Object[0]);
        }
        return v2s.o().p().b("tblive", "tcpAddSabAtmosphereKeyList", "showPriority,isStressShow,reasonRightType,reasonSubRightType,sabItemLevel,smallCardItemType,realtimeBoostType,millionGroupBuy,tmcFlashDrop,selfFlashDrop,tmcFlashDrop_ordinary,tmcFlashDrop_Official,itemType");
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f532d2d2", new Object[0])).booleanValue();
        }
        return yqq.h(v2s.o().p().b("tblive", "enable_insidedetail_low", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efa99355", new Object[0])).booleanValue();
        }
        return yqq.h(OrangeConfig.getInstance().getConfig("tblive", "isNewFollowEnable", "false"));
    }
}
