package com.vivo.push.sdk.service;

import android.app.Activity;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LinkProxyActivity extends Activity {
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca A[Catch: Exception -> 0x00c5, TryCatch #2 {Exception -> 0x00c5, blocks: (B:22:0x008d, B:24:0x0093, B:26:0x009f, B:28:0x00a5, B:30:0x00ad, B:33:0x00b4, B:35:0x00bc, B:37:0x00c0, B:44:0x00ca, B:45:0x00ce), top: B:54:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce A[Catch: Exception -> 0x00c5, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c5, blocks: (B:22:0x008d, B:24:0x0093, B:26:0x009f, B:28:0x00a5, B:30:0x00ad, B:33:0x00b4, B:35:0x00bc, B:37:0x00c0, B:44:0x00ca, B:45:0x00ce), top: B:54:0x008d }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "LinkProxyActivity"
            if (r7 != 0) goto L_0x0014
            java.lang.String r7 = "enter RequestPermissionsActivity onCreate, intent is null, finish"
            com.vivo.push.util.u.d(r0, r7)
            r6.finish()
            return
        L_0x0014:
            r1 = 1
            r2 = 0
            android.view.Window r3 = r6.getWindow()     // Catch: all -> 0x0030
            r4 = 8388659(0x800033, float:1.1755015E-38)
            r3.setGravity(r4)     // Catch: all -> 0x0030
            android.view.WindowManager$LayoutParams r4 = r3.getAttributes()     // Catch: all -> 0x0030
            r4.x = r2     // Catch: all -> 0x0030
            r4.y = r2     // Catch: all -> 0x0030
            r4.height = r1     // Catch: all -> 0x0030
            r4.width = r1     // Catch: all -> 0x0030
            r3.setAttributes(r4)     // Catch: all -> 0x0030
            goto L_0x0036
        L_0x0030:
            r3 = move-exception
            java.lang.String r4 = "enter onCreate error "
            com.vivo.push.util.u.b(r0, r4, r3)
        L_0x0036:
            java.lang.String r3 = r6.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r6.hashCode()
            r4.append(r5)
            java.lang.String r5 = " enter onCreate "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.vivo.push.util.u.d(r0, r4)
            java.lang.String r4 = "com.vivo.abe"
            boolean r3 = r4.equals(r3)
            java.lang.String r4 = "previous_intent"
            if (r3 == 0) goto L_0x008d
            android.os.Bundle r1 = r7.getExtras()     // Catch: Exception -> 0x006d
            if (r1 != 0) goto L_0x006f
            java.lang.String r7 = "adapterToService getExtras() is null"
            com.vivo.push.util.u.d(r0, r7)     // Catch: Exception -> 0x006d
            goto L_0x00e4
        L_0x006d:
            r7 = move-exception
            goto L_0x0085
        L_0x006f:
            android.os.Bundle r7 = r7.getExtras()     // Catch: Exception -> 0x006d
            java.lang.Object r7 = r7.get(r4)     // Catch: Exception -> 0x006d
            android.content.Intent r7 = (android.content.Intent) r7     // Catch: Exception -> 0x006d
            if (r7 != 0) goto L_0x0081
            java.lang.String r7 = "adapterToService proxyIntent is null"
            com.vivo.push.util.u.d(r0, r7)     // Catch: Exception -> 0x006d
            goto L_0x00e4
        L_0x0081:
            com.vivo.push.util.ag.a(r6, r7)     // Catch: Exception -> 0x006d
            goto L_0x00e4
        L_0x0085:
            java.lang.String r1 = r7.toString()
            com.vivo.push.util.u.a(r0, r1, r7)
            goto L_0x00e4
        L_0x008d:
            android.os.Bundle r3 = r7.getExtras()     // Catch: Exception -> 0x00c5
            if (r3 == 0) goto L_0x00e4
            android.os.Bundle r7 = r7.getExtras()     // Catch: Exception -> 0x00c5
            java.lang.Object r7 = r7.get(r4)     // Catch: Exception -> 0x00c5
            android.content.Intent r7 = (android.content.Intent) r7     // Catch: Exception -> 0x00c5
            if (r7 == 0) goto L_0x00c7
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: Exception -> 0x00c5
            if (r3 == 0) goto L_0x00c7
            r4 = 576(0x240, float:8.07E-43)
            java.util.List r3 = r3.queryIntentServices(r7, r4)     // Catch: Exception -> 0x00c5
            if (r3 == 0) goto L_0x00c7
            boolean r4 = r3.isEmpty()     // Catch: Exception -> 0x00c5
            if (r4 == 0) goto L_0x00b4
            goto L_0x00c7
        L_0x00b4:
            java.lang.Object r3 = r3.get(r2)     // Catch: Exception -> 0x00c5
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3     // Catch: Exception -> 0x00c5
            if (r3 == 0) goto L_0x00c7
            android.content.pm.ServiceInfo r3 = r3.serviceInfo     // Catch: Exception -> 0x00c5
            if (r3 == 0) goto L_0x00c7
            boolean r3 = r3.exported     // Catch: Exception -> 0x00c5
            if (r3 == 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c5:
            r7 = move-exception
            goto L_0x00dd
        L_0x00c7:
            r1 = 0
        L_0x00c8:
            if (r1 == 0) goto L_0x00ce
            r6.startService(r7)     // Catch: Exception -> 0x00c5
            goto L_0x00e4
        L_0x00ce:
            java.lang.String r7 = "service's exported is "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: Exception -> 0x00c5
            java.lang.String r7 = r7.concat(r1)     // Catch: Exception -> 0x00c5
            com.vivo.push.util.u.b(r0, r7)     // Catch: Exception -> 0x00c5
            goto L_0x00e4
        L_0x00dd:
            java.lang.String r1 = r7.toString()
            com.vivo.push.util.u.a(r0, r1, r7)
        L_0x00e4:
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.sdk.service.LinkProxyActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u.d("LinkProxyActivity", hashCode() + " onDestory " + getPackageName());
    }
}
