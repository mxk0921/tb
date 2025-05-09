package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.IProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bl9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger g = new AtomicInteger(2);

    /* renamed from: a  reason: collision with root package name */
    public boolean f16462a = false;
    public boolean b = false;
    public Map<String, IProxy> c = new HashMap();
    public Map<String, IProxy> d = new HashMap();
    public final CopyOnWriteArraySet<a> e = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<b> f = new CopyOnWriteArraySet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final bl9 f16463a = new bl9();

        static {
            t2o.a(806355098);
        }

        public static /* synthetic */ bl9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bl9) ipChange.ipc$dispatch("27f3037d", new Object[0]);
            }
            return f16463a;
        }
    }

    static {
        t2o.a(806355095);
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48bf2365", new Object[0])).intValue();
        }
        return 233333;
    }

    public static bl9 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bl9) ipChange.ipc$dispatch("538e32d8", new Object[0]);
        }
        return c.a();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7280b8a", new Object[]{this})).booleanValue();
        }
        return this.f16462a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb9eda9", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        if (!this.e.isEmpty()) {
            this.e.clear();
        }
        if (!this.f.isEmpty()) {
            this.f.clear();
        }
    }

    public Map<String, IProxy> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b2c78595", new Object[]{this});
        }
        FlexaLiveX.u();
        return this.c;
    }

    public Map<String, IProxy> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c66f5916", new Object[]{this});
        }
        FlexaLiveX.u();
        return this.d;
    }

    public void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c3520", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.e.add(aVar);
        }
    }

    public void i(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b703fb00", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.f.add(bVar);
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44eb44c", new Object[]{this, new Boolean(z)});
            return;
        }
        AtomicInteger atomicInteger = g;
        atomicInteger.decrementAndGet();
        if (atomicInteger.get() <= 0 && !this.f16462a) {
            this.f16462a = z;
            if (z) {
                FlexaLiveX.u();
                synchronized (this) {
                    try {
                        Iterator<a> it = this.e.iterator();
                        while (it.hasNext()) {
                            a next = it.next();
                            if (next != null) {
                                next.a();
                                FlexaLiveX.w("[FlexaLiveRemoteX#setATypeInstalled]  onATypePluginInstalled  listener-0: " + next.getClass().toString());
                            }
                        }
                        this.e.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void k(Map<String, IProxy> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356cd831", new Object[]{this, map});
            return;
        }
        Map<String, IProxy> map2 = this.c;
        if (map2 == null || map2.size() <= 0) {
            this.c = map;
        } else if (map != null && map.size() > 0) {
            this.c.putAll(map);
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f9160d", new Object[]{this, new Boolean(z)});
        } else if (!this.b) {
            this.b = z;
            if (z) {
                FlexaLiveX.u();
                synchronized (this) {
                    try {
                        Iterator<b> it = this.f.iterator();
                        while (it.hasNext()) {
                            b next = it.next();
                            if (next != null) {
                                next.a();
                                FlexaLiveX.w("[FlexaLiveRemoteX#setBTypeInstalled]  onBTypePluginInstalled  listener-0: " + next.getClass().toString());
                            }
                        }
                        this.f.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void m(Map<String, IProxy> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf74d0", new Object[]{this, map});
            return;
        }
        Map<String, IProxy> map2 = this.d;
        if (map2 == null || map2.size() <= 0) {
            this.d = map;
        }
    }
}
