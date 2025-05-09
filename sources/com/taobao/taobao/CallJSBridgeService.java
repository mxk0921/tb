package com.taobao.taobao;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.callservice.WVAlipayApiPlugin;
import com.taobao.tao.alipay.callservice.WVIdleFishApiBridge;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import com.taobao.taobao.wxapi.TBWechatWVJSBridge;
import tb.ihc;
import tb.kpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CallJSBridgeService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CallJSBridgeService callJSBridgeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/CallJSBridgeService");
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("WVIdleFishApi".equals(str)) {
            return WVIdleFishApiBridge.class;
        }
        if ("TBAlipayJSBridge".equals(str)) {
            return WVAlipayApiPlugin.class;
        }
        if (PayPasswrdValidateBridge.PLUGIN_NAME.equals(str)) {
            return PayPasswrdValidateBridge.class;
        }
        if (WVCashierApiBridge.PLUGIN_NAME.equals(str)) {
            return WVCashierApiBridge.class;
        }
        if (TBWechatWVJSBridge.PLUGIN_NAME.equals(str)) {
            return TBWechatWVJSBridge.class;
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}
