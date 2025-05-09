package androidx.constraintlayout.solver;

import androidx.exifinterface.media.ExifInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SolverVariable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean INTERNAL_DEBUG = false;
    public static final int MAX_STRENGTH = 7;
    public static final int STRENGTH_BARRIER = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 6;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    public int definitionId;
    public int id;
    public ArrayRow[] mClientEquations;
    public int mClientEquationsCount;
    private String mName;
    public Type mType;
    public int strength;
    public float[] strengthVector;
    public int usageInRowCount;

    /* compiled from: Taobao */
    /* renamed from: androidx.constraintlayout.solver.SolverVariable$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = iArr;
            try {
                iArr[Type.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[Type.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[Type.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[Type.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/solver/SolverVariable$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("39c1c8d7", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }
    }

    public SolverVariable(String str, Type type) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[7];
        this.mClientEquations = new ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mName = str;
        this.mType = type;
    }

    public static void increaseErrorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e6b0a8", new Object[0]);
        } else {
            uniqueErrorId++;
        }
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c931cc1", new Object[]{this, arrayRow});
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
        for (int i = 0; i < 7; i++) {
            this.strengthVector[i] = 0.0f;
        }
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r0 >= ((r2 - r3) - 1)) goto L_0x0031;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        r7 = r6.mClientEquations;
        r4 = r3 + r0;
        r7[r4] = r7[r4 + 1];
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        r6.mClientEquationsCount--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void removeFromRow(androidx.constraintlayout.solver.ArrayRow r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.constraintlayout.solver.SolverVariable.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "4b3aa793"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r6
            r4[r1] = r7
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            int r2 = r6.mClientEquationsCount
            r3 = 0
        L_0x0018:
            if (r3 >= r2) goto L_0x0039
            androidx.constraintlayout.solver.ArrayRow[] r4 = r6.mClientEquations
            r4 = r4[r3]
            if (r4 != r7) goto L_0x0037
        L_0x0020:
            int r7 = r2 - r3
            int r7 = r7 - r1
            if (r0 >= r7) goto L_0x0031
            androidx.constraintlayout.solver.ArrayRow[] r7 = r6.mClientEquations
            int r4 = r3 + r0
            int r5 = r4 + 1
            r5 = r7[r5]
            r7[r4] = r5
            int r0 = r0 + r1
            goto L_0x0020
        L_0x0031:
            int r7 = r6.mClientEquationsCount
            int r7 = r7 - r1
            r6.mClientEquationsCount = r7
            return
        L_0x0037:
            int r3 = r3 + r1
            goto L_0x0018
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.SolverVariable.removeFromRow(androidx.constraintlayout.solver.ArrayRow):void");
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
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.mName = str;
        }
    }

    public void setType(Type type, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79a7f27", new Object[]{this, type, str});
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
        for (int i = 0; i < this.strengthVector.length; i++) {
            String str2 = str + this.strengthVector[i];
            float[] fArr = this.strengthVector;
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
        return "" + this.mName;
    }

    public final void updateReferencesWithNewDefinition(ArrayRow arrayRow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158a683", new Object[]{this, arrayRow});
            return;
        }
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayRow arrayRow2 = this.mClientEquations[i2];
            arrayRow2.variables.updateFromRow(arrayRow2, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    private static String getUniqueName(Type type, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f30168e3", new Object[]{type, str});
        }
        if (str != null) {
            return str + uniqueErrorId;
        }
        int i = AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[type.ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder("U");
            int i2 = uniqueUnrestrictedId + 1;
            uniqueUnrestrictedId = i2;
            sb.append(i2);
            return sb.toString();
        } else if (i == 2) {
            StringBuilder sb2 = new StringBuilder("C");
            int i3 = uniqueConstantId + 1;
            uniqueConstantId = i3;
            sb2.append(i3);
            return sb2.toString();
        } else if (i == 3) {
            StringBuilder sb3 = new StringBuilder(ExifInterface.LATITUDE_SOUTH);
            int i4 = uniqueSlackId + 1;
            uniqueSlackId = i4;
            sb3.append(i4);
            return sb3.toString();
        } else if (i == 4) {
            StringBuilder sb4 = new StringBuilder("e");
            int i5 = uniqueErrorId + 1;
            uniqueErrorId = i5;
            sb4.append(i5);
            return sb4.toString();
        } else if (i == 5) {
            StringBuilder sb5 = new StringBuilder("V");
            int i6 = uniqueId + 1;
            uniqueId = i6;
            sb5.append(i6);
            return sb5.toString();
        } else {
            throw new AssertionError(type.name());
        }
    }

    public SolverVariable(Type type, String str) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[7];
        this.mClientEquations = new ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mType = type;
    }
}
