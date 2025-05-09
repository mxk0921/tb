package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVReporter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVReporterExtra extends WVReporter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855963);
    }

    public static /* synthetic */ Object ipc$super(WVReporterExtra wVReporterExtra, String str, Object... objArr) {
        if (str.hashCode() == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/jsbridge/WVReporterExtra");
    }

    public void reportPrerenderStatus(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7969e5c5", new Object[]{this, wVCallBackContext, str});
        } else {
            wVCallBackContext.error();
        }
    }

    @Override // android.taobao.windvane.jsbridge.api.WVReporter, tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("reportPerformanceCheckResult".equals(str)) {
            reportPerformanceCheckResult(wVCallBackContext, str2);
        } else if (!"reportPrerenderStatus".equals(str)) {
            return false;
        } else {
            reportPrerenderStatus(wVCallBackContext, str2);
        }
        return super.execute(str, str2, wVCallBackContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:6:0x0020, B:14:0x005d, B:16:0x0063, B:18:0x0069, B:24:0x007d, B:26:0x0083, B:27:0x008c, B:29:0x0092, B:30:0x00a9), top: B:34:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:6:0x0020, B:14:0x005d, B:16:0x0063, B:18:0x0069, B:24:0x007d, B:26:0x0083, B:27:0x008c, B:29:0x0092, B:30:0x00a9), top: B:34:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void reportPerformanceCheckResult(android.taobao.windvane.jsbridge.WVCallBackContext r19, java.lang.String r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 3
            java.lang.String r7 = ""
            com.android.alibaba.ip.runtime.IpChange r8 = android.taobao.windvane.extra.jsbridge.WVReporterExtra.$ipChange
            boolean r9 = r8 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r9 == 0) goto L_0x0020
            java.lang.String r7 = "4e524717"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r1
            r6[r4] = r2
            r6[r3] = r0
            r8.ipc$dispatch(r7, r6)
            return
        L_0x0020:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: Exception -> 0x0079
            r8.<init>(r0)     // Catch: Exception -> 0x0079
            java.lang.String r0 = "score"
            r9 = 0
            long r9 = r8.optLong(r0, r9)     // Catch: Exception -> 0x0079
            java.lang.String r0 = "version"
            java.lang.String r15 = r8.optString(r0, r7)     // Catch: Exception -> 0x0079
            java.lang.String r0 = "result"
            java.lang.String r17 = r8.optString(r0, r7)     // Catch: Exception -> 0x0079
            java.lang.String r0 = "detail"
            java.lang.String r0 = r8.optString(r0, r7)     // Catch: Exception -> 0x0079
            android.taobao.windvane.webview.IWVWebView r7 = r1.mWebView     // Catch: Exception -> 0x0079
            java.lang.String r7 = r7.getUrl()     // Catch: Exception -> 0x0079
            r8 = 0
            android.taobao.windvane.webview.IWVWebView r11 = r1.mWebView     // Catch: all -> 0x005d
            boolean r12 = r11 instanceof android.taobao.windvane.webview.WVWebView     // Catch: all -> 0x005d
            if (r12 == 0) goto L_0x0055
            android.taobao.windvane.webview.WVWebView r11 = (android.taobao.windvane.webview.WVWebView) r11     // Catch: all -> 0x005d
            java.lang.String r8 = r11.bizCode     // Catch: all -> 0x005d
            goto L_0x005d
        L_0x0055:
            boolean r12 = r11 instanceof android.taobao.windvane.extra.uc.WVUCWebView     // Catch: all -> 0x005d
            if (r12 == 0) goto L_0x005d
            android.taobao.windvane.extra.uc.WVUCWebView r11 = (android.taobao.windvane.extra.uc.WVUCWebView) r11     // Catch: all -> 0x005d
            java.lang.String r8 = r11.bizCode     // Catch: all -> 0x005d
        L_0x005d:
            android.net.Uri r11 = android.net.Uri.parse(r7)     // Catch: Exception -> 0x0079
            if (r11 == 0) goto L_0x007b
            boolean r12 = r11.isHierarchical()     // Catch: Exception -> 0x0079
            if (r12 == 0) goto L_0x007b
            java.lang.String r12 = "wvBizCode"
            java.lang.String r11 = r11.getQueryParameter(r12)     // Catch: Exception -> 0x0079
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: Exception -> 0x0079
            if (r12 != 0) goto L_0x007b
            r16 = r11
            goto L_0x007d
        L_0x0079:
            r0 = move-exception
            goto L_0x00ad
        L_0x007b:
            r16 = r8
        L_0x007d:
            tb.csw r8 = tb.trw.getPerformanceMonitor()     // Catch: Exception -> 0x0079
            if (r8 == 0) goto L_0x008c
            tb.csw r11 = tb.trw.getPerformanceMonitor()     // Catch: Exception -> 0x0079
            r12 = r7
            r13 = r9
            r11.didPerformanceCheckResult(r12, r13, r15, r16, r17)     // Catch: Exception -> 0x0079
        L_0x008c:
            boolean r8 = tb.v7t.h()     // Catch: Exception -> 0x0079
            if (r8 == 0) goto L_0x00a9
            java.lang.String r8 = "WindVaneWebPerfCheck"
            java.lang.String r11 = "WindVaneWebPerfCheck: %s|%d|%s"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: Exception -> 0x0079
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: Exception -> 0x0079
            r6[r5] = r7     // Catch: Exception -> 0x0079
            r6[r4] = r9     // Catch: Exception -> 0x0079
            r6[r3] = r0     // Catch: Exception -> 0x0079
            java.lang.String r0 = java.lang.String.format(r11, r6)     // Catch: Exception -> 0x0079
            android.util.Log.e(r8, r0)     // Catch: Exception -> 0x0079
        L_0x00a9:
            r19.success()     // Catch: Exception -> 0x0079
            goto L_0x00bf
        L_0x00ad:
            tb.nsw r3 = new tb.nsw
            r3.<init>()
            java.lang.String r4 = "msg"
            java.lang.String r0 = r0.getMessage()
            r3.b(r4, r0)
            r2.error(r3)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.jsbridge.WVReporterExtra.reportPerformanceCheckResult(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }
}
