package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ak {

    /* renamed from: a  reason: collision with root package name */
    private int f14754a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f725a;

    /* renamed from: a  reason: collision with other field name */
    private a f726a;

    /* renamed from: a  reason: collision with other field name */
    private volatile b f727a;

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f728a;
    private final boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with other field name */
        private final LinkedBlockingQueue<b> f729a = new LinkedBlockingQueue<>();

        public a() {
            super("PackageProcessor");
        }

        private void a(int i, b bVar) {
            try {
                ak.this.f725a.sendMessage(ak.this.f725a.obtainMessage(i, bVar));
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j;
            if (ak.this.f14754a > 0) {
                j = ak.this.f14754a;
            } else {
                j = Long.MAX_VALUE;
            }
            while (!ak.this.f728a) {
                try {
                    b poll = this.f729a.poll(j, TimeUnit.SECONDS);
                    ak.this.f727a = poll;
                    if (poll != null) {
                        a(0, poll);
                        poll.mo598b();
                        a(1, poll);
                    } else if (ak.this.f14754a > 0) {
                        ak.this.a();
                    }
                } catch (InterruptedException e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            }
        }

        public void a(b bVar) {
            try {
                this.f729a.add(bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ak() {
        this(false);
    }

    public ak(boolean z) {
        this(z, 0);
    }

    public ak(boolean z, int i) {
        this.f725a = null;
        this.f728a = false;
        this.f14754a = 0;
        this.f725a = new al(this, Looper.getMainLooper());
        this.b = z;
        this.f14754a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        this.f726a = null;
        this.f728a = true;
    }

    public synchronized void a(b bVar) {
        try {
            if (this.f726a == null) {
                a aVar = new a();
                this.f726a = aVar;
                aVar.setDaemon(this.b);
                this.f728a = false;
                this.f726a.start();
            }
            this.f726a.a(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(b bVar, long j) {
        this.f725a.postDelayed(new am(this, bVar), j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class b {
        /* renamed from: b */
        public abstract void mo598b();

        public void a() {
        }

        /* renamed from: c */
        public void mo599c() {
        }
    }
}
