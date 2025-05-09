package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class f8z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int NANO_MAGIC = 1330528590;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598737440);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737439);
        t2o.a(598737449);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.onz<tb.g8z, java.lang.String> a(byte[] r21, int r22, int r23) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = tb.f8z.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x002e
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r2)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r20
            r2[r3] = r0
            r0 = 2
            r2[r0] = r6
            r0 = 3
            r2[r0] = r1
            java.lang.String r0 = "6a0e389e"
            java.lang.Object r0 = r5.ipc$dispatch(r0, r2)
            tb.onz r0 = (tb.onz) r0
            return r0
        L_0x002e:
            java.lang.String r5 = "data"
            tb.ckf.g(r0, r5)
            tb.d0z r5 = new tb.d0z
            int r2 = r2 + r1
            r5.<init>(r0, r1, r2)
            int r0 = r5.k()
            r1 = 1330528590(0x4f4e414e, float:3.4603863E9)
            if (r0 == r1) goto L_0x005b
            tb.onz r0 = new tb.onz
            tb.g8z r1 = new tb.g8z
            java.util.List r11 = tb.yz3.i()
            java.lang.String r8 = ""
            r9 = 0
            r6 = 0
            r7 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r11, r12)
            java.lang.String r2 = "Magic not match"
            r0.<init>(r4, r1, r2)
            return r0
        L_0x005b:
            byte r6 = r5.d()
            short r7 = r5.g()
            java.lang.String r8 = r5.v()
            long r9 = r5.p()
            byte r0 = r5.d()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L_0x0086
            tb.onz r0 = new tb.onz
            tb.g8z r1 = new tb.g8z
            java.util.List r11 = tb.yz3.i()
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r11, r12)
            java.lang.String r2 = "Section count is 0"
            r0.<init>(r4, r1, r2)
            return r0
        L_0x0086:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r0 <= 0) goto L_0x00a4
        L_0x008d:
            int r4 = r4 + r3
            int r1 = r5.c()
            int r2 = r5.k()
            int r12 = r5.m()
            tb.pnz r13 = new tb.pnz
            r13.<init>(r1, r2, r12)
            r11.add(r13)
            if (r4 < r0) goto L_0x008d
        L_0x00a4:
            tb.g8z r16 = new tb.g8z
            r12 = 0
            r5 = r16
            r5.<init>(r6, r7, r8, r9, r11, r12)
            tb.onz r0 = new tb.onz
            r15 = 0
            r17 = 0
            r18 = 4
            r19 = 0
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            tb.ciz$a r1 = tb.ciz.Companion
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x00d0
            tb.iiz$a r1 = tb.iiz.Companion
            java.lang.String r2 = "HEADER_SECTION "
            java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r0)
            java.lang.String r2 = tb.ckf.p(r2, r3)
            r1.p(r2)
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f8z.a(byte[], int, int):tb.onz");
    }
}
