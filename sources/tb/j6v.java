package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class j6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886319);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T a(java.lang.String r4, java.lang.String r5, java.lang.String r6, T r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.j6v.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = "9f72f354"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r6
            r4 = 3
            r2[r4] = r7
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            return r4
        L_0x001c:
            com.alibaba.ut.abtest.VariationSet r0 = com.alibaba.ut.abtest.UTABTest.activate(r4, r5)
            com.alibaba.ut.abtest.Variation r0 = r0.getVariation(r6)
            if (r0 != 0) goto L_0x0027
            return r7
        L_0x0027:
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: Exception -> 0x003c
            java.lang.String r0 = r0.getValueAsString(r1)     // Catch: Exception -> 0x003c
            boolean r1 = r7 instanceof java.lang.Boolean     // Catch: Exception -> 0x003c
            if (r1 == 0) goto L_0x003e
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: Exception -> 0x003c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: Exception -> 0x003c
            goto L_0x0078
        L_0x003c:
            r0 = move-exception
            goto L_0x0079
        L_0x003e:
            boolean r1 = r7 instanceof java.lang.Integer     // Catch: Exception -> 0x003c
            if (r1 == 0) goto L_0x004b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: Exception -> 0x003c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: Exception -> 0x003c
            goto L_0x0078
        L_0x004b:
            boolean r1 = r7 instanceof java.lang.Long     // Catch: Exception -> 0x003c
            if (r1 == 0) goto L_0x0058
            long r0 = java.lang.Long.parseLong(r0)     // Catch: Exception -> 0x003c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: Exception -> 0x003c
            goto L_0x0078
        L_0x0058:
            boolean r1 = r7 instanceof java.lang.Float     // Catch: Exception -> 0x003c
            if (r1 == 0) goto L_0x0065
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: Exception -> 0x003c
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: Exception -> 0x003c
            goto L_0x0078
        L_0x0065:
            boolean r1 = r7 instanceof java.lang.Double     // Catch: Exception -> 0x003c
            if (r1 == 0) goto L_0x0072
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: Exception -> 0x003c
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: Exception -> 0x003c
            goto L_0x0078
        L_0x0072:
            boolean r4 = r7 instanceof java.lang.String     // Catch: Exception -> 0x003c
            if (r4 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            return r0
        L_0x0079:
            java.lang.String r1 = "Ultron"
            tb.xh8 r1 = tb.xh8.a(r1)
            java.lang.String r2 = "UltronABTest#获取实验出错"
            tb.xh8 r1 = r1.c(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "#"
            r2.append(r4)
            r2.append(r5)
            r2.append(r4)
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = r0.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            tb.xh8 r4 = r1.message(r4)
            tb.f9v.q(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j6v.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
