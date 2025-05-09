package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.searchbar.impl.bgview.HomeSearchBarBgView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IHomePageLifecycleService f16758a;
    public final HomeSearchBarBgView b;
    public uwc c;
    public hqk d;
    public kkc e;
    public boolean f;
    public String g = "recommend_recommend";
    public final IHomeDataService h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.c0p$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0887a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kkc f16760a;

            public RunnableC0887a(kkc kkcVar) {
                this.f16760a = kkcVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c0p.e(c0p.this).updateBgView(this.f16760a);
                }
            }
        }

        public a() {
        }

        @Override // tb.hqk
        public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a114a6e", new Object[]{this, jSONObject, iContainerDataModel, str});
            } else if (c0p.a(c0p.this)) {
                fve.e("SearchBarBgObserver", "切tab时，开关是关的");
            } else {
                kkc a2 = w0p.a(iContainerDataModel, c0p.b(c0p.this));
                if (a2 != null) {
                    fve.e("SearchBarBgObserver", "请求回来更新");
                    c0p.d(c0p.this, a2);
                    m5a.a().i(new RunnableC0887a(a2));
                }
            }
        }

        @Override // tb.hqk
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c0a53b0", new Object[]{this, jSONObject, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements uwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.uwc
        public void selectMultiTab(String str, kkc kkcVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca4828d0", new Object[]{this, str, kkcVar, new Integer(i)});
            } else if (kkcVar == null) {
                fve.e("SearchBarBgObserver", "切tab时，tab数据为空");
            } else if (c0p.a(c0p.this)) {
                fve.e("SearchBarBgObserver", "切tab时当前 不允许使用native背景层");
            } else {
                c0p.d(c0p.this, kkcVar);
                c0p.c(c0p.this, str);
                fve.e("SearchBarBgObserver", "selectTab 更新背景");
                c0p.e(c0p.this).updateBgView(kkcVar);
            }
        }
    }

    static {
        t2o.a(729810329);
    }

    public c0p(IHomeDataService iHomeDataService, IHomePageLifecycleService iHomePageLifecycleService, HomeSearchBarBgView homeSearchBarBgView) {
        this.f16758a = iHomePageLifecycleService;
        this.b = homeSearchBarBgView;
        this.h = iHomeDataService;
        k(iHomePageLifecycleService);
        j();
    }

    public static /* synthetic */ boolean a(c0p c0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("588665b5", new Object[]{c0pVar})).booleanValue();
        }
        return c0pVar.f;
    }

    public static /* synthetic */ String b(c0p c0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f43ebb10", new Object[]{c0pVar});
        }
        return c0pVar.g;
    }

    public static /* synthetic */ String c(c0p c0pVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c848688", new Object[]{c0pVar, str});
        }
        c0pVar.g = str;
        return str;
    }

    public static /* synthetic */ kkc d(c0p c0pVar, kkc kkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kkc) ipChange.ipc$dispatch("6399fedb", new Object[]{c0pVar, kkcVar});
        }
        c0pVar.e = kkcVar;
        return kkcVar;
    }

    public static /* synthetic */ HomeSearchBarBgView e(c0p c0pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeSearchBarBgView) ipChange.ipc$dispatch("9d0da493", new Object[]{c0pVar});
        }
        return c0pVar.b;
    }

    public final hqk f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hqk) ipChange.ipc$dispatch("656f8d08", new Object[]{this});
        }
        return new a();
    }

    public final uwc g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uwc) ipChange.ipc$dispatch("105398dc", new Object[]{this});
        }
        return new b();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        m();
        l();
    }

    public final boolean i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfd9f223", new Object[]{this, jSONObject})).booleanValue();
        }
        return !w0p.e(jSONObject);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905864fe", new Object[]{this});
        } else if (this.h != null) {
            hqk f = f();
            this.d = f;
            this.h.addDataProcessListener(f);
        }
    }

    public final void k(IHomePageLifecycleService iHomePageLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28449d1d", new Object[]{this, iHomePageLifecycleService});
        } else if (iHomePageLifecycleService == null) {
            fve.e("SearchBarBgObserver", "lifeCycleManager == null");
        } else {
            this.c = g();
            iHomePageLifecycleService.getTabLifeCycleRegister().b(this.c);
        }
    }

    public final void l() {
        hqk hqkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a16cd65", new Object[]{this});
            return;
        }
        IHomeDataService iHomeDataService = this.h;
        if (iHomeDataService != null && (hqkVar = this.d) != null) {
            iHomeDataService.removeDataProcessListener(hqkVar);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe4d38c", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = this.f16758a;
        if (iHomePageLifecycleService == null || this.c == null) {
            fve.e("SearchBarBgObserver", "mLifeCycleManager == null || mTabLifeCycle == null");
        } else {
            iHomePageLifecycleService.getTabLifeCycleRegister().a(this.c);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dadc00", new Object[]{this});
            return;
        }
        kkc kkcVar = this.e;
        if (kkcVar != null && !this.f) {
            this.b.updateBgView(kkcVar);
            fve.e("SearchBarBgObserver", "氛围变化，更新背景");
        }
    }

    public void n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4024a7", new Object[]{this, jSONObject});
            return;
        }
        boolean i = i(jSONObject);
        this.f = i;
        if (i) {
            this.b.setVisibility(8);
            fve.e("SearchBarBgObserver", "搜索栏数据更新时，开关为空");
            return;
        }
        kkc b2 = w0p.b();
        if (b2 != null) {
            fve.e("SearchBarBgObserver", "updateDefaultBgView");
            this.b.setVisibility(0);
            this.b.updateBgView(b2);
        }
    }
}
