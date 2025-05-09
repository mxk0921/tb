package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import tb.y49;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p49 implements r5c, dlq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f25873a = new ConcurrentHashMap();
    public final rdq b = rdq.b();
    public final Map<String, y49> c = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable, y49 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Executor f25874a;
        private y49.a b;
        private y49 c;
        private String d;
        private String e;
        private int f;

        static {
            t2o.a(676331674);
            t2o.a(676331675);
        }

        public a(String str, y49.a aVar, y49 y49Var, Executor executor) {
            this.b = aVar;
            this.c = y49Var;
            this.d = str;
            this.f25874a = executor;
        }

        @Override // tb.y49
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6bf56534", new Object[]{this, str, new Integer(i)});
                return;
            }
            this.e = str;
            this.f = i;
            Executor executor = this.f25874a;
            if (executor != null) {
                executor.execute(this);
            } else {
                p49.c(p49.this).a(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TextUtils.isEmpty(this.d) || !this.d.equals(this.e)) {
                y49 y49Var = this.c;
                if (y49Var != null) {
                    y49Var.a(this.e, this.f);
                }
            } else {
                this.b.onFeatureStatusChange(this.f);
            }
        }
    }

    static {
        t2o.a(676331673);
        t2o.a(676331677);
        t2o.a(676331678);
    }

    public static /* synthetic */ rdq c(p49 p49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rdq) ipChange.ipc$dispatch("f90ca4b1", new Object[]{p49Var});
        }
        return p49Var.b;
    }

    @Override // tb.dlq
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cec9502", new Object[]{this, str, str2});
            return;
        }
        synchronized (this.c) {
            try {
                DynamicFeatureInfo dynamicFeatureInfo = BundleInfoManager.instance().getDynamicFeatureInfo(str2);
                if (dynamicFeatureInfo != null && !dynamicFeatureInfo.appVersion.equals(str)) {
                    for (y49 y49Var : ((LinkedHashMap) this.c).values()) {
                        y49Var.a(str2, -1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tb.dlq
    public void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518cf63", new Object[]{this, str, new Integer(i)});
            return;
        }
        synchronized (this.c) {
            try {
                DynamicFeatureInfo dynamicFeatureInfo = BundleInfoManager.instance().getDynamicFeatureInfo(str);
                if (!(dynamicFeatureInfo == null || dynamicFeatureInfo.status == -1)) {
                    for (y49 y49Var : ((LinkedHashMap) this.c).values()) {
                        y49Var.a(str, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((ConcurrentHashMap) this.f25873a).put(str, Integer.valueOf(i));
    }

    public int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ce3d3d6", new Object[]{this, str})).intValue();
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null || !((ConcurrentHashMap) this.f25873a).containsKey(str)) {
            return 0;
        }
        return ((Integer) ((ConcurrentHashMap) this.f25873a).get(str)).intValue();
    }

    public void e(String str, y49.a aVar, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fd7e5", new Object[]{this, str, aVar, executor});
            return;
        }
        a aVar2 = new a(str, aVar, null, executor);
        synchronized (this.c) {
            try {
                this.c.put(aVar.toString(), aVar2);
                if (((ConcurrentHashMap) this.f25873a).containsKey(str)) {
                    aVar2.a(str, ((Integer) ((ConcurrentHashMap) this.f25873a).get(str)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(y49 y49Var, Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d2a1", new Object[]{this, y49Var, executor});
            return;
        }
        a aVar = new a(null, null, y49Var, executor);
        synchronized (this.c) {
            try {
                this.c.put(y49Var.getClass().getName(), aVar);
                if (((ConcurrentHashMap) this.f25873a).size() > 0) {
                    for (Map.Entry entry : ((ConcurrentHashMap) this.f25873a).entrySet()) {
                        aVar.a((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(y49.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5619e1e2", new Object[]{this, aVar});
            return;
        }
        synchronized (this.c) {
            this.c.remove(aVar.getClass().getName());
        }
    }
}
