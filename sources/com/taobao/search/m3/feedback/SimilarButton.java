package com.taobao.search.m3.feedback;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.a07;
import tb.ckf;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SimilarButton extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String arrowIcon2024 = "https://gw.alicdn.com/imgextra/i1/O1CN01fPZatB1M97uibx7LX_!!6000000001391-2-tps-19-32.png";
    public static final String arrowIconNor2024 = "https://img.alicdn.com/imgextra/i4/O1CN01tXqqlE1kundFVDkRM_!!6000000004744-2-tps-17-27.png";
    private static final float wfTextSize = 15.0f;
    private final TUrlImageView arrow;
    private Animator enterAnim;
    private final TUrlImageView img;
    private Float radius;
    private final PlaceHolderView secondView;
    private final TextView text;
    private final PlaceHolderView thirdView;
    private final boolean waterfall;
    public static final c Companion = new c(null);
    private static final float wfRadius = o1p.a(12.0f);
    private static final int wfImgSize = o1p.a(35.0f);
    private static final int listImgSize = o1p.a(27.0f);
    private static final int arrowWidth = o1p.a(5.5f);
    private static final int arrowHeight = o1p.a(9.0f);
    private static final int wfTextColorLight = Color.parseColor("#111111");
    private static final float wfImageRadius = o1p.a(3.0f);
    private static final int wfSecondOffset = o1p.a(7.0f);
    private static final int wfThirdOffset = o1p.a(13.0f);
    private static final int listOffset = o1p.a(5.0f);
    private static final int secondColor = Color.parseColor("#CACFD7");
    private static final int thirdColor = Color.parseColor("#F3F6F8");
    private static final int listImgMarginLeft = o1p.a(4.0f);
    private static final int wfImgMarginLeft = o1p.a(6.0f);
    private static final int listTextMarginLeft = o1p.a(5.0f);
    private static final int listArrowMarginRight = o1p.a(12.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/SimilarButton$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            float a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            Float access$getRadius$p = SimilarButton.access$getRadius$p(SimilarButton.this);
            if (access$getRadius$p != null) {
                a2 = access$getRadius$p.floatValue();
            } else if (!SimilarButton.access$getWaterfall$p(SimilarButton.this)) {
                a2 = view.getHeight() / 2.0f;
            } else {
                a2 = SimilarButton.Companion.a();
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), a2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/SimilarButton$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            float height;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            Float access$getRadius$p = SimilarButton.access$getRadius$p(SimilarButton.this);
            if (access$getRadius$p != null) {
                height = access$getRadius$p.floatValue();
            } else if (SimilarButton.access$getWaterfall$p(SimilarButton.this)) {
                height = SimilarButton.access$getWfRadius$cp();
            } else {
                height = view.getHeight() / 2.0f;
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), height);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792366);
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("358c003f", new Object[]{this})).floatValue();
            }
            return SimilarButton.access$getWfImageRadius$cp();
        }

        public c() {
        }
    }

    static {
        t2o.a(815792363);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarButton(Context context, boolean z) {
        super(context);
        int i;
        ckf.g(context, "context");
        this.waterfall = z;
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.img = tUrlImageView;
        boolean z2 = !z;
        PlaceHolderView placeHolderView = new PlaceHolderView(context, z2, secondColor);
        this.secondView = placeHolderView;
        PlaceHolderView placeHolderView2 = new PlaceHolderView(context, z2, thirdColor);
        this.thirdView = placeHolderView2;
        TextView textView = new TextView(context);
        this.text = textView;
        TUrlImageView tUrlImageView2 = new TUrlImageView(context);
        this.arrow = tUrlImageView2;
        tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (z) {
            i = wfImgSize;
        } else {
            i = listImgSize;
        }
        addView(placeHolderView2, new ViewGroup.LayoutParams(i, i));
        addView(placeHolderView, new ViewGroup.LayoutParams(i, i));
        addView(tUrlImageView, new ViewGroup.LayoutParams(i, i));
        tUrlImageView.setClipToOutline(true);
        tUrlImageView.setOutlineProvider(new a());
        addView(textView);
        addView(tUrlImageView2, new ViewGroup.LayoutParams(arrowWidth, arrowHeight));
        textView.setText(Localization.q(R.string.app_find_similar));
        textView.setTextColor(wfTextColorLight);
        textView.getPaint().setFakeBoldText(true);
        textView.setTextSize(1, wfTextSize);
        setBackgroundColor(-1);
        setClipToOutline(true);
        setOutlineProvider(new b());
    }

    public static final /* synthetic */ int access$getListOffset$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83991624", new Object[0])).intValue();
        }
        return listOffset;
    }

    public static final /* synthetic */ Float access$getRadius$p(SimilarButton similarButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("abf594a7", new Object[]{similarButton});
        }
        return similarButton.radius;
    }

    public static final /* synthetic */ int access$getSecondColor$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6863012", new Object[0])).intValue();
        }
        return secondColor;
    }

    public static final /* synthetic */ int access$getThirdColor$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed708859", new Object[0])).intValue();
        }
        return thirdColor;
    }

    public static final /* synthetic */ boolean access$getWaterfall$p(SimilarButton similarButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b99e28e", new Object[]{similarButton})).booleanValue();
        }
        return similarButton.waterfall;
    }

    public static final /* synthetic */ float access$getWfImageRadius$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("464d5780", new Object[0])).floatValue();
        }
        return wfImageRadius;
    }

    public static final /* synthetic */ float access$getWfRadius$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b0f531", new Object[0])).floatValue();
        }
        return wfRadius;
    }

    public static final /* synthetic */ int access$getWfSecondOffset$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("600e9bf", new Object[0])).intValue();
        }
        return wfSecondOffset;
    }

    public static final /* synthetic */ int access$getWfThirdOffset$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f90a3d6", new Object[0])).intValue();
        }
        return wfThirdOffset;
    }

    public static /* synthetic */ Object ipc$super(SimilarButton similarButton, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/SimilarButton");
    }

    private final void layoutList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e74b6f", new Object[]{this});
            return;
        }
        int i = listImgMarginLeft;
        layoutView(this.img, i);
        PlaceHolderView placeHolderView = this.secondView;
        int i2 = listOffset;
        layoutView(placeHolderView, i + i2);
        layoutView(this.thirdView, i + (i2 * 2));
        layoutView(this.text, this.thirdView.getRight() + listTextMarginLeft);
        layoutView(this.arrow, (getMeasuredWidth() - listArrowMarginRight) - this.arrow.getMeasuredWidth());
    }

    private final void layoutView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7997b767", new Object[]{this, view, new Integer(i)});
        } else {
            view.layout(i, (getMeasuredHeight() - view.getMeasuredHeight()) / 2, view.getMeasuredWidth() + i, (getMeasuredHeight() + view.getMeasuredHeight()) / 2);
        }
    }

    private final void layoutWaterfall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9caa0d8f", new Object[]{this});
            return;
        }
        int i = wfImgMarginLeft;
        layoutView(this.img, i);
        PlaceHolderView placeHolderView = this.secondView;
        int i2 = listOffset;
        layoutView(placeHolderView, i + i2);
        layoutView(this.thirdView, i + (i2 * 2));
        layoutView(this.text, this.thirdView.getRight() + listTextMarginLeft);
        layoutView(this.arrow, (getMeasuredWidth() - listArrowMarginRight) - this.arrow.getMeasuredWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Animator animator = this.enterAnim;
        if (animator != null && animator.isRunning()) {
            Animator animator2 = this.enterAnim;
            ckf.d(animator2);
            animator2.end();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.waterfall) {
            layoutWaterfall();
        } else {
            layoutList();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.img.getLayoutParams().width, 1073741824);
        this.img.measure(makeMeasureSpec, makeMeasureSpec);
        this.secondView.measure(makeMeasureSpec, makeMeasureSpec);
        this.thirdView.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.text.measure(makeMeasureSpec2, makeMeasureSpec2);
        this.arrow.measure(View.MeasureSpec.makeMeasureSpec(arrowWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(arrowHeight, 1073741824));
    }

    public final void startEnterAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1103ce", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.img;
        Property property = View.TRANSLATION_X;
        int i = wfThirdOffset;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tUrlImageView, property, i, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.secondView, property, i - wfSecondOffset, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.text, property, -o1p.a(10.0f), 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.arrow, property, -o1p.a(10.0f), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.start();
        this.enterAnim = animatorSet;
    }

    public final void update(String str, float f, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c8cb2e", new Object[]{this, str, new Float(f), new Boolean(z)});
            return;
        }
        this.radius = Float.valueOf(f);
        this.img.setImageUrl(str);
        TUrlImageView tUrlImageView = this.arrow;
        if (z) {
            str2 = arrowIcon2024;
        } else {
            str2 = arrowIconNor2024;
        }
        tUrlImageView.setImageUrl(str2);
        this.secondView.updateRadius(f);
        this.thirdView.updateRadius(f);
    }
}
