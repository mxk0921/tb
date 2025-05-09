package com.alipay.mobile.verifyidentity.alipay.listener;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class H5PluginListenerByVid extends H5PluginListener implements VIListenerByVerifyId {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public H5PluginListenerByVid(WVCallBackContext wVCallBackContext) {
        super(wVCallBackContext);
    }

    public static /* synthetic */ Object ipc$super(H5PluginListenerByVid h5PluginListenerByVid, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/alipay/listener/H5PluginListenerByVid");
    }

    @Override // com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId
    public void onVerifyResult(String str, String str2, String str3, VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9841f2", new Object[]{this, str, str2, str3, verifyIdentityResult});
        } else {
            pluginCallBack(str, str2, str3, verifyIdentityResult);
        }
    }
}
