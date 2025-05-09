package com.taobao.android.sku.pad;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/taobao/android/sku/pad/PadSkuFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "widthMeasureSpec", "heightMeasureSpec", "Ltb/xhv;", "onMeasure", "(II)V", "", "ratio", "shrinkHeight", "(F)V", "", "withAnimation", "(FZ)V", "mRatio", UTConstant.Args.UT_SUCCESS_F, "Landroid/animation/ValueAnimator;", "mAnimation", "Landroid/animation/ValueAnimator;", "detail-sku_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PadSkuFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ValueAnimator mAnimation;
    private float mRatio;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ValueAnimator b;

        public a(ValueAnimator valueAnimator) {
            this.b = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            PadSkuFrameLayout padSkuFrameLayout = PadSkuFrameLayout.this;
            ValueAnimator valueAnimator2 = this.b;
            ckf.f(valueAnimator2, "animator");
            Object animatedValue = valueAnimator2.getAnimatedValue();
            if (animatedValue != null) {
                PadSkuFrameLayout.access$setMRatio$p(padSkuFrameLayout, ((Float) animatedValue).floatValue());
                PadSkuFrameLayout.this.requestLayout();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static {
        t2o.a(442499216);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PadSkuFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        this.mRatio = 0.9f;
    }

    public static final /* synthetic */ float access$getMRatio$p(PadSkuFrameLayout padSkuFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37786ba", new Object[]{padSkuFrameLayout})).floatValue();
        }
        return padSkuFrameLayout.mRatio;
    }

    public static final /* synthetic */ void access$setMRatio$p(PadSkuFrameLayout padSkuFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e66f5aa", new Object[]{padSkuFrameLayout, new Float(f)});
        } else {
            padSkuFrameLayout.mRatio = f;
        }
    }

    public static /* synthetic */ Object ipc$super(PadSkuFrameLayout padSkuFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/pad/PadSkuFrameLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getLayoutParams().height == -1 || getLayoutParams().height == -2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.mRatio), View.MeasureSpec.getMode(i2)));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void shrinkHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd6f589", new Object[]{this, new Float(f)});
        } else {
            shrinkHeight(f, true);
        }
    }

    public final void shrinkHeight(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d086e6b", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        if (f <= 1.0E-5f) {
            f = 0.0f;
        } else if (f >= 1.00001f) {
            f = 1.0f;
        }
        ValueAnimator valueAnimator = this.mAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            this.mRatio = f;
            requestLayout();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mRatio, f);
        ckf.f(ofFloat, "animator");
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new a(ofFloat));
        ofFloat.start();
        this.mAnimation = ofFloat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PadSkuFrameLayout(Context context) {
        this(context, null, 0);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PadSkuFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        ckf.g(context, "context");
    }
}
