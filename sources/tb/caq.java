package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class caq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f16944a = new AtomicReference(null);

    static {
        t2o.a(676331669);
    }

    public static nrd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrd) ipChange.ipc$dispatch("b8757d2", new Object[0]);
        }
        return (nrd) f16944a.get();
    }

    public static void b(nrd nrdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1294c8bc", new Object[]{nrdVar});
        } else {
            sng.a(f16944a, null, nrdVar);
        }
    }
}
