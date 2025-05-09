package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import tb.h6c;
import tb.lgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p2k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ND_ANIM_FEATURE_LIST = "clientAbNdAnimFeatureList";
    public static String p = null;

    /* renamed from: a  reason: collision with root package name */
    public final IMainFeedsViewService<?> f25832a;
    public final IContainerDataService<?> b;
    public final IMainLifecycleService c;
    public h6c.c<ViewGroup> d;
    public h6c.b e;
    public h6c.d f;
    public IContainerDataService.c g;
    public lgc.a h;
    public h6d i;
    public final l7p j;
    public final zxj k;
    public final dyj l;
    public boolean n;
    public int m = -1;
    public int o = 10;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.h6c.c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            } else if (i != p2k.a(p2k.this)) {
                p2k.b(p2k.this, i);
                if (i == 0 && p2k.c(p2k.this) != null) {
                    p2k.c(p2k.this).c("newDetail");
                    p2k.c(p2k.this).c("dressup");
                    p2k.c(p2k.this).c(fnm.TARGET_TYPE_LITE_DETAIL);
                }
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/nextpageoptimizeservice/impl/preload/NextPagePreLoader$3");
        }

        @Override // tb.m47, tb.h6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            } else if (p2k.d(p2k.this) != null && p2k.i(p2k.this) != null) {
                p2k.d(p2k.this).a(p2k.i(p2k.this).getContainerData());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements h6c.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.h6c.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94ec7ab1", new Object[]{this});
            } else {
                p2k.j(p2k.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements h6c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.h6c.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            } else {
                p2k.j(p2k.this);
            }
        }

        @Override // tb.h6c.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements lgc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.lgc.a
        public void e(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66994eec", new Object[]{this, viewHolder});
                return;
            }
            fve.e("NextPagePreLoader", "onItemAddFinished preload");
            if (p2k.c(p2k.this) != null) {
                p2k.c(p2k.this).c("newDetail");
                p2k.c(p2k.this).c(fnm.TARGET_TYPE_LITE_DETAIL);
                p2k.c(p2k.this).c("dressup");
            }
        }

        @Override // tb.lgc.a
        public void f(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe53713a", new Object[]{this, viewHolder});
            }
        }

        @Override // tb.lgc.a
        public void g(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6bd58c33", new Object[]{this, viewHolder});
            } else {
                fve.e("NextPagePreLoader", "onItemRemoveFinished preload");
            }
        }

        @Override // tb.lgc.a
        public void k(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38fae81", new Object[]{this, viewHolder});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25839a;

        public g(String str) {
            this.f25839a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SharedPreferences e = ulp.c(Globals.getApplication()).e();
            if (e != null) {
                SharedPreferences.Editor edit = e.edit();
                edit.putString(i2b.KEY_ND_LOW_FEATURE_LIST, this.f25839a);
                edit.apply();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25840a;

        public h(String str) {
            this.f25840a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SharedPreferences e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f25840a.equals(p2k.k()) && (e = ulp.c(Globals.getApplication()).e()) != null) {
                SharedPreferences.Editor edit = e.edit();
                edit.putString("clientAbNdAnimFeatureList", this.f25840a);
                edit.apply();
                p2k.l(this.f25840a);
            }
        }
    }

    static {
        t2o.a(491782414);
    }

    public p2k(cfc cfcVar) {
        IMainFeedsViewService<?> iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.f25832a = iMainFeedsViewService;
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.b = iContainerDataService;
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.c = iMainLifecycleService;
        if (!ObjectUtils.a(iMainFeedsViewService, iContainerDataService, iMainLifecycleService)) {
            fve.e("NextPagePreLoader", "mMainFeedsViewService || mContainerDataService || mMainLifecycleService is null");
            return;
        }
        this.j = new l7p(cfcVar);
        this.k = new zxj();
        this.l = new dyj();
        v();
        y();
        x();
        w();
    }

    public static /* synthetic */ int a(p2k p2kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2675c84c", new Object[]{p2kVar})).intValue();
        }
        return p2kVar.m;
    }

    public static /* synthetic */ int b(p2k p2kVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb12a77b", new Object[]{p2kVar, new Integer(i)})).intValue();
        }
        p2kVar.m = i;
        return i;
    }

    public static /* synthetic */ l7p c(p2k p2kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l7p) ipChange.ipc$dispatch("65212af8", new Object[]{p2kVar});
        }
        return p2kVar.j;
    }

    public static /* synthetic */ zxj d(p2k p2kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxj) ipChange.ipc$dispatch("58191ddc", new Object[]{p2kVar});
        }
        return p2kVar.k;
    }

    public static /* synthetic */ void e(p2k p2kVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad82a5f", new Object[]{p2kVar, iContainerDataModel});
        } else {
            p2kVar.E(iContainerDataModel);
        }
    }

    public static /* synthetic */ int f(p2k p2kVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0c59bf7", new Object[]{p2kVar, new Integer(i)})).intValue();
        }
        p2kVar.o = i;
        return i;
    }

    public static /* synthetic */ boolean g(p2k p2kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e3298f8", new Object[]{p2kVar, new Boolean(z)})).booleanValue();
        }
        p2kVar.n = z;
        return z;
    }

    public static /* synthetic */ dyj h(p2k p2kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dyj) ipChange.ipc$dispatch("96dcb467", new Object[]{p2kVar});
        }
        return p2kVar.l;
    }

    public static /* synthetic */ IContainerDataService i(p2k p2kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService) ipChange.ipc$dispatch("5ddfb032", new Object[]{p2kVar});
        }
        return p2kVar.b;
    }

    public static /* synthetic */ void j(p2k p2kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b2e061", new Object[]{p2kVar});
        } else {
            p2kVar.u();
        }
    }

    public static /* synthetic */ String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c30efe0", new Object[0]);
        }
        return p;
    }

    public static /* synthetic */ String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("198ae514", new Object[]{str});
        }
        p = str;
        return str;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10935563", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f25832a;
        if (iMainFeedsViewService == null) {
            fve.e("NextPagePreLoader", "unRegisterOnScrollListener mMainFeedsViewService is null");
            return;
        }
        h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
        h6c.c<ViewGroup> cVar = this.d;
        if (cVar != null) {
            lifeCycleRegister.v(cVar);
            this.d = null;
        }
        h6c.b bVar = this.e;
        if (bVar != null) {
            lifeCycleRegister.k(bVar);
            this.e = null;
        }
        h6c.d dVar = this.f;
        if (dVar != null) {
            lifeCycleRegister.s(dVar);
            this.f = null;
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0db2f5a", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService == null) {
            fve.e("NextPagePreLoader", "unRegisterPageLifeCycleListener mMainLifecycleService is null");
        } else if (this.i != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.i);
            this.i = null;
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            fve.e("NextPagePreLoader", "unRegisterRequestListener mContainerDataService is null");
            return;
        }
        IContainerDataService.c cVar = this.g;
        if (cVar != null) {
            iContainerDataService.removeRequestListener(cVar);
            this.g = null;
        }
    }

    public final void D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c49645", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            fve.e("NextPagePreLoader", "updateNdAnimFeatureList homeGlobalAbTest == null");
        } else {
            String string = jSONObject.getString("clientAbNdAnimFeatureList");
            if (string != null) {
                whs.c(string);
                get.a().e(new h(string));
            }
        }
    }

    public final void E(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef492df", new Object[]{this, iContainerDataModel});
            return;
        }
        JSONObject t = t(iContainerDataModel);
        F(t);
        D(t);
    }

    public final void F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c41dbaa", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            fve.e("NextPagePreLoader", "updateNdLowFeatureList homeGlobalAbTest == null");
        } else {
            String string = jSONObject.getString(i2b.KEY_ND_LOW_FEATURE_LIST);
            if (string != null) {
                whs.d(string);
                get.a().e(new g(string));
            }
        }
    }

    public final h6c.c<ViewGroup> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("9fa113f9", new Object[]{this});
        }
        return new a();
    }

    public final h6c.d n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.d) ipChange.ipc$dispatch("930d2209", new Object[]{this});
        }
        return new d();
    }

    public final h6c.b o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.b) ipChange.ipc$dispatch("a8a36fe", new Object[]{this});
        }
        return new e();
    }

    public final lgc.a p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgc.a) ipChange.ipc$dispatch("837ca797", new Object[]{this});
        }
        return new f();
    }

    public final h6d q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new c();
    }

    public final IContainerDataService.c r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new b();
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        A();
        C();
        B();
        z();
    }

    public final JSONObject t(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91e03649", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            fve.e("NextPagePreLoader", "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e("NextPagePreLoader", "baseData == null");
            return null;
        }
        JSONObject ext = base.getExt();
        if (ext != null) {
            return ext.getJSONObject("homeGlobalABTest");
        }
        fve.e("NextPagePreLoader", "ext == null");
        return null;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3b860d", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f25832a;
        if (iMainFeedsViewService == null) {
            fve.e("NextPagePreLoader", "registerFeedsListener mMainFeedsViewService is null");
            return;
        }
        h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
        h6c.c<ViewGroup> m = m();
        this.d = m;
        lifeCycleRegister.h(m);
        h6c.b o = o();
        this.e = o;
        lifeCycleRegister.M(o);
        h6c.d n = n();
        this.f = n;
        lifeCycleRegister.i(n);
    }

    public final void w() {
        h6c lifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc06534", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f25832a;
        if (iMainFeedsViewService != null && (lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister()) != null) {
            lgc.a p2 = p();
            this.h = p2;
            lifeCycleRegister.x(p2);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171cc6f3", new Object[]{this});
        } else if (this.c == null) {
            fve.e("NextPagePreLoader", "registerPageLifeCycleListener mMainLifecycleService is null");
        } else {
            this.i = q();
            this.c.getPageLifeCycleRegister().a(this.i);
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2910fc7", new Object[]{this});
        } else if (this.b == null) {
            fve.e("NextPagePreLoader", "registerRequestListener mContainerDataService is null");
        } else {
            IContainerDataService.c r = r();
            this.g = r;
            this.b.addRequestListener(r);
        }
    }

    public final void z() {
        h6c lifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b7cf6d", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f25832a;
        if (iMainFeedsViewService != null && this.h != null && (lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister()) != null) {
            lifeCycleRegister.n(this.h);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (p2k.d(p2k.this) != null) {
                p2k.e(p2k.this, iContainerDataModel);
                if (TextUtils.equals(str, Constant.KEY_PAGEBACK) && Login.checkSessionValid() && p2k.c(p2k.this) != null) {
                    p2k.c(p2k.this).c("newDetail");
                    p2k.c(p2k.this).c(fnm.TARGET_TYPE_LITE_DETAIL);
                }
                if (iContainerDataModel != null && iContainerDataModel.getBase() != null) {
                    boolean equals = TextUtils.equals(str, "coldStart");
                    if (!equals || !mve.a("enableColdStartPreRequestND", true)) {
                        p2k.f(p2k.this, 10);
                    } else {
                        p2k.f(p2k.this, 0);
                    }
                    p2k.g(p2k.this, !equals);
                    p2k.h(p2k.this).b(iContainerDataModel);
                    p2k.d(p2k.this).b(iContainerDataModel);
                }
            }
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0f2769", new Object[]{this});
            return;
        }
        boolean b2 = h93.b(this.f25832a);
        fve.e("NextPagePreLoader", "onDataChangeLayoutFinish: coldStartNumber: " + this.o + " isAllowDataChangePreLoad: " + this.n + " isCacheCard: " + b2);
        int i = this.o;
        if ((i < 2 || this.n) && !b2) {
            this.o = i + 1;
            fve.e("NextPagePreLoader", "onDataChangeLayoutFinish preLoadNewDetailOnScreen");
            l7p l7pVar = this.j;
            if (l7pVar != null) {
                l7pVar.c("newDetail");
                this.j.c(fnm.TARGET_TYPE_LITE_DETAIL);
                this.j.c("dressup");
            }
        }
    }
}
