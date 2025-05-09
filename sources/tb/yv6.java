package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886313);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        return n7v.a();
    }

    public static synchronized boolean b(Context context) {
        synchronized (yv6.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e5a578d", new Object[]{context})).booleanValue();
            }
            return n7v.b(context);
        }
    }
}
