package com.alibaba.fastjson2;

import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.util.DateUtils;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.ls9;
import tb.p7h;
import tb.q7h;
import tb.tiv;
import tb.wqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class i extends JSONReader {
    public final int A;
    public final int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final int G;
    public final String x;
    public final char[] y;
    public final int z;

    public i(JSONReader.c cVar, String str, int i, int i2) {
        super(cVar, false);
        char c;
        this.G = -1;
        int identityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.q;
        int length = identityHashCode & (cacheItemArr.length - 1);
        this.G = length;
        JSONFactory.CacheItem cacheItem = cacheItemArr[length];
        AtomicReferenceFieldUpdater<JSONFactory.CacheItem, char[]> atomicReferenceFieldUpdater = JSONFactory.r;
        char[] andSet = atomicReferenceFieldUpdater.getAndSet(cacheItem, null);
        if (andSet == null || andSet.length < i2) {
            if (andSet != null) {
                atomicReferenceFieldUpdater.lazySet(cacheItem, andSet);
            }
            andSet = new char[Math.max(i2, 8192)];
        }
        str.getChars(i, i + i2, andSet, 0);
        this.x = i != 0 ? null : str;
        this.y = andSet;
        this.c = 0;
        this.z = i2;
        this.A = 0;
        this.B = i2;
        if (i2 <= 0) {
            this.d = JSONLexer.EOI;
            return;
        }
        this.d = andSet[0];
        while (true) {
            c = this.d;
            if (c > ' ' || ((1 << c) & 4294981376L) == 0) {
                break;
            }
            int i3 = this.c + 1;
            this.c = i3;
            if (i3 >= this.z) {
                this.d = JSONLexer.EOI;
                return;
            }
            this.d = andSet[i3];
        }
        this.c++;
        if (c == 65534 || c == 65279) {
            t1();
        }
        if (this.d == '/') {
            a3();
        }
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
    public boolean A1(char r7, char r8, char r9, char r10, char r11) {
        /*
            r6 = this;
            char r0 = r6.d
            r1 = 0
            if (r0 == r7) goto L_0x0006
            return r1
        L_0x0006:
            int r7 = r6.c
            int r0 = r7 + 4
            int r2 = r6.B
            if (r0 > r2) goto L_0x0075
            char[] r3 = r6.y
            char r4 = r3[r7]
            if (r4 != r8) goto L_0x0075
            int r8 = r7 + 1
            char r8 = r3[r8]
            if (r8 != r9) goto L_0x0075
            int r8 = r7 + 2
            char r8 = r3[r8]
            if (r8 != r10) goto L_0x0075
            int r8 = r7 + 3
            char r8 = r3[r8]
            if (r8 == r11) goto L_0x0027
            goto L_0x0075
        L_0x0027:
            r8 = 26
            if (r0 != r2) goto L_0x002e
        L_0x002b:
            r9 = 26
            goto L_0x0033
        L_0x002e:
            int r7 = r7 + 5
            char r9 = r3[r0]
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
            char r9 = r3[r0]
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
            r6.d = r9
            r7 = 1
            return r7
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.A1(char, char, char, char, char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h A2() {
        boolean z;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            q7h K = DateUtils.K(this.y, this.c);
            if (K == null) {
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
            return K;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h B2() {
        boolean z;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            q7h M = DateUtils.M(this.y, this.c);
            if (M == null) {
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
            return M;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean C1() {
        if (this.d != 'n') {
            return false;
        }
        int i = this.c;
        if (i + 2 >= this.B || this.y[i] != 'u') {
            return false;
        }
        I2();
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h C2() {
        boolean z;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            q7h O = DateUtils.O(this.y, this.c);
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
            return O;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[LOOP:0: B:26:0x0044->B:31:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070 A[LOOP:1: B:41:0x007c->B:49:0x0070, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0058 -> B:24:0x003d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0077 -> B:41:0x007c). Please submit an issue!!! */
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
            int r6 = r0.B
            char[] r7 = r0.y
            if (r1 != r3) goto L_0x0029
            int r3 = r2 + 2
            if (r3 >= r6) goto L_0x0029
            char r8 = r7[r2]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L_0x0029
            int r8 = r2 + 1
            char r8 = r7[r8]
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 != r9) goto L_0x0029
            char r3 = r7[r3]
            if (r3 != r9) goto L_0x0029
            int r2 = r2 + 3
            goto L_0x0038
        L_0x0029:
            r3 = 34
            if (r1 == r3) goto L_0x0031
            r3 = 39
            if (r1 != r3) goto L_0x0092
        L_0x0031:
            if (r2 >= r6) goto L_0x0092
            char r3 = r7[r2]
            if (r3 != r1) goto L_0x0092
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
            char r2 = r7[r2]
        L_0x0044:
            r8 = 0
            r10 = 4294981376(0x100003700, double:2.1220027474E-314)
            r12 = 1
            r14 = 32
            if (r2 > r14) goto L_0x0065
            long r15 = r12 << r2
            long r15 = r15 & r10
            int r17 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r17 == 0) goto L_0x0065
            if (r3 != r6) goto L_0x005b
            goto L_0x003d
        L_0x005b:
            int r2 = r3 + 1
            char r3 = r7[r3]
            r18 = r3
            r3 = r2
            r2 = r18
            goto L_0x0044
        L_0x0065:
            r15 = 44
            if (r2 != r15) goto L_0x006a
            r4 = 1
        L_0x006a:
            r0.e = r4
            if (r4 == 0) goto L_0x007c
            if (r3 != r6) goto L_0x0073
        L_0x0070:
            r2 = 26
            goto L_0x007c
        L_0x0073:
            int r2 = r3 + 1
            char r3 = r7[r3]
        L_0x0077:
            r18 = r3
            r3 = r2
            r2 = r18
        L_0x007c:
            if (r2 > r14) goto L_0x008d
            long r15 = r12 << r2
            long r15 = r15 & r10
            int r4 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x008d
            if (r3 != r6) goto L_0x0088
            goto L_0x0070
        L_0x0088:
            int r2 = r3 + 1
            char r3 = r7[r3]
            goto L_0x0077
        L_0x008d:
            r0.c = r3
            r0.d = r2
            return r5
        L_0x0092:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.D1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h D2() {
        boolean z;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            q7h Q = DateUtils.Q(this.y, this.c);
            if (Q == null) {
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
            return Q;
        }
        throw new JSONException("date only support string input");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[LOOP:0: B:10:0x001c->B:34:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0015 A[EDGE_INSN: B:37:0x0015->B:8:0x0015 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x006a -> B:9:0x0015). Please submit an issue!!! */
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
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x000a
            r1 = 0
            return r1
        L_0x000a:
            int r1 = r0.c
            r2 = 26
            int r3 = r0.B
            char[] r4 = r0.y
            if (r1 != r3) goto L_0x0018
            r5 = r1
        L_0x0015:
            r1 = 26
            goto L_0x001c
        L_0x0018:
            int r5 = r1 + 1
            char r1 = r4[r1]
        L_0x001c:
            if (r1 == 0) goto L_0x006a
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r1 > r12) goto L_0x0033
            long r13 = r10 << r1
            long r13 = r13 & r8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0033
            goto L_0x006a
        L_0x0033:
            r13 = 44
            r14 = 1
            if (r1 != r13) goto L_0x005e
            r0.e = r14
            if (r5 != r3) goto L_0x0040
            r1 = r5
            r5 = 26
            goto L_0x0044
        L_0x0040:
            int r1 = r5 + 1
            char r5 = r4[r5]
        L_0x0044:
            r17 = r5
            r5 = r1
            r1 = r17
        L_0x0049:
            if (r1 == 0) goto L_0x0054
            if (r1 > r12) goto L_0x005e
            long r15 = r10 << r1
            long r15 = r15 & r8
            int r13 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x005e
        L_0x0054:
            if (r5 != r3) goto L_0x0059
            r1 = 26
            goto L_0x0049
        L_0x0059:
            int r1 = r5 + 1
            char r5 = r4[r5]
            goto L_0x0044
        L_0x005e:
            r0.d = r1
            r0.c = r5
            r2 = 47
            if (r1 != r2) goto L_0x0069
            r18.a3()
        L_0x0069:
            return r14
        L_0x006a:
            if (r5 != r3) goto L_0x006d
            goto L_0x0015
        L_0x006d:
            int r1 = r5 + 1
            char r5 = r4[r5]
            r17 = r5
            r5 = r1
            r1 = r17
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.E1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h E2() {
        boolean z;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            q7h S = DateUtils.S(this.y, this.c);
            if (S == null) {
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
            return S;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[LOOP:0: B:10:0x001a->B:20:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0013 A[EDGE_INSN: B:21:0x0013->B:8:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003d -> B:9:0x0013). Please submit an issue!!! */
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
            int r2 = r11.B
            char[] r3 = r11.y
            if (r0 != r2) goto L_0x0016
            r4 = r0
        L_0x0013:
            r0 = 26
            goto L_0x001a
        L_0x0016:
            int r4 = r0 + 1
            char r0 = r3[r0]
        L_0x001a:
            if (r0 == 0) goto L_0x003d
            r5 = 32
            if (r0 > r5) goto L_0x0030
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0030
            goto L_0x003d
        L_0x0030:
            r11.d = r0
            r11.c = r4
            r1 = 47
            if (r0 != r1) goto L_0x003b
            r11.a3()
        L_0x003b:
            r0 = 1
            return r0
        L_0x003d:
            if (r4 != r2) goto L_0x0040
            goto L_0x0013
        L_0x0040:
            int r0 = r4 + 1
            char r4 = r3[r4]
            r10 = r4
            r4 = r0
            r0 = r10
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.F1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h F2(int i) {
        char c = this.d;
        if (c == '\"' || c == '\'') {
            q7h c0 = DateUtils.c0(this.y, this.c, i);
            if (c0 == null) {
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
            return c0;
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
    public boolean G1() {
        /*
            r11 = this;
            int r0 = r11.c
            char r1 = r11.d
            r2 = 83
            if (r1 != r2) goto L_0x004e
            int r1 = r0 + 1
            int r2 = r11.B
            if (r1 >= r2) goto L_0x004e
            char[] r3 = r11.y
            char r4 = r3[r0]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L_0x004e
            char r1 = r3[r1]
            r4 = 116(0x74, float:1.63E-43)
            if (r1 != r4) goto L_0x004e
            int r1 = r0 + 2
            r4 = 26
            if (r1 != r2) goto L_0x0026
            r0 = r1
        L_0x0023:
            r1 = 26
            goto L_0x002a
        L_0x0026:
            int r0 = r0 + 3
            char r1 = r3[r1]
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
            char r0 = r3[r0]
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x002a
        L_0x0048:
            r11.c = r0
            r11.d = r1
            r0 = 1
            return r0
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.G1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long G2() {
        char c = this.d;
        if (c == '\"' || c == '\'') {
            int i = this.c;
            boolean z = true;
            if (i + 18 >= this.B) {
                this.h = true;
                return 0L;
            }
            wqx wqxVar = this.f2453a.b;
            char[] cArr = this.y;
            long l0 = DateUtils.l0(cArr, i, wqxVar);
            int i2 = this.c;
            if (cArr[i2 + 19] == c) {
                this.c = i2 + 20;
                t1();
                if (this.d != ',') {
                    z = false;
                }
                this.e = z;
                if (z) {
                    t1();
                }
                return l0;
            }
            throw new JSONException(a1("illegal date input"));
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void I2() {
        char c;
        boolean z;
        int i;
        char c2;
        int i2 = this.c;
        char[] cArr = this.y;
        if (cArr[i2] == 'u' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 'l') {
            int i3 = i2 + 3;
            int i4 = this.B;
            if (i3 == i4) {
                c = JSONLexer.EOI;
            } else {
                c = cArr[i3];
            }
            int i5 = i2 + 4;
            while (c <= ' ' && ((1 << c) & 4294981376L) != 0) {
                if (i5 == i4) {
                    c = JSONLexer.EOI;
                } else {
                    c = cArr[i5];
                    i5++;
                }
            }
            if (c == ',') {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (z) {
                if (i5 == i4) {
                    i = i5;
                    c2 = JSONLexer.EOI;
                } else {
                    i = i5 + 1;
                    c2 = cArr[i5];
                }
                loop1: while (true) {
                    c = c2;
                    i5 = i;
                    while (c <= ' ' && ((1 << c) & 4294981376L) != 0) {
                        if (i5 == i4) {
                            c = JSONLexer.EOI;
                        }
                    }
                    i = i5 + 1;
                    c2 = cArr[i5];
                }
            }
            this.d = c;
            this.c = i5;
            return;
        }
        throw new JSONException("json syntax error, not match null, offset " + i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[LOOP:0: B:24:0x004e->B:29:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[LOOP:1: B:44:0x008e->B:48:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0059 -> B:24:0x004e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0098 -> B:42:0x0089). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Date J2() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.J2():java.util.Date");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String L0() {
        boolean z = this.f;
        char[] cArr = this.y;
        if (!z) {
            String str = this.x;
            if (str != null) {
                return str.substring(this.C, this.D);
            }
            int i = this.C;
            return new String(cArr, i, this.D - i);
        }
        char[] cArr2 = new char[this.E];
        int i2 = this.C;
        int i3 = 0;
        while (i2 < this.D) {
            char c = cArr[i2];
            if (c == '\\') {
                int i4 = i2 + 1;
                char c2 = cArr[i4];
                if (!(c2 == '\"' || c2 == ':' || c2 == '@' || c2 == '\\')) {
                    if (c2 == 'u') {
                        i2 += 5;
                        c = JSONReader.Z(cArr[i2 + 2], cArr[i2 + 3], cArr[i2 + 4], cArr[i2]);
                    } else if (c2 != 'x') {
                        switch (c2) {
                            default:
                                switch (c2) {
                                    case '<':
                                    case '=':
                                    case '>':
                                        break;
                                    default:
                                        c = F(c2);
                                        i2 = i4;
                                        break;
                                }
                            case '*':
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                i2 = i4;
                                c = c2;
                                break;
                        }
                    } else {
                        i2 += 3;
                        c = JSONReader.L(cArr[i2 + 2], cArr[i2]);
                    }
                }
                i2 = i4;
                c = c2;
            } else if (c == '\"') {
                return new String(cArr2);
            }
            cArr2[i3] = c;
            i2++;
            i3++;
        }
        return new String(cArr2);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long P0() {
        int i;
        char c;
        char c2;
        char[] cArr;
        char c3;
        char c4;
        long j;
        long j2;
        int i2 = this.C;
        int i3 = 0;
        long j3 = 0;
        while (true) {
            i = this.B;
            c = '\"';
            c2 = ' ';
            cArr = this.y;
            if (i2 < i) {
                char c5 = cArr[i2];
                if (c5 == '\\') {
                    int i4 = i2 + 1;
                    char c6 = cArr[i4];
                    if (c6 == 'u') {
                        i2 += 5;
                        c5 = JSONReader.Z(cArr[i2 + 2], cArr[i2 + 3], cArr[i2 + 4], cArr[i2]);
                    } else if (c6 != 'x') {
                        c5 = F(c6);
                        i2 = i4;
                    } else {
                        i2 += 3;
                        c5 = JSONReader.L(cArr[i2 + 2], cArr[i2]);
                    }
                } else if (c5 == '\"') {
                }
                if (c5 <= 255 && i3 < 8 && (i3 != 0 || c5 != 0)) {
                    if ((c5 != '_' && c5 != '-' && c5 != ' ') || (c4 = cArr[i2 + 1]) == '\"' || c4 == '\'' || c4 == c5) {
                        if (c5 >= 'A' && c5 <= 'Z') {
                            c5 = (char) (c5 + ' ');
                        }
                        switch (i3) {
                            case 0:
                                j3 = (byte) c5;
                                break;
                            case 1:
                                j = ((byte) c5) << 8;
                                j2 = 255;
                                j3 = (j3 & j2) + j;
                                break;
                            case 2:
                                j = ((byte) c5) << 16;
                                j2 = 65535;
                                j3 = (j3 & j2) + j;
                                break;
                            case 3:
                                j = ((byte) c5) << 24;
                                j2 = 16777215;
                                j3 = (j3 & j2) + j;
                                break;
                            case 4:
                                j = ((byte) c5) << 32;
                                j2 = tiv.INT_MASK;
                                j3 = (j3 & j2) + j;
                                break;
                            case 5:
                                j = ((byte) c5) << 40;
                                j2 = 1099511627775L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 6:
                                j = ((byte) c5) << 48;
                                j2 = 281474976710655L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 7:
                                j = ((byte) c5) << 56;
                                j2 = 72057594037927935L;
                                j3 = (j3 & j2) + j;
                                break;
                        }
                        i3++;
                    }
                    i2++;
                }
            }
        }
        i2 = this.C;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = ls9.MAGIC_HASH_CODE;
        while (i2 < i) {
            char c7 = cArr[i2];
            if (c7 == '\\') {
                int i5 = i2 + 1;
                char c8 = cArr[i5];
                if (c8 == 'u') {
                    i2 += 5;
                    c7 = JSONReader.Z(cArr[i2 + 2], cArr[i2 + 3], cArr[i2 + 4], cArr[i2]);
                } else if (c8 != 'x') {
                    c7 = F(c8);
                    i2 = i5;
                } else {
                    i2 += 3;
                    c7 = JSONReader.L(cArr[i2 + 2], cArr[i2]);
                }
            } else if (c7 == c) {
                return j4;
            }
            i2++;
            if ((c7 != '_' && c7 != '-' && c7 != c2) || (c3 = cArr[i2]) == c || c3 == '\'' || c3 == c7) {
                if (c7 >= 'A' && c7 <= 'Z') {
                    c7 = (char) (c7 + ' ');
                }
                j4 = ls9.MAGIC_PRIME * (c7 ^ j4);
                c = '\"';
                c2 = ' ';
            }
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[LOOP:1: B:19:0x004f->B:23:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0058 -> B:18:0x0048). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String P2() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.F
            int r2 = r0.B
            if (r1 != r2) goto L_0x000a
            r1 = 0
            return r1
        L_0x000a:
            int r3 = r1 + 1
            r0.c = r3
            char[] r3 = r0.y
            char r1 = r3[r1]
            r0.d = r1
            java.lang.String r1 = r18.Q2()
            char r4 = r0.d
            int r5 = r0.c
        L_0x001c:
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            r13 = 26
            if (r4 > r12) goto L_0x0041
            long r14 = r10 << r4
            long r14 = r14 & r8
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x0041
            if (r5 != r2) goto L_0x0037
            r4 = 26
            goto L_0x001c
        L_0x0037:
            int r4 = r5 + 1
            char r5 = r3[r5]
            r17 = r5
            r5 = r4
            r4 = r17
            goto L_0x001c
        L_0x0041:
            r14 = 125(0x7d, float:1.75E-43)
            if (r4 != r14) goto L_0x0097
            if (r5 != r2) goto L_0x004b
            r4 = r5
        L_0x0048:
            r5 = 26
            goto L_0x004f
        L_0x004b:
            int r4 = r5 + 1
            char r5 = r3[r5]
        L_0x004f:
            if (r5 > r12) goto L_0x0065
            long r14 = r10 << r5
            long r14 = r14 & r8
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x0065
            if (r4 != r2) goto L_0x005b
            goto L_0x0048
        L_0x005b:
            int r5 = r4 + 1
            char r4 = r3[r4]
            r17 = r5
            r5 = r4
            r4 = r17
            goto L_0x004f
        L_0x0065:
            r14 = 44
            if (r5 != r14) goto L_0x006b
            r14 = 1
            goto L_0x006c
        L_0x006b:
            r14 = 0
        L_0x006c:
            r0.e = r14
            if (r14 == 0) goto L_0x0092
            if (r4 != r2) goto L_0x0076
            r5 = r4
            r4 = 26
            goto L_0x007a
        L_0x0076:
            int r5 = r4 + 1
            char r4 = r3[r4]
        L_0x007a:
            r17 = r5
            r5 = r4
            r4 = r17
        L_0x007f:
            if (r5 > r12) goto L_0x0092
            long r14 = r10 << r5
            long r14 = r14 & r8
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x0092
            if (r4 != r2) goto L_0x008d
            r5 = 26
            goto L_0x007f
        L_0x008d:
            int r5 = r4 + 1
            char r4 = r3[r4]
            goto L_0x007a
        L_0x0092:
            r0.d = r5
            r0.c = r4
            return r1
        L_0x0097:
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r3 = "illegal reference : "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.P2():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String Q2() {
        String str;
        char c = this.d;
        char c2 = '\"';
        if (c != '\"' && c != '\'') {
            return S2();
        }
        int i = this.c;
        boolean z = false;
        int i2 = i;
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            int i4 = this.B;
            if (i2 < i4) {
                char[] cArr = this.y;
                char c3 = cArr[i2];
                if (c3 == '\\') {
                    int i5 = i2 + 1;
                    char c4 = cArr[i5];
                    if (c4 == 'u') {
                        i5 = i2 + 5;
                    } else if (c4 == 'x') {
                        i5 = i2 + 3;
                    }
                    i2 = i5 + 1;
                    z2 = true;
                } else if (c3 == c) {
                    if (z2) {
                        char[] cArr2 = new char[i3];
                        int i6 = 0;
                        while (true) {
                            char c5 = cArr[i];
                            if (c5 == '\\') {
                                int i7 = i + 1;
                                char c6 = cArr[i7];
                                if (c6 == c2 || c6 == '\\') {
                                    i = i7;
                                    c5 = c6;
                                } else if (c6 == 'b') {
                                    i = i7;
                                    c5 = '\b';
                                } else if (c6 == 'f') {
                                    i = i7;
                                    c5 = '\f';
                                } else if (c6 == 'n') {
                                    i = i7;
                                    c5 = '\n';
                                } else if (c6 == 'r') {
                                    i = i7;
                                    c5 = '\r';
                                } else if (c6 == 'x') {
                                    i += 3;
                                    c5 = JSONReader.L(cArr[i + 2], cArr[i]);
                                } else if (c6 == 't') {
                                    i = i7;
                                    c5 = '\t';
                                } else if (c6 != 'u') {
                                    c5 = F(c6);
                                    i = i7;
                                } else {
                                    i += 5;
                                    c5 = JSONReader.Z(cArr[i + 2], cArr[i + 3], cArr[i + 4], cArr[i]);
                                }
                            } else if (c5 == c) {
                                break;
                            }
                            cArr2[i6] = c5;
                            i++;
                            i6++;
                            c2 = '\"';
                        }
                        str = new String(cArr2);
                        i2 = i;
                    } else {
                        String str2 = this.x;
                        if (str2 != null) {
                            str = str2.substring(this.c, i2);
                        } else {
                            int i8 = this.c;
                            str = new String(cArr, i8, i2 - i8);
                        }
                    }
                    if ((this.f2453a.c & JSONReader.Feature.TrimString.mask) != 0) {
                        str = str.trim();
                    }
                    int i9 = i2 + 1;
                    char c7 = JSONLexer.EOI;
                    if (i9 != i4) {
                        int i10 = i2 + 2;
                        char c8 = cArr[i9];
                        while (c8 <= ' ' && ((1 << c8) & 4294981376L) != 0) {
                            if (i10 == i4) {
                                i9 = i10;
                            } else {
                                int i11 = i10 + 1;
                                char c9 = cArr[i10];
                                i10 = i11;
                                c8 = c9;
                            }
                        }
                        if (c8 == ',') {
                            z = true;
                        }
                        this.e = z;
                        if (!z) {
                            c7 = c8;
                        } else if (i10 != i4) {
                            int i12 = i10 + 1;
                            char c10 = cArr[i10];
                            while (true) {
                                i10 = i12;
                                if (c10 > ' ' || ((1 << c10) & 4294981376L) == 0) {
                                    break;
                                } else if (i10 == i4) {
                                    break;
                                } else {
                                    i12 = i10 + 1;
                                    c10 = cArr[i10];
                                }
                            }
                            c7 = c10;
                        }
                        this.d = c7;
                        this.c = i10;
                        return str;
                    }
                    this.d = JSONLexer.EOI;
                    this.e = false;
                    this.c = i9;
                    return str;
                } else {
                    i2++;
                }
                i3++;
                c2 = '\"';
            } else {
                throw new JSONException(a1("invalid escape character EOI"));
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String U0() {
        String str = this.s;
        if (str != null) {
            return str;
        }
        int i = this.D;
        int i2 = this.C;
        int i3 = i - i2;
        boolean z = this.f;
        char[] cArr = this.y;
        if (!z) {
            return new String(cArr, i2, i3);
        }
        char[] cArr2 = new char[this.E];
        int i4 = 0;
        while (true) {
            char c = cArr[i2];
            if (c == '\\') {
                int i5 = i2 + 1;
                char c2 = cArr[i5];
                if (c2 == '\"' || c2 == '\\') {
                    i2 = i5;
                    c = c2;
                } else if (c2 == 'u') {
                    i2 += 5;
                    c = JSONReader.Z(cArr[i2 + 2], cArr[i2 + 3], cArr[i2 + 4], cArr[i2]);
                } else if (c2 != 'x') {
                    c = F(c2);
                    i2 = i5;
                } else {
                    i2 += 3;
                    c = JSONReader.L(cArr[i2 + 2], cArr[i2]);
                }
            } else if (c == '\"') {
                String str2 = new String(cArr2);
                this.s = str2;
                return str2;
            }
            cArr2[i4] = c;
            i2++;
            i4++;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int V0() {
        int i;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            int i2 = this.c;
            int i3 = i2 + 8;
            int i4 = this.B;
            char[] cArr = this.y;
            if (i3 >= i4 || i3 >= cArr.length || cArr[i2] == c || cArr[i2 + 1] == c || cArr[i2 + 2] == c || cArr[i2 + 3] == c || cArr[i2 + 4] == c || cArr[i2 + 5] == c || cArr[i2 + 6] == c || cArr[i2 + 7] == c) {
                i = 0;
            } else {
                i2 = i3;
                i = 8;
            }
            while (i2 < i4 && cArr[i2] != c) {
                i2++;
                i++;
            }
            return i;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long V2() {
        char[] cArr;
        int i;
        char c;
        boolean z;
        long j;
        char c2;
        int i2;
        char Z;
        long j2;
        long j3;
        char c3 = this.d;
        if (c3 != '\"' && c3 != '\'') {
            return -1L;
        }
        this.f = false;
        int i3 = this.c;
        this.C = i3;
        long j4 = 0;
        int i4 = 0;
        while (true) {
            cArr = this.y;
            i = this.B;
            if (i3 < i) {
                char c4 = cArr[i3];
                if (c4 != c3) {
                    if (c4 == '\\') {
                        this.f = true;
                        int i5 = i3 + 1;
                        char c5 = cArr[i5];
                        if (c5 == 'u') {
                            i3 += 5;
                            c4 = JSONReader.Z(cArr[i3 + 2], cArr[i3 + 3], cArr[i3 + 4], cArr[i3]);
                        } else if (c5 != 'x') {
                            i3 = i5;
                            c4 = F(c5);
                        } else {
                            i3 += 3;
                            c4 = JSONReader.L(cArr[i3 + 2], cArr[i3]);
                        }
                    }
                    if (c4 <= 255 && i4 < 8 && (i4 != 0 || c4 != 0)) {
                        switch (i4) {
                            case 0:
                                j4 = (byte) c4;
                                continue;
                                i3++;
                                i4++;
                            case 1:
                                j2 = ((byte) c4) << 8;
                                j3 = 255;
                                break;
                            case 2:
                                j2 = ((byte) c4) << 16;
                                j3 = 65535;
                                break;
                            case 3:
                                j2 = ((byte) c4) << 24;
                                j3 = 16777215;
                                break;
                            case 4:
                                j2 = ((byte) c4) << 32;
                                j3 = tiv.INT_MASK;
                                break;
                            case 5:
                                j2 = ((byte) c4) << 40;
                                j3 = 1099511627775L;
                                break;
                            case 6:
                                j2 = ((byte) c4) << 48;
                                j3 = 281474976710655L;
                                break;
                            case 7:
                                j2 = ((byte) c4) << 56;
                                j3 = 72057594037927935L;
                                break;
                            default:
                                i3++;
                                i4++;
                        }
                        j4 = (j4 & j3) + j2;
                        i3++;
                        i4++;
                    }
                } else if (i4 == 0) {
                    i3 = this.C;
                } else {
                    this.E = i4;
                    this.D = i3;
                    i3++;
                }
            }
        }
        i3 = this.C;
        j4 = 0;
        if (j4 == 0) {
            j4 = -3750763034362895579L;
            int i6 = 0;
            while (true) {
                char c6 = cArr[i3];
                if (c6 == '\\') {
                    this.f = true;
                    int i7 = i3 + 1;
                    char c7 = cArr[i7];
                    if (c7 == 'u') {
                        i2 = i3 + 5;
                        Z = JSONReader.Z(cArr[i3 + 2], cArr[i3 + 3], cArr[i3 + 4], cArr[i2]);
                    } else if (c7 != 'x') {
                        c2 = F(c7);
                        j4 = (c2 ^ j4) * ls9.MAGIC_PRIME;
                        j = 0;
                        i3 = i7 + 1;
                    } else {
                        i2 = i3 + 3;
                        Z = JSONReader.L(cArr[i3 + 2], cArr[i2]);
                    }
                    c2 = Z;
                    i7 = i2;
                    j4 = (c2 ^ j4) * ls9.MAGIC_PRIME;
                    j = 0;
                    i3 = i7 + 1;
                } else if (c6 == '\"') {
                    this.E = i6;
                    this.D = i3;
                    this.s = null;
                    i3++;
                } else {
                    j = 0;
                    i3++;
                    j4 = (c6 ^ j4) * ls9.MAGIC_PRIME;
                }
                i6++;
            }
        }
        char c8 = JSONLexer.EOI;
        if (i3 == i) {
            c = JSONLexer.EOI;
        } else {
            c = cArr[i3];
        }
        while (c <= ' ' && ((1 << c) & 4294981376L) != 0) {
            i3++;
            c = cArr[i3];
        }
        if (c == ',') {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        if (z) {
            i3++;
            if (i3 != i) {
                c8 = cArr[i3];
            }
            while (c8 <= ' ' && ((1 << c8) & 4294981376L) != 0) {
                i3++;
                c8 = cArr[i3];
            }
            c = c8;
        }
        this.c = i3 + 1;
        this.d = c;
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.xqx X2(int r6) {
        /*
            r5 = this;
            char r0 = r5.d
            r1 = 34
            if (r0 == r1) goto L_0x0013
            r1 = 39
            if (r0 != r1) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            com.alibaba.fastjson2.JSONException r6 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "date only support string input"
            r6.<init>(r0)
            throw r6
        L_0x0013:
            r0 = 19
            r1 = 0
            if (r6 >= r0) goto L_0x0019
            return r1
        L_0x0019:
            r0 = 30
            r2 = 90
            char[] r3 = r5.y
            if (r6 != r0) goto L_0x0034
            int r0 = r5.c
            int r4 = r0 + 29
            char r4 = r3[r4]
            if (r4 != r2) goto L_0x0034
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.a0(r3, r0)
            tb.wqx r2 = tb.wqx.e
            tb.xqx r0 = tb.xqx.c(r0, r2)
            goto L_0x0083
        L_0x0034:
            r0 = 29
            if (r6 != r0) goto L_0x004b
            int r0 = r5.c
            int r4 = r0 + 28
            char r4 = r3[r4]
            if (r4 != r2) goto L_0x004b
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.Y(r3, r0)
            tb.wqx r2 = tb.wqx.e
            tb.xqx r0 = tb.xqx.c(r0, r2)
            goto L_0x0083
        L_0x004b:
            r0 = 28
            if (r6 != r0) goto L_0x0062
            int r0 = r5.c
            int r4 = r0 + 27
            char r4 = r3[r4]
            if (r4 != r2) goto L_0x0062
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.W(r3, r0)
            tb.wqx r2 = tb.wqx.e
            tb.xqx r0 = tb.xqx.c(r0, r2)
            goto L_0x0083
        L_0x0062:
            r0 = 27
            if (r6 != r0) goto L_0x0079
            int r0 = r5.c
            int r4 = r0 + 26
            char r4 = r3[r4]
            if (r4 != r2) goto L_0x0079
            tb.q7h r0 = com.alibaba.fastjson2.util.DateUtils.U(r3, r0)
            tb.wqx r2 = tb.wqx.e
            tb.xqx r0 = tb.xqx.c(r0, r2)
            goto L_0x0083
        L_0x0079:
            int r0 = r5.c
            com.alibaba.fastjson2.JSONReader$c r2 = r5.f2453a
            tb.wqx r2 = r2.b
            tb.xqx r0 = com.alibaba.fastjson2.util.DateUtils.r0(r3, r0, r6, r2)
        L_0x0083:
            if (r0 != 0) goto L_0x0086
            return r1
        L_0x0086:
            int r1 = r5.c
            r2 = 1
            int r6 = r6 + r2
            int r1 = r1 + r6
            r5.c = r1
            r5.t1()
            char r6 = r5.d
            r1 = 44
            if (r6 != r1) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r2 = 0
        L_0x0098:
            r5.e = r2
            if (r2 == 0) goto L_0x009f
            r5.t1()
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.X2(int):tb.xqx");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r1 == '\n') goto L_0x0029;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a3() {
        /*
            r13 = this;
            int r0 = r13.c
            int r1 = r0 + 1
            int r2 = r13.B
            if (r1 >= r2) goto L_0x006e
            char[] r3 = r13.y
            char r4 = r3[r0]
            r5 = 42
            r6 = 0
            r7 = 47
            r8 = 1
            if (r4 != r5) goto L_0x0016
            r4 = 1
            goto L_0x0019
        L_0x0016:
            if (r4 != r7) goto L_0x006d
            r4 = 0
        L_0x0019:
            int r0 = r0 + 2
            char r1 = r3[r1]
        L_0x001d:
            if (r4 == 0) goto L_0x002d
            if (r1 != r5) goto L_0x002b
            if (r0 > r2) goto L_0x002b
            char r1 = r3[r0]
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
            char r1 = r3[r0]
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
            char r1 = r3[r0]
            goto L_0x003b
        L_0x0056:
            r9 = r1
        L_0x0057:
            int r0 = r0 + r8
            goto L_0x005b
        L_0x0059:
            if (r0 < r2) goto L_0x0065
        L_0x005b:
            r13.d = r9
            r13.c = r0
            if (r9 != r7) goto L_0x0064
            r13.a3()
        L_0x0064:
            return
        L_0x0065:
            int r1 = r0 + 1
            char r0 = r3[r0]
            r12 = r1
            r1 = r0
            r0 = r12
            goto L_0x001d
        L_0x006d:
            return
        L_0x006e:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = r13.Z0()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.a3():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean b1() {
        if (this.d == '[') {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x01de -> B:162:0x01e3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00aa -> B:162:0x01e3). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b3() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.b3():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = this.G;
        if (i != -1) {
            char[] cArr = this.y;
            if (cArr.length < 1048576) {
                JSONFactory.r.lazySet(JSONFactory.q[i], cArr);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x040c A[LOOP:2: B:208:0x03f5->B:213:0x040c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:213:0x0409 -> B:207:0x03ee). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long h2() {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.h2():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i2() {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.i2():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean k1() {
        int i;
        int i2;
        int i3;
        int i4;
        char c = this.d;
        int i5 = this.c;
        if (c != '{' || i5 == (i = this.B)) {
            return false;
        }
        char[] cArr = this.y;
        char c2 = cArr[i5];
        while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
            i5++;
            if (i5 >= i) {
                return false;
            }
            c2 = cArr[i5];
        }
        if ((c2 == '\"' || c2 == '\'') && this.c + 5 < i && cArr[i5 + 1] == '$' && cArr[i5 + 2] == 'r' && cArr[i5 + 3] == 'e' && cArr[i5 + 4] == 'f' && cArr[i5 + 5] == c2 && (i2 = i5 + 6) < i) {
            char c3 = cArr[i2];
            while (c3 <= ' ' && ((1 << c3) & 4294981376L) != 0) {
                i2++;
                if (i2 >= i) {
                    return false;
                }
                c3 = cArr[i2];
            }
            if (c3 == ':' && (i3 = i2 + 1) < i) {
                char c4 = cArr[i3];
                while (c4 <= ' ' && ((1 << c4) & 4294981376L) != 0) {
                    i3++;
                    if (i3 >= i) {
                        return false;
                    }
                    c4 = cArr[i3];
                }
                if (c4 == c2 && ((i4 = i3 + 1) >= i || cArr[i4] != '#')) {
                    this.F = i3;
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0046 -> B:15:0x002f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x00e0 -> B:58:0x00c1). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] m2() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.m2():byte[]");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean n2() {
        char c;
        int i;
        char c2;
        int i2 = this.c;
        boolean z = false;
        if (this.d == 'n') {
            char[] cArr = this.y;
            if (cArr[i2] == 'u' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 'l') {
                int i3 = i2 + 3;
                int i4 = this.B;
                if (i3 == i4) {
                    c = JSONLexer.EOI;
                } else {
                    c = cArr[i3];
                }
                int i5 = i2 + 4;
                while (c <= ' ' && ((1 << c) & 4294981376L) != 0) {
                    if (i5 == i4) {
                        c = JSONLexer.EOI;
                    } else {
                        c = cArr[i5];
                        i5++;
                    }
                }
                if (c == ',') {
                    z = true;
                }
                this.e = z;
                if (z) {
                    if (i5 == i4) {
                        i = i5;
                        c2 = JSONLexer.EOI;
                    } else {
                        i = i5 + 1;
                        c2 = cArr[i5];
                    }
                    loop1: while (true) {
                        c = c2;
                        i5 = i;
                        while (c <= ' ' && ((1 << c) & 4294981376L) != 0) {
                            if (i5 == i4) {
                                c = JSONLexer.EOI;
                            }
                        }
                        i = i5 + 1;
                        c2 = cArr[i5];
                    }
                }
                this.d = c;
                this.c = i5;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[LOOP:0: B:23:0x004a->B:33:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x00d1 -> B:78:0x00d3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x00e8 -> B:75:0x00ca). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer o2() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.o2():java.lang.Integer");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[LOOP:0: B:23:0x004a->B:33:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00c7 -> B:74:0x00c9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00de -> B:71:0x00c0). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int p2() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.p2():int");
    }

    public boolean p3() {
        int i;
        if (this.d == 'n' && (i = this.c) < this.B && this.y[i] == 'u') {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
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
    public java.lang.Long q2() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.q2():java.lang.Long");
    }

    public void q3() {
        char[] cArr;
        String str;
        char c;
        boolean z;
        char c2 = this.d;
        int i = this.c;
        this.g = false;
        int i2 = i;
        int i3 = 0;
        while (true) {
            cArr = this.y;
            char c3 = cArr[i2];
            if (c3 == '\\') {
                this.g = true;
                int i4 = i2 + 1;
                char c4 = cArr[i4];
                if (c4 == 'u') {
                    i4 = i2 + 5;
                } else if (c4 == 'x') {
                    i4 = i2 + 3;
                }
                i2 = i4 + 1;
            } else if (c3 == c2) {
                break;
            } else {
                i2++;
            }
            i3++;
        }
        if (this.g) {
            char[] cArr2 = new char[i3];
            int i5 = 0;
            while (true) {
                char c5 = cArr[i];
                if (c5 == '\\') {
                    int i6 = i + 1;
                    char c6 = cArr[i6];
                    if (c6 == '\"' || c6 == '\\') {
                        i = i6;
                        c5 = c6;
                    } else if (c6 == 'u') {
                        i += 5;
                        c5 = JSONReader.Z(cArr[i + 2], cArr[i + 3], cArr[i + 4], cArr[i]);
                    } else if (c6 != 'x') {
                        c5 = F(c6);
                        i = i6;
                    } else {
                        i += 3;
                        c5 = JSONReader.L(cArr[i + 2], cArr[i]);
                    }
                } else if (c5 == '\"') {
                    break;
                }
                cArr2[i5] = c5;
                i++;
                i5++;
            }
            str = new String(cArr2);
            i2 = i;
        } else {
            int i7 = this.c;
            str = new String(cArr, i7, i2 - i7);
        }
        int i8 = i2 + 1;
        int i9 = this.B;
        if (i8 == i9) {
            c = JSONLexer.EOI;
        } else {
            c = cArr[i8];
        }
        while (c <= ' ' && ((1 << c) & 4294981376L) != 0) {
            i8++;
            c = cArr[i8];
        }
        if (c == ',') {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        if (z) {
            this.c = i8 + 2;
            this.d = cArr[i8 + 1];
            while (true) {
                char c7 = this.d;
                if (c7 > ' ' || ((1 << c7) & 4294981376L) == 0) {
                    break;
                }
                int i10 = this.c;
                if (i10 >= i9) {
                    this.d = JSONLexer.EOI;
                } else {
                    this.c = i10 + 1;
                    this.d = cArr[i10];
                }
            }
        } else {
            this.c = i8 + 1;
            this.d = c;
        }
        this.s = str;
    }

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
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00d1 -> B:74:0x00d3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00e6 -> B:71:0x00ca). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long r2() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.r2():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067 A[LOOP:1: B:29:0x0052->B:34:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b A[LOOP:2: B:41:0x007f->B:45:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0064 -> B:27:0x004b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0088 -> B:39:0x0078). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r3() {
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
            char[] r7 = r0.y
            char r8 = r7[r2]
            r9 = 92
            if (r8 != r9) goto L_0x0042
            char r2 = r7[r6]
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
            if (r8 != r1) goto L_0x009f
            r1 = 26
            int r8 = r0.B
            if (r6 != r8) goto L_0x004e
            r2 = r6
        L_0x004b:
            r6 = 26
            goto L_0x0052
        L_0x004e:
            int r2 = r2 + 2
            char r6 = r7[r6]
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
            char r2 = r7[r2]
            r17 = r6
            r6 = r2
            r2 = r17
            goto L_0x0052
        L_0x0071:
            r14 = 58
            if (r6 != r14) goto L_0x009a
            if (r2 != r8) goto L_0x007b
            r6 = r2
        L_0x0078:
            r2 = 26
            goto L_0x007f
        L_0x007b:
            int r6 = r2 + 1
            char r2 = r7[r2]
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
            char r6 = r7[r6]
            r17 = r6
            r6 = r2
            r2 = r17
            goto L_0x007f
        L_0x0095:
            r0.c = r6
            r0.d = r2
            return r5
        L_0x009a:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.d3(r6)
            throw r1
        L_0x009f:
            r2 = r6
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.r3():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x006f -> B:22:0x004f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s3() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.d
            int r2 = r0.c
            int r3 = r2 + 1
            char[] r4 = r0.y
            char r2 = r4[r2]
        L_0x000c:
            r5 = 92
            int r6 = r0.B
            if (r2 != r5) goto L_0x0045
            if (r3 >= r6) goto L_0x0039
            int r2 = r3 + 1
            char r6 = r4[r3]
            if (r6 == r5) goto L_0x0034
            r5 = 34
            if (r6 != r5) goto L_0x001f
            goto L_0x0034
        L_0x001f:
            r5 = 117(0x75, float:1.64E-43)
            if (r6 != r5) goto L_0x002a
            int r2 = r3 + 5
            int r3 = r3 + 6
            char r2 = r4[r2]
            goto L_0x000c
        L_0x002a:
            char r3 = r0.F(r6)
        L_0x002e:
            r17 = r3
            r3 = r2
            r2 = r17
            goto L_0x000c
        L_0x0034:
            int r3 = r3 + 2
            char r2 = r4[r2]
            goto L_0x000c
        L_0x0039:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "illegal string, end"
            java.lang.String r2 = r0.a1(r2)
            r1.<init>(r2)
            throw r1
        L_0x0045:
            r5 = 26
            if (r2 != r1) goto L_0x0054
            if (r3 >= r6) goto L_0x0051
            int r1 = r3 + 1
            char r2 = r4[r3]
        L_0x004f:
            r3 = r1
            goto L_0x005b
        L_0x0051:
            r2 = 26
            goto L_0x005b
        L_0x0054:
            if (r3 >= r6) goto L_0x0051
            int r2 = r3 + 1
            char r3 = r4[r3]
            goto L_0x002e
        L_0x005b:
            r7 = 0
            r9 = 4294981376(0x100003700, double:2.1220027474E-314)
            r11 = 1
            r1 = 32
            if (r2 > r1) goto L_0x0074
            long r13 = r11 << r2
            long r13 = r13 & r9
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x0074
            int r1 = r3 + 1
            char r2 = r4[r3]
            goto L_0x004f
        L_0x0074:
            r13 = 44
            r14 = 1
            if (r2 != r13) goto L_0x007b
            r13 = 1
            goto L_0x007c
        L_0x007b:
            r13 = 0
        L_0x007c:
            r0.e = r13
            if (r13 == 0) goto L_0x009f
            if (r3 < r6) goto L_0x0087
            r0.d = r5
            r0.c = r3
            return
        L_0x0087:
            char r2 = r4[r3]
        L_0x0089:
            if (r2 > r1) goto L_0x009e
            long r15 = r11 << r2
            long r15 = r15 & r9
            int r13 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r13 == 0) goto L_0x009e
            int r3 = r3 + 1
            if (r3 < r6) goto L_0x009b
            r0.d = r5
            r0.c = r3
            return
        L_0x009b:
            char r2 = r4[r3]
            goto L_0x0089
        L_0x009e:
            int r3 = r3 + r14
        L_0x009f:
            r0.d = r2
            r0.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.s3():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[LOOP:0: B:7:0x0012->B:17:0x0037, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x000b A[EDGE_INSN: B:18:0x000b->B:5:0x000b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0034 -> B:5:0x000b). Please submit an issue!!! */
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
            char[] r2 = r11.y
            int r3 = r11.B
            if (r0 < r3) goto L_0x000e
            r4 = r0
        L_0x000b:
            r0 = 26
            goto L_0x0012
        L_0x000e:
            int r4 = r0 + 1
            char r0 = r2[r0]
        L_0x0012:
            if (r0 == 0) goto L_0x0034
            r5 = 32
            if (r0 > r5) goto L_0x0028
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0028
            goto L_0x0034
        L_0x0028:
            r11.c = r4
            r11.d = r0
            r1 = 47
            if (r0 != r1) goto L_0x0033
            r11.a3()
        L_0x0033:
            return
        L_0x0034:
            if (r4 != r3) goto L_0x0037
            goto L_0x000b
        L_0x0037:
            int r0 = r4 + 1
            char r4 = r2[r4]
            r10 = r4
            r4 = r0
            r0 = r10
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.t1():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public p7h t2() {
        char c = this.d;
        if (c == '\"' || c == '\'') {
            try {
                p7h w = DateUtils.w(this.y, this.c);
                if (w == null) {
                    return null;
                }
                this.c += 11;
                t1();
                boolean z = this.d == ',';
                this.e = z;
                if (z) {
                    t1();
                }
                return w;
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[LOOP:0: B:10:0x001c->B:34:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0015 A[EDGE_INSN: B:37:0x0015->B:8:0x0015 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x006a -> B:9:0x0015). Please submit an issue!!! */
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
            r2 = 93
            if (r1 == r2) goto L_0x000a
            r1 = 0
            return r1
        L_0x000a:
            int r1 = r0.c
            r2 = 26
            int r3 = r0.B
            char[] r4 = r0.y
            if (r1 != r3) goto L_0x0018
            r5 = r1
        L_0x0015:
            r1 = 26
            goto L_0x001c
        L_0x0018:
            int r5 = r1 + 1
            char r1 = r4[r1]
        L_0x001c:
            if (r1 == 0) goto L_0x006a
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r1 > r12) goto L_0x0033
            long r13 = r10 << r1
            long r13 = r13 & r8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0033
            goto L_0x006a
        L_0x0033:
            r13 = 44
            r14 = 1
            if (r1 != r13) goto L_0x005e
            r0.e = r14
            if (r5 != r3) goto L_0x0040
            r1 = r5
            r5 = 26
            goto L_0x0044
        L_0x0040:
            int r1 = r5 + 1
            char r5 = r4[r5]
        L_0x0044:
            r17 = r5
            r5 = r1
            r1 = r17
        L_0x0049:
            if (r1 == 0) goto L_0x0054
            if (r1 > r12) goto L_0x005e
            long r15 = r10 << r1
            long r15 = r15 & r8
            int r13 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x005e
        L_0x0054:
            if (r5 != r3) goto L_0x0059
            r1 = 26
            goto L_0x0049
        L_0x0059:
            int r1 = r5 + 1
            char r5 = r4[r5]
            goto L_0x0044
        L_0x005e:
            r0.d = r1
            r0.c = r5
            r2 = 47
            if (r1 != r2) goto L_0x0069
            r18.a3()
        L_0x0069:
            return r14
        L_0x006a:
            if (r5 != r3) goto L_0x006d
            goto L_0x0015
        L_0x006d:
            int r1 = r5 + 1
            char r5 = r4[r5]
            r17 = r5
            r5 = r1
            r1 = r17
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.u1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public p7h u2() {
        boolean z;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            p7h y = DateUtils.y(this.y, this.c);
            if (y == null) {
                return null;
            }
            this.c += 12;
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
            return y;
        }
        throw new JSONException("localDate only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[LOOP:0: B:10:0x001a->B:20:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0013 A[EDGE_INSN: B:21:0x0013->B:8:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003d -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean v1() {
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
            int r2 = r11.B
            char[] r3 = r11.y
            if (r0 != r2) goto L_0x0016
            r4 = r0
        L_0x0013:
            r0 = 26
            goto L_0x001a
        L_0x0016:
            int r4 = r0 + 1
            char r0 = r3[r0]
        L_0x001a:
            if (r0 == 0) goto L_0x003d
            r5 = 32
            if (r0 > r5) goto L_0x0030
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0030
            goto L_0x003d
        L_0x0030:
            r11.d = r0
            r11.c = r4
            r1 = 47
            if (r0 != r1) goto L_0x003b
            r11.a3()
        L_0x003b:
            r0 = 1
            return r0
        L_0x003d:
            if (r4 != r2) goto L_0x0040
            goto L_0x0013
        L_0x0040:
            int r0 = r4 + 1
            char r4 = r3[r4]
            r10 = r4
            r4 = r0
            r0 = r10
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.v1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public p7h v2() {
        char c = this.d;
        if (c == '\"' || c == '\'') {
            try {
                p7h A = DateUtils.A(this.y, this.c);
                this.c += 9;
                t1();
                boolean z = this.d == ',';
                this.e = z;
                if (z) {
                    t1();
                }
                return A;
            } catch (DateTimeException e) {
                throw new JSONException(a1("read date error"), e);
            }
        } else {
            throw new JSONException("localDate only support string input");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[LOOP:1: B:17:0x003f->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038 A[EDGE_INSN: B:35:0x0038->B:15:0x0038 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0058 -> B:16:0x0038). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean w1() {
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
            int r11 = r0.B
            char[] r12 = r0.y
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
            char r1 = r12[r1]
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
            char r1 = r12[r1]
        L_0x003f:
            if (r1 == 0) goto L_0x0058
            if (r1 > r9) goto L_0x004b
            long r13 = r7 << r1
            long r13 = r13 & r5
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            r0.c = r2
            r0.d = r1
            r2 = 47
            if (r1 != r2) goto L_0x0056
            r17.a3()
        L_0x0056:
            r1 = 1
            return r1
        L_0x0058:
            if (r2 != r11) goto L_0x005b
            goto L_0x0038
        L_0x005b:
            int r1 = r2 + 1
            char r2 = r12[r2]
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.w1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public p7h w2() {
        char c = this.d;
        if (c == '\"' || c == '\'') {
            try {
                p7h C = DateUtils.C(this.y, this.c);
                this.c += 10;
                t1();
                boolean z = this.d == ',';
                this.e = z;
                if (z) {
                    t1();
                }
                return C;
            } catch (DateTimeException e) {
                throw new JSONException(a1("read date error"), e);
            }
        } else {
            throw new JSONException("localDate only support string input");
        }
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
    public boolean x1() {
        /*
            r11 = this;
            int r0 = r11.c
            char r1 = r11.d
            r2 = 73
            if (r1 != r2) goto L_0x0072
            int r1 = r0 + 6
            int r2 = r11.B
            if (r1 >= r2) goto L_0x0072
            char[] r3 = r11.y
            char r4 = r3[r0]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L_0x0072
            int r4 = r0 + 1
            char r4 = r3[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L_0x0072
            int r4 = r0 + 2
            char r4 = r3[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L_0x0072
            int r4 = r0 + 3
            char r4 = r3[r4]
            if (r4 != r5) goto L_0x0072
            int r4 = r0 + 4
            char r4 = r3[r4]
            if (r4 != r6) goto L_0x0072
            int r4 = r0 + 5
            char r4 = r3[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L_0x0072
            char r1 = r3[r1]
            r4 = 121(0x79, float:1.7E-43)
            if (r1 != r4) goto L_0x0072
            int r1 = r0 + 7
            r4 = 26
            if (r1 != r2) goto L_0x004a
            r0 = r1
        L_0x0047:
            r1 = 26
            goto L_0x004e
        L_0x004a:
            int r0 = r0 + 8
            char r1 = r3[r1]
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
            char r0 = r3[r0]
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x004e
        L_0x006c:
            r11.c = r0
            r11.d = r1
            r0 = 1
            return r0
        L_0x0072:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.x1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h y2() {
        boolean z;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            q7h G = DateUtils.G(this.y, this.c);
            if (G == null) {
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
            return G;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[LOOP:1: B:17:0x003f->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038 A[EDGE_INSN: B:35:0x0038->B:15:0x0038 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0058 -> B:16:0x0038). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean z1(char r18) {
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
            int r11 = r0.B
            char[] r12 = r0.y
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
            char r1 = r12[r1]
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
            char r1 = r12[r1]
        L_0x003f:
            if (r1 == 0) goto L_0x0058
            if (r1 > r9) goto L_0x004b
            long r13 = r7 << r1
            long r13 = r13 & r5
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            r0.c = r2
            r0.d = r1
            r2 = 47
            if (r1 != r2) goto L_0x0056
            r17.a3()
        L_0x0056:
            r1 = 1
            return r1
        L_0x0058:
            if (r2 != r11) goto L_0x005b
            goto L_0x0038
        L_0x005b:
            int r1 = r2 + 1
            char r2 = r12[r2]
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.z1(char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public q7h z2() {
        boolean z;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            q7h I = DateUtils.I(this.y, this.c);
            if (I == null) {
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
            return I;
        }
        throw new JSONException("date only support string input");
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
    public java.util.UUID U2() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.U2():java.util.UUID");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02de A[LOOP:3: B:207:0x02d1->B:211:0x02de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[LOOP:0: B:24:0x0059->B:36:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x029a -> B:191:0x029e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x02b3 -> B:187:0x0293). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:213:0x02e5 -> B:206:0x02d0). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.math.BigDecimal W1() {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.W1():java.math.BigDecimal");
    }

    /* JADX WARN: Removed duplicated region for block: B:354:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x087c  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String g2() {
        /*
            Method dump skipped, instructions count: 2244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.g2():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
        if (r8 < (-214748364)) goto L_0x00c2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
        if (r8 < (-214748364)) goto L_0x0100;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x032c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0042 -> B:13:0x0043). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:10:0x003c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x02cc -> B:172:0x02a2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x02d3 -> B:172:0x02a2). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L2() {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.L2():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3 A[LOOP:0: B:70:0x00dd->B:75:0x00f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00f0 -> B:68:0x00d6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x010f -> B:85:0x0110). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x011a -> B:82:0x0108). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a2() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.a2():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x027b, code lost:
        if (r27.m == 1) goto L_0x027d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x028d, code lost:
        if (r27.j != false) goto L_0x028f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x028f, code lost:
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0290, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02ab, code lost:
        if (r27.j != false) goto L_0x028f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02bd, code lost:
        if (r27.j != false) goto L_0x028f;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[LOOP:0: B:11:0x0033->B:15:0x003f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[LOOP:1: B:28:0x007a->B:38:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:9:0x002c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:209:0x0312 -> B:207:0x030d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x0319 -> B:207:0x030d). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double f2() {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.f2():double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0292, code lost:
        if (r25.j != false) goto L_0x0294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0294, code lost:
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02a7, code lost:
        if (r25.j != false) goto L_0x0294;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[LOOP:0: B:11:0x0033->B:15:0x003f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[LOOP:1: B:28:0x007a->B:38:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:9:0x002c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x0306 -> B:202:0x02fa). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x031c -> B:204:0x02ff). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float l2() {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.l2():float");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String a1(String str) {
        char c;
        char[] cArr;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            boolean z = (i < this.c) & (i < this.B);
            c = '\n';
            cArr = this.y;
            if (!z) {
                break;
            }
            if (cArr[i] == '\n') {
                i2++;
                i3 = 1;
            }
            i++;
            i3++;
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
        sb.append(i2);
        sb.append(", column ");
        sb.append(i3);
        sb.append(", fastjson-version 2.0.47");
        if (i2 <= 1) {
            c = ' ';
        }
        sb.append(c);
        int i4 = 65535;
        int i5 = this.z;
        if (i5 < 65535) {
            i4 = i5;
        }
        sb.append(cArr, this.A, i4);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        r4.c++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r5 == 65534) goto L_0x0055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r5 != 65279) goto L_0x0058;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        t1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r4.d != '/') goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        a3();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(com.alibaba.fastjson2.JSONReader.c r5, java.lang.String r6, char[] r7, int r8, int r9) {
        /*
            r4 = this;
            r0 = 0
            r4.<init>(r5, r0)
            r5 = -1
            r4.G = r5
            r4.x = r6
            r4.y = r7
            r4.c = r8
            r4.z = r9
            r4.A = r8
            int r5 = r8 + r9
            r4.B = r5
            r6 = 26
            if (r8 < r5) goto L_0x001c
            r4.d = r6
            return
        L_0x001c:
            char r5 = r7[r8]
            r4.d = r5
        L_0x0020:
            char r5 = r4.d
            r8 = 32
            if (r5 > r8) goto L_0x0045
            r0 = 1
            long r0 = r0 << r5
            r2 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r0 = r0 & r2
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0045
            int r5 = r4.c
            int r5 = r5 + 1
            r4.c = r5
            if (r5 < r9) goto L_0x0040
            r4.d = r6
            return
        L_0x0040:
            char r5 = r7[r5]
            r4.d = r5
            goto L_0x0020
        L_0x0045:
            int r6 = r4.c
            int r6 = r6 + 1
            r4.c = r6
            r6 = 65534(0xfffe, float:9.1833E-41)
            if (r5 == r6) goto L_0x0055
            r6 = 65279(0xfeff, float:9.1475E-41)
            if (r5 != r6) goto L_0x0058
        L_0x0055:
            r4.t1()
        L_0x0058:
            char r5 = r4.d
            r6 = 47
            if (r5 != r6) goto L_0x0061
            r4.a3()
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.i.<init>(com.alibaba.fastjson2.JSONReader$c, java.lang.String, char[], int, int):void");
    }
}
