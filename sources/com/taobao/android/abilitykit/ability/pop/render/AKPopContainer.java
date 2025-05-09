package com.taobao.android.abilitykit.ability.pop.render;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.a;
import com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler;
import com.taobao.android.abilitykit.ability.pop.render.util.GestureRoundCornerFrameLayout;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.falco.m;
import com.taobao.falco.s;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.a8;
import tb.abl;
import tb.e9;
import tb.fab;
import tb.gab;
import tb.gxv;
import tb.h9;
import tb.iab;
import tb.iih;
import tb.k8;
import tb.m9;
import tb.n8;
import tb.pr;
import tb.t2o;
import tb.tz8;
import tb.ufc;
import tb.uwo;
import tb.wz0;
import tb.z71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AKPopContainer<PARAMS extends h9, CONTEXT extends k8> extends FrameLayout implements com.taobao.android.abilitykit.ability.pop.render.a<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTAINER_TAG = "std_pop_ak_container";
    private static final String SIZE_ANIM_KEY_H = "h";
    private static final String SIZE_ANIM_KEY_W = "w";
    private m falcoSpan;
    private boolean isActivityGroup;
    public ValueAnimator mBackgroundAnimator;
    public View mContentView;
    public GestureRoundCornerFrameLayout mContentWrapper;
    private GestureHandler mGestureUtil;
    public View mLoadingView;
    public h9 mParams;
    private fab mPopAnimation;
    public e9 mPopConfig;
    public IAKPopRender mPopRender;
    public a.AbstractC0327a mStateCallback;
    public int mWindowHeight;
    public int mWindowWidth;
    private OnScreenChangedListener screenListener;
    private Boolean shouldNotifySizeChanged;
    public final int DEFAULT_BACKGROUND_COLOR = getContext().getResources().getInteger(R.integer.std_pop_default_bg_color);
    private final int TITLE_LAYOUT_HEIGHT = getContext().getResources().getInteger(R.integer.std_pop_title_bar_height);
    private boolean mIsAxisX = false;
    private boolean mIsNegative = false;
    private boolean mIsGravityCenter = false;
    private boolean mIsDismissing = false;
    public boolean hasAnimatedIn = false;
    private ViewGroup mTitleBar = null;
    private LayoutInflater mInflater = null;
    private String currentState = "HALF_SCREEN";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6263a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public a(int i, int i2, int i3) {
            this.f6263a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Integer) && !(AKPopContainer.this.getBackground() instanceof BitmapDrawable)) {
                AKPopContainer.this.setBackgroundColor(Color.argb(((Integer) animatedValue).intValue(), this.f6263a, this.b, this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!AKPopContainer.this.mPopConfig.e0()) {
            } else {
                if (AKPopContainer.this.mPopConfig.A()) {
                    AKPopContainer.access$000(AKPopContainer.this, IAKPopRender.CloseType.CLICK_OUT);
                } else if (AKPopContainer.access$100(AKPopContainer.this) == null) {
                    AKPopContainer.this.doDismissAnimation();
                } else if (!AKPopContainer.access$100(AKPopContainer.this).a()) {
                    AKPopContainer.this.doDismissAnimation();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements iab {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k8 f6267a;
        public final /* synthetic */ IAKPopRender b;
        public final /* synthetic */ h9 c;

        public e(k8 k8Var, IAKPopRender iAKPopRender, h9 h9Var) {
            this.f6267a = k8Var;
            this.b = iAKPopRender;
            this.c = h9Var;
        }

        @Override // tb.iab
        public void onRenderSuccess(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
                return;
            }
            if (AKPopContainer.access$200(AKPopContainer.this) != null) {
                AKPopContainer.access$200(AKPopContainer.this).c0(Long.valueOf(System.currentTimeMillis()));
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            aKPopContainer.mContentWrapper.setBackgroundColor(aKPopContainer.mPopConfig.B());
            AKPopContainer.access$300(AKPopContainer.this, view);
            AKPopContainer.access$400(AKPopContainer.this);
            iih.INSTANCE.a("stdPopTag", "onStdPopRenderSuccess: ".concat(view.getClass().getName()));
        }

        @Override // tb.iab
        public void a(a8 a8Var, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("577cc282", new Object[]{this, a8Var, view});
                return;
            }
            if (view != null) {
                AKPopContainer.this.mPopConfig.x0(false);
                AKPopContainer.access$300(AKPopContainer.this, view);
            } else {
                AKPopContainer.access$500(AKPopContainer.this);
            }
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "onStdPopRenderFailed error msg = " + a8Var.b() + " errorCode = " + a8Var.a());
            z71.c(this.f6267a, new n8(this.b.getClass().getSimpleName(), this.c.b()), a8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            h9 h9Var = aKPopContainer.mParams;
            if (i != 1) {
                z = false;
            }
            h9Var.e(z, aKPopContainer.getContext());
            AKPopContainer.this.changeGravity(null);
            if (AKPopContainer.this.mParams.f20479a.f0()) {
                AKPopContainer.this.changeSize(-2.0f, -2.0f, false);
            } else {
                AKPopContainer.this.changeSize(-1.0f, -1.0f, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements s.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tz8 f6269a;

        public g(tz8 tz8Var) {
            this.f6269a = tz8Var;
        }

        @Override // com.taobao.falco.s.b
        public void onTouchActionSpan(s sVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b740c373", new Object[]{this, sVar});
            } else if (sVar != null) {
                try {
                    AKPopContainer.access$202(AKPopContainer.this, this.f6269a.d(m.MODULE, "tap").g(sVar.k()).e());
                    if (AKPopContainer.access$200(AKPopContainer.this) != null) {
                        AKPopContainer.access$200(AKPopContainer.this).y("StdPopPage");
                        AKPopContainer.access$200(AKPopContainer.this).N(AKPopContainer.this.mParams.f);
                        AKPopContainer aKPopContainer = AKPopContainer.this;
                        IAKPopRender iAKPopRender = aKPopContainer.mPopRender;
                        if (iAKPopRender != null) {
                            str = iAKPopRender.i(aKPopContainer.mParams.e);
                        } else {
                            str = "";
                        }
                        if ("weex2".equals(str)) {
                            AKPopContainer.access$200(AKPopContainer.this).Z("weex");
                        } else if ("h5".equals(str)) {
                            AKPopContainer.access$200(AKPopContainer.this).Z("h5");
                        } else {
                            AKPopContainer.access$200(AKPopContainer.this).Z("native");
                        }
                        AKPopContainer.access$200(AKPopContainer.this).t0("popOver");
                        AKPopContainer.access$200(AKPopContainer.this).l0(AKPopContainer.this.mParams.e);
                        AKPopContainer.access$200(AKPopContainer.this).Q(sVar.getPageName());
                        AKPopContainer.access$200(AKPopContainer.this).B(sVar.c());
                    }
                } catch (Throwable th) {
                    iih iihVar = iih.INSTANCE;
                    iihVar.a("stdPopTag", "[span]parse url error: " + pr.d(th));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (AKPopContainer.this.mPopConfig.A()) {
                AKPopContainer.access$000(AKPopContainer.this, IAKPopRender.CloseType.NATIVE_CLOSE);
            } else {
                AKPopContainer.this.doDismissAnimation();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(AKPopContainer aKPopContainer) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue("h")).intValue();
            int intValue2 = ((Integer) valueAnimator.getAnimatedValue("w")).intValue();
            AKPopContainer.this.mPopConfig.A0(intValue);
            AKPopContainer.this.mPopConfig.y0(intValue);
            AKPopContainer.this.mPopConfig.B0(intValue2);
            AKPopContainer.this.mPopConfig.z0(intValue2);
            AKPopContainer.this.adjustWrapperHeight(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class k extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/AKPopContainer$8");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            AKPopContainer.this.adjustWrapperHeight(true);
            AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.CHANGE_SIZE_END, null);
        }
    }

    static {
        t2o.a(336593016);
        t2o.a(336593034);
    }

    public AKPopContainer(Context context) {
        super(context);
        setTag(CONTAINER_TAG);
    }

    public static /* synthetic */ void access$000(AKPopContainer aKPopContainer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7fadd4", new Object[]{aKPopContainer, str});
        } else {
            aKPopContainer.notifyBlockCloseType(str);
        }
    }

    public static /* synthetic */ fab access$100(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fab) ipChange.ipc$dispatch("e60d6192", new Object[]{aKPopContainer});
        }
        return aKPopContainer.mPopAnimation;
    }

    public static /* synthetic */ m access$200(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("c29dee7f", new Object[]{aKPopContainer});
        }
        return aKPopContainer.falcoSpan;
    }

    public static /* synthetic */ m access$202(AKPopContainer aKPopContainer, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("875bf670", new Object[]{aKPopContainer, mVar});
        }
        aKPopContainer.falcoSpan = mVar;
        return mVar;
    }

    public static /* synthetic */ void access$300(AKPopContainer aKPopContainer, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d4504b", new Object[]{aKPopContainer, view});
        } else {
            aKPopContainer.setupContentView(view);
        }
    }

    public static /* synthetic */ void access$400(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d2606", new Object[]{aKPopContainer});
        } else {
            aKPopContainer.setupTitle();
        }
    }

    public static /* synthetic */ void access$500(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e587dae5", new Object[]{aKPopContainer});
        } else {
            aKPopContainer.requestDismiss();
        }
    }

    public static /* synthetic */ void access$600(AKPopContainer aKPopContainer, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d023422", new Object[]{aKPopContainer, str, jSONObject});
        } else {
            aKPopContainer.callbackLifeCycle(str, jSONObject);
        }
    }

    public static /* synthetic */ JSONObject access$700(AKPopContainer aKPopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9ca8a3c3", new Object[]{aKPopContainer});
        }
        return aKPopContainer.getPopCurrentPosition();
    }

    public static /* synthetic */ JSONObject access$800(AKPopContainer aKPopContainer, wz0 wz0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("59f1a51", new Object[]{aKPopContainer, wz0Var});
        }
        return aKPopContainer.getAnimStartParams(wz0Var);
    }

    private void callbackLifeCycle(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4369705a", new Object[]{this, str, jSONObject});
        } else if (this.mPopRender != null && this.mParams != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("popId", (Object) this.mParams.d);
            if (jSONObject != null) {
                jSONObject2.put("data", (Object) jSONObject);
            }
            this.mPopRender.n(str, jSONObject2);
        }
    }

    private void doAnimation(boolean z, View view, e9 e9Var, gab gabVar) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef364e1", new Object[]{this, new Boolean(z), view, e9Var, gabVar});
            return;
        }
        fab fabVar = this.mPopAnimation;
        if (fabVar == null) {
            if (gabVar != null) {
                gabVar.d(null);
                gabVar.b(null);
            }
        } else if (fabVar.a()) {
            if (gabVar != null) {
                gabVar.c(fabVar);
            }
        } else if (z) {
            if (e9Var == null) {
                i2 = -1;
            } else {
                i2 = e9Var.M();
            }
            fabVar.b(view, null, gabVar, i2);
        } else {
            fabVar.d(view, gabVar);
        }
    }

    private JSONObject getAnimStartParams(wz0 wz0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1618080b", new Object[]{this, wz0Var});
        }
        JSONObject popCurrentPosition = getPopCurrentPosition();
        if (!(wz0Var == null || wz0Var.a() == null || !wz0Var.a().getClass().isArray())) {
            popCurrentPosition.put("duration", (Object) wz0Var.b());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(wz0Var.c(), wz0Var.a());
            popCurrentPosition.put("animations", (Object) jSONObject);
        }
        return popCurrentPosition;
    }

    private int getBackgroundColor(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6db3bfad", new Object[]{this, str, str2})).intValue();
        }
        e9 e9Var = this.mPopConfig;
        if (e9Var != null && m9.f.equals(e9Var.U())) {
            return 0;
        }
        if (!"color".equals(str) || TextUtils.isEmpty(str2)) {
            return this.DEFAULT_BACKGROUND_COLOR;
        }
        try {
            return Color.parseColor(str2);
        } catch (IllegalArgumentException unused) {
            return this.DEFAULT_BACKGROUND_COLOR;
        }
    }

    private final LayoutInflater getInflater() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutInflater) ipChange.ipc$dispatch("7c055a1a", new Object[]{this});
        }
        if (this.mInflater == null) {
            Context context = getContext();
            if (context instanceof Activity) {
                this.mInflater = ((Activity) context).getLayoutInflater();
            } else {
                this.mInflater = LayoutInflater.from(context);
            }
        }
        return this.mInflater;
    }

    private void initGestureUtil() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a909cc2", new Object[]{this});
        } else if (this.mGestureUtil == null && !this.mIsGravityCenter && this.mPopConfig.d0()) {
            GestureHandler gestureHandler = new GestureHandler(new l(), new com.taobao.android.abilitykit.ability.pop.render.util.a(), this.mPopConfig.A(), this.mIsAxisX, this.mIsNegative);
            this.mGestureUtil = gestureHandler;
            this.mContentWrapper.setGestureHandler(gestureHandler);
        }
    }

    private void initSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a88001", new Object[]{this});
            return;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            try {
                tz8Var.a(new g(tz8Var));
            } catch (Throwable th) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("stdPopTag", "getTouchActionSpanAsync error: " + pr.d(th));
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AKPopContainer aKPopContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/abilitykit/ability/pop/render/AKPopContainer");
        }
    }

    private void requestDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce13b802", new Object[]{this});
            return;
        }
        callbackLifeCycle(IAKPopRender.LifecycleType.BEFORE_CLOSE, getPopCurrentPosition());
        a.AbstractC0327a aVar = this.mStateCallback;
        if (aVar != null) {
            aVar.c();
        }
    }

    private void setupBackgroundColor(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954511df", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        e9 e9Var = this.mPopConfig;
        if (e9Var != null) {
            int backgroundColor = getBackgroundColor(e9Var.x(), this.mPopConfig.y());
            ValueAnimator valueAnimator = this.mBackgroundAnimator;
            if (valueAnimator != null && valueAnimator.isStarted()) {
                this.mBackgroundAnimator.cancel();
            }
            this.mBackgroundAnimator = null;
            int red = Color.red(backgroundColor);
            int green = Color.green(backgroundColor);
            int blue = Color.blue(backgroundColor);
            int alpha = Color.alpha(backgroundColor);
            if (z2 && alpha != 0) {
                if (z) {
                    this.mBackgroundAnimator = ValueAnimator.ofInt(0, alpha);
                } else {
                    this.mBackgroundAnimator = ValueAnimator.ofInt(alpha, 0);
                }
                this.mBackgroundAnimator.setDuration(150L);
                this.mBackgroundAnimator.addUpdateListener(new a(red, green, blue));
                this.mBackgroundAnimator.start();
            } else if (z) {
                setBackgroundColor(backgroundColor);
            } else {
                setBackgroundColor(Color.argb(0, red, green, blue));
            }
        }
    }

    private void setupContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d198e3ca", new Object[]{this, view});
            return;
        }
        this.mContentView = view;
        this.mContentWrapper.removeAllViews();
        this.mContentWrapper.addView(this.mContentView);
        ViewProxy.setOnClickListener(this.mContentView, new i(this));
        adjustWrapperHeight(true);
    }

    private final void setupTitle() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f18c1ce2", new Object[]{this});
        } else if (this.mPopConfig.X() || !TextUtils.isEmpty(this.mPopConfig.Z())) {
            if (this.mContentView.getLayoutParams() == null) {
                marginLayoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mContentView.getLayoutParams();
            }
            marginLayoutParams.topMargin = uwo.a(getContext().getApplicationContext(), this.TITLE_LAYOUT_HEIGHT);
            this.mContentView.setLayoutParams(marginLayoutParams);
            if (this.mTitleBar == null) {
                ViewGroup viewGroup = (ViewGroup) getInflater().inflate(R.layout.ability_kit_title_bar, (ViewGroup) null);
                this.mTitleBar = viewGroup;
                ViewProxy.setOnClickListener(viewGroup.findViewById(R.id.title_bar_close), new h());
                if (!TextUtils.isEmpty(this.mPopConfig.Z())) {
                    TextView textView = (TextView) this.mTitleBar.findViewById(R.id.title_bar_pop_title);
                    textView.setVisibility(0);
                    textView.setText(this.mPopConfig.Z());
                    this.mTitleBar.setBackgroundColor(-1);
                }
            }
            if (this.mTitleBar.getParent() == null) {
                this.mContentWrapper.addView(this.mTitleBar, new FrameLayout.LayoutParams(-1, -2));
            }
        }
    }

    private final void setupWrapperByGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa28af48", new Object[]{this});
            return;
        }
        this.mContentWrapper = new GestureRoundCornerFrameLayout(getContext());
        h9 h9Var = this.mParams;
        if (h9Var != null && h9Var.f20479a.w()) {
            this.mParams.e(TBAutoSizeConfig.x().T(getContext()), getContext());
            this.mPopConfig = this.mParams.f20479a;
        }
        changeGravity(null);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a
    public void doDismissAnimation() {
        e9 e9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bef38cc", new Object[]{this});
        } else if (!this.mIsDismissing) {
            this.mIsDismissing = true;
            a.AbstractC0327a aVar = this.mStateCallback;
            if (aVar != null) {
                aVar.e();
            }
            if (this.mPopConfig != null) {
                setupBackgroundColor(false, true);
            }
            if (this.mContentView == null || (e9Var = this.mPopConfig) == null) {
                requestDismiss();
            } else {
                doAnimation(false, this.mContentWrapper, e9Var, new b());
            }
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a
    public void enableCorner(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c007c75", new Object[]{this, new Boolean(z)});
        } else if (this.mContentWrapper != null) {
            e9 e9Var = this.mPopConfig;
            String N = e9Var != null ? e9Var.N() : null;
            if (!z) {
                this.mContentWrapper.setRadius(-1.0f);
                return;
            }
            int a2 = uwo.a(getContext().getApplicationContext(), this.mPopConfig.C());
            if ("center".equals(N)) {
                this.mContentWrapper.setRadius(a2);
            } else if ("left".equals(N)) {
                float f2 = a2;
                this.mContentWrapper.setRadius(0.0f, f2, 0.0f, f2);
            } else if ("right".equals(N)) {
                float f3 = a2;
                this.mContentWrapper.setRadius(f3, 0.0f, f3, 0.0f);
            } else if ("top".equals(N)) {
                float f4 = a2;
                this.mContentWrapper.setRadius(0.0f, 0.0f, f4, f4);
            } else if ("right|bottom".equals(N)) {
                float f5 = a2;
                this.mContentWrapper.setRadius(f5, 0.0f, f5, 0.0f);
            } else {
                float f6 = a2;
                this.mContentWrapper.setRadius(f6, f6, 0.0f, 0.0f);
            }
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a
    public boolean isBgTransparent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8b7cdce", new Object[]{this})).booleanValue();
        }
        e9 e9Var = this.mPopConfig;
        if (e9Var == null || getBackgroundColor(e9Var.x(), this.mPopConfig.y()) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.screenListener != null) {
            TBAutoSizeConfig.x().d0(this.screenListener);
        }
        IAKPopRender iAKPopRender = this.mPopRender;
        if (iAKPopRender != null) {
            iAKPopRender.m(this.mContentView);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a
    public ViewGroup onCreateView(CONTEXT context, PARAMS params, View view, a.AbstractC0327a aVar, IAKPopRender<PARAMS, CONTEXT> iAKPopRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("36e1d48b", new Object[]{this, context, params, view, aVar, iAKPopRender});
        }
        this.mParams = params;
        this.mPopConfig = params.f20479a;
        this.mPopRender = iAKPopRender;
        this.mStateCallback = aVar;
        this.isActivityGroup = getContext() instanceof ActivityGroup;
        initSpan();
        setupWrapperByGravity();
        initGestureUtil();
        setOnClickListener(new d());
        setupBackgroundColor(true, this.mPopConfig.t());
        this.mPopRender.j(context, params, view, new e(context, iAKPopRender, params));
        if (this.mContentView == null && this.mPopConfig.Y()) {
            View inflate = getInflater().inflate(R.layout.ability_kit_loading, (ViewGroup) null);
            this.mLoadingView = inflate;
            this.mContentWrapper.addView(inflate);
        }
        if (this.mPopConfig.w() && !this.mParams.d()) {
            this.screenListener = new f();
            TBAutoSizeConfig.x().d0(this.screenListener);
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.mBackgroundAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mBackgroundAnimator = null;
        }
        this.mPopRender.k(this.mContentView);
        if (this.screenListener != null) {
            TBAutoSizeConfig.x().h0(this.screenListener);
        }
        m mVar = this.falcoSpan;
        if (mVar != null) {
            mVar.finish();
            this.falcoSpan = null;
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a
    public void onLevelChanged(boolean z, boolean z2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd84f5ad", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i2)});
        } else if (gxv.l(getContext()) && z2) {
            setupBackgroundColor(z, !z);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a
    public boolean shouldIgnoreNotifyLevelChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63460bf1", new Object[]{this})).booleanValue();
        }
        if (gxv.l(getContext())) {
            return true ^ this.mParams.d();
        }
        return true;
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements gab {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.gab
        public void b(wz0 wz0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c54a135", new Object[]{this, wz0Var});
                return;
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.OUT_ANIMATION_END, AKPopContainer.access$700(aKPopContainer));
            AKPopContainer.access$500(AKPopContainer.this);
        }

        @Override // tb.gab
        public void c(fab fabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69f9becd", new Object[]{this, fabVar});
                return;
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.OUT_ANIMATION_END, AKPopContainer.access$700(aKPopContainer));
            AKPopContainer.access$500(AKPopContainer.this);
        }

        @Override // tb.gab
        public void d(wz0 wz0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e702cef", new Object[]{this, wz0Var});
                return;
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.OUT_ANIMATION_START, AKPopContainer.access$800(aKPopContainer, wz0Var));
        }

        @Override // tb.gab
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb5deb15", new Object[]{this});
            } else if (AKPopContainer.this.mContentWrapper != null) {
                JSONObject jSONObject = new JSONObject();
                int[] iArr = new int[2];
                AKPopContainer.this.mContentWrapper.getLocationInWindow(iArr);
                jSONObject.put("x", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), iArr[0])));
                jSONObject.put("y", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), iArr[1])));
                jSONObject.put("w", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), AKPopContainer.this.mContentWrapper.getWidth())));
                jSONObject.put("h", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), AKPopContainer.this.mContentWrapper.getHeight())));
                AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements gab {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6265a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public c(int i, int i2, int i3) {
            this.f6265a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // tb.gab
        public void b(wz0 wz0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c54a135", new Object[]{this, wz0Var});
                return;
            }
            if (AKPopContainer.access$200(AKPopContainer.this) != null) {
                AKPopContainer.access$200(AKPopContainer.this).w(Long.valueOf(System.currentTimeMillis()));
            }
            new StringBuilder("onStdPopShow: ").append(SystemClock.uptimeMillis());
            AKPopContainer aKPopContainer = AKPopContainer.this;
            AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.IN_ANIMATION_END, AKPopContainer.access$700(aKPopContainer));
            if (this.f6265a != AKPopContainer.this.mPopConfig.S() || this.b != this.c) {
                AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.OFFSET_ENABLE, null);
            }
        }

        @Override // tb.gab
        public void c(fab fabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69f9becd", new Object[]{this, fabVar});
                return;
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.IN_ANIMATION_END, AKPopContainer.access$700(aKPopContainer));
        }

        @Override // tb.gab
        public void d(wz0 wz0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e702cef", new Object[]{this, wz0Var});
                return;
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.IN_ANIMATION_START, AKPopContainer.access$800(aKPopContainer, wz0Var));
            if (AKPopContainer.access$200(AKPopContainer.this) != null) {
                AKPopContainer.access$200(AKPopContainer.this).L(Long.valueOf(System.currentTimeMillis()));
            }
        }

        @Override // tb.gab
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb5deb15", new Object[]{this});
            } else if (AKPopContainer.this.mContentWrapper != null) {
                JSONObject jSONObject = new JSONObject();
                int[] iArr = new int[2];
                AKPopContainer.this.mContentWrapper.getLocationInWindow(iArr);
                jSONObject.put("x", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), iArr[0])));
                jSONObject.put("y", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), iArr[1])));
                jSONObject.put("w", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), AKPopContainer.this.mContentWrapper.getWidth())));
                jSONObject.put("h", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), AKPopContainer.this.mContentWrapper.getHeight())));
                AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class l implements GestureHandler.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.b
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d03d1338", new Object[]{this, view});
            } else {
                AKPopContainer.access$000(AKPopContainer.this, IAKPopRender.CloseType.PAN_CLOSE);
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.b
        public void c(wz0 wz0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c346cdb0", new Object[]{this, wz0Var});
                return;
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_START, AKPopContainer.access$800(aKPopContainer, wz0Var));
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.b
        public boolean d(boolean z, float f, int i, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d7cf45f6", new Object[]{this, new Boolean(z), new Float(f), new Integer(i), view})).booleanValue();
            }
            if (z && h9.DEFAULT_LANDSCAPE_DRAWER.equals(AKPopContainer.this.mParams.f20479a.D()) && f * 10.0f > view.getWidth()) {
                return true;
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            if (aKPopContainer.mContentView == null || z) {
                return false;
            }
            if (AKPopContainer.access$100(aKPopContainer) != null && AKPopContainer.access$100(AKPopContainer.this).a()) {
                return true;
            }
            AKPopContainer aKPopContainer2 = AKPopContainer.this;
            IAKPopRender iAKPopRender = aKPopContainer2.mPopRender;
            if (iAKPopRender == null || !iAKPopRender.l(aKPopContainer2.mContentView, i)) {
                return false;
            }
            return true;
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.b
        public void e(float f, float f2, int i, int i2, boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9b45ff9", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2), new Boolean(z), str});
            } else if (AKPopContainer.this.mContentWrapper != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), f)));
                jSONObject.put("y", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), f2)));
                jSONObject.put("w", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), i2)));
                jSONObject.put("h", (Object) Integer.valueOf(uwo.b(AKPopContainer.this.getContext(), i)));
                jSONObject.put("animated", (Object) Boolean.valueOf(z));
                if ("onPositionChanged".equals(str) || "onPositionChanged".equals(str)) {
                    AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.CHANGE_POSITION, jSONObject);
                } else if (com.taobao.android.abilitykit.ability.pop.render.util.a.ON_ANIMATION.equals(str)) {
                    AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE, jSONObject);
                } else {
                    AKPopContainer.access$600(AKPopContainer.this, str, jSONObject);
                }
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.b
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff48da1c", new Object[]{this});
                return;
            }
            AKPopContainer aKPopContainer = AKPopContainer.this;
            AKPopContainer.access$600(aKPopContainer, IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_END, AKPopContainer.access$700(aKPopContainer));
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.b
        public void a(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc8f5da", new Object[]{this, view, new Integer(i)});
            } else if (i == 3) {
                a.AbstractC0327a aVar = AKPopContainer.this.mStateCallback;
                if (aVar != null) {
                    aVar.e();
                }
                AKPopContainer.access$500(AKPopContainer.this);
            } else if (i == 1) {
                AKPopContainer.access$600(AKPopContainer.this, IAKPopRender.LifecycleType.OFFSET_DISABLE, null);
            }
        }
    }

    private void notifyBlockCloseType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc8f2ff", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject(1);
        jSONObject.put("type", (Object) str);
        callbackLifeCycle(IAKPopRender.LifecycleType.BLOCK_CLOSE, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void adjustWrapperHeight(boolean r12) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.abilitykit.ability.pop.render.AKPopContainer.adjustWrapperHeight(boolean):void");
    }

    private JSONObject getPopCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6935994e", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        GestureRoundCornerFrameLayout gestureRoundCornerFrameLayout = this.mContentWrapper;
        if (gestureRoundCornerFrameLayout != null) {
            int[] iArr = new int[2];
            gestureRoundCornerFrameLayout.getLocationInWindow(iArr);
            jSONObject.put("x", (Object) Integer.valueOf(uwo.b(getContext(), iArr[0])));
            jSONObject.put("y", (Object) Integer.valueOf(uwo.b(getContext(), iArr[1])));
            jSONObject.put("w", (Object) Integer.valueOf(uwo.b(getContext(), this.mContentWrapper.getWidth())));
            jSONObject.put("h", (Object) Integer.valueOf(uwo.b(getContext(), this.mContentWrapper.getHeight())));
        }
        return jSONObject;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a
    public void changeGravity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ee188f", new Object[]{this, str});
            return;
        }
        h9 h9Var = this.mParams;
        if (h9Var != null) {
            this.mPopConfig = h9Var.f20479a;
        }
        if (this.mPopConfig != null && this.mContentWrapper != null && this.mPopRender != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int a2 = uwo.a(getContext().getApplicationContext(), this.mPopConfig.C());
            String U = this.mPopConfig.U();
            if (TextUtils.isEmpty(str)) {
                str = this.mPopConfig.N();
            } else {
                this.mPopConfig.u0(str);
            }
            if ("center".equals(str)) {
                layoutParams.gravity = 17;
                this.mIsGravityCenter = true;
                this.mContentWrapper.setRadius(a2);
                if (U == null) {
                    U = m9.f23858a;
                }
            } else if ("left".equals(str)) {
                layoutParams.gravity = 19;
                this.mIsAxisX = true;
                this.mIsNegative = true;
                float f2 = a2;
                this.mContentWrapper.setRadius(0.0f, f2, 0.0f, f2);
                if (U == null) {
                    U = m9.d;
                }
            } else if ("right".equals(str)) {
                layoutParams.gravity = 21;
                this.mIsAxisX = true;
                this.mIsNegative = false;
                float f3 = a2;
                this.mContentWrapper.setRadius(f3, 0.0f, f3, 0.0f);
                if (U == null) {
                    U = m9.e;
                }
            } else if ("top".equals(str)) {
                layoutParams.gravity = 49;
                this.mIsAxisX = false;
                this.mIsNegative = true;
                float f4 = a2;
                this.mContentWrapper.setRadius(0.0f, 0.0f, f4, f4);
                if (U == null) {
                    U = m9.b;
                }
            } else if ("right|bottom".equals(str)) {
                layoutParams.gravity = 85;
                this.mIsAxisX = true;
                this.mIsNegative = false;
                float f5 = a2;
                this.mContentWrapper.setRadius(f5, 0.0f, f5, 0.0f);
                if (U == null) {
                    U = m9.e;
                }
            } else {
                this.mIsAxisX = false;
                this.mIsNegative = false;
                layoutParams.gravity = 81;
                float f6 = a2;
                this.mContentWrapper.setRadius(f6, f6, 0.0f, 0.0f);
                if (U == null) {
                    U = m9.c;
                }
            }
            this.mPopAnimation = m9.a(U);
            if (this.mContentWrapper.getParent() != null) {
                this.mContentWrapper.setLayoutParams(layoutParams);
            } else {
                addView(this.mContentWrapper, layoutParams);
            }
            GestureHandler gestureHandler = this.mGestureUtil;
            if (gestureHandler != null) {
                gestureHandler.l(this.mIsAxisX, this.mIsNegative);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.mWindowWidth != measuredWidth || this.mWindowHeight != measuredHeight) {
            iih.INSTANCE.a("stdPopTag", "onLayout width = " + measuredWidth + " height = " + measuredHeight);
            if (this.isActivityGroup) {
                try {
                    Activity currentActivity = ((ActivityGroup) getContext()).getLocalActivityManager().getCurrentActivity();
                    if (currentActivity != null) {
                        this.shouldNotifySizeChanged = Boolean.valueOf(currentActivity instanceof ufc);
                    }
                    Boolean bool = this.shouldNotifySizeChanged;
                    if (bool != null && bool.booleanValue()) {
                        ((ufc) currentActivity).onSizeChanged(measuredWidth, measuredHeight);
                    }
                } catch (Throwable th) {
                    iih.INSTANCE.a("stdPopTag", "notify size changed error = " + th);
                }
            }
            e9 e9Var = this.mPopConfig;
            if (e9Var != null && e9Var.E() && h9.DEFAULT_LANDSCAPE_DRAWER.equals(this.mPopConfig.D()) && abl.G() && (getContext() instanceof ActivityGroup) && measuredWidth > 0 && measuredHeight > 0) {
                ActivityGroup activityGroup = (ActivityGroup) getContext();
                Window window = activityGroup.getWindow();
                if ("HALF_SCREEN".equals(this.currentState)) {
                    f2 = measuredWidth * 1.0f;
                    f3 = measuredHeight;
                } else {
                    f2 = measuredWidth;
                    f3 = measuredHeight * 2.0f;
                }
                float f4 = f2 / f3;
                iih iihVar = iih.INSTANCE;
                iihVar.a("stdPopTag", "onLayout ratio = " + f4 + " currentState = " + this.currentState);
                if (f4 >= abl.w() || window == null) {
                    if ("FULL_SCREEN".equals(this.currentState) && window != null) {
                        this.currentState = "HALF_SCREEN";
                        int i6 = gxv.f(getContext()).x;
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.width = i6 / 2;
                        iihVar.a("stdPopTag", "onLayout Half Screen width = " + i6);
                        window.setAttributes(attributes);
                        return;
                    }
                } else if ("HALF_SCREEN".equals(this.currentState)) {
                    this.currentState = "FULL_SCREEN";
                    WindowManager.LayoutParams attributes2 = window.getAttributes();
                    attributes2.width = -1;
                    window.setAttributes(attributes2);
                    Activity currentActivity2 = activityGroup.getLocalActivityManager().getCurrentActivity();
                    if (!(currentActivity2 == null || currentActivity2.getWindow() == null)) {
                        currentActivity2.getWindow().getAttributes().width = gxv.f(getContext()).x;
                    }
                    iihVar.a("stdPopTag", "onLayout change width to match parent");
                    return;
                }
            }
            this.mWindowHeight = measuredHeight;
            this.mWindowWidth = measuredWidth;
            adjustWrapperHeight(true);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a
    public void changeSize(float f2, float f3, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d485c7fc", new Object[]{this, new Float(f2), new Float(f3), new Boolean(z)});
            return;
        }
        h9 h9Var = this.mParams;
        if (h9Var != null) {
            this.mPopConfig = h9Var.f20479a;
        }
        e9 e9Var = this.mPopConfig;
        if (e9Var != null && this.mContentWrapper != null && this.mPopRender != null) {
            boolean f0 = e9Var.f0();
            if (f3 == -2.0f || f2 == -2.0f) {
                this.mPopConfig.x0(true);
                i2 = 10000;
                i3 = 10000;
                f0 = true;
            } else {
                i2 = (f3 <= 0.0f || f3 > 1.0f) ? this.mPopConfig.Q() : (int) (f3 * 10000.0f);
                i3 = (f2 <= 0.0f || f2 > 1.0f) ? this.mPopConfig.R() : (int) (f2 * 10000.0f);
                this.mPopConfig.x0(false);
            }
            if (!z || f0) {
                callbackLifeCycle(IAKPopRender.LifecycleType.CHANGE_SIZE_START, null);
                this.mPopConfig.A0(i2);
                this.mPopConfig.y0(i2);
                adjustWrapperHeight(true);
                callbackLifeCycle(IAKPopRender.LifecycleType.CHANGE_SIZE_END, null);
                return;
            }
            callbackLifeCycle(IAKPopRender.LifecycleType.CHANGE_SIZE_START, null);
            ValueAnimator valueAnimator = new ValueAnimator();
            if (this.mContentWrapper.getTranslationY() != 0.0f) {
                i4 = this.mPopConfig.S();
            } else {
                i4 = this.mPopConfig.Q();
            }
            PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("h", i4, i2);
            if (this.mContentWrapper.getTranslationX() != 0.0f) {
                i5 = this.mPopConfig.T();
            } else {
                i5 = this.mPopConfig.R();
            }
            valueAnimator.setValues(ofInt, PropertyValuesHolder.ofInt("w", i5, i3));
            valueAnimator.setDuration(250L);
            valueAnimator.addUpdateListener(new j());
            valueAnimator.addListener(new k());
            valueAnimator.start();
        }
    }
}
