package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.common.SideGudieInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ux9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ComponentGroupConfig E;
    public Object F;
    public boolean I;
    public vy0 J;
    public i3h K;
    public String L;
    public Object M;
    public f8c N;
    public String O;
    public ATaoLiveOpenEntity P;
    public boolean Q;

    /* renamed from: a  reason: collision with root package name */
    public String f29656a;
    public o5h b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public Map<String, String> j;
    public jlc k;
    public hmc l;
    public IPlayPublicService m;
    public yac o;
    public sxb p;
    public boolean r;
    public ViewGroup s;
    public View t;
    public String v;
    public String w;
    public h8d y;
    public wxc z;
    public final f3c v0 = new hwy();
    public boolean n = false;
    public boolean q = false;
    public final HashMap<String, String> u = new HashMap<>();
    public boolean x = true;
    public final BlockingQueue<List<SideGudieInfo>> A = new LinkedBlockingDeque();
    public boolean B = false;
    public boolean C = false;
    public final List<View> D = new ArrayList();
    public boolean G = false;
    public boolean H = false;
    public final Queue<to8> R = new LinkedList();
    public final Queue<to8> S = new LinkedList();

    static {
        t2o.a(806355025);
    }

    public ATaoLiveOpenEntity A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ATaoLiveOpenEntity) ipChange.ipc$dispatch("30cd1b5e", new Object[]{this});
        }
        return this.P;
    }

    public ViewGroup B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5e094073", new Object[]{this});
        }
        return this.s;
    }

    public String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4c1c904", new Object[]{this});
        }
        return this.v;
    }

    public Map<String, String> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a22dd7b1", new Object[]{this});
        }
        return this.j;
    }

    @Deprecated
    public n9e E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n9e) ipChange.ipc$dispatch("527b8c5c", new Object[]{this});
        }
        return null;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("541fc1c2", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f70622d", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("546f0e15", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b95dc22a", new Object[]{this})).booleanValue();
        }
        return this.I;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de3ddd5d", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a7ecd4c", new Object[]{this})).booleanValue();
        }
        return this.C;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36c95fce", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea0cf07f", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5132abef", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public void P(vy0 vy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfeca5c", new Object[]{this, vy0Var});
        } else {
            this.J = vy0Var;
        }
    }

    public void Q(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf656fcc", new Object[]{this, obj});
        } else {
            this.M = obj;
        }
    }

    public void R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77dd0c7", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public void S(ComponentGroupConfig componentGroupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7763498b", new Object[]{this, componentGroupConfig});
        } else {
            this.E = componentGroupConfig;
        }
    }

    public void T(sxb sxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31582ad", new Object[]{this, sxbVar});
            return;
        }
        this.p = sxbVar;
        if (sxbVar != null) {
            sxbVar.Z1(this);
        }
    }

    public void U(f8c f8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99ccda", new Object[]{this, f8cVar});
        } else {
            this.N = f8cVar;
        }
    }

    public void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecff49e", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public void W(yac yacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69211472", new Object[]{this, yacVar});
        } else {
            this.o = yacVar;
        }
    }

    public void X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4956141b", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void Y(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5517c0", new Object[]{this, obj});
        } else {
            this.F = obj;
        }
    }

    public void Z(IPlayPublicService iPlayPublicService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a6593e", new Object[]{this, iPlayPublicService});
        } else {
            this.m = iPlayPublicService;
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2809b7", new Object[]{this, view});
        } else {
            ((ArrayList) this.D).add(view);
        }
    }

    public void a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8900554c", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69afa2af", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public void b0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5b1a89", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b15fa0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void c0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8237cc", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public vy0 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vy0) ipChange.ipc$dispatch("5cac3568", new Object[]{this});
        }
        return this.J;
    }

    public void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44725e26", new Object[]{this, str});
        } else {
            this.L = str;
        }
    }

    public Object e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cbabd536", new Object[]{this});
        }
        if (!(v2s.o() == null || v2s.o().f() == null || v2s.o().f().getApplication() == null || v2s.o().f().getApplication().getApplicationContext() == null)) {
            Context applicationContext = v2s.o().f().getApplication().getApplicationContext();
            if (iw0.j(applicationContext) && this.M == null) {
                Toast.makeText(applicationContext, "mAtmosphereManager is null", 1);
                o3s.b("FrameContext", "mAtmosphereManager is null");
            }
        }
        return this.M;
    }

    public void e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b76814f", new Object[]{this, str});
        } else {
            this.O = str;
        }
    }

    public ComponentGroupConfig f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentGroupConfig) ipChange.ipc$dispatch("5f8363f3", new Object[]{this});
        }
        return this.E;
    }

    public void f0(jlc jlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7212baa3", new Object[]{this, jlcVar});
        } else {
            this.k = jlcVar;
        }
    }

    public sxb g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxb) ipChange.ipc$dispatch("ec44f3ff", new Object[]{this});
        }
        return this.p;
    }

    public void g0(i3h i3hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e522cfb", new Object[]{this, i3hVar});
        } else {
            this.K = i3hVar;
        }
    }

    @Deprecated
    public f3c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f3c) ipChange.ipc$dispatch("569ba7e7", new Object[]{this});
        }
        return null;
    }

    public void h0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e392aa6", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public f8c i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8c) ipChange.ipc$dispatch("125b7074", new Object[]{this});
        }
        return this.N;
    }

    public void i0(wxc wxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b40db8d", new Object[]{this, wxcVar});
        } else {
            this.z = wxcVar;
        }
    }

    public cv1 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cv1) ipChange.ipc$dispatch("72352f1a", new Object[]{this});
        }
        return null;
    }

    public void j0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef94ea63", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public Object k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c89d9b9b", new Object[]{this});
        }
        return this.o;
    }

    public void k0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd34dfc4", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public Object l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b908185a", new Object[]{this});
        }
        return this.F;
    }

    public void l0(h8d h8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf026c0", new Object[]{this, h8dVar});
        } else {
            this.y = h8dVar;
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7a3066a", new Object[]{this});
        }
        return this.w;
    }

    public void m0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21928363", new Object[]{this, view});
        } else {
            this.t = view;
        }
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1948dab8", new Object[]{this});
        }
        return this.L;
    }

    public void n0(ATaoLiveOpenEntity aTaoLiveOpenEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b51602", new Object[]{this, aTaoLiveOpenEntity});
        } else {
            this.P = aTaoLiveOpenEntity;
        }
    }

    public List<View> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64b326d2", new Object[]{this});
        }
        return this.D;
    }

    public void o0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3b1cad", new Object[]{this, viewGroup});
        } else {
            this.s = viewGroup;
        }
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("570dc107", new Object[]{this});
        }
        return this.O;
    }

    public void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c0fff2", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public jlc q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlc) ipChange.ipc$dispatch("18fc7dad", new Object[]{this});
        }
        return this.k;
    }

    public void q0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67747ef1", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public azg r() {
        jbt jbtVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (azg) ipChange.ipc$dispatch("8be4909c", new Object[]{this});
        }
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.P;
        if (aTaoLiveOpenEntity == null || (jbtVar = aTaoLiveOpenEntity.taoliveOpenContext) == null) {
            return null;
        }
        return jbtVar.b();
    }

    public void r0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4569fd", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }

    public i3h s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i3h) ipChange.ipc$dispatch("6299fa17", new Object[]{this});
        }
        return this.K;
    }

    public void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770fc381", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public hmc t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hmc) ipChange.ipc$dispatch("825cd674", new Object[]{this});
        }
        return this.l;
    }

    public wxc u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wxc) ipChange.ipc$dispatch("a678396d", new Object[]{this});
        }
        return this.z;
    }

    public bwd u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwd) ipChange.ipc$dispatch("80c7fafa", new Object[]{this});
        }
        return null;
    }

    public yrk v() {
        cf cfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrk) ipChange.ipc$dispatch("a9f080e1", new Object[]{this});
        }
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.P;
        if (aTaoLiveOpenEntity == null || (cfVar = aTaoLiveOpenEntity.eventCompontent) == null || cfVar.a() == null) {
            return null;
        }
        return this.P.eventCompontent.a().a();
    }

    public h8d w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h8d) ipChange.ipc$dispatch("c635e5fc", new Object[]{this});
        }
        return this.y;
    }

    public IPlayPublicService x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPlayPublicService) ipChange.ipc$dispatch("449bdfd3", new Object[]{this});
        }
        return this.m;
    }

    public View y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("779d8685", new Object[]{this});
        }
        return this.t;
    }

    public f3c z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f3c) ipChange.ipc$dispatch("5e4a435b", new Object[]{this});
        }
        return this.v0;
    }

    public void O(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e581ede6", new Object[]{this, map, map2});
            return;
        }
        o3s.b("liveInteractiveMsg", "向第三方发送互动消息，msg = " + map + ", params = " + map2);
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.P;
        if (aTaoLiveOpenEntity != null) {
            aTaoLiveOpenEntity.accessListener(AccessListenerEnum.postInteractiveMsg, map, map2);
        }
    }
}
