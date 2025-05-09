package tb;

import android.content.Context;
import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class fb3 extends ku<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean b = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends CartFirstPageCache.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartFirstPageCachePreloader$1");
        }

        @Override // com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            }
        }

        @Override // com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.c
        public void b(CartFirstPageCache.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("160403f6", new Object[]{this, bVar});
            } else {
                hav.d(c9x.CART_BIZ_NAME, "CartFirstPageCachePreloader#CartFirstPageCache预加载成功");
            }
        }
    }

    static {
        t2o.a(479199525);
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b1c610", new Object[0]);
        } else if (!b.getAndSet(true)) {
            if (vav.a(c9x.CART_BIZ_NAME, "loadFirstPageCacheDataOnClick", false)) {
                CartFirstPageCache.loadFirstPageCacheData(new a());
            }
            sb3.m();
            hav.d(c9x.CART_BIZ_NAME, "CartFirstPageCachePreloader预加载成功");
        }
    }

    public static /* synthetic */ Object ipc$super(fb3 fb3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartFirstPageCachePreloader");
    }

    @Override // tb.ku
    public Object b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("38418e55", new Object[]{this, new Boolean(z)});
        }
        return null;
    }

    @Override // tb.ku
    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781f8ee3", new Object[]{this, context});
        } else {
            f();
        }
    }
}
