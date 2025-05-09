package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.util.DateUtils;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import tb.ls9;
import tb.opf;
import tb.p7h;
import tb.q7h;
import tb.t2o;
import tb.tck;
import tb.tiv;
import tb.wqx;
import tb.xqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class a extends JSONReader {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public boolean F;
    public byte[] G;
    public char[] H;
    public final JSONFactory.CacheItem I;
    public int x;
    public int y;
    public int z;

    static {
        t2o.a(150994945);
    }

    public a(JSONReader.c cVar, boolean z) {
        super(cVar, z);
        int identityHashCode = System.identityHashCode(Thread.currentThread());
        JSONFactory.CacheItem[] cacheItemArr = JSONFactory.q;
        JSONFactory.CacheItem cacheItem = cacheItemArr[identityHashCode & (cacheItemArr.length - 1)];
        this.I = cacheItem;
        byte[] andSet = JSONFactory.s.getAndSet(cacheItem, null);
        this.G = andSet;
        if (andSet == null) {
            cVar.getClass();
            this.G = new byte[524288];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0040 -> B:20:0x0041). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0058 -> B:17:0x0037). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A1(char r5, char r6, char r7, char r8, char r9) {
        /*
            r4 = this;
            char r0 = r4.d
            r1 = 0
            if (r0 == r5) goto L_0x0006
            return r1
        L_0x0006:
            int r5 = r4.c
            int r0 = r5 + 4
            boolean r2 = r4.C3(r0)
            if (r2 != 0) goto L_0x008a
            byte r2 = r4.u3(r5)
            if (r2 != r6) goto L_0x008a
            int r6 = r5 + 1
            byte r6 = r4.u3(r6)
            if (r6 != r7) goto L_0x008a
            int r6 = r5 + 2
            byte r6 = r4.u3(r6)
            if (r6 != r8) goto L_0x008a
            int r6 = r5 + 3
            byte r6 = r4.u3(r6)
            if (r6 == r9) goto L_0x002f
            goto L_0x008a
        L_0x002f:
            boolean r6 = r4.A3(r0)
            r7 = 26
            if (r6 == 0) goto L_0x003a
        L_0x0037:
            r6 = 26
            goto L_0x0041
        L_0x003a:
            int r5 = r5 + 5
            byte r6 = r4.u3(r0)
        L_0x0040:
            r0 = r5
        L_0x0041:
            r5 = 32
            if (r6 > r5) goto L_0x0062
            r8 = 1
            long r8 = r8 << r6
            r2 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r8 = r8 & r2
            r2 = 0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0062
            boolean r5 = r4.A3(r0)
            if (r5 == 0) goto L_0x005b
            goto L_0x0037
        L_0x005b:
            int r5 = r0 + 1
            byte r6 = r4.u3(r0)
            goto L_0x0040
        L_0x0062:
            int r5 = r4.c
            int r5 = r5 + 5
            if (r0 != r5) goto L_0x0083
            if (r6 == r7) goto L_0x0083
            r5 = 40
            if (r6 == r5) goto L_0x0083
            r5 = 91
            if (r6 == r5) goto L_0x0083
            r5 = 93
            if (r6 == r5) goto L_0x0083
            r5 = 41
            if (r6 == r5) goto L_0x0083
            r5 = 58
            if (r6 == r5) goto L_0x0083
            r5 = 44
            if (r6 == r5) goto L_0x0083
            return r1
        L_0x0083:
            r4.c = r0
            char r5 = (char) r6
            r4.d = r5
            r5 = 1
            return r5
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.A1(char, char, char, char, char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h A2() {
        boolean z;
        if (l1()) {
            q7h J = DateUtils.J(v3(this.c, 16), this.c);
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

    public final boolean A3(int i) {
        if (this.F && i == this.y) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h B2() {
        boolean z;
        if (l1()) {
            q7h L = DateUtils.L(v3(this.c, 17), this.c);
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

    public final boolean B3() {
        if (this.d == 'n' && !t3(this.c) && u3(this.c) == 117) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean C1() {
        if (this.d != 'n' || t3(this.c + 2) || u3(this.c) != 117) {
            return false;
        }
        I2();
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h C2() {
        boolean z;
        if (l1()) {
            q7h N = DateUtils.N(v3(this.c, 18), this.c);
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

    public final boolean C3(int i) {
        if (this.F && i > this.y) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b8, code lost:
        s3(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bb, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074 A[LOOP:0: B:27:0x0057->B:34:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008f A[LOOP:1: B:45:0x009d->B:58:0x008f, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:25:0x004d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0098 -> B:45:0x009d). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D1() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.d
            int r2 = r0.c
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            r5 = 1
            if (r1 != r3) goto L_0x002f
            int r3 = r2 + 2
            boolean r6 = r0.t3(r3)
            if (r6 != 0) goto L_0x002f
            byte r6 = r0.u3(r2)
            r7 = 117(0x75, float:1.64E-43)
            if (r6 != r7) goto L_0x002f
            int r6 = r2 + 1
            byte r6 = r0.u3(r6)
            r7 = 108(0x6c, float:1.51E-43)
            if (r6 != r7) goto L_0x002f
            byte r3 = r0.u3(r3)
            if (r3 != r7) goto L_0x002f
            int r2 = r2 + 3
            goto L_0x0044
        L_0x002f:
            r3 = 34
            if (r1 == r3) goto L_0x0037
            r3 = 39
            if (r1 != r3) goto L_0x00c2
        L_0x0037:
            boolean r3 = r0.t3(r2)
            if (r3 != 0) goto L_0x00c2
            byte r3 = r0.u3(r2)
            if (r3 != r1) goto L_0x00c2
            int r2 = r2 + r5
        L_0x0044:
            boolean r1 = r0.A3(r2)
            r3 = 26
            if (r1 == 0) goto L_0x0050
            r1 = r2
        L_0x004d:
            r2 = 26
            goto L_0x0057
        L_0x0050:
            int r1 = r2 + 1
            byte r2 = r0.u3(r2)
            char r2 = (char) r2
        L_0x0057:
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r2 < 0) goto L_0x0080
            if (r2 > r12) goto L_0x0080
            long r13 = r10 << r2
            long r13 = r13 & r8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0080
            boolean r2 = r0.A3(r1)
            if (r2 == 0) goto L_0x0074
            goto L_0x004d
        L_0x0074:
            int r2 = r1 + 1
            byte r1 = r0.u3(r1)
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x0057
        L_0x0080:
            r13 = 44
            if (r2 != r13) goto L_0x0085
            r4 = 1
        L_0x0085:
            r0.e = r4
            if (r4 == 0) goto L_0x009d
            boolean r2 = r0.A3(r1)
            if (r2 == 0) goto L_0x0092
        L_0x008f:
            r2 = 26
            goto L_0x009d
        L_0x0092:
            int r2 = r1 + 1
            byte r1 = r0.u3(r1)
        L_0x0098:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x009d:
            if (r2 < 0) goto L_0x00b6
            if (r2 > r12) goto L_0x00b6
            long r13 = r10 << r2
            long r13 = r13 & r8
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x00b6
            boolean r2 = r0.A3(r1)
            if (r2 == 0) goto L_0x00af
            goto L_0x008f
        L_0x00af:
            int r2 = r1 + 1
            byte r1 = r0.u3(r1)
            goto L_0x0098
        L_0x00b6:
            if (r2 >= 0) goto L_0x00bc
            r0.s3(r2, r1)
            return r5
        L_0x00bc:
            r0.c = r1
            char r1 = (char) r2
            r0.d = r1
            return r5
        L_0x00c2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.D1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h D2() {
        boolean z;
        if (l1()) {
            q7h P = DateUtils.P(v3(this.c, 19), this.c);
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

    public abstract void D3();

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[LOOP:0: B:10:0x001c->B:39:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0013 A[EDGE_INSN: B:42:0x0013->B:8:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x007f -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean E1() {
        /*
            r15 = this;
            char r0 = r15.d
            int r1 = r15.c
            r2 = 125(0x7d, float:1.75E-43)
            if (r0 == r2) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            boolean r0 = r15.A3(r1)
            r2 = 26
            if (r0 == 0) goto L_0x0016
            r0 = r1
        L_0x0013:
            r1 = 26
            goto L_0x001c
        L_0x0016:
            int r0 = r1 + 1
            byte r1 = r15.u3(r1)
        L_0x001c:
            if (r1 == 0) goto L_0x007b
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            if (r1 > r9) goto L_0x0033
            long r10 = r7 << r1
            long r10 = r10 & r5
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x0033
            goto L_0x007b
        L_0x0033:
            r10 = 44
            r11 = 1
            if (r1 != r10) goto L_0x0068
            r15.e = r11
            boolean r1 = r15.A3(r0)
            if (r1 == 0) goto L_0x0044
            r1 = r0
            r0 = 26
            goto L_0x004a
        L_0x0044:
            int r1 = r0 + 1
            byte r0 = r15.u3(r0)
        L_0x004a:
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x004d:
            if (r1 == 0) goto L_0x0058
            if (r1 > r9) goto L_0x0068
            long r12 = r7 << r1
            long r12 = r12 & r5
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0068
        L_0x0058:
            boolean r1 = r15.A3(r0)
            if (r1 == 0) goto L_0x0061
            r1 = 26
            goto L_0x004d
        L_0x0061:
            int r1 = r0 + 1
            byte r0 = r15.u3(r0)
            goto L_0x004a
        L_0x0068:
            if (r1 >= 0) goto L_0x006e
            r15.s3(r1, r0)
            return r11
        L_0x006e:
            char r2 = (char) r1
            r15.d = r2
            r15.c = r0
            r0 = 47
            if (r1 != r0) goto L_0x007a
            r15.a3()
        L_0x007a:
            return r11
        L_0x007b:
            boolean r1 = r15.A3(r0)
            if (r1 == 0) goto L_0x0082
            goto L_0x0013
        L_0x0082:
            int r1 = r0 + 1
            byte r0 = r15.u3(r0)
            r14 = r1
            r1 = r0
            r0 = r14
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.E1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h E2() {
        boolean z;
        if (l1()) {
            q7h R = DateUtils.R(v3(this.c, 20), this.c);
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[LOOP:0: B:10:0x001c->B:25:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0013 A[EDGE_INSN: B:27:0x0013->B:8:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004a -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean F1() {
        /*
            r9 = this;
            char r0 = r9.d
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            int r0 = r9.c
            boolean r1 = r9.A3(r0)
            r2 = 26
            if (r1 == 0) goto L_0x0016
            r1 = r0
        L_0x0013:
            r0 = 26
            goto L_0x001c
        L_0x0016:
            int r1 = r0 + 1
            byte r0 = r9.u3(r0)
        L_0x001c:
            if (r0 == 0) goto L_0x0046
            r3 = 32
            if (r0 > r3) goto L_0x0032
            r3 = 1
            long r3 = r3 << r0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            r2 = 1
            if (r0 >= 0) goto L_0x0039
            r9.s3(r0, r1)
            return r2
        L_0x0039:
            char r3 = (char) r0
            r9.d = r3
            r9.c = r1
            r1 = 47
            if (r0 != r1) goto L_0x0045
            r9.a3()
        L_0x0045:
            return r2
        L_0x0046:
            boolean r0 = r9.A3(r1)
            if (r0 == 0) goto L_0x004d
            goto L_0x0013
        L_0x004d:
            int r0 = r1 + 1
            byte r1 = r9.u3(r1)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.F1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h F2(int i) {
        if (l1()) {
            q7h b0 = DateUtils.b0(v3(this.c, i), this.c, i);
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[LOOP:1: B:28:0x0056->B:34:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c A[LOOP:2: B:42:0x008c->B:47:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006c -> B:26:0x004c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0099 -> B:40:0x0083). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F3() {
        /*
            r15 = this;
            char r0 = r15.d
            r1 = 34
            r2 = 0
            r4 = 1
            if (r0 == r1) goto L_0x0023
            r1 = 39
            if (r0 == r1) goto L_0x0023
            com.alibaba.fastjson2.JSONReader$c r0 = r15.f2453a
            long r0 = r0.c
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r5 = r5.mask
            long r0 = r0 & r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x001e
            r15.i2()
            return r4
        L_0x001e:
            com.alibaba.fastjson2.JSONException r0 = r15.H1()
            throw r0
        L_0x0023:
            int r1 = r15.c
        L_0x0025:
            int r5 = r1 + 1
            byte r6 = r15.u3(r1)
            r7 = 92
            if (r6 != r7) goto L_0x0042
            byte r1 = r15.u3(r5)
            r6 = 117(0x75, float:1.64E-43)
            if (r1 != r6) goto L_0x0039
            r1 = 5
            goto L_0x0040
        L_0x0039:
            r6 = 120(0x78, float:1.68E-43)
            if (r1 != r6) goto L_0x003f
            r1 = 3
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            int r1 = r1 + r5
            goto L_0x0025
        L_0x0042:
            if (r6 != r0) goto L_0x00b1
            boolean r0 = r15.A3(r5)
            r6 = 26
            if (r0 == 0) goto L_0x004f
        L_0x004c:
            r0 = 26
            goto L_0x0056
        L_0x004f:
            int r1 = r1 + 2
            byte r0 = r15.u3(r5)
            r5 = r1
        L_0x0056:
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            r9 = 1
            r1 = 32
            if (r0 > r1) goto L_0x0078
            long r11 = r9 << r0
            long r11 = r11 & r7
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0078
            boolean r0 = r15.A3(r5)
            if (r0 == 0) goto L_0x006f
            goto L_0x004c
        L_0x006f:
            int r0 = r5 + 1
            byte r1 = r15.u3(r5)
            r5 = r0
            r0 = r1
            goto L_0x0056
        L_0x0078:
            r11 = 58
            if (r0 != r11) goto L_0x00ac
            boolean r0 = r15.A3(r5)
            if (r0 == 0) goto L_0x0086
            r0 = r5
        L_0x0083:
            r5 = 26
            goto L_0x008c
        L_0x0086:
            int r0 = r5 + 1
            byte r5 = r15.u3(r5)
        L_0x008c:
            if (r5 > r1) goto L_0x00a6
            long r11 = r9 << r5
            long r11 = r11 & r7
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x00a6
            boolean r5 = r15.A3(r0)
            if (r5 == 0) goto L_0x009c
            goto L_0x0083
        L_0x009c:
            int r5 = r0 + 1
            byte r0 = r15.u3(r0)
            r14 = r5
            r5 = r0
            r0 = r14
            goto L_0x008c
        L_0x00a6:
            r15.c = r0
            char r0 = (char) r5
            r15.d = r0
            return r4
        L_0x00ac:
            com.alibaba.fastjson2.JSONException r0 = com.alibaba.fastjson2.JSONReader.d3(r0)
            throw r0
        L_0x00b1:
            r1 = r5
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.F3():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[LOOP:0: B:15:0x0034->B:21:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:13:0x002b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G1() {
        /*
            r9 = this;
            int r0 = r9.c
            char r1 = r9.d
            r2 = 83
            if (r1 != r2) goto L_0x005f
            int r1 = r0 + 1
            boolean r2 = r9.t3(r1)
            if (r2 != 0) goto L_0x005f
            byte r2 = r9.u3(r0)
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L_0x005f
            byte r1 = r9.u3(r1)
            r2 = 116(0x74, float:1.63E-43)
            if (r1 != r2) goto L_0x005f
            int r1 = r0 + 2
            boolean r2 = r9.A3(r1)
            r3 = 26
            if (r2 == 0) goto L_0x002e
            r0 = r1
        L_0x002b:
            r1 = 26
            goto L_0x0034
        L_0x002e:
            int r0 = r0 + 3
            byte r1 = r9.u3(r1)
        L_0x0034:
            r2 = 32
            if (r1 > r2) goto L_0x0058
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            boolean r1 = r9.A3(r0)
            if (r1 == 0) goto L_0x004e
            goto L_0x002b
        L_0x004e:
            int r1 = r0 + 1
            byte r0 = r9.u3(r0)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0034
        L_0x0058:
            r9.c = r0
            char r0 = (char) r1
            r9.d = r0
            r0 = 1
            return r0
        L_0x005f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.G1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long G2() {
        char c = this.d;
        if (c == '\"' || c == '\'') {
            boolean z = true;
            if (t3(this.c + 18)) {
                this.h = true;
                return 0L;
            }
            long k0 = DateUtils.k0(v3(this.c, 19), this.c, this.f2453a.b);
            if (u3(this.c + 19) == c) {
                this.c += 20;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[LOOP:0: B:13:0x0030->B:19:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:11:0x0027). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I2() {
        /*
            r14 = this;
            int r0 = r14.c
            byte r1 = r14.u3(r0)
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L_0x0092
            int r1 = r0 + 1
            byte r1 = r14.u3(r1)
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L_0x0092
            int r1 = r0 + 2
            byte r1 = r14.u3(r1)
            if (r1 != r2) goto L_0x0092
            int r1 = r0 + 3
            boolean r2 = r14.A3(r1)
            r3 = 26
            if (r2 == 0) goto L_0x002a
            r0 = r1
        L_0x0027:
            r1 = 26
            goto L_0x0030
        L_0x002a:
            int r0 = r0 + 4
            byte r1 = r14.u3(r1)
        L_0x0030:
            r4 = 0
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            r8 = 1
            r2 = 32
            if (r1 > r2) goto L_0x0055
            long r10 = r8 << r1
            long r10 = r10 & r6
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x0055
            boolean r1 = r14.t3(r0)
            if (r1 == 0) goto L_0x004b
            goto L_0x0027
        L_0x004b:
            int r1 = r0 + 1
            byte r0 = r14.u3(r0)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x0030
        L_0x0055:
            r10 = 44
            if (r1 != r10) goto L_0x005b
            r10 = 1
            goto L_0x005c
        L_0x005b:
            r10 = 0
        L_0x005c:
            r14.e = r10
            if (r10 == 0) goto L_0x008c
            boolean r1 = r14.t3(r0)
            if (r1 == 0) goto L_0x006a
            r1 = r0
            r0 = 26
            goto L_0x0070
        L_0x006a:
            int r1 = r0 + 1
            byte r0 = r14.u3(r0)
        L_0x0070:
            r13 = r1
            r1 = r0
            r0 = r13
        L_0x0073:
            if (r1 > r2) goto L_0x008c
            long r10 = r8 << r1
            long r10 = r10 & r6
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x008c
            boolean r1 = r14.t3(r0)
            if (r1 == 0) goto L_0x0085
            r1 = 26
            goto L_0x0073
        L_0x0085:
            int r1 = r0 + 1
            byte r0 = r14.u3(r0)
            goto L_0x0070
        L_0x008c:
            char r1 = (char) r1
            r14.d = r1
            r14.c = r0
            return
        L_0x0092:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "json syntax error, not match null"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.I2():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[LOOP:0: B:25:0x006c->B:30:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0 A[LOOP:1: B:45:0x00c0->B:50:0x00d0, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0079 -> B:23:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00cd -> B:43:0x00b9). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date J2() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.J2():java.util.Date");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String L0() {
        int i;
        int i2 = this.A;
        int i3 = this.z;
        int i4 = i2 - i3;
        if (this.f) {
            char[] cArr = this.H;
            if (cArr == null) {
                cArr = JSONFactory.r.getAndSet(this.I, null);
                this.H = cArr;
            }
            if (cArr == null || cArr.length < i4) {
                cArr = new char[this.B];
                this.H = cArr;
            }
            int i5 = this.z;
            int i6 = 0;
            while (i5 < this.A) {
                int u3 = u3(i5);
                if (u3 < 0) {
                    switch ((u3 & 255) >> 4) {
                        case 12:
                        case 13:
                            byte u32 = u3(i5 + 1);
                            if ((u32 & 192) == 128) {
                                i = ((u3 & 31) << 6) | (u32 & 63);
                                i5 += 2;
                                break;
                            } else {
                                throw new JSONException("malformed input around byte " + i5);
                            }
                        case 14:
                            byte u33 = u3(i5 + 1);
                            int i7 = i5 + 2;
                            byte u34 = u3(i7);
                            if ((u33 & 192) == 128 && (u34 & 192) == 128) {
                                i = ((u3 & 15) << 12) | ((u33 & 63) << 6) | (u34 & 63);
                                i5 += 3;
                                break;
                            } else {
                                throw new JSONException("malformed input around byte " + i7);
                            }
                            break;
                        default:
                            throw new JSONException("malformed input around byte " + i5);
                    }
                    cArr[i6] = (char) i;
                } else {
                    if (u3 == 92) {
                        int i8 = i5 + 1;
                        char u35 = (char) u3(i8);
                        if (!(u35 == '\"' || u35 == ':' || u35 == '@' || u35 == '\\')) {
                            if (u35 == 'u') {
                                i5 += 5;
                                u3 = JSONReader.Z(u3(i5 + 2), u3(i5 + 3), u3(i5 + 4), u3(i5));
                            } else if (u35 != 'x') {
                                if (!(u35 == '*' || u35 == '+')) {
                                    switch (u35) {
                                        default:
                                            switch (u35) {
                                                case '<':
                                                case '=':
                                                case '>':
                                                    break;
                                                default:
                                                    u3 = F(u35);
                                                    i5 = i8;
                                                    break;
                                            }
                                        case '-':
                                        case '.':
                                        case '/':
                                            i5 = i8;
                                            u3 = u35;
                                            break;
                                    }
                                }
                            } else {
                                i5 += 3;
                                u3 = JSONReader.L(u3(i5 + 2), u3(i5));
                            }
                        }
                        i5 = i8;
                        u3 = u35;
                    } else if (u3 == 34) {
                        return new String(cArr, 0, this.B);
                    }
                    cArr[i6] = (char) u3;
                    i5++;
                }
                i6++;
            }
            return new String(cArr, 0, this.B);
        } else if (this.C) {
            return w3(i3, i4);
        } else {
            return new String(v3(i3, i4), this.z, i4, StandardCharsets.UTF_8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[LOOP:1: B:21:0x005c->B:26:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0069 -> B:20:0x0053). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String P2() {
        /*
            r15 = this;
            int r0 = r15.D
            boolean r0 = r15.A3(r0)
            if (r0 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            int r0 = r15.D
            int r1 = r0 + 1
            r15.c = r1
            byte r0 = r15.u3(r0)
            char r0 = (char) r0
            r15.d = r0
            java.lang.String r0 = r15.Q2()
            char r1 = r15.d
            int r2 = r15.c
        L_0x001f:
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            if (r1 > r9) goto L_0x0048
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L_0x0048
            boolean r1 = r15.A3(r2)
            if (r1 == 0) goto L_0x003e
            r1 = 26
            goto L_0x001f
        L_0x003e:
            int r1 = r2 + 1
            byte r2 = r15.u3(r2)
            r14 = r2
            r2 = r1
            r1 = r14
            goto L_0x001f
        L_0x0048:
            r11 = 125(0x7d, float:1.75E-43)
            if (r1 != r11) goto L_0x00b3
            boolean r1 = r15.A3(r2)
            if (r1 == 0) goto L_0x0056
            r1 = r2
        L_0x0053:
            r2 = 26
            goto L_0x005c
        L_0x0056:
            int r1 = r2 + 1
            byte r2 = r15.u3(r2)
        L_0x005c:
            if (r2 > r9) goto L_0x0076
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L_0x0076
            boolean r2 = r15.A3(r1)
            if (r2 == 0) goto L_0x006c
            goto L_0x0053
        L_0x006c:
            int r2 = r1 + 1
            byte r1 = r15.u3(r1)
            r14 = r2
            r2 = r1
            r1 = r14
            goto L_0x005c
        L_0x0076:
            r11 = 44
            if (r2 != r11) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r15.e = r11
            if (r11 == 0) goto L_0x00ad
            boolean r2 = r15.A3(r1)
            if (r2 == 0) goto L_0x008b
            r2 = r1
            r1 = 26
            goto L_0x0091
        L_0x008b:
            int r2 = r1 + 1
            byte r1 = r15.u3(r1)
        L_0x0091:
            r14 = r2
            r2 = r1
            r1 = r14
        L_0x0094:
            if (r2 > r9) goto L_0x00ad
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L_0x00ad
            boolean r2 = r15.A3(r1)
            if (r2 == 0) goto L_0x00a6
            r2 = 26
            goto L_0x0094
        L_0x00a6:
            int r2 = r1 + 1
            byte r1 = r15.u3(r1)
            goto L_0x0091
        L_0x00ad:
            char r2 = (char) r2
            r15.d = r2
            r15.c = r1
            return r0
        L_0x00b3:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "illegal reference : "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.P2():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c6 A[LOOP:3: B:96:0x01ad->B:102:0x01c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f8 A[LOOP:4: B:113:0x01e9->B:118:0x01f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01c3 -> B:94:0x01a4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0201 -> B:112:0x01e8). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String Q2() {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.Q2():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r0);
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String U0() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.U0():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int V0() {
        int i;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            int i2 = this.c;
            int i3 = i2 + 8;
            if (t3(i3) || !y3(i3) || u3(i2) == c || u3(i2 + 1) == c || u3(i2 + 2) == c || u3(i2 + 3) == c || u3(i2 + 4) == c || u3(i2 + 5) == c || u3(i2 + 6) == c || u3(i2 + 7) == c) {
                i = 0;
            } else {
                i2 = i3;
                i = 8;
            }
            while (!t3(i2) && u3(i2) != c) {
                i2++;
                i++;
            }
            return i;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final xqx X2(int i) {
        xqx xqxVar;
        if (!l1()) {
            throw new JSONException("date only support string input");
        } else if (i < 19) {
            return null;
        } else {
            if (i == 30 && u3(this.c + 29) == 90) {
                xqxVar = xqx.c(DateUtils.Z(v3(this.c, 29), this.c), wqx.e);
            } else if (i == 29 && u3(this.c + 28) == 90) {
                xqxVar = xqx.c(DateUtils.X(v3(this.c, 28), this.c), wqx.e);
            } else if (i == 28 && u3(this.c + 27) == 90) {
                xqxVar = xqx.c(DateUtils.V(v3(this.c, 27), this.c), wqx.e);
            } else if (i == 27 && u3(this.c + 26) == 90) {
                xqxVar = xqx.c(DateUtils.T(v3(this.c, 26), this.c), wqx.e);
            } else {
                xqxVar = DateUtils.q0(v3(this.c, i), this.c, i, this.f2453a.b);
            }
            if (xqxVar == null) {
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
            return xqxVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r1 == 10) goto L_0x0033;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a3() {
        /*
            r11 = this;
            int r0 = r11.c
            int r1 = r0 + 1
            boolean r2 = r11.t3(r1)
            if (r2 != 0) goto L_0x008b
            byte r2 = r11.u3(r0)
            r3 = 42
            r4 = 0
            r5 = 47
            r6 = 1
            if (r2 != r3) goto L_0x0018
            r2 = 1
            goto L_0x001b
        L_0x0018:
            if (r2 != r5) goto L_0x008a
            r2 = 0
        L_0x001b:
            int r0 = r0 + 2
            byte r1 = r11.u3(r1)
        L_0x0021:
            if (r2 == 0) goto L_0x0037
            if (r1 != r3) goto L_0x0035
            boolean r1 = r11.C3(r0)
            if (r1 != 0) goto L_0x0035
            byte r1 = r11.u3(r0)
            if (r1 != r5) goto L_0x0035
            int r0 = r0 + 1
        L_0x0033:
            r1 = 1
            goto L_0x003c
        L_0x0035:
            r1 = 0
            goto L_0x003c
        L_0x0037:
            r7 = 10
            if (r1 != r7) goto L_0x0035
            goto L_0x0033
        L_0x003c:
            r7 = 26
            if (r1 == 0) goto L_0x006f
            boolean r1 = r11.t3(r0)
            if (r1 == 0) goto L_0x0047
            goto L_0x0075
        L_0x0047:
            byte r1 = r11.u3(r0)
        L_0x004b:
            r2 = 32
            if (r1 > r2) goto L_0x006c
            r2 = 1
            long r2 = r2 << r1
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r2 = r2 & r8
            r8 = 0
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x006c
            int r0 = r0 + 1
            boolean r1 = r11.t3(r0)
            if (r1 == 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            byte r1 = r11.u3(r0)
            goto L_0x004b
        L_0x006c:
            r7 = r1
        L_0x006d:
            int r0 = r0 + r6
            goto L_0x0075
        L_0x006f:
            boolean r1 = r11.t3(r0)
            if (r1 == 0) goto L_0x0080
        L_0x0075:
            char r1 = (char) r7
            r11.d = r1
            r11.c = r0
            if (r7 != r5) goto L_0x007f
            r11.a3()
        L_0x007f:
            return
        L_0x0080:
            int r1 = r0 + 1
            byte r0 = r11.u3(r0)
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x0021
        L_0x008a:
            return
        L_0x008b:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = r11.Z0()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.a3():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean b1() {
        if (this.d == '[') {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0251 -> B:196:0x02a1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x02b9 -> B:25:0x0051). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b3() {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.b3():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.G;
        JSONFactory.CacheItem cacheItem = this.I;
        if (bArr != null && bArr.length < 1048576) {
            JSONFactory.s.lazySet(cacheItem, bArr);
        }
        char[] cArr = this.H;
        if (cArr != null && cArr.length < 1048576) {
            JSONFactory.r.lazySet(cacheItem, cArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[LOOP:2: B:39:0x009a->B:44:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a8 -> B:37:0x0092). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String g2() {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.g2():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
        r0 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
        if (t3(r0) != false) goto L_0x00de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
        if (u3(r0) != 35) goto L_0x00de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
        r15.D = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e0, code lost:
        return true;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k1() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.k1():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011d A[LOOP:3: B:66:0x00fd->B:76:0x011d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f4 A[EDGE_INSN: B:98:0x00f4->B:64:0x00f4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0061 -> B:17:0x0044). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x011a -> B:64:0x00f4). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] m2() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.m2():byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean n2() {
        byte b;
        byte b2;
        int i;
        char c = this.d;
        int i2 = this.c;
        boolean z = false;
        if (c != 'n' || u3(i2) != 117 || u3(i2 + 1) != 108 || u3(i2 + 2) != 108) {
            return false;
        }
        int i3 = i2 + 3;
        if (A3(i3)) {
            b = 26;
        } else {
            b = (char) u3(i3);
        }
        int i4 = i2 + 4;
        while (b <= 32 && ((1 << b) & 4294981376L) != 0) {
            if (A3(i4)) {
                b = 26;
            } else {
                int i5 = i4 + 1;
                byte u3 = u3(i4);
                i4 = i5;
                b = u3;
            }
        }
        if (b == 44) {
            z = true;
        }
        this.e = z;
        if (z) {
            if (A3(i4)) {
                i = i4;
                b2 = 26;
            } else {
                i = i4 + 1;
                b2 = (char) u3(i4);
            }
            loop1: while (true) {
                i4 = i;
                b = b2;
                while (b <= 32 && ((1 << b) & 4294981376L) != 0) {
                    if (A3(i4)) {
                        b = 26;
                    }
                }
                i = i4 + 1;
                b2 = u3(i4);
            }
        }
        this.c = i4;
        this.d = (char) b;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d4, code lost:
        if (r1 == 83) goto L_0x00d6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[LOOP:0: B:23:0x004f->B:34:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x00e5 -> B:81:0x00e7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0100 -> B:78:0x00dc). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer o2() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.o2():java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c9, code lost:
        if (r1 == 83) goto L_0x00cb;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069 A[LOOP:0: B:23:0x004e->B:34:0x0069, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x00da -> B:77:0x00dc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x00f5 -> B:74:0x00d1). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p2() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.p2():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e1, code lost:
        if (r1 == 83) goto L_0x00e3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[LOOP:0: B:23:0x004f->B:34:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00f2 -> B:82:0x00f4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x010b -> B:79:0x00e9). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Long q2() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.q2():java.lang.Long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d5, code lost:
        if (r1 == 83) goto L_0x00d7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[LOOP:0: B:23:0x004f->B:34:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v12, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x00e6 -> B:77:0x00e8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x00ff -> B:74:0x00dd). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r2() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.r2():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[LOOP:0: B:7:0x0014->B:21:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x000b A[EDGE_INSN: B:22:0x000b->B:5:0x000b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0041 -> B:5:0x000b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t1() {
        /*
            r9 = this;
            int r0 = r9.c
            boolean r1 = r9.t3(r0)
            r2 = 26
            if (r1 == 0) goto L_0x000e
            r1 = r0
        L_0x000b:
            r0 = 26
            goto L_0x0014
        L_0x000e:
            int r1 = r0 + 1
            byte r0 = r9.u3(r0)
        L_0x0014:
            if (r0 == 0) goto L_0x003d
            r3 = 32
            if (r0 > r3) goto L_0x002a
            r3 = 1
            long r3 = r3 << r0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x002a
            goto L_0x003d
        L_0x002a:
            if (r0 >= 0) goto L_0x0030
            r9.s3(r0, r1)
            return
        L_0x0030:
            r9.c = r1
            char r1 = (char) r0
            r9.d = r1
            r1 = 47
            if (r0 != r1) goto L_0x003c
            r9.a3()
        L_0x003c:
            return
        L_0x003d:
            boolean r0 = r9.A3(r1)
            if (r0 == 0) goto L_0x0044
            goto L_0x000b
        L_0x0044:
            int r0 = r1 + 1
            byte r1 = r9.u3(r1)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.t1():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h t2() {
        if (l1()) {
            try {
                p7h v = DateUtils.v(v3(this.c, 10), this.c);
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

    public final boolean t3(int i) {
        if (this.F && i >= this.y) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[LOOP:0: B:10:0x001c->B:39:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0013 A[EDGE_INSN: B:42:0x0013->B:8:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x007f -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean u1() {
        /*
            r15 = this;
            char r0 = r15.d
            int r1 = r15.c
            r2 = 93
            if (r0 == r2) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            boolean r0 = r15.A3(r1)
            r2 = 26
            if (r0 == 0) goto L_0x0016
            r0 = r1
        L_0x0013:
            r1 = 26
            goto L_0x001c
        L_0x0016:
            int r0 = r1 + 1
            byte r1 = r15.u3(r1)
        L_0x001c:
            if (r1 == 0) goto L_0x007b
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            if (r1 > r9) goto L_0x0033
            long r10 = r7 << r1
            long r10 = r10 & r5
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x0033
            goto L_0x007b
        L_0x0033:
            r10 = 44
            r11 = 1
            if (r1 != r10) goto L_0x0068
            r15.e = r11
            boolean r1 = r15.A3(r0)
            if (r1 == 0) goto L_0x0044
            r1 = r0
            r0 = 26
            goto L_0x004a
        L_0x0044:
            int r1 = r0 + 1
            byte r0 = r15.u3(r0)
        L_0x004a:
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x004d:
            if (r1 == 0) goto L_0x0058
            if (r1 > r9) goto L_0x0068
            long r12 = r7 << r1
            long r12 = r12 & r5
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0068
        L_0x0058:
            boolean r1 = r15.A3(r0)
            if (r1 == 0) goto L_0x0061
            r1 = 26
            goto L_0x004d
        L_0x0061:
            int r1 = r0 + 1
            byte r0 = r15.u3(r0)
            goto L_0x004a
        L_0x0068:
            if (r1 >= 0) goto L_0x006e
            r15.s3(r1, r0)
            return r11
        L_0x006e:
            char r2 = (char) r1
            r15.d = r2
            r15.c = r0
            r0 = 47
            if (r1 != r0) goto L_0x007a
            r15.a3()
        L_0x007a:
            return r11
        L_0x007b:
            boolean r1 = r15.A3(r0)
            if (r1 == 0) goto L_0x0082
            goto L_0x0013
        L_0x0082:
            int r1 = r0 + 1
            byte r0 = r15.u3(r0)
            r14 = r1
            r1 = r0
            r0 = r14
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.u1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h u2() {
        boolean z;
        if (l1()) {
            p7h x = DateUtils.x(v3(this.c, 11), this.c);
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

    public final byte u3(int i) {
        int i2;
        if (!this.F && ((i2 = this.E) == 0 || i >= i2 - 1)) {
            D3();
        }
        return this.G[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[LOOP:0: B:10:0x001c->B:25:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0013 A[EDGE_INSN: B:27:0x0013->B:8:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004a -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v1() {
        /*
            r9 = this;
            char r0 = r9.d
            r1 = 91
            if (r0 == r1) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            int r0 = r9.c
            boolean r1 = r9.A3(r0)
            r2 = 26
            if (r1 == 0) goto L_0x0016
            r1 = r0
        L_0x0013:
            r0 = 26
            goto L_0x001c
        L_0x0016:
            int r1 = r0 + 1
            byte r0 = r9.u3(r0)
        L_0x001c:
            if (r0 == 0) goto L_0x0046
            r3 = 32
            if (r0 > r3) goto L_0x0032
            r3 = 1
            long r3 = r3 << r0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            r2 = 1
            if (r0 >= 0) goto L_0x0039
            r9.s3(r0, r1)
            return r2
        L_0x0039:
            char r3 = (char) r0
            r9.d = r3
            r9.c = r1
            r1 = 47
            if (r0 != r1) goto L_0x0045
            r9.a3()
        L_0x0045:
            return r2
        L_0x0046:
            boolean r0 = r9.A3(r1)
            if (r0 == 0) goto L_0x004d
            goto L_0x0013
        L_0x004d:
            int r0 = r1 + 1
            byte r1 = r9.u3(r1)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.v1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h v2() {
        if (l1()) {
            try {
                p7h z = DateUtils.z(v3(this.c, 8), this.c);
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

    public final byte[] v3(int i, int i2) {
        int i3;
        if (!this.F && ((i3 = this.E) == 0 || i + i2 >= i3 - 1)) {
            D3();
        }
        return this.G;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[LOOP:1: B:19:0x0043->B:33:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003a A[EDGE_INSN: B:42:0x003a->B:17:0x003a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0067 -> B:18:0x003a). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w1() {
        /*
            r14 = this;
            int r0 = r14.c
            char r1 = r14.d
        L_0x0004:
            r2 = 0
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            r6 = 1
            r8 = 32
            r9 = 26
            if (r1 > r8) goto L_0x002d
            long r10 = r6 << r1
            long r10 = r10 & r4
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x002d
            boolean r1 = r14.A3(r0)
            if (r1 == 0) goto L_0x0023
            r1 = 26
            goto L_0x0004
        L_0x0023:
            int r1 = r0 + 1
            byte r0 = r14.u3(r0)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x0004
        L_0x002d:
            r10 = 44
            if (r1 == r10) goto L_0x0033
            r0 = 0
            return r0
        L_0x0033:
            boolean r1 = r14.A3(r0)
            if (r1 == 0) goto L_0x003d
            r1 = r0
        L_0x003a:
            r0 = 26
            goto L_0x0043
        L_0x003d:
            int r1 = r0 + 1
            byte r0 = r14.u3(r0)
        L_0x0043:
            if (r0 == 0) goto L_0x0063
            if (r0 > r8) goto L_0x004f
            long r10 = r6 << r0
            long r10 = r10 & r4
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x004f
            goto L_0x0063
        L_0x004f:
            r2 = 1
            if (r0 >= 0) goto L_0x0056
            r14.s3(r0, r1)
            return r2
        L_0x0056:
            r14.c = r1
            char r1 = (char) r0
            r14.d = r1
            r1 = 47
            if (r0 != r1) goto L_0x0062
            r14.a3()
        L_0x0062:
            return r2
        L_0x0063:
            boolean r0 = r14.A3(r1)
            if (r0 == 0) goto L_0x006a
            goto L_0x003a
        L_0x006a:
            int r0 = r1 + 1
            byte r1 = r14.u3(r1)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.w1():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final p7h w2() {
        if (l1()) {
            try {
                p7h B = DateUtils.B(v3(this.c, 9), this.c);
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

    public final String w3(int i, int i2) {
        if (opf.ANDROID_SDK_INT >= 34) {
            return new String(v3(i, i2), i, i2, StandardCharsets.ISO_8859_1);
        }
        char[] cArr = this.H;
        if (cArr == null) {
            cArr = JSONFactory.r.getAndSet(this.I, null);
            this.H = cArr;
        }
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
            this.H = cArr;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) (u3(i + i3) & 255);
        }
        return new String(cArr, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[LOOP:0: B:25:0x0062->B:31:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0079 -> B:23:0x0059). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x1() {
        /*
            r9 = this;
            int r0 = r9.c
            char r1 = r9.d
            r2 = 73
            if (r1 != r2) goto L_0x008d
            int r1 = r0 + 6
            boolean r2 = r9.t3(r1)
            if (r2 != 0) goto L_0x008d
            byte r2 = r9.u3(r0)
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 != r3) goto L_0x008d
            int r2 = r0 + 1
            byte r2 = r9.u3(r2)
            r4 = 102(0x66, float:1.43E-43)
            if (r2 != r4) goto L_0x008d
            int r2 = r0 + 2
            byte r2 = r9.u3(r2)
            r4 = 105(0x69, float:1.47E-43)
            if (r2 != r4) goto L_0x008d
            int r2 = r0 + 3
            byte r2 = r9.u3(r2)
            if (r2 != r3) goto L_0x008d
            int r2 = r0 + 4
            byte r2 = r9.u3(r2)
            if (r2 != r4) goto L_0x008d
            int r2 = r0 + 5
            byte r2 = r9.u3(r2)
            r3 = 116(0x74, float:1.63E-43)
            if (r2 != r3) goto L_0x008d
            byte r1 = r9.u3(r1)
            r2 = 121(0x79, float:1.7E-43)
            if (r1 != r2) goto L_0x008d
            int r1 = r0 + 7
            boolean r2 = r9.A3(r1)
            r3 = 26
            if (r2 == 0) goto L_0x005c
            r0 = r1
        L_0x0059:
            r1 = 26
            goto L_0x0062
        L_0x005c:
            int r0 = r0 + 8
            byte r1 = r9.u3(r1)
        L_0x0062:
            r2 = 32
            if (r1 > r2) goto L_0x0086
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0086
            boolean r1 = r9.A3(r0)
            if (r1 == 0) goto L_0x007c
            goto L_0x0059
        L_0x007c:
            int r1 = r0 + 1
            byte r0 = r9.u3(r0)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0062
        L_0x0086:
            r9.c = r0
            char r0 = (char) r1
            r9.d = r0
            r0 = 1
            return r0
        L_0x008d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.x1():boolean");
    }

    public byte[] x3() {
        return Arrays.copyOf(this.G, this.E);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h y2() {
        boolean z;
        if (l1()) {
            q7h F = DateUtils.F(v3(this.c, 12), this.c);
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

    public final boolean y3(int i) {
        if (this.F && i >= this.x) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[LOOP:1: B:18:0x0041->B:32:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0038 A[EDGE_INSN: B:41:0x0038->B:16:0x0038 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0065 -> B:17:0x0038). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z1(char r15) {
        /*
            r14 = this;
            int r0 = r14.c
            char r1 = r14.d
        L_0x0004:
            r2 = 0
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            r6 = 1
            r8 = 32
            r9 = 26
            if (r1 > r8) goto L_0x002d
            long r10 = r6 << r1
            long r10 = r10 & r4
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x002d
            boolean r1 = r14.A3(r0)
            if (r1 == 0) goto L_0x0023
            r1 = 26
            goto L_0x0004
        L_0x0023:
            int r1 = r0 + 1
            byte r0 = r14.u3(r0)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x0004
        L_0x002d:
            if (r1 == r15) goto L_0x0031
            r15 = 0
            return r15
        L_0x0031:
            boolean r15 = r14.A3(r0)
            if (r15 == 0) goto L_0x003b
            r15 = r0
        L_0x0038:
            r0 = 26
            goto L_0x0041
        L_0x003b:
            int r15 = r0 + 1
            byte r0 = r14.u3(r0)
        L_0x0041:
            if (r0 == 0) goto L_0x0061
            if (r0 > r8) goto L_0x004d
            long r10 = r6 << r0
            long r10 = r10 & r4
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x004d
            goto L_0x0061
        L_0x004d:
            r1 = 1
            if (r0 >= 0) goto L_0x0054
            r14.s3(r0, r15)
            return r1
        L_0x0054:
            r14.c = r15
            char r15 = (char) r0
            r14.d = r15
            r15 = 47
            if (r0 != r15) goto L_0x0060
            r14.a3()
        L_0x0060:
            return r1
        L_0x0061:
            boolean r0 = r14.A3(r15)
            if (r0 == 0) goto L_0x0068
            goto L_0x0038
        L_0x0068:
            int r0 = r15 + 1
            byte r15 = r14.u3(r15)
            r13 = r0
            r0 = r15
            r15 = r13
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.z1(char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final q7h z2() {
        boolean z;
        if (l1()) {
            q7h H = DateUtils.H(v3(this.c, 14), this.c);
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

    public void z3() {
        t1();
        if (this.d == '/') {
            a3();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010d, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E3() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.E3():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long P0() {
        int i;
        char c;
        int i2;
        char c2;
        char c3;
        byte u3;
        long j;
        long j2;
        byte u32;
        int i3 = this.z;
        int i4 = 0;
        long j3 = 0;
        while (true) {
            i = 32;
            if (!t3(i3)) {
                int u33 = u3(i3);
                if (u33 == 92) {
                    int i5 = i3 + 1;
                    byte u34 = u3(i5);
                    if (u34 == 117) {
                        i3 += 5;
                        u33 = JSONReader.Z(u3(i3 + 2), u3(i3 + 3), u3(i3 + 4), u3(i3));
                    } else if (u34 != 120) {
                        u33 = F(u34);
                        i3 = i5;
                    } else {
                        i3 += 3;
                        u33 = JSONReader.L(u3(i3 + 2), u3(i3));
                    }
                } else if (u33 == -61 || u33 == -62) {
                    i3++;
                    u33 = ((u33 & 31) << 6) | (u3(i3) & 63);
                } else if (u33 == 34) {
                }
                if (i4 < 8 && u33 <= 255 && u33 >= 0 && (i4 != 0 || u33 != 0)) {
                    if ((u33 != 95 && u33 != 45 && u33 != 32) || (u32 = u3(i3 + 1)) == 34 || u32 == 39 || u32 == u33) {
                        if (u33 >= 65 && u33 <= 90) {
                            u33 = (char) (u33 + 32);
                        }
                        switch (i4) {
                            case 0:
                                j3 = (byte) u33;
                                break;
                            case 1:
                                j = ((byte) u33) << 8;
                                j2 = 255;
                                j3 = (j3 & j2) + j;
                                break;
                            case 2:
                                j = ((byte) u33) << 16;
                                j2 = 65535;
                                j3 = (j3 & j2) + j;
                                break;
                            case 3:
                                j = ((byte) u33) << 24;
                                j2 = 16777215;
                                j3 = (j3 & j2) + j;
                                break;
                            case 4:
                                j = ((byte) u33) << 32;
                                j2 = tiv.INT_MASK;
                                j3 = (j3 & j2) + j;
                                break;
                            case 5:
                                j = ((byte) u33) << 40;
                                j2 = 1099511627775L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 6:
                                j = ((byte) u33) << 48;
                                j2 = 281474976710655L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 7:
                                j = ((byte) u33) << 56;
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
        if (j3 != 0) {
            return j3;
        }
        boolean z = this.C;
        long j4 = ls9.MAGIC_HASH_CODE;
        if (!z || this.f) {
            while (true) {
                int u35 = u3(i3);
                if (u35 == 92) {
                    int i6 = i3 + 1;
                    byte u36 = u3(i6);
                    if (u36 == 117) {
                        i6 = i3 + 5;
                        c3 = JSONReader.Z(u3(i3 + 2), u3(i3 + 3), u3(i3 + 4), u3(i6));
                    } else if (u36 != 120) {
                        c2 = F(u36);
                        i3 = i6 + 1;
                        c = c2;
                    } else {
                        i6 = i3 + 3;
                        c3 = JSONReader.L(u3(i3 + 2), u3(i6));
                    }
                    c2 = c3;
                    i3 = i6 + 1;
                    c = c2;
                } else {
                    int i7 = u35;
                    i7 = u35;
                    if (u35 == 34) {
                        return j4;
                    }
                    if (u35 >= 0) {
                        if (u35 >= 65 && u35 <= 90) {
                            i7 = u35 + 32;
                        }
                        i3++;
                        i2 = i7;
                    } else {
                        switch ((u35 & 255) >> 4) {
                            case 12:
                            case 13:
                                i3 += 2;
                                i2 = ((u35 & 31) << 6) | (u3(i3 + 1) & 63);
                                break;
                            case 14:
                                int u37 = u3(i3 + 1);
                                i3 += 3;
                                i2 = ((u35 & 15) << 12) | ((u37 & 63) << 6) | (u3(i3 + 2) & 63);
                                break;
                            default:
                                throw new JSONException("malformed input around byte " + i3);
                        }
                    }
                    c = i2;
                }
                if (c != 95 && c != 45) {
                    if (c != 32) {
                        j4 = ((c == 1 ? 1L : 0L) ^ j4) * ls9.MAGIC_PRIME;
                    }
                }
            }
        } else {
            int i8 = this.z;
            while (i8 < this.A) {
                int u38 = u3(i8);
                if (u38 >= 65 && u38 <= 90) {
                    u38 += 32;
                }
                if ((u38 != 95 && u38 != 45 && u38 != i) || (u3 = u3(i8 + 1)) == 34 || u3 == 39 || u3 == u38) {
                    j4 = (u38 ^ j4) * ls9.MAGIC_PRIME;
                }
                i8++;
                i = 32;
            }
            return j4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c A[LOOP:7: B:62:0x0126->B:67:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0139 -> B:60:0x011d). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.UUID U2() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.U2():java.util.UUID");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0256, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        r9 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cc A[LOOP:2: B:85:0x01bc->B:90:0x01cc, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0181 -> B:69:0x0182). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0197 -> B:66:0x0178). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01d5 -> B:85:0x01bb). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long V2() {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.V2():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
        if (r0 == 69) goto L_0x00fc;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0342 A[LOOP:3: B:214:0x0331->B:219:0x0342, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[LOOP:0: B:25:0x0061->B:38:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x02f0 -> B:197:0x02f4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x030c -> B:193:0x02e7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x034b -> B:213:0x0330). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.math.BigDecimal W1() {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.W1():java.math.BigDecimal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x043a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x03df -> B:199:0x03e0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:204:0x03f8 -> B:196:0x03d6). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long h2() {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.h2():long");
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

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        if (r5 < (-214748364)) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
        if (r5 < (-214748364)) goto L_0x011c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0188, code lost:
        if (r7 == 69) goto L_0x018a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[LOOP:0: B:13:0x0049->B:18:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0056 -> B:11:0x0040). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x0333 -> B:176:0x0305). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x033c -> B:176:0x0305). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L2() {
        /*
            Method dump skipped, instructions count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.L2():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f A[LOOP:0: B:70:0x0106->B:76:0x011f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x011c -> B:68:0x00fc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0143 -> B:87:0x0144). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0151 -> B:84:0x013a). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a2() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.a2():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x02f4, code lost:
        if (r1.j != false) goto L_0x02f6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02f6, code lost:
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x030a, code lost:
        if (r1.j != false) goto L_0x02f6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[LOOP:0: B:13:0x003b->B:18:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4 A[LOOP:1: B:31:0x008c->B:42:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0189  */
    /* JADX WARN: Type inference failed for: r2v0, types: [char] */
    /* JADX WARN: Type inference failed for: r2v39, types: [char] */
    /* JADX WARN: Type inference failed for: r2v44, types: [char] */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Unknown variable types count: 3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:11:0x0032). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0366 -> B:217:0x035d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:222:0x036f -> B:217:0x035d). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double f2() {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.f2():double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0317, code lost:
        if (r3 != 26) goto L_0x031b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0319, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x031b, code lost:
        r1 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031d, code lost:
        r25.A = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0321, code lost:
        if (r3 > 32) goto L_0x033f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x032b, code lost:
        if (((1 << r3) & 4294981376L) == 0) goto L_0x033f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0331, code lost:
        if (A3(r2) == false) goto L_0x0336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0333, code lost:
        r3 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0336, code lost:
        r2 = r2 + 1;
        r3 = u3(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i2() {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.i2():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e2, code lost:
        if (r26.j != false) goto L_0x02e4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02e4, code lost:
        r15 = -r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02f5, code lost:
        if (r26.j != false) goto L_0x02e4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[LOOP:0: B:13:0x003a->B:18:0x004a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[LOOP:1: B:31:0x008b->B:42:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [char] */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v39, types: [char] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v44, types: [char] */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Unknown variable types count: 3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0047 -> B:11:0x0031). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x034c -> B:205:0x0343). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:210:0x0355 -> B:205:0x0343). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float l2() {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.a.l2():float");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final String a1(String str) {
        char c;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            c = '\n';
            if (i >= this.c || t3(i)) {
                break;
            }
            if (u3(i) == 10) {
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
        return sb.toString();
    }

    public final void s3(int i, int i2) {
        int i3;
        int i4;
        int i5 = i & 255;
        switch (i5 >> 4) {
            case 12:
            case 13:
                int i6 = i2 + 1;
                int p3 = p3(i5, u3(i2), i6);
                i3 = i6;
                i4 = p3;
                break;
            case 14:
                i4 = q3(i5, u3(i2), u3(i2 + 1), i2);
                i3 = i2 + 2;
                break;
            default:
                if ((i >> 3) == -2) {
                    i4 = (((i << 18) ^ (u3(i2) << 12)) ^ (u3(i2 + 1) << 6)) ^ (3678080 ^ u3(i2 + 2));
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
