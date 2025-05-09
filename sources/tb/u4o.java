package tb;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.a;
import com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback;
import com.taobao.android.detail.ttdetail.request.callback.CustomMtopStreamRequestCallBack;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import com.taobao.android.detail.ttdetail.request.callback.PrefetchRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.CustomApiRequestParams;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.android.detail.ttdetail.request.stream.MtopStreamRequestCallback;
import com.taobao.android.detail.ttdetail.runtime.RuntimeParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a4o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u4o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MtopStreamRequestCallback f29136a;
    public final com.taobao.android.detail.ttdetail.request.a b = new com.taobao.android.detail.ttdetail.request.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f29138a;

        public b(Intent intent) {
            this.f29138a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MainRequestParams mainRequestParams = new MainRequestParams(this.f29138a);
            tgh.b("RequestManager", "预请求参数=" + mainRequestParams.getExParams());
            b5m.D().e(mainRequestParams.getItemId(), null);
            if (!vbl.t() || mainRequestParams.getExParams() == null) {
                tgh.b("RequestManager", "no reqMergeCrop");
            } else {
                tgh.b("RequestManager", "reqMergeCropping");
                mainRequestParams.getExParams().put("reqMergeCropping", "true");
            }
            y0i y0iVar = new y0i(mainRequestParams);
            PrefetchRequestCallback prefetchRequestCallback = new PrefetchRequestCallback(mainRequestParams);
            String detailToken = mainRequestParams.getDetailToken();
            MtopStreamRequestCallback mtopStreamRequestCallback = new MtopStreamRequestCallback(detailToken, String.valueOf(UUID.randomUUID().hashCode()));
            mtopStreamRequestCallback.setMtopRequestCallback(prefetchRequestCallback);
            y0iVar.r(true).q(mtopStreamRequestCallback);
            PerformanceUtils.p(detailToken, "request", System.currentTimeMillis());
            y0iVar.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ owc f29139a;
        public final /* synthetic */ a.C0380a b;
        public final /* synthetic */ boolean c;

        public c(owc owcVar, a.C0380a aVar, boolean z) {
            this.f29139a = owcVar;
            this.b = aVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            owc owcVar = this.f29139a;
            if (owcVar != null) {
                MtopInfo c = this.b.c();
                int b = this.b.b();
                BaseOutDo a2 = this.b.a();
                if (!this.c) {
                    obj = Integer.valueOf(R.id.tt_detail_is_page_key_cache_id);
                } else {
                    obj = this.b.d();
                }
                owcVar.a(c, b, a2, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements owc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29140a;
        public final /* synthetic */ String b;
        public final /* synthetic */ owc c;

        public d(boolean z, String str, owc owcVar) {
            this.f29140a = z;
            this.b = str;
            this.c = owcVar;
        }

        @Override // tb.owc
        public void a(MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d223f4a0", new Object[]{this, mtopInfo, new Integer(i), baseOutDo, obj});
                return;
            }
            String h0 = DataUtils.h0(mtopInfo);
            if (!TextUtils.isEmpty(h0) && (this.f29140a || vbl.l1())) {
                u4o.a(u4o.this).f(h0, new a.C0380a(mtopInfo, i, baseOutDo, obj));
            }
            if (!this.f29140a) {
                owc owcVar = this.c;
                if (owcVar != null) {
                    owcVar.a(mtopInfo, i, baseOutDo, obj);
                }
            } else if (u4o.a(u4o.this).h(h0, mtopInfo, i, baseOutDo, obj)) {
                u4o.a(u4o.this).a(h0);
                tgh.b("RequestManager", "主接口模拟预点击Mtop success成功缓存，且有listener消费了数据。pageKey:); " + this.b);
            }
        }

        @Override // tb.owc
        public void b(MtopInfo mtopInfo, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e6c9079", new Object[]{this, mtopInfo, new Integer(i), obj});
            } else if (!this.f29140a) {
                owc owcVar = this.c;
                if (owcVar != null) {
                    owcVar.b(mtopInfo, i, obj);
                }
            } else if (u4o.a(u4o.this).g(this.b, mtopInfo, i, obj)) {
                tgh.b("RequestManager", "主接口模拟预点击Mtop failure失败缓存，且有listener消费了数据。pageKey:); " + this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ owc f29141a;
        public final /* synthetic */ a4o b;
        public final /* synthetic */ h8n c;

        public e(owc owcVar, a4o a4oVar, h8n h8nVar) {
            this.f29141a = owcVar;
            this.b = a4oVar;
            this.c = h8nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                u4o.e(u4o.this, this.f29141a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(912262155);
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.request.a a(u4o u4oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.request.a) ipChange.ipc$dispatch("430a60f3", new Object[]{u4oVar});
        }
        return u4oVar.b;
    }

    public static /* synthetic */ void e(u4o u4oVar, owc owcVar, a4o a4oVar, h8n h8nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feae9dc", new Object[]{u4oVar, owcVar, a4oVar, h8nVar});
        } else {
            u4oVar.c(owcVar, a4oVar, h8nVar);
        }
    }

    public static void i(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5102c21a", new Object[]{intent});
        } else {
            u5o.a(new b(intent));
        }
    }

    public static void j(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbf988c", new Object[]{intent});
        } else {
            u5o.a(new a(intent));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        MtopStreamRequestCallback mtopStreamRequestCallback = this.f29136a;
        if (mtopStreamRequestCallback != null) {
            mtopStreamRequestCallback.destroy();
        }
    }

    public void k(h8n h8nVar, owc owcVar, Map<String, String> map, boolean z, RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b893df", new Object[]{this, h8nVar, owcVar, map, new Boolean(z), runtimeParamArr});
        } else {
            h(h8nVar, owcVar, map, z, null, runtimeParamArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f29137a;

        public a(Intent intent) {
            this.f29137a = intent;
        }

        private void a(JSONObject jSONObject, boolean z, String str) {
            List<SimpleEntry<String, Integer>> d;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a6086a", new Object[]{this, jSONObject, new Boolean(z), str});
                return;
            }
            Application a2 = o91.a();
            if (!(jSONObject == null || TextUtils.isEmpty(str) || !rua.g(a2, jSONObject) || (d = rua.d(jSONObject, z)) == null)) {
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    SimpleEntry<String, Integer> simpleEntry = d.get(i);
                    if (simpleEntry != null) {
                        str2 = simpleEntry.getKey();
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        cg2.r(str, str2, simpleEntry.getValue().intValue(), rua.b(a2, null, jSONObject));
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (TextUtils.isEmpty(this.f29137a.getStringExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS))) {
                    String f = mff.f(this.f29137a);
                    if (vbl.n1()) {
                        String g = mff.g(this.f29137a);
                        if (jtm.a().c(f) != null && "true".equals(g)) {
                            jtm.a().g(f);
                            htm.a().c(this.f29137a);
                            tgh.b("RequestManager", "singleUseCache清除缓存发起nav预加载请求");
                            return;
                        }
                    }
                    JSONObject d = jtm.a().d(f);
                    if (d != null) {
                        List<String> a2 = mtm.a(d);
                        String c = mtm.c(d);
                        if (a2 != null) {
                            for (String str : a2) {
                                mpe.s(str, 480, 480, true, mpe.h(TaobaoImageUrlStrategy.ImageQuality.q30));
                            }
                        }
                        mpe.t(c, true);
                        Uri data = this.f29137a.getData();
                        if (data != null && ybf.b(data)) {
                            z = true;
                        }
                        a(d, z, this.f29137a.getStringExtra("detailRequestId"));
                        DataUtils.d(d);
                        return;
                    }
                    tgh.b("RequestManager", "发起nav预加载请求");
                }
                htm.a().c(this.f29137a);
            } catch (Throwable th) {
                tgh.b("RequestManager", "startPreloadRequest exception=" + th);
            }
        }
    }

    public void g(h8n h8nVar, owc owcVar, Map<String, String> map, RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("489b1017", new Object[]{this, h8nVar, owcVar, map, runtimeParamArr});
        } else if (map != null && !map.isEmpty() && h8nVar != null) {
            r15 r15Var = new r15(new CustomApiRequestParams(map));
            String valueOf = String.valueOf(UUID.randomUUID().hashCode());
            a4o.n(h8nVar.b(), valueOf);
            boolean b2 = epq.b(map);
            tgh.b("RequestManager", "sendRequestWithCustomApi isStreamCustomApi=" + b2);
            if (b2) {
                MtopStreamRequestCallback mtopStreamRequestCallback = new MtopStreamRequestCallback(h8nVar.b(), valueOf);
                mtopStreamRequestCallback.setMtopRequestCallback(new CustomMtopStreamRequestCallBack(h8nVar, owcVar));
                r15Var.r(true).q(mtopStreamRequestCallback);
            } else {
                r15Var.q(new CustomMtopRequestCallback(h8nVar, owcVar));
            }
            r15Var.c();
        }
    }

    public final void c(owc owcVar, a4o a4oVar, h8n h8nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aaff019", new Object[]{this, owcVar, a4oVar, h8nVar});
        } else if (owcVar != null) {
            a4o.a e2 = a4oVar.e();
            a4oVar.m(owcVar);
            if (e2 == null) {
                d(h8nVar.d(), owcVar);
                return;
            }
            String b2 = e2.b();
            MtopInfo a2 = e2.a();
            tgh.b("RequestManager", "从缓存中获取主接口数据，直接回调");
            if (TextUtils.equals(b2, "success")) {
                tgh.b("RequestManager", "mtopInfo.status=" + a2.b());
                owcVar.a(a2, 0, null, null);
            } else {
                owcVar.b(a2, 0, null);
            }
            if (a2.b() != 1) {
                a4oVar.b();
            }
        }
    }

    public final void f(h8n h8nVar, owc owcVar, Map<String, String> map, boolean z, Map<String, String> map2, RuntimeParam... runtimeParamArr) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09f767", new Object[]{this, h8nVar, owcVar, map, new Boolean(z), map2, runtimeParamArr});
        } else if (h8nVar != null) {
            String b2 = h8nVar.b();
            a4o a4oVar = new a4o(b2);
            tgh.b("RequestManager", "sendRequestNormally token=" + b2);
            if (!a4oVar.a()) {
                if (z && Boolean.FALSE.equals(DevFeature.mFeature.get(DevFeature.sDisableStreamingNetwork))) {
                    z2 = true;
                }
                MainRequestParams mainRequestParams = new MainRequestParams(h8nVar);
                mainRequestParams.updateRefreshParams(map);
                tgh.b("RequestManager", "主请求参数=" + mainRequestParams.getExParams());
                if (!vbl.t() || mainRequestParams.getExParams() == null || !z2) {
                    tgh.b("RequestManager", "no reqMergeCrop");
                } else {
                    mainRequestParams.getExParams().put("reqMergeCropping", "true");
                    tgh.b("RequestManager", "reqMergeCropping");
                }
                mainRequestParams.setUseMtopPost(RuntimeUtils.k(runtimeParamArr));
                mainRequestParams.setUseBundleAdjust(RuntimeUtils.j(runtimeParamArr));
                y0i y0iVar = new y0i(mainRequestParams);
                MainRequestCallback mainRequestCallback = new MainRequestCallback(mainRequestParams, owcVar);
                if (z2) {
                    String valueOf = String.valueOf(UUID.randomUUID().hashCode());
                    b();
                    MtopStreamRequestCallback mtopStreamRequestCallback = new MtopStreamRequestCallback(b2, valueOf);
                    this.f29136a = mtopStreamRequestCallback;
                    mtopStreamRequestCallback.setMtopRequestCallback(mainRequestCallback);
                    y0iVar.r(true).q(this.f29136a).p(map2);
                } else {
                    y0iVar.q(mainRequestCallback).p(map2);
                }
                y0iVar.c();
                return;
            }
            e eVar = new e(owcVar, a4oVar, h8nVar);
            if (Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sCallbackInOnCreate))) {
                eVar.run();
            } else {
                u5o.c().post(eVar);
            }
        }
    }

    public final void d(String str, owc owcVar) {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fffdd1", new Object[]{this, str, owcVar});
            return;
        }
        irm c2 = jtm.a().c(str);
        if (c2 != null && (b2 = c2.b()) != null) {
            tgh.b("RequestManager", "从缓存中获取预加载数据");
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setOriginFastJsonObject(b2);
            mtopResponse.setHeaderFields(c2.a());
            mtopResponse.setSupportStreamJson(true);
            MtopInfo mtopInfo = new MtopInfo();
            mtopInfo.e(mtopResponse);
            mtopInfo.f(2);
            owcVar.a(mtopInfo, 0, null, null);
            mtm.f(str, c2.d(), c2.c());
        }
    }

    public void h(h8n h8nVar, owc owcVar, Map<String, String> map, boolean z, Map<String, String> map2, RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd161dc0", new Object[]{this, h8nVar, owcVar, map, new Boolean(z), map2, runtimeParamArr});
            return;
        }
        String g = RuntimeUtils.g(runtimeParamArr);
        boolean i = RuntimeUtils.i(runtimeParamArr);
        if (!i) {
            a.C0380a b2 = this.b.b(g);
            if (b2 != null) {
                boolean d2 = this.b.d(g);
                c cVar = new c(owcVar, b2, d2);
                if (Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sCallbackInOnCreate))) {
                    cVar.run();
                } else {
                    u5o.c().post(cVar);
                }
                if (d2) {
                    this.b.a(g);
                    tgh.b("RequestManager", "主接口模拟预点击已经成功缓存在本地有数据，直接消费缓存数据刷新，而不发起真实的请求。pageKey: " + g);
                    return;
                }
            }
        } else if (this.b.c(g)) {
            tgh.b("RequestManager", "主接口模拟预点击已经有任务执行过，一个实例中不重新模拟点击。pageKey: " + g);
            return;
        }
        d dVar = new d(i, g, owcVar);
        if (!i && this.b.e(g, dVar)) {
            tgh.b("RequestManager", "主接口模拟预点击添加 PendingListener。pageKey: " + g);
        } else if (slz.a(map)) {
            g(h8nVar, dVar, map, runtimeParamArr);
        } else {
            f(h8nVar, dVar, map, z, map2, runtimeParamArr);
        }
    }
}
