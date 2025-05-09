package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e2h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f18227a = e2h.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f18228a;

        public a(Map map) {
            this.f18228a = map;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            OrangeConfig.getInstance().unregisterListener(new String[]{"tblive"}, this);
            Map map2 = this.f18228a;
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    e2h.w(str2, e2h.c(str2, (String) this.f18228a.get(str2)));
                }
            }
        }
    }

    static {
        t2o.a(806355496);
    }

    public static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6272d35e", new Object[]{str, str2, str3, str4});
        }
        try {
            if (f()) {
                String d = d(str, str2, str3);
                if (!TextUtils.isEmpty(d)) {
                    String str5 = f18227a;
                    Log.e(str5, "ab使用测试工具持久化值 " + str + "_" + str2 + "_" + str3 + " value " + d);
                    return d;
                }
            }
            Variation variation = UTABTest.activate(str, str2).getVariation(str3);
            if (variation != null) {
                return variation.getValueAsString(str4);
            }
        } catch (Exception e) {
            r0h.c(f18227a, "UTABTest exp. ", e);
        }
        return str4;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f18227a;
    }

    public static /* synthetic */ String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("869cd5b3", new Object[]{str, str2});
        }
        return s(str, str2);
    }

    public static String d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e861e2fb", new Object[]{str, str2, str3});
        }
        try {
            SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("ab_mock_value", 0);
            return sharedPreferences.getString(str + "_" + str2 + "_" + str3, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b2a1ca7", new Object[0])).intValue();
        }
        return arq.f(s("channelHomeImgAnimateTime", "100"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9613e17c", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableABTestWhiteList", "false")) || sj7.m();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a3a41a", new Object[0])).booleanValue();
        }
        return "true".equals(a("taolive", "enableCardonScrollStateChangedResume", "enable", "false"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41d63504", new Object[0])).booleanValue();
        }
        return arq.c(s("enableChannelCPUAdeMonBootsCpu", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("544de619", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableDxPrefetch", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d0b6eef", new Object[0])).booleanValue();
        }
        return arq.c(s("enableLifecycleTrack", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c24c6af", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableLongTextViewMaequee", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("590f1471", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableLpm", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd737ed1", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableMtopUseCache", "false"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85494538", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableNewShowMaidian", "true"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2996c83e", new Object[0])).booleanValue();
        }
        return arq.c(a("taolive", "channelNewAutoPlayAllNetwork", "value", "true"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88800ad6", new Object[0])).booleanValue();
        }
        return arq.c(OrangeConfig.getInstance().getConfig("tblive", "enableWebViewGestureLogic", "true"));
    }

    public static float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be37bac2", new Object[0])).floatValue();
        }
        return arq.d(s("HomePageAlimamaAdArea", "0.5"));
    }

    public static String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1601abe2", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("displaycutoutsupport", "cutoutphonelist", "");
    }

    public static String s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4dbe341", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("tblive", str, str2);
    }

    public static String t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae5d117e", new Object[]{str, str2});
        }
        String u = u(str);
        if (TextUtils.isEmpty(u)) {
            return s(str, str2);
        }
        return u;
    }

    public static void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"tblive"}, new b(null), false);
        }
    }

    public static void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[0]);
        } else {
            OrangeConfig.getInstance().unregisterListener(new String[]{"tblive"});
        }
    }

    public static int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b26a806", new Object[0])).intValue();
        }
        return arq.f(s("videoListMaxSize", "1000"));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f18229a;

        static {
            t2o.a(806355498);
            t2o.a(613416995);
        }

        public b() {
            this.f18229a = "";
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("tblive".equals(str)) {
                r0h.d(e2h.b(), "onConfigUpdate.");
                String str2 = map.get("configVersion");
                if (!StringUtils.isStringEqual(str2, this.f18229a)) {
                    this.f18229a = str2;
                    qyg.c().h("com.taobao.live.home.orange_update");
                }
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static String u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d946a85", new Object[]{str});
        }
        return Globals.getApplication().getSharedPreferences("taolive", 0).getString(str, "");
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3675e91", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("taolive", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void y(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697b7c64", new Object[]{map});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"tblive"}, new a(map), true);
        }
    }
}
