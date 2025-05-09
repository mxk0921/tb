package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class esq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final esq INSTANCE = new esq();

    static {
        t2o.a(444596868);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (java.lang.Character.isDigit(r8) == false) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        r5.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r8 != '}') goto L_0x00ab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        r5 = r5.toString();
        tb.ckf.f(r5, "holderIndex.toString()");
        r5 = tb.ssq.m(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
        if (r5 == null) goto L_0x0091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        r5 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
        r5 = (r5 - 1) + r15;
        r7 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (r5 < 0) goto L_0x00a8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r5 >= r14.length) goto L_0x00a8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        r5 = r14[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r5 == null) goto L_0x00a3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
        r4.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        r4.append("${");
        r4.append((java.lang.CharSequence) r5);
        r4.append(r8);
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(java.lang.String r13, java.lang.Object[] r14, int r15) {
        /*
            r0 = 2
            r1 = 0
            r2 = 3
            r3 = 1
            com.android.alibaba.ip.runtime.IpChange r4 = tb.esq.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0020
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r15)
            java.lang.Object[] r15 = new java.lang.Object[r2]
            r15[r1] = r13
            r15[r3] = r14
            r15[r0] = r5
            java.lang.String r13 = "19079032"
            java.lang.Object r13 = r4.ipc$dispatch(r13, r15)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L_0x0020:
            if (r14 == 0) goto L_0x00d5
            int r4 = r14.length
            if (r4 != 0) goto L_0x0027
            goto L_0x00d5
        L_0x0027:
            if (r13 == 0) goto L_0x00d5
            int r4 = r13.length()
            if (r4 != 0) goto L_0x0031
            goto L_0x00d5
        L_0x0031:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x003d:
            int r8 = r13.length()
            if (r6 >= r8) goto L_0x00d1
            char r8 = r13.charAt(r6)
            r9 = 92
            r10 = 36
            if (r8 != r10) goto L_0x006c
            if (r6 == 0) goto L_0x0057
            int r11 = r6 + (-1)
            char r11 = r13.charAt(r11)
            if (r11 == r9) goto L_0x006c
        L_0x0057:
            int r11 = r6 + 3
            int r12 = r13.length()
            if (r11 >= r12) goto L_0x006c
            int r11 = r6 + 1
            char r11 = r13.charAt(r11)
            r12 = 123(0x7b, float:1.72E-43)
            if (r11 != r12) goto L_0x006c
            int r6 = r6 + r0
            r7 = 1
            goto L_0x003d
        L_0x006c:
            if (r7 == 0) goto L_0x00b9
            boolean r9 = java.lang.Character.isDigit(r8)
            if (r9 == 0) goto L_0x0078
            r5.append(r8)
            goto L_0x00b7
        L_0x0078:
            r7 = 125(0x7d, float:1.75E-43)
            if (r8 != r7) goto L_0x00ab
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "holderIndex.toString()"
            tb.ckf.f(r5, r7)
            java.lang.Integer r5 = tb.ssq.m(r5)
            if (r5 == 0) goto L_0x0091
            int r5 = r5.intValue()
            goto L_0x0092
        L_0x0091:
            r5 = 0
        L_0x0092:
            int r5 = r5 - r3
            int r5 = r5 + r15
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            if (r5 < 0) goto L_0x00a8
            int r8 = r14.length
            if (r5 >= r8) goto L_0x00a8
            r5 = r14[r5]
            if (r5 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r5 = ""
        L_0x00a5:
            r4.append(r5)
        L_0x00a8:
            r5 = r7
        L_0x00a9:
            r7 = 0
            goto L_0x00b7
        L_0x00ab:
            java.lang.String r7 = "${"
            r4.append(r7)
            r4.append(r5)
            r4.append(r8)
            goto L_0x00a9
        L_0x00b7:
            int r6 = r6 + r3
            goto L_0x003d
        L_0x00b9:
            if (r8 != r10) goto L_0x00cd
            int r10 = r4.length()
            int r10 = r10 - r3
            char r11 = r4.charAt(r10)
            if (r11 != r9) goto L_0x00cd
            int r9 = r4.length()
            r4.delete(r10, r9)
        L_0x00cd:
            r4.append(r8)
            goto L_0x00b7
        L_0x00d1:
            java.lang.String r13 = r4.toString()
        L_0x00d5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.esq.a(java.lang.String, java.lang.Object[], int):java.lang.String");
    }
}
