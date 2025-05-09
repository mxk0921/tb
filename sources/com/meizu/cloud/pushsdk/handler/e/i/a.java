package com.meizu.cloud.pushsdk.handler.e.i;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.e.j.b;
import com.meizu.cloud.pushsdk.handler.e.j.g;
import com.meizu.cloud.pushsdk.util.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends com.meizu.cloud.pushsdk.handler.e.a<g> {
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 65536;
    }

    /* renamed from: l */
    public g f(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        String stringExtra2 = intent.getStringExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID);
        return new g(intent.getStringExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE), stringExtra, intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY), stringExtra2);
    }

    /* renamed from: a */
    public void d(g gVar) {
        d.g(c(), c().getPackageName(), gVar.a().b().a(), gVar.a().b().d(), gVar.a().b().c(), gVar.a().b().e());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.meizu.cloud.pushsdk.handler.e.j.g r11, com.meizu.cloud.pushsdk.notification.c r12) {
        /*
            r10 = this;
            java.lang.String r12 = "AbstractMessageHandler"
            com.meizu.cloud.pushinternal.DebugLogger.flush()
            com.meizu.cloud.pushsdk.handler.e.j.b r0 = r11.a()
            com.meizu.cloud.pushsdk.handler.e.j.f r0 = r0.b()
            java.lang.String r0 = r0.d()
            com.meizu.cloud.pushsdk.handler.e.j.b r1 = r11.a()
            com.meizu.cloud.pushsdk.handler.e.j.f r1 = r1.b()
            java.lang.String r4 = r1.a()
            android.content.Context r1 = r10.c()
            java.lang.String r5 = com.meizu.cloud.pushsdk.d.c.b(r1)
            android.content.Context r1 = r10.c()
            java.lang.String r1 = com.meizu.cloud.pushsdk.util.MzSystemUtils.getDocumentsPath(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = "/pushSdktmp/"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "_"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ".zip"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.meizu.cloud.pushsdk.handler.e.i.b r2 = new com.meizu.cloud.pushsdk.handler.e.i.b
            r2.<init>(r0)
            r3 = 0
            java.util.List r6 = r11.b()     // Catch: Exception -> 0x0061
            r2.a(r1, r6)     // Catch: Exception -> 0x0061
            java.io.File r1 = new java.io.File     // Catch: Exception -> 0x0061
            r1.<init>(r0)     // Catch: Exception -> 0x0061
            goto L_0x007a
        L_0x0061:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "zip error message "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r12, r1)
            r1 = r3
            r3 = r0
        L_0x007a:
            if (r1 == 0) goto L_0x0091
            long r6 = r1.length()
            r8 = 1024(0x400, double:5.06E-321)
            long r6 = r6 / r8
            int r0 = r11.c()
            long r8 = (long) r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            java.lang.String r0 = "the upload file exceeds the max size"
        L_0x008f:
            r6 = r0
            goto L_0x00a5
        L_0x0091:
            boolean r0 = r11.d()
            if (r0 == 0) goto L_0x00a4
            android.content.Context r0 = r10.c()
            boolean r0 = com.meizu.cloud.pushsdk.util.a.b(r0)
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "current network not allowed upload log file"
            goto L_0x008f
        L_0x00a4:
            r6 = r3
        L_0x00a5:
            android.content.Context r0 = r10.c()
            com.meizu.cloud.pushsdk.platform.c.b r2 = com.meizu.cloud.pushsdk.platform.c.b.a(r0)
            com.meizu.cloud.pushsdk.handler.e.j.b r11 = r11.a()
            com.meizu.cloud.pushsdk.handler.e.j.f r11 = r11.b()
            java.lang.String r3 = r11.d()
            r7 = r1
            com.meizu.cloud.pushsdk.e.b.c r11 = r2.a(r3, r4, r5, r6, r7)
            if (r11 == 0) goto L_0x00e4
            boolean r0 = r11.c()
            if (r0 == 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00cb
            r1.delete()
        L_0x00cb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "upload success "
            r0.<init>(r1)
            java.lang.Object r11 = r11.b()
            java.lang.String r11 = (java.lang.String) r11
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r12, r11)
            goto L_0x010a
        L_0x00e4:
            if (r11 == 0) goto L_0x0106
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "upload error code "
            r0.<init>(r1)
            com.meizu.cloud.pushsdk.e.c.a r1 = r11.a()
            r0.append(r1)
            java.lang.Object r11 = r11.b()
            java.lang.String r11 = (java.lang.String) r11
            r0.append(r11)
            java.lang.String r11 = r0.toString()
        L_0x0102:
            com.meizu.cloud.pushinternal.DebugLogger.i(r12, r11)
            goto L_0x010a
        L_0x0106:
            java.lang.String r11 = "upload error"
            goto L_0x0102
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.handler.e.i.a.a(com.meizu.cloud.pushsdk.handler.e.j.g, com.meizu.cloud.pushsdk.notification.c):void");
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        int i;
        DebugLogger.i("AbstractMessageHandler", "start LogUploadMessageHandler match");
        String stringExtra = intent.getStringExtra(PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        if (!TextUtils.isEmpty(stringExtra)) {
            b a2 = b.a(stringExtra);
            if (a2.a() != null) {
                i = a2.a().a();
                return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && "2".equals(String.valueOf(i));
            }
        }
        i = 0;
        if (PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction())) {
            return false;
        }
    }
}
