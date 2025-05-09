package com.taobao.android.buy.internal;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.aj;
import tb.alq;
import tb.ck;
import tb.cm0;
import tb.g4o;
import tb.gn0;
import tb.hh;
import tb.i0r;
import tb.jn0;
import tb.jo;
import tb.lo;
import tb.lql;
import tb.mi;
import tb.mj;
import tb.nn0;
import tb.pi;
import tb.pt;
import tb.qi;
import tb.rbb;
import tb.rf;
import tb.rk;
import tb.rl;
import tb.rn0;
import tb.so0;
import tb.t2o;
import tb.th;
import tb.um0;
import tb.vm0;
import tb.wt;
import tb.xh;
import tb.yk;
import tb.ym0;
import tb.zh;
import tb.zpb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AliBuyPresenterImpl implements nn0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_AURA_BUY_CONFIG = "aura_buy_config.json";
    public static final String DEFAULT_AURA_BUY_MAIN_FLOW = "aura.workflow.build";
    public static final String KEY_MODULE_NAME = "purchase";
    public static final String PRELOAD_MAIN_PAGE_FLOW = "aura.workflow.preload";

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Object> f6474a;
    public Activity b;
    public mj c;
    public alq d;
    public zpb e;
    public String f;
    public String g;
    public AURAPluginContainerNodeModel h;
    public so0 i;
    public rf j;
    public String o;
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final JSONObject n = new JSONObject();
    public final boolean m = AliBuyPerfSwitcher.enableThreadPerf();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nn0.a f6475a;

        public a(nn0.a aVar) {
            this.f6475a = aVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/internal/AliBuyPresenterImpl$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            rbb g = ck.g();
            g.b("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "errog=" + miVar);
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            Serializable b = ykVar.b();
            if (b instanceof AURARenderOutput) {
                View view = ((AURARenderOutput) b).getView();
                AliBuyPresenterImpl.a(AliBuyPresenterImpl.this).set(true);
                this.f6475a.onCallback(view);
                return;
            }
            ck.g().b("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "失败，输出结果不是渲染view");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nn0.a f6476a;

        public b(AliBuyPresenterImpl aliBuyPresenterImpl, nn0.a aVar) {
            this.f6476a = aVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/internal/AliBuyPresenterImpl$2");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            rbb g = ck.g();
            g.b("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "errog=" + miVar);
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            Serializable b = ykVar.b();
            if (b instanceof AURAParseIO) {
                this.f6476a.onCallback((AURAParseIO) b);
            } else {
                ck.g().b("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "失败，输出结果不是数据协议");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nn0.a f6477a;

        public c(nn0.a aVar) {
            this.f6477a = aVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/internal/AliBuyPresenterImpl$3");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            rbb g = ck.g();
            g.b("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "errog=" + miVar);
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            Serializable b = ykVar.b();
            if (b instanceof AURARenderOutput) {
                View view = ((AURARenderOutput) b).getView();
                AliBuyPresenterImpl.a(AliBuyPresenterImpl.this).set(true);
                this.f6477a.onCallback(view);
                return;
            }
            ck.g().b("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "失败，输出结果不是渲染view");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nn0.a f6478a;

        public d(nn0.a aVar) {
            this.f6478a = aVar;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/internal/AliBuyPresenterImpl$4");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            rbb g = ck.g();
            g.b("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "errog=" + miVar);
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            Serializable b = ykVar.b();
            if (b instanceof AURARenderOutput) {
                View view = ((AURARenderOutput) b).getView();
                if (!AliBuyPresenterImpl.a(AliBuyPresenterImpl.this).get()) {
                    AliBuyPresenterImpl.b(AliBuyPresenterImpl.this).set(true);
                    this.f6478a.onCallback(view);
                    return;
                }
                return;
            }
            ck.g().b("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "失败，输出结果不是渲染view");
        }
    }

    static {
        t2o.a(301990027);
        t2o.a(301989897);
    }

    public AliBuyPresenterImpl() {
        new i0r();
        vm0.g(0.001f);
    }

    public static /* synthetic */ AtomicBoolean a(AliBuyPresenterImpl aliBuyPresenterImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("8dff8e20", new Object[]{aliBuyPresenterImpl});
        }
        return aliBuyPresenterImpl.k;
    }

    public static /* synthetic */ AtomicBoolean b(AliBuyPresenterImpl aliBuyPresenterImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("565db2bf", new Object[]{aliBuyPresenterImpl});
        }
        return aliBuyPresenterImpl.l;
    }

    public final void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c5d8d3", new Object[]{this, map});
            return;
        }
        Intent h = hh.h(this.b);
        if (h == null) {
            vm0.d(vm0.a.a("buyFragment").message("intent is empty").tag("EMPTY_INTENT_FORM_(containerPerformanceMonitor)").sampling(1.0f));
            return;
        }
        long longExtra = h.getLongExtra("START_CLICK_TIME", 0L);
        long longExtra2 = h.getLongExtra("COUPON_FINISH", 0L);
        long longExtra3 = h.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        long longExtra4 = h.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        long longExtra5 = h.getLongExtra("NEW_BUY_ON_CREATE_TIME", 0L);
        this.n.put(jn0.STAGE_KEY_CLICK_START, (Object) Long.valueOf(longExtra));
        this.n.put(jn0.STAGE_KEY_COUPON_FINISH, (Object) Long.valueOf(longExtra2));
        this.n.put(jn0.STAGE_KEY_URL_START, (Object) Long.valueOf(longExtra3));
        this.n.put(jn0.STAGE_KEY_NAV_START, (Object) Long.valueOf(longExtra4));
        this.n.put(jn0.STAGE_KEY_BUY_ON_CREATE, (Object) Long.valueOf(longExtra5));
        map.put(jn0.USER_CONTEXT_KEY, this.n);
    }

    public void d(AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919ab40a", new Object[]{this, aURAParseIO});
            return;
        }
        mj mjVar = this.c;
        if (mjVar != null) {
            jo.a(mjVar, aURAParseIO);
        }
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        } else if (this.c != null) {
            jo.a(this.c, new AURAParseIO(new ArrayList<rl>(jSONObject) { // from class: com.taobao.android.buy.internal.AliBuyPresenterImpl.5
                public final /* synthetic */ JSONObject val$protocol;

                {
                    this.val$protocol = jSONObject;
                    add(new rl(jSONObject));
                }
            }));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        mj mjVar = this.c;
        if (mjVar != null) {
            mjVar.destroy();
        }
        AliBuyPerfSwitcher.dumpLog();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd82c179", new Object[]{this});
            return;
        }
        mj mjVar = this.c;
        if (mjVar != null) {
            pi.b(mjVar, zh.EVENT_TYPE, new qi());
        }
    }

    public synchronized void h(nn0.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe11865b", new Object[]{this, aVar});
            return;
        }
        if (this.c == null) {
            this.c = k();
        }
        AURANextRPCIO l = l();
        ck.g().e("executeFlow");
        this.n.put(jn0.STAGE_KEY_AURA_START, (Object) Long.valueOf(System.currentTimeMillis()));
        this.c.c(DEFAULT_AURA_BUY_MAIN_FLOW, l, new a(aVar));
    }

    public void i(AURAParseIO aURAParseIO, nn0.a<Void, View> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9ad48f", new Object[]{this, aURAParseIO, aVar});
            return;
        }
        if (this.c == null) {
            this.c = k();
        }
        this.c.c("aura.workflow.localData.render", aURAParseIO, new c(aVar));
    }

    public void j(nn0.a<Void, AURAParseIO> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbde03d2", new Object[]{this, aVar});
            return;
        }
        if (this.c == null) {
            this.c = k();
        }
        this.c.c("aura.workflow.request", l(), new b(this, aVar));
    }

    public final alq m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alq) ipChange.ipc$dispatch("4abf90a5", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new alq(this.b);
        }
        return this.d;
    }

    public final void n(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1470fda9", new Object[]{this, activity});
            return;
        }
        this.f = DEFAULT_AURA_BUY_CONFIG;
        this.j = new rf();
        this.e.e();
    }

    public final void o(gn0 gn0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100b670b", new Object[]{this, gn0Var});
            return;
        }
        m().f(gn0Var.a());
        m().g(gn0Var.b());
        m().h(gn0Var.c());
        m().i(gn0Var.d());
    }

    public final void p(zpb zpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05e6107", new Object[]{this, zpbVar});
            return;
        }
        HashMap<String, Object> c2 = this.i.c();
        if (c2 == null) {
            c2 = new HashMap<>();
        }
        this.f6474a = c2;
        c2.put(AliBuyPresenterImpl.class.getSimpleName(), this);
        c(this.f6474a);
        this.f6474a.put("page_info", lql.e(hh.h(this.b)));
        this.f6474a.put(cm0.PAGE_NAME, zpbVar.getPageName());
        this.f6474a.put("autoSize", Boolean.valueOf(xh.b(this.b)));
        this.f6474a.put("purchaseFrom", this.o);
        this.f6474a.put("itemCount", this.e.d(this.b).g().g());
        this.f6474a.put("bucket", AliBuyPerfSwitcher.getRealBucket());
        rn0 d2 = zpbVar.d(this.b);
        this.f6474a.put(ym0.USERDATA_KEY_REQUEST_ADJUST, d2.b());
        this.f6474a.put("submit_rpc_params", d2.h());
        this.f6474a.put("aliBuyWorkFlowConfig", zpbVar.c());
        this.f6474a.put(wt.USERDATA_KEY_STATUS_MANAGER, m());
        this.f6474a.put("submit_callback", zpbVar.i());
        this.f6474a.put("aliBuyDXConfig", zpbVar.f());
        this.f6474a.put(rf.USERDATA_KEY_ACTIVITY_RESULT, this.j);
        this.f6474a.put(aj.USER_CONTEXT_KEY_DECRYPT, zpbVar.a());
        this.f6474a.put("aliBuyPreload", this.l);
        this.f6474a.put("enableFilterEmptyNode", Boolean.valueOf(AliBuyPerfSwitcher.enablePopupWindowStreamResponse()));
        this.f6474a.put("enableExtendModules", Boolean.valueOf(th.c()));
        this.f6474a.put("enableAsyncThread", Boolean.valueOf(this.m));
        this.f6474a.put("enableLogAsyncThread", Boolean.valueOf(AliBuyPerfSwitcher.enableLogPerf()));
        this.f6474a.put("enableParsePerf", Boolean.valueOf(AliBuyPerfSwitcher.enableParsePerf()));
        this.f6474a.put("enableParsePerfV2", Boolean.valueOf(AliBuyPerfSwitcher.enableParsePerfV2()));
        this.f6474a.put("enableStreamJson", Boolean.valueOf(AliBuyPerfSwitcher.enableStreamJson()));
        this.f6474a.put("enableAsyncUT", Boolean.valueOf(AliBuyPerfSwitcher.enableAsyncUT()));
        this.f6474a.put("enableIdleRender", Boolean.valueOf(AliBuyPerfSwitcher.enableIdleRender()));
        this.f6474a.put("enableCombineRender", Boolean.valueOf(AliBuyPerfSwitcher.enableCombineRender()));
        this.f6474a.put("enableSmoothButter", Boolean.valueOf(AliBuyPerfSwitcher.enableSmoothButter()));
        this.f6474a.put("enableSchedulePerf", Boolean.valueOf(AliBuyPerfSwitcher.enableSchedulePerf()));
    }

    public void q(zpb zpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38db277c", new Object[]{this, zpbVar});
            return;
        }
        Activity context = zpbVar.getContext();
        this.b = context;
        this.e = zpbVar;
        this.o = lql.d(hh.h(context));
        n(this.b);
        w(this.e);
    }

    public final void r(so0 so0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7a04b", new Object[]{this, so0Var});
            return;
        }
        this.i = so0Var;
        y(so0Var);
    }

    public void s(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else if (this.c != null) {
            qi qiVar = new qi();
            qiVar.n(jSONObject);
            pi.b(this.c, str, qiVar);
        }
    }

    public final boolean t(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22aa2d5", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public void u(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.j.b(i, i2, intent);
        }
    }

    public void v(JSONObject jSONObject, nn0.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46413e1", new Object[]{this, jSONObject, aVar});
            return;
        }
        if (this.c == null) {
            this.c = k();
        }
        this.c.c(PRELOAD_MAIN_PAGE_FLOW, new AURAParseIO(Arrays.asList(new rl(jSONObject))), new d(aVar));
    }

    public final void w(zpb zpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afacb74b", new Object[]{this, zpbVar});
            return;
        }
        r(zpbVar.c());
        o(zpbVar.b());
        p(zpbVar);
    }

    public final void x(mj mjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5781fd8b", new Object[]{this, mjVar});
            return;
        }
        Iterator it = ((ArrayList) um0.d()).iterator();
        while (it.hasNext()) {
            mjVar.o((IAURAPluginCenter) it.next());
        }
    }

    public final void y(so0 so0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d64fc3", new Object[]{this, so0Var});
            return;
        }
        AURAPluginContainerNodeModel b2 = so0Var.b();
        if (b2 != null) {
            this.h = b2;
            return;
        }
        String a2 = so0Var.a();
        if (!TextUtils.isEmpty(a2)) {
            this.f = a2;
        }
    }

    public final synchronized mj k() {
        so0 so0Var;
        IAURAPluginCenter[] d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("e1b6b4a3", new Object[]{this});
        }
        if (this.c == null) {
            mj a2 = um0.a(this.b, this.o, this.f6474a);
            this.c = a2;
            if (a2 == null) {
                this.c = mj.h(new lo(this.b, this.f6474a)).o(new AURAAliBuyCorePluginCenter());
                if (this.h != null && !th.c()) {
                    this.c.u(this.h);
                    ck.g().c("PurchaseManager", "getAURAInstance", "使用了业务加载好的配置");
                    so0Var = this.i;
                    if (!(so0Var == null || (d2 = so0Var.d()) == null)) {
                        this.c.o(d2);
                    }
                    x(this.c);
                }
                this.c.t(this.f);
                ck.g().c("PurchaseManager", "getAURAInstance", "外部没有传入加载好的配置，使用文件路径加载配置");
                so0Var = this.i;
                if (so0Var == null) {
                    this.c.o(d2);
                }
                x(this.c);
            }
            this.g = this.c.getUserContext().d();
        }
        return this.c;
    }

    public final AURANextRPCIO l() {
        AURANextRPCEndpoint aURANextRPCEndpoint;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCIO) ipChange.ipc$dispatch("f33da55f", new Object[]{this});
        }
        rk c2 = AliBuyPerfSwitcher.enablePrefetch() ? new rk.a().c() : null;
        boolean z2 = t(this.f6474a.get("enableStreamResponse")) || t(this.f6474a.get("enablePopupWindowStreamResponse"));
        if ("purchase".equalsIgnoreCase(this.g)) {
            rn0 d2 = this.e.d(this.b);
            if (this.m || z2) {
                z = true;
            }
            aURANextRPCEndpoint = d2.d(c2, z, z2);
        } else {
            aURANextRPCEndpoint = this.e.d(this.b).c();
        }
        return new AURANextRPCIO(g4o.KEY_SERVICE_NAME, aURANextRPCEndpoint);
    }
}
