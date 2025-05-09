package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.io.File;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCAL_PATH_FLAG = "/themis/tmp";
    public static final String PATH_PREFIX = "https://tmp";

    /* renamed from: a  reason: collision with root package name */
    public final String f16415a;
    public final Context b;
    public static final b Companion = new b(null);
    public static final ConcurrentHashMap<String, bit> c = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                bit.a(bit.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909986);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final bit a(String str, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bit) ipChange.ipc$dispatch("bc85b519", new Object[]{this, str, context});
            }
            ckf.g(str, "bizId");
            ckf.g(context, "context");
            if (!bit.b().contains(str)) {
                bit.b().put(str, new bit(str, context, null));
            }
            Object obj = bit.b().get(str);
            if (obj != null) {
                return (bit) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.kernel.utils.TempFileHandler");
        }

        public b() {
        }
    }

    static {
        t2o.a(839909984);
    }

    public /* synthetic */ bit(String str, Context context, a07 a07Var) {
        this(str, context);
    }

    public static final /* synthetic */ void a(bit bitVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8508e", new Object[]{bitVar});
        } else {
            bitVar.c();
        }
    }

    public static final /* synthetic */ ConcurrentHashMap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("360ba656", new Object[0]);
        }
        return c;
    }

    public final void c() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0f009f", new Object[]{this});
            return;
        }
        String d = d();
        if (!(d == null || d.length() == 0 || !vg9.b(d))) {
            Stack stack = new Stack();
            stack.push(d);
            long currentTimeMillis = System.currentTimeMillis();
            while (!stack.isEmpty()) {
                Object pop = stack.pop();
                ckf.d(pop);
                File file = new File((String) pop);
                if (currentTimeMillis - file.lastModified() > 604800000) {
                    nc9.a(file);
                } else if (!(!file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0)) {
                    for (File file2 : listFiles) {
                        stack.push(file2.getAbsolutePath());
                    }
                }
            }
        }
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4f83551", new Object[]{this});
        }
        return pq7.d(this.b, ckf.p("tmp/", this.f16415a));
    }

    public bit(String str, Context context) {
        Executor executor;
        this.f16415a = str;
        this.b = context;
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.IO)) != null) {
            executor.execute(new a());
        }
    }

    public final String e(String str) {
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87ac227e", new Object[]{this, str});
        }
        ckf.g(str, gl4.CONFIG_LOCAL_PATH);
        TMSLogger.a("TempPathConversionUtils", "localPathToTmpPath, localPath: " + str + ", bizId: " + this.f16415a);
        if (str.length() == 0 || this.f16415a.length() == 0 || (d = d()) == null || d.length() == 0 || !tsq.I(str, String.valueOf(d), false, 2, null)) {
            return null;
        }
        boolean b2 = ckf.b(str, d);
        String str2 = PATH_PREFIX;
        if (!b2) {
            String substring = str.substring(d.length());
            ckf.f(substring, "this as java.lang.String).substring(startIndex)");
            str2 = ckf.p(str2, substring);
        }
        TMSLogger.a("TempPathConversionUtils", ckf.p("localPathToTmpPath, usrPath: ", str2));
        return str2;
    }

    public final String f(String str) {
        int length;
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5128196", new Object[]{this, str});
        }
        ckf.g(str, "tmpPath");
        TMSLogger.a("TempPathConversionUtils", "tmpPathToLocalPath，tmpPath: " + str + ", bizId: " + this.f16415a);
        if (str.length() == 0 || this.f16415a.length() == 0 || (length = str.length()) < 11) {
            return null;
        }
        if ((length == 11 && !ckf.b(str, PATH_PREFIX)) || !tsq.I(str, PATH_PREFIX, false, 2, null) || (d = d()) == null || d.length() == 0) {
            return null;
        }
        File file = new File(d);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (length == 11) {
            return d;
        }
        String substring = str.substring(11);
        ckf.f(substring, "this as java.lang.String).substring(startIndex)");
        String p = ckf.p(d, substring);
        TMSLogger.a("TempPathConversionUtils", ckf.p("tmp local path: ", p));
        return p;
    }
}
