package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.tbsku.model.IntentModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.a4o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class crm implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "prefetchSkuMtop";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f17263a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17264a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Uri c;

        /* compiled from: Taobao */
        /* renamed from: tb.crm$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0890a implements owc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f17265a;

            public C0890a(String str) {
                this.f17265a = str;
            }

            @Override // tb.owc
            public void a(MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d223f4a0", new Object[]{this, mtopInfo, new Integer(i), baseOutDo, obj});
                } else {
                    crm.b(crm.this, i, mtopInfo, baseOutDo, obj, true, this.f17265a);
                }
            }

            @Override // tb.owc
            public void b(MtopInfo mtopInfo, int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8e6c9079", new Object[]{this, mtopInfo, new Integer(i), obj});
                    return;
                }
                crm.b(crm.this, i, mtopInfo, null, obj, false, this.f17265a);
                bw7.a(-700023, "TTDSKUPrefetchMtopError");
            }
        }

        public a(String str, String str2, Uri uri) {
            this.f17264a = str;
            this.b = str2;
            this.c = uri;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String str = p2q.SKU_PREFETCH_TOKEN_PREFIX + this.f17264a + "_" + this.b;
                Intent intent = new Intent("android.intent.action.VIEW", this.c);
                intent.putExtra("id", this.f17264a);
                intent.putExtra("detailRequestId", str);
                a4o.d(str);
                crm.d(crm.this.f17263a, str);
                IntentModel intentModel = new IntentModel(intent);
                MainRequestParams mainRequestParams = new MainRequestParams(intent);
                HashMap hashMap = (HashMap) intentModel.g;
                hashMap.put("skuOutSdk", "true");
                hashMap.put("container_type", "sku");
                hashMap.put("isPrefetchSkuMtop", "true");
                mainRequestParams.getExParams().remove("openFrom");
                mainRequestParams.updateRefreshParams(hashMap);
                y0i y0iVar = new y0i(mainRequestParams);
                y0iVar.q(new MainRequestCallback(mainRequestParams, new C0890a(str)));
                y0iVar.c();
                tgh.b("PrefetchSkuMtopImplementor", "prefetchSkuMtop 发起预请求");
            } catch (Exception e) {
                tgh.c("PrefetchSkuMtopImplementor", "prefetchSkuMtop RequestThreadManager.execute", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17266a;
        public final /* synthetic */ MtopInfo b;
        public final /* synthetic */ BaseOutDo c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ String f;

        public b(int i, MtopInfo mtopInfo, BaseOutDo baseOutDo, Object obj, boolean z, String str) {
            this.f17266a = i;
            this.b = mtopInfo;
            this.c = baseOutDo;
            this.d = obj;
            this.e = z;
            this.f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                crm.c(crm.this, this.f17266a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    static {
        t2o.a(912261928);
        t2o.a(912261826);
    }

    public crm(ze7 ze7Var) {
        this.f17263a = ze7Var;
    }

    public static /* synthetic */ void b(crm crmVar, int i, MtopInfo mtopInfo, BaseOutDo baseOutDo, Object obj, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f2dd04", new Object[]{crmVar, new Integer(i), mtopInfo, baseOutDo, obj, new Boolean(z), str});
        } else {
            crmVar.g(i, mtopInfo, baseOutDo, obj, z, str);
        }
    }

    public static /* synthetic */ void c(crm crmVar, int i, MtopInfo mtopInfo, BaseOutDo baseOutDo, Object obj, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ded4b63", new Object[]{crmVar, new Integer(i), mtopInfo, baseOutDo, obj, new Boolean(z), str});
        } else {
            crmVar.h(i, mtopInfo, baseOutDo, obj, z, str);
        }
    }

    public static void d(ze7 ze7Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b9d269", new Object[]{ze7Var, str});
        } else if (ze7Var != null) {
            Set set = (Set) ze7Var.i().c("skuPrefetchTokens");
            if (set == null) {
                set = new HashSet();
                ze7Var.i().f("skuPrefetchTokens", set);
            }
            set.add(str);
        }
    }

    public static void e(ze7 ze7Var) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9866cc", new Object[]{ze7Var});
        } else if (ze7Var != null && (set = (Set) ze7Var.i().c("skuPrefetchTokens")) != null) {
            for (String str : set) {
                a4o.c(str);
            }
        }
    }

    public final void f(owc owcVar, boolean z, MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a47098f", new Object[]{this, owcVar, new Boolean(z), mtopInfo, new Integer(i), baseOutDo, obj});
        } else if (z) {
            owcVar.a(mtopInfo, i, baseOutDo, obj);
        } else {
            owcVar.b(mtopInfo, i, obj);
        }
    }

    public final void g(int i, MtopInfo mtopInfo, BaseOutDo baseOutDo, Object obj, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d04ae1", new Object[]{this, new Integer(i), mtopInfo, baseOutDo, obj, new Boolean(z), str});
        } else {
            this.f17263a.h().g(new b(i, mtopInfo, baseOutDo, obj, z, str));
        }
    }

    public final void h(int i, MtopInfo mtopInfo, BaseOutDo baseOutDo, Object obj, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433efa1", new Object[]{this, new Integer(i), mtopInfo, baseOutDo, obj, new Boolean(z), str});
        } else if (mtopInfo != null) {
            String a2 = epq.a(mtopInfo.a());
            tgh.b("PrefetchSkuMtopImplementor", "prefetchSkuMtop 预请求结果返回 traceId=" + a2 + " isSuccess=" + z);
            a4o a4oVar = new a4o(str);
            if (!a4oVar.a()) {
                tgh.b("PrefetchSkuMtopImplementor", "prefetchSkuMtop token尚未注册" + str);
                bw7.a(-700024, "TTDSKUPrefetchTokenError");
                return;
            }
            owc h = a4oVar.h();
            if (h != null) {
                tgh.b("PrefetchSkuMtopImplementor", "prefetchSkuMtop 回调已设置 直接执行回调，status=" + mtopInfo.b());
                f(h, z, mtopInfo, i, baseOutDo, obj);
                tgh.b("PrefetchSkuMtopImplementor", "prefetchSkuMtop 执行回调后清理token:" + str);
                a4oVar.b();
                return;
            }
            a4o.a aVar = new a4o.a();
            if (z) {
                str2 = "success";
            } else {
                str2 = "error";
            }
            aVar.d(str2);
            aVar.c(mtopInfo);
            a4oVar.l(aVar);
            tgh.b("PrefetchSkuMtopImplementor", "prefetchSkuMtop 回调尚未设置 先缓存结果 等待设置回调 status=" + mtopInfo.b());
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        tgh.b("PrefetchSkuMtopImplementor", "prefetchSkuMtop 执行预请求能力");
        if (!hjh.c() || !ybl.c() || (a2 = irVar.a()) == null) {
            return false;
        }
        String string = a2.getString("url");
        if (TextUtils.isEmpty(string)) {
            bw7.a(-700021, "TTDSKUPrefetchUrlError");
            return false;
        }
        Uri parse = Uri.parse(string);
        if (parse == null) {
            return false;
        }
        String queryParameter = parse.getQueryParameter("itemId");
        if (TextUtils.isEmpty(queryParameter)) {
            bw7.a(-700022, "TTDSKUPrefetchItemIdEmpty");
            tgh.b("PrefetchSkuMtopImplementor", "prefetchSkuMtop itemId为空 url非法 不执行预请求");
            return false;
        }
        u5o.a(new a(queryParameter, parse.getQueryParameter("openFrom"), parse));
        return true;
    }
}
