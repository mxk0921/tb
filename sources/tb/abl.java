package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class abl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final abl INSTANCE = new abl();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15642a;
    public static boolean b;

    static {
        t2o.a(336593083);
    }

    @JvmStatic
    public static final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("515da331", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return false;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "isPopCbActivityLifeCycleEv", "true"));
    }

    @JvmStatic
    public static final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4794c5bb", new Object[0])).booleanValue();
        }
        if (INSTANCE.u()) {
            return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "loadingCancelable", "false"));
        }
        return false;
    }

    @JvmStatic
    public static final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb41fef", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "modifySubActDisplayInfo", "true"));
    }

    @JvmStatic
    public static final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7ed6508", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "nativePopDismissWhenFinish", "true"));
    }

    @JvmStatic
    public static final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82b06f00", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "notModalDrawerAutoFullScreen", "true"));
    }

    @JvmStatic
    public static final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdb51e87", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "recoverSubActivityDecorRootSpaceAndTheme", "true"));
    }

    @JvmStatic
    public static final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6191859", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "requestDisAllowParentIntercept", "true"));
    }

    @JvmStatic
    public static final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b0ab8c9", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "rollBackWeexViewReport", "false"));
    }

    @JvmStatic
    public static final boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17f3163b", new Object[0])).booleanValue();
        }
        return !INSTANCE.u() || (ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "translucentFullScreenPadDrawer", "true")) && Build.VERSION.SDK_INT >= 30);
    }

    @JvmStatic
    public static final long O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ccc4670", new Object[0])).longValue();
        }
        try {
            if (!INSTANCE.u()) {
                return 50L;
            }
            String config = OrangeConfig.getInstance().getConfig("ability_kit", "padTranslucentFullTime", "50");
            ckf.f(config, "OrangeConfig.getInstance…anslucentFullTime\", \"50\")");
            return Long.parseLong(config);
        } catch (NumberFormatException unused) {
            return 50L;
        }
    }

    @JvmStatic
    public static final boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acadc97", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "updateSubActivityParams", "true"));
    }

    @JvmStatic
    public static final boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e984a19", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "useWindowMetricsCalculator", "true"));
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fc6a84a", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "defaultPanEnable", "true"));
    }

    @JvmStatic
    public static final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8039bdf1", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "dxLoadingTokenDegrade", "false"));
    }

    @JvmStatic
    public static final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14743962", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "dxModalDegrade", "false"));
    }

    @JvmStatic
    public static final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2c887dc", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "dxToastDegrade", "false"));
    }

    @JvmStatic
    public static final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("742f443d", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "downgradeDisPatchKeyDown", "false"));
    }

    @JvmStatic
    public static final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e5cd9f", new Object[0])).booleanValue();
        }
        if (INSTANCE.u()) {
            return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "downgradeListenWeex1", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa5ef6dd", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "downgradeToOriginIntent", "false"));
    }

    @JvmStatic
    public static final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e183850b", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return false;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("mega_analysis", "enableExecuteCount", "false"));
    }

    @JvmStatic
    public static final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29768b51", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "enableCbCloseWhenRmPop", "true"));
    }

    @JvmStatic
    public static final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9880279a", new Object[0])).booleanValue();
        }
        if (INSTANCE.u()) {
            return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "enableDxContainerView", "true"));
        }
        return false;
    }

    @JvmStatic
    public static final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8cd861c", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "multi_std_pop_destroy_release", "true"));
    }

    @JvmStatic
    public static final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca46a67c", new Object[0])).booleanValue();
        }
        if (INSTANCE.u()) {
            return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "enablePadAutoOrientation", "true"));
        }
        return false;
    }

    @JvmStatic
    public static final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8770f5bc", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "enableRecoverWindow", "true"));
    }

    @JvmStatic
    public static final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40b9d553", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "stdGroupEnableReplaceToken", "true"));
    }

    @JvmStatic
    public static final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eef7d4a", new Object[0])).booleanValue();
        }
        if (!INSTANCE.u()) {
            return true;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "std_pop_mode_opt", "true"));
    }

    @JvmStatic
    public static final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3435cfa", new Object[0])).booleanValue();
        }
        if (INSTANCE.u()) {
            return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "disableWeex2OverScroll", "true"));
        }
        return false;
    }

    @JvmStatic
    public static final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1573334a", new Object[0]);
        }
        if (!INSTANCE.u()) {
            return null;
        }
        return OrangeConfig.getInstance().getConfig("ability_kit", "alert_ability_ui", "https://dinamicx.alibabausercontent.com/pub/alert_ability_ui/1695111595547/alert_ability_ui.zip,3");
    }

    @JvmStatic
    public static final float w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36ecde6b", new Object[0])).floatValue();
        }
        if (!INSTANCE.u()) {
            return 0.44f;
        }
        String config = OrangeConfig.getInstance().getConfig("ability_kit", "defaultLargeScreenRatio", "0.44");
        ckf.f(config, "OrangeConfig.getInstance…argeScreenRatio\", \"0.44\")");
        Float l = rsq.l(config);
        if (l != null) {
            return l.floatValue();
        }
        return 0.44f;
    }

    @JvmStatic
    public static final String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("851ca0aa", new Object[0]);
        }
        if (!INSTANCE.u()) {
            return null;
        }
        return OrangeConfig.getInstance().getConfig("ability_kit", "dxLoadingTemplate", "https://dinamicx.alibabausercontent.com/l_pub/loading_ability_ui/1739947850725/loading_ability_ui.zip,12");
    }

    @JvmStatic
    public static final String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89625415", new Object[0]);
        }
        if (!INSTANCE.u()) {
            return null;
        }
        return OrangeConfig.getInstance().getConfig("ability_kit", "dxToastTemplate", "https://dinamicx.alibabausercontent.com/pub/toast_ability/1713778277014/toast_ability.zip,3");
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("497e2210", new Object[]{this})).booleanValue();
        }
        if (b) {
            return f15642a;
        }
        f15642a = true;
        b = true;
        return true;
    }

    @JvmStatic
    public static final boolean D(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41733345", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "ctx");
        return !INSTANCE.u() || (ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "localActStartErrorDowngradeToNav", "true")) && gxv.l(context));
    }

    @JvmStatic
    public static final boolean H(String str) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff36e187", new Object[]{str})).booleanValue();
        }
        return !INSTANCE.u() || (config = OrangeConfig.getInstance().getConfig("ability_kit", "recoverActGroupSoftInputMode", null)) == null || !(str == null || str.length() == 0 || !wsq.O(config, str, false, 2, null));
    }

    @JvmStatic
    public static final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1609b2f", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "ctx");
        return !INSTANCE.u() || (ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "onlyCalScreenRatioWhenLand", "true")) && gxv.l(context));
    }

    @JvmStatic
    public static final boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eae280d2", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "ctx");
        return !INSTANCE.u() || (ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "downgradeToNav", "false")) && gxv.l(context));
    }

    @JvmStatic
    public static final boolean z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc191803", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "ctx");
        return !INSTANCE.u() || (gxv.l(context) && ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "padHandleSplitWindow", "true")));
    }
}
