package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TypedBundle {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INITIAL_BOOLEAN = 4;
    private static final int INITIAL_FLOAT = 10;
    private static final int INITIAL_INT = 10;
    private static final int INITIAL_STRING = 5;
    public int[] mTypeInt = new int[10];
    public int[] mValueInt = new int[10];
    public int mCountInt = 0;
    public int[] mTypeFloat = new int[10];
    public float[] mValueFloat = new float[10];
    public int mCountFloat = 0;
    public int[] mTypeString = new int[5];
    public String[] mValueString = new String[5];
    public int mCountString = 0;
    public int[] mTypeBoolean = new int[4];
    public boolean[] mValueBoolean = new boolean[4];
    public int mCountBoolean = 0;

    public void add(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca79b08", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.mCountInt;
        int[] iArr = this.mTypeInt;
        if (i3 >= iArr.length) {
            this.mTypeInt = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.mValueInt;
            this.mValueInt = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.mTypeInt;
        int i4 = this.mCountInt;
        iArr3[i4] = i;
        int[] iArr4 = this.mValueInt;
        this.mCountInt = 1 + i4;
        iArr4[i4] = i2;
    }

    public void addIfNotNull(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b14f2a", new Object[]{this, new Integer(i), str});
        } else if (str != null) {
            add(i, str);
        }
    }

    public void applyDelta(TypedValues typedValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e3246d", new Object[]{this, typedValues});
            return;
        }
        for (int i = 0; i < this.mCountInt; i++) {
            typedValues.setValue(this.mTypeInt[i], this.mValueInt[i]);
        }
        for (int i2 = 0; i2 < this.mCountFloat; i2++) {
            typedValues.setValue(this.mTypeFloat[i2], this.mValueFloat[i2]);
        }
        for (int i3 = 0; i3 < this.mCountString; i3++) {
            typedValues.setValue(this.mTypeString[i3], this.mValueString[i3]);
        }
        for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
            typedValues.setValue(this.mTypeBoolean[i4], this.mValueBoolean[i4]);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mCountBoolean = 0;
        this.mCountString = 0;
        this.mCountFloat = 0;
        this.mCountInt = 0;
    }

    public int getInteger(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22eda747", new Object[]{this, new Integer(i)})).intValue();
        }
        for (int i2 = 0; i2 < this.mCountInt; i2++) {
            if (this.mTypeInt[i2] == i) {
                return this.mValueInt[i2];
            }
        }
        return -1;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TypedBundle{mCountInt=" + this.mCountInt + ", mCountFloat=" + this.mCountFloat + ", mCountString=" + this.mCountString + ", mCountBoolean=" + this.mCountBoolean + '}';
    }

    public void add(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca78fc5", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        int i2 = this.mCountFloat;
        int[] iArr = this.mTypeFloat;
        if (i2 >= iArr.length) {
            this.mTypeFloat = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValueFloat;
            this.mValueFloat = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTypeFloat;
        int i3 = this.mCountFloat;
        iArr2[i3] = i;
        float[] fArr2 = this.mValueFloat;
        this.mCountFloat = 1 + i3;
        fArr2[i3] = f;
    }

    public void applyDelta(TypedBundle typedBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd48550d", new Object[]{this, typedBundle});
            return;
        }
        for (int i = 0; i < this.mCountInt; i++) {
            typedBundle.add(this.mTypeInt[i], this.mValueInt[i]);
        }
        for (int i2 = 0; i2 < this.mCountFloat; i2++) {
            typedBundle.add(this.mTypeFloat[i2], this.mValueFloat[i2]);
        }
        for (int i3 = 0; i3 < this.mCountString; i3++) {
            typedBundle.add(this.mTypeString[i3], this.mValueString[i3]);
        }
        for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
            typedBundle.add(this.mTypeBoolean[i4], this.mValueBoolean[i4]);
        }
    }

    public void add(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2c6c65", new Object[]{this, new Integer(i), str});
            return;
        }
        int i2 = this.mCountString;
        int[] iArr = this.mTypeString;
        if (i2 >= iArr.length) {
            this.mTypeString = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.mValueString;
            this.mValueString = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.mTypeString;
        int i3 = this.mCountString;
        iArr2[i3] = i;
        String[] strArr2 = this.mValueString;
        this.mCountString = 1 + i3;
        strArr2[i3] = str;
    }

    public void add(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca7dad9", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.mCountBoolean;
        int[] iArr = this.mTypeBoolean;
        if (i2 >= iArr.length) {
            this.mTypeBoolean = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.mValueBoolean;
            this.mValueBoolean = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.mTypeBoolean;
        int i3 = this.mCountBoolean;
        iArr2[i3] = i;
        boolean[] zArr2 = this.mValueBoolean;
        this.mCountBoolean = 1 + i3;
        zArr2[i3] = z;
    }
}
