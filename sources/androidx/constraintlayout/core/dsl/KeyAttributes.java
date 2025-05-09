package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyAttributes extends Keys {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int[] mFrames;
    private String[] mTarget;
    private String mTransitionEasing;
    public String TYPE = TypedValues.AttributesType.NAME;
    private Fit mCurveFit = null;
    private Visibility[] mVisibility = null;
    private float[] mAlpha = null;
    private float[] mRotation = null;
    private float[] mRotationX = null;
    private float[] mRotationY = null;
    private float[] mPivotX = null;
    private float[] mPivotY = null;
    private float[] mTransitionPathRotate = null;
    private float[] mScaleX = null;
    private float[] mScaleY = null;
    private float[] mTranslationX = null;
    private float[] mTranslationY = null;
    private float[] mTranslationZ = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Fit extends Enum<Fit> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Fit SPLINE = new Fit("SPLINE", 0);
        public static final Fit LINEAR = new Fit("LINEAR", 1);
        private static final /* synthetic */ Fit[] $VALUES = $values();

        private Fit(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Fit fit, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyAttributes$Fit");
        }

        public static Fit valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fit) ipChange.ipc$dispatch("2b49b0a9", new Object[]{str});
            }
            return (Fit) Enum.valueOf(Fit.class, str);
        }

        public static Fit[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fit[]) ipChange.ipc$dispatch("36afa5a", new Object[0]);
            }
            return (Fit[]) $VALUES.clone();
        }

        private static /* synthetic */ Fit[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Fit[]) ipChange.ipc$dispatch("f257da7e", new Object[0]) : new Fit[]{SPLINE, LINEAR};
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Visibility extends Enum<Visibility> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Visibility VISIBLE = new Visibility("VISIBLE", 0);
        public static final Visibility INVISIBLE = new Visibility("INVISIBLE", 1);
        public static final Visibility GONE = new Visibility("GONE", 2);
        private static final /* synthetic */ Visibility[] $VALUES = $values();

        private static /* synthetic */ Visibility[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Visibility[]) ipChange.ipc$dispatch("4cc2b8b5", new Object[0]) : new Visibility[]{VISIBLE, INVISIBLE, GONE};
        }

        private Visibility(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Visibility visibility, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyAttributes$Visibility");
        }

        public static Visibility valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Visibility) ipChange.ipc$dispatch("106ac2a", new Object[]{str});
            }
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Visibility[]) ipChange.ipc$dispatch("fa414959", new Object[0]);
            }
            return (Visibility[]) $VALUES.clone();
        }
    }

    public KeyAttributes(int i, String... strArr) {
        this.mFrames = null;
        this.mTarget = strArr;
        int[] iArr = new int[i];
        this.mFrames = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.mFrames;
            if (i2 < iArr2.length) {
                iArr2[i2] = (int) ((i2 * length) + length);
                i2++;
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(KeyAttributes keyAttributes, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyAttributes");
    }

    public void attributesToString(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f8ff81", new Object[]{this, sb});
            return;
        }
        append(sb, "target", this.mTarget);
        sb.append("frame:");
        sb.append(Arrays.toString(this.mFrames));
        sb.append(",\n");
        append(sb, "easing", this.mTransitionEasing);
        if (this.mCurveFit != null) {
            sb.append("fit:'");
            sb.append(this.mCurveFit);
            sb.append("',\n");
        }
        if (this.mVisibility != null) {
            sb.append("visibility:'");
            sb.append(Arrays.toString(this.mVisibility));
            sb.append("',\n");
        }
        append(sb, "alpha", this.mAlpha);
        append(sb, "rotationX", this.mRotationX);
        append(sb, "rotationY", this.mRotationY);
        append(sb, "rotationZ", this.mRotation);
        append(sb, "pivotX", this.mPivotX);
        append(sb, "pivotY", this.mPivotY);
        append(sb, "pathRotate", this.mTransitionPathRotate);
        append(sb, "scaleX", this.mScaleX);
        append(sb, "scaleY", this.mScaleY);
        append(sb, "translationX", this.mTranslationX);
        append(sb, "translationY", this.mTranslationY);
        append(sb, "translationZ", this.mTranslationZ);
    }

    public float[] getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("a3203e92", new Object[]{this});
        }
        return this.mAlpha;
    }

    public Fit getCurveFit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fit) ipChange.ipc$dispatch("e3f27583", new Object[]{this});
        }
        return this.mCurveFit;
    }

    public float[] getPivotX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("2349dd6e", new Object[]{this});
        }
        return this.mPivotX;
    }

    public float[] getPivotY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("24feb60d", new Object[]{this});
        }
        return this.mPivotY;
    }

    public float[] getRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("c9b5b8c6", new Object[]{this});
        }
        return this.mRotation;
    }

    public float[] getRotationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("b50049d6", new Object[]{this});
        }
        return this.mRotationX;
    }

    public float[] getRotationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("b6b52275", new Object[]{this});
        }
        return this.mRotationY;
    }

    public float[] getScaleX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("ad813476", new Object[]{this});
        }
        return this.mScaleX;
    }

    public float[] getScaleY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("af360d15", new Object[]{this});
        }
        return this.mScaleY;
    }

    public String[] getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("da3c49dd", new Object[]{this});
        }
        return this.mTarget;
    }

    public String getTransitionEasing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b433663", new Object[]{this});
        }
        return this.mTransitionEasing;
    }

    public float[] getTransitionPathRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("e8aaee8f", new Object[]{this});
        }
        return this.mTransitionPathRotate;
    }

    public float[] getTranslationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("1ab5751d", new Object[]{this});
        }
        return this.mTranslationX;
    }

    public float[] getTranslationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("1c6a4dbc", new Object[]{this});
        }
        return this.mTranslationY;
    }

    public float[] getTranslationZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("1e1f265b", new Object[]{this});
        }
        return this.mTranslationZ;
    }

    public Visibility[] getVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Visibility[]) ipChange.ipc$dispatch("6d7bb833", new Object[]{this});
        }
        return this.mVisibility;
    }

    public void setAlpha(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57636fae", new Object[]{this, fArr});
        } else {
            this.mAlpha = fArr;
        }
    }

    public void setCurveFit(Fit fit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ebe457", new Object[]{this, fit});
        } else {
            this.mCurveFit = fit;
        }
    }

    public void setPivotX(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5133ea", new Object[]{this, fArr});
        } else {
            this.mPivotX = fArr;
        }
    }

    public void setPivotY(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1376f2b", new Object[]{this, fArr});
        } else {
            this.mPivotY = fArr;
        }
    }

    public void setRotation(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350e3092", new Object[]{this, fArr});
        } else {
            this.mRotation = fArr;
        }
    }

    public void setRotationX(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f5f2ea", new Object[]{this, fArr});
        } else {
            this.mRotationX = fArr;
        }
    }

    public void setRotationY(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56dc2e2b", new Object[]{this, fArr});
        } else {
            this.mRotationY = fArr;
        }
    }

    public void setScaleX(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3904bde2", new Object[]{this, fArr});
        } else {
            this.mScaleX = fArr;
        }
    }

    public void setScaleY(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6deaf923", new Object[]{this, fArr});
        } else {
            this.mScaleY = fArr;
        }
    }

    public void setTarget(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac948f45", new Object[]{this, strArr});
        } else {
            this.mTarget = strArr;
        }
    }

    public void setTransitionEasing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99662473", new Object[]{this, str});
        } else {
            this.mTransitionEasing = str;
        }
    }

    public void setTransitionPathRotate(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8801e9", new Object[]{this, fArr});
        } else {
            this.mTransitionPathRotate = fArr;
        }
    }

    public void setTranslationX(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33b191b", new Object[]{this, fArr});
        } else {
            this.mTranslationX = fArr;
        }
    }

    public void setTranslationY(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821545c", new Object[]{this, fArr});
        } else {
            this.mTranslationY = fArr;
        }
    }

    public void setTranslationZ(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d078f9d", new Object[]{this, fArr});
        } else {
            this.mTranslationZ = fArr;
        }
    }

    public void setVisibility(Visibility... visibilityArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d88be4e7", new Object[]{this, visibilityArr});
        } else {
            this.mVisibility = visibilityArr;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.TYPE);
        sb.append(":{\n");
        attributesToString(sb);
        sb.append("},\n");
        return sb.toString();
    }
}
