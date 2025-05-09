package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class d2l extends b2l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536668);
    }

    public d2l() {
        super(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(d2l d2lVar, String str, Object... objArr) {
        if (str.hashCode() == -1012032831) {
            return super.i((r2g) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/state/single/OpenArchStateSingleComponentCreated");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    @Override // tb.b2l, tb.mic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.e2g<tb.kzk> i(tb.r2g r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.d2l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "c3ad9ac1"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            r3 = 1
            r2[r3] = r8
            java.lang.Object r8 = r0.ipc$dispatch(r1, r2)
            tb.e2g r8 = (tb.e2g) r8
            return r8
        L_0x0018:
            java.lang.String r0 = "intent"
            tb.ckf.g(r8, r0)
            java.lang.String r0 = r7.a()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            tb.a2l r2 = tb.a2l.INSTANCE
            tb.oyk r0 = r2.g(r0)
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x0052
            tb.h2g r2 = r0.g()
            if (r2 == 0) goto L_0x0040
            tb.i2g r2 = r2.l()
            boolean r3 = r2 instanceof tb.gyk
            if (r3 != 0) goto L_0x003d
            r2 = r1
        L_0x003d:
            tb.gyk r2 = (tb.gyk) r2
            goto L_0x0041
        L_0x0040:
            r2 = r1
        L_0x0041:
            if (r2 == 0) goto L_0x0052
            tb.iyk r2 = r2.g()
            if (r2 == 0) goto L_0x0052
            int r2 = r2.a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0053
        L_0x0052:
            r2 = r1
        L_0x0053:
            tb.a2l r3 = tb.a2l.INSTANCE
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r7.a()
            r4.append(r5)
            r5 = 40
            r4.append(r5)
            if (r0 == 0) goto L_0x0070
            boolean r1 = r0.m()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x0070:
            r4.append(r1)
            java.lang.String r1 = ")("
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = ")组件创建：Single Component Created"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.o(r7, r1)
            tb.pus r1 = tb.pus.INSTANCE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "OpenArchStateSingleComponentCreated: "
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "LiveEngine"
            java.lang.String r5 = ""
            r1.k(r4, r5, r3)
            if (r0 == 0) goto L_0x00e4
            tb.d2g r3 = r0.b()
            tb.cyk r3 = (tb.cyk) r3
            if (r3 == 0) goto L_0x00e4
            tb.fic r3 = r3.e()
            tb.f3d r3 = (tb.f3d) r3
            if (r3 == 0) goto L_0x00e4
            java.util.Map r6 = r8.b()
            r3.b(r6, r0)
            if (r2 != 0) goto L_0x00ba
            goto L_0x00c0
        L_0x00ba:
            int r2 = r2.intValue()
            if (r2 == 0) goto L_0x00d0
        L_0x00c0:
            boolean r2 = r0 instanceof tb.ryk
            if (r2 == 0) goto L_0x00d0
            r2 = r0
            tb.ryk r2 = (tb.ryk) r2
            tb.z5m r2 = r2.z()
            if (r2 == 0) goto L_0x00d0
            r2.B()
        L_0x00d0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "assembleInputCoreData start: "
            r2.<init>(r6)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.k(r4, r5, r2)
            r3.g(r8, r0)
        L_0x00e4:
            tb.e2g r8 = super.i(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.d2l.i(tb.r2g):tb.e2g");
    }
}
