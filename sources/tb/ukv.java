package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import tb.h6c;
import tb.rdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ukv implements qdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IMainLifecycleService f29448a;
    public final dfp b;
    public final dge c;
    public h6d d;
    public Context e;
    public tkv f;
    public final IMainFeedsViewService g;
    public h6c.b h;
    public h6c.d i;
    public final IContainerDataService<?> j;
    public rdc.a m;
    public jqw p;
    public boolean k = false;
    public boolean l = false;
    public boolean n = false;
    public long o = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends g7n {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ rdc.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, rdc.a aVar) {
            super(i);
            this.b = aVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconbackanimeservice/impl/upgrade/UpgradeIconBackGuideAnimeProcess$1");
        }

        @Override // tb.g7n, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ukv.a(ukv.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconbackanimeservice/impl/upgrade/UpgradeIconBackGuideAnimeProcess$2");
        }

        @Override // tb.m47, tb.h6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }

        @Override // tb.m47, tb.h6d
        public void onDestroyView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            }
        }

        @Override // tb.m47, tb.h6d
        public void onNewIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            }
        }

        @Override // tb.m47, tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            ukv.g(ukv.this);
            ukv.h(ukv.this);
        }

        @Override // tb.m47, tb.h6d
        public void onRestart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            }
        }

        @Override // tb.m47, tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else {
                ukv.b(ukv.this);
            }
        }

        @Override // tb.m47, tb.h6d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            }
        }

        @Override // tb.m47, tb.h6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            }
        }

        @Override // tb.m47, tb.h6d
        public void onWillExit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements h6c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f29450a = false;
        public String b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ukv ukvVar = ukv.this;
                ukv.n(ukvVar, ukv.m(ukvVar));
            }
        }

        public c() {
        }

        @Override // tb.h6c.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
                return;
            }
            this.f29450a = ukv.i(ukv.this);
            this.b = ukv.j(ukv.this);
            fve.e("UpgradeIconBackGuideAnimeProcess", "onDataChangeLayoutStart...isColdStartData:" + this.f29450a + " , requestType:" + this.b);
        }

        @Override // tb.h6c.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
                return;
            }
            fve.e("UpgradeIconBackGuideAnimeProcess", "onDataChangeLayoutFinish...isColdStartData:" + ukv.i(ukv.this));
            if (!ukv.k(ukv.this) && this.f29450a) {
                ukv.l(ukv.this, true);
                if (ukv.m(ukv.this) != null && ukv.m(ukv.this).k()) {
                    ukv ukvVar = ukv.this;
                    ukv.n(ukvVar, ukv.m(ukvVar));
                }
            } else if (TextUtils.equals(this.b, Constant.KEY_PAGEBACK) && ukv.m(ukv.this) != null && ukv.m(ukv.this).i() && !ukv.o(ukv.this)) {
                ukv.p(ukv.this, true);
                get.a().f(new a(), 100L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements h6c.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ukv ukvVar = ukv.this;
                ukv.n(ukvVar, ukv.m(ukvVar));
            }
        }

        public d() {
        }

        @Override // tb.h6c.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94ec7ab1", new Object[]{this});
                return;
            }
            fve.e("UpgradeIconBackGuideAnimeProcess", "onDiffRefreshFinish");
            if (TextUtils.equals(ukv.j(ukv.this), Constant.KEY_PAGEBACK) && ukv.m(ukv.this) != null && ukv.m(ukv.this).i() && !ukv.o(ukv.this)) {
                ukv.p(ukv.this, true);
                get.a().f(new a(), 100L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            if (i == 3005 && objArr != null) {
                try {
                    if (objArr.length != 0 && (objArr[0] instanceof String)) {
                        fve.e("UpgradeIconBackGuideAnimeProcess", "id:" + i + " params:" + objArr[0]);
                        JSONObject parseObject = JSON.parseObject((String) objArr[0]);
                        if (!(parseObject == null || parseObject.getString("event") == null || parseObject.getJSONObject("param") == null)) {
                            String string = parseObject.getString("event");
                            JSONObject jSONObject = parseObject.getJSONObject("param");
                            if (TextUtils.equals(string, "pub_broadcast_update_add_icon_status") && TextUtils.equals(jSONObject.getString("code"), "1")) {
                                String string2 = jSONObject.getString(rdc.a.LOCATION_REPLACE);
                                if (!TextUtils.isEmpty(string2) && ukv.c(ukv.this) != null) {
                                    ukv.c(ukv.this).i(string2);
                                }
                            }
                        }
                        return null;
                    }
                } catch (Exception e) {
                    fve.c("UpgradeIconBackGuideAnimeProcess", "WVEventListener onEvent error", e);
                }
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("UpgradeIconBackGuideAnimeProcess", "registerWVEventListener");
            if (ukv.d(ukv.this) == null) {
                ukv ukvVar = ukv.this;
                ukv.e(ukvVar, ukv.f(ukvVar));
            }
            lqw.d().b(ukv.d(ukv.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("UpgradeIconBackGuideAnimeProcess", "unRegisterWVEventListener");
            if (ukv.c(ukv.this) != null) {
                ukv.c(ukv.this).i(null);
            }
            if (ukv.d(ukv.this) != null) {
                lqw.d().h(ukv.d(ukv.this));
            }
            ukv.e(ukv.this, null);
        }
    }

    static {
        t2o.a(491782388);
        t2o.a(491782364);
    }

    public ukv(cfc cfcVar, Context context, dfp dfpVar, dge dgeVar) {
        this.e = context;
        this.f29448a = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.j = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.g = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.b = dfpVar;
        this.c = dgeVar;
        A();
        z();
    }

    public static /* synthetic */ void a(ukv ukvVar, rdc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd828df", new Object[]{ukvVar, aVar});
        } else {
            ukvVar.y(aVar);
        }
    }

    public static /* synthetic */ void b(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bc4983", new Object[]{ukvVar});
        } else {
            ukvVar.F();
        }
    }

    public static /* synthetic */ dge c(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dge) ipChange.ipc$dispatch("f6b63141", new Object[]{ukvVar});
        }
        return ukvVar.c;
    }

    public static /* synthetic */ jqw d(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqw) ipChange.ipc$dispatch("f8fffd92", new Object[]{ukvVar});
        }
        return ukvVar.p;
    }

    public static /* synthetic */ jqw e(ukv ukvVar, jqw jqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqw) ipChange.ipc$dispatch("b89c929c", new Object[]{ukvVar, jqwVar});
        }
        ukvVar.p = jqwVar;
        return jqwVar;
    }

    public static /* synthetic */ jqw f(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqw) ipChange.ipc$dispatch("bfaec113", new Object[]{ukvVar});
        }
        return ukvVar.u();
    }

    public static /* synthetic */ void g(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06a7304", new Object[]{ukvVar});
        } else {
            ukvVar.C();
        }
    }

    public static /* synthetic */ void h(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd189c85", new Object[]{ukvVar});
        } else {
            ukvVar.B();
        }
    }

    public static /* synthetic */ boolean i(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49c6c60a", new Object[]{ukvVar})).booleanValue();
        }
        return ukvVar.w();
    }

    public static /* synthetic */ String j(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c44f23f9", new Object[]{ukvVar});
        }
        return ukvVar.v();
    }

    public static /* synthetic */ boolean k(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e323190c", new Object[]{ukvVar})).booleanValue();
        }
        return ukvVar.k;
    }

    public static /* synthetic */ boolean l(ukv ukvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d6cff8e", new Object[]{ukvVar, new Boolean(z)})).booleanValue();
        }
        ukvVar.k = z;
        return z;
    }

    public static /* synthetic */ rdc.a m(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rdc.a) ipChange.ipc$dispatch("2221bd9a", new Object[]{ukvVar});
        }
        return ukvVar.m;
    }

    public static /* synthetic */ void n(ukv ukvVar, rdc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effee7d7", new Object[]{ukvVar, aVar});
        } else {
            ukvVar.x(aVar);
        }
    }

    public static /* synthetic */ boolean o(ukv ukvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c92d958f", new Object[]{ukvVar})).booleanValue();
        }
        return ukvVar.l;
    }

    public static /* synthetic */ boolean p(ukv ukvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48b2136b", new Object[]{ukvVar, new Boolean(z)})).booleanValue();
        }
        ukvVar.l = z;
        return z;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171cc6f3", new Object[]{this});
        } else if (this.f29448a != null) {
            this.d = t();
            this.f29448a.getPageLifeCycleRegister().a(this.d);
            fve.e("UpgradeIconBackGuideAnimeProcess", "registerPageLifeCycleListener");
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d637e53", new Object[]{this});
        } else {
            get.a().e(new f());
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e133851f", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = this.g;
        if (iMainFeedsViewService != null) {
            if (this.h != null) {
                iMainFeedsViewService.getLifeCycleRegister().k(this.h);
                this.h = null;
            }
            if (this.i != null) {
                this.g.getLifeCycleRegister().s(this.i);
                this.i = null;
            }
            fve.e("UpgradeIconBackGuideAnimeProcess", "unRegisterOnFeedsLayoutListener");
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0db2f5a", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.f29448a;
        if (iMainLifecycleService != null && this.d != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.d);
            fve.e("UpgradeIconBackGuideAnimeProcess", "unRegisterPageLifeCycleListener");
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e95fffa", new Object[]{this});
        } else {
            get.a().e(new g());
        }
    }

    @Override // tb.qdc
    public boolean currentBackWithAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c43feb22", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    @Override // tb.qdc
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        tkv tkvVar = this.f;
        if (tkvVar != null) {
            tkvVar.c();
            this.f.d();
        }
        E();
        D();
        F();
    }

    public final h6c.d r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.d) ipChange.ipc$dispatch("e235fac4", new Object[]{this});
        }
        return new d();
    }

    public final h6c.b s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.b) ipChange.ipc$dispatch("a8a36fe", new Object[]{this});
        }
        return new c();
    }

    @Override // tb.qdc
    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.e = context;
        }
    }

    public final h6d t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("32ac1a75", new Object[]{this});
        }
        return new b();
    }

    public final jqw u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqw) ipChange.ipc$dispatch("28bb5c7a", new Object[]{this});
        }
        return new e();
    }

    public final String v() {
        IContainerDataService<?> iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6381fa6", new Object[]{this});
        }
        IMainFeedsViewService iMainFeedsViewService = this.g;
        if (iMainFeedsViewService == null || h93.b(iMainFeedsViewService) || (iContainerDataService = this.j) == null || iContainerDataService.getContainerData() == null || !(this.j.getContainerData() instanceof AwesomeGetContainerData)) {
            return "";
        }
        return ((AwesomeGetContainerData) this.j.getContainerData()).requestType;
    }

    public final boolean w() {
        IContainerDataService<?> iContainerDataService;
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5815f529", new Object[]{this})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = this.g;
        if (iMainFeedsViewService == null || h93.b(iMainFeedsViewService) || (iContainerDataService = this.j) == null || iContainerDataService.getContainerData() == null || (base = this.j.getContainerData().getBase()) == null || base.getPageParams() == null || base.getPageParams().getPageNum() != 0 || !base.isRemote()) {
            return false;
        }
        return true;
    }

    public final void y(rdc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e80f4f4", new Object[]{this, aVar});
        } else if (aVar == null || this.e == null) {
            fve.e("UpgradeIconBackGuideAnimeProcess", "AnimeConfig or mContext is null");
        } else {
            if (this.f != null) {
                this.f = null;
            }
            this.f = new tkv(this.b, this.c);
            fve.e("UpgradeIconBackGuideAnimeProcess", "onOutLinkTrigger init iconAnimeTrigger");
            try {
                this.f.g(this.e, aVar);
            } catch (Throwable unused) {
                C();
                fve.e("UpgradeIconBackGuideAnimeProcess", "Illegal config:" + aVar);
            }
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57751cb8", new Object[]{this});
        } else if (this.g != null) {
            this.h = s();
            this.g.getLifeCycleRegister().M(this.h);
            this.i = r();
            this.g.getLifeCycleRegister().i(this.i);
            fve.e("UpgradeIconBackGuideAnimeProcess", "registerOnFeedsLayoutListener");
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a623f959", new Object[]{this});
            return;
        }
        fve.e("UpgradeIconBackGuideAnimeProcess", "resetAll");
        tkv tkvVar = this.f;
        if (tkvVar != null) {
            tkvVar.c();
            this.f = null;
        }
        this.n = false;
        this.m = null;
        this.l = false;
    }

    @Override // tb.qdc
    public void onOutLinkTrigger(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23a8fd", new Object[]{this, str, intent});
            return;
        }
        fve.e("UpgradeIconBackGuideAnimeProcess", "onOutLinkTrigger...");
        if (TextUtils.isEmpty(str)) {
            fve.e("UpgradeIconBackGuideAnimeProcess", "onOutLinkTrigger params == null");
            return;
        }
        this.o = System.currentTimeMillis();
        try {
            this.m = rdc.a.m(JSON.parseObject(str));
        } catch (Throwable unused) {
            fve.e("UpgradeIconBackGuideAnimeProcess", "Illegal params:" + str);
            this.m = null;
        }
        rdc.a aVar = this.m;
        if (aVar == null) {
            fve.e("UpgradeIconBackGuideAnimeProcess", "mAnimeConfig == null");
            return;
        }
        dge dgeVar = this.c;
        if (dgeVar != null && dgeVar.g(aVar)) {
            this.m.n(rdc.a.LOCATION_REPLACE);
        }
        if ((!this.m.k() || this.k) && !this.m.i()) {
            x(this.m);
            return;
        }
        this.n = true;
        fve.e("UpgradeIconBackGuideAnimeProcess", "wait ui refresh");
    }

    public final boolean q(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1a5d224", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.o <= 0) {
            return false;
        }
        try {
            if (z) {
                j = Long.parseLong(mve.d("iconBackAnimTriggerTimeout", "3000"));
            } else {
                j = Long.parseLong(mve.d("iconBackAnimTriggerTimeoutNormal", "500"));
            }
        } catch (Exception e2) {
            fve.c("UpgradeIconBackGuideAnimeProcess", "parse timeout error", e2);
            j = 500;
        }
        if (cw6.b() && j < 10000) {
            j = 10000;
        }
        return System.currentTimeMillis() - this.o > j;
    }

    public final void x(rdc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ec2a8a", new Object[]{this, aVar});
            return;
        }
        fve.e("UpgradeIconBackGuideAnimeProcess", "playAnimation...");
        if (aVar == null) {
            fve.e("UpgradeIconBackGuideAnimeProcess", "playAnimation...config is null");
        } else if (q(aVar.k())) {
            this.n = false;
            this.o = -1L;
            fve.e("UpgradeIconBackGuideAnimeProcess", "animationTriggerTimeout");
        } else {
            if (vxl.b().s()) {
                int c2 = ((int) aVar.c()) / 16;
                fve.e("UpgradeIconBackGuideAnimeProcess", "playAnimation use Qos, frameCount:" + c2);
                e7n.f().a(1, new a(c2, aVar));
            } else {
                y(aVar);
            }
            this.n = true;
            this.o = -1L;
            this.m = null;
        }
    }
}
