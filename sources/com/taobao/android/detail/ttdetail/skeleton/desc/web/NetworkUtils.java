package com.taobao.android.detail.ttdetail.skeleton.desc.web;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import anet.channel.monitor.NetworkSpeed;
import anetwork.channel.monitor.Monitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mr7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NetworkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ConnectType {
        CONNECT_TYPE_WIFI,
        CONNECT_TYPE_MOBILE,
        CONNECT_TYPE_OTHER,
        CONNECT_TYPE_DISCONNECT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ConnectType connectType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/web/NetworkUtils$ConnectType");
        }

        public static ConnectType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConnectType) ipChange.ipc$dispatch("1be523dd", new Object[]{str});
            }
            return (ConnectType) Enum.valueOf(ConnectType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum MobileNetworkType {
        MOBILE_NETWORK_TYPE_2G,
        MOBILE_NETWORK_TYPE_3G,
        MOBILE_NETWORK_TYPE_4G,
        MOBILE_NETWORK_TYPE_UNKNOWN;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(MobileNetworkType mobileNetworkType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/web/NetworkUtils$MobileNetworkType");
        }

        public static MobileNetworkType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MobileNetworkType) ipChange.ipc$dispatch("939c8a5b", new Object[]{str});
            }
            return (MobileNetworkType) Enum.valueOf(MobileNetworkType.class, str);
        }
    }

    static {
        t2o.a(912262558);
    }

    public static String a(Context context) {
        NetworkInfo[] allNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8d44f91", new Object[]{context});
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) mr7.d().getSystemService("connectivity");
        if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
            return null;
        }
        for (int i = 0; i < allNetworkInfo.length; i++) {
            NetworkInfo networkInfo = allNetworkInfo[i];
            if (networkInfo != null && (NetworkInfo.State.CONNECTED == (state = networkInfo.getState()) || NetworkInfo.State.CONNECTING == state)) {
                String extraInfo = allNetworkInfo[i].getExtraInfo();
                return allNetworkInfo[i].getTypeName() + " " + allNetworkInfo[i].getSubtypeName() + extraInfo;
            }
        }
        return null;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d68b194a", new Object[]{context})).intValue();
        }
        if (!d(context)) {
            return 0;
        }
        if (c()) {
            return 2;
        }
        return 1;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e84cf9d2", new Object[0])).booleanValue();
        }
        if (NetworkSpeed.Slow == Monitor.getNetSpeed()) {
            return true;
        }
        return false;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        if (a(context) != null) {
            return true;
        }
        return false;
    }
}
