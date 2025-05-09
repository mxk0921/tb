package com.taobao.android.detail.ttdetail.async;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.a;
import com.taobao.android.detail.ttdetail.async.mtop.MtopRequester;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.ir;
import tb.kg;
import tb.nb4;
import tb.rr2;
import tb.sr2;
import tb.t2o;
import tb.tgh;
import tb.xq8;
import tb.yc4;
import tb.yul;
import tb.ze7;
import tb.zul;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AsyncProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_LIST_NAME = "asyncModuleEntry";
    public static final String KEY_ASYNC_STATUS = "asyncStatus";
    public static final String KEY_ASYNC_STATUS_INIT = "init";
    public static final List<String> sEventTypes = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.async.AsyncProcessor.1
        {
            add(kg.EVENT_TYPE);
            add("shopRecommendV2");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6680a;
    public final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements MtopRequester.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.detail.ttdetail.async.a f6681a;
        public final /* synthetic */ nb4 b;
        public final /* synthetic */ d c;
        public final /* synthetic */ RuntimeAbilityParam[] d;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail.ttdetail.async.AsyncProcessor$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0350a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6682a;

            public RunnableC0350a(String str) {
                this.f6682a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                AsyncProcessor.e(AsyncProcessor.this, this.f6682a, aVar.c);
                a aVar2 = a.this;
                AsyncProcessor.f(AsyncProcessor.this, false, aVar2.f6681a.d(), a.this.d);
            }
        }

        public a(com.taobao.android.detail.ttdetail.async.a aVar, nb4 nb4Var, d dVar, RuntimeAbilityParam[] runtimeAbilityParamArr) {
            this.f6681a = aVar;
            this.b = nb4Var;
            this.c = dVar;
            this.d = runtimeAbilityParamArr;
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            AsyncProcessor.d(AsyncProcessor.this, false, this.f6681a.d(), this.b);
            AsyncProcessor.g(AsyncProcessor.this).post(new RunnableC0350a(str));
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else if (AsyncProcessor.a(AsyncProcessor.this, this.f6681a.c(), jSONObject)) {
                AsyncProcessor.b(AsyncProcessor.this, this.f6681a, this.b, this.c, this.d);
            } else {
                onFail("mergeDependencyToCurrentMtopRequestData failure");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements MtopRequester.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopRequester.a f6683a;

        public b(AsyncProcessor asyncProcessor, MtopRequester.a aVar) {
            this.f6683a = aVar;
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            MtopRequester.a aVar = this.f6683a;
            if (aVar != null) {
                aVar.onFail(str);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            MtopRequester.a aVar = this.f6683a;
            if (aVar != null) {
                aVar.onSuccess(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements MtopRequester.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nb4 f6684a;
        public final /* synthetic */ long b;
        public final /* synthetic */ com.taobao.android.detail.ttdetail.async.a c;
        public final /* synthetic */ d d;
        public final /* synthetic */ RuntimeAbilityParam[] e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f6685a;
            public final /* synthetic */ List b;

            public a(JSONObject jSONObject, List list) {
                this.f6685a = jSONObject;
                this.b = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AsyncProcessor asyncProcessor = AsyncProcessor.this;
                AsyncProcessor.c(asyncProcessor, AsyncProcessor.k(asyncProcessor, this.f6685a, this.b), this.f6685a, c.this.d);
                c cVar = c.this;
                AsyncProcessor.f(AsyncProcessor.this, true, cVar.c.d(), c.this.e);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6686a;

            public b(String str) {
                this.f6686a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c cVar = c.this;
                AsyncProcessor.e(AsyncProcessor.this, this.f6686a, cVar.d);
                c cVar2 = c.this;
                AsyncProcessor.f(AsyncProcessor.this, false, cVar2.c.d(), c.this.e);
            }
        }

        public c(nb4 nb4Var, long j, com.taobao.android.detail.ttdetail.async.a aVar, d dVar, RuntimeAbilityParam[] runtimeAbilityParamArr) {
            this.f6684a = nb4Var;
            this.b = j;
            this.c = aVar;
            this.d = dVar;
            this.e = runtimeAbilityParamArr;
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            AsyncProcessor.d(AsyncProcessor.this, false, this.c.d(), this.f6684a);
            AsyncProcessor.g(AsyncProcessor.this).post(new b(str));
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onSuccess(JSONObject jSONObject) {
            nb4 nb4Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            if (AsyncProcessor.h(AsyncProcessor.this) != null && (nb4Var = this.f6684a) != null && !TextUtils.isEmpty(nb4Var.k()) && !rr2.a(AsyncProcessor.h(AsyncProcessor.this))) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
                ze7 h = AsyncProcessor.h(AsyncProcessor.this);
                PerformanceUtils.n(h, this.f6684a.k() + "NetWorkCost", elapsedRealtime);
                tgh.b("AsyncProcessor", "sendAsyncMtopConfig success: " + this.f6684a.k() + " cost: " + elapsedRealtime);
            }
            if (AsyncProcessor.i(AsyncProcessor.this, jSONObject, this.c.f())) {
                onFail("filterByVIf: " + this.c.f());
                return;
            }
            AsyncProcessor.j(AsyncProcessor.this, jSONObject, this.c.b(), this.f6684a);
            AsyncProcessor.d(AsyncProcessor.this, true, this.c.d(), this.f6684a);
            ArrayList arrayList = new ArrayList();
            List<a.e> e = this.c.e();
            if (e != null) {
                for (a.e eVar : e) {
                    List<a.b> a2 = eVar.a();
                    if (a2 != null) {
                        arrayList.addAll(a2);
                    }
                }
            }
            AsyncProcessor.g(AsyncProcessor.this).post(new a(jSONObject, arrayList));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void a(JSONObject jSONObject, JSONObject jSONObject2);

        void onFail(String str);
    }

    static {
        t2o.a(912261266);
    }

    public AsyncProcessor(ze7 ze7Var) {
        this.f6680a = ze7Var;
    }

    public static /* synthetic */ boolean a(AsyncProcessor asyncProcessor, a.c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2168576d", new Object[]{asyncProcessor, cVar, jSONObject})).booleanValue();
        }
        return asyncProcessor.s(cVar, jSONObject);
    }

    public static /* synthetic */ void b(AsyncProcessor asyncProcessor, com.taobao.android.detail.ttdetail.async.a aVar, nb4 nb4Var, d dVar, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520215e7", new Object[]{asyncProcessor, aVar, nb4Var, dVar, runtimeAbilityParamArr});
        } else {
            asyncProcessor.x(aVar, nb4Var, dVar, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ void c(AsyncProcessor asyncProcessor, JSONObject jSONObject, JSONObject jSONObject2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48d5efc", new Object[]{asyncProcessor, jSONObject, jSONObject2, dVar});
        } else {
            asyncProcessor.m(jSONObject, jSONObject2, dVar);
        }
    }

    public static /* synthetic */ void d(AsyncProcessor asyncProcessor, boolean z, a.d dVar, nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683be3c5", new Object[]{asyncProcessor, new Boolean(z), dVar, nb4Var});
        } else {
            asyncProcessor.A(z, dVar, nb4Var);
        }
    }

    public static /* synthetic */ void e(AsyncProcessor asyncProcessor, String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58771fb2", new Object[]{asyncProcessor, str, dVar});
        } else {
            asyncProcessor.l(str, dVar);
        }
    }

    public static /* synthetic */ void f(AsyncProcessor asyncProcessor, boolean z, a.d dVar, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593ac3cd", new Object[]{asyncProcessor, new Boolean(z), dVar, runtimeAbilityParamArr});
        } else {
            asyncProcessor.n(z, dVar, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ Handler g(AsyncProcessor asyncProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("94ae3b3d", new Object[]{asyncProcessor});
        }
        return asyncProcessor.b;
    }

    public static /* synthetic */ ze7 h(AsyncProcessor asyncProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("f2103532", new Object[]{asyncProcessor});
        }
        return asyncProcessor.f6680a;
    }

    public static /* synthetic */ boolean i(AsyncProcessor asyncProcessor, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0c0a4b7", new Object[]{asyncProcessor, jSONObject, str})).booleanValue();
        }
        return asyncProcessor.p(jSONObject, str);
    }

    public static /* synthetic */ void j(AsyncProcessor asyncProcessor, JSONObject jSONObject, List list, nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c40a91", new Object[]{asyncProcessor, jSONObject, list, nb4Var});
        } else {
            asyncProcessor.z(jSONObject, list, nb4Var);
        }
    }

    public static /* synthetic */ JSONObject k(AsyncProcessor asyncProcessor, JSONObject jSONObject, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3b2f0d3c", new Object[]{asyncProcessor, jSONObject, list});
        }
        return asyncProcessor.B(jSONObject, list);
    }

    public static boolean r(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a19d0ebc", new Object[]{bVar})).booleanValue();
        }
        if (bVar == null || bVar.a() == null) {
            return false;
        }
        if (zul.k(bVar.b()) || zul.j(bVar.b())) {
            return true;
        }
        return false;
    }

    public static boolean t(JSONObject jSONObject, List<a.b> list, nb4 nb4Var) {
        Object obj;
        String b2;
        Map c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62467bde", new Object[]{jSONObject, list, nb4Var})).booleanValue();
        }
        if (list == null) {
            tgh.b("AsyncProcessor", "mergeKvMappings() kvMappings null");
            return false;
        }
        for (a.b bVar : list) {
            if (r(bVar)) {
                String a2 = bVar.a();
                if (TextUtils.isEmpty(a2) || TextUtils.equals(a2, "*")) {
                    obj = jSONObject;
                } else {
                    obj = zul.e(a2.split("\\."), jSONObject);
                }
                if (!(obj == null || (c2 = zul.c((b2 = bVar.b()), nb4Var)) == null)) {
                    String[] b3 = zul.b(b2);
                    if (b3 != null) {
                        zul.l(b3, c2, obj);
                    } else if (obj instanceof Map) {
                        c2.putAll((Map) obj);
                    }
                }
            }
        }
        return true;
    }

    public static void v(nb4 nb4Var) {
        Map<String, List<ir>> c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a8c9ff", new Object[]{nb4Var});
        } else if (nb4Var != null && (c2 = nb4Var.c()) != null) {
            for (List<ir> list : c2.values()) {
                if (list != null) {
                    for (ir irVar : list) {
                        if (irVar != null) {
                            yul.a(irVar.a(), nb4Var.f());
                        }
                    }
                }
            }
        }
    }

    public static void w(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38acaff", new Object[]{nb4Var});
        } else if (nb4Var != null) {
            yul.a(nb4Var.f(), nb4Var.f());
        }
    }

    public final void A(boolean z, a.d dVar, nb4 nb4Var) {
        JSONObject f;
        JSONObject c2;
        JSONObject c3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a91505", new Object[]{this, new Boolean(z), dVar, nb4Var});
        } else if (nb4Var != null && dVar != null && (f = nb4Var.f()) != null) {
            if (z) {
                a.f b2 = dVar.b();
                if (b2 != null && (c3 = b2.c()) != null) {
                    List<a.b> b3 = b2.b();
                    if (b3 == null || b3.isEmpty()) {
                        f.putAll(c3);
                    } else {
                        t(c3, b3, nb4Var);
                    }
                }
            } else {
                a.f a2 = dVar.a();
                if (a2 != null && (c2 = a2.c()) != null) {
                    List<a.b> b4 = a2.b();
                    if (b4 == null || b4.isEmpty()) {
                        f.putAll(c2);
                    } else {
                        t(c2, b4, nb4Var);
                    }
                }
            }
        }
    }

    public final JSONObject B(JSONObject jSONObject, List<a.b> list) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9a24083f", new Object[]{this, jSONObject, list});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (list == null) {
            tgh.b("AsyncProcessor", "kvMappings null");
            return jSONObject2;
        }
        for (a.b bVar : list) {
            if (r(bVar)) {
                String a2 = bVar.a();
                if (TextUtils.isEmpty(a2) || TextUtils.equals(a2, "*")) {
                    obj = jSONObject;
                } else {
                    obj = zul.e(a2.split("\\."), jSONObject);
                }
                if (obj != null) {
                    String b2 = bVar.b();
                    if (!TextUtils.isEmpty(b2) && !TextUtils.equals(b2, "*")) {
                        zul.l(b2.split("\\."), jSONObject2, obj);
                    } else if (obj instanceof Map) {
                        jSONObject2.putAll((Map) obj);
                    }
                }
            }
        }
        return jSONObject2;
    }

    public final void l(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c6345a", new Object[]{this, str, dVar});
        } else if (dVar != null) {
            dVar.onFail(str);
        }
    }

    public final void m(JSONObject jSONObject, JSONObject jSONObject2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf42849", new Object[]{this, jSONObject, jSONObject2, dVar});
        } else if (dVar != null) {
            dVar.a(jSONObject, jSONObject2);
        }
    }

    public final void n(boolean z, a.d dVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1eb867", new Object[]{this, new Boolean(z), dVar, runtimeAbilityParamArr});
        } else if (this.f6680a != null && dVar != null) {
            JSONArray jSONArray = null;
            if (z) {
                a.f b2 = dVar.b();
                if (b2 != null) {
                    jSONArray = b2.a();
                }
            } else {
                a.f a2 = dVar.a();
                if (a2 != null) {
                    jSONArray = a2.a();
                }
            }
            if (!(jSONArray == null || jSONArray.isEmpty())) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        this.f6680a.b().h(new ir(jSONObject), runtimeAbilityParamArr);
                    }
                }
            }
        }
    }

    public final boolean p(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("354d0493", new Object[]{this, jSONObject, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches("^\\$\\{.+\\}$")) {
            return false;
        }
        try {
            return xq8.e(str, jSONObject);
        } catch (Throwable th) {
            tgh.c("AsyncProcessor", "filterByVIf exception", th);
            return true;
        }
    }

    public final JSONObject q(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2d272a58", new Object[]{this, nb4Var});
        }
        JSONObject f = yc4.f(nb4Var);
        if (f == null || f.isEmpty()) {
            return yc4.n(nb4Var);
        }
        return f;
    }

    public boolean u(nb4 nb4Var, d dVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6de717a7", new Object[]{this, nb4Var, dVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (nb4Var == null) {
            l("AsyncProcessor#process() componentHolder param is null", dVar);
            return false;
        }
        JSONObject q = q(nb4Var);
        if (q == null) {
            l("AsyncProcessor#process() asyncFields param is null", dVar);
            return false;
        } else if (nb4Var.f() == null) {
            l("AsyncProcessor#process() componentHolder's fields is null", dVar);
            return false;
        } else {
            com.taobao.android.detail.ttdetail.async.a aVar = new com.taobao.android.detail.ttdetail.async.a(q);
            if (aVar.c() == null) {
                l("AsyncProcessor#process() mtopConfig is null", dVar);
                return false;
            }
            if (o(nb4Var)) {
                y(aVar, new a(aVar, nb4Var, dVar, runtimeAbilityParamArr), nb4Var);
            } else {
                x(aVar, nb4Var, dVar, runtimeAbilityParamArr);
            }
            return true;
        }
    }

    public final void x(com.taobao.android.detail.ttdetail.async.a aVar, nb4 nb4Var, d dVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7feb201f", new Object[]{this, aVar, nb4Var, dVar, runtimeAbilityParamArr});
            return;
        }
        a.c c2 = aVar.c();
        c cVar = new c(nb4Var, SystemClock.elapsedRealtime(), aVar, dVar, runtimeAbilityParamArr);
        if (rr2.a(this.f6680a)) {
            new sr2(this.f6680a, c2, nb4Var).j(cVar);
        } else {
            new MtopRequester(c2).a(cVar);
        }
    }

    public final void y(com.taobao.android.detail.ttdetail.async.a aVar, MtopRequester.a aVar2, nb4 nb4Var) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafceae0", new Object[]{this, aVar, aVar2, nb4Var});
            return;
        }
        a.C0351a a3 = aVar.a();
        if (a3 != null && (a2 = a3.a()) != null) {
            b bVar = new b(this, aVar2);
            if (rr2.a(this.f6680a)) {
                new sr2(this.f6680a, a2, nb4Var).j(bVar);
            } else {
                new MtopRequester(a2).a(bVar);
            }
        }
    }

    public final void z(JSONObject jSONObject, List<a.b> list, nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419b4dc6", new Object[]{this, jSONObject, list, nb4Var});
        } else if (t(jSONObject, list, nb4Var)) {
            w(nb4Var);
            v(nb4Var);
        }
    }

    public final boolean o(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71132a88", new Object[]{this, nb4Var})).booleanValue();
        }
        List<ir> b2 = nb4Var.b(EVENT_LIST_NAME);
        if (b2 == null) {
            return false;
        }
        for (ir irVar : b2) {
            if ("shopRecommendV2".equals(irVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final boolean s(a.c cVar, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b74189fc", new Object[]{this, cVar, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("recomIdInfo");
        String str2 = "";
        if (jSONObject2 != null) {
            str = jSONObject2.getString("recomIds");
            if (str == null) {
                str = str2;
            }
            String string = jSONObject2.getString("smartFlag");
            if (string != null) {
                str2 = string;
            }
        } else {
            str = str2;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(AgooConstants.MESSAGE_FLAG, (Object) str2);
        cVar.d(jSONObject3);
        JSONObject jSONObject4 = cVar.a().getJSONObject("params");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        jSONObject4.put("recItemId", (Object) str);
        cVar.a().put("params", (Object) jSONObject4);
        return true;
    }
}
