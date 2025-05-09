package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class syu {
    public static iwu a(int i, int i2) {
        int compare;
        compare = Integer.compare(i2 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            return iwu.Companion.a();
        }
        return new iwu(i, i2 - 1, null);
    }

    public static nwu b(long j, long j2) {
        int compare;
        compare = Long.compare(j2 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            return nwu.Companion.a();
        }
        return new nwu(j, j2 - (1 & tiv.INT_MASK), null);
    }
}
