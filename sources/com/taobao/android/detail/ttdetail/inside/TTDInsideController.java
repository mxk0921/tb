package com.taobao.android.detail.ttdetail.inside;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView;
import com.taobao.android.detail.ttdetail.inside.InsideLinearLayout;
import com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.b8n;
import tb.bia;
import tb.bq6;
import tb.dii;
import tb.fns;
import tb.hi3;
import tb.jos;
import tb.jov;
import tb.ktc;
import tb.lg7;
import tb.ll2;
import tb.lsc;
import tb.mr7;
import tb.msc;
import tb.nbf;
import tb.nos;
import tb.q84;
import tb.t2o;
import tb.tbf;
import tb.tfc;
import tb.tgh;
import tb.tua;
import tb.vbl;
import tb.wbf;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDInsideController implements ktc<b8n, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6846a;
    public final Activity b;
    public FrameLayout c;
    public InsideLinearLayout d;
    public ClipableFrameLayout e;
    public final tbf f;
    public PayReceiver g;
    public int i;
    public jos j;
    public TTDetailScrollerLayoutComponent k;
    public tua l;
    public Animation n;
    public boolean o;
    public boolean p;
    public e q;
    public com.taobao.android.detail.ttdetail.floatview.globalbarrage.a s;
    public InsideLinearLayout.d t;
    public final JSONObject h = new JSONObject();
    public float m = 1.0f;
    public final Handler r = new Handler(Looper.getMainLooper());
    public final InsideLinearLayout.InsideScrollListener u = new d();
    public final InsideLinearLayout.IDetailAdapter v = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class PayReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262047);
        }

        public PayReceiver() {
        }

        public static /* synthetic */ Object ipc$super(PayReceiver payReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/inside/TTDInsideController$PayReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                TTDInsideController.a(TTDInsideController.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            tgh.a("TTDInsideController.onAnimationCancel");
            TTDInsideController.n(TTDInsideController.this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            tgh.a("TTDInsideController.onAnimationEnd");
            TTDInsideController.n(TTDInsideController.this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                TTDInsideController.b(TTDInsideController.this, IAKPopRender.LifecycleType.OUT_ANIMATION_START);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Animator f6849a;

        public b(Animator animator) {
            this.f6849a = animator;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TTDInsideController.o(TTDInsideController.this).setVisibility(4);
            TTDInsideController.p(TTDInsideController.this);
            this.f6849a.removeAllListeners();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(TTDInsideController tTDInsideController) {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            } else {
                lsc.a(this, errorResult);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements InsideLinearLayout.InsideScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.InsideScrollListener
        public void insideViewScroll(int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9331052e", new Object[]{this, new Integer(i)});
                return;
            }
            float q = 1.0f - (i / TTDInsideController.q(TTDInsideController.this));
            ClipableFrameLayout o = TTDInsideController.o(TTDInsideController.this);
            if (i <= 3) {
                z = false;
            }
            o.setNeedClipPath(z);
            if (TTDInsideController.r(TTDInsideController.this) != null) {
                TTDInsideController.r(TTDInsideController.this).I(1.0f - q);
            }
            TTDInsideController.t(TTDInsideController.this, 1.0f - q);
            if (TTDInsideController.u(TTDInsideController.this) != null) {
                TTDInsideController.u(TTDInsideController.this).J(TTDInsideController.s(TTDInsideController.this));
            }
            if (TTDInsideController.c(TTDInsideController.this) != null) {
                TTDInsideController.c(TTDInsideController.this).f(q, i);
            }
            if (TTDInsideController.d(TTDInsideController.this) == null) {
                tgh.b("InsideController", "mTopBarrageController is null");
            } else if (TTDInsideController.m(TTDInsideController.this).getDetailState().equals(InsideLinearLayout.InsideDetailState.HALF_SCREEN)) {
                TTDInsideController.d(TTDInsideController.this).g(i);
            }
            TTDInsideController.e(TTDInsideController.this, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e {
    }

    static {
        t2o.a(912262037);
        t2o.a(912261361);
    }

    public TTDInsideController(ze7 ze7Var) {
        this.f6846a = ze7Var;
        if (ze7Var.c() instanceof Activity) {
            Activity activity = (Activity) ze7Var.c();
            this.b = activity;
            this.f = B(activity.getIntent().getData());
        }
        Y(ze7Var.c());
    }

    public static boolean I(ze7 ze7Var) {
        Feature feature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("511b3c70", new Object[]{ze7Var})).booleanValue();
        }
        if (ze7Var == null || (feature = (Feature) ze7Var.e().f(Feature.class)) == null) {
            return false;
        }
        return feature.isInsideNewHeight();
    }

    public static /* synthetic */ boolean a(TTDInsideController tTDInsideController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e48290ca", new Object[]{tTDInsideController, new Boolean(z)})).booleanValue();
        }
        return tTDInsideController.v(z);
    }

    public static /* synthetic */ void b(TTDInsideController tTDInsideController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34dbc4f7", new Object[]{tTDInsideController, str});
        } else {
            tTDInsideController.L(str);
        }
    }

    public static /* synthetic */ tbf c(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tbf) ipChange.ipc$dispatch("cdcda8cc", new Object[]{tTDInsideController});
        }
        return tTDInsideController.f;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.floatview.globalbarrage.a d(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.floatview.globalbarrage.a) ipChange.ipc$dispatch("206b257e", new Object[]{tTDInsideController});
        }
        return tTDInsideController.s;
    }

    public static /* synthetic */ void e(TTDInsideController tTDInsideController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2daca6", new Object[]{tTDInsideController, new Integer(i)});
        } else {
            tTDInsideController.K(i);
        }
    }

    public static /* synthetic */ TTDetailScrollerLayoutComponent f(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayoutComponent) ipChange.ipc$dispatch("533cc874", new Object[]{tTDInsideController});
        }
        return tTDInsideController.k;
    }

    public static /* synthetic */ void g(TTDInsideController tTDInsideController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28552f9", new Object[]{tTDInsideController, new Boolean(z)});
        } else {
            tTDInsideController.J(z);
        }
    }

    public static /* synthetic */ void h(TTDInsideController tTDInsideController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b1063a", new Object[]{tTDInsideController, new Boolean(z)});
        } else {
            tTDInsideController.N(z);
        }
    }

    public static /* synthetic */ void j(TTDInsideController tTDInsideController, InsideLinearLayout.InsideDetailState insideDetailState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cc157d", new Object[]{tTDInsideController, insideDetailState});
        } else {
            tTDInsideController.M(insideDetailState);
        }
    }

    public static /* synthetic */ Activity k(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("70cf9090", new Object[]{tTDInsideController});
        }
        return tTDInsideController.b;
    }

    public static /* synthetic */ InsideLinearLayout.d l(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InsideLinearLayout.d) ipChange.ipc$dispatch("a24e45fd", new Object[]{tTDInsideController});
        }
        return tTDInsideController.t;
    }

    public static /* synthetic */ InsideLinearLayout m(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InsideLinearLayout) ipChange.ipc$dispatch("dfdac6ae", new Object[]{tTDInsideController});
        }
        return tTDInsideController.d;
    }

    public static /* synthetic */ void n(TTDInsideController tTDInsideController, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244a7348", new Object[]{tTDInsideController, animator});
        } else {
            tTDInsideController.Q(animator);
        }
    }

    public static /* synthetic */ ClipableFrameLayout o(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClipableFrameLayout) ipChange.ipc$dispatch("9622508e", new Object[]{tTDInsideController});
        }
        return tTDInsideController.e;
    }

    public static /* synthetic */ void p(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e137ee9", new Object[]{tTDInsideController});
        } else {
            tTDInsideController.W();
        }
    }

    public static /* synthetic */ int q(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6f3df7b", new Object[]{tTDInsideController})).intValue();
        }
        return tTDInsideController.i;
    }

    public static /* synthetic */ tua r(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tua) ipChange.ipc$dispatch("4a7dbb86", new Object[]{tTDInsideController});
        }
        return tTDInsideController.l;
    }

    public static /* synthetic */ float s(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18b4a0b6", new Object[]{tTDInsideController})).floatValue();
        }
        return tTDInsideController.m;
    }

    public static /* synthetic */ float t(TTDInsideController tTDInsideController, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e082feac", new Object[]{tTDInsideController, new Float(f2)})).floatValue();
        }
        tTDInsideController.m = f2;
        return f2;
    }

    public static /* synthetic */ jos u(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jos) ipChange.ipc$dispatch("35e2eab8", new Object[]{tTDInsideController});
        }
        return tTDInsideController.j;
    }

    public InsideLinearLayout.InsideDetailState A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InsideLinearLayout.InsideDetailState) ipChange.ipc$dispatch("871eae85", new Object[]{this});
        }
        return this.d.getDetailState();
    }

    public final tbf B(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tbf) ipChange.ipc$dispatch("6f23a0a3", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("sourceToken");
        if (queryParameter == null) {
            return null;
        }
        return wbf.a(queryParameter);
    }

    public FrameLayout C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("95c4062c", new Object[]{this});
        }
        if (this.c == null) {
            this.c = (FrameLayout) this.b.findViewById(R.id.tt_detail_inside_top_view);
            tgh.b("InsideController", "半屏弹幕视图为空");
        }
        return this.c;
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22f88eec", new Object[]{this})).booleanValue();
        }
        Feature feature = (Feature) this.f6846a.e().f(Feature.class);
        if (feature != null) {
            return feature.isInsideDowngrade();
        }
        return false;
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04959a4", new Object[]{this});
        } else if (!vbl.O() && !Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sInsideWithStdPopAnim))) {
            this.n = w();
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f871f8", new Object[]{this});
            return;
        }
        View findViewById = this.b.findViewById(R.id.tt_detail_inside_root);
        this.d = (InsideLinearLayout) findViewById;
        float f2 = 0.25f;
        this.i = (int) (mr7.e(this.b) * 0.25f);
        if (vbl.Q()) {
            if (lg7.a(mr7.d(), "inside_new_height")) {
                f2 = 0.15f;
            }
            this.i = (int) (mr7.e(this.b) * f2);
        }
        this.c = (FrameLayout) findViewById.findViewById(R.id.tt_detail_inside_top_view);
        ClipableFrameLayout clipableFrameLayout = (ClipableFrameLayout) findViewById.findViewById(R.id.fl_tt_detail_inside_container);
        this.e = clipableFrameLayout;
        clipableFrameLayout.setNeedClipPath(true);
        this.d.setHalfScreenTopViewHeight(this.i);
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8876706b", new Object[]{this});
            return;
        }
        this.c.setOnClickListener(new fns(this));
        this.d.setOnCloseListener(new com.taobao.android.detail.ttdetail.inside.a(this));
        this.d.setInsideScrollListener(this.u);
        this.d.setDetailAdapter(this.v);
        this.d.addOnInsideStateChangedListener(this.v);
        Z();
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578f1994", new Object[]{this});
            return;
        }
        jov.k(this.b, z(this.b.getIntent().getData()));
        this.b.finish();
    }

    public final void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440f2bcb", new Object[]{this, new Boolean(z)});
        } else {
            q84.f(this.b, new hi3(!z));
        }
    }

    public final void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c4c62b", new Object[]{this, new Integer(i)});
            return;
        }
        Activity parent = this.b.getParent();
        if (parent instanceof tfc) {
            int width = this.d.getWidth();
            int height = this.d.getHeight();
            this.h.clear();
            this.h.put("x", (Object) Integer.valueOf(this.e.getLeft()));
            this.h.put("y", (Object) Integer.valueOf(i));
            this.h.put("w", (Object) Integer.valueOf(width));
            this.h.put("h", (Object) Integer.valueOf(height - i));
            ((tfc) parent).a(this.h);
        }
    }

    public final void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f2832ee", new Object[]{this, str});
            return;
        }
        Activity parent = this.b.getParent();
        if (parent instanceof tfc) {
            ((tfc) parent).c(str, null);
        }
    }

    public final void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3105978", new Object[]{this, new Boolean(z)});
            return;
        }
        tua tuaVar = this.l;
        if (tuaVar != null && z) {
            tuaVar.H(0.0f);
            this.l.I(0.0f);
            this.l.J(0);
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.d.release();
        com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar = this.s;
        if (aVar != null) {
            aVar.m();
            this.s.h();
        }
        g0();
        L(IAKPopRender.LifecycleType.OUT_ANIMATION_END);
        L(IAKPopRender.LifecycleType.BEFORE_CLOSE);
        x(5);
        f0(this.f6846a.c());
    }

    public final void Q(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45cc7fe", new Object[]{this, animator});
        } else if (animator != null) {
            b bVar = new b(animator);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                bVar.run();
            } else {
                this.r.post(bVar);
            }
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            x(3);
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            x(2);
        }
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            x(1);
        }
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            x(4);
        }
    }

    /* renamed from: V */
    public Boolean i(b8n b8nVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("2428bd84", new Object[]{this, b8nVar});
        }
        if (InsideLinearLayout.InsideDetailState.HALF_SCREEN != this.d.getDetailState()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc001e87", new Object[]{this});
            return;
        }
        e eVar = this.q;
        if (eVar != null) {
            ((TTDetailBaseActivity.d) eVar).a();
        }
    }

    public final void Y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712fdbbd", new Object[]{this, context});
        } else {
            q84.h(context, b8n.class, this);
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da3369b", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        try {
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.g, intentFilter);
        } catch (Throwable th) {
            tgh.c("InsideController", "registerPayReceiver error ", th);
        }
    }

    public void a0(jos josVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f834c71", new Object[]{this, josVar});
        } else {
            this.j = josVar;
        }
    }

    public void b0(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcee050", new Object[]{this, eVar});
        } else {
            this.q = eVar;
        }
    }

    public void c0(InsideLinearLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e94df1f", new Object[]{this, dVar});
        } else {
            this.t = dVar;
        }
    }

    public void d0(TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fbb755d", new Object[]{this, tTDetailScrollerLayoutComponent});
        } else {
            this.k = tTDetailScrollerLayoutComponent;
        }
    }

    public final void f0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4859fcf6", new Object[]{this, context});
        } else {
            q84.j(context, b8n.class);
        }
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e061cbe2", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.g);
        } catch (Throwable th) {
            tgh.c("InsideController", "unregisterPayReceiver error ", th);
        }
    }

    public final void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27895334", new Object[]{this});
            return;
        }
        dii c2 = dii.c();
        ll2 a2 = ll2.a("insidePageDismiss");
        if (c2 != null && a2 != null) {
            HashMap hashMap = new HashMap();
            String i0 = i0();
            if (!TextUtils.isEmpty(i0)) {
                hashMap.put("itemId", i0);
            }
            a2.c = hashMap;
            c2.d(a2, new c(this));
        }
    }

    public String i0() {
        bq6 e2;
        Item item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        ze7 ze7Var = this.f6846a;
        if (ze7Var == null || (e2 = ze7Var.e()) == null || (item = (Item) e2.f(Item.class)) == null) {
            return null;
        }
        return item.getItemId();
    }

    public final Animation w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("3d687b25", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setAnimationListener(new com.taobao.android.detail.ttdetail.inside.b(this));
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public final void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed845d4c", new Object[]{this, new Integer(i)});
            return;
        }
        tbf tbfVar = this.f;
        if (tbfVar != null) {
            if (i == 0) {
                tbfVar.g();
            } else if (i == 1) {
                tbfVar.b();
            } else if (i == 2) {
                tbfVar.e();
            } else if (i == 3) {
                tbfVar.a();
            } else if (i == 4) {
                tbfVar.d();
            } else if (i == 5) {
                tbfVar.c();
            }
        }
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44908f9e", new Object[]{this})).booleanValue();
        }
        if (this.p) {
            return false;
        }
        return v(true);
    }

    public final String z(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("353a06d6", new Object[]{this, uri});
        }
        Uri.Builder path = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath().replace("/inside", ""));
        for (String str : uri.getQueryParameterNames()) {
            if (!bia.UNDER_TAKE_INSIDE_DETAIL.equals(str) && !"99tm".equals(str)) {
                path.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        path.fragment(uri.getFragment());
        return path.build().toString();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements InsideLinearLayout.IDetailAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.IDetailAdapter
        public boolean isInTopState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b7910056", new Object[]{this})).booleanValue();
            }
            if (TTDInsideController.f(TTDInsideController.this) == null) {
                return false;
            }
            return TTDInsideController.f(TTDInsideController.this).P();
        }

        @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.IDetailAdapter, com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.d
        public void changeInsideDetailState(InsideLinearLayout.InsideDetailState insideDetailState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44063edf", new Object[]{this, insideDetailState});
                return;
            }
            TTDInsideController tTDInsideController = TTDInsideController.this;
            InsideLinearLayout.InsideDetailState insideDetailState2 = InsideLinearLayout.InsideDetailState.HALF_SCREEN;
            TTDInsideController.g(tTDInsideController, insideDetailState2.name().equals(insideDetailState.name()));
            TTDInsideController tTDInsideController2 = TTDInsideController.this;
            InsideLinearLayout.InsideDetailState insideDetailState3 = InsideLinearLayout.InsideDetailState.FULL_SCREEN;
            TTDInsideController.h(tTDInsideController2, insideDetailState3.name().equals(insideDetailState.name()));
            TTDInsideController.j(TTDInsideController.this, insideDetailState);
            if (TTDInsideController.k(TTDInsideController.this) != null) {
                if (insideDetailState2.name().equals(insideDetailState.name())) {
                    nos.b(TTDInsideController.k(TTDInsideController.this), TTDInsideController.k(TTDInsideController.this).getWindow(), false);
                } else if (insideDetailState3.name().equals(insideDetailState.name())) {
                    nos.b(TTDInsideController.k(TTDInsideController.this), TTDInsideController.k(TTDInsideController.this).getWindow(), true);
                }
            }
            if (TTDInsideController.d(TTDInsideController.this) != null && insideDetailState3.equals(insideDetailState)) {
                TTDInsideController.d(TTDInsideController.this).m();
                TTDInsideController.d(TTDInsideController.this).h();
                if (TTDInsideController.l(TTDInsideController.this) == null) {
                    tgh.b("InsideController", "半屏详情状态外部监听为空");
                } else {
                    TTDInsideController.l(TTDInsideController.this).changeInsideDetailState(insideDetailState);
                }
            }
        }
    }

    public final void M(InsideLinearLayout.InsideDetailState insideDetailState) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ed5b8", new Object[]{this, insideDetailState});
            return;
        }
        Activity parent = this.b.getParent();
        if (parent instanceof tfc) {
            int width = this.d.getWidth();
            int height = this.d.getHeight();
            tfc tfcVar = (tfc) parent;
            if (InsideLinearLayout.InsideDetailState.HALF_SCREEN == insideDetailState) {
                i = this.i;
                height = this.d.getHeight() - i;
                str = IAKPopRender.WindowState.STD_POP_HALF;
            } else {
                if (InsideLinearLayout.InsideDetailState.FULL_SCREEN == insideDetailState) {
                    str = IAKPopRender.WindowState.STD_POP_FULL_SCREEN;
                } else {
                    str = IAKPopRender.WindowState.STD_POP_UNDEFINED;
                }
                i = 0;
            }
            this.h.clear();
            this.h.put("x", (Object) 0);
            this.h.put("y", (Object) Integer.valueOf(i));
            this.h.put("w", (Object) Integer.valueOf(width));
            this.h.put("h", (Object) Integer.valueOf(height));
            tfcVar.d(str, this.h);
        }
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else if (D()) {
            this.p = true;
            L(IAKPopRender.LifecycleType.OUT_ANIMATION_START);
            H();
        } else {
            jos josVar = this.j;
            if (josVar != null) {
                josVar.J(this.m);
            }
            if (vbl.Q() && !this.f6846a.e().o()) {
                lg7.i(mr7.d(), "inside_new_height", I(this.f6846a));
            }
            if (this.s != null && InsideLinearLayout.InsideDetailState.HALF_SCREEN.equals(A())) {
                this.s.i();
            }
            if (this.l == null) {
                tua tuaVar = (tua) this.f6846a.h().d("headerPic");
                this.l = tuaVar;
                if (tuaVar != null) {
                    tuaVar.J(1);
                    this.l.I(1.0f);
                    this.l.H(nbf.INSIDE_GALLERY_RATIO);
                }
            }
        }
    }

    public final boolean v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a81b7e3d", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.o) {
            return true;
        }
        this.o = true;
        h0();
        if (!z || this.e == null) {
            if (z) {
                L(IAKPopRender.LifecycleType.OUT_ANIMATION_START);
            }
            W();
        } else {
            com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar = this.s;
            if (aVar != null) {
                aVar.m();
                this.s.h();
            }
            e0();
        }
        return true;
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        this.g = new PayReceiver();
        E();
        F();
        G();
        J(true);
        Animation animation = this.n;
        if (animation != null) {
            this.e.startAnimation(animation);
        } else {
            L(IAKPopRender.LifecycleType.IN_ANIMATION_START);
        }
        x(0);
        if (vbl.P()) {
            com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar = new com.taobao.android.detail.ttdetail.floatview.globalbarrage.a(this.f6846a, C());
            this.s = aVar;
            aVar.k(BarrageFloatingView.BARRAGE_TYPE.INSIDE);
        }
    }

    public final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abeb86c", new Object[]{this});
            return;
        }
        ClipableFrameLayout clipableFrameLayout = this.e;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clipableFrameLayout, "translationY", clipableFrameLayout.getHeight());
        ofFloat.setDuration(250L);
        ofFloat.addListener(new a());
        ofFloat.start();
    }
}
