package com.taobao.browser.jsbridge;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBWVDialog extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBMaterialDialog mDialog;

    static {
        t2o.a(619708519);
    }

    public static /* synthetic */ Object ipc$super(TBWVDialog tBWVDialog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/TBWVDialog");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"show".equals(str)) {
            return false;
        }
        showDialog(str2, wVCallBackContext);
        return true;
    }

    public void showDialog(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b450bb3", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            Object parse = JSON.parse(str);
            nsw nswVar = new nsw();
            if (parse == null || !(parse instanceof JSONObject)) {
                nswVar.b("msg", "JSON parse error");
                wVCallBackContext.error(nswVar);
            } else if (!TextUtils.isEmpty(((JSONObject) parse).getString("url"))) {
                WVUCWebView wVUCWebView = new WVUCWebView(this.mContext);
                wVUCWebView.loadUrl(((JSONObject) parse).getString("url"));
                TBMaterialDialog build = new TBMaterialDialog.Builder(this.mContext).cardDialog(true).customView((View) wVUCWebView, false).build();
                this.mDialog = build;
                build.show();
                wVCallBackContext.success();
            } else {
                nswVar.b("msg", "url parameter not found!");
                wVCallBackContext.error(nswVar);
            }
        } catch (Exception unused) {
            nsw nswVar2 = new nsw();
            nswVar2.b("msg", "Context maybe null!");
            wVCallBackContext.error(nswVar2);
        }
    }
}
