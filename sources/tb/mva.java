package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mva {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f24330a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};

    static {
        t2o.a(407896112);
    }

    public static byte[] a(String str) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("31493abe", new Object[]{str});
        }
        return b(str.toCharArray());
    }

    public static byte[] b(char[] cArr) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("65e1f9c0", new Object[]{cArr});
        }
        return c(cArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[LOOP:0: B:14:0x0038->B:15:0x003a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] c(char[] r8, boolean r9) throws java.lang.IllegalArgumentException {
        /*
            r0 = 0
            r1 = 1
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.mva.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r9)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r0] = r8
            r9[r1] = r4
            java.lang.String r8 = "5672cc06"
            java.lang.Object r8 = r3.ipc$dispatch(r8, r9)
            byte[] r8 = (byte[]) r8
            return r8
        L_0x001d:
            int r3 = r8.length
            int r4 = r3 + 1
            int r4 = r4 / r2
            byte[] r4 = new byte[r4]
            if (r9 == 0) goto L_0x0033
            int r9 = r3 % 2
            if (r9 == 0) goto L_0x0037
            int r9 = h(r8, r0)
            byte r9 = (byte) r9
            r4[r0] = r9
            r9 = 1
            r0 = 1
            goto L_0x0038
        L_0x0033:
            int r9 = r3 % 2
            if (r9 != 0) goto L_0x0050
        L_0x0037:
            r9 = 0
        L_0x0038:
            if (r0 >= r3) goto L_0x004f
            int r5 = r9 + 1
            int r6 = h(r8, r0)
            int r6 = r6 << 4
            int r7 = r0 + 1
            int r7 = h(r8, r7)
            r6 = r6 | r7
            byte r6 = (byte) r6
            r4[r9] = r6
            int r0 = r0 + r2
            r9 = r5
            goto L_0x0038
        L_0x004f:
            return r4
        L_0x0050:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid input length: "
            r9.<init>(r0)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mva.c(char[], boolean):byte[]");
    }

    public static char[] d(byte[] bArr, int i, int i2, boolean z) {
        char[] cArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("3f12080e", new Object[]{bArr, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        if (z) {
            cArr = b;
        } else {
            cArr = f24330a;
        }
        char[] cArr2 = new char[i2 * 2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = bArr[i + i3];
            int i4 = i3 * 2;
            cArr2[i4] = cArr[(b2 >> 4) & 15];
            cArr2[i4 + 1] = cArr[b2 & 15];
        }
        return cArr2;
    }

    public static char[] e(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("9addb8ae", new Object[]{bArr, new Boolean(z)});
        }
        return d(bArr, 0, bArr.length, z);
    }

    public static String f(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d130f9f0", new Object[]{bArr});
        }
        return g(bArr, true);
    }

    public static String g(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f82c68fc", new Object[]{bArr, new Boolean(z)});
        }
        return new String(e(bArr, z));
    }

    public static int h(char[] cArr, int i) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6b531d5", new Object[]{cArr, new Integer(i)})).intValue();
        }
        char c = cArr[i];
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        if ('a' <= c && c <= 'f') {
            return c - 'W';
        }
        if ('A' <= c && c <= 'F') {
            return c - '7';
        }
        throw new IllegalArgumentException("Illegal char: " + cArr[i] + " at offset " + i);
    }
}
