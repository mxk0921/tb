package com.xiaomi.push.service;

import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionException;
import tb.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static long f15120a;
    private static long b;
    private static long c;

    /* renamed from: a  reason: collision with other field name */
    private final a f1645a;

    /* renamed from: a  reason: collision with other field name */
    private final c f1646a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f15121a;

        public a(c cVar) {
            this.f15121a = cVar;
        }

        public void finalize() {
            try {
                synchronized (this.f15121a) {
                    this.f15121a.c = true;
                    this.f15121a.notify();
                }
            } finally {
                super.finalize();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        protected int f15122a;

        public b(int i) {
            this.f15122a = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c extends Thread {

        /* renamed from: b  reason: collision with other field name */
        private boolean f1649b;
        private boolean c;

        /* renamed from: a  reason: collision with root package name */
        private volatile long f15123a = 0;

        /* renamed from: a  reason: collision with other field name */
        private volatile boolean f1648a = false;
        private long b = 50;

        /* renamed from: a  reason: collision with other field name */
        private a f1647a = new a();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private int f15124a;

            /* renamed from: a  reason: collision with other field name */
            private d[] f1650a;
            private int b;
            private int c;

            private a() {
                this.f15124a = 256;
                this.f1650a = new d[256];
                this.b = 0;
                this.c = 0;
            }

            private void c() {
                int i = this.b;
                int i2 = i - 1;
                int i3 = (i - 2) / 2;
                while (true) {
                    d[] dVarArr = this.f1650a;
                    d dVar = dVarArr[i2];
                    long j = dVar.f1651a;
                    d dVar2 = dVarArr[i3];
                    if (j < dVar2.f1651a) {
                        dVarArr[i2] = dVar2;
                        dVarArr[i3] = dVar;
                        i3 = (i3 - 1) / 2;
                        i2 = i3;
                    } else {
                        return;
                    }
                }
            }

            public void b() {
                int i = 0;
                while (i < this.b) {
                    if (this.f1650a[i].f1654a) {
                        this.c++;
                        b(i);
                        i--;
                    }
                    i++;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int a(d dVar) {
                int i = 0;
                while (true) {
                    d[] dVarArr = this.f1650a;
                    if (i >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i] == dVar) {
                        return i;
                    }
                    i++;
                }
            }

            private void c(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.b;
                    if (i2 < i3 && i3 > 0) {
                        int i4 = i2 + 1;
                        if (i4 < i3) {
                            d[] dVarArr = this.f1650a;
                            if (dVarArr[i4].f1651a < dVarArr[i2].f1651a) {
                                i2 = i4;
                            }
                        }
                        d[] dVarArr2 = this.f1650a;
                        d dVar = dVarArr2[i];
                        long j = dVar.f1651a;
                        d dVar2 = dVarArr2[i2];
                        if (j >= dVar2.f1651a) {
                            dVarArr2[i] = dVar2;
                            dVarArr2[i2] = dVar;
                            i2 = (i2 * 2) + 1;
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            public void b(int i) {
                int i2;
                if (i >= 0 && i < (i2 = this.b)) {
                    d[] dVarArr = this.f1650a;
                    int i3 = i2 - 1;
                    this.b = i3;
                    dVarArr[i] = dVarArr[i3];
                    dVarArr[i3] = null;
                    c(i);
                }
            }

            public d a() {
                return this.f1650a[0];
            }

            /* renamed from: a  reason: collision with other method in class */
            public void m1091a() {
                this.f1650a = new d[this.f15124a];
                this.b = 0;
            }

            public void a(int i) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    d dVar = this.f1650a[i2];
                    if (dVar.f15125a == i) {
                        dVar.a();
                    }
                }
                b();
            }

            public void a(int i, b bVar) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    d dVar = this.f1650a[i2];
                    if (dVar.f1652a == bVar) {
                        dVar.a();
                    }
                }
                b();
            }

            /* renamed from: a  reason: collision with other method in class */
            public void m1092a(d dVar) {
                d[] dVarArr = this.f1650a;
                int length = dVarArr.length;
                int i = this.b;
                if (length == i) {
                    d[] dVarArr2 = new d[i * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f1650a = dVarArr2;
                }
                d[] dVarArr3 = this.f1650a;
                int i2 = this.b;
                this.b = i2 + 1;
                dVarArr3[i2] = dVar;
                c();
            }

            /* renamed from: a  reason: collision with other method in class */
            public boolean m1093a() {
                return this.b == 0;
            }

            /* renamed from: a  reason: collision with other method in class */
            public boolean m1094a(int i) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (this.f1650a[i2].f15125a == i) {
                        return true;
                    }
                }
                return false;
            }
        }

        public c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
            r10.f15123a = android.os.SystemClock.uptimeMillis();
            r10.f1648a = true;
            r2.f1652a.run();
            r10.f1648a = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
            r10.f1649b = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00ac, code lost:
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 182
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.q.c.run():void");
        }

        public synchronized void a() {
            this.f1649b = true;
            this.f1647a.m1091a();
            notify();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(d dVar) {
            this.f1647a.m1092a(dVar);
            notify();
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m1090a() {
            return this.f1648a && SystemClock.uptimeMillis() - this.f15123a > m.CONFIG_TRACK_1022_INTERVAL_TIME;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int f15125a;

        /* renamed from: a  reason: collision with other field name */
        long f1651a;

        /* renamed from: a  reason: collision with other field name */
        b f1652a;

        /* renamed from: a  reason: collision with other field name */
        final Object f1653a = new Object();

        /* renamed from: a  reason: collision with other field name */
        boolean f1654a;
        private long b;

        public void a(long j) {
            synchronized (this.f1653a) {
                this.b = j;
            }
        }

        public boolean a() {
            boolean z;
            synchronized (this.f1653a) {
                try {
                    z = !this.f1654a && this.f1651a > 0;
                    this.f1654a = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }
    }

    static {
        long j = 0;
        if (SystemClock.elapsedRealtime() > 0) {
            j = SystemClock.elapsedRealtime();
        }
        f15120a = j;
        b = j;
    }

    public q() {
        this(false);
    }

    public static synchronized long a() {
        long j;
        synchronized (q.class) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = b;
                if (elapsedRealtime > j2) {
                    f15120a += elapsedRealtime - j2;
                }
                b = elapsedRealtime;
                j = f15120a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    private static synchronized long b() {
        long j;
        synchronized (q.class) {
            j = c;
            c = 1 + j;
        }
        return j;
    }

    public q(String str) {
        this(str, false);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1086a() {
        com.xiaomi.channel.commonutils.logger.b.m410a("quit. finalizer:" + this.f1645a);
        this.f1646a.a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m1089b() {
        synchronized (this.f1646a) {
            this.f1646a.f1647a.m1091a();
        }
    }

    public q(String str, boolean z) {
        if (str != null) {
            c cVar = new c(str, z);
            this.f1646a = cVar;
            this.f1645a = new a(cVar);
            return;
        }
        throw new NullPointerException("name == null");
    }

    private void b(b bVar, long j) {
        synchronized (this.f1646a) {
            try {
                if (!this.f1646a.f1649b) {
                    long a2 = j + a();
                    if (a2 >= 0) {
                        d dVar = new d();
                        dVar.f15125a = bVar.f15122a;
                        dVar.f1652a = bVar;
                        dVar.f1651a = a2;
                        this.f1646a.a(dVar);
                    } else {
                        throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a2);
                    }
                } else {
                    throw new IllegalStateException("Timer was canceled");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i) {
        synchronized (this.f1646a) {
            this.f1646a.f1647a.a(i);
        }
    }

    public q(boolean z) {
        this("Timer-" + b(), z);
    }

    public void a(int i, b bVar) {
        synchronized (this.f1646a) {
            this.f1646a.f1647a.a(i, bVar);
        }
    }

    public void a(b bVar) {
        if (com.xiaomi.channel.commonutils.logger.b.a() >= 1 || Thread.currentThread() == this.f1646a) {
            bVar.run();
        } else {
            com.xiaomi.channel.commonutils.logger.b.d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    public void a(b bVar, long j) {
        if (j >= 0) {
            b(bVar, j);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1087a() {
        return this.f1646a.m1090a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1088a(int i) {
        boolean a2;
        synchronized (this.f1646a) {
            a2 = this.f1646a.f1647a.m1094a(i);
        }
        return a2;
    }
}
