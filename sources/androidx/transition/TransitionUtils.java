package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TransitionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean HAS_IS_ATTACHED_TO_WINDOW = true;
    private static final boolean HAS_OVERLAY = true;
    private static final boolean HAS_PICTURE_BITMAP;
    private static final int MAX_IMAGE_SIZE = 1048576;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class MatrixEvaluator implements TypeEvaluator<Matrix> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final float[] mTempStartValues = new float[9];
        public final float[] mTempEndValues = new float[9];
        public final Matrix mTempMatrix = new Matrix();

        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("3a5a712c", new Object[]{this, new Float(f), matrix, matrix2});
            }
            matrix.getValues(this.mTempStartValues);
            matrix2.getValues(this.mTempEndValues);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.mTempEndValues;
                float f2 = fArr[i];
                float f3 = this.mTempStartValues[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.mTempMatrix.setValues(this.mTempEndValues);
            return this.mTempMatrix;
        }
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 28) {
            z = false;
        }
        HAS_PICTURE_BITMAP = z;
    }

    private TransitionUtils() {
    }

    public static View copyViewImage(ViewGroup viewGroup, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("62ba7409", new Object[]{viewGroup, view, view2});
        }
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        ViewUtils.transformMatrixToGlobal(view, matrix);
        ViewUtils.transformMatrixToLocal(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap createViewBitmap = createViewBitmap(view, matrix, rectF, viewGroup);
        if (createViewBitmap != null) {
            imageView.setImageBitmap(createViewBitmap);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap createViewBitmap(android.view.View r8, android.graphics.Matrix r9, android.graphics.RectF r10, android.view.ViewGroup r11) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.transition.TransitionUtils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001e
            java.lang.String r3 = "23e4484f"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            r8 = 2
            r4[r8] = r10
            r8 = 3
            r4[r8] = r11
            java.lang.Object r8 = r2.ipc$dispatch(r3, r4)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            return r8
        L_0x001e:
            boolean r2 = androidx.transition.TransitionUtils.HAS_IS_ATTACHED_TO_WINDOW
            if (r2 == 0) goto L_0x002f
            boolean r2 = r8.isAttachedToWindow()
            r0 = r0 ^ r2
            if (r11 != 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            boolean r2 = r11.isAttachedToWindow()
            goto L_0x0031
        L_0x002f:
            r0 = 0
        L_0x0030:
            r2 = 0
        L_0x0031:
            boolean r3 = androidx.transition.TransitionUtils.HAS_OVERLAY
            r4 = 0
            if (r3 == 0) goto L_0x004d
            if (r0 == 0) goto L_0x004d
            if (r2 != 0) goto L_0x003b
            return r4
        L_0x003b:
            android.view.ViewParent r1 = r8.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r8)
            android.view.ViewGroupOverlay r5 = r11.getOverlay()
            r5.add(r8)
            goto L_0x004f
        L_0x004d:
            r1 = r4
            r2 = 0
        L_0x004f:
            float r5 = r10.width()
            int r5 = java.lang.Math.round(r5)
            float r6 = r10.height()
            int r6 = java.lang.Math.round(r6)
            if (r5 <= 0) goto L_0x00b5
            if (r6 <= 0) goto L_0x00b5
            int r4 = r5 * r6
            float r4 = (float) r4
            r7 = 1233125376(0x49800000, float:1048576.0)
            float r7 = r7 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r4, r7)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r6 = r6 * r4
            int r6 = java.lang.Math.round(r6)
            float r7 = r10.left
            float r7 = -r7
            float r10 = r10.top
            float r10 = -r10
            r9.postTranslate(r7, r10)
            r9.postScale(r4, r4)
            boolean r10 = androidx.transition.TransitionUtils.HAS_PICTURE_BITMAP
            if (r10 == 0) goto L_0x00a4
            android.graphics.Picture r10 = new android.graphics.Picture
            r10.<init>()
            android.graphics.Canvas r4 = r10.beginRecording(r5, r6)
            r4.concat(r9)
            r8.draw(r4)
            r10.endRecording()
            android.graphics.Bitmap r4 = tb.veu.a(r10)
            goto L_0x00b5
        L_0x00a4:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r6, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r4)
            r10.concat(r9)
            r8.draw(r10)
        L_0x00b5:
            if (r3 == 0) goto L_0x00c3
            if (r0 == 0) goto L_0x00c3
            android.view.ViewGroupOverlay r9 = r11.getOverlay()
            r9.remove(r8)
            r1.addView(r8, r2)
        L_0x00c3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionUtils.createViewBitmap(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    public static Animator mergeAnimators(Animator animator, Animator animator2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("f6e0657e", new Object[]{animator, animator2});
        }
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
