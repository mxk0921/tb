package com.taobao.android.detail.ttdetail.widget.video;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.TTImageUrlView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;
import tb.u9d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile a c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Map<String, C0387a>> f7068a = new ConcurrentHashMap(3);
    public final Map<Integer, Boolean> b = new ConcurrentHashMap(3);

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.widget.video.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0387a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TTImageUrlView f7069a;
        public final u9d b;
        public int c;

        static {
            t2o.a(912263137);
        }

        public C0387a(u9d u9dVar, TTImageUrlView tTImageUrlView) {
            this.f7069a = tTImageUrlView;
            this.b = u9dVar;
        }

        public TTImageUrlView a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TTImageUrlView) ipChange.ipc$dispatch("6e6f2387", new Object[]{this});
            }
            return this.f7069a;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d6056adf", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public u9d c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u9d) ipChange.ipc$dispatch("496220b1", new Object[]{this});
            }
            return this.b;
        }

        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b29ecda3", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }
    }

    static {
        t2o.a(912263136);
    }

    public static synchronized a d() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("47c73f49", new Object[0]);
            }
            if (c == null) {
                c = new a();
            }
            return c;
        }
    }

    public synchronized void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779a7c9f", new Object[]{this, obj});
            return;
        }
        ((ConcurrentHashMap) this.f7068a).put(Integer.valueOf(obj.hashCode()), new ConcurrentHashMap(3));
    }

    public synchronized void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c091d", new Object[]{this, obj});
            return;
        }
        int hashCode = obj.hashCode();
        Map map = (Map) ((ConcurrentHashMap) this.f7068a).get(Integer.valueOf(hashCode));
        if (map != null) {
            for (C0387a aVar : map.values()) {
                aVar.c().destroy();
            }
            ((ConcurrentHashMap) this.f7068a).remove(Integer.valueOf(hashCode));
        }
    }

    public synchronized C0387a c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0387a) ipChange.ipc$dispatch("4afdbd81", new Object[]{this, obj, str});
        } else if (str == null) {
            return null;
        } else {
            Map map = (Map) ((ConcurrentHashMap) this.f7068a).get(Integer.valueOf(obj.hashCode()));
            if (map == null) {
                return null;
            }
            return (C0387a) map.get(str);
        }
    }

    public boolean e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43e260ea", new Object[]{this, obj})).booleanValue();
        }
        Object obj2 = ((ConcurrentHashMap) this.b).get(Integer.valueOf(obj.hashCode()));
        if (obj2 instanceof Boolean) {
            return ((Boolean) obj2).booleanValue();
        }
        return false;
    }

    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3481aa19", new Object[]{this, obj});
            return;
        }
        Map map = (Map) ((ConcurrentHashMap) this.f7068a).get(Integer.valueOf(obj.hashCode()));
        if (map != null) {
            for (C0387a aVar : map.values()) {
                int videoState = aVar.c().getVideoState();
                aVar.d(videoState);
                if (videoState == 1) {
                    aVar.c().pauseVideo();
                }
            }
        }
    }

    public synchronized void g(Object obj, String str, C0387a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f73c92", new Object[]{this, obj, str, aVar});
        } else if (str != null) {
            Map map = (Map) ((ConcurrentHashMap) this.f7068a).get(Integer.valueOf(obj.hashCode()));
            if (map != null) {
                map.put(str, aVar);
            }
        }
    }

    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3459b910", new Object[]{this, obj});
            return;
        }
        Map map = (Map) ((ConcurrentHashMap) this.f7068a).get(Integer.valueOf(obj.hashCode()));
        if (map != null) {
            for (C0387a aVar : map.values()) {
                if (aVar.b() == 1) {
                    aVar.c().playVideo();
                }
            }
        }
    }

    public void i(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d48cf5", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        ((ConcurrentHashMap) this.b).put(Integer.valueOf(obj.hashCode()), Boolean.valueOf(z));
    }
}
