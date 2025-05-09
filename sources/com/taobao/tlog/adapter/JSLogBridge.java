package com.taobao.tlog.adapter;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.weex.common.WXConfig;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fsw;
import tb.kpw;
import tb.nsw;
import tb.qd0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class JSLogBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GETLOGLEVEL = "getLogLevel";
    private static final String LOGD = "logd";
    private static final String LOGE = "loge";
    private static final String LOGI = "logi";
    private static final String LOGV = "logv";
    private static final String LOGW = "logw";
    private static final String TRACE_D = "traced";
    private static final String TRACE_I = "tracei";
    private static final String tlogBridgeName = "tlogBridge";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$tao$log$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$com$taobao$tao$log$LogLevel = iArr;
            try {
                iArr[LogLevel.I.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$tao$log$LogLevel[LogLevel.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f13831a;

        public b(JSLogBridge jSLogBridge) {
        }
    }

    private b getLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("97164f6", new Object[]{this, str});
        }
        try {
            b bVar = new b(this);
            JSONObject jSONObject = new JSONObject(str);
            bVar.f13831a = jSONObject.optString("tag", "jsTag");
            jSONObject.optString("content", "");
            return bVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            fsw.i(tlogBridgeName, JSLogBridge.class, true);
        }
    }

    public static /* synthetic */ Object ipc$super(JSLogBridge jSLogBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tlog/adapter/JSLogBridge");
    }

    public void logd(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73368ee", new Object[]{this, str, wVCallBackContext});
            return;
        }
        b log = getLog(str);
        if (log != null) {
            AdapterForTLog.logd(log.f13831a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void loge(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae193af", new Object[]{this, str, wVCallBackContext});
            return;
        }
        b log = getLog(str);
        if (log != null) {
            AdapterForTLog.loge(log.f13831a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logi(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99a3eb3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        b log = getLog(str);
        if (log != null) {
            AdapterForTLog.logi(log.f13831a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logv(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89726a80", new Object[]{this, str, wVCallBackContext});
            return;
        }
        b log = getLog(str);
        if (log != null) {
            AdapterForTLog.logv(log.f13831a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logw(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd209541", new Object[]{this, str, wVCallBackContext});
            return;
        }
        b log = getLog(str);
        if (log != null) {
            AdapterForTLog.logw(log.f13831a, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && wVCallBackContext != null) {
            if (GETLOGLEVEL.equals(str)) {
                nsw nswVar = new nsw();
                nswVar.b(WXConfig.logLevel, AdapterForTLog.getLogLevel());
                wVCallBackContext.success(nswVar);
            } else if (LOGV.equals(str)) {
                logv(str2, wVCallBackContext);
            } else if (LOGD.equals(str)) {
                logd(str2, wVCallBackContext);
            } else if (LOGI.equals(str)) {
                logi(str2, wVCallBackContext);
            } else if (LOGW.equals(str)) {
                logw(str2, wVCallBackContext);
            } else if (LOGE.equals(str)) {
                loge(str2, wVCallBackContext);
            } else if (TRACE_I.equals(str)) {
                traceLog(LogLevel.I, str2, wVCallBackContext);
            } else if (TRACE_D.equals(str)) {
                traceLog(LogLevel.D, str2, wVCallBackContext);
            }
            return true;
        }
        return false;
    }

    private void traceLog(LogLevel logLevel, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebfb6b7", new Object[]{this, logLevel, str, wVCallBackContext});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                wVCallBackContext.error("the content is null!");
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("cntID", "");
            String optString2 = jSONObject.optString("refID", "");
            String optString3 = jSONObject.optString("module", "");
            String optString4 = jSONObject.optString("tag", "");
            long optLong = jSONObject.optLong(StEvent.EVENT_TIME, System.currentTimeMillis());
            String optString5 = jSONObject.optString("eventName", "");
            String optString6 = jSONObject.optString("eventCode", "");
            String optString7 = jSONObject.optString("codeMsg", "");
            int optInt = jSONObject.optInt("eventType", 0);
            String optString8 = jSONObject.optString("bizCode", "");
            String optString9 = jSONObject.optString("ext", "");
            if (TextUtils.isEmpty(optString5)) {
                wVCallBackContext.error("the eventName is null!");
                return;
            }
            if (a.$SwitchMap$com$taobao$tao$log$LogLevel[logLevel.ordinal()] != 1) {
                qd0.a(optString, optString2, optString3, optString4, optLong, optString5, optString6, optString7, optInt, optString8, optString9);
            } else {
                qd0.c(optString, optString2, optString3, optString4, optLong, optString5, optString6, optString7, optInt, optString8, optString9);
            }
            wVCallBackContext.success();
        } catch (JSONException e) {
            e.printStackTrace();
            wVCallBackContext.error("the json is invalid!");
        }
    }
}
