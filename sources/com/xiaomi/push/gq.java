package com.xiaomi.push;

import android.os.SystemClock;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;
import com.xiaomi.push.service.bj;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class gq {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f14912a = new AtomicInteger(0);

    /* renamed from: a  reason: collision with other field name */
    public static boolean f1064a;

    /* renamed from: a  reason: collision with other field name */
    protected gr f1067a;

    /* renamed from: a  reason: collision with other field name */
    protected XMPushService f1069a;

    /* renamed from: a  reason: collision with other field name */
    protected int f1065a = 0;

    /* renamed from: a  reason: collision with other field name */
    protected long f1066a = -1;

    /* renamed from: b  reason: collision with other field name */
    protected volatile long f1074b = 0;

    /* renamed from: c  reason: collision with other field name */
    protected volatile long f1077c = 0;

    /* renamed from: a  reason: collision with other field name */
    private LinkedList<Pair<Integer, Long>> f1072a = new LinkedList<>();

    /* renamed from: a  reason: collision with other field name */
    private final Collection<gt> f1071a = new CopyOnWriteArrayList();

    /* renamed from: a  reason: collision with other field name */
    protected final Map<gv, a> f1073a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with other field name */
    protected final Map<gv, a> f1076b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with other field name */
    protected hc f1068a = null;

    /* renamed from: a  reason: collision with other field name */
    protected String f1070a = "";

    /* renamed from: b  reason: collision with other field name */
    protected String f1075b = "";
    private int c = 2;
    protected final int b = f14912a.getAndIncrement();
    private long e = 0;
    protected long d = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private gv f14913a;

        /* renamed from: a  reason: collision with other field name */
        private hd f1078a;

        public a(gv gvVar, hd hdVar) {
            this.f14913a = gvVar;
            this.f1078a = hdVar;
        }

        public void a(gf gfVar) {
            this.f14913a.a(gfVar);
        }

        public void a(hh hhVar) {
            hd hdVar = this.f1078a;
            if (hdVar == null || hdVar.mo734a(hhVar)) {
                this.f14913a.mo734a(hhVar);
            }
        }
    }

    static {
        f1064a = false;
        try {
            f1064a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        gw.m747a();
    }

    public gq(XMPushService xMPushService, gr grVar) {
        this.f1067a = grVar;
        this.f1069a = xMPushService;
        m741b();
    }

    /* renamed from: a */
    public int mo750a() {
        return this.f1065a;
    }

    public abstract void a(hh hhVar);

    public abstract void a(bf.b bVar);

    public abstract void a(String str, String str2);

    public abstract void a(gf[] gfVarArr);

    public int b() {
        return this.c;
    }

    public abstract void b(int i, Exception exc);

    public abstract void b(gf gfVar);

    public abstract void b(boolean z);

    public synchronized void c() {
        this.e = SystemClock.elapsedRealtime();
    }

    public void d() {
        synchronized (this.f1072a) {
            this.f1072a.clear();
        }
    }

    public long a() {
        return this.f1077c;
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m740b() {
        return this.f1067a.b();
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m743c() {
        return this.c == 1;
    }

    /* renamed from: a  reason: collision with other method in class */
    public gr m736a() {
        return this.f1067a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m741b() {
        String str;
        if (this.f1067a.m745a() && this.f1068a == null) {
            Class<?> cls = null;
            try {
                str = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                try {
                    cls = Class.forName(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (cls == null) {
                this.f1068a = new go(this);
                return;
            }
            try {
                this.f1068a = (hc) cls.getConstructor(gq.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e2) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m737a() {
        return this.f1067a.c();
    }

    public void b(gt gtVar) {
        this.f1071a.remove(gtVar);
    }

    private String a(int i) {
        return i == 1 ? "connected" : i == 0 ? "connecting" : i == 2 ? "disconnected" : "unknown";
    }

    public void b(gv gvVar) {
        this.f1076b.remove(gvVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<gv, a> m738a() {
        return this.f1073a;
    }

    public void b(gv gvVar, hd hdVar) {
        if (gvVar != null) {
            this.f1076b.put(gvVar, new a(gvVar, hdVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m735a(int i) {
        synchronized (this.f1072a) {
            try {
                if (i == 1) {
                    this.f1072a.clear();
                } else {
                    this.f1072a.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                    if (this.f1072a.size() > 6) {
                        this.f1072a.remove(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m742b() {
        return this.c == 0;
    }

    public void a(int i, int i2, Exception exc) {
        int i3 = this.c;
        if (i != i3) {
            b.m410a(String.format("update the connection status. %1$s -> %2$s : %3$s ", a(i3), a(i), bj.a(i2)));
        }
        if (bg.b(this.f1069a)) {
            m735a(i);
        }
        if (i == 1) {
            this.f1069a.a(10);
            if (this.c != 0) {
                b.m410a("try set connected while not connecting.");
            }
            this.c = i;
            for (gt gtVar : this.f1071a) {
                gtVar.b(this);
            }
        } else if (i == 0) {
            if (this.c != 2) {
                b.m410a("try set connecting while not disconnected.");
            }
            this.c = i;
            for (gt gtVar2 : this.f1071a) {
                gtVar2.a(this);
            }
        } else if (i == 2) {
            this.f1069a.a(10);
            int i4 = this.c;
            if (i4 == 0) {
                for (gt gtVar3 : this.f1071a) {
                    gtVar3.a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                for (gt gtVar4 : this.f1071a) {
                    gtVar4.a(this, i2, exc);
                }
            }
            this.c = i;
        }
    }

    public void a(gt gtVar) {
        if (gtVar != null && !this.f1071a.contains(gtVar)) {
            this.f1071a.add(gtVar);
        }
    }

    public void a(gv gvVar) {
        this.f1073a.remove(gvVar);
    }

    public void a(gv gvVar, hd hdVar) {
        if (gvVar != null) {
            this.f1073a.put(gvVar, new a(gvVar, hdVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    public synchronized void a(String str) {
        try {
            if (this.c == 0) {
                b.m410a("setChallenge hash = " + bl.a(str).substring(0, 8));
                this.f1070a = str;
                a(1, 0, null);
            } else {
                b.m410a("ignore setChallenge because connection was disconnected");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m739a() {
        return false;
    }

    public synchronized boolean a(long j) {
        return this.e >= j;
    }
}
