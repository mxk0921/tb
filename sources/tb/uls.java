package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uls extends tls {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = "@or(";
    public static final int c = 4;

    static {
        t2o.a(329252949);
    }

    public static /* synthetic */ Object ipc$super(uls ulsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/operator/TSOrOperator");
    }

    @Override // tb.tls
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ada0f062", new Object[]{this})).intValue();
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[SYNTHETIC] */
    @Override // tb.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(tb.wp8 r6) {
        /*
            r5 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.uls.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = "f75136"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r0 = 1
            r3[r0] = r6
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            return r6
        L_0x0016:
            java.util.List<java.lang.Object> r1 = r5.f28789a
            if (r1 == 0) goto L_0x0057
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0021
            goto L_0x0057
        L_0x0021:
            java.util.List<java.lang.Object> r1 = r5.f28789a
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r1.next()
            java.lang.Object r2 = r6.l(r2)
            if (r2 != 0) goto L_0x0038
            goto L_0x004e
        L_0x0038:
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x0045
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: all -> 0x0045
            boolean r2 = r2.booleanValue()     // Catch: all -> 0x0045
            goto L_0x004f
        L_0x0045:
            r2 = move-exception
            java.lang.String r3 = "TS.Operator"
            java.lang.String r4 = "parse value error in OR operator"
            tb.zdh.b(r3, r4, r2)
        L_0x004e:
            r2 = 0
        L_0x004f:
            if (r2 == 0) goto L_0x0027
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L_0x0054:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L_0x0057:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uls.c(tb.wp8):java.lang.Object");
    }
}
