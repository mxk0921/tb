package com.taobao.android.diagnose;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.fsw;
import tb.idh;
import tb.kpw;
import tb.nzb;
import tb.t2o;
import tb.tx8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DiagnoseJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_TRIGGER_SCENE = "sceneTrigger";

    static {
        t2o.a(615514116);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            fsw.h("DiagnoseJSBridge", DiagnoseJSBridge.class);
        } catch (Throwable th) {
            idh.c("DiagnoseJSBridge", "init", th);
        }
    }

    public static /* synthetic */ Object ipc$super(DiagnoseJSBridge diagnoseJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/DiagnoseJSBridge");
    }

    private void handleSceneTrigger(String str, WVCallBackContext wVCallBackContext) {
        tx8 tx8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87bd7822", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("bizName", "");
            if (TextUtils.isEmpty(optString)) {
                wVCallBackContext.error();
                return;
            }
            if (jSONObject.optBoolean("hasArgs", false)) {
                tx8Var = new tx8();
                if (jSONObject.has("sArg1")) {
                    tx8Var.e("sArg1", jSONObject.getString("sArg1"));
                }
                if (jSONObject.has("sArg2")) {
                    tx8Var.e("sArg2", jSONObject.getString("sArg2"));
                }
                if (jSONObject.has("bArg1")) {
                    tx8Var.e("bArg1", Boolean.valueOf(jSONObject.getBoolean("bArg1")));
                }
                if (jSONObject.has("bArg2")) {
                    tx8Var.e("bArg2", Boolean.valueOf(jSONObject.getBoolean("bArg2")));
                }
                if (jSONObject.has("iArg1")) {
                    tx8Var.e("iArg1", Integer.valueOf(jSONObject.getInt("iArg1")));
                }
                if (jSONObject.has("iArg2")) {
                    tx8Var.e("iArg2", Integer.valueOf(jSONObject.getInt("iArg2")));
                }
            } else {
                tx8Var = null;
            }
            nzb.b().c(optString, tx8Var);
            wVCallBackContext.success();
        } catch (Exception e) {
            idh.c("DiagnoseJSBridge", "handleSceneTrigger", e);
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!ACTION_TRIGGER_SCENE.equals(str)) {
            return false;
        }
        handleSceneTrigger(str2, wVCallBackContext);
        return true;
    }
}
