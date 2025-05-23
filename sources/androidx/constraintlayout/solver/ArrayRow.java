package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ArrayRow implements LinearSystem.Row {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final float epsilon = 0.001f;
    public final ArrayLinkedVariables variables;
    public SolverVariable variable = null;
    public float constantValue = 0.0f;
    public boolean used = false;
    public boolean isSimpleDefinition = false;

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    public ArrayRow addError(LinearSystem linearSystem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("59ad2194", new Object[]{this, linearSystem, new Integer(i)});
        }
        this.variables.put(linearSystem.createErrorVariable(i, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i, "em"), -1.0f);
        return this;
    }

    public ArrayRow addSingleError(SolverVariable solverVariable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("3a9595e7", new Object[]{this, solverVariable, new Integer(i)});
        }
        this.variables.put(solverVariable, i);
        return this;
    }

    public boolean chooseSubject(LinearSystem linearSystem) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("459c96bb", new Object[]{this, linearSystem})).booleanValue();
        }
        SolverVariable chooseSubject = this.variables.chooseSubject(linearSystem);
        if (chooseSubject == null) {
            z = true;
        } else {
            pivot(chooseSubject);
        }
        if (this.variables.currentSize == 0) {
            this.isSimpleDefinition = true;
        }
        return z;
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.variables.clear();
        this.variable = null;
        this.constantValue = 0.0f;
    }

    public ArrayRow createRowCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("45eb146", new Object[]{this, solverVariable, solverVariable2, new Integer(i), new Float(f), solverVariable3, solverVariable4, new Integer(i2)});
        }
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.constantValue = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.constantValue = i;
        } else if (f >= 1.0f) {
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.constantValue = i2;
        } else {
            float f2 = 1.0f - f;
            this.variables.put(solverVariable, f2 * 1.0f);
            this.variables.put(solverVariable2, f2 * (-1.0f));
            this.variables.put(solverVariable3, (-1.0f) * f);
            this.variables.put(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.constantValue = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    public ArrayRow createRowDefinition(SolverVariable solverVariable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("622b8dd9", new Object[]{this, solverVariable, new Integer(i)});
        }
        this.variable = solverVariable;
        float f = i;
        solverVariable.computedValue = f;
        this.constantValue = f;
        this.isSimpleDefinition = true;
        return this;
    }

    public ArrayRow createRowDimensionPercent(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("bb16c082", new Object[]{this, solverVariable, solverVariable2, solverVariable3, new Float(f)});
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f - f);
        this.variables.put(solverVariable3, f);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("80711e6c", new Object[]{this, solverVariable, solverVariable2, solverVariable3, solverVariable4, new Float(f)});
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f);
        this.variables.put(solverVariable4, -f);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f, float f2, float f3, SolverVariable solverVariable, int i, SolverVariable solverVariable2, int i2, SolverVariable solverVariable3, int i3, SolverVariable solverVariable4, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("54287eb", new Object[]{this, new Float(f), new Float(f2), new Float(f3), solverVariable, new Integer(i), solverVariable2, new Integer(i2), solverVariable3, new Integer(i3), solverVariable4, new Integer(i4)});
        }
        if (f2 == 0.0f || f == f3) {
            this.constantValue = ((-i) - i2) + i3 + i4;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.constantValue = ((-i) - i2) + (i3 * f4) + (i4 * f4);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f4);
            this.variables.put(solverVariable3, -f4);
        }
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("a1d43db3", new Object[]{this, new Float(f), new Float(f2), new Float(f3), solverVariable, solverVariable2, solverVariable3, solverVariable4});
        }
        this.constantValue = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else if (f == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        } else if (f3 == 0.0f) {
            this.variables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f4);
            this.variables.put(solverVariable3, -f4);
        }
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("b10a6745", new Object[]{this, solverVariable, new Integer(i)});
        }
        if (i < 0) {
            this.constantValue = i * (-1);
            this.variables.put(solverVariable, 1.0f);
        } else {
            this.constantValue = i;
            this.variables.put(solverVariable, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("9b71f745", new Object[]{this, solverVariable, solverVariable2, solverVariable3, new Integer(i)});
        }
        if (i != 0) {
            if (i < 0) {
                i *= -1;
            } else {
                z = false;
            }
            this.constantValue = i;
        }
        if (!z) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, 1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("71e1dd8c", new Object[]{this, solverVariable, solverVariable2, solverVariable3, new Integer(i)});
        }
        if (i != 0) {
            if (i < 0) {
                i *= -1;
            } else {
                z = false;
            }
            this.constantValue = i;
            z2 = z;
        }
        if (!z2) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
        }
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("cb76ce00", new Object[]{this, solverVariable, solverVariable2, solverVariable3, solverVariable4, new Float(f)});
        }
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.constantValue = -f;
        return this;
    }

    public void ensurePositiveConstant() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d4fc22", new Object[]{this});
            return;
        }
        float f = this.constantValue;
        if (f < 0.0f) {
            this.constantValue = f * (-1.0f);
            this.variables.invert();
        }
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public SolverVariable getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("2db64318", new Object[]{this});
        }
        return this.variable;
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("6bfa0bbc", new Object[]{this, linearSystem, zArr});
        }
        return this.variables.getPivotCandidate(zArr, null);
    }

    public boolean hasVariable(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7be809f", new Object[]{this, solverVariable})).booleanValue();
        }
        return this.variables.containsKey(solverVariable);
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public void initFromRow(LinearSystem.Row row) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab2f476", new Object[]{this, row});
        } else if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.variable = null;
            this.variables.clear();
            while (true) {
                ArrayLinkedVariables arrayLinkedVariables = arrayRow.variables;
                if (i < arrayLinkedVariables.currentSize) {
                    this.variables.add(arrayLinkedVariables.getVariable(i), arrayRow.variables.getVariableValue(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SolverVariable) ipChange.ipc$dispatch("34683ff8", new Object[]{this, solverVariable});
        }
        return this.variables.getPivotCandidate(null, solverVariable);
    }

    public void pivot(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f2530f", new Object[]{this, solverVariable});
            return;
        }
        SolverVariable solverVariable2 = this.variable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.variable = null;
        }
        float remove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.variable = solverVariable;
        if (remove != 1.0f) {
            this.constantValue /= remove;
            this.variables.divideByAmount(remove);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.variable = null;
        this.variables.clear();
        this.constantValue = 0.0f;
        this.isSimpleDefinition = false;
    }

    public int sizeInBytes() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ffe90ff", new Object[]{this})).intValue();
        }
        if (this.variable != null) {
            i = 4;
        }
        return i + 8 + this.variables.sizeInBytes();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toReadableString() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.ArrayRow.toReadableString():java.lang.String");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return toReadableString();
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a54b68a", new Object[]{this, solverVariable});
            return;
        }
        int i = solverVariable.strength;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f);
    }

    public boolean hasKeyVariable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df5e730c", new Object[]{this})).booleanValue();
        }
        SolverVariable solverVariable = this.variable;
        if (solverVariable != null) {
            return solverVariable.mType == SolverVariable.Type.UNRESTRICTED || this.constantValue >= 0.0f;
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.LinearSystem.Row
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.variable == null && this.constantValue == 0.0f && this.variables.currentSize == 0;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("338dea35", new Object[]{this, solverVariable, solverVariable2, new Integer(i)});
        }
        if (i != 0) {
            if (i < 0) {
                i *= -1;
            } else {
                z = false;
            }
            this.constantValue = i;
        }
        if (!z) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
        } else {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i, SolverVariable solverVariable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayRow) ipChange.ipc$dispatch("4f5b387f", new Object[]{this, solverVariable, new Integer(i), solverVariable2});
        }
        this.constantValue = i;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }
}
