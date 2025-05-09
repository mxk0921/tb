package tb;

import com.alibaba.ut.abtest.event.EventType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class kl8 implements jl8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ConcurrentLinkedQueue<bj8> b = new ConcurrentLinkedQueue<>();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final Map<EventType, Set<mk8>> f22738a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (!kl8.c().isEmpty()) {
                try {
                    bj8 bj8Var = (bj8) kl8.c().poll();
                    if (bj8Var != null) {
                        kl8.d(kl8.this, bj8Var);
                    }
                } catch (Throwable th) {
                    ku0.j("EventServiceImpl.publishEvent", th);
                }
            }
            kl8.e().set(false);
        }
    }

    static {
        t2o.a(961544299);
        t2o.a(961544298);
    }

    public static /* synthetic */ ConcurrentLinkedQueue c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentLinkedQueue) ipChange.ipc$dispatch("6a7c0fc5", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ void d(kl8 kl8Var, bj8 bj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b6abdf", new Object[]{kl8Var, bj8Var});
        } else {
            kl8Var.f(bj8Var);
        }
    }

    public static /* synthetic */ AtomicBoolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba126bf9", new Object[0]);
        }
        return c;
    }

    @Override // tb.jl8
    public void a(bj8 bj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4cc597", new Object[]{this, bj8Var});
        } else if (bj8Var != null) {
            b.offer(bj8Var);
            if (c.compareAndSet(false, true)) {
                ydt.b(new a());
            }
        }
    }

    @Override // tb.jl8
    public void b(EventType eventType, mk8 mk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12443c9d", new Object[]{this, eventType, mk8Var});
        } else if (eventType != null && mk8Var != null) {
            synchronized (this) {
                try {
                    Set set = (Set) ((HashMap) this.f22738a).get(eventType);
                    if (set == null) {
                        set = new HashSet();
                        ((HashMap) this.f22738a).put(eventType, set);
                    }
                    set.add(mk8Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void f(bj8 bj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b8d0d1", new Object[]{this, bj8Var});
            return;
        }
        Set<mk8> set = (Set) ((HashMap) this.f22738a).get(bj8Var.b());
        if (set != null) {
            for (mk8 mk8Var : set) {
                mk8Var.onEvent(bj8Var);
            }
        }
    }
}
