package tb;

import android.app.Application;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.taobao.R;
import com.taobao.weex.common.WXConfig;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static float f;
    public static AccessibilityManager g;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30279a = false;
    public static final Map<String, Map<String, Object>> b = new ConcurrentHashMap();
    public static final Map<String, Object> c = new ConcurrentHashMap();
    public static volatile boolean d = false;
    public static volatile boolean e = false;
    public static boolean h = false;

    static {
        t2o.a(982516012);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539628ea", new Object[0])).booleanValue();
        }
        return false;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        try {
            Application a2 = f5x.a();
            return a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0).versionName;
        } catch (Exception e2) {
            dwh.i(e2);
            return "";
        }
    }

    public static Application c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return f5x.f19038a;
    }

    public static String d(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        Map<String, Object> map = e().get(str);
        if (map == null || (obj = map.get(str2)) == null) {
            return "";
        }
        return String.valueOf(obj);
    }

    public static Map<String, Map<String, Object>> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("160426b4", new Object[0]);
        }
        if (!d) {
            synchronized (b) {
                try {
                    if (!d) {
                        u8x.i("WeexInitCommonEnv");
                        j();
                        d = true;
                        u8x.j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static WeexValueImpl f(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValueImpl) ipChange.ipc$dispatch("b6647d29", new Object[]{str, str2});
        }
        Map<String, Object> map = e().get(str);
        if (map == null) {
            return WeexValueImpl.ofUndefined();
        }
        if ("userAgent".equals(str2)) {
            obj = h().get(str2);
        } else if ("system".equals(str) && "ttid".equals(str2)) {
            obj = h().get(str2);
        } else if (!"system".equals(str) || !"appName".equals(str2)) {
            obj = map.get(str2);
        } else {
            obj = h().get(str2);
        }
        if (obj == null) {
            return WeexValueImpl.ofUndefined();
        }
        return WeexValueImpl.convert(obj);
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d569536", new Object[]{str});
        }
        Object obj = h().get(str);
        if (obj == null) {
            return "";
        }
        return String.valueOf(obj);
    }

    public static Map<String, Object> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1193e115", new Object[0]);
        }
        if (!e) {
            synchronized (c) {
                try {
                    if (!e) {
                        u8x.i("WeexInitWXEnv");
                        k();
                        e = true;
                        u8x.j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10d539ca", new Object[0])).floatValue();
        }
        if (f == 0.0f) {
            f = f5x.a().getResources().getDisplayMetrics().density;
        }
        return f;
    }

    public static void j() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e88fc44", new Object[0]);
            return;
        }
        Application a2 = f5x.a();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("platform", TimeCalculator.PLATFORM_ANDROID);
        String str2 = Build.VERSION.RELEASE;
        concurrentHashMap.put("osVersion", str2);
        concurrentHashMap.put("osBuildVersion", Build.VERSION.INCREMENTAL);
        String str3 = Build.MODEL;
        concurrentHashMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, str3);
        concurrentHashMap.put(WXConfig.deviceWidth, Float.valueOf(fxh.m(a2, nxh.e(a2))));
        concurrentHashMap.put(WXConfig.deviceHeight, Float.valueOf(fxh.m(a2, nxh.c(a2))));
        float e2 = nxh.e(a2);
        concurrentHashMap.put("devicePixelRatio", Double.valueOf(Math.round((e2 / l9o.a(a2, e2)) * 100.0d) * 0.01d));
        concurrentHashMap.put("statusBarHeight", Integer.valueOf(nxh.g(a2)));
        concurrentHashMap.put("statusBarHeightPx", Float.valueOf(l9o.a(a2, nxh.g(a2))));
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        concurrentHashMap2.put("musVersion", "0.23.0.10-framework-android");
        concurrentHashMap2.put("musGitHashTag", dn2.GIT_HASH_NAME);
        concurrentHashMap2.put("musApiLevel", "10");
        if (f5x.b) {
            str = "1";
        } else {
            str = "0";
        }
        concurrentHashMap2.put("debug", str);
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        concurrentHashMap3.put("appName", a2.getPackageName());
        concurrentHashMap3.put("appVersion", b());
        Map<String, Map<String, Object>> map = b;
        ((ConcurrentHashMap) map).put("system", concurrentHashMap);
        ((ConcurrentHashMap) map).put(g4.a.f2721a, concurrentHashMap2);
        ((ConcurrentHashMap) map).put("app", concurrentHashMap3);
        concurrentHashMap.putAll(f5x.systemEnvironment);
        concurrentHashMap2.putAll(f5x.sdkEnvironment);
        concurrentHashMap3.putAll(f5x.appEnvironment);
        String format = String.format("MUS/%1$s %2$s/%3$s(%4$s) %5$s/%6$s", "0.23.0.10-framework-android", TimeCalculator.PLATFORM_ANDROID, str2, str3, a2.getPackageName(), b());
        if (f5x.f != null) {
            format = format + " " + f5x.f;
        }
        concurrentHashMap.put("userAgent", format);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vvh.k():void");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97ab0468", new Object[0])).booleanValue();
        }
        if (g == null) {
            g = (AccessibilityManager) c().getSystemService("accessibility");
        }
        AccessibilityManager accessibilityManager = g;
        if (accessibilityManager != null) {
            return accessibilityManager.isEnabled();
        }
        return false;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        Application application = f5x.f19038a;
        if (application == null || (application.getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        return true;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc05b28a", new Object[0])).booleanValue();
        }
        return f5x.a().getApplicationContext().getResources().getBoolean(R.bool.mus_is_right_to_left);
    }
}
