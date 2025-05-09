package tb;

import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hix {
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final byte[][] EMPTY_BYTES_ARRAY = new byte[0];
    public static final byte[] EMPTY_BYTES = new byte[0];

    public static final int a(ly3 ly3Var, int i) throws IOException {
        int d = ly3Var.d();
        ly3Var.J(i);
        int i2 = 1;
        while (ly3Var.E() == i) {
            ly3Var.J(i);
            i2++;
        }
        ly3Var.I(d);
        return i2;
    }

    public static int b(int i) {
        return i >>> 3;
    }

    public static int c(int i) {
        return i & 7;
    }

    public static int d(int i, int i2) {
        return (i << 3) | i2;
    }

    public static boolean e(ly3 ly3Var, int i) throws IOException {
        return ly3Var.J(i);
    }
}
