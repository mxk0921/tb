package com.tmall.android.dai.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NetworkUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum NetworkState {
        NETWORK_UNKNOW(-1),
        NETWORK_NONE(0),
        NETWORK_WIFI(1),
        NETWORK_MOBILE(2),
        NETWORK_2G(3),
        NETWORK_3G(4),
        NETWORK_4G(5),
        NETWORK_5G(6),
        NETWORK_ALL(10);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int value;

        NetworkState(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(NetworkState networkState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/internal/util/NetworkUtil$NetworkState");
        }

        public static NetworkState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetworkState) ipChange.ipc$dispatch("a57da942", new Object[]{str});
            }
            return (NetworkState) Enum.valueOf(NetworkState.class, str);
        }

        public int value() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d249f56b", new Object[]{this})).intValue();
            }
            return this.value;
        }

        public String value_name() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("591bd800", new Object[]{this});
            }
            int i = this.value;
            if (i == 1) {
                return "wifi";
            }
            if (i == 3) {
                return "2g";
            }
            if (i == 4) {
                return "3g";
            }
            if (i == 5) {
                return "4g";
            }
            if (i != 6) {
                return "unknown";
            }
            return "5g";
        }
    }

    static {
        t2o.a(1034944685);
    }

    public static NetworkState a(Context context) {
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkState) ipChange.ipc$dispatch("a5f45113", new Object[]{context});
        }
        if (context == null) {
            return NetworkState.NETWORK_NONE;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return NetworkState.NETWORK_NONE;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return NetworkState.NETWORK_NONE;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return NetworkState.NETWORK_WIFI;
        }
        switch (ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) context.getSystemService("phone"))) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return NetworkState.NETWORK_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return NetworkState.NETWORK_3G;
            case 13:
                return NetworkState.NETWORK_4G;
            default:
                return NetworkState.NETWORK_MOBILE;
        }
    }
}
