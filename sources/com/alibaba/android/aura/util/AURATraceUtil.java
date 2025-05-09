package com.alibaba.android.aura.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.util.Printer;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import tb.ck;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURATraceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_COMMON_INT = 1;
    public static final int TYPE_PARSE_INT = 3;
    public static final int TYPE_RENDER_INT = 4;
    public static final int TYPE_THREAD_INT = 2;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2162a = false;
    public static final List<Integer> b = new ArrayList<Integer>() { // from class: com.alibaba.android.aura.util.AURATraceUtil.1
        {
            add(1);
            add(2);
            add(3);
            add(4);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface AURATraceSupportType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final List<a> b = new ArrayList();
        public volatile boolean c = false;
        public final Object d = new Object();

        /* renamed from: a  reason: collision with root package name */
        public final ExecutorService f2165a = Executors.newSingleThreadExecutor();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final String f2166a;
            public final long b;

            static {
                t2o.a(79691979);
            }

            public a(String str, long j) {
                this.f2166a = str;
                this.b = j;
            }

            public static /* synthetic */ long a(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("1bb8dc8e", new Object[]{aVar})).longValue();
                }
                return aVar.b;
            }

            public String b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("e071ef7c", new Object[]{this});
                }
                return this.f2166a;
            }
        }

        static {
            t2o.a(79691978);
        }

        public final String b() {
            StackTraceElement[] stackTrace;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2c917b2", new Object[]{this});
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            for (Thread thread : c()) {
                printWriter.println("Thread: " + thread.getName() + ", State: " + thread.getState());
                for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                    printWriter.println("\tat " + stackTraceElement.toString());
                }
                printWriter.println();
            }
            printWriter.flush();
            return stringWriter.toString();
        }

        public final List<Thread> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("fa9e0762", new Object[]{this});
            }
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            while (true) {
                ThreadGroup parent = threadGroup.getParent();
                if (parent == null) {
                    break;
                }
                threadGroup = parent;
            }
            int activeCount = threadGroup.activeCount();
            Thread[] threadArr = new Thread[activeCount];
            int enumerate = threadGroup.enumerate(threadArr);
            if (enumerate == activeCount) {
                threadArr = new Thread[threadGroup.activeCount()];
                enumerate = threadGroup.enumerate(threadArr);
            }
            ArrayList arrayList = new ArrayList(enumerate);
            for (int i = 0; i < enumerate; i++) {
                arrayList.add(threadArr[i]);
            }
            return arrayList;
        }

        public List<String> d(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("c51918df", new Object[]{this, new Long(j), new Long(j2)});
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (a.a(aVar) >= j && a.a(aVar) <= j2) {
                    arrayList.add(aVar.b());
                }
            }
            return arrayList;
        }

        public final /* synthetic */ void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("345b7d2c", new Object[]{this});
                return;
            }
            while (this.c) {
                a aVar = new a(b(), new Date().getTime());
                synchronized (this.d) {
                    ((ArrayList) this.b).add(aVar);
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89024afd", new Object[]{this});
            } else if (!this.c) {
                this.c = true;
                this.f2165a.submit(new Runnable() { // from class: tb.fo
                    @Override // java.lang.Runnable
                    public final void run() {
                        AURATraceUtil.b.this.e();
                    }
                });
            }
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b7fee9d", new Object[]{this});
            } else {
                this.c = false;
            }
        }
    }

    static {
        t2o.a(79691971);
    }

    public static void a(int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779e7a3f", new Object[]{new Integer(i), strArr});
        } else if (e(i)) {
            Trace.beginSection(d(strArr));
        }
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c7f412", new Object[]{new Integer(i)});
        } else if (e(i)) {
            Trace.endSection();
        }
    }

    public static String c(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("914aa33", new Object[]{th});
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Throwable unused) {
            ck.g().d("printStackTrace转换错误");
            return "";
        }
    }

    public static String d(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3193a943", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbd42f4", new Object[]{new Integer(i)})).booleanValue();
        }
        if (f2162a && ((ArrayList) b).contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9494779", new Object[0]);
        }
        return UUID.randomUUID().toString();
    }

    public static void g(int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9115d3", new Object[]{new Integer(i), strArr});
        } else if (e(i)) {
            Trace.beginSection(d(strArr));
            Trace.endSection();
        }
    }

    public static void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870643f4", new Object[]{new Boolean(z)});
        }
    }

    public static void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce9df33", new Object[]{new Boolean(z)});
        } else {
            f2162a = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Printer {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String f = ">>>>>";
        private static final String g = "<<<<<";
        private long c;
        private final Handler e;
        private boolean b = false;
        private long d = 3000;

        /* renamed from: a  reason: collision with root package name */
        private final b f2163a = new b();

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.android.aura.util.AURATraceUtil$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0064a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f2164a;

            public RunnableC0064a(long j) {
                this.f2164a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (String str : a.b(a.this).d(a.a(a.this), this.f2164a)) {
                    Log.e("block-canary", str);
                }
            }
        }

        static {
            t2o.a(79691976);
        }

        public a() {
            HandlerThread handlerThread = new HandlerThread("block-canary-io");
            handlerThread.start();
            this.e = new Handler(handlerThread.getLooper());
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("254792a3", new Object[]{aVar})).longValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ b b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4a43db33", new Object[]{aVar});
            }
            return aVar.f2163a;
        }

        private boolean c(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cb448b7e", new Object[]{this, new Long(j)})).booleanValue();
            }
            if (j - this.c > this.d) {
                return true;
            }
            return false;
        }

        private void d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e743aa7", new Object[]{this, new Long(j)});
            } else {
                this.e.post(new RunnableC0064a(j));
            }
        }

        @Override // android.util.Printer
        public void println(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c611640", new Object[]{this, str});
                return;
            }
            if (!this.b) {
                this.c = System.currentTimeMillis();
                this.b = true;
                this.f2163a.f();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                this.b = false;
                if (c(currentTimeMillis)) {
                    d(currentTimeMillis);
                }
                this.f2163a.g();
            }
            if (str.startsWith(">>>>>")) {
                Log.e("mainLooperMessage", str + " at " + System.currentTimeMillis());
            } else if (str.startsWith("<<<<<")) {
                Log.e("mainLooperMessage", str + " finished at " + System.currentTimeMillis());
            } else {
                Log.e("mainLooperMessage", str);
            }
        }
    }
}
