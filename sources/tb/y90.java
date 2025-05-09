package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class y90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final y90 INSTANCE = new y90();

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f31917a;
    public static ja0 b;
    public static volatile Boolean c;
    public static long d;
    public static long e;
    public static long f;
    public static final ThreadPoolExecutor g;

    public static final Thread d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("fc39768", new Object[]{runnable});
        }
        Thread thread = new Thread(runnable);
        thread.setPriority(10);
        thread.setName("ActivateDataHelper");
        return thread;
    }

    public static final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a37f9a", new Object[0]);
        } else if (c == null && b == null) {
            k3p.d();
            if (INSTANCE.k()) {
                c = Boolean.TRUE;
                long currentTimeMillis = System.currentTimeMillis();
                String d2 = eno.d(Globals.getApplication(), "search_door:data", "");
                d = System.currentTimeMillis() - currentTimeMillis;
                if (!TextUtils.isEmpty(d2)) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    b = new ha0("").d(JSON.parseObject(d2));
                    e = System.currentTimeMillis() - currentTimeMillis2;
                }
                f = System.currentTimeMillis() - currentTimeMillis;
                return;
            }
            c = Boolean.FALSE;
        }
    }

    public final long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d38ead53", new Object[]{this})).longValue();
        }
        return f;
    }

    public final long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d97c9965", new Object[]{this})).longValue();
        }
        return e;
    }

    public final ExecutorService h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("b2d626ea", new Object[]{this});
        }
        return g;
    }

    public final long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ece02f4", new Object[]{this})).longValue();
        }
        return d;
    }

    public final ja0 j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ja0) ipChange.ipc$dispatch("4c131602", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return b;
        }
        if (!i04.R(f31917a, str)) {
            return b;
        }
        return null;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
        } else {
            g.execute(new Runnable() { // from class: tb.ocm
                @Override // java.lang.Runnable
                public final void run() {
                    y90.e();
                }
            });
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6772aef7", new Object[]{this, str});
            return;
        }
        HashSet<String> hashSet = f31917a;
        if (str == null) {
            str = "";
        }
        if (!hashSet.contains(str)) {
            l();
        }
    }

    public final void q(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f07f60a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            c = Boolean.TRUE;
            le1.a().execute(new Runnable() { // from class: tb.yjl
                @Override // java.lang.Runnable
                public final void run() {
                    y90.n(str);
                }
            });
        }
    }

    public final void r(String str, String str2, ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32aa4793", new Object[]{this, str, str2, ja0Var});
        } else {
            ckf.g(ja0Var, "result");
        }
    }

    public static final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb54e72", new Object[]{str});
            return;
        }
        try {
            b = new ha0("").d(JSON.parseObject(str));
            eno.e(Globals.getApplication(), "search_door:cache", true);
            eno.f(Globals.getApplication(), "search_door:data", str);
        } catch (Exception unused) {
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("470643b9", new Object[]{this})).booleanValue();
        }
        return eno.b(Globals.getApplication(), "search_door:cache", false);
    }

    static {
        t2o.a(815793142);
        HashSet<String> hashSet = new HashSet<>();
        f31917a = hashSet;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: tb.xjl
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread d2;
                d2 = y90.d(runnable);
                return d2;
            }
        });
        g = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        String X = o4p.X();
        if (TextUtils.isEmpty(X)) {
            hashSet.add("baiyibutie");
            hashSet.add("hj_xxms");
            hashSet.add("hongbaosrp");
            hashSet.add("julang_renqun");
            hashSet.add("yaofudai");
            hashSet.add("temaizhiying");
            return;
        }
        ckf.d(X);
        for (String str : wsq.z0(X, new String[]{","}, false, 0, 6, null)) {
            f31917a.add(str);
        }
    }
}
