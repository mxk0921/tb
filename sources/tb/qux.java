package tb;

import android.content.Context;
import com.alipay.android.phone.iifaa.did.api.DIDResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class qux {
    public abstract DIDResult a(Context context, String str, String str2);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x000f, B:8:0x001d, B:12:0x002e, B:17:0x003e, B:20:0x0049, B:27:0x005a, B:29:0x0061), top: B:34:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.android.phone.iifaa.did.api.DIDResult b(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            tb.msx r0 = tb.msx.b()     // Catch: Exception -> 0x002c
            tb.zwx r0 = r0.b     // Catch: Exception -> 0x002c
            java.lang.String r1 = "my_did_appid"
            java.lang.String r6 = tb.lsx.l(r6)     // Catch: Exception -> 0x002c
            tb.msx$a r0 = (tb.msx.a) r0
            java.lang.String r6 = r0.c(r1, r6)     // Catch: Exception -> 0x002c
            java.lang.String r0 = "_"
            java.lang.String[] r6 = r6.split(r0)     // Catch: Exception -> 0x002c
            int r0 = r6.length     // Catch: Exception -> 0x002c
            r1 = 1
            if (r0 <= r1) goto L_0x002e
            com.alipay.android.phone.iifaa.did.api.DIDResult r5 = new com.alipay.android.phone.iifaa.did.api.DIDResult     // Catch: Exception -> 0x002c
            com.alipay.android.phone.iifaa.did.api.DIDResult$a r6 = com.alipay.android.phone.iifaa.did.api.DIDResult.a.FAILED_AUTH     // Catch: Exception -> 0x002c
            int r6 = r6.ordinal()     // Catch: Exception -> 0x002c
            java.lang.String r7 = "暂不支持使用带 PIN 秘钥"
            r5.<init>(r6, r7)     // Catch: Exception -> 0x002c
            return r5
        L_0x002c:
            r5 = move-exception
            goto L_0x0068
        L_0x002e:
            int r0 = r8.hashCode()     // Catch: Exception -> 0x002c
            r2 = -822722038(0xffffffffcef6420a, float:-2.06576154E9)
            r3 = 0
            if (r0 == r2) goto L_0x0049
            r2 = 1120499232(0x42c97620, float:100.73071)
            if (r0 == r2) goto L_0x003e
            goto L_0x0054
        L_0x003e:
            java.lang.String r0 = "vcDecrypt"
            boolean r8 = r8.equals(r0)     // Catch: Exception -> 0x002c
            if (r8 == 0) goto L_0x0054
            r8 = 1
            goto L_0x0055
        L_0x0049:
            java.lang.String r0 = "vcSign"
            boolean r8 = r8.equals(r0)     // Catch: Exception -> 0x002c
            if (r8 == 0) goto L_0x0054
            r8 = 0
            goto L_0x0055
        L_0x0054:
            r8 = -1
        L_0x0055:
            if (r8 == 0) goto L_0x0061
            if (r8 == r1) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            r6 = r6[r3]     // Catch: Exception -> 0x002c
            com.alipay.android.phone.iifaa.did.api.DIDResult r5 = r4.a(r5, r6, r7)     // Catch: Exception -> 0x002c
            return r5
        L_0x0061:
            r6 = r6[r3]     // Catch: Exception -> 0x002c
            com.alipay.android.phone.iifaa.did.api.DIDResult r5 = r4.c(r5, r6, r7)     // Catch: Exception -> 0x002c
            return r5
        L_0x0068:
            r5.printStackTrace()
        L_0x006b:
            com.alipay.android.phone.iifaa.did.api.DIDResult r5 = new com.alipay.android.phone.iifaa.did.api.DIDResult
            com.alipay.android.phone.iifaa.did.api.DIDResult$a r6 = com.alipay.android.phone.iifaa.did.api.DIDResult.a.FAILED_EXCP
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qux.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.alipay.android.phone.iifaa.did.api.DIDResult");
    }

    public abstract DIDResult c(Context context, String str, String str2);
}
