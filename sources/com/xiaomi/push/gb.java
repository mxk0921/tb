package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bi;
import com.xiaomi.push.ke;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bw;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gb {

    /* renamed from: a  reason: collision with root package name */
    private int f14895a;

    /* renamed from: a  reason: collision with other field name */
    private long f1025a;

    /* renamed from: a  reason: collision with other field name */
    private ga f1027a;

    /* renamed from: a  reason: collision with other field name */
    private String f1028a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f1029a = false;

    /* renamed from: a  reason: collision with other field name */
    private bi f1026a = bi.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final gb f14896a = new gb();
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized fu m712a() {
        fu fuVar;
        fuVar = new fu();
        fuVar.a(bg.m508a((Context) this.f1027a.f1022a));
        fuVar.f997a = (byte) 0;
        fuVar.f1001b = 1;
        fuVar.d((int) (System.currentTimeMillis() / 1000));
        return fuVar;
    }

    public boolean b() {
        m711a();
        if (!this.f1029a || this.f1026a.m514a() <= 0) {
            return false;
        }
        return true;
    }

    private fu a(bi.a aVar) {
        if (aVar.f767a == 0) {
            Object obj = aVar.f768a;
            if (obj instanceof fu) {
                return (fu) obj;
            }
            return null;
        }
        fu a2 = m712a();
        a2.a(ft.CHANNEL_STATS_COUNTER.a());
        a2.c(aVar.f767a);
        a2.c(aVar.f769a);
        return a2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized fv m713a() {
        fv fvVar;
        if (b()) {
            fvVar = a(!bg.e(this.f1027a.f1022a) ? 375 : 750);
        } else {
            fvVar = null;
        }
        return fvVar;
    }

    private fv a(int i) {
        ArrayList arrayList = new ArrayList();
        fv fvVar = new fv(this.f1028a, arrayList);
        if (!bg.e(this.f1027a.f1022a)) {
            fvVar.a(i.i(this.f1027a.f1022a));
        }
        kg kgVar = new kg(i);
        jy a2 = new ke.a().a(kgVar);
        try {
            fvVar.b(a2);
        } catch (js unused) {
        }
        LinkedList<bi.a> a3 = this.f1026a.m515a();
        while (a3.size() > 0) {
            try {
                fu a4 = a(a3.getLast());
                if (a4 != null) {
                    a4.b(a2);
                }
                if (kgVar.a_() > i) {
                    break;
                }
                if (a4 != null) {
                    arrayList.add(a4);
                }
                a3.removeLast();
            } catch (js | NoSuchElementException unused2) {
            }
        }
        return fvVar;
    }

    public static ga a() {
        ga gaVar;
        gb gbVar = a.f14896a;
        synchronized (gbVar) {
            gaVar = gbVar.f1027a;
        }
        return gaVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static gb m710a() {
        return a.f14896a;
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m711a() {
        if (this.f1029a && System.currentTimeMillis() - this.f1025a > this.f14895a) {
            this.f1029a = false;
            this.f1025a = 0L;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m714a(int i) {
        if (i > 0) {
            int i2 = i * 1000;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.f14895a != i2 || !this.f1029a) {
                this.f1029a = true;
                this.f1025a = System.currentTimeMillis();
                this.f14895a = i2;
                b.c("enable dot duration = " + i2 + " start = " + this.f1025a);
            }
        }
    }

    public synchronized void a(fu fuVar) {
        this.f1026a.a(fuVar);
    }

    public synchronized void a(XMPushService xMPushService) {
        this.f1027a = new ga(xMPushService);
        this.f1028a = "";
        bw.a().a(new gc(this));
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m715a() {
        return this.f1029a;
    }
}
