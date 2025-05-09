package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bx4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] b;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<byte[]> f16695a = new ThreadLocal<>();
    public static final Set<String> c = new HashSet();
    public static final int d = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            String name = file.getName();
            if (!name.startsWith(APower.TYPE_CPU)) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    }

    static {
        File[] listFiles;
        b = new String[0];
        try {
            File[] listFiles2 = new File("/sys/devices/system/cpu/cpufreq").listFiles(new FileFilter() { // from class: tb.zw4
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    boolean i;
                    i = bx4.i(file);
                    return i;
                }
            });
            b = new String[listFiles2.length];
            for (int i = 0; i < listFiles2.length; i++) {
                b[i] = listFiles2[i].getPath() + "/stats/time_in_state";
            }
            for (int i2 = 0; i2 < rw4.d(); i2++) {
                for (File file : new File("/sys/devices/system/cpu/cpu" + i2 + "/cpuidle").listFiles(new FileFilter() { // from class: tb.ax4
                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        boolean j;
                        j = bx4.j(file2);
                        return j;
                    }
                })) {
                    ((HashSet) c).add(file.getPath() + "/time");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa641e2e", new Object[0])).intValue();
        }
        int i = d;
        if (i > 0) {
            return i;
        }
        try {
            int length = new File("/sys/devices/system/cpu/").listFiles(new a()).length;
        } catch (Exception unused) {
            Runtime.getRuntime().availableProcessors();
        }
        return d;
    }

    public static long[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("9b10003f", new Object[0]);
        }
        if (Build.VERSION.SDK_INT < 27) {
            return e();
        }
        long f = f();
        long h = h();
        return (f <= 0 || h <= 0) ? new long[]{0, 0} : new long[]{h + f, f};
    }

    public static long f() {
        Throwable th;
        Exception e;
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dee25263", new Object[0])).longValue();
        }
        wwl.a("CpuUsageCollector.idle");
        byte[] g = g();
        Iterator it = ((HashSet) c).iterator();
        long j = 0;
        while (it.hasNext()) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    randomAccessFile = new RandomAccessFile((String) it.next(), "r");
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int read = randomAccessFile.read(g);
                long j2 = 0;
                for (int i = 0; i < read; i++) {
                    char c2 = (char) g[i];
                    if (c2 > '9' || c2 < '0') {
                        break;
                    }
                    j2 = (j2 * 10) + (c2 - '0');
                }
                j += j2;
                u1d.b(randomAccessFile);
            } catch (Exception e3) {
                e = e3;
                randomAccessFile2 = randomAccessFile;
                e.printStackTrace();
                u1d.b(randomAccessFile2);
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile2 = randomAccessFile;
                u1d.b(randomAccessFile2);
                throw th;
            }
        }
        long j3 = j / 1000;
        wwl.b();
        return j3;
    }

    public static byte[] g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("df56b338", new Object[0]);
        }
        ThreadLocal<byte[]> threadLocal = f16695a;
        if (threadLocal.get() == null) {
            threadLocal.set(new byte[1024]);
        }
        return threadLocal.get();
    }

    public static long h() {
        String[] strArr;
        Throwable th;
        Throwable e;
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47b5e784", new Object[0])).longValue();
        }
        wwl.a("ProcessCpuTracker.readPolicy");
        byte[] g = g();
        long j = 0;
        for (String str : b) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    randomAccessFile = new RandomAccessFile(new File(str), "r");
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (IllegalArgumentException e3) {
                e = e3;
            } catch (SecurityException e4) {
                e = e4;
            }
            try {
                int read = randomAccessFile.read(g);
                if (read <= 0) {
                    owl.a("CpuUsageTracker", "read file siz == 0: " + str);
                } else {
                    cd9 cd9Var = new cd9(g, read);
                    cd9Var.f();
                    cd9Var.j();
                    while (cd9Var.a()) {
                        wwl.a("CpuUsageCollector.readLine");
                        j += cd9Var.c();
                        cd9Var.j();
                        wwl.b();
                    }
                }
                u1d.b(randomAccessFile);
            } catch (IOException e5) {
                e = e5;
                randomAccessFile2 = randomAccessFile;
                e.printStackTrace();
                u1d.b(randomAccessFile2);
            } catch (IllegalArgumentException e6) {
                e = e6;
                randomAccessFile2 = randomAccessFile;
                e.printStackTrace();
                u1d.b(randomAccessFile2);
            } catch (SecurityException e7) {
                e = e7;
                randomAccessFile2 = randomAccessFile;
                e.printStackTrace();
                u1d.b(randomAccessFile2);
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile2 = randomAccessFile;
                u1d.b(randomAccessFile2);
                throw th;
            }
        }
        long j2 = j * 10;
        wwl.b();
        return j2;
    }

    public static long[] e() {
        Throwable th;
        Exception e;
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("be156e7b", new Object[0]);
        }
        wwl.a("CpuUsageCollector.getCpuTimeLowVersion");
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile("/proc/stat", "r");
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] g = g();
            cd9 cd9Var = new cd9(g, randomAccessFile.read(g));
            cd9Var.f();
            cd9Var.j();
            long c2 = cd9Var.c();
            cd9Var.j();
            long c3 = cd9Var.c();
            cd9Var.j();
            long c4 = cd9Var.c();
            cd9Var.j();
            long c5 = cd9Var.c();
            cd9Var.j();
            long c6 = cd9Var.c();
            cd9Var.j();
            long c7 = cd9Var.c();
            cd9Var.j();
            long c8 = cd9Var.c();
            cd9Var.j();
            long c9 = cd9Var.c();
            cd9Var.j();
            long c10 = c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + cd9Var.c();
            long c11 = 1000 / ysg.c();
            long[] jArr = {c10 * c11, c5 * c11};
            u1d.b(randomAccessFile);
            wwl.b();
            return jArr;
        } catch (Exception e3) {
            e = e3;
            randomAccessFile2 = randomAccessFile;
            owl.a("CpuUsageTracker", e.toString());
            u1d.b(randomAccessFile2);
            wwl.b();
            return new long[]{0, 0};
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            u1d.b(randomAccessFile2);
            wwl.b();
            throw th;
        }
    }

    public static /* synthetic */ boolean i(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eda33db9", new Object[]{file})).booleanValue();
        }
        String name = file.getName();
        if (!name.startsWith(gl4.CONFIG_POLICY)) {
            return false;
        }
        for (int i = 6; i < name.length(); i++) {
            if (!Character.isDigit(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean j(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb4d9f7a", new Object[]{file})).booleanValue();
        }
        String name = file.getName();
        if (!name.startsWith("state")) {
            return false;
        }
        for (int i = 5; i < name.length(); i++) {
            if (!Character.isDigit(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
