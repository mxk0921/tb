package tb;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class oai implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f25255a = new float[9];
    public final float[] b = new float[9];
    public final Matrix c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        float[] fArr = this.f25255a;
        matrix.getValues(fArr);
        float[] fArr2 = this.b;
        matrix2.getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = f3 + ((f2 - f3) * f);
        }
        Matrix matrix3 = this.c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}
