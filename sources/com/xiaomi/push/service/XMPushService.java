package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.taobao.weex.common.Constants;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.aa;
import com.xiaomi.push.ah;
import com.xiaomi.push.an;
import com.xiaomi.push.bg;
import com.xiaomi.push.bl;
import com.xiaomi.push.cs;
import com.xiaomi.push.db;
import com.xiaomi.push.dk;
import com.xiaomi.push.ds;
import com.xiaomi.push.du;
import com.xiaomi.push.es;
import com.xiaomi.push.fd;
import com.xiaomi.push.fj;
import com.xiaomi.push.gb;
import com.xiaomi.push.gd;
import com.xiaomi.push.gf;
import com.xiaomi.push.gm;
import com.xiaomi.push.gq;
import com.xiaomi.push.gr;
import com.xiaomi.push.gt;
import com.xiaomi.push.gv;
import com.xiaomi.push.gw;
import com.xiaomi.push.hb;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hv;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.ic;
import com.xiaomi.push.ih;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.jc;
import com.xiaomi.push.jm;
import com.xiaomi.push.js;
import com.xiaomi.push.service.bf;
import com.xiaomi.push.service.bq;
import com.xiaomi.push.service.q;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.o78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class XMPushService extends Service implements gt {
    private static boolean b;

    /* renamed from: a  reason: collision with other field name */
    private ContentObserver f1500a;

    /* renamed from: a  reason: collision with other field name */
    private gm f1502a;

    /* renamed from: a  reason: collision with other field name */
    private gq f1503a;

    /* renamed from: a  reason: collision with other field name */
    private gr f1504a;

    /* renamed from: a  reason: collision with other field name */
    private a f1506a;

    /* renamed from: a  reason: collision with other field name */
    private f f1507a;

    /* renamed from: a  reason: collision with other field name */
    private k f1508a;

    /* renamed from: a  reason: collision with other field name */
    private r f1509a;

    /* renamed from: a  reason: collision with other field name */
    private t f1510a;

    /* renamed from: a  reason: collision with other field name */
    private bp f1512a;

    /* renamed from: a  reason: collision with other field name */
    private com.xiaomi.push.service.k f1513a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f1518a = false;

    /* renamed from: a  reason: collision with root package name */
    private int f15012a = 0;

    /* renamed from: b  reason: collision with other field name */
    private int f1519b = 0;

    /* renamed from: a  reason: collision with other field name */
    private long f1499a = 0;

    /* renamed from: a  reason: collision with other field name */
    protected Class f1515a = XMJobService.class;
    private int c = -1;

    /* renamed from: a  reason: collision with other field name */
    private bd f1511a = null;

    /* renamed from: a  reason: collision with other field name */
    private com.xiaomi.push.service.q f1514a = null;

    /* renamed from: a  reason: collision with other field name */
    Messenger f1501a = null;

    /* renamed from: a  reason: collision with other field name */
    private Collection<aq> f1517a = Collections.synchronizedCollection(new ArrayList());

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<n> f1516a = new ArrayList<>();

    /* renamed from: a  reason: collision with other field name */
    private gv f1505a = new cj(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with other field name */
        private final Object f1520a;

        private a() {
            this.f1520a = new Object();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f1520a) {
                try {
                    this.f1520a.notifyAll();
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m410a("[Alarm] notify lock. " + e);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            com.xiaomi.channel.commonutils.logger.b.c("[Alarm] heartbeat alarm has been triggered.");
            if (!bj.q.equals(intent.getAction())) {
                com.xiaomi.channel.commonutils.logger.b.m410a("[Alarm] cancel the old ping timer");
                fj.a();
            } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                    a(3000L);
                    com.xiaomi.channel.commonutils.logger.b.m410a("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }

        public /* synthetic */ a(XMPushService xMPushService, cj cjVar) {
            this();
        }

        private void a(long j) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f1520a) {
                try {
                    this.f1520a.wait(j);
                } catch (InterruptedException e) {
                    com.xiaomi.channel.commonutils.logger.b.m410a("[Alarm] interrupt from waiting state. " + e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b extends j {

        /* renamed from: a  reason: collision with other field name */
        bf.b f1521a;

        public b(bf.b bVar) {
            super(9);
            this.f1521a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "bind the client. " + this.f1521a.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            String str;
            try {
                if (!XMPushService.this.m988c()) {
                    com.xiaomi.channel.commonutils.logger.b.d("trying bind while the connection is not created, quit!");
                    return;
                }
                bf a2 = bf.a();
                bf.b bVar = this.f1521a;
                bf.b a3 = a2.a(bVar.g, bVar.f1590b);
                if (a3 == null) {
                    str = "ignore bind because the channel " + this.f1521a.g + " is removed ";
                } else if (a3.f1585a == bf.c.unbind) {
                    a3.a(bf.c.binding, 0, 0, (String) null, (String) null);
                    XMPushService.this.f1503a.a(a3);
                    gd.a(XMPushService.this, a3);
                    return;
                } else {
                    str = "trying duplicate bind, ingore! " + a3.f1585a;
                }
                com.xiaomi.channel.commonutils.logger.b.m410a(str);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("Meet error when trying to bind. " + e);
                XMPushService.this.a(10, e);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c extends j {

        /* renamed from: a  reason: collision with root package name */
        private final bf.b f15015a;

        public c(bf.b bVar) {
            super(12);
            this.f15015a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "bind time out. chid=" + this.f15015a.g;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return TextUtils.equals(((c) obj).f15015a.g, this.f15015a.g);
        }

        public int hashCode() {
            return this.f15015a.g.hashCode();
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            this.f15015a.a(bf.c.unbind, 1, 21, (String) null, (String) null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class d extends j {

        /* renamed from: a  reason: collision with root package name */
        private gf f15016a;

        public d(gf gfVar) {
            super(8);
            this.f15016a = gfVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            XMPushService.this.f1511a.a(this.f15016a);
            if (com.xiaomi.push.service.e.a(this.f15016a)) {
                XMPushService.this.a(new bq.a(), 15000L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class e extends j {
        public e() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "do reconnect..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            if (XMPushService.this.m983a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m410a("should not connect. quit the job.");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class g extends j {

        /* renamed from: a  reason: collision with other field name */
        public Exception f1523a;
        public int b;

        public g(int i, Exception exc) {
            super(2);
            this.b = i;
            this.f1523a = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "disconnect the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            XMPushService.this.a(this.b, this.f1523a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class h extends j {
        public h() {
            super(65535);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "Init Job";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            XMPushService.this.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class i extends j {

        /* renamed from: a  reason: collision with root package name */
        private Intent f15021a;

        public i(Intent intent) {
            super(15);
            this.f15021a = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "Handle intent action = " + this.f15021a.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            XMPushService.this.d(this.f15021a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class j extends q.b {
        public j(int i) {
            super(i);
        }

        /* renamed from: a */
        public abstract String mo1104a();

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f15122a;
            if (!(i == 4 || i == 8)) {
                com.xiaomi.channel.commonutils.logger.b.m411a(com.xiaomi.channel.commonutils.logger.a.f14679a, mo1104a());
            }
            a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class k extends BroadcastReceiver {
        public k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.b.m410a("[HB] hold short heartbeat, " + com.xiaomi.push.j.a(intent));
            if (intent != null && intent.getExtras() != null) {
                XMPushService.this.onStart(intent, 1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class l extends j {
        public l() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "ask the job queue to quit";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            XMPushService.this.f1514a.m1086a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class m extends j {

        /* renamed from: a  reason: collision with root package name */
        private hh f15024a;

        public m(hh hhVar) {
            super(8);
            this.f15024a = hhVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            XMPushService.this.f1511a.a(this.f15024a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface n {
        /* renamed from: a */
        void mo775a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class o extends j {

        /* renamed from: a  reason: collision with other field name */
        boolean f1526a;

        public o(boolean z) {
            super(4);
            this.f1526a = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "send ping..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            if (XMPushService.this.m988c()) {
                try {
                    if (!this.f1526a) {
                        gd.a();
                    }
                    XMPushService.this.f1503a.b(this.f1526a);
                } catch (hb e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    XMPushService.this.a(10, e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class p extends j {

        /* renamed from: a  reason: collision with other field name */
        bf.b f1527a;

        public p(bf.b bVar) {
            super(4);
            this.f1527a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "rebind the client. " + this.f1527a.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            try {
                this.f1527a.a(bf.c.unbind, 1, 16, (String) null, (String) null);
                gq gqVar = XMPushService.this.f1503a;
                bf.b bVar = this.f1527a;
                gqVar.a(bVar.g, bVar.f1590b);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.a(new b(this.f1527a), 300L);
            } catch (hb e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
                XMPushService.this.a(10, e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class q extends j {
        public q() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "reset the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            XMPushService.this.a(11, (Exception) null);
            if (XMPushService.this.m983a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class r extends BroadcastReceiver {
        public r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class s extends j {

        /* renamed from: a  reason: collision with other field name */
        bf.b f1528a;

        /* renamed from: a  reason: collision with other field name */
        String f1529a;
        int b;

        /* renamed from: b  reason: collision with other field name */
        String f1530b;

        public s(bf.b bVar, int i, String str, String str2) {
            super(9);
            this.f1528a = bVar;
            this.b = i;
            this.f1529a = str;
            this.f1530b = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo1104a() {
            return "unbind the channel. " + this.f1528a.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo1104a() {
            if (!(this.f1528a.f1585a == bf.c.unbind || XMPushService.this.f1503a == null)) {
                try {
                    gq gqVar = XMPushService.this.f1503a;
                    bf.b bVar = this.f1528a;
                    gqVar.a(bVar.g, bVar.f1590b);
                } catch (hb e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    XMPushService.this.a(10, e);
                }
            }
            this.f1528a.a(bf.c.unbind, this.b, 0, this.f1530b, this.f1529a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class t extends BroadcastReceiver {
        public t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f1518a) {
                XMPushService.this.f1518a = true;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc A[Catch: Exception -> 0x00e2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e2, blocks: (B:26:0x00d6, B:28:0x00dc), top: B:32:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r9 = this;
            r0 = 1
            com.xiaomi.push.cs r1 = com.xiaomi.push.cs.a()
            r1.m572d()
            android.content.Context r1 = r9.getApplicationContext()
            com.xiaomi.push.service.p r1 = com.xiaomi.push.service.p.a(r1)
            r1.m1080a()
            android.content.Context r1 = r9.getApplicationContext()
            com.xiaomi.push.service.a r1 = com.xiaomi.push.service.a.a(r1)
            java.lang.String r2 = r1.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "region of cache is "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "XMPushService"
            com.xiaomi.channel.commonutils.logger.b.m411a(r4, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r5 = ""
            if (r3 == 0) goto L_0x004b
            java.lang.String r2 = r9.b()
            com.xiaomi.push.m r3 = com.xiaomi.push.j.a(r2)
            java.lang.String r3 = r3.name()
            r8 = r3
            r3 = r2
            r2 = r8
            goto L_0x004c
        L_0x004b:
            r3 = r5
        L_0x004c:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r7 = "CN"
            if (r6 != 0) goto L_0x0068
            com.xiaomi.push.m r6 = com.xiaomi.push.m.China
            java.lang.String r6 = r6.name()
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0068
            r1.a(r2, r0)
            r1.b(r7, r0)
        L_0x0066:
            r3 = r7
            goto L_0x0090
        L_0x0068:
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x008a
            java.lang.String r2 = "com.xiaomi.xmsf"
            java.lang.String r3 = r9.getPackageName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x007c
            r7 = r5
            goto L_0x0082
        L_0x007c:
            com.xiaomi.push.m r2 = com.xiaomi.push.m.China
            java.lang.String r5 = r2.name()
        L_0x0082:
            r1.a(r5, r0)
            r1.b(r7, r0)
            r2 = r5
            goto L_0x0066
        L_0x008a:
            com.xiaomi.push.m r1 = com.xiaomi.push.m.China
            java.lang.String r2 = r1.name()
        L_0x0090:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = "after check, appRegion is "
            r6 = 0
            r1[r6] = r5
            r1[r0] = r2
            java.lang.String r0 = ", countryCode="
            r5 = 2
            r1[r5] = r0
            r0 = 3
            r1[r0] = r3
            com.xiaomi.channel.commonutils.logger.b.m412a(r4, r1)
            com.xiaomi.push.m r0 = com.xiaomi.push.m.China
            java.lang.String r0 = r0.name()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "cn.app.chat.xiaomi.net"
            com.xiaomi.push.gr.a(r0)
        L_0x00b6:
            a(r2)
            boolean r0 = r9.m977h()
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = "-->postOnCreate(): try trigger connect now"
            com.xiaomi.channel.commonutils.logger.b.m411a(r4, r0)
            com.xiaomi.push.service.ct r0 = new com.xiaomi.push.service.ct
            r1 = 11
            r0.<init>(r9, r1)
            r9.a(r0)
            com.xiaomi.push.service.cu r1 = new com.xiaomi.push.service.cu
            r1.<init>(r9, r0)
            com.xiaomi.push.service.v.a(r1)
        L_0x00d6:
            boolean r0 = com.xiaomi.push.r.m965a()     // Catch: Exception -> 0x00e2
            if (r0 == 0) goto L_0x00e6
            com.xiaomi.push.service.k r0 = r9.f1513a     // Catch: Exception -> 0x00e2
            r0.a(r9)     // Catch: Exception -> 0x00e2
            goto L_0x00e6
        L_0x00e2:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r0)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.c():void");
    }

    private void d() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
            networkInfo = null;
        }
        com.xiaomi.push.service.p.a(getApplicationContext()).a(networkInfo);
        if (networkInfo != null) {
            StringBuilder sb = new StringBuilder("network changed,");
            sb.append("[type: " + networkInfo.getTypeName() + "[" + networkInfo.getSubtypeName() + "], state: " + networkInfo.getState() + "/" + networkInfo.getDetailedState());
            com.xiaomi.channel.commonutils.logger.b.m411a("XMPushService", sb.toString());
            NetworkInfo.State state = networkInfo.getState();
            if (state == NetworkInfo.State.SUSPENDED || state == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.b.m411a("XMPushService", "network changed, no active network");
        }
        if (gb.a() != null) {
            gb.a().m709a();
        }
        hv.m773a((Context) this);
        this.f1502a.d();
        if (bg.b(this)) {
            if (m988c() && m975f()) {
                b(false);
            }
            if (!m988c() && !m989d()) {
                this.f1514a.a(1);
                a(new e());
            }
            du.a(this).a();
        } else {
            a(new g(2, null));
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!m983a()) {
            fj.a();
        } else if (!fj.m690a()) {
            fj.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String str;
        gq gqVar = this.f1503a;
        if (gqVar == null || !gqVar.m742b()) {
            gq gqVar2 = this.f1503a;
            if (gqVar2 == null || !gqVar2.m743c()) {
                this.f1504a.b(bg.m508a((Context) this));
                g();
                if (this.f1503a == null) {
                    bf.a().a(this);
                    c(false);
                    return;
                }
                return;
            }
            str = "try to connect while is connected.";
        } else {
            str = "try to connect while connecting.";
        }
        com.xiaomi.channel.commonutils.logger.b.d(str);
    }

    private void g() {
        try {
            this.f1502a.a(this.f1505a, new cm(this));
            this.f1502a.e();
            this.f1503a = this.f1502a;
        } catch (hb e2) {
            com.xiaomi.channel.commonutils.logger.b.a("fail to create Slim connection", e2);
            this.f1502a.b(3, e2);
        }
    }

    private void h() {
    }

    private void i() {
        synchronized (this.f1516a) {
            this.f1516a.clear();
        }
    }

    private boolean j() {
        int intValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i2 = this.f15012a;
        int i3 = this.f1519b;
        if (i2 > i3) {
            if (intValue >= i2 || intValue < i3) {
                return true;
            }
        } else if (i2 < i3 && intValue >= i2 && intValue < i3) {
            return true;
        }
        return false;
    }

    private boolean k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return az.a(this).a(ih.ForegroundServiceSwitch.a(), false);
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m979a() {
        if (this.c < 0) {
            this.c = com.xiaomi.push.g.a((Context) this, "com.xiaomi.xmsf");
        }
        return this.c;
    }

    /* renamed from: b  reason: collision with other method in class */
    public com.xiaomi.push.service.k m985b() {
        return this.f1513a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1501a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] split;
        super.onCreate();
        com.xiaomi.channel.commonutils.logger.b.a(getApplicationContext());
        com.xiaomi.push.r.a((Context) this);
        u a2 = v.m1097a((Context) this);
        if (a2 != null) {
            aa.a(a2.f15130a);
        }
        if (com.xiaomi.push.j.m869a(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f1506a = new a(this, null);
            com.xiaomi.push.l.a(this, this.f1506a, new IntentFilter(bj.q), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler, 4);
            b = true;
            handler.post(new co(this));
        }
        this.f1501a = new Messenger(new cp(this));
        bk.a(this);
        cq cqVar = new cq(this, null, 5222, "xiaomi.com", null);
        this.f1504a = cqVar;
        cqVar.a(true);
        this.f1502a = new gm(this, this.f1504a);
        this.f1513a = m981a();
        fj.a(this);
        this.f1502a.a(this);
        this.f1511a = new bd(this);
        this.f1512a = new bp(this);
        new com.xiaomi.push.service.l().a();
        gb.m710a().a(this);
        this.f1514a = new com.xiaomi.push.service.q("Connection Controller Thread");
        bf a3 = bf.a();
        a3.b();
        a3.a(new cr(this));
        if (k()) {
            h();
        }
        ia.a(this).a(new com.xiaomi.push.service.s(this), "UPLOADER_PUSH_CHANNEL");
        a(new hx(this));
        a(new ch(this));
        if (com.xiaomi.push.j.m869a((Context) this)) {
            a(new be());
        }
        a(new h());
        this.f1517a.add(by.a(this));
        if (m977h()) {
            this.f1507a = new f();
            registerReceiver(this.f1507a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (com.xiaomi.push.j.m869a(getApplicationContext())) {
            this.f1510a = new t();
            com.xiaomi.push.l.a(this, this.f1510a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null, 2);
            k kVar = new k();
            this.f1508a = kVar;
            com.xiaomi.push.l.a(this, kVar, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null, 2);
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f1500a = new cs(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f1500a);
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.b.d("register super-power-mode observer err:" + th.getMessage());
                }
            }
            int[] a4 = m973a();
            if (a4 != null) {
                this.f1509a = new r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                registerReceiver(this.f1509a, intentFilter);
                this.f15012a = a4[0];
                this.f1519b = a4[1];
                com.xiaomi.channel.commonutils.logger.b.m410a("falldown initialized: " + this.f15012a + "," + this.f1519b);
            }
        }
        db.a(this, this.f1502a);
        dk.a(this, this.f1502a);
        String str = "";
        if (a2 != null) {
            try {
                if (!TextUtils.isEmpty(a2.f1658a) && (split = a2.f1658a.split("@")) != null && split.length > 0) {
                    str = split[0];
                }
            } catch (Exception unused) {
            }
        }
        ds.a(this);
        com.xiaomi.channel.commonutils.logger.b.e("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + com.xiaomi.push.g.a(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        f fVar = this.f1507a;
        if (fVar != null) {
            a(fVar);
            this.f1507a = null;
        }
        t tVar = this.f1510a;
        if (tVar != null) {
            a(tVar);
            this.f1510a = null;
        }
        k kVar = this.f1508a;
        if (kVar != null) {
            a(kVar);
            this.f1508a = null;
        }
        r rVar = this.f1509a;
        if (rVar != null) {
            a(rVar);
            this.f1509a = null;
        }
        a aVar = this.f1506a;
        if (aVar != null) {
            a(aVar);
            this.f1506a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f1500a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f1500a);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.d("unregister super-power-mode err:" + th.getMessage());
            }
        }
        this.f1517a.clear();
        this.f1514a.m1089b();
        a(new cl(this, 2));
        a(new l());
        bf.a().b();
        bf.a().a(this, 15);
        bf.a().m1048a();
        this.f1502a.b(this);
        bw.a().m1065a();
        fj.a();
        i();
        db.b(this, this.f1502a);
        dk.b(this, this.f1502a);
        super.onDestroy();
        com.xiaomi.channel.commonutils.logger.b.m410a("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        String str;
        i iVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            com.xiaomi.channel.commonutils.logger.b.d("onStart() with intent NULL");
        } else {
            try {
                String stringExtra = intent.getStringExtra(bj.u);
                String stringExtra2 = intent.getStringExtra(bj.E);
                String stringExtra3 = intent.getStringExtra("mipush_app_package");
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && !"miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                    str = "onStart() with intent.Action = " + intent.getAction() + ", chid = " + stringExtra + ", pkg = " + stringExtra2 + "|" + stringExtra3;
                    com.xiaomi.channel.commonutils.logger.b.m411a("XMPushService", str);
                }
                str = "onStart() with intent.Action = " + intent.getAction() + ", chid = " + stringExtra + ", pkg = " + stringExtra2 + "|" + stringExtra3 + ", intent = " + com.xiaomi.push.j.a(intent);
                com.xiaomi.channel.commonutils.logger.b.m411a("XMPushService", str);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.d("onStart() cause error: " + th.getMessage());
                return;
            }
        }
        if (!(intent == null || intent.getAction() == null)) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f1514a.m1087a()) {
                    com.xiaomi.channel.commonutils.logger.b.d("ERROR, the job controller is blocked.");
                    bf.a().a(this, 14);
                    stopSelf();
                } else {
                    iVar = new i(intent);
                    a(iVar);
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                iVar = new i(intent);
                a(iVar);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            com.xiaomi.channel.commonutils.logger.b.c("[Prefs] spend " + currentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return 1;
    }

    private String b() {
        String str;
        an.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        int i2 = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            bm a2 = bm.a(this);
            String str2 = null;
            while (true) {
                if (!TextUtils.isEmpty(str2) && a2.a() != 0) {
                    break;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = a();
                }
                try {
                    synchronized (obj) {
                        if (i2 < 30) {
                            obj.wait(1000L);
                        } else {
                            obj.wait(30000L);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i2++;
            }
            str = a();
        } else {
            str = o78.CHINA_MAINLAND;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        com.xiaomi.channel.commonutils.logger.b.m410a("wait coutrycode :" + str + " cost = " + elapsedRealtime2 + " , count = " + i2);
        return str;
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra(bj.E);
        String stringExtra2 = intent.getStringExtra(bj.I);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        hg[] hgVarArr = new hg[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i2 = 0; i2 < parcelableArrayExtra.length; i2++) {
            hg hgVar = new hg((Bundle) parcelableArrayExtra[i2]);
            hgVarArr[i2] = hgVar;
            hg hgVar2 = (hg) a(hgVar, stringExtra, stringExtra2);
            hgVarArr[i2] = hgVar2;
            if (hgVar2 == null) {
                return;
            }
        }
        bf a2 = bf.a();
        gf[] gfVarArr = new gf[length];
        for (int i3 = 0; i3 < length; i3++) {
            hg hgVar3 = hgVarArr[i3];
            gfVarArr[i3] = gf.a(hgVar3, a2.a(hgVar3.k(), hgVar3.m()).h);
        }
        c(new com.xiaomi.push.service.c(this, gfVarArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 2280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.d(android.content.Intent):void");
    }

    private void e(Intent intent) {
        int i2;
        try {
            es.a(getApplicationContext()).a(new bl());
            String stringExtra = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra != null) {
                jb jbVar = new jb();
                jm.a(jbVar, byteArrayExtra);
                String b2 = jbVar.b();
                Map<String, String> a2 = jbVar.m880a();
                if (a2 != null) {
                    String str = a2.get("extra_help_aw_info");
                    String str2 = a2.get("extra_aw_app_online_cmd");
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i2 = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            i2 = 0;
                        }
                        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(b2) && !TextUtils.isEmpty(str)) {
                            es.a(getApplicationContext()).a(this, str, i2, stringExtra, b2);
                        }
                    }
                }
            }
        } catch (js e2) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_logic: translate fail. " + e2.getMessage());
        }
    }

    /* renamed from: f  reason: collision with other method in class */
    private boolean m975f() {
        if (SystemClock.elapsedRealtime() - this.f1499a < 30000) {
            return false;
        }
        return bg.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g  reason: collision with other method in class */
    public boolean m976g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    /* renamed from: h  reason: collision with other method in class */
    private boolean m977h() {
        boolean z;
        String packageName = getPackageName();
        if ("com.xiaomi.xmsf".equals(packageName)) {
            com.xiaomi.channel.commonutils.logger.b.m410a("current sdk expect region is cn");
            z = com.xiaomi.push.m.China.name().equals(com.xiaomi.push.service.a.a(getApplicationContext()).a());
        } else {
            z = !w.a(this).m1102b(packageName);
        }
        if (!z) {
            com.xiaomi.channel.commonutils.logger.b.m412a("XMPushService", "-->isPushEnabled(): isEnabled=", Boolean.valueOf(z), ", package=", packageName, ", region=", com.xiaomi.push.service.a.a(getApplicationContext()).a());
        }
        return z;
    }

    /* renamed from: i  reason: collision with other method in class */
    private boolean m978i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && j() && !com.xiaomi.push.i.m781b((Context) this) && !com.xiaomi.push.i.m778a(getApplicationContext());
    }

    /* renamed from: a  reason: collision with other method in class */
    public gq m980a() {
        return this.f1503a;
    }

    private void c(j jVar) {
        this.f1514a.a(jVar);
    }

    /* renamed from: e  reason: collision with other method in class */
    public static boolean m974e() {
        return b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m986b() {
        com.xiaomi.push.service.p.a(getApplicationContext()).m1085d();
        Iterator it = new ArrayList(this.f1516a).iterator();
        while (it.hasNext()) {
            ((n) it.next()).mo775a();
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m989d() {
        gq gqVar = this.f1503a;
        return gqVar != null && gqVar.m742b();
    }

    private void b(Intent intent) {
        gf gfVar;
        long j2;
        String stringExtra = intent.getStringExtra(bj.E);
        String stringExtra2 = intent.getStringExtra(bj.I);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        bf a2 = bf.a();
        if (bundleExtra != null) {
            hg hgVar = (hg) a(new hg(bundleExtra), stringExtra, stringExtra2);
            if (hgVar != null) {
                gfVar = gf.a(hgVar, a2.a(hgVar.k(), hgVar.m()).h);
            } else {
                return;
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j2 = Long.parseLong(intent.getStringExtra(bj.r));
                } catch (NumberFormatException unused) {
                    j2 = 0;
                }
                String stringExtra3 = intent.getStringExtra(bj.s);
                String stringExtra4 = intent.getStringExtra(bj.t);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                bf.b a3 = a2.a(stringExtra5, String.valueOf(j2));
                if (a3 != null) {
                    gf gfVar2 = new gf();
                    try {
                        gfVar2.a(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    gfVar2.a("SECMSG", (String) null);
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "xiaomi.com";
                    }
                    gfVar2.a(j2, stringExtra3, stringExtra4);
                    gfVar2.a(intent.getStringExtra("ext_pkt_id"));
                    gfVar2.a(byteArrayExtra, a3.h);
                    com.xiaomi.channel.commonutils.logger.b.m410a("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    gfVar = gfVar2;
                }
            }
            gfVar = null;
        }
        if (gfVar != null) {
            c(new bu(this, gfVar));
        }
    }

    private void c(boolean z) {
        try {
            if (!com.xiaomi.push.r.m965a()) {
                return;
            }
            if (z) {
                sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                for (aq aqVar : (aq[]) this.f1517a.toArray(new aq[0])) {
                    aqVar.a();
                }
                return;
            }
            sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
        }
    }

    @Override // com.xiaomi.push.gt
    public void b(gq gqVar) {
        gb.a().b(gqVar);
        c(true);
        this.f1512a.m1058a();
        if (!fj.m690a() && !m978i()) {
            com.xiaomi.channel.commonutils.logger.b.m410a("reconnection successful, reactivate alarm.");
            fj.a(true);
        }
        Iterator<bf.b> it = bf.a().m1045a().iterator();
        while (it.hasNext()) {
            a(new b(it.next()));
        }
        if (!this.f1518a && com.xiaomi.push.j.m869a(getApplicationContext())) {
            ah.a(getApplicationContext()).a(new cn(this));
        }
    }

    private hh a(hh hhVar, String str, String str2) {
        StringBuilder sb;
        bf a2 = bf.a();
        List<String> a3 = a2.m1047a(str);
        if (a3.isEmpty()) {
            sb = new StringBuilder("open channel should be called first before sending a packet, pkg=");
        } else {
            hhVar.o(str);
            str = hhVar.k();
            if (TextUtils.isEmpty(str)) {
                str = a3.get(0);
                hhVar.l(str);
            }
            bf.b a4 = a2.a(str, hhVar.m());
            if (!m988c()) {
                sb = new StringBuilder("drop a packet as the channel is not connected, chid=");
            } else if (a4 == null || a4.f1585a != bf.c.binded) {
                sb = new StringBuilder("drop a packet as the channel is not opened, chid=");
            } else if (TextUtils.equals(str2, a4.i)) {
                return hhVar;
            } else {
                sb = new StringBuilder("invalid session. ");
                sb.append(str2);
                com.xiaomi.channel.commonutils.logger.b.m410a(sb.toString());
                return null;
            }
        }
        sb.append(str);
        com.xiaomi.channel.commonutils.logger.b.m410a(sb.toString());
        return null;
    }

    public void b(j jVar) {
        this.f1514a.a(jVar.f15122a, jVar);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m988c() {
        gq gqVar = this.f1503a;
        return gqVar != null && gqVar.m743c();
    }

    private bf.b a(String str, Intent intent) {
        bf.b a2 = bf.a().a(str, intent.getStringExtra(bj.r));
        if (a2 == null) {
            a2 = new bf.b(this);
        }
        a2.g = intent.getStringExtra(bj.u);
        a2.f1590b = intent.getStringExtra(bj.r);
        a2.c = intent.getStringExtra(bj.y);
        a2.f1587a = intent.getStringExtra(bj.E);
        a2.e = intent.getStringExtra(bj.C);
        a2.f = intent.getStringExtra(bj.D);
        a2.f1589a = intent.getBooleanExtra(bj.B, false);
        a2.h = intent.getStringExtra(bj.A);
        a2.i = intent.getStringExtra(bj.I);
        a2.d = intent.getStringExtra(bj.z);
        a2.f1586a = this.f1513a;
        a2.a((Messenger) intent.getParcelableExtra(bj.M));
        a2.f1579a = getApplicationContext();
        bf.a().a(a2);
        return a2;
    }

    private void b(boolean z) {
        this.f1499a = SystemClock.elapsedRealtime();
        if (m988c()) {
            if (bg.b(this)) {
                c(new o(z));
                return;
            }
            c(new g(17, null));
        }
        a(true);
    }

    /* renamed from: a  reason: collision with other method in class */
    public com.xiaomi.push.service.k m981a() {
        return new com.xiaomi.push.service.k();
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m987b() {
        try {
            Class<?> a2 = com.xiaomi.push.r.a(this, "miui.os.Build");
            Field field = a2.getField("IS_CM_CUSTOMIZATION_TEST");
            Field field2 = a2.getField("IS_CU_CUSTOMIZATION_TEST");
            Field field3 = a2.getField("IS_CT_CUSTOMIZATION_TEST");
            if (!field.getBoolean(null) && !field2.getBoolean(null)) {
                if (!field3.getBoolean(null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private String a() {
        String a2 = com.xiaomi.push.j.m866a("ro.miui.region");
        return TextUtils.isEmpty(a2) ? com.xiaomi.push.j.m866a("ro.product.locale.region") : a2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m982a() {
        if (SystemClock.elapsedRealtime() - this.f1499a >= gw.a() && bg.d(this)) {
            b(true);
        }
    }

    public void a(int i2) {
        this.f1514a.a(i2);
    }

    public void a(int i2, Exception exc) {
        StringBuilder sb = new StringBuilder("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        gq gqVar = this.f1503a;
        sb.append(gqVar == null ? null : Integer.valueOf(gqVar.hashCode()));
        com.xiaomi.channel.commonutils.logger.b.m410a(sb.toString());
        gq gqVar2 = this.f1503a;
        if (gqVar2 != null) {
            gqVar2.b(i2, exc);
            this.f1503a = null;
        }
        a(7);
        a(4);
        bf.a().a(this, i2);
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
                com.xiaomi.channel.commonutils.logger.b.a(e2);
            }
        }
    }

    private void a(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString(Constants.CodeCache.BANNER_DIGEST);
            com.xiaomi.push.service.p.a(getApplicationContext()).m1081a(string);
            db.a(this, string);
        }
    }

    private void a(Intent intent, int i2) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        jb jbVar = new jb();
        try {
            jm.a(jbVar, byteArrayExtra);
            ah.a(getApplicationContext()).a((ah.a) new com.xiaomi.push.service.b(jbVar, new WeakReference(this), booleanExtra), i2);
        } catch (js unused) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_ping : send help app ping  error");
        }
    }

    public void a(gf gfVar) {
        gq gqVar = this.f1503a;
        if (gqVar != null) {
            gqVar.b(gfVar);
            return;
        }
        throw new hb("try send msg while connection is null.");
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar) {
        com.xiaomi.channel.commonutils.logger.b.c("begin to connect...");
        gb.a().a(gqVar);
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, int i2, Exception exc) {
        gb.a().a(gqVar, i2, exc);
        if (!m978i()) {
            a(false);
        }
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, Exception exc) {
        gb.a().a(gqVar, exc);
        c(false);
        if (!m978i()) {
            a(false);
        }
    }

    public void a(j jVar) {
        a(jVar, 0L);
    }

    public void a(j jVar, long j2) {
        try {
            this.f1514a.a(jVar, j2);
        } catch (IllegalStateException e2) {
            com.xiaomi.channel.commonutils.logger.b.m410a("can't execute job err = " + e2.getMessage());
        }
    }

    public void a(n nVar) {
        synchronized (this.f1516a) {
            this.f1516a.add(nVar);
        }
    }

    public void a(bf.b bVar) {
        if (bVar != null) {
            long a2 = bVar.a();
            com.xiaomi.channel.commonutils.logger.b.m410a("schedule rebind job in " + (a2 / 1000));
            a(new b(bVar), a2);
        }
    }

    private static void a(String str) {
        if (com.xiaomi.push.m.China.name().equals(str)) {
            cs.a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            cs.a("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            cs.a("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            cs.a("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            cs.a("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            cs.a("resolver.msg.xiaomi.net", "111.13.142.153:443");
            cs.a("resolver.msg.xiaomi.net", "111.202.1.252:443");
        }
    }

    private void a(String str, int i2) {
        Collection<bf.b> a2 = bf.a().m1046a(str);
        if (a2 != null) {
            for (bf.b bVar : a2) {
                if (bVar != null) {
                    a(new s(bVar, i2, null, null));
                }
            }
        }
        bf.a().m1049a(str);
    }

    public void a(String str, String str2, int i2, String str3, String str4) {
        bf.b a2 = bf.a().a(str, str2);
        if (a2 != null) {
            a(new s(a2, i2, str4, str3));
        }
        bf.a().m1050a(str, str2);
    }

    public void a(String str, byte[] bArr, boolean z) {
        Collection<bf.b> a2 = bf.a().m1046a("5");
        if (a2.isEmpty()) {
            if (!z) {
                return;
            }
        } else if (a2.iterator().next().f1585a == bf.c.binded) {
            a(new ck(this, 4, str, bArr));
            return;
        } else if (!z) {
            return;
        }
        y.b(str, bArr);
    }

    public void a(boolean z) {
        this.f1512a.a(z);
    }

    public void a(byte[] bArr, String str) {
        if (bArr == null) {
            y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            com.xiaomi.channel.commonutils.logger.b.m410a("register request without payload");
            return;
        }
        iy iyVar = new iy();
        try {
            jm.a(iyVar, bArr);
            if (iyVar.f1288a == ic.Registration) {
                jc jcVar = new jc();
                try {
                    jm.a(jcVar, iyVar.m859a());
                    a(new x(this, iyVar.b(), jcVar.b(), jcVar.c(), bArr));
                    fd.a(getApplicationContext()).a(iyVar.b(), "E100003", jcVar.a(), 6002, null);
                } catch (js e2) {
                    com.xiaomi.channel.commonutils.logger.b.d("app register error. " + e2);
                    y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
                }
            } else {
                y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                com.xiaomi.channel.commonutils.logger.b.m410a("register request with invalid payload");
            }
        } catch (js e3) {
            com.xiaomi.channel.commonutils.logger.b.d("app register fail. " + e3);
            y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    public void a(gf[] gfVarArr) {
        gq gqVar = this.f1503a;
        if (gqVar != null) {
            gqVar.a(gfVarArr);
            return;
        }
        throw new hb("try send msg while connection is null.");
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m983a() {
        boolean b2 = bg.b(this);
        boolean z = false;
        boolean z2 = bf.a().m1044a() > 0;
        boolean b3 = m987b();
        boolean z3 = !b3;
        boolean h2 = m977h();
        boolean g2 = m976g();
        boolean z4 = !g2;
        if (b2 && z2 && !b3 && h2 && !g2) {
            z = true;
        }
        if (!z) {
            com.xiaomi.channel.commonutils.logger.b.e("not conn, net=" + b2 + ";cnt=" + z2 + ";!dis=" + z3 + ";enb=" + h2 + ";!spm=" + z4 + ";");
        }
        return z;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m984a(int i2) {
        return this.f1514a.m1088a(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            an.a();
            for (int i2 = 100; i2 > 0; i2--) {
                if (bg.c(context)) {
                    com.xiaomi.channel.commonutils.logger.b.m410a("network connectivity ok.");
                    return true;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m972a(String str, Intent intent) {
        bf.b a2 = bf.a().a(str, intent.getStringExtra(bj.r));
        boolean z = false;
        if (a2 == null || str == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(bj.I);
        String stringExtra2 = intent.getStringExtra(bj.A);
        if (!TextUtils.isEmpty(a2.i) && !TextUtils.equals(stringExtra, a2.i)) {
            com.xiaomi.channel.commonutils.logger.b.m410a("session changed. old session=" + a2.i + ", new session=" + stringExtra + " chid = " + str);
            z = true;
        }
        if (stringExtra2.equals(a2.h)) {
            return z;
        }
        com.xiaomi.channel.commonutils.logger.b.m410a("security changed. chid = " + str + " sechash = " + bl.a(stringExtra2));
        return true;
    }

    /* renamed from: a  reason: collision with other method in class */
    private int[] m973a() {
        String[] split;
        String a2 = az.a(getApplicationContext()).a(ih.FallDownTimeRange.a(), "");
        if (!TextUtils.isEmpty(a2) && (split = a2.split(",")) != null && split.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(split[0]).intValue();
                int intValue = Integer.valueOf(split[1]).intValue();
                iArr[1] = intValue;
                int i2 = iArr[0];
                if (i2 >= 0 && i2 <= 23 && intValue >= 0 && intValue <= 23 && i2 != intValue) {
                    return iArr;
                }
            } catch (NumberFormatException e2) {
                com.xiaomi.channel.commonutils.logger.b.d("parse falldown time range failure: " + e2);
            }
        }
        return null;
    }
}
