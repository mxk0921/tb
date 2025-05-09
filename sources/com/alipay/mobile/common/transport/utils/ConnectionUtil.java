package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alipay.mobile.common.transportext.biz.util.NetInfoHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ConnectionUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_3GNET = "3gnet";
    public static final String TYPE_3GWAP = "3gwap";
    public static final String TYPE_CMNET = "cmnet";
    public static final String TYPE_CMWAP = "cmwap";
    public static final String TYPE_CTNET = "ctnet";
    public static final String TYPE_CTWAP = "ctwap";
    public static final String TYPE_UNINET = "uninet";
    public static final String TYPE_UNIWAP = "uniwap";
    public static final String TYPE_WIFI = "wifi";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f4140a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f4140a = hashMap;
        hashMap.clear();
        hashMap.put("wifi", "0");
        hashMap.put("cmwap", "1");
        hashMap.put(TYPE_CMNET, "2");
        hashMap.put(TYPE_UNIWAP, "3");
        hashMap.put(TYPE_UNINET, "4");
        hashMap.put(TYPE_CTNET, "5");
        hashMap.put(TYPE_CTWAP, "6");
        hashMap.put(TYPE_3GNET, "7");
        hashMap.put(TYPE_3GWAP, "8");
    }

    public static int getConnType(Context context) {
        NetworkInfo activeNetworkInfo;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e53a7498", new Object[]{context})).intValue();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable())) {
                String typeName = activeNetworkInfo.getTypeName();
                if (!typeName.equalsIgnoreCase("WIFI")) {
                    i = typeName.equalsIgnoreCase("MOBILE") ? Integer.valueOf(f4140a.get(activeNetworkInfo.getExtraInfo().toLowerCase())).intValue() : typeName.contains("777") ? isWapAPN() ? 6 : 5 : -1;
                }
            }
        } catch (Exception unused) {
        }
        return i;
    }

    public static String getConnTypeName(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d47e1c2b", new Object[]{new Integer(i)}) : getConnTypeName(String.valueOf(i));
    }

    public static String getWapIP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b699282", new Object[0]);
        }
        String defaultHost = Proxy.getDefaultHost();
        if (defaultHost == null) {
            return NetInfoHelper.CMWAP_PROXY_HOST;
        }
        return defaultHost;
    }

    public static int getWapPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad1c244b", new Object[0])).intValue();
        }
        int defaultPort = Proxy.getDefaultPort();
        if (defaultPort == -1) {
            return 80;
        }
        return defaultPort;
    }

    public static boolean isWapAPN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab59ae2e", new Object[0])).booleanValue();
        }
        String wapIP = getWapIP();
        int wapPort = getWapPort();
        if (wapIP == null || wapIP.equals("") || wapPort == -1) {
            return false;
        }
        return true;
    }

    public static String getConnTypeName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c89ee5a8", new Object[]{str});
        }
        for (Map.Entry<String, String> entry : f4140a.entrySet()) {
            if (TextUtils.equals(str, entry.getValue())) {
                return entry.getValue();
            }
        }
        return "";
    }

    public static int getNetworkType(Context context) {
        int dataNetworkType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("263d9902", new Object[]{context})).intValue();
        }
        try {
            if (!MiscUtils.isAtFrontDesk(context)) {
                return 0;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT <= 30) {
                dataNetworkType = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager);
            } else {
                dataNetworkType = telephonyManager.getDataNetworkType();
            }
            return dataNetworkType;
        } catch (Throwable th) {
            LogCatUtil.error("ConnectionUtil", "getNetworkType ex= " + th.toString());
            return 0;
        }
    }
}
