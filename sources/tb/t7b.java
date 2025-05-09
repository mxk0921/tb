package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tb.e8b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t7b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROXY_HOST = "127.0.0.1";

    /* renamed from: a  reason: collision with root package name */
    public int f28536a;
    public final Object b;
    public final ExecutorService c;
    public final Map<String, u7b> d;
    public final ServerSocket e;
    public final int f;
    public final cf4 g;
    public boolean h;
    public final Map<String, Integer> i;
    public final long j;
    public long k;
    public final feh l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(t7b t7bVar) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "http_proxy_cache_server_thread";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    t7b.c(t7b.this);
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AVSDKLog.e(t7b.a(t7b.this), "HttpProxyCacheServer useCommonThreadPool");
                dq.b().submit(new g(countDownLatch));
                t7b.b(t7b.this, -2);
                countDownLatch.await();
                t7b.d(t7b.this).submit(new a());
            } catch (Throwable unused) {
                t7b.b(t7b.this, -3);
                t7b.d(t7b.this).shutdown();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                t7b.c(t7b.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final File f28540a;
        public final nq7 b;

        static {
            t2o.a(774897883);
        }

        public d(Context context) {
            this.f28540a = StorageUtils.getIndividualCacheDirectory(context);
            this.b = new e5u(d(context), 100);
        }

        public static /* synthetic */ cf4 a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cf4) ipChange.ipc$dispatch("87b587ab", new Object[]{dVar});
            }
            return dVar.c();
        }

        public t7b b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t7b) ipChange.ipc$dispatch("6d43dc1b", new Object[]{this});
            }
            return new t7b(c(), null);
        }

        public final cf4 c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cf4) ipChange.ipc$dispatch("6fb0771a", new Object[]{this});
            }
            return new cf4(this.f28540a, this.b);
        }

        public final long d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("38b5026", new Object[]{this, context})).longValue();
            }
            return 419430400L;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Callable<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(774897886);
        }

        public e() {
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("a99c6222", new Object[]{this});
            }
            return Boolean.valueOf(t7b.g(t7b.this));
        }

        public /* synthetic */ e(t7b t7bVar, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Socket f28542a;

        static {
            t2o.a(774897887);
        }

        public f(Socket socket) {
            this.f28542a = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                t7b.f(t7b.this, this.f28542a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f28543a;

        static {
            t2o.a(774897888);
        }

        public g(CountDownLatch countDownLatch) {
            this.f28543a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f28543a.countDown();
            t7b.e(t7b.this);
        }
    }

    static {
        t2o.a(774897878);
    }

    public /* synthetic */ t7b(cf4 cf4Var, a aVar) {
        this(cf4Var);
    }

    public static /* synthetic */ feh a(t7b t7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("66c74fb9", new Object[]{t7bVar});
        }
        return t7bVar.l;
    }

    public static /* synthetic */ int b(t7b t7bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e64b6f3b", new Object[]{t7bVar, new Integer(i)})).intValue();
        }
        t7bVar.f28536a = i;
        return i;
    }

    public static /* synthetic */ void c(t7b t7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855f677c", new Object[]{t7bVar});
        } else {
            t7bVar.G();
        }
    }

    public static /* synthetic */ ExecutorService d(t7b t7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("dfcbb060", new Object[]{t7bVar});
        }
        return t7bVar.c;
    }

    public static /* synthetic */ void e(t7b t7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3edffd9", new Object[]{t7bVar});
        } else {
            t7bVar.Q();
        }
    }

    public static /* synthetic */ void f(t7b t7bVar, Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f0b137", new Object[]{t7bVar, socket});
        } else {
            t7bVar.I(socket);
        }
    }

    public static /* synthetic */ boolean g(t7b t7bVar) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("984d101b", new Object[]{t7bVar})).booleanValue();
        }
        return t7bVar.H();
    }

    public long A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("164bd2c6", new Object[]{this})).longValue();
        }
        return this.k;
    }

    public long B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a828283", new Object[]{this})).longValue();
        }
        return this.j;
    }

    public int C(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f695dcf7", new Object[]{this, str})).intValue();
        }
        String F = F(str);
        if (TextUtils.isEmpty(F)) {
            return -1;
        }
        synchronized (this) {
            try {
                if (((HashMap) this.i).size() >= 10240) {
                    i = -2;
                } else if (((HashMap) this.i).containsKey(F)) {
                    ((HashMap) this.i).put(F, 1);
                    i = ((Integer) ((HashMap) this.i).get(F)).intValue();
                    ((HashMap) this.i).put(F, Integer.valueOf(1 + i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("289a0b9a", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final String F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b200f569", new Object[]{this, str});
        }
        if (this.g == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return e2n.h(str);
    }

    public final void G() {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e6c963", new Object[]{this});
            return;
        }
        int i = 70;
        int i2 = 0;
        while (i2 < 5) {
            try {
                booleanValue = ((Boolean) this.c.submit(new e(this, null)).get(i, TimeUnit.MILLISECONDS)).booleanValue();
                this.h = booleanValue;
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            if (booleanValue) {
                this.k = System.currentTimeMillis();
                AVSDKLog.e(this.l, "HttpProxyCacheServer pinged success");
                this.f28536a = 0;
                return;
            }
            continue;
            i2++;
            i *= 2;
        }
        this.f28536a = -4;
        N();
    }

    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efe5d09", new Object[]{this, str});
            return;
        }
        String F = F(str);
        if (!TextUtils.isEmpty(F)) {
            synchronized (this) {
                try {
                    if (((HashMap) this.i).size() < 10240 && !((HashMap) this.i).containsKey(F)) {
                        ((HashMap) this.i).put(F, 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void K(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2c8e6e", new Object[]{this, socket});
            return;
        }
        j(socket);
        k(socket);
        i(socket);
    }

    public final void L(Socket socket) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562af31a", new Object[]{this, socket});
            return;
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    public void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e2de15", new Object[]{this, str});
            return;
        }
        synchronized (this.b) {
            try {
                String h = e2n.h(str);
                Map<String, u7b> map = this.d;
                if (map != null && ((ConcurrentHashMap) map).containsKey(h)) {
                    u7b u7bVar = (u7b) ((ConcurrentHashMap) this.d).get(h);
                    ((ConcurrentHashMap) this.d).remove(h);
                    if (u7bVar != null) {
                        u7bVar.w();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        O();
        try {
            if (!this.e.isClosed()) {
                this.e.close();
            }
        } catch (IOException unused) {
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ae3659", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            try {
                for (u7b u7bVar : ((ConcurrentHashMap) this.d).values()) {
                    u7bVar.w();
                }
                ((ConcurrentHashMap) this.d).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d8f309", new Object[]{this, str});
            return;
        }
        synchronized (this.b) {
            try {
                Map<String, u7b> map = this.d;
                if (map != null && ((ConcurrentHashMap) map).containsKey(str)) {
                    u7b u7bVar = (u7b) ((ConcurrentHashMap) this.d).get(str);
                    ((ConcurrentHashMap) this.d).remove(str);
                    if (u7bVar != null) {
                        u7bVar.w();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee237e2", new Object[]{this});
            return;
        }
        while (!VExecutors.currentThread().isInterrupted()) {
            try {
                Socket accept = this.e.accept();
                accept.setSendBufferSize(262144);
                accept.setTrafficClass(20);
                this.c.submit(new f(accept));
            } catch (IOException unused) {
                return;
            }
        }
    }

    public final String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("393336f9", new Object[]{this, str});
        }
        return String.format("http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.f), e2n.g(str));
    }

    public final void i(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8306a9dd", new Object[]{this, socket});
            return;
        }
        try {
            if (!socket.isClosed()) {
                socket.close();
            }
        } catch (IOException unused) {
        }
    }

    public final void j(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e7b52e9", new Object[]{this, socket});
            return;
        }
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        } catch (SocketException | IOException unused) {
        }
    }

    public final void k(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef74bf9c", new Object[]{this, socket});
            return;
        }
        try {
            if (socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException unused) {
        }
    }

    public long l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d096e09", new Object[]{this, str})).longValue();
        }
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (ProxyCacheException unused) {
            }
            return 0L;
        }
    }

    public String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b41c5dc", new Object[]{this, str});
        }
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).e();
                    }
                } catch (ProxyCacheException unused) {
                }
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f57a4d7", new Object[]{this, str})).longValue();
        }
        File a2 = this.g.a(str);
        File parentFile = a2.getParentFile();
        File file = new File(parentFile, a2.getName() + wb9.TEMP_POSTFIX);
        File parentFile2 = a2.getParentFile();
        if (parentFile2 != null && parentFile2.isDirectory() && parentFile2.list().length == 0) {
            AVSDKLog.e(this.l, "cache Dir is empty ");
            return 0L;
        } else if (a2.exists()) {
            return a2.length();
        } else {
            if (file.exists()) {
                return file.length();
            }
            return 0L;
        }
    }

    public final u7b o(String str) throws ProxyCacheException {
        u7b u7bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u7b) ipChange.ipc$dispatch("64b86645", new Object[]{this, str});
        }
        synchronized (this.b) {
            try {
                String h = e2n.h(str);
                u7bVar = (u7b) ((ConcurrentHashMap) this.d).get(h);
                if (u7bVar == null) {
                    u7bVar = new u7b(str, this.g, this);
                    ((ConcurrentHashMap) this.d).put(h, u7bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u7bVar;
    }

    public String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3da090b3", new Object[]{this, str});
        }
        String str2 = "";
        synchronized (this.b) {
            try {
                if (o(str) != null) {
                    str2 = o(str).l();
                }
            } catch (ProxyCacheException unused) {
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String[] split = str2.split(",");
        for (String str3 : split) {
            String trim = str3.trim();
            if (trim != null && !trim.isEmpty()) {
                String[] split2 = trim.split("=");
                if (split2.length == 2 && "connType".equals(split2[0])) {
                    return split2[1];
                }
            }
        }
        return "";
    }

    public long q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54e84189", new Object[]{this, str})).longValue();
        }
        AVSDKLog.e(this.l, "enter  getFirstTimeReadFromCacheTs");
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (ProxyCacheException unused) {
            }
            return -2L;
        }
    }

    public long r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6045903f", new Object[]{this, str})).longValue();
        }
        AVSDKLog.e(this.l, "enter  getFirstTimeReadFromCacheTs");
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (ProxyCacheException unused) {
            }
            return -2L;
        }
    }

    public long s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b0d47bb", new Object[]{this, str})).longValue();
        }
        AVSDKLog.e(this.l, "enter  getFirstTimeReadFromCacheTs");
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (ProxyCacheException unused) {
            }
            return -2L;
        }
    }

    public long t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3b51bcb", new Object[]{this, str})).longValue();
        }
        AVSDKLog.e(this.l, "enter  getHeadRequestTime");
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (ProxyCacheException unused) {
            }
            return -2L;
        }
    }

    public Map<String, String> u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e4851fd2", new Object[]{this, str});
        }
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).j();
                    }
                } catch (ProxyCacheException unused) {
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac07f24f", new Object[]{this, str})).longValue();
        }
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (ProxyCacheException unused) {
            }
            return 0L;
        }
    }

    public long x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59ebe4bd", new Object[]{this, str})).longValue();
        }
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (ProxyCacheException unused) {
            }
            return 0L;
        }
    }

    public long y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("320058c", new Object[]{this, str})).longValue();
        }
        epm.b(str);
        synchronized (this.b) {
            try {
                try {
                    if (o(str) != null) {
                        return o(str).o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (ProxyCacheException unused) {
            }
            return 0L;
        }
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fb6a1d5", new Object[]{this})).intValue();
        }
        return this.f28536a;
    }

    public t7b(Context context) {
        this(d.a(new d(context)));
    }

    public final void I(Socket socket) {
        IpChange ipChange = $ipChange;
        try {
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1d706", new Object[]{this, socket});
                return;
            }
            try {
                try {
                    b8a i = b8a.i(socket.getInputStream());
                    String str = i.f16243a;
                    if ("ping".equals(str)) {
                        L(socket);
                    } else if (i.j) {
                        o(str).t(i, socket);
                    } else {
                        o(str).u(i, socket);
                    }
                } catch (ProxyCacheException e2) {
                    AVSDKLog.e(this.l, e2.toString());
                } catch (Exception e3) {
                    AVSDKLog.e(this.l, ew0.k(e3));
                }
            } catch (SocketException e4) {
                AVSDKLog.e(this.l, e4.toString());
            } catch (IOException e5) {
                this.h = false;
                this.f28536a = -6;
                AVSDKLog.e(this.l, e5.toString());
                AVSDKLog.e(this.l, e5.toString());
            }
            K(socket);
        } catch (Throwable th) {
            K(socket);
            throw th;
        }
    }

    public t7b(cf4 cf4Var) {
        this.f28536a = -1;
        this.b = new Object();
        this.d = new ConcurrentHashMap();
        this.i = new HashMap();
        this.j = -1L;
        this.k = -1L;
        feh fehVar = new feh(toString(), "");
        this.l = fehVar;
        this.j = System.currentTimeMillis();
        ExecutorService c2 = dq.c(10, new a(this));
        this.c = c2;
        this.g = (cf4) epm.b(cf4Var);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 10, InetAddress.getByName("127.0.0.1"));
            this.e = serverSocket;
            this.f = serverSocket.getLocalPort();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                dq.b().execute(new b());
            } else {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AVSDKLog.e(fehVar, "HttpProxyCacheServer useCommonThreadPool");
                dq.b().submit(new g(countDownLatch));
                this.f28536a = -2;
                countDownLatch.await();
                c2.submit(new c());
            }
        } catch (Throwable unused) {
            this.f28536a = -3;
            this.c.shutdown();
        }
    }

    public boolean E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0b4e0ce", new Object[]{this, str})).booleanValue();
        }
        File a2 = this.g.a(str);
        File parentFile = a2.getParentFile();
        File file = new File(parentFile, a2.getName() + wb9.TEMP_POSTFIX);
        feh fehVar = this.l;
        StringBuilder sb = new StringBuilder("predownloadManager: is hit cache = ");
        sb.append((file.exists() && file.length() > 0) || a2.exists());
        AVSDKLog.e(fehVar, sb.toString());
        return (file.exists() && file.length() > 0) || a2.exists();
    }

    public final boolean H() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5091160", new Object[]{this})).booleanValue();
        }
        String h = h("ping");
        e8b.a aVar = new e8b.a();
        aVar.p(h);
        aVar.f(Integer.MIN_VALUE);
        e8b a2 = aVar.a();
        try {
            try {
                byte[] bytes = "ping ok".getBytes();
                a2.a(0L, true);
                byte[] bArr = new byte[bytes.length];
                a2.read(bArr);
                boolean equals = Arrays.equals(bytes, bArr);
                try {
                    a2.close();
                } catch (ProxyCacheException e2) {
                    feh fehVar = this.l;
                    AVSDKLog.e(fehVar, "pingServer failed!" + e2);
                }
                return equals;
            } catch (ProxyCacheException e3) {
                feh fehVar2 = this.l;
                AVSDKLog.e(fehVar2, "pingServer failed!" + e3);
                return false;
            }
        } catch (ProxyCacheException unused) {
            a2.close();
            return false;
        } catch (Throwable th) {
            try {
                a2.close();
            } catch (ProxyCacheException e4) {
                feh fehVar3 = this.l;
                AVSDKLog.e(fehVar3, "pingServer failed!" + e4);
            }
            throw th;
        }
    }

    public String v(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c6380b8", new Object[]{this, str});
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(a7m.PLAY_TOKEN_ID);
            if (!TextUtils.isEmpty(queryParameter)) {
                this.l.c(queryParameter);
            }
        } catch (Exception e2) {
            feh fehVar = this.l;
            AVSDKLog.e(fehVar, "get playToken From url error" + e2.getMessage());
        }
        if (this.h) {
            cf4 cf4Var = this.g;
            boolean z2 = (cf4Var == null || cf4Var.f17023a == null) ? false : true;
            if (!z2 || !cf4Var.f17023a.exists()) {
                z = false;
            }
            if (z2 && !z) {
                try {
                    new File(this.g.f17023a.getAbsolutePath()).mkdirs();
                } catch (Throwable unused) {
                }
                z = this.g.f17023a.exists();
            }
            if (z && this.g.f17023a.canWrite()) {
                return h(str);
            }
            this.h = false;
            if (!z) {
                this.f28536a = -7;
            } else if (!z) {
                this.f28536a = -8;
            }
        }
        return str;
    }
}
