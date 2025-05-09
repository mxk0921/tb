package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ykf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, kgc> f32145a = new HashMap<>();

    static {
        t2o.a(919601368);
    }

    public ykf(rpu rpuVar) {
        ckf.g(rpuVar, "context");
        b(rpuVar);
    }

    public final <T extends kgc> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((kgc) ipChange.ipc$dispatch("b5905479", new Object[]{this, cls}));
        }
        ckf.g(cls, "serviceClass");
        kgc kgcVar = this.f32145a.get(cls.getName());
        if (!(kgcVar instanceof kgc)) {
            kgcVar = null;
        }
        return (T) kgcVar;
    }

    public final void b(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d8f173", new Object[]{this, qpuVar});
        } else {
            this.f32145a.put(f6d.class.getName(), new dnl(qpuVar));
        }
    }
}
