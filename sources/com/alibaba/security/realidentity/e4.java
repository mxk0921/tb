package com.alibaba.security.realidentity;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsg;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String g = "RPTrackManager";
    public static final int h = 10;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 5000;
    public static final boolean l = false;

    /* renamed from: a  reason: collision with root package name */
    public LastExitTrackMsg f2686a;
    public RPTrack.TrackStrategy b;
    public final List<TrackLog> c;
    public final ThreadPoolExecutor d;
    public f4 e;
    public final e f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "rpsdk-rpTrackManager");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrackLog f2688a;

        public b(TrackLog trackLog) {
            this.f2688a = trackLog;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e4.a(e4.this).add(this.f2688a);
            if (!e4.b(e4.this).hasMessages(1)) {
                e4.b(e4.this).sendEmptyMessageDelayed(1, 5000L);
            }
            if (e4.a(e4.this).size() >= e4.c(e4.this).getTrackCacheSize()) {
                e4.d(e4.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2689a;

        public c(boolean z) {
            this.f2689a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e4.d(e4.this);
            e4.a(e4.this, this.f2689a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final e4 f2690a = new e4(null);

        public static /* synthetic */ e4 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e4) ipChange.ipc$dispatch("3c85d0c9", new Object[0]);
            }
            return f2690a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final e4 f2691a;

        public e(e4 e4Var) {
            super(Looper.getMainLooper());
            this.f2691a = e4Var;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/e4$e");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                this.f2691a.g();
            } else if (i == 2) {
                e4.e(this.f2691a);
            }
        }
    }

    public /* synthetic */ e4(a aVar) {
        this();
    }

    public static /* synthetic */ List a(e4 e4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2db48ce4", new Object[]{e4Var}) : e4Var.c;
    }

    public static /* synthetic */ e b(e4 e4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("4ee9e7cc", new Object[]{e4Var}) : e4Var.f;
    }

    public static /* synthetic */ RPTrack.TrackStrategy c(e4 e4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPTrack.TrackStrategy) ipChange.ipc$dispatch("315c5752", new Object[]{e4Var}) : e4Var.b;
    }

    public static /* synthetic */ void d(e4 e4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524d4b46", new Object[]{e4Var});
        } else {
            e4Var.c();
        }
    }

    public static /* synthetic */ void e(e4 e4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378eba07", new Object[]{e4Var});
        } else {
            e4Var.b();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        b(true);
        this.f.sendEmptyMessageDelayed(2, 5000L);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            b(false);
        }
    }

    public e4() {
        this.f = new e(this);
        this.c = new ArrayList();
        this.b = a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
        this.d = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void a(e4 e4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae979431", new Object[]{e4Var, new Boolean(z)});
        } else {
            e4Var.a(z);
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.c.isEmpty()) {
            a(z);
        } else {
            this.d.execute(new c(z));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.c.isEmpty()) {
            ArrayList arrayList = new ArrayList(Arrays.asList(new TrackLog[this.c.size()]));
            Collections.copy(arrayList, this.c);
            f4 f4Var = this.e;
            if (f4Var != null) {
                f4Var.a(arrayList);
                this.c.clear();
            }
        }
    }

    public static e4 d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e4) ipChange.ipc$dispatch("52b57026", new Object[0]) : d.a();
    }

    public LastExitTrackMsg e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LastExitTrackMsg) ipChange.ipc$dispatch("68089786", new Object[]{this}) : this.f2686a;
    }

    public void a(Context context, RPTrack.TrackStrategy trackStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd1b87d", new Object[]{this, context, trackStrategy});
            return;
        }
        if (trackStrategy == null) {
            trackStrategy = a();
        }
        this.b = trackStrategy;
    }

    public void a(f4 f4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2971684", new Object[]{this, f4Var});
        } else {
            this.e = f4Var;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f.removeCallbacksAndMessages(null);
        }
    }

    public void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
        } else {
            this.d.execute(new b(trackLog));
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f.removeMessages(1);
        if (!z) {
            this.f.sendEmptyMessageDelayed(1, 5000L);
        }
    }

    private RPTrack.TrackStrategy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPTrack.TrackStrategy) ipChange.ipc$dispatch("da9d98f5", new Object[]{this}) : new RPTrack.TrackStrategy.Builder().setTrackCacheSize(10).build();
    }

    public void a(LastExitTrackMsg lastExitTrackMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbbb8c4", new Object[]{this, lastExitTrackMsg});
        } else {
            this.f2686a = lastExitTrackMsg;
        }
    }
}
