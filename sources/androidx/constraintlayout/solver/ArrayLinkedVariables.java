package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.SolverVariable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ArrayLinkedVariables {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    private static final int NONE = -1;
    private final Cache mCache;
    private final ArrayRow mRow;
    public int currentSize = 0;
    private int ROW_SIZE = 8;
    private SolverVariable candidate = null;
    private int[] mArrayIndices = new int[8];
    private int[] mArrayNextIndices = new int[8];
    private float[] mArrayValues = new float[8];
    private int mHead = -1;
    private int mLast = -1;
    private boolean mDidFillOnce = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    public final void add(SolverVariable solverVariable, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1648a324", new Object[]{this, solverVariable, new Float(f), new Boolean(z)});
        } else if (f != 0.0f) {
            int i = this.mHead;
            if (i == -1) {
                this.mHead = 0;
                this.mArrayValues[0] = f;
                this.mArrayIndices[0] = solverVariable.id;
                this.mArrayNextIndices[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.currentSize++;
                if (!this.mDidFillOnce) {
                    int i2 = this.mLast + 1;
                    this.mLast = i2;
                    int[] iArr = this.mArrayIndices;
                    if (i2 >= iArr.length) {
                        this.mDidFillOnce = true;
                        this.mLast = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.currentSize; i4++) {
                int i5 = this.mArrayIndices[i];
                int i6 = solverVariable.id;
                if (i5 == i6) {
                    float[] fArr = this.mArrayValues;
                    float f2 = fArr[i] + f;
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.mHead) {
                            this.mHead = this.mArrayNextIndices[i];
                        } else {
                            int[] iArr2 = this.mArrayNextIndices;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.removeFromRow(this.mRow);
                        }
                        if (this.mDidFillOnce) {
                            this.mLast = i;
                        }
                        solverVariable.usageInRowCount--;
                        this.currentSize--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.mArrayNextIndices[i];
            }
            int i7 = this.mLast;
            int i8 = i7 + 1;
            if (this.mDidFillOnce) {
                int[] iArr3 = this.mArrayIndices;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.mArrayIndices;
            if (i7 >= iArr4.length && this.currentSize < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.mArrayIndices;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.mArrayIndices;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.ROW_SIZE * 2;
                this.ROW_SIZE = i10;
                this.mDidFillOnce = false;
                this.mLast = i7 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i10);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
            }
            this.mArrayIndices[i7] = solverVariable.id;
            this.mArrayValues[i7] = f;
            if (i3 != -1) {
                int[] iArr7 = this.mArrayNextIndices;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.mArrayNextIndices[i7] = this.mHead;
                this.mHead = i7;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            int i11 = this.mLast;
            int[] iArr8 = this.mArrayIndices;
            if (i11 >= iArr8.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr8.length - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.constraintlayout.solver.SolverVariable chooseSubject(androidx.constraintlayout.solver.LinearSystem r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.constraintlayout.solver.ArrayLinkedVariables.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "328f89f"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r14
            r4[r1] = r15
            java.lang.Object r15 = r2.ipc$dispatch(r3, r4)
            androidx.constraintlayout.solver.SolverVariable r15 = (androidx.constraintlayout.solver.SolverVariable) r15
            return r15
        L_0x0018:
            int r2 = r14.mHead
            r3 = 0
            r4 = 0
            r5 = r2
            r6 = r3
            r7 = r6
            r2 = 0
            r3 = 0
            r8 = 0
            r9 = 0
        L_0x0023:
            r10 = -1
            if (r5 == r10) goto L_0x00ad
            int r10 = r14.currentSize
            if (r0 >= r10) goto L_0x00ad
            float[] r10 = r14.mArrayValues
            r11 = r10[r5]
            androidx.constraintlayout.solver.Cache r12 = r14.mCache
            androidx.constraintlayout.solver.SolverVariable[] r12 = r12.mIndexedVariables
            int[] r13 = r14.mArrayIndices
            r13 = r13[r5]
            r12 = r12[r13]
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x004c
            r13 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x005b
            r10[r5] = r4
            androidx.constraintlayout.solver.ArrayRow r10 = r14.mRow
            r12.removeFromRow(r10)
        L_0x004a:
            r11 = 0
            goto L_0x005b
        L_0x004c:
            r13 = 981668463(0x3a83126f, float:0.001)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x005b
            r10[r5] = r4
            androidx.constraintlayout.solver.ArrayRow r10 = r14.mRow
            r12.removeFromRow(r10)
            goto L_0x004a
        L_0x005b:
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x00a6
            androidx.constraintlayout.solver.SolverVariable$Type r10 = r12.mType
            androidx.constraintlayout.solver.SolverVariable$Type r13 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED
            if (r10 != r13) goto L_0x0083
            if (r7 != 0) goto L_0x006e
            boolean r2 = r14.isNew(r12, r15)
        L_0x006b:
            r8 = r11
            r7 = r12
            goto L_0x00a6
        L_0x006e:
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0077
            boolean r2 = r14.isNew(r12, r15)
            goto L_0x006b
        L_0x0077:
            if (r2 != 0) goto L_0x00a6
            boolean r10 = r14.isNew(r12, r15)
            if (r10 == 0) goto L_0x00a6
            r8 = r11
            r7 = r12
            r2 = 1
            goto L_0x00a6
        L_0x0083:
            if (r7 != 0) goto L_0x00a6
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x00a6
            if (r6 != 0) goto L_0x0092
            boolean r3 = r14.isNew(r12, r15)
        L_0x008f:
            r9 = r11
            r6 = r12
            goto L_0x00a6
        L_0x0092:
            int r10 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x009b
            boolean r3 = r14.isNew(r12, r15)
            goto L_0x008f
        L_0x009b:
            if (r3 != 0) goto L_0x00a6
            boolean r10 = r14.isNew(r12, r15)
            if (r10 == 0) goto L_0x00a6
            r9 = r11
            r6 = r12
            r3 = 1
        L_0x00a6:
            int[] r10 = r14.mArrayNextIndices
            r5 = r10[r5]
            int r0 = r0 + r1
            goto L_0x0023
        L_0x00ad:
            if (r7 == 0) goto L_0x00b0
            return r7
        L_0x00b0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.ArrayLinkedVariables.chooseSubject(androidx.constraintlayout.solver.LinearSystem):androidx.constraintlayout.solver.SolverVariable");
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        int i = this.mHead;
        for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i = this.mArrayNextIndices[i];
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.currentSize = 0;
    }

    public final boolean containsKey(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61df4a55", new Object[]{this, solverVariable})).booleanValue();
        }
        int i = this.mHead;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                return true;
            }
            i = this.mArrayNextIndices[i];
        }
        return false;
    }

    public void divideByAmount(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e069f1", new Object[]{this, new Float(f)});
            return;
        }
        int i = this.mHead;
        for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] / f;
            i = this.mArrayNextIndices[i];
        }
    }

    public final float get(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c506546b", new Object[]{this, solverVariable})).floatValue();
        }
        int i = this.mHead;
        for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                return this.mArrayValues[i];
            }
            i = this.mArrayNextIndices[i];
        }
        return 0.0f;
    }

    public SolverVariable getPivotCandidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("d5f7b946", new Object[]{this});
        }
        SolverVariable solverVariable = this.candidate;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i = this.mHead;
        SolverVariable solverVariable2 = null;
        for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
            if (this.mArrayValues[i] < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
                if (solverVariable2 == null || solverVariable2.strength < solverVariable3.strength) {
                    solverVariable2 = solverVariable3;
                }
            }
            i = this.mArrayNextIndices[i];
        }
        return solverVariable2;
    }

    public final SolverVariable getVariable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("a9d22692", new Object[]{this, new Integer(i)});
        }
        int i2 = this.mHead;
        for (int i3 = 0; i2 != -1 && i3 < this.currentSize; i3++) {
            if (i3 == i) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
            }
            i2 = this.mArrayNextIndices[i2];
        }
        return null;
    }

    public final float getVariableValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b10520d", new Object[]{this, new Integer(i)})).floatValue();
        }
        int i2 = this.mHead;
        for (int i3 = 0; i2 != -1 && i3 < this.currentSize; i3++) {
            if (i3 == i) {
                return this.mArrayValues[i2];
            }
            i2 = this.mArrayNextIndices[i2];
        }
        return 0.0f;
    }

    public boolean hasAtLeastOnePositiveVariable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b9c4b8a", new Object[]{this})).booleanValue();
        }
        int i = this.mHead;
        for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
            if (this.mArrayValues[i] > 0.0f) {
                return true;
            }
            i = this.mArrayNextIndices[i];
        }
        return false;
    }

    public void invert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7127c95d", new Object[]{this});
            return;
        }
        int i = this.mHead;
        for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.mArrayNextIndices[i];
        }
    }

    public final void put(SolverVariable solverVariable, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415e219e", new Object[]{this, solverVariable, new Float(f)});
        } else if (f == 0.0f) {
            remove(solverVariable, true);
        } else {
            int i = this.mHead;
            if (i == -1) {
                this.mHead = 0;
                this.mArrayValues[0] = f;
                this.mArrayIndices[0] = solverVariable.id;
                this.mArrayNextIndices[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.currentSize++;
                if (!this.mDidFillOnce) {
                    int i2 = this.mLast + 1;
                    this.mLast = i2;
                    int[] iArr = this.mArrayIndices;
                    if (i2 >= iArr.length) {
                        this.mDidFillOnce = true;
                        this.mLast = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.currentSize; i4++) {
                int i5 = this.mArrayIndices[i];
                int i6 = solverVariable.id;
                if (i5 == i6) {
                    this.mArrayValues[i] = f;
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.mArrayNextIndices[i];
            }
            int i7 = this.mLast;
            int i8 = i7 + 1;
            if (this.mDidFillOnce) {
                int[] iArr2 = this.mArrayIndices;
                if (iArr2[i7] != -1) {
                    i7 = iArr2.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr3 = this.mArrayIndices;
            if (i7 >= iArr3.length && this.currentSize < iArr3.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr4 = this.mArrayIndices;
                    if (i9 >= iArr4.length) {
                        break;
                    } else if (iArr4[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr5 = this.mArrayIndices;
            if (i7 >= iArr5.length) {
                i7 = iArr5.length;
                int i10 = this.ROW_SIZE * 2;
                this.ROW_SIZE = i10;
                this.mDidFillOnce = false;
                this.mLast = i7 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i10);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
            }
            this.mArrayIndices[i7] = solverVariable.id;
            this.mArrayValues[i7] = f;
            if (i3 != -1) {
                int[] iArr6 = this.mArrayNextIndices;
                iArr6[i7] = iArr6[i3];
                iArr6[i3] = i7;
            } else {
                this.mArrayNextIndices[i7] = this.mHead;
                this.mHead = i7;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            int i11 = this.currentSize + 1;
            this.currentSize = i11;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            int[] iArr7 = this.mArrayIndices;
            if (i11 >= iArr7.length) {
                this.mDidFillOnce = true;
            }
            if (this.mLast >= iArr7.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr7.length - 1;
            }
        }
    }

    public int sizeInBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ffe90ff", new Object[]{this})).intValue();
        }
        return (this.mArrayIndices.length * 12) + 36;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int i = this.mHead;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
            str = ((str + " -> ") + this.mArrayValues[i] + " : ") + this.mCache.mIndexedVariables[this.mArrayIndices[i]];
            i = this.mArrayNextIndices[i];
        }
        return str;
    }

    public void updateFromSystem(ArrayRow arrayRow, ArrayRow[] arrayRowArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572ef0ce", new Object[]{this, arrayRow, arrayRowArr});
            return;
        }
        int i = this.mHead;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
                SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
                if (solverVariable.definitionId != -1) {
                    float f = this.mArrayValues[i];
                    remove(solverVariable, true);
                    ArrayRow arrayRow2 = arrayRowArr[solverVariable.definitionId];
                    if (!arrayRow2.isSimpleDefinition) {
                        ArrayLinkedVariables arrayLinkedVariables = arrayRow2.variables;
                        int i3 = arrayLinkedVariables.mHead;
                        for (int i4 = 0; i3 != -1 && i4 < arrayLinkedVariables.currentSize; i4++) {
                            add(this.mCache.mIndexedVariables[arrayLinkedVariables.mArrayIndices[i3]], arrayLinkedVariables.mArrayValues[i3] * f, true);
                            i3 = arrayLinkedVariables.mArrayNextIndices[i3];
                        }
                    }
                    arrayRow.constantValue += arrayRow2.constantValue * f;
                    arrayRow2.variable.removeFromRow(arrayRow);
                    i = this.mHead;
                } else {
                    i = this.mArrayNextIndices[i];
                }
            }
            return;
        }
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3add23c", new Object[]{this, solverVariable, linearSystem})).booleanValue();
        }
        return solverVariable.usageInRowCount <= 1;
    }

    public void display() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661c6c49", new Object[]{this});
            return;
        }
        int i = this.currentSize;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                PrintStream printStream = System.out;
                printStream.print(variable + " = " + getVariableValue(i2) + " ");
            }
        }
        System.out.println(" }");
    }

    public final float remove(SolverVariable solverVariable, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f76ce857", new Object[]{this, solverVariable, new Boolean(z)})).floatValue();
        }
        if (this.candidate == solverVariable) {
            this.candidate = null;
        }
        int i2 = this.mHead;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = -1;
        while (i2 != -1 && i < this.currentSize) {
            if (this.mArrayIndices[i2] == solverVariable.id) {
                if (i2 == this.mHead) {
                    this.mHead = this.mArrayNextIndices[i2];
                } else {
                    int[] iArr = this.mArrayNextIndices;
                    iArr[i3] = iArr[i2];
                }
                if (z) {
                    solverVariable.removeFromRow(this.mRow);
                }
                solverVariable.usageInRowCount--;
                this.currentSize--;
                this.mArrayIndices[i2] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i2;
                }
                return this.mArrayValues[i2];
            }
            i++;
            i3 = i2;
            i2 = this.mArrayNextIndices[i2];
        }
        return 0.0f;
    }

    public final void updateFromRow(ArrayRow arrayRow, ArrayRow arrayRow2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a6b906", new Object[]{this, arrayRow, arrayRow2, new Boolean(z)});
            return;
        }
        int i = this.mHead;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
                int i3 = this.mArrayIndices[i];
                SolverVariable solverVariable = arrayRow2.variable;
                if (i3 == solverVariable.id) {
                    float f = this.mArrayValues[i];
                    remove(solverVariable, z);
                    ArrayLinkedVariables arrayLinkedVariables = arrayRow2.variables;
                    int i4 = arrayLinkedVariables.mHead;
                    for (int i5 = 0; i4 != -1 && i5 < arrayLinkedVariables.currentSize; i5++) {
                        add(this.mCache.mIndexedVariables[arrayLinkedVariables.mArrayIndices[i4]], arrayLinkedVariables.mArrayValues[i4] * f, z);
                        i4 = arrayLinkedVariables.mArrayNextIndices[i4];
                    }
                    arrayRow.constantValue += arrayRow2.constantValue * f;
                    if (z) {
                        arrayRow2.variable.removeFromRow(arrayRow);
                    }
                    i = this.mHead;
                } else {
                    i = this.mArrayNextIndices[i];
                }
            }
            return;
        }
    }

    public SolverVariable getPivotCandidate(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("b0bc283", new Object[]{this, zArr, solverVariable});
        }
        int i = this.mHead;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.currentSize; i2++) {
            float f2 = this.mArrayValues[i];
            if (f2 < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
                if ((zArr == null || !zArr[solverVariable3.id]) && solverVariable3 != solverVariable && (((type = solverVariable3.mType) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && f2 < f)) {
                    f = f2;
                    solverVariable2 = solverVariable3;
                }
            }
            i = this.mArrayNextIndices[i];
        }
        return solverVariable2;
    }
}
