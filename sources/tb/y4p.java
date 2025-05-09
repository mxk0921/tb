package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.sf.util.tlog.TLogTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String c;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31850a = false;
    public static Boolean b = null;
    public static String d = "";
    public static boolean e = false;

    static {
        t2o.a(815792249);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaa79083", new Object[0]);
        }
        return c;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f66e65eb", new Object[0]);
        }
        String e2 = e("tbAndroidDynamicCardScene");
        return TextUtils.isEmpty(e2) ? l48.APP_ID_VALUE : e2;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42596f24", new Object[0]);
        }
        return d;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0f99b1", new Object[]{str});
        }
        String r = oen.r(str);
        v5s v5sVar = new v5s();
        v5sVar.b("testName", str);
        v5sVar.b("testConfigValue", r);
        TLogTracker.g("RainbowConfig", v5sVar);
        return r;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4847ed4d", new Object[0])).booleanValue();
        }
        return !TextUtils.isEmpty(e("tbAndroidMetaSearchEnabledV3"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1d67d4b", new Object[0])).booleanValue();
        }
        String d2 = d("tbAndroidKeepColdLaunchLinkV2");
        if (TextUtils.isEmpty(d2)) {
            d2 = v4p.e("coldLaunchKeepLink", "");
        } else {
            v4p.b().edit().putString("coldLaunchKeepLink", d2).apply();
        }
        return TextUtils.equals("enable", d2);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4cd6cc6", new Object[0])).booleanValue();
        }
        return TextUtils.equals("enable", d("tbAndroidFeedbackHideCard"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad1b241c", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2b468d8", new Object[0])).booleanValue();
        }
        return TextUtils.equals("enable", e("tbAndroidNewSubscribe"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4ecac37", new Object[0])).booleanValue();
        }
        w();
        Boolean bool = b;
        if (bool == null || !bool.booleanValue()) {
            return TextUtils.equals("enable", e("tbAndroidLoadMoreWhenAttached"));
        }
        return false;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418d605c", new Object[0])).booleanValue();
        }
        return e;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea305c6e", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            return false;
        }
        return TextUtils.equals("enable", e("tbAndroidRecycleNodeWhenPageLeave"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("491d646a", new Object[0])).booleanValue();
        }
        return TextUtils.equals("enable", e("tbAndroidWeexRenderNode"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbed6ffc", new Object[0])).booleanValue();
        }
        return TextUtils.equals("enable", e("tbAndroidReplaceM3"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf32cf61", new Object[0])).booleanValue();
        }
        return TextUtils.equals("enable", e("tbAndroidEventBusReset"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e599a151", new Object[0])).booleanValue();
        }
        return TextUtils.equals("enable", e("tbAndroidSRPSearchBarTagStyle"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f5d9295", new Object[0])).booleanValue();
        }
        e = SearchSdk.sRainbowInited;
        String b0 = o4p.b0();
        d = b0;
        return TextUtils.equals("enable", b0);
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66e73be4", new Object[0])).booleanValue();
        }
        return TextUtils.equals("enable", e("tbAndroidSrpHeaderResuse"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e35ab33", new Object[0])).booleanValue();
        }
        String b2 = e9n.INSTANCE.b("tbAndroidTB2024StyleV3");
        c = b2;
        if (TextUtils.isEmpty(b2)) {
            return false;
        }
        return TextUtils.equals(b2, "enable1");
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c9c4c7f", new Object[0])).booleanValue();
        }
        return TextUtils.equals("enable", e("tbAndroidTrimMemory"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467806f7", new Object[0])).booleanValue();
        }
        return TextUtils.equals("enable", e("tbAndroidWeakNetworkPerf"));
    }

    public static void w() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc93408", new Object[0]);
        } else if (b == null) {
            DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
            if (downgradeStrategy != null && TextUtils.equals("degrade", downgradeStrategy.getTacticsPerformance())) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("590626c5", new Object[]{str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        String r = oen.r(str);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        c4p.m("moyutest", "call rainbow cost " + currentTimeMillis2);
        if (!f31850a) {
            AppMonitor.register("tbsearch", "rainbowCost", new String[]{"callCost"}, new String[]{"deviceLevel"}, false);
            f31850a = true;
        }
        AppMonitor.Stat.commit("tbsearch", "rainbowCost", new String[]{"deviceLevel"}, new String[]{ri7.a()}, new String[]{"callCost"}, new String[]{String.valueOf(currentTimeMillis2)});
        return r;
    }
}
