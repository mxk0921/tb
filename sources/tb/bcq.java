package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f16320a = new AtomicReference(null);

    static {
        t2o.a(676331547);
    }

    public static hdq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hdq) ipChange.ipc$dispatch("8a930ab5", new Object[0]);
        }
        return (hdq) f16320a.get();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18c9965a", new Object[0])).booleanValue();
        }
        if (f16320a.get() != null) {
            return true;
        }
        return false;
    }

    public static void c(hdq hdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e1e55f", new Object[]{hdqVar});
        } else {
            sng.a(f16320a, null, hdqVar);
        }
    }
}
