package com.taobao.tlog.adapter;

import android.preference.PreferenceManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.fsw;
import tb.j5s;
import tb.kpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TLogJSBridage extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            fsw.h("TLogJSBridage", TLogJSBridage.class);
            TLogDiagnose.init();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(TLogJSBridage tLogJSBridage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tlog/adapter/TLogJSBridage");
    }

    public void toLogcat(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad3377b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean(LogCategory.CATEGORY_LOGCAT);
            boolean z2 = jSONObject.getBoolean("restart");
            j5s.j().A(z);
            if (z2) {
                PreferenceManager.getDefaultSharedPreferences(j5s.j().h().getApplicationContext()).edit().putBoolean("tlog_isDebug", z).commit();
            }
            wVCallBackContext.success();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"toLogcat".equals(str)) {
            return false;
        }
        toLogcat(str2, wVCallBackContext);
        return true;
    }
}
