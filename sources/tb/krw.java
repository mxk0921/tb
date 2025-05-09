package tb;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class krw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_CACHE_TIME = 2000;
    public static krw c = null;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, lrw> f22877a = null;
    public final Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22878a;

        public a(String str) {
            this.f22878a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                krw.this.c(this.f22878a);
            }
        }
    }

    static {
        t2o.a(989855768);
    }

    public krw() {
        try {
            HandlerThread a2 = wsa.a("WindVane");
            if (!a2.isAlive()) {
                a2.start();
            }
            this.b = new Handler(a2.getLooper());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static synchronized krw d() {
        synchronized (krw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (krw) ipChange.ipc$dispatch("ca8f16d2", new Object[0]);
            }
            if (c == null) {
                c = new krw();
            }
            return c;
        }
    }

    public void a(String str, Map<String, List<String>> map, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef689cfb", new Object[]{this, str, map, bArr});
            return;
        }
        vpw.b();
        b(str, map, bArr, vpw.commonConfig.b0, 0L);
    }

    public void b(String str, Map<String, List<String>> map, byte[] bArr, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c422bb", new Object[]{this, str, map, bArr, new Long(j), new Long(j2)});
            return;
        }
        if (this.f22877a == null) {
            this.f22877a = new HashMap<>();
        }
        if (str != null) {
            lrw lrwVar = new lrw(str, map, bArr, j, j2);
            String c2 = gtw.c(str);
            this.f22877a.put(c2, lrwVar);
            Handler handler = this.b;
            if (handler != null) {
                handler.postDelayed(new a(c2), j);
            }
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0daa3b4", new Object[]{this, str});
            return;
        }
        HashMap<String, lrw> hashMap = this.f22877a;
        if (hashMap != null && hashMap.containsKey(str)) {
            v7t.a("WVMemoryCache", "clearCacheByUrl url=" + str + ",realUrl=" + this.f22877a.remove(str).c);
        }
    }

    public lrw e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrw) ipChange.ipc$dispatch("fb33890", new Object[]{this, str});
        }
        HashMap<String, lrw> hashMap = this.f22877a;
        if (hashMap == null || str == null) {
            return null;
        }
        return hashMap.get(gtw.c(str));
    }

    public lrw f(String str) {
        Throwable th;
        lrw lrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrw) ipChange.ipc$dispatch("41a6db4a", new Object[]{this, str});
        }
        lrw lrwVar2 = null;
        if (this.f22877a == null || str == null) {
            return null;
        }
        try {
            lrwVar = this.f22877a.get(gtw.c(str));
        } catch (Throwable th2) {
            th = th2;
        }
        if (lrwVar == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(lrwVar.c);
            Set<String> queryParameterNames = parse2.getQueryParameterNames();
            Iterator<String> it = parse2.getQueryParameterNames().iterator();
            while (true) {
                if (!it.hasNext()) {
                    lrwVar2 = lrwVar;
                    break;
                }
                String next = it.next();
                if (!queryParameterNames.contains(next)) {
                    v7t.d("WVMemoryCache", "param key don't match, query=" + next + " ,targetQueryParams=" + queryParameterNames);
                    break;
                }
                String queryParameter = parse.getQueryParameter(next);
                String queryParameter2 = parse2.getQueryParameter(next);
                if (!queryParameter.equals(queryParameter2)) {
                    v7t.d("WVMemoryCache", "param don't match, query=" + next + " ,targetParam=" + queryParameter + " ,cachedParam=" + queryParameter2);
                    break;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            lrwVar2 = lrwVar;
            v7t.d("WVMemoryCache", "getMemoryCacheByUrlForHtml error!");
            th.printStackTrace();
            return lrwVar2;
        }
        return lrwVar2;
    }
}
