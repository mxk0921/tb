package tb;

import android.content.Context;
import android.content.ServiceConnection;
import com.alibaba.android.split.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class odq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331559);
    }

    public static boolean a(Context context, ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("580c63bf", new Object[]{context, serviceConnection})).booleanValue();
        }
        return Services.bind(context, BIND_SPLIT_INSTALL_SERVICE.class, serviceConnection);
    }

    public static void b(Context context, ServiceConnection serviceConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69c5b62", new Object[]{context, serviceConnection});
        } else {
            Services.unbind(context, serviceConnection);
        }
    }
}
