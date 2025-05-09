package tb;

import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.xmh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ktm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xmh<btm> f22914a = new xmh<>();
    public final String[] b = {"refresh", "preload", "deliver"};
    public final String[] c = {"high", "low"};

    public btm a(String str) {
        Exception e;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btm) ipChange.ipc$dispatch("e0f77701", new Object[]{this, str});
        }
        btm btmVar = null;
        try {
            for (String str2 : this.b) {
                for (String str3 : this.c) {
                    LruCache<String, btm> d = this.f22914a.d(str2, str3);
                    if (d != null) {
                        btm btmVar2 = d.get(str);
                        if (btmVar2 != null) {
                            try {
                                if (!btmVar2.a()) {
                                    return btmVar2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                btmVar = btmVar2;
                                e.printStackTrace();
                                wsm.b(csm.a("PreloadTaskStore"), "get cache error", e);
                                return btmVar;
                            }
                        }
                        btmVar = btmVar2;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        return btmVar;
    }

    public void b() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f1261a", new Object[]{this});
            return;
        }
        for (String str : this.b) {
            for (String str2 : this.c) {
                c(str, str2);
            }
        }
    }

    public void c(String str, String str2) {
        btm value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b544d62e", new Object[]{this, str, str2});
            return;
        }
        LruCache<String, btm> d = this.f22914a.d(str, str2);
        if (d != null) {
            StringBuilder sb = new StringBuilder("cacheType: ");
            sb.append(str);
            sb.append(", cacheHit: ");
            sb.append(str2);
            sb.append("当前队列：");
            for (Map.Entry<String, btm> entry : d.snapshot().entrySet()) {
                if (!(entry == null || (value = entry.getValue()) == null)) {
                    sb.append(value.d);
                    sb.append(",");
                }
            }
            wsm.c(csm.a("PreloadTaskStore"), sb.toString());
        }
    }

    public btm d(btm btmVar) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btm) ipChange.ipc$dispatch("a1228f80", new Object[]{this, btmVar});
        }
        btm btmVar2 = null;
        try {
            LruCache<String, btm> e2 = this.f22914a.e(btmVar);
            btm put = e2.put(btmVar.d, btmVar);
            try {
                if (cw6.b()) {
                    String a2 = csm.a("PreloadTaskStore");
                    wsm.c(a2, "save cache success" + btmVar.toString());
                }
                String a3 = csm.a("PreloadTaskStore");
                wsm.c(a3, "save cache success: cache_size:" + e2.size() + "max_size:" + e2.maxSize());
                return put;
            } catch (Exception e3) {
                e = e3;
                btmVar2 = put;
                e.printStackTrace();
                wsm.b(csm.a("PreloadTaskStore"), "save cache error", e);
                return btmVar2;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public void e(xmh.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f41a39", new Object[]{this, aVar});
        } else {
            this.f22914a.f(aVar);
        }
    }

    public void f(String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea815dfc", new Object[]{this, str});
            return;
        }
        try {
            for (String str2 : this.b) {
                for (String str3 : this.c) {
                    LruCache<String, btm> d = this.f22914a.d(str2, str3);
                    if (d != null) {
                        d.remove(str);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            wsm.b(csm.a("PreloadTaskStore"), "get cache error", e);
        }
    }

    public btm g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btm) ipChange.ipc$dispatch("8d9eb90b", new Object[]{this, str, str2});
        }
        return a(str);
    }

    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79a5a8fd", new Object[]{this, str})).booleanValue();
        }
        btm a2 = a(str);
        if (a2 == null || a2.a()) {
            return false;
        }
        return true;
    }
}
