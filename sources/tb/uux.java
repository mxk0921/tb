package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class uux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f29626a;
    public static final Map<String, String> b = new HashMap();

    public static String a(Context context) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (context == null) {
                locale = Locale.getDefault();
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            jSONObject.put("locale", vux.h(locale.toString()));
            Map<String, String> c = c(context);
            jSONObject.put("lac", vux.h(c.get("lac")));
            jSONObject.put("cellId", vux.h(c.get("cellId")));
            Map<String, String> d = d(context);
            jSONObject.put("longitude", vux.h(d.get("longitude")));
            jSONObject.put("latitude", vux.h(d.get("latitude")));
            jSONObject.put("locationTimestamp", vux.h(d.get("locationTimestamp")));
            jSONObject.put("locationTimeInterval", vux.h(d.get("locationTimeInterval")));
            HashMap hashMap = new HashMap();
            hashMap.put("wifiName", "-1");
            hashMap.put("wifiMac", "00");
            String str = (String) hashMap.get("wifiName");
            if (!TextUtils.isEmpty(str)) {
                str = str.replaceAll(";", "").replaceAll(f7l.MOD, "");
            }
            jSONObject.put("wifiName", b(str));
            jSONObject.put("wifiMac", b((String) hashMap.get("wifiMac")));
            return jSONObject.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace(f7l.BRACKET_START_STR, "（").replace(f7l.BRACKET_END_STR, "）").replace(";", "；").replace("&", "");
    }

    public static Map<String, String> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7c4b7f4", new Object[]{context});
        }
        Map<String, String> map = b;
        if (((HashMap) map).size() == 0) {
            ((HashMap) map).put("lac", "-1");
            ((HashMap) map).put("cellId", "-1");
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f29626a < 15000) {
            return map;
        }
        f29626a = currentTimeMillis;
        try {
            context.getSystemService("phone");
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageManager.checkPermission(p78.ACCESS_FINE_LOCATION, packageName) != 0) {
                packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packageName);
            }
            ((HashMap) map).put("lac", "-1");
            ((HashMap) map).put("cellId", "-1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public static Map<String, String> d(Context context) {
        PackageManager packageManager;
        String packageName;
        Location location;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("longitude", "-1");
        hashMap.put("latitude", "-1");
        hashMap.put("locationTimestamp", "-1");
        hashMap.put("locationTimeInterval", "-1");
        try {
            packageManager = context.getPackageManager();
            packageName = context.getPackageName();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (packageManager.checkPermission(p78.ACCESS_FINE_LOCATION, packageName) != 0) {
            if (packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packageName) == 0) {
            }
            return hashMap;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null && locationManager.isProviderEnabled("gps")) {
            if (APSecuritySdk.getPermissionInfo() == null || !APSecuritySdk.getPermissionInfo().canGetLocation()) {
                location = null;
            } else {
                location = locationManager.getLastKnownLocation("gps");
                if (location == null && locationManager.isProviderEnabled("network")) {
                    location = locationManager.getLastKnownLocation("network");
                }
            }
            if (location != null) {
                hashMap.put("longitude", String.valueOf(location.getLongitude()));
                hashMap.put("latitude", String.valueOf(location.getLatitude()));
                hashMap.put("locationTimestamp", String.valueOf(location.getTime() / 1000));
                hashMap.put("locationTimeInterval", String.valueOf((SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000));
            }
        }
        return hashMap;
    }
}
