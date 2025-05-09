package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class mcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f23942a = new AtomicReference(null);

    static {
        t2o.a(676331553);
    }

    public static lcq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcq) ipChange.ipc$dispatch("e43eefc4", new Object[0]);
        }
        return (lcq) f23942a.get();
    }

    public static void b(lcq lcqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a992e", new Object[]{lcqVar});
        } else {
            sng.a(f23942a, null, lcqVar);
        }
    }
}
