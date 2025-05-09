package com.alibaba.triver.triver_shop.preload;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.ckf;
import tb.r54;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CommonPrefetchDataManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CommonPrefetchDataManager INSTANCE = new CommonPrefetchDataManager();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<Long, a> f3274a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void a(Object obj);

        Object getData(long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3275a;

        public b(Object obj) {
            this.f3275a = obj;
        }

        @Override // com.alibaba.triver.triver_shop.preload.CommonPrefetchDataManager.a
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("365d8324", new Object[]{this, obj});
            } else {
                ckf.g(obj, "data");
            }
        }

        @Override // com.alibaba.triver.triver_shop.preload.CommonPrefetchDataManager.a
        public Object getData(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e45811d5", new Object[]{this, new Long(j)});
            }
            return this.f3275a;
        }
    }

    static {
        t2o.a(766510142);
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a5655e52", new Object[0]);
        }
        return f3274a;
    }

    public static /* synthetic */ void e(CommonPrefetchDataManager commonPrefetchDataManager, long j, a aVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a978f9", new Object[]{commonPrefetchDataManager, new Long(j), aVar, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        commonPrefetchDataManager.d(j, aVar, z);
    }

    public final Object b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("438dc32c", new Object[]{this, new Long(j)});
        }
        a remove = f3274a.remove(Long.valueOf(j));
        if (remove == null) {
            return null;
        }
        return remove.getData(j);
    }

    public final void c(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6cdf12", new Object[]{this, new Long(j), obj});
            return;
        }
        ckf.g(obj, "data");
        a remove = f3274a.remove(Long.valueOf(j));
        if (remove == null) {
            e(this, j, new b(obj), false, 4, null);
        } else {
            remove.a(obj);
        }
    }

    public final void d(long j, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4cca7f", new Object[]{this, new Long(j), aVar, new Boolean(z)});
            return;
        }
        ckf.g(aVar, "prefetchDataGetter");
        f3274a.put(Long.valueOf(j), aVar);
        if (z) {
            r54.E(new CommonPrefetchDataManager$setPrefetchDataGetter$1(j), 30000L);
        }
    }
}
