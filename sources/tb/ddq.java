package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ddq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f17745a = new AtomicReference(null);

    static {
        t2o.a(676331557);
    }

    public static q5c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q5c) ipChange.ipc$dispatch("80ade2ea", new Object[0]);
        }
        return (q5c) f17745a.get();
    }

    public static void b(q5c q5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6d80d4", new Object[]{q5cVar});
        } else {
            sng.a(f17745a, null, q5cVar);
        }
    }
}
