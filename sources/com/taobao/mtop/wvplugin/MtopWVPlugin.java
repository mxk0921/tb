package com.taobao.mtop.wvplugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import java.util.HashMap;
import mtopsdk.common.util.TBSdkLog;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fsw;
import tb.kpw;
import tb.ov2;
import tb.rb;
import tb.x6j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SERVER_NAME = "MtopWVPlugin";
    public static final String ERR_SID_INVALID = "ERR_SID_INVALID";
    public static final String FAIL = "HY_FAILED";
    public static final String PARAM_ERR = "HY_PARAM_ERR";
    private static final String TAG = "mtopsdk.MtopWVPlugin";
    public static final String TIME_OUT = "MP_TIME_OUT";
    private static final String WV_FALCO_EXTEND = "falcoExtend";
    private static final String WV_IS_SUPPORT_ACCOUNT_SITE = "isSupportAccountSite";
    private static final String WV_SEND = "send";
    private static final String WV_SEND_ANET = "sendANet";
    private MtopBridge mtopBridge = new MtopBridge(this);
    private rb aNetBridge = new rb();

    public static /* synthetic */ Object ipc$super(MtopWVPlugin mtopWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mtop/wvplugin/MtopWVPlugin");
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        fsw.h(API_SERVER_NAME, MtopWVPlugin.class);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "register MtopWVPlugin succeed!");
        }
    }

    @WindVaneInterface
    public void falcoExtend(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f25705", new Object[]{this, wVCallBackContext, str});
        } else if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error();
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("falcoId");
                if (TextUtils.isEmpty(optString)) {
                    wVCallBackContext.error("falcoId is null.");
                    return;
                }
                long j = jSONObject.getLong("mtopStart");
                long j2 = jSONObject.getLong("mtopEnd");
                HashMap hashMap = new HashMap();
                hashMap.put("preProcessStart", Long.valueOf(j));
                hashMap.put("postProcessEnd", Long.valueOf(j2));
                FullTraceAnalysis.getInstance().falcoExtend(optString, hashMap);
                wVCallBackContext.success();
            } catch (NoSuchMethodError unused) {
                TBSdkLog.e(TAG, "falcoExtend not support.");
                wVCallBackContext.error("not support.");
            } catch (JSONException unused2) {
                TBSdkLog.e(TAG, "falcoExtend params invalid.");
                wVCallBackContext.error("params invalid.");
            } catch (Throwable unused3) {
                TBSdkLog.e(TAG, "falcoExtend execute error.");
                wVCallBackContext.error("execute error.");
            }
        }
    }

    public String getCurrentUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad2b94d", new Object[]{this});
        }
        try {
            return this.mWebView.getUrl();
        } catch (Exception unused) {
            return "";
        }
    }

    public String getUserAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c888a235", new Object[]{this});
        }
        try {
            return this.mWebView.getUserAgentString();
        } catch (Exception unused) {
            return "";
        }
    }

    @WindVaneInterface
    public void isSupportAccountSite(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea709add", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                wVCallBackContext.error();
            } else if (this.mtopBridge.j((String) new JSONObject(str).get(ov2.ALIPAY_ACCOUNT_SITE))) {
                wVCallBackContext.success();
            } else {
                wVCallBackContext.error();
            }
        } catch (Throwable unused) {
            if (wVCallBackContext != null) {
                wVCallBackContext.error();
                TBSdkLog.e(TAG, "isSupportAccountSite execute error!");
            }
        }
    }

    @WindVaneInterface
    public void send(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbdec96", new Object[]{this, wVCallBackContext, str});
        } else {
            this.mtopBridge.m(wVCallBackContext, str);
        }
    }

    public void wvCallback(x6j x6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b3deaa8", new Object[]{this, x6jVar});
            return;
        }
        if (x6jVar.d()) {
            x6jVar.c().success(x6jVar.toString());
        } else {
            x6jVar.c().error(x6jVar.toString());
        }
        x6jVar.f(null);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("send".equals(str)) {
            send(wVCallBackContext, str2);
            return true;
        } else if (WV_SEND_ANET.equals(str)) {
            this.aNetBridge.d(wVCallBackContext, str2);
            return true;
        } else if ("isSupportAccountSite".equals(str)) {
            isSupportAccountSite(wVCallBackContext, str2);
            return true;
        } else if (!WV_FALCO_EXTEND.equals(str)) {
            return false;
        } else {
            falcoExtend(wVCallBackContext, str2);
            return true;
        }
    }
}
