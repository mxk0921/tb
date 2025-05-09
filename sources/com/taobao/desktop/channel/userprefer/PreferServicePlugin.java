package com.taobao.desktop.channel.userprefer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PreferServicePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_PREFER_BRIDGE = "TBPLUserPreferenceBridge";

    static {
        t2o.a(435159133);
    }

    public static /* synthetic */ Object ipc$super(PreferServicePlugin preferServicePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/userprefer/PreferServicePlugin");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:6:0x0022, B:11:0x0031, B:16:0x003d, B:23:0x004e, B:24:0x0059, B:26:0x0063, B:28:0x0074), top: B:32:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:6:0x0022, B:11:0x0031, B:16:0x003d, B:23:0x004e, B:24:0x0059, B:26:0x0063, B:28:0x0074), top: B:32:0x0022 }] */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r6, java.lang.String r7, android.taobao.windvane.jsbridge.WVCallBackContext r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.desktop.channel.userprefer.PreferServicePlugin.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = "bcd41fd1"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            r6 = 3
            r4[r6] = r8
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x0022:
            int r2 = r6.hashCode()     // Catch: all -> 0x003b
            r3 = 3545755(0x361a9b, float:4.968661E-39)
            if (r2 == r3) goto L_0x003d
            r3 = 801071086(0x2fbf5fee, float:3.481086E-10)
            if (r2 == r3) goto L_0x0031
            goto L_0x0048
        L_0x0031:
            java.lang.String r2 = "checkNewDevice"
            boolean r6 = r6.equals(r2)     // Catch: all -> 0x003b
            if (r6 == 0) goto L_0x0048
            r6 = 1
            goto L_0x0049
        L_0x003b:
            r6 = move-exception
            goto L_0x0078
        L_0x003d:
            java.lang.String r2 = "sync"
            boolean r6 = r6.equals(r2)     // Catch: all -> 0x003b
            if (r6 == 0) goto L_0x0048
            r6 = 0
            goto L_0x0049
        L_0x0048:
            r6 = -1
        L_0x0049:
            if (r6 == 0) goto L_0x0059
            if (r6 == r0) goto L_0x004e
            goto L_0x0062
        L_0x004e:
            android.content.Context r6 = r5.mContext     // Catch: all -> 0x003b
            tb.ekz r6 = tb.ekz.d(r6)     // Catch: all -> 0x003b
            boolean r6 = r6.c()     // Catch: all -> 0x003b
            goto L_0x0063
        L_0x0059:
            android.content.Context r6 = r5.mContext     // Catch: all -> 0x003b
            tb.ekz r6 = tb.ekz.d(r6)     // Catch: all -> 0x003b
            r6.o(r7)     // Catch: all -> 0x003b
        L_0x0062:
            r6 = 1
        L_0x0063:
            tb.nsw r7 = new tb.nsw     // Catch: all -> 0x003b
            r7.<init>()     // Catch: all -> 0x003b
            java.lang.String r2 = "result"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: all -> 0x003b
            r7.b(r2, r6)     // Catch: all -> 0x003b
            if (r8 == 0) goto L_0x0077
            r8.success(r7)     // Catch: all -> 0x003b
        L_0x0077:
            return r0
        L_0x0078:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "[PreferControl] PreferServicePlugin error: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            tb.ggh.d(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.userprefer.PreferServicePlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
