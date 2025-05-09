package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wvj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(347078700);
    }

    public static String a(Context context) {
        NetworkInfo[] allNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8d44f91", new Object[]{context});
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

    public static boolean b(Context context) {
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
