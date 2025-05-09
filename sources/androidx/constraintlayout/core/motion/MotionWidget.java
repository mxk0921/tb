package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import tb.uqu;
import tb.yqu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MotionWidget implements TypedValues {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FILL_PARENT = -1;
    public static final int GONE_UNSET = Integer.MIN_VALUE;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 0;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int MATCH_PARENT = -1;
    public static final int PARENT_ID = 0;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int UNSET = -1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 4;
    public static final int WRAP_CONTENT = -2;
    public Motion mMotion;
    private float mProgress;
    public PropertySet mPropertySet;
    public float mTransitionPathRotate;
    public WidgetFrame mWidgetFrame;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Motion {
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int SPLINE_STRING = -1;
        public String mAnimateRelativeTo = null;
        public int mAnimateCircleAngleTo = 0;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PropertySet {
        public int visibility = 4;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;
    }

    public MotionWidget() {
        this.mWidgetFrame = new WidgetFrame();
        this.mMotion = new Motion();
        this.mPropertySet = new PropertySet();
    }

    public MotionWidget findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionWidget) ipChange.ipc$dispatch("6b506114", new Object[]{this, new Integer(i)});
        }
        return null;
    }

    public float getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.alpha;
    }

    public int getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c91b", new Object[]{this})).intValue();
        }
        return this.mWidgetFrame.bottom;
    }

    public CustomVariable getCustomAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomVariable) ipChange.ipc$dispatch("41e64727", new Object[]{this, str});
        }
        return this.mWidgetFrame.getCustomAttribute(str);
    }

    public Set<String> getCustomAttributeNames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("713b51c9", new Object[]{this});
        }
        return this.mWidgetFrame.getCustomAttributeNames();
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        WidgetFrame widgetFrame = this.mWidgetFrame;
        return widgetFrame.bottom - widgetFrame.top;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eeb42d5", new Object[]{this, str})).intValue();
        }
        int a2 = uqu.a(str);
        if (a2 != -1) {
            return a2;
        }
        return yqu.a(str);
    }

    public int getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        return this.mWidgetFrame.left;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mWidgetFrame.getId();
    }

    public MotionWidget getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionWidget) ipChange.ipc$dispatch("ea583979", new Object[]{this});
        }
        return null;
    }

    public float getPivotX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3af1ddc3", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.pivotX;
    }

    public float getPivotY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3afff544", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.pivotY;
    }

    public int getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        return this.mWidgetFrame.right;
    }

    public float getRotationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc08445b", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.rotationX;
    }

    public float getRotationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc165bdc", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.rotationY;
    }

    public float getRotationZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc24735d", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.rotationZ;
    }

    public float getScaleX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.scaleX;
    }

    public float getScaleY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.scaleY;
    }

    public int getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
        }
        return this.mWidgetFrame.top;
    }

    public float getTranslationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42ed1434", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.translationX;
    }

    public float getTranslationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42fb2bb5", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.translationY;
    }

    public float getTranslationZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43094336", new Object[]{this})).floatValue();
        }
        return this.mWidgetFrame.translationZ;
    }

    public float getValueAttributes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e445c71a", new Object[]{this, new Integer(i)})).floatValue();
        }
        switch (i) {
            case 303:
                return this.mWidgetFrame.alpha;
            case 304:
                return this.mWidgetFrame.translationX;
            case 305:
                return this.mWidgetFrame.translationY;
            case 306:
                return this.mWidgetFrame.translationZ;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.mWidgetFrame.rotationX;
            case 309:
                return this.mWidgetFrame.rotationY;
            case 310:
                return this.mWidgetFrame.rotationZ;
            case 311:
                return this.mWidgetFrame.scaleX;
            case 312:
                return this.mWidgetFrame.scaleY;
            case 313:
                return this.mWidgetFrame.pivotX;
            case 314:
                return this.mWidgetFrame.pivotY;
            case 315:
                return this.mProgress;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                return this.mTransitionPathRotate;
        }
    }

    public int getVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b77db82", new Object[]{this})).intValue();
        }
        return this.mPropertySet.visibility;
    }

    public WidgetFrame getWidgetFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetFrame) ipChange.ipc$dispatch("3d1ed06e", new Object[]{this});
        }
        return this.mWidgetFrame;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        WidgetFrame widgetFrame = this.mWidgetFrame;
        return widgetFrame.right - widgetFrame.left;
    }

    public int getX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754e2f3c", new Object[]{this})).intValue();
        }
        return this.mWidgetFrame.left;
    }

    public int getY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755c46bd", new Object[]{this})).intValue();
        }
        return this.mWidgetFrame.top;
    }

    public void layout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1242f1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            setBounds(i, i2, i3, i4);
        }
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d50b87e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.mWidgetFrame == null) {
            this.mWidgetFrame = new WidgetFrame((ConstraintWidget) null);
        }
        WidgetFrame widgetFrame = this.mWidgetFrame;
        widgetFrame.top = i2;
        widgetFrame.left = i;
        widgetFrame.right = i3;
        widgetFrame.bottom = i4;
    }

    public void setCustomAttribute(String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2cbdd7", new Object[]{this, str, new Integer(i), new Float(f)});
        } else {
            this.mWidgetFrame.setCustomAttribute(str, i, f);
        }
    }

    public void setInterpolatedValue(CustomAttribute customAttribute, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440e839", new Object[]{this, customAttribute, fArr});
        } else {
            this.mWidgetFrame.setCustomAttribute(customAttribute.mName, 901, fArr[0]);
        }
    }

    public void setPivotX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9afb7c1", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.pivotX = f;
        }
    }

    public void setPivotY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb649060", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.pivotY = f;
        }
    }

    public void setRotationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf718c1", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.rotationX = f;
        }
    }

    public void setRotationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eabf160", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.rotationY = f;
        }
    }

    public void setRotationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8060c9ff", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.rotationZ = f;
        }
    }

    public void setScaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.scaleX = f;
        }
    }

    public void setScaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.scaleY = f;
        }
    }

    public void setTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64be870", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.translationX = f;
        }
    }

    public void setTranslationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f800c10f", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.translationY = f;
        }
    }

    public void setTranslationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b599ae", new Object[]{this, new Float(f)});
        } else {
            this.mWidgetFrame.translationZ = f;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ecd1eb", new Object[]{this, new Integer(i), new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public boolean setValueAttributes(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7486384e", new Object[]{this, new Integer(i), new Float(f)})).booleanValue();
        }
        switch (i) {
            case 303:
                this.mWidgetFrame.alpha = f;
                break;
            case 304:
                this.mWidgetFrame.translationX = f;
                break;
            case 305:
                this.mWidgetFrame.translationY = f;
                break;
            case 306:
                this.mWidgetFrame.translationZ = f;
                break;
            case 307:
            default:
                return false;
            case 308:
                this.mWidgetFrame.rotationX = f;
                break;
            case 309:
                this.mWidgetFrame.rotationY = f;
                break;
            case 310:
                this.mWidgetFrame.rotationZ = f;
                break;
            case 311:
                this.mWidgetFrame.scaleX = f;
                break;
            case 312:
                this.mWidgetFrame.scaleY = f;
                break;
            case 313:
                this.mWidgetFrame.pivotX = f;
                break;
            case 314:
                this.mWidgetFrame.pivotY = f;
                break;
            case 315:
                this.mProgress = f;
                break;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                this.mTransitionPathRotate = f;
                break;
        }
        return true;
    }

    public boolean setValueMotion(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89515630", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        switch (i) {
            case 606:
                this.mMotion.mAnimateCircleAngleTo = i2;
                break;
            case 607:
                this.mMotion.mPathMotionArc = i2;
                break;
            case 608:
                this.mMotion.mDrawPath = i2;
                break;
            case 609:
                this.mMotion.mPolarRelativeTo = i2;
                break;
            case 610:
                this.mMotion.mQuantizeMotionSteps = i2;
                break;
            case 611:
                this.mMotion.mQuantizeInterpolatorType = i2;
                break;
            case 612:
                this.mMotion.mQuantizeInterpolatorID = i2;
                break;
            default:
                return false;
        }
        return true;
    }

    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
        } else {
            this.mPropertySet.visibility = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mWidgetFrame.left + ", " + this.mWidgetFrame.top + ", " + this.mWidgetFrame.right + ", " + this.mWidgetFrame.bottom;
    }

    public void updateMotion(TypedValues typedValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd24b98", new Object[]{this, typedValues});
        } else if (this.mWidgetFrame.getMotionProperties() != null) {
            this.mWidgetFrame.getMotionProperties().applyDelta(typedValues);
        }
    }

    public void setCustomAttribute(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2cc91a", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.mWidgetFrame.setCustomAttribute(str, i, i2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec921a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (setValueAttributes(i, i2)) {
            return true;
        }
        return setValueMotion(i, i2);
    }

    public void setCustomAttribute(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2d08eb", new Object[]{this, str, new Integer(i), new Boolean(z)});
        } else {
            this.mWidgetFrame.setCustomAttribute(str, i, z);
        }
    }

    public void setCustomAttribute(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02ae493", new Object[]{this, str, new Integer(i), str2});
        } else {
            this.mWidgetFrame.setCustomAttribute(str, i, str2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ec86d7", new Object[]{this, new Integer(i), new Float(f)})).booleanValue();
        }
        if (setValueAttributes(i, f)) {
            return true;
        }
        return setValueMotion(i, f);
    }

    public MotionWidget(WidgetFrame widgetFrame) {
        this.mWidgetFrame = new WidgetFrame();
        this.mMotion = new Motion();
        this.mPropertySet = new PropertySet();
        this.mWidgetFrame = widgetFrame;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("418eb31b", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i != 605) {
            return setValueMotion(i, str);
        }
        this.mMotion.mAnimateRelativeTo = str;
        return true;
    }

    public boolean setValueMotion(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a53ddc5", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 603) {
            this.mMotion.mTransitionEasing = str;
        } else if (i != 604) {
            return false;
        } else {
            this.mMotion.mQuantizeInterpolatorString = str;
        }
        return true;
    }

    public boolean setValueMotion(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89514aed", new Object[]{this, new Integer(i), new Float(f)})).booleanValue();
        }
        switch (i) {
            case 600:
                this.mMotion.mMotionStagger = f;
                break;
            case 601:
                this.mMotion.mPathRotate = f;
                break;
            case 602:
                this.mMotion.mQuantizeMotionPhase = f;
                break;
            default:
                return false;
        }
        return true;
    }
}
