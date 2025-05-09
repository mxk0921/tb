package androidx.core.graphics;

import android.graphics.Matrix;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.adaemon.power.APower;
import kotlin.Metadata;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003\u001a\u001a\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u001a\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\n\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0001H\u0086\b¨\u0006\u0010"}, d2 = {"rotationMatrix", "Landroid/graphics/Matrix;", "degrees", "", "px", "py", "scaleMatrix", "sx", "sy", "translationMatrix", APower.e.KEY_TX, "ty", Constants.KEY_TIMES, "m", pg1.ATOM_values, "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MatrixKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Matrix rotationMatrix(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("78f130a6", new Object[]{new Float(f), new Float(f2), new Float(f3)});
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(f, f2, f3);
        return matrix;
    }

    public static /* synthetic */ Matrix rotationMatrix$default(float f, float f2, float f3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("91bc7aae", new Object[]{new Float(f), new Float(f2), new Float(f3), new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return rotationMatrix(f, f2, f3);
    }

    public static final Matrix scaleMatrix(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("5682bcbe", new Object[]{new Float(f), new Float(f2)});
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        return matrix;
    }

    public static /* synthetic */ Matrix scaleMatrix$default(float f, float f2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("1fddc93c", new Object[]{new Float(f), new Float(f2), new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return scaleMatrix(f, f2);
    }

    public static final Matrix times(Matrix matrix, Matrix matrix2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("8d02ce99", new Object[]{matrix, matrix2});
        }
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    public static final Matrix translationMatrix(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("9f4f3ea5", new Object[]{new Float(f), new Float(f2)});
        }
        Matrix matrix = new Matrix();
        matrix.setTranslate(f, f2);
        return matrix;
    }

    public static /* synthetic */ Matrix translationMatrix$default(float f, float f2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("58e64ef5", new Object[]{new Float(f), new Float(f2), new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return translationMatrix(f, f2);
    }

    public static final float[] values(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("eca4096e", new Object[]{matrix});
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
