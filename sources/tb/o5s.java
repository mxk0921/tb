package tb;

import android.content.Context;
import android.os.Process;
import android.preference.PreferenceManager;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o5s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final long f25155a = Process.myPid();
    public static List<gwd> b = null;
    public static List<ord> c = null;
    public static ThreadPoolExecutor d = null;

    static {
        t2o.a(767557669);
    }

    public static synchronized void d(Context context, ord ordVar) {
        synchronized (o5s.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf370e45", new Object[]{context, ordVar});
            } else if (h(context)) {
                if (ordVar != null) {
                    if (c == null) {
                        c = new CopyOnWriteArrayList();
                        g();
                    }
                    c.add(ordVar);
                }
            }
        }
    }

    public static synchronized void e(Context context, gwd gwdVar) {
        synchronized (o5s.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("936e4363", new Object[]{context, gwdVar});
            } else if (h(context)) {
                if (gwdVar != null) {
                    if (b == null) {
                        b = new CopyOnWriteArrayList();
                        g();
                    }
                    b.add(gwdVar);
                }
            }
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d9a8f4", new Object[0]);
            return;
        }
        try {
            ThreadPoolExecutor threadPoolExecutor = d;
            if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
                d.shutdown();
            }
        } catch (Exception e) {
            Log.e("TLogInterceptorManager", "destroyExecutor exception", e);
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3fa7d0a", new Object[0]);
            return;
        }
        try {
            ThreadPoolExecutor threadPoolExecutor = d;
            if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
                return;
            }
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: tb.n5s
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread i;
                    i = o5s.i(runnable);
                    return i;
                }
            });
            d = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            Log.e("TLogInterceptorManager", "initExecutor exception", e);
        }
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33fd71e7", new Object[]{context})).booleanValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("tlog_intercept", q4s.i());
    }

    public static /* synthetic */ void j(gwd gwdVar, long j, long j2, LogLevel logLevel, LogCategory logCategory, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638a431d", new Object[]{gwdVar, new Long(j), new Long(j2), logLevel, logCategory, str, str2, str3});
            return;
        }
        try {
            gwdVar.a(j, f25155a, j2, logLevel, logCategory, str, str2, str3);
        } catch (Exception e) {
            Log.e("TLogInterceptorManager", "interceptLogWrite exception", e);
        }
    }

    public static /* synthetic */ void k(ord ordVar, paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb6ff76", new Object[]{ordVar, paqVar});
            return;
        }
        try {
            ordVar.a(paqVar);
        } catch (Exception e) {
            Log.e("TLogInterceptorManager", "interceptSpanLog exception", e);
        }
    }

    public static void m(LogLevel logLevel, LogCategory logCategory, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f55d529", new Object[]{logLevel, logCategory, str, str2, str3});
        } else {
            l(-1L, -1L, logLevel, logCategory, str, str2, str3);
        }
    }

    public static void n(final paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b11dd4", new Object[]{paqVar});
            return;
        }
        List<ord> list = c;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                final ord ordVar = (ord) it.next();
                if (ordVar != null) {
                    d.execute(new Runnable() { // from class: tb.l5s
                        @Override // java.lang.Runnable
                        public final void run() {
                            o5s.k(ord.this, paqVar);
                        }
                    });
                }
            }
        }
    }

    public static void o(LogLevel logLevel, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, int i, String str9, String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e32cc77", new Object[]{logLevel, str, str2, str3, str4, str5, new Long(j), str6, str7, str8, new Integer(i), str9, str10});
        } else if (b != null) {
            l(-1L, -1L, logLevel, LogCategory.TraceEventLog, str2, str, str6 + (char) 31 + i + (char) 31 + str10 + (char) 31 + str7 + (char) 31 + str8 + (char) 31 + j + (char) 31 + str9 + (char) 31 + str3 + (char) 31 + str4 + (char) 31);
        }
    }

    public static synchronized void p(gwd gwdVar) {
        List<gwd> list;
        synchronized (o5s.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de6faafa", new Object[]{gwdVar});
                return;
            }
            if (!(gwdVar == null || (list = b) == null)) {
                ((CopyOnWriteArrayList) list).remove(gwdVar);
                if (((CopyOnWriteArrayList) b).isEmpty()) {
                    b = null;
                    f();
                }
            }
        }
    }

    public static /* synthetic */ Thread i(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("4d867254", new Object[]{runnable});
        }
        Thread thread = new Thread(runnable, "tlog-interceptor");
        thread.setPriority(1);
        return thread;
    }

    public static void l(long j, long j2, final LogLevel logLevel, final LogCategory logCategory, final String str, final String str2, final String str3) {
        final long myTid;
        long j3 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4197d169", new Object[]{new Long(j3), new Long(j2), logLevel, logCategory, str, str2, str3});
            return;
        }
        try {
            List<gwd> list = b;
            if (list != null) {
                Iterator it = ((CopyOnWriteArrayList) list).iterator();
                while (it.hasNext()) {
                    final gwd gwdVar = (gwd) it.next();
                    if (gwdVar != null) {
                        if (j3 == -1) {
                            try {
                                myTid = Process.myTid();
                            } catch (Exception e) {
                                Log.e("TLogInterceptorManager", "notify callback exception", e);
                            }
                        } else {
                            myTid = j3;
                        }
                        final long currentTimeMillis = j2 == -1 ? System.currentTimeMillis() : j2;
                        d.execute(new Runnable() { // from class: tb.m5s
                            @Override // java.lang.Runnable
                            public final void run() {
                                o5s.j(gwd.this, currentTimeMillis, myTid, logLevel, logCategory, str, str2, str3);
                            }
                        });
                    }
                    j3 = j;
                }
            }
        } catch (Exception e2) {
            Log.e("TLogInterceptorManager", "onWriteRawLog` exception", e2);
        }
    }
}
