package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class son {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SUB_CONTAINER_TYPE = "recommend";

    /* renamed from: a  reason: collision with root package name */
    public final fdc f28186a;
    public final String b;
    public final IHomeSubTabController c;
    public rvk d;
    public IHomeSubTabController e;
    public String f;
    public final IHomeDataService g;
    public final wcc h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements rvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.rvk
        public void a(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a163b5e6", new Object[]{this, imnVar, jSONObject, str});
            }
        }

        @Override // tb.rvk
        public void b(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0e63fb7", new Object[]{this, imnVar, jSONObject, str});
                return;
            }
            if (jSONObject != null && "coldStart".equals(jSONObject.getString("requestType"))) {
                waj.x = true;
                d9j.c("RecommendSwitchHelper", "冷启请求完成");
            }
            if (imnVar != null) {
                son.a(son.this, imnVar.u(str));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IContainerDataModel f28188a;

        public b(IContainerDataModel iContainerDataModel) {
            this.f28188a = iContainerDataModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!kbq.e(Globals.getApplication())) {
                if (son.b(son.this, this.f28188a)) {
                    str = "multiClass";
                } else {
                    str = "homeMainLand";
                }
                if (!TextUtils.equals(str, son.c(son.this))) {
                    qy8.b.g("multiClass", "multiClass", TextUtils.equals("multiClass", str));
                    son.d(son.this, str);
                    son.e(son.this).onDestroy();
                    son.f(son.this, null);
                    son sonVar = son.this;
                    son.f(sonVar, son.g(sonVar, this.f28188a));
                    IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
                    if (iHomeViewService != null) {
                        iHomeViewService.reRenderItem(xti.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES);
                    }
                    bqa.d("RecommendSwitchHelper", "controller type changed: ".concat(str));
                    if (son.h(son.this)) {
                        son.e(son.this).onPageSelected();
                    }
                }
            }
        }
    }

    static {
        t2o.a(729809387);
    }

    public son(fdc fdcVar, String str, IHomeSubTabController iHomeSubTabController, wcc wccVar) {
        String str2;
        this.f28186a = fdcVar;
        this.b = str;
        this.c = iHomeSubTabController;
        this.g = (IHomeDataService) wccVar.a(IHomeDataService.class);
        this.h = wccVar;
        IContainerDataModel<?> o = o();
        if (o == null || o.getBase() == null) {
            fve.e("RecommendSwitchHelper", "containerDataModel is null");
        }
        if (r(o)) {
            str2 = "multiClass";
        } else {
            str2 = "homeMainLand";
        }
        this.f = str2;
        this.e = k(o);
        fve.e("RecommendSwitchHelper", "current controller type: " + this.f);
        i();
    }

    public static /* synthetic */ void a(son sonVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1313715c", new Object[]{sonVar, iContainerDataModel});
        } else {
            sonVar.j(iContainerDataModel);
        }
    }

    public static /* synthetic */ boolean b(son sonVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6d26161", new Object[]{sonVar, iContainerDataModel})).booleanValue();
        }
        return sonVar.r(iContainerDataModel);
    }

    public static /* synthetic */ String c(son sonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b49ca83", new Object[]{sonVar});
        }
        return sonVar.f;
    }

    public static /* synthetic */ String d(son sonVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c2fbdbb", new Object[]{sonVar, str});
        }
        sonVar.f = str;
        return str;
    }

    public static /* synthetic */ IHomeSubTabController e(son sonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("a13d96d", new Object[]{sonVar});
        }
        return sonVar.e;
    }

    public static /* synthetic */ IHomeSubTabController f(son sonVar, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("a0034fd8", new Object[]{sonVar, iHomeSubTabController});
        }
        sonVar.e = iHomeSubTabController;
        return iHomeSubTabController;
    }

    public static /* synthetic */ IHomeSubTabController g(son sonVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("cef28371", new Object[]{sonVar, iContainerDataModel});
        }
        return sonVar.k(iContainerDataModel);
    }

    public static /* synthetic */ boolean h(son sonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bbf79e", new Object[]{sonVar})).booleanValue();
        }
        return sonVar.p();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df75c02", new Object[]{this});
        } else if (this.d == null) {
            rvk l = l();
            this.d = l;
            IHomeDataService iHomeDataService = this.g;
            if (iHomeDataService != null) {
                iHomeDataService.addOnUiRefreshListener(l);
            }
        }
    }

    public final void j(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a79cf7", new Object[]{this, iContainerDataModel});
        } else {
            get.a().h(new b(iContainerDataModel));
        }
    }

    public final IHomeSubTabController k(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("4a578638", new Object[]{this, iContainerDataModel});
        }
        if (r(iContainerDataModel)) {
            return new uaj(this.f28186a, vaj.l(iContainerDataModel), this.c, this.h);
        }
        return new h1b(this.f28186a, this.b, this.c);
    }

    public final rvk l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rvk) ipChange.ipc$dispatch("8d198fc8", new Object[]{this});
        }
        return new a();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            w();
        }
    }

    public IHomeSubTabController n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("ae0b87e6", new Object[]{this});
        }
        return this.e;
    }

    public final IContainerDataModel<?> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataModel) ipChange.ipc$dispatch("3832339f", new Object[]{this});
        }
        z4a z4aVar = z4a.NEW_FACE_PARENT;
        imn d = zza.d(z4aVar.f32522a);
        if (d == null) {
            return null;
        }
        return d.u(z4aVar.f32522a);
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb30a61", new Object[]{this})).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.isAtRecommendTab();
        }
        return false;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43df7919", new Object[]{this})).booleanValue();
        }
        if (!u()) {
            return false;
        }
        IHomeSubTabController iHomeSubTabController = this.e;
        if (!(iHomeSubTabController instanceof uaj)) {
            return false;
        }
        return ((uaj) iHomeSubTabController).f();
    }

    public final boolean r(IContainerDataModel<?> iContainerDataModel) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f20428c", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getTotalData() == null || iContainerDataModel.getTotalData().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        bqa.d("RecommendSwitchHelper", "is empty data: " + z);
        if (z && !com.taobao.tao.topmultitab.service.controller.a.e()) {
            return qy8.b.b("multiClass", "multiClass", true);
        }
        if (vaj.l(iContainerDataModel) != null) {
            return true;
        }
        return false;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac9d0f5", new Object[]{this})).booleanValue();
        }
        if (!u()) {
            return false;
        }
        IHomeSubTabController iHomeSubTabController = this.e;
        if (!(iHomeSubTabController instanceof uaj)) {
            return false;
        }
        return ((uaj) iHomeSubTabController).g();
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c39968a7", new Object[]{this})).booleanValue();
        }
        if (!u()) {
            return false;
        }
        IHomeSubTabController iHomeSubTabController = this.e;
        if (!(iHomeSubTabController instanceof uaj)) {
            return false;
        }
        return ((uaj) iHomeSubTabController).h();
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0862e14", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("multiClass", this.f);
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b13f965", new Object[]{this})).booleanValue();
        }
        if (!u()) {
            return false;
        }
        IHomeSubTabController iHomeSubTabController = this.e;
        if (!(iHomeSubTabController instanceof uaj)) {
            return false;
        }
        return ((uaj) iHomeSubTabController).a();
    }

    public final void w() {
        IHomeDataService iHomeDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed0acbf", new Object[]{this});
            return;
        }
        rvk rvkVar = this.d;
        if (rvkVar != null && (iHomeDataService = this.g) != null) {
            iHomeDataService.removeOnUiRefreshListener(rvkVar);
        }
    }
}
