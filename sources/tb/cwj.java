package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.NetInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cwj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NET_STATUS_AVAILABLE = 1;
    public static final int NET_STATUS_CONNECTED = 2;
    public static final int NET_STATUS_DISCONNECTED = 3;
    public static final int NET_STATUS_UNAVAILABLE = 4;
    public static final int NET_STATUS_UNKNOWN = 0;
    public static final int NET_TYPE_CELLULAR = 1;
    public static final int NET_TYPE_CELLULAR_2G = 2;
    public static final int NET_TYPE_CELLULAR_3G = 3;
    public static final int NET_TYPE_CELLULAR_4G = 4;
    public static final int NET_TYPE_CELLULAR_5G = 5;
    public static final int NET_TYPE_ETHERNET = 8;
    public static final int NET_TYPE_OTHER = 9;
    public static final int NET_TYPE_UNKNOWN = 0;
    public static final int NET_TYPE_WIFI = 7;

    static {
        t2o.a(615514151);
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b25aedae", new Object[]{new Integer(i)})).intValue();
        }
        switch (i) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 4:
            case 7:
            case 11:
            case 16:
            case 19:
            default:
                return 2;
            case 13:
            case 18:
                return 4;
            case 20:
                return 5;
        }
    }

    public static NetInfo a(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetInfo) ipChange.ipc$dispatch("254bc136", new Object[]{context});
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (!activeNetworkInfo.isConnected()) {
                    return new NetInfo(3, 0);
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    i = b(activeNetworkInfo.getSubtype());
                } else if (type != 1) {
                    i = 9;
                    if (type == 9) {
                        i = 8;
                    }
                } else {
                    i = 7;
                }
                NetInfo netInfo = new NetInfo();
                netInfo.setStatus(2);
                netInfo.setType(i);
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    netInfo.setOperator(telephonyManager.getSimOperator());
                }
                return netInfo;
            }
            return new NetInfo(4, 0);
        } catch (Exception unused) {
            return new NetInfo(0, 0);
        }
    }
}
