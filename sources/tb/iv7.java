package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.zcache.Error;
import com.taobao.zcache.core.ZCacheCoreProxy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iv7 implements Runnable, Comparable<iv7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final PriorityBlockingQueue<iv7> n = new PriorityBlockingQueue<>();
    private static final ExecutorService o = new ThreadPoolExecutor(1, 5, 3, TimeUnit.SECONDS, new SynchronousQueue(), new a(), new b());
    public static boolean p = true;
    private static bfe q = new e47();

    /* renamed from: a  reason: collision with root package name */
    private final String f21597a;
    private final int b;
    private final String c;
    private final HashMap<String, String> d;
    private final String e;
    private final String f;
    private final fkl g;
    private final ru7 h;
    private ByteArrayOutputStream i;
    private File j;
    private RandomAccessFile k;
    private int l = 0;
    private long m = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "ZCache.Download_" + runnable.hashCode());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
            } else {
                iv7.a().put((iv7) runnable);
            }
        }
    }

    static {
        t2o.a(996147279);
    }

    public iv7(String str, int i, String str2, HashMap<String, String> hashMap, String str3, String str4, fkl fklVar, ru7 ru7Var) {
        this.f21597a = str;
        this.b = i;
        this.c = str2;
        this.d = hashMap == null ? new HashMap<>() : hashMap;
        this.e = str3;
        this.f = str4;
        this.g = fklVar;
        this.h = ru7Var;
    }

    public static /* synthetic */ PriorityBlockingQueue a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PriorityBlockingQueue) ipChange.ipc$dispatch("b16d084e", new Object[0]);
        }
        return n;
    }

    private long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af98f7b8", new Object[]{this, str})).longValue();
        }
        if (str == null || !str.startsWith("bytes")) {
            return 0L;
        }
        String[] split = str.split("[ -/]]");
        if (split.length != 4) {
            return 0L;
        }
        try {
            long parseLong = Long.parseLong(split[1]);
            this.k.seek(parseLong);
            return parseLong;
        } catch (IOException unused) {
            return 0L;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3beafdd5", new Object[]{this});
            return;
        }
        RandomAccessFile randomAccessFile = this.k;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
            this.k = null;
        }
    }

    private void f(File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13188d46", new Object[]{this, file, file2});
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6c6cfc7", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(yox.g().getCacheDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("ZCache");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        String h = h(str.getBytes());
        if (h == null) {
            h = "TEMP_FILE_" + System.currentTimeMillis();
        }
        return file + str2 + h;
    }

    private static String h(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6725db94", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private void i(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbbeb70", new Object[]{this, str});
            return;
        }
        File file = new File(str);
        this.j = file;
        if (file.isDirectory()) {
            this.j.delete();
        }
        if (!this.j.exists()) {
            this.j.createNewFile();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.j, "rwd");
        this.k = randomAccessFile;
        long length = randomAccessFile.length();
        if (length > 0) {
            this.k.seek(length);
            HashMap<String, String> hashMap = this.d;
            hashMap.put(HttpConstant.RANGE, HttpConstant.RANGE_PRE + length + "-");
        }
    }

    public static void j(bfe bfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4650f9ac", new Object[]{bfeVar});
        } else if (bfeVar != null) {
            q = bfeVar;
            lcn.a(RVLLevel.Info, "ZCache/Setup").j("registerNetworkService").a("type", bfeVar.getClass().getName()).f();
        }
    }

    private void k(int i, Map<String, String> map, Error error, byte[] bArr) {
        Error error2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3527072a", new Object[]{this, new Integer(i), map, error, bArr});
            return;
        }
        d();
        if (error != null) {
            error2 = new Error(1003, "request \"" + this.f21597a + "\" failed: " + error.getCode() + ", " + error.getMessage());
        } else {
            error2 = error;
        }
        ((ZCacheCoreProxy.c) this.h).a(i, this.m, map, error2, bArr);
    }

    public static void m(iv7 iv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1907167b", new Object[]{iv7Var});
        } else {
            o.execute(iv7Var);
        }
    }

    /* renamed from: e */
    public int compareTo(iv7 iv7Var) {
        int i;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8373a547", new Object[]{this, iv7Var})).intValue();
        }
        if (this.c == null) {
            i = 0;
        } else {
            i = 1;
        }
        if (iv7Var.c == null) {
            i2 = 0;
        }
        return i - i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        for (iv7 iv7Var = this; iv7Var != null; iv7Var = n.poll()) {
            iv7Var.l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
        if (r0 == null) goto L_0x01ac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b9, code lost:
        if (r0 == null) goto L_0x01ac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l() {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iv7.l():void");
    }
}
