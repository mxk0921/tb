package com.taobao.oversea.baobao.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Typeface;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HGifView;
import com.taobao.oversea.baobao.BaobaoManager;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.util.StringUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import tb.ex0;
import tb.s8d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BaobaoProgress extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CURRENCY_SYMBOL = "%@";
    private static final String LINE_SYMBOL = "%#";
    private TextView addTx;
    private TextView badgeTx;
    private TextView contentTx;
    private HGifView finishGif;
    private String fullPic;
    private String fullPicGif;
    private TUrlImageView icon;
    private boolean isGrey;
    private float mAp;
    private CircleProgressBar progressBar;
    private FrameLayout rootView;
    private float maxValue = 0.0f;
    private float preProgress = 0.0f;
    private int preCount = 0;
    private float curProgress = 0.0f;
    private int curCount = 0;
    private float mApScale = 1.0f;
    private String currency = "￥";
    private boolean currencyInBack = false;
    private boolean useCLDRPrice = false;
    private String freeShipFormat = "";
    private String muchMoreFormat = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.oversea.baobao.view.BaobaoProgress$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0644a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0644a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    BaobaoProgress.this.invalidate();
                }
            }
        }

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BaobaoProgress.access$000(BaobaoProgress.this).post(new RunnableC0644a());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Animator f11414a;

        public b(BaobaoProgress baobaoProgress, Animator animator) {
            this.f11414a = animator;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/BaobaoProgress$2");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
            } else {
                this.f11414a.start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Animator f11415a;

        public c(BaobaoProgress baobaoProgress, Animator animator) {
            this.f11415a = animator;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/BaobaoProgress$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            this.f11415a.setStartDelay(50L);
            this.f11415a.start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Animator f11416a;

        public d(BaobaoProgress baobaoProgress, Animator animator) {
            this.f11416a = animator;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/BaobaoProgress$4");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
            } else {
                this.f11416a.start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/BaobaoProgress$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            BaobaoProgress.access$100(BaobaoProgress.this).setVisibility(8);
            BaobaoProgress.access$100(BaobaoProgress.this).setTranslationY(0.0f);
            if (!BaobaoProgress.access$200(BaobaoProgress.this)) {
                BaobaoProgress.access$400(BaobaoProgress.this).setGifUrl(BaobaoProgress.access$300(BaobaoProgress.this));
                BaobaoProgress.access$400(BaobaoProgress.this).setAlpha(0.0f);
                BaobaoProgress.access$400(BaobaoProgress.this).setVisibility(0);
                return;
            }
            BaobaoProgress.access$400(BaobaoProgress.this).setGifUrl(BaobaoProgress.access$500(BaobaoProgress.this));
            BaobaoProgress.access$400(BaobaoProgress.this).setVisibility(0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/BaobaoProgress$6");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                BaobaoProgress.access$400(BaobaoProgress.this).setGifUrl(BaobaoProgress.access$500(BaobaoProgress.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Animator f11419a;

        public g(BaobaoProgress baobaoProgress, Animator animator) {
            this.f11419a = animator;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/BaobaoProgress$7");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
            } else {
                this.f11419a.start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Animator f11420a;

        public h(BaobaoProgress baobaoProgress, Animator animator) {
            this.f11420a = animator;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/BaobaoProgress$8");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
            } else {
                this.f11420a.start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaobaoProgress baobaoProgress = BaobaoProgress.this;
            BaobaoProgress.access$602(baobaoProgress, BaobaoProgress.access$700(baobaoProgress));
            BaobaoProgress baobaoProgress2 = BaobaoProgress.this;
            BaobaoProgress.access$802(baobaoProgress2, BaobaoProgress.access$900(baobaoProgress2));
            BaobaoProgress baobaoProgress3 = BaobaoProgress.this;
            baobaoProgress3.setBadge(BaobaoProgress.access$800(baobaoProgress3));
            BaobaoProgress baobaoProgress4 = BaobaoProgress.this;
            baobaoProgress4.setState(BaobaoProgress.access$600(baobaoProgress4), true);
        }
    }

    public BaobaoProgress(Context context) {
        super(context);
        this.mAp = 0.0f;
        this.mAp = Resources.getSystem().getDisplayMetrics().widthPixels / 375.0f;
    }

    public static /* synthetic */ TUrlImageView access$000(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("5383f661", new Object[]{baobaoProgress});
        }
        return baobaoProgress.icon;
    }

    public static /* synthetic */ TextView access$100(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("14d92ace", new Object[]{baobaoProgress});
        }
        return baobaoProgress.contentTx;
    }

    public static /* synthetic */ boolean access$200(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a40eefd", new Object[]{baobaoProgress})).booleanValue();
        }
        return baobaoProgress.isGrey;
    }

    public static /* synthetic */ String access$300(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c436a08", new Object[]{baobaoProgress});
        }
        return baobaoProgress.fullPicGif;
    }

    public static /* synthetic */ HGifView access$400(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HGifView) ipChange.ipc$dispatch("c3f2248f", new Object[]{baobaoProgress});
        }
        return baobaoProgress.finishGif;
    }

    public static /* synthetic */ String access$500(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("529ad08a", new Object[]{baobaoProgress});
        }
        return baobaoProgress.fullPic;
    }

    public static /* synthetic */ float access$600(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2aee965", new Object[]{baobaoProgress})).floatValue();
        }
        return baobaoProgress.preProgress;
    }

    public static /* synthetic */ float access$602(BaobaoProgress baobaoProgress, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cda40fdd", new Object[]{baobaoProgress, new Float(f2)})).floatValue();
        }
        baobaoProgress.preProgress = f2;
        return f2;
    }

    public static /* synthetic */ float access$700(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcca6804", new Object[]{baobaoProgress})).floatValue();
        }
        return baobaoProgress.curProgress;
    }

    public static /* synthetic */ int access$800(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6e5e6a6", new Object[]{baobaoProgress})).intValue();
        }
        return baobaoProgress.preCount;
    }

    public static /* synthetic */ int access$802(BaobaoProgress baobaoProgress, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("204cc5a5", new Object[]{baobaoProgress, new Integer(i2)})).intValue();
        }
        baobaoProgress.preCount = i2;
        return i2;
    }

    public static /* synthetic */ int access$900(BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1016545", new Object[]{baobaoProgress})).intValue();
        }
        return baobaoProgress.curCount;
    }

    private int ap(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccf6ad3d", new Object[]{this, new Float(f2)})).intValue();
        }
        return (int) ((this.mAp * f2 * this.mApScale) + 0.5f);
    }

    public static BaobaoProgress build(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaobaoProgress) ipChange.ipc$dispatch("3c116035", new Object[]{context});
        }
        BaobaoProgress baobaoProgress = new BaobaoProgress(context);
        baobaoProgress.initView(context);
        return baobaoProgress;
    }

    private boolean floatEqual(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b9a5b03", new Object[]{this, new Float(f2), new Float(f3)})).booleanValue();
        }
        if (Math.abs(f2 - f3) < 1.0E-6f) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(BaobaoProgress baobaoProgress, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/BaobaoProgress");
    }

    private String processCurrencyPrice(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f1cfef2", new Object[]{this, str, str2, str3});
        }
        if (str == null) {
            return "";
        }
        if (this.currencyInBack) {
            String replace = str.replace(LINE_SYMBOL, "\n");
            return replace.replace(CURRENCY_SYMBOL, str3 + str2);
        }
        String replace2 = str.replace(LINE_SYMBOL, "\n");
        return replace2.replace(CURRENCY_SYMBOL, str2 + str3);
    }

    private String roundFloat(float f2) {
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73e07895", new Object[]{this, new Float(f2)});
        }
        if (f2 < 0.1f && f2 > 0.0f) {
            return "0.1";
        }
        if (Build.VERSION.SDK_INT < 24) {
            DecimalFormat decimalFormat = new DecimalFormat("0.#");
            decimalFormat.setRoundingMode(RoundingMode.UP);
            return decimalFormat.format(f2);
        }
        NumberFormat numberInstance = this.useCLDRPrice ? NumberFormat.getNumberInstance() : NumberFormat.getNumberInstance(Locale.CHINA);
        numberInstance.setMaximumFractionDigits(1);
        format = numberInstance.format(f2);
        return format;
    }

    public void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.rootView = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ap(72.0f), ap(72.0f));
        layoutParams.setMargins(ap(8.0f), ap(20.0f), ap(8.0f), ap(8.0f));
        addView(this.rootView, layoutParams);
        this.progressBar = new CircleProgressBar(context, this.mAp * this.mApScale);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.progressBar.setPadding(ap(4.0f), ap(4.0f), ap(4.0f), ap(4.0f));
        this.rootView.addView(this.progressBar, 0, layoutParams2);
        this.icon = new TUrlImageView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(ap(34.0f), ap(34.0f));
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = ap(8.0f);
        this.rootView.addView(this.icon, layoutParams3);
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        layoutParams4.topMargin = ap(39.0f);
        TextView textView = new TextView(context);
        this.contentTx = textView;
        textView.setTextSize(1, 8.0f);
        this.contentTx.setTextColor(-8761088);
        this.contentTx.setGravity(17);
        this.contentTx.setMaxLines(2);
        this.contentTx.setEllipsize(TextUtils.TruncateAt.END);
        this.contentTx.setTypeface(Typeface.DEFAULT_BOLD);
        this.contentTx.setLineSpacing(ap(1.0f), 0.9f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, ap(20.0f));
        layoutParams5.gravity = 1;
        frameLayout2.addView(this.contentTx, layoutParams5);
        this.finishGif = new HGifView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(ap(39.0f), ap(20.0f));
        layoutParams6.gravity = 1;
        frameLayout2.addView(this.finishGif, layoutParams6);
        this.rootView.addView(frameLayout2, layoutParams4);
        TextView textView2 = new TextView(context);
        this.badgeTx = textView2;
        textView2.setTextSize(1, 9.0f);
        this.badgeTx.setTextColor(-1);
        this.badgeTx.getPaint().setFakeBoldText(true);
        this.badgeTx.setGravity(17);
        this.badgeTx.setBackgroundResource(R.drawable.plus_badge_bg);
        this.badgeTx.setMinWidth(ap(17.5f));
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, ap(17.5f));
        layoutParams7.gravity = 53;
        layoutParams7.rightMargin = ap(4.0f);
        layoutParams7.topMargin = ap(4.0f);
        this.rootView.addView(this.badgeTx, layoutParams7);
        TextView textView3 = new TextView(context);
        this.addTx = textView3;
        textView3.setTextSize(1, 16.8f);
        this.addTx.setTextColor(-1);
        this.addTx.setGravity(17);
        this.addTx.setText("+1");
        this.addTx.setAlpha(0.0f);
        this.addTx.setTranslationY(ap(10.0f));
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams8.gravity = 53;
        layoutParams8.rightMargin = ap(10.0f);
        layoutParams8.topMargin = ap(10.0f);
        addView(this.addTx, 0, layoutParams8);
    }

    public void setBadge(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fcb79b", new Object[]{this, new Integer(i2)});
        } else if (i2 <= 0) {
            this.badgeTx.setVisibility(4);
        } else if (i2 <= 99) {
            this.badgeTx.setVisibility(0);
            this.badgeTx.setText(String.valueOf(i2));
        } else {
            this.badgeTx.setVisibility(0);
            this.badgeTx.setText("99+");
        }
    }

    public void setGrey(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57b596c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isGrey = z;
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            this.icon.setColorFilter(colorMatrixColorFilter);
            this.finishGif.getGifImageView().setColorFilter(colorMatrixColorFilter);
            this.finishGif.getBottomImageView().setColorFilter(colorMatrixColorFilter);
            this.progressBar.setGray(true);
            this.addTx.getPaint().setColorFilter(colorMatrixColorFilter);
        } else {
            this.icon.clearColorFilter();
            this.finishGif.getBottomImageView().clearColorFilter();
            this.finishGif.getGifImageView().clearColorFilter();
            this.progressBar.setGray(false);
            this.addTx.getPaint().setColorFilter(null);
        }
        this.addTx.invalidate();
    }

    public void setState(float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73decfea", new Object[]{this, new Float(f2), new Boolean(z)});
            return;
        }
        float max = Math.max(this.maxValue - f2, 0.0f);
        if (floatEqual(max, this.maxValue)) {
            this.contentTx.setText(this.freeShipFormat);
            this.finishGif.setVisibility(8);
        } else if (!z) {
            this.contentTx.setText(processCurrencyPrice(this.muchMoreFormat, this.currency, roundFloat(max)));
            this.contentTx.setVisibility(0);
            this.finishGif.setVisibility(8);
        } else if (max > 0.0f) {
            this.contentTx.setText(processCurrencyPrice(this.muchMoreFormat, this.currency, roundFloat(max)));
            this.contentTx.setVisibility(0);
            this.finishGif.setVisibility(8);
        } else {
            this.contentTx.setVisibility(8);
            this.finishGif.setGifUrl(this.fullPic);
            this.finishGif.setVisibility(0);
        }
        if (BaobaoManager.IS_HARMONYOS) {
            invalidate();
        }
    }

    public void init(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cfb90e", new Object[]{this, map});
            return;
        }
        String str = map.get("freePic");
        int parseColor = Color.parseColor(map.get("processBaseColor"));
        int parseColor2 = Color.parseColor(map.get("processColor"));
        this.currency = map.get("currency");
        this.preProgress = Float.parseFloat(String.valueOf(map.get("totalPrice"))) / 100.0f;
        this.preCount = Integer.parseInt(String.valueOf(map.get("totalQuantity")));
        this.maxValue = Float.parseFloat(String.valueOf(map.get(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT)));
        String str2 = map.get("freeShipFormat");
        this.freeShipFormat = str2;
        this.freeShipFormat = processCurrencyPrice(str2, this.currency, String.valueOf(Math.round(this.maxValue)));
        this.muchMoreFormat = map.get("muchMoreFormat");
        this.fullPic = map.get("fullPic");
        this.fullPicGif = map.get("fullPicGif");
        this.isGrey = "true".equals(map.get("isGrey"));
        this.currencyInBack = "true".equals(map.get("currencyInBack"));
        this.useCLDRPrice = "true".equals(map.get("cldrPrice"));
        this.progressBar.setProgressColor(parseColor2);
        this.progressBar.setProgressBackgroundColor(parseColor);
        this.progressBar.setMax(this.maxValue);
        this.progressBar.setProgress(this.preProgress);
        if (!StringUtil.isEmpty(map.get("textColor"))) {
            this.contentTx.setTextColor(Color.parseColor(map.get("textColor")));
        }
        this.icon.setImageUrl(str);
        if (BaobaoManager.IS_HARMONYOS) {
            this.icon.succListener(new a());
        }
        this.addTx.setTextColor(parseColor2);
        if (this.isGrey) {
            this.finishGif.setGifUrl(this.fullPic);
        } else {
            this.finishGif.setGifUrl(this.fullPicGif);
        }
        setState(this.preProgress, true);
        setBadge(this.preCount);
        this.finishGif.setBottomImage(this.fullPic);
        setGrey(this.isGrey);
        invalidate();
    }

    public void update(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce5f0b5", new Object[]{this, map});
            return;
        }
        this.curProgress = Float.parseFloat(String.valueOf(map.get("totalPrice"))) / 100.0f;
        this.curCount = Integer.parseInt(String.valueOf(map.get("totalQuantity")));
        if (!floatEqual(this.curProgress, this.preProgress) || this.curCount != this.preCount) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ex0.b(this, 400, PropertyValuesHolder.ofFloat("ScaleX", 1.0f, 1.2f, 1.0f), PropertyValuesHolder.ofFloat("ScaleY", 1.0f, 1.2f, 1.0f)));
            CircleProgressBar circleProgressBar = this.progressBar;
            Animator b2 = ex0.b(circleProgressBar, 600, PropertyValuesHolder.ofFloat("Progress", circleProgressBar.getProgress(), this.curProgress));
            arrayList.add(b2);
            b2.addListener(new b(this, ex0.b(this, 200, PropertyValuesHolder.ofInt("Badge", this.preCount, this.curCount))));
            if (this.curCount > this.preCount) {
                Animator b3 = ex0.b(this.addTx, 600, PropertyValuesHolder.ofFloat("Alpha", 0.4f, 0.9f, 1.0f, 1.0f, 0.5f, 0.0f), PropertyValuesHolder.ofFloat("TranslationY", ap(10.0f), ap(5.0f), ap(0.0f), ap(-8.0f), ap(-12.0f), ap(-15.0f)));
                ((ObjectAnimator) b3).setRepeatCount(Math.min((this.curCount - this.preCount) - 1, 1));
                b2.addListener(new c(this, b3));
            }
            Animator b4 = ex0.b(this, 1000, PropertyValuesHolder.ofFloat("State", this.preProgress, this.curProgress));
            if (!floatEqual(this.preProgress, this.curProgress)) {
                float f2 = this.preProgress;
                float f3 = this.maxValue;
                if (f2 < f3 || this.curProgress < f3) {
                    b2.addListener(new d(this, b4));
                }
            }
            float f4 = this.curProgress;
            float f5 = this.maxValue;
            if (f4 >= f5 && this.preProgress < f5) {
                Animator b5 = ex0.b(this.contentTx, 200, PropertyValuesHolder.ofFloat("TranslationY", 0.0f, 0.0f, 0.0f, ap(-5.0f), -this.contentTx.getHeight()));
                b5.addListener(new e());
                Animator b6 = ex0.b(this.finishGif, 2080, PropertyValuesHolder.ofFloat("Alpha", 0.0f, 0.6f, 0.8f, 0.9f, 1.0f, 1.0f, 1.0f, 1.0f));
                b6.addListener(new f());
                b4.addListener(new g(this, b5));
                if (!this.isGrey) {
                    b5.addListener(new h(this, b6));
                }
            }
            ex0.c(String.valueOf(hashCode()), arrayList, new i());
        }
    }

    public void setState(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfee82a", new Object[]{this, new Float(f2)});
        } else {
            setState(f2, false);
        }
    }
}
