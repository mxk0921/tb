package com.taobao.android.fluid.framework.card.cards.video.manager.landscape;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.atb;
import tb.bib;
import tb.f9e;
import tb.gjc;
import tb.ir9;
import tb.pr9;
import tb.qn1;
import tb.r8e;
import tb.t2o;
import tb.uei;
import tb.uq9;
import tb.vt6;
import tb.xau;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LandscapeController implements bib, a.AbstractC0418a, SeekBar.OnSeekBarChangeListener, f9e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LandscapeController";
    private final String mAdFlag;
    private FrameLayout mBgContainer;
    private final Context mContext;
    private View mControllerView;
    private final uei mDWInstanceListenersManager;
    private final atb mDwInstance;
    private final FluidContext mFluidContext;
    private ImageView mImgToNormal;
    private boolean mIsLandscape;
    private boolean mIsSeekBarStartTracking;
    private com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a mLandscapeDialog;
    private final gjc mLandscapeListenerManager;
    private ImageView mPlayPauseView;
    private SeekBar mSeekBar;
    private TextView mTvCurrentTime;
    private TextView mTvTotalTime;
    private final r8e mVideoCommentSizeObject;
    private final i mState = new i(null);
    private final Handler mHandler = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/manager/landscape/LandscapeController$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (LandscapeController.access$100(LandscapeController.this) != null) {
                LandscapeController.access$100(LandscapeController.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7787a;
        public final /* synthetic */ float b;
        public final /* synthetic */ Drawable c;

        public b(ViewGroup viewGroup, float f, Drawable drawable) {
            this.f7787a = viewGroup;
            this.b = f;
            this.c = drawable;
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
            LandscapeController.access$200(LandscapeController.this).setTranslationY(0.0f);
            this.f7787a.setScaleX(this.b);
            this.f7787a.setScaleY(this.b);
            this.f7787a.setRotation(90.0f);
            this.c.setAlpha(255);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            LandscapeController.access$300(LandscapeController.this);
            xau.O(LandscapeController.access$400(LandscapeController.this), true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            LandscapeController.access$300(LandscapeController.this);
            xau.O(LandscapeController.access$400(LandscapeController.this), false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            LandscapeController.access$500(LandscapeController.this);
            if (LandscapeController.access$600(LandscapeController.this) != null) {
                if (LandscapeController.access$600(LandscapeController.this).getVideoState() == 1) {
                    LandscapeController.access$600(LandscapeController.this).pauseVideo();
                    xau.i(LandscapeController.access$400(LandscapeController.this), LandscapeController.access$700(LandscapeController.this));
                    return;
                }
                if (LandscapeController.access$600(LandscapeController.this).getVideoState() == 2) {
                    LandscapeController.access$600(LandscapeController.this).playVideo();
                } else {
                    LandscapeController.access$600(LandscapeController.this).start();
                }
                xau.j(LandscapeController.access$400(LandscapeController.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (LandscapeController.access$100(LandscapeController.this).getVisibility() == 0) {
                LandscapeController.access$100(LandscapeController.this).setVisibility(8);
            } else {
                LandscapeController.access$500(LandscapeController.this);
                xau.S(LandscapeController.access$400(LandscapeController.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                LandscapeController.access$200(LandscapeController.this).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7793a;
        public final /* synthetic */ ViewGroup b;

        public h(ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f7793a = viewGroup;
            this.b = viewGroup2;
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
            this.f7793a.setTranslationY(0.0f);
            this.f7793a.setScaleX(1.0f);
            this.f7793a.setScaleY(1.0f);
            this.f7793a.setRotation(0.0f);
            LandscapeController.access$800(LandscapeController.this).a(LandscapeController.access$600(LandscapeController.this));
            if (LandscapeController.access$200(LandscapeController.this) != null) {
                LandscapeController.access$200(LandscapeController.this).setTranslationY(0.0f);
                this.b.removeView(LandscapeController.access$200(LandscapeController.this));
            }
            if (LandscapeController.access$900(LandscapeController.this) != null) {
                LandscapeController.access$900(LandscapeController.this).dismiss();
                LandscapeController.access$902(LandscapeController.this, null);
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup f7794a;
        public int b;
        public ViewGroup.LayoutParams c;
        public int d;
        public int e;
        public float f;
        public float g;
        public float h;
        public float i;

        static {
            t2o.a(468714060);
        }

        public i() {
        }

        public void a(atb atbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3abfc6e", new Object[]{this, atbVar});
                return;
            }
            ViewGroup view = atbVar.getView();
            if (view != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && parent != this.f7794a) {
                    ((ViewGroup) parent).removeView(view);
                }
                ViewGroup viewGroup = this.f7794a;
                if (viewGroup != null) {
                    viewGroup.addView(view, this.b, this.c);
                }
                view.setTranslationY(this.f);
                view.setScaleX(this.g);
                view.setScaleY(this.h);
                view.setRotation(this.i);
            }
        }

        public void b(atb atbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd509e1c", new Object[]{this, atbVar});
                return;
            }
            ViewGroup view = atbVar.getView();
            if (view != null) {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    activity.getWindow().getDecorView().setSystemUiVisibility(this.d);
                    activity.getWindow().setStatusBarColor(this.e);
                }
            }
        }

        public void c(atb atbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a67002df", new Object[]{this, atbVar});
                return;
            }
            ViewGroup view = atbVar.getView();
            if (view != null) {
                this.f7794a = (ViewGroup) view.getParent();
                this.c = view.getLayoutParams();
                ViewGroup viewGroup = this.f7794a;
                if (viewGroup != null) {
                    this.b = viewGroup.indexOfChild(view);
                }
                Context context = view.getContext();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    this.d = activity.getWindow().getDecorView().getSystemUiVisibility();
                    this.e = activity.getWindow().getStatusBarColor();
                }
                this.f = view.getTranslationY();
                this.g = view.getScaleX();
                this.h = view.getScaleY();
                this.i = view.getRotation();
            }
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    static {
        t2o.a(468714051);
        t2o.a(468713877);
        t2o.a(468714062);
        t2o.a(468714535);
    }

    public LandscapeController(FluidContext fluidContext, Context context, uei ueiVar, gjc gjcVar, atb atbVar, r8e r8eVar, String str) {
        this.mFluidContext = fluidContext;
        this.mContext = context;
        this.mDwInstance = atbVar;
        this.mVideoCommentSizeObject = r8eVar;
        this.mAdFlag = str;
        this.mDWInstanceListenersManager = ueiVar;
        this.mLandscapeListenerManager = gjcVar;
    }

    public static /* synthetic */ View access$100(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6755e60", new Object[]{landscapeController});
        }
        return landscapeController.mControllerView;
    }

    public static /* synthetic */ FrameLayout access$200(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("1b4c5cfc", new Object[]{landscapeController});
        }
        return landscapeController.mBgContainer;
    }

    public static /* synthetic */ void access$300(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9749dc", new Object[]{landscapeController});
        } else {
            landscapeController.toNormal();
        }
    }

    public static /* synthetic */ FluidContext access$400(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("b0d6116d", new Object[]{landscapeController});
        }
        return landscapeController.mFluidContext;
    }

    public static /* synthetic */ void access$500(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf5e21a", new Object[]{landscapeController});
        } else {
            landscapeController.handleShowController();
        }
    }

    public static /* synthetic */ atb access$600(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("4646750c", new Object[]{landscapeController});
        }
        return landscapeController.mDwInstance;
    }

    public static /* synthetic */ String access$700(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("294e7548", new Object[]{landscapeController});
        }
        return landscapeController.mAdFlag;
    }

    public static /* synthetic */ i access$800(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("5fb24fd0", new Object[]{landscapeController});
        }
        return landscapeController.mState;
    }

    public static /* synthetic */ com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a access$900(LandscapeController landscapeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a) ipChange.ipc$dispatch("51a85830", new Object[]{landscapeController});
        }
        return landscapeController.mLandscapeDialog;
    }

    public static /* synthetic */ com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a access$902(LandscapeController landscapeController, com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a) ipChange.ipc$dispatch("a6c817f0", new Object[]{landscapeController, aVar});
        }
        landscapeController.mLandscapeDialog = aVar;
        return aVar;
    }

    private ViewGroup getRootView(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4c2756df", new Object[]{this, activity});
        }
        return (ViewGroup) activity.getWindow().getDecorView();
    }

    private void handleShowController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db5d2c8", new Object[]{this});
            return;
        }
        this.mHandler.removeMessages(0);
        View view = this.mControllerView;
        if (view != null) {
            view.setVisibility(0);
        }
        this.mHandler.sendEmptyMessageDelayed(0, 3000L);
    }

    private void initControllerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05e3930", new Object[]{this, context});
        } else if (this.mControllerView == null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.fluid_sdk_landscape_video, (ViewGroup) null);
            this.mControllerView = inflate;
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.landscape_back), new c());
            ImageView imageView = (ImageView) this.mControllerView.findViewById(R.id.img_to_normal);
            this.mImgToNormal = imageView;
            imageView.setOnClickListener(new d());
            ImageView imageView2 = (ImageView) this.mControllerView.findViewById(R.id.imv_play_pause);
            this.mPlayPauseView = imageView2;
            imageView2.setOnClickListener(new e());
            this.mTvCurrentTime = (TextView) this.mControllerView.findViewById(R.id.current_time);
            this.mTvTotalTime = (TextView) this.mControllerView.findViewById(R.id.total_time);
            SeekBar seekBar = (SeekBar) this.mControllerView.findViewById(R.id.seek_bar);
            this.mSeekBar = seekBar;
            seekBar.setOnSeekBarChangeListener(this);
            this.mBgContainer.setOnClickListener(new f());
        }
    }

    private void observerVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cbceed3", new Object[]{this});
            return;
        }
        updatePlayPauseButton();
        this.mDWInstanceListenersManager.addVideoPlayerListener(this);
    }

    private void updatePlayPauseButton() {
        atb atbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b207f2", new Object[]{this});
        } else if (this.mPlayPauseView != null && (atbVar = this.mDwInstance) != null) {
            if (atbVar.getVideoState() == 1) {
                this.mPlayPauseView.getDrawable().setLevel(1);
            } else {
                this.mPlayPauseView.getDrawable().setLevel(2);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a.AbstractC0418a
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        toNormal();
        return true;
    }

    @Override // tb.bib
    public boolean onHandleBackKeyEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cb96814", new Object[]{this})).booleanValue();
        }
        toNormal();
        return true;
    }

    @Override // tb.f9e
    public void onLoopCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a263b7", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.bib
    public void onLoseFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4485122b", new Object[]{this});
        }
    }

    @Override // tb.f9e
    public void onPreCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b35d58", new Object[]{this, uq9Var});
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i2), new Boolean(z)});
        } else if (this.mIsSeekBarStartTracking) {
            this.mTvCurrentTime.setText(vt6.f(i2));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        this.mIsSeekBarStartTracking = true;
        this.mHandler.removeMessages(0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.mIsSeekBarStartTracking = false;
        if (!(this.mDwInstance == null || seekBar == null)) {
            this.mDwInstance.seekTo(seekBar.getProgress());
            this.mDwInstance.playVideo();
        }
        this.mHandler.sendEmptyMessageDelayed(0, 3000L);
        FluidContext fluidContext = this.mFluidContext;
        if (seekBar == null || !seekBar.isPressed()) {
            z = false;
        }
        xau.R(fluidContext, z);
    }

    @Override // tb.f9e
    public void onVideoClose(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b040494", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoComplete(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8488480d", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoError(uq9 uq9Var, Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.f9e
    public void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da67d842", new Object[]{this, uq9Var, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.f9e
    public void onVideoPause(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
        } else {
            updatePlayPauseButton();
        }
    }

    @Override // tb.f9e
    public void onVideoPlay(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1229548", new Object[]{this, uq9Var});
        } else {
            updatePlayPauseButton();
        }
    }

    @Override // tb.f9e
    public void onVideoPrepared(uq9 uq9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2371c7ad", new Object[]{this, uq9Var, obj});
        }
    }

    @Override // tb.f9e
    public void onVideoProgressChanged(uq9 uq9Var, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (!this.mIsSeekBarStartTracking) {
            this.mSeekBar.setMax(Math.max(i4, 0));
            this.mSeekBar.setProgress(i2);
            TextView textView = this.mTvCurrentTime;
            if (textView != null) {
                textView.setText(vt6.f(i2));
                this.mTvTotalTime.setText(vt6.f(i4));
            }
        }
    }

    @Override // tb.f9e
    public void onVideoScreenChanged(uq9 uq9Var, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0fc2b5", new Object[]{this, uq9Var, dWVideoScreenType});
        }
    }

    @Override // tb.f9e
    public void onVideoSeekTo(uq9 uq9Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160bdd7c", new Object[]{this, uq9Var, new Integer(i2)});
        }
    }

    @Override // tb.f9e
    public void onVideoStart(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
        } else {
            updatePlayPauseButton();
        }
    }

    @Override // tb.f9e
    public void onVideoStateChanged(uq9 uq9Var, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4492ac", new Object[]{this, uq9Var, new Integer(i2)});
        }
    }

    public void toggleScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
        } else if (this.mIsLandscape) {
            toNormal();
        } else {
            toLandscape();
        }
    }

    private void toNormal() {
        atb atbVar;
        ViewGroup view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378fc2c9", new Object[]{this});
        } else if (this.mIsLandscape && (atbVar = this.mDwInstance) != null && (view = atbVar.getView()) != null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                ViewGroup rootView = getRootView((Activity) context);
                Drawable background = this.mBgContainer.getBackground();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), 1.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, Key.ROTATION, 90.0f, 0.0f);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, -((((IContainerService) this.mFluidContext.getService(IContainerService.class)).getWeexActionBarHeight() - pr9.h(this.mContext)) / 2.0f));
                ObjectAnimator ofInt = ObjectAnimator.ofInt(background, "alpha", background.getAlpha(), 0);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.mControllerView, "alpha", 1.0f, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.mControllerView, Key.ROTATION, 90.0f, 0.0f);
                ofFloat4.addUpdateListener(new g());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.playTogether(ofFloat4, ofFloat3, ofFloat, ofFloat2, ofInt, ofFloat5, ofFloat6);
                animatorSet.start();
                animatorSet.addListener(new h(view, rootView));
                qn1 backKeyEventDetector = ((IBackEventService) this.mFluidContext.getService(IBackEventService.class)).getBackKeyEventDetector();
                if (backKeyEventDetector != null) {
                    backKeyEventDetector.c(this);
                }
                this.mState.b(this.mDwInstance);
                this.mDWInstanceListenersManager.removeVideoPlayerListener(this);
                this.mIsLandscape = false;
                this.mLandscapeListenerManager.x();
            }
        }
    }

    public void toLandscape() {
        atb atbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d936307", new Object[]{this});
        } else if (!this.mIsLandscape && (atbVar = this.mDwInstance) != null) {
            this.mState.c(atbVar);
            ViewGroup view = this.mDwInstance.getView();
            if (view != null) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    ViewGroup rootView = getRootView((Activity) context);
                    int h2 = pr9.h(this.mContext);
                    int width = rootView.getWidth();
                    int height = rootView.getHeight() - h2;
                    int width2 = view.getWidth();
                    int height2 = view.getHeight();
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    rootView.getLocationOnScreen(iArr2);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width2, height2, 17);
                    layoutParams.leftMargin = iArr[0] - iArr2[0];
                    ir9.b(TAG, "mWidth:" + width2 + ",mHeight:" + height2 + ",topMargin:" + layoutParams.topMargin + ",normalLocation[1]:" + iArr[1] + ",decorViewLocation[1]:" + iArr2[1] + ",statusBarHeight:" + h2 + ",normalLocation[0]:" + iArr[0] + ",decorViewLocation[0]:" + iArr2[0]);
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    FrameLayout frameLayout = this.mBgContainer;
                    if (frameLayout == null) {
                        FrameLayout frameLayout2 = new FrameLayout(this.mContext);
                        this.mBgContainer = frameLayout2;
                        frameLayout2.setClickable(true);
                        this.mBgContainer.setBackgroundResource(R.drawable.fluid_sdk_landscape_bg);
                    } else {
                        frameLayout.removeAllViews();
                    }
                    this.mBgContainer.addView(view, layoutParams);
                    ViewParent parent2 = this.mBgContainer.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ((ViewGroup) parent2).removeView(this.mBgContainer);
                    }
                    if (this.mLandscapeDialog == null) {
                        com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a aVar = new com.taobao.android.fluid.framework.card.cards.video.manager.landscape.a(this.mContext);
                        this.mLandscapeDialog = aVar;
                        aVar.a(this);
                    }
                    this.mLandscapeDialog.setContentView(this.mBgContainer, new ViewGroup.LayoutParams(-1, -1));
                    this.mLandscapeDialog.show();
                    r8e r8eVar = this.mVideoCommentSizeObject;
                    float f2 = (height * 1.0f) / r8eVar.g;
                    float f3 = (width * 1.0f) / r8eVar.h;
                    if (f2 > f3) {
                        f2 = f3;
                    }
                    initControllerView(this.mContext);
                    observerVideoState();
                    this.mBgContainer.addView(this.mControllerView, new FrameLayout.LayoutParams(height, width, 17));
                    this.mControllerView.setAlpha(1.0f);
                    this.mControllerView.setVisibility(8);
                    Drawable background = this.mBgContainer.getBackground();
                    background.setAlpha(0);
                    ir9.b(TAG, "translationY= 0 statusBarHeight=" + h2 + " ; mFullHeight=" + width + " " + height);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f2);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f2);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, Key.ROTATION, 0.0f, 90.0f);
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(background, "alpha", 0, 255);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.mControllerView, Key.ROTATION, 0.0f, 90.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(300L);
                    animatorSet.play(ofFloat3);
                    animatorSet.play(ofFloat);
                    animatorSet.play(ofFloat2);
                    animatorSet.play(ofInt);
                    animatorSet.play(ofFloat4);
                    animatorSet.start();
                    animatorSet.addListener(new b(view, f2, background));
                    qn1 backKeyEventDetector = ((IBackEventService) this.mFluidContext.getService(IBackEventService.class)).getBackKeyEventDetector();
                    if (backKeyEventDetector != null) {
                        backKeyEventDetector.d(this);
                    }
                    this.mIsLandscape = true;
                    this.mLandscapeListenerManager.v();
                }
            }
        }
    }
}
