package com.taobao.weex.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXConfigAdapter;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.t2o;
import tb.vu3;
import tb.xpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char PERCENT = '%';

    /* renamed from: a  reason: collision with root package name */
    public static Pattern f14152a;
    public static final LruCache<String, Integer> sCache = new LruCache<>(64);
    public static final long b = System.currentTimeMillis() - SystemClock.uptimeMillis();
    public static final int c = new Random().nextInt(100);

    static {
        t2o.a(985661832);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16353cbc", new Object[0])).booleanValue();
        }
        return "true".equals(getConfig("android_weex_common_config", "enable_weex_downgrade", "false"));
    }

    public static Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d258bd2c", new Object[0]);
        }
        try {
            return Integer.valueOf(Integer.parseInt(getConfig("android_weex_common_config", "weex_downgrade_rate", "-1")));
        } catch (Throwable th) {
            WXLogUtils.e("TBWeexConfigUtils", th);
            return -1;
        }
    }

    public static int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a912f5ac", new Object[]{str, new Integer(i)})).intValue();
        }
        int indexOf = str.indexOf("\r", i);
        if (indexOf == -1) {
            indexOf = str.indexOf("\n", i);
        }
        if (indexOf == -1) {
            return str.indexOf("\r\n", i);
        }
        return indexOf;
    }

    public static boolean checkForceDowngrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d73a07", new Object[]{str})).booleanValue();
        }
        if (!a() || c > b().intValue()) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return !g(Uri.parse(str).buildUpon().clearQuery().build().toString());
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean checkGreyConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b4b412", new Object[]{str, str2, str3})).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter == null) {
            return false;
        }
        double d = 100.0d;
        double random = Math.random() * 100.0d;
        try {
            d = Double.valueOf(wxConfigAdapter.getConfig(str, str2, str3)).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (random < d) {
            return true;
        }
        return false;
    }

    public static void commitComponentInvoke(String str, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8378e5f", new Object[]{str, wXSDKInstance});
            return;
        }
        IWXUserTrackAdapter iWXUserTrackAdapter = WXSDKManager.getInstance().getIWXUserTrackAdapter();
        if (iWXUserTrackAdapter != null && wXSDKInstance != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("containerType", "weex");
            hashMap.put("component", str);
            if (!TextUtils.isEmpty(wXSDKInstance.getBundleUrl())) {
                Uri parse = Uri.parse(wXSDKInstance.getBundleUrl());
                if (parse != null) {
                    try {
                        hashMap.put("bizId", parse.buildUpon().clearQuery().build().toString());
                    } catch (Throwable th) {
                        WXLogUtils.e(xpc.RECORD_CALLMODULEMETHOD, th.getMessage());
                        hashMap.put("bizId", "unknown");
                    }
                }
            } else {
                hashMap.put("bizId", "unknown");
            }
            iWXUserTrackAdapter.commit(wXSDKInstance.getContext(), null, "WeexComponent", null, hashMap);
        }
    }

    public static int d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461c5433", new Object[]{str, new Integer(i)})).intValue();
        }
        return (int) ((Float.parseFloat(str) / 100.0f) * i);
    }

    public static boolean disableBuildVersionFix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43b33c2e", new Object[0])).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter != null) {
            return Boolean.parseBoolean(wxConfigAdapter.getConfig("android_weex_common_config", "disableBuildVersionFix", "false"));
        }
        return false;
    }

    public static String[] e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5e1b5a91", new Object[]{str});
        }
        String[] split = str.split("\r");
        if (split.length == 1) {
            split = str.split("\n");
        }
        if (split.length == 1) {
            return str.split("\r\n");
        }
        return split;
    }

    public static boolean enableScreenChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c1993e", new Object[0])).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter != null) {
            return Boolean.parseBoolean(wxConfigAdapter.getConfig("android_weex_common_config", "enableScreenChangeListener", "true"));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
        return r4 * (-1.0f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float fastGetFloat(java.lang.String r11, int r12) {
        /*
            r0 = 48
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.weex.utils.WXUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0023
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r1] = r11
            r12[r2] = r0
            java.lang.String r11 = "4a337b20"
            java.lang.Object r11 = r3.ipc$dispatch(r11, r12)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            return r11
        L_0x0023:
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            r4 = 0
            if (r3 != 0) goto L_0x0090
            char r3 = r11.charAt(r1)
            r5 = 45
            if (r3 != r5) goto L_0x0035
            r3 = 1
            r5 = 0
            goto L_0x0042
        L_0x0035:
            char r3 = r11.charAt(r1)
            r5 = 43
            if (r3 != r5) goto L_0x0040
            r3 = 1
        L_0x003e:
            r5 = 1
            goto L_0x0042
        L_0x0040:
            r3 = 0
            goto L_0x003e
        L_0x0042:
            int r6 = r11.length()
            r7 = 57
            if (r3 >= r6) goto L_0x005d
            char r6 = r11.charAt(r3)
            if (r6 < r0) goto L_0x005d
            if (r6 > r7) goto L_0x005d
            r7 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 * r7
            float r6 = (float) r6
            float r4 = r4 + r6
            r6 = 1111490560(0x42400000, float:48.0)
            float r4 = r4 - r6
            int r3 = r3 + r2
            goto L_0x0042
        L_0x005d:
            int r6 = r11.length()
            if (r3 >= r6) goto L_0x008a
            char r6 = r11.charAt(r3)
            r8 = 46
            if (r6 != r8) goto L_0x008a
            int r3 = r3 + r2
            r6 = 10
            r8 = 10
        L_0x0070:
            int r9 = r11.length()
            if (r3 >= r9) goto L_0x008a
            if (r1 >= r12) goto L_0x008a
            char r9 = r11.charAt(r3)
            if (r9 < r0) goto L_0x008a
            if (r9 > r7) goto L_0x008a
            int r9 = r9 - r0
            float r9 = (float) r9
            float r10 = (float) r8
            float r9 = r9 / r10
            float r4 = r4 + r9
            int r8 = r8 * 10
            int r3 = r3 + r2
            int r1 = r1 + r2
            goto L_0x0070
        L_0x008a:
            if (r5 != 0) goto L_0x0090
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r11
        L_0x0090:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.utils.WXUtils.fastGetFloat(java.lang.String, int):float");
    }

    public static boolean forceInitCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffc348b", new Object[0])).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter != null) {
            return Boolean.parseBoolean(wxConfigAdapter.getConfig("android_weex_common_config", "forceInitCallback", "false"));
        }
        return false;
    }

    public static long getAvailMemory(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d2775bb", new Object[]{context})).longValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        WXLogUtils.w("app AvailMemory ---->>>" + (memoryInfo.availMem / 1048576));
        return memoryInfo.availMem / 1048576;
    }

    public static Boolean getBoolean(Object obj, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8e5b7995", new Object[]{obj, bool});
        }
        if (obj == null) {
            return bool;
        }
        if (TextUtils.equals("false", obj.toString())) {
            return Boolean.FALSE;
        }
        return TextUtils.equals("true", obj.toString()) ? Boolean.TRUE : bool;
    }

    public static String getBundleBanner(String str) {
        int i;
        int c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae80b4eb", new Object[]{str});
        }
        int indexOf = str.indexOf("/*!");
        if (indexOf == -1 || (c2 = c(str, (i = indexOf + 3))) == -1) {
            return null;
        }
        int i2 = c2 + 1;
        String substring = str.substring(i2, Integer.parseInt(str.substring(i, c2)) + i2);
        int lastIndexOf = substring.lastIndexOf("!*/");
        if (lastIndexOf == -1) {
            return null;
        }
        String substring2 = substring.substring(0, lastIndexOf);
        StringBuilder sb = new StringBuilder();
        for (String str2 : e(substring2)) {
            sb.append(str2.replaceFirst("\\*", ""));
        }
        return sb.toString();
    }

    public static String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{str, str2, str3});
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter != null) {
            return wxConfigAdapter.getConfig(str, str2, str3);
        }
        return str3;
    }

    public static long getFixUnixTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e59b18ef", new Object[0])).longValue() : b + SystemClock.uptimeMillis();
    }

    public static float getFloat(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19eb28b9", new Object[]{obj})).floatValue() : getFloat(obj, Float.valueOf(Float.NaN)).floatValue();
    }

    public static int getInt(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79d4088f", new Object[]{obj})).intValue();
        }
        return getInteger(obj, 0).intValue();
    }

    public static int getNumberInt(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a96ab83", new Object[]{obj, new Integer(i)})).intValue();
        }
        if (obj == null) {
            return i;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            String obj2 = obj.toString();
            if (obj2.indexOf(46) >= 0) {
                return (int) Float.parseFloat(obj.toString());
            }
            return Integer.parseInt(obj2);
        } catch (Exception unused) {
            return i;
        }
    }

    public static String getString(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cf3bb6c", new Object[]{obj, str});
        }
        if (obj == null) {
            return str;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj.toString();
    }

    @Deprecated
    public static boolean isTabletDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28591831", new Object[0])).booleanValue();
        }
        try {
            if ((WXEnvironment.getApplication().getResources().getConfiguration().screenLayout & 15) >= 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isUiThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98bb3193", new Object[0])).booleanValue();
        }
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            return true;
        }
        return false;
    }

    public static boolean isUndefined(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("711fec97", new Object[]{new Float(f)})).booleanValue();
        }
        return Float.isNaN(f);
    }

    public static float parseFloat(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8c56b3c", new Object[]{obj})).floatValue() : parseFloat(String.valueOf(obj));
    }

    public static int parseInt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19d449c0", new Object[]{str})).intValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && !str.contains(".")) {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.e(WXLogUtils.getStackTrace(e));
            }
        }
        return 0;
    }

    public static int parseUnitOrPercent(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("634b525a", new Object[]{str, new Integer(i)})).intValue();
        }
        int lastIndexOf = str.lastIndexOf(37);
        if (lastIndexOf != -1) {
            return d(str.substring(0, lastIndexOf), i);
        }
        return parseInt(str);
    }

    public static String transformRGB(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de4d7d4e", new Object[]{str});
        }
        if (f14152a == null) {
            f14152a = Pattern.compile("([rR][gG][bB][aA]?)\\((\\d+\\s*),\\s*(\\d+\\s*),\\s*(\\d+\\s*)(?:,\\s*(\\d+(?:\\.\\d+)?))?\\)");
        }
        Matcher matcher = f14152a.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            str = str.replace(group, "#" + String.format("%8s", Integer.toHexString(WXResourceUtils.getColor(group, -16777216))).replaceAll("\\s", "0"));
        }
        return str;
    }

    public static float f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e54424d6", new Object[]{str, new Integer(i)})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        if (str.endsWith("wx")) {
            str = str.substring(0, str.indexOf("wx"));
        }
        return ((WXEnvironment.sApplication.getResources().getDisplayMetrics().density * Float.parseFloat(str)) * i) / WXViewUtils.getScreenWidth();
    }

    @Deprecated
    public static double getDouble(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca0c4018", new Object[]{obj})).doubleValue();
        }
        if (obj == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("wx")) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.w("the value of " + obj + " use wx unit, which will be not supported soon after.");
            }
            try {
                return f(trim, 750);
            } catch (NumberFormatException e) {
                WXLogUtils.e("Argument format error! value is " + obj, e);
            } catch (Exception e2) {
                WXLogUtils.e("Argument error! value is " + obj, e2);
            }
        } else if (trim.endsWith("px")) {
            try {
                return Double.parseDouble(trim.substring(0, trim.indexOf("px")));
            } catch (NumberFormatException e3) {
                WXLogUtils.e("Argument format error! value is " + obj, e3);
            } catch (Exception e4) {
                WXLogUtils.e("Argument error! value is " + obj, e4);
            }
        } else {
            try {
                return Double.parseDouble(trim);
            } catch (NumberFormatException e5) {
                WXLogUtils.e("Argument format error! value is " + obj, e5);
            } catch (Exception e6) {
                WXLogUtils.e("Argument error! value is " + obj, e6);
            }
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    public static long getFixUnixTime(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cdc87d1d", new Object[]{new Long(j)})).longValue() : b + j;
    }

    public static Float getFloat(Object obj, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("31fbba79", new Object[]{obj, f});
        }
        if (obj == null) {
            return f;
        }
        String trim = obj.toString().trim();
        if (!"auto".equals(trim) && !"undefined".equals(trim) && !TextUtils.isEmpty(trim)) {
            if (trim.endsWith("wx")) {
                try {
                    return Float.valueOf(f(trim, 750));
                } catch (NumberFormatException e) {
                    WXLogUtils.e("Argument format error! value is " + obj, e);
                } catch (Exception e2) {
                    WXLogUtils.e("Argument error! value is " + obj, e2);
                }
            } else if (trim.endsWith("px")) {
                try {
                    return Float.valueOf(Float.parseFloat(trim.substring(0, trim.indexOf("px"))));
                } catch (NumberFormatException e3) {
                    WXLogUtils.e("Argument format error! value is " + obj, e3);
                } catch (Exception e4) {
                    WXLogUtils.e("Argument error! value is " + obj, e4);
                }
            } else {
                try {
                    return Float.valueOf(Float.parseFloat(trim));
                } catch (NumberFormatException e5) {
                    WXLogUtils.e("Argument format error! value is " + obj, e5);
                } catch (Exception e6) {
                    WXLogUtils.e("Argument error! value is " + obj, e6);
                }
            }
        }
        return f;
    }

    public static float getFloatByViewport(WXSDKInstance wXSDKInstance, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e503dd3", new Object[]{wXSDKInstance, obj, new Integer(i)})).floatValue();
        }
        if (obj == null) {
            return Float.NaN;
        }
        String trim = obj.toString().trim();
        if (!"auto".equals(trim) && !"undefined".equals(trim) && !TextUtils.isEmpty(trim)) {
            if (trim.endsWith("wx")) {
                try {
                    return f(trim, i);
                } catch (NumberFormatException e) {
                    WXLogUtils.e("Argument format error! value is " + obj, e);
                } catch (Exception e2) {
                    WXLogUtils.e("Argument error! value is " + obj, e2);
                }
            } else if (trim.endsWith("px")) {
                try {
                    return Float.parseFloat(trim.substring(0, trim.indexOf("px")));
                } catch (NumberFormatException e3) {
                    WXLogUtils.e("Argument format error! value is " + obj, e3);
                } catch (Exception e4) {
                    WXLogUtils.e("Argument error! value is " + obj, e4);
                }
            } else {
                try {
                    return Float.parseFloat(trim);
                } catch (NumberFormatException e5) {
                    WXLogUtils.e("Argument format error! value is " + obj, e5);
                } catch (Exception e6) {
                    WXLogUtils.e("Argument error! value is " + obj, e6);
                }
            }
        }
        return Float.NaN;
    }

    @Deprecated
    public static long getLong(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23c88e09", new Object[]{obj})).longValue();
        }
        if (obj == null) {
            return 0L;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("wx")) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.w("the value of " + obj + " use wx unit, which will be not supported soon after.");
            }
            try {
                return f(trim, 750);
            } catch (NumberFormatException e) {
                WXLogUtils.e("Argument format error! value is " + obj, e);
            } catch (Exception e2) {
                WXLogUtils.e("Argument error! value is " + obj, e2);
            }
        } else if (trim.endsWith("px")) {
            try {
                return Long.parseLong(trim.substring(0, trim.indexOf("px")));
            } catch (NumberFormatException e3) {
                WXLogUtils.e("Argument format error! value is " + obj, e3);
            } catch (Exception e4) {
                WXLogUtils.e("Argument error! value is " + obj, e4);
            }
        } else {
            try {
                return Long.parseLong(trim);
            } catch (NumberFormatException e5) {
                WXLogUtils.e("Argument format error! value is " + obj, e5);
            } catch (Exception e6) {
                WXLogUtils.e("Argument error! value is " + obj, e6);
            }
        }
        return 0L;
    }

    public static float parseFloat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646a52a", new Object[]{str})).floatValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "null")) {
                return Float.parseFloat(str);
            }
            if (!WXEnvironment.isApkDebugable()) {
                return 0.0f;
            }
            WXLogUtils.e("WXUtils parseFloat illegal value is " + str);
            return 0.0f;
        } catch (NumberFormatException e) {
            if (!WXEnvironment.isApkDebugable()) {
                return 0.0f;
            }
            WXLogUtils.e(WXLogUtils.getStackTrace(e));
            return 0.0f;
        }
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a6ea3f1", new Object[]{str})).booleanValue();
        }
        try {
            Iterator<Object> it = JSON.parseArray(getConfig("android_weex_common_config", "weex_downgrade_blacklist", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)).iterator();
            while (it.hasNext()) {
                if (str.contains(String.valueOf(it.next()))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            WXLogUtils.e("TBWeexConfigUtils", th);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    public static Integer getInteger(Object obj, Integer num) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cedf6113", new Object[]{obj, num});
        }
        if (obj == null) {
            return num;
        }
        String trim = obj.toString().trim();
        Integer num2 = sCache.get(trim);
        if (num2 != null) {
            return num2;
        }
        if (trim.length() >= 2) {
            str = trim.substring(trim.length() - 2, trim.length());
        } else {
            str = "";
        }
        if (TextUtils.equals("wx", str)) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.w("the value of " + obj + " use wx unit, which will be not supported soon after.");
            }
            try {
                obj = Integer.valueOf((int) f(trim, 750));
            } catch (NumberFormatException e) {
                WXLogUtils.e("Argument format error! value is " + obj, e);
            } catch (Exception e2) {
                WXLogUtils.e("Argument error! value is " + obj, e2);
            }
        } else if (TextUtils.equals("px", str)) {
            try {
                String substring = trim.substring(0, trim.length() - 2);
                if (TextUtils.isEmpty(substring) || !substring.contains(".")) {
                    obj = Integer.valueOf(Integer.parseInt(substring));
                } else {
                    obj = Integer.valueOf((int) parseFloat(substring));
                }
            } catch (NumberFormatException e3) {
                WXLogUtils.e("Argument format error! value is " + obj, e3);
            } catch (Exception e4) {
                WXLogUtils.e("Argument error! value is " + obj, e4);
            }
        } else {
            try {
            } catch (NumberFormatException e5) {
                if (WXEnvironment.isApkDebugable()) {
                    WXLogUtils.w("The parameter format is not supported", e5);
                }
            } catch (Exception e6) {
                WXLogUtils.e("Argument error! value is " + obj, e6);
            }
            if (TextUtils.isEmpty(trim)) {
                if (WXEnvironment.isApkDebugable()) {
                    WXLogUtils.e("Argument value is null, df is" + num);
                }
                obj = num;
            } else if (trim.contains(".")) {
                obj = Integer.valueOf((int) parseFloat(trim));
            } else {
                obj = Integer.valueOf(Integer.parseInt(trim));
            }
        }
        if (obj != null && !obj.equals(num)) {
            sCache.put(trim, obj);
        }
        return obj;
    }

    public static int parseInt(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc530fd2", new Object[]{obj})).intValue() : parseInt(String.valueOf(obj));
    }

    public static float fastGetFloat(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("264be23", new Object[]{str})).floatValue() : fastGetFloat(str, Integer.MAX_VALUE);
    }
}
