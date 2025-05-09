package com.etao.feimagesearch.capture;

import android.content.Context;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.result.IrpJsBridge;
import tb.agh;
import tb.ckf;
import tb.hgw;
import tb.mwo;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureJSBridge extends IrpJsBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857505);
    }

    private final void getCurrentTab(WVCallBackContext wVCallBackContext) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fc8b96", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext == null) {
            xhvVar = null;
        } else {
            Context context = this.mContext;
            if (!(context instanceof CaptureActivity)) {
                wVCallBackContext.error("activity is not a CaptureActivity");
            } else if (context != null) {
                int l3 = ((CaptureActivity) context).l3();
                if (l3 < 0) {
                    wVCallBackContext.error("activity status is incorrect");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) "index", String.valueOf(l3));
                    wVCallBackContext.success(jSONObject.toJSONString());
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.capture.CaptureActivity");
            }
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            agh.c(IrpJsBridge.NAME, "getCurrentTab has no callback");
        }
    }

    public static /* synthetic */ Object ipc$super(CaptureJSBridge captureJSBridge, String str, Object... objArr) {
        if (str.hashCode() == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/CaptureJSBridge");
    }

    @Override // com.etao.feimagesearch.result.IrpJsBridge, tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ckf.g(str, "action");
        if (super.execute(str, str2, wVCallBackContext)) {
            return true;
        }
        if (ckf.b(str, "getCurTab")) {
            getCurrentTab(wVCallBackContext);
            return true;
        } else if (!ckf.b(str, "addQuickSearch")) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT < 33) {
                hgw.c(this.mContext);
                return true;
            }
            Context context = this.mContext;
            ckf.f(context, "mContext");
            mwo.a(context);
            return true;
        }
    }
}
