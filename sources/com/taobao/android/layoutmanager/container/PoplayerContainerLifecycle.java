package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.BaseContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.io.Serializable;
import tb.lgs;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PoplayerContainerLifecycle extends com.taobao.android.layoutmanager.container.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AnimationParams e = new AnimationParams();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class AnimationCollection implements Serializable {
        public String pop = "bottom";
        public float scale = -1.0f;
        public float opacity = -1.0f;

        static {
            t2o.a(502268012);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class AnimationParams implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_VALUE = -1;
        public AnimationCollection animation = new AnimationCollection();
        public int top = -1;
        public int left = -1;
        public int right = -1;
        public int bottom = -1;
        public int width = -1;
        public int height = -1;
        public boolean backgroundClicked = true;

        static {
            t2o.a(502268013);
        }

        public static boolean isValid(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7be089ae", new Object[]{new Integer(i)})).booleanValue();
            }
            if (i != -1) {
                return true;
            }
            return false;
        }

        private int transferToDevicePixel(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6faa4365", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i != -1) {
                return s6o.S(o.J(), i);
            }
            return i;
        }

        public void defaultValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e3eb837", new Object[]{this});
                return;
            }
            this.top = 0;
            this.animation.pop = "bottom";
        }

        public int getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            int i = this.height;
            if (i != -1) {
                return i;
            }
            return (s6o.m() - this.top) - this.bottom;
        }

        public int getWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            int i = this.width;
            if (i != -1) {
                return i;
            }
            return (s6o.B(o.J()) - this.left) - this.right;
        }

        public void transform() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("999859f3", new Object[]{this});
                return;
            }
            this.top = transferToDevicePixel(this.top);
            this.left = transferToDevicePixel(this.left);
            this.right = transferToDevicePixel(this.right);
            this.bottom = transferToDevicePixel(this.bottom);
            this.width = transferToDevicePixel(this.width);
            this.height = transferToDevicePixel(this.height);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f8183a;

        public a(Activity activity) {
            this.f8183a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (PoplayerContainerLifecycle.e(PoplayerContainerLifecycle.this).backgroundClicked) {
                this.f8183a.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f8184a;
        public final /* synthetic */ BaseContainerFragment.b b;

        public b(Activity activity, BaseContainerFragment.b bVar) {
            this.f8184a = activity;
            this.b = bVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            PoplayerContainerLifecycle.f(PoplayerContainerLifecycle.this, this.f8184a, this.b);
            this.f8184a.overridePendingTransition(0, 17432577);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(502268009);
    }

    public PoplayerContainerLifecycle(Context context, BaseContainerFragment baseContainerFragment, lgs.b bVar) {
        super(context, baseContainerFragment, bVar);
    }

    public static /* synthetic */ AnimationParams e(PoplayerContainerLifecycle poplayerContainerLifecycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationParams) ipChange.ipc$dispatch("759fcdc9", new Object[]{poplayerContainerLifecycle});
        }
        return poplayerContainerLifecycle.e;
    }

    public static /* synthetic */ void f(PoplayerContainerLifecycle poplayerContainerLifecycle, Activity activity, BaseContainerFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6868c6", new Object[]{poplayerContainerLifecycle, activity, bVar});
        } else {
            super.b(activity, bVar);
        }
    }

    public static /* synthetic */ Object ipc$super(PoplayerContainerLifecycle poplayerContainerLifecycle, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -551331664) {
            super.b((Activity) objArr[0], (BaseContainerFragment.b) objArr[1]);
            return null;
        } else if (hashCode == 668965158) {
            super.d((Activity) objArr[0]);
            return null;
        } else if (hashCode == 1088563732) {
            super.c((n) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/layoutmanager/container/PoplayerContainerLifecycle");
        }
    }

    @Override // com.taobao.android.layoutmanager.container.a
    public void b(Activity activity, BaseContainerFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df2358b0", new Object[]{this, activity, bVar});
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        Animation m = m(this.e);
        if (m != null) {
            animationSet.addAnimation(m);
        }
        Animation l = l(this.e);
        if (l != null) {
            animationSet.addAnimation(l);
        }
        Animation n = n(this.e);
        if (n != null) {
            animationSet.addAnimation(n);
        }
        this.c.v2().clearAnimation();
        this.c.v2().setAnimation(animationSet);
        animationSet.start();
        animationSet.setAnimationListener(new b(activity, bVar));
    }

    @Override // com.taobao.android.layoutmanager.container.a
    public void c(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e22a14", new Object[]{this, nVar});
            return;
        }
        super.c(nVar);
        this.c.v2().setLayoutParams(k(this.e));
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        animationSet.setDuration(300L);
        Animation i = i(this.e);
        if (i != null) {
            animationSet.addAnimation(i);
        }
        Animation h = h(this.e);
        if (h != null) {
            animationSet.addAnimation(h);
        }
        Animation j = j(this.e);
        if (j != null) {
            animationSet.addAnimation(j);
        }
        this.c.v2().clearAnimation();
        this.c.v2().setAnimation(animationSet);
        animationSet.start();
    }

    @Override // com.taobao.android.layoutmanager.container.a
    public void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27df9926", new Object[]{this, activity});
            return;
        }
        super.d(activity);
        if (activity != null) {
            activity.overridePendingTransition(17432576, 0);
        }
        String queryParameter = this.b.b.getQueryParameter("extraData");
        if (!TextUtils.isEmpty(queryParameter)) {
            this.e = (AnimationParams) JSON.parseObject(queryParameter, AnimationParams.class);
        } else {
            this.e.defaultValue();
        }
        this.e.transform();
        this.c.u2().setBackgroundColor(0);
        this.c.u2().setOnClickListener(new a(activity));
    }

    public final boolean g(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("105497aa", new Object[]{this, animationParams})).booleanValue();
        }
        if (!AnimationParams.isValid(animationParams.width) || !AnimationParams.isValid(animationParams.height) || AnimationParams.isValid(animationParams.left) || AnimationParams.isValid(animationParams.top) || AnimationParams.isValid(animationParams.right) || AnimationParams.isValid(animationParams.bottom)) {
            return false;
        }
        return true;
    }

    public final Animation h(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("c6d77cb2", new Object[]{this, animationParams});
        }
        AnimationCollection animationCollection = animationParams.animation;
        if (animationCollection == null) {
            return null;
        }
        float f = animationCollection.opacity;
        if (f != -1.0f) {
            return new AlphaAnimation(f, 1.0f);
        }
        return null;
    }

    public final Animation i(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("1d174f13", new Object[]{this, animationParams});
        }
        AnimationCollection animationCollection = animationParams.animation;
        if (animationCollection == null) {
            return null;
        }
        float f = animationCollection.scale;
        if (f != -1.0f) {
            return new ScaleAnimation(f, 1.0f, f, 1.0f, 1, 0.5f, 1, 0.5f);
        }
        return null;
    }

    public final Animation j(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("afd6110f", new Object[]{this, animationParams});
        }
        AnimationCollection animationCollection = animationParams.animation;
        if (animationCollection == null) {
            return null;
        }
        String str = animationCollection.pop;
        if ("bottom".equalsIgnoreCase(str)) {
            return new TranslateAnimation(0.0f, 0.0f, s6o.m(), animationParams.top);
        }
        if ("left".equalsIgnoreCase(str)) {
            return new TranslateAnimation(-animationParams.getWidth(), animationParams.left, 0.0f, 0.0f);
        }
        if ("right".equalsIgnoreCase(str)) {
            return new TranslateAnimation(s6o.B(o.J()), animationParams.right, 0.0f, 0.0f);
        }
        if ("top".equalsIgnoreCase(str)) {
            return new TranslateAnimation(0.0f, 0.0f, -animationParams.getHeight(), animationParams.top);
        }
        return null;
    }

    public final FrameLayout.LayoutParams k(AnimationParams animationParams) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("ae34ef9b", new Object[]{this, animationParams});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (g(animationParams)) {
            layoutParams.gravity = 17;
            layoutParams.width = animationParams.width;
            layoutParams.height = animationParams.height;
        } else {
            ActionBar supportActionBar = ((AppCompatActivity) this.c.getActivity()).getSupportActionBar();
            int z = animationParams.top - s6o.z(this.f8186a);
            if (supportActionBar.isShowing()) {
                z -= supportActionBar.getHeight();
            }
            if (z >= 0) {
                i = z;
            }
            if (AnimationParams.isValid(animationParams.left)) {
                layoutParams.leftMargin = animationParams.left;
                o(layoutParams, 3);
            }
            if (AnimationParams.isValid(animationParams.top)) {
                layoutParams.topMargin = i;
                o(layoutParams, 48);
            }
            if (AnimationParams.isValid(animationParams.right)) {
                layoutParams.rightMargin = animationParams.right;
                o(layoutParams, 5);
            }
            if (AnimationParams.isValid(animationParams.bottom)) {
                layoutParams.bottomMargin = animationParams.bottom;
                o(layoutParams, 80);
            }
            if (AnimationParams.isValid(animationParams.width)) {
                layoutParams.width = animationParams.width;
            }
            if (AnimationParams.isValid(animationParams.height)) {
                layoutParams.height = animationParams.height;
            }
        }
        return layoutParams;
    }

    public final Animation l(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("174094a3", new Object[]{this, animationParams});
        }
        AnimationCollection animationCollection = animationParams.animation;
        if (animationCollection == null) {
            return null;
        }
        float f = animationCollection.opacity;
        if (f != -1.0f) {
            return new AlphaAnimation(1.0f, f);
        }
        return null;
    }

    public final Animation m(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("2c17af44", new Object[]{this, animationParams});
        }
        AnimationCollection animationCollection = animationParams.animation;
        if (animationCollection == null) {
            return null;
        }
        float f = animationCollection.scale;
        if (f != -1.0f) {
            return new ScaleAnimation(1.0f, f, 1.0f, f, 1, 0.5f, 1, 0.5f);
        }
        return null;
    }

    public final Animation n(AnimationParams animationParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("8a58f0c0", new Object[]{this, animationParams});
        }
        AnimationCollection animationCollection = animationParams.animation;
        if (animationCollection == null) {
            return null;
        }
        String str = animationCollection.pop;
        if ("bottom".equalsIgnoreCase(str)) {
            return new TranslateAnimation(0.0f, 0.0f, animationParams.top, s6o.m());
        }
        if ("left".equalsIgnoreCase(str)) {
            return new TranslateAnimation(animationParams.left, -animationParams.getWidth(), 0.0f, 0.0f);
        }
        if ("right".equalsIgnoreCase(str)) {
            return new TranslateAnimation(animationParams.right, s6o.B(o.J()), 0.0f, 0.0f);
        }
        if ("top".equalsIgnoreCase(str)) {
            return new TranslateAnimation(0.0f, 0.0f, animationParams.top, -animationParams.getHeight());
        }
        return null;
    }

    public final void o(FrameLayout.LayoutParams layoutParams, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55fe91b", new Object[]{this, layoutParams, new Integer(i)});
            return;
        }
        int i2 = layoutParams.gravity;
        if (i2 == -1) {
            layoutParams.gravity = i;
        } else {
            layoutParams.gravity = i | i2;
        }
    }
}
