package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ii6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597923);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }
}
