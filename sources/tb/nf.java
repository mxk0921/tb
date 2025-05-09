package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.artc.utils.ArtcLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import tb.nf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ScheduledThreadPoolExecutor f24697a;
    public static volatile ScheduledThreadPoolExecutor b;
    public static volatile ScheduledThreadPoolExecutor c;
    public static volatile ScheduledThreadPoolExecutor d;
    public static volatile ScheduledThreadPoolExecutor e;

    static {
        t2o.a(395313307);
    }

    public static void g(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4467280a", new Object[]{runnable, new Long(j)});
            return;
        }
        if (f24697a == null) {
            f24697a = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor(new qqt() { // from class: tb.jf
                @Override // tb.qqt
                public final String newThreadName() {
                    String o;
                    o = nf.o();
                    return o;
                }
            });
        }
        k(f24697a, runnable, j, "core");
    }

    public static void h(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1579a5b3", new Object[]{runnable});
            return;
        }
        if (c == null) {
            c = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor(new qqt() { // from class: tb.if
                @Override // tb.qqt
                public final String newThreadName() {
                    String p;
                    p = nf.p();
                    return p;
                }
            });
        }
        k(c, runnable, 0L, "event");
    }

    public static void i(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6fae9f", new Object[]{runnable});
            return;
        }
        if (d == null) {
            d = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor(new qqt() { // from class: tb.gf
                @Override // tb.qqt
                public final String newThreadName() {
                    String q;
                    q = nf.q();
                    return q;
                }
            });
        }
        k(d, runnable, 0L, bjo.GL_MEM);
    }

    public static void j(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b4f3f1", new Object[]{runnable});
            return;
        }
        try {
            k(n(), runnable, 0L, "dns");
        } catch (Throwable unused) {
            ArtcLog.e("AThreadPool", "executeHttpdns", new Object[0]);
        }
    }

    public static void k(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, Runnable runnable, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8096bd6", new Object[]{scheduledThreadPoolExecutor, runnable, new Long(j), str});
            return;
        }
        scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.MILLISECONDS);
        int size = scheduledThreadPoolExecutor.getQueue().size();
        if (size > 5) {
            oc1.c("AThreadPool", str + " executor size:" + size);
        }
    }

    public static void l(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696b6ea1", new Object[]{runnable});
            return;
        }
        if (b == null) {
            b = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor(new qqt() { // from class: tb.ff
                @Override // tb.qqt
                public final String newThreadName() {
                    String r;
                    r = nf.r();
                    return r;
                }
            });
        }
        k(b, runnable, 0L, "signal");
    }

    public static ScheduledExecutorService m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("30743482", new Object[0]);
        }
        if (c == null) {
            c = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor(new qqt() { // from class: tb.ef
                @Override // tb.qqt
                public final String newThreadName() {
                    String s;
                    s = nf.s();
                    return s;
                }
            });
        }
        return c;
    }

    public static ScheduledThreadPoolExecutor n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("424a6f2", new Object[0]);
        }
        if (e == null) {
            e = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor(new qqt() { // from class: tb.hf
                @Override // tb.qqt
                public final String newThreadName() {
                    String t;
                    t = nf.t();
                    return t;
                }
            });
        }
        return e;
    }

    public static /* synthetic */ String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("199305f4", new Object[0]);
        }
        return "artc-default";
    }

    public static /* synthetic */ String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8132e7a0", new Object[0]);
        }
        return "artc-evt";
    }

    public static /* synthetic */ String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe1414c", new Object[0]);
        }
        return "artc-gl";
    }

    public static /* synthetic */ String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f130391", new Object[0]);
        }
        return "artc-sig";
    }

    public static /* synthetic */ String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2619e659", new Object[0]);
        }
        return "artc-event";
    }

    public static /* synthetic */ String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f80b4d", new Object[0]);
        }
        return "artc-httpdns";
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[0]);
            return;
        }
        try {
            if (f24697a != null) {
                f24697a.shutdown();
                f24697a = null;
            }
            if (b != null) {
                b.shutdown();
                b = null;
            }
            if (c != null) {
                c.shutdown();
                c = null;
            }
            if (d != null) {
                d.shutdown();
                d = null;
            }
            if (e != null) {
                e.shutdownNow();
                e = null;
            }
            ArtcLog.i("AThreadPool", "shutdown", new Object[0]);
        } catch (Throwable th) {
            oc1.c("AThreadPool", "thread poll shut down error: " + th.getMessage());
        }
    }

    public static void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23fcb927", new Object[0]);
            return;
        }
        try {
            if (f24697a != null) {
                f24697a.shutdownNow();
                f24697a = null;
            }
            if (b != null) {
                b.shutdownNow();
                b = null;
            }
            if (c != null) {
                c.shutdownNow();
                c = null;
            }
            if (d != null) {
                d.shutdownNow();
                d = null;
            }
            if (e != null) {
                e.shutdownNow();
                e = null;
            }
            ArtcLog.i("AThreadPool", "shutdownNow", new Object[0]);
        } catch (Throwable th) {
            oc1.c("AThreadPool", "thread poll shut down now error: " + th.getMessage());
        }
    }

    public static void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43401ae8", new Object[0]);
            return;
        }
        try {
            if (e != null) {
                e.shutdownNow();
                e = null;
            }
        } catch (Throwable th) {
            ArtcLog.e("AThreadPool", "shutdownNowHttpdns, ", th, new Object[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile ExecutorService f24698a = VExecutors.newSingleThreadExecutor(new qqt() { // from class: tb.lf
            @Override // tb.qqt
            public final String newThreadName() {
                String b;
                b = nf.a.b();
                return b;
            }
        });

        static {
            t2o.a(395313308);
        }

        public a(String str) {
            ArtcLog.i("AThreadPool", "new signal thread: " + str, new Object[0]);
        }

        public static /* synthetic */ String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c2d31f4a", new Object[0]);
            }
            return "artc-single";
        }

        public void c(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d220ee91", new Object[]{this, runnable});
            } else {
                this.f24698a.execute(runnable);
            }
        }

        public boolean d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("524595f5", new Object[]{this, new Long(j)})).booleanValue();
            }
            Logging.d("AThreadPool", "stopThread");
            this.f24698a.shutdown();
            if (j <= 0) {
                return true;
            }
            try {
                return this.f24698a.awaitTermination(j, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                ArtcLog.i("AThreadPool", "awaitTermination exception: " + e.getMessage(), new Object[0]);
                return false;
            }
        }
    }
}
