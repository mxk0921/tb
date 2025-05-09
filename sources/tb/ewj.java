package tb;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ewj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(452985194);
    }

    public static boolean a(Activity activity) {
        ConnectivityManager connectivityManager;
        NetworkInfo[] allNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5acbe1e2", new Object[]{activity})).booleanValue();
        }
        Context applicationContext = activity.getApplicationContext();
        if (!(applicationContext == null || (connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity")) == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null || allNetworkInfo.length <= 0)) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c896226", new Object[]{context})).booleanValue();
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || (activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }
}
