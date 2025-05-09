package tb;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.utils.DisplayUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.intf.Mtop;
import tb.kiq;
import tb.v82;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Application f20278a;
    public static Boolean e;
    public static String f;
    public static Boolean g;
    public static int i;
    public static int j;
    public static final Map<String, String> b = new HashMap();
    public static final Map<String, String> c = new HashMap();
    public static int d = 0;
    public static final Object h = new Object();
    public static boolean k = false;

    static {
        t2o.a(404750530);
        new ConcurrentHashMap();
    }

    public static void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e99893", new Object[0]);
            return;
        }
        synchronized (h) {
            g = null;
        }
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0c3a65d", new Object[0])).booleanValue();
        }
        if (e == null) {
            Boolean valueOf = Boolean.valueOf("1".equals(v82.l("useStringOptimize", "1")));
            e = valueOf;
            TLog.loge("UCP", "stringMemoryOptimizeEnabled", String.valueOf(valueOf));
        }
        return e.booleanValue();
    }

    public static void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b31b82", new Object[0]);
        } else if (k || j == 0) {
            k = false;
            i = DisplayUtil.getScreenWidth(f82.d());
            j = DisplayUtil.getScreenHeight(f82.d());
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28b2bdd0", new Object[0])).booleanValue();
        }
        return "l".equals(mj7.b());
    }

    public static Application c() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0f3b6f", new Object[]{str, str2});
        } else if (v82.c.C()) {
            UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
            Map<String, String> map = b;
            ((HashMap) map).put(str, str2);
            crashCaughtHeader.addHeaderInfo("bhx", d(map));
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276a120d", new Object[]{str, str2});
        } else if (v82.c.C()) {
            ((HashMap) c).put(str, str2);
        }
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3759771c", new Object[]{str});
        }
        if (!v82.h("enableCutUrlScene", true)) {
            return str;
        }
        if (str == null) {
            return null;
        }
        boolean startsWith = str.startsWith("http");
        int indexOf = str.indexOf("?");
        if (!startsWith || indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public static float i(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88b66f1b", new Object[]{new Float(f2)})).floatValue();
        }
        Application d2 = f82.d();
        if (d2 == null) {
            d2 = Globals.getApplication();
        }
        if (d2 == null) {
            return f2;
        }
        return f2 * DisplayUtil.getScreenDensity(Globals.getApplication());
    }

    public static boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4d4c1ba", new Object[]{str, str2})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        boolean startsWith = str2.startsWith(f7l.MOD);
        boolean endsWith = str2.endsWith(f7l.MOD);
        if (startsWith && endsWith && str2.length() > 2) {
            return str.contains(str2.substring(1, str2.length() - 1));
        }
        if (startsWith && str2.length() > 1) {
            return str.endsWith(str2.substring(1));
        }
        if (!endsWith || str2.length() <= 1) {
            return false;
        }
        return str.startsWith(str2.substring(0, str2.length() - 1));
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78d6f860", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Application d2 = f82.d();
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(d2, str + "_android");
            if (!isFeatureOpened) {
                isFeatureOpened = ABGlobal.isFeatureOpened(f82.d(), str);
            }
            if (isFeatureOpened && kiq.SWITCH_NAME.equals(str)) {
                isFeatureOpened = f82.m();
            }
            TLog.loge("UCP", "getABSwitch", str, String.valueOf(isFeatureOpened));
            return isFeatureOpened;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static synchronized Application l() {
        synchronized (gwv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
            }
            if (f20278a == null) {
                f20278a = c();
            }
            return f20278a;
        }
    }

    public static int m() {
        int e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6022b74", new Object[0])).intValue();
        }
        if (kiq.b.sSwitchOpen && (e2 = f82.e()) >= 0) {
            return e2;
        }
        Mtop instance = Mtop.instance(f82.d(), f82.g());
        int envMode = EnvModeEnum.ONLINE.getEnvMode();
        if (instance == null || instance.getMtopConfig() == null) {
            return envMode;
        }
        return instance.getMtopConfig().envMode.getEnvMode();
    }

    public static String n(String str, String str2, String str3, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed665538", new Object[]{str, str2, str3, view});
        }
        String str4 = str + str2 + str3;
        if (view == null || !v82.c.q()) {
            return str4;
        }
        return str4 + view.hashCode();
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f51c39bc", new Object[0]);
        }
        if (!v82.c.C()) {
            return "";
        }
        return d(c);
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c990156", new Object[0]);
        }
        String str = f;
        if (str != null) {
            return str;
        }
        try {
            f = c21.g().getString("launchType", "HOT");
        } catch (Throwable unused) {
            f = "";
        }
        return f;
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84150c09", new Object[0])).intValue();
        }
        if (d == 0 && f82.d() != null) {
            d = b(f82.d());
        }
        return d;
    }

    public static int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        D();
        return j;
    }

    public static int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        D();
        return i;
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db76b8b0", new Object[0]);
        } else {
            k = true;
        }
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4c664ca", new Object[0])).booleanValue();
        }
        synchronized (h) {
            try {
                Boolean bool = g;
                if (bool != null) {
                    return bool.booleanValue();
                }
                g = Boolean.FALSE;
                if (k("bhx_close")) {
                    g = Boolean.TRUE;
                    return true;
                } else if (!k("bhx_closeInLowDevice") || !"l".equals(mj7.b())) {
                    List parseArray = JSON.parseArray(oy8.c().b(v82.ORANGE_GROUP_NAME, "bxCloseDeviceLevel", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264), String.class);
                    if (parseArray == null || !parseArray.contains(mj7.b())) {
                        List parseArray2 = JSON.parseArray(oy8.c().b(v82.ORANGE_GROUP_NAME, "bxCloseDeviceModelV3", "[\"mi8lite\",\"mi8\",\"v1965a\"]"), String.class);
                        if (parseArray2 != null && parseArray2.contains(Build.MODEL.replaceAll("\\s", "").toLowerCase())) {
                            g = Boolean.TRUE;
                        }
                        List parseArray3 = JSON.parseArray(oy8.c().b(v82.ORANGE_GROUP_NAME, "bxCloseDeviceUID", "[\"62277235\"]"), String.class);
                        if (parseArray3 != null && parseArray3.contains(Login.getUserId())) {
                            g = Boolean.TRUE;
                        }
                        return g.booleanValue();
                    }
                    g = Boolean.TRUE;
                    return true;
                } else {
                    g = Boolean.TRUE;
                    return true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e5a2699", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean w(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418630bf", new Object[]{new Double(d2)})).booleanValue();
        }
        if (d2 > Math.random()) {
            return true;
        }
        return false;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba55d363", new Object[0])).booleanValue();
        }
        return "taobao".equals(f82.c());
    }

    public static float y(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3f6f788", new Object[]{new Float(f2)})).floatValue();
        }
        Application d2 = f82.d();
        if (d2 == null) {
            d2 = Globals.getApplication();
        }
        if (d2 == null) {
            return f2;
        }
        return f2 / DisplayUtil.getScreenDensity(Globals.getApplication());
    }

    public static void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fbda040", new Object[]{str});
        } else if (v82.c.C()) {
            ((HashMap) c).remove(str);
        }
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            return point.y * point.x;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean A(double d2, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aed4c440", new Object[]{new Double(d2), new Boolean(z)})).booleanValue();
        }
        try {
            long b2 = dvv.b();
            if (b2 != 0 && d2 > vu3.b.GEO_NOT_SUPPORT && d2 <= 1.0d) {
                if ((b2 + (z ? System.currentTimeMillis() / 86400000 : 0L)) % ((long) (1.0d / d2)) != 0) {
                    z2 = false;
                }
                return z2;
            }
            return false;
        } catch (Throwable th) {
            q82.f("sampleByUserId", null, null, th);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r4.equals("1010") == false) goto L_0x0020;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.gwv.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "cf004686"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case 1507454: goto L_0x0064;
                case 1537215: goto L_0x0059;
                case 1538176: goto L_0x004e;
                case 1539137: goto L_0x0043;
                case 1539138: goto L_0x0038;
                case 1542981: goto L_0x002d;
                case 47007217: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r0 = -1
            goto L_0x006d
        L_0x0022:
            java.lang.String r0 = "19999"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            r0 = 6
            goto L_0x006d
        L_0x002d:
            java.lang.String r0 = "2601"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0036:
            r0 = 5
            goto L_0x006d
        L_0x0038:
            java.lang.String r0 = "2202"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x0020
        L_0x0041:
            r0 = 4
            goto L_0x006d
        L_0x0043:
            java.lang.String r0 = "2201"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0020
        L_0x004c:
            r0 = 3
            goto L_0x006d
        L_0x004e:
            java.lang.String r0 = "2101"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0057
            goto L_0x0020
        L_0x0057:
            r0 = 2
            goto L_0x006d
        L_0x0059:
            java.lang.String r0 = "2001"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0062
            goto L_0x0020
        L_0x0062:
            r0 = 1
            goto L_0x006d
        L_0x0064:
            java.lang.String r1 = "1010"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x006d
            goto L_0x0020
        L_0x006d:
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x007f;
                case 2: goto L_0x007b;
                case 3: goto L_0x0078;
                case 4: goto L_0x0078;
                case 5: goto L_0x0074;
                case 6: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            return r4
        L_0x0071:
            java.lang.String r4 = "custom"
            return r4
        L_0x0074:
            java.lang.String r4 = "scroll"
            return r4
        L_0x0078:
            java.lang.String r4 = "expose"
            return r4
        L_0x007b:
            java.lang.String r4 = "tap"
            return r4
        L_0x007f:
            java.lang.String r4 = "pv"
            return r4
        L_0x0083:
            java.lang.String r4 = "appOut"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gwv.g(java.lang.String):java.lang.String");
    }
}
