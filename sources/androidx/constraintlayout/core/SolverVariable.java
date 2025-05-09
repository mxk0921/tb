package androidx.constraintlayout.core;

import androidx.exifinterface.media.ExifInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DO_NOT_USE = false;
    private static final boolean INTERNAL_DEBUG = false;
    public static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int sUniqueConstantId = 1;
    private static int sUniqueErrorId = 1;
    private static int sUniqueId = 1;
    private static int sUniqueSlackId = 1;
    private static int sUniqueUnrestrictedId = 1;
    public float computedValue;
    public int id;
    public boolean inGoal;
    public boolean isFinalValue;
    public ArrayRow[] mClientEquations;
    public int mClientEquationsCount;
    public int mDefinitionId;
    public float[] mGoalStrengthVector;
    public HashSet<ArrayRow> mInRows;
    public boolean mIsSynonym;
    private String mName;
    public float[] mStrengthVector;
    public int mSynonym;
    public float mSynonymDelta;
    public Type mType;
    public int strength;
    public int usageInRowCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Type extends Enum<Type> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Type UNRESTRICTED = new Type("UNRESTRICTED", 0);
        public static final Type CONSTANT = new Type("CONSTANT", 1);
        public static final Type SLACK = new Type("SLACK", 2);
        public static final Type ERROR = new Type("ERROR", 3);
        public static final Type UNKNOWN = new Type("UNKNOWN", 4);
        private static final /* synthetic */ Type[] $VALUES = $values();

        private static /* synthetic */ Type[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("8d348ba0", new Object[0]) : new Type[]{UNRESTRICTED, CONSTANT, SLACK, ERROR, UNKNOWN};
        }

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/SolverVariable$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("366bf08b", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type[]) ipChange.ipc$dispatch("4d05f27c", new Object[0]);
            }
            return (Type[]) $VALUES.clone();
        }
    }

    public SolverVariable(String str, Type type) {
        this.id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mName = str;
        this.mType = type;
    }

    public static void increaseErrorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e6b0a8", new Object[0]);
        } else {
            sUniqueErrorId++;
        }
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88509fcd", new Object[]{this, arrayRow});
            return;
        }
        while (true) {
            int i2 = this.mClientEquationsCount;
            if (i >= i2) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i2 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i3 = this.mClientEquationsCount;
                arrayRowArr2[i3] = arrayRow;
                this.mClientEquationsCount = i3 + 1;
                return;
            } else if (this.mClientEquations[i] != arrayRow) {
                i++;
            } else {
                return;
            }
        }
    }

    public void clearStrengths() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c88a28c", new Object[]{this});
            return;
        }
        for (int i = 0; i < 9; i++) {
            this.mStrengthVector[i] = 0.0f;
        }
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 >= (r2 - 1)) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        r6 = r5.mClientEquations;
        r3 = r0 + 1;
        r6[r0] = r6[r3];
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        r5.mClientEquationsCount--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void removeFromRow(androidx.constraintlayout.core.ArrayRow r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.constraintlayout.core.SolverVariable.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "9aa0b71f"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r5
            r4[r1] = r6
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            int r2 = r5.mClientEquationsCount
        L_0x0017:
            if (r0 >= r2) goto L_0x0035
            androidx.constraintlayout.core.ArrayRow[] r3 = r5.mClientEquations
            r3 = r3[r0]
            if (r3 != r6) goto L_0x0033
        L_0x001f:
            int r6 = r2 + (-1)
            if (r0 >= r6) goto L_0x002d
            androidx.constraintlayout.core.ArrayRow[] r6 = r5.mClientEquations
            int r3 = r0 + 1
            r4 = r6[r3]
            r6[r0] = r4
            r0 = r3
            goto L_0x001f
        L_0x002d:
            int r6 = r5.mClientEquationsCount
            int r6 = r6 - r1
            r5.mClientEquationsCount = r6
            return
        L_0x0033:
            int r0 = r0 + r1
            goto L_0x0017
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.SolverVariable.removeFromRow(androidx.constraintlayout.core.ArrayRow):void");
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.mDefinitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.mGoalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7673c4a5", new Object[]{this, linearSystem, new Float(f)});
            return;
        }
        this.computedValue = f;
        this.isFinalValue = true;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.mName = str;
        }
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6252239b", new Object[]{this, linearSystem, solverVariable, new Float(f)});
            return;
        }
        this.mIsSynonym = true;
        this.mSynonym = solverVariable.id;
        this.mSynonymDelta = f;
        int i = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9def1b", new Object[]{this, type, str});
        } else {
            this.mType = type;
        }
    }

    public String strengthsToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b66f88db", new Object[]{this});
        }
        String str = this + "[";
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.mStrengthVector.length; i++) {
            String str2 = str + this.mStrengthVector[i];
            float[] fArr = this.mStrengthVector;
            float f = fArr[i];
            if (f > 0.0f) {
                z = false;
            } else if (f < 0.0f) {
                z = true;
            }
            if (f != 0.0f) {
                z2 = false;
            }
            if (i < fArr.length - 1) {
                str = str2 + ", ";
            } else {
                str = str2 + "] ";
            }
        }
        if (z) {
            str = str + " (-)";
        }
        if (!z2) {
            return str;
        }
        return str + " (*)";
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.mName != null) {
            return "" + this.mName;
        }
        return "" + this.id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("311fc36", new Object[]{this, linearSystem, arrayRow});
            return;
        }
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    public int compareTo(SolverVariable solverVariable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88d94150", new Object[]{this, solverVariable})).intValue() : this.id - solverVariable.id;
    }

    private static String getUniqueName(Type type, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14d7f9ef", new Object[]{type, str});
        }
        if (str != null) {
            return str + sUniqueErrorId;
        }
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            StringBuilder sb = new StringBuilder("U");
            int i = sUniqueUnrestrictedId + 1;
            sUniqueUnrestrictedId = i;
            sb.append(i);
            return sb.toString();
        } else if (ordinal == 1) {
            StringBuilder sb2 = new StringBuilder("C");
            int i2 = sUniqueConstantId + 1;
            sUniqueConstantId = i2;
            sb2.append(i2);
            return sb2.toString();
        } else if (ordinal == 2) {
            StringBuilder sb3 = new StringBuilder(ExifInterface.LATITUDE_SOUTH);
            int i3 = sUniqueSlackId + 1;
            sUniqueSlackId = i3;
            sb3.append(i3);
            return sb3.toString();
        } else if (ordinal == 3) {
            StringBuilder sb4 = new StringBuilder("e");
            int i4 = sUniqueErrorId + 1;
            sUniqueErrorId = i4;
            sb4.append(i4);
            return sb4.toString();
        } else if (ordinal == 4) {
            StringBuilder sb5 = new StringBuilder("V");
            int i5 = sUniqueId + 1;
            sUniqueId = i5;
            sb5.append(i5);
            return sb5.toString();
        } else {
            throw new AssertionError(type.name());
        }
    }

    public SolverVariable(Type type, String str) {
        this.id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mType = type;
    }
}
