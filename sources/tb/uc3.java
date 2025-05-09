package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class uc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f29286a = new AtomicBoolean();
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final Map<Class<? extends ku<?>>, ku<?>> c = new ConcurrentHashMap(8);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ku f29287a;
        public final /* synthetic */ Context b;

        public a(ku kuVar, Context context) {
            this.f29287a = kuVar;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f29287a.e(this.b);
            } catch (Exception e) {
                ub3.g("CartPreloaderError", e.getMessage());
            }
        }
    }

    static {
        t2o.a(479199514);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
            return;
        }
        Map<Class<? extends ku<?>>, ku<?>> map = c;
        if (!((ConcurrentHashMap) map).isEmpty()) {
            try {
                for (ku kuVar : ((ConcurrentHashMap) map).values()) {
                    kuVar.a();
                }
                ((ConcurrentHashMap) c).clear();
            } catch (Exception e) {
                ub3.g("CartPreloaderDestroyError", e.getMessage());
            }
        }
    }

    public static <T> T b(Class<? extends ku<T>> cls, boolean z) {
        ku kuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("70fbfade", new Object[]{cls, new Boolean(z)});
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c;
        if (!concurrentHashMap.isEmpty() && f29286a.get()) {
            if (z) {
                kuVar = (ku) concurrentHashMap.remove(cls);
            } else {
                kuVar = (ku) concurrentHashMap.get(cls);
            }
            if (kuVar == null) {
                return null;
            }
            try {
                return (T) kuVar.d(z);
            } catch (Exception e) {
                ub3.g("getPreloaderResultError", e.getMessage());
            }
        }
        return null;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3a8171a", new Object[0])).booleanValue();
        }
        return f29286a.get();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95697b20", new Object[0]);
        } else if (!b.getAndSet(true)) {
            f(fb3.class, new fb3());
            f(sa3.class, new sa3());
            f(ta3.class, new ta3());
            f(pa3.class, new pa3());
            f(cb3.class, new cb3());
            f(ae3.class, new ae3());
            f(he3.class, new he3());
            if (vav.a(c9x.CART_BIZ_NAME, "enablePreloadNextRPC", false)) {
                f(td3.class, new td3());
            }
        }
    }

    public static void f(Class<? extends ku<?>> cls, ku<?> kuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d578f85", new Object[]{cls, kuVar});
        } else {
            ((ConcurrentHashMap) c).put(cls, kuVar);
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fcb7b8", new Object[]{context});
        } else if (!f29286a.getAndSet(true) && !vav.a(c9x.CART_BIZ_NAME, "disableCartPreloader", false) && !l9v.a("disableCartPreloader")) {
            d();
            hav.d("CartPreloader", "开始执行");
            try {
                Iterator it = new ArrayList(((ConcurrentHashMap) c).values()).iterator();
                while (it.hasNext()) {
                    pav.m(true, new a((ku) it.next(), context));
                }
            } catch (Exception e) {
                ub3.g("CartPreloaderError1", e.getMessage());
            }
        }
    }
}
