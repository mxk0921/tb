package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.common.view.WeexConsumeLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.performance.IPerformanceService;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.b6x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k93 extends vx1 implements npc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ViewGroup g;
    public com.taobao.android.weex_framework.a h;
    public final uq9 j;
    public final List<WeakReference<k93>> l;
    public long n;
    public vrp q;
    public boolean i = false;
    public String k = null;
    public boolean m = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = false;
    public final boolean s = akt.p2("ShortVideo.isFixMUSInstanceStartStop", true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.weex_framework.a f22485a;
        public final /* synthetic */ vrp b;
        public final /* synthetic */ boolean c;

        public a(com.taobao.android.weex_framework.a aVar, vrp vrpVar, boolean z) {
            this.f22485a = aVar;
            this.b = vrpVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!s8x.a() || this.f22485a == k93.t(k93.this)) {
                k93.F(k93.this);
                k93.G(k93.this, this.b, this.c);
                ir9.b("CardWeeXV2MessageHandler", "checkTimeout timeout rebuildWeex initWeexInstance ," + k93.v(k93.this) + k93.I(k93.this));
            } else {
                ir9.b("CardWeeXV2MessageHandler", "checkTimeout timeout 实例不同 instance=" + this.f22485a + " musInstance=" + k93.t(k93.this) + "---" + k93.v(k93.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vrp f22486a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements hde {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.hde
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("93f50aea", new Object[]{this});
                }
            }

            @Override // tb.hde
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b03e814", new Object[]{this});
                } else {
                    ((IPerformanceService) k93.L(k93.this).U().getService(IPerformanceService.class)).onInteractLayerFirstFrameReady();
                }
            }
        }

        public b(vrp vrpVar) {
            this.f22486a = vrpVar;
        }

        @Override // tb.b6x
        public void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
                return;
            }
            WeexInstance b = aVar.b(k93.K(k93.this).getContext());
            k93.u(k93.this, ((WeexInstanceImpl) b).getAdapterMUSInstance());
            ((q6x) b.getExtend(q6x.class)).c(new a());
            k93.M(k93.this, this.f22486a);
            k93 k93Var = k93.this;
            k93.N(k93Var, k93.t(k93Var).getRenderRoot(), false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements IPreloadWeexService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vrp f22488a;

        public c(vrp vrpVar) {
            this.f22488a = vrpVar;
        }

        @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService.a
        public void a(com.taobao.android.weex_framework.a aVar, List<vrp> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0eb908b", new Object[]{this, aVar, list});
                return;
            }
            ir9.b("CardWeeXV2MessageHandler", "预加载Render阶段异步创建好weex实例");
            k93.u(k93.this, aVar);
            k93.O(k93.this, true);
            if (k93.t(k93.this) != null) {
                k93.M(k93.this, this.f22488a);
                k93 k93Var = k93.this;
                k93.N(k93Var, k93.t(k93Var).getRenderRoot(), true);
                ir9.b("CardWeeXV2MessageHandler", "实例已经渲染成功");
                if (k93.t(k93.this).isUIReady()) {
                    k93.w(k93.this);
                }
                k93.x(k93.this, list);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else if (k93.t(k93.this) instanceof MUSDKInstance) {
                ((MUSDKInstance) k93.t(k93.this)).refreshPixelCheckTime();
                ir9.b("CardWeeXV2MessageHandler", "weex view attached to window and refresh pixel check time, weex instance: " + k93.t(k93.this).getInstanceId());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else if (k93.t(k93.this) != null) {
                ir9.b("CardWeeXV2MessageHandler", "weex view detached from window, weex instance: " + k93.t(k93.this).getInstanceId());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements dde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.dde
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
            } else if (k93.z(k93.this)) {
                k93.B(k93.this);
                ir9.b("CardWeeXV2MessageHandler", "onOverScrolling doPendingEvent");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements pce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.pce
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
            } else if (map != null && map.size() != 0) {
                boolean o = nwv.o(map.get("state"), false);
                k93.C(k93.this, o);
                if (o && (k93.K(k93.this) instanceof WeexConsumeLayout)) {
                    String I = nwv.I(map.get("acceptGestureType"), ied.PULL_INIT);
                    ir9.b("CardWeeXV2MessageHandler", "gesture listener acceptGestureType:" + I);
                    ((WeexConsumeLayout) k93.K(k93.this)).setAcceptGestureType(I);
                }
            }
        }
    }

    static {
        t2o.a(468713920);
        t2o.a(982515990);
    }

    public k93(ViewGroup viewGroup, uq9 uq9Var) {
        ArrayList arrayList = new ArrayList();
        this.l = arrayList;
        this.g = viewGroup;
        this.j = uq9Var;
        arrayList.add(new WeakReference(this));
        s8x.c();
    }

    public static /* synthetic */ void B(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902c6f52", new Object[]{k93Var});
        } else {
            k93Var.Z();
        }
    }

    public static /* synthetic */ void C(k93 k93Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3edaec3", new Object[]{k93Var, new Boolean(z)});
        } else {
            k93Var.p0(z);
        }
    }

    public static /* synthetic */ void E(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0c2510", new Object[]{k93Var});
        } else {
            k93Var.T();
        }
    }

    public static /* synthetic */ void F(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8e69c2", new Object[]{k93Var});
        } else {
            k93Var.X();
        }
    }

    public static /* synthetic */ void G(k93 k93Var, vrp vrpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b195cc", new Object[]{k93Var, vrpVar, new Boolean(z)});
        } else {
            k93Var.f0(vrpVar, z);
        }
    }

    public static /* synthetic */ String I(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbdec520", new Object[]{k93Var});
        }
        return k93Var.c0();
    }

    public static /* synthetic */ ViewGroup K(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1a11e4d6", new Object[]{k93Var});
        }
        return k93Var.g;
    }

    public static /* synthetic */ uq9 L(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("76beaf69", new Object[]{k93Var});
        }
        return k93Var.j;
    }

    public static /* synthetic */ void M(k93 k93Var, vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef88c384", new Object[]{k93Var, vrpVar});
        } else {
            k93Var.n0(vrpVar);
        }
    }

    public static /* synthetic */ void N(k93 k93Var, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78af493e", new Object[]{k93Var, view, new Boolean(z)});
        } else {
            k93Var.o0(view, z);
        }
    }

    public static /* synthetic */ boolean O(k93 k93Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fa3a2df", new Object[]{k93Var, new Boolean(z)})).booleanValue();
        }
        k93Var.p = z;
        return z;
    }

    public static void P(FluidContext fluidContext, uq9 uq9Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c09e03a8", new Object[]{fluidContext, uq9Var, map});
        } else if (map == null) {
        } else {
            if (uq9Var == null) {
                map.put("playerPauseIconPosition", v5m.Y(fluidContext));
            } else if (uq9Var instanceof ici) {
                ici iciVar = (ici) uq9Var;
                if (iciVar.I0() != null) {
                    map.put("playerPauseIconPosition", iciVar.I0().Z());
                }
            }
        }
    }

    public static JSONObject U(FluidContext fluidContext, vrp vrpVar, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e463ae8", new Object[]{fluidContext, vrpVar, uq9Var});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (vrpVar != null) {
                jSONObject.put("model", (Object) vrpVar.h);
            }
            Map b2 = wmi.b(fluidContext, vrpVar);
            if (uq9Var == null || uq9Var.M() == 0) {
                b2.put("isColdStartFirstInstance", Boolean.TRUE);
            }
            P(fluidContext, uq9Var, b2);
            jSONObject.put("options", (Object) b2);
            return jSONObject;
        } catch (Exception e2) {
            ir9.b("CardWeeXV2MessageHandler", "weex预创建createWeexInitData error:" + e2);
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(k93 k93Var, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/base/layer/interactive/eventhandler/weex/CardWeeXV2MessageHandler");
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a t(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("34be3911", new Object[]{k93Var});
        }
        return k93Var.h;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a u(k93 k93Var, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("64d992a8", new Object[]{k93Var, aVar});
        }
        k93Var.h = aVar;
        return aVar;
    }

    public static /* synthetic */ String v(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5a4a81d", new Object[]{k93Var});
        }
        return k93Var.b0();
    }

    public static /* synthetic */ void w(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71dcdeb5", new Object[]{k93Var});
        } else {
            k93Var.m0();
        }
    }

    public static /* synthetic */ void x(k93 k93Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7dd9e85", new Object[]{k93Var, list});
        } else {
            k93Var.s0(list);
        }
    }

    public static /* synthetic */ boolean z(k93 k93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30bc9477", new Object[]{k93Var})).booleanValue();
        }
        return k93Var.r;
    }

    public final void Q(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0e10fd", new Object[]{this, new Integer(i), view});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (i == -1) {
            this.g.addView(view, layoutParams);
        } else {
            this.g.addView(view, i, layoutParams);
        }
    }

    public final boolean R(vrp vrpVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0ee353c", new Object[]{this, vrpVar, str})).booleanValue();
        }
        IPreloadWeexService iPreloadWeexService = (IPreloadWeexService) this.j.U().getService(IPreloadWeexService.class);
        if (iPreloadWeexService == null) {
            return false;
        }
        return iPreloadWeexService.getWeexInstance(vrpVar.d, str, new c(vrpVar));
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9b3882", new Object[]{this});
        } else if (this.i && !h0()) {
            this.e = 2;
        }
    }

    public final void V(vrp vrpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea64f14", new Object[]{this, vrpVar, new Boolean(z)});
        } else {
            W(vrpVar, z);
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f409e281", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.removeView(this.d);
        }
        if (this.h != null) {
            ir9.b("CardWeeXV2MessageHandler", "checkTimeout timeout rebuildWeex destroyMusInstance ---" + this + "-----" + this.h.getInstanceId());
            this.h.destroy();
            this.h = null;
            this.o = false;
        }
    }

    public final void Y(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a23ffa", new Object[]{this, aVar, jSONObject});
        } else if (aVar != null) {
            if (jSONObject != null && TextUtils.equals(vrp.MSG_DATA_CHANGE, (String) jSONObject.get("name"))) {
                ir9.b("CardWeeXV2MessageHandler", "weex预加载dispatchEvent,发送VSMSG_updateMediaData => " + aVar.getInstanceId());
            }
            aVar.dispatchEvent(MUSEventTarget.MUS_BODY_TARGET, "shortvideomessage", jSONObject);
        }
    }

    public final int a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22f9bcb2", new Object[]{this})).intValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("gestureWaitScrollTime", 16);
    }

    public final String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("396f2ee6", new Object[]{this});
        }
        return ", title=" + o83.b(this.j) + "; ---" + this + " contentId=" + this.j.P();
    }

    public final String c0() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51da94ae", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(", instance=");
        sb.append(this.h);
        sb.append(", instanceId=");
        com.taobao.android.weex_framework.a aVar = this.h;
        if (aVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(aVar.getInstanceId());
        }
        sb.append(obj);
        return sb.toString();
    }

    public final int d0() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("489bd7a9", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                if (this.g.getChildAt(i) instanceof DWPenetrateFrameLayout) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        ir9.b("CardWeeXV2MessageHandler", "getWebViewIndex:" + i);
        return i;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40df6fcc", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596a7c1c", new Object[]{this});
        }
    }

    public final void g0(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c7fb1", new Object[]{this, vrpVar});
        } else {
            f0(vrpVar, false);
        }
    }

    public final boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2de4a", new Object[]{this})).booleanValue();
        }
        return ((HashSet) this.f).isEmpty();
    }

    public final void i0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e585e", new Object[]{this, view});
            return;
        }
        this.m = true;
        fx0.a(view, akt.w2("ShortVideo.weexAnimDuration", 350));
    }

    public final void j0(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40ab6b2", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        ir9.b("CardWeeXV2MessageHandler", str + " errCode=" + i + ",errorMsg" + str2 + c0() + b0());
    }

    public final void n0(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f000fe1", new Object[]{this, vrpVar});
        } else if (this.h == null) {
            ir9.b("CardWeeXV2MessageHandler", "weex预创建,onWeexInstanceCreated musInstance is null return");
        } else {
            if (b93.o()) {
                this.e = 6;
            }
            this.h.registerRenderListener(this);
            r0();
            this.h.setWeexScrollListener(new e());
            this.h.setTag("std_pop_anim_listener", this.j);
            this.n = SystemClock.elapsedRealtime();
            uq9 uq9Var = this.j;
            String str = this.k;
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.I(uq9Var, "weex_v2_start", str, this.j.T().f() + "", "", "");
            if (this.g != null) {
                String b2 = pto.b(this.j.U());
                ryr.d(this.g.getContext(), b2, "gg_interactive_render_weex", null);
                com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().w(b2, com.taobao.tao.flexbox.layoutmanager.usertracker.a.CELL_RENDER_FINISH);
            }
        }
    }

    public final void o0(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6b77ea", new Object[]{this, view, new Boolean(z)});
        } else if (view == null) {
            FluidException.throwException(this.j.U(), ICardService.WEEX_INSTANCE_CREATE_VIEW_ERROR);
        } else {
            view.addOnAttachStateChangeListener(new d());
            p(view);
            view.setTag(((IMessageService) this.j.U().getService(IMessageService.class)).getMessageCenter());
            view.setId(R.id.fluid_sdk_weex_interactive_card);
            Q(d0(), view);
        }
    }

    @Override // tb.vx1, tb.lr9
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ir9.b("CardWeeXV2MessageHandler", "销毁weex实例");
        super.onDestroy();
        X();
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        v0(sj4.WEEX_STATE_NOT_CONSUME);
        ir9.b("CardWeeXV2MessageHandler", "onPause, getLogCardName=" + this.j.X());
        if (this.h != null) {
            ir9.b("CardWeeXV2MessageHandler", "onPause, musInstance onActivityPause");
            this.h.onActivityPause();
            if (!this.s) {
                ir9.b("CardWeeXV2MessageHandler", "onPause, musInstance onActivityStop");
                this.h.onActivityStop();
            }
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
            return;
        }
        ir9.b("CardWeeXV2MessageHandler", "onRealStart, getLogCardName=" + this.j.X());
        if (this.h != null && this.s) {
            ir9.b("CardWeeXV2MessageHandler", "onRealStart, musInstance onActivityStart");
            this.h.onActivityStart();
        }
    }

    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
            return;
        }
        ir9.b("CardWeeXV2MessageHandler", "onRealStop, getLogCardName=" + this.j.X());
        if (this.h != null && this.s) {
            ir9.b("CardWeeXV2MessageHandler", "onRealStop, musInstance onActivityStop");
            this.h.onActivityStop();
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
        } else {
            j0("weex onRefreshFailed", i, str);
        }
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
        } else {
            m0();
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ir9.b("CardWeeXV2MessageHandler", "onResume, getLogCardName=" + this.j.X());
        if (this.h != null) {
            if (!this.s) {
                ir9.b("CardWeeXV2MessageHandler", "onResume, musInstance onActivityStart");
                this.h.onActivityStart();
            }
            ir9.b("CardWeeXV2MessageHandler", "onResume, musInstance onActivityResume");
            this.h.onActivityResume();
        }
    }

    public final void q0(vrp vrpVar, boolean z, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797c13b3", new Object[]{this, vrpVar, new Boolean(z), aVar});
        } else if (this.h != null && s8x.d()) {
            ir9.b("CardWeeXV2MessageHandler", "checkTimeout timeout do rebuildWeex ," + b0());
            nwv.y0(new a(aVar, vrpVar, z));
        }
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910015c9", new Object[]{this});
        } else {
            this.h.setGestureEventListener(new f());
        }
    }

    public final void s0(List<vrp> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe71eaf5", new Object[]{this, list});
            return;
        }
        hmi messageCenter = ((IMessageService) this.j.U().getService(IMessageService.class)).getMessageCenter();
        if (list != null && !list.isEmpty()) {
            for (vrp vrpVar : list) {
                messageCenter.f(vrpVar);
            }
        }
        vrp vrpVar2 = this.q;
        if (vrpVar2 != null) {
            messageCenter.f(vrpVar2);
        }
    }

    public final void t0(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c83a25e", new Object[]{this, list});
        } else if (h0()) {
            ir9.b("CardWeeXV2MessageHandler", "weex预加载filterMessages为null 开始add 消息");
            this.f.addAll(list);
            if (!((HashSet) this.f).contains("VSMSG_supportGlobalMuteState")) {
                mfj.D(this.j.U(), "Weex");
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.l).iterator();
            while (it.hasNext()) {
                k93 k93Var = (k93) ((WeakReference) it.next()).get();
                if (k93Var != null) {
                    k93Var.S();
                    if (k93Var.e0()) {
                        arrayList.add(k93Var);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                pcw.v(this.l, (k93) it2.next());
            }
        }
    }

    public final void u0(vrp vrpVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f1935a", new Object[]{this, vrpVar});
        } else if (vrpVar != null && (i = this.e) != 3 && i != 4) {
            if (((ArrayList) this.f30309a).size() < 200) {
                ((ArrayList) this.f30309a).add(vrpVar);
                ir9.b("CardWeeXV2MessageHandler", "weexDelay，pendingMsg add" + vrpVar.toString());
                return;
            }
            ir9.b("CardWeeXV2MessageHandler", "pendingMsg reach 200");
        }
    }

    public final void v0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6cbcd0", new Object[]{this, str});
            return;
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup instanceof WeexConsumeLayout) {
            ((WeexConsumeLayout) viewGroup).setWeexConsume(str);
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31204ab7", new Object[]{this});
            return;
        }
        v0(sj4.WEEX_STATE_CONSUME);
        ViewGroup viewGroup = this.g;
        if (viewGroup instanceof WeexConsumeLayout) {
            ((WeexConsumeLayout) viewGroup).clearPendingEvent();
            this.g.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void W(vrp vrpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5561c", new Object[]{this, vrpVar, new Boolean(z)});
            return;
        }
        this.o = true;
        if (R(vrpVar, this.k)) {
            ir9.b("CardWeeXV2MessageHandler", "reusePreloadAsyncWeexInstance");
            return;
        }
        ir9.b("CardWeeXV2MessageHandler", "createWeexInstanceASync");
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        weexUnicornConfig.k(true);
        weexInstanceConfig.s(weexUnicornConfig);
        t5x b2 = com.taobao.android.weex.b.b(this.g.getContext(), this.k, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        if (this.g.getMeasuredWidth() > 0 && this.g.getMeasuredHeight() > 0) {
            b2.c(this.g.getMeasuredWidth(), this.g.getMeasuredHeight());
        }
        b2.initWithURL(this.k);
        b2.render(com.taobao.android.weex.b.e().b(U(this.j.U(), vrpVar, this.j)));
        b2.b(new b(vrpVar));
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13264f5", new Object[]{this});
            return;
        }
        this.r = false;
        v0(sj4.WEEX_STATE_NOT_CONSUME);
        ViewGroup viewGroup = this.g;
        if (viewGroup instanceof WeexConsumeLayout) {
            ((WeexConsumeLayout) viewGroup).doPendingEvent();
        }
    }

    @Override // tb.vx1, tb.lr9
    public void k(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff433aad", new Object[]{this, vrpVar});
        } else if (!"interact".equals(vrpVar.f30209a) || !vrpVar.c.equals("VSMSG_registerFilter")) {
            boolean equals = vrpVar.c.equals(vrp.MSG_DATA_CHANGE);
            com.taobao.android.weex_framework.a aVar = this.h;
            if (aVar == null && !this.o && equals) {
                this.q = vrpVar;
                g0(vrpVar);
            } else if (this.e == 2) {
                Y(aVar, new JSONObject(vrpVar.a()));
            } else {
                u0(vrpVar);
            }
        } else {
            List o = o(vrpVar);
            if (o != null) {
                ir9.b("CardWeeXV2MessageHandler", "weex预加载,handleMessage,收到MSG_REGISTER_FILTER_MESSAGES解析感兴趣的消息列表，array size:" + o.size());
                t0(o);
            }
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            return;
        }
        uq9 uq9Var = this.j;
        String str2 = this.k;
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.I(uq9Var, "weex_v2_runtime_exc", str2, this.j.P() + "", str, "");
        j0("weex onJSException", i, str);
        try {
            if (s8x.e() && str != null && str.contains("Weex js thread executed over")) {
                ir9.b("CardWeeXV2MessageHandler", "checkTimeout weex onJSException start rebuildWeex:".concat(str));
                q0(this.q, false, aVar);
                com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.V(this.j.U(), "weex_v2_pile_js_exception", str, 0L);
            }
        } catch (Throwable th) {
            ir9.b("CardWeeXV2MessageHandler", "weex onJSException rebuildWeex:" + th);
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.e = 3;
        uq9 uq9Var = this.j;
        String str2 = this.k;
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.I(uq9Var, "weex_v2_error", str2, this.j.T().f() + "", str, "");
        j0("weex onRenderFailed", i, str);
    }

    public final void p0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2be6b4", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.r = true;
            this.g.postDelayed(new l93(this), a0());
        } else {
            ir9.b("CardWeeXV2MessageHandler", "onGestureState runnable dopending:");
            Z();
        }
    }

    public final boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c22b2343", new Object[]{this})).booleanValue();
        }
        if (h0()) {
            ir9.b("CardWeeXV2MessageHandler", "weex预加载handlePendingMessage(),isFilterMessagesEmpty return");
            return false;
        }
        ir9.b("CardWeeXV2MessageHandler", "weex预加载handlePendingMessage(),paddingMsg size:" + ((ArrayList) this.f30309a).size() + "，state:" + this.e);
        if (this.e != 2 || ((ArrayList) this.f30309a).isEmpty()) {
            return false;
        }
        Iterator it = ((ArrayList) this.f30309a).iterator();
        while (it.hasNext()) {
            vrp vrpVar = (vrp) it.next();
            if (((HashSet) this.f).contains(vrpVar.c) && vrpVar.d.equals(this.b) && this.h != null) {
                ir9.b("CardWeeXV2MessageHandler", "weex2 ready fireEvent onShortVideoMessage handlePendingMessage " + vrpVar.toString() + "，args：" + vrpVar.h);
                Y(this.h, new JSONObject(vrpVar.a()));
            }
        }
        ((ArrayList) this.f30309a).clear();
        return true;
    }

    public final void f0(vrp vrpVar, boolean z) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83c9780", new Object[]{this, vrpVar, new Boolean(z)});
            return;
        }
        ir9.b("CardWeeXV2MessageHandler", "IdleTaskHelper weex 开始执行initWeexInstance --- ");
        uq9 uq9Var = this.j;
        if (uq9Var != null) {
            this.e = 1;
            if (this.g != null) {
                ryr.b(this.g.getContext(), pto.b(uq9Var.U()), "gg_interactive_render_weex");
            }
            ncp j = ((IDataService) this.j.U().getService(IDataService.class)).getConfig().j();
            if (j != null) {
                this.k = j.b;
            }
            if (TextUtils.isEmpty(this.k)) {
                this.e = 3;
                if (this.g != null) {
                    String b2 = pto.b(this.j.U());
                    ryr.c(this.g.getContext(), b2, "gg_interactive_render_weex", "layout error", null);
                    com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().w(b2, com.taobao.tao.flexbox.layoutmanager.usertracker.a.CELL_RENDER_FINISH);
                    return;
                }
                return;
            }
            V(vrpVar, z);
            StringBuilder sb = new StringBuilder("IdleTaskHelper 创建weex实例 position=");
            uq9 uq9Var2 = this.j;
            if (uq9Var2 != null) {
                obj = Integer.valueOf(uq9Var2.M());
            } else {
                obj = "null";
            }
            sb.append(obj);
            sb.append(b0());
            sb.append(c0());
            ir9.b("CardWeeXV2MessageHandler", sb.toString());
        }
    }

    @Override // tb.vx1, tb.lr9
    public boolean j(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36367361", new Object[]{this, vrpVar})).booleanValue();
        }
        if (vrpVar.c.equals("VSMSG_registerFilter")) {
            return "interact".equals(vrpVar.f30209a);
        }
        if (!h0()) {
            return ((HashSet) this.f).contains(vrpVar.c) && (vrpVar.d.equals(this.b) || "VSMSG_syncPageMap".equals(vrpVar.c) || "VSMSG_syncProcessMap".equals(vrpVar.c) || "VSMSG_listRefresh".equals(vrpVar.c));
        }
        if (!akt.p2("ShortVideo.fixMisMatchWeexId", true) || TextUtils.equals(vrpVar.d, this.b)) {
            return true;
        }
        ir9.b("CardWeeXV2MessageHandler", "message id not match return, msgId:" + vrpVar.d + " currentId:" + this.b);
        return false;
    }

    public final void m0() {
        Object obj;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            return;
        }
        boolean z2 = this.i;
        this.i = true;
        RenderTrackUtils.a(this.j.U(), RenderTrackUtils.renderEnd);
        FluidContext U = this.j.U();
        uq9 uq9Var = this.j;
        RenderTrackUtils.b(U, uq9Var, "interact_first_cost_weex", uq9Var.P());
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.I(this.j, "weex_v2_end", this.k, this.j.T().f() + "", "" + (SystemClock.elapsedRealtime() - this.n), "");
        v0(sj4.WEEX_STATE_NOT_CONSUME);
        S();
        e0();
        StringBuilder sb = new StringBuilder("weex onRenderSuccess ，instanceId=");
        com.taobao.android.weex_framework.a aVar = this.h;
        if (aVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(aVar.getInstanceId());
        }
        sb.append(obj);
        ir9.b("CardWeeXV2MessageHandler", sb.toString());
        if (this.j.M() == 0) {
            z = true;
        }
        if (!this.p && !z2 && z && !this.m) {
            i0(this.d);
        }
    }
}
