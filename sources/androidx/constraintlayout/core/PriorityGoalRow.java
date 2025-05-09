package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PriorityGoalRow extends ArrayRow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-4f;
    public static final int NOT_FOUND = -1;
    public Cache mCache;
    private int mTableSize = 128;
    private SolverVariable[] mArrayGoals = new SolverVariable[128];
    private SolverVariable[] mSortArray = new SolverVariable[128];
    private int mNumGoals = 0;
    public GoalVariableAccessor mAccessor = new GoalVariableAccessor(this);

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.mCache = cache;
    }

    public static /* synthetic */ void access$000(PriorityGoalRow priorityGoalRow, SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7059f3", new Object[]{priorityGoalRow, solverVariable});
        } else {
            priorityGoalRow.removeGoal(solverVariable);
        }
    }

    private void addToGoal(SolverVariable solverVariable) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcd6f0e", new Object[]{this, solverVariable});
            return;
        }
        int i2 = this.mNumGoals + 1;
        SolverVariable[] solverVariableArr = this.mArrayGoals;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.mArrayGoals = solverVariableArr2;
            this.mSortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.mArrayGoals;
        int i3 = this.mNumGoals;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.mNumGoals = i4;
        if (i4 > 1 && solverVariableArr3[i3].id > solverVariable.id) {
            int i5 = 0;
            while (true) {
                i = this.mNumGoals;
                if (i5 >= i) {
                    break;
                }
                this.mSortArray[i5] = this.mArrayGoals[i5];
                i5++;
            }
            Arrays.sort(this.mSortArray, 0, i, new Comparator<SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("1778a95f", new Object[]{this, solverVariable2, solverVariable3})).intValue() : solverVariable2.id - solverVariable3.id;
                }
            });
            for (int i6 = 0; i6 < this.mNumGoals; i6++) {
                this.mArrayGoals[i6] = this.mSortArray[i6];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    public static /* synthetic */ Object ipc$super(PriorityGoalRow priorityGoalRow, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/PriorityGoalRow");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        r3 = r6.mNumGoals;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2 >= (r3 - 1)) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        r3 = r6.mArrayGoals;
        r4 = r2 + 1;
        r3[r2] = r3[r4];
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        r6.mNumGoals = r3 - 1;
        r7.inGoal = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void removeGoal(androidx.constraintlayout.core.SolverVariable r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.constraintlayout.core.PriorityGoalRow.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "325c3c86"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r6
            r4[r1] = r7
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            r2 = 0
        L_0x0016:
            int r3 = r6.mNumGoals
            if (r2 >= r3) goto L_0x0038
            androidx.constraintlayout.core.SolverVariable[] r3 = r6.mArrayGoals
            r3 = r3[r2]
            if (r3 != r7) goto L_0x0036
        L_0x0020:
            int r3 = r6.mNumGoals
            int r4 = r3 + (-1)
            if (r2 >= r4) goto L_0x0030
            androidx.constraintlayout.core.SolverVariable[] r3 = r6.mArrayGoals
            int r4 = r2 + 1
            r5 = r3[r4]
            r3[r2] = r5
            r2 = r4
            goto L_0x0020
        L_0x0030:
            int r3 = r3 - r1
            r6.mNumGoals = r3
            r7.inGoal = r0
            return
        L_0x0036:
            int r2 = r2 + r1
            goto L_0x0016
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.PriorityGoalRow.removeGoal(androidx.constraintlayout.core.SolverVariable):void");
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34591256", new Object[]{this, solverVariable});
            return;
        }
        this.mAccessor.init(solverVariable);
        this.mAccessor.reset();
        solverVariable.mGoalStrengthVector[solverVariable.strength] = 1.0f;
        addToGoal(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mNumGoals = 0;
        this.mConstantValue = 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("1cc5e914", new Object[]{this, linearSystem, zArr});
        }
        int i = -1;
        for (int i2 = 0; i2 < this.mNumGoals; i2++) {
            SolverVariable solverVariable = this.mArrayGoals[i2];
            if (!zArr[solverVariable.id]) {
                this.mAccessor.init(solverVariable);
                if (i == -1) {
                    if (!this.mAccessor.isNegative()) {
                    }
                    i = i2;
                } else {
                    if (!this.mAccessor.isSmallerThan(this.mArrayGoals[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.mArrayGoals[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = " goal -> (" + this.mConstantValue + ") : ";
        for (int i = 0; i < this.mNumGoals; i++) {
            this.mAccessor.init(this.mArrayGoals[i]);
            str = str + this.mAccessor + " ";
        }
        return str;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class GoalVariableAccessor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public PriorityGoalRow mRow;
        public SolverVariable mVariable;

        public GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
            this.mRow = priorityGoalRow;
        }

        public void add(SolverVariable solverVariable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aa2295c", new Object[]{this, solverVariable});
                return;
            }
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.mVariable.mGoalStrengthVector;
                float f = fArr[i] + solverVariable.mGoalStrengthVector[i];
                fArr[i] = f;
                if (Math.abs(f) < 1.0E-4f) {
                    this.mVariable.mGoalStrengthVector[i] = 0.0f;
                }
            }
        }

        public void init(SolverVariable solverVariable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14dac8d", new Object[]{this, solverVariable});
            } else {
                this.mVariable = solverVariable;
            }
        }

        public final boolean isNull() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue();
            }
            for (int i = 0; i < 9; i++) {
                if (this.mVariable.mGoalStrengthVector[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(SolverVariable solverVariable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d2bb996", new Object[]{this, solverVariable})).booleanValue();
            }
            for (int i = 8; i >= 0; i--) {
                float f = solverVariable.mGoalStrengthVector[i];
                float f2 = this.mVariable.mGoalStrengthVector[i];
                if (f2 != f) {
                    if (f2 < f) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else {
                Arrays.fill(this.mVariable.mGoalStrengthVector, 0.0f);
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            String str = "[ ";
            if (this.mVariable != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.mVariable.mGoalStrengthVector[i] + " ";
                }
            }
            return str + "] " + this.mVariable;
        }

        public boolean addToGoal(SolverVariable solverVariable, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fde0da76", new Object[]{this, solverVariable, new Float(f)})).booleanValue();
            }
            if (this.mVariable.inGoal) {
                boolean z = true;
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.mVariable.mGoalStrengthVector;
                    float f2 = fArr[i] + (solverVariable.mGoalStrengthVector[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.mVariable.mGoalStrengthVector[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    PriorityGoalRow.access$000(PriorityGoalRow.this, this.mVariable);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = solverVariable.mGoalStrengthVector[i2];
                if (f3 != 0.0f) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.mVariable.mGoalStrengthVector[i2] = f4;
                } else {
                    this.mVariable.mGoalStrengthVector[i2] = 0.0f;
                }
            }
            return true;
        }

        public final boolean isNegative() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea20608a", new Object[]{this})).booleanValue();
            }
            for (int i = 8; i >= 0; i--) {
                float f = this.mVariable.mGoalStrengthVector[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.mNumGoals == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf752d73", new Object[]{this, linearSystem, arrayRow, new Boolean(z)});
            return;
        }
        SolverVariable solverVariable = arrayRow.mVariable;
        if (solverVariable != null) {
            ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
            int currentSize = arrayRowVariables.getCurrentSize();
            for (int i = 0; i < currentSize; i++) {
                SolverVariable variable = arrayRowVariables.getVariable(i);
                float variableValue = arrayRowVariables.getVariableValue(i);
                this.mAccessor.init(variable);
                if (this.mAccessor.addToGoal(solverVariable, variableValue)) {
                    addToGoal(variable);
                }
                this.mConstantValue += arrayRow.mConstantValue * variableValue;
            }
            removeGoal(solverVariable);
        }
    }
}
