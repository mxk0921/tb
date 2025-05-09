package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class yux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f32369a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, c0z.MAP32, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r8 == (-1)) goto L_0x00a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        r2.append((char) (((r6 & 15) << 4) | ((r8 & 60) >>> 2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        r6 = r0 + 1;
        r0 = r11[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r0 != 61) goto L_0x008a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        return r2.toString().getBytes("iso8859-1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
        r0 = r5[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (r6 >= r3) goto L_0x0093;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (r0 == (-1)) goto L_0x0091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (r0 == (-1)) goto L_0x00a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
        r2.append((char) (r0 | ((r8 & 3) << 6)));
        r0 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.lang.String r11) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.yux.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "81233aeb"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            java.lang.Object r11 = r2.ipc$dispatch(r3, r1)
            byte[] r11 = (byte[]) r11
            return r11
        L_0x0015:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "US-ASCII"
            byte[] r11 = r11.getBytes(r3)
            int r3 = r11.length
        L_0x0021:
            java.lang.String r4 = "iso8859-1"
            if (r0 >= r3) goto L_0x00a0
        L_0x0026:
            byte[] r5 = tb.yux.f32369a
            int r6 = r0 + 1
            r0 = r11[r0]
            r0 = r5[r0]
            r7 = -1
            if (r6 >= r3) goto L_0x0036
            if (r0 == r7) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r0 = r6
            goto L_0x0026
        L_0x0036:
            if (r0 == r7) goto L_0x00a0
        L_0x0038:
            int r8 = r6 + 1
            r6 = r11[r6]
            r6 = r5[r6]
            if (r8 >= r3) goto L_0x0045
            if (r6 == r7) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r6 = r8
            goto L_0x0038
        L_0x0045:
            if (r6 == r7) goto L_0x00a0
            int r0 = r0 << 2
            r9 = r6 & 48
            int r9 = r9 >>> 4
            r0 = r0 | r9
            char r0 = (char) r0
            r2.append(r0)
        L_0x0052:
            int r0 = r8 + 1
            r8 = r11[r8]
            r9 = 61
            if (r8 != r9) goto L_0x0063
            java.lang.String r11 = r2.toString()
            byte[] r11 = r11.getBytes(r4)
            return r11
        L_0x0063:
            r8 = r5[r8]
            if (r0 >= r3) goto L_0x006c
            if (r8 == r7) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r8 = r0
            goto L_0x0052
        L_0x006c:
            if (r8 == r7) goto L_0x00a0
            r6 = r6 & 15
            int r6 = r6 << 4
            r10 = r8 & 60
            int r10 = r10 >>> 2
            r6 = r6 | r10
            char r6 = (char) r6
            r2.append(r6)
        L_0x007b:
            int r6 = r0 + 1
            r0 = r11[r0]
            if (r0 != r9) goto L_0x008a
            java.lang.String r11 = r2.toString()
            byte[] r11 = r11.getBytes(r4)
            return r11
        L_0x008a:
            r0 = r5[r0]
            if (r6 >= r3) goto L_0x0093
            if (r0 == r7) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r0 = r6
            goto L_0x007b
        L_0x0093:
            if (r0 == r7) goto L_0x00a0
            r4 = r8 & 3
            int r4 = r4 << 6
            r0 = r0 | r4
            char r0 = (char) r0
            r2.append(r0)
            r0 = r6
            goto L_0x0021
        L_0x00a0:
            java.lang.String r11 = r2.toString()
            byte[] r11 = r11.getBytes(r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yux.a(java.lang.String):byte[]");
    }
}
