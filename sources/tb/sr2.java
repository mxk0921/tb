package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.a;
import com.taobao.android.detail.ttdetail.async.mtop.MtopRequester;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class sr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CacheAsyncRequestWrapper";

    /* renamed from: a  reason: collision with root package name */
    public final MtopRequester f28221a;
    public final String b;
    public final String c;
    public final a.c d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final ze7 f;
    public final nb4 g;
    public final boolean h;
    public static final b Companion = new b(null);
    public static final HashMap<String, HashMap<String, a>> i = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public a.c f28222a;
        public JSONObject b;
        public boolean c;
        public MtopRequester.a d;
        public String e;

        static {
            t2o.a(912261277);
        }

        public a(sr2 sr2Var) {
        }

        public final a.c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a.c) ipChange.ipc$dispatch("299d435a", new Object[]{this});
            }
            return this.f28222a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3644dd4", new Object[]{this});
            }
            return this.e;
        }

        public final MtopRequester.a c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopRequester.a) ipChange.ipc$dispatch("7a044a42", new Object[]{this});
            }
            return this.d;
        }

        public final JSONObject d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("7ec2c354", new Object[]{this});
            }
            return this.b;
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f29c0bef", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public final void f(a.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("449f422c", new Object[]{this, cVar});
            } else {
                this.f28222a = cVar;
            }
        }

        public final void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9dc54e8a", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public final void h(MtopRequester.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a47a1b6", new Object[]{this, aVar});
            } else {
                this.d = aVar;
            }
        }

        public final void i(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("576d7b48", new Object[]{this, jSONObject});
            } else {
                this.b = jSONObject;
            }
        }

        public final void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5fc936a", new Object[]{this, str});
            }
        }

        public final void k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70c8d181", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261278);
        }

        public b() {
        }

        public final HashMap<String, HashMap<String, a>> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("ae11dbd0", new Object[]{this});
            }
            return sr2.g();
        }

        public final void b(ze7 ze7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd1e85ef", new Object[]{this, ze7Var});
                return;
            }
            ckf.h(ze7Var, "detailContext");
            a().remove(String.valueOf(ze7Var.hashCode()));
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MtopRequester.a b;

        public c(MtopRequester.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sr2.a(sr2.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d implements MtopRequester.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ MtopRequester.a c;

        public d(long j, MtopRequester.a aVar) {
            this.b = j;
            this.c = aVar;
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                this.c.onFail(str);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            try {
                if (sr2.h(sr2.this)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
                    ze7 d = sr2.d(sr2.this);
                    PerformanceUtils.n(d, sr2.c(sr2.this).k() + "NetWorkCost", elapsedRealtime);
                    tgh.b(sr2.TAG, "sendAsyncMtopConfig run success: " + sr2.c(sr2.this).k() + " cost: " + elapsedRealtime);
                }
            } catch (Exception e) {
                tgh.c(sr2.TAG, "onSuccess: Exception", e);
            }
            this.c.onSuccess(jSONObject);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MtopRequester.a b;

        public e(MtopRequester.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sr2.i(sr2.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class f implements MtopRequester.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ MtopRequester.a c;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;

            public a(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar;
                a aVar2;
                MtopRequester.a c;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = sr2.Companion;
                HashMap<String, a> hashMap = bVar.a().get(sr2.e(sr2.this));
                if (!(hashMap == null || (aVar2 = hashMap.get(sr2.b(sr2.this))) == null || (c = aVar2.c()) == null)) {
                    c.onFail(this.b);
                }
                HashMap<String, a> hashMap2 = bVar.a().get(sr2.e(sr2.this));
                if (!(hashMap2 == null || (aVar = hashMap2.get(sr2.b(sr2.this))) == null)) {
                    String str = this.b;
                    if (str == null) {
                        str = "onFail";
                    }
                    aVar.g(str);
                    aVar.h(null);
                }
                tgh.b(sr2.TAG, "提前请求失败，apiMethod = " + sr2.b(sr2.this));
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ JSONObject b;

            public b(JSONObject jSONObject) {
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar;
                a aVar2;
                MtopRequester.a c;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = sr2.Companion;
                HashMap<String, a> hashMap = bVar.a().get(sr2.e(sr2.this));
                if (!(hashMap == null || (aVar2 = hashMap.get(sr2.b(sr2.this))) == null || (c = aVar2.c()) == null)) {
                    c.onSuccess(this.b);
                }
                HashMap<String, a> hashMap2 = bVar.a().get(sr2.e(sr2.this));
                if (!(hashMap2 == null || (aVar = hashMap2.get(sr2.b(sr2.this))) == null)) {
                    aVar.i(this.b);
                    aVar.h(null);
                }
                tgh.b(sr2.TAG, "提前请求成功，apiMethod = " + sr2.b(sr2.this) + " map = " + bVar.a());
            }
        }

        public f(long j, MtopRequester.a aVar) {
            this.b = j;
            this.c = aVar;
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            sr2.f(sr2.this).post(new a(str));
            this.c.onFail(str);
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            ckf.h(jSONObject, "responseData");
            try {
                if (sr2.h(sr2.this)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
                    ze7 d = sr2.d(sr2.this);
                    PerformanceUtils.n(d, sr2.c(sr2.this).k() + "NetWorkCost", elapsedRealtime);
                    tgh.b(sr2.TAG, "sendAsyncMtopConfig preRun success: " + sr2.c(sr2.this).k() + " cost: " + elapsedRealtime);
                }
            } catch (Exception e) {
                tgh.c(sr2.TAG, "onSuccess: Exception", e);
            }
            sr2.f(sr2.this).post(new b(jSONObject));
            this.c.onSuccess(jSONObject);
        }
    }

    static {
        t2o.a(912261276);
    }

    public sr2(ze7 ze7Var, a.c cVar, nb4 nb4Var) {
        ckf.h(ze7Var, "detailContext");
        ckf.h(cVar, "config");
        ckf.h(nb4Var, "componentHolder");
        this.f28221a = new MtopRequester(cVar);
        String b2 = cVar.b();
        ckf.c(b2, "config.apiMethod");
        this.b = b2;
        this.c = String.valueOf(ze7Var.hashCode());
        this.f = ze7Var;
        this.d = cVar;
        this.g = nb4Var;
        this.h = yc4.p(nb4Var);
    }

    public static final /* synthetic */ void a(sr2 sr2Var, MtopRequester.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b8cfd9", new Object[]{sr2Var, aVar});
        } else {
            sr2Var.k(aVar);
        }
    }

    public static final /* synthetic */ String b(sr2 sr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7bc7598", new Object[]{sr2Var});
        }
        return sr2Var.b;
    }

    public static final /* synthetic */ nb4 c(sr2 sr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb4) ipChange.ipc$dispatch("4525c572", new Object[]{sr2Var});
        }
        return sr2Var.g;
    }

    public static final /* synthetic */ ze7 d(sr2 sr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("59a3d10f", new Object[]{sr2Var});
        }
        return sr2Var.f;
    }

    public static final /* synthetic */ String e(sr2 sr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("308269ec", new Object[]{sr2Var});
        }
        return sr2Var.c;
    }

    public static final /* synthetic */ Handler f(sr2 sr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e23fff48", new Object[]{sr2Var});
        }
        return sr2Var.e;
    }

    public static final /* synthetic */ HashMap g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a4924855", new Object[0]);
        }
        return i;
    }

    public static final /* synthetic */ boolean h(sr2 sr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbbc8e52", new Object[]{sr2Var})).booleanValue();
        }
        return sr2Var.h;
    }

    public static final /* synthetic */ void i(sr2 sr2Var, MtopRequester.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a739c12", new Object[]{sr2Var, aVar});
        } else {
            sr2Var.n(aVar);
        }
    }

    public final void j(MtopRequester.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4bb1a6", new Object[]{this, aVar});
            return;
        }
        ckf.h(aVar, "requestCallback");
        if (ckf.b(Looper.myLooper(), Looper.getMainLooper())) {
            k(aVar);
        } else {
            this.e.post(new c(aVar));
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f755d1", new Object[]{this});
            return;
        }
        HashMap<String, HashMap<String, a>> hashMap = i;
        if (hashMap.get(this.c) == null) {
            String str = this.c;
            HashMap<String, a> hashMap2 = new HashMap<>();
            String str2 = this.b;
            a aVar = new a(this);
            aVar.j(this.c);
            aVar.f(this.d);
            aVar.k(true);
            hashMap2.put(str2, aVar);
            hashMap.put(str, hashMap2);
            return;
        }
        HashMap<String, a> hashMap3 = hashMap.get(this.c);
        if (hashMap3 != null) {
            String str3 = this.b;
            a aVar2 = new a(this);
            aVar2.j(this.c);
            aVar2.f(this.d);
            aVar2.k(true);
            hashMap3.put(str3, aVar2);
        }
    }

    public final void m(MtopRequester.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb6a008d", new Object[]{this, aVar});
            return;
        }
        ckf.h(aVar, "requestCallback");
        if (ckf.b(Looper.myLooper(), Looper.getMainLooper())) {
            n(aVar);
        } else {
            this.e.post(new e(aVar));
        }
    }

    public final void k(MtopRequester.a aVar) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b57aa49", new Object[]{this, aVar});
            return;
        }
        HashMap<String, a> hashMap = i.get(this.c);
        String str = null;
        JSONObject jSONObject = null;
        a aVar2 = hashMap != null ? hashMap.get(this.b) : null;
        if (ckf.b((aVar2 == null || (a2 = aVar2.a()) == null) ? null : a2.c(), this.d.c())) {
            if ((aVar2 != null ? aVar2.d() : null) != null) {
                tgh.b(TAG, "命中缓存 success，apiMethod = " + this.b);
                if (aVar2 != null) {
                    jSONObject = aVar2.d();
                }
                aVar.onSuccess(jSONObject);
                return;
            }
            if ((aVar2 != null ? aVar2.b() : null) != null) {
                tgh.b(TAG, "命中缓存 fail，apiMethod = " + this.b);
                if (aVar2 != null) {
                    str = aVar2.b();
                }
                aVar.onFail(str);
                return;
            }
        }
        if (aVar2 == null || !aVar2.e()) {
            tgh.b(TAG, "发起请求，apiMethod = " + this.b);
            this.f28221a.a(new d(SystemClock.elapsedRealtime(), aVar));
            l();
            return;
        }
        aVar2.h(aVar);
    }

    public final void n(MtopRequester.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5579e02", new Object[]{this, aVar});
            return;
        }
        HashMap<String, a> hashMap = i.get(this.c);
        a aVar2 = hashMap != null ? hashMap.get(this.b) : null;
        if (aVar2 == null || !aVar2.e()) {
            tgh.b(TAG, "正在提前请求，apiMethod = " + this.b);
            this.f28221a.a(new f(SystemClock.elapsedRealtime(), aVar));
            l();
        }
    }
}
