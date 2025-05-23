package com.unionpay.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.unionpay.tsmservice.mini.ITsmCallback;
import com.unionpay.tsmservice.mini.result.QueryVendorPayStatusResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a extends ITsmCallback.Stub {

    /* renamed from: a  reason: collision with root package name */
    private int f14532a = 4000;
    private Handler b;

    public a(Handler handler) {
        this.b = handler;
    }

    @Override // com.unionpay.tsmservice.mini.ITsmCallback
    public final void onError(String str, String str2) {
        StringBuilder sb = new StringBuilder("errorCode:");
        sb.append(str);
        sb.append(", errorDesc:");
        sb.append(str2);
        Handler handler = this.b;
        int i = this.f14532a;
        handler.sendMessage(Message.obtain(handler, 1, i, 0, str + str2));
    }

    @Override // com.unionpay.tsmservice.mini.ITsmCallback
    public final void onResult(Bundle bundle) {
        if (this.f14532a == 4000) {
            bundle.setClassLoader(QueryVendorPayStatusResult.class.getClassLoader());
            Bundle queryVendorPayStatusResult = ((QueryVendorPayStatusResult) bundle.get("result")).getQueryVendorPayStatusResult();
            Handler handler = this.b;
            handler.sendMessage(Message.obtain(handler, 4000, queryVendorPayStatusResult));
        }
    }
}
