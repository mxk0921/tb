package com.alibaba.triver.triver_shop.extension.dianmicX;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ckf;
import tb.kew;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Tab3AnimationIcon extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TUrlImageView borderImage;
    private final TUrlImageView borderImage2;
    private final FrameLayout borderImageLayout;
    private final ValueAnimator breathAni;
    private final FrameLayout flIconText;
    private final TextView iconText;
    private int iconTextChangeInterval;
    private final TUrlImageView iconTextFloatImage;
    private JSONArray iconTextList;
    private final TUrlImageView mainImage;
    private final FrameLayout mainImageLayout;
    private final View rootLayout;
    private int round;
    private ValueAnimator switchAni;
    private int textIndex;
    private String curText = "";
    private int maxIconTextLoopCount = 1;
    private Handler handler = new Handler();
    private Runnable switchRun = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f = 1;
                float f2 = f - (0.05f * floatValue);
                Tab3AnimationIcon.this.getMainImageLayout().setScaleX(f2);
                Tab3AnimationIcon.this.getMainImageLayout().setScaleY(f2);
                float f3 = (0.1f * floatValue) + f;
                Tab3AnimationIcon.this.getBorderImageLayout().setScaleX(f3);
                Tab3AnimationIcon.this.getBorderImageLayout().setScaleY(f3);
                float f4 = (0.2f * floatValue) + f;
                Tab3AnimationIcon.this.getBorderImage2().setScaleX(f4);
                Tab3AnimationIcon.this.getBorderImage2().setScaleY(f4);
                Tab3AnimationIcon.this.getBorderImage2().setAlpha(f - floatValue);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            TextView iconText = Tab3AnimationIcon.this.getIconText();
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                iconText.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
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
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                return;
            }
            Tab3AnimationIcon tab3AnimationIcon = Tab3AnimationIcon.this;
            JSONArray access$getIconTextList$p = Tab3AnimationIcon.access$getIconTextList$p(tab3AnimationIcon);
            String str = "";
            if (!(access$getIconTextList$p == null || (string = access$getIconTextList$p.getString(Tab3AnimationIcon.access$getTextIndex$p(Tab3AnimationIcon.this))) == null)) {
                str = string;
            }
            Tab3AnimationIcon.access$setCurText$p(tab3AnimationIcon, str);
            Tab3AnimationIcon.this.getIconText().setText(Tab3AnimationIcon.access$getCurText$p(Tab3AnimationIcon.this));
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Tab3AnimationIcon tab3AnimationIcon = Tab3AnimationIcon.this;
            Tab3AnimationIcon.access$setTextIndex$p(tab3AnimationIcon, Tab3AnimationIcon.access$getTextIndex$p(tab3AnimationIcon) + 1);
            int access$getTextIndex$p = Tab3AnimationIcon.access$getTextIndex$p(Tab3AnimationIcon.this);
            JSONArray access$getIconTextList$p = Tab3AnimationIcon.access$getIconTextList$p(Tab3AnimationIcon.this);
            if (access$getIconTextList$p == null) {
                i = 1;
            } else {
                i = access$getIconTextList$p.size();
            }
            if (access$getTextIndex$p < i) {
                Tab3AnimationIcon.access$startSwitchAni(Tab3AnimationIcon.this);
                Tab3AnimationIcon.access$postSwitch(Tab3AnimationIcon.this);
                return;
            }
            Tab3AnimationIcon tab3AnimationIcon2 = Tab3AnimationIcon.this;
            Tab3AnimationIcon.access$setRound$p(tab3AnimationIcon2, Tab3AnimationIcon.access$getRound$p(tab3AnimationIcon2) + 1);
            if (Tab3AnimationIcon.access$getRound$p(Tab3AnimationIcon.this) < Tab3AnimationIcon.access$getMaxIconTextLoopCount$p(Tab3AnimationIcon.this)) {
                Tab3AnimationIcon.access$setTextIndex$p(Tab3AnimationIcon.this, 0);
                Tab3AnimationIcon.access$startSwitchAni(Tab3AnimationIcon.this);
                Tab3AnimationIcon.access$postSwitch(Tab3AnimationIcon.this);
            }
        }
    }

    static {
        t2o.a(766509326);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3AnimationIcon(Context context) {
        super(context);
        ckf.g(context, "context");
        View K = kew.K(context, R.layout.view_shop_tab3_icon_layout);
        ckf.d(K);
        this.rootLayout = K;
        View findViewById = K.findViewById(R.id.view_shop_tab3_icon_back_img);
        ckf.f(findViewById, "rootLayout.findViewById(R.id.view_shop_tab3_icon_back_img)");
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
        this.borderImage = tUrlImageView;
        View findViewById2 = K.findViewById(R.id.view_shop_tab3_icon_back_img2);
        ckf.f(findViewById2, "rootLayout.findViewById(R.id.view_shop_tab3_icon_back_img2)");
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById2;
        this.borderImage2 = tUrlImageView2;
        View findViewById3 = K.findViewById(R.id.view_shop_tab3_icon_main_img);
        ckf.f(findViewById3, "rootLayout.findViewById(R.id.view_shop_tab3_icon_main_img)");
        TUrlImageView tUrlImageView3 = (TUrlImageView) findViewById3;
        this.mainImage = tUrlImageView3;
        View findViewById4 = K.findViewById(R.id.fl_shop_tab3_icon_text);
        ckf.f(findViewById4, "rootLayout.findViewById(R.id.fl_shop_tab3_icon_text)");
        this.flIconText = (FrameLayout) findViewById4;
        View findViewById5 = K.findViewById(R.id.view_shop_tab3_icon_text);
        ckf.f(findViewById5, "rootLayout.findViewById(R.id.view_shop_tab3_icon_text)");
        this.iconText = (TextView) findViewById5;
        View findViewById6 = K.findViewById(R.id.view_shop_tab3_icon_text_float_img);
        ckf.f(findViewById6, "rootLayout.findViewById(R.id.view_shop_tab3_icon_text_float_img)");
        TUrlImageView tUrlImageView4 = (TUrlImageView) findViewById6;
        this.iconTextFloatImage = tUrlImageView4;
        View findViewById7 = K.findViewById(R.id.view_shop_tab3_icon_main_img_layout);
        ckf.f(findViewById7, "rootLayout.findViewById(R.id.view_shop_tab3_icon_main_img_layout)");
        this.mainImageLayout = (FrameLayout) findViewById7;
        View findViewById8 = K.findViewById(R.id.view_shop_tab3_icon_back_img_layout);
        ckf.f(findViewById8, "rootLayout.findViewById(R.id.view_shop_tab3_icon_back_img_layout)");
        this.borderImageLayout = (FrameLayout) findViewById8;
        kew.a(this, K);
        tUrlImageView3.setSkipAutoSize(true);
        tUrlImageView4.setSkipAutoSize(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        tUrlImageView4.setScaleType(scaleType);
        tUrlImageView3.setScaleType(scaleType);
        tUrlImageView.setImageDrawable(getCircleDrawable());
        tUrlImageView2.setImageDrawable(getCircleDrawable());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1500L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        xhv xhvVar = xhv.INSTANCE;
        this.breathAni = ofFloat;
    }

    public static final /* synthetic */ String access$getCurText$p(Tab3AnimationIcon tab3AnimationIcon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd023d94", new Object[]{tab3AnimationIcon});
        }
        return tab3AnimationIcon.curText;
    }

    public static final /* synthetic */ JSONArray access$getIconTextList$p(Tab3AnimationIcon tab3AnimationIcon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a278ec15", new Object[]{tab3AnimationIcon});
        }
        return tab3AnimationIcon.iconTextList;
    }

    public static final /* synthetic */ int access$getMaxIconTextLoopCount$p(Tab3AnimationIcon tab3AnimationIcon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d145cbf", new Object[]{tab3AnimationIcon})).intValue();
        }
        return tab3AnimationIcon.maxIconTextLoopCount;
    }

    public static final /* synthetic */ int access$getRound$p(Tab3AnimationIcon tab3AnimationIcon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78596d5e", new Object[]{tab3AnimationIcon})).intValue();
        }
        return tab3AnimationIcon.round;
    }

    public static final /* synthetic */ int access$getTextIndex$p(Tab3AnimationIcon tab3AnimationIcon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a213fe7", new Object[]{tab3AnimationIcon})).intValue();
        }
        return tab3AnimationIcon.textIndex;
    }

    public static final /* synthetic */ void access$postSwitch(Tab3AnimationIcon tab3AnimationIcon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c56a1b", new Object[]{tab3AnimationIcon});
        } else {
            tab3AnimationIcon.postSwitch();
        }
    }

    public static final /* synthetic */ void access$setCurText$p(Tab3AnimationIcon tab3AnimationIcon, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d33662", new Object[]{tab3AnimationIcon, str});
        } else {
            tab3AnimationIcon.curText = str;
        }
    }

    public static final /* synthetic */ void access$setRound$p(Tab3AnimationIcon tab3AnimationIcon, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cd1f6c", new Object[]{tab3AnimationIcon, new Integer(i)});
        } else {
            tab3AnimationIcon.round = i;
        }
    }

    public static final /* synthetic */ void access$setTextIndex$p(Tab3AnimationIcon tab3AnimationIcon, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64c4403", new Object[]{tab3AnimationIcon, new Integer(i)});
        } else {
            tab3AnimationIcon.textIndex = i;
        }
    }

    public static final /* synthetic */ void access$startSwitchAni(Tab3AnimationIcon tab3AnimationIcon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf665289", new Object[]{tab3AnimationIcon});
        } else {
            tab3AnimationIcon.startSwitchAni();
        }
    }

    public static /* synthetic */ Drawable getTab3IconTextBackgroundDrawable$default(Tab3AnimationIcon tab3AnimationIcon, String str, String str2, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("18531cfe", new Object[]{tab3AnimationIcon, str, str2, new Integer(i), new Integer(i2), obj});
        }
        if ((i2 & 1) != 0) {
            str = "#FF0040";
        }
        if ((i2 & 2) != 0) {
            str2 = "#FF0000";
        }
        return tab3AnimationIcon.getTab3IconTextBackgroundDrawable(str, str2, i);
    }

    public static /* synthetic */ Object ipc$super(Tab3AnimationIcon tab3AnimationIcon, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/dianmicX/Tab3AnimationIcon");
    }

    private final void postSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a52ae7b", new Object[]{this});
            return;
        }
        this.handler.removeCallbacks(this.switchRun);
        this.handler.postDelayed(this.switchRun, this.iconTextChangeInterval);
    }

    private final void startSwitchAni() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1416e94d", new Object[]{this});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(500L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(1);
        ofFloat.addUpdateListener(new b());
        ofFloat.addListener(new c());
        ofFloat.start();
    }

    public final TUrlImageView getBorderImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("8fdd09c", new Object[]{this});
        }
        return this.borderImage;
    }

    public final TUrlImageView getBorderImage2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("640fbffc", new Object[]{this});
        }
        return this.borderImage2;
    }

    public final FrameLayout getBorderImageLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("4a0a23af", new Object[]{this});
        }
        return this.borderImageLayout;
    }

    public final Drawable getCircleDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6e1b4cf", new Object[]{this});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(kew.v(2), -61107);
        return gradientDrawable;
    }

    public final FrameLayout getFlIconText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("174fcf90", new Object[]{this});
        }
        return this.flIconText;
    }

    public final TextView getIconText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("cc73e4b7", new Object[]{this});
        }
        return this.iconText;
    }

    public final TUrlImageView getIconTextFloatImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("894aa17a", new Object[]{this});
        }
        return this.iconTextFloatImage;
    }

    public final TUrlImageView getMainImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("62a14e29", new Object[]{this});
        }
        return this.mainImage;
    }

    public final FrameLayout getMainImageLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d5beda7c", new Object[]{this});
        }
        return this.mainImageLayout;
    }

    public final View getRootLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6627922b", new Object[]{this});
        }
        return this.rootLayout;
    }

    public final Drawable getTab3IconTextBackgroundDrawable(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("ee0cca18", new Object[]{this, str, str2, new Integer(i)});
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor(str), Color.parseColor(str2)});
        gradientDrawable.setCornerRadius(i);
        return gradientDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.breathAni.end();
        ValueAnimator valueAnimator = this.switchAni;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void startBreathAni() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a706ea1", new Object[]{this});
            return;
        }
        this.breathAni.addUpdateListener(new a());
        this.breathAni.start();
    }

    public final void startSwitchText(int i, int i2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5810a692", new Object[]{this, new Integer(i), new Integer(i2), jSONArray});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            this.textIndex = 0;
            this.maxIconTextLoopCount = i2;
            this.iconTextList = jSONArray;
            this.iconTextChangeInterval = i;
            postSwitch();
            String string = jSONArray.getString(this.textIndex);
            ckf.f(string, "iconTextList.getString(textIndex)");
            this.curText = string;
            this.iconText.setText(string);
        }
    }
}
