package com.alipay.mobile.common.logging.util.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.telephony.TelephonyManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.HttpHost;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANDROID_NETWORK_CLASS_2_G = 1;
    public static final int ANDROID_NETWORK_CLASS_3_G = 2;
    public static final int ANDROID_NETWORK_CLASS_4_G = 3;
    public static final int NETWORK_TYPE_2G = 1;
    public static final int NETWORK_TYPE_3G = 2;
    public static final int NETWORK_TYPE_4G = 4;
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_HSPAP = 15;
    public static final int NETWORK_TYPE_INVALID = 0;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_WIFI = 3;
    public static final String TAG = "LogNetworkUtils";

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("6ad73668", new Object[]{context});
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static int getMobileNetworkClass(NetworkInfo networkInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("908ee6a1", new Object[]{networkInfo})).intValue();
        }
        if (networkInfo == null) {
            return 0;
        }
        return getMobileNetworkClass(networkInfo.getSubtype());
    }

    public static int getNetType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e725e73", new Object[]{context})).intValue();
        }
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public static int getNetworkType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("263d9902", new Object[]{context})).intValue();
        }
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 3;
        }
        if (type == 0) {
            return getMobileNetworkClass(activeNetworkInfo);
        }
        return 0;
    }

    public static HttpHost getProxy(Context context) {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("ee4da67b", new Object[]{context});
        }
        try {
            networkInfo = getActiveNetworkInfo(context);
        } catch (Throwable th) {
            th.getMessage();
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isAvailable()) {
            return null;
        }
        String defaultHost = Proxy.getDefaultHost();
        int defaultPort = Proxy.getDefaultPort();
        if (defaultHost != null) {
            return new HttpHost(defaultHost, defaultPort);
        }
        return null;
    }

    public static boolean is2GMobileNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f4793d8", new Object[]{context})).booleanValue();
        }
        if (context != null && getNetworkType(context) == 1) {
            return true;
        }
        return false;
    }

    public static boolean is3GMobileNetwork(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f233fd37", new Object[]{context})).booleanValue() : context != null && getNetworkType(context) == 2;
    }

    public static boolean is4GMobileNetwork(NetworkInfo networkInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f24ce485", new Object[]{networkInfo})).booleanValue() : networkInfo != null && getMobileNetworkClass(networkInfo) == 4;
    }

    public static boolean isNetworkAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }

    public static boolean isWiFiMobileNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41bc8a58", new Object[]{context})).booleanValue();
        }
        if (context != null && getNetworkType(context) == 3) {
            return true;
        }
        return false;
    }

    public static int getMobileNetworkClass(int i) {
        try {
            Integer num = (Integer) TelephonyManager.class.getMethod("getNetworkClass", Integer.TYPE).invoke(TelephonyManager.class, Integer.valueOf(i));
            if (num.intValue() == 1) {
                return 1;
            }
            if (num.intValue() == 2) {
                return 2;
            }
            return num.intValue() == 3 ? 4 : 0;
        } catch (Throwable th) {
            th.toString();
            if (i != 18) {
                switch (i) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        break;
                    case 13:
                        return 4;
                    default:
                        return 0;
                }
            }
            return 2;
        }
    }

    public static boolean is3GMobileNetwork(NetworkInfo networkInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f607b26", new Object[]{networkInfo})).booleanValue() : networkInfo != null && getMobileNetworkClass(networkInfo) == 2;
    }

    public static boolean is4GMobileNetwork(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b5206696", new Object[]{context})).booleanValue() : context != null && getNetworkType(context) == 4;
    }
}
