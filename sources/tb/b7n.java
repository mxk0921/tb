package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b7n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(y80<String> y80Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e36ed4", new Object[]{y80Var});
        } else {
            i7n.h(Looper.getMainLooper(), "QoSDumper", "CURRENT:", y80Var);
        }
    }
}
