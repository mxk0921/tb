package com.taobao.android.weex.bridge;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.dwh;
import tb.oxh;
import tb.t2o;
import tb.u8x;
import tb.vsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexPlatformThreadBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Handler sMainHandler = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9918a;
        public final /* synthetic */ long b;

        public a(long j, long j2) {
            this.f9918a = j;
            this.b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            u8x.f("WX_MAIN");
            try {
                WeexPlatformThreadBridge.callJob(this.f9918a, this.b);
            } finally {
                u8x.h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9919a;
        public final /* synthetic */ long b;

        public b(long j, long j2) {
            this.f9919a = j;
            this.b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            u8x.f("WX_MAIN");
            try {
                WeexPlatformThreadBridge.callJob(this.f9919a, this.b);
            } finally {
                u8x.h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9920a;
        public final /* synthetic */ long b;

        public c(long j, long j2) {
            this.f9920a = j;
            this.b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            u8x.f("WX_ASYNC");
            try {
                WeexPlatformThreadBridge.callJob(this.f9920a, this.b);
            } finally {
                u8x.h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        public d(long j, long j2) {
            this.d = j;
            this.e = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            u8x.f("WX_JS");
            try {
                WeexPlatformThreadBridge.callJob(this.d, this.e);
            } finally {
                u8x.h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f9922a = false;
        public final AtomicInteger b = new AtomicInteger(0);
        public final ConcurrentHashMap<Integer, e> c = new ConcurrentHashMap<>();
        public final vsa d;
        public final Handler e;

        static {
            t2o.a(982515851);
        }

        public f(boolean z) {
            if (z) {
                this.d = oxh.d().a();
            } else {
                this.d = oxh.d().b();
            }
            this.e = new Handler(this.d.getLooper());
        }

        public static void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13781df6", new Object[0]);
            }
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90d778de", new Object[]{this})).intValue();
            }
            int incrementAndGet = this.b.incrementAndGet();
            if (incrementAndGet == 0) {
                return this.b.incrementAndGet();
            }
            return incrementAndGet;
        }

        public synchronized int b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c2e4ec5", new Object[]{this, eVar})).intValue();
            }
            int a2 = a();
            while (this.c.contains(Integer.valueOf(a2))) {
                a2 = a();
            }
            this.c.put(Integer.valueOf(a2), eVar);
            return a2;
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
                return;
            }
            this.f9922a = true;
            oxh.d().f(this.d);
        }

        public synchronized e e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("9522ed04", new Object[]{this, new Integer(i)});
            }
            return this.c.remove(Integer.valueOf(i));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class g extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ f b;
        public final /* synthetic */ int c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar, int i, long j, long j2) {
            super(null);
            this.b = fVar;
            this.c = i;
            this.d = j;
            this.e = j2;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/bridge/WeexPlatformThreadBridge$5");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.b.f9922a && !this.f9921a) {
                this.b.e.postDelayed(this, this.c);
                u8x.f("WX_JS");
                try {
                    WeexPlatformThreadBridge.callJob(this.d, this.e);
                } finally {
                    u8x.h();
                }
            }
        }
    }

    static {
        t2o.a(982515844);
    }

    public static void callJob(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd4e086", new Object[]{new Long(j), new Long(j2)});
            return;
        }
        try {
            nativeCallJob(j, j2);
        } catch (UnsatisfiedLinkError e2) {
            dwh.i(e2);
        }
    }

    public static boolean cancelJSTask(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13f5a05c", new Object[]{obj, new Integer(i)})).booleanValue();
        }
        f fVar = (f) obj;
        e e2 = fVar.e(i);
        if (e2 == null) {
            return false;
        }
        e2.f9921a = true;
        fVar.e.removeCallbacks(e2);
        return true;
    }

    public static Object ensureJSThread(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("40cafb1c", new Object[]{weexInstanceImpl});
        }
        f fVar = new f(weexInstanceImpl.getInstanceConfig().k());
        weexInstanceImpl.bindJSThread(fVar.e);
        return fVar;
    }

    private static native void nativeCallJob(long j, long j2);

    public static void postAsyncTask(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7d53e8", new Object[]{new Long(j), new Long(j2)});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new c(j, j2));
        }
    }

    public static void postJSTaskDelay(Object obj, long j, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebda798b", new Object[]{obj, new Long(j), new Long(j2), new Integer(i)});
        } else {
            ((f) obj).e.postDelayed(new d(j, j2), i);
        }
    }

    public static int postJSTaskRepeat(Object obj, long j, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8f498ca", new Object[]{obj, new Long(j), new Long(j2), new Integer(i)})).intValue();
        }
        f fVar = (f) obj;
        g gVar = new g(fVar, i, j, j2);
        int b2 = fVar.b(gVar);
        fVar.e.postDelayed(gVar, i);
        return b2;
    }

    public static void postMainTaskAtFront(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3870b97f", new Object[]{new Long(j), new Long(j2)});
        } else {
            sMainHandler.postAtFrontOfQueue(new b(j, j2));
        }
    }

    public static void postMainTaskDelay(long j, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929f8077", new Object[]{new Long(j), new Long(j2), new Integer(i)});
        } else {
            sMainHandler.postDelayed(new a(j, j2), i);
        }
    }

    public static void preloadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        } else {
            f.c();
        }
    }

    public static void releaseJSThread(Object obj, WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0e5c7b", new Object[]{obj, weexInstanceImpl});
            return;
        }
        f fVar = (f) obj;
        fVar.d();
        fVar.f9922a = true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f9921a;

        static {
            t2o.a(982515850);
        }

        private e() {
            this.f9921a = false;
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
