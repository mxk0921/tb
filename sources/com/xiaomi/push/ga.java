package com.xiaomi.push;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ga implements gt {

    /* renamed from: a  reason: collision with root package name */
    private int f14894a;

    /* renamed from: a  reason: collision with other field name */
    gq f1021a;

    /* renamed from: a  reason: collision with other field name */
    XMPushService f1022a;

    /* renamed from: a  reason: collision with other field name */
    private Exception f1023a;
    private long e;
    private long f;

    /* renamed from: a  reason: collision with other field name */
    private long f1020a = 0;
    private long b = 0;
    private long c = 0;
    private long d = 0;

    /* renamed from: a  reason: collision with other field name */
    private String f1024a = "";

    public ga(XMPushService xMPushService) {
        this.e = 0L;
        this.f = 0L;
        this.f1022a = xMPushService;
        b();
        int myUid = Process.myUid();
        try {
            this.f = TrafficStats.getUidRxBytes(myUid);
            this.e = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e) {
            b.m410a("Failed to obtain traffic data during initialization: " + e);
            this.f = -1L;
            this.e = -1L;
        }
    }

    private void b() {
        this.b = 0L;
        this.d = 0L;
        this.f1020a = 0L;
        this.c = 0L;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bg.b(this.f1022a)) {
            this.f1020a = elapsedRealtime;
        }
        if (this.f1022a.m988c()) {
            this.c = elapsedRealtime;
        }
    }

    private synchronized void c() {
        b.c("stat connpt = " + this.f1024a + " netDuration = " + this.b + " ChannelDuration = " + this.d + " channelConnectedTime = " + this.c);
        fu fuVar = new fu();
        fuVar.f997a = (byte) 0;
        fuVar.a(ft.CHANNEL_ONLINE_RATE.a());
        fuVar.a(this.f1024a);
        fuVar.d((int) (System.currentTimeMillis() / 1000));
        fuVar.b((int) (this.b / 1000));
        fuVar.c((int) (this.d / 1000));
        gb.m710a().a(fuVar);
        b();
    }

    public Exception a() {
        return this.f1023a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m709a() {
        try {
            XMPushService xMPushService = this.f1022a;
            if (xMPushService != null) {
                String a2 = bg.m508a((Context) xMPushService);
                boolean c = bg.c(this.f1022a);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.f1020a;
                if (j > 0) {
                    this.b += elapsedRealtime - j;
                    this.f1020a = 0L;
                }
                long j2 = this.c;
                if (j2 != 0) {
                    this.d += elapsedRealtime - j2;
                    this.c = 0L;
                }
                if (c) {
                    if ((!TextUtils.equals(this.f1024a, a2) && this.b > 30000) || this.b > 5400000) {
                        c();
                    }
                    this.f1024a = a2;
                    if (this.f1020a == 0) {
                        this.f1020a = elapsedRealtime;
                    }
                    if (this.f1022a.m988c()) {
                        this.c = elapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.push.gt
    public void b(gq gqVar) {
        m709a();
        this.c = SystemClock.elapsedRealtime();
        gd.a(0, ft.CONN_SUCCESS.a(), gqVar.m737a(), gqVar.mo750a());
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar) {
        this.f14894a = 0;
        this.f1023a = null;
        this.f1021a = gqVar;
        this.f1024a = bg.m508a((Context) this.f1022a);
        gd.a(0, ft.CONN_SUCCESS.a());
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, int i, Exception exc) {
        long j;
        long j2;
        if (this.f14894a == 0 && this.f1023a == null) {
            this.f14894a = i;
            this.f1023a = exc;
            gd.b(gqVar.m737a(), exc);
        }
        if (i == 22 && this.c != 0) {
            long a2 = gqVar.a() - this.c;
            if (a2 < 0) {
                a2 = 0;
            }
            this.d += a2 + (gw.b() / 2);
            this.c = 0L;
        }
        m709a();
        int myUid = Process.myUid();
        try {
            j = TrafficStats.getUidRxBytes(myUid);
            j2 = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e) {
            b.m410a("Failed to obtain traffic data: " + e);
            j = -1;
            j2 = -1L;
        }
        b.c("Stats rx=" + (j - this.f) + ", tx=" + (j2 - this.e));
        this.f = j;
        this.e = j2;
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, Exception exc) {
        gd.a(0, ft.CHANNEL_CON_FAIL.a(), 1, gqVar.m737a(), bg.c(this.f1022a) ? 1 : 0);
        m709a();
    }
}
