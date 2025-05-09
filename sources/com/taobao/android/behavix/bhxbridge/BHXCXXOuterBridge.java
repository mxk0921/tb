package com.taobao.android.behavix.bhxbridge;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.statistic.TBS;
import com.taobao.weex.common.WXConfig;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.abk;
import tb.ai7;
import tb.bjo;
import tb.c21;
import tb.chb;
import tb.f82;
import tb.fvv;
import tb.gwv;
import tb.iaa;
import tb.n78;
import tb.p3v;
import tb.q82;
import tb.s82;
import tb.t1c;
import tb.t2o;
import tb.v7h;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BHXCXXOuterBridge extends BHXCXXBaseBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f6454a = "";
    public static String b = "";

    static {
        t2o.a(404750512);
    }

    public static float a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a93", new Object[]{context, new Integer(i)})).floatValue();
        }
        return ((AudioManager) context.getSystemService("audio")).getStreamVolume(3) / i;
    }

    private static void addCrashInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0f3b6f", new Object[]{str, str2});
        } else {
            gwv.e(str, str2);
        }
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        return ((AudioManager) context.getSystemService("audio")).getStreamMaxVolume(3);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
        if (globalNetworkQuality == 1) {
            return "poor";
        }
        if (globalNetworkQuality == 2) {
            return "normal";
        }
        if (globalNetworkQuality != 3) {
            return "unknown";
        }
        return "excellent";
    }

    private static void commitCountToAppMonitor(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed12f2d", new Object[]{str, str2, str3, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, str3, d);
        }
    }

    public static String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i == 2) {
            return "charging";
        }
        if (i == 3 || i == 4) {
            return "discharging";
        }
        if (i != 5) {
            return "unknown";
        }
        return abk.FROM_FULL;
    }

    public static float e(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0fef", new Object[]{context})).floatValue();
        }
        try {
            i = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Throwable th) {
            q82.c("BHXCXXOuterBridge_getScreenBrightness_error", "getScreenBrightness", "502", th.getMessage(), null);
            i = -255;
        }
        return i / 255.0f;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (context == null) {
            return -1;
        }
        try {
            return ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
        } catch (Throwable th) {
            q82.c("BHXCXXOuterBridge_getBatteryLevel_error", "getBatteryLevel", "502", th.getMessage(), null);
            return -1;
        }
    }

    public static String getDeviceInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd8c2900", new Object[0]);
        }
        try {
            chb g = c21.g();
            int i = g.getInt("deviceLevel", -1);
            String str = "high";
            if (i != 0) {
                if (i == 1) {
                    str = "medium";
                } else if (i == 2) {
                    str = "low";
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceLevel", (Object) str);
            jSONObject.put(WXConfig.deviceHeight, (Object) Float.valueOf(g.getFloat(ai7.KEY_DISPLAY_HEIGHT, 0.0f)));
            jSONObject.put(WXConfig.deviceWidth, (Object) Float.valueOf(g.getFloat(ai7.KEY_DISPLAY_WIDTH, 0.0f)));
            jSONObject.put("netStatus", (Object) v7h.j());
            jSONObject.put("bandWidth", (Object) Double.valueOf(NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth()));
            jSONObject.put("predictBandWidth", (Object) Double.valueOf(NetworkQualityMonitor.getInstance().getGlobalPredictBandWidth()));
            jSONObject.put("netLevel", (Object) c());
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            String str2 = "";
            if (TextUtils.isEmpty(globalProperty)) {
                globalProperty = str2;
            }
            jSONObject.put("afcId", (Object) globalProperty);
            try {
                str2 = ((t1c) n78.a(t1c.class)).queryCurrentVersionInfo().c;
            } catch (Throwable unused) {
            }
            jSONObject.put("versionCode", (Object) str2);
            if (v82.c.g()) {
                int b2 = b(f82.d());
                jSONObject.put(bjo.BATTERY_CAPACITY, (Object) Integer.valueOf(f(f82.d())));
                jSONObject.put("batteryState", (Object) g(f82.d()));
                jSONObject.put("screenBrightness", (Object) Float.valueOf(e(f82.d())));
                jSONObject.put("mediaVolume", (Object) Float.valueOf(a(f82.d(), b2)));
                jSONObject.put("maxMediaVolume", (Object) Integer.valueOf(b2));
                jSONObject.put("hasJD", (Object) h());
                jSONObject.put("hasPDD", (Object) i());
            }
            return jSONObject.toJSONString();
        } catch (Exception e) {
            q82.f("BHXCXXOuterBridge_getDeviceInfos_error", null, null, e);
            return "{}";
        }
    }

    public static String getPushFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8357d73", new Object[0]);
        }
        try {
            if (f82.d() == null) {
                return "";
            }
            boolean areNotificationsEnabled = NotificationManagerCompat.from(f82.d()).areNotificationsEnabled();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stateName", (Object) "all_us_push_int");
            jSONObject.put("bizName", (Object) "BehaviX");
            jSONObject.put("result", (Object) Integer.valueOf(areNotificationsEnabled ? 1 : 0));
            jSONObject.put("stateType", (Object) "DEVICE_INFO");
            jSONObject.put("userId", (Object) iaa.f21189a);
            jSONObject.put("periodSessionId", (Object) s82.a().b());
            jSONObject.put("createTime", (Object) Long.valueOf(System.currentTimeMillis()));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("table_name", (Object) "bx_open_user_state");
            jSONObject2.put("write_table_info", (Object) jSONObject);
            return jSONObject2.toJSONString();
        } catch (Exception e) {
            q82.f("BHXCXXOuterBridge_getPushFeature_error", null, null, e);
            return "";
        }
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (f82.d() == null) {
            return "unknown";
        }
        if (TextUtils.isEmpty(b)) {
            b = j(f82.d(), "com.jingdong.app.mall");
        }
        return b;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        if (f82.d() == null) {
            return "unknown";
        }
        if (TextUtils.isEmpty(f6454a)) {
            f6454a = j(f82.d(), "com.xunmeng.pinduoduo");
        }
        return f6454a;
    }

    public static void interdictReceivingEventsForMock(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ee89e1", new Object[]{new Boolean(z)});
            return;
        }
        v82.u(z);
        if (z) {
            fvv.m();
        } else {
            p3v.getInstance().registerListener(fvv.k());
        }
    }

    public static /* synthetic */ Object ipc$super(BHXCXXOuterBridge bHXCXXOuterBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/bhxbridge/BHXCXXOuterBridge");
    }

    private static void reportErrorMsgToUmbrella(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2589af", new Object[]{str, str2, str3, str4, str5, str6});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("userData", str6);
        q82.e(str2, "", hashMap, str4, str5);
    }

    public static void uploadDataToCttp(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b793658", new Object[]{str, str2, str3});
        } else if (str != null && !TextUtils.isEmpty(str2)) {
            uploadDataToUT("Mobile_Intelligent", UtUtils.CHANGED_UPP_EVENT_ID, "BehaviX", str, str2, "BehaviData=" + URLEncoder.encode(str3));
        }
    }

    private static void uploadDataToUT(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e311d5", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
        } catch (Exception e) {
            q82.f("BHXCXXOuterBridge_uploadDataToUT_error", null, null, e);
        }
    }

    public static String g(Context context) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        try {
        } catch (Throwable th) {
            q82.c("BHXCXXOuterBridge_getBatteryStatus_error", "getBatteryStatus", "502", th.getMessage(), null);
        }
        if (context == null) {
            return d(1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(6);
        }
        return d(i);
    }

    public static String j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e66e2bf8", new Object[]{context, str});
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return Constants.VAL_YES;
        } catch (PackageManager.NameNotFoundException unused) {
            return "no";
        }
    }
}
