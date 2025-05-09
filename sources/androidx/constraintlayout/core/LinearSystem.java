package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LinearSystem {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    private static final boolean DO_NOT_USE = false;
    public static final boolean FULL_DEBUG = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static Metrics sMetrics;
    public final Cache mCache;
    private Row mGoal;
    private Row mTempGoal;
    private int mPoolSize = 1000;
    public boolean hasSimpleDefinition = false;
    public int mVariablesID = 0;
    private HashMap<String, SolverVariable> mVariables = null;
    private int mTableSize = 32;
    private int mMaxColumns = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;
    private boolean[] mAlreadyTestedCandidates = new boolean[32];
    public int mNumColumns = 1;
    public int mNumRows = 0;
    private int mMaxRows = 32;
    private SolverVariable[] mPoolVariables = new SolverVariable[1000];
    private int mPoolVariablesCount = 0;
    public ArrayRow[] mRows = new ArrayRow[32];

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Row {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(Row row);

        boolean isEmpty();

        void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z);

        void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z);

        void updateFromSystem(LinearSystem linearSystem);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ValuesRow extends ArrayRow {
        public ValuesRow(Cache cache) {
            this.variables = new SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        releaseRows();
        Cache cache = new Cache();
        this.mCache = cache;
        this.mGoal = new PriorityGoalRow(cache);
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(cache);
        } else {
            this.mTempGoal = new ArrayRow(cache);
        }
    }

    private SolverVariable acquireSolverVariable(SolverVariable.Type type, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("9503bdb8", new Object[]{this, type, str});
        }
        SolverVariable acquire = this.mCache.mSolverVariablePool.acquire();
        if (acquire == null) {
            acquire = new SolverVariable(type, str);
            acquire.setType(type, str);
        } else {
            acquire.reset();
            acquire.setType(type, str);
        }
        int i = this.mPoolVariablesCount;
        int i2 = this.mPoolSize;
        if (i >= i2) {
            int i3 = i2 * 2;
            this.mPoolSize = i3;
            this.mPoolVariables = (SolverVariable[]) Arrays.copyOf(this.mPoolVariables, i3);
        }
        SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i4 = this.mPoolVariablesCount;
        this.mPoolVariablesCount = 1 + i4;
        solverVariableArr[i4] = acquire;
        return acquire;
    }

    private void addRow(ArrayRow arrayRow) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71867b72", new Object[]{this, arrayRow});
            return;
        }
        if (!SIMPLIFY_SYNONYMS || !arrayRow.mIsSimpleDefinition) {
            ArrayRow[] arrayRowArr = this.mRows;
            int i2 = this.mNumRows;
            arrayRowArr[i2] = arrayRow;
            SolverVariable solverVariable = arrayRow.mVariable;
            solverVariable.mDefinitionId = i2;
            this.mNumRows = i2 + 1;
            solverVariable.updateReferencesWithNewDefinition(this, arrayRow);
        } else {
            arrayRow.mVariable.setFinalValue(this, arrayRow.mConstantValue);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i3 = 0;
            while (i3 < this.mNumRows) {
                if (this.mRows[i3] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.mRows[i3];
                if (arrayRow2 != null && arrayRow2.mIsSimpleDefinition) {
                    arrayRow2.mVariable.setFinalValue(this, arrayRow2.mConstantValue);
                    if (OPTIMIZED_ENGINE) {
                        this.mCache.mOptimizedArrayRowPool.release(arrayRow2);
                    } else {
                        this.mCache.mArrayRowPool.release(arrayRow2);
                    }
                    this.mRows[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.mNumRows;
                        if (i4 >= i) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.mRows;
                        int i6 = i4 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i4];
                        arrayRowArr2[i6] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.mVariable;
                        if (solverVariable2.mDefinitionId == i4) {
                            solverVariable2.mDefinitionId = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.mRows[i5] = null;
                    }
                    this.mNumRows = i - 1;
                    i3--;
                }
                i3++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    private void computeValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41958c40", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mNumRows; i++) {
            ArrayRow arrayRow = this.mRows[i];
            arrayRow.mVariable.computedValue = arrayRow.mConstantValue;
        }
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("34fb45c7", new Object[]{linearSystem, solverVariable, solverVariable2, new Float(f)});
        }
        return linearSystem.createRow().createRowDimensionPercent(solverVariable, solverVariable2, f);
    }

    private SolverVariable createVariable(String str, SolverVariable.Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("b9c9c0ab", new Object[]{this, str, type});
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.variables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(type, null);
        acquireSolverVariable.setName(str);
        int i = this.mVariablesID + 1;
        this.mVariablesID = i;
        this.mNumColumns++;
        acquireSolverVariable.id = i;
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        this.mVariables.put(str, acquireSolverVariable);
        this.mCache.mIndexedVariables[this.mVariablesID] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    private void displayRows() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc580cc2", new Object[]{this});
            return;
        }
        displaySolverVariables();
        String str = "";
        for (int i = 0; i < this.mNumRows; i++) {
            str = (str + this.mRows[i]) + "\n";
        }
        System.out.println(str + this.mGoal + "\n");
    }

    private void displaySolverVariables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10025909", new Object[]{this});
            return;
        }
        System.out.println("Display Rows (" + this.mNumRows + "x" + this.mNumColumns + ")\n");
    }

    private int enforceBFS(Row row) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8555e648", new Object[]{this, row})).intValue();
        }
        for (int i = 0; i < this.mNumRows; i++) {
            ArrayRow arrayRow = this.mRows[i];
            if (arrayRow.mVariable.mType != SolverVariable.Type.UNRESTRICTED) {
                float f = 0.0f;
                if (arrayRow.mConstantValue < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        Metrics metrics = sMetrics;
                        if (metrics != null) {
                            metrics.bfs++;
                        }
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.mNumRows) {
                            ArrayRow arrayRow2 = this.mRows[i3];
                            if (arrayRow2.mVariable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow2.mIsSimpleDefinition && arrayRow2.mConstantValue < f) {
                                int i7 = 9;
                                if (SKIP_COLUMNS) {
                                    int currentSize = arrayRow2.variables.getCurrentSize();
                                    int i8 = 0;
                                    while (i8 < currentSize) {
                                        SolverVariable variable = arrayRow2.variables.getVariable(i8);
                                        float f3 = arrayRow2.variables.get(variable);
                                        if (f3 > f) {
                                            int i9 = 0;
                                            while (i9 < i7) {
                                                float f4 = variable.mStrengthVector[i9] / f3;
                                                if ((f4 < f2 && i9 == i6) || i9 > i6) {
                                                    i6 = i9;
                                                    i5 = variable.id;
                                                    i4 = i3;
                                                    f2 = f4;
                                                }
                                                i9++;
                                                i7 = 9;
                                            }
                                        }
                                        i8++;
                                        i7 = 9;
                                        f = 0.0f;
                                    }
                                } else {
                                    for (int i10 = 1; i10 < this.mNumColumns; i10++) {
                                        SolverVariable solverVariable = this.mCache.mIndexedVariables[i10];
                                        float f5 = arrayRow2.variables.get(solverVariable);
                                        if (f5 > 0.0f) {
                                            for (int i11 = 0; i11 < 9; i11++) {
                                                float f6 = solverVariable.mStrengthVector[i11] / f5;
                                                if ((f6 < f2 && i11 == i6) || i11 > i6) {
                                                    i5 = i10;
                                                    f2 = f6;
                                                    i6 = i11;
                                                    i4 = i3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            ArrayRow arrayRow3 = this.mRows[i4];
                            arrayRow3.mVariable.mDefinitionId = -1;
                            Metrics metrics2 = sMetrics;
                            if (metrics2 != null) {
                                metrics2.pivots++;
                            }
                            arrayRow3.pivot(this.mCache.mIndexedVariables[i5]);
                            SolverVariable solverVariable2 = arrayRow3.mVariable;
                            solverVariable2.mDefinitionId = i4;
                            solverVariable2.updateReferencesWithNewDefinition(this, arrayRow3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.mNumColumns / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                    return i2;
                }
            }
        }
        return 0;
    }

    private String getDisplaySize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bf52bb1", new Object[]{this, new Integer(i)});
        }
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        if (i4 > 0) {
            return "" + i4 + " Mb";
        } else if (i3 > 0) {
            return "" + i3 + " Kb";
        } else {
            return "" + i2 + " bytes";
        }
    }

    private String getDisplayStrength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c7a35f1", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            return "LOW";
        }
        if (i == 2) {
            return "MEDIUM";
        }
        if (i == 3) {
            return "HIGH";
        }
        if (i == 4) {
            return "HIGHEST";
        }
        if (i == 5) {
            return "EQUALITY";
        }
        if (i == 8) {
            return "FIXED";
        }
        if (i == 6) {
            return "BARRIER";
        }
        return "NONE";
    }

    public static Metrics getMetrics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Metrics) ipChange.ipc$dispatch("56ffd8bc", new Object[0]);
        }
        return sMetrics;
    }

    private void increaseTableSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a95dad4", new Object[]{this});
            return;
        }
        int i = this.mTableSize * 2;
        this.mTableSize = i;
        this.mRows = (ArrayRow[]) Arrays.copyOf(this.mRows, i);
        Cache cache = this.mCache;
        cache.mIndexedVariables = (SolverVariable[]) Arrays.copyOf(cache.mIndexedVariables, this.mTableSize);
        int i2 = this.mTableSize;
        this.mAlreadyTestedCandidates = new boolean[i2];
        this.mMaxColumns = i2;
        this.mMaxRows = i2;
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            metrics.maxTableSize = Math.max(metrics.maxTableSize, i2);
            Metrics metrics2 = sMetrics;
            metrics2.lastTableSize = metrics2.maxTableSize;
        }
    }

    private int optimize(Row row, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a551882", new Object[]{this, row, new Boolean(z)})).intValue();
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i = 0; i < this.mNumColumns; i++) {
            this.mAlreadyTestedCandidates[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i2++;
            if (i2 >= this.mNumColumns * 2) {
                return i2;
            }
            if (row.getKey() != null) {
                this.mAlreadyTestedCandidates[row.getKey().id] = true;
            }
            SolverVariable pivotCandidate = row.getPivotCandidate(this, this.mAlreadyTestedCandidates);
            if (pivotCandidate != null) {
                boolean[] zArr = this.mAlreadyTestedCandidates;
                int i3 = pivotCandidate.id;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (pivotCandidate != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.mNumRows; i5++) {
                    ArrayRow arrayRow = this.mRows[i5];
                    if (arrayRow.mVariable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow.mIsSimpleDefinition && arrayRow.hasVariable(pivotCandidate)) {
                        float f2 = arrayRow.variables.get(pivotCandidate);
                        if (f2 < 0.0f) {
                            float f3 = (-arrayRow.mConstantValue) / f2;
                            if (f3 < f) {
                                i4 = i5;
                                f = f3;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    ArrayRow arrayRow2 = this.mRows[i4];
                    arrayRow2.mVariable.mDefinitionId = -1;
                    Metrics metrics3 = sMetrics;
                    if (metrics3 != null) {
                        metrics3.pivots++;
                    }
                    arrayRow2.pivot(pivotCandidate);
                    SolverVariable solverVariable = arrayRow2.mVariable;
                    solverVariable.mDefinitionId = i4;
                    solverVariable.updateReferencesWithNewDefinition(this, arrayRow2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    private void releaseRows() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a70707", new Object[]{this});
        } else if (OPTIMIZED_ENGINE) {
            while (i < this.mNumRows) {
                ArrayRow arrayRow = this.mRows[i];
                if (arrayRow != null) {
                    this.mCache.mOptimizedArrayRowPool.release(arrayRow);
                }
                this.mRows[i] = null;
                i++;
            }
        } else {
            while (i < this.mNumRows) {
                ArrayRow arrayRow2 = this.mRows[i];
                if (arrayRow2 != null) {
                    this.mCache.mArrayRowPool.release(arrayRow2);
                }
                this.mRows[i] = null;
                i++;
            }
        }
    }

    public void addCenterPoint(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e520364", new Object[]{this, constraintWidget, constraintWidget2, new Float(f), new Integer(i)});
            return;
        }
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable createObjectVariable = createObjectVariable(constraintWidget.getAnchor(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable createObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable createObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable createObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(type4));
        SolverVariable createObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(type));
        SolverVariable createObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(type2));
        SolverVariable createObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(type3));
        SolverVariable createObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(type4));
        ArrayRow createRow = createRow();
        double d = f;
        double d2 = i;
        createRow.createRowWithAngle(createObjectVariable2, createObjectVariable4, createObjectVariable6, createObjectVariable8, (float) (Math.sin(d) * d2));
        addConstraint(createRow);
        ArrayRow createRow2 = createRow();
        createRow2.createRowWithAngle(createObjectVariable, createObjectVariable3, createObjectVariable5, createObjectVariable7, (float) (Math.cos(d) * d2));
        addConstraint(createRow2);
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe45ad0", new Object[]{this, solverVariable, solverVariable2, new Integer(i), new Float(f), solverVariable3, solverVariable4, new Integer(i2), new Integer(i3)});
            return;
        }
        ArrayRow createRow = createRow();
        createRow.createRowCentering(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 8) {
            createRow.addError(this, i3);
        }
        addConstraint(createRow);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addConstraint(androidx.constraintlayout.core.ArrayRow r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.constraintlayout.core.LinearSystem.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "343d2fad"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            if (r8 != 0) goto L_0x0018
            return
        L_0x0018:
            androidx.constraintlayout.core.Metrics r2 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r3 = 1
            if (r2 == 0) goto L_0x002c
            long r5 = r2.constraints
            long r5 = r5 + r3
            r2.constraints = r5
            boolean r5 = r8.mIsSimpleDefinition
            if (r5 == 0) goto L_0x002c
            long r5 = r2.simpleconstraints
            long r5 = r5 + r3
            r2.simpleconstraints = r5
        L_0x002c:
            int r2 = r7.mNumRows
            int r2 = r2 + r0
            int r5 = r7.mMaxRows
            if (r2 >= r5) goto L_0x003a
            int r2 = r7.mNumColumns
            int r2 = r2 + r0
            int r5 = r7.mMaxColumns
            if (r2 < r5) goto L_0x003d
        L_0x003a:
            r7.increaseTableSize()
        L_0x003d:
            boolean r2 = r8.mIsSimpleDefinition
            if (r2 != 0) goto L_0x00b4
            r8.updateFromSystem(r7)
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x004b
            return
        L_0x004b:
            r8.ensurePositiveConstant()
            boolean r2 = r8.chooseSubject(r7)
            if (r2 == 0) goto L_0x00ab
            androidx.constraintlayout.core.SolverVariable r2 = r7.createExtraVariable()
            r8.mVariable = r2
            int r5 = r7.mNumRows
            r7.addRow(r8)
            int r6 = r7.mNumRows
            int r5 = r5 + r0
            if (r6 != r5) goto L_0x00ab
            androidx.constraintlayout.core.LinearSystem$Row r1 = r7.mTempGoal
            r1.initFromRow(r8)
            androidx.constraintlayout.core.LinearSystem$Row r1 = r7.mTempGoal
            r7.optimize(r1, r0)
            int r1 = r2.mDefinitionId
            r5 = -1
            if (r1 != r5) goto L_0x00ac
            androidx.constraintlayout.core.SolverVariable r1 = r8.mVariable
            if (r1 != r2) goto L_0x0089
            androidx.constraintlayout.core.SolverVariable r1 = r8.pickPivot(r2)
            if (r1 == 0) goto L_0x0089
            androidx.constraintlayout.core.Metrics r2 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r2 == 0) goto L_0x0086
            long r5 = r2.pivots
            long r5 = r5 + r3
            r2.pivots = r5
        L_0x0086:
            r8.pivot(r1)
        L_0x0089:
            boolean r1 = r8.mIsSimpleDefinition
            if (r1 != 0) goto L_0x0092
            androidx.constraintlayout.core.SolverVariable r1 = r8.mVariable
            r1.updateReferencesWithNewDefinition(r7, r8)
        L_0x0092:
            boolean r1 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r1 == 0) goto L_0x009e
            androidx.constraintlayout.core.Cache r1 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r1 = r1.mOptimizedArrayRowPool
            r1.release(r8)
            goto L_0x00a5
        L_0x009e:
            androidx.constraintlayout.core.Cache r1 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r1 = r1.mArrayRowPool
            r1.release(r8)
        L_0x00a5:
            int r1 = r7.mNumRows
            int r1 = r1 - r0
            r7.mNumRows = r1
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            boolean r1 = r8.hasKeyVariable()
            if (r1 != 0) goto L_0x00b3
            return
        L_0x00b3:
            r1 = r0
        L_0x00b4:
            if (r1 != 0) goto L_0x00b9
            r7.addRow(r8)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.LinearSystem.addConstraint(androidx.constraintlayout.core.ArrayRow):void");
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("1be4f644", new Object[]{this, solverVariable, solverVariable2, new Integer(i), new Integer(i2)});
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (!USE_BASIC_SYNONYMS || i2 != 8 || !solverVariable2.isFinalValue || solverVariable.mDefinitionId != -1) {
            ArrayRow createRow = createRow();
            createRow.createRowEquals(solverVariable, solverVariable2, i);
            if (i2 != 8) {
                createRow.addError(this, i2);
            }
            addConstraint(createRow);
            return createRow;
        }
        solverVariable.setFinalValue(this, solverVariable2.computedValue + i);
        return null;
    }

    public void addGreaterBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10856a96", new Object[]{this, solverVariable, solverVariable2, new Integer(i), new Boolean(z)});
            return;
        }
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i);
        addConstraint(createRow);
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd574c1", new Object[]{this, solverVariable, solverVariable2, new Integer(i), new Integer(i2)});
            return;
        }
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i);
        if (i2 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(createRow);
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d76488", new Object[]{this, solverVariable, solverVariable2, new Integer(i), new Integer(i2)});
            return;
        }
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i);
        if (i2 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(createRow);
    }

    public void addRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2225f4", new Object[]{this, solverVariable, solverVariable2, solverVariable3, solverVariable4, new Float(f), new Integer(i)});
            return;
        }
        ArrayRow createRow = createRow();
        createRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            createRow.addError(this, i);
        }
        addConstraint(createRow);
    }

    public void addSingleError(ArrayRow arrayRow, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f5d8cc", new Object[]{this, arrayRow, new Integer(i), new Integer(i2)});
        } else {
            arrayRow.addSingleError(createErrorVariable(i2, null), i);
        }
    }

    public void addSynonym(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88213c2", new Object[]{this, solverVariable, solverVariable2, new Integer(i)});
        } else if (solverVariable.mDefinitionId == -1 && i == 0) {
            if (solverVariable2.mIsSynonym) {
                solverVariable2 = this.mCache.mIndexedVariables[solverVariable2.mSynonym];
            }
            if (solverVariable.mIsSynonym) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[solverVariable.mSynonym];
            } else {
                solverVariable.setSynonym(this, solverVariable2, 0.0f);
            }
        } else {
            addEquality(solverVariable, solverVariable2, i, 8);
        }
    }

    public final void cleanupRows() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a148a4", new Object[]{this});
            return;
        }
        while (i2 < this.mNumRows) {
            ArrayRow arrayRow = this.mRows[i2];
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.mIsSimpleDefinition = true;
            }
            if (arrayRow.mIsSimpleDefinition) {
                SolverVariable solverVariable = arrayRow.mVariable;
                solverVariable.computedValue = arrayRow.mConstantValue;
                solverVariable.removeFromRow(arrayRow);
                int i3 = i2;
                while (true) {
                    i = this.mNumRows;
                    if (i3 >= i - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.mRows;
                    int i4 = i3 + 1;
                    arrayRowArr[i3] = arrayRowArr[i4];
                    i3 = i4;
                }
                this.mRows[i - 1] = null;
                this.mNumRows = i - 1;
                i2--;
                if (OPTIMIZED_ENGINE) {
                    this.mCache.mOptimizedArrayRowPool.release(arrayRow);
                } else {
                    this.mCache.mArrayRowPool.release(arrayRow);
                }
            }
            i2++;
        }
    }

    public SolverVariable createErrorVariable(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("15dc5d12", new Object[]{this, new Integer(i), str});
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.ERROR, str);
        int i2 = this.mVariablesID + 1;
        this.mVariablesID = i2;
        this.mNumColumns++;
        acquireSolverVariable.id = i2;
        acquireSolverVariable.strength = i;
        this.mCache.mIndexedVariables[i2] = acquireSolverVariable;
        this.mGoal.addError(acquireSolverVariable);
        return acquireSolverVariable;
    }

    public SolverVariable createExtraVariable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("86c98cb", new Object[]{this});
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i = this.mVariablesID + 1;
        this.mVariablesID = i;
        this.mNumColumns++;
        acquireSolverVariable.id = i;
        this.mCache.mIndexedVariables[i] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public SolverVariable createObjectVariable(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("495f084e", new Object[]{this, obj});
        }
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.mCache);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            int i = solverVariable.id;
            if (i == -1 || i > this.mVariablesID || this.mCache.mIndexedVariables[i] == null) {
                if (i != -1) {
                    solverVariable.reset();
                }
                int i2 = this.mVariablesID + 1;
                this.mVariablesID = i2;
                this.mNumColumns++;
                solverVariable.id = i2;
                solverVariable.mType = SolverVariable.Type.UNRESTRICTED;
                this.mCache.mIndexedVariables[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    public ArrayRow createRow() {
        ArrayRow arrayRow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("8c47dc67", new Object[]{this});
        }
        if (OPTIMIZED_ENGINE) {
            arrayRow = this.mCache.mOptimizedArrayRowPool.acquire();
            if (arrayRow == null) {
                arrayRow = new ValuesRow(this.mCache);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            } else {
                arrayRow.reset();
            }
        } else {
            arrayRow = this.mCache.mArrayRowPool.acquire();
            if (arrayRow == null) {
                arrayRow = new ArrayRow(this.mCache);
                ARRAY_ROW_CREATION++;
            } else {
                arrayRow.reset();
            }
        }
        SolverVariable.increaseErrorId();
        return arrayRow;
    }

    public void displayReadableRows() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af7b2d2", new Object[]{this});
            return;
        }
        displaySolverVariables();
        String str = " num vars " + this.mVariablesID + "\n";
        for (int i = 0; i < this.mVariablesID + 1; i++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[i];
            if (solverVariable != null && solverVariable.isFinalValue) {
                str = str + " $[" + i + "] => " + solverVariable + " = " + solverVariable.computedValue + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i2 = 0; i2 < this.mVariablesID + 1; i2++) {
            SolverVariable[] solverVariableArr = this.mCache.mIndexedVariables;
            SolverVariable solverVariable2 = solverVariableArr[i2];
            if (solverVariable2 != null && solverVariable2.mIsSynonym) {
                str2 = str2 + " ~[" + i2 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.mSynonym] + " + " + solverVariable2.mSynonymDelta + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i3 = 0; i3 < this.mNumRows; i3++) {
            str3 = (str3 + this.mRows[i3].toReadableString()) + "\n #  ";
        }
        if (this.mGoal != null) {
            str3 = str3 + "Goal: " + this.mGoal + "\n";
        }
        System.out.println(str3);
    }

    public void displaySystemInformation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3753e9e2", new Object[]{this});
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.mTableSize; i2++) {
            ArrayRow arrayRow = this.mRows[i2];
            if (arrayRow != null) {
                i += arrayRow.sizeInBytes();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.mNumRows; i4++) {
            ArrayRow arrayRow2 = this.mRows[i4];
            if (arrayRow2 != null) {
                i3 += arrayRow2.sizeInBytes();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("Linear System -> Table size: ");
        sb.append(this.mTableSize);
        sb.append(" (");
        int i5 = this.mTableSize;
        sb.append(getDisplaySize(i5 * i5));
        sb.append(") -- row sizes: ");
        sb.append(getDisplaySize(i));
        sb.append(", actual size: ");
        sb.append(getDisplaySize(i3));
        sb.append(" rows: ");
        sb.append(this.mNumRows);
        sb.append("/");
        sb.append(this.mMaxRows);
        sb.append(" cols: ");
        sb.append(this.mNumColumns);
        sb.append("/");
        sb.append(this.mMaxColumns);
        sb.append(" 0 occupied cells, ");
        sb.append(getDisplaySize(0));
        printStream.println(sb.toString());
    }

    public void displayVariablesReadableRows() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a752e5", new Object[]{this});
            return;
        }
        displaySolverVariables();
        String str = "";
        for (int i = 0; i < this.mNumRows; i++) {
            if (this.mRows[i].mVariable.mType == SolverVariable.Type.UNRESTRICTED) {
                str = (str + this.mRows[i].toReadableString()) + "\n";
            }
        }
        System.out.println(str + this.mGoal + "\n");
    }

    public void fillMetrics(Metrics metrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5244a81", new Object[]{this, metrics});
        } else {
            sMetrics = metrics;
        }
    }

    public Cache getCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cache) ipChange.ipc$dispatch("6170847e", new Object[]{this});
        }
        return this.mCache;
    }

    public Row getGoal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Row) ipChange.ipc$dispatch("61f95b49", new Object[]{this});
        }
        return this.mGoal;
    }

    public int getNumEquations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98a10131", new Object[]{this})).intValue();
        }
        return this.mNumRows;
    }

    public int getNumVariables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("518cc401", new Object[]{this})).intValue();
        }
        return this.mVariablesID;
    }

    public ArrayRow getRow(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("867363da", new Object[]{this, new Integer(i)});
        }
        return this.mRows[i];
    }

    public float getValueFor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8764db0f", new Object[]{this, str})).floatValue();
        }
        SolverVariable variable = getVariable(str, SolverVariable.Type.UNRESTRICTED);
        if (variable == null) {
            return 0.0f;
        }
        return variable.computedValue;
    }

    public SolverVariable getVariable(String str, SolverVariable.Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("eea60f05", new Object[]{this, str, type});
        }
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        SolverVariable solverVariable = this.mVariables.get(str);
        return solverVariable == null ? createVariable(str, type) : solverVariable;
    }

    public void minimizeGoal(Row row) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ceb1f71", new Object[]{this, row});
            return;
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            metrics.maxVariables = Math.max(metrics.maxVariables, this.mNumColumns);
            Metrics metrics2 = sMetrics;
            metrics2.maxRows = Math.max(metrics2.maxRows, this.mNumRows);
        }
        enforceBFS(row);
        optimize(row, false);
        computeValues();
    }

    public void reset() {
        Cache cache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        int i = 0;
        while (true) {
            cache = this.mCache;
            SolverVariable[] solverVariableArr = cache.mIndexedVariables;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.reset();
            }
            i++;
        }
        cache.mSolverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.mVariables;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            ArrayRow arrayRow = this.mRows[i2];
            if (arrayRow != null) {
                arrayRow.mUsed = false;
            }
        }
        releaseRows();
        this.mNumRows = 0;
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(this.mCache);
        } else {
            this.mTempGoal = new ArrayRow(this.mCache);
        }
    }

    public void addLowerBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e3916f", new Object[]{this, solverVariable, solverVariable2, new Integer(i), new Boolean(z)});
            return;
        }
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i);
        addConstraint(createRow);
    }

    public SolverVariable createSlackVariable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("dd7ec44b", new Object[]{this});
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i = this.mVariablesID + 1;
        this.mVariablesID = i;
        this.mNumColumns++;
        acquireSolverVariable.id = i;
        this.mCache.mIndexedVariables[i] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public int getObjectVariableValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdff0cb6", new Object[]{this, obj})).intValue();
        }
        SolverVariable solverVariable = ((ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    public void removeRow(ArrayRow arrayRow) {
        SolverVariable solverVariable;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe398955", new Object[]{this, arrayRow});
        } else if (arrayRow.mIsSimpleDefinition && (solverVariable = arrayRow.mVariable) != null) {
            int i2 = solverVariable.mDefinitionId;
            if (i2 != -1) {
                while (true) {
                    i = this.mNumRows;
                    if (i2 >= i - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.mRows;
                    int i3 = i2 + 1;
                    ArrayRow arrayRow2 = arrayRowArr[i3];
                    SolverVariable solverVariable2 = arrayRow2.mVariable;
                    if (solverVariable2.mDefinitionId == i3) {
                        solverVariable2.mDefinitionId = i2;
                    }
                    arrayRowArr[i2] = arrayRow2;
                    i2 = i3;
                }
                this.mNumRows = i - 1;
            }
            SolverVariable solverVariable3 = arrayRow.mVariable;
            if (!solverVariable3.isFinalValue) {
                solverVariable3.setFinalValue(this, arrayRow.mConstantValue);
            }
            if (OPTIMIZED_ENGINE) {
                this.mCache.mOptimizedArrayRowPool.release(arrayRow);
            } else {
                this.mCache.mArrayRowPool.release(arrayRow);
            }
        }
    }

    public int getMemoryUsed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9b2a6ce", new Object[]{this})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            ArrayRow arrayRow = this.mRows[i2];
            if (arrayRow != null) {
                i += arrayRow.sizeInBytes();
            }
        }
        return i;
    }

    public void minimize() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3334c25", new Object[]{this});
            return;
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.mGoal.isEmpty()) {
            computeValues();
        } else if (this.graphOptimizer || this.newgraphOptimizer) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.graphOptimizer++;
            }
            for (int i = 0; i < this.mNumRows; i++) {
                if (!this.mRows[i].mIsSimpleDefinition) {
                    minimizeGoal(this.mGoal);
                    return;
                }
            }
            Metrics metrics3 = sMetrics;
            if (metrics3 != null) {
                metrics3.fullySolved++;
            }
            computeValues();
        } else {
            minimizeGoal(this.mGoal);
        }
    }

    public void addEquality(SolverVariable solverVariable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb292441", new Object[]{this, solverVariable, new Integer(i)});
            return;
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (!USE_BASIC_SYNONYMS || solverVariable.mDefinitionId != -1) {
            int i2 = solverVariable.mDefinitionId;
            if (i2 != -1) {
                ArrayRow arrayRow = this.mRows[i2];
                if (arrayRow.mIsSimpleDefinition) {
                    arrayRow.mConstantValue = i;
                } else if (arrayRow.variables.getCurrentSize() == 0) {
                    arrayRow.mIsSimpleDefinition = true;
                    arrayRow.mConstantValue = i;
                } else {
                    ArrayRow createRow = createRow();
                    createRow.createRowEquals(solverVariable, i);
                    addConstraint(createRow);
                }
            } else {
                ArrayRow createRow2 = createRow();
                createRow2.createRowDefinition(solverVariable, i);
                addConstraint(createRow2);
            }
        } else {
            float f = i;
            solverVariable.setFinalValue(this, f);
            for (int i3 = 0; i3 < this.mVariablesID + 1; i3++) {
                SolverVariable solverVariable2 = this.mCache.mIndexedVariables[i3];
                if (solverVariable2 != null && solverVariable2.mIsSynonym && solverVariable2.mSynonym == solverVariable.id) {
                    solverVariable2.setFinalValue(this, solverVariable2.mSynonymDelta + f);
                }
            }
        }
    }
}
