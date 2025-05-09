package androidx.transition;

import android.animation.TypeEvaluator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FloatArrayEvaluator implements TypeEvaluator<float[]> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float[] mArray;

    public FloatArrayEvaluator(float[] fArr) {
        this.mArray = fArr;
    }

    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("b34f8fab", new Object[]{this, new Float(f), fArr, fArr2});
        }
        float[] fArr3 = this.mArray;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
