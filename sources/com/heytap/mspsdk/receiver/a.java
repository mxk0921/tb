package com.heytap.mspsdk.receiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import tb.c3j;
import tb.rwx;
import tb.t2o;
import tb.vsx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Handler f5218a;

    /* compiled from: Taobao */
    /* renamed from: com.heytap.mspsdk.receiver.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class HandlerC0266a extends Handler {
        static {
            t2o.a(253755440);
        }

        public HandlerC0266a(a aVar, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            rwx f = rwx.f();
            Intent intent = (Intent) message.obj;
            f.getClass();
            try {
                Activity a2 = vsx.a.f30236a.a();
                if (a2 != null) {
                    a2.startActivity(intent);
                    return;
                }
                c3j.a("SdkRunTime", "app is not foregroud");
                intent.addFlags(268435456);
                if (rwx.a.f27658a != null) {
                    rwx.b.startActivity(intent);
                    return;
                }
                throw null;
            } catch (Exception e) {
                c3j.c("SdkRunTime", e);
            }
        }
    }

    static {
        t2o.a(253755439);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        c3j.a("CommunicationReceiver", "onReceive  action : " + action);
        if (this.f5218a == null) {
            this.f5218a = new HandlerC0266a(this, Looper.getMainLooper());
        }
        if ("com.heytap.mspsdk.start_intent".equals(action)) {
            Intent intent2 = (Intent) intent.getExtras().getParcelable("to_start_intent");
            if (intent2 != null) {
                this.f5218a.sendMessageDelayed(this.f5218a.obtainMessage(0, intent2), 300L);
            } else if (c3j.d()) {
                throw new RuntimeException("to start intent is null!");
            }
        }
    }
}
