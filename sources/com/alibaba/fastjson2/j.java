package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.util.DateUtils;
import java.nio.charset.StandardCharsets;
import tb.c0z;
import tb.ls9;
import tb.opf;
import tb.p7h;
import tb.q7h;
import tb.tck;
import tb.tiv;
import tb.wqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j extends JSONReader {
    public final int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public char[] G;
    public final JSONFactory.CacheItem H;
    public final byte[] x;
    public final int y;
    public final int z;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[LOOP:0: B:7:0x002b->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024 A[EDGE_INSN: B:22:0x0024->B:5:0x0024 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:5:0x0024). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(com.alibaba.fastjson2.JSONReader.c r6, java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            r5 = this;
            r7 = 0
            r5.<init>(r6, r7)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            int r6 = java.lang.System.identityHashCode(r6)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r7 = com.alibaba.fastjson2.JSONFactory.q
            int r0 = r7.length
            int r0 = r0 + (-1)
            r6 = r6 & r0
            r6 = r7[r6]
            r5.H = r6
            r5.x = r8
            r5.y = r10
            r5.z = r9
            int r10 = r10 + r9
            r5.A = r10
            r6 = 26
            if (r9 < r10) goto L_0x0027
            r7 = r9
        L_0x0024:
            r9 = 26
            goto L_0x002b
        L_0x0027:
            int r7 = r9 + 1
            r9 = r8[r9]
        L_0x002b:
            if (r9 == 0) goto L_0x0054
            r10 = 32
            if (r9 > r10) goto L_0x0041
            r0 = 1
            long r0 = r0 << r9
            r2 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r0 = r0 & r2
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x0041
            goto L_0x0054
        L_0x0041:
            if (r9 >= 0) goto L_0x0047
            r5.t1()
            return
        L_0x0047:
            r5.c = r7
            char r6 = (char) r9
            r5.d = r6
            r6 = 47
            if (r9 != r6) goto L_0x0053
            r5.a3()
        L_0x0053:
            return
        L_0x0054:
            int r9 = r5.A
            if (r7 != r9) goto L_0x0059
            goto L_0x0024
        L_0x0059:
            int r9 = r7 + 1
            r7 = r8[r7]
            r4 = r9
            r9 = r7
            r7 = r4
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.<init>(com.alibaba.fastjson2.JSONReader$c, java.lang.String, byte[], int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:20:0x0033). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0046 -> B:17:0x002b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A1(char r7, char r8, char r9, char r10, char r11) {
        /*
            r6 = this;
            char r0 = r6.d
            r1 = 0
            if (r0 == r7) goto L_0x0006
            return r1
        L_0x0006:
            int r7 = r6.c
            int r0 = r7 + 4
            int r2 = r6.A
            if (r0 > r2) goto L_0x0076
            byte[] r3 = r6.x
            r4 = r3[r7]
            if (r4 != r8) goto L_0x0076
            int r8 = r7 + 1
            r8 = r3[r8]
            if (r8 != r9) goto L_0x0076
            int r8 = r7 + 2
            r8 = r3[r8]
            if (r8 != r10) goto L_0x0076
            int r8 = r7 + 3
            r8 = r3[r8]
            if (r8 == r11) goto L_0x0027
            goto L_0x0076
        L_0x0027:
            r8 = 26
            if (r0 != r2) goto L_0x002e
        L_0x002b:
            r9 = 26
            goto L_0x0033
        L_0x002e:
            int r7 = r7 + 5
            r9 = r3[r0]
        L_0x0032:
            r0 = r7
        L_0x0033:
            r7 = 32
            if (r9 > r7) goto L_0x004e
            r10 = 1
            long r10 = r10 << r9
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r10 = r10 & r4
            r4 = 0
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x004e
            if (r0 != r2) goto L_0x0049
            goto L_0x002b
        L_0x0049:
            int r7 = r0 + 1
            r9 = r3[r0]
            goto L_0x0032
        L_0x004e:
            int r7 = r6.c
            int r7 = r7 + 5
            if (r0 != r7) goto L_0x006f
            if (r9 == r8) goto L_0x006f
            r7 = 40
            if (r9 == r7) goto L_0x006f
            r7 = 91
            if (r9 == r7) goto L_0x006f
            r7 = 93
            if (r9 == r7) goto L_0x006f
            r7 = 41
            if (r9 == r7) goto L_0x006f
            r7 = 58
            if (r9 == r7) goto L_0x006f
            r7 = 44
            if (r9 == r7) goto L_0x006f
            return r1
        L_0x006f:
            r6.c = r0
            char r7 = (char) r9
            r6.d = r7
            r7 = 1
            return r7
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.A1(char, char, char, char, char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h A2() {
        boolean z;
        if (l1()) {
            q7h J = DateUtils.J(this.x, this.c);
            if (J == null) {
                return null;
            }
            this.c += 17;
            t1();
            if (this.d == ',') {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return J;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h B2() {
        boolean z;
        if (l1()) {
            q7h L = DateUtils.L(this.x, this.c);
            if (L == null) {
                return null;
            }
            this.c += 18;
            t1();
            if (this.d == ',') {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return L;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean C1() {
        if (this.d != 'n') {
            return false;
        }
        int i = this.c;
        if (i + 2 >= this.A || this.x[i] != 117) {
            return false;
        }
        I2();
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h C2() {
        boolean z;
        if (l1()) {
            q7h N = DateUtils.N(this.x, this.c);
            this.c += 19;
            t1();
            if (this.d == ',') {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return N;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
        s3(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[LOOP:0: B:26:0x0044->B:32:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0072 A[LOOP:1: B:42:0x007e->B:54:0x0072, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x005a -> B:24:0x003d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0079 -> B:42:0x007e). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D1() {
        /*
            r19 = this;
            r0 = r19
            char r1 = r0.d
            int r2 = r0.c
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            r5 = 1
            int r6 = r0.A
            byte[] r7 = r0.x
            if (r1 != r3) goto L_0x0029
            int r3 = r2 + 2
            if (r3 >= r6) goto L_0x0029
            r8 = r7[r2]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L_0x0029
            int r8 = r2 + 1
            r8 = r7[r8]
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 != r9) goto L_0x0029
            r3 = r7[r3]
            if (r3 != r9) goto L_0x0029
            int r2 = r2 + 3
            goto L_0x0038
        L_0x0029:
            r3 = 34
            if (r1 == r3) goto L_0x0031
            r3 = 39
            if (r1 != r3) goto L_0x009d
        L_0x0031:
            if (r2 >= r6) goto L_0x009d
            r3 = r7[r2]
            if (r3 != r1) goto L_0x009d
            int r2 = r2 + r5
        L_0x0038:
            r1 = 26
            if (r2 != r6) goto L_0x0040
            r3 = r2
        L_0x003d:
            r2 = 26
            goto L_0x0044
        L_0x0040:
            int r3 = r2 + 1
            r2 = r7[r2]
        L_0x0044:
            r8 = 0
            r10 = 4294981376(0x100003700, double:2.1220027474E-314)
            r12 = 1
            r14 = 32
            if (r2 < 0) goto L_0x0067
            if (r2 > r14) goto L_0x0067
            long r15 = r12 << r2
            long r15 = r15 & r10
            int r17 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r17 == 0) goto L_0x0067
            if (r3 != r6) goto L_0x005d
            goto L_0x003d
        L_0x005d:
            int r2 = r3 + 1
            r3 = r7[r3]
            r18 = r3
            r3 = r2
            r2 = r18
            goto L_0x0044
        L_0x0067:
            r15 = 44
            if (r2 != r15) goto L_0x006c
            r4 = 1
        L_0x006c:
            r0.e = r4
            if (r4 == 0) goto L_0x007e
            if (r3 != r6) goto L_0x0075
        L_0x0072:
            r2 = 26
            goto L_0x007e
        L_0x0075:
            int r2 = r3 + 1
            r3 = r7[r3]
        L_0x0079:
            r18 = r3
            r3 = r2
            r2 = r18
        L_0x007e:
            if (r2 < 0) goto L_0x0091
            if (r2 > r14) goto L_0x0091
            long r15 = r12 << r2
            long r15 = r15 & r10
            int r4 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0091
            if (r3 != r6) goto L_0x008c
            goto L_0x0072
        L_0x008c:
            int r2 = r3 + 1
            r3 = r7[r3]
            goto L_0x0079
        L_0x0091:
            if (r2 >= 0) goto L_0x0097
            r0.s3(r2, r3)
            return r5
        L_0x0097:
            r0.c = r3
            char r1 = (char) r2
            r0.d = r1
            return r5
        L_0x009d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.D1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h D2() {
        boolean z;
        if (l1()) {
            q7h P = DateUtils.P(this.x, this.c);
            if (P == null) {
                return null;
            }
            this.c += 20;
            t1();
            if (this.d == ',') {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return P;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[LOOP:0: B:10:0x001c->B:37:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0015 A[EDGE_INSN: B:39:0x0015->B:8:0x0015 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0071 -> B:9:0x0015). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean E1() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.d
            int r2 = r0.c
            r3 = 125(0x7d, float:1.75E-43)
            if (r1 == r3) goto L_0x000c
            r1 = 0
            return r1
        L_0x000c:
            r1 = 26
            int r3 = r0.A
            byte[] r4 = r0.x
            if (r2 != r3) goto L_0x0018
            r5 = r2
        L_0x0015:
            r2 = 26
            goto L_0x001c
        L_0x0018:
            int r5 = r2 + 1
            r2 = r4[r2]
        L_0x001c:
            if (r2 == 0) goto L_0x0071
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r2 > r12) goto L_0x0033
            long r13 = r10 << r2
            long r13 = r13 & r8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0033
            goto L_0x0071
        L_0x0033:
            r13 = 44
            r14 = 1
            if (r2 != r13) goto L_0x005e
            r0.e = r14
            if (r5 != r3) goto L_0x0040
            r2 = r5
            r5 = 26
            goto L_0x0044
        L_0x0040:
            int r2 = r5 + 1
            r5 = r4[r5]
        L_0x0044:
            r17 = r5
            r5 = r2
            r2 = r17
        L_0x0049:
            if (r2 == 0) goto L_0x0054
            if (r2 > r12) goto L_0x005e
            long r15 = r10 << r2
            long r15 = r15 & r8
            int r13 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x005e
        L_0x0054:
            if (r5 != r3) goto L_0x0059
            r2 = 26
            goto L_0x0049
        L_0x0059:
            int r2 = r5 + 1
            r5 = r4[r5]
            goto L_0x0044
        L_0x005e:
            if (r2 >= 0) goto L_0x0064
            r0.s3(r2, r5)
            return r14
        L_0x0064:
            char r1 = (char) r2
            r0.d = r1
            r0.c = r5
            r1 = 47
            if (r2 != r1) goto L_0x0070
            r18.a3()
        L_0x0070:
            return r14
        L_0x0071:
            if (r5 != r3) goto L_0x0074
            goto L_0x0015
        L_0x0074:
            int r2 = r5 + 1
            r5 = r4[r5]
            r17 = r5
            r5 = r2
            r2 = r17
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.E1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h E2() {
        boolean z;
        if (l1()) {
            q7h R = DateUtils.R(this.x, this.c);
            if (R == null) {
                return null;
            }
            this.c += 21;
            t1();
            if (this.d == ',') {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return R;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[LOOP:0: B:10:0x001a->B:24:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0013 A[EDGE_INSN: B:25:0x0013->B:8:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0044 -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean F1() {
        /*
            r11 = this;
            char r0 = r11.d
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            int r0 = r11.c
            r1 = 26
            int r2 = r11.A
            byte[] r3 = r11.x
            if (r0 != r2) goto L_0x0016
            r4 = r0
        L_0x0013:
            r0 = 26
            goto L_0x001a
        L_0x0016:
            int r4 = r0 + 1
            r0 = r3[r0]
        L_0x001a:
            if (r0 == 0) goto L_0x0044
            r5 = 32
            if (r0 > r5) goto L_0x0030
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0030
            goto L_0x0044
        L_0x0030:
            r1 = 1
            if (r0 >= 0) goto L_0x0037
            r11.s3(r0, r4)
            return r1
        L_0x0037:
            char r2 = (char) r0
            r11.d = r2
            r11.c = r4
            r2 = 47
            if (r0 != r2) goto L_0x0043
            r11.a3()
        L_0x0043:
            return r1
        L_0x0044:
            if (r4 != r2) goto L_0x0047
            goto L_0x0013
        L_0x0047:
            int r0 = r4 + 1
            r4 = r3[r4]
            r10 = r4
            r4 = r0
            r0 = r10
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.F1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h F2(int i) {
        if (l1()) {
            q7h b0 = DateUtils.b0(this.x, this.c, i);
            if (b0 == null) {
                return null;
            }
            boolean z = true;
            this.c += i + 1;
            t1();
            if (this.d != ',') {
                z = false;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return b0;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[LOOP:0: B:15:0x002a->B:20:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:13:0x0023). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G1() {
        /*
            r11 = this;
            int r0 = r11.c
            char r1 = r11.d
            r2 = 83
            if (r1 != r2) goto L_0x004f
            int r1 = r0 + 1
            int r2 = r11.A
            if (r1 >= r2) goto L_0x004f
            byte[] r3 = r11.x
            r4 = r3[r0]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L_0x004f
            r1 = r3[r1]
            r4 = 116(0x74, float:1.63E-43)
            if (r1 != r4) goto L_0x004f
            int r1 = r0 + 2
            r4 = 26
            if (r1 != r2) goto L_0x0026
            r0 = r1
        L_0x0023:
            r1 = 26
            goto L_0x002a
        L_0x0026:
            int r0 = r0 + 3
            r1 = r3[r1]
        L_0x002a:
            r5 = 32
            if (r1 > r5) goto L_0x0048
            r5 = 1
            long r5 = r5 << r1
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0048
            if (r0 != r2) goto L_0x0040
            goto L_0x0023
        L_0x0040:
            int r1 = r0 + 1
            r0 = r3[r0]
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x002a
        L_0x0048:
            r11.c = r0
            char r0 = (char) r1
            r11.d = r0
            r0 = 1
            return r0
        L_0x004f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.G1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long G2() {
        char c = this.d;
        if (c == '\"' || c == '\'') {
            int i = this.c;
            boolean z = true;
            if (i + 18 >= this.A) {
                this.h = true;
                return 0L;
            }
            wqx wqxVar = this.f2453a.b;
            byte[] bArr = this.x;
            long k0 = DateUtils.k0(bArr, i, wqxVar);
            int i2 = this.c;
            if (bArr[i2 + 19] == c) {
                this.c = i2 + 20;
                t1();
                if (this.d != ',') {
                    z = false;
                }
                this.e = z;
                if (z) {
                    t1();
                }
                return k0;
            }
            throw new JSONException(a1("illegal date input"));
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[LOOP:0: B:13:0x002a->B:18:0x0041, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:11:0x0023). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I2() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.c
            byte[] r2 = r0.x
            r3 = r2[r1]
            r4 = 117(0x75, float:1.64E-43)
            if (r3 != r4) goto L_0x007e
            int r3 = r1 + 1
            r3 = r2[r3]
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 != r4) goto L_0x007e
            int r3 = r1 + 2
            r3 = r2[r3]
            if (r3 != r4) goto L_0x007e
            int r3 = r1 + 3
            r4 = 26
            int r5 = r0.A
            if (r3 != r5) goto L_0x0026
            r1 = r3
        L_0x0023:
            r3 = 26
            goto L_0x002a
        L_0x0026:
            int r1 = r1 + 4
            r3 = r2[r3]
        L_0x002a:
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r3 > r12) goto L_0x004b
            long r13 = r10 << r3
            long r13 = r13 & r8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            if (r1 < r5) goto L_0x0041
            goto L_0x0023
        L_0x0041:
            int r3 = r1 + 1
            r1 = r2[r1]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L_0x002a
        L_0x004b:
            r13 = 44
            if (r3 != r13) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            r0.e = r13
            if (r13 == 0) goto L_0x0078
            if (r1 < r5) goto L_0x005c
            r3 = r1
            r1 = 26
            goto L_0x0060
        L_0x005c:
            int r3 = r1 + 1
            r1 = r2[r1]
        L_0x0060:
            r16 = r3
            r3 = r1
            r1 = r16
        L_0x0065:
            if (r3 > r12) goto L_0x0078
            long r13 = r10 << r3
            long r13 = r13 & r8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0078
            if (r1 < r5) goto L_0x0073
            r3 = 26
            goto L_0x0065
        L_0x0073:
            int r3 = r1 + 1
            r1 = r2[r1]
            goto L_0x0060
        L_0x0078:
            char r2 = (char) r3
            r0.d = r2
            r0.c = r1
            return
        L_0x007e:
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "json syntax error, not match null"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.I2():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[LOOP:0: B:25:0x0050->B:29:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[LOOP:1: B:44:0x008e->B:48:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0059 -> B:23:0x004b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0098 -> B:42:0x0089). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date J2() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.J2():java.util.Date");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String L0() {
        int i;
        int i2 = this.C;
        int i3 = this.B;
        int i4 = i2 - i3;
        boolean z = this.f;
        byte[] bArr = this.x;
        if (z) {
            char[] cArr = this.G;
            if (cArr == null) {
                cArr = JSONFactory.r.getAndSet(this.H, null);
                this.G = cArr;
            }
            if (cArr == null || cArr.length < i4) {
                cArr = new char[this.D];
                this.G = cArr;
            }
            int i5 = this.B;
            int i6 = 0;
            while (i5 < this.C) {
                char c = bArr[i5];
                if (c < 0) {
                    switch ((c & 255) >> 4) {
                        case 12:
                        case 13:
                            byte b = bArr[i5 + 1];
                            if ((b & 192) == 128) {
                                i = ((c & 31) << 6) | (b & 63);
                                i5 += 2;
                                break;
                            } else {
                                throw new JSONException("malformed input around byte " + i5);
                            }
                        case 14:
                            byte b2 = bArr[i5 + 1];
                            int i7 = i5 + 2;
                            byte b3 = bArr[i7];
                            if ((b2 & 192) == 128 && (b3 & 192) == 128) {
                                i = ((c & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63);
                                i5 += 3;
                                break;
                            } else {
                                throw new JSONException("malformed input around byte " + i7);
                            }
                        default:
                            throw new JSONException("malformed input around byte " + i5);
                    }
                    cArr[i6] = (char) i;
                } else {
                    if (c == 92) {
                        int i8 = i5 + 1;
                        char c2 = (char) bArr[i8];
                        if (!(c2 == '\"' || c2 == ':' || c2 == '@' || c2 == '\\')) {
                            if (c2 == 'u') {
                                i5 += 5;
                                c = JSONReader.Z(bArr[i5 + 2], bArr[i5 + 3], bArr[i5 + 4], bArr[i5]);
                            } else if (c2 != 'x') {
                                if (!(c2 == '*' || c2 == '+')) {
                                    switch (c2) {
                                        default:
                                            switch (c2) {
                                                case '<':
                                                case '=':
                                                case '>':
                                                    break;
                                                default:
                                                    c = F(c2);
                                                    i5 = i8;
                                                    break;
                                            }
                                        case '-':
                                        case '.':
                                        case '/':
                                            i5 = i8;
                                            c = c2;
                                            break;
                                    }
                                }
                            } else {
                                i5 += 3;
                                c = JSONReader.L(bArr[i5 + 2], bArr[i5]);
                            }
                        }
                        i5 = i8;
                        c = c2;
                    } else if (c == 34) {
                        return new String(cArr, 0, this.D);
                    }
                    cArr[i6] = (char) c;
                    i5++;
                }
                i6++;
            }
            return new String(cArr, 0, this.D);
        } else if (this.E) {
            return t3(i3, i4);
        } else {
            return new String(bArr, i3, i4, StandardCharsets.UTF_8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[LOOP:1: B:19:0x0050->B:23:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:18:0x0049). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String P2() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.F
            int r2 = r0.A
            if (r1 != r2) goto L_0x000a
            r1 = 0
            return r1
        L_0x000a:
            int r3 = r1 + 1
            r0.c = r3
            byte[] r3 = r0.x
            r1 = r3[r1]
            char r1 = (char) r1
            r0.d = r1
            java.lang.String r1 = r18.Q2()
            char r4 = r0.d
            int r5 = r0.c
        L_0x001d:
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            r13 = 26
            if (r4 > r12) goto L_0x0042
            long r14 = r10 << r4
            long r14 = r14 & r8
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x0042
            if (r5 != r2) goto L_0x0038
            r4 = 26
            goto L_0x001d
        L_0x0038:
            int r4 = r5 + 1
            r5 = r3[r5]
            r17 = r5
            r5 = r4
            r4 = r17
            goto L_0x001d
        L_0x0042:
            r14 = 125(0x7d, float:1.75E-43)
            if (r4 != r14) goto L_0x0099
            if (r5 != r2) goto L_0x004c
            r4 = r5
        L_0x0049:
            r5 = 26
            goto L_0x0050
        L_0x004c:
            int r4 = r5 + 1
            r5 = r3[r5]
        L_0x0050:
            if (r5 > r12) goto L_0x0066
            long r14 = r10 << r5
            long r14 = r14 & r8
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x0066
            if (r4 != r2) goto L_0x005c
            goto L_0x0049
        L_0x005c:
            int r5 = r4 + 1
            r4 = r3[r4]
            r17 = r5
            r5 = r4
            r4 = r17
            goto L_0x0050
        L_0x0066:
            r14 = 44
            if (r5 != r14) goto L_0x006c
            r14 = 1
            goto L_0x006d
        L_0x006c:
            r14 = 0
        L_0x006d:
            r0.e = r14
            if (r14 == 0) goto L_0x0093
            if (r4 != r2) goto L_0x0077
            r5 = r4
            r4 = 26
            goto L_0x007b
        L_0x0077:
            int r5 = r4 + 1
            r4 = r3[r4]
        L_0x007b:
            r17 = r5
            r5 = r4
            r4 = r17
        L_0x0080:
            if (r5 > r12) goto L_0x0093
            long r14 = r10 << r5
            long r14 = r14 & r8
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x0093
            if (r4 != r2) goto L_0x008e
            r5 = 26
            goto L_0x0080
        L_0x008e:
            int r5 = r4 + 1
            r4 = r3[r4]
            goto L_0x007b
        L_0x0093:
            char r2 = (char) r5
            r0.d = r2
            r0.c = r4
            return r1
        L_0x0099:
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "illegal reference : "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.P2():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bf A[LOOP:4: B:109:0x01b4->B:113:0x01bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0196 A[LOOP:3: B:94:0x0180->B:99:0x0196, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01c6 -> B:108:0x01b3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0193 -> B:92:0x0179). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String Q2() {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.Q2():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r6);
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String U0() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.U0():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int V0() {
        int i;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            int i2 = this.c;
            int i3 = i2 + 8;
            int i4 = this.A;
            byte[] bArr = this.x;
            if (i3 >= i4 || i3 >= bArr.length || bArr[i2] == c || bArr[i2 + 1] == c || bArr[i2 + 2] == c || bArr[i2 + 3] == c || bArr[i2 + 4] == c || bArr[i2 + 5] == c || bArr[i2 + 6] == c || bArr[i2 + 7] == c) {
                i = 0;
            } else {
                i2 = i3;
                i = 8;
            }
            while (i2 < i4 && bArr[i2] != c) {
                i2++;
                i++;
            }
            return i;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.xqx X2(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.l1()
            if (r0 == 0) goto L_0x0093
            r0 = 19
            r1 = 0
            if (r6 >= r0) goto L_0x000c
            return r1
        L_0x000c:
            r0 = 30
            r2 = 90
            byte[] r3 = r5.x
            if (r6 != r0) goto L_0x0027
            int r0 = r5.c
            int r4 = r0 + 29
            r4 = r3[r4]
            if (r4 != r2) goto L_0x0027
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.Z(r3, r0)
            tb.wqx r2 = tb.wqx.e
            tb.xqx r0 = tb.xqx.c(r0, r2)
            goto L_0x0076
        L_0x0027:
            r0 = 29
            if (r6 != r0) goto L_0x003e
            int r0 = r5.c
            int r4 = r0 + 28
            r4 = r3[r4]
            if (r4 != r2) goto L_0x003e
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.X(r3, r0)
            tb.wqx r2 = tb.wqx.e
            tb.xqx r0 = tb.xqx.c(r0, r2)
            goto L_0x0076
        L_0x003e:
            r0 = 28
            if (r6 != r0) goto L_0x0055
            int r0 = r5.c
            int r4 = r0 + 27
            r4 = r3[r4]
            if (r4 != r2) goto L_0x0055
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.V(r3, r0)
            tb.wqx r2 = tb.wqx.e
            tb.xqx r0 = tb.xqx.c(r0, r2)
            goto L_0x0076
        L_0x0055:
            r0 = 27
            if (r6 != r0) goto L_0x006c
            int r0 = r5.c
            int r4 = r0 + 26
            r4 = r3[r4]
            if (r4 != r2) goto L_0x006c
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.T(r3, r0)
            tb.wqx r2 = tb.wqx.e
            tb.xqx r0 = tb.xqx.c(r0, r2)
            goto L_0x0076
        L_0x006c:
            int r0 = r5.c
            com.alibaba.fastjson2.JSONReader$c r2 = r5.f2453a
            tb.wqx r2 = r2.b
            tb.xqx r0 = com.alibaba.fastjson2.util.DateUtils.q0(r3, r0, r6, r2)
        L_0x0076:
            if (r0 != 0) goto L_0x0079
            return r1
        L_0x0079:
            int r1 = r5.c
            r2 = 1
            int r6 = r6 + r2
            int r1 = r1 + r6
            r5.c = r1
            r5.t1()
            char r6 = r5.d
            r1 = 44
            if (r6 != r1) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r2 = 0
        L_0x008b:
            r5.e = r2
            if (r2 == 0) goto L_0x0092
            r5.t1()
        L_0x0092:
            return r0
        L_0x0093:
            com.alibaba.fastjson2.JSONException r6 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "date only support string input"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.X2(int):tb.xqx");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r1 == 10) goto L_0x0029;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a3() {
        /*
            r13 = this;
            int r0 = r13.c
            int r1 = r0 + 1
            int r2 = r13.A
            if (r1 >= r2) goto L_0x006f
            byte[] r3 = r13.x
            r4 = r3[r0]
            r5 = 42
            r6 = 0
            r7 = 47
            r8 = 1
            if (r4 != r5) goto L_0x0016
            r4 = 1
            goto L_0x0019
        L_0x0016:
            if (r4 != r7) goto L_0x006e
            r4 = 0
        L_0x0019:
            int r0 = r0 + 2
            r1 = r3[r1]
        L_0x001d:
            if (r4 == 0) goto L_0x002d
            if (r1 != r5) goto L_0x002b
            if (r0 > r2) goto L_0x002b
            r1 = r3[r0]
            if (r1 != r7) goto L_0x002b
            int r0 = r0 + 1
        L_0x0029:
            r1 = 1
            goto L_0x0032
        L_0x002b:
            r1 = 0
            goto L_0x0032
        L_0x002d:
            r9 = 10
            if (r1 != r9) goto L_0x002b
            goto L_0x0029
        L_0x0032:
            r9 = 26
            if (r1 == 0) goto L_0x0059
            if (r0 < r2) goto L_0x0039
            goto L_0x005b
        L_0x0039:
            r1 = r3[r0]
        L_0x003b:
            r4 = 32
            if (r1 > r4) goto L_0x0056
            r4 = 1
            long r4 = r4 << r1
            r10 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r10
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0056
            int r0 = r0 + 1
            if (r0 < r2) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            r1 = r3[r0]
            goto L_0x003b
        L_0x0056:
            r9 = r1
        L_0x0057:
            int r0 = r0 + r8
            goto L_0x005b
        L_0x0059:
            if (r0 < r2) goto L_0x0066
        L_0x005b:
            char r1 = (char) r9
            r13.d = r1
            r13.c = r0
            if (r9 != r7) goto L_0x0065
            r13.a3()
        L_0x0065:
            return
        L_0x0066:
            int r1 = r0 + 1
            r0 = r3[r0]
            r12 = r1
            r1 = r0
            r0 = r12
            goto L_0x001d
        L_0x006e:
            return
        L_0x006f:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = r13.Z0()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.a3():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean b1() {
        if (this.d == '[') {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0278  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x01eb -> B:186:0x022f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x0243 -> B:25:0x0050). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b3() {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.b3():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.G;
        if (cArr != null && cArr.length < 1048576) {
            JSONFactory.r.lazySet(this.H, cArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x047f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x009c -> B:37:0x008b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String g2() {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.g2():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
        r5 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a3, code lost:
        if (r5 >= r1) goto L_0x00ac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
        if (r3[r5] != 35) goto L_0x00ac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ac, code lost:
        r18.F = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ae, code lost:
        return true;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k1() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.d
            int r2 = r0.c
            r3 = 123(0x7b, float:1.72E-43)
            r4 = 0
            if (r1 == r3) goto L_0x000c
            return r4
        L_0x000c:
            int r1 = r0.A
            if (r2 != r1) goto L_0x0011
            return r4
        L_0x0011:
            byte[] r3 = r0.x
            r5 = r3[r2]
        L_0x0015:
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r5 < 0) goto L_0x0033
            if (r5 > r12) goto L_0x0033
            long r13 = r10 << r5
            long r13 = r13 & r8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0033
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x0030
            return r4
        L_0x0030:
            r5 = r3[r2]
            goto L_0x0015
        L_0x0033:
            r13 = 34
            if (r5 == r13) goto L_0x003b
            r13 = 39
            if (r5 != r13) goto L_0x00af
        L_0x003b:
            int r13 = r0.c
            int r13 = r13 + 5
            if (r13 >= r1) goto L_0x00af
            int r13 = r2 + 1
            r13 = r3[r13]
            r14 = 36
            if (r13 != r14) goto L_0x00af
            int r13 = r2 + 2
            r13 = r3[r13]
            r14 = 114(0x72, float:1.6E-43)
            if (r13 != r14) goto L_0x00af
            int r13 = r2 + 3
            r13 = r3[r13]
            r14 = 101(0x65, float:1.42E-43)
            if (r13 != r14) goto L_0x00af
            int r13 = r2 + 4
            r13 = r3[r13]
            r14 = 102(0x66, float:1.43E-43)
            if (r13 != r14) goto L_0x00af
            int r13 = r2 + 5
            r13 = r3[r13]
            if (r13 != r5) goto L_0x00af
            int r2 = r2 + 6
            if (r2 < r1) goto L_0x006c
            goto L_0x00af
        L_0x006c:
            r13 = r3[r2]
        L_0x006e:
            if (r13 < 0) goto L_0x0081
            if (r13 > r12) goto L_0x0081
            long r14 = r10 << r13
            long r14 = r14 & r8
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x0081
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x007e
            return r4
        L_0x007e:
            r13 = r3[r2]
            goto L_0x006e
        L_0x0081:
            r14 = 58
            if (r13 != r14) goto L_0x00af
            r13 = 1
            int r2 = r2 + r13
            if (r2 < r1) goto L_0x008a
            goto L_0x00af
        L_0x008a:
            r14 = r3[r2]
        L_0x008c:
            if (r14 < 0) goto L_0x009f
            if (r14 > r12) goto L_0x009f
            long r15 = r10 << r14
            long r15 = r15 & r8
            int r17 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r17 == 0) goto L_0x009f
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x009c
            return r4
        L_0x009c:
            r14 = r3[r2]
            goto L_0x008c
        L_0x009f:
            if (r14 != r5) goto L_0x00af
            int r5 = r2 + 1
            if (r5 >= r1) goto L_0x00ac
            r1 = r3[r5]
            r3 = 35
            if (r1 != r3) goto L_0x00ac
            goto L_0x00af
        L_0x00ac:
            r0.F = r2
            return r13
        L_0x00af:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.k1():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2 A[LOOP:3: B:60:0x00d6->B:69:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cf A[EDGE_INSN: B:91:0x00cf->B:58:0x00cf ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0055 -> B:15:0x003e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x00ef -> B:58:0x00cf). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] m2() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.m2():byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean n2() {
        int i;
        int i2;
        int i3;
        char c = this.d;
        int i4 = this.c;
        boolean z = false;
        if (c == 'n') {
            byte[] bArr = this.x;
            if (bArr[i4] == 117 && bArr[i4 + 1] == 108 && bArr[i4 + 2] == 108) {
                int i5 = i4 + 3;
                int i6 = this.A;
                if (i5 == i6) {
                    i = 26;
                } else {
                    i = (char) bArr[i5];
                }
                int i7 = i4 + 4;
                while (i <= 32 && ((1 << i) & 4294981376L) != 0) {
                    if (i7 == i6) {
                        i = 26;
                    } else {
                        i = bArr[i7];
                        i7++;
                    }
                }
                if (i == 44) {
                    z = true;
                }
                this.e = z;
                if (z) {
                    if (i7 == i6) {
                        i2 = i7;
                        i3 = 26;
                    } else {
                        i2 = i7 + 1;
                        i3 = (char) bArr[i7];
                    }
                    loop1: while (true) {
                        i = i3;
                        i7 = i2;
                        while (i <= 32 && ((1 << i) & 4294981376L) != 0) {
                            if (i7 == i6) {
                                i = 26;
                            }
                        }
                        i2 = i7 + 1;
                        i3 = bArr[i7];
                    }
                }
                this.c = i7;
                this.d = (char) i;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c7, code lost:
        if (r1 == 83) goto L_0x00c9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065 A[LOOP:0: B:23:0x004b->B:33:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x00d2 -> B:78:0x00d4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x00e9 -> B:75:0x00cb). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer o2() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.o2():java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bc, code lost:
        if (r1 == 83) goto L_0x00be;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[LOOP:0: B:23:0x004a->B:33:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00c7 -> B:74:0x00c9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00de -> B:71:0x00c0). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p2() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.p2():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x00eb -> B:81:0x00ed). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0100 -> B:78:0x00e4). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Long q2() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.q2():java.lang.Long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[LOOP:0: B:23:0x004a->B:33:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00d1 -> B:74:0x00d3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00e6 -> B:71:0x00ca). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r2() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.r2():long");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[LOOP:0: B:7:0x0012->B:20:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x000b A[EDGE_INSN: B:23:0x000b->B:5:0x000b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003b -> B:5:0x000b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t1() {
        /*
            r11 = this;
            int r0 = r11.c
            r1 = 26
            byte[] r2 = r11.x
            int r3 = r11.A
            if (r0 < r3) goto L_0x000e
            r4 = r0
        L_0x000b:
            r0 = 26
            goto L_0x0012
        L_0x000e:
            int r4 = r0 + 1
            r0 = r2[r0]
        L_0x0012:
            if (r0 == 0) goto L_0x003b
            r5 = 32
            if (r0 > r5) goto L_0x0028
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0028
            goto L_0x003b
        L_0x0028:
            if (r0 >= 0) goto L_0x002e
            r11.s3(r0, r4)
            return
        L_0x002e:
            r11.c = r4
            char r1 = (char) r0
            r11.d = r1
            r1 = 47
            if (r0 != r1) goto L_0x003a
            r11.a3()
        L_0x003a:
            return
        L_0x003b:
            if (r4 != r3) goto L_0x003e
            goto L_0x000b
        L_0x003e:
            int r0 = r4 + 1
            r4 = r2[r4]
            r10 = r4
            r4 = r0
            r0 = r10
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.t1():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h t2() {
        if (l1()) {
            try {
                p7h v = DateUtils.v(this.x, this.c);
                if (v == null) {
                    return null;
                }
                this.c += 11;
                t1();
                boolean z = this.d == ',';
                this.e = z;
                if (z) {
                    t1();
                }
                return v;
            } catch (DateTimeException e) {
                throw new JSONException(a1("read date error"), e);
            }
        } else {
            throw new JSONException("localDate only support string input");
        }
    }

    public final String t3(int i, int i2) {
        int i3 = opf.ANDROID_SDK_INT;
        byte[] bArr = this.x;
        if (i3 >= 34) {
            return new String(bArr, i, i2, StandardCharsets.ISO_8859_1);
        }
        char[] cArr = this.G;
        if (cArr == null) {
            cArr = JSONFactory.r.getAndSet(this.H, null);
            this.G = cArr;
        }
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
            this.G = cArr;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (bArr[i + i4] & 255);
        }
        return new String(cArr, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[LOOP:0: B:10:0x001c->B:37:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0015 A[EDGE_INSN: B:39:0x0015->B:8:0x0015 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0071 -> B:9:0x0015). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean u1() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.d
            int r2 = r0.c
            r3 = 93
            if (r1 == r3) goto L_0x000c
            r1 = 0
            return r1
        L_0x000c:
            r1 = 26
            int r3 = r0.A
            byte[] r4 = r0.x
            if (r2 != r3) goto L_0x0018
            r5 = r2
        L_0x0015:
            r2 = 26
            goto L_0x001c
        L_0x0018:
            int r5 = r2 + 1
            r2 = r4[r2]
        L_0x001c:
            if (r2 == 0) goto L_0x0071
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r2 > r12) goto L_0x0033
            long r13 = r10 << r2
            long r13 = r13 & r8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0033
            goto L_0x0071
        L_0x0033:
            r13 = 44
            r14 = 1
            if (r2 != r13) goto L_0x005e
            r0.e = r14
            if (r5 != r3) goto L_0x0040
            r2 = r5
            r5 = 26
            goto L_0x0044
        L_0x0040:
            int r2 = r5 + 1
            r5 = r4[r5]
        L_0x0044:
            r17 = r5
            r5 = r2
            r2 = r17
        L_0x0049:
            if (r2 == 0) goto L_0x0054
            if (r2 > r12) goto L_0x005e
            long r15 = r10 << r2
            long r15 = r15 & r8
            int r13 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x005e
        L_0x0054:
            if (r5 != r3) goto L_0x0059
            r2 = 26
            goto L_0x0049
        L_0x0059:
            int r2 = r5 + 1
            r5 = r4[r5]
            goto L_0x0044
        L_0x005e:
            if (r2 >= 0) goto L_0x0064
            r0.s3(r2, r5)
            return r14
        L_0x0064:
            char r1 = (char) r2
            r0.d = r1
            r0.c = r5
            r1 = 47
            if (r2 != r1) goto L_0x0070
            r18.a3()
        L_0x0070:
            return r14
        L_0x0071:
            if (r5 != r3) goto L_0x0074
            goto L_0x0015
        L_0x0074:
            int r2 = r5 + 1
            r5 = r4[r5]
            r17 = r5
            r5 = r2
            r2 = r17
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.u1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h u2() {
        boolean z;
        if (l1()) {
            p7h x = DateUtils.x(this.x, this.c);
            if (x == null) {
                return null;
            }
            this.c += 11;
            t1();
            if (this.d == ',') {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return x;
        }
        throw new JSONException("localDate only support string input");
    }

    public final boolean u3() {
        int i;
        if (this.d == 'n' && (i = this.c) < this.A && this.x[i] == 117) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[LOOP:0: B:10:0x001a->B:24:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0013 A[EDGE_INSN: B:25:0x0013->B:8:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0044 -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v1() {
        /*
            r11 = this;
            char r0 = r11.d
            r1 = 91
            if (r0 == r1) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            int r0 = r11.c
            r1 = 26
            int r2 = r11.A
            byte[] r3 = r11.x
            if (r0 != r2) goto L_0x0016
            r4 = r0
        L_0x0013:
            r0 = 26
            goto L_0x001a
        L_0x0016:
            int r4 = r0 + 1
            r0 = r3[r0]
        L_0x001a:
            if (r0 == 0) goto L_0x0044
            r5 = 32
            if (r0 > r5) goto L_0x0030
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0030
            goto L_0x0044
        L_0x0030:
            r1 = 1
            if (r0 >= 0) goto L_0x0037
            r11.s3(r0, r4)
            return r1
        L_0x0037:
            char r2 = (char) r0
            r11.d = r2
            r11.c = r4
            r2 = 47
            if (r0 != r2) goto L_0x0043
            r11.a3()
        L_0x0043:
            return r1
        L_0x0044:
            if (r4 != r2) goto L_0x0047
            goto L_0x0013
        L_0x0047:
            int r0 = r4 + 1
            r4 = r3[r4]
            r10 = r4
            r4 = r0
            r0 = r10
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.v1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h v2() {
        if (l1()) {
            try {
                p7h z = DateUtils.z(this.x, this.c);
                this.c += 9;
                t1();
                boolean z2 = this.d == ',';
                this.e = z2;
                if (z2) {
                    t1();
                }
                return z;
            } catch (DateTimeException e) {
                throw new JSONException(a1("read date error"), e);
            }
        } else {
            throw new JSONException("localDate only support string input");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[LOOP:1: B:17:0x003f->B:30:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0038 A[EDGE_INSN: B:40:0x0038->B:15:0x0038 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x005f -> B:16:0x0038). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w1() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.c
            char r2 = r0.d
        L_0x0006:
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            int r11 = r0.A
            byte[] r12 = r0.x
            if (r2 > r9) goto L_0x002f
            long r13 = r7 << r2
            long r13 = r13 & r5
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 == 0) goto L_0x002f
            if (r1 != r11) goto L_0x0025
            r2 = 26
            goto L_0x0006
        L_0x0025:
            int r2 = r1 + 1
            r1 = r12[r1]
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x0006
        L_0x002f:
            r13 = 44
            if (r2 == r13) goto L_0x0035
            r1 = 0
            return r1
        L_0x0035:
            if (r1 != r11) goto L_0x003b
            r2 = r1
        L_0x0038:
            r1 = 26
            goto L_0x003f
        L_0x003b:
            int r2 = r1 + 1
            r1 = r12[r1]
        L_0x003f:
            if (r1 == 0) goto L_0x005f
            if (r1 > r9) goto L_0x004b
            long r13 = r7 << r1
            long r13 = r13 & r5
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            goto L_0x005f
        L_0x004b:
            r3 = 1
            if (r1 >= 0) goto L_0x0052
            r0.s3(r1, r2)
            return r3
        L_0x0052:
            r0.c = r2
            char r2 = (char) r1
            r0.d = r2
            r2 = 47
            if (r1 != r2) goto L_0x005e
            r17.a3()
        L_0x005e:
            return r3
        L_0x005f:
            if (r2 != r11) goto L_0x0062
            goto L_0x0038
        L_0x0062:
            int r1 = r2 + 1
            r2 = r12[r2]
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.w1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h w2() {
        if (l1()) {
            try {
                p7h B = DateUtils.B(this.x, this.c);
                this.c += 10;
                t1();
                boolean z = this.d == ',';
                this.e = z;
                if (z) {
                    t1();
                }
                return B;
            } catch (DateTimeException e) {
                throw new JSONException(a1("read date error"), e);
            }
        } else {
            throw new JSONException("localDate only support string input");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067 A[LOOP:1: B:29:0x0052->B:34:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b A[LOOP:2: B:41:0x007f->B:45:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0064 -> B:27:0x004b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0088 -> B:39:0x0078). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w3() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.d
            r2 = 34
            r3 = 0
            r5 = 1
            if (r1 == r2) goto L_0x0025
            r2 = 39
            if (r1 == r2) goto L_0x0025
            com.alibaba.fastjson2.JSONReader$c r1 = r0.f2453a
            long r1 = r1.c
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r6 = r6.mask
            long r1 = r1 & r6
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0020
            r18.i2()
            return r5
        L_0x0020:
            com.alibaba.fastjson2.JSONException r1 = r18.H1()
            throw r1
        L_0x0025:
            int r2 = r0.c
        L_0x0027:
            int r6 = r2 + 1
            byte[] r7 = r0.x
            r8 = r7[r2]
            r9 = 92
            if (r8 != r9) goto L_0x0042
            r2 = r7[r6]
            r7 = 117(0x75, float:1.64E-43)
            if (r2 != r7) goto L_0x0039
            r2 = 5
            goto L_0x0040
        L_0x0039:
            r7 = 120(0x78, float:1.68E-43)
            if (r2 != r7) goto L_0x003f
            r2 = 3
            goto L_0x0040
        L_0x003f:
            r2 = 1
        L_0x0040:
            int r2 = r2 + r6
            goto L_0x0027
        L_0x0042:
            if (r8 != r1) goto L_0x00a0
            r1 = 26
            int r8 = r0.A
            if (r6 != r8) goto L_0x004e
            r2 = r6
        L_0x004b:
            r6 = 26
            goto L_0x0052
        L_0x004e:
            int r2 = r2 + 2
            r6 = r7[r6]
        L_0x0052:
            r9 = 4294981376(0x100003700, double:2.1220027474E-314)
            r11 = 1
            r13 = 32
            if (r6 > r13) goto L_0x0071
            long r14 = r11 << r6
            long r14 = r14 & r9
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 == 0) goto L_0x0071
            if (r2 != r8) goto L_0x0067
            goto L_0x004b
        L_0x0067:
            int r6 = r2 + 1
            r2 = r7[r2]
            r17 = r6
            r6 = r2
            r2 = r17
            goto L_0x0052
        L_0x0071:
            r14 = 58
            if (r6 != r14) goto L_0x009b
            if (r2 != r8) goto L_0x007b
            r6 = r2
        L_0x0078:
            r2 = 26
            goto L_0x007f
        L_0x007b:
            int r6 = r2 + 1
            r2 = r7[r2]
        L_0x007f:
            if (r2 > r13) goto L_0x0095
            long r14 = r11 << r2
            long r14 = r14 & r9
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 == 0) goto L_0x0095
            if (r6 != r8) goto L_0x008b
            goto L_0x0078
        L_0x008b:
            int r2 = r6 + 1
            r6 = r7[r6]
            r17 = r6
            r6 = r2
            r2 = r17
            goto L_0x007f
        L_0x0095:
            r0.c = r6
            char r1 = (char) r2
            r0.d = r1
            return r5
        L_0x009b:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.d3(r6)
            throw r1
        L_0x00a0:
            r2 = r6
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.w3():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[LOOP:0: B:25:0x004e->B:30:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0061 -> B:23:0x0047). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x1() {
        /*
            r11 = this;
            int r0 = r11.c
            char r1 = r11.d
            r2 = 73
            if (r1 != r2) goto L_0x0073
            int r1 = r0 + 6
            int r2 = r11.A
            if (r1 >= r2) goto L_0x0073
            byte[] r3 = r11.x
            r4 = r3[r0]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L_0x0073
            int r4 = r0 + 1
            r4 = r3[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L_0x0073
            int r4 = r0 + 2
            r4 = r3[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L_0x0073
            int r4 = r0 + 3
            r4 = r3[r4]
            if (r4 != r5) goto L_0x0073
            int r4 = r0 + 4
            r4 = r3[r4]
            if (r4 != r6) goto L_0x0073
            int r4 = r0 + 5
            r4 = r3[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L_0x0073
            r1 = r3[r1]
            r4 = 121(0x79, float:1.7E-43)
            if (r1 != r4) goto L_0x0073
            int r1 = r0 + 7
            r4 = 26
            if (r1 != r2) goto L_0x004a
            r0 = r1
        L_0x0047:
            r1 = 26
            goto L_0x004e
        L_0x004a:
            int r0 = r0 + 8
            r1 = r3[r1]
        L_0x004e:
            r5 = 32
            if (r1 > r5) goto L_0x006c
            r5 = 1
            long r5 = r5 << r1
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x006c
            if (r0 != r2) goto L_0x0064
            goto L_0x0047
        L_0x0064:
            int r1 = r0 + 1
            r0 = r3[r0]
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x004e
        L_0x006c:
            r11.c = r0
            char r0 = (char) r1
            r11.d = r0
            r0 = 1
            return r0
        L_0x0073:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.x1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h y2() {
        boolean z;
        if (l1()) {
            q7h F = DateUtils.F(this.x, this.c);
            if (F == null) {
                return null;
            }
            this.c += 13;
            t1();
            if (this.d == ',') {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return F;
        }
        throw new JSONException("date only support string input");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[LOOP:1: B:17:0x003f->B:30:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0038 A[EDGE_INSN: B:40:0x0038->B:15:0x0038 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x005f -> B:16:0x0038). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z1(char r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.c
            char r2 = r0.d
        L_0x0006:
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            int r11 = r0.A
            byte[] r12 = r0.x
            if (r2 > r9) goto L_0x002f
            long r13 = r7 << r2
            long r13 = r13 & r5
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 == 0) goto L_0x002f
            if (r1 != r11) goto L_0x0025
            r2 = 26
            goto L_0x0006
        L_0x0025:
            int r2 = r1 + 1
            r1 = r12[r1]
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x0006
        L_0x002f:
            r13 = r18
            if (r2 == r13) goto L_0x0035
            r1 = 0
            return r1
        L_0x0035:
            if (r1 != r11) goto L_0x003b
            r2 = r1
        L_0x0038:
            r1 = 26
            goto L_0x003f
        L_0x003b:
            int r2 = r1 + 1
            r1 = r12[r1]
        L_0x003f:
            if (r1 == 0) goto L_0x005f
            if (r1 > r9) goto L_0x004b
            long r13 = r7 << r1
            long r13 = r13 & r5
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            goto L_0x005f
        L_0x004b:
            r3 = 1
            if (r1 >= 0) goto L_0x0052
            r0.s3(r1, r2)
            return r3
        L_0x0052:
            r0.c = r2
            char r2 = (char) r1
            r0.d = r2
            r2 = 47
            if (r1 != r2) goto L_0x005e
            r17.a3()
        L_0x005e:
            return r3
        L_0x005f:
            if (r2 != r11) goto L_0x0062
            goto L_0x0038
        L_0x0062:
            int r1 = r2 + 1
            r2 = r12[r2]
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.z1(char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h z2() {
        boolean z;
        if (l1()) {
            q7h H = DateUtils.H(this.x, this.c);
            if (H == null) {
                return null;
            }
            this.c += 15;
            t1();
            if (this.d == ',') {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (z) {
                t1();
            }
            return H;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    @Override // com.alibaba.fastjson2.JSONReader
    public long P0() {
        char c;
        char c2;
        byte[] bArr;
        int i;
        char c3;
        int i2;
        char c4;
        long j;
        long j2;
        byte b;
        int i3 = this.B;
        int i4 = 0;
        long j3 = 0;
        while (true) {
            int i5 = this.A;
            c = '\"';
            c2 = ' ';
            bArr = this.x;
            if (i3 < i5) {
                int i6 = bArr[i3];
                if (i6 == 92) {
                    int i7 = i3 + 1;
                    int i8 = bArr[i7];
                    if (i8 == 117) {
                        i3 += 5;
                        c4 = JSONReader.Z(bArr[i3 + 2], bArr[i3 + 3], bArr[i3 + 4], bArr[i3]);
                    } else if (i8 != 120) {
                        c4 = F(i8);
                        i3 = i7;
                    } else {
                        i3 += 3;
                        c4 = JSONReader.L(bArr[i3 + 2], bArr[i3]);
                    }
                } else {
                    if (i6 != -61) {
                        c4 = i6;
                        if (i6 != -62) {
                            if (i6 == 34) {
                            }
                        }
                    }
                    i3++;
                    c4 = ((i6 & 31) << 6) | (bArr[i3] & 63);
                }
                if (i4 < 8 && c4 <= 255 && c4 >= 0 && (i4 != 0 || c4 != 0)) {
                    if ((c4 != '_' && c4 != '-' && c4 != ' ') || (b = bArr[i3 + 1]) == 34 || b == 39 || b == c4) {
                        if (c4 >= 'A' && c4 <= 'Z') {
                            c4 = (char) (c4 + ' ');
                        }
                        switch (i4) {
                            case 0:
                                j3 = (byte) c4;
                                break;
                            case 1:
                                j = ((byte) c4) << 8;
                                j2 = 255;
                                j3 = (j3 & j2) + j;
                                break;
                            case 2:
                                j = ((byte) c4) << 16;
                                j2 = 65535;
                                j3 = (j3 & j2) + j;
                                break;
                            case 3:
                                j = ((byte) c4) << 24;
                                j2 = 16777215;
                                j3 = (j3 & j2) + j;
                                break;
                            case 4:
                                j = ((byte) c4) << 32;
                                j2 = tiv.INT_MASK;
                                j3 = (j3 & j2) + j;
                                break;
                            case 5:
                                j = ((byte) c4) << 40;
                                j2 = 1099511627775L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 6:
                                j = ((byte) c4) << 48;
                                j2 = 281474976710655L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 7:
                                j = ((byte) c4) << 56;
                                j2 = 72057594037927935L;
                                j3 = (j3 & j2) + j;
                                break;
                        }
                        i4++;
                    }
                    i3++;
                }
            }
        }
        i3 = this.B;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        boolean z = this.E;
        long j4 = ls9.MAGIC_HASH_CODE;
        if (!z || this.f) {
            while (true) {
                int i9 = bArr[i3];
                if (i9 == 92) {
                    int i10 = i3 + 1;
                    int i11 = bArr[i10];
                    if (i11 == 117) {
                        i10 = i3 + 5;
                        c3 = JSONReader.Z(bArr[i3 + 2], bArr[i3 + 3], bArr[i3 + 4], bArr[i10]);
                    } else if (i11 != 120) {
                        i9 = F(i11);
                        i = i10 + 1;
                    } else {
                        i10 = i3 + 3;
                        c3 = JSONReader.L(bArr[i3 + 2], bArr[i10]);
                    }
                    i9 = c3;
                    i = i10 + 1;
                } else if (i9 == c) {
                    return j4;
                } else {
                    if (i9 >= 0) {
                        if (i9 >= 65 && i9 <= 90) {
                            i9 += 32;
                        }
                        i = i3 + 1;
                    } else {
                        switch ((i9 & 255) >> 4) {
                            case 12:
                            case 13:
                                i9 = ((i9 & 31) << 6) | (bArr[i3 + 1] & 63);
                                i = i3 + 2;
                                break;
                            case 14:
                                i9 = ((i9 & 15) << 12) | ((bArr[i3 + 1] & 63) << 6) | (bArr[i3 + 2] & 63);
                                i = i3 + 3;
                                break;
                            default:
                                throw new JSONException("malformed input around byte " + i3);
                        }
                    }
                }
                if (i9 == 95 || i9 == 45) {
                    i3 = i;
                } else if (i9 == 32) {
                    i3 = i;
                } else {
                    i3 = i;
                    j4 = (j4 ^ (i9 == 1 ? 1L : 0L)) * ls9.MAGIC_PRIME;
                }
                c = '\"';
            }
        } else {
            int i12 = this.B;
            while (i12 < this.C) {
                int i13 = bArr[i12];
                if (i13 >= 65 && i13 <= 90) {
                    i13 += 32;
                }
                if ((i13 != 95 && i13 != 45 && i13 != c2) || (i2 = bArr[i12 + 1]) == 34 || i2 == 39 || i2 == i13) {
                    j4 = (i13 ^ j4) * ls9.MAGIC_PRIME;
                }
                i12++;
                c2 = ' ';
            }
            return j4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0117 A[LOOP:7: B:62:0x0104->B:66:0x0117, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0114 -> B:60:0x00fd). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.UUID U2() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.U2():java.util.UUID");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r2 == (-62)) goto L_0x007e;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0174 -> B:68:0x015a). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long V2() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.V2():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02df A[LOOP:3: B:207:0x02d2->B:211:0x02df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[LOOP:0: B:24:0x005a->B:36:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0148  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x029b -> B:191:0x029f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x02b4 -> B:187:0x0294). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:213:0x02e6 -> B:206:0x02d1). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.math.BigDecimal W1() {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.W1():java.math.BigDecimal");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03fc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x03bf -> B:199:0x03a4). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long h2() {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.h2():long");
    }

    public void v3() {
        String str;
        char c = this.d;
        int i = this.c;
        this.g = false;
        int i2 = i;
        int i3 = 0;
        boolean z = true;
        while (true) {
            byte[] bArr = this.x;
            byte b = bArr[i2];
            int i4 = 120;
            int i5 = 117;
            int i6 = 6;
            if (b == 92) {
                this.g = true;
                byte b2 = bArr[i2 + 1];
                if (b2 != 117) {
                    i6 = b2 == 120 ? 4 : 2;
                }
                i2 += i6;
            } else if (b < 0) {
                switch ((b & 255) >> 4) {
                    case 12:
                    case 13:
                        i2 += 2;
                        break;
                    case 14:
                        i2 += 3;
                        break;
                    default:
                        if ((b >> 3) == -2) {
                            i2 += 4;
                            i3++;
                            break;
                        } else {
                            throw new JSONException("malformed input around byte " + i2);
                        }
                }
                z = false;
            } else if (b == c) {
                if (this.g) {
                    char[] cArr = new char[i3];
                    int i7 = 0;
                    while (true) {
                        byte b3 = bArr[i];
                        if (b3 != 92) {
                            if (b3 != 34) {
                                if (b3 < 0) {
                                    switch ((b3 & 255) >> 4) {
                                        case 12:
                                        case 13:
                                            int i8 = i + 1;
                                            i += 2;
                                            cArr[i7] = (char) (((b3 & 31) << 6) | (bArr[i8] & 63));
                                            continue;
                                        case 14:
                                            int i9 = i + 2;
                                            byte b4 = bArr[i + 1];
                                            i += 3;
                                            cArr[i7] = (char) (((b3 & 15) << 12) | ((b4 & 63) << 6) | (bArr[i9] & 63));
                                            continue;
                                        default:
                                            if ((b3 >> 3) == -2) {
                                                byte b5 = bArr[i + 1];
                                                int i10 = i + 3;
                                                byte b6 = bArr[i + 2];
                                                i += 4;
                                                byte b7 = bArr[i10];
                                                int i11 = (((b3 << 18) ^ (b5 << 12)) ^ (b6 << 6)) ^ (b7 ^ c0z.STATE);
                                                if ((b5 & 192) == 128 && (b6 & 192) == 128 && (b7 & 192) == 128 && i11 >= 65536 && i11 < 1114112) {
                                                    int i12 = i7 + 1;
                                                    cArr[i7] = (char) ((i11 >>> 10) + 55232);
                                                    cArr[i12] = (char) ((i11 & 1023) + 56320);
                                                    i7 = i12;
                                                    continue;
                                                }
                                            } else {
                                                throw new JSONException("malformed input around byte " + i);
                                            }
                                            break;
                                    }
                                } else {
                                    cArr[i7] = (char) b3;
                                    i++;
                                }
                            } else {
                                str = new String(cArr);
                                i2 = i;
                            }
                        } else {
                            int i13 = i + 1;
                            int i14 = bArr[i13];
                            if (!(i14 == 34 || i14 == 92)) {
                                if (i14 == i5) {
                                    i13 = i + 5;
                                    i14 = JSONReader.Z(bArr[i + 2], bArr[i + 3], bArr[i + 4], bArr[i13]);
                                } else if (i14 != i4) {
                                    i14 = F(i14);
                                } else {
                                    i13 = i + 3;
                                    i14 = JSONReader.L(bArr[i + 2], bArr[i13]);
                                }
                            }
                            cArr[i7] = (char) i14;
                            i = i13 + 1;
                        }
                        i7++;
                        i4 = 120;
                        i5 = 117;
                    }
                    throw new JSONException("malformed input around byte " + i);
                } else if (z) {
                    int i15 = this.c;
                    str = t3(i15, i2 - i15);
                } else {
                    int i16 = this.c;
                    str = new String(bArr, i16, i2 - i16, StandardCharsets.UTF_8);
                }
                int i17 = i2 + 1;
                byte b8 = bArr[i17];
                while (b8 <= 32 && ((1 << b8) & 4294981376L) != 0) {
                    i17++;
                    b8 = bArr[i17];
                }
                this.e = b8 == 44;
                this.c = i17 + 1;
                if (b8 == 44) {
                    t1();
                } else {
                    this.d = (char) b8;
                }
                this.s = str;
                return;
            } else {
                i2++;
            }
            i3++;
        }
    }

    public static void r3(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        if ((i2 >> 3) == -2) {
            int i4 = bArr[i + 1];
            int i5 = bArr[i + 2];
            int i6 = bArr[i + 3];
            int i7 = (((i2 << 18) ^ (i4 << 12)) ^ (i5 << 6)) ^ (3678080 ^ i6);
            if ((i4 & tck.DETECT_WIDTH) == 128 && (i5 & tck.DETECT_WIDTH) == 128 && (i6 & tck.DETECT_WIDTH) == 128 && i7 >= 65536 && i7 < 1114112) {
                cArr[i3] = (char) ((i7 >>> 10) + 55232);
                cArr[i3 + 1] = (char) ((i7 & 1023) + 56320);
                return;
            }
            throw new JSONException("malformed input around byte " + i);
        }
        throw new JSONException("malformed input around byte " + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
        if (r8 < (-214748364)) goto L_0x00c4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0107, code lost:
        if (r8 < (-214748364)) goto L_0x0102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x029f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0333  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0043 -> B:13:0x0044). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:10:0x003d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x02d2 -> B:172:0x02a8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x02d9 -> B:172:0x02a8). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L2() {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.L2():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00f1 -> B:68:0x00d6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0110 -> B:85:0x0111). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x011b -> B:82:0x0109). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a2() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.a2():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0281, code lost:
        if (r27.m == 1) goto L_0x0283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0293, code lost:
        if (r27.j != false) goto L_0x0295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0295, code lost:
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0296, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02b1, code lost:
        if (r27.j != false) goto L_0x0295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02c3, code lost:
        if (r27.j != false) goto L_0x0295;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0 A[LOOP:1: B:28:0x007b->B:38:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0162  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:9:0x002c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:209:0x0318 -> B:207:0x0313). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x031f -> B:207:0x0313). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double f2() {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.f2():double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x02bd, code lost:
        if (r3 != 26) goto L_0x02c1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02bf, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02c1, code lost:
        r1 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02c3, code lost:
        r26.C = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c7, code lost:
        if (r3 > 32) goto L_0x02df;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d1, code lost:
        if (((1 << (r3 == 1 ? 1 : 0)) & 4294981376L) == 0) goto L_0x02df;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d3, code lost:
        if (r2 != r4) goto L_0x02d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02d5, code lost:
        r3 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02d8, code lost:
        r2 = r2 + 1;
        r3 = r12[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0165, code lost:
        if (r6 != 26) goto L_0x0169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0167, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0169, code lost:
        r1 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016b, code lost:
        r26.C = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016f, code lost:
        if (r6 > 32) goto L_0x018a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0179, code lost:
        if (((1 << r6) & 4294981376L) == 0) goto L_0x018a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017b, code lost:
        if (r2 != r4) goto L_0x0180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017d, code lost:
        r3 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0180, code lost:
        r2 = r2 + 1;
        r3 = (char) r12[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0187, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018a, code lost:
        r3 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ad  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i2() {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.i2():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0298, code lost:
        if (r25.j != false) goto L_0x029a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x029a, code lost:
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ad, code lost:
        if (r25.j != false) goto L_0x029a;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0 A[LOOP:1: B:28:0x007b->B:38:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0162  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:9:0x002c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x030c -> B:202:0x0300). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x0322 -> B:204:0x0305). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float l2() {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.j.l2():float");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final String a1(String str) {
        char c;
        byte[] bArr;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int i4 = this.c;
            c = '\n';
            bArr = this.x;
            if (i >= i4 || i >= this.A) {
                break;
            }
            if (bArr[i] == 10) {
                i3++;
                i2 = 1;
            }
            i++;
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            sb.append(str);
            sb.append(", ");
        }
        sb.append("offset ");
        sb.append(this.c);
        sb.append(", character ");
        sb.append(this.d);
        sb.append(", line ");
        sb.append(i3);
        sb.append(", column ");
        sb.append(i2);
        sb.append(", fastjson-version 2.0.47");
        if (i3 <= 1) {
            c = ' ';
        }
        sb.append(c);
        int i5 = 65535;
        int i6 = this.y;
        if (i6 < 65535) {
            i5 = i6;
        }
        sb.append(new String(bArr, this.z, i5));
        return sb.toString();
    }

    public final void s3(int i, int i2) {
        int i3;
        int i4;
        int i5 = i & 255;
        int i6 = i5 >> 4;
        byte[] bArr = this.x;
        switch (i6) {
            case 12:
            case 13:
                int i7 = i2 + 1;
                int p3 = p3(i5, bArr[i2], i7);
                i3 = i7;
                i4 = p3;
                break;
            case 14:
                i4 = q3(i5, bArr[i2], bArr[i2 + 1], i2);
                i3 = i2 + 2;
                break;
            default:
                if ((i >> 3) == -2) {
                    i4 = (((i << 18) ^ (bArr[i2] << 12)) ^ (bArr[i2 + 1] << 6)) ^ (3678080 ^ bArr[i2 + 2]);
                    i3 = i2 + 3;
                    break;
                } else {
                    throw new JSONException("malformed input around byte " + i2);
                }
        }
        this.d = (char) i4;
        this.c = i3;
    }

    public static int p3(int i, int i2, int i3) {
        if ((i2 & tck.DETECT_WIDTH) == 128) {
            return ((i & 31) << 6) | (i2 & 63);
        }
        throw new JSONException("malformed input around byte " + i3);
    }

    public static int q3(int i, int i2, int i3, int i4) {
        if ((i2 & tck.DETECT_WIDTH) == 128 && (i3 & tck.DETECT_WIDTH) == 128) {
            return ((i & 15) << 12) | ((i2 & 63) << 6) | (i3 & 63);
        }
        throw new JSONException("malformed input around byte " + i4);
    }
}
