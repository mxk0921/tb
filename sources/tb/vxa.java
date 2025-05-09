package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static pxa f30313a;
    public static Context c;
    public static String e;
    public static final ExecutorService b = new ThreadPoolExecutor(4, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(32), new a("Highway"));
    public static boolean d = false;
    public static volatile Boolean f = Boolean.FALSE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f30314a = 1;

        static {
            t2o.a(1034944563);
        }

        public a(String str) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "Highway-Thread_" + this.f30314a);
            int i = this.f30314a + 1;
            this.f30314a = i;
            if (i >= 10) {
                this.f30314a = 1;
            }
            String.format("Created thread %d with name %s on %s \n", Long.valueOf(thread.getId()), thread.getName(), new Date());
            return thread;
        }
    }

    static {
        t2o.a(1034944562);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e80fcf40", new Object[]{str});
        }
        return str.substring(19);
    }

    public static Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return c;
    }

    public static pxa c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pxa) ipChange.ipc$dispatch("604f2539", new Object[0]);
        }
        if (!f.booleanValue()) {
            return null;
        }
        return f30313a;
    }

    public static ExecutorService d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("a662066a", new Object[0]);
        }
        return b;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        return e;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34b126c8", new Object[]{str})).booleanValue();
        }
        if (str == null || !str.startsWith("__client_preview__#")) {
            return false;
        }
        return true;
    }

    public static synchronized boolean g() {
        synchronized (vxa.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
            }
            return f.booleanValue();
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b289106", new Object[0])).booleanValue();
        }
        return d;
    }

    public static synchronized void i(Context context, String str) {
        synchronized (vxa.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d129f39", new Object[]{context, str});
                return;
            }
            if (!f.booleanValue() && context != null && !TextUtils.isEmpty(str)) {
                if (kzo.c().b() == null) {
                    kzo.c().r(context);
                }
                c = context.getApplicationContext();
                e = str;
                f30313a = new qxa();
                f = Boolean.TRUE;
            }
        }
    }

    @Deprecated
    public static synchronized void j(Context context, String str) {
        synchronized (vxa.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("204aa401", new Object[]{context, str});
            } else {
                new StringBuilder("sdkInitialize ttid: ").append(str);
            }
        }
    }

    public static void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c3934a", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }
}
