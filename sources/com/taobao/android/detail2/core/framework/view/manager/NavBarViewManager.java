package com.taobao.android.detail2.core.framework.view.manager;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ali.user.open.ucc.UccResultCode;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.detail2.core.framework.base.weex.DetailWeexContainer;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.byj;
import tb.cxj;
import tb.cxo;
import tb.dh7;
import tb.ec7;
import tb.ia7;
import tb.ja7;
import tb.mqj;
import tb.q0j;
import tb.qmj;
import tb.r19;
import tb.t2o;
import tb.teo;
import tb.txj;
import tb.veo;
import tb.x3w;
import tb.z4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NavBarViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final dh7 b;
    public View c;
    public FrameLayout d;
    public View e;
    public View f;
    public DetailWeexContainer g;
    public AliUrlImageView h;
    public TextView i;
    public k j;
    public final cxj k;
    public teo m;
    public final boolean p;
    public boolean l = false;
    public long n = -1;
    public long o = -1;
    public x3w q = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f7177a = UUID.randomUUID().toString();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum NavOperation {
        OPERATION_BACK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(NavOperation navOperation, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$NavOperation");
        }

        public static NavOperation valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NavOperation) ipChange.ipc$dispatch("8521ed4e", new Object[]{str});
            }
            return (NavOperation) Enum.valueOf(NavOperation.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ia7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$10");
        }

        @Override // tb.ja7
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("638dfb32", new Object[]{this})).longValue();
            }
            return 1L;
        }

        @Override // tb.ja7
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "directRenderAtmosphereView";
        }

        @Override // tb.ja7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (NavBarViewManager.e(NavBarViewManager.this) <= d()) {
                NavBarViewManager.f(NavBarViewManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dh7.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.dh7.k
        public void a(dh7.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fe7ec9", new Object[]{this, jVar});
            }
        }

        @Override // tb.dh7.k
        public void b(String str, dh7.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7685d0c3", new Object[]{this, str, jVar});
                return;
            }
            x3w B = NavBarViewManager.g(NavBarViewManager.this).B();
            if (B == null || !B.q()) {
                return;
            }
            if (IAKPopRender.LifecycleType.IN_ANIMATION_START.equals(str)) {
                if (NavBarViewManager.r(NavBarViewManager.this) != null) {
                    NavBarViewManager.r(NavBarViewManager.this).setVisibility(8);
                }
                if (NavBarViewManager.h(NavBarViewManager.this) != null) {
                    NavBarViewManager.h(NavBarViewManager.this).Y(8);
                }
            } else if (IAKPopRender.LifecycleType.BEFORE_CLOSE.equals(str)) {
                if (NavBarViewManager.r(NavBarViewManager.this) != null) {
                    NavBarViewManager.r(NavBarViewManager.this).setVisibility(0);
                }
                if (NavBarViewManager.h(NavBarViewManager.this) != null) {
                    NavBarViewManager.h(NavBarViewManager.this).Y(0);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends ia7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ x3w d;

        public c(x3w x3wVar) {
            this.d = x3wVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$12");
        }

        @Override // tb.ja7
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("638dfb32", new Object[]{this})).longValue();
            }
            return 1L;
        }

        @Override // tb.ja7
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "mRightNavLayer.updateNavBar";
        }

        @Override // tb.ja7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (NavBarViewManager.i(NavBarViewManager.this) <= d()) {
                NavBarViewManager.j(NavBarViewManager.this).a(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends r19.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$1");
        }

        @Override // tb.r19.e
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ac3af443", new Object[]{this})).intValue();
            }
            return r19.l0();
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "fastDelayInitNavView";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (NavBarViewManager.a(NavBarViewManager.this) == null || !r19.m(NavBarViewManager.a(NavBarViewManager.this).i())) {
                NavBarViewManager navBarViewManager = NavBarViewManager.this;
                NavBarViewManager.k(navBarViewManager, NavBarViewManager.b(navBarViewManager));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e extends r19.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$2");
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "preInitUIInfoTask-end-then-setImmersive2024";
        }

        @Override // tb.r19.e
        public void d() {
            int g;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (!r19.m(NavBarViewManager.l(NavBarViewManager.this).getContext()) && (g = mqj.g()) > 0) {
                NavBarViewManager.this.O(g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f extends r19.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7180a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ValueAnimator f7181a;

            public a(ValueAnimator valueAnimator) {
                this.f7181a = valueAnimator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    NavBarViewManager.q(NavBarViewManager.this).setAlpha(((Float) this.f7181a.getAnimatedValue()).floatValue());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    onAnimationEnd(animator);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (!r19.m(NavBarViewManager.q(NavBarViewManager.this).getContext())) {
                    NavBarViewManager.q(NavBarViewManager.this).setAlpha(1.0f);
                }
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
                }
            }
        }

        public f(Context context) {
            this.f7180a = context;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$3");
        }

        @Override // tb.r19.e
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ac3af443", new Object[]{this})).intValue();
            }
            return r19.n0();
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "initRightNav";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
            } else if (!r19.m(this.f7180a)) {
                NavBarViewManager.m(NavBarViewManager.this);
                NavBarViewManager.n(NavBarViewManager.this);
                if (NavBarViewManager.o(NavBarViewManager.this) != null) {
                    NavBarViewManager navBarViewManager = NavBarViewManager.this;
                    navBarViewManager.Q(NavBarViewManager.o(navBarViewManager));
                    NavBarViewManager.p(NavBarViewManager.this, null);
                }
                if (r19.J0() && NavBarViewManager.q(NavBarViewManager.this) != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.001f, 1.0f);
                    NavBarViewManager.q(NavBarViewManager.this).setAlpha(0.001f);
                    ofFloat.setDuration(r19.c0("right_nav_anim_dura", UccResultCode.NO_ACTION_BIND_FAILED));
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new a(ofFloat));
                    ofFloat.addListener(new b());
                    ofFloat.start();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g extends ja7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View c;

        public g(View view) {
            this.c = view;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$4");
        }

        @Override // tb.ja7
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("638dfb32", new Object[]{this})).longValue();
            }
            return 1L;
        }

        @Override // tb.ja7
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "NavBarViewManager.initView";
        }

        @Override // tb.ja7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
                return;
            }
            NavBarViewManager.r(NavBarViewManager.this).setAlpha(0.001f);
            NavBarViewManager.r(NavBarViewManager.this).setVisibility(0);
            NavBarViewManager.s(NavBarViewManager.this, this.c);
            NavBarViewManager.n(NavBarViewManager.this);
            NavBarViewManager.this.N();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h extends ja7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    NavBarViewManager.r(NavBarViewManager.this).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    NavBarViewManager.r(NavBarViewManager.this).setAlpha(1.0f);
                }
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
                }
            }
        }

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$5");
        }

        @Override // tb.ja7
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("638dfb32", new Object[]{this})).longValue();
            }
            return 23L;
        }

        @Override // tb.ja7
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "mNavContainer.alpha";
        }

        @Override // tb.ja7
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.001f, 1.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(NavBarViewManager.a(NavBarViewManager.this).j().N().x0());
            ofFloat.addUpdateListener(new a());
            ofFloat.addListener(new b());
            ofFloat.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (NavBarViewManager.c(NavBarViewManager.this) != null) {
                NavBarViewManager.c(NavBarViewManager.this).a(NavOperation.OPERATION_BACK);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            NavBarViewManager.d(NavBarViewManager.this);
            if (NavBarViewManager.c(NavBarViewManager.this) != null) {
                NavBarViewManager.c(NavBarViewManager.this).a(NavOperation.OPERATION_BACK);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface k {
        void a(NavOperation navOperation);
    }

    static {
        t2o.a(352322050);
    }

    public NavBarViewManager(cxj cxjVar, dh7 dh7Var) {
        boolean z = false;
        this.p = false;
        this.k = cxjVar;
        this.b = dh7Var;
        if (cxjVar.l() != null && cxjVar.l().e()) {
            if (byj.I0() && !H(cxjVar.j().o())) {
                z = true;
            }
            this.p = z;
        }
        if (r19.x0()) {
            v();
        } else {
            F();
        }
        J();
    }

    public static boolean H(AtmosParams atmosParams) {
        AtmosParams.Background background;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2939bb8", new Object[]{atmosParams})).booleanValue();
        }
        if (atmosParams == null || (background = atmosParams.background) == null || TextUtils.isEmpty(background.imageUrl)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ cxj a(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("b6810ad", new Object[]{navBarViewManager});
        }
        return navBarViewManager.k;
    }

    public static /* synthetic */ FrameLayout b(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8330e53e", new Object[]{navBarViewManager});
        }
        return navBarViewManager.d;
    }

    public static /* synthetic */ k c(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("30f115f9", new Object[]{navBarViewManager});
        }
        return navBarViewManager.j;
    }

    public static /* synthetic */ void d(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706e4d2a", new Object[]{navBarViewManager});
        } else {
            navBarViewManager.M();
        }
    }

    public static /* synthetic */ long e(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50e7a31f", new Object[]{navBarViewManager})).longValue();
        }
        return navBarViewManager.n;
    }

    public static /* synthetic */ void f(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3160f92c", new Object[]{navBarViewManager});
        } else {
            navBarViewManager.y();
        }
    }

    public static /* synthetic */ dh7 g(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh7) ipChange.ipc$dispatch("7edde6fc", new Object[]{navBarViewManager});
        }
        return navBarViewManager.b;
    }

    public static /* synthetic */ DetailWeexContainer h(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailWeexContainer) ipChange.ipc$dispatch("7d994460", new Object[]{navBarViewManager});
        }
        return navBarViewManager.g;
    }

    public static /* synthetic */ long i(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2ccfb23", new Object[]{navBarViewManager})).longValue();
        }
        return navBarViewManager.o;
    }

    public static /* synthetic */ teo j(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (teo) ipChange.ipc$dispatch("562299ac", new Object[]{navBarViewManager});
        }
        return navBarViewManager.m;
    }

    public static /* synthetic */ void k(NavBarViewManager navBarViewManager, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8b8e3f", new Object[]{navBarViewManager, frameLayout});
        } else {
            navBarViewManager.z(frameLayout);
        }
    }

    public static /* synthetic */ View l(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("420eb5bf", new Object[]{navBarViewManager});
        }
        return navBarViewManager.e;
    }

    public static /* synthetic */ void m(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b737c8be", new Object[]{navBarViewManager});
        } else {
            navBarViewManager.x();
        }
    }

    public static /* synthetic */ void n(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b11ebf", new Object[]{navBarViewManager});
        } else {
            navBarViewManager.E();
        }
    }

    public static /* synthetic */ x3w o(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("5d268dbb", new Object[]{navBarViewManager});
        }
        return navBarViewManager.q;
    }

    public static /* synthetic */ x3w p(NavBarViewManager navBarViewManager, x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("3d874284", new Object[]{navBarViewManager, x3wVar});
        }
        navBarViewManager.q = x3wVar;
        return x3wVar;
    }

    public static /* synthetic */ View q(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcf794c3", new Object[]{navBarViewManager});
        }
        return navBarViewManager.f;
    }

    public static /* synthetic */ View r(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dbb1cc84", new Object[]{navBarViewManager});
        }
        return navBarViewManager.c;
    }

    public static /* synthetic */ void s(NavBarViewManager navBarViewManager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57ecd2f", new Object[]{navBarViewManager, view});
        } else {
            navBarViewManager.C(view);
        }
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e453c74", new Object[]{this})).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        Rect rect = new Rect();
        this.c.getGlobalVisibleRect(rect);
        return rect.bottom;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a0399a", new Object[]{this});
            return;
        }
        if (this.h == null) {
            this.h = (AliUrlImageView) this.b.X().findViewById(R.id.nav_bg_img);
        }
        if (this.g == null) {
            this.g = new DetailWeexContainer(this.k, this.f7177a, "", "stickTopDataRefresh");
            ViewStub viewStub = (ViewStub) this.b.X().findViewById(R.id.nav_weex);
            if (this.l && viewStub != null) {
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    Resources resources = viewStub.getContext().getResources();
                    if (resources != null) {
                        marginLayoutParams.height = (int) resources.getDimension(R.dimen.new_detail_nav_bar_bg_higher_height);
                        txj.e(txj.TAG_TIP, "氛围层已经被提升到 higher 模式高度，请关注内存。");
                        viewStub.setLayoutParams(marginLayoutParams);
                    }
                }
            }
            this.g.J(viewStub);
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c9039e", new Object[]{this});
        } else {
            this.m = new veo(this.k, this.b);
        }
    }

    @Deprecated
    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View X = this.b.X();
        this.c = X.findViewById(R.id.nav_container);
        if (!r19.x0()) {
            FrameLayout frameLayout = (FrameLayout) X.findViewById(R.id.nav_container_root_frame_layout);
            this.d = frameLayout;
            if (frameLayout != null) {
                this.d.addView(LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.detail_nav_container_layout_old, (ViewGroup) this.d, false), new FrameLayout.LayoutParams(-1, ec7.a(this.d.getContext(), 44.0f)));
                this.c = this.d;
            }
        }
        G(X);
        if (!this.p || this.k.l() == null || !this.k.l().e()) {
            C(X);
            E();
            N();
            return;
        }
        this.c.setVisibility(8);
        this.k.l().b(new g(X));
        this.k.l().b(new h());
    }

    public final void G(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea74943d", new Object[]{this, view});
        } else if (this.k.m().X0() > 0) {
            this.i = (TextView) view.findViewById(R.id.nav_back);
            int a2 = ec7.a(this.k.i(), this.k.m().X0());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int i2 = a2 * 2;
            int i3 = marginLayoutParams.width + i2;
            int i4 = marginLayoutParams.height + i2;
            if (i3 > 0 && i3 <= ec7.a(this.i.getContext(), 48.0f)) {
                marginLayoutParams.width = i3;
                marginLayoutParams.height = i4;
                marginLayoutParams.leftMargin -= a2;
                marginLayoutParams.rightMargin -= a2;
                this.i.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public void I(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86cef10d", new Object[]{this, kVar});
        } else {
            this.j = kVar;
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d27a35e", new Object[]{this});
        } else {
            this.b.s(new b());
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8916824", new Object[]{this});
        } else if (!this.p || this.k.l() == null || !this.k.l().e()) {
            this.n = System.currentTimeMillis();
            y();
        } else {
            this.n = this.k.l().a(new a());
        }
    }

    public void L(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f530a64d", new Object[]{this, str, jSONObject});
            return;
        }
        DetailWeexContainer detailWeexContainer = this.g;
        if (detailWeexContainer != null) {
            detailWeexContainer.W(str, jSONObject);
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4d95f9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MspWebActivity.BTN_TYPE, (Object) "back");
        jSONObject.put("bizType", (Object) "back");
        x3w B = this.b.B();
        if (B != null) {
            jSONObject.put("nid", (Object) B.h);
        }
        this.b.M0("onUserNavBarClick", jSONObject);
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63007c80", new Object[]{this});
            return;
        }
        int Y = this.b.Y();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.topMargin = Y;
        this.c.setLayoutParams(layoutParams);
    }

    public void O(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25234603", new Object[]{this, new Integer(i2)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.topMargin = i2;
        this.c.setLayoutParams(layoutParams);
    }

    public void P(Animation animation) {
        View F;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd7ccb9", new Object[]{this, animation});
        } else if (animation != null) {
            View view = this.c;
            if (view != null) {
                view.startAnimation(animation);
            }
            DetailWeexContainer detailWeexContainer = this.g;
            if (detailWeexContainer != null && (F = detailWeexContainer.F()) != null) {
                F.startAnimation(animation);
            }
        }
    }

    public void Q(x3w x3wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5cf1ab", new Object[]{this, x3wVar});
        } else if (this.k.i() == null) {
            q0j.m("main", q0j.ERROR_CODE_COMMON_CONTEXT_NULL, "上下文为空，updateNavBar停止执行", null);
        } else if (r19.x0() && this.m == null) {
            this.q = x3wVar;
        } else if (!this.p || this.k.l() == null || !this.k.l().e()) {
            this.o = System.currentTimeMillis();
            teo teoVar = this.m;
            if (teoVar != null) {
                ((veo) teoVar).a(x3wVar);
            }
        } else {
            this.o = this.k.l().a(new c(x3wVar));
        }
    }

    public void R(boolean z) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afc8ab4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c.getVisibility();
        View view = this.c;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        DetailWeexContainer detailWeexContainer = this.g;
        if (detailWeexContainer != null) {
            if (!z) {
                i3 = 8;
            }
            detailWeexContainer.a0(i3);
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bdf7f4c", new Object[]{this});
            return;
        }
        teo teoVar = this.m;
        if (teoVar != null) {
            ((veo) teoVar).f();
        }
    }

    public final void t(AtmosParams atmosParams) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb700c0", new Object[]{this, atmosParams});
            return;
        }
        this.h.setImageUrl(atmosParams.background.imageUrl);
        z4x z4xVar = new z4x();
        z4xVar.d(atmosParams.weexUrl);
        ((HashMap) z4xVar.c).put("containerWidth", String.valueOf(cxo.a(this.k.i())));
        Activity i3 = this.k.i();
        if (i3 != null) {
            Map<String, String> map = z4xVar.c;
            Resources resources = i3.getResources();
            if (this.l) {
                i2 = R.dimen.new_detail_nav_bar_bg_higher_height;
            } else {
                i2 = R.dimen.new_detail_nav_bar_bg_height;
            }
            ((HashMap) map).put("containerHeight", String.valueOf(resources.getDimension(i2)));
        }
        this.b.U().a(this.g, this.k, z4xVar, atmosParams.mRootData, false, false);
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b3eef", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.b.X().findViewById(R.id.nav_container_root_frame_layout);
        this.d = frameLayout;
        if (frameLayout == null) {
            F();
            return;
        }
        this.c = frameLayout;
        if (mqj.h()) {
            z(this.d);
        } else {
            r19.Z0(new d());
        }
    }

    public final TextView w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("7b1d219a", new Object[]{this, context});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        tIconFontTextView.setGravity(17);
        tIconFontTextView.setTextSize(1, 21.0f);
        tIconFontTextView.setTextColor(-1);
        tIconFontTextView.getPaint().setFakeBoldText(true);
        tIconFontTextView.setText(context.getString(R.string.uik_icon_back_android_light));
        return tIconFontTextView;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d92cab", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = new RecyclerView(this.d.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 21;
        recyclerView.setId(R.id.right_navibar_content_recyclerview);
        this.d.addView(recyclerView, layoutParams);
        this.f = recyclerView;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14963d2d", new Object[]{this});
            return;
        }
        AtmosParams o = this.k.j().o();
        if (o != null && o.showAtmos) {
            u(o);
            B();
            t(o);
        }
    }

    @Deprecated
    public final void C(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42600f4", new Object[]{this, view});
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.nav_back);
        this.i = textView;
        textView.setOnClickListener(new j());
        this.i.setTextColor(qmj.a(this.k));
        this.i.setImportantForAccessibility(1);
        this.i.setContentDescription("返回");
        ViewCompat.setAccessibilityDelegate(this.i, new AccessibilityDelegateCompat(this) { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                if (str.hashCode() == -672710132) {
                    super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$9");
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d7e7420c", new Object[]{this, view2, accessibilityNodeInfoCompat});
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            }
        });
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d52489e", new Object[]{this});
            return;
        }
        this.i.setOnClickListener(new i());
        this.i.setImportantForAccessibility(1);
        this.i.setContentDescription("返回");
        ViewCompat.setAccessibilityDelegate(this.i, new AccessibilityDelegateCompat(this) { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                if (str.hashCode() == -672710132) {
                    super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/manager/NavBarViewManager$7");
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d7e7420c", new Object[]{this, view, accessibilityNodeInfoCompat});
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            }
        });
    }

    public final void z(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa4e5bb", new Object[]{this, frameLayout});
        } else if (frameLayout == null) {
            try {
                txj.e(txj.TAG_TIP, "parentLayout 为空，降级逻辑，初始化导航栏。");
                F();
            } catch (Exception e2) {
                txj.f(txj.TAG_TIP, "Nav降级异常。", e2);
            }
        } else {
            Context context = frameLayout.getContext();
            TextView w = w(context);
            this.e = w;
            w.setId(R.id.nav_back);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ec7.a(context, 24.0f), ec7.a(context, 24.0f));
            layoutParams.leftMargin = ec7.a(context, 12.0f);
            layoutParams.rightMargin = ec7.a(context, 15.0f);
            layoutParams.gravity = 16;
            this.e.setLayoutParams(layoutParams);
            frameLayout.addView(this.e, layoutParams);
            this.i = w;
            D();
            int g2 = mqj.g();
            if (g2 > 0) {
                O(g2);
            } else {
                mqj.m(new e(), false);
            }
            G(this.b.X());
            r19.e(new f(context));
        }
    }

    public final void u(AtmosParams atmosParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b867368e", new Object[]{this, atmosParams});
            return;
        }
        this.l = false;
        if (atmosParams != null) {
            try {
                if (atmosParams.isHigherAtmosType() && byj.U0()) {
                    this.l = true;
                    txj.e(txj.TAG_TIP, "氛围层已经开启 higher 模式。");
                }
            } catch (Throwable th) {
                txj.f("new_detail异常", "氛围层参数获取失败。无法切换至 higher 模式。weexUrl = " + atmosParams.weexUrl, th);
            }
        }
    }
}
