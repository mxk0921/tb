package com.xiaomi.push.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class cp extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15105a;

    public cp(XMPushService xMPushService) {
        this.f15105a = xMPushService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null) {
            try {
                int i = message.what;
                if (i == 17) {
                    Object obj = message.obj;
                    if (obj != null) {
                        this.f15105a.onStart((Intent) obj, 1);
                    }
                } else if (i == 18) {
                    Message obtain = Message.obtain((Handler) null, 0);
                    obtain.what = 18;
                    Bundle bundle = new Bundle();
                    bundle.putString("xmsf_region", a.a(this.f15105a.getApplicationContext()).a());
                    obtain.setData(bundle);
                    message.replyTo.send(obtain);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
