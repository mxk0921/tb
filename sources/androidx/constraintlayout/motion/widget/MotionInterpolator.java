package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class MotionInterpolator implements Interpolator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.animation.TimeInterpolator
    public abstract float getInterpolation(float f);

    public abstract float getVelocity();
}
