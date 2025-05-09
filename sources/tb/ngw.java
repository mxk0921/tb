package tb;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ngw implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Drawable f24724a;

    public ngw(Drawable drawable) {
        this.f24724a = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
        } else {
            this.f24724a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
