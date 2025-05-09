package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.TaoLiveWebBottomFragment;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.InteractPanelSDKView2;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.right_component.RightComponentController;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.ddu;
import tb.pu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ukr implements IInteractiveProxy.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENTCENTER_BIZCODE = "EVENTCENTER_BIZCODE_TBLiveInteractiveManager";
    public static final String F = ukr.class.getSimpleName();
    public olc A;
    public a2e B;
    public aeb C;
    public ub5 D;
    public bce E;
    public f9z G;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29444a;
    public final ux9 b;
    public final String c;
    public String d;
    public String e;
    public sgf f;
    public nc4 g;
    public RightComponentController h;
    public w2r i;
    public zvg j;
    public qoa k;
    public qoa l;
    public zff m;
    public com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a n;
    public pu o;
    public final khf q;
    public rhf r;
    public lif s;
    public dgc t;
    public int u;
    public boolean v;
    public final boolean x;
    public zlc z;
    public ddu p = null;
    public boolean w = false;
    public String y = "mask";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements pu.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.pu.b
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b312762d", new Object[]{this, str, str2});
            } else {
                ukr.this.n();
            }
        }

        @Override // tb.pu.b
        public void renderSuccess(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c8590be", new Object[]{this, view});
                return;
            }
            pu puVar = ukr.this.o;
            if (puVar != null) {
                puVar.b();
            }
        }
    }

    static {
        t2o.a(295699833);
        t2o.a(806355279);
    }

    public ukr(Context context, ux9 ux9Var, long j) {
        String str = null;
        this.f29444a = context;
        this.b = ux9Var;
        str = ux9Var != null ? ux9Var.C() : str;
        this.c = str;
        zvg.o(str, new zvg(str, context, ux9Var));
        if (zvg.h() != null) {
            zvg.h().p(this);
        }
        zvg zvgVar = new zvg(str, context, ux9Var);
        this.j = zvgVar;
        zvgVar.p(this);
        khf khfVar = new khf(this, j);
        this.q = khfVar;
        this.g = new nc4(context, khfVar);
        this.f = new sgf(str, this, this.g, khfVar);
        this.x = tws.t();
    }

    public static /* synthetic */ qoa B(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoa) ipChange.ipc$dispatch("fe409764", new Object[]{ukrVar});
        }
        return ukrVar.k;
    }

    public static /* synthetic */ qoa C(ukr ukrVar, qoa qoaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoa) ipChange.ipc$dispatch("e58fb206", new Object[]{ukrVar, qoaVar});
        }
        ukrVar.k = qoaVar;
        return qoaVar;
    }

    public static /* synthetic */ Context D(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("92e08bc7", new Object[]{ukrVar});
        }
        return ukrVar.f29444a;
    }

    public static /* synthetic */ bce E(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bce) ipChange.ipc$dispatch("362e5f00", new Object[]{ukrVar});
        }
        return ukrVar.E;
    }

    public static /* synthetic */ khf F(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khf) ipChange.ipc$dispatch("d3599b52", new Object[]{ukrVar});
        }
        return ukrVar.q;
    }

    public static /* synthetic */ aeb G(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aeb) ipChange.ipc$dispatch("1dd9aa79", new Object[]{ukrVar});
        }
        return ukrVar.C;
    }

    public static /* synthetic */ zvg H(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zvg) ipChange.ipc$dispatch("97009bec", new Object[]{ukrVar});
        }
        return ukrVar.j;
    }

    public static /* synthetic */ String I(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcbcae8c", new Object[]{ukrVar});
        }
        return ukrVar.c;
    }

    public static /* synthetic */ ux9 J(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("a8e95f49", new Object[]{ukrVar});
        }
        return ukrVar.b;
    }

    public static /* synthetic */ sgf K(ukr ukrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgf) ipChange.ipc$dispatch("20c63cc8", new Object[]{ukrVar});
        }
        return ukrVar.f;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void A(aeb aebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b9d3b9", new Object[]{this, aebVar});
        } else {
            this.C = aebVar;
        }
    }

    public void L(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fff1d3", new Object[]{this, eVar});
        } else if (this.m == null) {
            sgf sgfVar = this.f;
            if (sgfVar != null) {
                sgfVar.q(eVar);
            }
        } else if (eVar.isMigrationFlag()) {
            this.m.addInteractComponent(eVar);
        }
    }

    public void M(com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a193fd8a", new Object[]{this, aVar});
            return;
        }
        this.w = false;
        if (aVar == this.n || !this.x) {
            this.n = null;
            if (V() != null) {
                V().d();
            }
        }
    }

    public void N(cqk cqkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131007ef", new Object[]{this, cqkVar, new Boolean(z)});
            return;
        }
        nc4 nc4Var = this.g;
        if (nc4Var != null) {
            nc4Var.f(cqkVar, z);
            return;
        }
        cqkVar.onError(-2, null, null);
        jbu.b("getComponentList_track", "errorCode=mComponentListInfo is null");
    }

    public ub5 O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ub5) ipChange.ipc$dispatch("99953258", new Object[]{this});
        }
        return this.D;
    }

    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d835ead6", new Object[]{this});
        }
        return this.e;
    }

    /* renamed from: Q */
    public qoa s(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoa) ipChange.ipc$dispatch("b4a5c428", new Object[]{this, viewGroup});
        }
        qoa qoaVar = new qoa(this.f29444a, this, viewGroup, this.E, "extendH5Container", null, false);
        qoaVar.f(this.c, this, this.b);
        qoaVar.t(this.j);
        return qoaVar;
    }

    public ux9 R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("59d375df", new Object[]{this});
        }
        return this.b;
    }

    /* renamed from: U */
    public khf q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khf) ipChange.ipc$dispatch("e102595", new Object[]{this});
        }
        return this.q;
    }

    public rhf V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rhf) ipChange.ipc$dispatch("45aed5a0", new Object[]{this});
        }
        return this.r;
    }

    public olc W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (olc) ipChange.ipc$dispatch("7b97c394", new Object[]{this});
        }
        return this.A;
    }

    public zlc X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zlc) ipChange.ipc$dispatch("59c27b50", new Object[]{this});
        }
        return this.z;
    }

    public String Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd7f76fc", new Object[]{this});
        }
        return this.d;
    }

    /* renamed from: Z */
    public RightComponentController p(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightComponentController) ipChange.ipc$dispatch("80954a3", new Object[]{this, viewGroup, new Boolean(z)});
        }
        RightComponentController rightComponentController = this.h;
        if (rightComponentController != null) {
            rightComponentController.i();
        }
        RightComponentController rightComponentController2 = new RightComponentController(this.c, this.f29444a, this.b, this, this.f, this.q);
        this.h = rightComponentController2;
        rightComponentController2.s(viewGroup, z);
        return this.h;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public f9z a(VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f9z) ipChange.ipc$dispatch("d3e21698", new Object[]{this, videoInfo, new Boolean(z)});
        }
        if (this.G == null && ((videoInfo != null && videoInfo.presentHierarchy) || z)) {
            this.G = new vjl(this.b);
        }
        return this.G;
    }

    public boolean a0(ddu.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c5c5468", new Object[]{this, bVar})).booleanValue();
        }
        ddu dduVar = this.p;
        if (dduVar == null || !dduVar.c(bVar)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public boolean b(ViewGroup viewGroup, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57e31e59", new Object[]{this, viewGroup, str, map})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar = this.n;
        if (aVar == null || (this.w && this.x)) {
            com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar2 = new com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a(this.f29444a, map, this);
            this.n = aVar2;
            aVar2.j(this.j);
        } else {
            aVar.k(map);
        }
        this.n.i(str);
        this.n.l();
        return true;
    }

    /* renamed from: b0 */
    public w2r x(ViewGroup viewGroup, VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w2r) ipChange.ipc$dispatch("b1440113", new Object[]{this, viewGroup, videoInfo, new Boolean(z)});
        }
        w2r w2rVar = this.i;
        if (w2rVar != null) {
            w2rVar.c();
        }
        w2r w2rVar2 = new w2r(this.c, this.f29444a, this.b, videoInfo, this, this.f, this.g, this.q);
        this.i = w2rVar2;
        w2rVar2.j(viewGroup, z);
        return this.i;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ffcd4e", new Object[]{this});
            return;
        }
        sgf sgfVar = this.f;
        if (sgfVar != null) {
            sgfVar.r();
        }
        rhf rhfVar = this.r;
        if (rhfVar != null) {
            rhfVar.c();
        }
    }

    public String c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public IInteractiveProxy.f d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.f) ipChange.ipc$dispatch("b6018a68", new Object[]{this});
        }
        return this.f;
    }

    public int d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdf072ec", new Object[]{this})).intValue();
        }
        return this.u;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        zvg zvgVar = this.j;
        if (zvgVar != null) {
            zvgVar.f();
            this.j = null;
        }
        rhf rhfVar = this.r;
        if (rhfVar != null) {
            rhfVar.e();
            this.r = null;
        }
        lif lifVar = this.s;
        if (lifVar != null) {
            lifVar.f();
            this.s = null;
        }
        dgc dgcVar = this.t;
        if (dgcVar != null) {
            ((iif) dgcVar).f();
            this.t = null;
        }
        nc4 nc4Var = this.g;
        if (nc4Var != null) {
            nc4Var.c();
            this.g = null;
        }
        sgf sgfVar = this.f;
        if (sgfVar != null) {
            sgfVar.J();
            this.f = null;
        }
        khf khfVar = this.q;
        if (khfVar != null) {
            khfVar.o();
        }
        qoa qoaVar = this.k;
        if (qoaVar != null) {
            qoaVar.i();
            this.k = null;
        }
        zff zffVar = this.m;
        if (zffVar != null) {
            zffVar.destroy();
            this.m = null;
        }
        RightComponentController rightComponentController = this.h;
        if (rightComponentController != null) {
            rightComponentController.i();
            this.h = null;
        }
        w2r w2rVar = this.i;
        if (w2rVar != null) {
            w2rVar.c();
            this.i = null;
        }
        if (!hjr.t() || this.b.j() == null || !this.b.j().y) {
            n();
            com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar = this.n;
            if (aVar != null && !aVar.f()) {
                this.n.b();
            }
            o3s.b(F, "销毁橱窗弹窗");
        } else {
            o3s.b(F, "不销毁橱窗弹窗");
        }
        zvg.l(this.c);
        this.p = null;
        b1u.a();
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void e(a2e a2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836064c9", new Object[]{this, a2eVar});
        } else {
            this.B = a2eVar;
        }
    }

    public a2e e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a2e) ipChange.ipc$dispatch("a341ea31", new Object[]{this});
        }
        return this.B;
    }

    public void f0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293d2d0a", new Object[]{this, str, str2});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar = this.n;
        if (aVar != null) {
            aVar.c(str, str2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596df050", new Object[]{this, str});
            return;
        }
        w2r w2rVar = this.i;
        if (w2rVar != null) {
            w2rVar.a(str);
        }
    }

    public void g0(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28ea7f6", new Object[]{this, eVar});
        } else if (this.m == null) {
            sgf sgfVar = this.f;
            if (sgfVar != null) {
                sgfVar.G(eVar);
            }
        } else if (eVar.isMigrationFlag()) {
            this.m.removeInteractComponent(eVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public aeb getActionAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aeb) ipChange.ipc$dispatch("84db08f1", new Object[]{this});
        }
        return this.C;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f29444a;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void h(olc olcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9829a2cb", new Object[]{this, olcVar});
        } else {
            this.A = olcVar;
        }
    }

    public void h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe800c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.y = str;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8814c736", new Object[]{this, new Integer(i)});
        } else {
            this.u = i;
        }
    }

    public boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8f99b5d", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void j(bce bceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c52cc9", new Object[]{this, bceVar});
        } else {
            this.E = bceVar;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf643b1", new Object[]{this, new Integer(i)});
            return;
        }
        RightComponentController rightComponentController = this.h;
        if (rightComponentController != null) {
            rightComponentController.u(i);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void l(VideoInfo videoInfo, String str, String str2, HashMap<String, String> hashMap, f7a f7aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5a6925", new Object[]{this, videoInfo, str, str2, hashMap, f7aVar});
            return;
        }
        this.d = str2;
        this.e = str;
        if (videoInfo != null) {
            String c = iw0.c(this.f29444a);
            if (!(hashMap == null || hashMap.get("channel") == null)) {
                c = String.valueOf(hashMap.get("channel"));
            }
            nc4 nc4Var = this.g;
            if (nc4Var != null) {
                nc4Var.g(this.b, videoInfo, str, str2, c, f7aVar);
            }
            sgf sgfVar = this.f;
            if (sgfVar != null) {
                sgfVar.F();
                this.f.t(hashMap);
            }
            this.p = new ddu(videoInfo.liveId);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public zff m(ViewGroup viewGroup, View view, boolean z, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zff) ipChange.ipc$dispatch("f373dc97", new Object[]{this, viewGroup, view, new Boolean(z), videoInfo});
        }
        zff zffVar = this.m;
        if (zffVar != null) {
            zffVar.destroy();
        }
        InteractPanelSDKView2 interactPanelSDKView2 = new InteractPanelSDKView2(this.f29444a, viewGroup, view, this.c, this, this.f, z, videoInfo);
        this.m = interactPanelSDKView2;
        return interactPanelSDKView2;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public boolean n() {
        TaoLiveWebBottomFragment taoLiveWebBottomFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("204ef75b", new Object[]{this})).booleanValue();
        }
        this.w = true;
        com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar = this.n;
        if (aVar != null) {
            aVar.i = this.y;
        }
        pu puVar = this.o;
        if (puVar != null) {
            puVar.i();
            this.o = null;
        }
        Context context = this.f29444a;
        if ((context instanceof FragmentActivity) && (taoLiveWebBottomFragment = (TaoLiveWebBottomFragment) ((FragmentActivity) context).getSupportFragmentManager().findFragmentByTag(TaoLiveWebBottomFragment.u3())) != null) {
            taoLiveWebBottomFragment.dismissAllowingStateLoss();
        }
        return true;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5347d193", new Object[]{this, str, str2});
            return;
        }
        qoa qoaVar = this.k;
        if (qoaVar != null) {
            qoaVar.S(str, str2);
            return;
        }
        qoa qoaVar2 = this.l;
        if (qoaVar2 != null) {
            qoaVar2.S(str, str2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void r(zlc zlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab61db5", new Object[]{this, zlcVar});
        } else {
            this.z = zlcVar;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80e3a51", new Object[]{this, str});
        } else if (str != null) {
            com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar = this.n;
            if (aVar != null) {
                if (!aVar.g() && !Uri.parse(str).equals(this.n.e())) {
                    this.n.b();
                } else {
                    return;
                }
            }
            com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar2 = new com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a(this.f29444a, null, this);
            this.n = aVar2;
            aVar2.j(this.j);
            this.n.h(str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public dgc u(VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgc) ipChange.ipc$dispatch("db1590d8", new Object[]{this, videoInfo, new Boolean(z)});
        }
        if (this.t == null && ((videoInfo != null && videoInfo.presentHierarchy) || z)) {
            this.t = new iif(this.b, this);
        }
        return this.t;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void v(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b8705c", new Object[]{this, str, map});
            return;
        }
        qoa qoaVar = this.k;
        if (qoaVar != null) {
            qoaVar.T(str, map);
            return;
        }
        qoa qoaVar2 = this.l;
        if (qoaVar2 != null) {
            qoaVar2.T(str, map);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8b79d", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64ad12c", new Object[]{this});
            return;
        }
        rhf rhfVar = this.r;
        if (rhfVar != null) {
            rhfVar.e();
        }
        this.r = new rhf(this.c, this.b, null, this);
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de743f0", new Object[]{this});
            return;
        }
        lif lifVar = this.s;
        if (lifVar != null) {
            lifVar.f();
        }
        this.s = new lif(this.c, this.b, this);
    }

    /* renamed from: T */
    public qoa S(ViewGroup viewGroup, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoa) ipChange.ipc$dispatch("aaec885a", new Object[]{this, viewGroup, str, str2});
        }
        jbu.a("globalH5Container-getH5Container", "liveSource:" + str);
        cv1 f = vx9.f(R());
        if (!tws.r(this.f29444a) || TextUtils.isEmpty(str2) || !str2.contains("tl-global-support=true") || TextUtils.isEmpty(str) || !z9u.SOURCE_UPDOWNSWITCH.equals(str) || f == null || TextUtils.isEmpty(f.l()) || !f.l().equals(f.h())) {
            qoa qoaVar = this.k;
            if (qoaVar != null) {
                qoaVar.i();
            }
            jbu.a("globalH5Container-getH5Container", "mH5Container start:" + System.currentTimeMillis());
            Context context = this.f29444a;
            bce bceVar = this.E;
            khf khfVar = this.q;
            aeb aebVar = this.C;
            qoa qoaVar2 = new qoa(context, this, viewGroup, bceVar, str, khfVar, aebVar != null && aebVar.t());
            this.k = qoaVar2;
            qoaVar2.Z(this.u);
            this.k.f(this.c, this, this.b);
            this.k.t(this.j);
            sgf sgfVar = this.f;
            if (sgfVar != null) {
                sgfVar.I(this.k);
            }
            o("TBLiveWVPlugin.Event.nativeEnvReady", "");
            return this.k;
        }
        jbu.a("globalH5Container-getH5Container", "mALiveH5Container start LastLiveType:" + f.l() + "--CurrLiveType:" + f.h());
        f.x = f.x + 1;
        StringBuilder sb = new StringBuilder("mALiveWebViewRefreshCount:");
        sb.append(f.x);
        jbu.a("globalH5Container-getH5Container", sb.toString());
        if (f.x >= tws.B()) {
            nkr nkrVar = f.w;
            if (!(nkrVar == null || nkrVar.f() == null)) {
                f.w.f().destroy();
                f.w.a();
                f.w = null;
                jbu.a("globalH5Container-getH5Container", "mALiveH5Container onDestroy");
            }
            nkr nkrVar2 = f.w;
            if (!(nkrVar2 == null || nkrVar2.g() == null)) {
                f.w.g().destroy();
                f.w.a();
                f.w = null;
                jbu.a("globalH5Container-getH5Container", "mTBLiveThemisContainer onDestroy");
            }
            f.x = 0;
        }
        Context context2 = this.f29444a;
        bce bceVar2 = this.E;
        khf khfVar2 = this.q;
        aeb aebVar2 = this.C;
        joa joaVar = new joa(context2, this, viewGroup, bceVar2, str, khfVar2, aebVar2 != null && aebVar2.t());
        this.l = joaVar;
        joaVar.Z(this.u);
        this.l.f(this.c, this, this.b);
        this.l.t(this.j);
        sgf sgfVar2 = this.f;
        if (sgfVar2 != null) {
            sgfVar2.I(this.l);
        }
        return this.l;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    public void a(ub5 ub5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3adb84ce", new Object[]{this, ub5Var});
        } else {
            this.D = ub5Var;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.h
    @Deprecated
    public boolean f(ViewGroup viewGroup, String str, Map<String, String> map) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15b0497", new Object[]{this, viewGroup, str, map})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        pu puVar = this.o;
        if (puVar != null && TextUtils.equals(puVar.c(), str)) {
            return false;
        }
        String str2 = map.get(yj4.PARAM_ACTIVITY_POSITION);
        if (!TextUtils.isEmpty(str2) && (split = str2.split("-")) != null && split.length == 4) {
            map.put("x", split[0]);
            map.put("y", split[1]);
            map.put("width", split[2]);
            map.put("height", split[3]);
        }
        pu puVar2 = this.o;
        if (puVar2 != null) {
            puVar2.i();
            this.o = null;
        }
        qoa qoaVar = new qoa(this.f29444a, this, viewGroup, this.E, map);
        this.o = qoaVar;
        qoaVar.t(this.j);
        this.o.n(new a());
        this.o.o(str);
        String str3 = map.get("bizData");
        if (!TextUtils.isEmpty(str3)) {
            this.o.q(str3);
        }
        ((qoa) this.o).a0();
        return true;
    }
}
