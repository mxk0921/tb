package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Flow extends VirtualLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class WidgetsList {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget mBiggest = null;
        public int mBiggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i2;
        }

        public static /* synthetic */ ConstraintWidget access$2000(WidgetsList widgetsList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConstraintWidget) ipChange.ipc$dispatch("fd4ae7d9", new Object[]{widgetsList});
            }
            return widgetsList.mBiggest;
        }

        private void recomputeDimensions() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3af61d98", new Object[]{this});
                return;
            }
            this.mWidth = 0;
            this.mHeight = 0;
            this.mBiggest = null;
            this.mBiggestDimension = 0;
            int i = this.mCount;
            for (int i2 = 0; i2 < i && this.mStartIndex + i2 < Flow.access$400(Flow.this); i2++) {
                ConstraintWidget constraintWidget = Flow.access$500(Flow.this)[this.mStartIndex + i2];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int access$000 = Flow.access$000(Flow.this);
                    if (constraintWidget.getVisibility() == 8) {
                        access$000 = 0;
                    }
                    this.mWidth += width + access$000;
                    int access$300 = Flow.access$300(Flow.this, constraintWidget, this.mMax);
                    if (this.mBiggest == null || this.mBiggestDimension < access$300) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = access$300;
                        this.mHeight = access$300;
                    }
                } else {
                    int access$200 = Flow.access$200(Flow.this, constraintWidget, this.mMax);
                    int access$3002 = Flow.access$300(Flow.this, constraintWidget, this.mMax);
                    int access$100 = Flow.access$100(Flow.this);
                    if (constraintWidget.getVisibility() == 8) {
                        access$100 = 0;
                    }
                    this.mHeight += access$3002 + access$100;
                    if (this.mBiggest == null || this.mBiggestDimension < access$200) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = access$200;
                        this.mWidth = access$200;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2a5be2a", new Object[]{this, constraintWidget});
                return;
            }
            if (this.mOrientation == 0) {
                int access$200 = Flow.access$200(Flow.this, constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    access$200 = 0;
                }
                int access$000 = Flow.access$000(Flow.this);
                if (constraintWidget.getVisibility() != 8) {
                    i = access$000;
                }
                this.mWidth += access$200 + i;
                int access$300 = Flow.access$300(Flow.this, constraintWidget, this.mMax);
                if (this.mBiggest == null || this.mBiggestDimension < access$300) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = access$300;
                    this.mHeight = access$300;
                }
            } else {
                int access$2002 = Flow.access$200(Flow.this, constraintWidget, this.mMax);
                int access$3002 = Flow.access$300(Flow.this, constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    access$3002 = 0;
                }
                int access$100 = Flow.access$100(Flow.this);
                if (constraintWidget.getVisibility() != 8) {
                    i = access$100;
                }
                this.mHeight += access$3002 + i;
                if (this.mBiggest == null || this.mBiggestDimension < access$2002) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = access$2002;
                    this.mWidth = access$2002;
                }
            }
            this.mCount++;
        }

        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            this.mBiggestDimension = 0;
            this.mBiggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:82:0x016a, code lost:
            if (r17 != false) goto L_0x016c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x016c, code lost:
            r7 = 1.0f - r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0170, code lost:
            r10 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0189, code lost:
            if (r17 != false) goto L_0x016c;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void createConstraints(boolean r17, int r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 967
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.WidgetsList.createConstraints(boolean, int, boolean):void");
        }

        public int getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            if (this.mOrientation == 1) {
                return this.mHeight - Flow.access$100(Flow.this);
            }
            return this.mHeight;
        }

        public int getWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            if (this.mOrientation == 0) {
                return this.mWidth - Flow.access$000(Flow.this);
            }
            return this.mWidth;
        }

        public void measureMatchConstraints(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2c900d", new Object[]{this, new Integer(i)});
                return;
            }
            int i2 = this.mNbMatchConstraintsWidgets;
            if (i2 != 0) {
                int i3 = this.mCount;
                int i4 = i / i2;
                for (int i5 = 0; i5 < i3 && this.mStartIndex + i5 < Flow.access$400(Flow.this); i5++) {
                    ConstraintWidget constraintWidget = Flow.access$500(Flow.this)[this.mStartIndex + i5];
                    if (this.mOrientation == 0) {
                        if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                            Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                        }
                    } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                        Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                    }
                }
                recomputeDimensions();
            }
        }

        public void setStartIndex(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b62f830a", new Object[]{this, new Integer(i)});
            } else {
                this.mStartIndex = i;
            }
        }

        public void setup(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21d3fbe4", new Object[]{this, new Integer(i), constraintAnchor, constraintAnchor2, constraintAnchor3, constraintAnchor4, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                return;
            }
            this.mOrientation = i;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i2;
            this.mPaddingTop = i3;
            this.mPaddingRight = i4;
            this.mPaddingBottom = i5;
            this.mMax = i6;
        }
    }

    public static /* synthetic */ int access$000(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1014d261", new Object[]{flow})).intValue();
        }
        return flow.mHorizontalGap;
    }

    public static /* synthetic */ int access$100(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ded6cc0", new Object[]{flow})).intValue();
        }
        return flow.mVerticalGap;
    }

    public static /* synthetic */ int access$1000(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2900592", new Object[]{flow})).intValue();
        }
        return flow.mFirstHorizontalStyle;
    }

    public static /* synthetic */ float access$1100(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20689fee", new Object[]{flow})).floatValue();
        }
        return flow.mFirstHorizontalBias;
    }

    public static /* synthetic */ int access$1200(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e413a50", new Object[]{flow})).intValue();
        }
        return flow.mLastHorizontalStyle;
    }

    public static /* synthetic */ float access$1300(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c19d4ac", new Object[]{flow})).floatValue();
        }
        return flow.mLastHorizontalBias;
    }

    public static /* synthetic */ float access$1400(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9f26f0b", new Object[]{flow})).floatValue();
        }
        return flow.mVerticalBias;
    }

    public static /* synthetic */ int access$1500(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7cb096d", new Object[]{flow})).intValue();
        }
        return flow.mFirstVerticalStyle;
    }

    public static /* synthetic */ float access$1600(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a3a3c9", new Object[]{flow})).floatValue();
        }
        return flow.mFirstVerticalBias;
    }

    public static /* synthetic */ int access$1700(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("337c3e2b", new Object[]{flow})).intValue();
        }
        return flow.mLastVerticalStyle;
    }

    public static /* synthetic */ float access$1800(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6154d887", new Object[]{flow})).floatValue();
        }
        return flow.mLastVerticalBias;
    }

    public static /* synthetic */ int access$1900(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f2d72e9", new Object[]{flow})).intValue();
        }
        return flow.mHorizontalAlign;
    }

    public static /* synthetic */ int access$200(Flow flow, ConstraintWidget constraintWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2167cf90", new Object[]{flow, constraintWidget, new Integer(i)})).intValue();
        }
        return flow.getWidgetWidth(constraintWidget, i);
    }

    public static /* synthetic */ int access$300(Flow flow, ConstraintWidget constraintWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61e2e52f", new Object[]{flow, constraintWidget, new Integer(i)})).intValue();
        }
        return flow.getWidgetHeight(constraintWidget, i);
    }

    public static /* synthetic */ int access$400(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7773bdd", new Object[]{flow})).intValue();
        }
        return flow.mDisplayedWidgetsCount;
    }

    public static /* synthetic */ ConstraintWidget[] access$500(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget[]) ipChange.ipc$dispatch("11dd6b4a", new Object[]{flow});
        }
        return flow.mDisplayedWidgets;
    }

    public static /* synthetic */ int access$600(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2328709b", new Object[]{flow})).intValue();
        }
        return flow.mVerticalStyle;
    }

    public static /* synthetic */ int access$700(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51010afa", new Object[]{flow})).intValue();
        }
        return flow.mVerticalAlign;
    }

    public static /* synthetic */ int access$800(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ed9a559", new Object[]{flow})).intValue();
        }
        return flow.mHorizontalStyle;
    }

    public static /* synthetic */ float access$900(Flow flow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acb23fb5", new Object[]{flow})).floatValue();
        }
        return flow.mHorizontalBias;
    }

    private int getWidgetHeight(ConstraintWidget constraintWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d79c06c", new Object[]{this, constraintWidget, new Integer(i)})).intValue();
        }
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentHeight * i);
                if (i3 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.getHeight();
            } else {
                if (i2 == 3) {
                    return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getHeight();
    }

    private int getWidgetWidth(ConstraintWidget constraintWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e26a4d7", new Object[]{this, constraintWidget, new Integer(i)})).intValue();
        }
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.mMatchConstraintPercentWidth * i);
                if (i3 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.getWidth();
            } else {
                if (i2 == 3) {
                    return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
                }
            }
        }
        return constraintWidget.getWidth();
    }

    public static /* synthetic */ Object ipc$super(Flow flow, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1680364003) {
            super.copy((ConstraintWidget) objArr[0], (HashMap) objArr[1]);
            return null;
        } else if (hashCode == -143252021) {
            super.addToSolver((LinearSystem) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/core/widgets/Flow");
        }
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        ConstraintAnchor constraintAnchor;
        boolean z2;
        int i9;
        boolean z3;
        int i10;
        int i11 = i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590df8bf", new Object[]{this, constraintWidgetArr, new Integer(i), new Integer(i11), new Integer(i3), iArr});
        } else if (i != 0) {
            this.mChainList.clear();
            WidgetsList widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
            this.mChainList.add(widgetsList);
            if (i11 == 0) {
                int i12 = 0;
                i4 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i14 < i) {
                    i12++;
                    ConstraintWidget constraintWidget = constraintWidgetArr[i14];
                    int widgetWidth = getWidgetWidth(constraintWidget, i3);
                    if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    if ((i13 == i3 || this.mHorizontalGap + i13 + widgetWidth > i3) && WidgetsList.access$2000(widgetsList) != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && i14 > 0 && (i10 = this.mMaxElementsWrap) > 0 && i12 > i10) {
                        z3 = true;
                    }
                    if (z3) {
                        widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                        widgetsList.setStartIndex(i14);
                        this.mChainList.add(widgetsList);
                        i13 = widgetWidth;
                        i12 = 1;
                    } else if (i14 > 0) {
                        i13 += this.mHorizontalGap + widgetWidth;
                    } else {
                        i13 = widgetWidth;
                    }
                    widgetsList.add(constraintWidget);
                    i14++;
                    i4 = i4;
                }
            } else {
                int i15 = 0;
                i4 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i17 < i) {
                    i15++;
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i17];
                    int widgetHeight = getWidgetHeight(constraintWidget2, i3);
                    if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    if ((i16 == i3 || this.mVerticalGap + i16 + widgetHeight > i3) && WidgetsList.access$2000(widgetsList) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && i17 > 0 && (i9 = this.mMaxElementsWrap) > 0 && i15 > i9) {
                        z2 = true;
                    }
                    if (z2) {
                        widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                        widgetsList.setStartIndex(i17);
                        this.mChainList.add(widgetsList);
                        i16 = widgetHeight;
                        i15 = 1;
                    } else if (i17 > 0) {
                        i16 += this.mVerticalGap + widgetHeight;
                    } else {
                        i16 = widgetHeight;
                    }
                    widgetsList.add(constraintWidget2);
                    i17++;
                    i4 = i4;
                }
            }
            int size = this.mChainList.size();
            ConstraintAnchor constraintAnchor2 = this.mLeft;
            ConstraintAnchor constraintAnchor3 = this.mTop;
            ConstraintAnchor constraintAnchor4 = this.mRight;
            ConstraintAnchor constraintAnchor5 = this.mBottom;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour) {
                z = true;
            } else {
                z = false;
            }
            if (i4 > 0 && z) {
                for (int i18 = 0; i18 < size; i18++) {
                    WidgetsList widgetsList2 = this.mChainList.get(i18);
                    if (i11 == 0) {
                        widgetsList2.measureMatchConstraints(i3 - widgetsList2.getWidth());
                    } else {
                        widgetsList2.measureMatchConstraints(i3 - widgetsList2.getHeight());
                    }
                }
            }
            int i19 = paddingTop;
            int i20 = paddingRight;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = paddingLeft;
            ConstraintAnchor constraintAnchor6 = constraintAnchor3;
            ConstraintAnchor constraintAnchor7 = constraintAnchor2;
            int i25 = paddingBottom;
            while (i23 < size) {
                WidgetsList widgetsList3 = this.mChainList.get(i23);
                if (i11 == 0) {
                    if (i23 < size - 1) {
                        constraintAnchor = WidgetsList.access$2000(this.mChainList.get(i23 + 1)).mTop;
                        i8 = 0;
                    } else {
                        constraintAnchor = this.mBottom;
                        i8 = getPaddingBottom();
                    }
                    ConstraintAnchor constraintAnchor8 = WidgetsList.access$2000(widgetsList3).mBottom;
                    i5 = size;
                    widgetsList3.setup(i2, constraintAnchor7, constraintAnchor6, constraintAnchor4, constraintAnchor, i24, i19, i20, i8, i3);
                    int max = Math.max(i22, widgetsList3.getWidth());
                    i21 += widgetsList3.getHeight();
                    if (i23 > 0) {
                        i21 += this.mVerticalGap;
                    }
                    i22 = max;
                    i19 = 0;
                    constraintAnchor7 = constraintAnchor7;
                    i6 = i20;
                    i7 = i23;
                    constraintAnchor6 = constraintAnchor8;
                    constraintAnchor5 = constraintAnchor;
                    i25 = i8;
                } else {
                    i5 = size;
                    i7 = i23;
                    if (i7 < i5 - 1) {
                        constraintAnchor4 = WidgetsList.access$2000(this.mChainList.get(i7 + 1)).mLeft;
                        i6 = 0;
                    } else {
                        constraintAnchor4 = this.mRight;
                        i6 = getPaddingRight();
                    }
                    ConstraintAnchor constraintAnchor9 = WidgetsList.access$2000(widgetsList3).mRight;
                    widgetsList3.setup(i2, constraintAnchor7, constraintAnchor6, constraintAnchor4, constraintAnchor5, i24, i19, i6, i25, i3);
                    i22 += widgetsList3.getWidth();
                    int max2 = Math.max(i21, widgetsList3.getHeight());
                    if (i7 > 0) {
                        i22 += this.mHorizontalGap;
                    }
                    i21 = max2;
                    constraintAnchor7 = constraintAnchor9;
                    i24 = 0;
                }
                i23 = i7 + 1;
                size = i5;
                i11 = i2;
                i20 = i6;
            }
            iArr[0] = i22;
            iArr[1] = i21;
        }
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        WidgetsList widgetsList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e9cc384", new Object[]{this, constraintWidgetArr, new Integer(i), new Integer(i2), new Integer(i3), iArr});
        } else if (i != 0) {
            if (this.mChainList.size() == 0) {
                widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                this.mChainList.add(widgetsList);
            } else {
                WidgetsList widgetsList2 = this.mChainList.get(0);
                widgetsList2.clear();
                widgetsList = widgetsList2;
                widgetsList.setup(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i3);
            }
            for (int i4 = 0; i4 < i; i4++) {
                widgetsList.add(constraintWidgetArr[i4]);
            }
            iArr[0] = widgetsList.getWidth();
            iArr[1] = widgetsList.getHeight();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd7ae1d", new Object[]{this, constraintWidget, hashMap});
            return;
        }
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b00dc26", new Object[]{this})).floatValue();
        }
        return this.mMaxElementsWrap;
    }

    public void setFirstHorizontalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4d8aee", new Object[]{this, new Float(f)});
        } else {
            this.mFirstHorizontalBias = f;
        }
    }

    public void setFirstHorizontalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27981d", new Object[]{this, new Integer(i)});
        } else {
            this.mFirstHorizontalStyle = i;
        }
    }

    public void setFirstVerticalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc8105c", new Object[]{this, new Float(f)});
        } else {
            this.mFirstVerticalBias = f;
        }
    }

    public void setFirstVerticalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdc06f", new Object[]{this, new Integer(i)});
        } else {
            this.mFirstVerticalStyle = i;
        }
    }

    public void setHorizontalAlign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9450fa3d", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalAlign = i;
        }
    }

    public void setHorizontalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa5b57a", new Object[]{this, new Float(f)});
        } else {
            this.mHorizontalBias = f;
        }
    }

    public void setHorizontalGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5afb368c", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalGap = i;
        }
    }

    public void setHorizontalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad4bf11", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalStyle = i;
        }
    }

    public void setLastHorizontalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b8f804", new Object[]{this, new Float(f)});
        } else {
            this.mLastHorizontalBias = f;
        }
    }

    public void setLastHorizontalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f29cdc7", new Object[]{this, new Integer(i)});
        } else {
            this.mLastHorizontalStyle = i;
        }
    }

    public void setLastVerticalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c837caf2", new Object[]{this, new Float(f)});
        } else {
            this.mLastVerticalBias = f;
        }
    }

    public void setLastVerticalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f855899", new Object[]{this, new Integer(i)});
        } else {
            this.mLastVerticalStyle = i;
        }
    }

    public void setMaxElementsWrap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6e4c99", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxElementsWrap = i;
        }
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.mOrientation = i;
        }
    }

    public void setVerticalAlign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146c4f8f", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalAlign = i;
        }
    }

    public void setVerticalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6016de8", new Object[]{this, new Float(f)});
        } else {
            this.mVerticalBias = f;
        }
    }

    public void setVerticalGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62fb85e", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalGap = i;
        }
    }

    public void setVerticalStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af01463", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalStyle = i;
        }
    }

    public void setWrapMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31ef92d", new Object[]{this, new Integer(i)});
        } else {
            this.mWrapMode = i;
        }
    }

    private void createAlignedConstraints(boolean z) {
        ConstraintWidget constraintWidget;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6c589f", new Object[]{this, new Boolean(z)});
        } else if (this.mAlignedDimensions != null && this.mAlignedBiggestElementsInCols != null && this.mAlignedBiggestElementsInRows != null) {
            for (int i2 = 0; i2 < this.mDisplayedWidgetsCount; i2++) {
                this.mDisplayedWidgets[i2].resetAnchors();
            }
            int[] iArr = this.mAlignedDimensions;
            int i3 = iArr[0];
            int i4 = iArr[1];
            float f = this.mHorizontalBias;
            ConstraintWidget constraintWidget2 = null;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.mHorizontalBias;
                } else {
                    i = i5;
                }
                ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i];
                if (!(constraintWidget3 == null || constraintWidget3.getVisibility() == 8)) {
                    if (i5 == 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                        constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                        constraintWidget3.setHorizontalBiasPercent(f);
                    }
                    if (i5 == i3 - 1) {
                        constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                    }
                    if (i5 > 0 && constraintWidget2 != null) {
                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                        constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i5++;
                f = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i6];
                if (!(constraintWidget4 == null || constraintWidget4.getVisibility() == 8)) {
                    if (i6 == 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                        constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                        constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                    }
                    if (i6 == i4 - 1) {
                        constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                    }
                    if (i6 > 0 && constraintWidget2 != null) {
                        constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                        constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.mOrientation == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                    if (!(i9 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i9]) == null || constraintWidget.getVisibility() == 8)) {
                        ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i7];
                        ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i8];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                            constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                            constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0135 -> B:40:0x0083). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x013b -> B:40:0x0083). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x013d -> B:40:0x0083). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0133 -> B:40:0x0083). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77625cb", new Object[]{this, linearSystem, new Boolean(z)});
            return;
        }
        super.addToSolver(linearSystem, z);
        boolean z2 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i = this.mWrapMode;
        if (i != 0) {
            if (i == 1) {
                int size = this.mChainList.size();
                int i2 = 0;
                while (i2 < size) {
                    this.mChainList.get(i2).createConstraints(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                createAlignedConstraints(z2);
            } else if (i == 3) {
                int size2 = this.mChainList.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.mChainList.get(i3).createConstraints(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z2, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        ConstraintAnchor constraintAnchor;
        int i7;
        int i8;
        int i9 = i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13d32c0", new Object[]{this, constraintWidgetArr, new Integer(i), new Integer(i9), new Integer(i3), iArr});
        } else if (i != 0) {
            this.mChainList.clear();
            WidgetsList widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
            this.mChainList.add(widgetsList);
            if (i9 == 0) {
                i4 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < i; i11++) {
                    ConstraintWidget constraintWidget = constraintWidgetArr[i11];
                    int widgetWidth = getWidgetWidth(constraintWidget, i3);
                    if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    boolean z = (i10 == i3 || (this.mHorizontalGap + i10) + widgetWidth > i3) && WidgetsList.access$2000(widgetsList) != null;
                    if (!z && i11 > 0 && (i8 = this.mMaxElementsWrap) > 0 && i11 % i8 == 0) {
                        z = true;
                    }
                    if (z) {
                        widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                        widgetsList.setStartIndex(i11);
                        this.mChainList.add(widgetsList);
                    } else if (i11 > 0) {
                        i10 += this.mHorizontalGap + widgetWidth;
                        widgetsList.add(constraintWidget);
                    }
                    i10 = widgetWidth;
                    widgetsList.add(constraintWidget);
                }
            } else {
                i4 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i; i13++) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i13];
                    int widgetHeight = getWidgetHeight(constraintWidget2, i3);
                    if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    boolean z2 = (i12 == i3 || (this.mVerticalGap + i12) + widgetHeight > i3) && WidgetsList.access$2000(widgetsList) != null;
                    if (!z2 && i13 > 0 && (i7 = this.mMaxElementsWrap) > 0 && i13 % i7 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        widgetsList = new WidgetsList(i2, this.mLeft, this.mTop, this.mRight, this.mBottom, i3);
                        widgetsList.setStartIndex(i13);
                        this.mChainList.add(widgetsList);
                    } else if (i13 > 0) {
                        i12 += this.mVerticalGap + widgetHeight;
                        widgetsList.add(constraintWidget2);
                    }
                    i12 = widgetHeight;
                    widgetsList.add(constraintWidget2);
                }
            }
            int size = this.mChainList.size();
            ConstraintAnchor constraintAnchor2 = this.mLeft;
            ConstraintAnchor constraintAnchor3 = this.mTop;
            ConstraintAnchor constraintAnchor4 = this.mRight;
            ConstraintAnchor constraintAnchor5 = this.mBottom;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z3 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
            if (i4 > 0 && z3) {
                for (int i14 = 0; i14 < size; i14++) {
                    WidgetsList widgetsList2 = this.mChainList.get(i14);
                    if (i9 == 0) {
                        widgetsList2.measureMatchConstraints(i3 - widgetsList2.getWidth());
                    } else {
                        widgetsList2.measureMatchConstraints(i3 - widgetsList2.getHeight());
                    }
                }
            }
            int i15 = paddingTop;
            int i16 = paddingRight;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = paddingLeft;
            ConstraintAnchor constraintAnchor6 = constraintAnchor3;
            ConstraintAnchor constraintAnchor7 = constraintAnchor2;
            int i21 = paddingBottom;
            while (i19 < size) {
                WidgetsList widgetsList3 = this.mChainList.get(i19);
                if (i9 == 0) {
                    if (i19 < size - 1) {
                        constraintAnchor = WidgetsList.access$2000(this.mChainList.get(i19 + 1)).mTop;
                        i6 = 0;
                    } else {
                        constraintAnchor = this.mBottom;
                        i6 = getPaddingBottom();
                    }
                    ConstraintAnchor constraintAnchor8 = WidgetsList.access$2000(widgetsList3).mBottom;
                    size = size;
                    widgetsList3.setup(i2, constraintAnchor7, constraintAnchor6, constraintAnchor4, constraintAnchor, i20, i15, i16, i6, i3);
                    int max = Math.max(i18, widgetsList3.getWidth());
                    i17 += widgetsList3.getHeight();
                    if (i19 > 0) {
                        i17 += this.mVerticalGap;
                    }
                    i18 = max;
                    i15 = 0;
                    constraintAnchor7 = constraintAnchor7;
                    i16 = i16;
                    i5 = i19;
                    constraintAnchor6 = constraintAnchor8;
                    constraintAnchor5 = constraintAnchor;
                    i21 = i6;
                } else {
                    size = size;
                    i5 = i19;
                    if (i5 < size - 1) {
                        constraintAnchor4 = WidgetsList.access$2000(this.mChainList.get(i5 + 1)).mLeft;
                        i16 = 0;
                    } else {
                        constraintAnchor4 = this.mRight;
                        i16 = getPaddingRight();
                    }
                    ConstraintAnchor constraintAnchor9 = WidgetsList.access$2000(widgetsList3).mRight;
                    widgetsList3.setup(i2, constraintAnchor7, constraintAnchor6, constraintAnchor4, constraintAnchor5, i20, i15, i16, i21, i3);
                    i18 += widgetsList3.getWidth();
                    int max2 = Math.max(i17, widgetsList3.getHeight());
                    if (i5 > 0) {
                        i18 += this.mHorizontalGap;
                    }
                    i17 = max2;
                    constraintAnchor7 = constraintAnchor9;
                    i20 = 0;
                }
                i19 = i5 + 1;
                i9 = i2;
            }
            iArr[0] = i18;
            iArr[1] = i17;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i, int i2, int i3, int i4) {
        int i5;
        int[] iArr;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c17925", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mWidgetsCount <= 0 || measureChildren()) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int[] iArr2 = new int[2];
            int i7 = (i2 - paddingLeft) - paddingRight;
            int i8 = this.mOrientation;
            if (i8 == 1) {
                i7 = (i4 - paddingTop) - paddingBottom;
            }
            if (i8 == 0) {
                if (this.mHorizontalStyle == -1) {
                    this.mHorizontalStyle = 0;
                }
                if (this.mVerticalStyle == -1) {
                    this.mVerticalStyle = 0;
                }
            } else {
                if (this.mHorizontalStyle == -1) {
                    this.mHorizontalStyle = 0;
                }
                if (this.mVerticalStyle == -1) {
                    this.mVerticalStyle = 0;
                }
            }
            ConstraintWidget[] constraintWidgetArr = this.mWidgets;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i5 = this.mWidgetsCount;
                if (i9 >= i5) {
                    break;
                }
                if (this.mWidgets[i9].getVisibility() == 8) {
                    i10++;
                }
                i9++;
            }
            if (i10 > 0) {
                constraintWidgetArr = new ConstraintWidget[i5 - i10];
                int i11 = 0;
                i5 = 0;
                while (i11 < this.mWidgetsCount) {
                    ConstraintWidget constraintWidget = this.mWidgets[i11];
                    if (constraintWidget.getVisibility() != 8) {
                        constraintWidgetArr[i5] = constraintWidget;
                        i6 = 1;
                        i5++;
                    } else {
                        i6 = 1;
                    }
                    i11 += i6;
                }
            }
            this.mDisplayedWidgets = constraintWidgetArr;
            this.mDisplayedWidgetsCount = i5;
            int i12 = this.mWrapMode;
            if (i12 == 0) {
                iArr = iArr2;
                measureNoWrap(constraintWidgetArr, i5, this.mOrientation, i7, iArr2);
            } else if (i12 == 1) {
                iArr = iArr2;
                measureChainWrap(constraintWidgetArr, i5, this.mOrientation, i7, iArr2);
            } else if (i12 == 2) {
                iArr = iArr2;
                measureAligned(constraintWidgetArr, i5, this.mOrientation, i7, iArr2);
            } else if (i12 != 3) {
                iArr = iArr2;
            } else {
                iArr = iArr2;
                measureChainWrap_new(constraintWidgetArr, i5, this.mOrientation, i7, iArr2);
            }
            int i13 = iArr[0] + paddingLeft + paddingRight;
            int i14 = iArr[1] + paddingTop + paddingBottom;
            if (i == 1073741824) {
                i13 = i2;
            } else if (i == Integer.MIN_VALUE) {
                i13 = Math.min(i13, i2);
            } else if (i != 0) {
                i13 = 0;
            }
            if (i3 == 1073741824) {
                i14 = i4;
            } else if (i3 == Integer.MIN_VALUE) {
                i14 = Math.min(i14, i4);
            } else if (i3 != 0) {
                i14 = 0;
            }
            setMeasure(i13, i14);
            setWidth(i13);
            setHeight(i14);
            needsCallbackFromSolver(this.mWidgetsCount > 0);
        } else {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
        }
    }
}
