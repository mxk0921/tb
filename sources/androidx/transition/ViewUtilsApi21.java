package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewUtilsApi21 extends ViewUtilsApi19 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean sTryHiddenSetAnimationMatrix = true;
    private static boolean sTryHiddenTransformMatrixToGlobal = true;
    private static boolean sTryHiddenTransformMatrixToLocal = true;

    public static /* synthetic */ Object ipc$super(ViewUtilsApi21 viewUtilsApi21, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ViewUtilsApi21");
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setAnimationMatrix(View view, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7620574", new Object[]{this, view, matrix});
        } else if (sTryHiddenSetAnimationMatrix) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetAnimationMatrix = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    public void transformMatrixToGlobal(View view, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e5693c", new Object[]{this, view, matrix});
        } else if (sTryHiddenTransformMatrixToGlobal) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransformMatrixToGlobal = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    public void transformMatrixToLocal(View view, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e90c74", new Object[]{this, view, matrix});
        } else if (sTryHiddenTransformMatrixToLocal) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransformMatrixToLocal = false;
            }
        }
    }
}
