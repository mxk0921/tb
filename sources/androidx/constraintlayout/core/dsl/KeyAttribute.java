package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyAttribute extends Keys {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mFrame;
    private String mTarget;
    private String mTransitionEasing;
    public String TYPE = TypedValues.AttributesType.NAME;
    private Fit mCurveFit = null;
    private Visibility mVisibility = null;
    private float mAlpha = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Fit extends Enum<Fit> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Fit SPLINE = new Fit("SPLINE", 0);
        public static final Fit LINEAR = new Fit("LINEAR", 1);
        private static final /* synthetic */ Fit[] $VALUES = $values();

        private static /* synthetic */ Fit[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Fit[]) ipChange.ipc$dispatch("87a909ab", new Object[0]) : new Fit[]{SPLINE, LINEAR};
        }

        private Fit(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Fit fit, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyAttribute$Fit");
        }

        public static Fit valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fit) ipChange.ipc$dispatch("55e4220", new Object[]{str});
            }
            return (Fit) Enum.valueOf(Fit.class, str);
        }

        public static Fit[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fit[]) ipChange.ipc$dispatch("c2047e4f", new Object[0]);
            }
            return (Fit[]) $VALUES.clone();
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

        private Visibility(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Visibility visibility, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyAttribute$Visibility");
        }

        public static Visibility valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Visibility) ipChange.ipc$dispatch("3c88d6d3", new Object[]{str});
            }
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Visibility[]) ipChange.ipc$dispatch("f1fe57c4", new Object[0]);
            }
            return (Visibility[]) $VALUES.clone();
        }

        private static /* synthetic */ Visibility[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Visibility[]) ipChange.ipc$dispatch("e4238ce8", new Object[0]) : new Visibility[]{VISIBLE, INVISIBLE, GONE};
        }
    }

    public KeyAttribute(int i, String str) {
        this.mTarget = str;
        this.mFrame = i;
    }

    public static /* synthetic */ Object ipc$super(KeyAttribute keyAttribute, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyAttribute");
    }

    public void attributesToString(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f8ff81", new Object[]{this, sb});
            return;
        }
        append(sb, "target", this.mTarget);
        sb.append("frame:");
        sb.append(this.mFrame);
        sb.append(",\n");
        append(sb, "easing", this.mTransitionEasing);
        if (this.mCurveFit != null) {
            sb.append("fit:'");
            sb.append(this.mCurveFit);
            sb.append("',\n");
        }
        if (this.mVisibility != null) {
            sb.append("visibility:'");
            sb.append(this.mVisibility);
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

    public float getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue();
        }
        return this.mAlpha;
    }

    public Fit getCurveFit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fit) ipChange.ipc$dispatch("b07c7a06", new Object[]{this});
        }
        return this.mCurveFit;
    }

    public float getPivotX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3af1ddc3", new Object[]{this})).floatValue();
        }
        return this.mPivotX;
    }

    public float getPivotY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3afff544", new Object[]{this})).floatValue();
        }
        return this.mPivotY;
    }

    public float getRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c471376b", new Object[]{this})).floatValue();
        }
        return this.mRotation;
    }

    public float getRotationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc08445b", new Object[]{this})).floatValue();
        }
        return this.mRotationX;
    }

    public float getRotationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc165bdc", new Object[]{this})).floatValue();
        }
        return this.mRotationY;
    }

    public float getScaleX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue();
        }
        return this.mScaleX;
    }

    public float getScaleY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue();
        }
        return this.mScaleY;
    }

    public String getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("663f84d2", new Object[]{this});
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

    public float getTransitionPathRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2889a482", new Object[]{this})).floatValue();
        }
        return this.mTransitionPathRotate;
    }

    public float getTranslationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42ed1434", new Object[]{this})).floatValue();
        }
        return this.mTranslationX;
    }

    public float getTranslationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42fb2bb5", new Object[]{this})).floatValue();
        }
        return this.mTranslationY;
    }

    public float getTranslationZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43094336", new Object[]{this})).floatValue();
        }
        return this.mTranslationZ;
    }

    public Visibility getVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Visibility) ipChange.ipc$dispatch("75630d3d", new Object[]{this});
        }
        return this.mVisibility;
    }

    public void setAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144f37d", new Object[]{this, new Float(f)});
        } else {
            this.mAlpha = f;
        }
    }

    public void setCurveFit(Fit fit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e0f2ac", new Object[]{this, fit});
        } else {
            this.mCurveFit = fit;
        }
    }

    public void setPivotX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9afb7c1", new Object[]{this, new Float(f)});
        } else {
            this.mPivotX = f;
        }
    }

    public void setPivotY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb649060", new Object[]{this, new Float(f)});
        } else {
            this.mPivotY = f;
        }
    }

    public void setRotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8c8619", new Object[]{this, new Float(f)});
        } else {
            this.mRotation = f;
        }
    }

    public void setRotationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf718c1", new Object[]{this, new Float(f)});
        } else {
            this.mRotationX = f;
        }
    }

    public void setRotationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eabf160", new Object[]{this, new Float(f)});
        } else {
            this.mRotationY = f;
        }
    }

    public void setScaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
        } else {
            this.mScaleX = f;
        }
    }

    public void setScaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
        } else {
            this.mScaleY = f;
        }
    }

    public void setTarget(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b02e4", new Object[]{this, str});
        } else {
            this.mTarget = str;
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

    public void setTransitionPathRotate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3277ade2", new Object[]{this, new Float(f)});
        } else {
            this.mTransitionPathRotate = f;
        }
    }

    public void setTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64be870", new Object[]{this, new Float(f)});
        } else {
            this.mTranslationX = f;
        }
    }

    public void setTranslationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f800c10f", new Object[]{this, new Float(f)});
        } else {
            this.mTranslationY = f;
        }
    }

    public void setTranslationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b599ae", new Object[]{this, new Float(f)});
        } else {
            this.mTranslationZ = f;
        }
    }

    public void setVisibility(Visibility visibility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cabfd31", new Object[]{this, visibility});
        } else {
            this.mVisibility = visibility;
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
