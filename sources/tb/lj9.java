package tb;

import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class lj9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static f8e c;
    public static c d;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f23365a = new AtomicBoolean();
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final AtomicBoolean e = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends CartFirstPageCache.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/performance/preloader/FirstPageLoader$1");
        }

        @Override // com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            } else if (lj9.b() != null) {
                lj9.b().onError();
            }
        }

        @Override // com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.c
        public void b(CartFirstPageCache.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("160403f6", new Object[]{this, bVar});
            } else {
                lj9.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/performance/preloader/FirstPageLoader$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            } else if (lj9.b() != null) {
                lj9.b().onError();
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else if (lj9.b() != null) {
                lj9.b().onSuccess();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void onError();

        void onSuccess();
    }

    static {
        t2o.a(478150840);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            d();
        }
    }

    public static /* synthetic */ c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8d9a93a5", new Object[0]);
        }
        return d;
    }

    public static f8e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8e) ipChange.ipc$dispatch("f798275a", new Object[0]);
        }
        f8e f8eVar = c;
        c = null;
        d = null;
        f23365a.set(false);
        b.set(false);
        return f8eVar;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436ba4a0", new Object[0]);
        } else if (e.get()) {
            j(new b());
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b9ccec", new Object[0]);
        } else if (!f23365a.getAndSet(true)) {
            hav.d(c9x.CART_BIZ_NAME, "加载首屏缓存");
            CartFirstPageCache.loadFirstPageCacheData(new a());
            hb3.b();
        }
    }

    public static void f(f8e f8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a463fd", new Object[]{f8eVar});
        } else if (c == null) {
            c = f8eVar;
            e();
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e74f7118", new Object[0])).booleanValue();
        }
        f8e f8eVar = c;
        if (f8eVar == null || f8eVar.g() == null || c.g().e() == null) {
            return true;
        }
        return false;
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d0fba1", new Object[0]);
            return;
        }
        e.set(true);
        d();
    }

    public static void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d379df2", new Object[]{cVar});
        } else {
            d = cVar;
        }
    }

    public static void j(ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b302a80", new Object[]{uxVar});
        } else if (g()) {
            if (uxVar != null) {
                uxVar.a(-1, null, null, false, null);
            }
            hav.d(c9x.CART_BIZ_NAME, "尝试加载缓存，但cartVEngine未初始化完成");
        } else if (!CartFirstPageCache.hasPreloadFinishedAndDataValid()) {
            if (uxVar != null) {
                uxVar.a(-1, null, null, false, null);
            }
            hav.d(c9x.CART_BIZ_NAME, "尝试加载缓存，但首页缓存数据未加载成功,直接发起缓存请求");
        } else if (b.getAndSet(true)) {
            if (uxVar != null) {
                uxVar.a(-1, null, null, false, null);
            }
            hav.d(c9x.CART_BIZ_NAME, "预请求的缓存已经加载了，此次忽略");
        } else {
            hav.d(c9x.CART_BIZ_NAME, "开始发起缓存请求");
            c.g().d0(uxVar, true);
        }
    }
}
