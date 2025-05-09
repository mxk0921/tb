package com.taobao.android.purchase.jsbridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import tb.ck;
import tb.ihc;
import tb.kpw;
import tb.rbb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyDynamicJsBridgeService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837576);
        t2o.a(989856204);
    }

    public static /* synthetic */ Object ipc$super(TBBuyDynamicJsBridgeService tBBuyDynamicJsBridgeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/jsbridge/TBBuyDynamicJsBridgeService");
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
        rbb g = ck.g();
        g.d("TBBuyDynamicJsBridgeService getBridgeClass = " + str);
        if (str.equals("TBBuyPreRequestJSBridge")) {
            return TBBuyPreRequestJSBridge.class;
        }
        if (str.equals(PayPasswrdValidateBridge.PLUGIN_NAME)) {
            return PayPasswrdValidateBridge.class;
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
