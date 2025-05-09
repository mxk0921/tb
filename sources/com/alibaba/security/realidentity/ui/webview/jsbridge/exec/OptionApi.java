package com.alibaba.security.realidentity.ui.webview.jsbridge.exec;

import android.content.Context;
import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.f2;
import com.alibaba.security.realidentity.g2;
import com.alibaba.security.realidentity.p1;
import com.alibaba.security.realidentity.q1;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.activity.RPWebViewActivity;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.HashMap;

/* compiled from: Taobao */
@JSTopic(topic = "option")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OptionApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OptionApi(u4 u4Var) {
        super(u4Var);
    }

    public static /* synthetic */ void access$000(OptionApi optionApi, String str, boolean z, int i, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a78a73", new Object[]{optionApi, str, new Boolean(z), new Integer(i), str2, new Long(j)});
        } else {
            optionApi.collectRemoteSoEndTraceLog(str, z, i, str2, j);
        }
    }

    public static /* synthetic */ void access$100(OptionApi optionApi, JsCallbackAdapter jsCallbackAdapter, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8a46b6", new Object[]{optionApi, jsCallbackAdapter, str, str2});
        } else {
            optionApi.wvResultCallback(jsCallbackAdapter, str, str2);
        }
    }

    public static /* synthetic */ Context access$200(OptionApi optionApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("840cd168", new Object[]{optionApi});
        }
        return optionApi.mContext;
    }

    public static /* synthetic */ Context access$300(OptionApi optionApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("dd181ce9", new Object[]{optionApi});
        }
        return optionApi.mContext;
    }

    public static /* synthetic */ void access$400(OptionApi optionApi, WVResultWrapper wVResultWrapper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e99d66f", new Object[]{optionApi, wVResultWrapper, new Boolean(z)});
        } else {
            optionApi.finishJsBridge(wVResultWrapper, z);
        }
    }

    private void collectRemoteSoBeginTraceLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00cd7ed", new Object[]{this, str});
        } else {
            collectTraceLog(str, TrackLog.createRemoteSoBeginLog("h5"));
        }
    }

    private void collectRemoteSoEndTraceLog(String str, boolean z, int i, String str2, long j) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cb56ec", new Object[]{this, str, new Boolean(z), new Integer(i), str2, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("errorMessage", str2);
        hashMap.put("costTime", Long.valueOf(j));
        if (!z) {
            i2 = -1;
        }
        collectTraceLog(str, TrackLog.createRemoteSoEndLog("h5", i2, b.b(hashMap)));
    }

    private void collectTraceLog(String str, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0140607", new Object[]{this, str, trackLog});
            return;
        }
        trackLog.setVerifyToken(str);
        trackLog.addTag9(g2.f2719a + "/3.3.0");
        trackLog.addTag10(TimeCalculator.PLATFORM_ANDROID);
        RPTrack.a(trackLog);
        RPTrack.c();
    }

    private void dynamicRequest(q1 q1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9465621", new Object[]{this, q1Var});
        } else {
            new p1(this.mContext, this.mVerifyBizCapacity).a(this.mRPBizConfig, q1Var);
        }
    }

    public static /* synthetic */ Object ipc$super(OptionApi optionApi, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/webview/jsbridge/exec/OptionApi");
    }

    private void wvResultCallback(final JsCallbackAdapter jsCallbackAdapter, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf0cafd", new Object[]{this, jsCallbackAdapter, str, str2});
        } else {
            dynamicRequest(new q1() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.security.realidentity.q1
                public void onRequestEnd(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a93d2f02", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    WVResultWrapper wVResultWrapper = new WVResultWrapper();
                    wVResultWrapper.addData("rpSdkName", f2.f2699a);
                    wVResultWrapper.addData("rpSdkVersion", g2.f2719a);
                    wVResultWrapper.addData(BaseJsExecutor.NAME_LIVENESSSDK_NAME, f2.e);
                    wVResultWrapper.addData(BaseJsExecutor.NAME_LIVENESSSDK_VERSION, g2.b);
                    wVResultWrapper.addData(BaseJsExecutor.NAME_REMOTE_SO_RESULT, str);
                    wVResultWrapper.addData(BaseJsExecutor.NAME_REMOTE_SO_MSG, str2);
                    if (OptionApi.access$200(OptionApi.this) == null || !(OptionApi.access$300(OptionApi.this) instanceof RPWebViewActivity)) {
                        wVResultWrapper.addData(BaseJsExecutor.NAME_SDK_NOUI, "true");
                    } else {
                        wVResultWrapper.addData(BaseJsExecutor.NAME_SDK_NOUI, "false");
                    }
                    wVResultWrapper.setSuccess();
                    jsCallbackAdapter.success(wVResultWrapper);
                    OptionApi.access$400(OptionApi.this, wVResultWrapper, true);
                }
            });
        }
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this});
        }
        return "option";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r11, final com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter r12) {
        /*
            r10 = this;
            r0 = 1
            java.lang.String r1 = ""
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0021
            java.lang.String r1 = "4d162c2f"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r10
            r3[r0] = r11
            r11 = 2
            r3[r11] = r12
            java.lang.Object r11 = r2.ipc$dispatch(r1, r3)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x0021:
            long r2 = java.lang.System.currentTimeMillis()
            r10.setStartBeginTime(r2)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: Exception -> 0x0042
            r2.<init>(r11)     // Catch: Exception -> 0x0042
            java.lang.String r11 = "verifyToken"
            java.lang.String r11 = r2.optString(r11)     // Catch: Exception -> 0x0042
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch: Exception -> 0x003e
            if (r2 != 0) goto L_0x0040
            r10.setVerifyToken(r11)     // Catch: Exception -> 0x003e
            goto L_0x0040
        L_0x003e:
            r2 = move-exception
            goto L_0x0044
        L_0x0040:
            r8 = r11
            goto L_0x004b
        L_0x0042:
            r2 = move-exception
            r11 = r1
        L_0x0044:
            java.lang.String r3 = "option api get token fail"
            r10.trackExceptionLog(r3, r2)
            goto L_0x0040
        L_0x004b:
            com.alibaba.security.realidentity.g1 r11 = com.alibaba.security.realidentity.g1.f()
            r11.a(r8)
            com.alibaba.security.realidentity.m2 r11 = com.alibaba.security.realidentity.m2.a()
            android.content.Context r2 = r10.mContext
            boolean r11 = r11.a(r2)
            if (r11 == 0) goto L_0x0077
            long r6 = java.lang.System.currentTimeMillis()
            r10.collectRemoteSoBeginTraceLog(r8)
            com.alibaba.security.realidentity.m2 r11 = com.alibaba.security.realidentity.m2.a()
            android.content.Context r1 = r10.mContext
            com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi$1 r2 = new com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi$1
            r4 = r2
            r5 = r10
            r9 = r12
            r4.<init>()
            r11.a(r1, r2)
            return r0
        L_0x0077:
            java.lang.String r11 = "0"
            r10.wvResultCallback(r12, r11, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.ui.webview.jsbridge.exec.OptionApi.execute(java.lang.String, com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter):boolean");
    }
}
