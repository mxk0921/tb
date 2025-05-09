package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.orange.OrangeConfig;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wbl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GET_UTRINS_FROM_DXCTX = "get_utrIns_from_dxCtx";
    public static final String NEW_BABEL_ORDER = "newbabelorder";

    static {
        t2o.a(614465796);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eefaeeea", new Object[0])).booleanValue();
        }
        return "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "useAdamDefaultSubscribe", "true"));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f047c94e", new Object[0])).booleanValue();
        }
        return v9v.i(NEW_BABEL_ORDER, "useMegaAlert", false);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae2cc7cd", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "order_async_refreshCop", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4effa60c", new Object[0])).booleanValue();
        }
        return v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_LIST, "enableLogisticsClickDebounce", false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1433e35e", new Object[0])).booleanValue();
        }
        return v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_LIST, "enableLogisticsFragmentOpt", false);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb049b9e", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "order_bundleLine_switch", "false"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0788b1c", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "orderlist_nexrpc", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f43f1fb", new Object[0])).booleanValue();
        }
        return v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "enableAsyncCreateInstance", false);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82f28939", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "oDetail_elder", "true"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("607ab0cc", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "oList_elder", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8182257", new Object[0])).booleanValue();
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("babelorder", "enableOrderPreloadBackground", "false"), "true");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed0cf1a8", new Object[0])).booleanValue();
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("babelorder", "enableOrderWeex2Prefetch", "false"), "true");
    }

    public static long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7347a0b7", new Object[0])).longValue();
        }
        try {
            return Math.max(0.0f, v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "odetailPreRequestExpiredTime", 5.0f) * 60.0f * 1000.0f);
        } catch (Throwable unused) {
            return 300000L;
        }
    }

    public static long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("173f0d56", new Object[0])).longValue();
        }
        try {
            return Math.max(0.0f, v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "odetailPreRequestInterval", 5.0f) * 60.0f * 1000.0f);
        } catch (Throwable unused) {
            return 300000L;
        }
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b00fb3b7", new Object[0])).intValue();
        }
        try {
            return Math.max(0, Integer.parseInt(OrangeConfig.getInstance().getConfig(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "odetailPreRequestMaxPage", "1")));
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb0902e0", new Object[0])).intValue();
        }
        try {
            return Math.max(0, Integer.parseInt(OrangeConfig.getInstance().getConfig(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "odetailPreRequestMaxPos", "3")));
        } catch (Throwable unused) {
            return 3;
        }
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2308ea4", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "isAsyncExposure", "false"));
    }

    public static boolean p(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ace8bee8", new Object[]{orderConfigs})).booleanValue();
        }
        if (!OrderConfigs.BizNameType.ORDER_LIST.equals(orderConfigs.c())) {
            return false;
        }
        return o();
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b57d734", new Object[0])).booleanValue();
        }
        return !x();
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7b876", new Object[0])).booleanValue();
        }
        String str = Mtop.instance(null).getMtopConfig().appVersion;
        if (!TextUtils.isEmpty(str) && str.split("\\.").length >= 4) {
            return true;
        }
        return false;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8f80c11", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "newHandler", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77350a61", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c8e99d9", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "isPostRunnableExposure", "false"));
    }

    public static boolean v(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99db32dd", new Object[]{orderConfigs})).booleanValue();
        }
        if (!OrderConfigs.BizNameType.ORDER_LIST.equals(orderConfigs.c())) {
            return false;
        }
        return u();
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d4411a", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", z1x.PRE_RENDER, "false"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0ebee55", new Object[0])).booleanValue();
        }
        if (qp0.b() == 2) {
            return true;
        }
        return false;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe7d4a49", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "needDestroyWeex2ViewHolder", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f097983", new Object[0])).booleanValue();
        }
        if (r()) {
            return true;
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "rvIdlePost", "true"));
    }
}
