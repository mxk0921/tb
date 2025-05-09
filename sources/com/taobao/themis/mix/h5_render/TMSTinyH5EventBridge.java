package com.taobao.themis.mix.h5_render;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.bbs;
import tb.cbs;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSTinyH5EventBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMSTinyH5EventBridge";

    static {
        t2o.a(840957961);
    }

    private boolean callbackEvent(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6968c455", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        String string = jSONObject.getString("eventId");
        bbs instance = getInstance(wVCallBackContext.getWebview().getContext());
        if (TextUtils.isEmpty(string) || instance == null) {
            wVCallBackContext.error();
            return false;
        }
        ITMSPage topPage = instance.W().getTopPage();
        if (topPage != null) {
            topPage.y(string, jSONObject);
        }
        wVCallBackContext.success();
        return true;
    }

    private bbs getInstance(Context context) {
        cbs cbsVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("b52524bc", new Object[]{this, context});
        }
        if (context instanceof MutableContextWrapper) {
            TMSLogger.a(TAG, "context is MutableContextWrapper");
            try {
                cbsVar = (cbs) ((MutableContextWrapper) context).getBaseContext();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (context instanceof cbs) {
            TMSLogger.a(TAG, "context is TMSInstanceBinder");
            cbsVar = (cbs) context;
        } else {
            TMSLogger.b(TAG, "context is not MutableContextWrapper or TMSInstanceBinder");
            cbsVar = null;
        }
        if (cbsVar != null) {
            return cbsVar.m1();
        }
        StringBuilder sb = new StringBuilder("context is null: ");
        if (context != null) {
            z = false;
        }
        sb.append(z);
        TMSLogger.b(TAG, sb.toString());
        return null;
    }

    public static /* synthetic */ Object ipc$super(TMSTinyH5EventBridge tMSTinyH5EventBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/h5_render/TMSTinyH5EventBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            jSONObject = JSON.parseObject(str2);
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        if (TextUtils.equals("registerEvent", str)) {
            return registerEvent(jSONObject, wVCallBackContext);
        }
        if (TextUtils.equals("callbackEvent", str)) {
            return callbackEvent(jSONObject, wVCallBackContext);
        }
        wVCallBackContext.error();
        return false;
    }

    private boolean registerEvent(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33d7ea33", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        String string = jSONObject.getString("event");
        bbs instance = getInstance(wVCallBackContext.getWebview().getContext());
        if (TextUtils.isEmpty(string) || instance == null) {
            TMSLogger.b(TAG, "registerEvent + " + string + " failed, because instance is null or event is empty");
            wVCallBackContext.error();
            return false;
        }
        instance.l0(string);
        wVCallBackContext.success();
        return true;
    }
}
