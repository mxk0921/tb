package tb;

import kotlin.text.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ssq extends rsq {
    public static Integer m(String str) {
        ckf.g(str, "<this>");
        return n(str, 10);
    }

    public static Integer n(String str, int i) {
        int i2;
        boolean z;
        int i3;
        ckf.g(str, "<this>");
        a.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (ckf.i(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else if (charAt != '-') {
                return null;
            } else {
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int b = a.b(str.charAt(i2), i);
            if (b < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + b) {
                return null;
            }
            i4 = i3 - b;
            i2++;
        }
        if (z) {
            return Integer.valueOf(i4);
        }
        return Integer.valueOf(-i4);
    }

    public static Long o(String str) {
        ckf.g(str, "<this>");
        return p(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Long p(java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            tb.ckf.g(r0, r2)
            kotlin.text.a.a(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            return r3
        L_0x0014:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = tb.ckf.i(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= 0) goto L_0x0038
            r6 = 1
            if (r2 != r6) goto L_0x002a
            return r3
        L_0x002a:
            r9 = 43
            if (r5 == r9) goto L_0x0037
            r4 = 45
            if (r5 == r4) goto L_0x0033
            return r3
        L_0x0033:
            r7 = -9223372036854775808
            r4 = 1
            goto L_0x0039
        L_0x0037:
            r4 = 1
        L_0x0038:
            r6 = 0
        L_0x0039:
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = 0
            r13 = r9
        L_0x0041:
            if (r4 >= r2) goto L_0x0072
            char r5 = r0.charAt(r4)
            int r5 = kotlin.text.a.b(r5, r1)
            if (r5 >= 0) goto L_0x004e
            return r3
        L_0x004e:
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x005e
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x005d
            long r13 = (long) r1
            long r13 = r7 / r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x005e
        L_0x005d:
            return r3
        L_0x005e:
            long r9 = (long) r1
            long r11 = r11 * r9
            long r9 = (long) r5
            long r16 = r7 + r9
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x0069
            return r3
        L_0x0069:
            long r11 = r11 - r9
            int r4 = r4 + 1
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L_0x0041
        L_0x0072:
            if (r6 == 0) goto L_0x0079
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            goto L_0x007e
        L_0x0079:
            long r0 = -r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ssq.p(java.lang.String, int):java.lang.Long");
    }
}
