package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.weex_framework.a f17556a;
    public hce b;
    public FrameLayout c;
    public View d;
    public hbb e;
    public lo f;
    public AURAGlobalData g;
    public String h;
    public final AtomicInteger i = new AtomicInteger(0);
    public uo j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            hce m = d3x.this.m();
            if (m != null) {
                m.b(d3x.this, view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            } else {
                d3x.a(d3x.this).set(4);
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            hce m = d3x.this.m();
            if (m != null) {
                m.c(d3x.this, i, str);
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            hce m = d3x.this.m();
            if (m != null) {
                m.a(d3x.this, i, str, z);
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
                return;
            }
            hce m = d3x.this.m();
            if (m != null) {
                m.d(d3x.this);
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            d3x.a(d3x.this).set(3);
            hce m = d3x.this.m();
            if (m != null) {
                m.h(d3x.this, i, str, z);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            d3x.a(d3x.this).set(2);
            hce m = d3x.this.m();
            if (m != null) {
                m.e(d3x.this);
            }
        }
    }

    static {
        t2o.a(81789234);
    }

    public d3x(FrameLayout frameLayout, hce hceVar, lo loVar, AURAGlobalData aURAGlobalData, hbb hbbVar, uo uoVar) {
        this.b = hceVar;
        this.c = frameLayout;
        this.e = hbbVar;
        this.f = loVar;
        this.g = aURAGlobalData;
        try {
            r(uoVar.a());
        } catch (Exception unused) {
        }
        b();
        o();
    }

    public static /* synthetic */ AtomicInteger a(d3x d3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6ec8273f", new Object[]{d3xVar});
        }
        return d3xVar.i;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434fbff1", new Object[]{this});
            return;
        }
        FrameLayout h = h();
        if (h == null) {
            ck.g().f("Weex2InstanceWrapper|createWeex2Instance|containerLayout is null", ck.b.b().l("Weex2InstanceWrapper").i("AURA/core").a());
            return;
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.B(true);
        mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.v(false);
        mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.u(new a());
        com.taobao.android.weex_framework.a c = com.taobao.android.weex_framework.b.f().c(h.getContext(), mUSInstanceConfig);
        this.f17556a = c;
        c.setGestureConsumptionView(h);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.d = null;
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        com.taobao.android.weex_framework.a aVar = this.f17556a;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    public AURAGlobalData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("f8a1a623", new Object[]{this});
        }
        return this.g;
    }

    public lo e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("5d10ae7d", new Object[]{this});
        }
        return this.f;
    }

    public View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3beaee32", new Object[]{this});
        }
        if (cw6.b()) {
            rbb g = ck.g();
            g.c("Weex2InstanceWrapper", "getBackgroundView", hashCode() + ": getBackgroundView.get() :" + this.d + ":thread:" + Thread.currentThread().hashCode());
        }
        return this.d;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("529e9f61", new Object[]{this});
        }
        return this.h;
    }

    public FrameLayout h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("84b62c7d", new Object[]{this});
        }
        return this.c;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        com.taobao.android.weex_framework.a aVar = this.f17556a;
        if (aVar == null) {
            return null;
        }
        return String.valueOf(aVar.getInstanceId());
    }

    public com.taobao.android.weex_framework.a j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("8de11e1e", new Object[]{this});
        }
        return this.f17556a;
    }

    public uo k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uo) ipChange.ipc$dispatch("bb745daa", new Object[]{this});
        }
        return this.j;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a34f0d18", new Object[]{this})).intValue();
        }
        return this.i.get();
    }

    public hce m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hce) ipChange.ipc$dispatch("a1d0d24f", new Object[]{this});
        }
        return this.b;
    }

    public View n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9520bac7", new Object[]{this});
        }
        com.taobao.android.weex_framework.a aVar = this.f17556a;
        if (aVar != null) {
            return aVar.getRenderRoot();
        }
        return null;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8381e774", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.f17556a;
        if (aVar != null) {
            aVar.registerRenderListener(new b());
        }
    }

    public void r(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9446b56", new Object[]{this, view});
        } else if (view != null) {
            this.d = view;
            if (cw6.b()) {
                rbb g = ck.g();
                g.c("Weex2InstanceWrapper", "setBackgroundView", hashCode() + ": setBackgroundView :" + this.d + ", view:" + view + ":thread:" + Thread.currentThread().hashCode());
            }
        }
    }

    public void s(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a19277b0", new Object[]{this, aURARenderComponent});
        } else {
            this.h = aURARenderComponent.key;
        }
    }

    public void p(uo uoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a86fc4", new Object[]{this, uoVar});
            return;
        }
        this.j = uoVar;
        if (this.f17556a == null) {
            ck.g().f("renderByModel:mWeexInstance is null", ck.b.b().l("Weex2InstanceWrapper").i("AURA/core").a());
        } else if (uoVar == null) {
            ck.g().f("renderByModel:renderModel is null", ck.b.b().l("Weex2InstanceWrapper").i("AURA/core").a());
        } else {
            String d = uoVar.d();
            if (TextUtils.isEmpty(d)) {
                ck.g().f("renderByModel:url isEmpty", ck.b.b().l("Weex2InstanceWrapper").i("AURA/core").a());
                return;
            }
            this.i.set(1);
            this.f17556a.initWithURL(Uri.parse(d));
            this.f17556a.render(uoVar.b(), uoVar.c());
        }
    }

    public void q(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7b5020", new Object[]{this, str, map});
            return;
        }
        hbb hbbVar = this.e;
        if (hbbVar == null || hbbVar == null) {
            ck.g().b("Weex2InstanceWrapper", "reportError", str);
            return;
        }
        mi miVar = new mi(1, "Weex2", "weex2#bizError", str);
        if (!TextUtils.isEmpty(this.h)) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("AuraComponentKey", this.h);
            miVar.i(map);
        }
        this.e.b(miVar);
    }
}
