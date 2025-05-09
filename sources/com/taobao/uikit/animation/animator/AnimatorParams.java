package com.taobao.uikit.animation.animator;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cw6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AnimatorParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float fromXPercent = -1.0f;
    private float toXPercent = -1.0f;
    private int duration = -1;
    private Interpolator interpolator = null;

    static {
        t2o.a(929038338);
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        return this.duration;
    }

    public float getFromXPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69b30ee4", new Object[]{this})).floatValue();
        }
        return this.fromXPercent;
    }

    public Interpolator getInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("bf078b59", new Object[]{this});
        }
        return this.interpolator;
    }

    public float getToXPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12f9b9b5", new Object[]{this})).floatValue();
        }
        return this.toXPercent;
    }

    public final boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        float f = this.fromXPercent;
        if (f > 1.0f || f < 0.0f) {
            return false;
        }
        float f2 = this.toXPercent;
        if (f2 > 1.0f || f2 < 0.0f) {
            return false;
        }
        return true;
    }

    public void setAnimateXPercent(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7aeebb3", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.fromXPercent = f;
        this.toXPercent = f2;
        if (cw6.b() && !isValid()) {
            throw new IllegalArgumentException("startXPercent must be between 0 and 1");
        }
    }

    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.duration = i;
        }
    }

    public void setInterpolator(PathInterpolator pathInterpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630bdff0", new Object[]{this, pathInterpolator});
        } else {
            this.interpolator = pathInterpolator;
        }
    }
}
