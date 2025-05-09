package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
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
            switch (activeNetworkInfo.getSubtype()) {
                case 0:
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 12:
                default:
                    return 1;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 13:
                    return 2;
            }
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

    public static final SSLSocketFactory getTrustAllSslSocketFactory(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLSocketFactory) ipChange.ipc$dispatch("bdc6d3d5", new Object[]{context});
        }
        try {
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.alipay.vi.android.phone.mrpc.core.NetworkUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // javax.net.ssl.X509TrustManager
                public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee06893b", new Object[]{this, x509CertificateArr, str});
                    }
                }

                @Override // javax.net.ssl.X509TrustManager
                public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab6d06b3", new Object[]{this, x509CertificateArr, str});
                    }
                }

                @Override // javax.net.ssl.X509TrustManager
                public final X509Certificate[] getAcceptedIssuers() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (X509Certificate[]) ipChange2.ipc$dispatch("cdefad90", new Object[]{this});
                    }
                    return null;
                }
            };
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{x509TrustManager}, new SecureRandom());
            return instance.getSocketFactory();
        } catch (Exception unused) {
            return null;
        }
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
