package android.taobao.windvane.extra.jsbridge;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVMega extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AbilityHubAdapter adapter;

    static {
        t2o.a(989855956);
    }

    public static /* synthetic */ boolean access$000(WVMega wVMega, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb4aa34a", new Object[]{wVMega, str, wVCallBackContext})).booleanValue();
        }
        return wVMega.callOnUIThread(str, wVCallBackContext);
    }

    private boolean callOnUIThread(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39cdcb2d", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        return megaCall(str, wVCallBackContext, wVCallBackContext.getWebview().getUrl());
    }

    public static /* synthetic */ Object ipc$super(WVMega wVMega, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/jsbridge/WVMega");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("call".equals(str)) {
            return call(str2, wVCallBackContext);
        }
        return true;
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        if (iWVWebView instanceof WVUCWebView) {
            this.adapter = ((WVUCWebView) iWVWebView).getAbilityHubAdapter();
        }
    }

    private boolean call(final String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2c1d830", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String str2 = wVCallBackContext.currentUrlFromAsyncChannel;
        if (!TextUtils.isEmpty(str2)) {
            megaCall(str, wVCallBackContext, str2);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            return callOnUIThread(str, wVCallBackContext);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: android.taobao.windvane.extra.jsbridge.WVMega.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVMega.access$000(WVMega.this, str, wVCallBackContext);
                    }
                }
            });
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:6:0x0022, B:8:0x003d, B:10:0x0043, B:13:0x0074, B:15:0x007f, B:17:0x0093, B:19:0x00ad, B:21:0x00be, B:23:0x00c4, B:24:0x00cd), top: B:30:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean megaCall(java.lang.String r10, final android.taobao.windvane.jsbridge.WVCallBackContext r11, java.lang.String r12) {
        /*
            r9 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = android.taobao.windvane.extra.jsbridge.WVMega.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = "8ea90f8c"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r9
            r3[r0] = r10
            r10 = 2
            r3[r10] = r11
            r10 = 3
            r3[r10] = r12
            java.lang.Object r10 = r1.ipc$dispatch(r2, r3)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x0022:
            com.alibaba.fastjson.JSONObject r10 = com.alibaba.fastjson.JSON.parseObject(r10)     // Catch: all -> 0x0072
            java.lang.String r1 = "ability"
            java.lang.String r3 = r10.getString(r1)     // Catch: all -> 0x0072
            java.lang.String r1 = "action"
            java.lang.String r4 = r10.getString(r1)     // Catch: all -> 0x0072
            java.lang.String r1 = "options"
            com.alibaba.fastjson.JSONObject r6 = r10.getJSONObject(r1)     // Catch: all -> 0x0072
            android.taobao.windvane.extra.jsbridge.WVMegaBridgeContext r1 = r11.wvMegaBridgeContext     // Catch: all -> 0x0072
            if (r1 == 0) goto L_0x0074
            boolean r2 = r1.getEnableLoggingAPIInvocation()     // Catch: all -> 0x0072
            if (r2 == 0) goto L_0x0074
            com.taobao.android.riverlogger.RVLLevel r2 = com.taobao.android.riverlogger.RVLLevel.Info     // Catch: all -> 0x0072
            java.lang.String r5 = "Bridge"
            tb.icn r2 = tb.lcn.a(r2, r5)     // Catch: all -> 0x0072
            java.lang.String r5 = "invoke"
            java.lang.String r7 = r1.getCallToken()     // Catch: all -> 0x0072
            tb.icn r2 = r2.k(r5, r7)     // Catch: all -> 0x0072
            java.lang.String r1 = r1.getParentId()     // Catch: all -> 0x0072
            tb.icn r1 = r2.m(r1)     // Catch: all -> 0x0072
            java.lang.String r2 = "name"
            java.lang.String r5 = "WVMega.call"
            tb.icn r1 = r1.a(r2, r5)     // Catch: all -> 0x0072
            java.lang.String r2 = "params"
            tb.icn r10 = r1.a(r2, r10)     // Catch: all -> 0x0072
            r10.f()     // Catch: all -> 0x0072
            goto L_0x0074
        L_0x0072:
            r10 = move-exception
            goto L_0x00d8
        L_0x0074:
            tb.xq r5 = new tb.xq     // Catch: all -> 0x0072
            r5.<init>()     // Catch: all -> 0x0072
            android.taobao.windvane.webview.IWVWebView r10 = r11.getWebview()     // Catch: all -> 0x0072
            if (r10 == 0) goto L_0x00bc
            java.lang.String r1 = "url"
            r5.d(r1, r12)     // Catch: all -> 0x0072
            java.lang.String r1 = "pageId"
            java.lang.String r2 = r11.getPid()     // Catch: all -> 0x0072
            r5.d(r1, r2)     // Catch: all -> 0x0072
            boolean r1 = r10 instanceof android.taobao.windvane.extra.uc.WVUCWebView     // Catch: all -> 0x0072
            if (r1 == 0) goto L_0x00bc
            r1 = r10
            android.taobao.windvane.extra.uc.WVUCWebView r1 = (android.taobao.windvane.extra.uc.WVUCWebView) r1     // Catch: all -> 0x0072
            r5.p(r1)     // Catch: all -> 0x0072
            android.taobao.windvane.extra.uc.WVUCWebView r10 = (android.taobao.windvane.extra.uc.WVUCWebView) r10     // Catch: all -> 0x0072
            tb.ace r10 = r10.getWebViewContext()     // Catch: all -> 0x0072
            java.lang.String r1 = r10.getCustomMegaNamespace()     // Catch: all -> 0x0072
            java.lang.String r2 = r10.getCustomMegaBizId()     // Catch: all -> 0x0072
            com.alibaba.ability.env.PerfTracer r7 = r5.i()     // Catch: all -> 0x0072
            if (r7 == 0) goto L_0x00be
            java.lang.String r8 = "wvEnableAsyncJSAPIChannel"
            boolean r10 = r10.getEnableAsyncJSAPIChannel()     // Catch: all -> 0x0072
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: all -> 0x0072
            r7.E(r8, r10)     // Catch: all -> 0x0072
            goto L_0x00be
        L_0x00bc:
            r1 = 0
            r2 = r1
        L_0x00be:
            tb.wpw r10 = tb.vpw.commonConfig     // Catch: all -> 0x0072
            boolean r10 = r10.o2     // Catch: all -> 0x0072
            if (r10 == 0) goto L_0x00cd
            android.content.Context r10 = r9.mContext     // Catch: all -> 0x0072
            tb.ldb r10 = tb.x74.b(r12, r2, r1, r10)     // Catch: all -> 0x0072
            r5.j(r10)     // Catch: all -> 0x0072
        L_0x00cd:
            com.alibaba.ability.hub.AbilityHubAdapter r2 = r9.adapter     // Catch: all -> 0x0072
            android.taobao.windvane.extra.jsbridge.WVMega$2 r7 = new android.taobao.windvane.extra.jsbridge.WVMega$2     // Catch: all -> 0x0072
            r7.<init>()     // Catch: all -> 0x0072
            r2.j(r3, r4, r5, r6, r7)     // Catch: all -> 0x0072
            goto L_0x00ff
        L_0x00d8:
            tb.nsw r12 = new tb.nsw
            r12.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: JSONException -> 0x00fb
            r1.<init>()     // Catch: JSONException -> 0x00fb
            java.lang.String r2 = "data"
            java.lang.String r10 = r10.getMessage()     // Catch: JSONException -> 0x00fb
            com.alibaba.ability.result.ErrorResult r10 = com.alibaba.ability.result.ErrorResult.a.f(r10)     // Catch: JSONException -> 0x00fb
            java.util.Map r10 = r10.toFormattedData()     // Catch: JSONException -> 0x00fb
            r1.put(r2, r10)     // Catch: JSONException -> 0x00fb
            r12.h(r1)     // Catch: JSONException -> 0x00fb
            r11.error(r12)     // Catch: JSONException -> 0x00fb
            goto L_0x00ff
        L_0x00fb:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.jsbridge.WVMega.megaCall(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):boolean");
    }
}
