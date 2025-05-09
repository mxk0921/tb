package com.taobao.android.waitpay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ali.adapt.api.AtlasServiceFinder;
import com.alibaba.android.aura.AURAAdamAndroidPluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.a8r;
import tb.abr;
import tb.aj;
import tb.alq;
import tb.b8r;
import tb.bn0;
import tb.ck;
import tb.cm0;
import tb.hzr;
import tb.jo;
import tb.k17;
import tb.k9r;
import tb.kyb;
import tb.lo;
import tb.lzr;
import tb.mi;
import tb.mj;
import tb.mud;
import tb.pi;
import tb.pt;
import tb.qi;
import tb.rbb;
import tb.rf;
import tb.rl;
import tb.snn;
import tb.t2o;
import tb.tzr;
import tb.uzr;
import tb.wt;
import tb.xzr;
import tb.yk;
import tb.yvf;
import tb.zh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBWaitPayPresenter implements kyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f9906a;
    public final rf b = new rf();
    public hzr c;
    public mj d;
    public final ViewGroup e;
    public final ParentRecyclerView f;
    public final snn g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends k17 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -34816638) {
                return super.e((Activity) objArr[0]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/TBWaitPayPresenter$1");
        }

        @Override // tb.k17
        public ViewGroup e(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("fdecbd82", new Object[]{this, activity});
            }
            ViewGroup viewGroup = (ViewGroup) TBWaitPayPresenter.a(TBWaitPayPresenter.this).findViewById(R.id.tb_wait_pay_detail_loading);
            if (viewGroup != null) {
                return viewGroup;
            }
            return super.e(activity);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends pt<AURARenderOutput> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/TBWaitPayPresenter$2");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            rbb g = ck.g();
            g.e("TBWaitPayPresenter: error = " + miVar);
        }

        @Override // tb.pt
        public void c(yk<AURARenderOutput> ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
                return;
            }
            AURARenderOutput b = ykVar.b();
            if (b instanceof AURARenderOutput) {
                View view = b.getView();
                try {
                    if (TBWaitPayPresenter.b(TBWaitPayPresenter.this) != null) {
                        TBWaitPayPresenter.b(TBWaitPayPresenter.this).removeAllViews();
                        TBWaitPayPresenter.b(TBWaitPayPresenter.this).addView(view);
                    }
                    yvf.b(null);
                } catch (Exception unused) {
                    ck.g().e("TBWaitPayPresenter: 失败，输出结果不是渲染view");
                }
            } else {
                ck.g().e("TBWaitPayPresenter: 失败，输出结果不是渲染view");
            }
        }
    }

    static {
        t2o.a(725614606);
        t2o.a(725614595);
    }

    public TBWaitPayPresenter(Activity activity, ViewGroup viewGroup) {
        this.f9906a = activity;
        this.e = viewGroup;
        ParentRecyclerView parentRecyclerView = new ParentRecyclerView(activity);
        this.f = parentRecyclerView;
        this.g = new snn(parentRecyclerView, "order_detail");
        i(activity);
        o();
    }

    public static /* synthetic */ Activity a(TBWaitPayPresenter tBWaitPayPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("8d4d4c50", new Object[]{tBWaitPayPresenter});
        }
        return tBWaitPayPresenter.f9906a;
    }

    public static /* synthetic */ ViewGroup b(TBWaitPayPresenter tBWaitPayPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a8bb403e", new Object[]{tBWaitPayPresenter});
        }
        return tBWaitPayPresenter.e;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("220f8dfd", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = e();
        }
        if (this.c != null) {
            this.d.c(AliBuyPresenterImpl.DEFAULT_AURA_BUY_MAIN_FLOW, new AURANextRPCIO("nextrpc-TM2", this.c.b()), new b());
            return;
        }
        throw new NullPointerException("config is null!!");
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd82c179", new Object[]{this});
            return;
        }
        mj mjVar = this.d;
        if (mjVar != null) {
            pi.b(mjVar, zh.EVENT_TYPE, new qi());
        }
    }

    public final mj e() {
        IAURAPluginCenter[] d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("e1b6b4a3", new Object[]{this});
        }
        if (this.d == null) {
            mj h = mj.h(new lo(this.f9906a, h()));
            this.d = h;
            h.t("aura/aura_waitpay_detail_config.json");
            hzr hzrVar = this.c;
            if (!(hzrVar == null || (d = hzrVar.d()) == null)) {
                this.d.o(d);
            }
            p(this.d);
        }
        return this.d;
    }

    public final Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de7ea90f", new Object[]{this});
        }
        Intent intent = this.f9906a.getIntent();
        String stringExtra = intent.getStringExtra("openFrom");
        String stringExtra2 = intent.getStringExtra("pageType");
        Uri data = intent.getData();
        if (data != null) {
            stringExtra = TextUtils.isEmpty(stringExtra) ? data.getQueryParameter("openFrom") : null;
            stringExtra2 = TextUtils.isEmpty(stringExtra2) ? data.getQueryParameter("pageType") : null;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(stringExtra)) {
            hashMap.put("openFrom", stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            hashMap.put("pageType", stringExtra2);
        }
        return hashMap;
    }

    @Override // tb.kyb
    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        } else if (this.d != null) {
            jo.a(this.d, new AURAParseIO(new ArrayList<rl>(jSONObject) { // from class: com.taobao.android.waitpay.TBWaitPayPresenter.3
                public final /* synthetic */ JSONObject val$protocol;

                {
                    this.val$protocol = jSONObject;
                    add(new rl(jSONObject));
                }
            }));
        }
    }

    public final Map<String, Object> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1d70d2a", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        alq alqVar = new alq(this.f9906a);
        j(alqVar);
        hashMap.put("userContextPageAuraConfig", this.c);
        hashMap.put(wt.USERDATA_KEY_STATUS_MANAGER, alqVar);
        Activity activity = this.f9906a;
        hashMap.put("submit_callback", new lzr(activity, (mud) activity, this));
        hashMap.put(rf.USERDATA_KEY_ACTIVITY_RESULT, this.b);
        hashMap.put(cm0.PAGE_NAME, "Page_WaitpayDetail");
        hashMap.put("aliBuyDXConfig", new b8r());
        hashMap.put(aj.USER_CONTEXT_KEY_DECRYPT, new abr());
        hashMap.put("userContextDateUpdate", this);
        hashMap.put("autoSize", Boolean.valueOf(a8r.b(this.f9906a)));
        ParentRecyclerView parentRecyclerView = this.f;
        if (parentRecyclerView != null) {
            hashMap.put(uzr.USER_CONTEXT_CONTAINER, parentRecyclerView);
        }
        snn snnVar = this.g;
        if (snnVar != null) {
            hashMap.put(tzr.USER_CONTEXT_RECOMMEND, snnVar);
        }
        hashMap.put("page_info", f());
        return hashMap;
    }

    public final void i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("102a5d3a", new Object[]{this, activity});
        } else {
            this.c = new hzr(new xzr(activity));
        }
    }

    public final void j(alq alqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2acffd3", new Object[]{this, alqVar});
        } else {
            alqVar.h(new a());
        }
    }

    public void k(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else if (this.d != null) {
            qi qiVar = new qi();
            qiVar.n(jSONObject);
            pi.b(this.d, str, qiVar);
        }
    }

    public void l(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i != 69) {
            if (i != 4322) {
                this.b.b(i, i2, intent);
                return;
            }
            bn0.g(this.f9906a);
            this.f9906a.finish();
        } else if (i2 == 0) {
            this.f9906a.finish();
        } else {
            c();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        mj mjVar = this.d;
        if (mjVar != null) {
            mjVar.destroy();
        }
        snn snnVar = this.g;
        if (snnVar != null) {
            snnVar.e();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838df391", new Object[]{this});
            return;
        }
        d();
        if (this.e != null) {
            c();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f307c84e", new Object[]{this});
        } else {
            AtlasServiceFinder.getInstance().registerService(k9r.c.class, "com.taobao.android.taobao-general-purchase", "com.taobao.android.purchase.aura.external.TBBuyExternalRPVerifyService");
        }
    }

    public final void p(mj mjVar) {
        try {
            IpChange ipChange = AURAAdamAndroidPluginCenter.$ipChange;
            mjVar.o((IAURAPluginCenter) AURAAdamAndroidPluginCenter.class.newInstance());
        } catch (Throwable th) {
            th.printStackTrace();
            ck.g().e("registerPluginCenter AURAAdamAndroidPluginCenter failed");
        }
    }
}
