package com.taobao.tab2interact.core.redpackage.pop;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.security.realidentity.x2;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.redpackage.view.HighLightLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.at4;
import tb.ckf;
import tb.mqu;
import tb.rx7;
import tb.t2o;
import tb.xhv;
import tb.yey;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class FakeGuidePop extends yey<Map<String, ? extends Object>> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int arrowBottomMargin;
    private final int arrowSize;
    private ImageView bgImage;
    private final int contentHeight;
    private final int contentWidth;
    private ImageView guideArrowImage;
    private TextView guideText;
    private ImageView handImageView;
    private final float highLightRadius;
    private ImageView iconImage;
    private final int redpackageHeight;
    private ImageView redpackageImage;
    private final int redpackageLeftMargin;
    private final int redpackageTopMargin;
    private final int redpackageWidth;
    private FrameLayout rootView;
    private ImageView tabbarImage;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView access$getGuideText$p = FakeGuidePop.access$getGuideText$p(FakeGuidePop.this);
            ckf.d(access$getGuideText$p);
            access$getGuideText$p.animate().alpha(1.0f).setDuration(400L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            ImageView access$getGuideArrowImage$p = FakeGuidePop.access$getGuideArrowImage$p(FakeGuidePop.this);
            ckf.d(access$getGuideArrowImage$p);
            access$getGuideArrowImage$p.animate().alpha(1.0f).setDuration(400L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FakeGuidePop.access$getRedpackageImage$p(FakeGuidePop.this).setVisibility(4);
                }
            }
        }

        public b(float f) {
            this.b = f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FakeGuidePop.access$getRedpackageImage$p(FakeGuidePop.this).animate().scaleX(0.1f).scaleY(0.1f).translationX(-((FakeGuidePop.access$getRedpackageLeftMargin$p(FakeGuidePop.this) - ((FakeGuidePop.access$getContentWidth$p(FakeGuidePop.this) * 3) / 10)) + (FakeGuidePop.access$getRedpackageWidth$p(FakeGuidePop.this) / 2))).translationY((((FakeGuidePop.access$getContentHeight$p(FakeGuidePop.this) - FakeGuidePop.access$getRedpackageHeight$p(FakeGuidePop.this)) - this.b) - FakeGuidePop.access$getRedpackageTopMargin$p(FakeGuidePop.this)) + (this.b / 3)).setDuration(400L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new a()).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ HighLightLayout b;

        public c(HighLightLayout highLightLayout) {
            this.b = highLightLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            float f = 2;
            this.b.setHighLightArea(new RectF((FakeGuidePop.access$getContentWidth$p(FakeGuidePop.this) / 5) * 1.0f, this.b.getHeight() - (FakeGuidePop.access$getHighLightRadius$p(FakeGuidePop.this) * f), ((FakeGuidePop.access$getContentWidth$p(FakeGuidePop.this) / 5) * 1.0f) + (FakeGuidePop.access$getHighLightRadius$p(FakeGuidePop.this) * f), this.b.getHeight()), FakeGuidePop.access$getHighLightRadius$p(FakeGuidePop.this), FakeGuidePop.access$getHighLightRadius$p(FakeGuidePop.this));
        }
    }

    static {
        t2o.a(689963165);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FakeGuidePop(Context context) {
        super(context);
        ckf.g(context, "context");
        at4.a aVar = at4.Companion;
        this.contentWidth = aVar.b(context, 750, false);
        this.contentHeight = at4.a.c(aVar, context, 1874, false, 4, null);
        this.highLightRadius = at4.a.c(aVar, context, 85, false, 4, null);
        this.redpackageWidth = at4.a.c(aVar, context, 400, false, 4, null);
        this.redpackageHeight = at4.a.c(aVar, context, Integer.valueOf((int) x2.o), false, 4, null);
        this.redpackageLeftMargin = at4.a.c(aVar, context, 175, false, 4, null);
        this.redpackageTopMargin = at4.a.c(aVar, context, 480, false, 4, null);
        this.arrowSize = at4.a.c(aVar, context, 31, false, 4, null);
        this.arrowBottomMargin = at4.a.c(aVar, context, Integer.valueOf((int) SecExceptionCode.SEC_ERROR_STA_STORE_ILLEGEL_KEY), false, 4, null);
    }

    public static final /* synthetic */ int access$getContentHeight$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3101a44", new Object[]{fakeGuidePop})).intValue();
        }
        return fakeGuidePop.contentHeight;
    }

    public static final /* synthetic */ int access$getContentWidth$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc8d0bbd", new Object[]{fakeGuidePop})).intValue();
        }
        return fakeGuidePop.contentWidth;
    }

    public static final /* synthetic */ ImageView access$getGuideArrowImage$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("bee3b8b1", new Object[]{fakeGuidePop});
        }
        return fakeGuidePop.guideArrowImage;
    }

    public static final /* synthetic */ TextView access$getGuideText$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("53ba050e", new Object[]{fakeGuidePop});
        }
        return fakeGuidePop.guideText;
    }

    public static final /* synthetic */ float access$getHighLightRadius$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6383b307", new Object[]{fakeGuidePop})).floatValue();
        }
        return fakeGuidePop.highLightRadius;
    }

    public static final /* synthetic */ int access$getRedpackageHeight$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5d3fc0c", new Object[]{fakeGuidePop})).intValue();
        }
        return fakeGuidePop.redpackageHeight;
    }

    public static final /* synthetic */ ImageView access$getRedpackageImage$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("4eb3e2d9", new Object[]{fakeGuidePop});
        }
        ImageView imageView = fakeGuidePop.redpackageImage;
        if (imageView != null) {
            return imageView;
        }
        ckf.y("redpackageImage");
        throw null;
    }

    public static final /* synthetic */ int access$getRedpackageLeftMargin$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9571dfa", new Object[]{fakeGuidePop})).intValue();
        }
        return fakeGuidePop.redpackageLeftMargin;
    }

    public static final /* synthetic */ int access$getRedpackageTopMargin$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19899812", new Object[]{fakeGuidePop})).intValue();
        }
        return fakeGuidePop.redpackageTopMargin;
    }

    public static final /* synthetic */ int access$getRedpackageWidth$p(FakeGuidePop fakeGuidePop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c461d0f5", new Object[]{fakeGuidePop})).intValue();
        }
        return fakeGuidePop.redpackageWidth;
    }

    public static final /* synthetic */ void access$setGuideArrowImage$p(FakeGuidePop fakeGuidePop, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d0c72d", new Object[]{fakeGuidePop, imageView});
        } else {
            fakeGuidePop.guideArrowImage = imageView;
        }
    }

    public static final /* synthetic */ void access$setGuideText$p(FakeGuidePop fakeGuidePop, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c026f6", new Object[]{fakeGuidePop, textView});
        } else {
            fakeGuidePop.guideText = textView;
        }
    }

    public static final /* synthetic */ void access$setRedpackageImage$p(FakeGuidePop fakeGuidePop, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4105e205", new Object[]{fakeGuidePop, imageView});
        } else {
            fakeGuidePop.redpackageImage = imageView;
        }
    }

    private final void animateGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d47ba2", new Object[]{this});
            return;
        }
        TextView textView = this.guideText;
        if (textView != null && this.guideArrowImage != null) {
            ckf.d(textView);
            textView.setAlpha(0.0f);
            ImageView imageView = this.guideArrowImage;
            ckf.d(imageView);
            imageView.setAlpha(0.0f);
            TextView textView2 = this.guideText;
            ckf.d(textView2);
            textView2.postDelayed(new a(), 1000L);
        }
    }

    private final void animateHand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29c9b77", new Object[]{this});
            return;
        }
        float c2 = at4.a.c(at4.Companion, getContext(), 20, false, 4, null);
        ImageView imageView = this.handImageView;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
            ImageView imageView2 = this.handImageView;
            if (imageView2 != null) {
                float f = -c2;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView2, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, 0.0f), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, 0.0f));
                ofPropertyValuesHolder.setDuration(400L);
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
                ofPropertyValuesHolder.start();
                return;
            }
            ckf.y("handImageView");
            throw null;
        }
        ckf.y("handImageView");
        throw null;
    }

    private final void animateRedpackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec0f9dd", new Object[]{this});
            return;
        }
        float f = 2 * this.highLightRadius;
        ImageView imageView = this.redpackageImage;
        if (imageView != null) {
            imageView.postDelayed(new b(f), 600L);
        } else {
            ckf.y("redpackageImage");
            throw null;
        }
    }

    public static /* synthetic */ Object ipc$super(FakeGuidePop fakeGuidePop, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1865040893) {
            super.onShow();
            return null;
        } else if (hashCode == -893949262) {
            super.onDismiss();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/core/redpackage/pop/FakeGuidePop");
        }
    }

    private final void setupBackgroundImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778c117", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(this.contentWidth, this.contentHeight));
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01KFqzNG23V8KkUVbfK_!!6000000007260-0-tps-1500-3748.jpg");
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        xhv xhvVar = xhv.INSTANCE;
        this.bgImage = tUrlImageView;
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.addView(tUrlImageView);
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    private final void setupHand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf14713", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        at4.a aVar = at4.Companion;
        Context context = tUrlImageView.getContext();
        ckf.f(context, "context");
        int c2 = at4.a.c(aVar, context, 126, false, 4, null);
        Context context2 = tUrlImageView.getContext();
        ckf.f(context2, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c2, at4.a.c(aVar, context2, 132, false, 4, null));
        Context context3 = tUrlImageView.getContext();
        ckf.f(context3, "context");
        layoutParams.bottomMargin = -at4.a.c(aVar, context3, 50, false, 4, null);
        Context context4 = tUrlImageView.getContext();
        ckf.f(context4, "context");
        layoutParams.leftMargin = at4.a.c(aVar, context4, Integer.valueOf((int) Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR), false, 4, null);
        layoutParams.gravity = 80;
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01zELLwR1fF3dauF3KA_!!6000000003976-2-tps-246-256.png");
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.handImageView = tUrlImageView;
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.addView(tUrlImageView);
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    private final void setupHighLightView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cc063", new Object[]{this});
            return;
        }
        HighLightLayout highLightLayout = new HighLightLayout(getContext());
        highLightLayout.setLayoutParams(new FrameLayout.LayoutParams(this.contentWidth, -1));
        highLightLayout.post(new c(highLightLayout));
        highLightLayout.setOnClickListener(this);
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.addView(highLightLayout);
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    private final void setupRedpackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff58079", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.redpackageWidth, this.redpackageHeight);
        layoutParams.leftMargin = this.redpackageLeftMargin;
        layoutParams.topMargin = this.redpackageTopMargin;
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01v5r8PS1uRcl31HQ5Q_!!6000000006034-2-tps-409-594.png");
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.redpackageImage = tUrlImageView;
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.addView(tUrlImageView);
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    private final void setupTabbarImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99102d67", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        int i = this.contentWidth;
        at4.a aVar = at4.Companion;
        Context context = tUrlImageView.getContext();
        ckf.f(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, at4.a.c(aVar, context, 150, false, 4, null));
        layoutParams.gravity = 80;
        Context context2 = tUrlImageView.getContext();
        ckf.f(context2, "context");
        layoutParams.bottomMargin = -at4.a.c(aVar, context2, 40, false, 4, null);
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01WYMS2x1TJqO3YX3IR_!!6000000002362-2-tps-2250-480.png");
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.tabbarImage = tUrlImageView;
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.addView(tUrlImageView);
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            dismiss();
        }
    }

    @Override // tb.yey
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        super.onDismiss();
        getDismissCallback().invoke(new HashMap());
    }

    @Override // tb.yey
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        animateGuide();
        animateHand();
        animateRedpackage();
    }

    private final void setupIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ae1d", new Object[]{this});
            return;
        }
        at4.a aVar = at4.Companion;
        int c2 = at4.a.c(aVar, getContext(), 122, false, 4, null);
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c2, c2);
        Context context = tUrlImageView.getContext();
        ckf.f(context, "context");
        layoutParams.leftMargin = at4.a.c(aVar, context, Integer.valueOf((int) WSContextConstant.HANDSHAKE_RECEIVE_SIZE), false, 4, null);
        Context context2 = tUrlImageView.getContext();
        ckf.f(context2, "context");
        layoutParams.bottomMargin = at4.a.c(aVar, context2, 10, false, 4, null);
        layoutParams.gravity = 80;
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setSkipAutoSize(true);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01VwL6oX1I73YPDs8GZ_!!6000000000845-54-tps-120-120.apng");
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.iconImage = tUrlImageView;
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.addView(tUrlImageView);
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    public View onCreateView(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("288f1886", new Object[]{this, context, map});
        }
        ckf.g(context, "context");
        ckf.g(map, "data");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(this.contentWidth, -1));
        xhv xhvVar = xhv.INSTANCE;
        this.rootView = frameLayout;
        setupBackgroundImage();
        setupTabbarImage();
        setupHighLightView();
        setupRedpackage();
        String i = mqu.Companion.i(map.get("educationTip"), null);
        if (!TextUtils.isEmpty(i)) {
            ckf.d(i);
            setupGuide(i);
        }
        setupIcon();
        setupHand();
        FrameLayout frameLayout2 = this.rootView;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        ckf.y("rootView");
        throw null;
    }

    private final void setupGuide(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ed7d0", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        int i = this.arrowSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 80;
        int i2 = this.contentWidth;
        layoutParams.leftMargin = ((i2 / 5) + (i2 / 10)) - (this.arrowSize / 2);
        layoutParams.bottomMargin = this.arrowBottomMargin;
        xhv xhvVar = xhv.INSTANCE;
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01Ig24dz1kpJ4yw8fqL_!!6000000004732-2-tps-42-38.png");
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.guideArrowImage = tUrlImageView;
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.addView(tUrlImageView);
            TextView textView = new TextView(getContext());
            at4.a aVar = at4.Companion;
            Context context = textView.getContext();
            ckf.f(context, "context");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, at4.a.c(aVar, context, 114, false, 4, null));
            Context context2 = textView.getContext();
            ckf.f(context2, "context");
            layoutParams2.leftMargin = at4.a.c(aVar, context2, 73, false, 4, null);
            layoutParams2.bottomMargin = this.arrowBottomMargin + (this.arrowSize / 2);
            layoutParams2.gravity = 80;
            textView.setLayoutParams(layoutParams2);
            textView.setTypeface(null, 1);
            textView.setTextSize(0, at4.a.c(aVar, getContext(), 32, false, 4, null));
            int c2 = at4.a.c(aVar, getContext(), 50, false, 4, null);
            textView.setPadding(c2, 0, c2, 0);
            textView.setBackground(rx7.Companion.a(Color.parseColor("#FF5000"), 0, 0, at4.a.c(aVar, getContext(), 57, false, 4, null)));
            textView.setText(str);
            textView.setGravity(17);
            textView.setTextColor(-1);
            FrameLayout frameLayout2 = this.rootView;
            if (frameLayout2 != null) {
                frameLayout2.addView(textView);
                this.guideText = textView;
                return;
            }
            ckf.y("rootView");
            throw null;
        }
        ckf.y("rootView");
        throw null;
    }
}
