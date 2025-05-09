package com.taobao.avplayer;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.constraintlayout.motion.widget.Key;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;
import com.taobao.avplayer.a;
import com.taobao.avplayer.common.DWScreenOrientationListenerImp;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.model.MediaInfoAuthRegister;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.aub;
import tb.b75;
import tb.c32;
import tb.d75;
import tb.dub;
import tb.ew0;
import tb.feh;
import tb.fub;
import tb.gsc;
import tb.itw;
import tb.krc;
import tb.nj9;
import tb.psb;
import tb.rrc;
import tb.t2o;
import tb.uyv;
import tb.wtb;
import tb.ytb;
import tb.z5r;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b implements wtb, ytb, rrc, krc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DWVideoScreenType2 A;
    public boolean B;
    public boolean C;
    public DWScreenOrientationListenerImp.Orientation D;
    public int E;
    public final feh G;
    public f0 H;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f10119a;
    public final c32 b;
    public boolean c;
    public float g;
    public Runnable h;
    public Runnable i;
    public AtomicInteger k;
    public FrameLayout l;
    public int m;
    public int n;
    public AnimatorSet o;
    public AnimatorSet p;
    public int r;
    public ViewGroup s;
    public ViewGroup t;
    public boolean u;
    public float v;
    public float w;
    public volatile boolean x;
    public DWVideoScreenType2 z;
    public boolean e = true;
    public boolean f = true;
    public int j = 0;
    public int[] q = new int[2];
    public boolean y = true;
    public boolean F = false;
    public final Handler d = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.q(b.this).getLayoutParams();
            layoutParams.width = (int) (b.a0(b.this).mWidth + (((b.C(b.this) - b.a0(b.this).mWidth) * floatValue) / 90.0f));
            layoutParams.height = (int) (b.a0(b.this).mHeight + (((b.P(b.this) - b.a0(b.this).mHeight) * floatValue) / 90.0f));
            b.q(b.this).requestLayout();
            if (floatValue > 20.0f && Build.VERSION.SDK_INT >= 28 && !b.t(b.this)) {
                WindowManager.LayoutParams attributes = b.a0(b.this).getActivity().getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                b.a0(b.this).getActivity().getWindow().setAttributes(attributes);
                b.u(b.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a0 implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DWVideoViewController.FullOritation f10121a;

        public a0(DWVideoViewController.FullOritation fullOritation) {
            this.f10121a = fullOritation;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                b.d0(b.this, this.f10121a);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                b.d0(b.this, this.f10121a);
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

    /* compiled from: Taobao */
    /* renamed from: com.taobao.avplayer.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0534b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0534b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                b.v(b.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                b.v(b.this);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b0 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DWVideoViewController.FullOritation f10123a;

        public b0(DWVideoViewController.FullOritation fullOritation) {
            this.f10123a = fullOritation;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b.q(b.this).requestLayout();
            DWVideoViewController.FullOritation fullOritation = this.f10123a;
            if (fullOritation == DWVideoViewController.FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90 || fullOritation == DWVideoViewController.FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                b.Z(b.this, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90);
            } else {
                b.Z(b.this, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270);
            }
            b.q(b.this).setLayerType(0, null);
            b.c0(b.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.p(b.this).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c0 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10125a;

        public c0(boolean z) {
            this.f10125a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = b.a0(b.this).getActivity().getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                b.a0(b.this).getActivity().getWindow().setAttributes(attributes);
            }
            b.q(b.this).setLayerType(2, null);
            if (b.q(b.this).getParent() == b.r(b.this)) {
                b.r(b.this).removeView(b.q(b.this));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.q(b.this).getLayoutParams();
                layoutParams.gravity = 17;
                layoutParams.width = -1;
                layoutParams.height = -1;
                b.s(b.this).addView(b.q(b.this), layoutParams);
                b.q(b.this).requestLayout();
                if (b.a0(b.this).getVideo().getVideoState() == 4) {
                    b.b0(b.this).h0(b.this.getDuration(), false);
                }
            }
            DWContext a0 = b.a0(b.this);
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.LANDSCAPE_FULL_SCREEN;
            a0.setVideoScreenType(dWVideoScreenType);
            if (this.f10125a) {
                b.Z(b.this, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270);
            } else {
                b.Z(b.this, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90);
            }
            b.b0(b.this).T(dWVideoScreenType);
            if (b.a0(b.this) != null && !b.a0(b.this).mHookKeyBackToggleEvent) {
                b.a0(b.this).registerKeyBackEventListener(b.this);
            }
            b.q(b.this).setLayerType(0, null);
            b.c0(b.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.width = (int) (b.a0(b.this).mWidth + (((b.C(b.this) - b.a0(b.this).mWidth) * abs) / 90.0f));
            layoutParams.height = (int) (b.a0(b.this).mHeight + (((b.P(b.this) - b.a0(b.this).mHeight) * abs) / 90.0f));
            layoutParams.topMargin = b.w(b.this)[1];
            layoutParams.leftMargin = b.w(b.this)[0];
            b.q(b.this).setLayoutParams(layoutParams);
            if (abs > 20.0f && Build.VERSION.SDK_INT >= 28 && !b.t(b.this)) {
                WindowManager.LayoutParams attributes = b.a0(b.this).getActivity().getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                b.a0(b.this).getActivity().getWindow().setAttributes(attributes);
                b.u(b.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d0 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.p(b.this).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10128a;

        public e(boolean z) {
            this.f10128a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                b.x(b.this, this.f10128a);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                b.x(b.this, this.f10128a);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e0 {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10129a;

        public f(boolean z) {
            this.f10129a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b.q(b.this).requestLayout();
            DWContext a0 = b.a0(b.this);
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.LANDSCAPE_FULL_SCREEN;
            a0.setVideoScreenType(dWVideoScreenType);
            if (this.f10129a) {
                b.Z(b.this, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270);
            } else {
                b.Z(b.this, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90);
            }
            b.b0(b.this).T(dWVideoScreenType);
            if (b.a0(b.this) != null && !b.a0(b.this).mHookKeyBackToggleEvent) {
                b.a0(b.this).registerKeyBackEventListener(b.this);
            }
            b.q(b.this).setLayerType(0, null);
            b.c0(b.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f0 {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b.q(b.this).requestLayout();
            DWContext a0 = b.a0(b.this);
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.PORTRAIT_FULL_SCREEN;
            a0.setVideoScreenType(dWVideoScreenType);
            b.b0(b.this).T(dWVideoScreenType);
            b bVar = b.this;
            DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.PORTRAIT_FULL_SCREEN;
            b.Z(bVar, dWVideoScreenType2);
            b.z(b.this, dWVideoScreenType2);
            if (b.a0(b.this) != null && !b.a0(b.this).mHookKeyBackToggleEvent) {
                b.a0(b.this).registerKeyBackEventListener(b.this);
            }
            b.q(b.this).setLayerType(0, null);
            b.c0(b.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.p(b.this).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10132a;
        public final /* synthetic */ int b;

        public i(int i, int i2) {
            this.f10132a = i;
            this.b = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.q(b.this).getLayoutParams();
            layoutParams.width = (int) (this.f10132a + (((b.C(b.this) - this.f10132a) * abs) / 90.0f));
            layoutParams.height = (int) (this.b + (((b.P(b.this) - this.b) * abs) / 90.0f));
            b.q(b.this).requestLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DWVideoViewController.FullOritation f10133a;

        public j(DWVideoViewController.FullOritation fullOritation) {
            this.f10133a = fullOritation;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                b.A(b.this, this.f10133a);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                b.A(b.this, this.f10133a);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.p(b.this).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DWVideoViewController.FullOritation f10135a;

        public l(DWVideoViewController.FullOritation fullOritation) {
            this.f10135a = fullOritation;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b.q(b.this).requestLayout();
            DWVideoViewController.FullOritation fullOritation = this.f10135a;
            if (fullOritation == DWVideoViewController.FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90 || fullOritation == DWVideoViewController.FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                b.Z(b.this, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90);
            } else {
                b.Z(b.this, DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270);
            }
            DWContext a0 = b.a0(b.this);
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.LANDSCAPE_FULL_SCREEN;
            a0.setVideoScreenType(dWVideoScreenType);
            b.b0(b.this).T(dWVideoScreenType);
            b.q(b.this).setLayerType(0, null);
            b.c0(b.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class m implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.width = (int) (b.a0(b.this).mWidth + (((b.C(b.this) - b.a0(b.this).mWidth) * floatValue) / 90.0f));
            layoutParams.height = (int) (b.a0(b.this).mHeight + (((b.P(b.this) - b.a0(b.this).mHeight) * floatValue) / 90.0f));
            b.q(b.this).setLayoutParams(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class n implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                b.B(b.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                b.B(b.this);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class o implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.width = (int) (b.a0(b.this).mWidth + (((b.C(b.this) - b.a0(b.this).mWidth) * abs) / 90.0f));
            layoutParams.height = (int) (b.a0(b.this).mHeight + (((b.P(b.this) - b.a0(b.this).mHeight) * abs) / 90.0f));
            layoutParams.gravity = 17;
            b.q(b.this).setLayoutParams(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class p implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                b.D(b.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                b.D(b.this);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (b.q(b.this).getParent() != b.r(b.this)) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                b.q(b.this).requestLayout();
                if (b.q(b.this).getParent() != null && (b.q(b.this).getParent() instanceof ViewGroup)) {
                    ((ViewGroup) b.q(b.this).getParent()).removeView(b.q(b.this));
                    b.r(b.this).addView(b.q(b.this), layoutParams);
                }
                if (b.a0(b.this).getVideo().getVideoState() == 4) {
                    b.b0(b.this).h0(b.this.getDuration(), false);
                }
                b.q(b.this).setTranslationX(b.E(b.this));
                b.q(b.this).setTranslationY(b.F(b.this));
                b.q(b.this).requestLayout();
                b.c0(b.this, false);
            }
            b bVar = b.this;
            DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.NORMAL;
            b.z(bVar, dWVideoScreenType2);
            DWContext a0 = b.a0(b.this);
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.NORMAL;
            a0.setVideoScreenType(dWVideoScreenType);
            b.Z(b.this, dWVideoScreenType2);
            b.b0(b.this).T(dWVideoScreenType);
            b.q(b.this).setLayerType(0, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class r implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (b.q(b.this).getParent() != b.r(b.this)) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                b.q(b.this).requestLayout();
                if (b.q(b.this).getParent() != null && (b.q(b.this).getParent() instanceof ViewGroup)) {
                    ((ViewGroup) b.q(b.this).getParent()).removeView(b.q(b.this));
                    b.r(b.this).addView(b.q(b.this), layoutParams);
                }
                if (b.a0(b.this).getVideo().getVideoState() == 4) {
                    b.b0(b.this).h0(b.this.getDuration(), false);
                }
                b.q(b.this).setTranslationX(b.E(b.this));
                b.q(b.this).setTranslationY(b.F(b.this));
                b.q(b.this).requestLayout();
                b.c0(b.this, false);
            }
            b bVar = b.this;
            DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.NORMAL;
            b.z(bVar, dWVideoScreenType2);
            DWContext a0 = b.a0(b.this);
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.NORMAL;
            a0.setVideoScreenType(dWVideoScreenType);
            b.Z(b.this, dWVideoScreenType2);
            b.b0(b.this).T(dWVideoScreenType);
            b.q(b.this).setLayerType(0, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class s implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (b.q(b.this).getParent() != b.r(b.this)) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                b.q(b.this).requestLayout();
                b.q(b.this).setTranslationX(0.0f);
                b.q(b.this).setTranslationY(0.0f);
                if (b.q(b.this).getParent() != null && (b.q(b.this).getParent() instanceof ViewGroup)) {
                    ((ViewGroup) b.q(b.this).getParent()).removeView(b.q(b.this));
                    b.r(b.this).addView(b.q(b.this), layoutParams);
                }
                if (b.a0(b.this).getVideo().getVideoState() == 4) {
                    b.b0(b.this).h0(b.this.getDuration(), false);
                }
                b bVar = b.this;
                DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.NORMAL;
                b.z(bVar, dWVideoScreenType2);
                DWContext a0 = b.a0(b.this);
                DWVideoScreenType dWVideoScreenType = DWVideoScreenType.NORMAL;
                a0.setVideoScreenType(dWVideoScreenType);
                b.Z(b.this, dWVideoScreenType2);
                b.b0(b.this).T(dWVideoScreenType);
                if (b.a0(b.this) != null && !b.a0(b.this).mHookKeyBackToggleEvent) {
                    b.a0(b.this).unregisterKeyBackEventListener(b.this);
                }
                b.q(b.this).setLayerType(0, null);
                b.c0(b.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class t implements DWScreenOrientationListenerImp.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public t() {
        }

        @Override // com.taobao.avplayer.common.DWScreenOrientationListenerImp.a
        public void a(DWScreenOrientationListenerImp.Orientation orientation) {
            Window window;
            Window window2;
            Window window3;
            Window window4;
            DWVideoViewController.FullOritation fullOritation;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("634eb0a6", new Object[]{this, orientation});
                return;
            }
            b bVar = b.this;
            bVar.D = orientation;
            if (bVar.Z0()) {
                DWScreenOrientationListenerImp.Orientation orientation2 = DWScreenOrientationListenerImp.Orientation.LANDSCAPE_90;
                if ((orientation == orientation2 || orientation == DWScreenOrientationListenerImp.Orientation.LANDSCAPE_270) && b.a0(b.this).screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN && b.G(b.this)) {
                    b.H(b.this, false);
                } else if (orientation == DWScreenOrientationListenerImp.Orientation.PORTRAIT && b.a0(b.this).screenType() == DWVideoScreenType.NORMAL && b.I(b.this)) {
                    b.J(b.this, false);
                }
                if (orientation == DWScreenOrientationListenerImp.Orientation.PORTRAIT && b.a0(b.this).screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN && !b.G(b.this)) {
                    if (b.y(b.this) == DWVideoScreenType2.PORTRAIT_FULL_SCREEN) {
                        b bVar2 = b.this;
                        if (b.Y(bVar2) == DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90) {
                            fullOritation = DWVideoViewController.FullOritation.LANDSCAPE_FULL90_TO_PORTRAIT_FULL;
                        } else {
                            fullOritation = DWVideoViewController.FullOritation.LANDSCAPE_FULL270_TO_PORTRAIT_FULL;
                        }
                        b.K(bVar2, fullOritation);
                    } else {
                        b.this.n();
                    }
                    b.H(b.this, false);
                    b.J(b.this, false);
                } else if (orientation == orientation2 && b.a0(b.this).screenType() == DWVideoScreenType.NORMAL && !b.I(b.this)) {
                    b.L(b.this, false, false);
                    if (b.a0(b.this).isActivityToggleForLandscape()) {
                        b bVar3 = b.this;
                        if (b.a0(bVar3).getWindow() == null) {
                            window4 = b.a0(b.this).getActivity().getWindow();
                        } else {
                            window4 = b.a0(b.this).getWindow();
                        }
                        b.M(bVar3, DWViewUtil.hideNavigationBar(window4));
                        return;
                    }
                    b bVar4 = b.this;
                    if (b.a0(bVar4).getWindow() == null) {
                        window3 = b.a0(b.this).getActivity().getWindow();
                    } else {
                        window3 = b.a0(b.this).getWindow();
                    }
                    b.M(bVar4, DWViewUtil.hideNavigationBar(window3));
                } else {
                    DWScreenOrientationListenerImp.Orientation orientation3 = DWScreenOrientationListenerImp.Orientation.LANDSCAPE_270;
                    if (orientation == orientation3 && b.a0(b.this).screenType() == DWVideoScreenType.NORMAL && !b.I(b.this)) {
                        b.L(b.this, false, true);
                        if (b.a0(b.this).isActivityToggleForLandscape()) {
                            b bVar5 = b.this;
                            if (b.a0(bVar5).getWindow() == null) {
                                window2 = b.a0(b.this).getActivity().getWindow();
                            } else {
                                window2 = b.a0(b.this).getWindow();
                            }
                            b.M(bVar5, DWViewUtil.hideNavigationBar(window2));
                            return;
                        }
                        b bVar6 = b.this;
                        if (b.a0(bVar6).getWindow() == null) {
                            window = b.a0(b.this).getActivity().getWindow();
                        } else {
                            window = b.a0(b.this).getWindow();
                        }
                        b.M(bVar6, DWViewUtil.hideNavigationBar(window));
                    } else if (orientation == orientation3 && b.Y(b.this) == DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_90) {
                        b.N(b.this, DWVideoViewController.FullOritation.LANDSCAPE_FULL90_TO_LANDSCAPE_FULL270);
                    } else if (orientation == orientation2 && b.Y(b.this) == DWVideoScreenType2.LANDSCAPE_FULL_SCREEN_270) {
                        b.N(b.this, DWVideoViewController.FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90);
                    } else if (orientation == orientation2 && b.Y(b.this) == DWVideoScreenType2.PORTRAIT_FULL_SCREEN) {
                        b.O(b.this, DWVideoViewController.FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90);
                        if (b.G(b.this)) {
                            b.H(b.this, false);
                        }
                    } else if (orientation == orientation3 && b.Y(b.this) == DWVideoScreenType2.PORTRAIT_FULL_SCREEN) {
                        b.O(b.this, DWVideoViewController.FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL270);
                        if (b.G(b.this)) {
                            b.H(b.this, false);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class u implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b.R(b.this);
            feh S = b.S(b.this);
            AVSDKLog.e(S, "dwHPInstance volumeFadeIn setVolume = " + (b.T(b.this) * ((b.Q(b.this) * 0.2f) + 0.2f)));
            b.b0(b.this).q0(b.T(b.this) * ((((float) b.Q(b.this)) * 0.2f) + 0.2f));
            if (b.Q(b.this) < 4) {
                b.V(b.this).postDelayed(b.U(b.this), 500L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class v implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f10145a;
        public final /* synthetic */ int b;

        public v(int i, int i2) {
            this.f10145a = i;
            this.b = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.q(b.this).getLayoutParams();
            layoutParams.width = (int) (this.f10145a + (((b.C(b.this) - this.f10145a) * abs) / 90.0f));
            layoutParams.height = (int) (this.b + (((b.P(b.this) - this.b) * abs) / 90.0f));
            b.q(b.this).requestLayout();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class w implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f10146a;
        public final /* synthetic */ float b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public w(float f, float f2, int i, int i2) {
            this.f10146a = f;
            this.b = f2;
            this.c = i;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int incrementAndGet = b.W(b.this).incrementAndGet();
            float f = this.f10146a + (this.b * incrementAndGet);
            feh S = b.S(b.this);
            AVSDKLog.e(S, "dwHPInstance VolumeFadeIn New set Volume = " + f);
            b.b0(b.this).q0(f);
            if (incrementAndGet < this.c) {
                b.V(b.this).postDelayed(this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class x implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public x() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                b.X(b.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                b.X(b.this);
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class y implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b.q(b.this).requestLayout();
            b.Z(b.this, DWVideoScreenType2.PORTRAIT_FULL_SCREEN);
            DWContext a0 = b.a0(b.this);
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.PORTRAIT_FULL_SCREEN;
            a0.setVideoScreenType(dWVideoScreenType);
            b.b0(b.this).T(dWVideoScreenType);
            b.q(b.this).setLayerType(0, null);
            b.c0(b.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class z implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.p(b.this).start();
            }
        }
    }

    static {
        t2o.a(452984885);
        t2o.a(452985007);
        t2o.a(452985011);
        t2o.a(774897758);
        t2o.a(774897757);
    }

    public b(DWContext dWContext, boolean z2) {
        DWVideoScreenType2 dWVideoScreenType2 = DWVideoScreenType2.NORMAL;
        this.z = dWVideoScreenType2;
        this.A = dWVideoScreenType2;
        this.f10119a = dWContext;
        feh fehVar = new feh(toString(), dWContext.getVideoToken());
        this.G = fehVar;
        AVSDKLog.e(fehVar, "Create TextureVideoView");
        if (dWContext.needAD() || TextUtils.isEmpty(dWContext.getVideoToken())) {
            this.b = new com.taobao.avplayer.player.a(dWContext, true);
        } else {
            this.b = new com.taobao.avplayer.player.a(dWContext, true, dWContext.getVideoToken());
        }
        AVSDKLog.e(fehVar, "Create TextureVideoView finished");
        this.b.k0(z2);
        this.b.a0(this);
        if (!dWContext.isActivityToggleForLandscape() && dWContext.mNeedOldPlayerUI) {
            try {
                new DWScreenOrientationListenerImp(dWContext.getActivity()).a(new t());
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void A(b bVar, DWVideoViewController.FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b24ee00", new Object[]{bVar, fullOritation});
        } else {
            bVar.w0(fullOritation);
        }
    }

    public static /* synthetic */ void B(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4272b0ab", new Object[]{bVar});
        } else {
            bVar.R0();
        }
    }

    public static /* synthetic */ int C(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8eca328", new Object[]{bVar})).intValue();
        }
        return bVar.m;
    }

    public static /* synthetic */ void D(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657df1c1", new Object[]{bVar});
        } else {
            bVar.P0();
        }
    }

    public static /* synthetic */ float E(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2b8a332", new Object[]{bVar})).floatValue();
        }
        return bVar.v;
    }

    public static /* synthetic */ float F(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ff354b3", new Object[]{bVar})).floatValue();
        }
        return bVar.w;
    }

    public static /* synthetic */ boolean G(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2e0648", new Object[]{bVar})).booleanValue();
        }
        return bVar.B;
    }

    public static /* synthetic */ boolean H(b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f444a9d2", new Object[]{bVar, new Boolean(z2)})).booleanValue();
        }
        bVar.B = z2;
        return z2;
    }

    public static /* synthetic */ boolean I(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a68b7c9", new Object[]{bVar})).booleanValue();
        }
        return bVar.C;
    }

    public static /* synthetic */ boolean J(b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e602871", new Object[]{bVar, new Boolean(z2)})).booleanValue();
        }
        bVar.C = z2;
        return z2;
    }

    public static /* synthetic */ void K(b bVar, DWVideoViewController.FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689b4b64", new Object[]{bVar, fullOritation});
        } else {
            bVar.q0(fullOritation);
        }
    }

    public static /* synthetic */ void L(b bVar, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d8df87", new Object[]{bVar, new Boolean(z2), new Boolean(z3)});
        } else {
            bVar.V0(z2, z3);
        }
    }

    public static /* synthetic */ int M(b bVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cb2646c", new Object[]{bVar, new Integer(i2)})).intValue();
        }
        bVar.E = i2;
        return i2;
    }

    public static /* synthetic */ void N(b bVar, DWVideoViewController.FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0c8c41", new Object[]{bVar, fullOritation});
        } else {
            bVar.t0(fullOritation);
        }
    }

    public static /* synthetic */ void O(b bVar, DWVideoViewController.FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a87a1e0", new Object[]{bVar, fullOritation});
        } else {
            bVar.v0(fullOritation);
        }
    }

    public static /* synthetic */ int P(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("862754a9", new Object[]{bVar})).intValue();
        }
        return bVar.n;
    }

    public static /* synthetic */ int Q(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f997053", new Object[]{bVar})).intValue();
        }
        return bVar.j;
    }

    public static /* synthetic */ int R(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bf25e5b", new Object[]{bVar})).intValue();
        }
        int i2 = bVar.j;
        bVar.j = 1 + i2;
        return i2;
    }

    public static /* synthetic */ feh S(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("912ab19c", new Object[]{bVar});
        }
        return bVar.G;
    }

    public static /* synthetic */ float T(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a0ed352", new Object[]{bVar})).floatValue();
        }
        return bVar.g;
    }

    public static /* synthetic */ Runnable U(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("5b83b7d1", new Object[]{bVar});
        }
        return bVar.h;
    }

    public static /* synthetic */ Handler V(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("f83f75e2", new Object[]{bVar});
        }
        return bVar.d;
    }

    public static /* synthetic */ AtomicInteger W(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("b563c8f", new Object[]{bVar});
        }
        return bVar.k;
    }

    public static /* synthetic */ void X(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13620637", new Object[]{bVar});
        } else {
            bVar.r0();
        }
    }

    public static /* synthetic */ DWVideoScreenType2 Y(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("3cbaa63", new Object[]{bVar});
        }
        return bVar.z;
    }

    public static /* synthetic */ DWVideoScreenType2 Z(b bVar, DWVideoScreenType2 dWVideoScreenType2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("19112f3c", new Object[]{bVar, dWVideoScreenType2});
        }
        bVar.z = dWVideoScreenType2;
        return dWVideoScreenType2;
    }

    public static /* synthetic */ DWContext a0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("861f4e54", new Object[]{bVar});
        }
        return bVar.f10119a;
    }

    public static /* synthetic */ c32 b0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c32) ipChange.ipc$dispatch("c638bd84", new Object[]{bVar});
        }
        return bVar.b;
    }

    public static /* synthetic */ boolean c0(b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cfea2bb", new Object[]{bVar, new Boolean(z2)})).booleanValue();
        }
        bVar.x = z2;
        return z2;
    }

    public static /* synthetic */ void d0(b bVar, DWVideoViewController.FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4e5fae", new Object[]{bVar, fullOritation});
        } else {
            bVar.s0(fullOritation);
        }
    }

    public static /* synthetic */ AnimatorSet p(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("57d45674", new Object[]{bVar});
        }
        return bVar.o;
    }

    public static /* synthetic */ ViewGroup q(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("883c7de1", new Object[]{bVar});
        }
        return bVar.s;
    }

    public static /* synthetic */ ViewGroup r(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("143640b3", new Object[]{bVar});
        }
        return bVar.t;
    }

    public static /* synthetic */ FrameLayout s(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b2dc1656", new Object[]{bVar});
        }
        return bVar.l;
    }

    public static /* synthetic */ boolean t(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f31287a9", new Object[]{bVar})).booleanValue();
        }
        return bVar.u;
    }

    public static /* synthetic */ boolean u(b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caf05491", new Object[]{bVar, new Boolean(z2)})).booleanValue();
        }
        bVar.u = z2;
        return z2;
    }

    public static /* synthetic */ void v(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804d3926", new Object[]{bVar});
        } else {
            bVar.T0();
        }
    }

    public static /* synthetic */ int[] w(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a3756b1d", new Object[]{bVar});
        }
        return bVar.q;
    }

    public static /* synthetic */ void x(b bVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd919bac", new Object[]{bVar, new Boolean(z2)});
        } else {
            bVar.N0(z2);
        }
    }

    public static /* synthetic */ DWVideoScreenType2 y(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("60cd3752", new Object[]{bVar});
        }
        return bVar.A;
    }

    public static /* synthetic */ DWVideoScreenType2 z(b bVar, DWVideoScreenType2 dWVideoScreenType2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType2) ipChange.ipc$dispatch("821ee12b", new Object[]{bVar, dWVideoScreenType2});
        }
        bVar.A = dWVideoScreenType2;
        return dWVideoScreenType2;
    }

    public void A0(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            ((com.taobao.avplayer.player.a) c32Var).r1(nj9Var);
        }
    }

    public void B0(int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8950038a", new Object[]{this, new Integer(i2), new Boolean(z2)});
            return;
        }
        feh fehVar = this.G;
        AVSDKLog.e(fehVar, "dwHPInstance setGradualVolumeWithConfig gradualTime = " + i2 + "switchFadeIn = " + z2);
        if (z2 && i2 > 0) {
            DWContext dWContext = this.f10119a;
            dWContext.mGradualVolumeTime = i2;
            dWContext.mSwitchFadeIn = z2;
        }
        c32 c32Var = this.b;
        if (c32Var != null && z2 && i2 > 0) {
            this.F = z2;
            ((com.taobao.avplayer.player.a) c32Var).s1(i2, z2);
        }
    }

    public void C0(fub fubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7375c5", new Object[]{this, fubVar});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            ((com.taobao.avplayer.player.a) c32Var).a1(fubVar);
        }
    }

    public void D0(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805c05a7", new Object[]{this, innerStartFuncListener});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            ((com.taobao.avplayer.player.a) c32Var).t1(innerStartFuncListener);
        }
    }

    public void E0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z2)});
        } else {
            this.c = z2;
        }
    }

    public void F0(e0 e0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8dad25", new Object[]{this, e0Var});
        }
    }

    public void G0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z2)});
        } else {
            this.f = z2;
        }
    }

    public void H0(f0 f0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76e3b85", new Object[]{this, f0Var});
        } else {
            this.H = f0Var;
        }
    }

    public void I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57bb48ce", new Object[]{this});
        } else if (this.f10119a.screenType() == DWVideoScreenType.NORMAL) {
            this.B = true;
        } else {
            this.C = true;
        }
    }

    public void J0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z2)});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            c32Var.k0(z2);
        }
    }

    public void L0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f2)});
            return;
        }
        this.d.removeCallbacks(this.h);
        this.g = f2;
        if (!this.e || f2 == 0.0f || this.F) {
            this.b.q0(f2);
        } else {
            this.b.q0(f2 * 0.2f);
        }
    }

    public final void N0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791d91fa", new Object[]{this, new Boolean(z2)});
        } else {
            this.d.post(new f(z2));
        }
    }

    public final void P0() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02129da", new Object[]{this});
            return;
        }
        if (this.f10119a.getWindow() == null) {
            window = this.f10119a.getActivity().getWindow();
        } else {
            window = this.f10119a.getWindow();
        }
        DWViewUtil.setNavigationBar(window, this.E);
        this.d.post(new r());
        DWContext dWContext = this.f10119a;
        if (dWContext != null && !dWContext.mHookKeyBackToggleEvent) {
            dWContext.unregisterKeyBackEventListener(this);
        }
    }

    public final void R0() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5810834", new Object[]{this});
            return;
        }
        if (this.f10119a.getWindow() == null) {
            window = this.f10119a.getActivity().getWindow();
        } else {
            window = this.f10119a.getWindow();
        }
        DWViewUtil.setNavigationBar(window, this.E);
        this.d.post(new q());
        DWContext dWContext = this.f10119a;
        if (dWContext != null && !dWContext.mHookKeyBackToggleEvent) {
            dWContext.unregisterKeyBackEventListener(this);
        }
    }

    public final void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d42ff6", new Object[]{this});
        } else {
            this.d.post(new g());
        }
    }

    public final void V0(boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1622ad7d", new Object[]{this, new Boolean(z2), new Boolean(z3)});
        } else if (!this.f10119a.isActivityToggleForLandscape() || z2) {
            this.u = false;
            if (m0() != null && m0().getParent() != null && m0().getParent().getParent() != null) {
                this.x = true;
                if (this.s == null && this.t == null) {
                    ViewGroup viewGroup = (ViewGroup) m0().getParent();
                    this.s = viewGroup;
                    this.t = (ViewGroup) viewGroup.getParent();
                }
                this.s.setLayerType(2, null);
                int[] iArr = new int[2];
                this.q = iArr;
                this.t.getLocationInWindow(iArr);
                if (z2) {
                    this.v = this.s.getTranslationX();
                    this.w = this.s.getTranslationY();
                }
                if (this.f10119a.getWindow() != null) {
                    this.l = (FrameLayout) this.f10119a.getWindow().getDecorView();
                } else {
                    this.l = (FrameLayout) this.f10119a.getActivity().getWindow().getDecorView();
                }
                if (z2) {
                    this.n = DWViewUtil.getVideoWidthInLandscape(this.f10119a.getActivity());
                    this.m = DWViewUtil.getPortraitScreenWidth();
                } else {
                    this.n = DWViewUtil.getRealWithInPx(this.f10119a.getActivity());
                    this.m = DWViewUtil.getVideoWidthInLandscape(this.f10119a.getActivity());
                }
                ViewParent parent = this.s.getParent();
                ViewGroup viewGroup2 = this.t;
                if (parent == viewGroup2) {
                    viewGroup2.removeView(this.s);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s.getLayoutParams();
                    layoutParams.gravity = 0;
                    DWContext dWContext = this.f10119a;
                    layoutParams.width = dWContext.mWidth;
                    layoutParams.height = dWContext.mHeight;
                    int i2 = layoutParams.topMargin;
                    int[] iArr2 = this.q;
                    int i3 = iArr2[1];
                    if (i2 != i3) {
                        layoutParams.topMargin = i3;
                    }
                    int i4 = layoutParams.leftMargin;
                    int i5 = iArr2[0];
                    if (i4 != i5) {
                        layoutParams.leftMargin = i5;
                    }
                    this.l.addView(this.s, layoutParams);
                    if (this.f10119a.getVideo().getVideoState() == 4) {
                        this.b.h0(getDuration(), false);
                    }
                }
                if (z2) {
                    int[] iArr3 = this.q;
                    S0(-iArr3[0], 0 - iArr3[1]);
                    return;
                }
                int i6 = this.n;
                int i7 = this.m;
                int[] iArr4 = this.q;
                M0(((i6 - i7) / 2) - iArr4[0], ((i7 - i6) / 2) - iArr4[1], z3);
            }
        } else {
            this.x = true;
            if (this.f10119a.getActivity().getRequestedOrientation() != 0 && this.f10119a.getActivity().getRequestedOrientation() != 8) {
                W0(z3);
            }
        }
    }

    public final void W0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530caa64", new Object[]{this, new Boolean(z2)});
        } else if (m0() != null && m0().getParent() != null && m0().getParent().getParent() != null) {
            this.x = true;
            if (this.s == null && this.t == null) {
                ViewGroup viewGroup = (ViewGroup) m0().getParent();
                this.s = viewGroup;
                this.t = (ViewGroup) viewGroup.getParent();
            }
            if (this.f10119a.getWindow() != null) {
                this.l = (FrameLayout) this.f10119a.getWindow().getDecorView();
            } else {
                this.l = (FrameLayout) this.f10119a.getActivity().getWindow().getDecorView();
            }
            if (z2) {
                this.f10119a.getActivity().setRequestedOrientation(0);
            } else {
                this.f10119a.getActivity().setRequestedOrientation(8);
            }
            this.d.postDelayed(new c0(z2), 20L);
        }
    }

    public final void X0() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49257570", new Object[]{this});
        } else if (m0() != null && m0().getParent() != null && m0().getParent().getParent() != null) {
            this.x = true;
            if (this.s == null && this.t == null) {
                ViewGroup viewGroup = (ViewGroup) m0().getParent();
                this.s = viewGroup;
                this.t = (ViewGroup) viewGroup.getParent();
            }
            if (this.f10119a.getWindow() != null) {
                this.l = (FrameLayout) this.f10119a.getWindow().getDecorView();
            } else {
                this.l = (FrameLayout) this.f10119a.getActivity().getWindow().getDecorView();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = this.f10119a.getActivity().getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 0;
                this.f10119a.getActivity().getWindow().setAttributes(attributes);
            }
            this.s.setLayerType(2, null);
            this.f10119a.getActivity().setRequestedOrientation(1);
            if (this.f10119a.getWindow() == null) {
                window = this.f10119a.getActivity().getWindow();
            } else {
                window = this.f10119a.getWindow();
            }
            DWViewUtil.setNavigationBar(window, this.E);
            this.d.postDelayed(new s(), 20L);
        }
    }

    public final void Y0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa349d9f", new Object[]{this, new Boolean(z2)});
        } else if (m0() != null && m0().getParent() != null && m0().getParent().getParent() != null) {
            this.x = true;
            if (this.s == null && this.t == null) {
                ViewGroup viewGroup = (ViewGroup) m0().getParent();
                this.s = viewGroup;
                this.t = (ViewGroup) viewGroup.getParent();
            }
            int i2 = this.r;
            if (i2 != 0) {
                this.q[1] = i2;
                this.r = 0;
            }
            ViewGroup viewGroup2 = this.s;
            if (viewGroup2 != null) {
                viewGroup2.setLayerType(2, null);
            }
            if (this.f10119a.getWindow() != null) {
                this.l = (FrameLayout) this.f10119a.getWindow().getDecorView();
            } else {
                this.l = (FrameLayout) this.f10119a.getActivity().getWindow().getDecorView();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = this.f10119a.getActivity().getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 0;
                this.f10119a.getActivity().getWindow().setAttributes(attributes);
            }
            if (z2) {
                this.n = DWViewUtil.getVideoWidthInLandscape(this.f10119a.getActivity());
                this.m = DWViewUtil.getPortraitScreenWidth();
                int[] iArr = this.q;
                Q0(iArr[0], iArr[1]);
                return;
            }
            this.n = DWViewUtil.getRealWithInPx(this.f10119a.getActivity());
            int videoWidthInLandscape = DWViewUtil.getVideoWidthInLandscape(this.f10119a.getActivity());
            this.m = videoWidthInLandscape;
            int i3 = this.n;
            DWContext dWContext = this.f10119a;
            int[] iArr2 = this.q;
            O0(((-(i3 - dWContext.mWidth)) / 2) + iArr2[0], ((-(videoWidthInLandscape - dWContext.mHeight)) / 2) + iArr2[1]);
        }
    }

    public boolean Z0() {
        AnimatorSet animatorSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e25ada62", new Object[]{this})).booleanValue();
        }
        AnimatorSet animatorSet2 = this.o;
        if ((animatorSet2 == null || !animatorSet2.isRunning()) && (((animatorSet = this.p) == null || !animatorSet.isRunning()) && !this.x)) {
            return true;
        }
        return false;
    }

    @Override // tb.wtb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
        } else {
            this.b.f();
        }
    }

    public void a1(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5499d60", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            c32Var.s0(i2, i3);
        }
    }

    @Override // tb.wtb
    public void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f691388", new Object[]{this, new Integer(i2)});
        } else {
            this.b.w(i2);
        }
    }

    @Override // tb.krc
    public boolean d(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("328efe1e", new Object[]{this, keyEvent})).booleanValue();
        }
        if (this.f10119a.screenType() != DWVideoScreenType.LANDSCAPE_FULL_SCREEN && this.f10119a.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            return false;
        }
        n();
        return true;
    }

    public String e0(String str) throws Exception {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcb4580c", new Object[]{this, str});
        }
        if (!"TBVideo".equals(this.f10119a.getVideoSource())) {
            return str;
        }
        URI uri = new URI(str);
        StringBuilder sb = new StringBuilder(50);
        sb.append("SOS=Android");
        DWContext dWContext = this.f10119a;
        String n2 = z5r.n(dWContext.mNetworkUtilsAdapter, dWContext.getActivity());
        if (!TextUtils.isEmpty(n2)) {
            sb.append("&SNet=");
            sb.append(n2);
        }
        if (!TextUtils.isEmpty(this.f10119a.mFrom)) {
            sb.append("&SBizCode=");
            sb.append(this.f10119a.mFrom);
        }
        DWContext dWContext2 = this.f10119a;
        String a2 = ((d75) dWContext2.mConfigParamsAdapter).a(dWContext2.getActivity());
        if (this.f10119a.mConfigParamsAdapter != null && !TextUtils.isEmpty(a2)) {
            sb.append("&SRid=");
            sb.append(System.currentTimeMillis());
            sb.append(a2);
        }
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null) {
            str2 = sb.toString();
        } else {
            str2 = rawQuery + "&" + ((Object) sb);
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
    }

    @Override // tb.wtb
    public void f(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba74df4a", new Object[]{this, new Boolean(z2)});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null && (c32Var instanceof com.taobao.avplayer.player.a)) {
            ((com.taobao.avplayer.player.a) c32Var).W0(z2);
        }
    }

    public void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a27cd7", new Object[]{this});
        } else {
            this.b.e();
        }
    }

    @Override // tb.wtb
    public void g(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68f6586", new Object[]{this, aubVar});
        } else {
            this.b.b0(aubVar);
        }
    }

    public void g0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            ((com.taobao.avplayer.player.a) c32Var).B0(map);
        }
    }

    @Override // tb.wtb
    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        return this.b.getCurrentPosition();
    }

    @Override // tb.wtb
    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        return this.b.i();
    }

    @Override // tb.wtb
    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        return this.b.q();
    }

    @Override // tb.wtb
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.b.s();
    }

    @Override // tb.wtb
    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        return this.b.t();
    }

    @Override // tb.wtb
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fea6ec89", new Object[]{this})).intValue();
        }
        return this.b.n();
    }

    public void h0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z2)});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            ((com.taobao.avplayer.player.a) c32Var).G0(z2);
        }
    }

    @Override // tb.wtb
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d912e60", new Object[]{this})).intValue();
        }
        if (this.b.C()) {
            return this.b.k();
        }
        return this.b.s();
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b.g();
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // tb.wtb
    public void j(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5bb934", new Object[]{this, new Float(f2)});
        } else {
            this.b.o0(f2);
        }
    }

    public c32 j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c32) ipChange.ipc$dispatch("b7fa48be", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.wtb
    public void k(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97f5814", new Object[]{this, dubVar});
        } else {
            this.b.c0(dubVar);
        }
    }

    public Map<String, String> k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            return c32Var.j();
        }
        return null;
    }

    @Override // tb.wtb
    public void l(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b71d026", new Object[]{this, ytbVar});
        } else {
            this.b.a0(ytbVar);
        }
    }

    public String l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this});
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            return c32Var.p();
        }
        return null;
    }

    @Override // tb.wtb
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906945f8", new Object[]{this})).intValue();
        }
        return this.b.m();
    }

    public View m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b.u();
    }

    @Override // tb.wtb
    public void n() {
        boolean z2;
        boolean z3;
        Window window;
        boolean z4;
        Window window2;
        boolean z5;
        Window window3;
        boolean z6 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.o;
        if (animatorSet == null || !animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.p;
            if ((animatorSet2 != null && animatorSet2.isRunning()) || this.x) {
                return;
            }
            if (!this.f10119a.isActivityToggleForLandscape()) {
                if (this.f10119a.screenType() == DWVideoScreenType.NORMAL) {
                    if ((this.b.h() > 1.01d || this.b.h() == 0.0f) && (this.f10119a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN || !this.y)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if ((this.D == DWScreenOrientationListenerImp.Orientation.PORTRAIT && !z5) || this.f10119a.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.f10119a.getInitScreenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                        z6 = true;
                    }
                    this.B = z6;
                    V0(z5, true);
                    if (this.f10119a.getWindow() == null) {
                        window3 = this.f10119a.getActivity().getWindow();
                    } else {
                        window3 = this.f10119a.getWindow();
                    }
                    this.E = DWViewUtil.hideNavigationBar(window3);
                    return;
                }
                if (((this.b.h() > 1.01d || this.b.h() == 0.0f) && (this.f10119a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN || !this.y)) || this.f10119a.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (this.D != DWScreenOrientationListenerImp.Orientation.PORTRAIT) {
                    z6 = true;
                }
                this.C = z6;
                Y0(z4);
                if (this.f10119a.getWindow() == null) {
                    window2 = this.f10119a.getActivity().getWindow();
                } else {
                    window2 = this.f10119a.getWindow();
                }
                DWViewUtil.setNavigationBar(window2, this.E);
            } else if (this.f10119a.screenType() == DWVideoScreenType.NORMAL) {
                if ((this.b.h() > 1.01d || this.b.h() == 0.0f) && (this.f10119a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN || !this.y)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if ((this.D == DWScreenOrientationListenerImp.Orientation.PORTRAIT && !z3) || this.f10119a.getInitScreenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.f10119a.getInitScreenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                    z6 = true;
                }
                this.B = z6;
                if (z3) {
                    V0(z3, true);
                } else if (this.f10119a.getActivity().getRequestedOrientation() != 0 && this.f10119a.getActivity().getRequestedOrientation() != 8) {
                    W0(true);
                } else {
                    return;
                }
                if (this.f10119a.getWindow() == null) {
                    window = this.f10119a.getActivity().getWindow();
                } else {
                    window = this.f10119a.getWindow();
                }
                this.E = DWViewUtil.hideNavigationBar(window);
            } else {
                if (((this.b.h() > 1.01d || this.b.h() == 0.0f) && (this.f10119a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN || !this.y)) || this.f10119a.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (this.D != DWScreenOrientationListenerImp.Orientation.PORTRAIT) {
                    z6 = true;
                }
                this.C = z6;
                if (z2) {
                    Y0(z2);
                } else if (this.f10119a.getActivity().getRequestedOrientation() != 1) {
                    X0();
                }
            }
        }
    }

    public boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0f104dd", new Object[]{this})).booleanValue();
        }
        c32 c32Var = this.b;
        if (c32Var == null || !c32Var.x()) {
            return false;
        }
        return true;
    }

    @Override // tb.wtb
    public float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82244988", new Object[]{this})).floatValue();
        }
        return this.b.o();
    }

    public boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f7704", new Object[]{this})).booleanValue();
        }
        c32 c32Var = this.b;
        if (c32Var == null || !c32Var.y()) {
            return false;
        }
        return true;
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j2, long j3, long j4, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j2), new Long(j3), new Long(j4), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z2)});
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else {
            b1();
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i2)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            b1();
        }
    }

    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0e63790", new Object[]{this})).booleanValue();
        }
        c32 c32Var = this.b;
        if (c32Var == null || !c32Var.D()) {
            return false;
        }
        return true;
    }

    @Override // tb.wtb
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.b.V(false);
        }
    }

    @Override // tb.wtb
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            this.b.W();
        }
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d6a773", new Object[]{this});
        } else {
            this.d.post(new y());
        }
    }

    @Override // tb.wtb
    public void refreshScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            c32Var.Y();
        }
    }

    @Override // tb.wtb
    public void retryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6555dba", new Object[]{this});
        } else if (this.b.s() == 3 || ((TextUtils.isEmpty(this.f10119a.mPlayContext.getVideoUrl()) && TextUtils.isEmpty(this.f10119a.getVideoToken())) || (this.b.C() && this.b.k() == 3))) {
            f0 f0Var = this.H;
            if (f0Var != null) {
                ((a.c) f0Var).a();
            }
            this.b.r0();
            if (this.c) {
                this.b.q0(0.0f);
            }
        }
    }

    public final void s0(DWVideoViewController.FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8fd47c", new Object[]{this, fullOritation});
        } else {
            this.d.post(new b0(fullOritation));
        }
    }

    @Override // tb.wtb
    public void seekTo(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i2)});
        } else {
            this.b.f0(i2);
        }
    }

    @Override // tb.wtb
    public void setFov(float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            c32Var.i0(f2, f3, f4);
        }
    }

    public final void w0(DWVideoViewController.FullOritation fullOritation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4bf36d", new Object[]{this, fullOritation});
        } else {
            this.d.post(new l(fullOritation));
        }
    }

    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else {
            this.b.X();
        }
    }

    public void y0(gsc gscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b1251f", new Object[]{this, gscVar});
            return;
        }
        c32 c32Var = this.b;
        if (c32Var != null) {
            c32Var.Z(gscVar);
        }
    }

    public void z0(int i2, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c54c69", new Object[]{this, new Integer(i2), new Boolean(z2), new Boolean(z3)});
        } else {
            this.b.g0(i2, z2, z3);
        }
    }

    public void K0(String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377652f", new Object[]{this, str, new Boolean(z2)});
        } else if (TextUtils.isEmpty(str)) {
            AVSDKLog.e(this.G, "setVideoSource## sorry  VideoSource is Empty  ");
        } else if (this.f10119a.mPlayContext.mLocalVideo) {
            this.b.p0(str);
        } else {
            if (str.startsWith(itw.URL_SEPARATOR)) {
                psb psbVar = this.f10119a.mConfigAdapter;
                if (psbVar == null || ((b75) psbVar).h()) {
                    str = uyv.HTTPS_SCHEMA.concat(str);
                } else {
                    str = "http:".concat(str);
                }
            }
            if (z2) {
                try {
                    str = e0(str);
                } catch (Throwable th) {
                    feh fehVar = this.G;
                    AVSDKLog.e(fehVar, " URL illegal " + th.getMessage());
                }
            }
            if (MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.e(this.G, " start queryVideoAuthData");
                DWContext dWContext = this.f10119a;
                new MediaInfoAuthRegister(dWContext.mPlayContext, 2, dWContext.mUsingInterface.startsWith("TBPlayer")).d(str, this);
            }
            this.b.l0(this.f10119a.getUTParams());
            this.b.p0(str);
        }
    }

    public void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e800daa4", new Object[]{this});
        } else if (this.b.s() == 5 || this.b.s() == 8 || !TextUtils.isEmpty(this.f10119a.getVideoToken())) {
            this.b.r0();
        } else if (this.b.s() == 4 || (this.b.C() && this.b.k() == 4)) {
            if (this.b.C()) {
                this.b.j0(0);
            } else {
                this.b.f0(0);
            }
            playVideo();
        } else if (this.b.s() != 2 || ew0.s(((b75) this.f10119a.mConfigAdapter).getConfig("DWInteractive", "revertStartChange", "false"))) {
            this.b.r0();
        } else {
            playVideo();
        }
    }

    @Override // tb.wtb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
        } else if (this.b.s() == 1 && TextUtils.isEmpty(this.f10119a.getVideoToken())) {
        } else {
            if (!TextUtils.isEmpty(this.f10119a.getVideoToken()) && this.b.s() == 1) {
                return;
            }
            if (this.b.s() != 2 || !TextUtils.isEmpty(this.f10119a.getVideoToken()) || !ew0.s(((b75) this.f10119a.mConfigAdapter).getConfig("DWInteractive", "revertStartChange", "false"))) {
                U0();
            }
        }
    }

    public void c1(float f2, float f3, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f2), new Float(f3), new Integer(i2), new Integer(i3)});
        } else if (this.F) {
            feh fehVar = this.G;
            AVSDKLog.e(fehVar, "dwHPInstance volumeFadeInWithCustomParams return, switchFadeIn = " + this.F);
        } else {
            if (f3 > 0.0f) {
                this.c = false;
            }
            this.k = new AtomicInteger(0);
            int i4 = i2 / i3;
            float f4 = (f3 - f2) / i4;
            feh fehVar2 = this.G;
            AVSDKLog.e(fehVar2, "endVol = " + f3 + "， beginVol=" + f2 + "shouldChangeCount = " + i4 + ", eachChangeVolume=" + f4);
            this.i = new w(f2, f4, i4, i3);
            this.d.removeCallbacksAndMessages(null);
            this.d.postDelayed(this.i, (long) i3);
        }
    }

    @Override // tb.rrc
    public void e(int i2, String str, int i3) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f709d9", new Object[]{this, new Integer(i2), str, new Integer(i3)});
            return;
        }
        if (!(i2 == 0 || !MediaSystemUtils.isApkDebuggable() || (context = this.f10119a.mApplicationontext) == null)) {
            Toast.makeText(context, "【警告】该播放场景鉴权失败，预发环境下已禁止播放。请联系iOS:@牛仔/Android:@生艰", 1).show();
        }
        c32 c32Var = this.b;
        if (c32Var instanceof com.taobao.avplayer.player.a) {
            ((com.taobao.avplayer.player.a) c32Var).p1(i2, str, i3);
        }
    }

    public void u0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z2)});
            return;
        }
        boolean s2 = ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableMuteFix", "true"));
        if (!s2 || z2 != this.c) {
            if (!s2) {
                this.d.removeCallbacks(this.h);
            }
            c32 c32Var = this.b;
            if (c32Var != null && (c32Var instanceof com.taobao.avplayer.player.a)) {
                ((com.taobao.avplayer.player.a) c32Var).A1(z2);
            }
            if (z2) {
                if (s2) {
                    this.d.removeCallbacks(this.h);
                    this.d.removeCallbacks(this.i);
                }
                this.e = true;
                this.b.q0(0.0f);
                this.c = z2;
                return;
            }
            if (!this.F || this.g <= 0.0f) {
                this.g = c32.z;
            }
            this.c = z2;
            if (!this.e || !this.f) {
                this.b.q0(this.g);
                return;
            }
            this.b.q0(this.g * 0.2f);
            if (this.b.s() == 1) {
                b1();
            }
        }
    }

    public final void O0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf0d1a3", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, "translationX", i2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, "translationY", i3);
        this.s.setTranslationY(this.w);
        this.s.setTranslationX(this.v);
        this.p = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.s, Key.ROTATION, 0.0f);
        ofFloat3.addUpdateListener(new o());
        this.p.setDuration(200L);
        this.p.play(ofFloat3);
        this.p.play(ofFloat);
        this.p.play(ofFloat2);
        this.p.start();
        this.p.addListener(new p());
    }

    public final void b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f339782", new Object[]{this});
            return;
        }
        feh fehVar = this.G;
        AVSDKLog.e(fehVar, "dwHPInstance volumeFadeIn try to setVolume, mMute=" + this.c + ",mVolume=" + this.g + ",!mOpenVolumeFadeIn=" + (true ^ this.f) + "，mSwitchFadeIn=" + this.F);
        if (!this.c && this.g != 0.0f && this.f && !this.F && this.e) {
            this.e = false;
            this.j = 0;
            if (this.h == null) {
                this.h = new u();
            }
            this.d.postDelayed(this.h, 500L);
        }
    }

    public final void M0(int i2, int i3, boolean z2) {
        ObjectAnimator objectAnimator;
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe792351", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z2)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, "translationX", i2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, "translationY", i3);
        if (z2) {
            objectAnimator = ObjectAnimator.ofFloat(this.s, Key.ROTATION, 0.0f, 90.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.s, Key.ROTATION, 0.0f, -90.0f);
        }
        this.o = new AnimatorSet();
        if (!this.y || this.f10119a.getInitScreenType() != DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
            i4 = 200;
        } else {
            this.y = false;
            int i5 = this.q[1];
            if (i5 == 0) {
                this.r = i5 + DWViewUtil.getStatusBarHeight(this.f10119a.getActivity());
            }
        }
        this.o.setDuration(i4);
        this.o.play(objectAnimator);
        this.o.play(ofFloat);
        this.o.play(ofFloat2);
        this.d.post(new c());
        objectAnimator.addUpdateListener(new d());
        this.o.addListener(new e(z2));
    }

    public final void Q0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba1b5fd", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, "translationX", 0.0f, i2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, "translationY", 0.0f, i3);
        this.s.setTranslationY(this.w);
        this.s.setTranslationX(this.v);
        this.p = new AnimatorSet();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(90.0f, 0.0f);
        ofFloat3.addUpdateListener(new m());
        this.p.setDuration(200L);
        this.p.play(ofFloat3);
        this.p.play(ofFloat);
        this.p.play(ofFloat2);
        this.p.start();
        this.p.addListener(new n());
    }

    public final void S0(int i2, int i3) {
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b9fbbf", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, "translationX", i2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, "translationY", i3);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 90.0f);
        this.o = new AnimatorSet();
        if (!this.y || this.f10119a.getInitScreenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            i4 = 200;
        } else {
            this.y = false;
            int i5 = this.q[1];
            if (i5 == 0) {
                this.r = i5 + DWViewUtil.getStatusBarHeight(this.f10119a.getActivity());
            }
        }
        long j2 = i4;
        this.o.setDuration(j2);
        this.o.play(ofFloat3);
        this.o.play(ofFloat);
        this.o.play(ofFloat2);
        this.d.post(new d0());
        ofFloat3.setDuration(j2);
        ofFloat3.addUpdateListener(new a());
        ofFloat3.addListener(new C0534b());
    }

    public final void q0(DWVideoViewController.FullOritation fullOritation) {
        ObjectAnimator objectAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c50834", new Object[]{this, fullOritation});
        } else if (!this.f10119a.isActivityToggleForLandscape() || !(this.f10119a.getActivity().getRequestedOrientation() == 0 || this.f10119a.getActivity().getRequestedOrientation() == 8)) {
            this.x = true;
            if (fullOritation == DWVideoViewController.FullOritation.LANDSCAPE_FULL90_TO_PORTRAIT_FULL) {
                objectAnimator = ObjectAnimator.ofFloat(this.s, Key.ROTATION, -90.0f, 0.0f);
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this.s, Key.ROTATION, 90.0f, 0.0f);
            }
            this.s.setLayerType(2, null);
            this.n = DWViewUtil.getPortraitScreenWidth();
            this.m = DWViewUtil.getVideoWidthInLandscape(this.f10119a.getActivity());
            int videoWidthInLandscape = DWViewUtil.getVideoWidthInLandscape(this.f10119a.getActivity());
            int portraitScreenWidth = DWViewUtil.getPortraitScreenWidth();
            int[] iArr = this.q;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, "translationX", -iArr[0]);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, "translationY", -iArr[1]);
            this.s.setLayerType(2, null);
            AnimatorSet animatorSet = new AnimatorSet();
            this.o = animatorSet;
            long j2 = 400;
            animatorSet.setDuration(j2);
            this.o.play(objectAnimator);
            this.o.play(ofFloat);
            this.o.play(ofFloat2);
            this.d.post(new k());
            objectAnimator.setDuration(j2);
            objectAnimator.addUpdateListener(new v(portraitScreenWidth, videoWidthInLandscape));
            objectAnimator.addListener(new x());
        } else {
            this.x = true;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.s.setLayoutParams(layoutParams);
            this.s.setLayerType(2, null);
            this.f10119a.getActivity().setRequestedOrientation(1);
            r0();
        }
    }

    public final void t0(DWVideoViewController.FullOritation fullOritation) {
        ObjectAnimator objectAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8568f9a3", new Object[]{this, fullOritation});
        } else if (!this.f10119a.isActivityToggleForLandscape() || !(this.f10119a.getActivity().getRequestedOrientation() == 0 || this.f10119a.getActivity().getRequestedOrientation() == 8)) {
            if (fullOritation == DWVideoViewController.FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90) {
                objectAnimator = ObjectAnimator.ofFloat(this.s, Key.ROTATION, 90.0f, -90.0f);
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this.s, Key.ROTATION, -90.0f, 90.0f);
            }
            this.x = true;
            this.s.setLayerType(2, null);
            AnimatorSet animatorSet = new AnimatorSet();
            this.o = animatorSet;
            long j2 = 400;
            animatorSet.setDuration(j2);
            this.o.play(objectAnimator);
            this.d.post(new z());
            objectAnimator.setDuration(j2);
            objectAnimator.addListener(new a0(fullOritation));
        } else {
            this.x = true;
            this.s.setLayerType(2, null);
            if (fullOritation == DWVideoViewController.FullOritation.LANDSCAPE_FULL270_TO_LANDSCAPE_FULL90) {
                this.f10119a.getActivity().setRequestedOrientation(8);
            } else {
                this.f10119a.getActivity().setRequestedOrientation(0);
            }
            s0(fullOritation);
        }
    }

    public final void v0(DWVideoViewController.FullOritation fullOritation) {
        ObjectAnimator objectAnimator;
        int i2;
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50bca5e", new Object[]{this, fullOritation});
        } else if (!this.f10119a.isActivityToggleForLandscape() || this.f10119a.getActivity().getRequestedOrientation() != 1) {
            this.x = true;
            if (fullOritation == DWVideoViewController.FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                objectAnimator = ObjectAnimator.ofFloat(this.s, Key.ROTATION, 0.0f, -90.0f);
            } else {
                objectAnimator = ObjectAnimator.ofFloat(this.s, Key.ROTATION, 0.0f, 90.0f);
            }
            this.s.setLayerType(2, null);
            this.n = DWViewUtil.getPortraitScreenWidth();
            this.m = DWViewUtil.getVideoWidthInLandscape(this.f10119a.getActivity());
            int videoWidthInLandscape = DWViewUtil.getVideoWidthInLandscape(this.f10119a.getActivity());
            int portraitScreenWidth = DWViewUtil.getPortraitScreenWidth();
            int i3 = this.n;
            int i4 = ((this.m - i3) / 2) - this.q[1];
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, "translationX", ((i3 - i2) / 2) - iArr[0]);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, "translationY", i4);
            this.s.setLayerType(2, null);
            AnimatorSet animatorSet = new AnimatorSet();
            this.o = animatorSet;
            long j2 = 400;
            animatorSet.setDuration(j2);
            this.o.play(objectAnimator);
            this.o.play(ofFloat);
            this.o.play(ofFloat2);
            this.d.post(new h());
            objectAnimator.setDuration(j2);
            objectAnimator.addUpdateListener(new i(portraitScreenWidth, videoWidthInLandscape));
            objectAnimator.addListener(new j(fullOritation));
        } else {
            this.x = true;
            this.s.setLayerType(2, null);
            if (fullOritation == DWVideoViewController.FullOritation.PORTRAIT_FULL_TO_LANDSCAPE_FULL90) {
                this.f10119a.getActivity().setRequestedOrientation(8);
            } else {
                this.f10119a.getActivity().setRequestedOrientation(0);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.s.setTranslationX(0.0f);
            this.s.setTranslationY(0.0f);
            this.s.setLayoutParams(layoutParams);
            w0(fullOritation);
        }
    }
}
