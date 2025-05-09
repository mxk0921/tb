package androidx.constraintlayout.core.utils;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GridCore extends VirtualLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int SPANS_RESPECT_WIDGET_ORDER = 2;
    public static final int SUB_GRID_BY_COL_ROW = 1;
    public static final int VERTICAL = 1;
    private ConstraintWidget[] mBoxWidgets;
    private String mColumnWeights;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    public ConstraintWidgetContainer mContainer;
    private int mFlags;
    private float mHorizontalGaps;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private String mRowWeights;
    private int mRows;
    private int mRowsSet;
    private String mSkips;
    private int[][] mSpanMatrix;
    private String mSpans;
    private float mVerticalGaps;
    private boolean mExtraSpaceHandled = false;
    private int mNextAvailableIndex = 0;
    public Set<String> mSpanIds = new HashSet();
    private int mSpanIndex = 0;

    public GridCore() {
        updateActualRowsAndColumns();
        initMatrices();
    }

    private void addConstraints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1035e8dc", new Object[]{this});
            return;
        }
        setBoxWidgetVerticalChains();
        setBoxWidgetHorizontalChains();
        arrangeWidgets();
    }

    private void arrangeWidgets() {
        int[][] iArr;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207c446a", new Object[]{this});
            return;
        }
        for (int i2 = 0; i2 < this.mWidgetsCount; i2++) {
            if (!this.mSpanIds.contains(this.mWidgets[i2].stringId)) {
                int nextPosition = getNextPosition();
                int rowByIndex = getRowByIndex(nextPosition);
                int colByIndex = getColByIndex(nextPosition);
                if (nextPosition != -1) {
                    if (isSpansRespectWidgetOrder() && (iArr = this.mSpanMatrix) != null && (i = this.mSpanIndex) < iArr.length) {
                        int[] iArr2 = iArr[i];
                        if (iArr2[0] == nextPosition) {
                            this.mPositionMatrix[rowByIndex][colByIndex] = true;
                            if (invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                                ConstraintWidget constraintWidget = this.mWidgets[i2];
                                int[] iArr3 = this.mSpanMatrix[this.mSpanIndex];
                                connectWidget(constraintWidget, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
                                this.mSpanIndex++;
                            }
                        }
                    }
                    connectWidget(this.mWidgets[i2], rowByIndex, colByIndex, 1, 1);
                } else {
                    return;
                }
            }
        }
    }

    private void clearHorizontalAttributes(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("298a19a3", new Object[]{this, constraintWidget});
            return;
        }
        constraintWidget.setHorizontalWeight(-1.0f);
        constraintWidget.mLeft.reset();
        constraintWidget.mRight.reset();
    }

    private void clearVerticalAttributes(ConstraintWidget constraintWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10e7ed1", new Object[]{this, constraintWidget});
            return;
        }
        constraintWidget.setVerticalWeight(-1.0f);
        constraintWidget.mTop.reset();
        constraintWidget.mBottom.reset();
        constraintWidget.mBaseline.reset();
    }

    private void connectWidget(ConstraintWidget constraintWidget, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd6205d", new Object[]{this, constraintWidget, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        constraintWidget.mLeft.connect(this.mBoxWidgets[i2].mLeft, 0);
        constraintWidget.mTop.connect(this.mBoxWidgets[i].mTop, 0);
        constraintWidget.mRight.connect(this.mBoxWidgets[(i2 + i4) - 1].mRight, 0);
        constraintWidget.mBottom.connect(this.mBoxWidgets[(i + i3) - 1].mBottom, 0);
    }

    private void fillConstraintMatrix(boolean z) {
        int[][] parseSpans;
        int[][] parseSpans2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b6082c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            for (int i = 0; i < this.mPositionMatrix.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.mConstraintMatrix.length; i3++) {
                int i4 = 0;
                while (true) {
                    int[][] iArr = this.mConstraintMatrix;
                    if (i4 < iArr[0].length) {
                        iArr[i3][i4] = -1;
                        i4++;
                    }
                }
            }
        }
        this.mNextAvailableIndex = 0;
        String str = this.mSkips;
        if (!(str == null || str.trim().isEmpty() || (parseSpans2 = parseSpans(this.mSkips, false)) == null)) {
            handleSkips(parseSpans2);
        }
        String str2 = this.mSpans;
        if (!(str2 == null || str2.trim().isEmpty() || (parseSpans = parseSpans(this.mSpans, true)) == null)) {
            handleSpans(parseSpans);
        }
    }

    private int getColByIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f1718de", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.mOrientation == 1) {
            return i / this.mRows;
        }
        return i % this.mColumns;
    }

    private int getNextPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72cd32c", new Object[]{this})).intValue();
        }
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.mNextAvailableIndex;
            if (i >= this.mRows * this.mColumns) {
                return -1;
            }
            int rowByIndex = getRowByIndex(i);
            int colByIndex = getColByIndex(this.mNextAvailableIndex);
            boolean[] zArr = this.mPositionMatrix[rowByIndex];
            if (zArr[colByIndex]) {
                zArr[colByIndex] = false;
                z = true;
            }
            this.mNextAvailableIndex++;
        }
        return i;
    }

    private int getRowByIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2939a38", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.mOrientation == 1) {
            return i % this.mRows;
        }
        return i / this.mColumns;
    }

    private void handleSkips(int[][] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147a3370", new Object[]{this, iArr});
            return;
        }
        for (int[] iArr2 : iArr) {
            if (!invalidatePositions(getRowByIndex(iArr2[0]), getColByIndex(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void handleSpans(int[][] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321d4a3b", new Object[]{this, iArr});
        } else if (!isSpansRespectWidgetOrder()) {
            for (int i = 0; i < iArr.length; i++) {
                int rowByIndex = getRowByIndex(iArr[i][0]);
                int colByIndex = getColByIndex(iArr[i][0]);
                int[] iArr2 = iArr[i];
                if (invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                    ConstraintWidget constraintWidget = this.mWidgets[i];
                    int[] iArr3 = iArr[i];
                    connectWidget(constraintWidget, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
                    this.mSpanIds.add(this.mWidgets[i].stringId);
                } else {
                    return;
                }
            }
        }
    }

    private void initVariables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b627f34e", new Object[]{this});
            return;
        }
        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.mWidgetsCount;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i, 4);
            this.mConstraintMatrix = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean invalidatePositions(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71cde03a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.mPositionMatrix;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(GridCore gridCore, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -155092699) {
            super.measure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode == -143252021) {
            super.addToSolver((LinearSystem) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/core/utils/GridCore");
        }
    }

    private boolean isSpansRespectWidgetOrder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c80a8e", new Object[]{this})).booleanValue();
        }
        if ((this.mFlags & 2) > 0) {
            return true;
        }
        return false;
    }

    private boolean isSubGridByColRow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e453eb8", new Object[]{this})).booleanValue();
        }
        if ((this.mFlags & 1) > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$parseSpans$0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3357a74d", new Object[]{str, str2})).intValue();
        }
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    private ConstraintWidget makeNewWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidget) ipChange.ipc$dispatch("9d656bbf", new Object[]{this});
        }
        ConstraintWidget constraintWidget = new ConstraintWidget();
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        constraintWidget.stringId = String.valueOf(constraintWidget.hashCode());
        return constraintWidget;
    }

    private void setBoxWidgetVerticalChains() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2602f1fc", new Object[]{this});
            return;
        }
        int max = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget = this.mBoxWidgets[0];
        float[] parseWeights = parseWeights(this.mRows, this.mRowWeights);
        if (this.mRows == 1) {
            clearVerticalAttributes(constraintWidget);
            constraintWidget.mTop.connect(this.mTop, 0);
            constraintWidget.mBottom.connect(this.mBottom, 0);
            return;
        }
        int i2 = 0;
        while (true) {
            i = this.mRows;
            if (i2 < i) {
                ConstraintWidget constraintWidget2 = this.mBoxWidgets[i2];
                clearVerticalAttributes(constraintWidget2);
                if (parseWeights != null) {
                    constraintWidget2.setVerticalWeight(parseWeights[i2]);
                }
                if (i2 > 0) {
                    constraintWidget2.mTop.connect(this.mBoxWidgets[i2 - 1].mBottom, 0);
                } else {
                    constraintWidget2.mTop.connect(this.mTop, 0);
                }
                if (i2 < this.mRows - 1) {
                    constraintWidget2.mBottom.connect(this.mBoxWidgets[i2 + 1].mTop, 0);
                } else {
                    constraintWidget2.mBottom.connect(this.mBottom, 0);
                }
                if (i2 > 0) {
                    constraintWidget2.mTop.mMargin = (int) this.mVerticalGaps;
                }
                i2++;
            }
        }
        while (i < max) {
            ConstraintWidget constraintWidget3 = this.mBoxWidgets[i];
            clearVerticalAttributes(constraintWidget3);
            constraintWidget3.mTop.connect(this.mTop, 0);
            constraintWidget3.mBottom.connect(this.mBottom, 0);
            i++;
        }
    }

    private void setupGrid(boolean z) {
        int[][] parseSpans;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba68b1aa", new Object[]{this, new Boolean(z)});
        } else if (this.mRows >= 1 && this.mColumns >= 1) {
            if (z) {
                for (int i = 0; i < this.mPositionMatrix.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr = this.mPositionMatrix;
                        if (i2 < zArr[0].length) {
                            zArr[i][i2] = true;
                            i2++;
                        }
                    }
                }
                this.mSpanIds.clear();
            }
            this.mNextAvailableIndex = 0;
            String str = this.mSkips;
            if (!(str == null || str.trim().isEmpty() || (parseSpans = parseSpans(this.mSkips, false)) == null)) {
                handleSkips(parseSpans);
            }
            String str2 = this.mSpans;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.mSpanMatrix = parseSpans(this.mSpans, true);
            }
            createBoxes();
            int[][] iArr = this.mSpanMatrix;
            if (iArr != null) {
                handleSpans(iArr);
            }
        }
    }

    private void updateActualRowsAndColumns() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477025dd", new Object[]{this});
            return;
        }
        int i2 = this.mRowsSet;
        if (i2 == 0 || (i = this.mColumnsSet) == 0) {
            int i3 = this.mColumnsSet;
            if (i3 > 0) {
                this.mColumns = i3;
                this.mRows = ((this.mWidgetsCount + i3) - 1) / i3;
            } else if (i2 > 0) {
                this.mRows = i2;
                this.mColumns = ((this.mWidgetsCount + i2) - 1) / i2;
            } else {
                int sqrt = (int) (Math.sqrt(this.mWidgetsCount) + 1.5d);
                this.mRows = sqrt;
                this.mColumns = ((this.mWidgetsCount + sqrt) - 1) / sqrt;
            }
        } else {
            this.mRows = i2;
            this.mColumns = i;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77625cb", new Object[]{this, linearSystem, new Boolean(z)});
            return;
        }
        super.addToSolver(linearSystem, z);
        addConstraints();
    }

    public String getColumnWeights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86317d4a", new Object[]{this});
        }
        return this.mColumnWeights;
    }

    public ConstraintWidgetContainer getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintWidgetContainer) ipChange.ipc$dispatch("fc4b601", new Object[]{this});
        }
        return this.mContainer;
    }

    public int getFlags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a71a48cb", new Object[]{this})).intValue();
        }
        return this.mFlags;
    }

    public float getHorizontalGaps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c79e488e", new Object[]{this})).floatValue();
        }
        return this.mHorizontalGaps;
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        return this.mOrientation;
    }

    public String getRowWeights() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af647da2", new Object[]{this});
        }
        return this.mRowWeights;
    }

    public float getVerticalGaps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3601b760", new Object[]{this})).floatValue();
        }
        return this.mVerticalGaps;
    }

    public void setColumnWeights(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749e0dd4", new Object[]{this, str});
            return;
        }
        String str2 = this.mColumnWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mColumnWeights = str;
        }
    }

    public void setColumns(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af00d721", new Object[]{this, new Integer(i)});
        } else if (i <= 50 && this.mColumnsSet != i) {
            this.mColumnsSet = i;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public void setContainer(ConstraintWidgetContainer constraintWidgetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2ac8c3", new Object[]{this, constraintWidgetContainer});
        } else {
            this.mContainer = constraintWidgetContainer;
        }
    }

    public void setFlags(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a539337", new Object[]{this, new Integer(i)});
        } else {
            this.mFlags = i;
        }
    }

    public void setHorizontalGaps(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6ff256", new Object[]{this, new Float(f)});
        } else if (f >= 0.0f && this.mHorizontalGaps != f) {
            this.mHorizontalGaps = f;
        }
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else if ((i == 0 || i == 1) && this.mOrientation != i) {
            this.mOrientation = i;
        }
    }

    public void setRowWeights(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b414be14", new Object[]{this, str});
            return;
        }
        String str2 = this.mRowWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mRowWeights = str;
        }
    }

    public void setRows(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb6ee1", new Object[]{this, new Integer(i)});
        } else if (i <= 50 && this.mRowsSet != i) {
            this.mRowsSet = i;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public void setSkips(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78ceca3", new Object[]{this, str});
            return;
        }
        String str2 = this.mSkips;
        if (str2 == null || !str2.equals(str)) {
            this.mExtraSpaceHandled = false;
            this.mSkips = str;
        }
    }

    public void setSpans(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f006d2", new Object[]{this, charSequence});
            return;
        }
        String str = this.mSpans;
        if (str == null || !str.equals(charSequence.toString())) {
            this.mExtraSpaceHandled = false;
            this.mSpans = charSequence.toString();
        }
    }

    public void setVerticalGaps(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbaac4", new Object[]{this, new Float(f)});
        } else if (f >= 0.0f && this.mVerticalGaps != f) {
            this.mVerticalGaps = f;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c17925", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.measure(i, i2, i3, i4);
        this.mContainer = (ConstraintWidgetContainer) getParent();
        setupGrid(false);
        this.mContainer.add(this.mBoxWidgets);
    }

    private void createBoxes() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4301e24", new Object[]{this});
            return;
        }
        int max = Math.max(this.mRows, this.mColumns);
        ConstraintWidget[] constraintWidgetArr = this.mBoxWidgets;
        if (constraintWidgetArr == null) {
            this.mBoxWidgets = new ConstraintWidget[max];
            while (true) {
                ConstraintWidget[] constraintWidgetArr2 = this.mBoxWidgets;
                if (i < constraintWidgetArr2.length) {
                    constraintWidgetArr2[i] = makeNewWidget();
                    i++;
                } else {
                    return;
                }
            }
        } else if (max != constraintWidgetArr.length) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[max];
            while (i < max) {
                ConstraintWidget[] constraintWidgetArr4 = this.mBoxWidgets;
                if (i < constraintWidgetArr4.length) {
                    constraintWidgetArr3[i] = constraintWidgetArr4[i];
                } else {
                    constraintWidgetArr3[i] = makeNewWidget();
                }
                i++;
            }
            while (true) {
                ConstraintWidget[] constraintWidgetArr5 = this.mBoxWidgets;
                if (max < constraintWidgetArr5.length) {
                    this.mContainer.remove(constraintWidgetArr5[max]);
                    max++;
                } else {
                    this.mBoxWidgets = constraintWidgetArr3;
                    return;
                }
            }
        }
    }

    private void initMatrices() {
        boolean[][] zArr;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e715211", new Object[]{this});
            return;
        }
        int[][] iArr = this.mConstraintMatrix;
        if (iArr != null && iArr.length == this.mWidgetsCount && (zArr = this.mPositionMatrix) != null && zArr.length == this.mRows && zArr[0].length == this.mColumns) {
            z = true;
        }
        if (!z) {
            initVariables();
        }
        fillConstraintMatrix(z);
    }

    private float[] parseWeights(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("ebfe0e43", new Object[]{this, new Integer(i), str});
        }
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] split = str.split(",");
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < split.length) {
                try {
                    fArr[i2] = Float.parseFloat(split[i2]);
                } catch (Exception e) {
                    PrintStream printStream = System.err;
                    printStream.println("Error parsing `" + split[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    private void setBoxWidgetHorizontalChains() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d453a5ea", new Object[]{this});
            return;
        }
        int max = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget = this.mBoxWidgets[0];
        float[] parseWeights = parseWeights(this.mColumns, this.mColumnWeights);
        if (this.mColumns == 1) {
            clearHorizontalAttributes(constraintWidget);
            constraintWidget.mLeft.connect(this.mLeft, 0);
            constraintWidget.mRight.connect(this.mRight, 0);
            return;
        }
        int i2 = 0;
        while (true) {
            i = this.mColumns;
            if (i2 < i) {
                ConstraintWidget constraintWidget2 = this.mBoxWidgets[i2];
                clearHorizontalAttributes(constraintWidget2);
                if (parseWeights != null) {
                    constraintWidget2.setHorizontalWeight(parseWeights[i2]);
                }
                if (i2 > 0) {
                    constraintWidget2.mLeft.connect(this.mBoxWidgets[i2 - 1].mRight, 0);
                } else {
                    constraintWidget2.mLeft.connect(this.mLeft, 0);
                }
                if (i2 < this.mColumns - 1) {
                    constraintWidget2.mRight.connect(this.mBoxWidgets[i2 + 1].mLeft, 0);
                } else {
                    constraintWidget2.mRight.connect(this.mRight, 0);
                }
                if (i2 > 0) {
                    constraintWidget2.mLeft.mMargin = (int) this.mHorizontalGaps;
                }
                i2++;
            }
        }
        while (i < max) {
            ConstraintWidget constraintWidget3 = this.mBoxWidgets[i];
            clearHorizontalAttributes(constraintWidget3);
            constraintWidget3.mLeft.connect(this.mLeft, 0);
            constraintWidget3.mRight.connect(this.mRight, 0);
            i++;
        }
    }

    private int[][] parseSpans(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[][]) ipChange.ipc$dispatch("b38f6d00", new Object[]{this, str, new Boolean(z)});
        }
        try {
            String[] split = str.split(",");
            Arrays.sort(split, new Comparator() { // from class: tb.cka
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$parseSpans$0;
                    lambda$parseSpans$0 = GridCore.lambda$parseSpans$0((String) obj, (String) obj2);
                    return lambda$parseSpans$0;
                }
            });
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, split.length, 3);
            if (!(this.mRows == 1 || this.mColumns == 1)) {
                for (int i = 0; i < split.length; i++) {
                    String[] split2 = split[i].trim().split(":");
                    String[] split3 = split2[1].split("x");
                    iArr[i][0] = Integer.parseInt(split2[0]);
                    if (isSubGridByColRow()) {
                        iArr[i][1] = Integer.parseInt(split3[1]);
                        iArr[i][2] = Integer.parseInt(split3[0]);
                    } else {
                        iArr[i][1] = Integer.parseInt(split3[0]);
                        iArr[i][2] = Integer.parseInt(split3[1]);
                    }
                }
                return iArr;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < split.length; i4++) {
                String[] split4 = split[i4].trim().split(":");
                iArr[i4][0] = Integer.parseInt(split4[0]);
                int[] iArr2 = iArr[i4];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.mColumns == 1) {
                    iArr2[1] = Integer.parseInt(split4[1]);
                    i2 += iArr[i4][1];
                    if (z) {
                        i2--;
                    }
                }
                if (this.mRows == 1) {
                    iArr[i4][2] = Integer.parseInt(split4[1]);
                    i3 += iArr[i4][2];
                    if (z) {
                        i3--;
                    }
                }
            }
            if (i2 != 0 && !this.mExtraSpaceHandled) {
                setRows(this.mRows + i2);
            }
            if (i3 != 0 && !this.mExtraSpaceHandled) {
                setColumns(this.mColumns + i3);
            }
            this.mExtraSpaceHandled = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public GridCore(int i, int i2) {
        this.mRowsSet = i;
        this.mColumnsSet = i2;
        if (i > 50) {
            this.mRowsSet = 3;
        }
        if (i2 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initMatrices();
    }
}
