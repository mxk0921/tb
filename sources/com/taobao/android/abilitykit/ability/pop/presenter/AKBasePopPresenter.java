package com.taobao.android.abilitykit.ability.pop.presenter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.AKPopContainer;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.gxv;
import tb.h9;
import tb.hab;
import tb.iih;
import tb.n9;
import tb.pg1;
import tb.pr;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AKBasePopPresenter<PARAMS extends h9, CONTEXT extends n9> implements hab<PARAMS, CONTEXT>, a.AbstractC0327a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final b j = new b();

    /* renamed from: a  reason: collision with root package name */
    public hab.a f6256a;
    public com.taobao.android.abilitykit.ability.pop.render.a<PARAMS, CONTEXT> b;
    public IAKPopRender<PARAMS, CONTEXT> c;
    public JSONObject d;
    public String e;
    public WeakReference<Context> f;
    public CONTEXT g;
    public PARAMS h;
    public Application.ActivityLifecycleCallbacks i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(336592998);
        }

        public a() {
        }

        public static final /* synthetic */ b a(a aVar, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("88f7c626", new Object[]{aVar, context});
            }
            return aVar.d(context);
        }

        @JvmStatic
        public final boolean b(Context context, String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("276a3125", new Object[]{this, context, str, jSONObject})).booleanValue();
            }
            AKBasePopPresenter<?, ?> c = d(context).c(str);
            if (c == null) {
                return false;
            }
            c.a(jSONObject, true);
            return true;
        }

        @JvmStatic
        public final boolean c(Context context, String str, JSONObject jSONObject, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c5dca5d7", new Object[]{this, context, str, jSONObject, new Boolean(z)})).booleanValue();
            }
            AKBasePopPresenter<?, ?> c = d(context).c(str);
            if (c == null) {
                return false;
            }
            c.a(jSONObject, z);
            return true;
        }

        public final b d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("18db6c41", new Object[]{this, context});
            }
            return AKBasePopPresenter.f();
        }

        @JvmStatic
        public final AKBasePopPresenter<?, ?> e(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AKBasePopPresenter) ipChange.ipc$dispatch("3651f55b", new Object[]{this, context, str});
            }
            return d(context).c(str);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final LinkedList<AKBasePopPresenter<?, ?>> f6257a = new LinkedList<>();

        static {
            t2o.a(336592999);
        }

        public final void a(AKBasePopPresenter<?, ?> aKBasePopPresenter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6d40990", new Object[]{this, aKBasePopPresenter});
                return;
            }
            ckf.g(aKBasePopPresenter, "p");
            this.f6257a.addFirst(aKBasePopPresenter);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(g1a<? super AKBasePopPresenter<?, ?>, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d138f99c", new Object[]{this, g1aVar});
                return;
            }
            ckf.g(g1aVar, pg1.ATOM_EXT_block);
            for (Object obj : this.f6257a) {
                g1aVar.invoke(obj);
            }
        }

        public final AKBasePopPresenter<?, ?> c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AKBasePopPresenter) ipChange.ipc$dispatch("497adecd", new Object[]{this, str});
            }
            if (str == null && !this.f6257a.isEmpty()) {
                return this.f6257a.peek();
            }
            for (AKBasePopPresenter<?, ?> aKBasePopPresenter : this.f6257a) {
                if (ckf.b(AKBasePopPresenter.i(aKBasePopPresenter), str)) {
                    return aKBasePopPresenter;
                }
            }
            return null;
        }

        public final AKBasePopPresenter<?, ?> d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AKBasePopPresenter) ipChange.ipc$dispatch("c4a2df5f", new Object[]{this, str});
            }
            if (str == null) {
                return this.f6257a.pop();
            }
            AKBasePopPresenter<?, ?> c = c(str);
            if (c == null) {
                return null;
            }
            this.f6257a.remove(c);
            return c;
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("18037860", new Object[]{this})).intValue();
            }
            return this.f6257a.size();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements hab.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public c(Ref$BooleanRef ref$BooleanRef, h9 h9Var, n9 n9Var, View view, b bVar, Context context) {
            this.b = view;
        }

        @Override // tb.hab.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
            } else {
                AKBasePopPresenter.this.t();
            }
        }

        @Override // tb.hab.a
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30c32fff", new Object[]{this, jSONObject});
            } else {
                AKBasePopPresenter.this.u();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public d(Ref$BooleanRef ref$BooleanRef, h9 h9Var, n9 n9Var, View view, b bVar, Context context) {
            this.b = view;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            n9 g = AKBasePopPresenter.g(AKBasePopPresenter.this);
            if (ckf.b(activity, g != null ? g.d() : null)) {
                try {
                    iih.INSTANCE.a("stdPopTag", "onActivityDestroyed release pop");
                    AKBasePopPresenter.this.k();
                } catch (Throwable th) {
                    iih iihVar = iih.INSTANCE;
                    iihVar.a("stdPopTag", "onDismissed error when activity destroy: " + pr.d(th));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }
    }

    static {
        t2o.a(336592997);
        t2o.a(336593010);
        t2o.a(336593035);
    }

    public static final /* synthetic */ b f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bf655c3d", new Object[0]);
        }
        return j;
    }

    public static final /* synthetic */ n9 g(AKBasePopPresenter aKBasePopPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n9) ipChange.ipc$dispatch("b97fb782", new Object[]{aKBasePopPresenter});
        }
        return aKBasePopPresenter.g;
    }

    public static final /* synthetic */ com.taobao.android.abilitykit.ability.pop.render.a h(AKBasePopPresenter aKBasePopPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.abilitykit.ability.pop.render.a) ipChange.ipc$dispatch("b7c6f168", new Object[]{aKBasePopPresenter});
        }
        return aKBasePopPresenter.b;
    }

    public static final /* synthetic */ String i(AKBasePopPresenter aKBasePopPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16876055", new Object[]{aKBasePopPresenter});
        }
        return aKBasePopPresenter.e;
    }

    @JvmStatic
    public static final boolean j(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("276a3125", new Object[]{context, str, jSONObject})).booleanValue();
        }
        return Companion.b(context, str, jSONObject);
    }

    @JvmStatic
    public static final AKBasePopPresenter<?, ?> q(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AKBasePopPresenter) ipChange.ipc$dispatch("3651f55b", new Object[]{context, str});
        }
        return Companion.e(context, str);
    }

    @Override // tb.hab
    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8eef3b5", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        this.d = jSONObject;
        if (z) {
            com.taobao.android.abilitykit.ability.pop.render.a<PARAMS, CONTEXT> aVar = this.b;
            if (aVar != null) {
                aVar.doDismissAnimation();
                return;
            }
            return;
        }
        k();
    }

    @Override // tb.hab
    public void b(hab.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c993be91", new Object[]{this, aVar});
        } else {
            this.f6256a = aVar;
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a.AbstractC0327a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a396841", new Object[]{this});
        } else {
            k();
        }
    }

    @Override // tb.hab
    public void changeGravity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ee188f", new Object[]{this, str});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.render.a<PARAMS, CONTEXT> aVar = this.b;
        if (aVar != null) {
            aVar.changeGravity(str);
        }
    }

    @Override // tb.hab
    public void changeSize(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d485c7fc", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.render.a<PARAMS, CONTEXT> aVar = this.b;
        if (aVar != null) {
            aVar.changeSize(f, f2, z);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a.AbstractC0327a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899872ed", new Object[]{this});
        }
    }

    public abstract void k();

    public abstract boolean l(PARAMS params, View view, View view2, View view3, hab.a aVar);

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c007c75", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.render.a<PARAMS, CONTEXT> aVar = this.b;
        if (aVar != null) {
            aVar.enableCorner(z);
        }
    }

    public final WeakReference<Context> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("ba457c50", new Object[]{this});
        }
        return this.f;
    }

    public final PARAMS o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PARAMS) ((h9) ipChange.ipc$dispatch("fee44a81", new Object[]{this}));
        }
        return this.h;
    }

    public final IAKPopRender<PARAMS, CONTEXT> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAKPopRender) ipChange.ipc$dispatch("96ac922b", new Object[]{this});
        }
        return this.c;
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b611c1", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.render.a<PARAMS, CONTEXT> aVar = this.b;
        if (aVar == null || !aVar.shouldIgnoreNotifyLevelChange()) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = false;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = 0;
            a.a(Companion, null).b(new AKBasePopPresenter$notifyPopLevelChange$1(ref$IntRef, z, ref$BooleanRef));
        }
    }

    public final void s(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448a16c4", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "state");
        a.a(Companion, null).b(new AKBasePopPresenter$notifyPopWindowStateChanged$1(str, jSONObject));
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6e6bb", new Object[]{this});
            return;
        }
        hab.a aVar = this.f6256a;
        if (aVar != null) {
            aVar.a(this.d);
        }
    }

    public final void v(IAKPopRender<PARAMS, CONTEXT> iAKPopRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aacd20c8", new Object[]{this, iAKPopRender});
            return;
        }
        ckf.g(iAKPopRender, "render");
        this.c = iAKPopRender;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb13111", new Object[]{this});
            return;
        }
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.i;
        if (activityLifecycleCallbacks != null) {
            iih.INSTANCE.a("stdPopTag", "onDismissed unregisterActivityLifecycleCallbacks");
            CONTEXT context = this.g;
            Context d2 = context != null ? context.d() : null;
            if (d2 != null) {
                ((Activity) d2).getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
        }
        if (this.e != null) {
            CONTEXT context2 = this.g;
            Context d3 = context2 != null ? context2.d() : null;
            a aVar = Companion;
            a.a(aVar, d3).d(this.e);
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "remove popId after = " + this.e + " popStack size = " + a.a(aVar, d3).e());
            r(true);
            hab.a aVar2 = this.f6256a;
            if (aVar2 != null) {
                aVar2.b(this.d);
            }
            IAKPopRender<PARAMS, CONTEXT> iAKPopRender = this.c;
            if (iAKPopRender != null) {
                iAKPopRender.onDestroyView();
            }
            this.e = null;
            PARAMS params = this.h;
            if (params != null && params.d() && (d3 instanceof Activity)) {
                Activity activity = (Activity) d3;
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
        }
    }

    /* renamed from: w */
    public final boolean d(CONTEXT context, PARAMS params, View view, int i) {
        Context p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6fc4198", new Object[]{this, context, params, view, new Integer(i)})).booleanValue();
        }
        ckf.g(context, "akContext");
        ckf.g(params, "params");
        this.e = params.d;
        this.g = context;
        if (!(context.d() instanceof Activity) && (p = gxv.p(context.l())) != null) {
            context.i(p);
        }
        Context d2 = context.d();
        if (d2 == null) {
            return false;
        }
        this.f = new WeakReference<>(d2);
        this.h = params;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = false;
        b a2 = a.a(Companion, d2);
        AKBasePopPresenter<?, ?> d3 = a2.d(params.d);
        if (d3 != null) {
            d3.a(null, false);
        }
        com.taobao.android.abilitykit.ability.pop.render.a aVar = this.b;
        if (aVar == null) {
            aVar = new AKPopContainer(d2);
            this.b = aVar;
        }
        IAKPopRender<PARAMS, CONTEXT> iAKPopRender = this.c;
        ckf.d(iAKPopRender);
        ViewGroup onCreateView = aVar.onCreateView(context, params, view, this, iAKPopRender);
        ckf.f(onCreateView, "containerView");
        boolean l = l(params, onCreateView, context.l(), view, new c(ref$BooleanRef, params, context, view, a2, d2));
        ref$BooleanRef.element = l;
        if (l) {
            a2.a(this);
            r(false);
            if (d2 instanceof Activity) {
                this.i = new d(ref$BooleanRef, params, context, view, a2, d2);
                ((Activity) d2).getApplication().registerActivityLifecycleCallbacks(this.i);
            }
        }
        return ref$BooleanRef.element;
    }
}
