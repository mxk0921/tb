package tb;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.c;
import java.io.File;
import java.util.Calendar;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v7h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HARDWARE_INFO_FEATURE = "all_df_hardware_info_json";
    public static final String HARDWARE_STATUS_FEATURE = "all_df_hardware_status_json";
    public static final String LIGHT_SENSOR_FEATURE = "all_df_light_sensor_lstf";
    public static final String TIME_SPARSE_FEATURE = "all_df_time_sparse_json";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f29836a;
    public static int b = 0;
    public static double c = vu3.b.GEO_NOT_SUPPORT;
    public static SensorManager d;
    public static b e;
    public static Sensor f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements SensorEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static float f29837a = -1.0f;

        static {
            t2o.a(404750613);
        }

        public b() {
        }

        public static /* synthetic */ JSONArray b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("b55d709b", new Object[]{bVar});
            }
            return bVar.a();
        }

        public final JSONArray a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this});
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(Float.valueOf(f29837a));
            return jSONArray;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
                return;
            }
            int i = sensorEvent.accuracy;
            f29837a = sensorEvent.values[0];
            v7h.c().unregisterListener(v7h.a(), v7h.b());
        }
    }

    static {
        t2o.a(404750611);
    }

    public static /* synthetic */ b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("eda80149", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ Sensor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sensor) ipChange.ipc$dispatch("1e5164f9", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ SensorManager c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SensorManager) ipChange.ipc$dispatch("e2a7ec2f", new Object[0]);
        }
        return d;
    }

    public static String e() {
        Throwable th;
        NetworkInfo activeNetworkInfo;
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        try {
            if (f82.d() == null || (activeNetworkInfo = ((ConnectivityManager) f82.d().getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return str2;
            }
            if ("WIFI".equalsIgnoreCase(activeNetworkInfo.getTypeName())) {
                return "WIFI";
            }
            if (!TextUtils.isEmpty(activeNetworkInfo.getSubtypeName())) {
                str = activeNetworkInfo.getSubtypeName();
            } else if (activeNetworkInfo.getSubtype() == 16) {
                str = NetUtil.TYPE_GSM;
            } else if (activeNetworkInfo.getSubtype() == 17) {
                str = NetUtil.TYPE_TD_CDMA;
            } else if (activeNetworkInfo.getSubtype() == 18) {
                str = NetUtil.TYPE_TDS_HSDPSA;
            } else {
                str = activeNetworkInfo.getSubtype() == 19 ? NetUtil.TYPE_TDS_HSUPA : str2;
            }
            try {
                if (str.equals(str2) || TextUtils.isEmpty(activeNetworkInfo.getExtraInfo())) {
                    return str;
                }
                return str + "|" + activeNetworkInfo.getExtraInfo();
            } catch (Throwable th2) {
                th = th2;
                str2 = str;
                q82.f("LocalFeature.getNetworkType", null, null, th);
                return str2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue();
        }
        try {
            if (f82.d() == null) {
                return -1;
            }
            return Settings.System.getInt(f82.d().getContentResolver(), "screen_brightness");
        } catch (Throwable th) {
            q82.f("LocalFeature.getScreenBrightness", null, null, th);
            return -1;
        }
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue();
        }
        if (b == 0) {
            b = Runtime.getRuntime().availableProcessors();
        }
        return b;
    }

    public static JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("95c712d1", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phone_brand", (Object) Build.BRAND);
        jSONObject.put("phone_model", (Object) Build.MODEL);
        jSONObject.put("platform", (Object) "android");
        jSONObject.put("platform_version", (Object) Build.VERSION.RELEASE);
        return jSONObject;
    }

    public static JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("148b9c8d", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_root", (Object) Boolean.valueOf(d()));
        jSONObject.put("network", (Object) e());
        jSONObject.put("screen_brightness", (Object) Integer.valueOf(f()));
        jSONObject.put("cpu_core", (Object) Integer.valueOf(g()));
        jSONObject.put("total_rom_size_gb", (Object) Double.valueOf(m()));
        return jSONObject;
    }

    public static String j() {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6300b76f", new Object[0]);
        }
        Application d2 = f82.d();
        if (d2 == null || (activeNetworkInfo = ((ConnectivityManager) d2.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return "";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == 20) {
                return "";
            }
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2g";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3g";
                case 13:
                    return "4g";
            }
        } else if (type == 1) {
            return "wifi";
        }
        return "unknown";
    }

    public static JSONArray k(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("65d1978c", new Object[]{str});
        }
        if (!str.equals(LIGHT_SENSOR_FEATURE) || (bVar = e) == null) {
            return new JSONArray();
        }
        return b.b(bVar);
    }

    public static JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c9ad945a", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_stamp", (Object) Long.valueOf(System.currentTimeMillis()));
        Calendar instance = Calendar.getInstance();
        jSONObject.put("year", (Object) Integer.valueOf(instance.get(1)));
        jSONObject.put(UiUtil.INPUT_TYPE_VALUE_MONTH, (Object) Integer.valueOf(instance.get(2) + 1));
        jSONObject.put(APower.e.KEY_DAY, (Object) Integer.valueOf(instance.get(5)));
        jSONObject.put("hour", (Object) Integer.valueOf(instance.get(11)));
        jSONObject.put("minute", (Object) Integer.valueOf(instance.get(12)));
        jSONObject.put(c.LOCATION_SECOND, (Object) Integer.valueOf(instance.get(13)));
        jSONObject.put("week_seq", (Object) Integer.valueOf(instance.get(4)));
        return jSONObject;
    }

    public static double m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10dd", new Object[0])).doubleValue();
        }
        double d2 = c;
        if (d2 > vu3.b.GEO_NOT_SUPPORT) {
            return d2;
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            c = Math.round(((((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1024.0d) / 1024.0d) / 1024.0d) * 1000.0d) / 1000.0d;
        } catch (Throwable th) {
            q82.f("LocalFeature.getTotalROMSizeGB", null, null, th);
        }
        return c;
    }

    public static void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1525dc", new Object[]{str});
            return;
        }
        if (d == null && f82.d() != null) {
            d = (SensorManager) f82.d().getSystemService(APower.TYPE_SENSOR);
        }
        if (str.equals(LIGHT_SENSOR_FEATURE)) {
            Sensor defaultSensor = d.getDefaultSensor(5);
            f = defaultSensor;
            if (defaultSensor != null) {
                b bVar = new b();
                e = bVar;
                d.registerListener(bVar, f, 0);
            }
        }
    }

    public static boolean d() {
        boolean z = false;
        Boolean bool = f29836a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if (!"0".equals((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, "ro.secure", null))) {
                String[] strArr = {"/system/bin/su", "/system/xbin/su", "/system/sbin/su", "/sbin/su", "/vendor/bin/su"};
                for (int i = 0; i < 5; i++) {
                    File file = new File(strArr[i]);
                    if (file.exists() && file.isFile()) {
                        f29836a = Boolean.TRUE;
                        break;
                    }
                }
            } else {
                f29836a = Boolean.TRUE;
            }
        } catch (Throwable th) {
            q82.f("LocalFeature.isDeviceRooted", null, null, th);
        }
        if (f29836a != null) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f29836a = valueOf;
        return valueOf.booleanValue();
    }
}
