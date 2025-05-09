package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    public static final int NONE = -1;
    private static float sEpsilon = 0.001f;
    public final Cache mCache;
    private final ArrayRow mRow;
    public int mCurrentSize = 0;
    private int mRowSize = 8;
    private SolverVariable mCandidate = null;
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

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        int i = this.mHead;
        for (int i2 = 0; i != -1 && i2 < this.mCurrentSize; i2++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i = this.mArrayNextIndices[i];
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.mCurrentSize = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc30722", new Object[]{this, solverVariable})).booleanValue();
        }
        int i = this.mHead;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.mCurrentSize; i2++) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                return true;
            }
            i = this.mArrayNextIndices[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e069f1", new Object[]{this, new Float(f)});
            return;
        }
        int i = this.mHead;
        for (int i2 = 0; i != -1 && i2 < this.mCurrentSize; i2++) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] / f;
            i = this.mArrayNextIndices[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("220b7877", new Object[]{this, solverVariable})).floatValue();
        }
        int i = this.mHead;
        for (int i2 = 0; i != -1 && i2 < this.mCurrentSize; i2++) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                return this.mArrayValues[i];
            }
            i = this.mArrayNextIndices[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d1ce65e", new Object[]{this})).intValue();
        }
        return this.mCurrentSize;
    }

    public int getHead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39469fd0", new Object[]{this})).intValue();
        }
        return this.mHead;
    }

    public final int getId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d7ba6de", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mArrayIndices[i];
    }

    public final int getNextIndice(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdee395a", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mArrayNextIndices[i];
    }

    public SolverVariable getPivotCandidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("aeeb3652", new Object[]{this});
        }
        SolverVariable solverVariable = this.mCandidate;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i = this.mHead;
        SolverVariable solverVariable2 = null;
        for (int i2 = 0; i != -1 && i2 < this.mCurrentSize; i2++) {
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

    public final float getValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6535e471", new Object[]{this, new Integer(i)})).floatValue();
        }
        return this.mArrayValues[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("48d8869e", new Object[]{this, new Integer(i)});
        }
        int i2 = this.mHead;
        for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
            if (i3 == i) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i2]];
            }
            i2 = this.mArrayNextIndices[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b10520d", new Object[]{this, new Integer(i)})).floatValue();
        }
        int i2 = this.mHead;
        for (int i3 = 0; i2 != -1 && i3 < this.mCurrentSize; i3++) {
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
        for (int i2 = 0; i != -1 && i2 < this.mCurrentSize; i2++) {
            if (this.mArrayValues[i] > 0.0f) {
                return true;
            }
            i = this.mArrayNextIndices[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7127c95d", new Object[]{this});
            return;
        }
        int i = this.mHead;
        for (int i2 = 0; i != -1 && i2 < this.mCurrentSize; i2++) {
            float[] fArr = this.mArrayValues;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.mArrayNextIndices[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable solverVariable, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3512e952", new Object[]{this, solverVariable, new Float(f)});
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
                this.mCurrentSize++;
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
            for (int i4 = 0; i != -1 && i4 < this.mCurrentSize; i4++) {
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
            if (i7 >= iArr3.length && this.mCurrentSize < iArr3.length) {
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
                int i10 = this.mRowSize * 2;
                this.mRowSize = i10;
                this.mDidFillOnce = false;
                this.mLast = i7 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i10);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
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
            int i11 = this.mCurrentSize + 1;
            this.mCurrentSize = i11;
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

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
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
        for (int i2 = 0; i != -1 && i2 < this.mCurrentSize; i2++) {
            str = ((str + " -> ") + this.mArrayValues[i] + " : ") + this.mCache.mIndexedVariables[this.mArrayIndices[i]];
            i = this.mArrayNextIndices[i];
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bfe8920", new Object[]{this, arrayRow, new Boolean(z)})).floatValue();
        }
        float f = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable variable = arrayRowVariables.getVariable(i);
            add(variable, arrayRowVariables.get(variable) * f, z);
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661c6c49", new Object[]{this});
            return;
        }
        int i = this.mCurrentSize;
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

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3538aa7", new Object[]{this, solverVariable})).intValue();
        }
        int i = this.mHead;
        if (i == -1) {
            return -1;
        }
        for (int i2 = 0; i != -1 && i2 < this.mCurrentSize; i2++) {
            if (this.mArrayIndices[i] == solverVariable.id) {
                return i;
            }
            i = this.mArrayNextIndices[i];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable solverVariable, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f887194b", new Object[]{this, solverVariable, new Boolean(z)})).floatValue();
        }
        if (this.mCandidate == solverVariable) {
            this.mCandidate = null;
        }
        int i2 = this.mHead;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = -1;
        while (i2 != -1 && i < this.mCurrentSize) {
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
                this.mCurrentSize--;
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

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faca8570", new Object[]{this, solverVariable, new Float(f), new Boolean(z)});
            return;
        }
        float f2 = sEpsilon;
        if (f <= (-f2) || f >= f2) {
            int i = this.mHead;
            if (i == -1) {
                this.mHead = 0;
                this.mArrayValues[0] = f;
                this.mArrayIndices[0] = solverVariable.id;
                this.mArrayNextIndices[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.mCurrentSize++;
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
            for (int i4 = 0; i != -1 && i4 < this.mCurrentSize; i4++) {
                int i5 = this.mArrayIndices[i];
                int i6 = solverVariable.id;
                if (i5 == i6) {
                    float[] fArr = this.mArrayValues;
                    float f3 = fArr[i] + f;
                    float f4 = sEpsilon;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
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
                        this.mCurrentSize--;
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
            i7++;
            if (this.mDidFillOnce) {
                int[] iArr3 = this.mArrayIndices;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            }
            int[] iArr4 = this.mArrayIndices;
            if (i7 >= iArr4.length && this.mCurrentSize < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.mArrayIndices;
                    if (i8 >= iArr5.length) {
                        break;
                    } else if (iArr5[i8] == -1) {
                        i7 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int[] iArr6 = this.mArrayIndices;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i9 = this.mRowSize * 2;
                this.mRowSize = i9;
                this.mDidFillOnce = false;
                this.mLast = i7 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i9);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
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
            this.mCurrentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            int i10 = this.mLast;
            int[] iArr8 = this.mArrayIndices;
            if (i10 >= iArr8.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr8.length - 1;
            }
        }
    }
}
