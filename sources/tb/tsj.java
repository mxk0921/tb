package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tsj {
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

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ef6f2ec", new Object[]{context});
        }
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && NetworkInfo.State.CONNECTED == networkInfo.getState()) {
            return "wifi";
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 == null || NetworkInfo.State.CONNECTED != networkInfo2.getState()) {
            return "none";
        }
        return "gprs";
    }
}
