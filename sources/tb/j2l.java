package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class j2l extends b2l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536674);
    }

    public j2l() {
        super(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(j2l j2lVar, String str, Object... objArr) {
        if (str.hashCode() == -1012032831) {
            return super.i((r2g) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/state/single/OpenArchStateSingleComponentTransition");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    @Override // tb.b2l, tb.mic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.e2g<tb.kzk> i(tb.r2g r10) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.j2l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "c3ad9ac1"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            r3 = 1
            r2[r3] = r10
            java.lang.Object r10 = r0.ipc$dispatch(r1, r2)
            tb.e2g r10 = (tb.e2g) r10
            return r10
        L_0x0018:
            java.lang.String r0 = "intent"
            tb.ckf.g(r10, r0)
            java.lang.String r0 = r9.a()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            tb.a2l r2 = tb.a2l.INSTANCE
            tb.oyk r0 = r2.g(r0)
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            java.util.Map r2 = r10.b()
            java.lang.String r3 = "isVisible"
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x003e
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L_0x003f
        L_0x003e:
            r2 = r1
        L_0x003f:
            java.util.Map r3 = r10.b()
            java.lang.String r4 = "currentRatio"
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x0050
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0051
        L_0x0050:
            r3 = r1
        L_0x0051:
            if (r3 == 0) goto L_0x005e
            java.lang.Double r3 = tb.rsq.k(r3)
            if (r3 == 0) goto L_0x005e
            double r3 = r3.doubleValue()
            goto L_0x0060
        L_0x005e:
            r3 = 0
        L_0x0060:
            if (r0 == 0) goto L_0x0086
            tb.h2g r5 = r0.g()
            if (r5 == 0) goto L_0x0074
            tb.i2g r5 = r5.l()
            boolean r6 = r5 instanceof tb.gyk
            if (r6 != 0) goto L_0x0071
            r5 = r1
        L_0x0071:
            tb.gyk r5 = (tb.gyk) r5
            goto L_0x0075
        L_0x0074:
            r5 = r1
        L_0x0075:
            if (r5 == 0) goto L_0x0086
            tb.iyk r5 = r5.g()
            if (r5 == 0) goto L_0x0086
            int r5 = r5.a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0087
        L_0x0086:
            r5 = r1
        L_0x0087:
            tb.a2l r6 = tb.a2l.INSTANCE
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r9.a()
            r7.append(r8)
            r8 = 40
            r7.append(r8)
            if (r0 == 0) goto L_0x00a4
            boolean r1 = r0.m()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x00a4:
            r7.append(r1)
            java.lang.String r1 = ")("
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = ")组件Transition | isVisible:"
            r7.append(r1)
            r7.append(r2)
            java.lang.String r1 = " currentRatio:"
            r7.append(r1)
            r7.append(r3)
            java.lang.String r1 = r7.toString()
            r6.o(r9, r1)
            boolean r0 = r0 instanceof tb.ryk
            tb.e2g r10 = super.i(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j2l.i(tb.r2g):tb.e2g");
    }
}
