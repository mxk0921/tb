package com.taobao.uikit.animation.animator;

import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ValueAnimatorExtend extends ValueAnimator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIMATOR_STATUS_BEGIN = 0;
    public static final int ANIMATOR_STATUS_END = 1;
    public static final int ANIMATOR_STATUS_FINISHED = 2;
    public static final int ANIMATOR_STATUS_INITIALIZED = -1;
    public static final int ANIMATOR_STATUS_NOT_INITIALIZED = -2;
    public static final String TAG = "ValueAnimatorExtend";
    private static final ValueAnimatorExtend sInstance = new ValueAnimatorExtend();

    static {
        t2o.a(929038339);
    }

    private ValueAnimatorExtend() {
        setFloatValues(0.0f, 1.0f);
        setDuration(350L);
        setInterpolator(new PathInterpolator(0.1f, 1.1f, 0.54f, 0.99f));
    }

    public static ValueAnimator getDefaultAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("c10c56fd", new Object[0]);
        }
        return sInstance.clone();
    }

    public static /* synthetic */ Object ipc$super(ValueAnimatorExtend valueAnimatorExtend, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/animation/animator/ValueAnimatorExtend");
    }
}
