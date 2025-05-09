package androidx.dynamicanimation.animation;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FloatValueHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mValue = 0.0f;

    public FloatValueHolder() {
    }

    public float getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b2", new Object[]{this})).floatValue();
        }
        return this.mValue;
    }

    public void setValue(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935a274a", new Object[]{this, new Float(f)});
        } else {
            this.mValue = f;
        }
    }

    public FloatValueHolder(float f) {
        setValue(f);
    }
}
