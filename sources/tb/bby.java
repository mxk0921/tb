package tb;

import com.unionpay.UPPayWapActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bby implements xux {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f16309a;

    public bby(UPPayWapActivity uPPayWapActivity) {
        this.f16309a = uPPayWapActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // tb.xux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r14, tb.zux r15) {
        /*
            r13 = this;
            java.lang.String r0 = "extra"
            java.lang.String r1 = "1"
            com.unionpay.UPPayWapActivity r2 = r13.f16309a
            r3 = 0
            com.unionpay.UPPayWapActivity.d(r2, r15)     // Catch: Exception -> 0x0074
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: Exception -> 0x0074
            r4.<init>(r14)     // Catch: Exception -> 0x0074
            java.lang.String r14 = "packageName"
            java.lang.String r14 = r4.getString(r14)     // Catch: Exception -> 0x0074
            java.lang.String r5 = "type"
            java.lang.String r5 = r4.getString(r5)     // Catch: Exception -> 0x0074
            java.lang.String r6 = "openParams"
            java.lang.String r6 = r4.optString(r6)     // Catch: Exception -> 0x0074
            java.lang.String r7 = "tn"
            java.lang.String r7 = r4.optString(r7)     // Catch: Exception -> 0x0074
            java.lang.String r4 = r4.optString(r0)     // Catch: Exception -> 0x0074
            java.lang.String r8 = "0"
            boolean r8 = r8.equals(r5)     // Catch: Exception -> 0x0074
            java.lang.String r9 = "Call application error"
            r10 = 1
            java.lang.String r11 = "Parameter error"
            java.lang.String r12 = "2"
            if (r8 == 0) goto L_0x0081
            boolean r5 = android.text.TextUtils.isEmpty(r14)     // Catch: Exception -> 0x0074
            if (r5 != 0) goto L_0x0077
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch: Exception -> 0x0074
            if (r5 != 0) goto L_0x0077
            android.content.Intent r5 = new android.content.Intent     // Catch: Exception -> 0x0074
            r5.<init>()     // Catch: Exception -> 0x0074
            java.lang.String r6 = "com.unionpay.uppay.PayActivity"
            r5.setClassName(r14, r6)     // Catch: Exception -> 0x0074
            java.lang.String r14 = "paydata"
            r5.putExtra(r14, r7)     // Catch: Exception -> 0x0074
            java.lang.String r14 = "ex_mode"
            java.lang.String r6 = com.unionpay.UPPayWapActivity.k(r2)     // Catch: Exception -> 0x0074
            r5.putExtra(r14, r6)     // Catch: Exception -> 0x0074
            r5.putExtra(r0, r4)     // Catch: Exception -> 0x0074
            r2.startActivityForResult(r5, r10)     // Catch: Exception -> 0x006a
            return
        L_0x006a:
            if (r15 == 0) goto L_0x0076
            java.lang.String r14 = com.unionpay.UPPayWapActivity.b(r12, r9, r3)     // Catch: Exception -> 0x0074
            r15.a(r14)     // Catch: Exception -> 0x0074
            goto L_0x0076
        L_0x0074:
            r14 = move-exception
            goto L_0x00c9
        L_0x0076:
            return
        L_0x0077:
            if (r15 == 0) goto L_0x00c8
            java.lang.String r14 = com.unionpay.UPPayWapActivity.b(r1, r11, r3)     // Catch: Exception -> 0x0074
            r15.a(r14)     // Catch: Exception -> 0x0074
            return
        L_0x0081:
            boolean r5 = r12.equals(r5)     // Catch: Exception -> 0x0074
            if (r5 == 0) goto L_0x00bf
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: Exception -> 0x0074
            if (r5 != 0) goto L_0x00b5
            android.content.Intent r5 = new android.content.Intent     // Catch: Exception -> 0x0074
            java.lang.String r7 = "android.intent.action.VIEW"
            r5.<init>(r7)     // Catch: Exception -> 0x0074
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: Exception -> 0x0074
            r5.setData(r6)     // Catch: Exception -> 0x0074
            r5.putExtra(r0, r4)     // Catch: Exception -> 0x0074
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch: Exception -> 0x0074
            if (r0 != 0) goto L_0x00a7
            r5.setPackage(r14)     // Catch: Exception -> 0x0074
        L_0x00a7:
            r2.startActivityForResult(r5, r10)     // Catch: Exception -> 0x00ab
            return
        L_0x00ab:
            if (r15 == 0) goto L_0x00b4
            java.lang.String r14 = com.unionpay.UPPayWapActivity.b(r12, r9, r3)     // Catch: Exception -> 0x0074
            r15.a(r14)     // Catch: Exception -> 0x0074
        L_0x00b4:
            return
        L_0x00b5:
            if (r15 == 0) goto L_0x00c8
            java.lang.String r14 = com.unionpay.UPPayWapActivity.b(r1, r11, r3)     // Catch: Exception -> 0x0074
            r15.a(r14)     // Catch: Exception -> 0x0074
            return
        L_0x00bf:
            if (r15 == 0) goto L_0x00c8
            java.lang.String r14 = com.unionpay.UPPayWapActivity.b(r1, r11, r3)     // Catch: Exception -> 0x0074
            r15.a(r14)     // Catch: Exception -> 0x0074
        L_0x00c8:
            return
        L_0x00c9:
            if (r15 == 0) goto L_0x00d6
            java.lang.String r14 = r14.getMessage()
            java.lang.String r14 = com.unionpay.UPPayWapActivity.b(r1, r14, r3)
            r15.a(r14)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bby.a(java.lang.String, tb.zux):void");
    }
}
