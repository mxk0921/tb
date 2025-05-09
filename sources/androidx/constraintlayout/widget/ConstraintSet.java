package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tb.pg1;
import tb.vu3;
import tb.xxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintSet {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ALPHA = 43;
    private static final int ANIMATE_CIRCLE_ANGLE_TO = 82;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_MARGIN = 93;
    private static final int BASELINE_TO_BASELINE = 1;
    private static final int BASELINE_TO_BOTTOM = 92;
    private static final int BASELINE_TO_TOP = 91;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    public static final int CIRCLE_REFERENCE = 8;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BASELINE_MARGIN = 94;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDELINE_USE_RTL = 99;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 4;
    private static final String KEY_PERCENT_PARENT = "parent";
    private static final String KEY_RATIO = "ratio";
    private static final String KEY_WEIGHT = "weight";
    private static final int LAYOUT_CONSTRAINT_HEIGHT = 96;
    private static final int LAYOUT_CONSTRAINT_WIDTH = 95;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    private static final int LAYOUT_WRAP_BEHAVIOR = 97;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int MOTION_TARGET = 98;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    private static final int QUANTIZE_MOTION_INTERPOLATOR = 86;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_ID = 89;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_STR = 90;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_TYPE = 88;
    private static final int QUANTIZE_MOTION_PHASE = 85;
    private static final int QUANTIZE_MOTION_STEPS = 84;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_TARGET = 83;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 87;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    public String mIdString;
    private boolean mValidate;
    private static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static SparseIntArray sMapToConstant = new SparseIntArray();
    private static SparseIntArray sOverrideMapToConstant = new SparseIntArray();
    public String derivedState = "";
    private String[] mMatchLabels = new String[0];
    public int mRotate = 0;
    private HashMap<String, ConstraintAttribute> mSavedAttributes = new HashMap<>();
    private boolean mForceId = true;
    private HashMap<Integer, Constraint> mConstraints = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Constraint {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Delta mDelta;
        public String mTargetString;
        public int mViewId;
        public final PropertySet propertySet = new PropertySet();
        public final Motion motion = new Motion();
        public final Layout layout = new Layout();
        public final Transform transform = new Transform();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();

        public static /* synthetic */ void access$000(Constraint constraint, int i, ConstraintLayout.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58a22729", new Object[]{constraint, new Integer(i), layoutParams});
            } else {
                constraint.fillFrom(i, layoutParams);
            }
        }

        public static /* synthetic */ void access$1000(Constraint constraint, String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("762661a3", new Object[]{constraint, str, new Integer(i)});
            } else {
                constraint.setColorValue(str, i);
            }
        }

        public static /* synthetic */ void access$1100(Constraint constraint, String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e12c3e1", new Object[]{constraint, str, new Float(f)});
            } else {
                constraint.setFloatValue(str, f);
            }
        }

        public static /* synthetic */ void access$1200(Constraint constraint, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87629868", new Object[]{constraint, str, str2});
            } else {
                constraint.setStringValue(str, str2);
            }
        }

        public static /* synthetic */ void access$700(Constraint constraint, ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f28b726", new Object[]{constraint, constraintHelper, new Integer(i), layoutParams});
            } else {
                constraint.fillFromConstraints(constraintHelper, i, layoutParams);
            }
        }

        public static /* synthetic */ void access$800(Constraint constraint, int i, Constraints.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3db57a14", new Object[]{constraint, new Integer(i), layoutParams});
            } else {
                constraint.fillFromConstraints(i, layoutParams);
            }
        }

        public static /* synthetic */ void access$900(Constraint constraint, String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d6a843d", new Object[]{constraint, str, new Integer(i)});
            } else {
                constraint.setIntValue(str, i);
            }
        }

        private void fillFrom(int i, ConstraintLayout.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd7faada", new Object[]{this, new Integer(i), layoutParams});
                return;
            }
            this.mViewId = i;
            Layout layout = this.layout;
            layout.leftToLeft = layoutParams.leftToLeft;
            layout.leftToRight = layoutParams.leftToRight;
            layout.rightToLeft = layoutParams.rightToLeft;
            layout.rightToRight = layoutParams.rightToRight;
            layout.topToTop = layoutParams.topToTop;
            layout.topToBottom = layoutParams.topToBottom;
            layout.bottomToTop = layoutParams.bottomToTop;
            layout.bottomToBottom = layoutParams.bottomToBottom;
            layout.baselineToBaseline = layoutParams.baselineToBaseline;
            layout.baselineToTop = layoutParams.baselineToTop;
            layout.baselineToBottom = layoutParams.baselineToBottom;
            layout.startToEnd = layoutParams.startToEnd;
            layout.startToStart = layoutParams.startToStart;
            layout.endToStart = layoutParams.endToStart;
            layout.endToEnd = layoutParams.endToEnd;
            layout.horizontalBias = layoutParams.horizontalBias;
            layout.verticalBias = layoutParams.verticalBias;
            layout.dimensionRatio = layoutParams.dimensionRatio;
            layout.circleConstraint = layoutParams.circleConstraint;
            layout.circleRadius = layoutParams.circleRadius;
            layout.circleAngle = layoutParams.circleAngle;
            layout.editorAbsoluteX = layoutParams.editorAbsoluteX;
            layout.editorAbsoluteY = layoutParams.editorAbsoluteY;
            layout.orientation = layoutParams.orientation;
            layout.guidePercent = layoutParams.guidePercent;
            layout.guideBegin = layoutParams.guideBegin;
            layout.guideEnd = layoutParams.guideEnd;
            layout.mWidth = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.mHeight = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.leftMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.rightMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.topMargin = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.bottomMargin = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.baselineMargin = layoutParams.baselineMargin;
            layout.verticalWeight = layoutParams.verticalWeight;
            layout.horizontalWeight = layoutParams.horizontalWeight;
            layout.verticalChainStyle = layoutParams.verticalChainStyle;
            layout.horizontalChainStyle = layoutParams.horizontalChainStyle;
            layout.constrainedWidth = layoutParams.constrainedWidth;
            layout.constrainedHeight = layoutParams.constrainedHeight;
            layout.widthDefault = layoutParams.matchConstraintDefaultWidth;
            layout.heightDefault = layoutParams.matchConstraintDefaultHeight;
            layout.widthMax = layoutParams.matchConstraintMaxWidth;
            layout.heightMax = layoutParams.matchConstraintMaxHeight;
            layout.widthMin = layoutParams.matchConstraintMinWidth;
            layout.heightMin = layoutParams.matchConstraintMinHeight;
            layout.widthPercent = layoutParams.matchConstraintPercentWidth;
            layout.heightPercent = layoutParams.matchConstraintPercentHeight;
            layout.mConstraintTag = layoutParams.constraintTag;
            layout.goneTopMargin = layoutParams.goneTopMargin;
            layout.goneBottomMargin = layoutParams.goneBottomMargin;
            layout.goneLeftMargin = layoutParams.goneLeftMargin;
            layout.goneRightMargin = layoutParams.goneRightMargin;
            layout.goneStartMargin = layoutParams.goneStartMargin;
            layout.goneEndMargin = layoutParams.goneEndMargin;
            layout.goneBaselineMargin = layoutParams.goneBaselineMargin;
            layout.mWrapBehavior = layoutParams.wrapBehaviorInParent;
            layout.endMargin = layoutParams.getMarginEnd();
            this.layout.startMargin = layoutParams.getMarginStart();
        }

        private void fillFromConstraints(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb583534", new Object[]{this, constraintHelper, new Integer(i), layoutParams});
                return;
            }
            fillFromConstraints(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                Layout layout = this.layout;
                layout.mHelperType = 1;
                Barrier barrier = (Barrier) constraintHelper;
                layout.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        private ConstraintAttribute get(String str, ConstraintAttribute.AttributeType attributeType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConstraintAttribute) ipChange.ipc$dispatch("6acf8521", new Object[]{this, str, attributeType});
            }
            if (this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str);
                if (constraintAttribute.getType() == attributeType) {
                    return constraintAttribute;
                }
                throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
            }
            ConstraintAttribute constraintAttribute2 = new ConstraintAttribute(str, attributeType);
            this.mCustomConstraints.put(str, constraintAttribute2);
            return constraintAttribute2;
        }

        private void setColorValue(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e3362c2", new Object[]{this, str, new Integer(i)});
            } else {
                get(str, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i);
            }
        }

        private void setFloatValue(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7128af8", new Object[]{this, str, new Float(f)});
            } else {
                get(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f);
            }
        }

        private void setIntValue(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae198ce", new Object[]{this, str, new Integer(i)});
            } else {
                get(str, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i);
            }
        }

        private void setStringValue(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac4aa39", new Object[]{this, str, str2});
            } else {
                get(str, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
            }
        }

        public void applyDelta(Constraint constraint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84740a6b", new Object[]{this, constraint});
                return;
            }
            Delta delta = this.mDelta;
            if (delta != null) {
                delta.applyDelta(constraint);
            }
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95755bb", new Object[]{this, layoutParams});
                return;
            }
            Layout layout = this.layout;
            layoutParams.leftToLeft = layout.leftToLeft;
            layoutParams.leftToRight = layout.leftToRight;
            layoutParams.rightToLeft = layout.rightToLeft;
            layoutParams.rightToRight = layout.rightToRight;
            layoutParams.topToTop = layout.topToTop;
            layoutParams.topToBottom = layout.topToBottom;
            layoutParams.bottomToTop = layout.bottomToTop;
            layoutParams.bottomToBottom = layout.bottomToBottom;
            layoutParams.baselineToBaseline = layout.baselineToBaseline;
            layoutParams.baselineToTop = layout.baselineToTop;
            layoutParams.baselineToBottom = layout.baselineToBottom;
            layoutParams.startToEnd = layout.startToEnd;
            layoutParams.startToStart = layout.startToStart;
            layoutParams.endToStart = layout.endToStart;
            layoutParams.endToEnd = layout.endToEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.leftMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.rightMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.bottomMargin;
            layoutParams.goneStartMargin = layout.goneStartMargin;
            layoutParams.goneEndMargin = layout.goneEndMargin;
            layoutParams.goneTopMargin = layout.goneTopMargin;
            layoutParams.goneBottomMargin = layout.goneBottomMargin;
            layoutParams.horizontalBias = layout.horizontalBias;
            layoutParams.verticalBias = layout.verticalBias;
            layoutParams.circleConstraint = layout.circleConstraint;
            layoutParams.circleRadius = layout.circleRadius;
            layoutParams.circleAngle = layout.circleAngle;
            layoutParams.dimensionRatio = layout.dimensionRatio;
            layoutParams.editorAbsoluteX = layout.editorAbsoluteX;
            layoutParams.editorAbsoluteY = layout.editorAbsoluteY;
            layoutParams.verticalWeight = layout.verticalWeight;
            layoutParams.horizontalWeight = layout.horizontalWeight;
            layoutParams.verticalChainStyle = layout.verticalChainStyle;
            layoutParams.horizontalChainStyle = layout.horizontalChainStyle;
            layoutParams.constrainedWidth = layout.constrainedWidth;
            layoutParams.constrainedHeight = layout.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = layout.widthDefault;
            layoutParams.matchConstraintDefaultHeight = layout.heightDefault;
            layoutParams.matchConstraintMaxWidth = layout.widthMax;
            layoutParams.matchConstraintMaxHeight = layout.heightMax;
            layoutParams.matchConstraintMinWidth = layout.widthMin;
            layoutParams.matchConstraintMinHeight = layout.heightMin;
            layoutParams.matchConstraintPercentWidth = layout.widthPercent;
            layoutParams.matchConstraintPercentHeight = layout.heightPercent;
            layoutParams.orientation = layout.orientation;
            layoutParams.guidePercent = layout.guidePercent;
            layoutParams.guideBegin = layout.guideBegin;
            layoutParams.guideEnd = layout.guideEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.mWidth;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.mHeight;
            String str = layout.mConstraintTag;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.wrapBehaviorInParent = layout.mWrapBehavior;
            layoutParams.setMarginStart(layout.startMargin);
            layoutParams.setMarginEnd(this.layout.endMargin);
            layoutParams.validate();
        }

        public void printDelta(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7a4cd5c", new Object[]{this, str});
                return;
            }
            Delta delta = this.mDelta;
            if (delta != null) {
                delta.printDelta(str);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Delta {
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            private static final int INITIAL_BOOLEAN = 4;
            private static final int INITIAL_FLOAT = 10;
            private static final int INITIAL_INT = 10;
            private static final int INITIAL_STRING = 5;
            public int[] mTypeInt = new int[10];
            public int[] mValueInt = new int[10];
            public int mCountInt = 0;
            public int[] mTypeFloat = new int[10];
            public float[] mValueFloat = new float[10];
            public int mCountFloat = 0;
            public int[] mTypeString = new int[5];
            public String[] mValueString = new String[5];
            public int mCountString = 0;
            public int[] mTypeBoolean = new int[4];
            public boolean[] mValueBoolean = new boolean[4];
            public int mCountBoolean = 0;

            public void add(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bca79b08", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                int i3 = this.mCountInt;
                int[] iArr = this.mTypeInt;
                if (i3 >= iArr.length) {
                    this.mTypeInt = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.mValueInt;
                    this.mValueInt = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.mTypeInt;
                int i4 = this.mCountInt;
                iArr3[i4] = i;
                int[] iArr4 = this.mValueInt;
                this.mCountInt = 1 + i4;
                iArr4[i4] = i2;
            }

            public void applyDelta(Constraint constraint) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("84740a6b", new Object[]{this, constraint});
                    return;
                }
                for (int i = 0; i < this.mCountInt; i++) {
                    ConstraintSet.access$300(constraint, this.mTypeInt[i], this.mValueInt[i]);
                }
                for (int i2 = 0; i2 < this.mCountFloat; i2++) {
                    ConstraintSet.access$400(constraint, this.mTypeFloat[i2], this.mValueFloat[i2]);
                }
                for (int i3 = 0; i3 < this.mCountString; i3++) {
                    ConstraintSet.access$500(constraint, this.mTypeString[i3], this.mValueString[i3]);
                }
                for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
                    ConstraintSet.access$600(constraint, this.mTypeBoolean[i4], this.mValueBoolean[i4]);
                }
            }

            public void printDelta(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e7a4cd5c", new Object[]{this, str});
                    return;
                }
                for (int i = 0; i < this.mCountInt; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.mTypeInt[i]);
                    sb.append(" = ");
                    sb.append(this.mValueInt[i]);
                }
                for (int i2 = 0; i2 < this.mCountFloat; i2++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.mTypeFloat[i2]);
                    sb2.append(" = ");
                    sb2.append(this.mValueFloat[i2]);
                }
                for (int i3 = 0; i3 < this.mCountString; i3++) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.mTypeString[i3]);
                    sb3.append(" = ");
                    sb3.append(this.mValueString[i3]);
                }
                for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.mTypeBoolean[i4]);
                    sb4.append(" = ");
                    sb4.append(this.mValueBoolean[i4]);
                }
            }

            public void add(int i, float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bca78fc5", new Object[]{this, new Integer(i), new Float(f)});
                    return;
                }
                int i2 = this.mCountFloat;
                int[] iArr = this.mTypeFloat;
                if (i2 >= iArr.length) {
                    this.mTypeFloat = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.mValueFloat;
                    this.mValueFloat = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.mTypeFloat;
                int i3 = this.mCountFloat;
                iArr2[i3] = i;
                float[] fArr2 = this.mValueFloat;
                this.mCountFloat = 1 + i3;
                fArr2[i3] = f;
            }

            public void add(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6b2c6c65", new Object[]{this, new Integer(i), str});
                    return;
                }
                int i2 = this.mCountString;
                int[] iArr = this.mTypeString;
                if (i2 >= iArr.length) {
                    this.mTypeString = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.mValueString;
                    this.mValueString = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.mTypeString;
                int i3 = this.mCountString;
                iArr2[i3] = i;
                String[] strArr2 = this.mValueString;
                this.mCountString = 1 + i3;
                strArr2[i3] = str;
            }

            public void add(int i, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bca7dad9", new Object[]{this, new Integer(i), new Boolean(z)});
                    return;
                }
                int i2 = this.mCountBoolean;
                int[] iArr = this.mTypeBoolean;
                if (i2 >= iArr.length) {
                    this.mTypeBoolean = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.mValueBoolean;
                    this.mValueBoolean = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.mTypeBoolean;
                int i3 = this.mCountBoolean;
                iArr2[i3] = i;
                boolean[] zArr2 = this.mValueBoolean;
                this.mCountBoolean = 1 + i3;
                zArr2[i3] = z;
            }
        }

        public Constraint clone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Constraint) ipChange.ipc$dispatch("a9f2a8d0", new Object[]{this});
            }
            Constraint constraint = new Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.mViewId = this.mViewId;
            constraint.mDelta = this.mDelta;
            return constraint;
        }

        private void fillFromConstraints(int i, Constraints.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69b05b27", new Object[]{this, new Integer(i), layoutParams});
                return;
            }
            fillFrom(i, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            Transform transform = this.transform;
            transform.rotation = layoutParams.rotation;
            transform.rotationX = layoutParams.rotationX;
            transform.rotationY = layoutParams.rotationY;
            transform.scaleX = layoutParams.scaleX;
            transform.scaleY = layoutParams.scaleY;
            transform.transformPivotX = layoutParams.transformPivotX;
            transform.transformPivotY = layoutParams.transformPivotY;
            transform.translationX = layoutParams.translationX;
            transform.translationY = layoutParams.translationY;
            transform.translationZ = layoutParams.translationZ;
            transform.elevation = layoutParams.elevation;
            transform.applyElevation = layoutParams.applyElevation;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Motion {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int ANIMATE_CIRCLE_ANGLE_TO = 6;
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 7;
        private static final int PATH_MOTION_ARC = 2;
        private static final int QUANTIZE_MOTION_INTERPOLATOR = 10;
        private static final int QUANTIZE_MOTION_PHASE = 9;
        private static final int QUANTIZE_MOTION_STEPS = 8;
        private static final int SPLINE_STRING = -1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static SparseIntArray sMapToConstant;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
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

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sMapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            sMapToConstant.append(R.styleable.Motion_pathMotionArc, 2);
            sMapToConstant.append(R.styleable.Motion_transitionEasing, 3);
            sMapToConstant.append(R.styleable.Motion_drawPath, 4);
            sMapToConstant.append(R.styleable.Motion_animateRelativeTo, 5);
            sMapToConstant.append(R.styleable.Motion_animateCircleAngleTo, 6);
            sMapToConstant.append(R.styleable.Motion_motionStagger, 7);
            sMapToConstant.append(R.styleable.Motion_quantizeMotionSteps, 8);
            sMapToConstant.append(R.styleable.Motion_quantizeMotionPhase, 9);
            sMapToConstant.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public void copyFrom(Motion motion) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7661d0fd", new Object[]{this, motion});
                return;
            }
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
            this.mPolarRelativeTo = motion.mPolarRelativeTo;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e59da", new Object[]{this, context, attributeSet});
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (sMapToConstant.get(index)) {
                    case 1:
                        this.mPathRotate = obtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = obtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.mTransitionEasing = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.mTransitionEasing = Easing.NAMED_EASING[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.mDrawPath = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = ConstraintSet.access$100(obtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mAnimateCircleAngleTo = obtainStyledAttributes.getInteger(index, this.mAnimateCircleAngleTo);
                        break;
                    case 7:
                        this.mMotionStagger = obtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                    case 8:
                        this.mQuantizeMotionSteps = obtainStyledAttributes.getInteger(index, this.mQuantizeMotionSteps);
                        break;
                    case 9:
                        this.mQuantizeMotionPhase = obtainStyledAttributes.getFloat(index, this.mQuantizeMotionPhase);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                this.mQuantizeInterpolatorString = string;
                                if (string.indexOf("/") > 0) {
                                    this.mQuantizeInterpolatorID = obtainStyledAttributes.getResourceId(index, -1);
                                    this.mQuantizeInterpolatorType = -2;
                                    break;
                                } else {
                                    this.mQuantizeInterpolatorType = -1;
                                    break;
                                }
                            } else {
                                this.mQuantizeInterpolatorType = obtainStyledAttributes.getInteger(index, this.mQuantizeInterpolatorID);
                                break;
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.mQuantizeInterpolatorID = resourceId;
                            if (resourceId != -1) {
                                this.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PropertySet {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        public void copyFrom(PropertySet propertySet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cad48a90", new Object[]{this, propertySet});
                return;
            }
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
            this.mVisibilityMode = propertySet.mVisibilityMode;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e59da", new Object[]{this, context, attributeSet});
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.alpha = obtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.visibility = obtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = ConstraintSet.access$200()[this.visibility];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = obtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.mProgress = obtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Transform {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_TARGET = 12;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static SparseIntArray sMapToConstant;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public int transformPivotTarget = -1;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sMapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            sMapToConstant.append(R.styleable.Transform_android_rotationX, 2);
            sMapToConstant.append(R.styleable.Transform_android_rotationY, 3);
            sMapToConstant.append(R.styleable.Transform_android_scaleX, 4);
            sMapToConstant.append(R.styleable.Transform_android_scaleY, 5);
            sMapToConstant.append(R.styleable.Transform_android_transformPivotX, 6);
            sMapToConstant.append(R.styleable.Transform_android_transformPivotY, 7);
            sMapToConstant.append(R.styleable.Transform_android_translationX, 8);
            sMapToConstant.append(R.styleable.Transform_android_translationY, 9);
            sMapToConstant.append(R.styleable.Transform_android_translationZ, 10);
            sMapToConstant.append(R.styleable.Transform_android_elevation, 11);
            sMapToConstant.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        public void copyFrom(Transform transform) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e8a7a51", new Object[]{this, transform});
                return;
            }
            this.mApply = transform.mApply;
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.transformPivotTarget = transform.transformPivotTarget;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e59da", new Object[]{this, context, attributeSet});
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (sMapToConstant.get(index)) {
                    case 1:
                        this.rotation = obtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = obtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = obtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = obtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = obtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = obtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = obtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = obtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = obtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        this.translationZ = obtainStyledAttributes.getDimension(index, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = obtainStyledAttributes.getDimension(index, this.elevation);
                        break;
                    case 12:
                        this.transformPivotTarget = ConstraintSet.access$100(obtainStyledAttributes, index, this.transformPivotTarget);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class WriteJsonEngine {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String SPACE = "       ";
        public Context mContext;
        public int mFlags;
        public ConstraintLayout mLayout;
        public Writer mWriter;
        public int mUnknownCount = 0;
        public final String mLEFT = "'left'";
        public final String mRIGHT = "'right'";
        public final String mBASELINE = "'baseline'";
        public final String mBOTTOM = "'bottom'";
        public final String mTOP = "'top'";
        public final String mSTART = "'start'";
        public final String mEND = "'end'";
        public HashMap<Integer, String> mIdMap = new HashMap<>();

        public WriteJsonEngine(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
            this.mWriter = writer;
            this.mLayout = constraintLayout;
            this.mContext = constraintLayout.getContext();
            this.mFlags = i;
        }

        private void writeGuideline(int i, int i2, int i3, float f) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0f9e555", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Float(f)});
                return;
            }
            writeVariable("'orientation'", i);
            writeVariable("'guideBegin'", i2);
            writeVariable("'guideEnd'", i3);
            writeVariable("'guidePercent'", f);
        }

        public String getName(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("46b1d505", new Object[]{this, new Integer(i)});
            }
            if (this.mIdMap.containsKey(Integer.valueOf(i))) {
                return "'" + this.mIdMap.get(Integer.valueOf(i)) + "'";
            } else if (i == 0) {
                return "'parent'";
            } else {
                String lookup = lookup(i);
                this.mIdMap.put(Integer.valueOf(i), lookup);
                return "'" + lookup + "'";
            }
        }

        public void writeCircle(int i, float f, int i2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51172f30", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            } else if (i != -1) {
                this.mWriter.write("       circle");
                this.mWriter.write(":[");
                this.mWriter.write(getName(i));
                Writer writer = this.mWriter;
                writer.write(", " + f);
                Writer writer2 = this.mWriter;
                writer2.write(i2 + "]");
            }
        }

        public void writeConstraint(String str, int i, String str2, int i2, int i3) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e127b4a0", new Object[]{this, str, new Integer(i), str2, new Integer(i2), new Integer(i3)});
            } else if (i != -1) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                this.mWriter.write(":[");
                this.mWriter.write(getName(i));
                this.mWriter.write(" , ");
                this.mWriter.write(str2);
                if (i2 != 0) {
                    Writer writer2 = this.mWriter;
                    writer2.write(" , " + i2);
                }
                this.mWriter.write("],\n");
            }
        }

        public void writeVariable(String str, int i) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be1e10b7", new Object[]{this, str, new Integer(i)});
            } else if (i != 0 && i != -1) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                this.mWriter.write(":");
                Writer writer2 = this.mWriter;
                writer2.write(", " + i);
                this.mWriter.write("\n");
            }
        }

        public String lookup(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("95c38abe", new Object[]{this, new Integer(i)});
            }
            try {
                if (i != -1) {
                    return this.mContext.getResources().getResourceEntryName(i);
                }
                StringBuilder sb = new StringBuilder("unknown");
                int i2 = this.mUnknownCount + 1;
                this.mUnknownCount = i2;
                sb.append(i2);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder("unknown");
                int i3 = this.mUnknownCount + 1;
                this.mUnknownCount = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        public void writeLayout() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f35603f0", new Object[]{this});
                return;
            }
            this.mWriter.write("\n'ConstraintSet':{\n");
            for (Integer num : ConstraintSet.access$1300(ConstraintSet.this).keySet()) {
                String name = getName(num.intValue());
                Writer writer = this.mWriter;
                writer.write(name + ":{\n");
                Layout layout = ((Constraint) ConstraintSet.access$1300(ConstraintSet.this).get(num)).layout;
                writeDimension("height", layout.mHeight, layout.heightDefault, layout.heightPercent, layout.heightMin, layout.heightMax, layout.constrainedHeight);
                writeDimension("width", layout.mWidth, layout.widthDefault, layout.widthPercent, layout.widthMin, layout.widthMax, layout.constrainedWidth);
                writeConstraint("'left'", layout.leftToLeft, "'left'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'left'", layout.leftToRight, "'right'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'right'", layout.rightToLeft, "'left'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'right'", layout.rightToRight, "'right'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'baseline'", layout.baselineToBaseline, "'baseline'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToTop, "'top'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToBottom, "'bottom'", -1, layout.goneBaselineMargin);
                writeConstraint("'top'", layout.topToBottom, "'bottom'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'top'", layout.topToTop, "'top'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'bottom'", layout.bottomToBottom, "'bottom'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'bottom'", layout.bottomToTop, "'top'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'start'", layout.startToStart, "'start'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'start'", layout.startToEnd, "'end'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'end'", layout.endToStart, "'start'", layout.endMargin, layout.goneEndMargin);
                writeConstraint("'end'", layout.endToEnd, "'end'", layout.endMargin, layout.goneEndMargin);
                writeVariable("'horizontalBias'", layout.horizontalBias, 0.5f);
                writeVariable("'verticalBias'", layout.verticalBias, 0.5f);
                writeCircle(layout.circleConstraint, layout.circleAngle, layout.circleRadius);
                writeGuideline(layout.orientation, layout.guideBegin, layout.guideEnd, layout.guidePercent);
                writeVariable("'dimensionRatio'", layout.dimensionRatio);
                writeVariable("'barrierMargin'", layout.mBarrierMargin);
                writeVariable("'type'", layout.mHelperType);
                writeVariable("'ReferenceId'", layout.mReferenceIdString);
                writeVariable("'mBarrierAllowsGoneWidgets'", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("'WrapBehavior'", layout.mWrapBehavior);
                writeVariable("'verticalWeight'", layout.verticalWeight);
                writeVariable("'horizontalWeight'", layout.horizontalWeight);
                writeVariable("'horizontalChainStyle'", layout.horizontalChainStyle);
                writeVariable("'verticalChainStyle'", layout.verticalChainStyle);
                writeVariable("'barrierDirection'", layout.mBarrierDirection);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    writeVariable("'ReferenceIds'", iArr);
                }
                this.mWriter.write("}\n");
            }
            this.mWriter.write("}\n");
        }

        private void writeDimension(String str, int i, int i2, float f, int i3, int i4, boolean z) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e08d58ac", new Object[]{this, str, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Boolean(z)});
            } else if (i == 0) {
                if (i4 == -1 && i3 == -1) {
                    if (i2 == 1) {
                        Writer writer = this.mWriter;
                        writer.write(SPACE + str + ": '???????????',\n");
                    } else if (i2 == 2) {
                        Writer writer2 = this.mWriter;
                        writer2.write(SPACE + str + ": '" + f + "%',\n");
                    }
                } else if (i2 == 0) {
                    Writer writer3 = this.mWriter;
                    writer3.write(SPACE + str + ": {'spread' ," + i3 + ", " + i4 + "}\n");
                } else if (i2 == 1) {
                    Writer writer4 = this.mWriter;
                    writer4.write(SPACE + str + ": {'wrap' ," + i3 + ", " + i4 + "}\n");
                } else if (i2 == 2) {
                    Writer writer5 = this.mWriter;
                    writer5.write(SPACE + str + ": {'" + f + "'% ," + i3 + ", " + i4 + "}\n");
                }
            } else if (i == -2) {
                Writer writer6 = this.mWriter;
                writer6.write(SPACE + str + ": 'wrap'\n");
            } else if (i == -1) {
                Writer writer7 = this.mWriter;
                writer7.write(SPACE + str + ": 'parent'\n");
            } else {
                Writer writer8 = this.mWriter;
                writer8.write(SPACE + str + ": " + i + ",\n");
            }
        }

        public void writeVariable(String str, float f) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be1e0574", new Object[]{this, str, new Float(f)});
            } else if (f != -1.0f) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                Writer writer2 = this.mWriter;
                writer2.write(": " + f);
                this.mWriter.write(",\n");
            }
        }

        public void writeVariable(String str, float f, float f2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a310cc", new Object[]{this, str, new Float(f), new Float(f2)});
            } else if (f != f2) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                Writer writer2 = this.mWriter;
                writer2.write(": " + f);
                this.mWriter.write(",\n");
            }
        }

        public void writeVariable(String str, boolean z) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be1e5088", new Object[]{this, str, new Boolean(z)});
            } else if (z) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                Writer writer2 = this.mWriter;
                writer2.write(": " + z);
                this.mWriter.write(",\n");
            }
        }

        public void writeVariable(String str, boolean z, boolean z2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ac734c", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            } else if (z != z2) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                Writer writer2 = this.mWriter;
                writer2.write(": " + z);
                this.mWriter.write(",\n");
            }
        }

        public void writeVariable(String str, int[] iArr) throws IOException {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5aca7da", new Object[]{this, str, iArr});
            } else if (iArr != null) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                this.mWriter.write(": ");
                while (i < iArr.length) {
                    Writer writer2 = this.mWriter;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i == 0 ? "[" : ", ");
                    sb.append(getName(iArr[i]));
                    writer2.write(sb.toString());
                    i++;
                }
                this.mWriter.write("],\n");
            }
        }

        public void writeVariable(String str, String str2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0882a96", new Object[]{this, str, str2});
            } else if (str2 != null) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                this.mWriter.write(":");
                this.mWriter.write(", ".concat(str2));
                this.mWriter.write("\n");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class WriteXmlEngine {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String SPACE = "\n       ";
        public Context mContext;
        public int mFlags;
        public ConstraintLayout mLayout;
        public Writer mWriter;
        public int mUnknownCount = 0;
        public final String mLEFT = "'left'";
        public final String mRIGHT = "'right'";
        public final String mBASELINE = "'baseline'";
        public final String mBOTTOM = "'bottom'";
        public final String mTOP = "'top'";
        public final String mSTART = "'start'";
        public final String mEND = "'end'";
        public HashMap<Integer, String> mIdMap = new HashMap<>();

        public WriteXmlEngine(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
            this.mWriter = writer;
            this.mLayout = constraintLayout;
            this.mContext = constraintLayout.getContext();
            this.mFlags = i;
        }

        private void writeBaseDimension(String str, int i, int i2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be9eb4a7", new Object[]{this, str, new Integer(i), new Integer(i2)});
            } else if (i == i2) {
            } else {
                if (i == -2) {
                    Writer writer = this.mWriter;
                    writer.write(SPACE + str + "=\"wrap_content\"");
                } else if (i == -1) {
                    Writer writer2 = this.mWriter;
                    writer2.write(SPACE + str + "=\"match_parent\"");
                } else {
                    Writer writer3 = this.mWriter;
                    writer3.write(SPACE + str + "=\"" + i + "dp\"");
                }
            }
        }

        private void writeBoolen(String str, boolean z, boolean z2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5da034a3", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            } else if (z != z2) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str + "=\"" + z + "dp\"");
            }
        }

        private void writeDimension(String str, int i, int i2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fa135f8", new Object[]{this, str, new Integer(i), new Integer(i2)});
            } else if (i != i2) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str + "=\"" + i + "dp\"");
            }
        }

        private void writeEnum(String str, int i, String[] strArr, int i2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be8a15d6", new Object[]{this, str, new Integer(i), strArr, new Integer(i2)});
            } else if (i != i2) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str + "=\"" + strArr[i] + "\"");
            }
        }

        public String getName(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("46b1d505", new Object[]{this, new Integer(i)});
            }
            if (this.mIdMap.containsKey(Integer.valueOf(i))) {
                return "@+id/" + this.mIdMap.get(Integer.valueOf(i)) + "";
            } else if (i == 0) {
                return "parent";
            } else {
                String lookup = lookup(i);
                this.mIdMap.put(Integer.valueOf(i), lookup);
                return "@+id/" + lookup + "";
            }
        }

        public void writeCircle(int i, float f, int i2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51172f30", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            } else if (i != -1) {
                this.mWriter.write("circle");
                this.mWriter.write(":[");
                this.mWriter.write(getName(i));
                Writer writer = this.mWriter;
                writer.write(", " + f);
                Writer writer2 = this.mWriter;
                writer2.write(i2 + "]");
            }
        }

        public void writeConstraint(String str, int i, String str2, int i2, int i3) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e127b4a0", new Object[]{this, str, new Integer(i), str2, new Integer(i2), new Integer(i3)});
            } else if (i != -1) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                this.mWriter.write(":[");
                this.mWriter.write(getName(i));
                this.mWriter.write(" , ");
                this.mWriter.write(str2);
                if (i2 != 0) {
                    Writer writer2 = this.mWriter;
                    writer2.write(" , " + i2);
                }
                this.mWriter.write("],\n");
            }
        }

        public void writeVariable(String str, int i) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be1e10b7", new Object[]{this, str, new Integer(i)});
            } else if (i != 0 && i != -1) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str + "=\"" + i + "\"\n");
            }
        }

        public void writeXmlConstraint(String str, int i) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b65e833d", new Object[]{this, str, new Integer(i)});
            } else if (i != -1) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                Writer writer2 = this.mWriter;
                writer2.write("=\"" + getName(i) + "\"");
            }
        }

        public String lookup(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("95c38abe", new Object[]{this, new Integer(i)});
            }
            try {
                if (i != -1) {
                    return this.mContext.getResources().getResourceEntryName(i);
                }
                StringBuilder sb = new StringBuilder("unknown");
                int i2 = this.mUnknownCount + 1;
                this.mUnknownCount = i2;
                sb.append(i2);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder("unknown");
                int i3 = this.mUnknownCount + 1;
                this.mUnknownCount = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        public void writeVariable(String str, float f, float f2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a310cc", new Object[]{this, str, new Float(f), new Float(f2)});
            } else if (f != f2) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                Writer writer2 = this.mWriter;
                writer2.write("=\"" + f + "\"");
            }
        }

        public void writeVariable(String str, String str2, String str3) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b72c1ae0", new Object[]{this, str, str2, str3});
            } else if (str2 != null && !str2.equals(str3)) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                Writer writer2 = this.mWriter;
                writer2.write("=\"" + str2 + "\"");
            }
        }

        public void writeLayout() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f35603f0", new Object[]{this});
                return;
            }
            this.mWriter.write("\n<ConstraintSet>\n");
            for (Integer num : ConstraintSet.access$1300(ConstraintSet.this).keySet()) {
                String name = getName(num.intValue());
                this.mWriter.write("  <Constraint");
                Writer writer = this.mWriter;
                writer.write("\n       android:id=\"" + name + "\"");
                Layout layout = ((Constraint) ConstraintSet.access$1300(ConstraintSet.this).get(num)).layout;
                writeBaseDimension("android:layout_width", layout.mWidth, -5);
                writeBaseDimension("android:layout_height", layout.mHeight, -5);
                writeVariable("app:layout_constraintGuide_begin", layout.guideBegin, -1.0f);
                writeVariable("app:layout_constraintGuide_end", layout.guideEnd, -1.0f);
                writeVariable("app:layout_constraintGuide_percent", layout.guidePercent, -1.0f);
                writeVariable("app:layout_constraintHorizontal_bias", layout.horizontalBias, 0.5f);
                writeVariable("app:layout_constraintVertical_bias", layout.verticalBias, 0.5f);
                writeVariable("app:layout_constraintDimensionRatio", layout.dimensionRatio, (String) null);
                writeXmlConstraint("app:layout_constraintCircle", layout.circleConstraint);
                writeVariable("app:layout_constraintCircleRadius", layout.circleRadius, 0.0f);
                writeVariable("app:layout_constraintCircleAngle", layout.circleAngle, 0.0f);
                writeVariable("android:orientation", layout.orientation, -1.0f);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle, 0.0f);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle, 0.0f);
                writeVariable("app:barrierDirection", layout.mBarrierDirection, -1.0f);
                writeVariable("app:barrierMargin", layout.mBarrierMargin, 0.0f);
                writeDimension("app:layout_marginLeft", layout.leftMargin, 0);
                writeDimension("app:layout_goneMarginLeft", layout.goneLeftMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginRight", layout.rightMargin, 0);
                writeDimension("app:layout_goneMarginRight", layout.goneRightMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginStart", layout.startMargin, 0);
                writeDimension("app:layout_goneMarginStart", layout.goneStartMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginEnd", layout.endMargin, 0);
                writeDimension("app:layout_goneMarginEnd", layout.goneEndMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginTop", layout.topMargin, 0);
                writeDimension("app:layout_goneMarginTop", layout.goneTopMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginBottom", layout.bottomMargin, 0);
                writeDimension("app:layout_goneMarginBottom", layout.goneBottomMargin, Integer.MIN_VALUE);
                writeDimension("app:goneBaselineMargin", layout.goneBaselineMargin, Integer.MIN_VALUE);
                writeDimension("app:baselineMargin", layout.baselineMargin, 0);
                writeBoolen("app:layout_constrainedWidth", layout.constrainedWidth, false);
                writeBoolen("app:layout_constrainedHeight", layout.constrainedHeight, false);
                writeBoolen("app:barrierAllowsGoneWidgets", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("app:layout_wrapBehaviorInParent", layout.mWrapBehavior, 0.0f);
                writeXmlConstraint("app:baselineToBaseline", layout.baselineToBaseline);
                writeXmlConstraint("app:baselineToBottom", layout.baselineToBottom);
                writeXmlConstraint("app:baselineToTop", layout.baselineToTop);
                writeXmlConstraint("app:layout_constraintBottom_toBottomOf", layout.bottomToBottom);
                writeXmlConstraint("app:layout_constraintBottom_toTopOf", layout.bottomToTop);
                writeXmlConstraint("app:layout_constraintEnd_toEndOf", layout.endToEnd);
                writeXmlConstraint("app:layout_constraintEnd_toStartOf", layout.endToStart);
                writeXmlConstraint("app:layout_constraintLeft_toLeftOf", layout.leftToLeft);
                writeXmlConstraint("app:layout_constraintLeft_toRightOf", layout.leftToRight);
                writeXmlConstraint("app:layout_constraintRight_toLeftOf", layout.rightToLeft);
                writeXmlConstraint("app:layout_constraintRight_toRightOf", layout.rightToRight);
                writeXmlConstraint("app:layout_constraintStart_toEndOf", layout.startToEnd);
                writeXmlConstraint("app:layout_constraintStart_toStartOf", layout.startToStart);
                writeXmlConstraint("app:layout_constraintTop_toBottomOf", layout.topToBottom);
                writeXmlConstraint("app:layout_constraintTop_toTopOf", layout.topToTop);
                String[] strArr = {"spread", pg1.ATOM_EXT_wrap, xxl.PERCENT};
                writeEnum("app:layout_constraintHeight_default", layout.heightDefault, strArr, 0);
                writeVariable("app:layout_constraintHeight_percent", layout.heightPercent, 1.0f);
                writeDimension("app:layout_constraintHeight_min", layout.heightMin, 0);
                writeDimension("app:layout_constraintHeight_max", layout.heightMax, 0);
                writeBoolen("android:layout_constrainedHeight", layout.constrainedHeight, false);
                writeEnum("app:layout_constraintWidth_default", layout.widthDefault, strArr, 0);
                writeVariable("app:layout_constraintWidth_percent", layout.widthPercent, 1.0f);
                writeDimension("app:layout_constraintWidth_min", layout.widthMin, 0);
                writeDimension("app:layout_constraintWidth_max", layout.widthMax, 0);
                writeBoolen("android:layout_constrainedWidth", layout.constrainedWidth, false);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle);
                writeEnum("app:barrierDirection", layout.mBarrierDirection, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                writeVariable("app:layout_constraintTag", layout.mConstraintTag, (String) null);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    writeVariable("'ReferenceIds'", iArr);
                }
                this.mWriter.write(" />\n");
            }
            this.mWriter.write("</ConstraintSet>\n");
        }

        public void writeVariable(String str, int[] iArr) throws IOException {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5aca7da", new Object[]{this, str, iArr});
            } else if (iArr != null) {
                Writer writer = this.mWriter;
                writer.write(SPACE + str);
                this.mWriter.write(":");
                while (i < iArr.length) {
                    Writer writer2 = this.mWriter;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i == 0 ? "[" : ", ");
                    sb.append(getName(iArr[i]));
                    writer2.write(sb.toString());
                    i++;
                }
                this.mWriter.write("],\n");
            }
        }

        public void writeVariable(String str, String str2) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0882a96", new Object[]{this, str, str2});
            } else if (str2 != null) {
                this.mWriter.write(str);
                this.mWriter.write(":");
                this.mWriter.write(", ".concat(str2));
                this.mWriter.write("\n");
            }
        }
    }

    static {
        sMapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sMapToConstant.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        sMapToConstant.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        sMapToConstant.append(R.styleable.Constraint_guidelineUseRtl, 99);
        sMapToConstant.append(R.styleable.Constraint_android_orientation, 27);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginRight, 28);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginStart, 31);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginTop, 34);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        sMapToConstant.append(R.styleable.Constraint_android_layout_width, 23);
        sMapToConstant.append(R.styleable.Constraint_android_layout_height, 21);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth, 95);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight, 96);
        sMapToConstant.append(R.styleable.Constraint_android_visibility, 22);
        sMapToConstant.append(R.styleable.Constraint_android_alpha, 43);
        sMapToConstant.append(R.styleable.Constraint_android_elevation, 44);
        sMapToConstant.append(R.styleable.Constraint_android_rotationX, 45);
        sMapToConstant.append(R.styleable.Constraint_android_rotationY, 46);
        sMapToConstant.append(R.styleable.Constraint_android_rotation, 60);
        sMapToConstant.append(R.styleable.Constraint_android_scaleX, 47);
        sMapToConstant.append(R.styleable.Constraint_android_scaleY, 48);
        sMapToConstant.append(R.styleable.Constraint_android_transformPivotX, 49);
        sMapToConstant.append(R.styleable.Constraint_android_transformPivotY, 50);
        sMapToConstant.append(R.styleable.Constraint_android_translationX, 51);
        sMapToConstant.append(R.styleable.Constraint_android_translationY, 52);
        sMapToConstant.append(R.styleable.Constraint_android_translationZ, 53);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintCircle, 61);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        sMapToConstant.append(R.styleable.Constraint_animateRelativeTo, 64);
        sMapToConstant.append(R.styleable.Constraint_transitionEasing, 65);
        sMapToConstant.append(R.styleable.Constraint_drawPath, 66);
        sMapToConstant.append(R.styleable.Constraint_transitionPathRotate, 67);
        sMapToConstant.append(R.styleable.Constraint_motionStagger, 79);
        sMapToConstant.append(R.styleable.Constraint_android_id, 38);
        sMapToConstant.append(R.styleable.Constraint_motionProgress, 68);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        sMapToConstant.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        sMapToConstant.append(R.styleable.Constraint_chainUseRtl, 71);
        sMapToConstant.append(R.styleable.Constraint_barrierDirection, 72);
        sMapToConstant.append(R.styleable.Constraint_barrierMargin, 73);
        sMapToConstant.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        sMapToConstant.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        sMapToConstant.append(R.styleable.Constraint_pathMotionArc, 76);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTag, 77);
        sMapToConstant.append(R.styleable.Constraint_visibilityMode, 78);
        sMapToConstant.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        sMapToConstant.append(R.styleable.Constraint_layout_constrainedHeight, 81);
        sMapToConstant.append(R.styleable.Constraint_polarRelativeTo, 82);
        sMapToConstant.append(R.styleable.Constraint_transformPivotTarget, 83);
        sMapToConstant.append(R.styleable.Constraint_quantizeMotionSteps, 84);
        sMapToConstant.append(R.styleable.Constraint_quantizeMotionPhase, 85);
        sMapToConstant.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = sOverrideMapToConstant;
        int i = R.styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        sOverrideMapToConstant.append(i, 7);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_orientation, 27);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_visibility, 22);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_alpha, 43);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_elevation, 44);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotation, 60);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationX, 51);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationY, 52);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_drawPath, 66);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_motionStagger, 79);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_id, 38);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_motionTarget, 98);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_motionProgress, 68);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_barrierDirection, 72);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_barrierMargin, 73);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_visibilityMode, 78);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static /* synthetic */ int access$100(TypedArray typedArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66550f86", new Object[]{typedArray, new Integer(i), new Integer(i2)})).intValue();
        }
        return lookupID(typedArray, i, i2);
    }

    public static /* synthetic */ HashMap access$1300(ConstraintSet constraintSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e364ad3f", new Object[]{constraintSet});
        }
        return constraintSet.mConstraints;
    }

    public static /* synthetic */ int[] access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("adad420b", new Object[0]);
        }
        return VISIBILITY_FLAGS;
    }

    public static /* synthetic */ void access$300(Constraint constraint, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c223e2", new Object[]{constraint, new Integer(i), new Integer(i2)});
        } else {
            setDeltaValue(constraint, i, i2);
        }
    }

    public static /* synthetic */ void access$400(Constraint constraint, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("223014fe", new Object[]{constraint, new Integer(i), new Float(f)});
        } else {
            setDeltaValue(constraint, i, f);
        }
    }

    public static /* synthetic */ void access$500(Constraint constraint, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d864dcd", new Object[]{constraint, new Integer(i), str});
        } else {
            setDeltaValue(constraint, i, str);
        }
    }

    public static /* synthetic */ void access$600(Constraint constraint, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0c58d0", new Object[]{constraint, new Integer(i), new Boolean(z)});
        } else {
            setDeltaValue(constraint, i, z);
        }
    }

    private void addAttributes(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1965de79", new Object[]{this, attributeType, strArr});
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (this.mSavedAttributes.containsKey(strArr[i])) {
                ConstraintAttribute constraintAttribute = this.mSavedAttributes.get(strArr[i]);
                if (!(constraintAttribute == null || constraintAttribute.getType() == attributeType)) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
                }
            } else {
                this.mSavedAttributes.put(strArr[i], new ConstraintAttribute(strArr[i], attributeType));
            }
        }
    }

    public static Constraint buildDelta(Context context, XmlPullParser xmlPullParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constraint) ipChange.ipc$dispatch("affa98d", new Object[]{context, xmlPullParser});
        }
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, R.styleable.ConstraintOverride);
        populateOverride(constraint, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    private int[] convertReferenceString(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        for (String str2 : split) {
            String trim = str2.trim();
            try {
                i = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            i2++;
            iArr[i2] = i;
        }
        return i2 != split.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private Constraint fillFromAttributeList(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constraint) ipChange.ipc$dispatch("7403fa26", new Object[]{this, context, attributeSet, new Boolean(z)});
        }
        Constraint constraint = new Constraint();
        if (z) {
            iArr = R.styleable.ConstraintOverride;
        } else {
            iArr = R.styleable.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        populateConstraint(constraint, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    private Constraint get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constraint) ipChange.ipc$dispatch("c3db34b2", new Object[]{this, new Integer(i)});
        }
        if (!this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.put(Integer.valueOf(i), new Constraint());
        }
        return this.mConstraints.get(Integer.valueOf(i));
    }

    public static String getDebugName(int i) {
        Field[] declaredFields;
        for (Field field : ConstraintSet.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == i) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e) {
                    Log.e(TAG, "Error accessing ConstraintSet field", e);
                }
            }
        }
        return "UNKNOWN";
    }

    public static String getLine(Context context, int i, XmlPullParser xmlPullParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7753724a", new Object[]{context, new Integer(i), xmlPullParser});
        }
        return ".(" + Debug.getName(context, i) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    private static int lookupID(TypedArray typedArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("947fa1ea", new Object[]{typedArray, new Integer(i), new Integer(i2)})).intValue();
        }
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r6 == (-1)) goto L_0x0045;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void parseDimensionConstraints(java.lang.Object r5, android.content.res.TypedArray r6, int r7, int r8) {
        /*
            r0 = 3
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = androidx.constraintlayout.widget.ConstraintSet.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0025
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r5
            r8[r1] = r6
            r5 = 2
            r8[r5] = r4
            r8[r0] = r7
            java.lang.String r5 = "37b18a01"
            r3.ipc$dispatch(r5, r8)
            return
        L_0x0025:
            if (r5 != 0) goto L_0x0028
            return
        L_0x0028:
            android.util.TypedValue r3 = r6.peekValue(r7)
            int r3 = r3.type
            if (r3 == r0) goto L_0x0090
            r0 = 5
            if (r3 == r0) goto L_0x0049
            int r6 = r6.getInt(r7, r2)
            r7 = -4
            r0 = -2
            if (r6 == r7) goto L_0x0047
            r7 = -3
            if (r6 == r7) goto L_0x0043
            if (r6 == r0) goto L_0x0045
            r7 = -1
            if (r6 == r7) goto L_0x0045
        L_0x0043:
            r1 = 0
            goto L_0x004e
        L_0x0045:
            r2 = r6
            goto L_0x0043
        L_0x0047:
            r2 = -2
            goto L_0x004e
        L_0x0049:
            int r6 = r6.getDimensionPixelSize(r7, r2)
            goto L_0x0045
        L_0x004e:
            boolean r6 = r5 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r6 == 0) goto L_0x0060
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r5
            if (r8 != 0) goto L_0x005b
            r5.width = r2
            r5.constrainedWidth = r1
            goto L_0x008f
        L_0x005b:
            r5.height = r2
            r5.constrainedHeight = r1
            goto L_0x008f
        L_0x0060:
            boolean r6 = r5 instanceof androidx.constraintlayout.widget.ConstraintSet.Layout
            if (r6 == 0) goto L_0x0072
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = (androidx.constraintlayout.widget.ConstraintSet.Layout) r5
            if (r8 != 0) goto L_0x006d
            r5.mWidth = r2
            r5.constrainedWidth = r1
            goto L_0x008f
        L_0x006d:
            r5.mHeight = r2
            r5.constrainedHeight = r1
            goto L_0x008f
        L_0x0072:
            boolean r6 = r5 instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta
            if (r6 == 0) goto L_0x008f
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r5 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) r5
            if (r8 != 0) goto L_0x0085
            r6 = 23
            r5.add(r6, r2)
            r6 = 80
            r5.add(r6, r1)
            goto L_0x008f
        L_0x0085:
            r6 = 21
            r5.add(r6, r2)
            r6 = 81
            r5.add(r6, r1)
        L_0x008f:
            return
        L_0x0090:
            java.lang.String r6 = r6.getString(r7)
            parseDimensionConstraintsString(r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void parseDimensionRatioString(ConstraintLayout.LayoutParams layoutParams, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abbdba45", new Object[]{layoutParams, str});
            return;
        }
        float f = Float.NaN;
        int i2 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                }
                i2 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i);
                    if (substring2.length() > 0) {
                        f = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.dimensionRatio = str;
        layoutParams.mDimensionRatioValue = f;
        layoutParams.mDimensionRatioSide = i2;
    }

    private static void setDeltaValue(Constraint constraint, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b16d37", new Object[]{constraint, new Integer(i), new Float(f)});
        } else if (i == 19) {
            constraint.layout.guidePercent = f;
        } else if (i == 20) {
            constraint.layout.horizontalBias = f;
        } else if (i == 37) {
            constraint.layout.verticalBias = f;
        } else if (i == 60) {
            constraint.transform.rotation = f;
        } else if (i == 63) {
            constraint.layout.circleAngle = f;
        } else if (i == 79) {
            constraint.motion.mMotionStagger = f;
        } else if (i == 85) {
            constraint.motion.mQuantizeMotionPhase = f;
        } else if (i == 39) {
            constraint.layout.horizontalWeight = f;
        } else if (i != 40) {
            switch (i) {
                case 43:
                    constraint.propertySet.alpha = f;
                    return;
                case 44:
                    Transform transform = constraint.transform;
                    transform.elevation = f;
                    transform.applyElevation = true;
                    return;
                case 45:
                    constraint.transform.rotationX = f;
                    return;
                case 46:
                    constraint.transform.rotationY = f;
                    return;
                case 47:
                    constraint.transform.scaleX = f;
                    return;
                case 48:
                    constraint.transform.scaleY = f;
                    return;
                case 49:
                    constraint.transform.transformPivotX = f;
                    return;
                case 50:
                    constraint.transform.transformPivotY = f;
                    return;
                case 51:
                    constraint.transform.translationX = f;
                    return;
                case 52:
                    constraint.transform.translationY = f;
                    return;
                case 53:
                    constraint.transform.translationZ = f;
                    return;
                default:
                    switch (i) {
                        case 67:
                            constraint.motion.mPathRotate = f;
                            return;
                        case 68:
                            constraint.propertySet.mProgress = f;
                            return;
                        case 69:
                            constraint.layout.widthPercent = f;
                            return;
                        case 70:
                            constraint.layout.heightPercent = f;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            constraint.layout.verticalWeight = f;
        }
    }

    private String sideToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("550ec967", new Object[]{this, new Integer(i)});
        }
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void addColorAttributes(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b227edf", new Object[]{this, strArr});
        } else {
            addAttributes(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
        }
    }

    public void addFloatAttributes(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b458f06", new Object[]{this, strArr});
        } else {
            addAttributes(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
        }
    }

    public void addIntAttributes(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ef6413", new Object[]{this, strArr});
        } else {
            addAttributes(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
        }
    }

    public void addStringAttributes(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1f540f", new Object[]{this, strArr});
        } else {
            addAttributes(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
        }
    }

    public void addToHorizontalChain(int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88cc673b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (i2 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        connect(i, 1, i2, i4, 0);
        if (i3 == 0) {
            i5 = 2;
        } else {
            i5 = 1;
        }
        connect(i, 2, i3, i5, 0);
        if (i2 != 0) {
            connect(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            connect(i3, 1, i, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5818053", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (i2 == 0) {
            i4 = 6;
        } else {
            i4 = 7;
        }
        connect(i, 6, i2, i4, 0);
        if (i3 == 0) {
            i5 = 7;
        } else {
            i5 = 6;
        }
        connect(i, 7, i3, i5, 0);
        if (i2 != 0) {
            connect(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            connect(i3, 6, i, 7, 0);
        }
    }

    public void applyDeltaFrom(ConstraintSet constraintSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca272ae", new Object[]{this, constraintSet});
            return;
        }
        for (Constraint constraint : constraintSet.mConstraints.values()) {
            if (constraint.mDelta != null) {
                if (constraint.mTargetString == null) {
                    constraint.mDelta.applyDelta(getConstraint(constraint.mViewId));
                } else {
                    for (Integer num : this.mConstraints.keySet()) {
                        Constraint constraint2 = getConstraint(num.intValue());
                        String str = constraint2.layout.mConstraintTag;
                        if (str != null && constraint.mTargetString.matches(str)) {
                            constraint.mDelta.applyDelta(constraint2);
                            constraint2.mCustomConstraints.putAll((HashMap) constraint.mCustomConstraints.clone());
                        }
                    }
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db26061", new Object[]{this, constraintLayout});
            return;
        }
        applyToInternal(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        Constraint constraint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bd2531", new Object[]{this, constraintHelper, constraintWidget, layoutParams, sparseArray});
            return;
        }
        int id = constraintHelper.getId();
        if (this.mConstraints.containsKey(Integer.valueOf(id)) && (constraint = this.mConstraints.get(Integer.valueOf(id))) != null && (constraintWidget instanceof HelperWidget)) {
            constraintHelper.loadParameters(constraint, (HelperWidget) constraintWidget, layoutParams, sparseArray);
        }
    }

    public void applyToLayoutParams(int i, ConstraintLayout.LayoutParams layoutParams) {
        Constraint constraint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5004bae", new Object[]{this, new Integer(i), layoutParams});
        } else if (this.mConstraints.containsKey(Integer.valueOf(i)) && (constraint = this.mConstraints.get(Integer.valueOf(i))) != null) {
            constraint.applyTo(layoutParams);
        }
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c228ba", new Object[]{this, constraintLayout});
            return;
        }
        applyToInternal(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e03146a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Float(f)});
            return;
        }
        connect(i, 1, i2, i3, i4);
        connect(i, 2, i5, i6, i7);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
        if (constraint != null) {
            constraint.layout.horizontalBias = f;
        }
    }

    public void centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa66ca8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Float(f)});
            return;
        }
        connect(i, 6, i2, i3, i4);
        connect(i, 7, i5, i6, i7);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
        if (constraint != null) {
            constraint.layout.horizontalBias = f;
        }
    }

    public void centerVertically(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e2917c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Float(f)});
            return;
        }
        connect(i, 3, i2, i3, i4);
        connect(i, 4, i5, i6, i7);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
        if (constraint != null) {
            constraint.layout.verticalBias = f;
        }
    }

    public void clear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17cb12f", new Object[]{this, new Integer(i)});
        } else {
            this.mConstraints.remove(Integer.valueOf(i));
        }
    }

    public void clone(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db1969f", new Object[]{this, context, new Integer(i)});
        } else {
            clone((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
        }
    }

    public void connect(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fce8872", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        if (!this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.put(Integer.valueOf(i), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
        if (constraint != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        Layout layout = constraint.layout;
                        layout.leftToLeft = i3;
                        layout.leftToRight = -1;
                    } else if (i4 == 2) {
                        Layout layout2 = constraint.layout;
                        layout2.leftToRight = i3;
                        layout2.leftToLeft = -1;
                    } else {
                        throw new IllegalArgumentException("Left to " + sideToString(i4) + " undefined");
                    }
                    constraint.layout.leftMargin = i5;
                    return;
                case 2:
                    if (i4 == 1) {
                        Layout layout3 = constraint.layout;
                        layout3.rightToLeft = i3;
                        layout3.rightToRight = -1;
                    } else if (i4 == 2) {
                        Layout layout4 = constraint.layout;
                        layout4.rightToRight = i3;
                        layout4.rightToLeft = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                    constraint.layout.rightMargin = i5;
                    return;
                case 3:
                    if (i4 == 3) {
                        Layout layout5 = constraint.layout;
                        layout5.topToTop = i3;
                        layout5.topToBottom = -1;
                        layout5.baselineToBaseline = -1;
                        layout5.baselineToTop = -1;
                        layout5.baselineToBottom = -1;
                    } else if (i4 == 4) {
                        Layout layout6 = constraint.layout;
                        layout6.topToBottom = i3;
                        layout6.topToTop = -1;
                        layout6.baselineToBaseline = -1;
                        layout6.baselineToTop = -1;
                        layout6.baselineToBottom = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                    constraint.layout.topMargin = i5;
                    return;
                case 4:
                    if (i4 == 4) {
                        Layout layout7 = constraint.layout;
                        layout7.bottomToBottom = i3;
                        layout7.bottomToTop = -1;
                        layout7.baselineToBaseline = -1;
                        layout7.baselineToTop = -1;
                        layout7.baselineToBottom = -1;
                    } else if (i4 == 3) {
                        Layout layout8 = constraint.layout;
                        layout8.bottomToTop = i3;
                        layout8.bottomToBottom = -1;
                        layout8.baselineToBaseline = -1;
                        layout8.baselineToTop = -1;
                        layout8.baselineToBottom = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                    constraint.layout.bottomMargin = i5;
                    return;
                case 5:
                    if (i4 == 5) {
                        Layout layout9 = constraint.layout;
                        layout9.baselineToBaseline = i3;
                        layout9.bottomToBottom = -1;
                        layout9.bottomToTop = -1;
                        layout9.topToTop = -1;
                        layout9.topToBottom = -1;
                        return;
                    } else if (i4 == 3) {
                        Layout layout10 = constraint.layout;
                        layout10.baselineToTop = i3;
                        layout10.bottomToBottom = -1;
                        layout10.bottomToTop = -1;
                        layout10.topToTop = -1;
                        layout10.topToBottom = -1;
                        return;
                    } else if (i4 == 4) {
                        Layout layout11 = constraint.layout;
                        layout11.baselineToBottom = i3;
                        layout11.bottomToBottom = -1;
                        layout11.bottomToTop = -1;
                        layout11.topToTop = -1;
                        layout11.topToBottom = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                case 6:
                    if (i4 == 6) {
                        Layout layout12 = constraint.layout;
                        layout12.startToStart = i3;
                        layout12.startToEnd = -1;
                    } else if (i4 == 7) {
                        Layout layout13 = constraint.layout;
                        layout13.startToEnd = i3;
                        layout13.startToStart = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                    constraint.layout.startMargin = i5;
                    return;
                case 7:
                    if (i4 == 7) {
                        Layout layout14 = constraint.layout;
                        layout14.endToEnd = i3;
                        layout14.endToStart = -1;
                    } else if (i4 == 6) {
                        Layout layout15 = constraint.layout;
                        layout15.endToStart = i3;
                        layout15.endToEnd = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                    constraint.layout.endMargin = i5;
                    return;
                default:
                    throw new IllegalArgumentException(sideToString(i2) + " to " + sideToString(i4) + " unknown");
            }
        }
    }

    public void constrainCircle(int i, int i2, int i3, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b47cab", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Float(f)});
            return;
        }
        Layout layout = get(i).layout;
        layout.circleConstraint = i2;
        layout.circleRadius = i3;
        layout.circleAngle = f;
    }

    public void constrainDefaultHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85443cf8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.heightDefault = i2;
        }
    }

    public void constrainDefaultWidth(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88bd3543", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.widthDefault = i2;
        }
    }

    public void constrainHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e1aa25", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.mHeight = i2;
        }
    }

    public void constrainMaxHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70b5c1b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.heightMax = i2;
        }
    }

    public void constrainMaxWidth(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d425c0", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.widthMax = i2;
        }
    }

    public void constrainMinHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db6809", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.heightMin = i2;
        }
    }

    public void constrainMinWidth(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fbe412", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.widthMin = i2;
        }
    }

    public void constrainPercentHeight(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5fd9b9", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).layout.heightPercent = f;
        }
    }

    public void constrainPercentWidth(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54a717c", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).layout.widthPercent = f;
        }
    }

    public void constrainWidth(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb56ee76", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.mWidth = i2;
        }
    }

    public void constrainedHeight(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e651e55", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            get(i).layout.constrainedHeight = z;
        }
    }

    public void constrainedWidth(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777c7208", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            get(i).layout.constrainedWidth = z;
        }
    }

    public void create(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1824d323", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Layout layout = get(i).layout;
        layout.mIsGuideline = true;
        layout.orientation = i2;
    }

    public void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9955ea2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, fArr, new Integer(i5)});
        } else {
            createHorizontalChain(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
        }
    }

    public void createHorizontalChainRtl(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2efdba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, fArr, new Integer(i5)});
        } else {
            createHorizontalChain(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
        }
    }

    public void dump(MotionScene motionScene, int... iArr) {
        HashSet hashSet;
        Integer[] numArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89bc9352", new Object[]{this, motionScene, iArr});
            return;
        }
        Set<Integer> keySet = this.mConstraints.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            Constraint constraint = this.mConstraints.get(num);
            if (constraint != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                constraint.layout.dump(motionScene, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    public boolean getApplyElevation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("650656fb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return get(i).transform.applyElevation;
    }

    public Constraint getConstraint(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constraint) ipChange.ipc$dispatch("50841a95", new Object[]{this, new Integer(i)});
        }
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            return this.mConstraints.get(Integer.valueOf(i));
        }
        return null;
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("502a1a97", new Object[]{this});
        }
        return this.mSavedAttributes;
    }

    public int getHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9978d552", new Object[]{this, new Integer(i)})).intValue();
        }
        return get(i).layout.mHeight;
    }

    public int[] getKnownIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9f2a9a32", new Object[]{this});
        }
        Integer[] numArr = (Integer[]) this.mConstraints.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public Constraint getParameters(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constraint) ipChange.ipc$dispatch("ad5b20e8", new Object[]{this, new Integer(i)});
        }
        return get(i);
    }

    public int[] getReferencedIds(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4eb32411", new Object[]{this, new Integer(i)});
        }
        int[] iArr = get(i).layout.mReferenceIds;
        if (iArr == null) {
            return new int[0];
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public String[] getStateLabels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("76b9a3d0", new Object[]{this});
        }
        String[] strArr = this.mMatchLabels;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public int getVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63840947", new Object[]{this, new Integer(i)})).intValue();
        }
        return get(i).propertySet.visibility;
    }

    public int getVisibilityMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("413ec164", new Object[]{this, new Integer(i)})).intValue();
        }
        return get(i).propertySet.mVisibilityMode;
    }

    public int getWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cd1b53f", new Object[]{this, new Integer(i)})).intValue();
        }
        return get(i).layout.mWidth;
    }

    public boolean isForceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e778367", new Object[]{this})).booleanValue();
        }
        return this.mForceId;
    }

    public boolean isValidateOnParse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16e4361f", new Object[]{this})).booleanValue();
        }
        return this.mValidate;
    }

    public void load(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58836868", new Object[]{this, context, new Integer(i)});
            return;
        }
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    Constraint fillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        fillFromAttributeList.layout.mIsGuideline = true;
                    }
                    this.mConstraints.put(Integer.valueOf(fillFromAttributeList.mViewId), fillFromAttributeList);
                }
            }
        } catch (IOException e) {
            Log.e(TAG, "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e(TAG, "Error parsing resource: " + i, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean matchesLabels(java.lang.String... r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.constraintlayout.widget.ConstraintSet.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "63c115ea"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r9
            r4[r1] = r10
            java.lang.Object r10 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x001c:
            int r2 = r10.length
            r3 = 0
        L_0x001e:
            if (r3 >= r2) goto L_0x0035
            r4 = r10[r3]
            java.lang.String[] r5 = r9.mMatchLabels
            int r6 = r5.length
            r7 = 0
        L_0x0026:
            if (r7 >= r6) goto L_0x0034
            r8 = r5[r7]
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0032
            int r3 = r3 + r1
            goto L_0x001e
        L_0x0032:
            int r7 = r7 + r1
            goto L_0x0026
        L_0x0034:
            return r0
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.matchesLabels(java.lang.String[]):boolean");
    }

    public void parseColorAttributes(Constraint constraint, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65191818", new Object[]{this, constraint, str});
            return;
        }
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                new StringBuilder(" Unable to parse ").append(split[i]);
            } else {
                Constraint.access$1000(constraint, split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    public void parseFloatAttributes(Constraint constraint, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfa597f", new Object[]{this, constraint, str});
            return;
        }
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                new StringBuilder(" Unable to parse ").append(split[i]);
            } else {
                Constraint.access$1100(constraint, split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    public void parseStringAttributes(Constraint constraint, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d50bf64", new Object[]{this, constraint, str});
            return;
        }
        String[] splitString = splitString(str);
        for (int i = 0; i < splitString.length; i++) {
            String[] split = splitString[i].split("=");
            new StringBuilder(" Unable to parse ").append(splitString[i]);
            Constraint.access$1200(constraint, split[0], split[1]);
        }
    }

    public void readFallback(ConstraintSet constraintSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd0b392", new Object[]{this, constraintSet});
            return;
        }
        for (Integer num : constraintSet.mConstraints.keySet()) {
            num.intValue();
            Constraint constraint = constraintSet.mConstraints.get(num);
            if (!this.mConstraints.containsKey(num)) {
                this.mConstraints.put(num, new Constraint());
            }
            Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2 != null) {
                Layout layout = constraint2.layout;
                if (!layout.mApply) {
                    layout.copyFrom(constraint.layout);
                }
                PropertySet propertySet = constraint2.propertySet;
                if (!propertySet.mApply) {
                    propertySet.copyFrom(constraint.propertySet);
                }
                Transform transform = constraint2.transform;
                if (!transform.mApply) {
                    transform.copyFrom(constraint.transform);
                }
                Motion motion = constraint2.motion;
                if (!motion.mApply) {
                    motion.copyFrom(constraint.motion);
                }
                for (String str : constraint.mCustomConstraints.keySet()) {
                    if (!constraint2.mCustomConstraints.containsKey(str)) {
                        constraint2.mCustomConstraints.put(str, constraint.mCustomConstraints.get(str));
                    }
                }
            }
        }
    }

    public void removeAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("267eb709", new Object[]{this, str});
        } else {
            this.mSavedAttributes.remove(str);
        }
    }

    public void removeFromVerticalChain(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6226483f", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
            if (constraint != null) {
                Layout layout = constraint.layout;
                int i2 = layout.topToBottom;
                int i3 = layout.bottomToTop;
                if (!(i2 == -1 && i3 == -1)) {
                    if (i2 == -1 || i3 == -1) {
                        int i4 = layout.bottomToBottom;
                        if (i4 != -1) {
                            connect(i2, 4, i4, 4, 0);
                        } else {
                            int i5 = layout.topToTop;
                            if (i5 != -1) {
                                connect(i3, 3, i5, 3, 0);
                            }
                        }
                    } else {
                        connect(i2, 4, i3, 3, 0);
                        connect(i3, 3, i2, 4, 0);
                    }
                }
            } else {
                return;
            }
        }
        clear(i, 3);
        clear(i, 4);
    }

    public void setAlpha(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575b4100", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).propertySet.alpha = f;
        }
    }

    public void setApplyElevation(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61869c9", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            get(i).transform.applyElevation = z;
        }
    }

    public void setBarrierType(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29dab5b6", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.mHelperType = i2;
        }
    }

    public void setColorValue(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21bdb6d", new Object[]{this, new Integer(i), str, new Integer(i2)});
        } else {
            Constraint.access$1000(get(i), str, i2);
        }
    }

    public void setDimensionRatio(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a032ff", new Object[]{this, new Integer(i), str});
        } else {
            get(i).layout.dimensionRatio = str;
        }
    }

    public void setEditorAbsoluteX(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c45dfb9", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.editorAbsoluteX = i2;
        }
    }

    public void setEditorAbsoluteY(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("412c1afa", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.editorAbsoluteY = i2;
        }
    }

    public void setElevation(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805373bf", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        get(i).transform.elevation = f;
        get(i).transform.applyElevation = true;
    }

    public void setFloatValue(int i, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95230bd1", new Object[]{this, new Integer(i), str, new Float(f)});
        } else {
            Constraint.access$1100(get(i), str, f);
        }
    }

    public void setForceId(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15163709", new Object[]{this, new Boolean(z)});
        } else {
            this.mForceId = z;
        }
    }

    public void setGoneMargin(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e150ad", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        Constraint constraint = get(i);
        switch (i2) {
            case 1:
                constraint.layout.goneLeftMargin = i3;
                return;
            case 2:
                constraint.layout.goneRightMargin = i3;
                return;
            case 3:
                constraint.layout.goneTopMargin = i3;
                return;
            case 4:
                constraint.layout.goneBottomMargin = i3;
                return;
            case 5:
                constraint.layout.goneBaselineMargin = i3;
                return;
            case 6:
                constraint.layout.goneStartMargin = i3;
                return;
            case 7:
                constraint.layout.goneEndMargin = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e598582", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        get(i).layout.guideBegin = i2;
        get(i).layout.guideEnd = -1;
        get(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103f9cb4", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        get(i).layout.guideEnd = i2;
        get(i).layout.guideBegin = -1;
        get(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbaec5b", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        get(i).layout.guidePercent = f;
        get(i).layout.guideEnd = -1;
        get(i).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a12bea3", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).layout.horizontalBias = f;
        }
    }

    public void setHorizontalChainStyle(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c8bcdd", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.horizontalChainStyle = i2;
        }
    }

    public void setHorizontalWeight(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2639a2", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).layout.horizontalWeight = f;
        }
    }

    public void setIntValue(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3466e1", new Object[]{this, new Integer(i), str, new Integer(i2)});
        } else {
            Constraint.access$900(get(i), str, i2);
        }
    }

    public void setLayoutWrapBehavior(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c17ba2f", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 >= 0 && i2 <= 3) {
            get(i).layout.mWrapBehavior = i2;
        }
    }

    public void setMargin(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c4df60c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        Constraint constraint = get(i);
        switch (i2) {
            case 1:
                constraint.layout.leftMargin = i3;
                return;
            case 2:
                constraint.layout.rightMargin = i3;
                return;
            case 3:
                constraint.layout.topMargin = i3;
                return;
            case 4:
                constraint.layout.bottomMargin = i3;
                return;
            case 5:
                constraint.layout.baselineMargin = i3;
                return;
            case 6:
                constraint.layout.startMargin = i3;
                return;
            case 7:
                constraint.layout.endMargin = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i, int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b008d", new Object[]{this, new Integer(i), iArr});
        } else {
            get(i).layout.mReferenceIds = iArr;
        }
    }

    public void setRotation(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350601e4", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.rotation = f;
        }
    }

    public void setRotationX(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21edc43c", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.rotationX = f;
        }
    }

    public void setRotationY(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d3ff7d", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.rotationY = f;
        }
    }

    public void setScaleX(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fc8f34", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.scaleX = f;
        }
    }

    public void setScaleY(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de2ca75", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.scaleY = f;
        }
    }

    public void setStateLabels(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e59e3f", new Object[]{this, str});
            return;
        }
        this.mMatchLabels = str.split(",");
        while (true) {
            String[] strArr = this.mMatchLabels;
            if (i < strArr.length) {
                strArr[i] = strArr[i].trim();
                i++;
            } else {
                return;
            }
        }
    }

    public void setStateLabelsList(String... strArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9d6bcc", new Object[]{this, strArr});
            return;
        }
        this.mMatchLabels = strArr;
        while (true) {
            String[] strArr2 = this.mMatchLabels;
            if (i < strArr2.length) {
                strArr2[i] = strArr2[i].trim();
                i++;
            } else {
                return;
            }
        }
    }

    public void setStringValue(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("612ad212", new Object[]{this, new Integer(i), str, str2});
        } else {
            Constraint.access$1200(get(i), str, str2);
        }
    }

    public void setTransformPivot(int i, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8920d824", new Object[]{this, new Integer(i), new Float(f), new Float(f2)});
            return;
        }
        Transform transform = get(i).transform;
        transform.transformPivotY = f2;
        transform.transformPivotX = f;
    }

    public void setTransformPivotX(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f53fa04", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.transformPivotX = f;
        }
    }

    public void setTransformPivotY(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743a3545", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.transformPivotY = f;
        }
    }

    public void setTranslation(int i, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cffc88d", new Object[]{this, new Integer(i), new Float(f), new Float(f2)});
            return;
        }
        Transform transform = get(i).transform;
        transform.translationX = f;
        transform.translationY = f2;
    }

    public void setTranslationX(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d332ea6d", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.translationX = f;
        }
    }

    public void setTranslationY(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81925ae", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.translationY = f;
        }
    }

    public void setTranslationZ(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cff60ef", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).transform.translationZ = f;
        }
    }

    public void setValidateOnParse(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d2351", new Object[]{this, new Boolean(z)});
        } else {
            this.mValidate = z;
        }
    }

    public void setVerticalBias(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2e13f5", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).layout.verticalBias = f;
        }
    }

    public void setVerticalChainStyle(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480f4caf", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).layout.verticalChainStyle = i2;
        }
    }

    public void setVerticalWeight(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c18274", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            get(i).layout.verticalWeight = f;
        }
    }

    public void setVisibility(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0fa293b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).propertySet.visibility = i2;
        }
    }

    public void setVisibilityMode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ed0ebe", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            get(i).propertySet.mVisibilityMode = i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Layout {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_MARGIN = 80;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BASELINE_TO_BOTTOM = 78;
        private static final int BASELINE_TO_TOP = 77;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINED_HEIGHT = 88;
        private static final int CONSTRAINED_WIDTH = 87;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int CONSTRAINT_TAG = 89;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BASELINE_MARGIN = 79;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int GUIDE_USE_RTL = 90;
        private static final int HEIGHT_DEFAULT = 82;
        private static final int HEIGHT_MAX = 83;
        private static final int HEIGHT_MIN = 85;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_CONSTRAINT_HEIGHT = 42;
        private static final int LAYOUT_CONSTRAINT_WIDTH = 41;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LAYOUT_WRAP_BEHAVIOR = 76;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
        private static final int UNUSED = 91;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_DEFAULT = 81;
        private static final int WIDTH_MAX = 84;
        private static final int WIDTH_MIN = 86;
        private static final int WIDTH_PERCENT = 69;
        private static SparseIntArray sMapToConstant;
        public String mConstraintTag;
        public int mHeight;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public boolean mOverride = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int baselineToTop = -1;
        public int baselineToBottom = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = 0;
        public int rightMargin = 0;
        public int topMargin = 0;
        public int bottomMargin = 0;
        public int endMargin = 0;
        public int startMargin = 0;
        public int baselineMargin = 0;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = 0;
        public int heightMax = 0;
        public int widthMin = 0;
        public int heightMin = 0;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mWrapBehavior = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sMapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            sMapToConstant.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            sMapToConstant.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            sMapToConstant.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            sMapToConstant.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            sMapToConstant.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            sMapToConstant.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            sMapToConstant.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            sMapToConstant.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            sMapToConstant.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            sMapToConstant.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            SparseIntArray sparseIntArray2 = sMapToConstant;
            int i = R.styleable.Layout_guidelineUseRtl;
            sparseIntArray2.append(i, 90);
            sMapToConstant.append(R.styleable.Layout_android_orientation, 26);
            sMapToConstant.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            sMapToConstant.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            sMapToConstant.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            sMapToConstant.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginTop, 16);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginRight, 14);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginStart, 15);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            sMapToConstant.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            sMapToConstant.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            sMapToConstant.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            sMapToConstant.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            sMapToConstant.append(R.styleable.Layout_layout_constraintLeft_creator, 91);
            sMapToConstant.append(R.styleable.Layout_layout_constraintTop_creator, 91);
            sMapToConstant.append(R.styleable.Layout_layout_constraintRight_creator, 91);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBottom_creator, 91);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBaseline_creator, 91);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginLeft, 23);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginRight, 27);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginStart, 30);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginEnd, 8);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginTop, 33);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginBottom, 2);
            sMapToConstant.append(R.styleable.Layout_android_layout_width, 22);
            sMapToConstant.append(R.styleable.Layout_android_layout_height, 21);
            SparseIntArray sparseIntArray3 = sMapToConstant;
            int i2 = R.styleable.Layout_layout_constraintWidth;
            sparseIntArray3.append(i2, 41);
            SparseIntArray sparseIntArray4 = sMapToConstant;
            int i3 = R.styleable.Layout_layout_constraintHeight;
            sparseIntArray4.append(i3, 42);
            sMapToConstant.append(R.styleable.Layout_layout_constrainedWidth, 87);
            sMapToConstant.append(R.styleable.Layout_layout_constrainedHeight, 88);
            sMapToConstant.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            sMapToConstant.append(R.styleable.Layout_layout_constraintCircle, 61);
            sMapToConstant.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            sMapToConstant.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            sMapToConstant.append(R.styleable.Layout_chainUseRtl, 71);
            sMapToConstant.append(R.styleable.Layout_barrierDirection, 72);
            sMapToConstant.append(R.styleable.Layout_barrierMargin, 73);
            sMapToConstant.append(R.styleable.Layout_constraint_referenced_ids, 74);
            sMapToConstant.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
            SparseIntArray sparseIntArray5 = sMapToConstant;
            int i4 = R.styleable.Layout_layout_constraintWidth_max;
            sparseIntArray5.append(i4, 84);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth_min, 86);
            sMapToConstant.append(i4, 83);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHeight_min, 85);
            sMapToConstant.append(i2, 87);
            sMapToConstant.append(i3, 88);
            sMapToConstant.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 89);
            sMapToConstant.append(i, 90);
        }

        public void copyFrom(Layout layout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46e07109", new Object[]{this, layout});
                return;
            }
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.guidelineUseRtl = layout.guidelineUseRtl;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.baselineToTop = layout.baselineToTop;
            this.baselineToBottom = layout.baselineToBottom;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.baselineMargin = layout.baselineMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.goneBaselineMargin = layout.goneBaselineMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr == null || layout.mReferenceIdString != null) {
                this.mReferenceIds = null;
            } else {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = layout.mWrapBehavior;
        }

        public void dump(MotionScene motionScene, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object lookUpConstraintName = motionScene.lookUpConstraintName(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(lookUpConstraintName == null ? num : lookUpConstraintName);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f = (Float) obj;
                            if (f.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e) {
                        Log.e(ConstraintSet.TAG, "Error accessing ConstraintSet field", e);
                    }
                }
            }
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e59da", new Object[]{this, context, attributeSet});
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = sMapToConstant.get(index);
                switch (i2) {
                    case 1:
                        this.baselineToBaseline = ConstraintSet.access$100(obtainStyledAttributes, index, this.baselineToBaseline);
                        break;
                    case 2:
                        this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                        break;
                    case 3:
                        this.bottomToBottom = ConstraintSet.access$100(obtainStyledAttributes, index, this.bottomToBottom);
                        break;
                    case 4:
                        this.bottomToTop = ConstraintSet.access$100(obtainStyledAttributes, index, this.bottomToTop);
                        break;
                    case 5:
                        this.dimensionRatio = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                        break;
                    case 7:
                        this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                        break;
                    case 8:
                        this.endMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                        break;
                    case 9:
                        this.endToEnd = ConstraintSet.access$100(obtainStyledAttributes, index, this.endToEnd);
                        break;
                    case 10:
                        this.endToStart = ConstraintSet.access$100(obtainStyledAttributes, index, this.endToStart);
                        break;
                    case 11:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 12:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 13:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 14:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 15:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 16:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 17:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 18:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 19:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 20:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 21:
                        this.mHeight = obtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                        break;
                    case 22:
                        this.mWidth = obtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                        break;
                    case 23:
                        this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                        break;
                    case 24:
                        this.leftToLeft = ConstraintSet.access$100(obtainStyledAttributes, index, this.leftToLeft);
                        break;
                    case 25:
                        this.leftToRight = ConstraintSet.access$100(obtainStyledAttributes, index, this.leftToRight);
                        break;
                    case 26:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 27:
                        this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                        break;
                    case 28:
                        this.rightToLeft = ConstraintSet.access$100(obtainStyledAttributes, index, this.rightToLeft);
                        break;
                    case 29:
                        this.rightToRight = ConstraintSet.access$100(obtainStyledAttributes, index, this.rightToRight);
                        break;
                    case 30:
                        this.startMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                        break;
                    case 31:
                        this.startToEnd = ConstraintSet.access$100(obtainStyledAttributes, index, this.startToEnd);
                        break;
                    case 32:
                        this.startToStart = ConstraintSet.access$100(obtainStyledAttributes, index, this.startToStart);
                        break;
                    case 33:
                        this.topMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                        break;
                    case 34:
                        this.topToBottom = ConstraintSet.access$100(obtainStyledAttributes, index, this.topToBottom);
                        break;
                    case 35:
                        this.topToTop = ConstraintSet.access$100(obtainStyledAttributes, index, this.topToTop);
                        break;
                    case 36:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 37:
                        this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                        break;
                    case 38:
                        this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                        break;
                    case 39:
                        this.horizontalChainStyle = obtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                        break;
                    case 40:
                        this.verticalChainStyle = obtainStyledAttributes.getInt(index, this.verticalChainStyle);
                        break;
                    case 41:
                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.circleConstraint = ConstraintSet.access$100(obtainStyledAttributes, index, this.circleConstraint);
                                continue;
                            case 62:
                                this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                continue;
                            case 63:
                                this.circleAngle = obtainStyledAttributes.getFloat(index, this.circleAngle);
                                continue;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.widthPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.heightPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e(ConstraintSet.TAG, "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.mBarrierDirection = obtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                        continue;
                                    case 73:
                                        this.mBarrierMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                        continue;
                                    case 74:
                                        this.mReferenceIdString = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.mBarrierAllowsGoneWidgets = obtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                        continue;
                                    case 76:
                                        this.mWrapBehavior = obtainStyledAttributes.getInt(index, this.mWrapBehavior);
                                        continue;
                                    case 77:
                                        this.baselineToTop = ConstraintSet.access$100(obtainStyledAttributes, index, this.baselineToTop);
                                        continue;
                                    case 78:
                                        this.baselineToBottom = ConstraintSet.access$100(obtainStyledAttributes, index, this.baselineToBottom);
                                        continue;
                                    case 79:
                                        this.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                        continue;
                                    case 80:
                                        this.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                        continue;
                                    case 81:
                                        this.widthDefault = obtainStyledAttributes.getInt(index, this.widthDefault);
                                        continue;
                                    case 82:
                                        this.heightDefault = obtainStyledAttributes.getInt(index, this.heightDefault);
                                        continue;
                                    case 83:
                                        this.heightMax = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                        continue;
                                    case 84:
                                        this.widthMax = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                        continue;
                                    case 85:
                                        this.heightMin = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                        continue;
                                    case 86:
                                        this.widthMin = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                        continue;
                                    case 87:
                                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                                        continue;
                                    case 88:
                                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                                        continue;
                                    case 89:
                                        this.mConstraintTag = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.guidelineUseRtl = obtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        continue;
                                    case 91:
                                        StringBuilder sb = new StringBuilder("unused attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(sMapToConstant.get(index));
                                        continue;
                                    default:
                                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(sMapToConstant.get(index));
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    private void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c69e82", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, fArr, new Integer(i5), new Integer(i6), new Integer(i7)});
        } else if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr == null || fArr.length == iArr.length) {
            if (fArr != null) {
                get(iArr[0]).layout.horizontalWeight = fArr[0];
            }
            get(iArr[0]).layout.horizontalChainStyle = i5;
            connect(iArr[0], i6, i, i2, -1);
            for (int i8 = 1; i8 < iArr.length; i8++) {
                int i9 = i8 - 1;
                connect(iArr[i8], i6, iArr[i9], i7, -1);
                connect(iArr[i9], i7, iArr[i8], i6, -1);
                if (fArr != null) {
                    get(iArr[i8]).layout.horizontalWeight = fArr[i8];
                }
            }
            connect(iArr[iArr.length - 1], i7, i3, i4, -1);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    public void clear(int i, int i2) {
        Constraint constraint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e19e7b4", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mConstraints.containsKey(Integer.valueOf(i)) && (constraint = this.mConstraints.get(Integer.valueOf(i))) != null) {
            switch (i2) {
                case 1:
                    Layout layout = constraint.layout;
                    layout.leftToRight = -1;
                    layout.leftToLeft = -1;
                    layout.leftMargin = -1;
                    layout.goneLeftMargin = Integer.MIN_VALUE;
                    return;
                case 2:
                    Layout layout2 = constraint.layout;
                    layout2.rightToRight = -1;
                    layout2.rightToLeft = -1;
                    layout2.rightMargin = -1;
                    layout2.goneRightMargin = Integer.MIN_VALUE;
                    return;
                case 3:
                    Layout layout3 = constraint.layout;
                    layout3.topToBottom = -1;
                    layout3.topToTop = -1;
                    layout3.topMargin = 0;
                    layout3.goneTopMargin = Integer.MIN_VALUE;
                    return;
                case 4:
                    Layout layout4 = constraint.layout;
                    layout4.bottomToTop = -1;
                    layout4.bottomToBottom = -1;
                    layout4.bottomMargin = 0;
                    layout4.goneBottomMargin = Integer.MIN_VALUE;
                    return;
                case 5:
                    Layout layout5 = constraint.layout;
                    layout5.baselineToBaseline = -1;
                    layout5.baselineToTop = -1;
                    layout5.baselineToBottom = -1;
                    layout5.baselineMargin = 0;
                    layout5.goneBaselineMargin = Integer.MIN_VALUE;
                    return;
                case 6:
                    Layout layout6 = constraint.layout;
                    layout6.startToEnd = -1;
                    layout6.startToStart = -1;
                    layout6.startMargin = 0;
                    layout6.goneStartMargin = Integer.MIN_VALUE;
                    return;
                case 7:
                    Layout layout7 = constraint.layout;
                    layout7.endToStart = -1;
                    layout7.endToEnd = -1;
                    layout7.endMargin = 0;
                    layout7.goneEndMargin = Integer.MIN_VALUE;
                    return;
                case 8:
                    Layout layout8 = constraint.layout;
                    layout8.circleAngle = -1.0f;
                    layout8.circleRadius = -1;
                    layout8.circleConstraint = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void clone(ConstraintSet constraintSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ac6b9d7", new Object[]{this, constraintSet});
            return;
        }
        this.mConstraints.clear();
        for (Integer num : constraintSet.mConstraints.keySet()) {
            Constraint constraint = constraintSet.mConstraints.get(num);
            if (constraint != null) {
                this.mConstraints.put(num, constraint.clone());
            }
        }
    }

    public void writeState(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89978b", new Object[]{this, writer, constraintLayout, new Integer(i)});
            return;
        }
        writer.write("\n---------------------------------------------\n");
        if ((i & 1) == 1) {
            new WriteXmlEngine(writer, constraintLayout, i).writeLayout();
        } else {
            new WriteJsonEngine(writer, constraintLayout, i).writeLayout();
        }
        writer.write("\n---------------------------------------------\n");
    }

    private static String[] splitString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fd3230eb", new Object[]{str});
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c == ',' && !z) {
                arrayList.add(new String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (c == '\"') {
                z = !z;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void addToVerticalChain(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd5ae8d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        connect(i, 3, i2, i2 == 0 ? 3 : 4, 0);
        connect(i, 4, i3, i3 == 0 ? 4 : 3, 0);
        if (i2 != 0) {
            connect(i2, 4, i, 3, 0);
        }
        if (i3 != 0) {
            connect(i3, 3, i, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        Constraint constraint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2cb6914", new Object[]{this, constraintLayout});
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                new StringBuilder("id unknown ").append(Debug.getName(childAt));
            } else if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.mConstraints.containsKey(Integer.valueOf(id)) && (constraint = this.mConstraints.get(Integer.valueOf(id))) != null) {
                ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
            }
        }
    }

    public void applyToInternal(ConstraintLayout constraintLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eeb570", new Object[]{this, constraintLayout, new Boolean(z)});
            return;
        }
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.mConstraints.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                new StringBuilder("id unknown ").append(Debug.getName(childAt));
            } else if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.mConstraints.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                    if (constraint != null) {
                        if (childAt instanceof Barrier) {
                            constraint.layout.mHelperType = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(constraint.layout.mBarrierDirection);
                            barrier.setMargin(constraint.layout.mBarrierMargin);
                            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                            Layout layout = constraint.layout;
                            int[] iArr = layout.mReferenceIds;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = layout.mReferenceIdString;
                                if (str != null) {
                                    layout.mReferenceIds = convertReferenceString(barrier, str);
                                    barrier.setReferencedIds(constraint.layout.mReferenceIds);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.validate();
                        constraint.applyTo(layoutParams);
                        if (z) {
                            ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                        }
                        childAt.setLayoutParams(layoutParams);
                        PropertySet propertySet = constraint.propertySet;
                        if (propertySet.mVisibilityMode == 0) {
                            childAt.setVisibility(propertySet.visibility);
                        }
                        childAt.setAlpha(constraint.propertySet.alpha);
                        childAt.setRotation(constraint.transform.rotation);
                        childAt.setRotationX(constraint.transform.rotationX);
                        childAt.setRotationY(constraint.transform.rotationY);
                        childAt.setScaleX(constraint.transform.scaleX);
                        childAt.setScaleY(constraint.transform.scaleY);
                        Transform transform = constraint.transform;
                        if (transform.transformPivotTarget != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(constraint.transform.transformPivotTarget);
                            if (findViewById != null) {
                                float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - childAt.getLeft());
                                    childAt.setPivotY(top - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(transform.transformPivotX)) {
                                childAt.setPivotX(constraint.transform.transformPivotX);
                            }
                            if (!Float.isNaN(constraint.transform.transformPivotY)) {
                                childAt.setPivotY(constraint.transform.transformPivotY);
                            }
                        }
                        childAt.setTranslationX(constraint.transform.translationX);
                        childAt.setTranslationY(constraint.transform.translationY);
                        childAt.setTranslationZ(constraint.transform.translationZ);
                        Transform transform2 = constraint.transform;
                        if (transform2.applyElevation) {
                            childAt.setElevation(transform2.elevation);
                        }
                    }
                } else {
                    new StringBuilder("WARNING NO CONSTRAINTS for view ").append(id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2 != null) {
                if (constraint2.layout.mHelperType == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    Layout layout2 = constraint2.layout;
                    int[] iArr2 = layout2.mReferenceIds;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.mReferenceIdString;
                        if (str2 != null) {
                            layout2.mReferenceIds = convertReferenceString(barrier2, str2);
                            barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                        }
                    }
                    barrier2.setType(constraint2.layout.mBarrierDirection);
                    barrier2.setMargin(constraint2.layout.mBarrierMargin);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    constraint2.applyTo(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (constraint2.layout.mIsGuideline) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.applyTo(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public void createBarrier(int i, int i2, int i3, int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae5d00f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), iArr});
            return;
        }
        Layout layout = get(i).layout;
        layout.mHelperType = 1;
        layout.mBarrierDirection = i2;
        layout.mBarrierMargin = i3;
        layout.mIsGuideline = false;
        layout.mReferenceIds = iArr;
    }

    public void removeFromHorizontalChain(int i) {
        Constraint constraint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba5e7ed", new Object[]{this, new Integer(i)});
        } else if (this.mConstraints.containsKey(Integer.valueOf(i)) && (constraint = this.mConstraints.get(Integer.valueOf(i))) != null) {
            Layout layout = constraint.layout;
            int i2 = layout.leftToRight;
            int i3 = layout.rightToLeft;
            if (i2 == -1 && i3 == -1) {
                int i4 = layout.startToEnd;
                int i5 = layout.endToStart;
                if (!(i4 == -1 && i5 == -1)) {
                    if (i4 != -1 && i5 != -1) {
                        connect(i4, 7, i5, 6, 0);
                        connect(i5, 6, i2, 7, 0);
                    } else if (i5 != -1) {
                        int i6 = layout.rightToRight;
                        if (i6 != -1) {
                            connect(i2, 7, i6, 7, 0);
                        } else {
                            int i7 = layout.leftToLeft;
                            if (i7 != -1) {
                                connect(i5, 6, i7, 6, 0);
                            }
                        }
                    }
                }
                clear(i, 6);
                clear(i, 7);
                return;
            }
            if (i2 == -1 || i3 == -1) {
                int i8 = layout.rightToRight;
                if (i8 != -1) {
                    connect(i2, 2, i8, 2, 0);
                } else {
                    int i9 = layout.leftToLeft;
                    if (i9 != -1) {
                        connect(i3, 1, i9, 1, 0);
                    }
                }
            } else {
                connect(i2, 2, i3, 1, 0);
                connect(i3, 1, i2, 2, 0);
            }
            clear(i, 1);
            clear(i, 2);
        }
    }

    public static void parseDimensionConstraintsString(Object obj, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868da142", new Object[]{obj, str, new Integer(i)});
        } else if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if (!KEY_RATIO.equalsIgnoreCase(trim)) {
                        try {
                            if ("weight".equalsIgnoreCase(trim)) {
                                float parseFloat = Float.parseFloat(trim2);
                                if (obj instanceof ConstraintLayout.LayoutParams) {
                                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                                    if (i == 0) {
                                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                                        layoutParams.horizontalWeight = parseFloat;
                                    } else {
                                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                                        layoutParams.verticalWeight = parseFloat;
                                    }
                                } else if (obj instanceof Layout) {
                                    Layout layout = (Layout) obj;
                                    if (i == 0) {
                                        layout.mWidth = 0;
                                        layout.horizontalWeight = parseFloat;
                                    } else {
                                        layout.mHeight = 0;
                                        layout.verticalWeight = parseFloat;
                                    }
                                } else if (obj instanceof Constraint.Delta) {
                                    Constraint.Delta delta = (Constraint.Delta) obj;
                                    if (i == 0) {
                                        delta.add(23, 0);
                                        delta.add(39, parseFloat);
                                    } else {
                                        delta.add(21, 0);
                                        delta.add(40, parseFloat);
                                    }
                                }
                            } else if ("parent".equalsIgnoreCase(trim)) {
                                float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                                if (obj instanceof ConstraintLayout.LayoutParams) {
                                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                                    if (i == 0) {
                                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                                        layoutParams2.matchConstraintPercentWidth = max;
                                        layoutParams2.matchConstraintDefaultWidth = 2;
                                    } else {
                                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                                        layoutParams2.matchConstraintPercentHeight = max;
                                        layoutParams2.matchConstraintDefaultHeight = 2;
                                    }
                                } else if (obj instanceof Layout) {
                                    Layout layout2 = (Layout) obj;
                                    if (i == 0) {
                                        layout2.mWidth = 0;
                                        layout2.widthPercent = max;
                                        layout2.widthDefault = 2;
                                    } else {
                                        layout2.mHeight = 0;
                                        layout2.heightPercent = max;
                                        layout2.heightDefault = 2;
                                    }
                                } else if (obj instanceof Constraint.Delta) {
                                    Constraint.Delta delta2 = (Constraint.Delta) obj;
                                    if (i == 0) {
                                        delta2.add(23, 0);
                                        delta2.add(54, 2);
                                    } else {
                                        delta2.add(21, 0);
                                        delta2.add(55, 2);
                                    }
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                        }
                        parseDimensionRatioString(layoutParams3, trim2);
                    } else if (obj instanceof Layout) {
                        ((Layout) obj).dimensionRatio = trim2;
                    } else if (obj instanceof Constraint.Delta) {
                        ((Constraint.Delta) obj).add(5, trim2);
                    }
                }
            }
        }
    }

    private void populateConstraint(Constraint constraint, TypedArray typedArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c003f16b", new Object[]{this, constraint, typedArray, new Boolean(z)});
        } else if (z) {
            populateOverride(constraint, typedArray);
        } else {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (!(index == R.styleable.Constraint_android_id || R.styleable.Constraint_android_layout_marginStart == index || R.styleable.Constraint_android_layout_marginEnd == index)) {
                    constraint.motion.mApply = true;
                    constraint.layout.mApply = true;
                    constraint.propertySet.mApply = true;
                    constraint.transform.mApply = true;
                }
                switch (sMapToConstant.get(index)) {
                    case 1:
                        Layout layout = constraint.layout;
                        layout.baselineToBaseline = lookupID(typedArray, index, layout.baselineToBaseline);
                        break;
                    case 2:
                        Layout layout2 = constraint.layout;
                        layout2.bottomMargin = typedArray.getDimensionPixelSize(index, layout2.bottomMargin);
                        break;
                    case 3:
                        Layout layout3 = constraint.layout;
                        layout3.bottomToBottom = lookupID(typedArray, index, layout3.bottomToBottom);
                        break;
                    case 4:
                        Layout layout4 = constraint.layout;
                        layout4.bottomToTop = lookupID(typedArray, index, layout4.bottomToTop);
                        break;
                    case 5:
                        constraint.layout.dimensionRatio = typedArray.getString(index);
                        break;
                    case 6:
                        Layout layout5 = constraint.layout;
                        layout5.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, layout5.editorAbsoluteX);
                        break;
                    case 7:
                        Layout layout6 = constraint.layout;
                        layout6.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, layout6.editorAbsoluteY);
                        break;
                    case 8:
                        Layout layout7 = constraint.layout;
                        layout7.endMargin = typedArray.getDimensionPixelSize(index, layout7.endMargin);
                        break;
                    case 9:
                        Layout layout8 = constraint.layout;
                        layout8.endToEnd = lookupID(typedArray, index, layout8.endToEnd);
                        break;
                    case 10:
                        Layout layout9 = constraint.layout;
                        layout9.endToStart = lookupID(typedArray, index, layout9.endToStart);
                        break;
                    case 11:
                        Layout layout10 = constraint.layout;
                        layout10.goneBottomMargin = typedArray.getDimensionPixelSize(index, layout10.goneBottomMargin);
                        break;
                    case 12:
                        Layout layout11 = constraint.layout;
                        layout11.goneEndMargin = typedArray.getDimensionPixelSize(index, layout11.goneEndMargin);
                        break;
                    case 13:
                        Layout layout12 = constraint.layout;
                        layout12.goneLeftMargin = typedArray.getDimensionPixelSize(index, layout12.goneLeftMargin);
                        break;
                    case 14:
                        Layout layout13 = constraint.layout;
                        layout13.goneRightMargin = typedArray.getDimensionPixelSize(index, layout13.goneRightMargin);
                        break;
                    case 15:
                        Layout layout14 = constraint.layout;
                        layout14.goneStartMargin = typedArray.getDimensionPixelSize(index, layout14.goneStartMargin);
                        break;
                    case 16:
                        Layout layout15 = constraint.layout;
                        layout15.goneTopMargin = typedArray.getDimensionPixelSize(index, layout15.goneTopMargin);
                        break;
                    case 17:
                        Layout layout16 = constraint.layout;
                        layout16.guideBegin = typedArray.getDimensionPixelOffset(index, layout16.guideBegin);
                        break;
                    case 18:
                        Layout layout17 = constraint.layout;
                        layout17.guideEnd = typedArray.getDimensionPixelOffset(index, layout17.guideEnd);
                        break;
                    case 19:
                        Layout layout18 = constraint.layout;
                        layout18.guidePercent = typedArray.getFloat(index, layout18.guidePercent);
                        break;
                    case 20:
                        Layout layout19 = constraint.layout;
                        layout19.horizontalBias = typedArray.getFloat(index, layout19.horizontalBias);
                        break;
                    case 21:
                        Layout layout20 = constraint.layout;
                        layout20.mHeight = typedArray.getLayoutDimension(index, layout20.mHeight);
                        break;
                    case 22:
                        PropertySet propertySet = constraint.propertySet;
                        propertySet.visibility = typedArray.getInt(index, propertySet.visibility);
                        PropertySet propertySet2 = constraint.propertySet;
                        propertySet2.visibility = VISIBILITY_FLAGS[propertySet2.visibility];
                        break;
                    case 23:
                        Layout layout21 = constraint.layout;
                        layout21.mWidth = typedArray.getLayoutDimension(index, layout21.mWidth);
                        break;
                    case 24:
                        Layout layout22 = constraint.layout;
                        layout22.leftMargin = typedArray.getDimensionPixelSize(index, layout22.leftMargin);
                        break;
                    case 25:
                        Layout layout23 = constraint.layout;
                        layout23.leftToLeft = lookupID(typedArray, index, layout23.leftToLeft);
                        break;
                    case 26:
                        Layout layout24 = constraint.layout;
                        layout24.leftToRight = lookupID(typedArray, index, layout24.leftToRight);
                        break;
                    case 27:
                        Layout layout25 = constraint.layout;
                        layout25.orientation = typedArray.getInt(index, layout25.orientation);
                        break;
                    case 28:
                        Layout layout26 = constraint.layout;
                        layout26.rightMargin = typedArray.getDimensionPixelSize(index, layout26.rightMargin);
                        break;
                    case 29:
                        Layout layout27 = constraint.layout;
                        layout27.rightToLeft = lookupID(typedArray, index, layout27.rightToLeft);
                        break;
                    case 30:
                        Layout layout28 = constraint.layout;
                        layout28.rightToRight = lookupID(typedArray, index, layout28.rightToRight);
                        break;
                    case 31:
                        Layout layout29 = constraint.layout;
                        layout29.startMargin = typedArray.getDimensionPixelSize(index, layout29.startMargin);
                        break;
                    case 32:
                        Layout layout30 = constraint.layout;
                        layout30.startToEnd = lookupID(typedArray, index, layout30.startToEnd);
                        break;
                    case 33:
                        Layout layout31 = constraint.layout;
                        layout31.startToStart = lookupID(typedArray, index, layout31.startToStart);
                        break;
                    case 34:
                        Layout layout32 = constraint.layout;
                        layout32.topMargin = typedArray.getDimensionPixelSize(index, layout32.topMargin);
                        break;
                    case 35:
                        Layout layout33 = constraint.layout;
                        layout33.topToBottom = lookupID(typedArray, index, layout33.topToBottom);
                        break;
                    case 36:
                        Layout layout34 = constraint.layout;
                        layout34.topToTop = lookupID(typedArray, index, layout34.topToTop);
                        break;
                    case 37:
                        Layout layout35 = constraint.layout;
                        layout35.verticalBias = typedArray.getFloat(index, layout35.verticalBias);
                        break;
                    case 38:
                        constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                        break;
                    case 39:
                        Layout layout36 = constraint.layout;
                        layout36.horizontalWeight = typedArray.getFloat(index, layout36.horizontalWeight);
                        break;
                    case 40:
                        Layout layout37 = constraint.layout;
                        layout37.verticalWeight = typedArray.getFloat(index, layout37.verticalWeight);
                        break;
                    case 41:
                        Layout layout38 = constraint.layout;
                        layout38.horizontalChainStyle = typedArray.getInt(index, layout38.horizontalChainStyle);
                        break;
                    case 42:
                        Layout layout39 = constraint.layout;
                        layout39.verticalChainStyle = typedArray.getInt(index, layout39.verticalChainStyle);
                        break;
                    case 43:
                        PropertySet propertySet3 = constraint.propertySet;
                        propertySet3.alpha = typedArray.getFloat(index, propertySet3.alpha);
                        break;
                    case 44:
                        Transform transform = constraint.transform;
                        transform.applyElevation = true;
                        transform.elevation = typedArray.getDimension(index, transform.elevation);
                        break;
                    case 45:
                        Transform transform2 = constraint.transform;
                        transform2.rotationX = typedArray.getFloat(index, transform2.rotationX);
                        break;
                    case 46:
                        Transform transform3 = constraint.transform;
                        transform3.rotationY = typedArray.getFloat(index, transform3.rotationY);
                        break;
                    case 47:
                        Transform transform4 = constraint.transform;
                        transform4.scaleX = typedArray.getFloat(index, transform4.scaleX);
                        break;
                    case 48:
                        Transform transform5 = constraint.transform;
                        transform5.scaleY = typedArray.getFloat(index, transform5.scaleY);
                        break;
                    case 49:
                        Transform transform6 = constraint.transform;
                        transform6.transformPivotX = typedArray.getDimension(index, transform6.transformPivotX);
                        break;
                    case 50:
                        Transform transform7 = constraint.transform;
                        transform7.transformPivotY = typedArray.getDimension(index, transform7.transformPivotY);
                        break;
                    case 51:
                        Transform transform8 = constraint.transform;
                        transform8.translationX = typedArray.getDimension(index, transform8.translationX);
                        break;
                    case 52:
                        Transform transform9 = constraint.transform;
                        transform9.translationY = typedArray.getDimension(index, transform9.translationY);
                        break;
                    case 53:
                        Transform transform10 = constraint.transform;
                        transform10.translationZ = typedArray.getDimension(index, transform10.translationZ);
                        break;
                    case 54:
                        Layout layout40 = constraint.layout;
                        layout40.widthDefault = typedArray.getInt(index, layout40.widthDefault);
                        break;
                    case 55:
                        Layout layout41 = constraint.layout;
                        layout41.heightDefault = typedArray.getInt(index, layout41.heightDefault);
                        break;
                    case 56:
                        Layout layout42 = constraint.layout;
                        layout42.widthMax = typedArray.getDimensionPixelSize(index, layout42.widthMax);
                        break;
                    case 57:
                        Layout layout43 = constraint.layout;
                        layout43.heightMax = typedArray.getDimensionPixelSize(index, layout43.heightMax);
                        break;
                    case 58:
                        Layout layout44 = constraint.layout;
                        layout44.widthMin = typedArray.getDimensionPixelSize(index, layout44.widthMin);
                        break;
                    case 59:
                        Layout layout45 = constraint.layout;
                        layout45.heightMin = typedArray.getDimensionPixelSize(index, layout45.heightMin);
                        break;
                    case 60:
                        Transform transform11 = constraint.transform;
                        transform11.rotation = typedArray.getFloat(index, transform11.rotation);
                        break;
                    case 61:
                        Layout layout46 = constraint.layout;
                        layout46.circleConstraint = lookupID(typedArray, index, layout46.circleConstraint);
                        break;
                    case 62:
                        Layout layout47 = constraint.layout;
                        layout47.circleRadius = typedArray.getDimensionPixelSize(index, layout47.circleRadius);
                        break;
                    case 63:
                        Layout layout48 = constraint.layout;
                        layout48.circleAngle = typedArray.getFloat(index, layout48.circleAngle);
                        break;
                    case 64:
                        Motion motion = constraint.motion;
                        motion.mAnimateRelativeTo = lookupID(typedArray, index, motion.mAnimateRelativeTo);
                        break;
                    case 65:
                        if (typedArray.peekValue(index).type == 3) {
                            constraint.motion.mTransitionEasing = typedArray.getString(index);
                            break;
                        } else {
                            constraint.motion.mTransitionEasing = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        constraint.motion.mDrawPath = typedArray.getInt(index, 0);
                        break;
                    case 67:
                        Motion motion2 = constraint.motion;
                        motion2.mPathRotate = typedArray.getFloat(index, motion2.mPathRotate);
                        break;
                    case 68:
                        PropertySet propertySet4 = constraint.propertySet;
                        propertySet4.mProgress = typedArray.getFloat(index, propertySet4.mProgress);
                        break;
                    case 69:
                        constraint.layout.widthPercent = typedArray.getFloat(index, 1.0f);
                        break;
                    case 70:
                        constraint.layout.heightPercent = typedArray.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e(TAG, "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        Layout layout49 = constraint.layout;
                        layout49.mBarrierDirection = typedArray.getInt(index, layout49.mBarrierDirection);
                        break;
                    case 73:
                        Layout layout50 = constraint.layout;
                        layout50.mBarrierMargin = typedArray.getDimensionPixelSize(index, layout50.mBarrierMargin);
                        break;
                    case 74:
                        constraint.layout.mReferenceIdString = typedArray.getString(index);
                        break;
                    case 75:
                        Layout layout51 = constraint.layout;
                        layout51.mBarrierAllowsGoneWidgets = typedArray.getBoolean(index, layout51.mBarrierAllowsGoneWidgets);
                        break;
                    case 76:
                        Motion motion3 = constraint.motion;
                        motion3.mPathMotionArc = typedArray.getInt(index, motion3.mPathMotionArc);
                        break;
                    case 77:
                        constraint.layout.mConstraintTag = typedArray.getString(index);
                        break;
                    case 78:
                        PropertySet propertySet5 = constraint.propertySet;
                        propertySet5.mVisibilityMode = typedArray.getInt(index, propertySet5.mVisibilityMode);
                        break;
                    case 79:
                        Motion motion4 = constraint.motion;
                        motion4.mMotionStagger = typedArray.getFloat(index, motion4.mMotionStagger);
                        break;
                    case 80:
                        Layout layout52 = constraint.layout;
                        layout52.constrainedWidth = typedArray.getBoolean(index, layout52.constrainedWidth);
                        break;
                    case 81:
                        Layout layout53 = constraint.layout;
                        layout53.constrainedHeight = typedArray.getBoolean(index, layout53.constrainedHeight);
                        break;
                    case 82:
                        Motion motion5 = constraint.motion;
                        motion5.mAnimateCircleAngleTo = typedArray.getInteger(index, motion5.mAnimateCircleAngleTo);
                        break;
                    case 83:
                        Transform transform12 = constraint.transform;
                        transform12.transformPivotTarget = lookupID(typedArray, index, transform12.transformPivotTarget);
                        break;
                    case 84:
                        Motion motion6 = constraint.motion;
                        motion6.mQuantizeMotionSteps = typedArray.getInteger(index, motion6.mQuantizeMotionSteps);
                        break;
                    case 85:
                        Motion motion7 = constraint.motion;
                        motion7.mQuantizeMotionPhase = typedArray.getFloat(index, motion7.mQuantizeMotionPhase);
                        break;
                    case 86:
                        int i2 = typedArray.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 == 3) {
                                constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                                if (constraint.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                                    constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                                    constraint.motion.mQuantizeInterpolatorType = -2;
                                    break;
                                } else {
                                    constraint.motion.mQuantizeInterpolatorType = -1;
                                    break;
                                }
                            } else {
                                Motion motion8 = constraint.motion;
                                motion8.mQuantizeInterpolatorType = typedArray.getInteger(index, motion8.mQuantizeInterpolatorID);
                                break;
                            }
                        } else {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            Motion motion9 = constraint.motion;
                            if (motion9.mQuantizeInterpolatorID != -1) {
                                motion9.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 87:
                        StringBuilder sb = new StringBuilder("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sMapToConstant.get(index));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sMapToConstant.get(index));
                        break;
                    case 91:
                        Layout layout54 = constraint.layout;
                        layout54.baselineToTop = lookupID(typedArray, index, layout54.baselineToTop);
                        break;
                    case 92:
                        Layout layout55 = constraint.layout;
                        layout55.baselineToBottom = lookupID(typedArray, index, layout55.baselineToBottom);
                        break;
                    case 93:
                        Layout layout56 = constraint.layout;
                        layout56.baselineMargin = typedArray.getDimensionPixelSize(index, layout56.baselineMargin);
                        break;
                    case 94:
                        Layout layout57 = constraint.layout;
                        layout57.goneBaselineMargin = typedArray.getDimensionPixelSize(index, layout57.goneBaselineMargin);
                        break;
                    case 95:
                        parseDimensionConstraints(constraint.layout, typedArray, index, 0);
                        break;
                    case 96:
                        parseDimensionConstraints(constraint.layout, typedArray, index, 1);
                        break;
                    case 97:
                        Layout layout58 = constraint.layout;
                        layout58.mWrapBehavior = typedArray.getInt(index, layout58.mWrapBehavior);
                        break;
                }
            }
            Layout layout59 = constraint.layout;
            if (layout59.mReferenceIdString != null) {
                layout59.mReferenceIds = null;
            }
        }
    }

    private static void populateOverride(Constraint constraint, TypedArray typedArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5c1c3a", new Object[]{constraint, typedArray});
            return;
        }
        int indexCount = typedArray.getIndexCount();
        Constraint.Delta delta = new Constraint.Delta();
        constraint.mDelta = delta;
        constraint.motion.mApply = false;
        constraint.layout.mApply = false;
        constraint.propertySet.mApply = false;
        constraint.transform.mApply = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (sOverrideMapToConstant.get(index)) {
                case 2:
                    delta.add(2, typedArray.getDimensionPixelSize(index, constraint.layout.bottomMargin));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(sMapToConstant.get(index));
                    break;
                case 5:
                    delta.add(5, typedArray.getString(index));
                    break;
                case 6:
                    delta.add(6, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteX));
                    break;
                case 7:
                    delta.add(7, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteY));
                    break;
                case 8:
                    delta.add(8, typedArray.getDimensionPixelSize(index, constraint.layout.endMargin));
                    break;
                case 11:
                    delta.add(11, typedArray.getDimensionPixelSize(index, constraint.layout.goneBottomMargin));
                    break;
                case 12:
                    delta.add(12, typedArray.getDimensionPixelSize(index, constraint.layout.goneEndMargin));
                    break;
                case 13:
                    delta.add(13, typedArray.getDimensionPixelSize(index, constraint.layout.goneLeftMargin));
                    break;
                case 14:
                    delta.add(14, typedArray.getDimensionPixelSize(index, constraint.layout.goneRightMargin));
                    break;
                case 15:
                    delta.add(15, typedArray.getDimensionPixelSize(index, constraint.layout.goneStartMargin));
                    break;
                case 16:
                    delta.add(16, typedArray.getDimensionPixelSize(index, constraint.layout.goneTopMargin));
                    break;
                case 17:
                    delta.add(17, typedArray.getDimensionPixelOffset(index, constraint.layout.guideBegin));
                    break;
                case 18:
                    delta.add(18, typedArray.getDimensionPixelOffset(index, constraint.layout.guideEnd));
                    break;
                case 19:
                    delta.add(19, typedArray.getFloat(index, constraint.layout.guidePercent));
                    break;
                case 20:
                    delta.add(20, typedArray.getFloat(index, constraint.layout.horizontalBias));
                    break;
                case 21:
                    delta.add(21, typedArray.getLayoutDimension(index, constraint.layout.mHeight));
                    break;
                case 22:
                    delta.add(22, VISIBILITY_FLAGS[typedArray.getInt(index, constraint.propertySet.visibility)]);
                    break;
                case 23:
                    delta.add(23, typedArray.getLayoutDimension(index, constraint.layout.mWidth));
                    break;
                case 24:
                    delta.add(24, typedArray.getDimensionPixelSize(index, constraint.layout.leftMargin));
                    break;
                case 27:
                    delta.add(27, typedArray.getInt(index, constraint.layout.orientation));
                    break;
                case 28:
                    delta.add(28, typedArray.getDimensionPixelSize(index, constraint.layout.rightMargin));
                    break;
                case 31:
                    delta.add(31, typedArray.getDimensionPixelSize(index, constraint.layout.startMargin));
                    break;
                case 34:
                    delta.add(34, typedArray.getDimensionPixelSize(index, constraint.layout.topMargin));
                    break;
                case 37:
                    delta.add(37, typedArray.getFloat(index, constraint.layout.verticalBias));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, constraint.mViewId);
                    constraint.mViewId = resourceId;
                    delta.add(38, resourceId);
                    break;
                case 39:
                    delta.add(39, typedArray.getFloat(index, constraint.layout.horizontalWeight));
                    break;
                case 40:
                    delta.add(40, typedArray.getFloat(index, constraint.layout.verticalWeight));
                    break;
                case 41:
                    delta.add(41, typedArray.getInt(index, constraint.layout.horizontalChainStyle));
                    break;
                case 42:
                    delta.add(42, typedArray.getInt(index, constraint.layout.verticalChainStyle));
                    break;
                case 43:
                    delta.add(43, typedArray.getFloat(index, constraint.propertySet.alpha));
                    break;
                case 44:
                    delta.add(44, true);
                    delta.add(44, typedArray.getDimension(index, constraint.transform.elevation));
                    break;
                case 45:
                    delta.add(45, typedArray.getFloat(index, constraint.transform.rotationX));
                    break;
                case 46:
                    delta.add(46, typedArray.getFloat(index, constraint.transform.rotationY));
                    break;
                case 47:
                    delta.add(47, typedArray.getFloat(index, constraint.transform.scaleX));
                    break;
                case 48:
                    delta.add(48, typedArray.getFloat(index, constraint.transform.scaleY));
                    break;
                case 49:
                    delta.add(49, typedArray.getDimension(index, constraint.transform.transformPivotX));
                    break;
                case 50:
                    delta.add(50, typedArray.getDimension(index, constraint.transform.transformPivotY));
                    break;
                case 51:
                    delta.add(51, typedArray.getDimension(index, constraint.transform.translationX));
                    break;
                case 52:
                    delta.add(52, typedArray.getDimension(index, constraint.transform.translationY));
                    break;
                case 53:
                    delta.add(53, typedArray.getDimension(index, constraint.transform.translationZ));
                    break;
                case 54:
                    delta.add(54, typedArray.getInt(index, constraint.layout.widthDefault));
                    break;
                case 55:
                    delta.add(55, typedArray.getInt(index, constraint.layout.heightDefault));
                    break;
                case 56:
                    delta.add(56, typedArray.getDimensionPixelSize(index, constraint.layout.widthMax));
                    break;
                case 57:
                    delta.add(57, typedArray.getDimensionPixelSize(index, constraint.layout.heightMax));
                    break;
                case 58:
                    delta.add(58, typedArray.getDimensionPixelSize(index, constraint.layout.widthMin));
                    break;
                case 59:
                    delta.add(59, typedArray.getDimensionPixelSize(index, constraint.layout.heightMin));
                    break;
                case 60:
                    delta.add(60, typedArray.getFloat(index, constraint.transform.rotation));
                    break;
                case 62:
                    delta.add(62, typedArray.getDimensionPixelSize(index, constraint.layout.circleRadius));
                    break;
                case 63:
                    delta.add(63, typedArray.getFloat(index, constraint.layout.circleAngle));
                    break;
                case 64:
                    delta.add(64, lookupID(typedArray, index, constraint.motion.mAnimateRelativeTo));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        delta.add(65, typedArray.getString(index));
                        break;
                    } else {
                        delta.add(65, Easing.NAMED_EASING[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    delta.add(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    delta.add(67, typedArray.getFloat(index, constraint.motion.mPathRotate));
                    break;
                case 68:
                    delta.add(68, typedArray.getFloat(index, constraint.propertySet.mProgress));
                    break;
                case 69:
                    delta.add(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    delta.add(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    delta.add(72, typedArray.getInt(index, constraint.layout.mBarrierDirection));
                    break;
                case 73:
                    delta.add(73, typedArray.getDimensionPixelSize(index, constraint.layout.mBarrierMargin));
                    break;
                case 74:
                    delta.add(74, typedArray.getString(index));
                    break;
                case 75:
                    delta.add(75, typedArray.getBoolean(index, constraint.layout.mBarrierAllowsGoneWidgets));
                    break;
                case 76:
                    delta.add(76, typedArray.getInt(index, constraint.motion.mPathMotionArc));
                    break;
                case 77:
                    delta.add(77, typedArray.getString(index));
                    break;
                case 78:
                    delta.add(78, typedArray.getInt(index, constraint.propertySet.mVisibilityMode));
                    break;
                case 79:
                    delta.add(79, typedArray.getFloat(index, constraint.motion.mMotionStagger));
                    break;
                case 80:
                    delta.add(80, typedArray.getBoolean(index, constraint.layout.constrainedWidth));
                    break;
                case 81:
                    delta.add(81, typedArray.getBoolean(index, constraint.layout.constrainedHeight));
                    break;
                case 82:
                    delta.add(82, typedArray.getInteger(index, constraint.motion.mAnimateCircleAngleTo));
                    break;
                case 83:
                    delta.add(83, lookupID(typedArray, index, constraint.transform.transformPivotTarget));
                    break;
                case 84:
                    delta.add(84, typedArray.getInteger(index, constraint.motion.mQuantizeMotionSteps));
                    break;
                case 85:
                    delta.add(85, typedArray.getFloat(index, constraint.motion.mQuantizeMotionPhase));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 == 3) {
                            constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                            delta.add(90, constraint.motion.mQuantizeInterpolatorString);
                            if (constraint.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                                constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                                delta.add(89, constraint.motion.mQuantizeInterpolatorID);
                                constraint.motion.mQuantizeInterpolatorType = -2;
                                delta.add(88, -2);
                                break;
                            } else {
                                constraint.motion.mQuantizeInterpolatorType = -1;
                                delta.add(88, -1);
                                break;
                            }
                        } else {
                            Motion motion = constraint.motion;
                            motion.mQuantizeInterpolatorType = typedArray.getInteger(index, motion.mQuantizeInterpolatorID);
                            delta.add(88, constraint.motion.mQuantizeInterpolatorType);
                            break;
                        }
                    } else {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        delta.add(89, constraint.motion.mQuantizeInterpolatorID);
                        Motion motion2 = constraint.motion;
                        if (motion2.mQuantizeInterpolatorID != -1) {
                            motion2.mQuantizeInterpolatorType = -2;
                            delta.add(88, -2);
                            break;
                        } else {
                            break;
                        }
                    }
                case 87:
                    StringBuilder sb2 = new StringBuilder("unused attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(sMapToConstant.get(index));
                    break;
                case 93:
                    delta.add(93, typedArray.getDimensionPixelSize(index, constraint.layout.baselineMargin));
                    break;
                case 94:
                    delta.add(94, typedArray.getDimensionPixelSize(index, constraint.layout.goneBaselineMargin));
                    break;
                case 95:
                    parseDimensionConstraints(delta, typedArray, index, 0);
                    break;
                case 96:
                    parseDimensionConstraints(delta, typedArray, index, 1);
                    break;
                case 97:
                    delta.add(97, typedArray.getInt(index, constraint.layout.mWrapBehavior));
                    break;
                case 98:
                    if (!MotionLayout.IS_IN_EDIT_MODE) {
                        if (typedArray.peekValue(index).type == 3) {
                            constraint.mTargetString = typedArray.getString(index);
                            break;
                        } else {
                            constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, constraint.mViewId);
                        constraint.mViewId = resourceId2;
                        if (resourceId2 == -1) {
                            constraint.mTargetString = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    }
                case 99:
                    delta.add(99, typedArray.getBoolean(index, constraint.layout.guidelineUseRtl));
                    break;
            }
        }
    }

    public void parseIntAttributes(Constraint constraint, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74ab0cc", new Object[]{this, constraint, str});
            return;
        }
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                new StringBuilder(" Unable to parse ").append(split[i]);
            } else {
                Constraint.access$1100(constraint, split2[0], Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void centerHorizontally(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1cf44d", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 == 0) {
            center(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b3ed30b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 == 0) {
            center(i, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i, i2, 7, 0, i2, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105c26df", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 == 0) {
            center(i, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i, i2, 4, 0, i2, 3, 0, 0.5f);
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4094f0d", new Object[]{this, constraintLayout});
            return;
        }
        int childCount = constraintLayout.getChildCount();
        this.mConstraints.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.mForceId || id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                if (constraint != null) {
                    constraint.mCustomConstraints = ConstraintAttribute.extractAttributes(this.mSavedAttributes, childAt);
                    Constraint.access$000(constraint, id, layoutParams);
                    constraint.propertySet.visibility = childAt.getVisibility();
                    constraint.propertySet.alpha = childAt.getAlpha();
                    constraint.transform.rotation = childAt.getRotation();
                    constraint.transform.rotationX = childAt.getRotationX();
                    constraint.transform.rotationY = childAt.getRotationY();
                    constraint.transform.scaleX = childAt.getScaleX();
                    constraint.transform.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(pivotX == vu3.b.GEO_NOT_SUPPORT && pivotY == vu3.b.GEO_NOT_SUPPORT)) {
                        Transform transform = constraint.transform;
                        transform.transformPivotX = pivotX;
                        transform.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = childAt.getTranslationX();
                    constraint.transform.translationY = childAt.getTranslationY();
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    Transform transform2 = constraint.transform;
                    if (transform2.applyElevation) {
                        transform2.elevation = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                        constraint.layout.mReferenceIds = barrier.getReferencedIds();
                        constraint.layout.mBarrierDirection = barrier.getType();
                        constraint.layout.mBarrierMargin = barrier.getMargin();
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void createVerticalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce54e074", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, fArr, new Integer(i5)});
        } else if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr == null || fArr.length == iArr.length) {
            if (fArr != null) {
                get(iArr[0]).layout.verticalWeight = fArr[0];
            }
            get(iArr[0]).layout.verticalChainStyle = i5;
            connect(iArr[0], 3, i, i2, 0);
            for (int i6 = 1; i6 < iArr.length; i6++) {
                int i7 = i6 - 1;
                connect(iArr[i6], 3, iArr[i7], 4, 0);
                connect(iArr[i7], 4, iArr[i6], 3, 0);
                if (fArr != null) {
                    get(iArr[i6]).layout.verticalWeight = fArr[i6];
                }
            }
            connect(iArr[iArr.length - 1], 4, i3, i4, 0);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01eb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void load(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void center(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a13e899", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Float(f)});
        } else if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else if (i3 == 1 || i3 == 2) {
            connect(i, 1, i2, i3, i4);
            connect(i, 2, i5, i6, i7);
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
            if (constraint != null) {
                constraint.layout.horizontalBias = f;
            }
        } else if (i3 == 6 || i3 == 7) {
            connect(i, 6, i2, i3, i4);
            connect(i, 7, i5, i6, i7);
            Constraint constraint2 = this.mConstraints.get(Integer.valueOf(i));
            if (constraint2 != null) {
                constraint2.layout.horizontalBias = f;
            }
        } else {
            connect(i, 3, i2, i3, i4);
            connect(i, 4, i5, i6, i7);
            Constraint constraint3 = this.mConstraints.get(Integer.valueOf(i));
            if (constraint3 != null) {
                constraint3.layout.verticalBias = f;
            }
        }
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae5b772", new Object[]{this, constraintLayout});
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.mForceId || id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                if (constraint != null) {
                    if (!constraint.layout.mApply) {
                        Constraint.access$000(constraint, id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            constraint.layout.mReferenceIds = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                                constraint.layout.mBarrierDirection = barrier.getType();
                                constraint.layout.mBarrierMargin = barrier.getMargin();
                            }
                        }
                        constraint.layout.mApply = true;
                    }
                    PropertySet propertySet = constraint.propertySet;
                    if (!propertySet.mApply) {
                        propertySet.visibility = childAt.getVisibility();
                        constraint.propertySet.alpha = childAt.getAlpha();
                        constraint.propertySet.mApply = true;
                    }
                    Transform transform = constraint.transform;
                    if (!transform.mApply) {
                        transform.mApply = true;
                        transform.rotation = childAt.getRotation();
                        constraint.transform.rotationX = childAt.getRotationX();
                        constraint.transform.rotationY = childAt.getRotationY();
                        constraint.transform.scaleX = childAt.getScaleX();
                        constraint.transform.scaleY = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(pivotX == vu3.b.GEO_NOT_SUPPORT && pivotY == vu3.b.GEO_NOT_SUPPORT)) {
                            Transform transform2 = constraint.transform;
                            transform2.transformPivotX = pivotX;
                            transform2.transformPivotY = pivotY;
                        }
                        constraint.transform.translationX = childAt.getTranslationX();
                        constraint.transform.translationY = childAt.getTranslationY();
                        constraint.transform.translationZ = childAt.getTranslationZ();
                        Transform transform3 = constraint.transform;
                        if (transform3.applyElevation) {
                            transform3.elevation = childAt.getElevation();
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    private static void setDeltaValue(Constraint constraint, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b1787a", new Object[]{constraint, new Integer(i), new Integer(i2)});
        } else if (i == 6) {
            constraint.layout.editorAbsoluteX = i2;
        } else if (i == 7) {
            constraint.layout.editorAbsoluteY = i2;
        } else if (i == 8) {
            constraint.layout.endMargin = i2;
        } else if (i == 27) {
            constraint.layout.orientation = i2;
        } else if (i == 28) {
            constraint.layout.rightMargin = i2;
        } else if (i == 41) {
            constraint.layout.horizontalChainStyle = i2;
        } else if (i == 42) {
            constraint.layout.verticalChainStyle = i2;
        } else if (i == 61) {
            constraint.layout.circleConstraint = i2;
        } else if (i == 62) {
            constraint.layout.circleRadius = i2;
        } else if (i == 72) {
            constraint.layout.mBarrierDirection = i2;
        } else if (i == 73) {
            constraint.layout.mBarrierMargin = i2;
        } else if (i == 88) {
            constraint.motion.mQuantizeInterpolatorType = i2;
        } else if (i != 89) {
            switch (i) {
                case 2:
                    constraint.layout.bottomMargin = i2;
                    return;
                case 11:
                    constraint.layout.goneBottomMargin = i2;
                    return;
                case 12:
                    constraint.layout.goneEndMargin = i2;
                    return;
                case 13:
                    constraint.layout.goneLeftMargin = i2;
                    return;
                case 14:
                    constraint.layout.goneRightMargin = i2;
                    return;
                case 15:
                    constraint.layout.goneStartMargin = i2;
                    return;
                case 16:
                    constraint.layout.goneTopMargin = i2;
                    return;
                case 17:
                    constraint.layout.guideBegin = i2;
                    return;
                case 18:
                    constraint.layout.guideEnd = i2;
                    return;
                case 31:
                    constraint.layout.startMargin = i2;
                    return;
                case 34:
                    constraint.layout.topMargin = i2;
                    return;
                case 38:
                    constraint.mViewId = i2;
                    return;
                case 64:
                    constraint.motion.mAnimateRelativeTo = i2;
                    return;
                case 66:
                    constraint.motion.mDrawPath = i2;
                    return;
                case 76:
                    constraint.motion.mPathMotionArc = i2;
                    return;
                case 78:
                    constraint.propertySet.mVisibilityMode = i2;
                    return;
                case 93:
                    constraint.layout.baselineMargin = i2;
                    return;
                case 94:
                    constraint.layout.goneBaselineMargin = i2;
                    return;
                case 97:
                    constraint.layout.mWrapBehavior = i2;
                    return;
                default:
                    switch (i) {
                        case 21:
                            constraint.layout.mHeight = i2;
                            return;
                        case 22:
                            constraint.propertySet.visibility = i2;
                            return;
                        case 23:
                            constraint.layout.mWidth = i2;
                            return;
                        case 24:
                            constraint.layout.leftMargin = i2;
                            return;
                        default:
                            switch (i) {
                                case 54:
                                    constraint.layout.widthDefault = i2;
                                    return;
                                case 55:
                                    constraint.layout.heightDefault = i2;
                                    return;
                                case 56:
                                    constraint.layout.widthMax = i2;
                                    return;
                                case 57:
                                    constraint.layout.heightMax = i2;
                                    return;
                                case 58:
                                    constraint.layout.widthMin = i2;
                                    return;
                                case 59:
                                    constraint.layout.heightMin = i2;
                                    return;
                                default:
                                    switch (i) {
                                        case 82:
                                            constraint.motion.mAnimateCircleAngleTo = i2;
                                            return;
                                        case 83:
                                            constraint.transform.transformPivotTarget = i2;
                                            return;
                                        case 84:
                                            constraint.motion.mQuantizeMotionSteps = i2;
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
            }
        } else {
            constraint.motion.mQuantizeInterpolatorID = i2;
        }
    }

    public void clone(Constraints constraints) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92c3446", new Object[]{this, constraints});
            return;
        }
        int childCount = constraints.getChildCount();
        this.mConstraints.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.mForceId || id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                if (constraint != null) {
                    if (childAt instanceof ConstraintHelper) {
                        Constraint.access$700(constraint, (ConstraintHelper) childAt, id, layoutParams);
                    }
                    Constraint.access$800(constraint, id, layoutParams);
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    private static void setDeltaValue(Constraint constraint, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316ee133", new Object[]{constraint, new Integer(i), str});
        } else if (i == 5) {
            constraint.layout.dimensionRatio = str;
        } else if (i == 65) {
            constraint.motion.mTransitionEasing = str;
        } else if (i == 74) {
            Layout layout = constraint.layout;
            layout.mReferenceIdString = str;
            layout.mReferenceIds = null;
        } else if (i == 77) {
            constraint.layout.mConstraintTag = str;
        } else if (i == 90) {
            constraint.motion.mQuantizeInterpolatorString = str;
        }
    }

    private static void setDeltaValue(Constraint constraint, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b1b84b", new Object[]{constraint, new Integer(i), new Boolean(z)});
        } else if (i == 44) {
            constraint.transform.applyElevation = z;
        } else if (i == 75) {
            constraint.layout.mBarrierAllowsGoneWidgets = z;
        } else if (i == 80) {
            constraint.layout.constrainedWidth = z;
        } else if (i == 81) {
            constraint.layout.constrainedHeight = z;
        }
    }

    public void connect(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7200b1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (!this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.put(Integer.valueOf(i), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
        if (constraint != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        Layout layout = constraint.layout;
                        layout.leftToLeft = i3;
                        layout.leftToRight = -1;
                        return;
                    } else if (i4 == 2) {
                        Layout layout2 = constraint.layout;
                        layout2.leftToRight = i3;
                        layout2.leftToLeft = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + sideToString(i4) + " undefined");
                    }
                case 2:
                    if (i4 == 1) {
                        Layout layout3 = constraint.layout;
                        layout3.rightToLeft = i3;
                        layout3.rightToRight = -1;
                        return;
                    } else if (i4 == 2) {
                        Layout layout4 = constraint.layout;
                        layout4.rightToRight = i3;
                        layout4.rightToLeft = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                case 3:
                    if (i4 == 3) {
                        Layout layout5 = constraint.layout;
                        layout5.topToTop = i3;
                        layout5.topToBottom = -1;
                        layout5.baselineToBaseline = -1;
                        layout5.baselineToTop = -1;
                        layout5.baselineToBottom = -1;
                        return;
                    } else if (i4 == 4) {
                        Layout layout6 = constraint.layout;
                        layout6.topToBottom = i3;
                        layout6.topToTop = -1;
                        layout6.baselineToBaseline = -1;
                        layout6.baselineToTop = -1;
                        layout6.baselineToBottom = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                case 4:
                    if (i4 == 4) {
                        Layout layout7 = constraint.layout;
                        layout7.bottomToBottom = i3;
                        layout7.bottomToTop = -1;
                        layout7.baselineToBaseline = -1;
                        layout7.baselineToTop = -1;
                        layout7.baselineToBottom = -1;
                        return;
                    } else if (i4 == 3) {
                        Layout layout8 = constraint.layout;
                        layout8.bottomToTop = i3;
                        layout8.bottomToBottom = -1;
                        layout8.baselineToBaseline = -1;
                        layout8.baselineToTop = -1;
                        layout8.baselineToBottom = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                case 5:
                    if (i4 == 5) {
                        Layout layout9 = constraint.layout;
                        layout9.baselineToBaseline = i3;
                        layout9.bottomToBottom = -1;
                        layout9.bottomToTop = -1;
                        layout9.topToTop = -1;
                        layout9.topToBottom = -1;
                        return;
                    } else if (i4 == 3) {
                        Layout layout10 = constraint.layout;
                        layout10.baselineToTop = i3;
                        layout10.bottomToBottom = -1;
                        layout10.bottomToTop = -1;
                        layout10.topToTop = -1;
                        layout10.topToBottom = -1;
                        return;
                    } else if (i4 == 4) {
                        Layout layout11 = constraint.layout;
                        layout11.baselineToBottom = i3;
                        layout11.bottomToBottom = -1;
                        layout11.bottomToTop = -1;
                        layout11.topToTop = -1;
                        layout11.topToBottom = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                case 6:
                    if (i4 == 6) {
                        Layout layout12 = constraint.layout;
                        layout12.startToStart = i3;
                        layout12.startToEnd = -1;
                        return;
                    } else if (i4 == 7) {
                        Layout layout13 = constraint.layout;
                        layout13.startToEnd = i3;
                        layout13.startToStart = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                case 7:
                    if (i4 == 7) {
                        Layout layout14 = constraint.layout;
                        layout14.endToEnd = i3;
                        layout14.endToStart = -1;
                        return;
                    } else if (i4 == 6) {
                        Layout layout15 = constraint.layout;
                        layout15.endToStart = i3;
                        layout15.endToEnd = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(sideToString(i2) + " to " + sideToString(i4) + " unknown");
            }
        }
    }
}
