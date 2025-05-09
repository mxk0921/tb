package com.meizu.cloud.pushsdk.d.k;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.meizu.cloud.pushinternal.DebugLogger;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private AlarmManager f5789a;
    private Context b;
    private Runnable c;
    private long d;
    private int e;
    private b f;
    private PendingIntent g;
    private String h;
    private boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction().equals("alarm.util")) {
                DebugLogger.i("AlarmUtils", "on receive delayed task, keyword: " + a.this.h);
                a.this.i = true;
                a.this.b();
                a.this.c.run();
            }
        }
    }

    public a(Context context, Runnable runnable, long j) {
        this(context, runnable, j, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            b bVar = this.f;
            if (bVar != null) {
                this.b.unregisterReceiver(bVar);
                this.f = null;
            }
        } catch (Exception e) {
            DebugLogger.e("AlarmUtils", "clean error, " + e.getMessage());
        }
    }

    public a(Context context, Runnable runnable, long j, boolean z) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = runnable;
        this.d = j;
        this.e = !z ? 1 : 0;
        this.f5789a = (AlarmManager) applicationContext.getSystemService("alarm");
        this.i = true;
    }

    public void a() {
        if (!(this.f5789a == null || this.g == null || this.i)) {
            DebugLogger.i("AlarmUtils", "cancel  delayed task, keyword: " + this.h);
            this.f5789a.cancel(this.g);
        }
        b();
    }

    public boolean c() {
        if (!this.i) {
            DebugLogger.e("AlarmUtils", "last task not completed");
            return false;
        }
        this.i = false;
        b bVar = new b();
        this.f = bVar;
        this.b.registerReceiver(bVar, new IntentFilter("alarm.util"));
        this.h = String.valueOf(System.currentTimeMillis());
        this.g = ya.e(this.b, 0, new Intent("alarm.util"), 1140850688);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f5789a.setExactAndAllowWhileIdle(this.e, System.currentTimeMillis() + this.d, this.g);
        } else {
            this.f5789a.setExact(this.e, System.currentTimeMillis() + this.d, this.g);
        }
        DebugLogger.i("AlarmUtils", "start delayed task, keyword: " + this.h);
        return true;
    }
}
