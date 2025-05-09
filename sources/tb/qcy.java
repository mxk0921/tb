package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorCommitResult;
import com.tanx.exposer.achieve.AdMonitorType;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.gcy;
import tb.rcy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qcy extends gcy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Queue<String> e = new ConcurrentLinkedQueue();
    public static final Map<String, tcy> f = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26676a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(String str, String str2, String str3) {
            this.f26676a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qcy.f(qcy.this, this.f26676a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends gcy.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                rcy rcyVar = rcy.e.tanxc_do;
                b bVar = b.this;
                rcyVar.f(bVar.b, bVar.f19905a);
                qcy.d().remove(b.this.b.n());
                if (qcy.g().size() >= 1000) {
                    qcy.g().poll();
                }
                qcy.g().offer(b.this.b.n());
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.qcy$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC1037b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f26678a;
            public final /* synthetic */ String b;

            public RunnableC1037b(int i, String str) {
                this.f26678a = i;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                rcy rcyVar = rcy.e.tanxc_do;
                b bVar = b.this;
                rcyVar.e(bVar.b, this.f26678a, this.b, bVar.f19905a);
                if (!rcyVar.k(b.this.b)) {
                    qcy.d().remove(b.this.b.n());
                }
            }
        }

        static {
            t2o.a(283115545);
        }

        public b(tcy tcyVar, boolean z) {
            super(tcyVar, z);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tanx/exposer/achieve/committer/tanxc_if$tanxc_do");
        }

        @Override // tb.gcy.b, tb.szc
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            } else {
                pcy.a(new RunnableC1037b(i, str), 0L);
            }
        }

        @Override // tb.gcy.b, tb.szc
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else {
                pcy.a(new a(), 0L);
            }
        }
    }

    static {
        t2o.a(283115543);
    }

    public qcy(AdMonitorType adMonitorType, List<String> list, bd0 bd0Var) {
        super(adMonitorType, list, bd0Var);
    }

    public static /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9ca165a", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ void f(qcy qcyVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1893cbbc", new Object[]{qcyVar, str, str2, str3});
        } else {
            qcyVar.e(str, str2, str3);
        }
    }

    public static /* synthetic */ Queue g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("f6c30a17", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ Object ipc$super(qcy qcyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tanx/exposer/achieve/committer/tanxc_if");
    }

    @Override // tb.gcy
    public AdMonitorCommitResult a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorCommitResult) ipChange.ipc$dispatch("f7ebc899", new Object[]{this});
        }
        for (String str : this.f19903a) {
            String e2 = wzo.e(str);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(e2)) {
                ocy.i(this.c, this.b, "url_is_empty_or_hash_error");
            } else {
                String host = Uri.parse(str).getHost();
                if (TextUtils.isEmpty(host)) {
                    ocy.i(this.c, this.b, "domain_not_right");
                } else if (((ConcurrentLinkedQueue) e).contains(e2)) {
                    ocy.c(this.c);
                } else {
                    pcy.a(new a(str, host, e2), 0L);
                }
            }
        }
        return AdMonitorCommitResult.COMMITED;
    }

    public final void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67defd03", new Object[]{this, str, str2, str3});
        } else if (((ConcurrentLinkedQueue) e).contains(str3)) {
            ocy.c(this.c);
        } else {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f;
            tcy tcyVar = (tcy) concurrentHashMap.get(str3);
            if (tcyVar != null) {
                rcy.e.tanxc_do.d(tcyVar);
                bd0 bd0Var = this.c;
                if (bd0Var != null) {
                    qgh.d("tanx_expose_request_pending", bd0Var.toString());
                    return;
                }
                return;
            }
            ocy.f(this.c, this.b, str2, str3);
            bd0 bd0Var2 = this.c;
            String f2 = bd0Var2 == null ? str : wzo.f(str, bd0Var2.a());
            tcy tcyVar2 = new tcy(str, f2, this.b, str2, str3, this.d.c());
            tcyVar2.g(this.c);
            new lcy(this.d.d()).a(this.b, f2, new b(tcyVar2, false));
            concurrentHashMap.put(str3, tcyVar2);
        }
    }
}
