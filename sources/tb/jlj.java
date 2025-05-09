package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.track.UserResultTrack;
import com.alibaba.poplayer.track.module.ActionLineModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.tbpoplayer.nativerender.PopAction;
import com.taobao.tbpoplayer.nativerender.PreLoader;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.ListenEventModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.view.PopLayerWVPlugin;
import com.taobao.tbpoplayer.view.nativepop.PopLayerNativeView;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.h65;
import tb.jlj;
import tb.oe8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jlj implements oe8.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CUR_ENGINE_VERSION = "4.9.5";

    /* renamed from: a  reason: collision with root package name */
    public final oe8 f22053a;
    public final Handler c;
    public final com.alibaba.poplayer.trigger.a d;
    public final e g;
    public OnScreenChangedListener p;
    public boolean h = false;
    public String i = "";
    public String j = "";
    public Boolean k = null;
    public long l = 0;
    public volatile boolean m = false;
    public final AtomicInteger n = new AtomicInteger(0);
    public final AtomicInteger o = new AtomicInteger(0);
    public final ohm b = new ohm(this);
    public final PreLoader f = new PreLoader(this);
    public final h65 e = new h65();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements h65.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f22054a;

        public a(long j) {
            this.f22054a = j;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
            } else {
                jlj.D(jlj.this).s("FetchDSLFailed", str);
            }
        }

        public void b(DSLModel dSLModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5858da44", new Object[]{this, dSLModel});
                return;
            }
            jlj.E(jlj.this).k().Q = String.valueOf(SystemClock.elapsedRealtime() - this.f22054a);
            nsu.i(0, "track", jlj.E(jlj.this), "PopDSLFetched", "");
            jlj.D(jlj.this).j().V(dSLModel);
            jlj.G(jlj.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22055a;

        public b(View view) {
            this.f22055a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            jlj.D(jlj.this).w(new Runnable() { // from class: tb.klj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.b.this.b();
                }
            });
            this.f22055a.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }

        public final /* synthetic */ void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d43a69c", new Object[]{this});
                return;
            }
            try {
                wdm.d("reRenderStateOnScreenChange.onViewAttachedToWindow.onReRenderState", new Object[0]);
                jlj.D(jlj.this).r();
                me8 j = jlj.D(jlj.this).j();
                HashMap hashMap = new HashMap();
                hashMap.put("stateId", j.i());
                hashMap.put("stateVer", j.m());
                hashMap.put("stateIndex", String.valueOf(j.j()));
                qtv.r(jlj.E(jlj.this).k(), hashMap);
                jlj.F(jlj.this).N();
            } catch (Throwable th) {
                wdm.h("PopStateManager.onSwitchState.error", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22056a;

        public c(View view) {
            this.f22056a = view;
        }

        public final /* synthetic */ void b(me8 me8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23428554", new Object[]{this, me8Var});
                return;
            }
            try {
                jlj.F(jlj.this).P();
                jlj.D(jlj.this).r();
                UserResultTrack.a(jlj.E(jlj.this), "ExposeState", false, jlj.this.I());
                qtv.q(me8Var.w(), new ActionLineModule(me8Var.i(), me8Var.m(), me8Var.j()));
                StateBaseModel f = me8Var.f();
                sfu.b(jlj.D(jlj.this), "expose", true, f.triggerActions);
                sfu.b(jlj.D(jlj.this), "autoCountDown", true, f.triggerActions);
            } catch (Throwable th) {
                wdm.h("PopStateManager.onSwitchState.error", th);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            final me8 j = jlj.D(jlj.this).j();
            j.R(SystemClock.elapsedRealtime());
            jlj.D(jlj.this).w(new Runnable() { // from class: tb.llj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.c.this.b(j);
                }
            });
            this.f22056a.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
    }

    static {
        t2o.a(790626385);
        t2o.a(790626381);
    }

    public jlj(com.alibaba.poplayer.trigger.a aVar, Handler handler, e eVar) {
        this.d = aVar;
        this.c = handler;
        this.g = eVar;
        this.f22053a = new oe8(PopLayer.getReference().getApp(), handler, 0, this);
    }

    public static /* synthetic */ oe8 D(jlj jljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oe8) ipChange.ipc$dispatch("a6b0d6da", new Object[]{jljVar});
        }
        return jljVar.f22053a;
    }

    public static /* synthetic */ com.alibaba.poplayer.trigger.a E(jlj jljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.poplayer.trigger.a) ipChange.ipc$dispatch("3a40a5fc", new Object[]{jljVar});
        }
        return jljVar.d;
    }

    public static /* synthetic */ ohm F(jlj jljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ohm) ipChange.ipc$dispatch("fd686ecc", new Object[]{jljVar});
        }
        return jljVar.b;
    }

    public static /* synthetic */ void G(jlj jljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edac1dc1", new Object[]{jljVar});
        } else {
            jljVar.q0();
        }
    }

    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64e31501", new Object[]{this});
        }
        return this.i;
    }

    public JSONObject I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9b1d6359", new Object[]{this});
        }
        return this.f22053a.i();
    }

    public oe8 J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oe8) ipChange.ipc$dispatch("542ed55a", new Object[]{this});
        }
        return this.f22053a;
    }

    public String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
        }
        return this.j;
    }

    public PopLayerBaseView L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerBaseView) ipChange.ipc$dispatch("63fefc1b", new Object[]{this});
        }
        return (PopLayerBaseView) this.d.i();
    }

    public com.alibaba.poplayer.trigger.a M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.poplayer.trigger.a) ipChange.ipc$dispatch("86826e5d", new Object[]{this});
        }
        return this.d;
    }

    public final boolean O(DSLModel dSLModel, StateBaseModel stateBaseModel) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("769bdb15", new Object[]{this, dSLModel, stateBaseModel})).booleanValue();
        }
        if (!"gradual".equals(dSLModel.displayMode) || !"center".equals(stateBaseModel.layout)) {
            return false;
        }
        if (ABGlobal.isFeatureOpened(PopLayer.getReference().getApp(), "android_poplayer_native_dl_gradual_display") && (list = dSLModel.gradualDeviceLevel) != null && !list.isEmpty()) {
            String c2 = vem.c();
            if (!TextUtils.isEmpty(c2) && !list.contains(c2)) {
                return false;
            }
        }
        return ABGlobal.isFeatureOpened(PopLayer.getReference().getApp(), "android_poplayer_native_gradual_display");
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue();
        }
        if (this.f22053a.j().B() || L() == null || L().isClosed()) {
            return true;
        }
        return false;
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("331b7fe2", new Object[]{this})).booleanValue();
        }
        if (L() == null || !L().isDisplaying()) {
            return false;
        }
        return true;
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fe688a8", new Object[]{this})).booleanValue();
        }
        return Boolean.TRUE.equals(this.k);
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873f9e90", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final /* synthetic */ void U(jl1 jl1Var, int i, Configuration configuration) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1659af", new Object[]{this, jl1Var, new Integer(i), configuration});
            return;
        }
        if (1 == i) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (jl1Var.d(z)) {
                wdm.d("OnScreenChanged.changeType=%s.curPortraitMode=%s", Integer.valueOf(i), Boolean.valueOf(z));
                r0();
            }
        } catch (Throwable th) {
            wdm.h("OnScreenChanged.OnScreenChangedListener.error", th);
        }
    }

    public final /* synthetic */ void V(ell ellVar, final boolean z, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7fba9a", new Object[]{this, ellVar, new Boolean(z), str, str2});
            return;
        }
        try {
            if (L() != null && L().isClosed()) {
                return;
            }
            if (this.f22053a.j().C()) {
                wdm.d("NativePopEngine.needClose.runBeforeClose.isEnginePreClosing=true.cancel", new Object[0]);
                return;
            }
            this.f22053a.j().X(true);
            c(ellVar);
            s0(new oe8.b() { // from class: tb.flj
                @Override // tb.oe8.b
                public final void a(boolean z2) {
                    jlj.this.Y(z, str, str2, z2);
                }
            });
        } catch (Throwable unused) {
            if (this.g != null) {
                this.f22053a.j().W(true);
                ((PopLayerNativeView.a) this.g).l(str, str2);
            }
            l0();
        }
    }

    public final /* synthetic */ void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88acc414", new Object[]{this});
            return;
        }
        try {
            L().hide();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* synthetic */ void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c6e8e3", new Object[]{this});
            return;
        }
        try {
            L().show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* synthetic */ void Y(boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e58512", new Object[]{this, new Boolean(z), str, str2, new Boolean(z2)});
        } else if (!z || !z2) {
            if (this.g != null) {
                this.f22053a.j().W(true);
                ((PopLayerNativeView.a) this.g).l(str, str2);
            }
            l0();
        } else {
            wdm.d("NativePopEngine.needClose.runBeforeClose.interrupt=%s", Boolean.valueOf(z2));
        }
    }

    public final /* synthetic */ void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ba852b", new Object[]{this});
            return;
        }
        try {
            m0();
            this.b.K();
            p6o.b(this.f22053a);
            this.f.e(this.f22053a.j().p());
        } catch (Throwable th) {
            wdm.h("NativePopEngine.tryDisplay.runInGlobalThread.error", th);
        }
    }

    @Override // tb.oe8.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c832df14", new Object[]{this});
        }
    }

    public final /* synthetic */ void a0() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b876f1e8", new Object[]{this});
            return;
        }
        try {
            DSLModel p = this.f22053a.j().p();
            if (p.neverShow) {
                this.d.b();
            } else if (p.countTire) {
                z = true;
            }
            n0();
            if (L() != null) {
                L().displayMe(z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* synthetic */ void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f9471c", new Object[]{this});
        } else {
            this.f22053a.b("AutoClose", "", false, null);
        }
    }

    public final /* synthetic */ void c0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3724b713", new Object[]{this, str, str2});
            return;
        }
        try {
            this.b.O(str, JSON.parseObject(str2));
        } catch (Throwable th) {
            wdm.h("NativePopEngine.onReceiveEvent.error.", th);
        }
    }

    @Override // tb.oe8.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5949e8", new Object[]{this});
        } else if (this.f22053a.j().E()) {
            wdm.d("NativePopEngine.onImageLoaded", new Object[0]);
            this.o.decrementAndGet();
            if (S()) {
                w0();
            } else {
                v0();
            }
        }
    }

    @Override // tb.oe8.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f250e77f", new Object[]{this});
        } else {
            this.c.post(new Runnable() { // from class: tb.wkj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.W();
                }
            });
        }
    }

    public final /* synthetic */ void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc08c650", new Object[]{this});
            return;
        }
        try {
            if (this.o.get() > 0 && !R()) {
                this.f22053a.s("LoadResOutOfTime", "");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.oe8.a
    public void f(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49dffa2", new Object[]{this, componentBaseModel, str, actionModel, list});
        } else {
            PopAction.A(this, componentBaseModel, str, actionModel, list);
        }
    }

    public final /* synthetic */ void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865c77ec", new Object[]{this});
            return;
        }
        try {
            P();
            nlj nljVar = new nlj();
            this.d.k().getClass();
            this.f22053a.j().c0(nljVar);
            String N = N(this.d);
            if (!TextUtils.isEmpty(N)) {
                this.f22053a.t("EnvInitFailed", N, "");
            } else {
                this.e.a(this, new a(SystemClock.elapsedRealtime()));
            }
        } catch (Throwable th) {
            wdm.h("NativePopEngine.start.error.", th);
            this.f22053a.s("EngineStartFailed", "");
        }
    }

    @Override // tb.oe8.a
    public void g(final String str, final String str2, final boolean z, final ell ellVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39842efd", new Object[]{this, str, str2, new Boolean(z), ellVar});
        } else {
            this.f22053a.w(new Runnable() { // from class: tb.clj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.V(ellVar, z, str, str2);
                }
            });
        }
    }

    public final /* synthetic */ void g0() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9788e56c", new Object[]{this});
            return;
        }
        try {
            DSLModel p = this.f22053a.j().p();
            if (p.neverShow) {
                this.d.b();
            } else if (p.countTire) {
                z = true;
            }
            n0();
            if (L() != null) {
                L().displayMe(z);
            }
            this.f22053a.w(new Runnable() { // from class: tb.zkj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.Z();
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.oe8.a
    public void h(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf5cf8e", new Object[]{this, rect});
        } else {
            ((PopLayerNativeView.a) this.g).k(rect);
        }
    }

    public final /* synthetic */ void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6935bf9", new Object[]{this});
            return;
        }
        try {
            m0();
            this.b.L();
            UserResultTrack.a(this.d, UserResultTrack.USER_RESULT_EXPOSE_REAL, false, I());
            p6o.b(this.f22053a);
            this.f.e(this.f22053a.j().p());
        } catch (Throwable th) {
            wdm.h("NativePopEngine.tryGradualExpose.error.", th);
        }
    }

    @Override // tb.oe8.a
    public View i(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4bde8dcc", new Object[]{this, stateModel, stateVersionModel});
        }
        return this.b.R(stateModel, stateVersionModel, 2);
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e68cd0", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        List<ListenEventModel> list = this.f22053a.j().p().listenEvents;
        if (list != null) {
            for (ListenEventModel listenEventModel : list) {
                if (listenEventModel != null && listenEventModel.isValid()) {
                    hashMap.put(listenEventModel.sourceName, new HashSet(listenEventModel.eventName));
                }
            }
        }
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                rgm.h().g(str, (Set) hashMap.get(str), M().O(), L());
                if (this.d.L().source == 5) {
                    AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq("PopHub", "poplayer").a(PopLayer.getReference().internalGetCurrentActivity()));
                    this.f22053a.j().K(abilityHubAdapter);
                    wsr.e(abilityHubAdapter, this.d.O());
                }
            }
        }
    }

    @Override // tb.oe8.a
    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
        } else {
            b(str, str2, "");
        }
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        } else {
            this.b.E();
        }
    }

    @Override // tb.oe8.a
    public String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91851dbe", new Object[]{this, str});
        }
        String str2 = this.f22053a.j().p().spm;
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("spm", str2);
            str = plj.b(str, hashMap);
        }
        return this.f.d(str);
    }

    public void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
        } else {
            this.b.F();
        }
    }

    @Override // tb.oe8.a
    public boolean l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3d08399", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            return this.b.H(str, str2);
        } catch (Throwable th) {
            wdm.h("NativePopEngine.componentBroadcast.error.", th);
            return false;
        }
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.p != null) {
            TBAutoSizeConfig.x().h0(this.p);
            this.p = null;
        }
        if (this.d.L().source == 5) {
            wsr.f(this.f22053a.j().b(), this.d.O());
        }
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd49e27a", new Object[]{this});
            return;
        }
        me8 j = this.f22053a.j();
        j.U(true);
        com.alibaba.poplayer.trigger.a aVar = this.d;
        if (aVar != null) {
            aVar.k().R = String.valueOf(SystemClock.elapsedRealtime() - this.l);
        }
        j.R(SystemClock.elapsedRealtime());
        qtv.q(j.w(), new ActionLineModule(j.i(), j.m(), j.j()));
        DSLModel p = j.p();
        long j2 = p.autoCloseTime;
        if (j2 >= 1000) {
            this.c.postDelayed(new Runnable() { // from class: tb.ykj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.b0();
                }
            }, j2);
        }
        StateBaseModel f = j.f();
        sfu.b(this.f22053a, "expose", false, p.triggerActions);
        sfu.b(this.f22053a, "autoCountDown", false, p.triggerActions);
        sfu.b(this.f22053a, "expose", true, f.triggerActions);
        sfu.b(this.f22053a, "autoCountDown", true, f.triggerActions);
        f(j.k(), "expose", null, p.displayActions);
    }

    @Override // tb.oe8.a
    public boolean n(boolean z, List<String> list) {
        Pair<StateModel, StateVersionModel> pair;
        Object obj;
        View R;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd6ba627", new Object[]{this, new Boolean(z), list})).booleanValue();
        }
        if (z) {
            oe8 oe8Var = this.f22053a;
            pair = oe8Var.e(null, oe8Var.j().p().startStates, false, false);
        } else {
            pair = this.f22053a.e(null, list, false, false);
        }
        if (pair == null || (obj = pair.first) == null || (R = this.b.R((StateModel) obj, (StateVersionModel) pair.second, 3)) == null || Q()) {
            return false;
        }
        R.addOnAttachStateChangeListener(new b(R));
        ((PopLayerNativeView.a) this.g).m(R);
        return true;
    }

    public final void n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d707ab5", new Object[]{this});
        } else {
            this.f22053a.r();
        }
    }

    @Override // tb.oe8.a
    public void needShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47da8fba", new Object[]{this});
        } else {
            this.c.post(new Runnable() { // from class: tb.xkj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.X();
                }
            });
        }
    }

    @Override // tb.oe8.a
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0b6af", new Object[]{this});
        } else if (this.f22053a.j().E()) {
            wdm.d("NativePopEngine.onCloseBtnLoaded", new Object[0]);
            this.o.decrementAndGet();
            if (S()) {
                this.c.post(new Runnable() { // from class: tb.glj
                    @Override // java.lang.Runnable
                    public final void run() {
                        jlj.this.a0();
                    }
                });
                w0();
                return;
            }
            v0();
        }
    }

    public void o0(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
        } else {
            this.f22053a.w(new Runnable() { // from class: tb.alj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.c0(str, str2);
                }
            });
        }
    }

    public void p0(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82b77cd", new Object[]{this, str});
        } else {
            this.f22053a.w(new Runnable() { // from class: tb.vkj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.d0(str);
                }
            });
        }
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b26584a", new Object[]{this});
            return;
        }
        View R = this.b.R(this.f22053a.j().k(), this.f22053a.j().n(), 2);
        if (R == null) {
            this.f22053a.s("reRenderStateViewError", "");
        } else if (!Q()) {
            R.addOnAttachStateChangeListener(new d(R));
            ((PopLayerNativeView.a) this.g).m(R);
        }
    }

    public final void s0(oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a576ae9", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.b.G(bVar);
        }
    }

    public void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5c7b6a", new Object[]{this, new Integer(i)});
            return;
        }
        wdm.d("NativePopEngine.setFirstStateResCount.start.count=%s", Integer.valueOf(i));
        this.n.set(i);
        this.o.set(i);
        wdm.d("NativePopEngine.setFirstStateResCount.done.count=%s", Integer.valueOf(i));
    }

    public void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.g != null) {
            this.f22053a.w(new Runnable() { // from class: tb.blj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.f0();
                }
            });
        }
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb557f8e", new Object[]{this});
        } else if ((this.n.get() == 0 || (!S() && this.o.get() <= 0)) && !Q() && !R() && this.m) {
            this.f22053a.x(new Runnable() { // from class: tb.hlj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.g0();
                }
            });
        }
    }

    public final void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc5edc2", new Object[]{this});
        } else if (S() && this.o.get() <= 0 && !Q() && this.m) {
            this.f22053a.w(new Runnable() { // from class: tb.ilj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.this.h0();
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22057a;

        public d(View view) {
            this.f22057a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            jlj.D(jlj.this).w(new Runnable() { // from class: tb.mlj
                @Override // java.lang.Runnable
                public final void run() {
                    jlj.d.this.b();
                }
            });
            this.f22057a.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }

        public final /* synthetic */ void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1edc5039", new Object[]{this});
                return;
            }
            try {
                wdm.d("reRenderStateOnScreenChange.onViewAttachedToWindow.onReRenderState", new Object[0]);
                jlj.F(jlj.this).N();
                StateBaseModel f = jlj.D(jlj.this).j().f();
                if (vem.g(jlj.D(jlj.this).j().e())) {
                    sfu.b(jlj.this.J(), sfu.TRIGGER_FOLD_ADD, true, f.triggerActions);
                } else if (vem.h(jlj.D(jlj.this).j().e())) {
                    sfu.b(jlj.this.J(), sfu.TRIGGER_PAD_ADD, true, f.triggerActions);
                }
            } catch (Throwable th) {
                wdm.h("PopStateManager.onSwitchState.error", th);
            }
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16091b8", new Object[]{this});
            return;
        }
        JSONObject x = this.f22053a.j().x();
        try {
            x.put(ConstantsAPI.Token.WX_LAUNCH_PARAM_KEY, (Object) JSON.parseObject(this.d.N()));
        } catch (Throwable unused) {
            wdm.d("NativePopEngine.parseLaunchParam.error.", new Object[0]);
        }
        try {
            x.put("preCheck", (Object) new JSONObject(this.d.l()));
        } catch (Throwable unused2) {
            wdm.d("NativePopEngine.parsePreCheck.error.", new Object[0]);
        }
        try {
            Uri parse = Uri.parse(this.d.N());
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            JSONObject jSONObject = new JSONObject();
            for (String str : queryParameterNames) {
                jSONObject.put(str, (Object) parse.getQueryParameter(str));
            }
            x.put("launchParamQuery", (Object) jSONObject);
        } catch (Throwable unused3) {
            wdm.d("NativePopEngine.parseLaunchParamQuery.error.", new Object[0]);
        }
    }

    @Override // tb.oe8.a
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e720d97", new Object[]{this, str, str2, str3});
        } else if (!Q()) {
            this.f22053a.j().W(true);
            DSLModel p = this.f22053a.j().p();
            if (TextUtils.isEmpty(str3)) {
                if (p == null || TextUtils.isEmpty(p.defaultToastText)) {
                    str3 = "活动太火爆啦 弹窗一时没加载出来";
                } else {
                    str3 = p.defaultToastText;
                }
            }
            ((PopLayerNativeView.a) this.g).n(str, str2, str3);
            l0();
        }
    }

    public final /* synthetic */ void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0f67d5", new Object[]{this, str});
            return;
        }
        try {
            this.f22053a.j().J();
            StateBaseModel f = this.f22053a.j().f();
            if ("embedAdd".equals(str)) {
                sfu.b(this.f22053a, "embedAdd", true, f.triggerActions);
            } else if ("appModeAdd".equals(str)) {
                sfu.b(this.f22053a, "appModeAdd", true, f.triggerActions);
            }
            this.b.Q();
        } catch (Throwable th) {
            wdm.h("onViewAdded.error", th);
        }
    }

    public String N(com.alibaba.poplayer.trigger.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b7b9e8a", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return "INIT_ERROR_REQUEST_NULL";
        }
        BaseConfigItem K = aVar.K();
        if (K == null) {
            return "INIT_ERROR_CONFIG_NULL";
        }
        me8 j = this.f22053a.j();
        j.Z(aVar.O());
        j.f0(aVar.n());
        j.g0(aVar.L().getTraceInfo());
        j.e0(aVar);
        j.d0(aVar.k());
        j.b0(aVar.k().f2533a);
        Context e2 = j.e();
        JSONObject parseObject = JSON.parseObject(K.params);
        String string = parseObject.getString("cdnUrl");
        String string2 = parseObject.getString("url");
        String string3 = parseObject.getString("cdnId");
        String string4 = parseObject.getString(pl4.KEY_PAGE_ID);
        j.i0(string2);
        HashMap hashMap = new HashMap();
        hashMap.put("WVPopLayer", new PopLayerWVPlugin(L()));
        this.f22053a.B(new kmj(new hmj(e2, L(), hashMap, string2)));
        if (!TextUtils.isEmpty(string)) {
            this.i = string;
            this.h = true;
        } else {
            if (TextUtils.isEmpty(string3)) {
                string3 = vem.e(string2, "cdnId");
            }
            if (!TextUtils.isEmpty(string3)) {
                this.i = "https://poplayer.template.alibaba.com/" + string3 + q2s.JSON;
                this.h = true;
            } else {
                if (TextUtils.isEmpty(string4)) {
                    string4 = vem.e(string2, pl4.KEY_PAGE_ID);
                }
                this.h = false;
                if (TextUtils.isEmpty(string4)) {
                    return "INIT_ERROR_PAGE_ID_NULL";
                }
                this.j = string4;
            }
        }
        if (!a9l.w().a0()) {
            return "";
        }
        boolean T = TBAutoSizeConfig.x().T(e2);
        final jl1 g = this.f22053a.g();
        wdm.d("setPortraitMode.isPortraitLayout=%s", Boolean.valueOf(T));
        if (!vem.g(e2) && !vem.h(e2)) {
            return "";
        }
        this.p = new OnScreenChangedListener() { // from class: tb.dlj
            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                guk.a(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public final void onScreenChanged(int i, Configuration configuration) {
                jlj.this.U(g, i, configuration);
            }
        };
        TBAutoSizeConfig.x().d0(this.p);
        return "";
    }

    @Override // tb.oe8.a
    public boolean m(List<String> list, List<String> list2, boolean z, boolean z2) {
        Object obj;
        View R;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5b57ab4", new Object[]{this, list, list2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            wdm.d("needSwitchState.noTargetStateIds.return", new Object[0]);
            return false;
        }
        Pair<StateModel, StateVersionModel> e2 = this.f22053a.e(list, list2, z, z2);
        if (e2 == null || (obj = e2.first) == null || (R = this.b.R((StateModel) obj, (StateVersionModel) e2.second, 1)) == null) {
            return false;
        }
        ((PopLayerNativeView.a) this.g).p(R);
        R.addOnAttachStateChangeListener(new c(R));
        return true;
    }

    public final void q0() {
        Object obj;
        StateBaseModel stateBaseModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8016cc2", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f22053a.d();
        this.d.k().S = String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
        if (!Q()) {
            nsu.i(0, "track", this.d, "PopPreRequested", "");
            DSLModel p = this.f22053a.j().p();
            if (!af4.a(p.condition, this.f22053a, true)) {
                if (p.conditionFalseNeverShow) {
                    this.d.b();
                } else if (p.conditionFalseCountTire) {
                    this.d.r();
                }
                this.f22053a.t("DisplayConditionCheckNotPass", "", null);
                return;
            }
            i0();
            Pair<StateModel, StateVersionModel> e2 = this.f22053a.e(null, p.startStates, false, false);
            if (e2 == null || (obj = e2.first) == null) {
                if (p.conditionFalseNeverShow) {
                    this.d.b();
                } else if (p.conditionFalseCountTire) {
                    this.d.r();
                }
                this.f22053a.s("GetFirstStateVerFailed", "");
                return;
            }
            Object obj2 = e2.second;
            if (obj2 != null) {
                stateBaseModel = (StateBaseModel) obj2;
            } else {
                stateBaseModel = (StateBaseModel) obj;
            }
            this.k = Boolean.valueOf(O(p, stateBaseModel));
            if (!Q()) {
                this.l = SystemClock.elapsedRealtime();
                View R = this.b.R((StateModel) e2.first, (StateVersionModel) e2.second, 0);
                if (R == null) {
                    this.f22053a.s("InitStateViewError", "");
                } else if (!Q()) {
                    ((PopLayerNativeView.a) this.g).o(R);
                    this.m = true;
                    if (S()) {
                        w0();
                    } else {
                        v0();
                    }
                    if (!R()) {
                        this.c.postDelayed(new Runnable() { // from class: tb.elj
                            @Override // java.lang.Runnable
                            public final void run() {
                                jlj.this.e0();
                            }
                        }, 60000L);
                    }
                }
            }
        }
    }

    @Override // tb.oe8.a
    public void c(ell ellVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87054ab9", new Object[]{this, ellVar});
        } else if (ellVar != null) {
            try {
                JSONObject jSONObject = M().k().w0;
                JSONArray jSONArray = jSONObject.getJSONArray("actionLine");
                if (jSONArray == null) {
                    jSONArray = new JSONArray();
                    jSONObject.put("actionLine", (Object) jSONArray);
                }
                me8 j = this.f22053a.j();
                if (!j.z()) {
                    JSONObject jSONObject2 = new JSONObject();
                    String f = ellVar.f();
                    String str = "";
                    if (TextUtils.isEmpty(f)) {
                        f = str;
                    }
                    jSONObject2.put("id", (Object) f);
                    if (!TextUtils.isEmpty(ellVar.h())) {
                        str = ellVar.h();
                    }
                    jSONObject2.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, (Object) str);
                    jSONObject2.put("stateIndex", (Object) Integer.valueOf(ellVar.g()));
                    jSONObject2.put("componentId", (Object) ellVar.c());
                    jSONObject2.put("type", (Object) ellVar.a());
                    jSONObject2.put("behavior", (Object) ellVar.b());
                    jSONObject2.put("exceptionMessage", (Object) ellVar.e());
                    jSONObject2.put("duration", (Object) Long.valueOf(ellVar.d()));
                    jSONArray.add(jSONObject2);
                    j.F();
                    wdm.d("syncPageLine.actionComponentId=%s.actionLine=%s.exceptionMessage=%s", ellVar.c(), jSONArray, ellVar.e());
                }
            } catch (Throwable th) {
                wdm.h("syncPageLine.error.", th);
            }
        }
    }
}
