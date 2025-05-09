package com.alipay.literpc.android.phone.mrpc.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.HttpHost;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NETWORK_TYPE_2G = 1;
    public static final int NETWORK_TYPE_3G_4G = 2;
    public static final int NETWORK_TYPE_INVALID = 0;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_WIFI = 3;

    public static boolean a(NetworkInfo networkInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f607b26", new Object[]{networkInfo})).booleanValue();
        }
        if (networkInfo == null) {
            return false;
        }
        int subtype = networkInfo.getSubtype();
        if (!(subtype == 3 || subtype == 13 || subtype == 5 || subtype == 6)) {
            switch (subtype) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("6ad73668", new Object[]{context});
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static int getNetType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e725e73", new Object[]{context})).intValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
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
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 3;
        }
        if (type == 0) {
            if (a(activeNetworkInfo)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static HttpHost getProxy(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("ee4da67b", new Object[]{context});
        }
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (defaultHost != null) {
                return new HttpHost(defaultHost, defaultPort);
            }
        }
        return null;
    }

    public static boolean isNetworkAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                return true;
            }
        }
        return false;
    }
}
