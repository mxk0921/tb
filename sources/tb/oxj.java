package tb;

import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.volume.VolumeChangeManager;
import com.taobao.android.detail2.core.framework.base.weex.DetailWeexContainer;
import com.taobao.android.detail2.core.framework.base.windvane.NewDetailWVLocalWeexBranch;
import com.taobao.android.detail2.core.framework.base.windvane.NewDetailWVPlugin;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.global.setting.SettingStateWVApiPlugin;
import com.taobao.live.timemove.weex.TBLivePlatformView;
import com.taobao.livephoto.weex.LivePhotoWeexView;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.dh7;
import tb.r19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dh7 f25725a;
    public final DetailDataManager b;
    public final ucp c;
    public final VolumeChangeManager d;
    public final List<sxj> e = new ArrayList();
    public final cxj f;
    public nxj g;
    public boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends r19.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailInstance$1");
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "initWindVane";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (!r19.m(oxj.a(oxj.this).i())) {
                oxj.b(oxj.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends ja7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailInstance$2");
        }

        @Override // tb.ja7
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "initWindVane";
        }

        @Override // tb.ja7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else {
                oxj.b(oxj.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends r19.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailInstance$3");
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "PltMusModuleUtils.initModules";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (!r19.m(oxj.a(oxj.this).i())) {
                s7m.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends ja7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailInstance$4");
        }

        @Override // tb.ja7
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "PltMusModuleUtils.initModules";
        }

        @Override // tb.ja7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
                return;
            }
            try {
                s7m.a();
            } catch (Exception e) {
                txj.f("new_detail异常", "拍立淘初始化失败", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends r19.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f25728a;

        public e() {
            int i;
            if (NavBarViewManager.H(oxj.c(oxj.this).o())) {
                i = r19.c0("atm_high_delay", 850);
            } else {
                i = r19.c0("atm_delay_time", -1);
            }
            this.f25728a = i;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailInstance$5");
        }

        @Override // tb.r19.e
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ac3af443", new Object[]{this})).intValue();
            }
            return this.f25728a;
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "mDetailViewEngine.renderAtmosView";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (!r19.y0() && !r19.m(oxj.a(oxj.this).i())) {
                oxj.d(oxj.this).I0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f extends ja7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/NewDetailInstance$6");
        }

        @Override // tb.ja7
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "mDetailViewEngine.renderAtmosView";
        }

        @Override // tb.ja7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else {
                oxj.d(oxj.this).I0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface g {
        void a();

        void b(VerticalAbsViewHolder verticalAbsViewHolder, JSONObject jSONObject, String str);

        void c(VerticalAbsViewHolder verticalAbsViewHolder, JSONObject jSONObject);
    }

    static {
        t2o.a(352321594);
    }

    public oxj(bxj bxjVar, FrameLayout frameLayout, Intent intent, vxj vxjVar, String str, String str2) {
        new HashMap();
        String e2 = nyj.z().e(str2, "createNdInstance");
        nyj.z().d(str2, "createNdContext", e2);
        cxj cxjVar = new cxj(bxjVar, intent);
        this.f = cxjVar;
        nyj.z().t(str2, "createNdContext", true, e2);
        nyj.z().d(str2, "instanceStage01", e2);
        if (vxjVar != null) {
            cxjVar.A(vxjVar);
        }
        cxjVar.w(str);
        VolumeChangeManager volumeChangeManager = new VolumeChangeManager(cxjVar);
        this.d = volumeChangeManager;
        dh7 dh7Var = new dh7(cxjVar, frameLayout, volumeChangeManager);
        this.f25725a = dh7Var;
        DetailDataManager detailDataManager = new DetailDataManager(cxjVar);
        this.b = detailDataManager;
        if (cxjVar.j().N().u()) {
            this.c = new ucp(cxjVar, dh7Var, detailDataManager);
        }
        t();
        s();
        nyj.z().t(str2, "instanceStage01", true, e2);
        nyj.z().d(str2, "instanceStage02", e2);
        if (r19.S0("fast_key_delay_init_wind_vane")) {
            r19.d(new a());
        } else if (vxjVar != null) {
            vxjVar.b(new b());
        } else {
            u();
        }
        r(dh7Var);
        je7.a(bxjVar);
        Iterator it = ((ArrayList) axj.f16059a).iterator();
        while (it.hasNext()) {
            ((zwj) it.next()).a(this);
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this.f.i());
        if (!zgj.f) {
            MUSEngine.registerPlatformView("tblivevideox", TBLivePlatformView.class);
            MUSEngine.registerPlatformView("livephotoview", LivePhotoWeexView.class);
            zgj.f = true;
        }
        if (!TextUtils.isEmpty(o().R().r)) {
            UTAnalytics.getInstance().getDefaultTracker().addTPKCache(wll.ALI_TRACK_ID, o().R().r);
        }
        if (r19.S0("fast_key_delay_init_plt_mus")) {
            r19.d(new c());
        } else if (this.f.l() != null) {
            this.f.l().b(new d());
        } else {
            try {
                s7m.a();
            } catch (Exception e3) {
                txj.f("new_detail异常", "拍立淘初始化失败", e3);
            }
        }
        ftm b2 = itm.b("new_detail");
        if (b2 != null) {
            b2.s(byj.L(Global.getApplication()));
        }
        nyj.z().t(str2, "instanceStage02", true, e2);
        nyj.z().d(str2, "instanceTrace", e2);
        F(bxjVar);
        nyj.z().t(str2, "instanceTrace", true, e2);
        nyj.z().u(str2, e2, "createNdInstance", true);
    }

    public static /* synthetic */ cxj a(oxj oxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("2a41a443", new Object[]{oxjVar});
        }
        return oxjVar.f;
    }

    public static /* synthetic */ void b(oxj oxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac7f743", new Object[]{oxjVar});
        } else {
            oxjVar.u();
        }
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.global.a c(oxj oxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("ae169f96", new Object[]{oxjVar});
        }
        return oxjVar.o();
    }

    public static /* synthetic */ dh7 d(oxj oxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh7) ipChange.ipc$dispatch("9636e7d0", new Object[]{oxjVar});
        }
        return oxjVar.f25725a;
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81daf2fe", new Object[]{this, str});
            return;
        }
        o2r.a("NewDetailInstanceResume");
        cxj cxjVar = this.f;
        if (cxjVar != null && cxjVar.j().N().n()) {
            this.f.u();
        }
        dh7 dh7Var = this.f25725a;
        if (dh7Var != null) {
            dh7Var.K0(str);
        }
        if (str.equals("NewDetail")) {
            je7.b(this.f.h());
            je7.a(this.f.h());
            ucp ucpVar = this.c;
            if (ucpVar != null) {
                ucpVar.m();
            }
        }
        o2r.b();
        oqj.b(this.f);
    }

    public void C(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b1e1ef", new Object[]{this, new Long(j)});
            return;
        }
        DetailDataManager detailDataManager = this.b;
        if (detailDataManager != null) {
            detailDataManager.k0(j);
        }
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
            return;
        }
        dh7 dh7Var = this.f25725a;
        if (dh7Var != null) {
            dh7Var.S0(str);
        }
    }

    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbe7513", new Object[]{this, str});
            return;
        }
        dh7 dh7Var = this.f25725a;
        if (dh7Var != null) {
            dh7Var.U0(str);
        }
    }

    public final void F(bxj bxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676ea9ea", new Object[]{this, bxjVar});
            return;
        }
        int i = zgj.f32756a;
        zgj.f32756a = 1 + i;
        i(bxjVar, i, sut.a(zgj.b), SystemClock.uptimeMillis());
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c87170f7", new Object[]{this})).booleanValue();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            txj.e(txj.TAG_VIDEO_ZOOM, p() + " 回调非主线程, 不响应");
            return false;
        }
        x3w B = this.f25725a.B();
        if (B == null) {
            txj.e(txj.TAG_VIDEO_ZOOM, p() + " getCurrentDisplayNode为空, 不响应");
            return false;
        } else if (B.q()) {
            return true;
        } else {
            txj.e(txj.TAG_VIDEO_ZOOM, p() + " node.enableHalfScreenZoom为false, 不响应");
            return false;
        }
    }

    public void H(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf00a580", new Object[]{this, str, new Boolean(z)});
            return;
        }
        o2r.a("NewDetailInstanceNdResume");
        o2r.b();
    }

    public void e(sxj sxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb205a1", new Object[]{this, sxjVar});
        } else {
            this.e.add(sxjVar);
        }
    }

    public void f(pyj pyjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc67309", new Object[]{this, pyjVar});
        } else {
            this.f25725a.u(pyjVar);
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c0fe27", new Object[]{this})).booleanValue();
        }
        dh7 dh7Var = this.f25725a;
        if (dh7Var != null) {
            return dh7Var.w();
        }
        return false;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.f.j().N().z0()) {
            pqj.e(this.f.i());
        }
        nxj nxjVar = this.g;
        if (nxjVar != null) {
            nxjVar.a();
        }
        if (this.f.j().N().n()) {
            String q = q();
            String C = this.f.j().N().C();
            if (!TextUtils.isEmpty(C)) {
                q = C;
            }
            txj.e(txj.TAG_INSIDE_DETAIL, "initDetailListener 反注册详情半屏生命周期。" + q);
            vbf.b(q);
        }
        dh7 dh7Var = this.f25725a;
        if (dh7Var != null) {
            dh7Var.y();
        }
        DetailDataManager detailDataManager = this.b;
        if (detailDataManager != null) {
            detailDataManager.q();
        }
        el8.a(this.f.h(), this.f.j().B());
        je7.b(this.f.h());
        ucp ucpVar = this.c;
        if (ucpVar != null) {
            ucpVar.k();
        }
        VolumeChangeManager volumeChangeManager = this.d;
        if (volumeChangeManager != null) {
            volumeChangeManager.c();
        }
        NavPreRequestManager.l().j(o().G());
        txj.e(txj.TAG_RENDER, "NewDetailInstance: " + this + "destroy");
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ea06a42", new Object[]{this})).booleanValue();
        }
        x3w B = this.f25725a.B();
        if (B != null && B.q()) {
            return true;
        }
        return false;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("591f1860", new Object[]{this})).booleanValue();
        }
        return o().x0();
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58ffa211", new Object[]{this})).booleanValue();
        }
        return o().l();
    }

    public List<DetailWeexContainer> m() {
        VerticalAbsViewHolder D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dd65fec2", new Object[]{this});
        }
        dh7 dh7Var = this.f25725a;
        if (dh7Var == null || (D = dh7Var.D()) == null) {
            return null;
        }
        return D.C0();
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9103f5ad", new Object[]{this});
        }
        dh7 dh7Var = this.f25725a;
        if (dh7Var != null) {
            return dh7Var.F();
        }
        return "NewDetail";
    }

    public final com.taobao.android.detail2.core.framework.data.global.a o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.f.j();
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.f.j().B();
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85fa2a19", new Object[]{this});
        }
        return this.f.j().B();
    }

    public final void r(dh7 dh7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df485803", new Object[]{this, dh7Var});
            return;
        }
        cxj cxjVar = this.f;
        if (cxjVar != null && cxjVar.j().N().n()) {
            this.g = new nxj(this, dh7Var);
            String q = q();
            String C = this.f.j().N().C();
            if (!TextUtils.isEmpty(C)) {
                q = C;
            }
            txj.e(txj.TAG_INSIDE_DETAIL, "initDetailListener 注册详情半屏生命周期。" + q);
            vbf.a(q, this.g);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6686f1", new Object[]{this});
            return;
        }
        el8.b(this.f.h(), this.f.j().B(), kk8.a(cjp.class, ""), new gkp(this.f.i()));
        el8.b(this.f.h(), this.f.j().B(), kk8.a(pip.class, ""), new qip(this.f.i()));
        el8.b(this.f.h(), this.f.j().B(), kk8.a(g5l.class, ""), new n5l(Global.getApplication()));
        el8.b(this.f.h(), this.f.j().B(), kk8.a(ttv.class, ""), new euv(this.f25725a.a0()));
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e00f1a0", new Object[]{this});
            return;
        }
        cxj cxjVar = this.f;
        dh7 dh7Var = this.f25725a;
        dh7Var.F0(new tcf(cxjVar, dh7Var, this.b));
        dh7 dh7Var2 = this.f25725a;
        dh7Var2.G0(new ncf(this, dh7Var2));
        cxj cxjVar2 = this.f;
        dh7 dh7Var3 = this.f25725a;
        dh7Var3.E0(new ucf(cxjVar2, dh7Var3, this.b, this.e));
        cxj cxjVar3 = this.f;
        dh7 dh7Var4 = this.f25725a;
        DetailDataManager detailDataManager = this.b;
        detailDataManager.f0(new scf(cxjVar3, dh7Var4, detailDataManager));
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c242e81", new Object[]{this});
            return;
        }
        fsw.h(NewDetailWVPlugin.NAME, NewDetailWVPlugin.class);
        fsw.h(NewDetailWVLocalWeexBranch.NAME, NewDetailWVLocalWeexBranch.class);
        fsw.h("TBMyTaobaoSettingStateWVApiPlugin", SettingStateWVApiPlugin.class);
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("838183ea", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return this.f.j().t0();
        }
        return false;
    }

    public void w(dh7.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d1fd1f", new Object[]{this, jVar});
        } else if (G()) {
            this.f25725a.v0(jVar);
        }
    }

    public void x(String str, dh7.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a871bad", new Object[]{this, str, jVar});
        } else if (G()) {
            this.f25725a.w0(str, jVar);
        }
    }

    public void y(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5a4fad", new Object[]{this, str, new Boolean(z)});
            return;
        }
        o().b1(true);
        dh7 dh7Var = this.f25725a;
        if (dh7Var != null) {
            dh7Var.x0(str, z, this.h);
        }
        if (this.c != null && str.equals("NewDetail")) {
            this.c.l();
        }
        cxj cxjVar = this.f;
        if (cxjVar != null && cxjVar.j().N().n()) {
            this.f.u();
        }
        this.h = false;
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbee66cb", new Object[]{this});
        } else {
            this.h = true;
        }
    }

    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95df87a7", new Object[]{this, str});
            return;
        }
        String e2 = nyj.z().e(str, "ndInstanceRender");
        this.b.T(str);
        nyj.z().d(str, "renderAtmosView", e2);
        if (r19.S0("fast_key_force_delay_atmosphere")) {
            r19.e(new e());
        } else {
            cxj cxjVar = this.f;
            if (cxjVar == null || cxjVar.l() == null || !this.f.l().e() || NavBarViewManager.H(o().o())) {
                this.f25725a.I0();
            } else {
                this.f.l().b(new f());
            }
        }
        nyj.z().t(str, "renderAtmosView", true, e2);
        nyj.z().u(str, e2, "ndInstanceRender", true);
    }

    public final void i(bxj bxjVar, int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a501fce", new Object[]{this, bxjVar, new Integer(i), new Long(j), new Long(j2)});
            return;
        }
        String G = this.f.j().G();
        try {
            if (r19.c0("sjs_apm_param", 1) > 0) {
                q0j.a(bxjVar, "ndSjsYhApmParam", r19.Y());
                q0j.a(bxjVar, "ndTppYhApmParam", r19.a0());
            }
        } catch (Exception e2) {
            txj.f(txj.TAG_TIP, "ndSjsYhApmParam error", e2);
        }
        fvh a2 = gvh.a();
        q0j.a(bxjVar, "enterNDNum", Integer.valueOf(i));
        q0j.a(bxjVar, "mts_meter_id", nyj.z().A(G));
        a2.m("enterNDNum", Integer.valueOf(i));
        g8n R = this.f.j().R();
        a2.m("newDetailChannel", R.x);
        a2.m("newType", R.t);
        a2.m("urlSpm", R.u);
        q0j.l(bxjVar, "NDAppLauncherStartTime", j);
        q0j.l(bxjVar, "enterNDTime", j2);
        a2.m("enterNDTimeTs", Long.valueOf(cvh.a(j2)));
        q0j.a(bxjVar, "NDIdleTaskExecute", Boolean.valueOf(zgj.c));
        a2.m("idleTaskExecute", Boolean.valueOf(zgj.c));
        q0j.a(bxjVar, "NDIdleTaskPreloadWeexExecute", Boolean.valueOf(zgj.d));
        Boolean bool = Boolean.FALSE;
        q0j.a(bxjVar, "NDReadBucketFromInfoFlow", bool);
        q0j.a(bxjVar, "NDReadBucketFromCache", bool);
        q0j.a(bxjVar, "NDReadBucketTrueFromInfoFlow", bool);
        q0j.a(bxjVar, "NDReadBucketTrueFromCache", bool);
        q0j.a(bxjVar, "NDIdleTaskGetTBMainActivity", Boolean.valueOf(zgj.e));
        a2.m("callNdIdleInit", Boolean.valueOf(zgj.e));
        a2.m("enterNDTimeGap", Long.valueOf(j2 - j));
        nyj.z().L(G, a2);
        q0j.g("eventProcess", q0j.UMBRELLA_TAG_ENTER_PAGE_INIT, null);
    }
}
