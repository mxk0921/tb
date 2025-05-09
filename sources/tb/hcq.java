package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<fcq> f20544a = new AtomicReference<>(null);

    static {
        t2o.a(676331549);
    }

    public static fcq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcq) ipChange.ipc$dispatch("dfab1083", new Object[0]);
        }
        return f20544a.get();
    }

    public static void b(fcq fcqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8734b2ed", new Object[]{fcqVar});
        } else {
            sng.a(f20544a, null, fcqVar);
        }
    }
}
