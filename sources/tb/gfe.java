package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gfe implements qdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ffe f19947a;
    public final IContainerDataService<?> b;
    public final IMainLifecycleService c;
    public h6d d;
    public IContainerDataService.a e;
    public IContainerDataService.c f;
    public String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            } else if (w1eVar != null && TextUtils.equals(str, Constant.KEY_PAGEBACK)) {
                if (!(gfe.a(gfe.this) == null || gfe.c(gfe.this) == null)) {
                    gfe.c(gfe.this).c();
                }
                gfe.b(gfe.this, w1eVar.b());
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            } else if (w1eVar != null && TextUtils.equals(str3, Constant.KEY_PAGEBACK) && TextUtils.equals(gfe.a(gfe.this), w1eVar.b())) {
                gfe.d(gfe.this, true);
                gfe.b(gfe.this, null);
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
                return;
            }
            if (iContainerDataModel != null && gfe.e(gfe.this, iContainerDataModel.getBase())) {
                gfe.d(gfe.this, true);
            }
            if (w1eVar != null && TextUtils.equals(gfe.a(gfe.this), w1eVar.b())) {
                gfe.d(gfe.this, false);
                gfe.b(gfe.this, null);
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconbackanimeservice/impl/base/IconBackGuideAnimeProcess$3");
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
            }
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
            } else if (gfe.c(gfe.this) != null) {
                gfe.c(gfe.this).b();
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

    static {
        t2o.a(491782382);
        t2o.a(491782364);
    }

    public gfe(cfc cfcVar, Context context, dfp dfpVar) {
        this.b = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.c = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        ffe ffeVar = new ffe(cfcVar, dfpVar);
        this.f19947a = ffeVar;
        ffeVar.o(context);
        l();
        k();
    }

    public static /* synthetic */ String a(gfe gfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a206f289", new Object[]{gfeVar});
        }
        return gfeVar.g;
    }

    public static /* synthetic */ String b(gfe gfeVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a5c787d", new Object[]{gfeVar, str});
        }
        gfeVar.g = str;
        return str;
    }

    public static /* synthetic */ ffe c(gfe gfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ffe) ipChange.ipc$dispatch("afba74c4", new Object[]{gfeVar});
        }
        return gfeVar.f19947a;
    }

    public static /* synthetic */ void d(gfe gfeVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a054857b", new Object[]{gfeVar, new Boolean(z)});
        } else {
            gfeVar.o(z);
        }
    }

    public static /* synthetic */ boolean e(gfe gfeVar, IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d81a44b", new Object[]{gfeVar, iContainerInnerDataModel})).booleanValue();
        }
        return gfeVar.j(iContainerInnerDataModel);
    }

    @Override // tb.qdc
    public boolean currentBackWithAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c43feb22", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final IContainerDataService.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("c60a3cef", new Object[]{this});
        }
        return new b();
    }

    public final h6d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new c();
    }

    public final IContainerDataService.c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new a();
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff78ced", new Object[]{this})).booleanValue();
        }
        return mve.a("enablePlayIconBackAnimeService", true);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff3b0c8", new Object[]{this});
            return;
        }
        if (this.e == null) {
            this.e = f();
        }
        if (this.f == null) {
            this.f = h();
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService != null) {
            iContainerDataService.addRequestListener(this.f);
            this.b.addDataProcessListener(this.e);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db05203f", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = g();
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService != null) {
            iMainLifecycleService.getPageLifeCycleRegister().a(this.d);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fc98a9", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService != null) {
            IContainerDataService.a aVar = this.e;
            if (aVar != null) {
                iContainerDataService.removeDataProcessListener(aVar);
            }
            IContainerDataService.c cVar = this.f;
            if (cVar != null) {
                this.b.removeRequestListener(cVar);
            }
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9bdc0e", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService != null && this.d != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.d);
        }
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9532d311", new Object[]{this, new Boolean(z)});
            return;
        }
        ffe ffeVar = this.f19947a;
        if (ffeVar != null) {
            try {
                ffeVar.n(z);
            } catch (Throwable th) {
                this.f19947a.c();
                fve.e("IconAnimeServiceImpl", "trigger Anime error" + th.toString());
            }
        }
    }

    @Override // tb.qdc
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ffe ffeVar = this.f19947a;
        if (ffeVar != null) {
            ffeVar.c();
            this.f19947a.e();
        }
        n();
        m();
    }

    @Override // tb.qdc
    public void onOutLinkTrigger(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23a8fd", new Object[]{this, str, intent});
        } else if (i() && !TextUtils.isEmpty(str) && this.f19947a != null) {
            try {
                this.f19947a.m(JSON.parseObject(str));
            } catch (Throwable unused) {
                fve.e("IconAnimeServiceImpl", "Illegal params:" + str);
            }
        }
    }

    @Override // tb.qdc
    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
            return;
        }
        ffe ffeVar = this.f19947a;
        if (ffeVar != null) {
            ffeVar.o(context);
        }
    }

    public final boolean j(IContainerInnerDataModel<?> iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe0fbbf2", new Object[]{this, iContainerInnerDataModel})).booleanValue();
        }
        if (iContainerInnerDataModel == null || iContainerInnerDataModel.getExt() == null) {
            fve.e("IconAnimeServiceImpl", "isNeedUpdateSplashData->   baseData == null");
            return false;
        }
        boolean booleanValue = iContainerInnerDataModel.getExt().getBooleanValue("updateTopview");
        if (!booleanValue) {
            fve.e("IconAnimeServiceImpl", "isNeedUpdateSplashData, updateTopview is false, no need update splash data.");
        } else {
            fve.e("IconAnimeServiceImpl", "isNeedUpdateSplashData, updateTopview is true, need update splash data.");
        }
        return booleanValue;
    }
}
