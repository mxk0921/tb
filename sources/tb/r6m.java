package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r6m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, b> f27150a = new LruCache<>(50);
    public static final List<a> b = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(String str, b bVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f27151a;
        public final int b;
        public final long c;

        static {
            t2o.a(468714687);
        }

        public b(String str, String str2, int i, long j) {
            this.f27151a = str2;
            this.b = i;
            this.c = j;
        }
    }

    static {
        t2o.a(468714685);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2281b0b4", new Object[]{aVar});
        } else {
            ((ArrayList) b).add(aVar);
        }
    }

    public static void b(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47a075b", new Object[]{str, str2, new Integer(i), str3});
            return;
        }
        ir9.b("CachePriorityManager", str3 + " => 产生缓存:" + str + "," + str2 + "," + i);
        if (!TextUtils.isEmpty(str)) {
            LruCache<String, b> lruCache = f27150a;
            if (lruCache.get(str) == null) {
                b bVar = new b(str, str2, i, System.currentTimeMillis());
                lruCache.put(str, bVar);
                Iterator it = ((ArrayList) b).iterator();
                while (it.hasNext()) {
                    try {
                        ((a) it.next()).a(str, bVar);
                    } catch (Exception e) {
                        ir9.c("CachePriorityManager", "notifyPlayerCacheGenerated error", e);
                    }
                }
            }
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300361a6", new Object[]{str, str2});
            return;
        }
        ir9.b("CachePriorityManager", "尝试降低优先级：" + str + "," + str2);
        if (TextUtils.isEmpty(str2)) {
            str2 = d(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            long currentTimeMillis = System.currentTimeMillis();
            exm.k().j(str, str2);
            long currentTimeMillis2 = System.currentTimeMillis();
            ir9.b("CachePriorityManager", "降低优先级耗时：" + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public static String d(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abdb3ef7", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (bVar = f27150a.get(str)) != null) {
            return bVar.f27151a;
        }
        return null;
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52b04021", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = d(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        exm.k().m(str, str2);
        return str2;
    }
}
