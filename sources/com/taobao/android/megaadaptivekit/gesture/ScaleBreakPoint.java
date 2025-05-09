package com.taobao.android.megaadaptivekit.gesture;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum ScaleBreakPoint {
    Default(1.1f, 0.9f);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float scaleFactorMax;
    private float scaleFactorMin;

    ScaleBreakPoint(float f, float f2) {
        this.scaleFactorMax = f;
        this.scaleFactorMin = f2;
    }

    public static /* synthetic */ Object ipc$super(ScaleBreakPoint scaleBreakPoint, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megaadaptivekit/gesture/ScaleBreakPoint");
    }

    public static ScaleBreakPoint valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScaleBreakPoint) ipChange.ipc$dispatch("39e213cb", new Object[]{str});
        }
        return (ScaleBreakPoint) Enum.valueOf(ScaleBreakPoint.class, str);
    }

    public float getScaleFactorMax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9930a058", new Object[]{this})).floatValue();
        }
        return this.scaleFactorMax;
    }

    public float getScaleFactorMin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a64a7a46", new Object[]{this})).floatValue();
        }
        return this.scaleFactorMin;
    }
}
