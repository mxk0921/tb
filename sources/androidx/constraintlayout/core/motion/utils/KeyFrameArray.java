package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyFrameArray {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CustomArray {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int EMPTY = 999;
        public int mCount;
        public int[] mKeys = new int[101];
        public CustomAttribute[] mValues = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i, CustomAttribute customAttribute) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fab87f", new Object[]{this, new Integer(i), customAttribute});
                return;
            }
            if (this.mValues[i] != null) {
                remove(i);
            }
            this.mValues[i] = customAttribute;
            int[] iArr = this.mKeys;
            int i2 = this.mCount;
            this.mCount = 1 + i2;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("816ea47b", new Object[]{this});
                return;
            }
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            printStream.print("K: [");
            for (int i = 0; i < this.mCount; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea22fb9d", new Object[]{this, new Integer(i)})).intValue();
            }
            return this.mKeys[i];
        }

        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return this.mCount;
        }

        public CustomAttribute valueAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CustomAttribute) ipChange.ipc$dispatch("43c04649", new Object[]{this, new Integer(i)});
            }
            return this.mValues[this.mKeys[i]];
        }

        public void remove(int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
                return;
            }
            this.mValues[i] = null;
            int i3 = 0;
            while (true) {
                int i4 = this.mCount;
                if (i2 < i4) {
                    int[] iArr = this.mKeys;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.mCount = i4 - 1;
                    return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CustomVar {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int EMPTY = 999;
        public int mCount;
        public int[] mKeys = new int[101];
        public CustomVariable[] mValues = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i, CustomVariable customVariable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e4cd299", new Object[]{this, new Integer(i), customVariable});
                return;
            }
            if (this.mValues[i] != null) {
                remove(i);
            }
            this.mValues[i] = customVariable;
            int[] iArr = this.mKeys;
            int i2 = this.mCount;
            this.mCount = 1 + i2;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("816ea47b", new Object[]{this});
                return;
            }
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            printStream.print("K: [");
            for (int i = 0; i < this.mCount; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea22fb9d", new Object[]{this, new Integer(i)})).intValue();
            }
            return this.mKeys[i];
        }

        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return this.mCount;
        }

        public CustomVariable valueAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CustomVariable) ipChange.ipc$dispatch("1d8592d5", new Object[]{this, new Integer(i)});
            }
            return this.mValues[this.mKeys[i]];
        }

        public void remove(int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
                return;
            }
            this.mValues[i] = null;
            int i3 = 0;
            while (true) {
                int i4 = this.mCount;
                if (i2 < i4) {
                    int[] iArr = this.mKeys;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.mCount = i4 - 1;
                    return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FloatArray {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int EMPTY = 999;
        public int mCount;
        public int[] mKeys = new int[101];
        public float[][] mValues = new float[101];

        public FloatArray() {
            clear();
        }

        public void append(int i, float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55927bcd", new Object[]{this, new Integer(i), fArr});
                return;
            }
            if (this.mValues[i] != null) {
                remove(i);
            }
            this.mValues[i] = fArr;
            int[] iArr = this.mKeys;
            int i2 = this.mCount;
            this.mCount = 1 + i2;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("816ea47b", new Object[]{this});
                return;
            }
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            printStream.print("K: [");
            for (int i = 0; i < this.mCount; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(Arrays.toString(valueAt(i)));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea22fb9d", new Object[]{this, new Integer(i)})).intValue();
            }
            return this.mKeys[i];
        }

        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return this.mCount;
        }

        public float[] valueAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("79143b89", new Object[]{this, new Integer(i)});
            }
            return this.mValues[this.mKeys[i]];
        }

        public void remove(int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
                return;
            }
            this.mValues[i] = null;
            int i3 = 0;
            while (true) {
                int i4 = this.mCount;
                if (i2 < i4) {
                    int[] iArr = this.mKeys;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.mCount = i4 - 1;
                    return;
                }
            }
        }
    }
}
