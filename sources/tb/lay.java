package tb;

import com.unionpay.UPPayWapActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lay implements xux {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f23225a;

    public lay(UPPayWapActivity uPPayWapActivity) {
        this.f23225a = uPPayWapActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #2 {Exception -> 0x0032, blocks: (B:3:0x0007, B:11:0x0026, B:14:0x0034, B:16:0x0071), top: B:25:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // tb.xux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r8, tb.zux r9) {
        /*
            r7 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = ""
            com.unionpay.UPPayWapActivity r2 = r7.f23225a
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: Exception -> 0x0032
            r4.<init>(r8)     // Catch: Exception -> 0x0032
            java.lang.String r8 = "url"
            java.lang.Object r8 = r4.get(r8)     // Catch: Exception -> 0x0022
            java.lang.String r8 = (java.lang.String) r8     // Catch: Exception -> 0x0022
            java.lang.String r5 = "title"
            java.lang.Object r4 = r4.get(r5)     // Catch: Exception -> 0x0020
            java.lang.String r4 = (java.lang.String) r4     // Catch: Exception -> 0x0020
            r1 = r4
            goto L_0x0034
        L_0x0020:
            r4 = move-exception
            goto L_0x0024
        L_0x0022:
            r4 = move-exception
            r8 = r1
        L_0x0024:
            if (r9 == 0) goto L_0x0034
            java.lang.String r4 = r4.getMessage()     // Catch: Exception -> 0x0032
            java.lang.String r4 = com.unionpay.UPPayWapActivity.b(r0, r4, r3)     // Catch: Exception -> 0x0032
            r9.a(r4)     // Catch: Exception -> 0x0032
            goto L_0x0034
        L_0x0032:
            r8 = move-exception
            goto L_0x007e
        L_0x0034:
            android.os.Bundle r4 = new android.os.Bundle     // Catch: Exception -> 0x0032
            r4.<init>()     // Catch: Exception -> 0x0032
            java.lang.String r5 = "waptype"
            java.lang.String r6 = "new_page"
            r4.putString(r5, r6)     // Catch: Exception -> 0x0032
            java.lang.String r5 = "magic_data"
            java.lang.String r6 = "949A1CC"
            r4.putString(r5, r6)     // Catch: Exception -> 0x0032
            java.lang.String r5 = "wapurl"
            r4.putString(r5, r8)     // Catch: Exception -> 0x0032
            java.lang.String r8 = "waptitle"
            r4.putString(r8, r1)     // Catch: Exception -> 0x0032
            java.lang.String r8 = "actionType"
            java.lang.String r1 = com.unionpay.UPPayWapActivity.h(r2)     // Catch: Exception -> 0x0032
            r4.putString(r8, r1)     // Catch: Exception -> 0x0032
            android.content.Intent r8 = new android.content.Intent     // Catch: Exception -> 0x0032
            r8.<init>()     // Catch: Exception -> 0x0032
            r8.putExtras(r4)     // Catch: Exception -> 0x0032
            java.lang.Class<com.unionpay.UPPayWapActivity> r1 = com.unionpay.UPPayWapActivity.class
            r8.setClass(r2, r1)     // Catch: Exception -> 0x0032
            r2.startActivity(r8)     // Catch: Exception -> 0x0032
            if (r9 == 0) goto L_0x007d
            java.lang.String r8 = "0"
            java.lang.String r1 = "success"
            java.lang.String r8 = com.unionpay.UPPayWapActivity.b(r8, r1, r3)     // Catch: Exception -> 0x0032
            r9.a(r8)     // Catch: Exception -> 0x0032
        L_0x007d:
            return
        L_0x007e:
            if (r9 == 0) goto L_0x008b
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = com.unionpay.UPPayWapActivity.b(r0, r8, r3)
            r9.a(r8)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lay.a(java.lang.String, tb.zux):void");
    }
}
