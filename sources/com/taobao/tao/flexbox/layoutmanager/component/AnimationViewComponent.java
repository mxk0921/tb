package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.core.util.Pools;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import java.util.HashMap;
import java.util.Map;
import tb.akt;
import tb.hk8;
import tb.ir2;
import tb.jfw;
import tb.kkh;
import tb.nwv;
import tb.pg1;
import tb.plh;
import tb.skg;
import tb.t2o;
import tb.tfs;
import tb.ulh;
import tb.ut2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AnimationViewComponent extends Component<TNodeLottieView, c> implements j, skg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static HashMap<Context, Pools.SimplePool<TNodeLottieView>> e;

    /* renamed from: a  reason: collision with root package name */
    public final e f12015a = new e(this, null);
    public final d b = new d(this, null);
    public boolean c = false;
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements plh<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(AnimationViewComponent animationViewComponent) {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
                return;
            }
            tfs.d("lottie fail with  " + th.getMessage());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ulh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ulh
        public void onCompositionLoaded(kkh kkhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0909eda", new Object[]{this, kkhVar});
                return;
            }
            AnimationViewComponent.n(AnimationViewComponent.this);
            if (((c) AnimationViewComponent.w(AnimationViewComponent.this)).x0) {
                AnimationViewComponent.F(AnimationViewComponent.this);
            }
        }
    }

    static {
        t2o.a(502268188);
        t2o.a(503317092);
        t2o.a(503317089);
    }

    public static /* synthetic */ View A(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("82406ead", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View B(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("62c2368c", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View C(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4343fe6b", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View D(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("23c5c64a", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View E(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4478e29", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ boolean F(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ad2105b", new Object[]{animationViewComponent})).booleanValue();
        }
        return animationViewComponent.U();
    }

    public static TNodeLottieView G(Context context) {
        TNodeLottieView tNodeLottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeLottieView) ipChange.ipc$dispatch("eb424553", new Object[]{context});
        }
        if (e == null) {
            e = new HashMap<>();
        }
        Pools.SimplePool<TNodeLottieView> simplePool = e.get(context);
        if (simplePool != null) {
            tNodeLottieView = simplePool.acquire();
        } else {
            tNodeLottieView = null;
        }
        if (tNodeLottieView == null) {
            return new TNodeLottieView(context);
        }
        return tNodeLottieView;
    }

    public static void J(Context context) {
        HashMap<Context, Pools.SimplePool<TNodeLottieView>> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409f9508", new Object[]{context});
        } else if (context != null && (hashMap = e) != null) {
            hashMap.remove(context);
        }
    }

    public static void V(TNodeLottieView tNodeLottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef52c8a", new Object[]{tNodeLottieView});
        } else if (tNodeLottieView != null) {
            tNodeLottieView.clean();
            tNodeLottieView.setProgress(0.0f);
            tNodeLottieView.setAnimation(-1);
            tNodeLottieView.setImageDrawable(null);
            tNodeLottieView.removeAllAnimatorListeners();
            tNodeLottieView.removeAllLottieOnCompositionLoadedListener();
            tNodeLottieView.removeAllUpdateListeners();
            tNodeLottieView.setFailureListener(null);
            ut2.s(tNodeLottieView);
            Context context = tNodeLottieView.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                if (e == null) {
                    e = new HashMap<>();
                }
                Pools.SimplePool<TNodeLottieView> simplePool = e.get(context);
                if (simplePool == null) {
                    simplePool = new Pools.SynchronizedPool<>(32);
                    e.put(tNodeLottieView.getContext(), simplePool);
                }
                simplePool.release(tNodeLottieView);
            }
        }
    }

    public static /* synthetic */ void h(AnimationViewComponent animationViewComponent, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7120c8", new Object[]{animationViewComponent, new Boolean(z), new Boolean(z2)});
        } else {
            animationViewComponent.I(z, z2);
        }
    }

    public static /* synthetic */ void i(AnimationViewComponent animationViewComponent, TNodeLottieView tNodeLottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce11855", new Object[]{animationViewComponent, tNodeLottieView});
        } else {
            animationViewComponent.Z(tNodeLottieView);
        }
    }

    public static /* synthetic */ Object ipc$super(AnimationViewComponent animationViewComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1619485803) {
            return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
        }
        if (hashCode == -703216504) {
            super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == 2127624665) {
            super.onDetach();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/AnimationViewComponent");
        }
    }

    public static /* synthetic */ boolean j(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea6a5b8a", new Object[]{animationViewComponent})).booleanValue();
        }
        return animationViewComponent.M();
    }

    public static /* synthetic */ boolean k(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36bad29", new Object[]{animationViewComponent})).booleanValue();
        }
        return animationViewComponent.T();
    }

    public static /* synthetic */ View l(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("855aee06", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View m(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("65dcb5e5", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ void n(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cf6d19", new Object[]{animationViewComponent});
        } else {
            animationViewComponent.W();
        }
    }

    public static /* synthetic */ View o(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b103e30f", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View p(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("720772cd", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View q(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("52893aac", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View r(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("330b028b", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ void s(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1933dc7", new Object[]{animationViewComponent});
        } else {
            animationViewComponent.P();
        }
    }

    public static /* synthetic */ View t(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d4905a28", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View u(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b5122207", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View v(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9593e9e6", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ jfw w(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("bfc7073b", new Object[]{animationViewComponent});
        }
        return animationViewComponent.viewParams;
    }

    public static /* synthetic */ View x(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e0bb1710", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View y(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13cdeef", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public static /* synthetic */ View z(AnimationViewComponent animationViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a1bea6ce", new Object[]{animationViewComponent});
        }
        return animationViewComponent.view;
    }

    public final void I(boolean z, boolean z2) {
        V v;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4cae9b", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (!e.h(this.f12015a) && !d.c(this.b)) {
            z3 = false;
        }
        if (z && (v = this.view) != 0) {
            ((TNodeLottieView) v).setProgress(0.0f);
        }
        if (z2 && z3) {
            R();
        }
    }

    /* renamed from: K */
    public c generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5c935265", new Object[]{this});
        }
        return new c();
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74c9b4b6", new Object[]{this})).booleanValue();
        }
        if (e.i(this.f12015a) || d.d(this.b)) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6be4e64", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b79188", new Object[]{this});
        } else if (this.node.H("onanimend") != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("finished", Boolean.TRUE);
            sendMessage(getNode(), "onanimend", null, hashMap, null);
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a5e00f", new Object[]{this});
        } else if (this.node.H("onanimstart") != null) {
            sendMessage(getNode(), "onanimstart", null, null, null);
        }
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75a86a3", new Object[]{this});
        } else if (this.node.H("onanimend") != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("finished", Boolean.FALSE);
            sendMessage(getNode(), "onanimend", null, hashMap, null);
        }
    }

    /* renamed from: S */
    public TNodeLottieView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeLottieView) ipChange.ipc$dispatch("b6a3eed", new Object[]{this, context});
        }
        W();
        TNodeLottieView G = G(context);
        G.bindComponent(this);
        this.f12015a.k(G);
        this.b.f(G);
        G.setFailureListener(new a(this));
        G.addLottieOnCompositionLoadedListener(new b());
        return G;
    }

    public final boolean T() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b72ec4b2", new Object[]{this})).booleanValue();
        }
        if (O()) {
            z = e.a(this.f12015a);
        } else {
            z = d.a(this.b);
        }
        if (z) {
            R();
        }
        return z;
    }

    public final boolean U() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9759f224", new Object[]{this})).booleanValue();
        }
        if (O()) {
            z = e.j(this.f12015a);
        } else {
            z = d.e(this.b);
        }
        if (z) {
            Q();
        }
        return z;
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463f76e6", new Object[]{this});
            return;
        }
        d.b(this.b);
        e.g(this.f12015a);
        Y(false);
    }

    public final boolean X(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bf028ce", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (c.I((c) this.viewParams) != 0) {
            return false;
        }
        Y(true);
        if (M()) {
            I(false, false);
            e.b(this.f12015a, f, 1.0f);
        } else {
            e.c(this.f12015a, f);
        }
        return true;
    }

    public final void Y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a002fc3c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void Z(TNodeLottieView tNodeLottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3eb6ba", new Object[]{this, tNodeLottieView});
            return;
        }
        this.f12015a.s(tNodeLottieView);
        this.b.l(tNodeLottieView);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        I(true, true);
        W();
        V v = this.view;
        if (v != 0) {
            V((TNodeLottieView) v);
        }
        super.onDetach();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        if (L(gVar)) {
            if (this.c) {
                U();
            }
        } else if (N(gVar)) {
            this.c = M();
            T();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class TNodeLottieView extends LottieAnimationView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private AnimationViewComponent component;
        private boolean isAnimatingWhenDetached = false;
        private String mSrc;

        static {
            t2o.a(502268197);
        }

        public TNodeLottieView(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(TNodeLottieView tNodeLottieView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode == 1626033557) {
                super.onAttachedToWindow();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/AnimationViewComponent$TNodeLottieView");
            }
        }

        public void bindComponent(AnimationViewComponent animationViewComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b97a58b", new Object[]{this, animationViewComponent});
            } else {
                this.component = animationViewComponent;
            }
        }

        public void clean() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
                return;
            }
            this.isAnimatingWhenDetached = false;
            AnimationViewComponent animationViewComponent = this.component;
            if (animationViewComponent != null) {
                AnimationViewComponent.i(animationViewComponent, this);
                this.component = null;
            }
            this.mSrc = null;
        }

        @Override // com.airbnb.lottie.LottieAnimationView, android.widget.ImageView, android.view.View
        public void onAttachedToWindow() {
            AnimationViewComponent animationViewComponent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            if (this.isAnimatingWhenDetached && (animationViewComponent = this.component) != null) {
                AnimationViewComponent.F(animationViewComponent);
            }
        }

        @Override // android.widget.ImageView, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            AnimationViewComponent animationViewComponent = this.component;
            if (animationViewComponent != null) {
                this.isAnimatingWhenDetached = AnimationViewComponent.j(animationViewComponent);
                AnimationViewComponent.k(this.component);
            }
            super.onDetachedFromWindow();
        }

        public boolean setSrc(String str) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3dbfab37", new Object[]{this, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || str.equals(this.mSrc)) {
                return false;
            }
            AnimationViewComponent animationViewComponent = this.component;
            if (animationViewComponent != null) {
                if (getComposition() != null) {
                    z = true;
                } else {
                    z = false;
                }
                AnimationViewComponent.h(animationViewComponent, false, z);
            }
            if (str.startsWith("http") || str.startsWith("https")) {
                setAnimationFromUrl(str);
            } else {
                if (str.startsWith("./")) {
                    str = str.substring(2);
                }
                if (str.lastIndexOf("/") > 0) {
                    setImageAssetsFolder(str.substring(0, str.lastIndexOf("/") + 1) + "images/");
                }
                setAnimation(str);
            }
            this.mSrc = str;
            return true;
        }

        public TNodeLottieView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public TNodeLottieView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MODE_CONTAIN = "contain";
        public static final String MODE_COVER = "cover";
        public static final String MODE_STRETCH = "stretch";
        public String w0;
        public boolean y0;
        public boolean x0 = true;
        public boolean z0 = false;
        public String A0 = "contain";
        public int B0 = 1;
        public boolean C0 = false;
        public int D0 = 0;

        static {
            t2o.a(502268191);
        }

        public static /* synthetic */ int I(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9c658ac5", new Object[]{cVar})).intValue();
            }
            return cVar.D0;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -998046064) {
                super.B((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/AnimationViewComponent$AnimationViewParam");
        }

        @Override // tb.jfw
        public void B(Context context, HashMap hashMap) {
            int i = 1;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
                return;
            }
            super.B(context, hashMap);
            this.w0 = nwv.I(hashMap.get("src"), "");
            String str = "auto-play";
            if (!hashMap.containsKey(str)) {
                str = "play";
            }
            this.x0 = nwv.o(hashMap.get(str), true);
            this.y0 = nwv.o(hashMap.get("loop"), false);
            this.z0 = nwv.o(hashMap.get(pg1.ATOM_EXT_reverse), false);
            this.C0 = nwv.o(hashMap.get("apply-layer-opacity"), false);
            if (hashMap.containsKey("color")) {
                i = ir2.j(hashMap.get("color"));
            }
            this.B0 = i;
            this.A0 = nwv.I(hashMap.get("content-mode"), "contain");
            if (this.y0) {
                i2 = -1;
            }
            this.D0 = i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f12017a;
        public final Animator.AnimatorListener b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
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
                    return;
                }
                if (AnimationViewComponent.this.getView() != null) {
                    AnimationViewComponent.this.getView().setEnabled(true);
                }
                AnimationViewComponent.s(AnimationViewComponent.this);
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

        static {
            t2o.a(502268192);
        }

        public d() {
            this.b = new a();
        }

        public static /* synthetic */ boolean a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("93a939d1", new Object[]{dVar})).booleanValue();
            }
            return dVar.j();
        }

        public static /* synthetic */ void b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbda40d2", new Object[]{dVar});
            } else {
                dVar.h();
            }
        }

        public static /* synthetic */ boolean c(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bd4f7aee", new Object[]{dVar})).booleanValue();
            }
            return dVar.g();
        }

        public static /* synthetic */ boolean d(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("39d91fa8", new Object[]{dVar})).booleanValue();
            }
            return dVar.i();
        }

        public static /* synthetic */ boolean e(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("774d8f2a", new Object[]{dVar})).booleanValue();
            }
            return dVar.k();
        }

        public void f(TNodeLottieView tNodeLottieView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec9a8bf3", new Object[]{this, tNodeLottieView});
            } else {
                tNodeLottieView.addAnimatorListener(this.b);
            }
        }

        public final boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d654eb6", new Object[]{this})).booleanValue();
            }
            if (AnimationViewComponent.C(AnimationViewComponent.this) == null || !((TNodeLottieView) AnimationViewComponent.D(AnimationViewComponent.this)).isAnimating()) {
                return false;
            }
            ((TNodeLottieView) AnimationViewComponent.E(AnimationViewComponent.this)).cancelAnimation();
            return true;
        }

        public final void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f89c8cb", new Object[]{this});
            } else {
                this.f12017a = false;
            }
        }

        public final boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
            }
            if (AnimationViewComponent.t(AnimationViewComponent.this) == null || !((TNodeLottieView) AnimationViewComponent.u(AnimationViewComponent.this)).isAnimating()) {
                return false;
            }
            return true;
        }

        public final boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("60820a32", new Object[]{this})).booleanValue();
            }
            this.f12017a = true;
            if (AnimationViewComponent.z(AnimationViewComponent.this) == null || !((TNodeLottieView) AnimationViewComponent.A(AnimationViewComponent.this)).isAnimating()) {
                return false;
            }
            ((TNodeLottieView) AnimationViewComponent.B(AnimationViewComponent.this)).pauseAnimation();
            return true;
        }

        public final boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec8e49cf", new Object[]{this})).booleanValue();
            }
            if (AnimationViewComponent.v(AnimationViewComponent.this) == null || i()) {
                return false;
            }
            if (this.f12017a) {
                ((TNodeLottieView) AnimationViewComponent.x(AnimationViewComponent.this)).resumeAnimation();
            } else {
                ((TNodeLottieView) AnimationViewComponent.y(AnimationViewComponent.this)).playAnimation();
            }
            this.f12017a = false;
            return true;
        }

        public void l(TNodeLottieView tNodeLottieView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb3eb6ba", new Object[]{this, tNodeLottieView});
            } else {
                tNodeLottieView.removeAnimatorListener(this.b);
            }
        }

        public /* synthetic */ d(AnimationViewComponent animationViewComponent, a aVar) {
            this();
        }
    }

    public final boolean L(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d94bb97c", new Object[]{this, gVar})).booleanValue();
        }
        if (akt.p2("fixLottieAppear", true)) {
            return TextUtils.equals(gVar.d, "onwillappear");
        }
        return q.z(gVar);
    }

    public final boolean N(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cc7062", new Object[]{this, gVar})).booleanValue();
        }
        if (akt.p2("fixLottieAppear", true)) {
            return TextUtils.equals(gVar.d, "onwilldisappear");
        }
        return q.A(gVar);
    }

    /* renamed from: H */
    public void applyAttrForView(TNodeLottieView tNodeLottieView, c cVar, Map map, boolean z) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658f034b", new Object[]{this, tNodeLottieView, cVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(this.view, cVar, map, z);
        ((TNodeLottieView) this.view).setSrc(cVar.w0);
        ((TNodeLottieView) this.view).setRepeatCount(c.I((c) this.viewParams));
        TNodeLottieView tNodeLottieView2 = (TNodeLottieView) this.view;
        if (!((c) this.viewParams).z0) {
            i = 1;
        }
        tNodeLottieView2.setRepeatMode(i);
        int i2 = cVar.B0;
        if (i2 != 1) {
            ((TNodeLottieView) this.view).setBackgroundColor(i2);
        }
        String str = ((c) this.viewParams).A0;
        str.hashCode();
        if (str.equals("stretch")) {
            ((TNodeLottieView) this.view).setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (!str.equals("cover")) {
            ((TNodeLottieView) this.view).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((TNodeLottieView) this.view).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        ((TNodeLottieView) this.view).setApplyingOpacityToLayersEnabled(((c) this.viewParams).C0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r8.equals("setProgress") == false) goto L_0x0030;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.d.j r7, java.lang.String r8, com.alibaba.fastjson.JSONObject r9, com.taobao.tao.flexbox.layoutmanager.ac.d.k r10) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = "9f789b95"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0025:
            r8.hashCode()
            r3 = -1
            int r4 = r8.hashCode()
            switch(r4) {
                case -1296995794: goto L_0x0048;
                case 868223664: goto L_0x003c;
                case 988242095: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r0 = -1
            goto L_0x0053
        L_0x0032:
            java.lang.String r4 = "setProgress"
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L_0x0053
            goto L_0x0030
        L_0x003c:
            java.lang.String r0 = "playAnimation"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0046
            goto L_0x0030
        L_0x0046:
            r0 = 1
            goto L_0x0053
        L_0x0048:
            java.lang.String r0 = "pauseAnimation"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0052
            goto L_0x0030
        L_0x0052:
            r0 = 0
        L_0x0053:
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0064;
                case 2: goto L_0x0058;
                default: goto L_0x0056;
            }
        L_0x0056:
            r1 = 0
            goto L_0x006b
        L_0x0058:
            java.lang.String r0 = "progress"
            float r0 = r9.getFloatValue(r0)
            boolean r1 = r6.X(r0)
            goto L_0x006b
        L_0x0064:
            r6.U()
            goto L_0x006b
        L_0x0068:
            r6.T()
        L_0x006b:
            if (r1 != 0) goto L_0x0071
            boolean r1 = super.invoke(r7, r8, r9, r10)
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent.invoke(com.taobao.tao.flexbox.layoutmanager.ac.d$j, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.d$k):boolean");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ValueAnimator f12019a;
        public float b;
        public float c;
        public boolean d;
        public final Animator.AnimatorListener e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                e.e(e.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (AnimationViewComponent.p(AnimationViewComponent.this) != null) {
                    ((TNodeLottieView) AnimationViewComponent.q(AnimationViewComponent.this)).setProgress(e.d(e.this));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                    return;
                }
                if (AnimationViewComponent.this.getView() != null) {
                    AnimationViewComponent.this.getView().setEnabled(true);
                }
                if (animator.getDuration() == 0) {
                    AnimationViewComponent.s(AnimationViewComponent.this);
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
                } else {
                    e.f(e.this, false);
                }
            }
        }

        static {
            t2o.a(502268194);
        }

        public e() {
            this.f12019a = null;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = false;
            this.e = new b();
        }

        public static /* synthetic */ boolean a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4bde4003", new Object[]{eVar})).booleanValue();
            }
            return eVar.o();
        }

        public static /* synthetic */ boolean b(e eVar, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("acfa3c5", new Object[]{eVar, new Float(f), new Float(f2)})).booleanValue();
            }
            return eVar.p(f, f2);
        }

        public static /* synthetic */ void c(e eVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85780bfe", new Object[]{eVar, new Float(f)});
            } else {
                eVar.r(f);
            }
        }

        public static /* synthetic */ float d(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("42c4c00f", new Object[]{eVar})).floatValue();
            }
            return eVar.b;
        }

        public static /* synthetic */ float e(e eVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d6d73b2f", new Object[]{eVar, new Float(f)})).floatValue();
            }
            eVar.b = f;
            return f;
        }

        public static /* synthetic */ boolean f(e eVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f394b6d3", new Object[]{eVar, new Boolean(z)})).booleanValue();
            }
            eVar.d = z;
            return z;
        }

        public static /* synthetic */ void g(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87adac46", new Object[]{eVar});
            } else {
                eVar.m();
            }
        }

        public static /* synthetic */ boolean h(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a16c2460", new Object[]{eVar})).booleanValue();
            }
            return eVar.l();
        }

        public static /* synthetic */ boolean i(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("afabaf9a", new Object[]{eVar})).booleanValue();
            }
            return eVar.n();
        }

        public static /* synthetic */ boolean j(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f1a179c", new Object[]{eVar})).booleanValue();
            }
            return eVar.q();
        }

        public void k(TNodeLottieView tNodeLottieView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec9a8bf3", new Object[]{this, tNodeLottieView});
            } else if (tNodeLottieView != null) {
                tNodeLottieView.addAnimatorListener(this.e);
            }
        }

        public final boolean l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d654eb6", new Object[]{this})).booleanValue();
            }
            ValueAnimator valueAnimator = this.f12019a;
            if (valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    this.f12019a.setDuration(0L);
                    this.f12019a.cancel();
                    return true;
                }
                this.f12019a = null;
            }
            return false;
        }

        public final void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f89c8cb", new Object[]{this});
                return;
            }
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = false;
        }

        public final boolean n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
            }
            ValueAnimator valueAnimator = this.f12019a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }

        public final boolean o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("60820a32", new Object[]{this})).booleanValue();
            }
            this.d = true;
            ValueAnimator valueAnimator = this.f12019a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            this.f12019a.cancel();
            return true;
        }

        public final boolean p(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e8fa9e70", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            if (AnimationViewComponent.l(AnimationViewComponent.this) == null || ((TNodeLottieView) AnimationViewComponent.m(AnimationViewComponent.this)).getComposition() == null) {
                return false;
            }
            this.c = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
            this.f12019a = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f12019a.setDuration(((TNodeLottieView) AnimationViewComponent.o(AnimationViewComponent.this)).getComposition().d() * Math.abs(f2 - f));
            this.f12019a.addUpdateListener(new a());
            this.f12019a.addListener(this.e);
            this.f12019a.start();
            return true;
        }

        public final boolean q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec8e49cf", new Object[]{this})).booleanValue();
            }
            if (n()) {
                return false;
            }
            if (this.d) {
                return p(this.b, this.c);
            }
            return p(0.0f, 1.0f);
        }

        public final void r(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
                return;
            }
            this.b = f;
            ((TNodeLottieView) AnimationViewComponent.r(AnimationViewComponent.this)).setProgress(f);
        }

        public void s(TNodeLottieView tNodeLottieView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb3eb6ba", new Object[]{this, tNodeLottieView});
                return;
            }
            l();
            if (tNodeLottieView != null) {
                tNodeLottieView.removeAnimatorListener(this.e);
            }
        }

        public /* synthetic */ e(AnimationViewComponent animationViewComponent, a aVar) {
            this();
        }
    }
}
