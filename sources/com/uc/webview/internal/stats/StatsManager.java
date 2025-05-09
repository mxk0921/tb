package com.uc.webview.internal.stats;

import android.os.Handler;
import android.os.Message;
import com.uc.webview.base.task.b;
import com.uc.webview.internal.stats.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class StatsManager {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f14501a;
    private static volatile boolean b;
    private static long c = System.currentTimeMillis();
    private static final ArrayList<h> d = new ArrayList<>();
    private static final ArrayList<a> e = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f14502a;
        public final Map<String, String> b = new HashMap();

        public a(String str, Map<String, String> map) {
            this.f14502a = str;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Map<String, String> map2 = this.b;
                if (!key.startsWith("_")) {
                    key = "_".concat(key);
                }
                map2.put(key, value);
            }
        }

        public final void a() {
            e.a(true, false, this.f14502a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Message f14503a;

        public b(Message message) {
            this.f14503a = message;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message message = this.f14503a;
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (f.d.contains(cVar.g())) {
                        e.a(cVar.g(), cVar.e());
                    } else {
                        cVar.i();
                    }
                }
            } else if (i == 2) {
                boolean unused = StatsManager.f14501a = false;
                StatsManager.c();
            } else if (i == 3) {
                boolean unused2 = StatsManager.b = false;
                if (StatsManager.e()) {
                    StatsManager.c();
                }
            } else if (i == 4) {
                Object obj2 = message.obj;
                if (obj2 instanceof a) {
                    a aVar = (a) obj2;
                    if (f.d.contains(aVar.f14502a)) {
                        aVar.a();
                    } else {
                        StatsManager.e.add(aVar);
                    }
                }
            }
            message.recycle();
        }
    }

    public static /* synthetic */ void c() {
        c = System.currentTimeMillis();
        synchronized (StatsManager.class) {
            try {
                ArrayList<h> arrayList = d;
                if (!arrayList.isEmpty()) {
                    Iterator it = ((ArrayList) arrayList.clone()).iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a();
                    }
                    ArrayList<a> arrayList2 = e;
                    if (!arrayList2.isEmpty()) {
                        Iterator<a> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            it2.next().a();
                        }
                        e.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void commit(String str, Map<String, String> map) {
        c.a b2 = com.uc.webview.stat.a.b(str);
        if (b2 != null) {
            a(b2.a(map));
            return;
        }
        b.a.f14282a.a(new b(Message.obtain(null, 4, new a(str, map))));
    }

    public static void commitOnAppropriateTime() {
        if (!b) {
            b.a.f14282a.a(new b(Message.obtain((Handler) null, 3)));
            b = true;
        }
    }

    public static /* synthetic */ boolean e() {
        if (System.currentTimeMillis() - c > 300000) {
            return true;
        }
        return false;
    }

    public static void timeToCommit() {
        if (!f14501a) {
            b.a.f14282a.a(new b(Message.obtain((Handler) null, 2)));
            f14501a = true;
        }
    }

    public static void a(c cVar) {
        b.a.f14282a.a(new b(Message.obtain(null, 1, cVar)));
    }

    public static void a(h hVar) {
        synchronized (StatsManager.class) {
            d.add(hVar);
        }
    }
}
