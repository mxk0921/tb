package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g91 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Boolean f19792a;

    static {
        t2o.a(398458886);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r5, boolean r6) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "/atools"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.g91.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0023
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r5
            r6[r0] = r2
            java.lang.String r5 = "95d84ff9"
            java.lang.Object r5 = r3.ipc$dispatch(r5, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0023:
            java.lang.Boolean r3 = tb.g91.f19792a
            if (r3 == 0) goto L_0x0029
            if (r6 == 0) goto L_0x0096
        L_0x0029:
            java.io.File r3 = new java.io.File     // Catch: all -> 0x004e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x004e
            r4.<init>()     // Catch: all -> 0x004e
            java.io.File r5 = r5.getFilesDir()     // Catch: all -> 0x004e
            r4.append(r5)     // Catch: all -> 0x004e
            r4.append(r2)     // Catch: all -> 0x004e
            java.lang.String r5 = r4.toString()     // Catch: all -> 0x004e
            r3.<init>(r5)     // Catch: all -> 0x004e
            boolean r5 = r3.exists()     // Catch: all -> 0x004e
            if (r5 != 0) goto L_0x0050
            boolean r5 = r3.mkdirs()     // Catch: all -> 0x004e
            if (r5 == 0) goto L_0x008e
            goto L_0x0050
        L_0x004e:
            r5 = move-exception
            goto L_0x0083
        L_0x0050:
            java.io.File r5 = new java.io.File     // Catch: all -> 0x004e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x004e
            r2.<init>()     // Catch: all -> 0x004e
            r2.append(r3)     // Catch: all -> 0x004e
            java.lang.String r3 = "/app_lch.file"
            r2.append(r3)     // Catch: all -> 0x004e
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x004e
            r5.<init>(r2)     // Catch: all -> 0x004e
            java.lang.Boolean r2 = tb.g91.f19792a     // Catch: all -> 0x004e
            if (r2 != 0) goto L_0x0075
            boolean r2 = r5.exists()     // Catch: all -> 0x004e
            r0 = r0 ^ r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: all -> 0x004e
            tb.g91.f19792a = r0     // Catch: all -> 0x004e
        L_0x0075:
            java.lang.Boolean r0 = tb.g91.f19792a     // Catch: all -> 0x004e
            boolean r0 = r0.booleanValue()     // Catch: all -> 0x004e
            if (r0 == 0) goto L_0x008e
            if (r6 == 0) goto L_0x008e
            r5.createNewFile()     // Catch: all -> 0x004e
            goto L_0x008e
        L_0x0083:
            tb.l2u r6 = tb.l2u.instance
            java.lang.String r0 = "appFirstLaunch err"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "AppSwitcher"
            r6.d(r2, r0, r5, r1)
        L_0x008e:
            java.lang.Boolean r5 = tb.g91.f19792a
            if (r5 != 0) goto L_0x0096
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            tb.g91.f19792a = r5
        L_0x0096:
            java.lang.Boolean r5 = tb.g91.f19792a
            boolean r5 = r5.booleanValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g91.a(android.content.Context, boolean):boolean");
    }
}
