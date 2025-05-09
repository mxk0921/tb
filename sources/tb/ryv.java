package tb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ryv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_AP_FULL_SIZE = 375;
    public static final int DEFAULT_VISION_SIZE = 750;

    static {
        t2o.a(758120586);
    }

    public static void A(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f028cc84", new Object[]{activity, new Integer(i), new Boolean(z)});
        } else {
            vwo.n(activity, i, z);
        }
    }

    public static void B(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9e9b3b", new Object[]{activity});
        } else {
            vwo.p(activity);
        }
    }

    public static Map<String, String> C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6f74632c", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        for (String str2 : str.split(",")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }

    public static void D(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a911bcd", new Object[]{context, broadcastReceiver});
        } else {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
        }
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abda1bc1", new Object[]{new Float(f)})).intValue();
        }
        return b(Globals.getApplication(), f);
    }

    public static int b(Context context, float f) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5beac9d", new Object[]{context, new Float(f)})).intValue();
        }
        if (f <= 0.0f) {
            return 0;
        }
        float f2 = f * context.getResources().getDisplayMetrics().widthPixels * 1.0f;
        if (!t(context)) {
            i = 375;
        } else {
            i = 750;
        }
        return Math.round(f2 / i);
    }

    public static void c(Activity activity) {
        int n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3159b919", new Object[]{activity});
        } else if (activity != null && (n = n(activity, "abc_slide_out_bottom")) != 0) {
            activity.overridePendingTransition(17432576, n);
        }
    }

    public static void d(Activity activity) {
        int n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85ecc6e", new Object[]{activity});
        } else if (activity != null && (n = n(activity, "abc_slide_in_bottom")) != 0) {
            activity.overridePendingTransition(n, 17432577);
        }
    }

    public static int e(String str, String str2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee7f38de", new Object[]{str, str2})).intValue();
        }
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf == -1) {
                return i2;
            }
            i = indexOf + str2.length();
            i2++;
        }
    }

    public static int f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88b66f1e", new Object[]{new Float(f)})).intValue();
        }
        return a65.a(f);
    }

    public static int g(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{context, new Float(f)})).intValue();
        }
        return a65.a(f);
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bb467c", new Object[]{context})).booleanValue();
        }
        String str = Build.MANUFACTURER;
        String o = o("dark_mode_black_brands", "huawei, honor");
        if (str == null || o == null || !o.contains(str.toLowerCase())) {
            return true;
        }
        return false;
    }

    public static int j(boolean z, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f23d607", new Object[]{new Boolean(z), str, str2, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!z) {
            str = str2;
        }
        if (!z) {
            i = i2;
        }
        return krq.e(str, i);
    }

    public static int k(Context context, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3102e49", new Object[]{context, new Integer(i)})).intValue();
        }
        if (r(context)) {
            i2 = vwo.e(context);
        } else {
            i2 = l(context);
        }
        return (int) ((i / 1624.0d) * i2);
    }

    public static int m(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a6b1fa7", new Object[]{context, new Float(f)})).intValue();
        }
        return Math.round(((context.getResources().getDisplayMetrics().widthPixels * 1.0f) / 750.0f) * f);
    }

    public static int n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0dea88c", new Object[]{context, str})).intValue();
        }
        return context.getResources().getIdentifier(str, "anim", context.getPackageName());
    }

    public static String o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("tb_ratepublish_android", str, "");
            return TextUtils.isEmpty(config) ? str2 : config;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f50167c", new Object[]{context})).booleanValue();
        }
        if (!h(context) || context == null || context.getResources() == null || context.getResources().getConfiguration() == null || (context.getResources().getConfiguration().uiMode & 48) != 32) {
            return false;
        }
        return true;
    }

    public static boolean q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{context})).booleanValue();
        }
        return TBDeviceUtils.p(context);
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b55c22bc", new Object[]{context})).booleanValue();
        }
        if (t(context) || q(context)) {
            return true;
        }
        return false;
    }

    public static boolean s() {
        EnvModeEnum envModeEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6834039f", new Object[0])).booleanValue();
        }
        MtopConfig mtopConfig = Mtop.instance((String) null, Globals.getApplication()).getMtopConfig();
        if (mtopConfig == null || (envModeEnum = mtopConfig.envMode) == null || envModeEnum != EnvModeEnum.PREPARE) {
            return false;
        }
        return true;
    }

    public static boolean t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f374103f", new Object[]{context})).booleanValue();
        }
        return TBDeviceUtils.P(context);
    }

    public static String u(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f330f914", new Object[]{map});
        }
        return v(map, "=", ";");
    }

    public static String v(Map<String, String> map, String str, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc3de480", new Object[]{map, str, str2});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z) {
                sb.append(str2);
            }
            sb.append(entry.getKey());
            sb.append(str);
            sb.append(entry.getValue());
            z = false;
        }
        return sb.toString();
    }

    public static void w(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63b606", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            Set<String> keySet = jSONObject.keySet();
            if (!uz3.a(keySet)) {
                for (String str : keySet) {
                    jSONObject2.put(str, jSONObject.get(str));
                }
            }
        }
    }

    public static Map<String, String> x(Uri uri) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1ec7b34f", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (!(uri == null || (queryParameterNames = uri.getQueryParameterNames()) == null || queryParameterNames.size() == 0)) {
            for (String str : queryParameterNames) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static void y(Context context, BroadcastReceiver broadcastReceiver, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c287c07e", new Object[]{context, broadcastReceiver, str});
        } else {
            LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, new IntentFilter(str));
        }
    }

    public static void z(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b73e72b", new Object[]{context, intent});
        } else {
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }

    public static int l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7da4b2c", new Object[]{context})).intValue();
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            return 0;
        }
    }
}
