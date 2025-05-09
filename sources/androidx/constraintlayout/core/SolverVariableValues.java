package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float sEpsilon = 0.001f;
    public final Cache mCache;
    private final ArrayRow mRow;
    private final int mNone = -1;
    private int mSize = 16;
    private int mHashSize = 16;
    public int[] mKeys = new int[16];
    public int[] mNextKeys = new int[16];
    public int[] mVariables = new int[16];
    public float[] mValues = new float[16];
    public int[] mPrevious = new int[16];
    public int[] mNext = new int[16];
    public int mCount = 0;
    public int mHead = -1;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void addToHashMap(SolverVariable solverVariable, int i) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817744d8", new Object[]{this, solverVariable, new Integer(i)});
            return;
        }
        int i2 = solverVariable.id % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.mNextKeys[i] = -1;
    }

    private void addVariable(int i, SolverVariable solverVariable, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be18da7b", new Object[]{this, new Integer(i), solverVariable, new Float(f)});
            return;
        }
        this.mVariables[i] = solverVariable.id;
        this.mValues[i] = f;
        this.mPrevious[i] = -1;
        this.mNext[i] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c186a977", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mHashSize; i++) {
            if (this.mKeys[i] != -1) {
                String str = hashCode() + " hash [" + i + "] => ";
                int i2 = this.mKeys[i];
                boolean z = false;
                while (!z) {
                    str = str + " " + this.mVariables[i2];
                    int i3 = this.mNextKeys[i2];
                    if (i3 != -1) {
                        i2 = i3;
                    } else {
                        z = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int findEmptySlot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc139aac", new Object[]{this})).intValue();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mVariables[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void increaseSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9638fc6a", new Object[]{this});
            return;
        }
        int i = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i);
        this.mValues = Arrays.copyOf(this.mValues, i);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i);
        this.mNext = Arrays.copyOf(this.mNext, i);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i);
        for (int i2 = this.mSize; i2 < i; i2++) {
            this.mVariables[i2] = -1;
            this.mNextKeys[i2] = -1;
        }
        this.mSize = i;
    }

    private void insertVariable(int i, SolverVariable solverVariable, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd284763", new Object[]{this, new Integer(i), solverVariable, new Float(f)});
            return;
        }
        int findEmptySlot = findEmptySlot();
        addVariable(findEmptySlot, solverVariable, f);
        if (i != -1) {
            this.mPrevious[findEmptySlot] = i;
            int[] iArr = this.mNext;
            iArr[findEmptySlot] = iArr[i];
            iArr[i] = findEmptySlot;
        } else {
            this.mPrevious[findEmptySlot] = -1;
            if (this.mCount > 0) {
                this.mNext[findEmptySlot] = this.mHead;
                this.mHead = findEmptySlot;
            } else {
                this.mNext[findEmptySlot] = -1;
            }
        }
        int i2 = this.mNext[findEmptySlot];
        if (i2 != -1) {
            this.mPrevious[i2] = findEmptySlot;
        }
        addToHashMap(solverVariable, findEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcdb85d", new Object[]{this, solverVariable});
            return;
        }
        int i2 = solverVariable.id;
        int i3 = i2 % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.mVariables[i4] == i2) {
                int[] iArr3 = this.mNextKeys;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
                return;
            }
            while (true) {
                iArr = this.mNextKeys;
                i = iArr[i4];
                if (i == -1 || this.mVariables[i] == i2) {
                    break;
                }
                i4 = i;
            }
            if (i != -1 && this.mVariables[i] == i2) {
                iArr[i4] = iArr[i];
                iArr[i] = -1;
            }
        }
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
            int indexOf = indexOf(solverVariable);
            if (indexOf == -1) {
                put(solverVariable, f);
                return;
            }
            float[] fArr = this.mValues;
            float f3 = fArr[indexOf] + f;
            fArr[indexOf] = f3;
            float f4 = sEpsilon;
            if (f3 > (-f4) && f3 < f4) {
                fArr[indexOf] = 0.0f;
                remove(solverVariable, z);
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        int i = this.mCount;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i3 = 0; i3 < this.mSize; i3++) {
            this.mVariables[i3] = -1;
            this.mNextKeys[i3] = -1;
        }
        for (int i4 = 0; i4 < this.mHashSize; i4++) {
            this.mKeys[i4] = -1;
        }
        this.mCount = 0;
        this.mHead = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc30722", new Object[]{this, solverVariable})).booleanValue();
        }
        if (indexOf(solverVariable) != -1) {
            return true;
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
        int i = this.mCount;
        int i2 = this.mHead;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.mValues;
            fArr[i2] = fArr[i2] / f;
            i2 = this.mNext[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("220b7877", new Object[]{this, solverVariable})).floatValue();
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            return this.mValues[indexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d1ce65e", new Object[]{this})).intValue();
        }
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("48d8869e", new Object[]{this, new Integer(i)});
        }
        int i2 = this.mCount;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.mHead;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[i3]];
            }
            i3 = this.mNext[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b10520d", new Object[]{this, new Integer(i)})).floatValue();
        }
        int i2 = this.mCount;
        int i3 = this.mHead;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.mValues[i3];
            }
            i3 = this.mNext[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3538aa7", new Object[]{this, solverVariable})).intValue();
        }
        if (!(this.mCount == 0 || solverVariable == null)) {
            int i = solverVariable.id;
            int i2 = this.mKeys[i % this.mHashSize];
            if (i2 == -1) {
                return -1;
            }
            if (this.mVariables[i2] == i) {
                return i2;
            }
            do {
                i2 = this.mNextKeys[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.mVariables[i2] != i);
            if (i2 != -1 && this.mVariables[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7127c95d", new Object[]{this});
            return;
        }
        int i = this.mCount;
        int i2 = this.mHead;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.mValues;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.mNext[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3512e952", new Object[]{this, solverVariable, new Float(f)});
            return;
        }
        float f2 = sEpsilon;
        if (f > (-f2) && f < f2) {
            remove(solverVariable, true);
        } else if (this.mCount == 0) {
            addVariable(0, solverVariable, f);
            addToHashMap(solverVariable, 0);
            this.mHead = 0;
        } else {
            int indexOf = indexOf(solverVariable);
            if (indexOf != -1) {
                this.mValues[indexOf] = f;
                return;
            }
            if (this.mCount + 1 >= this.mSize) {
                increaseSize();
            }
            int i = this.mCount;
            int i2 = this.mHead;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = this.mVariables[i2];
                int i6 = solverVariable.id;
                if (i5 == i6) {
                    this.mValues[i2] = f;
                    return;
                }
                if (i5 < i6) {
                    i3 = i2;
                }
                i2 = this.mNext[i2];
                if (i2 == -1) {
                    break;
                }
            }
            insertVariable(i3, solverVariable, f);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ffe90ff", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bfe8920", new Object[]{this, arrayRow, new Boolean(z)})).floatValue();
        }
        float f = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i2 = 0;
        while (i < currentSize) {
            int i3 = solverVariableValues.mVariables[i2];
            if (i3 != -1) {
                add(this.mCache.mIndexedVariables[i3], solverVariableValues.mValues[i2] * f, z);
                i++;
            }
            i2++;
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f887194b", new Object[]{this, solverVariable, new Boolean(z)})).floatValue();
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f = this.mValues[indexOf];
        if (this.mHead == indexOf) {
            this.mHead = this.mNext[indexOf];
        }
        this.mVariables[indexOf] = -1;
        int[] iArr = this.mPrevious;
        int i = iArr[indexOf];
        if (i != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i] = iArr2[indexOf];
        }
        int i2 = this.mNext[indexOf];
        if (i2 != -1) {
            iArr[i2] = iArr[indexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z) {
            solverVariable.removeFromRow(this.mRow);
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
        int i = this.mCount;
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

    public String toString() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str3 = hashCode() + " { ";
        int i = this.mCount;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable variable = getVariable(i2);
            if (variable != null) {
                String str4 = str3 + variable + " = " + getVariableValue(i2) + " ";
                int indexOf = indexOf(variable);
                String str5 = str4 + "[p: ";
                if (this.mPrevious[indexOf] != -1) {
                    str = str5 + this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[indexOf]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.mNext[indexOf] != -1) {
                    str2 = str6 + this.mCache.mIndexedVariables[this.mVariables[this.mNext[indexOf]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
