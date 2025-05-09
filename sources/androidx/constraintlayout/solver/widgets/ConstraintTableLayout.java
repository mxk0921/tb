package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ConstraintTableLayout extends ConstraintWidgetContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALIGN_CENTER = 0;
    private static final int ALIGN_FULL = 3;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    private boolean mVerticalGrowth = true;
    private int mNumCols = 0;
    private int mNumRows = 0;
    private int mPadding = 8;
    private ArrayList<VerticalSlice> mVerticalSlices = new ArrayList<>();
    private ArrayList<HorizontalSlice> mHorizontalSlices = new ArrayList<>();
    private ArrayList<Guideline> mVerticalGuidelines = new ArrayList<>();
    private ArrayList<Guideline> mHorizontalGuidelines = new ArrayList<>();
    private LinearSystem system = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class HorizontalSlice {
        public ConstraintWidget bottom;
        public int padding;
        public ConstraintWidget top;

        public HorizontalSlice() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class VerticalSlice {
        public int alignment = 1;
        public ConstraintWidget left;
        public int padding;
        public ConstraintWidget right;

        public VerticalSlice() {
        }
    }

    public ConstraintTableLayout() {
    }

    public static /* synthetic */ Object ipc$super(ConstraintTableLayout constraintTableLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -267955993) {
            super.setDebugSolverName((LinearSystem) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 534085670) {
            super.updateFromSolver((LinearSystem) objArr[0]);
            return null;
        } else if (hashCode == 676242781) {
            super.addToSolver((LinearSystem) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/constraintlayout/solver/widgets/ConstraintTableLayout");
        }
    }

    private void setChildrenConnections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b117389b", new Object[]{this});
            return;
        }
        int size = this.mChildren.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i2);
            int containerItemSkip = i + constraintWidget.getContainerItemSkip();
            int i3 = this.mNumCols;
            int i4 = containerItemSkip % i3;
            HorizontalSlice horizontalSlice = this.mHorizontalSlices.get(containerItemSkip / i3);
            VerticalSlice verticalSlice = this.mVerticalSlices.get(i4);
            ConstraintWidget constraintWidget2 = verticalSlice.left;
            ConstraintWidget constraintWidget3 = verticalSlice.right;
            ConstraintWidget constraintWidget4 = horizontalSlice.top;
            ConstraintWidget constraintWidget5 = horizontalSlice.bottom;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.getAnchor(type).connect(constraintWidget2.getAnchor(type), this.mPadding);
            if (constraintWidget3 instanceof Guideline) {
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintWidget3.getAnchor(type), this.mPadding);
            } else {
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.getAnchor(type2).connect(constraintWidget3.getAnchor(type2), this.mPadding);
            }
            int i5 = verticalSlice.alignment;
            if (i5 == 1) {
                constraintWidget.getAnchor(type).setStrength(ConstraintAnchor.Strength.STRONG);
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).setStrength(ConstraintAnchor.Strength.WEAK);
            } else if (i5 == 2) {
                constraintWidget.getAnchor(type).setStrength(ConstraintAnchor.Strength.WEAK);
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).setStrength(ConstraintAnchor.Strength.STRONG);
            } else if (i5 == 3) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            }
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.getAnchor(type3).connect(constraintWidget4.getAnchor(type3), this.mPadding);
            if (constraintWidget5 instanceof Guideline) {
                constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(constraintWidget5.getAnchor(type3), this.mPadding);
            } else {
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.getAnchor(type4).connect(constraintWidget5.getAnchor(type4), this.mPadding);
            }
            i = containerItemSkip + 1;
        }
    }

    private void setVerticalSlices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62704d40", new Object[]{this});
            return;
        }
        this.mVerticalSlices.clear();
        float f = 100.0f / this.mNumCols;
        ConstraintWidget constraintWidget = this;
        float f2 = f;
        for (int i = 0; i < this.mNumCols; i++) {
            VerticalSlice verticalSlice = new VerticalSlice();
            verticalSlice.left = constraintWidget;
            if (i < this.mNumCols - 1) {
                Guideline guideline = new Guideline();
                guideline.setOrientation(1);
                guideline.setParent(this);
                guideline.setGuidePercent((int) f2);
                f2 += f;
                verticalSlice.right = guideline;
                this.mVerticalGuidelines.add(guideline);
            } else {
                verticalSlice.right = this;
            }
            constraintWidget = verticalSlice.right;
            this.mVerticalSlices.add(verticalSlice);
        }
        updateDebugSolverNames();
    }

    private void updateDebugSolverNames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378a1c92", new Object[]{this});
        } else if (this.system != null) {
            int size = this.mVerticalGuidelines.size();
            for (int i = 0; i < size; i++) {
                LinearSystem linearSystem = this.system;
                this.mVerticalGuidelines.get(i).setDebugSolverName(linearSystem, getDebugName() + ".VG" + i);
            }
            int size2 = this.mHorizontalGuidelines.size();
            for (int i2 = 0; i2 < size2; i2++) {
                LinearSystem linearSystem2 = this.system;
                this.mHorizontalGuidelines.get(i2).setDebugSolverName(linearSystem2, getDebugName() + ".HG" + i2);
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284ea55d", new Object[]{this, linearSystem});
            return;
        }
        super.addToSolver(linearSystem);
        int size = this.mChildren.size();
        if (size != 0) {
            setTableDimensions();
            if (linearSystem == this.mSystem) {
                int size2 = this.mVerticalGuidelines.size();
                for (int i = 0; i < size2; i++) {
                    Guideline guideline = this.mVerticalGuidelines.get(i);
                    if (getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    guideline.setPositionRelaxed(z2);
                    guideline.addToSolver(linearSystem);
                }
                int size3 = this.mHorizontalGuidelines.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    Guideline guideline2 = this.mHorizontalGuidelines.get(i2);
                    if (getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    guideline2.setPositionRelaxed(z);
                    guideline2.addToSolver(linearSystem);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    this.mChildren.get(i3).addToSolver(linearSystem);
                }
            }
        }
    }

    public void computeGuidelinesPercentPositions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b106fe6", new Object[]{this});
            return;
        }
        int size = this.mVerticalGuidelines.size();
        for (int i = 0; i < size; i++) {
            this.mVerticalGuidelines.get(i).inferRelativePercentPosition();
        }
        int size2 = this.mHorizontalGuidelines.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.mHorizontalGuidelines.get(i2).inferRelativePercentPosition();
        }
    }

    public void cycleColumnAlignment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a40255", new Object[]{this, new Integer(i)});
            return;
        }
        VerticalSlice verticalSlice = this.mVerticalSlices.get(i);
        int i2 = verticalSlice.alignment;
        if (i2 == 0) {
            verticalSlice.alignment = 2;
        } else if (i2 == 1) {
            verticalSlice.alignment = 0;
        } else if (i2 == 2) {
            verticalSlice.alignment = 1;
        }
        setChildrenConnections();
    }

    public String getColumnAlignmentRepresentation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a913cf68", new Object[]{this, new Integer(i)});
        }
        int i2 = this.mVerticalSlices.get(i).alignment;
        if (i2 == 1) {
            return "L";
        }
        if (i2 == 0) {
            return "C";
        }
        if (i2 == 3) {
            return UTConstant.Args.UT_SUCCESS_F;
        }
        if (i2 == 2) {
            return "R";
        }
        return f7l.AND_NOT;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
    public ArrayList<Guideline> getHorizontalGuidelines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d01f111e", new Object[]{this});
        }
        return this.mHorizontalGuidelines;
    }

    public int getNumCols() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7946f25d", new Object[]{this})).intValue();
        }
        return this.mNumCols;
    }

    public int getNumRows() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a23de243", new Object[]{this})).intValue();
        }
        return this.mNumRows;
    }

    public int getPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("804d96d5", new Object[]{this})).intValue();
        }
        return this.mPadding;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "ConstraintTableLayout";
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
    public ArrayList<Guideline> getVerticalGuidelines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1274bd70", new Object[]{this});
        }
        return this.mVerticalGuidelines;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer
    public boolean handlesInternalConstraints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b82a9b79", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean isVerticalGrowth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b01a5b2", new Object[]{this})).booleanValue();
        }
        return this.mVerticalGrowth;
    }

    public void setColumnAlignment(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7890dd52", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i < this.mVerticalSlices.size()) {
            this.mVerticalSlices.get(i).alignment = i2;
            setChildrenConnections();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00750e7", new Object[]{this, linearSystem, str});
            return;
        }
        this.system = linearSystem;
        super.setDebugSolverName(linearSystem, str);
        updateDebugSolverNames();
    }

    public void setNumCols(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e0c8e5", new Object[]{this, new Integer(i)});
        } else if (this.mVerticalGrowth && this.mNumCols != i) {
            this.mNumCols = i;
            setVerticalSlices();
            setTableDimensions();
        }
    }

    public void setNumRows(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc7d5bf", new Object[]{this, new Integer(i)});
        } else if (!this.mVerticalGrowth && this.mNumCols != i) {
            this.mNumRows = i;
            setHorizontalSlices();
            setTableDimensions();
        }
    }

    public void setPadding(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfaeb36d", new Object[]{this, new Integer(i)});
        } else if (i > 1) {
            this.mPadding = i;
        }
    }

    public void setTableDimensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8830f980", new Object[]{this});
            return;
        }
        int size = this.mChildren.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.mChildren.get(i2).getContainerItemSkip();
        }
        int i3 = size + i;
        if (this.mVerticalGrowth) {
            if (this.mNumCols == 0) {
                setNumCols(1);
            }
            int i4 = this.mNumCols;
            int i5 = i3 / i4;
            if (i4 * i5 < i3) {
                i5++;
            }
            if (this.mNumRows != i5 || this.mVerticalGuidelines.size() != this.mNumCols - 1) {
                this.mNumRows = i5;
                setHorizontalSlices();
            } else {
                return;
            }
        } else {
            if (this.mNumRows == 0) {
                setNumRows(1);
            }
            int i6 = this.mNumRows;
            int i7 = i3 / i6;
            if (i6 * i7 < i3) {
                i7++;
            }
            if (this.mNumCols != i7 || this.mHorizontalGuidelines.size() != this.mNumRows - 1) {
                this.mNumCols = i7;
                setVerticalSlices();
            } else {
                return;
            }
        }
        setChildrenConnections();
    }

    public void setVerticalGrowth(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488498ae", new Object[]{this, new Boolean(z)});
        } else {
            this.mVerticalGrowth = z;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void updateFromSolver(LinearSystem linearSystem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd58026", new Object[]{this, linearSystem});
            return;
        }
        super.updateFromSolver(linearSystem);
        if (linearSystem == this.mSystem) {
            int size = this.mVerticalGuidelines.size();
            for (int i = 0; i < size; i++) {
                this.mVerticalGuidelines.get(i).updateFromSolver(linearSystem);
            }
            int size2 = this.mHorizontalGuidelines.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.mHorizontalGuidelines.get(i2).updateFromSolver(linearSystem);
            }
        }
    }

    private void setHorizontalSlices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e254f7ee", new Object[]{this});
            return;
        }
        this.mHorizontalSlices.clear();
        float f = 100.0f / this.mNumRows;
        ConstraintWidget constraintWidget = this;
        float f2 = f;
        for (int i = 0; i < this.mNumRows; i++) {
            HorizontalSlice horizontalSlice = new HorizontalSlice();
            horizontalSlice.top = constraintWidget;
            if (i < this.mNumRows - 1) {
                Guideline guideline = new Guideline();
                guideline.setOrientation(0);
                guideline.setParent(this);
                guideline.setGuidePercent((int) f2);
                f2 += f;
                horizontalSlice.bottom = guideline;
                this.mHorizontalGuidelines.add(guideline);
            } else {
                horizontalSlice.bottom = this;
            }
            constraintWidget = horizontalSlice.bottom;
            this.mHorizontalSlices.add(horizontalSlice);
        }
        updateDebugSolverNames();
    }

    public String getColumnsAlignmentRepresentation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea3e14b0", new Object[]{this});
        }
        int size = this.mVerticalSlices.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            int i2 = this.mVerticalSlices.get(i).alignment;
            if (i2 == 1) {
                str = str + "L";
            } else if (i2 == 0) {
                str = str + "C";
            } else if (i2 == 3) {
                str = str + UTConstant.Args.UT_SUCCESS_F;
            } else if (i2 == 2) {
                str = str + "R";
            }
        }
        return str;
    }

    public void setColumnAlignment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6382bc", new Object[]{this, str});
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 'L') {
                setColumnAlignment(i, 1);
            } else if (charAt == 'C') {
                setColumnAlignment(i, 0);
            } else if (charAt == 'F') {
                setColumnAlignment(i, 3);
            } else if (charAt == 'R') {
                setColumnAlignment(i, 2);
            } else {
                setColumnAlignment(i, 0);
            }
        }
    }

    public ConstraintTableLayout(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public ConstraintTableLayout(int i, int i2) {
        super(i, i2);
    }
}
