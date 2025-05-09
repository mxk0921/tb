package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class e2l extends b2l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536669);
    }

    public e2l() {
        super(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(e2l e2lVar, String str, Object... objArr) {
        if (str.hashCode() == -1012032831) {
            return super.i((r2g) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/state/single/OpenArchStateSingleComponentDestroy");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // tb.b2l, tb.mic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.e2g<tb.kzk> i(tb.r2g r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.e2l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "c3ad9ac1"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r7
            java.lang.Object r7 = r0.ipc$dispatch(r1, r2)
            tb.e2g r7 = (tb.e2g) r7
            return r7
        L_0x0018:
            java.lang.String r0 = "intent"
            tb.ckf.g(r7, r0)
            r6.b(r7)
            java.lang.String r0 = r6.a()
            r1 = 0
            if (r0 == 0) goto L_0x002e
            tb.a2l r2 = tb.a2l.INSTANCE
            tb.oyk r0 = r2.g(r0)
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            if (r0 == 0) goto L_0x0055
            tb.h2g r2 = r0.g()
            if (r2 == 0) goto L_0x0043
            tb.i2g r2 = r2.l()
            boolean r3 = r2 instanceof tb.gyk
            if (r3 != 0) goto L_0x0040
            r2 = r1
        L_0x0040:
            tb.gyk r2 = (tb.gyk) r2
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            if (r2 == 0) goto L_0x0055
            tb.iyk r2 = r2.g()
            if (r2 == 0) goto L_0x0055
            int r2 = r2.a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0056
        L_0x0055:
            r2 = r1
        L_0x0056:
            tb.a2l r3 = tb.a2l.INSTANCE
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r6.a()
            r4.append(r5)
            r5 = 40
            r4.append(r5)
            if (r0 == 0) goto L_0x0073
            boolean r1 = r0.m()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x0073:
            r4.append(r1)
            java.lang.String r1 = ")("
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = ")组件销毁：Single Component Destroy"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.o(r6, r1)
            if (r0 == 0) goto L_0x008f
            r3.q(r0)
        L_0x008f:
            tb.e2g r7 = super.i(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e2l.i(tb.r2g):tb.e2g");
    }

    @Override // tb.b2l, tb.mic
    public void r(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7bcfe5", new Object[]{this, r2gVar});
        } else {
            ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        }
    }
}
