package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetResponse;
import com.taobao.tao.recommend3.observer.HomeLifecycleObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mtopsdk.mtop.util.MtopConvert;
import tb.tit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mxl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "home.perfManager";

    /* renamed from: a  reason: collision with root package name */
    public static final List<Integer> f24369a = new CopyOnWriteArrayList();
    public static AwesomeGetResponse b = null;
    public static WeakReference<Activity> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements c8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicXEngine f24370a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ DXRenderOptions c;
        public final /* synthetic */ long d;

        public a(DinamicXEngine dinamicXEngine, Context context, DXRenderOptions dXRenderOptions, long j) {
            this.f24370a = dinamicXEngine;
            this.b = context;
            this.c = dXRenderOptions;
            this.d = j;
        }

        @Override // tb.c8d
        public void a(SectionModel sectionModel, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4e392ea", new Object[]{this, sectionModel, dXTemplateItem});
                return;
            }
            mxl.a(Integer.valueOf(System.identityHashCode(sectionModel)));
            phg.k("dxPreRender_" + dXTemplateItem.e());
            if (vxl.b().M()) {
                this.f24370a.B0(this.b, dXTemplateItem, sectionModel, -1, this.c);
                bqa.d("dxPreRender", "preRenderCards dxPreRender_" + dXTemplateItem.e() + "_" + dXTemplateItem.b);
            } else {
                DXTemplateItem u = this.f24370a.u(dXTemplateItem);
                if (u != null) {
                    bqa.d("dxPreRender", "preRenderCards dxPreRender_" + u.e() + "_" + u.b);
                    this.f24370a.B0(this.b, u, sectionModel, -1, this.c);
                }
            }
            phg.j("dxPreRender_" + dXTemplateItem.e());
            bqa.d(mxl.TAG, "preRenderOnMainContainer preRenderTemplate " + (System.currentTimeMillis() - this.d));
            f0b.i().f(f0b.HOME_MAIN_PRERENDER);
            f0b.i().c(f0b.HOME_MAIN_PRERENDER);
        }
    }

    static {
        t2o.a(729809155);
    }

    public static void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60b2c0b", new Object[]{num});
            return;
        }
        bqa.d(TAG, "addPreRenderTemple sectionId: " + num);
        List<Integer> list = f24369a;
        if (!((CopyOnWriteArrayList) list).contains(num)) {
            bqa.d(TAG, "addPreRenderTemple add : " + num);
            ((CopyOnWriteArrayList) list).add(num);
        }
    }

    public static void b(String str, List<SectionModel> list, c8d c8dVar) {
        JSONObject jSONObject;
        DXTemplateItem b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac0038a", new Object[]{str, list, c8dVar});
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            SectionModel sectionModel = (SectionModel) it.next();
            if (sectionModel != null) {
                if (sectionModel.slimSection()) {
                    jSONObject = sectionModel.getStyle() != null ? sectionModel.getStyle().getTemplate() : null;
                } else {
                    jSONObject = sectionModel.getJSONObject("template");
                }
                if (jSONObject != null) {
                    tit.a b3 = tit.b(jSONObject);
                    if (b3.h() && (b2 = b3.b()) != null && !g(Integer.valueOf(System.identityHashCode(sectionModel)))) {
                        c8dVar.a(sectionModel, b2);
                    }
                }
            }
        }
    }

    public static Context c() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        WeakReference<Activity> weakReference = c;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            return Globals.getApplication();
        }
        return activity;
    }

    public static AwesomeGetResponse d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetResponse) ipChange.ipc$dispatch("eceefda9", new Object[0]);
        }
        AwesomeGetResponse awesomeGetResponse = b;
        if (awesomeGetResponse != null) {
            return awesomeGetResponse;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            b = (AwesomeGetResponse) MtopConvert.convertJsonToOutputDO(q1r.b(".home_data", "").getBytes("ISO-8859-1"), AwesomeGetResponse.class);
            bqa.d(TAG, "mock data ,useTime=" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            bqa.b(TAG, "mock data ,error, useTime=" + (System.currentTimeMillis() - currentTimeMillis), th);
        }
        return b;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("983520ca", new Object[]{str})).booleanValue();
        }
        AwesomeGetContainerData u = zza.c().u(str);
        if (u == null || !TextUtils.equals(u.requestType, "coldStart")) {
            return false;
        }
        return true;
    }

    public static boolean g(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49e25a5", new Object[]{num})).booleanValue();
        }
        boolean contains = ((CopyOnWriteArrayList) f24369a).contains(num);
        bqa.d(TAG, "isPreRender contains : " + contains);
        return contains;
    }

    public static void h(Activity activity) {
        if (activity != null) {
            f0b.i().l("homeWelcomeFinish");
            LocalBroadcastManager.getInstance(activity).sendBroadcast(new Intent("action_welcome_need_finish"));
            try {
                Activity.class.getMethod("convertFromTranslucent", new Class[0]).invoke(activity, new Object[0]);
            } catch (Throwable th) {
                uqa.b("Performance", TAG, "convertFromTranslucent error" + th.getMessage());
            }
        }
    }

    public static void j(String str, List<SectionModel> list, Context context, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a330bc", new Object[]{str, list, context, new Boolean(z), new Integer(i)});
        } else if (!yyj.e().o(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            xti.a().j(str, list, context, z, i);
            bqa.d(TAG, "preRenderOnSubContainer isColdStartRender = false ,time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void l(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4b2b91", new Object[]{str, new Boolean(z), new Boolean(z2)});
        } else if ((!z && (!vxl.b().H() || !f(str))) || g0b.i()) {
        } else {
            if (z2) {
                g0b.b();
                f0b.j(str).c("homeUiRefresh");
                f0b.j(str).l("homeNetDataRefresh");
                NotifyApm.b().e(HomeLifecycleObserver.b(), 2);
                return;
            }
            f0b.j(str).l("homeCacheDataRefresh");
        }
    }

    public static void m(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a989aea", new Object[]{activity});
        } else if (activity != null) {
            c = new WeakReference<>(activity);
        }
    }

    public static void i(String str, List<SectionModel> list, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c0eeb6", new Object[]{str, list, context});
            return;
        }
        f0b.i().s(f0b.HOME_MAIN_PRERENDER);
        f0b.i().p(f0b.HOME_MAIN_PRERENDER, 2);
        if (yyj.e().o(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            bqa.d(TAG, "preRenderOnMainContainer ");
            b(str, list, new a(h5b.e().d(), context, new DXRenderOptions.b().E(RecommendDxUserContext.newInstance().addContext("containerId", str)).q(), currentTimeMillis));
        }
    }

    public static boolean e(String str, m3o m3oVar) {
        AwesomeGetResponse d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b19f82b", new Object[]{str, m3oVar})).booleanValue();
        }
        if (!vxl.k() || !TextUtils.equals(str, "coldStart") || m3oVar == null || (d = d()) == null) {
            return false;
        }
        m3oVar.a(d.getData());
        bqa.d(TAG, "mock data ,callback 回调");
        return true;
    }

    public static void k(String str, List<SectionModel> list, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5441d", new Object[]{str, list, str2, new Integer(i)});
            return;
        }
        Context c2 = c();
        if (c2 != null) {
            boolean equals = TextUtils.equals(str2, s0j.MTS_SUB_STAGE_LOAD_CACHE);
            bqa.d(TAG, "preloadCards isCacheRender ： " + equals + " , cid " + str + " ,threadName : " + Thread.currentThread().getName());
            boolean equals2 = TextUtils.equals(str2, "scrollNextPage");
            boolean equals3 = TextUtils.equals(str2, "coldStart");
            if (equals || equals2 || equals3) {
                bqa.d(TAG, "preRender, requestType : " + str2 + " , cid : " + str);
                if (!b9b.e() && !b9b.h()) {
                    if (equals) {
                        if (yyj.e().q(str)) {
                            xpa.a(s0j.MTS_SUB_STAGE_LOAD_CACHE, "base", true);
                        }
                        j(str, list, c2, true, i);
                        i(str, list, c2);
                    } else if (bve.m() && !vxl.b().M()) {
                        j(str, list, c2, false, i);
                    }
                }
            }
        }
    }
}
