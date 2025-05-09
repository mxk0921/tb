package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class iqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile iqq c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<StringBuilder> f21512a = new ConcurrentLinkedQueue<>();
    public final Set<Integer> b = new HashSet();

    static {
        t2o.a(962592897);
    }

    public static iqq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iqq) ipChange.ipc$dispatch("1854e62f", new Object[0]);
        }
        if (c == null) {
            synchronized (iqq.class) {
                try {
                    if (c == null) {
                        c = new iqq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void b(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bcbca8", new Object[]{this, sb});
        } else if (sb != null && sb.length() <= 65536 && this.f21512a.size() <= 10) {
            sb.setLength(0);
            synchronized (this) {
                try {
                    int identityHashCode = System.identityHashCode(sb);
                    if (!((HashSet) this.b).contains(Integer.valueOf(identityHashCode))) {
                        ((HashSet) this.b).add(Integer.valueOf(identityHashCode));
                        this.f21512a.offer(sb);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public StringBuilder c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("28b05ae1", new Object[]{this});
        }
        StringBuilder poll = this.f21512a.poll();
        if (poll == null) {
            return new StringBuilder(2048);
        }
        ((HashSet) this.b).remove(Integer.valueOf(System.identityHashCode(poll)));
        return poll;
    }
}
