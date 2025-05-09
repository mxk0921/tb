package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alibaba.android.ultron.trade.utils.NetType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zvj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189387);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3825d2fc", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static NetType b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetType) ipChange.ipc$dispatch("d283d58a", new Object[]{context});
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return NetType.NET_TYPE_UNKNOW;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return NetType.NET_TYPE_23G;
        }
        if (type != 1) {
            return NetType.NET_TYPE_UNKNOW;
        }
        return NetType.NET_TYPE_WIFI;
    }
}
