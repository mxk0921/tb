package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.HttpHost;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ssj {
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
        t2o.a(989856438);
    }

    public static HttpHost a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("b67f5d0a", new Object[]{context});
        }
        String property = System.getProperty("https.proxyHost");
        String property2 = System.getProperty("https.proxyPort");
        if (!TextUtils.isEmpty(property)) {
            return new HttpHost(property, Integer.parseInt(property2));
        }
        return null;
    }

    public static int b(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("263d9902", new Object[]{context})).intValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return -9;
        }
        return activeNetworkInfo.getType();
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14891cc6", new Object[]{context})).booleanValue();
        }
        if (b(context) >= 0) {
            return true;
        }
        return false;
    }
}
