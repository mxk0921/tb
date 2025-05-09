package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.util.Pools;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zm6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, Pools.Pool<tfw>>> f32862a = new ConcurrentHashMap();
    public final Map<String, Map<String, Pools.Pool<DXRootView>>> b = new ConcurrentHashMap();
    public final Map<String, Map<String, Pools.Pool<DXRootView>>> c = new ConcurrentHashMap();
    public final Map<String, Map<String, DXRootView>> d = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final zm6 f32863a = new zm6();

        static {
            t2o.a(444596634);
        }

        public static /* synthetic */ zm6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zm6) ipChange.ipc$dispatch("7271de40", new Object[0]);
            }
            return f32863a;
        }
    }

    static {
        t2o.a(444596633);
    }

    public static zm6 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zm6) ipChange.ipc$dispatch("f3dfe81b", new Object[0]);
        }
        return a.a();
    }

    public static String h(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aee0bd5c", new Object[]{dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return "";
        }
        return dinamicTemplate.name + "_" + dinamicTemplate.version;
    }

    public void a(DXRootView dXRootView, DXTemplateItem dXTemplateItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6409a2", new Object[]{this, dXRootView, dXTemplateItem, str});
        } else if (dXRootView != null && !TextUtils.isEmpty(str) && dXTemplateItem != null) {
            Map map = (Map) ((ConcurrentHashMap) this.c).get(str);
            if (map == null) {
                map = new ConcurrentHashMap();
                ((ConcurrentHashMap) this.c).put(str, map);
            }
            Pools.Pool pool = (Pools.Pool) map.get(dXTemplateItem.d());
            if (pool == null) {
                pool = new Pools.SynchronizedPool(8);
                map.put(dXTemplateItem.d(), pool);
            }
            pool.release(dXRootView);
        }
    }

    public void b(tfw tfwVar, DinamicTemplate dinamicTemplate, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a11591", new Object[]{this, tfwVar, dinamicTemplate, str});
        } else if (tfwVar != null && !TextUtils.isEmpty(str) && dinamicTemplate != null) {
            String h = h(dinamicTemplate);
            Map map = (Map) ((ConcurrentHashMap) this.f32862a).get(str);
            if (map == null) {
                map = new ConcurrentHashMap();
                ((ConcurrentHashMap) this.f32862a).put(str, map);
            }
            Pools.Pool pool = (Pools.Pool) map.get(h);
            if (pool == null) {
                pool = new Pools.SynchronizedPool(6);
                map.put(h, pool);
            }
            pool.release(tfwVar);
        }
    }

    public void c(DXRootView dXRootView, DXTemplateItem dXTemplateItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1def831f", new Object[]{this, dXRootView, dXTemplateItem, str});
        } else if (dXRootView != null && !TextUtils.isEmpty(str) && dXTemplateItem != null) {
            Map map = (Map) ((ConcurrentHashMap) this.b).get(str);
            if (map == null) {
                map = new ConcurrentHashMap();
                ((ConcurrentHashMap) this.b).put(str, map);
            }
            Pools.Pool pool = (Pools.Pool) map.get(dXTemplateItem.d());
            if (pool == null) {
                pool = new Pools.SynchronizedPool(6);
                map.put(dXTemplateItem.d(), pool);
            }
            pool.release(dXRootView);
        }
    }

    public void d(String str) {
        Map<String, Map<String, Pools.Pool<DXRootView>>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4205a6", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (map = this.c) != null) {
            ((ConcurrentHashMap) map).remove(str);
            ((ConcurrentHashMap) this.d).remove(str);
        }
    }

    public void e(String str) {
        Map<String, Map<String, Pools.Pool<DXRootView>>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8354889", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (map = this.b) != null) {
            ((ConcurrentHashMap) map).remove(str);
        }
    }

    public DXRootView f(Context context, String str, String str2) {
        Map map;
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("24215013", new Object[]{this, context, str, str2});
        }
        if (str2 == null || TextUtils.isEmpty(str) || (map = (Map) ((ConcurrentHashMap) this.d).get(str)) == null || (dXRootView = (DXRootView) map.remove(str2)) == null) {
            return null;
        }
        if ((dXRootView.getContext() instanceof bew) && context != null) {
            ((bew) dXRootView.getContext()).d(context);
        }
        return dXRootView;
    }

    public DXRootView i(Context context, DXTemplateItem dXTemplateItem, String str) {
        Map map;
        Pools.Pool pool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("7c22694d", new Object[]{this, context, dXTemplateItem, str});
        }
        if (dXTemplateItem == null || TextUtils.isEmpty(str) || (map = (Map) ((ConcurrentHashMap) this.c).get(str)) == null || (pool = (Pools.Pool) map.get(dXTemplateItem.d())) == null) {
            return null;
        }
        DXRootView dXRootView = (DXRootView) pool.acquire();
        if (!(dXRootView == null || !(dXRootView.getContext() instanceof bew) || context == null)) {
            ((bew) dXRootView.getContext()).d(context);
        }
        return dXRootView;
    }

    public DXRootView k(Context context, DXTemplateItem dXTemplateItem, String str) {
        Map map;
        Pools.Pool pool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("51d2e54a", new Object[]{this, context, dXTemplateItem, str});
        }
        if (dXTemplateItem == null || TextUtils.isEmpty(str) || (map = (Map) ((ConcurrentHashMap) this.b).get(str)) == null || (pool = (Pools.Pool) map.get(dXTemplateItem.d())) == null) {
            return null;
        }
        DXRootView dXRootView = (DXRootView) pool.acquire();
        if (!(dXRootView == null || !(dXRootView.getContext() instanceof bew) || context == null)) {
            ((bew) dXRootView.getContext()).d(context);
        }
        return dXRootView;
    }

    public void l(String str, String str2, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a68b94", new Object[]{this, str, str2, dXRootView});
        } else if (dXRootView != null && !TextUtils.isEmpty(str) && str2 != null) {
            Map map = (Map) ((ConcurrentHashMap) this.d).get(str);
            if (map == null) {
                map = new ConcurrentHashMap();
                ((ConcurrentHashMap) this.d).put(str, map);
            }
            map.put(str2, dXRootView);
        }
    }
}
