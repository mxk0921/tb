package com.taobao.taolive.perf.uikit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.perf.uikit.LiveLottieAnimationView;
import java.util.ArrayList;
import java.util.List;
import tb.h4s;
import tb.i3h;
import tb.jmh;
import tb.o3s;
import tb.qvs;
import tb.t2o;
import tb.ux9;
import tb.vwl;
import tb.xr9;
import tb.xvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LiveLottieAnimationView extends LottieAnimationView implements xvg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LiveLottieAnimationView";
    private String animationGroup;
    private String animationName;
    private i3h.a envListener;
    private i3h envPerceptionService;
    private boolean isDirectExecution;
    private jmh lowFrameRatePlayer;
    private ux9 mFrameContext;
    private boolean isRunning = false;
    private boolean shouldUseEnvironmentAwareness = true;
    private boolean isLowFrameRatePlaying = false;
    private final List<Animator.AnimatorListener> animatorListeners = new ArrayList();
    private final List<xvg.a> listeners = new ArrayList();
    private final int defaultFrameRate = qvs.A0();
    private final int defaultFrameStep = qvs.B0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements jmh.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.jmh.b
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (LiveLottieAnimationView.access$100(LiveLottieAnimationView.this)) {
                LiveLottieAnimationView.access$000(LiveLottieAnimationView.this, "LowFrameRatePlayer completed");
                LiveLottieAnimationView.this.stop();
            }
        }

        @Override // tb.jmh.b
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else {
                LiveLottieAnimationView.access$000(LiveLottieAnimationView.this, "LowFrameRatePlayer started");
            }
        }

        @Override // tb.jmh.b
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            } else {
                LiveLottieAnimationView.access$000(LiveLottieAnimationView.this, "LowFrameRatePlayer stopped");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/perf/uikit/LiveLottieAnimationView$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (LiveLottieAnimationView.access$100(LiveLottieAnimationView.this)) {
                LiveLottieAnimationView.access$000(LiveLottieAnimationView.this, "Animation ended");
                LiveLottieAnimationView.this.stop();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("450268b5", new Object[]{this, animator});
                return;
            }
            for (xvg.a aVar : LiveLottieAnimationView.access$200(LiveLottieAnimationView.this)) {
                aVar.c(LiveLottieAnimationView.this);
            }
            LiveLottieAnimationView.access$000(LiveLottieAnimationView.this, "Animation paused");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                return;
            }
            for (xvg.a aVar : LiveLottieAnimationView.access$200(LiveLottieAnimationView.this)) {
                aVar.d(LiveLottieAnimationView.this);
            }
            LiveLottieAnimationView.access$000(LiveLottieAnimationView.this, "Animation repeated");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8babbd16", new Object[]{this, animator});
                return;
            }
            for (xvg.a aVar : LiveLottieAnimationView.access$200(LiveLottieAnimationView.this)) {
                aVar.e(LiveLottieAnimationView.this);
            }
            LiveLottieAnimationView.access$000(LiveLottieAnimationView.this, "Animation resumed");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                LiveLottieAnimationView.access$000(LiveLottieAnimationView.this, "Animation started");
            }
        }
    }

    static {
        t2o.a(806355628);
        t2o.a(806355070);
    }

    public LiveLottieAnimationView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ void access$000(LiveLottieAnimationView liveLottieAnimationView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5615c775", new Object[]{liveLottieAnimationView, str});
        } else {
            liveLottieAnimationView.log(str);
        }
    }

    public static /* synthetic */ boolean access$100(LiveLottieAnimationView liveLottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1a4b20e", new Object[]{liveLottieAnimationView})).booleanValue();
        }
        return liveLottieAnimationView.isRunning;
    }

    public static /* synthetic */ List access$200(LiveLottieAnimationView liveLottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("af28097e", new Object[]{liveLottieAnimationView});
        }
        return liveLottieAnimationView.listeners;
    }

    public static /* synthetic */ void access$301(LiveLottieAnimationView liveLottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255ca7", new Object[]{liveLottieAnimationView});
        } else {
            super.playAnimation();
        }
    }

    public static /* synthetic */ void access$401(LiveLottieAnimationView liveLottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9463cc46", new Object[]{liveLottieAnimationView});
        } else {
            super.playAnimation();
        }
    }

    public static /* synthetic */ void access$501(LiveLottieAnimationView liveLottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a23be5", new Object[]{liveLottieAnimationView});
        } else {
            super.playAnimation();
        }
    }

    public static /* synthetic */ void access$601(LiveLottieAnimationView liveLottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce0ab84", new Object[]{liveLottieAnimationView});
        } else {
            super.playAnimation();
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        log("Initializing LiveLottieAnimationView");
        jmh jmhVar = new jmh(this, this.defaultFrameRate, this.defaultFrameStep);
        this.lowFrameRatePlayer = jmhVar;
        jmhVar.k(new a());
        super.addAnimatorListener(new b());
        this.envListener = new i3h.a() { // from class: tb.s0h
            @Override // tb.i3h.a
            public final void a(String str) {
                LiveLottieAnimationView.this.lambda$init$4(str);
            }
        };
    }

    public static /* synthetic */ Object ipc$super(LiveLottieAnimationView liveLottieAnimationView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1253146582:
                super.setRepeatCount(((Number) objArr[0]).intValue());
                return null;
            case -361711817:
                super.playAnimation();
                return null;
            case 1313936817:
                super.cancelAnimation();
                return null;
            case 1314947985:
                super.addAnimatorListener((Animator.AnimatorListener) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/perf/uikit/LiveLottieAnimationView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e722bfee", new Object[]{this, str});
            return;
        }
        log("Environment state changed: " + str);
        playBasedOnEnvironment();
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        o3s.b(TAG, hashCode() + " " + str);
    }

    private void notifyLiveAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0e51b3", new Object[]{this});
            return;
        }
        log("Notifying animation end");
        for (xvg.a aVar : this.listeners) {
            aVar.a(this);
        }
        for (Animator.AnimatorListener animatorListener : this.animatorListeners) {
            animatorListener.onAnimationEnd(null);
        }
    }

    private void notifyLiveAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884d417a", new Object[]{this});
            return;
        }
        log("Notifying animation start");
        for (xvg.a aVar : this.listeners) {
            aVar.b(this);
        }
        for (Animator.AnimatorListener animatorListener : this.animatorListeners) {
            animatorListener.onAnimationStart(null);
        }
    }

    private void playBasedOnEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a99c61c", new Object[]{this});
            return;
        }
        i3h i3hVar = this.envPerceptionService;
        if (i3hVar != null) {
            String c = i3hVar.c();
            log("Playing based on environment. Current state: " + c);
            if ("PERFORMANCE_INTENSE".equals(c)) {
                if (!this.shouldUseEnvironmentAwareness || this.isLowFrameRatePlaying) {
                    log("Switching to standard frame rate mode due to PERFORMANCE_INTENSE state and environment awareness disabled");
                    this.isLowFrameRatePlaying = false;
                    access$301(this);
                    return;
                }
                log("Switching to low frame rate mode due to PERFORMANCE_INTENSE state and environment awareness enabled");
                this.isLowFrameRatePlaying = true;
                this.lowFrameRatePlayer.q();
            } else if (!"PERFORMANCE_RELAXED".equals(c)) {
                log("Unknown environment state: " + c);
            } else if (this.isLowFrameRatePlaying) {
                log("Switching to standard frame rate mode due to PERFORMANCE_RELAXED state");
                this.isLowFrameRatePlaying = false;
                this.lowFrameRatePlayer.r();
                access$401(this);
            } else {
                log("Continuing with standard frame rate mode due to PERFORMANCE_RELAXED state");
                this.isLowFrameRatePlaying = false;
                access$501(this);
            }
        } else {
            log("Environment perception service is null, playing with standard frame rate mode");
            this.isLowFrameRatePlaying = false;
            access$601(this);
        }
    }

    @Override // tb.xvg
    public void addAnimationListener(xvg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f42599", new Object[]{this, aVar});
        } else if (aVar != null) {
            log("Adding Live AnimationListener");
            this.listeners.add(aVar);
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e608391", new Object[]{this, animatorListener});
        } else if (animatorListener != null && !this.animatorListeners.contains(animatorListener)) {
            log("Adding System AnimatorListener");
            this.animatorListeners.add(animatorListener);
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void cancelAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5115b1", new Object[]{this});
            return;
        }
        log("LiveLottieAnimationView cancelAnimation called");
        stop();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        log("Destroying LiveLottieAnimationView");
        stop();
        this.listeners.clear();
        this.animatorListeners.clear();
        clearAnimation();
    }

    @Override // tb.xvg
    public String getAnimationGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e86a3148", new Object[]{this});
        }
        String str = this.animationGroup;
        if (str != null) {
            return str;
        }
        return xr9.NO_GROUP;
    }

    @Override // tb.xvg
    public String getAnimationName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43b88020", new Object[]{this});
        }
        String str = this.animationName;
        if (str != null) {
            return str;
        }
        return "default";
    }

    @Override // tb.xvg
    public boolean isDirectExecution() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e29500b0", new Object[]{this})).booleanValue();
        }
        return this.isDirectExecution;
    }

    public boolean isLowFrameRatePlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c140476", new Object[]{this})).booleanValue();
        }
        return this.isLowFrameRatePlaying;
    }

    @Override // tb.xvg
    public boolean isQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de7cef12", new Object[]{this})).booleanValue();
        }
        return vwl.e().c();
    }

    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        return this.isRunning;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void playAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea70b737", new Object[]{this});
            return;
        }
        log("LiveLottieAnimationView playAnimation called");
        if (this.isDirectExecution) {
            start();
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.d() != null) {
            log("Submitting task to AnimationTaskScheduler");
            this.mFrameContext.d().a(this);
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void removeAllAnimatorListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7492f922", new Object[]{this});
            return;
        }
        log("Removing all AnimatorListeners");
        this.animatorListeners.clear();
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e4980e", new Object[]{this, animatorListener});
            return;
        }
        log("Removing System AnimatorListener");
        this.animatorListeners.remove(animatorListener);
    }

    public void setAnimationGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a8192e", new Object[]{this, str});
            return;
        }
        log("Setting animation group: " + str);
        this.animationGroup = str;
    }

    public void setAnimationName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f765be", new Object[]{this, str});
            return;
        }
        log("Setting animation name: " + str);
        this.animationName = str;
    }

    public void setDirectExecution(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d5aae0", new Object[]{this, new Boolean(z)});
            return;
        }
        log("Setting direct execution: " + z);
        this.isDirectExecution = z;
    }

    public void setFrameContext(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
            return;
        }
        log("Setting FrameContext");
        this.mFrameContext = ux9Var;
        if (ux9Var != null) {
            this.envPerceptionService = ux9Var.s();
        }
    }

    public void setFrameRateAndStep(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a5b23f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        log("Setting frame rate: " + i + " and frame step: " + i2);
        this.lowFrameRatePlayer.o(i2);
        this.lowFrameRatePlayer = new jmh(this, i, i2);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setRepeatCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54e802a", new Object[]{this, new Integer(i)});
            return;
        }
        super.setRepeatCount(i);
        jmh jmhVar = this.lowFrameRatePlayer;
        if (jmhVar != null) {
            jmhVar.p(i);
        }
    }

    public void setShouldUseEnvironmentAwareness(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d67e319", new Object[]{this, new Boolean(z)});
        } else {
            this.shouldUseEnvironmentAwareness = z;
        }
    }

    public boolean shouldUseEnvironmentAwareness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef27db61", new Object[]{this})).booleanValue();
        }
        return this.shouldUseEnvironmentAwareness;
    }

    @Override // tb.xvg
    public void start() {
        i3h i3hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.isRunning) {
            this.isRunning = true;
            h4s.a(getAnimationName(), hashCode());
            log("LiveLottieAnimationView started");
            if (!this.shouldUseEnvironmentAwareness || (i3hVar = this.envPerceptionService) == null) {
                this.isLowFrameRatePlaying = false;
                super.playAnimation();
            } else {
                this.isLowFrameRatePlaying = false;
                i3hVar.h(this.envListener);
                playBasedOnEnvironment();
            }
            notifyLiveAnimationStart();
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.isRunning) {
            log("LiveLottieAnimationView stopped");
            this.isLowFrameRatePlaying = false;
            this.lowFrameRatePlayer.r();
            this.isRunning = false;
            super.cancelAnimation();
            i3h i3hVar = this.envPerceptionService;
            if (i3hVar != null) {
                i3hVar.j(this.envListener);
            }
            h4s.d(getAnimationName(), hashCode());
            notifyLiveAnimationEnd();
        }
    }

    public LiveLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LiveLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
