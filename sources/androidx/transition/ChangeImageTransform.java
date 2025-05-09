package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.TransitionUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ChangeImageTransform extends Transition {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PROPNAME_MATRIX = "android:changeImageTransform:matrix";
    private static final String PROPNAME_BOUNDS = "android:changeImageTransform:bounds";
    private static final String[] sTransitionProperties = {PROPNAME_MATRIX, PROPNAME_BOUNDS};
    private static final TypeEvaluator<Matrix> NULL_MATRIX_EVALUATOR = new TypeEvaluator<Matrix>() { // from class: androidx.transition.ChangeImageTransform.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("3a5a712c", new Object[]{this, new Float(f), matrix, matrix2});
            }
            return null;
        }
    };
    private static final Property<ImageView, Matrix> ANIMATED_TRANSFORM_PROPERTY = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") { // from class: androidx.transition.ChangeImageTransform.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ChangeImageTransform$2");
        }

        public Matrix get(ImageView imageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("c25d1fe3", new Object[]{this, imageView});
            }
            return null;
        }

        public void set(ImageView imageView, Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58372d59", new Object[]{this, imageView, matrix});
            } else {
                ImageViewUtils.animateTransform(imageView, matrix);
            }
        }
    };

    /* compiled from: Taobao */
    /* renamed from: androidx.transition.ChangeImageTransform$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    private void captureValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a186ff93", new Object[]{this, transitionValues});
            return;
        }
        View view = transitionValues.view;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = transitionValues.values;
                map.put(PROPNAME_BOUNDS, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put(PROPNAME_MATRIX, copyImageMatrix(imageView));
            }
        }
    }

    private static Matrix centerCropMatrix(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("f0148933", new Object[]{imageView});
        }
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    private static Matrix copyImageMatrix(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("fe81fc14", new Object[]{imageView});
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = AnonymousClass3.$SwitchMap$android$widget$ImageView$ScaleType[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return fitXYMatrix(imageView);
            }
            if (i == 2) {
                return centerCropMatrix(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    private ObjectAnimator createMatrixAnimator(ImageView imageView, Matrix matrix, Matrix matrix2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("5a5342f", new Object[]{this, imageView, matrix, matrix2});
        }
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) ANIMATED_TRANSFORM_PROPERTY, (TypeEvaluator) new TransitionUtils.MatrixEvaluator(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    private ObjectAnimator createNullAnimator(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("460b68e9", new Object[]{this, imageView});
        }
        Property<ImageView, Matrix> property = ANIMATED_TRANSFORM_PROPERTY;
        TypeEvaluator<Matrix> typeEvaluator = NULL_MATRIX_EVALUATOR;
        Matrix matrix = MatrixUtils.IDENTITY_MATRIX;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix fitXYMatrix(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("fed0de00", new Object[]{imageView});
        }
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    public static /* synthetic */ Object ipc$super(ChangeImageTransform changeImageTransform, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ChangeImageTransform");
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a950ba02", new Object[]{this, transitionValues});
        } else {
            captureValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ddd09", new Object[]{this, transitionValues});
        } else {
            captureValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("2719a402", new Object[]{this, viewGroup, transitionValues, transitionValues2});
        }
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get(PROPNAME_BOUNDS);
        Rect rect2 = (Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) transitionValues.values.get(PROPNAME_MATRIX);
        Matrix matrix2 = (Matrix) transitionValues2.values.get(PROPNAME_MATRIX);
        if (!(matrix == null && matrix2 == null) && (matrix == null || !matrix.equals(matrix2))) {
            z = false;
        }
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) transitionValues2.view;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return createNullAnimator(imageView);
        }
        if (matrix == null) {
            matrix = MatrixUtils.IDENTITY_MATRIX;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.IDENTITY_MATRIX;
        }
        ANIMATED_TRANSFORM_PROPERTY.set(imageView, matrix);
        return createMatrixAnimator(imageView, matrix, matrix2);
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e2d176f4", new Object[]{this});
        }
        return sTransitionProperties;
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
