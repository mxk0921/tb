package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.rbo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sbo<T extends rbo> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<T> f27930a = new ConcurrentLinkedQueue<>();
    public final Set<Integer> b = new HashSet();

    static {
        t2o.a(962593060);
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c5a729", new Object[]{this, t});
        } else if (t != null && this.f27930a != null && this.b != null) {
            t.clean();
            if (this.f27930a.size() < 30) {
                synchronized (this) {
                    try {
                        int identityHashCode = System.identityHashCode(t);
                        if (!((HashSet) this.b).contains(Integer.valueOf(identityHashCode))) {
                            ((HashSet) this.b).add(Integer.valueOf(identityHashCode));
                            this.f27930a.offer(t);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public T b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((rbo) ipChange.ipc$dispatch("f23bd1d6", new Object[]{this}));
        }
        ConcurrentLinkedQueue<T> concurrentLinkedQueue = this.f27930a;
        if (concurrentLinkedQueue == null || this.b == null) {
            return null;
        }
        T poll = concurrentLinkedQueue.poll();
        if (poll != null) {
            ((HashSet) this.b).remove(Integer.valueOf(System.identityHashCode(poll)));
        }
        return poll;
    }
}
