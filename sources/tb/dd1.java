package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dd1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792258);
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf1be1e0", new Object[]{context})).booleanValue();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
                if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING) {
                    if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    }
                }
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da8d0b6", new Object[]{runnable, new Long(j)});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
                new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
            } else if (j <= 0) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
            }
        }
    }
}
