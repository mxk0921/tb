package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.uc.webview.export.extension.UCExtension;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fj;
import tb.ya;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fk implements fj.a {

    /* renamed from: a  reason: collision with other field name */
    protected Context f988a;

    /* renamed from: a  reason: collision with other field name */
    private PendingIntent f987a = null;

    /* renamed from: a  reason: collision with root package name */
    private volatile long f14878a = 0;

    public fk(Context context) {
        this.f988a = null;
        this.f988a = context;
    }

    @Override // com.xiaomi.push.fj.a
    /* renamed from: a */
    public void mo693a() {
        if (this.f987a != null) {
            try {
                ((AlarmManager) this.f988a.getSystemService("alarm")).cancel(this.f987a);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f987a = null;
                b.c("[Alarm] unregister timer");
                this.f14878a = 0L;
                throw th;
            }
            this.f987a = null;
            b.c("[Alarm] unregister timer");
            this.f14878a = 0L;
        }
        this.f14878a = 0L;
    }

    private void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 2, Long.valueOf(j), pendingIntent);
        } catch (Exception e) {
            b.d("[Alarm] invoke setExact method meet error. " + e);
        }
    }

    public void a(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f988a.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT;
        Context context = this.f988a;
        this.f987a = i >= 31 ? ya.e(context, 0, intent, UCExtension.EXTEND_INPUT_TYPE_IDCARD) : ya.e(context, 0, intent, 0);
        if (i >= 31 && !j.m869a(this.f988a)) {
            alarmManager.set(2, j, this.f987a);
        } else if (i >= 23) {
            bh.a((Object) alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.f987a);
        } else {
            a(alarmManager, j, this.f987a);
        }
        b.c("[Alarm] register timer " + j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r8.f14878a < r4) goto L_0x0038;
     */
    @Override // com.xiaomi.push.fj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f988a
            com.xiaomi.push.service.p r0 = com.xiaomi.push.service.p.a(r0)
            long r0 = r0.m1079a()
            r2 = 0
            if (r9 != 0) goto L_0x0015
            long r4 = r8.f14878a
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0015
            return
        L_0x0015:
            if (r9 == 0) goto L_0x001a
            r8.mo693a()
        L_0x001a:
            long r4 = android.os.SystemClock.elapsedRealtime()
            if (r9 != 0) goto L_0x003c
            long r6 = r8.f14878a
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x0027
            goto L_0x003c
        L_0x0027:
            long r2 = r8.f14878a
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0040
            long r2 = r8.f14878a
            long r2 = r2 + r0
            r8.f14878a = r2
            long r2 = r8.f14878a
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0040
        L_0x0038:
            long r4 = r4 + r0
            r8.f14878a = r4
            goto L_0x0040
        L_0x003c:
            long r2 = r4 % r0
            long r0 = r0 - r2
            goto L_0x0038
        L_0x0040:
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r0 = com.xiaomi.push.service.bj.q
            r9.<init>(r0)
            android.content.Context r0 = r8.f988a
            java.lang.String r0 = r0.getPackageName()
            r9.setPackage(r0)
            long r0 = r8.f14878a
            r8.a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fk.a(boolean):void");
    }

    @Override // com.xiaomi.push.fj.a
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo693a() {
        return this.f14878a != 0;
    }
}
