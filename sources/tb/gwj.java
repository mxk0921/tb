package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f20270a = akt.p2("useNewNetworkStatus", true);

    public static String a(Context context) {
        NetworkInfo[] allNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8d44f91", new Object[]{context});
        }
        if (f20270a) {
            return c();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
            return null;
        }
        for (int i = 0; i < allNetworkInfo.length; i++) {
            NetworkInfo networkInfo = allNetworkInfo[i];
            if (networkInfo != null && ((state = networkInfo.getState()) == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                String extraInfo = allNetworkInfo[i].getExtraInfo();
                return allNetworkInfo[i].getTypeName() + " " + allNetworkInfo[i].getSubtypeName() + extraInfo;
            }
        }
        return null;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b20c7e8d", new Object[]{context})).intValue();
        }
        if (!e(context)) {
            return -1;
        }
        return NetworkQualityMonitor.getGlobalNetworkQuality();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("385238e7", new Object[0]);
        }
        boolean isConnected = NetworkStatusHelper.isConnected();
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status == null || !isConnected) {
            return "disconnected";
        }
        if (status.isWifi()) {
            return "WIFI";
        }
        if (status.isMobile()) {
            return "MOBILE";
        }
        return status.getType();
    }

    public static String d(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("794dbb71", new Object[]{context});
        }
        if (f20270a) {
            return c();
        }
        if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return "disconnected";
        }
        return activeNetworkInfo.getTypeName();
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        if (f20270a) {
            return NetworkStatusHelper.isConnected();
        }
        if (a(context) != null) {
            return true;
        }
        return false;
    }

    static {
        t2o.a(503316548);
    }
}
