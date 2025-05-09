package com.alipay.mobile.common.transportext.biz.util;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.Proxy;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.HttpHost;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetInfoHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CMWAP_PROXY_HOST = "10.0.0.172";
    public static final int CMWAP_PROXY_PORT = 80;
    public static final String NET_TYPE_CMWAP = "cmwap";

    /* renamed from: a  reason: collision with root package name */
    public static final String f4217a = LogUtilAmnet.PRETAG.concat(NetInfoHelper.class.getSimpleName());

    public static String getActiveNetType(Context context) {
        String extraInfo;
        String str = "internet";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3496af3a", new Object[]{context});
        }
        try {
            NetworkInfo activeNetworkInfo = NetworkUtils.getActiveNetworkInfo(context);
            if (activeNetworkInfo != null) {
                String typeName = activeNetworkInfo.getTypeName();
                if (typeName == null || typeName.length() <= 0) {
                    str = "unknown";
                } else if ("wifi".equalsIgnoreCase(typeName)) {
                    str = "wifi";
                } else if (!str.equalsIgnoreCase(typeName)) {
                    if ("mobile".equalsIgnoreCase(typeName) && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                        if (extraInfo.length() > 0) {
                            str = extraInfo;
                        }
                    }
                }
                return str;
            }
            str = null;
            return str;
        } catch (Exception e) {
            LogUtilAmnet.e(f4217a, "getActiveNetType: [ Exception " + e + " ]");
            return null;
        }
    }

    public static HttpHost getProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("aef6b165", new Object[0]);
        }
        try {
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (defaultHost == null || defaultHost.length() <= 0 || defaultPort <= 0) {
                return null;
            }
            return new HttpHost(defaultHost, defaultPort);
        } catch (Exception e) {
            String str = f4217a;
            LogUtilAmnet.e(str, "getProxy: [ Exception " + e + " ]");
            return null;
        }
    }

    public static boolean isNetAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b42cb4ef", new Object[]{context})).booleanValue();
        }
        try {
            return NetworkUtils.isNetworkAvailable(context);
        } catch (Exception e) {
            String str = f4217a;
            LogUtilAmnet.e(str, "isNetAvailable: [ Exception " + e + " ]");
            return false;
        }
    }

    public static boolean isWifiNetType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3933ca0d", new Object[]{context})).booleanValue();
        }
        try {
            return "wifi".equals(getActiveNetType(context));
        } catch (Exception e) {
            String str = f4217a;
            LogUtilAmnet.e(str, "isWifiNetType: [ Exception " + e + " ]");
            return false;
        }
    }

    public static boolean isMobileNetType(Context context) {
        String typeName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de96fe9a", new Object[]{context})).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = NetworkUtils.getActiveNetworkInfo(context);
            if (!(activeNetworkInfo == null || (typeName = activeNetworkInfo.getTypeName()) == null || typeName.length() <= 0)) {
                if ("mobile".equalsIgnoreCase(typeName)) {
                    return true;
                }
            }
        } catch (Exception e) {
            String str = f4217a;
            LogUtilAmnet.e(str, "getActiveNetType: [ Exception " + e + " ]");
        }
        return false;
    }
}
