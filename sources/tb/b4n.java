package tb;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animator", "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class b4n implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f16175a;
    public final /* synthetic */ View b;

    public b4n(ViewGroup.MarginLayoutParams marginLayoutParams, View view) {
        this.f16175a = marginLayoutParams;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f16175a;
        ckf.f(valueAnimator, "animator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            marginLayoutParams.setMarginEnd(((Integer) animatedValue).intValue());
            this.b.setLayoutParams(this.f16175a);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
}
