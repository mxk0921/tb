package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class on6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CACHE_SIZE = 100;
    public static final int WHITE_DEFAULT_CACHE_SIZE = 20;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, LruCache<String, DXWidgetNode>> f25502a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final on6 f25503a = new on6();

        static {
            t2o.a(444596976);
        }

        public static /* synthetic */ on6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (on6) ipChange.ipc$dispatch("9354cbc2", new Object[0]);
            }
            return f25503a;
        }
    }

    static {
        t2o.a(444596974);
    }

    public static on6 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (on6) ipChange.ipc$dispatch("4752e09c", new Object[0]);
        }
        return b.a();
    }

    public final void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546ebc6d", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this.f25502a) {
                try {
                    if (!((HashMap) this.f25502a).containsKey(str)) {
                        ((HashMap) this.f25502a).put(str, new LruCache(i));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d91cd5", new Object[]{this});
            return;
        }
        synchronized (this.f25502a) {
            ((HashMap) this.f25502a).clear();
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a42606", new Object[]{this, str});
            return;
        }
        synchronized (this.f25502a) {
            try {
                LruCache lruCache = (LruCache) ((HashMap) this.f25502a).get(str);
                if (lruCache != null) {
                    lruCache.evictAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d221e0", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        } else if (wh6.c(str, dXTemplateItem)) {
            synchronized (this.f25502a) {
                try {
                    LruCache lruCache = (LruCache) ((HashMap) this.f25502a).get(h(str, dXTemplateItem));
                    if (lruCache != null) {
                        lruCache.remove(f(str, dXTemplateItem, dinamicXEngine));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f4b493", new Object[]{this});
            return;
        }
        synchronized (this.f25502a) {
            try {
                LruCache lruCache = (LruCache) ((HashMap) this.f25502a).get("public_cache");
                if (lruCache != null) {
                    lruCache.evictAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String f(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        String str2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d4681d4", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        }
        if (nb6.i()) {
            return str + dXTemplateItem.d() + "_" + pb6.s(DinamicXEngine.x());
        }
        nb6 p = dinamicXEngine.d().p();
        if (p != null) {
            if (p.e() > 0) {
                i = p.e();
            } else {
                Context y = dinamicXEngine.y();
                if (y == null) {
                    y = DinamicXEngine.x();
                }
                i = pb6.s(y);
            }
            str2 = i + "" + p.f() + p.g();
        } else {
            Context y2 = dinamicXEngine.y();
            if (y2 == null) {
                y2 = DinamicXEngine.x();
            }
            str2 = pb6.s(y2) + "";
        }
        return str + dXTemplateItem.d() + "_" + str2;
    }

    public DXWidgetNode g(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("748f6996", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        }
        if (!wh6.c(str, dXTemplateItem)) {
            return null;
        }
        synchronized (this.f25502a) {
            try {
                LruCache lruCache = (LruCache) ((HashMap) this.f25502a).get(h(str, dXTemplateItem));
                if (lruCache == null) {
                    return null;
                }
                return (DXWidgetNode) lruCache.get(f(str, dXTemplateItem, dinamicXEngine));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f34770", new Object[]{this});
        } else if (eb5.k()) {
            this.f25502a.put("public_cache", new LruCache<>(200));
        } else {
            this.f25502a.put("public_cache", new LruCache<>(100));
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9b323e", new Object[]{this});
            return;
        }
        Map<String, Integer> V2 = zg5.V2();
        if (V2 != null && !V2.isEmpty()) {
            if (DinamicXEngine.j0()) {
                h36.g("DXConfigCenter", "原型树缓存白名单命中");
            }
            for (Map.Entry<String, Integer> entry : V2.entrySet()) {
                Integer value = entry.getValue();
                a(entry.getKey(), value == null ? 20 : value.intValue());
            }
        } else if (DinamicXEngine.j0()) {
            h36.g("DXConfigCenter", "原型树缓存白名单未命中 or 白名单配置未 Empty ");
        }
    }

    public void l(String str, DXTemplateItem dXTemplateItem, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29375622", new Object[]{this, str, dXTemplateItem, dXWidgetNode});
        } else if (wh6.c(str, dXTemplateItem) && dXWidgetNode != null) {
            synchronized (this.f25502a) {
                try {
                    String h = h(str, dXTemplateItem);
                    LruCache lruCache = (LruCache) ((HashMap) this.f25502a).get(h);
                    if (lruCache != null) {
                        lruCache.put(f(str, dXTemplateItem, dXWidgetNode.getEngine()), dXWidgetNode);
                        if (DinamicXEngine.j0()) {
                            h36.c("往" + h + "  缓存池中加入模板原型树缓存 " + dXTemplateItem.d());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public on6() {
        this.f25502a = new HashMap();
        j();
    }

    public final String h(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe6a2c53", new Object[]{this, str, dXTemplateItem});
        }
        return (((HashMap) this.f25502a).get(str) == null || dXTemplateItem == null || dXTemplateItem.f() != 1) ? "public_cache" : str;
    }
}
