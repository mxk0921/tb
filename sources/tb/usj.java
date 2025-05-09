package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class usj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHINA_MOBILE = 1;
    public static final int CHINA_TELECOM = 3;
    public static final int CHINA_UNICOM = 2;
    public static final String CONN_TYPE_GPRS = "gprs";
    public static final String CONN_TYPE_NONE = "none";
    public static final String CONN_TYPE_WIFI = "wifi";
    public static final int SIM_NO = -1;
    public static final int SIM_OK = 0;
    public static final int SIM_UNKNOW = -2;

    static {
        t2o.a(775946268);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        if (a(context) != null) {
            return true;
        }
        return false;
    }

    public static String a(Context context) {
        NetworkInfo[] networkInfoArr;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8d44f91", new Object[]{context});
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        try {
            networkInfoArr = connectivityManager.getAllNetworkInfo();
        } catch (Exception unused) {
            networkInfoArr = null;
        }
        if (networkInfoArr == null) {
            return null;
        }
        for (int i = 0; i < networkInfoArr.length; i++) {
            NetworkInfo networkInfo = networkInfoArr[i];
            if (networkInfo != null && ((state = networkInfo.getState()) == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                return networkInfoArr[i].getTypeName() + " " + networkInfoArr[i].getSubtypeName() + networkInfoArr[i].getExtraInfo();
            }
        }
        return null;
    }

    public static String b(Context context) {
        ConnectivityManager connectivityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ef6f2ec", new Object[]{context});
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (connectivityManager == null) {
            y7t.b(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "can not get Context.CONNECTIVITY_SERVICE");
            return "none";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo == null) {
            y7t.b(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "can not get ConnectivityManager.TYPE_WIFI");
        } else if (NetworkInfo.State.CONNECTED == networkInfo.getState()) {
            return "wifi";
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 == null) {
            y7t.b(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "can not get ConnectivityManager.TYPE_MOBILE");
        } else if (NetworkInfo.State.CONNECTED == networkInfo2.getState()) {
            return "gprs";
        }
        return "none";
    }
}
