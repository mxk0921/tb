package com.alipay.android.app.pay;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String extendInfo;
    public String memo;
    public String netError;
    public String openTime;
    public String result;
    public String resultStatus;

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0012, B:6:0x001a, B:8:0x0023, B:10:0x0029, B:16:0x0041, B:18:0x004a, B:21:0x0051, B:23:0x005f, B:24:0x0063, B:26:0x006c, B:28:0x0074, B:29:0x007a, B:31:0x0080, B:32:0x0086, B:34:0x008c, B:35:0x0092, B:37:0x0098, B:38:0x009e, B:40:0x00a4), top: B:45:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MspResult(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "netError"
            java.lang.String r1 = "openTime"
            java.lang.String r2 = "memo"
            java.lang.String r3 = "result"
            java.lang.String r4 = "resultStatus"
            r9.<init>()
            boolean r5 = android.text.TextUtils.isEmpty(r10)     // Catch: Exception -> 0x003e
            java.lang.String r6 = "extendInfo={"
            if (r5 != 0) goto L_0x0040
            java.lang.String r5 = "{\"biz_type\":\"share_pp\"}"
            boolean r5 = r10.contains(r5)     // Catch: Exception -> 0x003e
            if (r5 == 0) goto L_0x0040
            boolean r5 = r10.contains(r6)     // Catch: Exception -> 0x003e
            if (r5 == 0) goto L_0x0040
            int r5 = r10.indexOf(r6)     // Catch: Exception -> 0x003e
            java.lang.String r5 = r10.substring(r5)     // Catch: Exception -> 0x003e
            java.lang.String r7 = "extendInfo"
            java.lang.String r5 = r9.gatValue(r5, r7)     // Catch: Exception -> 0x003e
            boolean r7 = com.alipay.android.msp.utils.JsonUtil.isJsonObjectString(r5)     // Catch: Exception -> 0x003e
            if (r7 == 0) goto L_0x0040
            goto L_0x0041
        L_0x003e:
            r10 = move-exception
            goto L_0x00ae
        L_0x0040:
            r5 = 0
        L_0x0041:
            r9.extendInfo = r5     // Catch: Exception -> 0x003e
            boolean r7 = android.text.TextUtils.isEmpty(r10)     // Catch: Exception -> 0x003e
            r8 = 0
            if (r7 != 0) goto L_0x0063
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: Exception -> 0x003e
            if (r7 == 0) goto L_0x0051
            goto L_0x0063
        L_0x0051:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: Exception -> 0x003e
            java.lang.String r5 = r6.concat(r5)     // Catch: Exception -> 0x003e
            int r5 = r10.indexOf(r5)     // Catch: Exception -> 0x003e
            if (r5 <= 0) goto L_0x0063
            java.lang.String r10 = r10.substring(r8, r5)     // Catch: Exception -> 0x003e
        L_0x0063:
            java.lang.String r5 = ";"
            java.lang.String[] r10 = r10.split(r5)     // Catch: Exception -> 0x003e
            int r5 = r10.length     // Catch: Exception -> 0x003e
        L_0x006a:
            if (r8 >= r5) goto L_0x00ad
            r6 = r10[r8]     // Catch: Exception -> 0x003e
            boolean r7 = r6.startsWith(r4)     // Catch: Exception -> 0x003e
            if (r7 == 0) goto L_0x007a
            java.lang.String r7 = r9.gatValue(r6, r4)     // Catch: Exception -> 0x003e
            r9.resultStatus = r7     // Catch: Exception -> 0x003e
        L_0x007a:
            boolean r7 = r6.startsWith(r3)     // Catch: Exception -> 0x003e
            if (r7 == 0) goto L_0x0086
            java.lang.String r7 = r9.gatValue(r6, r3)     // Catch: Exception -> 0x003e
            r9.result = r7     // Catch: Exception -> 0x003e
        L_0x0086:
            boolean r7 = r6.startsWith(r2)     // Catch: Exception -> 0x003e
            if (r7 == 0) goto L_0x0092
            java.lang.String r7 = r9.gatValue(r6, r2)     // Catch: Exception -> 0x003e
            r9.memo = r7     // Catch: Exception -> 0x003e
        L_0x0092:
            boolean r7 = r6.startsWith(r1)     // Catch: Exception -> 0x003e
            if (r7 == 0) goto L_0x009e
            java.lang.String r7 = r9.gatValue(r6, r1)     // Catch: Exception -> 0x003e
            r9.openTime = r7     // Catch: Exception -> 0x003e
        L_0x009e:
            boolean r7 = r6.startsWith(r0)     // Catch: Exception -> 0x003e
            if (r7 == 0) goto L_0x00aa
            java.lang.String r6 = r9.gatValue(r6, r0)     // Catch: Exception -> 0x003e
            r9.netError = r6     // Catch: Exception -> 0x003e
        L_0x00aa:
            int r8 = r8 + 1
            goto L_0x006a
        L_0x00ad:
            return
        L_0x00ae:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.pay.MspResult.<init>(java.lang.String):void");
    }

    public String gatValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10db490e", new Object[]{this, str, str2});
        }
        String substring = str.substring((str2 + "={").length(), str.length());
        return substring.substring(0, substring.length() - 1);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "resultStatus : " + this.resultStatus + ", result = " + this.result + ", memo = " + this.memo + ", openTime = " + this.openTime + ", netError = " + this.netError + ", extendInfo = " + this.extendInfo;
    }
}
