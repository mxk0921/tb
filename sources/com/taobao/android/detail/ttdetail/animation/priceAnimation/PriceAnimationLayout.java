package com.taobao.android.detail.ttdetail.animation.priceAnimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.widget.TTAnimationTextView;
import com.taobao.android.dinamicx.DinamicXEngine;
import kotlin.Metadata;
import tb.a07;
import tb.bq6;
import tb.ckf;
import tb.e3z;
import tb.eo7;
import tb.ftz;
import tb.gbv;
import tb.k7z;
import tb.pb6;
import tb.rsq;
import tb.t2o;
import tb.tgh;
import tb.vaj;
import tb.vbl;
import tb.vbn;
import tb.viq;
import tb.xbn;
import tb.xhv;
import tb.ze7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002KLB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010 \u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\nJ\u000f\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\nJ\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\nJ%\u0010+\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b+\u0010\u0011J\u000f\u0010,\u001a\u00020\bH\u0014¢\u0006\u0004\b,\u0010\nJ\u000f\u0010-\u001a\u00020\bH\u0014¢\u0006\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010@\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u00109R\u0016\u0010A\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u00109R\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/taobao/android/detail/ttdetail/animation/priceAnimation/PriceAnimationLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Ltb/ze7;", "detailContext", "<init>", "(Landroid/content/Context;Ltb/ze7;)V", "Ltb/xhv;", "clearAllState", "()V", "Lcom/alibaba/fastjson/JSONObject;", "content", "uiConfig", "", "source", "onRenderViewInternal", "(Lcom/alibaba/fastjson/JSONObject;Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;)V", "Lcom/taobao/android/detail/ttdetail/animation/priceAnimation/PriceAnimationLayout$b;", "lastPriceParams", "priceParams", "", "enableAnim", "(Lcom/taobao/android/detail/ttdetail/animation/priceAnimation/PriceAnimationLayout$b;Lcom/taobao/android/detail/ttdetail/animation/priceAnimation/PriceAnimationLayout$b;)Z", "isInit", "()Z", "initLayout", "(Lcom/taobao/android/detail/ttdetail/animation/priceAnimation/PriceAnimationLayout$b;)V", "updateLayout", "", "marginSum", "safeWidth", "isHideSuffixView", "(ZII)Z", "start", "", "priceAnimationDuration", "Landroid/animation/AnimatorSet;", "initPriceAnimation", "(J)Landroid/animation/AnimatorSet;", "finish", "onAttachedToWindowInternal", "onDetachedToWindowInternal", "onRenderView", "onAttachedToWindow", "onDetachedFromWindow", "mDetailContext", "Ltb/ze7;", "mSource", "Ljava/lang/String;", "Landroid/widget/FrameLayout;", "mPrefixLayout", "Landroid/widget/FrameLayout;", "mPriceLayout", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "mNewPrefixView", "Landroid/widget/TextView;", "mOldPrefixView", "mSignalView", "Lcom/taobao/android/detail/ttdetail/widget/TTAnimationTextView;", "mIntegerView", "Lcom/taobao/android/detail/ttdetail/widget/TTAnimationTextView;", "mDecimalView", "mPriceTail", "mSuffixView", "", "mOldPrefixWidth", UTConstant.Args.UT_SUCCESS_F, "mNewPrefixWidth", "Z", "Ljava/lang/Runnable;", "mUpdateRunnable", "Ljava/lang/Runnable;", "Companion", "a", TplMsg.VALUE_T_NATIVE_RETURN, "tt-detail_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class PriceAnimationLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ANIMATION_DECIMAL_KEY = "decimal";
    private static final long ANIMATION_DURATION_CHAR = 300;
    private static final long ANIMATION_DURATION_LONG = 1000;
    private static final long ANIMATION_DURATION_MEDIUM = 700;
    private static final long ANIMATION_DURATION_NORMAL = 500;
    private static final long ANIMATION_DURATION_SHORT = 300;
    private static final String ANIMATION_INTEGER_KEY = "integer";
    private static final long ANIMATION_INTERVAL_DEFAULT = 60;
    public static final a Companion = new a(null);
    private static final String KEY_DEFAULT = "default";
    public static final String TAG = "PriceAnimationLayout";
    private boolean isHideSuffixView;
    private TTAnimationTextView mDecimalView;
    private final ze7 mDetailContext;
    private TTAnimationTextView mIntegerView;
    private TextView mNewPrefixView;
    private float mNewPrefixWidth;
    private TextView mOldPrefixView;
    private float mOldPrefixWidth;
    private FrameLayout mPrefixLayout;
    private LinearLayout mPriceLayout;
    private TextView mPriceTail;
    private TextView mSignalView;
    private String mSource;
    private TextView mSuffixView;
    private Runnable mUpdateRunnable;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261235);
        }

        public a() {
        }

        public final View a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("8cf156f5", new Object[]{this, context});
            }
            ckf.h(context, "context");
            if (context instanceof TTDetailBaseActivity) {
                TTDetailBaseActivity tTDetailBaseActivity = (TTDetailBaseActivity) context;
                if (tTDetailBaseActivity.q3() != null) {
                    ze7 q3 = tTDetailBaseActivity.q3();
                    ckf.c(q3, "context.detailContext");
                    return new PriceAnimationLayout(context, q3, null);
                }
                throw new IllegalAccessException("context.detailContext must not be null");
            }
            throw new IllegalAccessException("context must be TTDetailBaseActivity");
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DinamicXEngine b;
        public final /* synthetic */ b c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public c(DinamicXEngine dinamicXEngine, b bVar, int i, int i2) {
            this.b = dinamicXEngine;
            this.c = bVar;
            this.d = i;
            this.e = i2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            PriceAnimationLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int height = PriceAnimationLayout.this.getHeight();
            int d = pb6.d(this.b, PriceAnimationLayout.this.getContext(), 1.0f);
            PriceAnimationLayout.this.setClipBounds(new Rect(0, (height - pb6.d(this.b, PriceAnimationLayout.this.getContext(), this.c.l())) + (d * 2), PriceAnimationLayout.this.getWidth(), height - d));
            if (PriceAnimationLayout.access$isHideSuffixView(PriceAnimationLayout.this, true, this.d, this.e)) {
                PriceAnimationLayout.access$getMSuffixView$p(PriceAnimationLayout.this).setVisibility(4);
                PriceAnimationLayout.access$setHideSuffixView$p(PriceAnimationLayout.this, true);
                return;
            }
            PriceAnimationLayout.access$getMSuffixView$p(PriceAnimationLayout.this).setVisibility(0);
            PriceAnimationLayout.access$setHideSuffixView$p(PriceAnimationLayout.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(long j) {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/animation/priceAnimation/PriceAnimationLayout$initPriceAnimation$$inlined$apply$lambda$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            PriceAnimationLayout.access$finish(PriceAnimationLayout.this);
            tgh.b(PriceAnimationLayout.TAG, "initPriceAnimation finish ");
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ String d;

        public e(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            this.b = jSONObject;
            this.c = jSONObject2;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PriceAnimationLayout.access$onRenderViewInternal(PriceAnimationLayout.this, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ b b;

        public f(b bVar) {
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PriceAnimationLayout.access$updateLayout(PriceAnimationLayout.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class g implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public g(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            PriceAnimationLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (PriceAnimationLayout.access$isHideSuffixView(PriceAnimationLayout.this, false, this.b, this.c)) {
                PriceAnimationLayout.access$getMSuffixView$p(PriceAnimationLayout.this).setVisibility(4);
                PriceAnimationLayout.access$setHideSuffixView$p(PriceAnimationLayout.this, true);
                return;
            }
            PriceAnimationLayout.access$setHideSuffixView$p(PriceAnimationLayout.this, false);
        }
    }

    static {
        t2o.a(912261234);
    }

    public /* synthetic */ PriceAnimationLayout(Context context, ze7 ze7Var, a07 a07Var) {
        this(context, ze7Var);
    }

    public static final /* synthetic */ void access$finish(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b3bd2ee", new Object[]{priceAnimationLayout});
        } else {
            priceAnimationLayout.finish();
        }
    }

    public static final /* synthetic */ TTAnimationTextView access$getMDecimalView$p(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTAnimationTextView) ipChange.ipc$dispatch("8910eab9", new Object[]{priceAnimationLayout});
        }
        TTAnimationTextView tTAnimationTextView = priceAnimationLayout.mDecimalView;
        if (tTAnimationTextView != null) {
            return tTAnimationTextView;
        }
        ckf.y("mDecimalView");
        throw null;
    }

    public static final /* synthetic */ TTAnimationTextView access$getMIntegerView$p(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTAnimationTextView) ipChange.ipc$dispatch("5a1fca66", new Object[]{priceAnimationLayout});
        }
        TTAnimationTextView tTAnimationTextView = priceAnimationLayout.mIntegerView;
        if (tTAnimationTextView != null) {
            return tTAnimationTextView;
        }
        ckf.y("mIntegerView");
        throw null;
    }

    public static final /* synthetic */ TextView access$getMOldPrefixView$p(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("40c600c2", new Object[]{priceAnimationLayout});
        }
        TextView textView = priceAnimationLayout.mOldPrefixView;
        if (textView != null) {
            return textView;
        }
        ckf.y("mOldPrefixView");
        throw null;
    }

    public static final /* synthetic */ FrameLayout access$getMPrefixLayout$p(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5ae2d7f", new Object[]{priceAnimationLayout});
        }
        FrameLayout frameLayout = priceAnimationLayout.mPrefixLayout;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("mPrefixLayout");
        throw null;
    }

    public static final /* synthetic */ LinearLayout access$getMPriceLayout$p(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("f9d1b85a", new Object[]{priceAnimationLayout});
        }
        LinearLayout linearLayout = priceAnimationLayout.mPriceLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        ckf.y("mPriceLayout");
        throw null;
    }

    public static final /* synthetic */ TextView access$getMPriceTail$p(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a60b729d", new Object[]{priceAnimationLayout});
        }
        TextView textView = priceAnimationLayout.mPriceTail;
        if (textView != null) {
            return textView;
        }
        ckf.y("mPriceTail");
        throw null;
    }

    public static final /* synthetic */ TextView access$getMSignalView$p(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("25d4c65f", new Object[]{priceAnimationLayout});
        }
        TextView textView = priceAnimationLayout.mSignalView;
        if (textView != null) {
            return textView;
        }
        ckf.y("mSignalView");
        throw null;
    }

    public static final /* synthetic */ TextView access$getMSuffixView$p(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("8782b488", new Object[]{priceAnimationLayout});
        }
        TextView textView = priceAnimationLayout.mSuffixView;
        if (textView != null) {
            return textView;
        }
        ckf.y("mSuffixView");
        throw null;
    }

    public static final /* synthetic */ boolean access$isHideSuffixView(PriceAnimationLayout priceAnimationLayout, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b4e67bb", new Object[]{priceAnimationLayout, new Boolean(z), new Integer(i), new Integer(i2)})).booleanValue();
        }
        return priceAnimationLayout.isHideSuffixView(z, i, i2);
    }

    public static final /* synthetic */ boolean access$isHideSuffixView$p(PriceAnimationLayout priceAnimationLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdebb8ad", new Object[]{priceAnimationLayout})).booleanValue();
        }
        return priceAnimationLayout.isHideSuffixView;
    }

    public static final /* synthetic */ void access$onRenderViewInternal(PriceAnimationLayout priceAnimationLayout, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edec139c", new Object[]{priceAnimationLayout, jSONObject, jSONObject2, str});
        } else {
            priceAnimationLayout.onRenderViewInternal(jSONObject, jSONObject2, str);
        }
    }

    public static final /* synthetic */ void access$setHideSuffixView$p(PriceAnimationLayout priceAnimationLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebfa793", new Object[]{priceAnimationLayout, new Boolean(z)});
        } else {
            priceAnimationLayout.isHideSuffixView = z;
        }
    }

    public static final /* synthetic */ void access$setMDecimalView$p(PriceAnimationLayout priceAnimationLayout, TTAnimationTextView tTAnimationTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e40f31", new Object[]{priceAnimationLayout, tTAnimationTextView});
        } else {
            priceAnimationLayout.mDecimalView = tTAnimationTextView;
        }
    }

    public static final /* synthetic */ void access$setMIntegerView$p(PriceAnimationLayout priceAnimationLayout, TTAnimationTextView tTAnimationTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b12524", new Object[]{priceAnimationLayout, tTAnimationTextView});
        } else {
            priceAnimationLayout.mIntegerView = tTAnimationTextView;
        }
    }

    public static final /* synthetic */ void access$setMOldPrefixView$p(PriceAnimationLayout priceAnimationLayout, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f20d92a", new Object[]{priceAnimationLayout, textView});
        } else {
            priceAnimationLayout.mOldPrefixView = textView;
        }
    }

    public static final /* synthetic */ void access$setMPrefixLayout$p(PriceAnimationLayout priceAnimationLayout, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef54811", new Object[]{priceAnimationLayout, frameLayout});
        } else {
            priceAnimationLayout.mPrefixLayout = frameLayout;
        }
    }

    public static final /* synthetic */ void access$setMPriceLayout$p(PriceAnimationLayout priceAnimationLayout, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5bd6b8", new Object[]{priceAnimationLayout, linearLayout});
        } else {
            priceAnimationLayout.mPriceLayout = linearLayout;
        }
    }

    public static final /* synthetic */ void access$setMPriceTail$p(PriceAnimationLayout priceAnimationLayout, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276c7caf", new Object[]{priceAnimationLayout, textView});
        } else {
            priceAnimationLayout.mPriceTail = textView;
        }
    }

    public static final /* synthetic */ void access$setMSignalView$p(PriceAnimationLayout priceAnimationLayout, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f11d8c5", new Object[]{priceAnimationLayout, textView});
        } else {
            priceAnimationLayout.mSignalView = textView;
        }
    }

    public static final /* synthetic */ void access$setMSuffixView$p(PriceAnimationLayout priceAnimationLayout, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7321afbc", new Object[]{priceAnimationLayout, textView});
        } else {
            priceAnimationLayout.mSuffixView = textView;
        }
    }

    public static final /* synthetic */ void access$updateLayout(PriceAnimationLayout priceAnimationLayout, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc6d277", new Object[]{priceAnimationLayout, bVar});
        } else {
            priceAnimationLayout.updateLayout(bVar);
        }
    }

    private final void clearAllState() {
        String str;
        FrameLayout frameLayout;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68cb82e4", new Object[]{this});
            return;
        }
        this.mOldPrefixWidth = 0.0f;
        this.mNewPrefixWidth = 0.0f;
        if (!(this.mOldPrefixView == null || (frameLayout = this.mPrefixLayout) == null || (textView = this.mNewPrefixView) == null)) {
            if (frameLayout == null) {
                ckf.y("mPrefixLayout");
                throw null;
            } else if (frameLayout.indexOfChild(textView) >= 0) {
                FrameLayout frameLayout2 = this.mPrefixLayout;
                if (frameLayout2 != null) {
                    TextView textView2 = this.mOldPrefixView;
                    if (textView2 == null) {
                        ckf.y("mOldPrefixView");
                        throw null;
                    } else if (frameLayout2.indexOfChild(textView2) >= 0) {
                        FrameLayout frameLayout3 = this.mPrefixLayout;
                        if (frameLayout3 != null) {
                            TextView textView3 = this.mOldPrefixView;
                            if (textView3 != null) {
                                frameLayout3.removeView(textView3);
                                this.mOldPrefixView = textView;
                            } else {
                                ckf.y("mOldPrefixView");
                                throw null;
                            }
                        } else {
                            ckf.y("mPrefixLayout");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("mPrefixLayout");
                    throw null;
                }
            }
        }
        this.mNewPrefixView = null;
        LinearLayout linearLayout = this.mPriceLayout;
        if (linearLayout != null) {
            if (linearLayout != null) {
                linearLayout.setTranslationX(0.0f);
            } else {
                ckf.y("mPriceLayout");
                throw null;
            }
        }
        TextView textView4 = this.mPriceTail;
        if (textView4 != null) {
            if (textView4 != null) {
                textView4.setTranslationX(0.0f);
            } else {
                ckf.y("mPriceTail");
                throw null;
            }
        }
        TextView textView5 = this.mSuffixView;
        if (textView5 != null) {
            if (textView5 != null) {
                textView5.setTranslationX(0.0f);
            } else {
                ckf.y("mSuffixView");
                throw null;
            }
        }
        TTAnimationTextView tTAnimationTextView = this.mIntegerView;
        if (tTAnimationTextView != null) {
            if (tTAnimationTextView == null) {
                ckf.y("mIntegerView");
                throw null;
            } else if (tTAnimationTextView.isAnimating()) {
                TTAnimationTextView tTAnimationTextView2 = this.mIntegerView;
                if (tTAnimationTextView2 != null) {
                    tTAnimationTextView2.finish();
                } else {
                    ckf.y("mIntegerView");
                    throw null;
                }
            }
        }
        TTAnimationTextView tTAnimationTextView3 = this.mDecimalView;
        if (tTAnimationTextView3 != null) {
            if (tTAnimationTextView3 == null) {
                ckf.y("mDecimalView");
                throw null;
            } else if (tTAnimationTextView3.isAnimating()) {
                TTAnimationTextView tTAnimationTextView4 = this.mDecimalView;
                if (tTAnimationTextView4 != null) {
                    tTAnimationTextView4.finish();
                } else {
                    ckf.y("mDecimalView");
                    throw null;
                }
            }
        }
        TextView textView6 = this.mNewPrefixView;
        if (textView6 != null) {
            removeView(textView6);
        }
        Runnable runnable = this.mUpdateRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.mUpdateRunnable = null;
        xbn.a aVar = xbn.Companion;
        viq i = this.mDetailContext.i();
        if (i == null || (str = i.b()) == null) {
            str = "default";
        }
        Animator a2 = aVar.a(str, TAG + this.mSource);
        if (a2 != null) {
            a2.cancel();
        }
    }

    private final boolean enableAnim(b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4891c311", new Object[]{this, bVar, bVar2})).booleanValue();
        }
        if (bVar == null || !TextUtils.isEmpty(bVar.g()) || !TextUtils.isEmpty(bVar2.g()) || (TextUtils.equals(bVar.e(), bVar2.e()) && TextUtils.equals(bVar.c(), bVar2.c()) && TextUtils.equals(bVar.m(), bVar2.m()) && TextUtils.equals(bVar.k(), bVar2.k()))) {
            return false;
        }
        return true;
    }

    private final synchronized void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        TTAnimationTextView tTAnimationTextView = this.mIntegerView;
        if (tTAnimationTextView != null) {
            tTAnimationTextView.finish();
            TTAnimationTextView tTAnimationTextView2 = this.mDecimalView;
            if (tTAnimationTextView2 != null) {
                tTAnimationTextView2.finish();
                TextView textView = this.mSuffixView;
                if (textView != null) {
                    textView.setTranslationX(0.0f);
                    if (!this.isHideSuffixView) {
                        TextView textView2 = this.mSuffixView;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        } else {
                            ckf.y("mSuffixView");
                            throw null;
                        }
                    }
                    TextView textView3 = this.mPriceTail;
                    if (textView3 != null) {
                        textView3.setTranslationX(0.0f);
                        LinearLayout linearLayout = this.mPriceLayout;
                        if (linearLayout != null) {
                            linearLayout.setTranslationX(0.0f);
                            TextView textView4 = this.mNewPrefixView;
                            if (textView4 != null) {
                                FrameLayout frameLayout = this.mPrefixLayout;
                                if (frameLayout != null) {
                                    TextView textView5 = this.mOldPrefixView;
                                    if (textView5 != null) {
                                        frameLayout.removeView(textView5);
                                        this.mOldPrefixView = textView4;
                                    } else {
                                        ckf.y("mOldPrefixView");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("mPrefixLayout");
                                    throw null;
                                }
                            }
                            this.mNewPrefixView = null;
                            vbn.b(this.mDetailContext, false);
                            return;
                        }
                        ckf.y("mPriceLayout");
                        throw null;
                    }
                    ckf.y("mPriceTail");
                    throw null;
                }
                ckf.y("mSuffixView");
                throw null;
            }
            ckf.y("mDecimalView");
            throw null;
        }
        ckf.y("mIntegerView");
        throw null;
    }

    private final void initLayout(b bVar) {
        int i;
        String str;
        int i2;
        String str2;
        float f2;
        Typeface typeface;
        String str3;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f23b6a", new Object[]{this, bVar});
            return;
        }
        tgh.b(TAG, "initLayout start");
        clearAllState();
        setBaselineAligned(false);
        setClipChildren(false);
        eo7 g2 = this.mDetailContext.g();
        ckf.c(g2, "mDetailContext.dinamicXEngine");
        DinamicXEngine o = g2.o();
        if (getChildCount() > 0) {
            removeAllViews();
        }
        k7z k7zVar = k7z.INSTANCE;
        Typeface b2 = k7zVar.b("iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
        if (b2 == null) {
            Context context = getContext();
            ckf.c(context, "context");
            Context applicationContext = context.getApplicationContext();
            ckf.c(applicationContext, "context.applicationContext");
            b2 = k7zVar.d(applicationContext, "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
        }
        if (b2 == null) {
            b2 = Typeface.DEFAULT;
        }
        Typeface defaultFromStyle = Typeface.defaultFromStyle(1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.mPrefixLayout = frameLayout;
        frameLayout.setClipChildren(false);
        TextView textView = new TextView(getContext());
        textView.setText(bVar.m());
        textView.setTextSize(0, pb6.d(o, textView.getContext(), bVar.n()));
        textView.setTypeface(defaultFromStyle);
        textView.setTextColor(bVar.f());
        xhv xhvVar = xhv.INSTANCE;
        this.mOldPrefixView = textView;
        FrameLayout frameLayout2 = this.mPrefixLayout;
        if (frameLayout2 != null) {
            frameLayout2.addView(textView, new FrameLayout.LayoutParams(-2, -2));
            FrameLayout frameLayout3 = this.mPrefixLayout;
            if (frameLayout3 != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                layoutParams.bottomMargin = pb6.d(o, getContext(), 1.5f);
                if (!TextUtils.isEmpty(bVar.g())) {
                    i = 0;
                } else {
                    i = pb6.d(o, getContext(), 2.0f);
                }
                layoutParams.rightMargin = i;
                addView(frameLayout3, layoutParams);
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.mPriceLayout = linearLayout;
                linearLayout.setClipChildren(false);
                TextView textView2 = new TextView(getContext());
                String str4 = "";
                if (!TextUtils.isEmpty(bVar.g())) {
                    str = str4;
                } else {
                    str = bVar.o();
                }
                textView2.setText(str);
                textView2.setTextSize(0, pb6.d(o, textView2.getContext(), bVar.p()));
                textView2.setTextColor(bVar.f());
                textView2.setTypeface(b2);
                this.mSignalView = textView2;
                LinearLayout linearLayout2 = this.mPriceLayout;
                if (linearLayout2 != null) {
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    if (!TextUtils.isEmpty(bVar.g())) {
                        i2 = 0;
                    } else {
                        i2 = pb6.d(o, getContext(), 2.0f);
                    }
                    layoutParams2.rightMargin = i2;
                    linearLayout2.addView(textView2, layoutParams2);
                    viq i6 = this.mDetailContext.i();
                    if (i6 == null || (str2 = i6.b()) == null) {
                        str2 = "default";
                    }
                    Context context2 = getContext();
                    ckf.c(context2, "context");
                    TTAnimationTextView tTAnimationTextView = new TTAnimationTextView(context2, str2, "integer");
                    String g3 = bVar.g();
                    if (g3 == null) {
                        g3 = bVar.e();
                    }
                    if (g3 == null) {
                        g3 = bVar.k();
                    }
                    if (g3 == null) {
                        g3 = str4;
                    }
                    tTAnimationTextView.setText(g3);
                    if (!TextUtils.isEmpty(bVar.g())) {
                        f2 = bVar.h();
                    } else {
                        f2 = bVar.l();
                    }
                    tTAnimationTextView.setTextSize(0, pb6.d(o, tTAnimationTextView.getContext(), f2));
                    tTAnimationTextView.setTextColor(bVar.f());
                    tTAnimationTextView.setCharAnimationInterval(ANIMATION_INTERVAL_DEFAULT);
                    tTAnimationTextView.setCharAnimationDuration(300L);
                    if (!TextUtils.isEmpty(bVar.g())) {
                        typeface = defaultFromStyle;
                    } else {
                        typeface = b2;
                    }
                    tTAnimationTextView.setTypeface(typeface);
                    tTAnimationTextView.setPadding(1, 0, 0, 0);
                    this.mIntegerView = tTAnimationTextView;
                    LinearLayout linearLayout3 = this.mPriceLayout;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(tTAnimationTextView, new LinearLayout.LayoutParams(-2, -2));
                        Context context3 = getContext();
                        ckf.c(context3, "context");
                        TTAnimationTextView tTAnimationTextView2 = new TTAnimationTextView(context3, str2, ANIMATION_DECIMAL_KEY);
                        if (!TextUtils.isEmpty(bVar.g()) || (str3 = bVar.c()) == null) {
                            str3 = str4;
                        }
                        tTAnimationTextView2.setText(str3);
                        tTAnimationTextView2.setTextSize(0, pb6.d(o, tTAnimationTextView2.getContext(), bVar.d()));
                        tTAnimationTextView2.setTextColor(bVar.f());
                        tTAnimationTextView2.setCharAnimationInterval(ANIMATION_INTERVAL_DEFAULT);
                        tTAnimationTextView2.setCharAnimationDuration(300L);
                        tTAnimationTextView2.setTypeface(b2);
                        tTAnimationTextView2.setPadding(1, 0, 0, 0);
                        this.mDecimalView = tTAnimationTextView2;
                        LinearLayout linearLayout4 = this.mPriceLayout;
                        if (linearLayout4 != null) {
                            linearLayout4.addView(tTAnimationTextView2, new LinearLayout.LayoutParams(-2, -2));
                            LinearLayout linearLayout5 = this.mPriceLayout;
                            if (linearLayout5 != null) {
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams3.gravity = 80;
                                if (!TextUtils.isEmpty(bVar.g())) {
                                    i3 = pb6.d(o, getContext(), 1.5f);
                                } else {
                                    i3 = 0;
                                }
                                layoutParams3.bottomMargin = i3;
                                addView(linearLayout5, layoutParams3);
                                TextView textView3 = new TextView(getContext());
                                if (TextUtils.isEmpty(bVar.g())) {
                                    str4 = bVar.i();
                                }
                                textView3.setText(str4);
                                textView3.setTextSize(0, pb6.d(o, textView3.getContext(), bVar.j()));
                                textView3.setTextColor(bVar.f());
                                textView3.setTypeface(defaultFromStyle);
                                this.mPriceTail = textView3;
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                                if (bVar.i() != null) {
                                    i4 = pb6.d(o, getContext(), 2.0f);
                                } else {
                                    i4 = 0;
                                }
                                layoutParams4.leftMargin = i4;
                                layoutParams4.bottomMargin = pb6.d(o, getContext(), 1.0f);
                                layoutParams4.gravity = 80;
                                addView(textView3, layoutParams4);
                                TextView textView4 = new TextView(getContext());
                                ckf.c(o, gbv.PARAM_KEY_DX_ENGINE);
                                Context context4 = textView4.getContext();
                                ckf.c(context4, "context");
                                ckf.c(b2, "alibabaTypeface");
                                textView4.setText(bVar.t(o, context4, b2));
                                textView4.setMaxLines(1);
                                textView4.setBackground(null);
                                if (!TextUtils.isEmpty(bVar.a())) {
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setColor(Color.parseColor(bVar.a()));
                                    gradientDrawable.setCornerRadius(pb6.d(o, textView4.getContext(), bVar.b()));
                                    textView4.setBackground(gradientDrawable);
                                    textView4.setPadding(pb6.d(o, textView4.getContext(), 3.0f), -pb6.d(o, textView4.getContext(), 1.0f), pb6.d(o, textView4.getContext(), 3.0f), pb6.d(o, textView4.getContext(), 0.5f));
                                } else {
                                    textView4.setPadding(0, 0, 0, 0);
                                }
                                this.mSuffixView = textView4;
                                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams5.gravity = 80;
                                if (!TextUtils.isEmpty(bVar.a())) {
                                    if (TextUtils.equals(bVar.q(), "atmosphere")) {
                                        i5 = pb6.d(o, getContext(), 3.0f);
                                    } else {
                                        i5 = pb6.d(o, getContext(), 3.0f);
                                    }
                                } else if (TextUtils.equals(bVar.q(), "atmosphere")) {
                                    i5 = pb6.d(o, getContext(), 1.5f);
                                } else {
                                    i5 = pb6.d(o, getContext(), 1.5f);
                                }
                                layoutParams5.bottomMargin = i5;
                                layoutParams5.leftMargin = pb6.d(o, getContext(), 6.0f);
                                addView(textView4, layoutParams5);
                                getViewTreeObserver().addOnGlobalLayoutListener(new c(o, bVar, pb6.d(o, getContext(), 12.0f), pb6.d(o, getContext(), 6.0f)));
                                tgh.b(TAG, "initLayout end isHideSuffixView: " + this.isHideSuffixView + ' ');
                                return;
                            }
                            ckf.y("mPriceLayout");
                            throw null;
                        }
                        ckf.y("mPriceLayout");
                        throw null;
                    }
                    ckf.y("mPriceLayout");
                    throw null;
                }
                ckf.y("mPriceLayout");
                throw null;
            }
            ckf.y("mPrefixLayout");
            throw null;
        }
        ckf.y("mPrefixLayout");
        throw null;
    }

    public static /* synthetic */ Object ipc$super(PriceAnimationLayout priceAnimationLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/animation/priceAnimation/PriceAnimationLayout");
        }
    }

    private final boolean isHideSuffixView(boolean z, int i, int i2) {
        float f2;
        float f3;
        float f4;
        Float f5;
        float f6;
        float f7;
        String obj;
        float f8;
        String obj2;
        float f9;
        float f10;
        String obj3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90ce6dcf", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (getWidth() == 0) {
            return false;
        }
        TextView textView = this.mSignalView;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            String str6 = "";
            float f11 = 0.0f;
            if (paint != null) {
                TextView textView2 = this.mSignalView;
                if (textView2 != null) {
                    CharSequence text = textView2.getText();
                    if (text == null || (str5 = text.toString()) == null) {
                        str5 = str6;
                    }
                    f2 = paint.measureText(str5);
                } else {
                    ckf.y("mSignalView");
                    throw null;
                }
            } else {
                f2 = 0.0f;
            }
            TextView textView3 = this.mPriceTail;
            if (textView3 != null) {
                TextPaint paint2 = textView3.getPaint();
                if (paint2 != null) {
                    TextView textView4 = this.mPriceTail;
                    if (textView4 != null) {
                        CharSequence text2 = textView4.getText();
                        if (text2 == null || (str4 = text2.toString()) == null) {
                            str4 = str6;
                        }
                        f3 = paint2.measureText(str4);
                    } else {
                        ckf.y("mPriceTail");
                        throw null;
                    }
                } else {
                    f3 = 0.0f;
                }
                TextView textView5 = this.mSuffixView;
                if (textView5 != null) {
                    TextPaint paint3 = textView5.getPaint();
                    if (paint3 != null) {
                        TextView textView6 = this.mSuffixView;
                        if (textView6 != null) {
                            CharSequence text3 = textView6.getText();
                            if (text3 == null || (str3 = text3.toString()) == null) {
                                str3 = str6;
                            }
                            f4 = paint3.measureText(str3);
                        } else {
                            ckf.y("mSuffixView");
                            throw null;
                        }
                    } else {
                        f4 = 0.0f;
                    }
                    if (z) {
                        TTAnimationTextView tTAnimationTextView = this.mIntegerView;
                        if (tTAnimationTextView != null) {
                            TextPaint paint4 = tTAnimationTextView.getPaint();
                            if (paint4 != null) {
                                TTAnimationTextView tTAnimationTextView2 = this.mIntegerView;
                                if (tTAnimationTextView2 != null) {
                                    CharSequence text4 = tTAnimationTextView2.getText();
                                    if (text4 == null || (str2 = text4.toString()) == null) {
                                        str2 = str6;
                                    }
                                    f9 = paint4.measureText(str2);
                                } else {
                                    ckf.y("mIntegerView");
                                    throw null;
                                }
                            } else {
                                f9 = 0.0f;
                            }
                            TTAnimationTextView tTAnimationTextView3 = this.mDecimalView;
                            if (tTAnimationTextView3 != null) {
                                TextPaint paint5 = tTAnimationTextView3.getPaint();
                                if (paint5 != null) {
                                    TTAnimationTextView tTAnimationTextView4 = this.mDecimalView;
                                    if (tTAnimationTextView4 != null) {
                                        CharSequence text5 = tTAnimationTextView4.getText();
                                        if (text5 == null || (str = text5.toString()) == null) {
                                            str = str6;
                                        }
                                        f10 = paint5.measureText(str);
                                    } else {
                                        ckf.y("mDecimalView");
                                        throw null;
                                    }
                                } else {
                                    f10 = 0.0f;
                                }
                                TextView textView7 = this.mOldPrefixView;
                                if (textView7 != null) {
                                    TextPaint paint6 = textView7.getPaint();
                                    if (paint6 != null) {
                                        TextView textView8 = this.mOldPrefixView;
                                        if (textView8 != null) {
                                            CharSequence text6 = textView8.getText();
                                            if (!(text6 == null || (obj3 = text6.toString()) == null)) {
                                                str6 = obj3;
                                            }
                                            f11 = paint6.measureText(str6);
                                        } else {
                                            ckf.y("mOldPrefixView");
                                            throw null;
                                        }
                                    }
                                    if (f11 + f2 + f9 + f10 + f3 + f4 + i + i2 > getWidth()) {
                                        return true;
                                    }
                                } else {
                                    ckf.y("mOldPrefixView");
                                    throw null;
                                }
                            } else {
                                ckf.y("mDecimalView");
                                throw null;
                            }
                        } else {
                            ckf.y("mIntegerView");
                            throw null;
                        }
                    } else {
                        TextView textView9 = this.mNewPrefixView;
                        if (textView9 != null) {
                            TextPaint paint7 = textView9.getPaint();
                            if (paint7 != null) {
                                CharSequence text7 = textView9.getText();
                                if (!(text7 == null || (obj2 = text7.toString()) == null)) {
                                    str6 = obj2;
                                }
                                f8 = paint7.measureText(str6);
                            } else {
                                f8 = 0.0f;
                            }
                            f5 = Float.valueOf(f8);
                        } else {
                            TextView textView10 = this.mOldPrefixView;
                            if (textView10 != null) {
                                TextPaint paint8 = textView10.getPaint();
                                if (paint8 != null) {
                                    TextView textView11 = this.mOldPrefixView;
                                    if (textView11 != null) {
                                        CharSequence text8 = textView11.getText();
                                        if (!(text8 == null || (obj = text8.toString()) == null)) {
                                            str6 = obj;
                                        }
                                        f5 = Float.valueOf(paint8.measureText(str6));
                                    } else {
                                        ckf.y("mOldPrefixView");
                                        throw null;
                                    }
                                } else {
                                    f5 = null;
                                }
                            } else {
                                ckf.y("mOldPrefixView");
                                throw null;
                            }
                        }
                        if (f5 != null) {
                            f6 = f5.floatValue();
                        } else {
                            f6 = 0.0f;
                        }
                        TTAnimationTextView tTAnimationTextView5 = this.mIntegerView;
                        if (tTAnimationTextView5 != null) {
                            TextPaint paint9 = tTAnimationTextView5.getPaint();
                            if (paint9 != null) {
                                TTAnimationTextView tTAnimationTextView6 = this.mIntegerView;
                                if (tTAnimationTextView6 != null) {
                                    f7 = paint9.measureText(tTAnimationTextView6.getTargetText());
                                } else {
                                    ckf.y("mIntegerView");
                                    throw null;
                                }
                            } else {
                                f7 = 0.0f;
                            }
                            TTAnimationTextView tTAnimationTextView7 = this.mDecimalView;
                            if (tTAnimationTextView7 != null) {
                                TextPaint paint10 = tTAnimationTextView7.getPaint();
                                if (paint10 != null) {
                                    TTAnimationTextView tTAnimationTextView8 = this.mDecimalView;
                                    if (tTAnimationTextView8 != null) {
                                        f11 = paint10.measureText(tTAnimationTextView8.getTargetText());
                                    } else {
                                        ckf.y("mDecimalView");
                                        throw null;
                                    }
                                }
                                if (f6 + f2 + f7 + f11 + f3 + f4 + i + i2 > getWidth()) {
                                    return true;
                                }
                            } else {
                                ckf.y("mDecimalView");
                                throw null;
                            }
                        } else {
                            ckf.y("mIntegerView");
                            throw null;
                        }
                    }
                    return false;
                }
                ckf.y("mSuffixView");
                throw null;
            }
            ckf.y("mPriceTail");
            throw null;
        }
        ckf.y("mSignalView");
        throw null;
    }

    private final boolean isInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        if (this.mPrefixLayout == null || this.mPriceLayout == null || this.mOldPrefixView == null || this.mSignalView == null || this.mIntegerView == null || this.mDecimalView == null || this.mPriceTail == null || this.mSuffixView == null) {
            return false;
        }
        return true;
    }

    private final void onAttachedToWindowInternal() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97afd3f2", new Object[]{this});
            return;
        }
        xbn.a aVar = xbn.Companion;
        viq i = this.mDetailContext.i();
        if (i == null || (str = i.b()) == null) {
            str = "default";
        }
        Animator a2 = aVar.a(str, TAG + this.mSource);
        if (a2 != null) {
            a2.resume();
            tgh.b(TAG, "onAttachedToWindowInternal resume ");
        }
    }

    private final void onDetachedToWindowInternal() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62eec0", new Object[]{this});
            return;
        }
        xbn.a aVar = xbn.Companion;
        viq i = this.mDetailContext.i();
        if (i == null || (str = i.b()) == null) {
            str = "default";
        }
        Animator a2 = aVar.a(str, TAG + this.mSource);
        if (a2 != null) {
            a2.pause();
            tgh.b(TAG, "onDetachedToWindowInternal pause ");
        }
    }

    private final void onRenderViewInternal(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        bq6 e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b2348", new Object[]{this, jSONObject, jSONObject2, str});
            return;
        }
        tgh.b(TAG, "onRenderView start");
        this.mSource = str;
        String str2 = TAG + str;
        b bVar = null;
        try {
            viq i = this.mDetailContext.i();
            if (i != null) {
                bVar = (b) i.c(str2);
            }
        } catch (Exception e3) {
            tgh.c(TAG, "onRenderView", e3);
        }
        b bVar2 = new b(jSONObject, jSONObject2, str);
        if (!bVar2.r()) {
            boolean enableAnim = enableAnim(bVar, bVar2);
            boolean isInit = isInit();
            boolean s = bVar2.s(bVar);
            if (!enableAnim || !isInit) {
                if (!s || !isInit || !vbl.m1()) {
                    initLayout(bVar2);
                }
            } else if (vbn.a(this.mDetailContext)) {
                f fVar = new f(bVar2);
                this.mUpdateRunnable = fVar;
                postDelayed(fVar, 500L);
            } else {
                updateLayout(bVar2);
            }
            try {
                e2 = this.mDetailContext.e();
                ckf.c(e2, "mDetailContext.dataEngine");
            } catch (Exception e4) {
                tgh.c(TAG, "onRenderView store state err", e4);
            }
            if (!e2.o()) {
                viq i2 = this.mDetailContext.i();
                if (i2 != null) {
                    i2.f(str2, bVar2);
                }
                tgh.b(TAG, "onRenderView end enableAnim: " + enableAnim + " isInit: " + isInit + " isPriceParamsEqual: " + s);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        onAttachedToWindowInternal();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        onDetachedToWindowInternal();
    }

    public final void onRenderView(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a705216b", new Object[]{this, jSONObject, jSONObject2, str});
            return;
        }
        ckf.h(jSONObject, "content");
        ckf.h(jSONObject2, "uiConfig");
        ckf.h(str, "source");
        post(new e(jSONObject, jSONObject2, str));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final a Companion = new a(null);
        public static final String SOURCE_ATMOSPHERE = "atmosphere";
        public final String G;

        /* renamed from: a  reason: collision with root package name */
        public boolean f6674a;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public int b = -1;
        public int k = -1;
        public float r = 13.0f;
        public float s = 16.0f;
        public float t = 28.0f;
        public float u = 20.0f;
        public float v = 28.0f;
        public float w = 16.0f;
        public float x = 13.0f;
        public float y = 13.0f;
        public float z = 16.0f;
        public float A = 13.0f;
        public float B = 13.0f;
        public float C = 3.0f;
        public float D = 13.0f;
        public float E = 16.0f;
        public float F = 15.0f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class a {
            static {
                t2o.a(912261237);
            }

            public a() {
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }
        }

        static {
            t2o.a(912261236);
        }

        public b(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            ckf.h(jSONObject, "content");
            ckf.h(jSONObject2, "uiConfig");
            ckf.h(str, "source");
            this.G = str;
            u(jSONObject);
            v(jSONObject2);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("44d79e4a", new Object[]{this});
            }
            return this.j;
        }

        public final float b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("61aa4c12", new Object[]{this})).floatValue();
            }
            return this.C;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("21745b4e", new Object[]{this});
            }
            return this.h;
        }

        public final float d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dbe04da3", new Object[]{this})).floatValue();
            }
            return this.w;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4fefd381", new Object[]{this});
            }
            return this.g;
        }

        public final int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b2e80a", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public final String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8035c6bc", new Object[]{this});
            }
            return this.f;
        }

        public final float h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("954ee775", new Object[]{this})).floatValue();
            }
            return this.u;
        }

        public final String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("df2b7056", new Object[]{this});
            }
            return this.i;
        }

        public final float j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4423ab9b", new Object[]{this})).floatValue();
            }
            return this.x;
        }

        public final String k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5c477b99", new Object[]{this});
            }
            return this.c;
        }

        public final float l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8a278f78", new Object[]{this})).floatValue();
            }
            return this.t;
        }

        public final String m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("93c94594", new Object[]{this});
            }
            return this.d;
        }

        public final float n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6be299d", new Object[]{this})).floatValue();
            }
            return this.r;
        }

        public final String o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("639dd3a2", new Object[]{this});
            }
            return this.e;
        }

        public final float p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7d95dccf", new Object[]{this})).floatValue();
            }
            return this.s;
        }

        public final String q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
            }
            return this.G;
        }

        public final boolean r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            if (!TextUtils.isEmpty(this.f) || !TextUtils.isEmpty(this.g) || !TextUtils.isEmpty(this.h) || !TextUtils.isEmpty(this.c)) {
                return false;
            }
            return true;
        }

        public final boolean s(b bVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aeaa9b3e", new Object[]{this, bVar})).booleanValue();
            }
            if (bVar == null) {
                return false;
            }
            if (!(TextUtils.equals(this.c, bVar.c) && TextUtils.equals(this.d, bVar.d) && TextUtils.equals(this.e, bVar.e) && TextUtils.equals(this.f, bVar.f) && TextUtils.equals(this.i, bVar.i) && TextUtils.equals(this.g, bVar.g) && TextUtils.equals(this.h, bVar.h) && this.b == bVar.b && TextUtils.equals(this.l, bVar.l) && TextUtils.equals(this.m, bVar.m) && TextUtils.equals(this.n, bVar.n) && TextUtils.equals(this.o, bVar.o) && TextUtils.equals(this.p, bVar.p) && TextUtils.equals(this.q, bVar.q) && this.k == bVar.k && TextUtils.equals(this.j, bVar.j) && TextUtils.equals(this.G, bVar.G) && this.r == bVar.r && this.s == bVar.s && this.t == bVar.t && this.u == bVar.u && this.v == bVar.v && this.w == bVar.w && this.x == bVar.x && this.y == bVar.y && this.z == bVar.z && this.A == bVar.A && this.B == bVar.B && this.C == bVar.C && this.D == bVar.D && this.E == bVar.E && this.F == bVar.F)) {
                z = false;
            }
            return z;
        }

        public final void v(JSONObject jSONObject) {
            Float l;
            Float l2;
            Float l3;
            Float l4;
            Float l5;
            Float l6;
            Float l7;
            Float l8;
            Float l9;
            Float l10;
            Float l11;
            Float l12;
            Float l13;
            Float l14;
            Float l15;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3beb5640", new Object[]{this, jSONObject});
                return;
            }
            String string = jSONObject.getString("priceTitleSize");
            float f = 13.0f;
            this.r = (string == null || (l15 = rsq.l(string)) == null) ? 13.0f : l15.floatValue();
            String string2 = jSONObject.getString("priceUnitSize");
            float f2 = 16.0f;
            this.s = (string2 == null || (l14 = rsq.l(string2)) == null) ? 16.0f : l14.floatValue();
            String string3 = jSONObject.getString("priceTextSize");
            float f3 = 28.0f;
            this.t = (string3 == null || (l13 = rsq.l(string3)) == null) ? 28.0f : l13.floatValue();
            String string4 = jSONObject.getString("priceExpressSize");
            this.u = (string4 == null || (l12 = rsq.l(string4)) == null) ? 20.0f : l12.floatValue();
            String string5 = jSONObject.getString("humpIntegerSize");
            if (!(string5 == null || (l11 = rsq.l(string5)) == null)) {
                f3 = l11.floatValue();
            }
            this.v = f3;
            String string6 = jSONObject.getString("humpDecimalSize");
            this.w = (string6 == null || (l10 = rsq.l(string6)) == null) ? 16.0f : l10.floatValue();
            String string7 = jSONObject.getString("priceTailSize");
            this.x = (string7 == null || (l9 = rsq.l(string7)) == null) ? 13.0f : l9.floatValue();
            String string8 = jSONObject.getString("extraPriceTitleSize");
            this.y = (string8 == null || (l8 = rsq.l(string8)) == null) ? 13.0f : l8.floatValue();
            String string9 = jSONObject.getString("extraPriceUnitSize");
            this.z = (string9 == null || (l7 = rsq.l(string9)) == null) ? 16.0f : l7.floatValue();
            String string10 = jSONObject.getString("extraPriceTailSize");
            this.B = (string10 == null || (l6 = rsq.l(string10)) == null) ? 13.0f : l6.floatValue();
            String string11 = jSONObject.getString("extraPriceTextSize");
            this.A = (string11 == null || (l5 = rsq.l(string11)) == null) ? 13.0f : l5.floatValue();
            String string12 = jSONObject.getString("extraPriceBgCornerRadius");
            this.C = (string12 == null || (l4 = rsq.l(string12)) == null) ? 3.0f : l4.floatValue();
            String string13 = jSONObject.getString("extraPriceBgSize");
            if (!(string13 == null || (l3 = rsq.l(string13)) == null)) {
                f = l3.floatValue();
            }
            this.D = f;
            String string14 = jSONObject.getString("extraPriceBgUnitSize");
            if (!(string14 == null || (l2 = rsq.l(string14)) == null)) {
                f2 = l2.floatValue();
            }
            this.E = f2;
            String string15 = jSONObject.getString("extraPriceBgTextSize");
            this.F = (string15 == null || (l = rsq.l(string15)) == null) ? 15.0f : l.floatValue();
        }

        public final void u(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77a4a2b3", new Object[]{this, jSONObject});
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("price");
            int i = -1;
            String str = null;
            if (jSONObject2 != null) {
                String string = jSONObject2.getString("priceColor");
                this.b = string != null ? Color.parseColor(string) : -1;
                this.c = jSONObject2.getString("priceText");
                this.d = jSONObject2.getString("priceTitle");
                this.e = jSONObject2.getString("priceUnit");
                this.f = jSONObject2.getString("priceExpress");
                this.i = jSONObject2.getString("priceTail");
                JSONArray jSONArray = jSONObject2.getJSONArray("priceViews");
                if (jSONArray != null) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(0);
                    this.g = jSONObject3 != null ? jSONObject3.getString("humpInteger") : null;
                    JSONObject jSONObject4 = jSONArray.getJSONObject(0);
                    this.h = jSONObject4 != null ? jSONObject4.getString("humpDecimal") : null;
                }
            }
            JSONObject jSONObject5 = jSONObject.getJSONObject("extraPrice");
            if (jSONObject5 != null) {
                this.f6674a = true;
                this.j = jSONObject5.getString(vaj.KEY_BG_COLOR);
                String string2 = jSONObject5.getString("priceColor");
                if (string2 != null) {
                    i = Color.parseColor(string2);
                }
                this.k = i;
                this.l = jSONObject5.getString("priceText");
                this.m = jSONObject5.getString("priceTitle");
                this.n = jSONObject5.getString("priceUnit");
                this.o = jSONObject5.getString("priceTail");
                JSONArray jSONArray2 = jSONObject5.getJSONArray("priceViews");
                if (jSONArray2 != null) {
                    JSONObject jSONObject6 = jSONArray2.getJSONObject(0);
                    this.p = jSONObject6 != null ? jSONObject6.getString("humpInteger") : null;
                    JSONObject jSONObject7 = jSONArray2.getJSONObject(0);
                    if (jSONObject7 != null) {
                        str = jSONObject7.getString("humpDecimal");
                    }
                    this.q = str;
                }
            }
        }

        public final SpannableStringBuilder t(DinamicXEngine dinamicXEngine, Context context, Typeface typeface) {
            Typeface typeface2;
            int d;
            int d2;
            int d3;
            int d4;
            String str;
            Typeface typeface3;
            int i;
            String str2;
            String str3;
            String str4;
            String str5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpannableStringBuilder) ipChange.ipc$dispatch("2825812e", new Object[]{this, dinamicXEngine, context, typeface});
            }
            ckf.h(dinamicXEngine, gbv.PARAM_KEY_DX_ENGINE);
            ckf.h(context, "context");
            ckf.h(typeface, "typeface");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.equals(this.G, "atmosphere") || !TextUtils.isEmpty(this.j)) {
                typeface2 = Typeface.DEFAULT_BOLD;
            } else {
                typeface2 = Typeface.DEFAULT;
            }
            if (!this.f6674a) {
                return spannableStringBuilder;
            }
            if (!TextUtils.isEmpty(this.j)) {
                d = pb6.d(dinamicXEngine, context, this.D);
                d2 = pb6.d(dinamicXEngine, context, this.E);
                d3 = pb6.d(dinamicXEngine, context, this.F);
                d4 = pb6.d(dinamicXEngine, context, this.D);
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.setSpan(new ftz(pb6.d(dinamicXEngine, context, 7.0f), this.k, pb6.d(dinamicXEngine, context, 1.5f), pb6.d(dinamicXEngine, context, this.y)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                d = pb6.d(dinamicXEngine, context, this.y);
                d2 = pb6.d(dinamicXEngine, context, this.z);
                d3 = pb6.d(dinamicXEngine, context, this.A);
                d4 = pb6.d(dinamicXEngine, context, this.B);
            }
            if (!TextUtils.isEmpty(this.m) && (str5 = this.m) != null) {
                spannableStringBuilder.append((CharSequence) str5);
                ckf.c(typeface2, "normalTypeface");
                spannableStringBuilder.setSpan(new e3z(typeface2, this.k, d, 0, 0), spannableStringBuilder.length() - str5.length(), spannableStringBuilder.length(), 33);
            }
            if (TextUtils.isEmpty(this.n) || (str4 = this.n) == null) {
                str = "normalTypeface";
                typeface3 = typeface2;
                i = 33;
            } else {
                spannableStringBuilder.append((CharSequence) str4);
                str = "normalTypeface";
                i = 33;
                typeface3 = typeface2;
                spannableStringBuilder.setSpan(new e3z(typeface, this.k, d2, 0, pb6.d(dinamicXEngine, context, 1.0f)), spannableStringBuilder.length() - str4.length(), spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(this.l) || !TextUtils.isEmpty(this.p)) {
                if (!TextUtils.isEmpty(this.p)) {
                    String str6 = this.p;
                    String str7 = this.q;
                    if (str7 == null) {
                        str7 = "";
                    }
                    str3 = ckf.p(str6, str7);
                } else {
                    str3 = this.l;
                }
                if (str3 != null) {
                    spannableStringBuilder.append((CharSequence) str3);
                    spannableStringBuilder.setSpan(new e3z(typeface, this.k, d3, 0, pb6.d(dinamicXEngine, context, 1.0f)), spannableStringBuilder.length() - str3.length(), spannableStringBuilder.length(), i);
                }
            }
            if (!TextUtils.isEmpty(this.o) && (str2 = this.o) != null) {
                spannableStringBuilder.append((CharSequence) str2);
                ckf.c(typeface3, str);
                spannableStringBuilder.setSpan(new e3z(typeface3, this.k, d4, pb6.d(dinamicXEngine, context, 2.0f), 0), spannableStringBuilder.length() - str2.length(), spannableStringBuilder.length(), 33);
            }
            tgh.b(PriceAnimationLayout.TAG, "mergeExtraPriceToRichText: " + ((Object) spannableStringBuilder));
            return spannableStringBuilder;
        }
    }

    private PriceAnimationLayout(Context context, ze7 ze7Var) {
        super(context);
        this.mDetailContext = ze7Var;
        this.mSource = "";
    }

    private final void start() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        TTAnimationTextView tTAnimationTextView = this.mIntegerView;
        if (tTAnimationTextView != null) {
            long animationDuration = tTAnimationTextView.getAnimationDuration();
            TTAnimationTextView tTAnimationTextView2 = this.mIntegerView;
            if (tTAnimationTextView2 != null) {
                TTAnimationTextView.start$default(tTAnimationTextView2, 0L, 1, null);
                tgh.b(TAG, "start IntegerAnim ");
                TTAnimationTextView tTAnimationTextView3 = this.mDecimalView;
                if (tTAnimationTextView3 != null) {
                    if (tTAnimationTextView3.isAnimAble()) {
                        TTAnimationTextView tTAnimationTextView4 = this.mIntegerView;
                        if (tTAnimationTextView4 != null) {
                            int diff = tTAnimationTextView4.getDiff();
                            TTAnimationTextView tTAnimationTextView5 = this.mIntegerView;
                            if (tTAnimationTextView5 != null) {
                                int length = tTAnimationTextView5.length();
                                if (diff < 0) {
                                    length += diff;
                                }
                                long j = length * ANIMATION_INTERVAL_DEFAULT;
                                TTAnimationTextView tTAnimationTextView6 = this.mDecimalView;
                                if (tTAnimationTextView6 != null) {
                                    animationDuration = tTAnimationTextView6.getAnimationDuration() + j;
                                    TTAnimationTextView tTAnimationTextView7 = this.mDecimalView;
                                    if (tTAnimationTextView7 != null) {
                                        tTAnimationTextView7.start(j);
                                        tgh.b(TAG, "start decimalStartDelay: " + j + ' ');
                                    } else {
                                        ckf.y("mDecimalView");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("mDecimalView");
                                    throw null;
                                }
                            } else {
                                ckf.y("mIntegerView");
                                throw null;
                            }
                        } else {
                            ckf.y("mIntegerView");
                            throw null;
                        }
                    }
                    AnimatorSet initPriceAnimation = initPriceAnimation(animationDuration);
                    xbn.a aVar = xbn.Companion;
                    viq i = this.mDetailContext.i();
                    if (i == null || (str = i.b()) == null) {
                        str = "default";
                    }
                    aVar.d(str, TAG + this.mSource, initPriceAnimation);
                    return;
                }
                ckf.y("mDecimalView");
                throw null;
            }
            ckf.y("mIntegerView");
            throw null;
        }
        ckf.y("mIntegerView");
        throw null;
    }

    private final void updateLayout(b bVar) {
        float f2;
        int i;
        String c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191eda23", new Object[]{this, bVar});
            return;
        }
        tgh.b(TAG, "updateLayout start");
        clearAllState();
        eo7 g2 = this.mDetailContext.g();
        ckf.c(g2, "mDetailContext.dinamicXEngine");
        DinamicXEngine o = g2.o();
        k7z k7zVar = k7z.INSTANCE;
        Typeface b2 = k7zVar.b("iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
        if (b2 == null) {
            Context context = getContext();
            ckf.c(context, "context");
            Context applicationContext = context.getApplicationContext();
            ckf.c(applicationContext, "context.applicationContext");
            b2 = k7zVar.d(applicationContext, "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
        }
        if (b2 == null) {
            b2 = Typeface.DEFAULT;
        }
        Typeface defaultFromStyle = Typeface.defaultFromStyle(1);
        String m = bVar.m();
        TextView textView = this.mOldPrefixView;
        if (textView != null) {
            if (!TextUtils.equals(m, textView.getText())) {
                TextView textView2 = new TextView(getContext());
                textView2.setText(bVar.m());
                textView2.setTextSize(0, pb6.d(o, textView2.getContext(), bVar.n()));
                textView2.setTextColor(bVar.f());
                textView2.setTypeface(defaultFromStyle);
                this.mNewPrefixView = textView2;
            }
            TextView textView3 = this.mSignalView;
            if (textView3 != null) {
                String str = "";
                textView3.setText(!TextUtils.isEmpty(bVar.g()) ? str : bVar.o());
                textView3.setTextColor(bVar.f());
                textView3.setTextSize(0, pb6.d(o, textView3.getContext(), bVar.p()));
                TTAnimationTextView tTAnimationTextView = this.mIntegerView;
                if (tTAnimationTextView != null) {
                    String g3 = bVar.g();
                    if (g3 == null) {
                        g3 = bVar.e();
                    }
                    if (g3 == null) {
                        g3 = bVar.k();
                    }
                    if (g3 == null) {
                        g3 = str;
                    }
                    tTAnimationTextView.setTargetText(g3);
                    if (!TextUtils.isEmpty(bVar.g())) {
                        f2 = bVar.h();
                    } else {
                        f2 = bVar.l();
                    }
                    tTAnimationTextView.setTextSize(0, pb6.d(o, tTAnimationTextView.getContext(), f2));
                    tTAnimationTextView.setTextColor(bVar.f());
                    if (TextUtils.isEmpty(bVar.g())) {
                        defaultFromStyle = b2;
                    }
                    tTAnimationTextView.setTypeface(defaultFromStyle);
                    tTAnimationTextView.init();
                    TTAnimationTextView tTAnimationTextView2 = this.mDecimalView;
                    if (tTAnimationTextView2 != null) {
                        if (TextUtils.isEmpty(bVar.g()) && (c2 = bVar.c()) != null) {
                            str = c2;
                        }
                        tTAnimationTextView2.setTargetText(str);
                        tTAnimationTextView2.setTextColor(bVar.f());
                        tTAnimationTextView2.setTextSize(0, pb6.d(o, tTAnimationTextView2.getContext(), bVar.d()));
                        TTAnimationTextView tTAnimationTextView3 = this.mIntegerView;
                        if (tTAnimationTextView3 != null) {
                            tTAnimationTextView2.setOffsetX(tTAnimationTextView3.getOffsetX());
                            TTAnimationTextView tTAnimationTextView4 = this.mIntegerView;
                            if (tTAnimationTextView4 != null) {
                                tTAnimationTextView2.setPreDiff(tTAnimationTextView4.getDiff());
                                tTAnimationTextView2.init();
                                TextView textView4 = this.mPriceTail;
                                if (textView4 != null) {
                                    textView4.setText(bVar.i());
                                    textView4.setTextColor(bVar.f());
                                    textView4.setTextSize(0, pb6.d(o, textView4.getContext(), bVar.j()));
                                    ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
                                    if (layoutParams != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
                                        ((LinearLayout.LayoutParams) layoutParams).leftMargin = bVar.i() != null ? pb6.d(o, textView4.getContext(), 2.0f) : 0;
                                    }
                                    TextView textView5 = this.mSuffixView;
                                    if (textView5 != null) {
                                        ckf.c(o, gbv.PARAM_KEY_DX_ENGINE);
                                        Context context2 = textView5.getContext();
                                        ckf.c(context2, "context");
                                        ckf.c(b2, "alibabaTypeface");
                                        textView5.setText(bVar.t(o, context2, b2));
                                        textView5.setTextSize(0, pb6.d(o, textView5.getContext(), bVar.j()));
                                        textView5.setBackground(null);
                                        if (!TextUtils.isEmpty(bVar.a())) {
                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                            gradientDrawable.setShape(0);
                                            gradientDrawable.setColor(Color.parseColor(bVar.a()));
                                            gradientDrawable.setCornerRadius(pb6.d(o, textView5.getContext(), bVar.b()));
                                            textView5.setBackground(gradientDrawable);
                                            textView5.setPadding(pb6.d(o, textView5.getContext(), 3.0f), -pb6.d(o, textView5.getContext(), 1.0f), pb6.d(o, textView5.getContext(), 3.0f), pb6.d(o, textView5.getContext(), 0.5f));
                                        } else {
                                            textView5.setPadding(0, 0, 0, 0);
                                        }
                                        ViewGroup.LayoutParams layoutParams2 = textView5.getLayoutParams();
                                        if (layoutParams2 != null && (layoutParams2 instanceof LinearLayout.LayoutParams)) {
                                            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                                            if (!TextUtils.isEmpty(bVar.a())) {
                                                if (TextUtils.equals(bVar.q(), "atmosphere")) {
                                                    i = pb6.d(o, textView5.getContext(), 3.0f);
                                                } else {
                                                    i = pb6.d(o, textView5.getContext(), 3.0f);
                                                }
                                            } else if (TextUtils.equals(bVar.q(), "atmosphere")) {
                                                i = pb6.d(o, textView5.getContext(), 1.5f);
                                            } else {
                                                i = pb6.d(o, textView5.getContext(), 1.5f);
                                            }
                                            layoutParams3.bottomMargin = i;
                                        }
                                        getViewTreeObserver().addOnGlobalLayoutListener(new g(pb6.d(o, getContext(), 12.0f), pb6.d(o, getContext(), 6.0f)));
                                        start();
                                        tgh.b(TAG, "updateLayout end isHideSuffixView: " + this.isHideSuffixView + ' ');
                                        return;
                                    }
                                    ckf.y("mSuffixView");
                                    throw null;
                                }
                                ckf.y("mPriceTail");
                                throw null;
                            }
                            ckf.y("mIntegerView");
                            throw null;
                        }
                        ckf.y("mIntegerView");
                        throw null;
                    }
                    ckf.y("mDecimalView");
                    throw null;
                }
                ckf.y("mIntegerView");
                throw null;
            }
            ckf.y("mSignalView");
            throw null;
        }
        ckf.y("mOldPrefixView");
        throw null;
    }

    private final AnimatorSet initPriceAnimation(long j) {
        float f2;
        long j2;
        float f3;
        float f4;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("7ee51293", new Object[]{this, new Long(j)});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        TextView textView = this.mNewPrefixView;
        if (textView != null) {
            TextView textView2 = this.mOldPrefixView;
            if (textView2 != null) {
                TextPaint paint = textView2.getPaint();
                if (paint != null) {
                    TextView textView3 = this.mOldPrefixView;
                    if (textView3 != null) {
                        CharSequence text = textView3.getText();
                        if (text == null || (str2 = text.toString()) == null) {
                            str2 = "";
                        }
                        f3 = paint.measureText(str2);
                    } else {
                        ckf.y("mOldPrefixView");
                        throw null;
                    }
                } else {
                    f3 = 0.0f;
                }
                this.mOldPrefixWidth = f3;
                TextPaint paint2 = textView.getPaint();
                if (paint2 != null) {
                    CharSequence text2 = textView.getText();
                    if (text2 == null || (str = text2.toString()) == null) {
                        str = "";
                    }
                    f4 = paint2.measureText(str);
                } else {
                    f4 = 0.0f;
                }
                this.mNewPrefixWidth = f4;
                FrameLayout frameLayout = this.mPrefixLayout;
                if (frameLayout != null) {
                    frameLayout.removeView(textView);
                    FrameLayout frameLayout2 = this.mPrefixLayout;
                    if (frameLayout2 != null) {
                        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-2, -2));
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationX", -this.mNewPrefixWidth, 0.0f);
                        ofFloat.setDuration(700L);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        xhv xhvVar = xhv.INSTANCE;
                        TextView textView4 = this.mOldPrefixView;
                        if (textView4 != null) {
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView4, "alpha", 1.0f, 0.0f);
                            ofFloat2.setDuration(300L);
                            ofFloat2.setInterpolator(new DecelerateInterpolator());
                            animatorSet.playTogether(ofFloat, ofFloat2);
                        } else {
                            ckf.y("mOldPrefixView");
                            throw null;
                        }
                    } else {
                        ckf.y("mPrefixLayout");
                        throw null;
                    }
                } else {
                    ckf.y("mPrefixLayout");
                    throw null;
                }
            } else {
                ckf.y("mOldPrefixView");
                throw null;
            }
        }
        float f5 = this.mOldPrefixWidth - this.mNewPrefixWidth;
        if (f5 < 0) {
            f2 = 0.0f;
        } else {
            f2 = -f5;
            f5 = 0.0f;
        }
        TTAnimationTextView tTAnimationTextView = this.mIntegerView;
        if (tTAnimationTextView != null) {
            float offsetX = tTAnimationTextView.getOffsetX() + f2;
            TTAnimationTextView tTAnimationTextView2 = this.mDecimalView;
            if (tTAnimationTextView2 != null) {
                float offsetX2 = offsetX + tTAnimationTextView2.getOffsetX();
                boolean z = offsetX2 < f5;
                tgh.b(TAG, "initPriceAnimation startX: " + f5 + " endX: " + f2 + " fixEndX: " + offsetX2 + " delayFlag: " + z + ' ');
                LinearLayout linearLayout = this.mPriceLayout;
                if (linearLayout != null) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linearLayout, "translationX", f5, f2);
                    ofFloat3.setDuration(700L);
                    ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                    xhv xhvVar2 = xhv.INSTANCE;
                    animatorSet.playTogether(ofFloat3);
                    TextView textView5 = this.mPriceTail;
                    if (textView5 != null) {
                        if (!TextUtils.isEmpty(textView5.getText())) {
                            TextView textView6 = this.mPriceTail;
                            if (textView6 != null) {
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, "translationX", f5, offsetX2);
                                if (z) {
                                    animatorSet = animatorSet;
                                    long j3 = j - 200;
                                    if (j3 > 0) {
                                        ofFloat4.setStartDelay(j3);
                                        TextView textView7 = this.mSuffixView;
                                        if (textView7 != null) {
                                            textView7.setTranslationX(f5);
                                        } else {
                                            ckf.y("mSuffixView");
                                            throw null;
                                        }
                                    }
                                    ofFloat4.setDuration(500L);
                                } else {
                                    animatorSet = animatorSet;
                                    ofFloat4.setDuration(700L);
                                }
                                ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                                animatorSet.playTogether(ofFloat4);
                            } else {
                                ckf.y("mPriceTail");
                                throw null;
                            }
                        }
                        TextView textView8 = this.mSuffixView;
                        if (textView8 != null) {
                            if (textView8.getVisibility() == 0) {
                                TextView textView9 = this.mSuffixView;
                                if (textView9 != null) {
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView9, "translationX", f5, offsetX2);
                                    if (z) {
                                        long j4 = j - 200;
                                        if (j4 > 0) {
                                            ofFloat5.setStartDelay(j4);
                                            TextView textView10 = this.mSuffixView;
                                            if (textView10 != null) {
                                                textView10.setTranslationX(f5);
                                            } else {
                                                ckf.y("mSuffixView");
                                                throw null;
                                            }
                                        }
                                        ofFloat5.setDuration(500L);
                                    } else {
                                        ofFloat5.setDuration(700L);
                                    }
                                    ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                                    animatorSet.playTogether(ofFloat5);
                                } else {
                                    ckf.y("mSuffixView");
                                    throw null;
                                }
                            }
                            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            if (z) {
                                j2 = Math.max(300 + j, 700L);
                            } else {
                                j2 = Math.max(j, 700L);
                            }
                            ofFloat6.setDuration(j2);
                            tgh.b(TAG, "initPriceAnimation totalDuration: " + j2 + ' ');
                            animatorSet.playTogether(ofFloat6);
                            animatorSet.addListener(new d(j));
                            animatorSet.start();
                            return animatorSet;
                        }
                        ckf.y("mSuffixView");
                        throw null;
                    }
                    ckf.y("mPriceTail");
                    throw null;
                }
                ckf.y("mPriceLayout");
                throw null;
            }
            ckf.y("mDecimalView");
            throw null;
        }
        ckf.y("mIntegerView");
        throw null;
    }
}
