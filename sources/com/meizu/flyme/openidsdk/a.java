package com.meizu.flyme.openidsdk;

import android.content.BroadcastReceiver;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
final class a extends BroadcastReceiver {
    static {
        t2o.a(147849259);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r0 == 0) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (android.text.TextUtils.equals(r6.getStringExtra("openIdPackage"), r5.getPackageName()) != false) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
        r1 = true;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x008e
            if (r6 != 0) goto L_0x0006
            goto L_0x008e
        L_0x0006:
            java.lang.String r0 = "openIdNotifyFlag"
            r1 = 0
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r2 = "shouldUpdateId, notifyFlag : "
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.concat(r3)
            com.meizu.flyme.openidsdk.b.e(r2)
            r2 = 1
            if (r0 != r2) goto L_0x0032
            java.lang.String r0 = "openIdPackage"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r5 = r5.getPackageName()
            boolean r5 = android.text.TextUtils.equals(r0, r5)
            if (r5 == 0) goto L_0x004a
        L_0x0030:
            r1 = 1
            goto L_0x004a
        L_0x0032:
            r3 = 2
            if (r0 != r3) goto L_0x0047
            java.lang.String r0 = "openIdPackageList"
            java.util.ArrayList r0 = r6.getStringArrayListExtra(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.String r5 = r5.getPackageName()
            boolean r1 = r0.contains(r5)
            goto L_0x004a
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            goto L_0x0030
        L_0x004a:
            if (r1 != 0) goto L_0x004d
            return
        L_0x004d:
            java.lang.String r5 = "openIdType"
            java.lang.String r5 = r6.getStringExtra(r5)
            com.meizu.flyme.openidsdk.b r6 = com.meizu.flyme.openidsdk.b.a()
            java.lang.String r0 = "oaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0064
            tb.t3l r5 = r6.b
            goto L_0x0088
        L_0x0064:
            java.lang.String r0 = "vaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0070
            tb.t3l r5 = r6.d
            goto L_0x0088
        L_0x0070:
            java.lang.String r0 = "aaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x007b
            tb.t3l r5 = r6.c
            goto L_0x0088
        L_0x007b:
            java.lang.String r0 = "udid"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0087
            tb.t3l r5 = r6.f5925a
            goto L_0x0088
        L_0x0087:
            r5 = 0
        L_0x0088:
            if (r5 != 0) goto L_0x008b
            return
        L_0x008b:
            r5.b()
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.flyme.openidsdk.a.onReceive(android.content.Context, android.content.Intent):void");
    }
}
