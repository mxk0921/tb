package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class gfq implements wrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        if (android.text.TextUtils.equals(r5, "SSRE_NETWORK_ERROR") != false) goto L_0x0049;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    @Override // tb.wrd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String d(tb.efq r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.gfq.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "4352d871"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            java.lang.Object r11 = r2.ipc$dispatch(r3, r4)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L_0x0018:
            tb.egq r2 = r11.f
            int r3 = r2.f18565a
            java.lang.String r4 = r2.c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5 = r2.d
            java.lang.String r6 = "x-retcode"
            java.lang.String r5 = mtopsdk.common.util.HeaderHandlerUtil.getSingleHeaderFieldByKey(r5, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r7 = "SSRE_NETWORK_ERROR"
            r8 = 200(0xc8, float:2.8E-43)
            java.lang.String r9 = "CONTINUE"
            if (r6 == 0) goto L_0x0037
            if (r3 != r8) goto L_0x0036
            return r9
        L_0x0036:
            r5 = r7
        L_0x0037:
            java.lang.String r6 = "SUCCESS"
            boolean r6 = android.text.TextUtils.equals(r5, r6)
            if (r6 == 0) goto L_0x0040
            return r9
        L_0x0040:
            r6 = -200(0xffffffffffffff38, float:NaN)
            if (r3 != r6) goto L_0x004b
            java.lang.String r5 = "SSRE_NO_NETWORK"
            java.lang.String r4 = "无网络"
        L_0x0049:
            r1 = 1
            goto L_0x007a
        L_0x004b:
            r6 = -202(0xffffffffffffff36, float:NaN)
            if (r3 != r6) goto L_0x0055
            java.lang.String r5 = "SSRE_NETWORK_TIMEOUT"
            java.lang.String r4 = "网络超时"
            goto L_0x0049
        L_0x0055:
            r6 = 500(0x1f4, float:7.0E-43)
            if (r3 != r6) goto L_0x005e
            java.lang.String r5 = "SSRE_MTOP_INTERNAL_ERROR"
            java.lang.String r4 = "MTOP 内部错误(500)"
            goto L_0x007a
        L_0x005e:
            r6 = 502(0x1f6, float:7.03E-43)
            if (r3 != r6) goto L_0x0068
            java.lang.String r5 = "SSRE_SERVICE_FAILED"
            java.lang.String r4 = "业务错误"
            goto L_0x007a
        L_0x0068:
            java.lang.String r6 = "SSRE_URL_BLOCKED"
            boolean r6 = android.text.TextUtils.equals(r5, r6)
            if (r6 == 0) goto L_0x0073
            java.lang.String r4 = "URL被管控"
            goto L_0x007a
        L_0x0073:
            boolean r6 = android.text.TextUtils.equals(r5, r7)
            if (r6 == 0) goto L_0x007a
            goto L_0x0049
        L_0x007a:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x0083
            java.lang.String r4 = "其他网络失败"
        L_0x0083:
            if (r3 == r8) goto L_0x00ad
            java.lang.String r3 = r11.b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[doAfter].code="
            r6.<init>(r7)
            int r7 = r2.f18565a
            r6.append(r7)
            java.lang.String r7 = ", retCode = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", msg = "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "ssr.SsrErrorMappingAfterFilter"
            mtopsdk.common.util.TBSdkLog.e(r7, r3, r6)
        L_0x00ad:
            tb.egq$b r3 = new tb.egq$b
            r3.<init>()
            if (r1 == 0) goto L_0x00b7
            r1 = 417(0x1a1, float:5.84E-43)
            goto L_0x00b9
        L_0x00b7:
            int r1 = r2.f18565a
        L_0x00b9:
            tb.egq$b r1 = r3.b(r1)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r2.d
            tb.egq$b r1 = r1.c(r2)
            tb.egq$b r1 = r1.e(r5)
            tb.egq$b r1 = r1.d(r4)
            tb.egq r1 = r1.a()
            r11.f = r1
            tb.i7j r11 = r11.d
            r11.x = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gfq.d(tb.efq):java.lang.String");
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ssr.SsrErrorMappingAfterFilter";
    }
}
