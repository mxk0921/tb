package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import tb.ner;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f16824a;
    public final Context b;
    public final String c;
    public final String d;
    public final Boolean e;
    public JSONObject f;
    public JSONArray g;
    public boolean h;
    public final CountDownLatch i = new CountDownLatch(1);
    public final CopyOnWriteArrayList<b> j = new CopyOnWriteArrayList<>();
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final String l = mcs.d("PubHomeDataTask");
    public final Runnable m = new f();
    public final c n = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152339);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(JSONArray jSONArray);

        void b(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements ner.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.ner.a
        public void onResult(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9b609d1", new Object[]{this, new Boolean(z)});
            } else if (z) {
                c3n.l(c3n.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements ner.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.ner.c
        public final void onResult(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
                return;
            }
            mcs.e("PubHomeDataTask", mcs.EVENT_ON_SUCCESS, c3n.k(c3n.this), c3n.f(c3n.this), jSONObject);
            CommonExtKt.l(c3n.j(c3n.this));
            if (c3n.d(c3n.this).get()) {
                TMSLogger.b("PubHomeDataTask", "首页请求mtop请求超时");
                return;
            }
            c3n.d(c3n.this).set(true);
            c3n.m(c3n.this, jSONObject);
            c3n.n(c3n.this, jSONObject == null ? null : jSONObject.getJSONArray("homePagePopDatas"));
            c3n c3nVar = c3n.this;
            ner.c(c3n.c(c3nVar), c3n.a(c3nVar), c3n.b(c3nVar));
            c3n.i(c3n.this).countDown();
            Iterator it = c3n.h(c3n.this).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(c3n.g(c3n.this));
            }
            c3n.h(c3n.this).clear();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements ner.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.ner.c
        public final void onResult(JSONObject jSONObject) {
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
                return;
            }
            if (jSONObject != null) {
                c3n c3nVar = c3n.this;
                JSONObject e = c3n.e(c3nVar);
                if (e != null) {
                    e.clear();
                }
                JSONObject e2 = c3n.e(c3nVar);
                if (e2 != null) {
                    e2.putAll(jSONObject);
                }
            }
            if (!(jSONObject == null || (jSONArray = jSONObject.getJSONArray("homePagePopDatas")) == null)) {
                c3n c3nVar2 = c3n.this;
                JSONArray g = c3n.g(c3nVar2);
                if (g != null) {
                    g.clear();
                }
                JSONArray g2 = c3n.g(c3nVar2);
                if (g2 != null) {
                    g2.addAll(jSONArray);
                }
            }
            if (jSONObject != null) {
                c3n c3nVar3 = c3n.this;
                ner.c(c3n.c(c3nVar3), c3n.a(c3nVar3), c3n.b(c3nVar3));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!c3n.d(c3n.this).get()) {
                String k = c3n.k(c3n.this);
                String f = c3n.f(c3n.this);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "error", (String) 1000);
                jSONObject.put((JSONObject) "errorMessage", "IconChangeDataTask is timeout");
                jSONObject.put((JSONObject) "data", (String) null);
                xhv xhvVar = xhv.INSTANCE;
                mcs.c("PubHomeDataTask", mcs.EVENT_ON_ERROR, k, f, jSONObject);
                c3n.d(c3n.this).set(true);
                c3n.i(c3n.this).countDown();
                Iterator it = c3n.h(c3n.this).iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    bVar.b(c3n.e(c3n.this));
                    bVar.a(null);
                }
                c3n.h(c3n.this).clear();
                TMSLogger.b("PubHomeDataTask", "首页请求mtop超时无回调");
            }
        }
    }

    static {
        t2o.a(845152338);
    }

    public c3n(String str, Context context, String str2, String str3, Boolean bool) {
        ckf.g(str, "appId");
        ckf.g(context, "context");
        ckf.g(str2, "traceId");
        this.f16824a = str;
        this.b = context;
        this.c = str2;
        this.d = str3;
        this.e = bool;
    }

    public static final /* synthetic */ String a(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be63de6a", new Object[]{c3nVar});
        }
        return c3nVar.f16824a;
    }

    public static final /* synthetic */ c b(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("623e6f58", new Object[]{c3nVar});
        }
        return c3nVar.n;
    }

    public static final /* synthetic */ Context c(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b0b204c1", new Object[]{c3nVar});
        }
        return c3nVar.b;
    }

    public static final /* synthetic */ AtomicBoolean d(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ec836ce6", new Object[]{c3nVar});
        }
        return c3nVar.k;
    }

    public static final /* synthetic */ JSONObject e(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a58ad431", new Object[]{c3nVar});
        }
        return c3nVar.f;
    }

    public static final /* synthetic */ String f(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2f8953", new Object[]{c3nVar});
        }
        return c3nVar.l;
    }

    public static final /* synthetic */ JSONArray g(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c816d47a", new Object[]{c3nVar});
        }
        return c3nVar.g;
    }

    public static final /* synthetic */ CopyOnWriteArrayList h(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("617d2105", new Object[]{c3nVar});
        }
        return c3nVar.j;
    }

    public static final /* synthetic */ CountDownLatch i(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("49beebf3", new Object[]{c3nVar});
        }
        return c3nVar.i;
    }

    public static final /* synthetic */ Runnable j(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("6d8e3b3c", new Object[]{c3nVar});
        }
        return c3nVar.m;
    }

    public static final /* synthetic */ String k(c3n c3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ea5a46", new Object[]{c3nVar});
        }
        return c3nVar.c;
    }

    public static final /* synthetic */ void l(c3n c3nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffb71e0", new Object[]{c3nVar, new Boolean(z)});
        } else {
            c3nVar.h = z;
        }
    }

    public static final /* synthetic */ void m(c3n c3nVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fc9273", new Object[]{c3nVar, jSONObject});
        } else {
            c3nVar.f = jSONObject;
        }
    }

    public static final /* synthetic */ void n(c3n c3nVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd302478", new Object[]{c3nVar, jSONArray});
        } else {
            c3nVar.g = jSONArray;
        }
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1adada4", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        mcs.b("PubHomeDataTask", mcs.EVENT_ON_EXECUTE, this.c, this.l, new JSONObject());
        d dVar = new d();
        String str = this.c;
        String str2 = this.l;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "appId", this.f16824a);
        xhv xhvVar = xhv.INSTANCE;
        mcs.e("PubHomeDataTask", mcs.EVENT_ON_START, str, str2, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "miniappSourceChannel", this.d);
        jSONObject2.put((JSONObject) "isAFCLink", (String) this.e);
        ner.j(this.b, this.f16824a, jSONObject2, dVar);
        CommonExtKt.p(this.m, 3000L);
    }

    public final JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("499d5ca9", new Object[]{this});
        }
        return this.f;
    }

    public final JSONObject r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a19d18e4", new Object[]{this});
        }
        if (this.k.get()) {
            return this.f;
        }
        try {
            this.i.await(3000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TMSLogger.c("PubHomeDataTask", th.getMessage(), th);
        }
        return this.f;
    }

    public final JSONArray s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7498a6f8", new Object[]{this});
        }
        return this.g;
    }

    public final JSONArray t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7a948ddd", new Object[]{this});
        }
        if (this.k.get()) {
            return this.g;
        }
        try {
            this.i.await(3000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TMSLogger.c("PubHomeDataTask", th.getMessage(), th);
        }
        return this.g;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        e eVar = new e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "miniappSourceChannel", this.d);
        jSONObject.put((JSONObject) "isAFCLink", (String) this.e);
        ner.j(this.b, this.f16824a, jSONObject, eVar);
    }
}
