package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.r6m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qe7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static IDetailCache f26698a;
    public static IDetailCache b;
    public static final oe7 c = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements r6m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.r6m.a
        public void a(String str, r6m.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("522ca98b", new Object[]{this, str, bVar});
            } else {
                qe7.h(str, bVar.f27151a, bVar.b, bVar.c);
            }
        }
    }

    static {
        t2o.a(468714637);
        r6m.a(new a());
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea61519", new Object[]{str});
        } else {
            f().a(str);
        }
    }

    public static DetailCacheData b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("33bee22f", new Object[]{map});
        }
        return c().g(map);
    }

    public static IDetailCache c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDetailCache) ipChange.ipc$dispatch("2bd8b27a", new Object[0]);
        }
        if (f26698a == null) {
            f26698a = new pe7(IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED, c);
        }
        return f26698a;
    }

    public static DetailCacheData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("d3ef36e7", new Object[0]);
        }
        return f().e();
    }

    public static DetailCacheData e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("3fb20888", new Object[]{map});
        }
        return f().g(map);
    }

    public static IDetailCache f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDetailCache) ipChange.ipc$dispatch("603e09c1", new Object[0]);
        }
        if (b == null) {
            b = new pe7(IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_UNEXPOSED, c);
        }
        return b;
    }

    public static DetailCacheData g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("6d2c8338", new Object[]{str});
        }
        DetailCacheData f = f().f(str);
        if (f == null) {
            return c().f(str);
        }
        return f;
    }

    public static boolean h(String str, String str2, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d2b0934", new Object[]{str, str2, new Integer(i), new Long(j)})).booleanValue();
        }
        if (!f().b(str, str2, i, j)) {
            return c().b(str, str2, i, j);
        }
        DetailCacheData g = g(str);
        if (g != null) {
            re7.j(g);
        }
        return true;
    }

    public static void i(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432b5065", new Object[]{detailCacheData});
        } else {
            c().save(Collections.singletonList(detailCacheData));
        }
    }

    public static void j(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc80cde", new Object[]{detailCacheData});
        } else {
            f().save(Collections.singletonList(detailCacheData));
        }
    }

    public static void k(List<DetailCacheData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a70e5ff", new Object[]{list});
        } else {
            f().save(list);
        }
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1baa9487", new Object[0]);
            return;
        }
        f().c();
        c().c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements oe7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(DetailCacheData detailCacheData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e15574d", new Object[]{this, detailCacheData});
            } else {
                re7.i(detailCacheData);
            }
        }

        public void b(DetailCacheData detailCacheData) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae996e7b", new Object[]{this, detailCacheData});
            } else if (detailCacheData != null) {
                boolean d = aps.d();
                boolean A = aps.A();
                if (IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED.equals(detailCacheData.getSceneName())) {
                    List<DetailCacheData> d2 = qe7.c().d();
                    if (sz3.d(d2)) {
                        for (DetailCacheData detailCacheData2 : d2) {
                            if (detailCacheData2 != null) {
                                if (detailCacheData2.isPlayerCacheHighPriority()) {
                                    ir9.b("DetailCacheManager", detailCacheData2.contentId + "的缓存高优，这次" + detailCacheData.contentId + "不再升高优");
                                    z = false;
                                }
                                if ((!detailCacheData2.equals(detailCacheData) && d) || A) {
                                    re7.i(detailCacheData2);
                                }
                            }
                        }
                    }
                }
                if (z || d) {
                    re7.j(detailCacheData);
                }
            }
        }
    }
}
