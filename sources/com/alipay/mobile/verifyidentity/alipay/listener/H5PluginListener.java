package com.alipay.mobile.verifyidentity.alipay.listener;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class H5PluginListener implements VerifyIdentityListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVCallBackContext f4282a;

    public H5PluginListener(WVCallBackContext wVCallBackContext) {
        this.f4282a = wVCallBackContext;
    }

    @Override // com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener
    public void onVerifyResult(String str, String str2, VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f017728", new Object[]{this, str, str2, verifyIdentityResult});
        } else {
            pluginCallBack("", str, str2, verifyIdentityResult);
        }
    }

    public void pluginCallBack(String str, String str2, String str3, VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8774f5", new Object[]{this, str, str2, str3, verifyIdentityResult});
            return;
        }
        try {
            nsw nswVar = new nsw();
            if (verifyIdentityResult != null && !TextUtils.isEmpty(verifyIdentityResult.getMessage())) {
                nswVar.b("message", verifyIdentityResult.getMessage());
            }
            if (!(verifyIdentityResult == null || verifyIdentityResult.getExtInfo() == null)) {
                nswVar.a("extInfo", verifyIdentityResult.getExtInfo());
            }
            if (!(verifyIdentityResult == null || verifyIdentityResult.getExtInfo() == null)) {
                for (Map.Entry<String, Object> entry : verifyIdentityResult.getExtInfo().entrySet()) {
                    nswVar.a(entry.getKey(), entry.getValue());
                }
            }
            nswVar.b(Constants.VI_ENGINE_VERIFYID, str);
            nswVar.b("token", str2);
            nswVar.b("bizName", str3);
            nswVar.b(Constants.VI_ENGINE_FAST_BIZ_RES_DATA, verifyIdentityResult.getBizResponseData());
            if (!TextUtils.isEmpty(verifyIdentityResult.getCode())) {
                nswVar.b("code", verifyIdentityResult.getCode());
            } else {
                nswVar.b("code", "2002");
            }
            this.f4282a.success(nswVar);
        } catch (JSONException unused) {
            this.f4282a.error();
        }
    }
}
