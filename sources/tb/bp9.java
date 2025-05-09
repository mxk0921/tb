package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.a;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import java.util.List;
import java.util.Map;
import tb.bp9;
import tb.oe8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bp9 extends ve8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final shx f16525a;
    public final String b;
    public final String c;
    public b d;
    public final Handler e;
    public final oe8 f;
    public final uhx g;
    public volatile boolean h = false;
    public volatile boolean i = false;
    public Runnable j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f16526a;

        public a(View view) {
            this.f16526a = view;
        }

        public final /* synthetic */ void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b729efb", new Object[]{this});
                return;
            }
            try {
                bp9.y(bp9.this).l();
                StateBaseModel f = bp9.x(bp9.this).j().f();
                whx.b(bp9.x(bp9.this), bp9.z(bp9.this), "expose", f.triggerActions);
                whx.b(bp9.x(bp9.this), bp9.z(bp9.this), "autoCountDown", f.triggerActions);
            } catch (Throwable th) {
                yv8.b("FloatWindowRenderEngine.onSwitchState.error", th);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            bp9.x(bp9.this).w(new Runnable() { // from class: tb.ap9
                @Override // java.lang.Runnable
                public final void run() {
                    bp9.a.this.b();
                }
            });
            this.f16526a.removeOnAttachStateChangeListener(this);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    static {
        t2o.a(435159069);
    }

    public bp9(Context context, shx shxVar, String str, String str2, Map<String, String> map, b bVar) {
        this.f16525a = shxVar;
        this.b = str;
        this.c = str2;
        this.d = bVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.e = handler;
        oe8 oe8Var = new oe8(context, handler, 1, this);
        this.f = oe8Var;
        this.g = new uhx(oe8Var);
        oe8Var.j().Y(map);
        B();
    }

    public static /* synthetic */ Object ipc$super(bp9 bp9Var, String str, Object... objArr) {
        if (str.hashCode() == -1533149278) {
            super.f((ComponentBaseModel) objArr[0], (String) objArr[1], (ActionModel) objArr[2], (List) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/desktoplinktask/floatwindow/content/FloatWindowRenderEngine");
    }

    public static /* synthetic */ oe8 x(bp9 bp9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oe8) ipChange.ipc$dispatch("b79ad89d", new Object[]{bp9Var});
        }
        return bp9Var.f;
    }

    public static /* synthetic */ uhx y(bp9 bp9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uhx) ipChange.ipc$dispatch("f2f14588", new Object[]{bp9Var});
        }
        return bp9Var.g;
    }

    public static /* synthetic */ shx z(bp9 bp9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shx) ipChange.ipc$dispatch("4e227f4c", new Object[]{bp9Var});
        }
        return bp9Var.f16525a;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.g.b();
        Runnable runnable = this.j;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
        }
        this.d = null;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16091b8", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.c)) {
            try {
                this.f.j().x().put("initServerParam", (Object) JSON.parseObject(this.c));
            } catch (Throwable unused) {
                yv8.a("NativeWidgetEngine.parseLaunchParam.error.", new Object[0]);
            }
            N(mg8.EVENT_HOVER, new JSONObject());
        }
    }

    public final /* synthetic */ void C(final boolean z, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d8f9ea", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        try {
            if (!this.f.j().B()) {
                K(new oe8.b() { // from class: tb.wo9
                    @Override // tb.oe8.b
                    public final void a(boolean z2) {
                        bp9.this.D(z, str, str2, z2);
                    }
                });
            }
        } catch (Throwable unused) {
            this.f.j().W(true);
            b bVar = this.d;
            if (bVar != null) {
                ((a.C0549a) bVar).k(this.f16525a, str, str2);
            }
        }
    }

    public final /* synthetic */ void D(boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527bb6c8", new Object[]{this, new Boolean(z), str, str2, new Boolean(z2)});
        } else if (!z || !z2) {
            this.f.j().W(true);
            b bVar = this.d;
            if (bVar != null) {
                ((a.C0549a) bVar).k(this.f16525a, str, str2);
            }
        } else {
            yv8.a("FloatWindowRenderEngine.needClose.runBeforeClose.interrupt=%s.", Boolean.valueOf(z2));
        }
    }

    public final /* synthetic */ void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e85f7e0", new Object[]{this});
        } else {
            this.f.b("AutoClose", "", false, null);
        }
    }

    public final /* synthetic */ void F(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6050479", new Object[]{this, str, jSONObject});
            return;
        }
        try {
            this.g.k(str, jSONObject);
        } catch (Throwable th) {
            yv8.b("onReceiveEvent.error.", th);
        }
    }

    public final /* synthetic */ void G(oe8.b bVar, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244b989c", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        oe8 oe8Var = this.f;
        boolean c = whx.c(oe8Var, this.f16525a, oe8Var.j().p().triggerActions);
        yv8.a("FloatWindowRenderEngine.runBeforeClose.handleBeforeClose.animateInterrupt=%s.actionInterrupt=%s", Boolean.valueOf(z), Boolean.valueOf(c));
        if (!z && !c) {
            z2 = false;
        }
        bVar.a(z2);
    }

    public final /* synthetic */ void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db31569c", new Object[]{this});
            return;
        }
        try {
            if (this.f.j().u() > 0 && !this.i) {
                this.f.s("LoadResOutOfTime", "");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* synthetic */ void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95716846", new Object[]{this});
            return;
        }
        try {
            me8 j = this.f.j();
            if (j.B()) {
                yv8.a("FloatWindowRenderEngine.tryDisplay.isEngineClosed.return.", new Object[0]);
                return;
            }
            ((a.C0549a) this.d).m(this.f16525a, this.g.c());
            this.g.j();
            whx.b(this.f, this.f16525a, "expose", j.p().triggerActions);
            whx.b(this.f, this.f16525a, "autoCountDown", j.p().triggerActions);
            long j2 = this.f.j().p().autoCloseTime;
            if (j2 >= 1000) {
                this.e.postDelayed(new Runnable() { // from class: tb.xo9
                    @Override // java.lang.Runnable
                    public final void run() {
                        bp9.this.E();
                    }
                }, j2);
            }
            p6o.b(this.f);
        } catch (Throwable th) {
            yv8.b("FloatWindowRenderEngine.tryDisplay.runInGlobalThread.error", th);
            this.f.s("LOAD_BITMAP_ERROR", String.valueOf(th.getMessage()));
        }
    }

    public void J(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ef08c9", new Object[]{this, str, jSONObject});
        } else {
            this.f.w(new Runnable() { // from class: tb.zo9
                @Override // java.lang.Runnable
                public final void run() {
                    bp9.this.F(str, jSONObject);
                }
            });
        }
    }

    public final void K(final oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a576ae9", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.g.i(new oe8.b() { // from class: tb.yo9
                @Override // tb.oe8.b
                public final void a(boolean z) {
                    bp9.this.G(bVar, z);
                }
            });
        }
    }

    public void L() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        yv8.a("DSLFetcher.fetchDSL.dsl=%s", this.b);
        if (TextUtils.isEmpty(this.b)) {
            this.f.s("DSL_EMPTY", "");
            return;
        }
        try {
            DSLModel dSLModel = (DSLModel) JSON.parseObject(this.b, DSLModel.class);
            if (!dSLModel.isValid()) {
                this.f.s("DSL_INVALID", "");
                return;
            }
            this.f.j().V(dSLModel);
            if (!af4.a(dSLModel.condition, this.f, true)) {
                this.f.t("DisplayConditionCheckNotPass", "", null);
                return;
            }
            Pair<StateModel, StateVersionModel> e = this.f.e(null, dSLModel.startStates, false, false);
            if (e == null || (obj = e.first) == null) {
                this.f.s("GetFirstStateVerFailed", "");
            } else if (this.g.e((StateModel) obj, (StateVersionModel) e.second) == null) {
                this.f.s("InitStateViewError", "");
            } else {
                this.h = true;
                M();
                if (!this.i) {
                    Runnable vo9Var = new Runnable() { // from class: tb.vo9
                        @Override // java.lang.Runnable
                        public final void run() {
                            bp9.this.H();
                        }
                    };
                    this.j = vo9Var;
                    this.e.postDelayed(vo9Var, 60000L);
                }
            }
        } catch (Throwable unused) {
            this.f.s("DSL_INVALID_CATCH_ERROR", "");
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb557f8e", new Object[]{this});
        } else if ((this.f.j().t() == 0 || this.f.j().u() <= 0) && !this.i && this.h && !this.f.j().B()) {
            this.i = true;
            this.f.x(new Runnable() { // from class: tb.uo9
                @Override // java.lang.Runnable
                public final void run() {
                    bp9.this.I();
                }
            });
        }
    }

    public void N(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de1edded", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject x = this.f.j().x();
        if (TextUtils.isEmpty(str) || !str.equals(mg8.EVENT_HIT_WALL)) {
            x.put("gestureStatus", (Object) str);
            x.put("gestureStatusParams", (Object) jSONObject);
            return;
        }
        x.put("lastHitWall", (Object) jSONObject);
    }

    @Override // tb.ve8, tb.oe8.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c832df14", new Object[]{this});
        } else {
            yv8.a("FloatWindowRenderEngine.onRenderStart", new Object[0]);
        }
    }

    @Override // tb.ve8, tb.oe8.a
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e720d97", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            this.f.j().W(true);
            ((a.C0549a) this.d).l(this.f16525a, str, str2);
            A();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.ve8, tb.oe8.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5949e8", new Object[]{this});
            return;
        }
        yv8.a("FloatWindowRenderEngine.onImageLoaded", new Object[0]);
        this.f.j().G();
        M();
    }

    @Override // tb.ve8, tb.oe8.a
    public void f(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49dffa2", new Object[]{this, componentBaseModel, str, actionModel, list});
            return;
        }
        super.f(componentBaseModel, str, actionModel, list);
        sex.n(this.f, this.f16525a, componentBaseModel, str, actionModel, list);
    }

    @Override // tb.ve8, tb.oe8.a
    public void g(final String str, final String str2, final boolean z, ell ellVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39842efd", new Object[]{this, str, str2, new Boolean(z), ellVar});
            return;
        }
        yv8.a("FloatWindowRenderEngine.needClose.reason=%s.closeMessage=%s.", str, str2);
        this.f.w(new Runnable() { // from class: tb.to9
            @Override // java.lang.Runnable
            public final void run() {
                bp9.this.C(z, str, str2);
            }
        });
    }

    @Override // tb.ve8, tb.oe8.a
    public View i(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4bde8dcc", new Object[]{this, stateModel, stateVersionModel});
        }
        return this.g.e(stateModel, stateVersionModel);
    }

    @Override // tb.ve8, tb.oe8.a
    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
        } else {
            b(str, str2, "");
        }
    }

    @Override // tb.ve8, tb.oe8.a
    public boolean m(List<String> list, List<String> list2, boolean z, boolean z2) {
        Object obj;
        View e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5b57ab4", new Object[]{this, list, list2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            yv8.a("needSwitchState.noTargetStateIds.return", new Object[0]);
            return false;
        }
        Pair<StateModel, StateVersionModel> e2 = this.f.e(list, list2, z, z2);
        if (e2 == null || (obj = e2.first) == null || (e = this.g.e((StateModel) obj, (StateVersionModel) e2.second)) == null) {
            return false;
        }
        ((a.C0549a) this.d).n(this.f16525a, e);
        e.addOnAttachStateChangeListener(new a(e));
        return true;
    }
}
