package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ChangeTransform extends Transition {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PROPNAME_INTERMEDIATE_MATRIX = "android:changeTransform:intermediateMatrix";
    private static final String PROPNAME_INTERMEDIATE_PARENT_MATRIX = "android:changeTransform:intermediateParentMatrix";
    private static final String PROPNAME_PARENT = "android:changeTransform:parent";
    private boolean mReparent;
    private Matrix mTempMatrix;
    public boolean mUseOverlay;
    private static final String PROPNAME_MATRIX = "android:changeTransform:matrix";
    private static final String PROPNAME_TRANSFORMS = "android:changeTransform:transforms";
    private static final String PROPNAME_PARENT_MATRIX = "android:changeTransform:parentMatrix";
    private static final String[] sTransitionProperties = {PROPNAME_MATRIX, PROPNAME_TRANSFORMS, PROPNAME_PARENT_MATRIX};
    private static final Property<PathAnimatorMatrix, float[]> NON_TRANSLATIONS_PROPERTY = new Property<PathAnimatorMatrix, float[]>(float[].class, "nonTranslations") { // from class: androidx.transition.ChangeTransform.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ChangeTransform$1");
        }

        public float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("d3d446fe", new Object[]{this, pathAnimatorMatrix});
            }
            return null;
        }

        public void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bc4a15a", new Object[]{this, pathAnimatorMatrix, fArr});
            } else {
                pathAnimatorMatrix.setValues(fArr);
            }
        }
    };
    private static final Property<PathAnimatorMatrix, PointF> TRANSLATIONS_PROPERTY = new Property<PathAnimatorMatrix, PointF>(PointF.class, "translations") { // from class: androidx.transition.ChangeTransform.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ChangeTransform$2");
        }

        public PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PointF) ipChange.ipc$dispatch("2c107d7a", new Object[]{this, pathAnimatorMatrix});
            }
            return null;
        }

        public void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bc03ed8", new Object[]{this, pathAnimatorMatrix, pointF});
            } else {
                pathAnimatorMatrix.setTranslation(pointF);
            }
        }
    };
    private static final boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class GhostListener extends TransitionListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private GhostView mGhostView;
        private View mView;

        public GhostListener(View view, GhostView ghostView) {
            this.mView = view;
            this.mGhostView = ghostView;
        }

        public static /* synthetic */ Object ipc$super(GhostListener ghostListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ChangeTransform$GhostListener");
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57f909f4", new Object[]{this, transition});
                return;
            }
            transition.removeListener(this);
            GhostViewUtils.removeGhost(this.mView);
            this.mView.setTag(R.id.transition_transform, null);
            this.mView.setTag(R.id.parent_matrix, null);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2068728f", new Object[]{this, transition});
            } else {
                this.mGhostView.setVisibility(4);
            }
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3110ab2e", new Object[]{this, transition});
            } else {
                this.mGhostView.setVisibility(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class PathAnimatorMatrix {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Matrix mMatrix = new Matrix();
        private float mTranslationX;
        private float mTranslationY;
        private final float[] mValues;
        private final View mView;

        public PathAnimatorMatrix(View view, float[] fArr) {
            this.mView = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.mValues = fArr2;
            this.mTranslationX = fArr2[2];
            this.mTranslationY = fArr2[5];
            setAnimationMatrix();
        }

        private void setAnimationMatrix() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b69752aa", new Object[]{this});
                return;
            }
            float[] fArr = this.mValues;
            fArr[2] = this.mTranslationX;
            fArr[5] = this.mTranslationY;
            this.mMatrix.setValues(fArr);
            ViewUtils.setAnimationMatrix(this.mView, this.mMatrix);
        }

        public Matrix getMatrix() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("6834ac4a", new Object[]{this});
            }
            return this.mMatrix;
        }

        public void setTranslation(PointF pointF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf400c11", new Object[]{this, pointF});
                return;
            }
            this.mTranslationX = pointF.x;
            this.mTranslationY = pointF.y;
            setAnimationMatrix();
        }

        public void setValues(float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70284bb6", new Object[]{this, fArr});
                return;
            }
            System.arraycopy(fArr, 0, this.mValues, 0, fArr.length);
            setAnimationMatrix();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Transforms {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final float mRotationX;
        public final float mRotationY;
        public final float mRotationZ;
        public final float mScaleX;
        public final float mScaleY;
        public final float mTranslationX;
        public final float mTranslationY;
        public final float mTranslationZ;

        public Transforms(View view) {
            this.mTranslationX = view.getTranslationX();
            this.mTranslationY = view.getTranslationY();
            this.mTranslationZ = ViewCompat.getTranslationZ(view);
            this.mScaleX = view.getScaleX();
            this.mScaleY = view.getScaleY();
            this.mRotationX = view.getRotationX();
            this.mRotationY = view.getRotationY();
            this.mRotationZ = view.getRotation();
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof Transforms)) {
                return false;
            }
            Transforms transforms = (Transforms) obj;
            if (transforms.mTranslationX == this.mTranslationX && transforms.mTranslationY == this.mTranslationY && transforms.mTranslationZ == this.mTranslationZ && transforms.mScaleX == this.mScaleX && transforms.mScaleY == this.mScaleY && transforms.mRotationX == this.mRotationX && transforms.mRotationY == this.mRotationY && transforms.mRotationZ == this.mRotationZ) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            float f = this.mTranslationX;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.mTranslationY;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            float f3 = this.mTranslationZ;
            if (f3 != 0.0f) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            float f4 = this.mScaleX;
            if (f4 != 0.0f) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            float f5 = this.mScaleY;
            if (f5 != 0.0f) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.mRotationX;
            if (f6 != 0.0f) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.mRotationY;
            if (f7 != 0.0f) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.mRotationZ;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            }
            return i15 + i8;
        }

        public void restore(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efd0ee9d", new Object[]{this, view});
            } else {
                ChangeTransform.setTransforms(view, this.mTranslationX, this.mTranslationY, this.mTranslationZ, this.mScaleX, this.mScaleY, this.mRotationX, this.mRotationY, this.mRotationZ);
            }
        }
    }

    public ChangeTransform() {
        this.mUseOverlay = true;
        this.mReparent = true;
        this.mTempMatrix = new Matrix();
    }

    private void captureValues(TransitionValues transitionValues) {
        Matrix matrix;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a186ff93", new Object[]{this, transitionValues});
            return;
        }
        View view = transitionValues.view;
        if (view.getVisibility() != 8) {
            transitionValues.values.put(PROPNAME_PARENT, view.getParent());
            transitionValues.values.put(PROPNAME_TRANSFORMS, new Transforms(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            transitionValues.values.put(PROPNAME_MATRIX, matrix);
            if (this.mReparent) {
                Matrix matrix3 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                ViewUtils.transformMatrixToGlobal(viewGroup, matrix3);
                matrix3.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
                transitionValues.values.put(PROPNAME_PARENT_MATRIX, matrix3);
                transitionValues.values.put(PROPNAME_INTERMEDIATE_MATRIX, view.getTag(R.id.transition_transform));
                transitionValues.values.put(PROPNAME_INTERMEDIATE_PARENT_MATRIX, view.getTag(R.id.parent_matrix));
            }
        }
    }

    private void createGhostView(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8812c886", new Object[]{this, viewGroup, transitionValues, transitionValues2});
            return;
        }
        View view = transitionValues2.view;
        Matrix matrix = new Matrix((Matrix) transitionValues2.values.get(PROPNAME_PARENT_MATRIX));
        ViewUtils.transformMatrixToLocal(viewGroup, matrix);
        GhostView addGhost = GhostViewUtils.addGhost(view, viewGroup, matrix);
        if (addGhost != null) {
            addGhost.reserveEndViewTransition((ViewGroup) transitionValues.values.get(PROPNAME_PARENT), transitionValues.view);
            Transition transition = this;
            while (true) {
                Transition transition2 = transition.mParent;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            transition.addListener(new GhostListener(view, addGhost));
            if (SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
                View view2 = transitionValues.view;
                if (view2 != transitionValues2.view) {
                    ViewUtils.setTransitionAlpha(view2, 0.0f);
                }
                ViewUtils.setTransitionAlpha(view, 1.0f);
            }
        }
    }

    private ObjectAnimator createTransformAnimator(TransitionValues transitionValues, TransitionValues transitionValues2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("91cbc0c6", new Object[]{this, transitionValues, transitionValues2, new Boolean(z)});
        }
        Matrix matrix = (Matrix) transitionValues.values.get(PROPNAME_MATRIX);
        final Matrix matrix2 = (Matrix) transitionValues2.values.get(PROPNAME_MATRIX);
        if (matrix == null) {
            matrix = MatrixUtils.IDENTITY_MATRIX;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.IDENTITY_MATRIX;
        }
        if (matrix.equals(matrix2)) {
            return null;
        }
        final Transforms transforms = (Transforms) transitionValues2.values.get(PROPNAME_TRANSFORMS);
        final View view = transitionValues2.view;
        setIdentityTransforms(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        final PathAnimatorMatrix pathAnimatorMatrix = new PathAnimatorMatrix(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(pathAnimatorMatrix, PropertyValuesHolder.ofObject(NON_TRANSLATIONS_PROPERTY, new FloatArrayEvaluator(new float[9]), fArr, fArr2), PropertyValuesHolderUtils.ofPointF(TRANSLATIONS_PROPERTY, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: androidx.transition.ChangeTransform.3
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean mIsCanceled;
            private Matrix mTempMatrix = new Matrix();

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ChangeTransform$3");
            }

            private void setCurrentMatrix(Matrix matrix3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("820c5d5d", new Object[]{this, matrix3});
                    return;
                }
                this.mTempMatrix.set(matrix3);
                view.setTag(R.id.transition_transform, this.mTempMatrix);
                transforms.restore(view);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    this.mIsCanceled = true;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                if (!this.mIsCanceled) {
                    if (!z || !ChangeTransform.this.mUseOverlay) {
                        view.setTag(R.id.transition_transform, null);
                        view.setTag(R.id.parent_matrix, null);
                    } else {
                        setCurrentMatrix(matrix2);
                    }
                }
                ViewUtils.setAnimationMatrix(view, null);
                transforms.restore(view);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("450268b5", new Object[]{this, animator});
                } else {
                    setCurrentMatrix(pathAnimatorMatrix.getMatrix());
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8babbd16", new Object[]{this, animator});
                } else {
                    ChangeTransform.setIdentityTransforms(view);
                }
            }
        };
        ofPropertyValuesHolder.addListener(animatorListenerAdapter);
        AnimatorUtils.addPauseListener(ofPropertyValuesHolder, animatorListenerAdapter);
        return ofPropertyValuesHolder;
    }

    public static /* synthetic */ Object ipc$super(ChangeTransform changeTransform, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/ChangeTransform");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r7 == r6.view) goto L_0x0038;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r6 == r7) goto L_0x0038;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean parentsMatch(android.view.ViewGroup r6, android.view.ViewGroup r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.transition.ChangeTransform.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "40273a45"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001f:
            boolean r2 = r5.isValidTarget(r6)
            if (r2 == 0) goto L_0x003a
            boolean r2 = r5.isValidTarget(r7)
            if (r2 != 0) goto L_0x002c
            goto L_0x003a
        L_0x002c:
            androidx.transition.TransitionValues r6 = r5.getMatchedTransitionValues(r6, r0)
            if (r6 == 0) goto L_0x003d
            android.view.View r6 = r6.view
            if (r7 != r6) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r1 = r0
            goto L_0x003d
        L_0x003a:
            if (r6 != r7) goto L_0x0037
            goto L_0x0038
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.parentsMatch(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    public static void setIdentityTransforms(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc82f24", new Object[]{view});
        } else {
            setTransforms(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void setMatricesForParent(TransitionValues transitionValues, TransitionValues transitionValues2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c793e6", new Object[]{this, transitionValues, transitionValues2});
            return;
        }
        Matrix matrix = (Matrix) transitionValues2.values.get(PROPNAME_PARENT_MATRIX);
        transitionValues2.view.setTag(R.id.parent_matrix, matrix);
        Matrix matrix2 = this.mTempMatrix;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) transitionValues.values.get(PROPNAME_MATRIX);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            transitionValues.values.put(PROPNAME_MATRIX, matrix3);
        }
        matrix3.postConcat((Matrix) transitionValues.values.get(PROPNAME_PARENT_MATRIX));
        matrix3.postConcat(matrix2);
    }

    public static void setTransforms(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e59ac42", new Object[]{view, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8)});
            return;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        ViewCompat.setTranslationZ(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
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
            return;
        }
        captureValues(transitionValues);
        if (!SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
            ((ViewGroup) transitionValues.view.getParent()).startViewTransition(transitionValues.view);
        }
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("2719a402", new Object[]{this, viewGroup, transitionValues, transitionValues2});
        }
        if (transitionValues == null || transitionValues2 == null || !transitionValues.values.containsKey(PROPNAME_PARENT) || !transitionValues2.values.containsKey(PROPNAME_PARENT)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) transitionValues.values.get(PROPNAME_PARENT);
        ViewGroup viewGroup3 = (ViewGroup) transitionValues2.values.get(PROPNAME_PARENT);
        if (!this.mReparent || parentsMatch(viewGroup2, viewGroup3)) {
            z = false;
        }
        Matrix matrix = (Matrix) transitionValues.values.get(PROPNAME_INTERMEDIATE_MATRIX);
        if (matrix != null) {
            transitionValues.values.put(PROPNAME_MATRIX, matrix);
        }
        Matrix matrix2 = (Matrix) transitionValues.values.get(PROPNAME_INTERMEDIATE_PARENT_MATRIX);
        if (matrix2 != null) {
            transitionValues.values.put(PROPNAME_PARENT_MATRIX, matrix2);
        }
        if (z) {
            setMatricesForParent(transitionValues, transitionValues2);
        }
        ObjectAnimator createTransformAnimator = createTransformAnimator(transitionValues, transitionValues2, z);
        if (z && createTransformAnimator != null && this.mUseOverlay) {
            createGhostView(viewGroup, transitionValues, transitionValues2);
        } else if (!SUPPORTS_VIEW_REMOVAL_SUPPRESSION) {
            viewGroup2.endViewTransition(transitionValues.view);
        }
        return createTransformAnimator;
    }

    public boolean getReparent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7da0e51e", new Object[]{this})).booleanValue();
        }
        return this.mReparent;
    }

    public boolean getReparentWithOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2c64da2", new Object[]{this})).booleanValue();
        }
        return this.mUseOverlay;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e2d176f4", new Object[]{this});
        }
        return sTransitionProperties;
    }

    public void setReparent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c952d76e", new Object[]{this, new Boolean(z)});
        } else {
            this.mReparent = z;
        }
    }

    public void setReparentWithOverlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d0e202", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseOverlay = z;
        }
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUseOverlay = true;
        this.mReparent = true;
        this.mTempMatrix = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.CHANGE_TRANSFORM);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.mUseOverlay = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.mReparent = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
