package com.amap.api.location;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.loc.at;
import com.loc.f;
import com.loc.fr;
import tb.bmv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APSService extends Service {

    /* renamed from: a  reason: collision with root package name */
    f f4585a;
    int b = 0;
    boolean c = false;

    private void a(Context context) {
        try {
            if (this.f4585a == null) {
                this.f4585a = new f(context);
            }
            this.f4585a.a();
        } catch (Throwable th) {
            fr.a(th, "APSService", "onCreate");
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f4585a.a(intent);
        } catch (Throwable th) {
            fr.a(th, "APSService", "onBind");
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f4585a.b();
            if (this.c) {
                stopForeground(true);
            }
        } catch (Throwable th) {
            fr.a(th, "APSService", "onDestroy");
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra(at.f, 0);
                if (intExtra == 1) {
                    int intExtra2 = intent.getIntExtra(bmv.MSGTYPE_INTERVAL, 0);
                    Notification notification = (Notification) intent.getParcelableExtra("h");
                    if (!(intExtra2 == 0 || notification == null)) {
                        startForeground(intExtra2, notification);
                        this.c = true;
                        this.b++;
                    }
                } else if (intExtra == 2) {
                    if (intent.getBooleanExtra(at.j, true) && (i3 = this.b) > 0) {
                        this.b = i3 - 1;
                    }
                    if (this.b <= 0) {
                        stopForeground(true);
                        this.c = false;
                    } else {
                        stopForeground(false);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}
