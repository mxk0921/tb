package com.taobao.desktop.channel.desktoplinktask.floatwindow.jsbridge;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVFloatWindowPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WV_PLUGIN = "WVFloatWindowPlugin";

    static {
        t2o.a(435159085);
    }

    public static /* synthetic */ Object ipc$super(WVFloatWindowPlugin wVFloatWindowPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/desktoplinktask/floatwindow/jsbridge/WVFloatWindowPlugin");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #0 {all -> 0x0047, blocks: (B:6:0x0025, B:11:0x003c, B:16:0x004a, B:23:0x005b, B:25:0x0063, B:26:0x0089, B:27:0x00a9, B:28:0x00ad), top: B:32:0x0025 }] */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r7, java.lang.String r8, android.taobao.windvane.jsbridge.WVCallBackContext r9) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "package:"
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.desktop.channel.desktoplinktask.floatwindow.jsbridge.WVFloatWindowPlugin.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0025
            java.lang.String r2 = "bcd41fd1"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            r7 = 2
            r4[r7] = r8
            r7 = 3
            r4[r7] = r9
            java.lang.Object r7 = r3.ipc$dispatch(r2, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0025:
            tb.sd7 r8 = tb.sd7.d()     // Catch: all -> 0x0047
            android.app.Application r8 = r8.a()     // Catch: all -> 0x0047
            int r3 = r7.hashCode()     // Catch: all -> 0x0047
            r4 = -1546652743(0xffffffffa3cff3b9, float:-2.2546206E-17)
            if (r3 == r4) goto L_0x004a
            r4 = 1357998211(0x50f16883, float:3.24012667E10)
            if (r3 == r4) goto L_0x003c
            goto L_0x0055
        L_0x003c:
            java.lang.String r3 = "isPermissionOpen"
            boolean r7 = r7.equals(r3)     // Catch: all -> 0x0047
            if (r7 == 0) goto L_0x0055
            r7 = 0
            goto L_0x0056
        L_0x0047:
            r7 = move-exception
            goto L_0x00c4
        L_0x004a:
            java.lang.String r3 = "openPermission"
            boolean r7 = r7.equals(r3)     // Catch: all -> 0x0047
            if (r7 == 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x0055:
            r7 = -1
        L_0x0056:
            if (r7 == 0) goto L_0x00ad
            if (r7 == r0) goto L_0x005b
            goto L_0x00c3
        L_0x005b:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0047
            r3 = 23
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            if (r7 < r3) goto L_0x0089
            android.content.Intent r7 = new android.content.Intent     // Catch: all -> 0x0047
            java.lang.String r3 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x0047
            r5.<init>(r2)     // Catch: all -> 0x0047
            java.lang.String r8 = r8.getPackageName()     // Catch: all -> 0x0047
            r5.append(r8)     // Catch: all -> 0x0047
            java.lang.String r8 = r5.toString()     // Catch: all -> 0x0047
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: all -> 0x0047
            r7.<init>(r3, r8)     // Catch: all -> 0x0047
            r7.setFlags(r4)     // Catch: all -> 0x0047
            android.content.Context r8 = r6.getContext()     // Catch: all -> 0x0047
            r8.startActivity(r7)     // Catch: all -> 0x0047
            goto L_0x00a9
        L_0x0089:
            android.content.Intent r7 = new android.content.Intent     // Catch: all -> 0x0047
            java.lang.String r2 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r7.<init>(r2)     // Catch: all -> 0x0047
            java.lang.String r2 = "package"
            java.lang.String r8 = r8.getPackageName()     // Catch: all -> 0x0047
            r3 = 0
            android.net.Uri r8 = android.net.Uri.fromParts(r2, r8, r3)     // Catch: all -> 0x0047
            r7.setData(r8)     // Catch: all -> 0x0047
            r7.setFlags(r4)     // Catch: all -> 0x0047
            android.content.Context r8 = r6.getContext()     // Catch: all -> 0x0047
            r8.startActivity(r7)     // Catch: all -> 0x0047
        L_0x00a9:
            r9.success()     // Catch: all -> 0x0047
            goto L_0x00c3
        L_0x00ad:
            boolean r7 = tb.zd7.a(r8)     // Catch: all -> 0x0047
            tb.nsw r8 = new tb.nsw     // Catch: all -> 0x0047
            r8.<init>()     // Catch: all -> 0x0047
            java.lang.String r2 = "result"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: all -> 0x0047
            r8.a(r2, r7)     // Catch: all -> 0x0047
            r9.success(r8)     // Catch: all -> 0x0047
        L_0x00c3:
            return r0
        L_0x00c4:
            java.lang.String r8 = "WVFloatWindowPlugin.execute.error"
            tb.yv8.b(r8, r7)
            r9.error()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.desktoplinktask.floatwindow.jsbridge.WVFloatWindowPlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
