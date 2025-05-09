package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.tfi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wg1<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final T f30674a;
    public final a<T> b;
    public final AtomicInteger c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a<T> {
    }

    static {
        t2o.a(779093484);
    }

    public wg1(T t, a<T> aVar) {
        this(t, aVar, 1);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        int decrementAndGet = this.c.decrementAndGet();
        if (decrementAndGet <= 0) {
            ((tfi.a) this.b).a(this, decrementAndGet);
        }
    }

    public final T b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return this.f30674a;
    }

    public wg1(T t, a<T> aVar, int i) {
        this.f30674a = t;
        this.b = aVar;
        this.c = new AtomicInteger(i);
    }
}
