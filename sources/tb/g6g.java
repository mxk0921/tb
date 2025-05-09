package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.je4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g6g implements tb9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Executor b;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19754a = true;
    public static final je4 c = new je4("kv", "none", "kv");
    public static final je4 d = new je4("xml", "none", "xml");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "fast_sp_computer";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements je4.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f19755a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;

        public b(g6g g6gVar, File file, Map map, String str) {
            this.f19755a = file;
            this.b = map;
            this.c = str;
        }

        @Override // tb.je4.b
        public void run() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.f19755a));
            try {
                h6g.b(this.b, bufferedOutputStream);
                bufferedOutputStream.close();
                g6g.f().b(this.c, this.f19755a.length());
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements je4.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f19756a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;

        public c(g6g g6gVar, File file, Map map, String str) {
            this.f19756a = file;
            this.b = map;
            this.c = str;
        }

        @Override // tb.je4.b
        public void run() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.f19756a));
            try {
                unx.u(this.b, bufferedOutputStream);
                bufferedOutputStream.close();
                g6g.g().b(this.c, this.f19756a.length());
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        }
    }

    public static /* synthetic */ je4 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (je4) ipChange.ipc$dispatch("31bac3da", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ je4 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (je4) ipChange.ipc$dispatch("4270909b", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ Map h(File file) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2d2c82c9", new Object[]{file});
        }
        return h6g.a(file);
    }

    public static /* synthetic */ HashMap i(File file) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fe2b0f78", new Object[]{file});
        }
        return unx.a(new BufferedInputStream(new FileInputStream(file)));
    }

    public static /* synthetic */ void j(je4.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5985f1", new Object[]{bVar, str});
            return;
        }
        try {
            d.e(bVar, str, "write");
        } catch (Throwable th) {
            uhh.d(th);
        }
    }

    static {
        t2o.a(407896076);
        t2o.a(407896073);
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(new a());
        b = newSingleThreadExecutor;
        if (newSingleThreadExecutor instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newSingleThreadExecutor;
            threadPoolExecutor.setKeepAliveTime(1L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    @Override // tb.tb9
    public void a(Map<String, ?> map, File file, File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1341f3b6", new Object[]{this, map, file, file2});
            return;
        }
        final String replace = file2.getName().replace(".kv", "");
        c.e(new b(this, file2, map, replace), replace, "write");
        final c cVar = new c(this, file, map, replace);
        if (f19754a) {
            b.execute(new Runnable() { // from class: tb.d6g
                @Override // java.lang.Runnable
                public final void run() {
                    g6g.j(je4.b.this, replace);
                }
            });
        }
        uhh.c("KvStoreFirstFileAction", "write to", file2.getAbsolutePath());
    }

    @Override // tb.tb9
    public Map<String, ?> b(final File file, final File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e400676", new Object[]{this, file, file2});
        }
        String replace = file2.getName().replace(".kv", "");
        if (file2.exists()) {
            uhh.c("KvStoreFirstFileAction", "read from", file2.getAbsolutePath());
            return (Map) c.d(new Callable() { // from class: tb.e6g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Map h;
                    h = g6g.h(file2);
                    return h;
                }
            }, replace, "read");
        } else if (!file.exists()) {
            return new HashMap();
        } else {
            uhh.c("KvStoreFirstFileAction", "read from", file.getAbsolutePath());
            return (Map) d.d(new Callable() { // from class: tb.f6g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    HashMap i;
                    i = g6g.i(file);
                    return i;
                }
            }, replace, "read");
        }
    }
}
