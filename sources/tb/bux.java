package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            return NetworkStatusHelper.getStatus().getType();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (activeNetworkInfo.isConnected()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int c() {
        int stackType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (!cwx.n()) {
            return 4;
        }
        try {
            stackType = Inet64Util.getStackType();
        } catch (Throwable unused) {
        }
        if (stackType == 3) {
            return 1;
        }
        if (stackType == 2) {
            return 2;
        }
        return 4;
    }

    public static final NetworkInfo d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("2a374fa6", new Object[]{context});
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }
}
