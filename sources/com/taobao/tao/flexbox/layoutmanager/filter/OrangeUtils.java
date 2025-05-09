package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import tb.nwv;
import tb.od0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class OrangeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317248);
    }

    @FilterHandler(name = "int")
    public static int Int(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88beecef", new Object[]{str, obj})).intValue();
        }
        return nwv.t(od0.D().g().b(str, obj), nwv.t(obj, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:6:0x0016, B:13:0x002a, B:18:0x0036, B:21:0x0041, B:29:0x0054, B:31:0x0067, B:33:0x007a), top: B:37:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.String r5, java.util.List r6) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.filter.OrangeUtils.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0016
            java.lang.String r4 = "a0cdb2ad"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r5 = r3.ipc$dispatch(r4, r2)
            return r5
        L_0x0016:
            int r3 = r5.hashCode()     // Catch: all -> 0x0034
            r4 = 102230(0x18f56, float:1.43255E-40)
            if (r3 == r4) goto L_0x0041
            r4 = 104431(0x197ef, float:1.46339E-40)
            if (r3 == r4) goto L_0x0036
            r4 = 3029738(0x2e3aea, float:4.245567E-39)
            if (r3 == r4) goto L_0x002a
            goto L_0x004c
        L_0x002a:
            java.lang.String r3 = "bool"
            boolean r3 = r5.equals(r3)     // Catch: all -> 0x0034
            if (r3 == 0) goto L_0x004c
            r3 = 1
            goto L_0x004d
        L_0x0034:
            r6 = move-exception
            goto L_0x0089
        L_0x0036:
            java.lang.String r3 = "int"
            boolean r3 = r5.equals(r3)     // Catch: all -> 0x0034
            if (r3 == 0) goto L_0x004c
            r3 = 2
            goto L_0x004d
        L_0x0041:
            java.lang.String r3 = "get"
            boolean r3 = r5.equals(r3)     // Catch: all -> 0x0034
            if (r3 == 0) goto L_0x004c
            r3 = 0
            goto L_0x004d
        L_0x004c:
            r3 = -1
        L_0x004d:
            if (r3 == 0) goto L_0x007a
            if (r3 == r0) goto L_0x0067
            if (r3 == r2) goto L_0x0054
            goto L_0x00a3
        L_0x0054:
            java.lang.Object r1 = r6.get(r1)     // Catch: all -> 0x0034
            java.lang.String r1 = (java.lang.String) r1     // Catch: all -> 0x0034
            java.lang.Object r6 = r6.get(r0)     // Catch: all -> 0x0034
            int r6 = Int(r1, r6)     // Catch: all -> 0x0034
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch: all -> 0x0034
            return r5
        L_0x0067:
            java.lang.Object r1 = r6.get(r1)     // Catch: all -> 0x0034
            java.lang.String r1 = (java.lang.String) r1     // Catch: all -> 0x0034
            java.lang.Object r6 = r6.get(r0)     // Catch: all -> 0x0034
            boolean r6 = bool(r1, r6)     // Catch: all -> 0x0034
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch: all -> 0x0034
            return r5
        L_0x007a:
            java.lang.Object r1 = r6.get(r1)     // Catch: all -> 0x0034
            java.lang.String r1 = (java.lang.String) r1     // Catch: all -> 0x0034
            java.lang.Object r6 = r6.get(r0)     // Catch: all -> 0x0034
            java.lang.String r5 = get(r1, r6)     // Catch: all -> 0x0034
            return r5
        L_0x0089:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "error:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r6.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "config.filter"
            tb.tfs.e(r6, r5)
        L_0x00a3:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.filter.OrangeUtils.a(java.lang.String, java.util.List):java.lang.Object");
    }

    @FilterHandler(name = "bool")
    public static boolean bool(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d159911b", new Object[]{str, obj})).booleanValue();
        }
        return nwv.o(od0.D().g().b(str, obj), nwv.o(obj, false));
    }

    @FilterHandler(name = "get")
    public static String get(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae58c17d", new Object[]{str, obj});
        }
        return nwv.I(od0.D().g().b(str, obj), String.valueOf(obj));
    }
}
