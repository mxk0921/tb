package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.p;
import java.io.IOException;
import java.net.Socket;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class gx extends gq {

    /* renamed from: a  reason: collision with other field name */
    protected Socket f1084a;
    protected XMPushService b;
    private int c;
    private String d;

    /* renamed from: a  reason: collision with root package name */
    protected Exception f14916a = null;

    /* renamed from: c  reason: collision with other field name */
    String f1085c = null;
    protected volatile long e = 0;
    protected volatile long f = 0;
    protected volatile long g = 0;
    private long h = 0;

    public gx(XMPushService xMPushService, gr grVar) {
        super(xMPushService, grVar);
        this.b = xMPushService;
    }

    @Override // com.xiaomi.push.gq
    /* renamed from: a */
    public Context mo750a() {
        return this.b;
    }

    /* renamed from: a */
    public abstract void mo732a(boolean z);

    @Override // com.xiaomi.push.gq
    public void b(int i, Exception exc) {
        a(i, exc);
        if ((exc != null || i == 18) && this.g != 0) {
            a(exc);
        }
    }

    @Override // com.xiaomi.push.gq
    public String c() {
        return ((gq) this).f1070a;
    }

    public synchronized void e() {
        try {
            if (!m743c() && !m742b()) {
                a(0, 0, (Exception) null);
                a(((gq) this).f1067a);
                return;
            }
            b.m410a("WARNING: current xmpp has connected");
        } catch (IOException e) {
            throw new hb(e);
        }
    }

    public void f() {
        this.e = SystemClock.elapsedRealtime();
    }

    public void g() {
        this.f = SystemClock.elapsedRealtime();
    }

    @Override // com.xiaomi.push.gq
    public co a(String str) {
        co a2 = cs.a().a(str, false);
        if (!a2.b()) {
            ht.a(new ha(this, str));
        }
        return a2;
    }

    @Override // com.xiaomi.push.gq
    public void b(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        mo732a(z);
        p.a(this.b).m1084c();
        if (!z) {
            this.b.a(new gy(this, 13, elapsedRealtime, currentTimeMillis), 10000L);
        }
    }

    public void c(int i, Exception exc) {
        this.b.a(new gz(this, 2, i, exc));
    }

    @Override // com.xiaomi.push.gq
    /* renamed from: a  reason: collision with other method in class */
    public String mo750a() {
        return this.d;
    }

    @Override // com.xiaomi.push.gq
    /* renamed from: a */
    public Socket mo750a() {
        return new Socket();
    }

    @Override // com.xiaomi.push.gq
    /* renamed from: a  reason: collision with other method in class */
    public synchronized void mo750a() {
    }

    public synchronized void a(int i, Exception exc) {
        if (b() != 2) {
            a(2, i, exc);
            ((gq) this).f1070a = "";
            try {
                this.f1084a.close();
            } catch (Throwable unused) {
            }
            this.e = 0L;
            this.f = 0L;
        }
    }

    private void a(gr grVar) {
        a(grVar.c(), grVar.mo744a());
    }

    public void a(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.g < 300000) {
            if (bg.b(this.b)) {
                int i = this.c + 1;
                this.c = i;
                if (i >= 2) {
                    String a2 = mo750a();
                    b.m410a("max short conn time reached, sink down current host:" + a2);
                    a(a2, 0L, exc);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r32, int r33) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gx.a(java.lang.String, int):void");
    }

    public void a(String str, long j, Exception exc) {
        co a2 = cs.a().a(gr.a(), false);
        if (a2 != null) {
            a2.b(str, j, 0L, exc);
            cs.a().m571c();
        }
    }

    @Override // com.xiaomi.push.gq
    public void a(gf[] gfVarArr) {
        throw new hb("Don't support send Blob");
    }
}
