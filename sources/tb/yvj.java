package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class yvj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856349);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        r2 = r6.get(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.yvj.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = "d7997411"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001a:
            if (r6 != 0) goto L_0x001d
            return r0
        L_0x001d:
            r2 = 0
            java.util.Set r3 = r6.keySet()     // Catch: Exception -> 0x0042
            java.util.Iterator r3 = r3.iterator()     // Catch: Exception -> 0x0042
        L_0x0026:
            boolean r4 = r3.hasNext()     // Catch: Exception -> 0x0042
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r3.next()     // Catch: Exception -> 0x0042
            java.lang.String r4 = (java.lang.String) r4     // Catch: Exception -> 0x0042
            java.lang.String r5 = "Accept"
            boolean r5 = r4.equalsIgnoreCase(r5)     // Catch: Exception -> 0x0042
            if (r5 == 0) goto L_0x0026
            java.lang.Object r6 = r6.get(r4)     // Catch: Exception -> 0x0042
            java.lang.String r6 = (java.lang.String) r6     // Catch: Exception -> 0x0042
            r2 = r6
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            if (r2 == 0) goto L_0x0053
            java.lang.String r6 = r2.toLowerCase()
            java.lang.String r2 = "text/html"
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L_0x0053
            r0 = 1
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yvj.a(java.util.Map):boolean");
    }
}
