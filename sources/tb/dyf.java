package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dyf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f18150a;
    public h6d b;
    public IDxItemClickService.a c;
    public IContainerDataService.a d;
    public IContainerDataService.c e;
    public final uyo f;
    public final IMainLifecycleService g;
    public final IDxItemClickService h;
    public final IContainerDataService<?> i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/jump2banner/impl/JumpToBanner$1");
        }

        @Override // tb.m47, tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else if (!dyf.a(dyf.this)) {
                dyf.b(dyf.this, 500);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            } else {
                dyf.c(dyf.this, w1eVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            } else {
                dyf.c(dyf.this, w1eVar);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements IDxItemClickService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
        public void click(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1596985", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            } else {
                dyf.e(dyf.this).g(e83.a(baseSectionModel, ul4.d(dyf.d(dyf.this))));
            }
        }
    }

    static {
        t2o.a(491782404);
    }

    public dyf(cfc cfcVar) {
        this.f18150a = cfcVar;
        this.g = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.h = (IDxItemClickService) cfcVar.a(IDxItemClickService.class);
        this.i = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.f = new uyo(cfcVar);
        o();
    }

    public static /* synthetic */ boolean a(dyf dyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ed5f1de", new Object[]{dyfVar})).booleanValue();
        }
        return dyfVar.k();
    }

    public static /* synthetic */ void b(dyf dyfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c62126a", new Object[]{dyfVar, new Integer(i)});
        } else {
            dyfVar.n(i);
        }
    }

    public static /* synthetic */ void c(dyf dyfVar, w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158653e8", new Object[]{dyfVar, w1eVar});
        } else {
            dyfVar.m(w1eVar);
        }
    }

    public static /* synthetic */ cfc d(dyf dyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("bbc7cae7", new Object[]{dyfVar});
        }
        return dyfVar.f18150a;
    }

    public static /* synthetic */ uyo e(dyf dyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uyo) ipChange.ipc$dispatch("f55fb59b", new Object[]{dyfVar});
        }
        return dyfVar.f;
    }

    public final IContainerDataService.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new b();
    }

    public final IDxItemClickService.a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDxItemClickService.a) ipChange.ipc$dispatch("59b16f42", new Object[]{this});
        }
        return new d();
    }

    public final IContainerDataService.c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("7d4f9901", new Object[]{this});
        }
        return new c();
    }

    public final h6d i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new a();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        p();
        get.a().k(this.f);
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94fcd2c4", new Object[]{this})).booleanValue();
        }
        return mve.a("homePageBackRequestEnable", true);
    }

    public final void m(w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8587c90", new Object[]{this, w1eVar});
        } else if (k() && w1eVar != null && w1eVar.b().contains(Constant.KEY_PAGEBACK)) {
            n(250);
        }
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("247bc009", new Object[]{this, new Integer(i)});
        } else if (!l(this.f18150a)) {
            fve.e("JumpToBanner", "自动滚动到首焦开关关闭，不执行");
            this.f.e();
        } else {
            get.a().k(this.f);
            get.a().f(this.f, i);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
        } else if (this.g != null && this.h != null && this.i != null) {
            this.b = i();
            this.g.getPageLifeCycleRegister().a(this.b);
            IDxItemClickService.a g = g();
            this.c = g;
            this.h.addDxItemClickListener(g);
            IContainerDataService.a f = f();
            this.d = f;
            this.i.addDataProcessListener(f);
            IContainerDataService.c h = h();
            this.e = h;
            this.i.addRequestListener(h);
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761571b7", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.g;
        if (iMainLifecycleService != null && this.h != null && this.i != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.b);
            this.h.removeDxItemClickListener(this.c);
            this.i.removeDataProcessListener(this.d);
            this.i.removeRequestListener(this.e);
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    public final boolean l(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52bc266a", new Object[]{this, cfcVar})).booleanValue();
        }
        JSONObject c2 = ul4.c(cfcVar);
        if (c2 == null || !c2.getBooleanValue("enableBackHomeScrollToBanner")) {
            fve.e("JumpToBanner", "服务端开关未开");
            return false;
        } else if (ul4.e(cfcVar)) {
            fve.e("JumpToBanner", "数据过期，不执行");
            return false;
        } else if (!this.f.c()) {
            fve.e("JumpToBanner", "任务自检，不执行");
            return false;
        } else {
            IIconBackGuideAnimeService iIconBackGuideAnimeService = (IIconBackGuideAnimeService) cfcVar.a(IIconBackGuideAnimeService.class);
            if (iIconBackGuideAnimeService == null || !iIconBackGuideAnimeService.currentBackWithAnim()) {
                return true;
            }
            fve.e("JumpToBanner", "有轻应用回退动画，不执行");
            return false;
        }
    }
}
