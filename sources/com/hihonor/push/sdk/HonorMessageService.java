package com.hihonor.push.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.hihonor.push.sdk.common.data.DownMsgType;
import org.json.JSONException;
import tb.bsx;
import tb.m9y;
import tb.o3y;
import tb.o5b;
import tb.qdy;
import tb.r5b;
import tb.ryx;
import tb.s4y;
import tb.zsx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class HonorMessageService extends Service {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f5221a;
    public final Messenger b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                int i = HonorMessageService.c;
                HonorMessageService.this.a(intent);
            }
        }
    }

    public HonorMessageService() {
        a aVar = new a(Looper.getMainLooper());
        this.f5221a = aVar;
        this.b = new Messenger(aVar);
    }

    public static /* synthetic */ void c(HonorMessageService honorMessageService, m9y m9yVar) {
        honorMessageService.a(m9yVar);
    }

    public final void a(Intent intent) {
        try {
            if (TextUtils.equals(intent.getStringExtra("event_type"), DownMsgType.RECEIVE_TOKEN)) {
                String stringExtra = intent.getStringExtra("push_token");
                Context d = s4y.e.d();
                ryx ryxVar = ryx.b;
                if (!TextUtils.equals(stringExtra, ryxVar.c(d))) {
                    ryxVar.b(d, stringExtra);
                }
                onNewToken(stringExtra);
                return;
            }
            b(intent);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public final void b(Intent intent) {
        m9y f = zsx.f(new bsx(intent));
        o5b o5bVar = new o5b(this);
        f.getClass();
        f.a(new o3y(qdy.c.f26691a, o5bVar));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.b.getBinder();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        a(intent);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(m9y m9yVar) {
        if (m9yVar.f()) {
            r5b r5bVar = (r5b) m9yVar.d();
            if (r5bVar != null) {
                onMessageReceived(r5bVar);
                return;
            }
            return;
        }
        boolean z = m9yVar.c() instanceof JSONException;
    }

    public void onMessageReceived(r5b r5bVar) {
    }

    public void onNewToken(String str) {
    }
}
