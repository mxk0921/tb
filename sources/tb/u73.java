package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u73 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f29204a;
    public final float b;
    public float c = 1.0f;

    static {
        t2o.a(468714124);
    }

    public u73(uq9 uq9Var) {
        this.b = 0.1f;
        try {
            this.b = uq9Var.Y().g().slideUpTransparency / 100.0f;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f29204a = valueAnimator;
        valueAnimator.setDuration(300);
    }

    public void a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82aac59", new Object[]{this, animatorUpdateListener});
        } else {
            this.f29204a.addUpdateListener(animatorUpdateListener);
        }
    }

    public void b(boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a0989c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            f = this.b;
        } else {
            f = 1.0f;
        }
        if (jxv.a(this.c, f) != 0) {
            if (this.f29204a.isStarted()) {
                this.f29204a.end();
            }
            this.f29204a.setFloatValues(this.c, f);
            this.c = f;
            this.f29204a.start();
        }
    }
}
