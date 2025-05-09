package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.search.sf.util.tlog.TLogTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ybs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NETWORK_TYPE_2G = "2G";
    public static final String NETWORK_TYPE_3G = "3G";
    public static final String NETWORK_TYPE_4G = "4G";
    public static final String NETWORK_TYPE_NOTREACHABLE = "NotReachable";
    public static final String NETWORK_TYPE_UNKNOWN = "UNKNOWN";
    public static final String NETWORK_TYPE_WIFI = "WIFI";

    public static String c(Context context) {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b55cfe5f", new Object[]{context});
        }
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            Log.e("TMSNetworkAbility", TLogTracker.SCENE_EXCEPTION, th);
            networkInfo = null;
        }
        if (networkInfo == null) {
            return "FAIL";
        }
        int type = networkInfo.getType();
        if (type == 1 || type == 9) {
            return "WIFI";
        }
        return "WWAN";
    }

    public static String a(Context context) {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("865334a0", new Object[]{context});
        }
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            Log.e("TMSNetworkAbility", "get network info exception.", th);
            networkInfo = null;
        }
        if (networkInfo == null) {
            return NETWORK_TYPE_NOTREACHABLE;
        }
        int type = networkInfo.getType();
        if (type == 1 || type == 9) {
            return "WIFI";
        }
        int proxy_getNetworkType = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) context.getSystemService("phone"));
        if (proxy_getNetworkType == 18) {
            return "3G";
        }
        switch (proxy_getNetworkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "UNKNOWN";
        }
    }

    public static JSONObject b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("397c482f", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        String c = c(context);
        jSONObject.put("err_msg", (Object) ("network_type:" + c));
        jSONObject.put("networkType", (Object) c);
        jSONObject.put("networkInfo", (Object) a(context));
        jSONObject.put("networkAvailable", (Object) Boolean.valueOf(!"fail".equals(c)));
        return jSONObject;
    }
}
