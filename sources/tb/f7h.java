package tb;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.n8v;
import tb.zv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f7h extends cs1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASYNC_BIZ = "asyncBiz";
    public long g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ux f19068a;
        public final /* synthetic */ Object b;

        public a(ux uxVar, Object obj) {
            this.f19068a = uxVar;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                f7h.i(f7h.this, this.f19068a, this.b);
            } catch (Exception e) {
                ub3.g("LocalCacheDataRequester", "doRequest1," + e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements n8v.c<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ux f19069a;
        public final /* synthetic */ Object b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements smc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.smc
            public void a(MtopResponse mtopResponse, boolean z, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d7688b66", new Object[]{this, mtopResponse, new Boolean(z), map});
                    return;
                }
                b bVar = b.this;
                f7h.k(f7h.this, bVar.f19069a, mtopResponse, z, map);
            }

            @Override // tb.smc
            public void b(MtopResponse mtopResponse, fsb fsbVar, Map<String, ?> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("53fb2e9b", new Object[]{this, mtopResponse, fsbVar, map});
                    return;
                }
                b bVar = b.this;
                f7h.l(f7h.this, bVar.f19069a, mtopResponse, fsbVar, map, bVar.b);
            }
        }

        public b(ux uxVar, Object obj) {
            this.f19069a = uxVar;
            this.b = obj;
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                new w55(f7h.j(f7h.this)).f(false).a(jSONObject, new zv.a().b(CartFirstPageCache.getAndRemoveFirstPageCacheByteData()), new a());
            }
        }

        @Override // tb.n8v.c
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements n8v.c<byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z9v f19071a;
        public final /* synthetic */ n8v.c b;

        public c(z9v z9vVar, n8v.c cVar) {
            this.f19071a = z9vVar;
            this.b = cVar;
        }

        @Override // tb.n8v.c
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            this.b.onFail(str);
            hav.g(c9x.CART_BIZ_NAME, "缓存加载失败#异常:", str);
        }

        /* renamed from: a */
        public void onSuccess(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2663c9b2", new Object[]{this, bArr});
                return;
            }
            this.f19071a.B("getFirstPageCacheData", false, null);
            if (bArr != null) {
                try {
                    JSONObject jSONObject = (JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0]);
                    qa3.e(f7h.this.e, jSONObject);
                    hav.d("LocalCacheDataRequester", "实时获取缓存成功");
                    this.b.onSuccess(jSONObject);
                } catch (Exception unused) {
                    this.b.onFail("failed to get cache data");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ux f19072a;
        public final /* synthetic */ MtopResponse b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Map d;

        public d(ux uxVar, MtopResponse mtopResponse, boolean z, Map map) {
            this.f19072a = uxVar;
            this.b = mtopResponse;
            this.c = z;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f19072a.a(-1, this.b, null, this.c, this.d);
            } catch (Exception e) {
                lbq.b(c9x.CART_BIZ_NAME, "LocalCacheDataRequester", "onErrorAsync", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ux f19073a;
        public final /* synthetic */ MtopResponse b;
        public final /* synthetic */ fsb c;
        public final /* synthetic */ Map d;

        public e(ux uxVar, MtopResponse mtopResponse, fsb fsbVar, Map map) {
            this.f19073a = uxVar;
            this.b = mtopResponse;
            this.c = fsbVar;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                CartFirstPageCache.clear();
                if (f7h.this.f.c() == null || f7h.this.f.c().d()) {
                    this.f19073a.b(-1, this.b, null, this.c, this.d);
                }
            } catch (Exception e) {
                lbq.b(c9x.CART_BIZ_NAME, "LocalCacheDataRequester", "onSuccessAsync", e.getMessage());
                ei8.a("localCacheBizHandleError", e);
                try {
                    this.f19073a.a(-1, this.b, null, false, this.d);
                } catch (Exception e2) {
                    ei8.a("localCacheOnErrorException", e2);
                }
            }
        }
    }

    static {
        t2o.a(479199305);
    }

    public f7h(zxb zxbVar, Context context, b3o b3oVar) {
        super(zxbVar, context, b3oVar);
    }

    public static /* synthetic */ void i(f7h f7hVar, ux uxVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfeefc02", new Object[]{f7hVar, uxVar, obj});
        } else {
            f7hVar.m(uxVar, obj);
        }
    }

    public static /* synthetic */ Object ipc$super(f7h f7hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/config/bizRequest/LocalCacheDataRequester");
    }

    public static /* synthetic */ Context j(f7h f7hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3ee082e8", new Object[]{f7hVar});
        }
        return f7hVar.f30307a;
    }

    public static /* synthetic */ void k(f7h f7hVar, ux uxVar, MtopResponse mtopResponse, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82a13da", new Object[]{f7hVar, uxVar, mtopResponse, new Boolean(z), map});
        } else {
            f7hVar.r(uxVar, mtopResponse, z, map);
        }
    }

    public static /* synthetic */ void l(f7h f7hVar, ux uxVar, MtopResponse mtopResponse, fsb fsbVar, Map map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943babdf", new Object[]{f7hVar, uxVar, mtopResponse, fsbVar, map, obj});
        } else {
            f7hVar.s(uxVar, mtopResponse, fsbVar, map, obj);
        }
    }

    @Override // tb.cs1
    public opq d(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opq) ipChange.ipc$dispatch("ae91335f", new Object[]{this, fsbVar});
        }
        return null;
    }

    @Override // tb.cs1
    public void g(ux uxVar, fsb fsbVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa576c99", new Object[]{this, uxVar, fsbVar, obj});
        } else if (uxVar != null) {
            z9v.u(this.e.getContext()).B("apmClientBeforeNetworkLogicProcess", false, null);
            this.g = System.currentTimeMillis();
            n(uxVar, obj);
        }
    }

    public final void m(ux uxVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27a47", new Object[]{this, uxVar, obj});
            return;
        }
        fsb andRemoveDmContext = CartFirstPageCache.getAndRemoveDmContext();
        MtopResponse andRemoveMtopResponse = CartFirstPageCache.getAndRemoveMtopResponse();
        if (andRemoveDmContext == null || andRemoveMtopResponse == null) {
            o(new b(uxVar, obj));
            return;
        }
        hav.d("LocalCacheDataRequester", "命中首屏缓存预加载");
        s(uxVar, andRemoveMtopResponse, andRemoveDmContext, null, obj);
    }

    public final void n(ux uxVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d690d83c", new Object[]{this, uxVar, obj});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                m(uxVar, obj);
            } catch (Exception e2) {
                ub3.g("LocalCacheDataRequester", "doRequest," + e2.getMessage());
            }
        } else if (vav.a(c9x.CART_BIZ_NAME, "doNotSwitchThreadWhenLocalCache", true)) {
            try {
                m(uxVar, obj);
            } catch (Exception e3) {
                ub3.g("LocalCacheDataRequester", "doRequest1," + e3.getMessage());
            }
        } else {
            pav.m(true, new a(uxVar, obj));
        }
    }

    public final void o(n8v.c<JSONObject> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea35ae", new Object[]{this, cVar});
            return;
        }
        JSONObject andRemoveFirstPageCacheData = CartFirstPageCache.getAndRemoveFirstPageCacheData();
        if (andRemoveFirstPageCacheData != null) {
            cVar.onSuccess(andRemoveFirstPageCacheData);
            return;
        }
        z9v u = z9v.u(this.f30307a);
        u.m("getFirstPageCacheData", System.currentTimeMillis(), null, true);
        this.f.v(new c(u, cVar));
    }

    public final boolean p() {
        ViewManager Z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64c3fe0", new Object[]{this})).booleanValue();
        }
        if (this.e != null && vav.a(c9x.CART_BIZ_NAME, "enablePostSuccessToFrontOfMainWhenCacheLoad", true) && (Z = this.e.e()) != null && q(Z.o()) && q(Z.r()) && q(Z.p())) {
            return true;
        }
        return false;
    }

    public final boolean q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f767f26c", new Object[]{this, view})).booleanValue();
        }
        if (view == null || view.getParent() == null) {
            return false;
        }
        return true;
    }

    public final void r(ux uxVar, MtopResponse mtopResponse, boolean z, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be2f25", new Object[]{this, uxVar, mtopResponse, new Boolean(z), map});
        } else {
            pav.i(new d(uxVar, mtopResponse, z, map), 0L);
        }
    }

    public final void s(ux uxVar, MtopResponse mtopResponse, fsb fsbVar, Map<String, ?> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7499042e", new Object[]{this, uxVar, mtopResponse, fsbVar, map, obj});
            return;
        }
        uxVar.m(0, mtopResponse, null, fsbVar, map);
        jc3.a(this.e.getContext(), this.g);
        fsbVar.a(c9x.CART_BIZ_NAME);
        t(new e(uxVar, mtopResponse, fsbVar, map), p(), obj);
    }

    public final void t(Runnable runnable, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f2fb5b", new Object[]{this, runnable, new Boolean(z), obj});
        } else if (!ASYNC_BIZ.equals(String.valueOf(obj))) {
            tuo.b(runnable, z);
        } else if (pav.b()) {
            pav.k(runnable);
        } else {
            runnable.run();
        }
    }
}
