package com.taobao.browser.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import tb.itw;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBWVToast extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708521);
    }

    public static /* synthetic */ Object ipc$super(TBWVToast tBWVToast, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/TBWVToast");
    }

    public void showToast(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c60ff8", new Object[]{this, str, wVCallBackContext});
        } else if (!itw.d(this.mContext)) {
            nsw nswVar = new nsw();
            nswVar.j("HY_NO_PERMISSION");
            nswVar.b("msg", "no permission");
            wVCallBackContext.error(nswVar);
            v7t.d("WVJsBridge", "no permission");
        } else {
            try {
                Object parse = JSON.parse(str);
                if (parse == null || !(parse instanceof JSONObject)) {
                    TBToast.makeText(this.mContext, str).show();
                } else {
                    String string = ((JSONObject) parse).getString("message");
                    String string2 = ((JSONObject) parse).getString("duration");
                    TBToast makeText = TBToast.makeText(this.mContext, string);
                    if (!TextUtils.isEmpty(string2)) {
                        long longValue = Long.valueOf(string2).longValue() * 1000;
                        if (longValue > 1000) {
                            makeText.setDuration(longValue);
                        }
                    }
                    makeText.show();
                }
                wVCallBackContext.success();
            } catch (Exception unused) {
                wVCallBackContext.error();
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"toast".equals(str)) {
            return false;
        }
        showToast(str2, wVCallBackContext);
        return true;
    }
}
