package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FloatRect {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float bottom;
    public float left;
    public float right;
    public float top;

    public final float centerX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6326399a", new Object[]{this})).floatValue();
        }
        return (this.left + this.right) * 0.5f;
    }

    public final float centerY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6334511b", new Object[]{this})).floatValue();
        }
        return (this.top + this.bottom) * 0.5f;
    }
}
