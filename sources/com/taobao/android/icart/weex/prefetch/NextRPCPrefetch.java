package com.taobao.android.icart.weex.prefetch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import org.android.agoo.common.AgooConstants;
import tb.a3o;
import tb.c9x;
import tb.ckf;
import tb.dh1;
import tb.dxl;
import tb.fj9;
import tb.gd4;
import tb.hav;
import tb.jk;
import tb.kjf;
import tb.m9u;
import tb.ne3;
import tb.o6g;
import tb.q3o;
import tb.r5o;
import tb.szh;
import tb.t2o;
import tb.v4s;
import tb.vc3;
import tb.xbx;
import tb.z0i;
import tb.zs6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class NextRPCPrefetch {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final NextRPCPrefetch INSTANCE = new NextRPCPrefetch();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f8071a = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements r5o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8072a;
        public final /* synthetic */ q3o b;
        public final /* synthetic */ long c;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.android.icart.weex.prefetch.NextRPCPrefetch$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class RunnableC0427a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0427a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.b.h();
                }
            }
        }

        public a(String str, q3o q3oVar, long j) {
            this.f8072a = str;
            this.b = q3oVar;
            this.c = j;
        }

        @Override // tb.r5o
        public void a(z0i z0iVar, List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89132812", new Object[]{this, z0iVar, list, new Boolean(z)});
                return;
            }
            ckf.g(z0iVar, "mainResponse");
            ckf.g(list, "attachedResponses");
            ne3.c.h(ne3.Companion, c9x.TAG, "prefetchForClick", System.currentTimeMillis() - this.c, 0.0f, 8, null);
            CartMegaManager.INSTANCE.d(this.f8072a, "receive.prefetch", NextRPCPrefetch.INSTANCE.j(z0iVar, list));
        }

        @Override // tb.r5o
        public void b(fj9 fj9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9ebfbe3", new Object[]{this, fj9Var});
                return;
            }
            ckf.g(fj9Var, "finishResult");
            new Handler(Looper.getMainLooper()).post(new RunnableC0427a());
        }

        @Override // tb.r5o
        public void c(szh szhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40186e18", new Object[]{this, szhVar});
                return;
            }
            ckf.g(szhVar, "errorResponse");
            CartMegaManager.INSTANCE.c(this.f8072a, "", "receive.prefetch", NextRPCPrefetch.INSTANCE.i(szhVar));
            ne3.c cVar = ne3.Companion;
            ne3.c.e(cVar, "PrefetchForClickQueryError", "网络请求失败 code=" + szhVar.c() + ",msg=" + szhVar.d(), 0.0f, 4, null);
        }

        @Override // tb.r5o
        public void d(a3o a3oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f01fd9d0", new Object[]{this, a3oVar});
            } else {
                ckf.g(a3oVar, "request");
            }
        }

        @Override // tb.r5o
        public void e(List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba18dfd3", new Object[]{this, list, new Boolean(z)});
                return;
            }
            ckf.g(list, "attachedResponses");
            CartMegaManager.INSTANCE.d(this.f8072a, "receive.prefetch", NextRPCPrefetch.INSTANCE.h(list));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements r5o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q3o f8074a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.f8074a.h();
                }
            }
        }

        public b(q3o q3oVar, long j, String str) {
            this.f8074a = q3oVar;
            this.b = j;
            this.c = str;
        }

        @Override // tb.r5o
        public void a(z0i z0iVar, List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89132812", new Object[]{this, z0iVar, list, new Boolean(z)});
                return;
            }
            ckf.g(z0iVar, "mainResponse");
            ckf.g(list, "attachedResponses");
            ne3.c.h(ne3.Companion, c9x.TAG, "prefetchForPreRender", System.currentTimeMillis() - this.b, 0.0f, 8, null);
            gd4.INSTANCE.h(z0iVar.i());
            CartMegaManager.e(CartMegaManager.INSTANCE, this.c, "prefetchForPreRenderComplete", null, 4, null);
        }

        @Override // tb.r5o
        public void b(fj9 fj9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9ebfbe3", new Object[]{this, fj9Var});
                return;
            }
            ckf.g(fj9Var, "finishResult");
            new Handler(Looper.getMainLooper()).post(new a());
        }

        @Override // tb.r5o
        public void c(szh szhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40186e18", new Object[]{this, szhVar});
                return;
            }
            ckf.g(szhVar, "errorResponse");
            ne3.c cVar = ne3.Companion;
            ne3.c.e(cVar, "PrefetchForPreRenderQueryError", "网络请求失败 code=" + szhVar.c() + ",msg=" + szhVar.d(), 0.0f, 4, null);
        }

        @Override // tb.r5o
        public void d(a3o a3oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f01fd9d0", new Object[]{this, a3oVar});
            } else {
                ckf.g(a3oVar, "request");
            }
        }

        @Override // tb.r5o
        public void e(List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba18dfd3", new Object[]{this, list, new Boolean(z)});
            } else {
                ckf.g(list, "attachedResponses");
            }
        }
    }

    static {
        t2o.a(478151036);
    }

    public final void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe33bd0e", new Object[]{this, jSONObject, str});
            return;
        }
        ckf.g(jSONObject, "exParams");
        ckf.g(str, "instanceId");
        jSONObject.put((JSONObject) "globalSell", "1");
        jSONObject.put((JSONObject) "mergeCombo", "true");
        jSONObject.put((JSONObject) "version", "1.1.1");
        jSONObject.put((JSONObject) RequestConfig.IS_ICART_IS_FIRST_REQUEST, "true");
        CheckHoldManager i = CheckHoldManager.i();
        ckf.f(i, "CheckHoldManager.getInstance()");
        jSONObject.put((JSONObject) "iCheckedCartIds", i.g());
        CheckHoldManager i2 = CheckHoldManager.i();
        ckf.f(i2, "CheckHoldManager.getInstance()");
        jSONObject.put((JSONObject) "iCheckedCartIdsForRepeatBuy", i2.l());
        jSONObject.put((JSONObject) v4s.PARAM_IS_INNER, String.valueOf(kjf.a()));
        jSONObject.put((JSONObject) RequestConfig.sKeyRequestTimestamp, (String) Long.valueOf(System.currentTimeMillis()));
        jSONObject.put((JSONObject) "shopIdInfoStr", o6g.c(Globals.getApplication()));
        jSONObject.put((JSONObject) "instanceId", str);
        xbx.Companion.a(jSONObject);
    }

    public final void b(JSONObject jSONObject, QueryParamsManager queryParamsManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be326cad", new Object[]{this, jSONObject, queryParamsManager});
        } else if (queryParamsManager != null) {
            JSONObject g = queryParamsManager.g();
            if (g != null) {
                jSONObject.put((JSONObject) "cartSortParams", (String) g);
            }
            if (queryParamsManager.e() != null) {
                jSONObject.put((JSONObject) "cartCustomExParam", queryParamsManager.e());
            }
            if (queryParamsManager.t()) {
                jSONObject.put((JSONObject) RequestConfig.IS_FULL_DATA_QUERY, "true");
            }
            String n = queryParamsManager.n();
            if (n != null) {
                jSONObject.put((JSONObject) "onceCustomExParams", n);
            }
        }
    }

    public final JSONArray c(List<dh1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2c74599d", new Object[]{this, list});
        }
        ckf.g(list, "attachedResponses");
        JSONArray jSONArray = new JSONArray();
        for (dh1 dh1Var : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "header", dh1Var.c().toString());
            jSONObject.put((JSONObject) AgooConstants.MESSAGE_BODY, dh1Var.e());
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    public final JSONObject e(szh szhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be228c21", new Object[]{this, szhVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "errorMsg", szhVar.d());
        jSONObject.put((JSONObject) jk.KEY_RET_CODE, szhVar.c());
        return jSONObject;
    }

    public final JSONObject g(z0i z0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("836e7110", new Object[]{this, z0iVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) AgooConstants.MESSAGE_BODY, z0iVar.i());
        jSONObject.put((JSONObject) "responseHeader", new JSONObject(z0iVar.f()).toString());
        return jSONObject;
    }

    public final JSONObject h(List<dh1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("613a06f9", new Object[]{this, list});
        }
        ckf.g(list, "attachedResponses");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "attachedResponses", (String) c(list));
        jSONObject.put((JSONObject) "onReceiveAttachedResponse", (String) jSONObject2);
        return jSONObject;
    }

    public final JSONObject i(szh szhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c0771b09", new Object[]{this, szhVar});
        }
        ckf.g(szhVar, "errorResponse");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "errorInfo", (String) e(szhVar));
        jSONObject.put((JSONObject) "onFailure", (String) jSONObject2);
        return jSONObject;
    }

    public final JSONObject j(z0i z0iVar, List<dh1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83a2aab1", new Object[]{this, z0iVar, list});
        }
        ckf.g(z0iVar, "mainResponse");
        ckf.g(list, "attachedResponses");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "mtopResponse", (String) g(z0iVar));
        jSONObject2.put((JSONObject) "attachedResponses", (String) c(list));
        jSONObject.put((JSONObject) "onReceiveData", (String) jSONObject2);
        return jSONObject;
    }

    public final void k(String str, QueryParamsManager queryParamsManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9925f4f2", new Object[]{this, str, queryParamsManager});
            return;
        }
        ckf.g(str, "instanceId");
        ckf.g(queryParamsManager, "queryParamsManager");
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#prefetchForClick");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, str);
        b(jSONObject, queryParamsManager);
        Pair<q3o, a3o> d = d(jSONObject, "prefetchForClick");
        q3o component1 = d.component1();
        component1.d(d.component2(), new a(str, component1, currentTimeMillis));
        aVar.b("Cart#prefetchForClick");
    }

    public final Pair<q3o, a3o> d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("cc8b6ff5", new Object[]{this, jSONObject, str});
        }
        ckf.g(jSONObject, RequestConfig.CUSTOM_EXPARAMS);
        ckf.g(str, "topic");
        MtopRequest f = f(jSONObject);
        MtopBusiness build = MtopBusiness.build(f);
        build.setJsonType(JsonTypeEnum.ORIGINALJSON);
        build.upstreamCompress(true);
        build.setUnitStrategy("UNIT_TRADE");
        build.allowSwitchToPOST(true);
        build.reqMethod(MethodEnum.GET);
        build.setBizTopic(str);
        a3o a3oVar = new a3o(f, build, new dxl(), 0, null, null, 56, null);
        a3oVar.h(Boolean.TRUE);
        return new Pair<>(q3o.Companion.a(vc3.sStreamNextRpcServiceName), a3oVar);
    }

    public final MtopRequest f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("293b0d49", new Object[]{this, jSONObject});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.trade.query.bag");
        mtopRequest.setVersion(AfcCustomSdk.SDK_VERSION);
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        Map<String, String> a2 = zs6.a(QueryParamsManager.DEFAULT_CART_FROM);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(a2);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("exParams");
        if (jSONObject != null) {
            jSONObject3.putAll(jSONObject);
        }
        jSONObject2.put((JSONObject) "exParams", jSONObject3.toString());
        mtopRequest.setData(jSONObject2.toString());
        return mtopRequest;
    }

    public final void l(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58e9e38", new Object[]{this, str});
            return;
        }
        ckf.g(str, "instanceId");
        if (!Login.checkSessionValid()) {
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), new BroadcastReceiver() { // from class: com.taobao.android.icart.weex.prefetch.NextRPCPrefetch$prefetchForPreRender$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(NextRPCPrefetch$prefetchForPreRender$1 nextRPCPrefetch$prefetchForPreRender$1, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/prefetch/NextRPCPrefetch$prefetchForPreRender$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null && TextUtils.equals(intent.getAction(), LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS)) {
                        try {
                            NextRPCPrefetch.INSTANCE.l(str);
                            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        } else if (!f8071a.getAndSet(true)) {
            long currentTimeMillis = System.currentTimeMillis();
            m9u.a aVar = m9u.Companion;
            aVar.a("Cart#prefetchForPreRender");
            hav.d(c9x.TAG, "start prefetchForPreRender");
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, str);
            Pair<q3o, a3o> d = d(jSONObject, "prefetchForPreRender");
            q3o component1 = d.component1();
            component1.d(d.component2(), new b(component1, currentTimeMillis, str));
            aVar.b("Cart#prefetchForPreRender");
        }
    }
}
