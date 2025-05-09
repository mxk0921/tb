package tb;

import android.content.Context;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ke5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CACHE_SIZE = 100;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, LruCache<String, DXWidgetNode>> f22610a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ke5 f22611a = new ke5();

        static {
            t2o.a(444596953);
        }

        public static /* synthetic */ ke5 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ke5) ipChange.ipc$dispatch("f10153a2", new Object[0]);
            }
            return f22611a;
        }
    }

    static {
        t2o.a(444596951);
    }

    public static ke5 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ke5) ipChange.ipc$dispatch("372edcfc", new Object[0]);
        }
        return b.a();
    }

    public void a(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d221e0", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        } else if (wh6.c(str, dXTemplateItem)) {
            synchronized (this.f22610a) {
                try {
                    LruCache lruCache = (LruCache) ((HashMap) this.f22610a).get(d(str));
                    if (lruCache != null) {
                        lruCache.remove(b(str, dXTemplateItem, dinamicXEngine));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String b(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d4681d4", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        }
        if (nb6.i()) {
            return str + dXTemplateItem.d() + "_" + pb6.s(DinamicXEngine.x());
        }
        nb6 p = dinamicXEngine.d().p();
        if (p == null || p.e() <= 0) {
            Context y = dinamicXEngine.y();
            if (y == null) {
                y = DinamicXEngine.x();
            }
            i = pb6.s(y);
        } else {
            i = p.e();
        }
        return str + dXTemplateItem.d() + "_" + i;
    }

    public DXWidgetNode c(String str, DXTemplateItem dXTemplateItem, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("748f6996", new Object[]{this, str, dXTemplateItem, dinamicXEngine});
        }
        if (!wh6.c(str, dXTemplateItem)) {
            return null;
        }
        synchronized (this.f22610a) {
            try {
                LruCache lruCache = (LruCache) ((HashMap) this.f22610a).get(d(str));
                if (lruCache == null) {
                    return null;
                }
                return (DXWidgetNode) lruCache.get(b(str, dXTemplateItem, dinamicXEngine));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b41c5dc", new Object[]{this, str});
        }
        return ((HashMap) this.f22610a).get(str) != null ? str : "public_cache";
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f34770", new Object[]{this});
        } else if (eb5.k()) {
            this.f22610a.put("public_cache", new LruCache<>(200));
        } else {
            this.f22610a.put("public_cache", new LruCache<>(100));
        }
    }

    public void g(String str, DXTemplateItem dXTemplateItem, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29375622", new Object[]{this, str, dXTemplateItem, dXWidgetNode});
        } else if (wh6.c(str, dXTemplateItem) && dXWidgetNode != null) {
            synchronized (this.f22610a) {
                try {
                    LruCache lruCache = (LruCache) ((HashMap) this.f22610a).get(d(str));
                    if (lruCache != null) {
                        lruCache.put(b(str, dXTemplateItem, dXWidgetNode.getEngine()), dXWidgetNode);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ke5() {
        this.f22610a = new HashMap();
        f();
    }
}
