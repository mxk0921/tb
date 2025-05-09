package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sks extends tls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@and(";
    public static final int SUB_INDEX = 5;

    static {
        t2o.a(329252945);
    }

    public static /* synthetic */ Object ipc$super(sks sksVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/operator/TSAndOperator");
    }

    @Override // tb.tls
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ada0f062", new Object[]{this})).intValue();
        }
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049 A[SYNTHETIC] */
    @Override // tb.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(tb.wp8 r5) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.sks.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = "f75136"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            return r5
        L_0x0016:
            java.util.List<java.lang.Object> r1 = r4.f28789a
            if (r1 == 0) goto L_0x004f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0021
            goto L_0x004f
        L_0x0021:
            java.util.List<java.lang.Object> r1 = r4.f28789a
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r1.next()
            java.lang.Object r2 = r5.l(r2)
            if (r2 != 0) goto L_0x0038
            goto L_0x0046
        L_0x0038:
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x0045
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: all -> 0x0045
            boolean r2 = r2.booleanValue()     // Catch: all -> 0x0045
            goto L_0x0047
        L_0x0045:
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r2 != 0) goto L_0x0027
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x004c:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L_0x004f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sks.c(tb.wp8):java.lang.Object");
    }
}
