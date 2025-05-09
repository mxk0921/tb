package tb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jp0 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int[] A = {32, 544, 32, 32, 32, 32, 32, 32, 32, 8224, 32, 8224, 32, 8224, 8224};
    private static final int[] B = {288, 8224, 8224, 8224, 8224, 8224, 8224, 8224};
    public static final int PROCESS_STAT_MAJOR_FAULTS = 1;
    public static final int PROCESS_STAT_MINOR_FAULTS = 0;
    public static final int PROCESS_STAT_STIME = 3;
    public static final int PROCESS_STAT_UTIME = 2;
    public static final int PROC_COMBINE = 256;
    public static final int PROC_OUT_FLOAT = 16384;
    public static final int PROC_OUT_LONG = 8192;
    public static final int PROC_OUT_STRING = 4096;
    public static final int PROC_PARENS = 512;
    public static final int PROC_QUOTES = 1024;
    public static final int PROC_SPACE_TERM = 32;
    public static final int PROC_TAB_TERM = 9;
    public static final int PROC_TERM_MASK = 255;
    public static final int PROC_ZERO_TERM = 0;
    private static final String y = "CpuTracker";
    private static final boolean z = false;

    /* renamed from: a  reason: collision with root package name */
    private long f22136a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private int i;
    private final long[] j;
    private long[] k;
    private Method l;
    private String m;
    private float n;
    private float o;
    private Handler p;
    private ReadWriteLock q;
    private ReadWriteLock r;
    public long s;
    private long t;
    private volatile boolean u;
    private volatile boolean v;
    private volatile double w;
    private volatile double x;

    public jp0(int i, Handler handler) {
        this.j = new long[4];
        this.k = new long[7];
        this.n = -1.0f;
        this.o = -1.0f;
        this.q = new ReentrantReadWriteLock();
        this.r = new ReentrantReadWriteLock();
        this.s = 7000L;
        this.t = 2000L;
        this.u = true;
        this.v = true;
        this.w = vu3.b.GEO_NOT_SUPPORT;
        this.x = vu3.b.GEO_NOT_SUPPORT;
        if (handler != null) {
            this.p = handler;
        } else {
            HandlerThread handlerThread = new HandlerThread(y);
            handlerThread.start();
            this.p = new Handler(handlerThread.getLooper());
        }
        b(i);
    }

    private void a(RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3273b2", new Object[]{this, randomAccessFile});
        } else if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90631633", new Object[]{this})).floatValue();
        }
        this.q.readLock().lock();
        float f = this.n;
        this.q.readLock().unlock();
        return f;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("336e2562", new Object[]{this})).floatValue();
        }
        this.r.readLock().lock();
        float f = this.o;
        this.r.readLock().unlock();
        return f;
    }

    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993e5f2e", new Object[]{this, new Long(j)});
        } else if (Build.VERSION.SDK_INT < 26) {
            this.p.removeCallbacks(this);
            if (j > 0) {
                this.s = j;
                this.p.postDelayed(this, j);
                this.u = true;
                return;
            }
            this.u = false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.v) {
                this.p.postDelayed(this, this.t);
            } else if (this.u) {
                this.p.postDelayed(this, this.s);
            }
            f();
            g();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcec44c", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.m = "/proc/" + i + "/stat";
            Method method = Process.class.getMethod("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class);
            this.l = method;
            method.setAccessible(true);
            if (Build.VERSION.SDK_INT < 26) {
                this.p.post(this);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public float f() {
        float f;
        Throwable th;
        double d;
        double d2;
        Throwable th2;
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9115bc9d", new Object[]{this})).floatValue();
        }
        this.q.writeLock().lock();
        RandomAccessFile randomAccessFile2 = null;
        if (this.v) {
            this.v = false;
            try {
                randomAccessFile = new RandomAccessFile("/proc/stat", "r");
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                String[] split = randomAccessFile.readLine().split(" ");
                this.x = Double.parseDouble(split[5]);
                this.w = Double.parseDouble(split[2]) + Double.parseDouble(split[3]) + Double.parseDouble(split[4]) + Double.parseDouble(split[6]) + Double.parseDouble(split[8]) + Double.parseDouble(split[7]);
                a(randomAccessFile);
            } catch (Throwable th4) {
                th2 = th4;
                randomAccessFile2 = randomAccessFile;
                try {
                    th2.printStackTrace();
                    a(randomAccessFile2);
                    f = 0.0f;
                    this.q.writeLock().unlock();
                    return f;
                } finally {
                }
            }
            f = 0.0f;
        } else {
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile("/proc/stat", "r");
                try {
                    String[] split2 = randomAccessFile3.readLine().split(" ");
                    double parseDouble = Double.parseDouble(split2[5]);
                    double parseDouble2 = Double.parseDouble(split2[2]) + Double.parseDouble(split2[3]) + Double.parseDouble(split2[4]) + Double.parseDouble(split2[6]) + Double.parseDouble(split2[8]) + Double.parseDouble(split2[7]);
                    double d3 = parseDouble2 + parseDouble;
                    double d4 = vu3.b.GEO_NOT_SUPPORT;
                    if (vu3.b.GEO_NOT_SUPPORT != d3 - (this.w + this.x)) {
                        d = parseDouble;
                        d2 = parseDouble2;
                        double a2 = ia2.a((parseDouble2 - this.w) * 100.0d, d3 - (this.w + this.x), 2);
                        if (a2 >= vu3.b.GEO_NOT_SUPPORT) {
                            d4 = a2 > 100.0d ? 100.0d : a2;
                        }
                    } else {
                        d = parseDouble;
                        d2 = parseDouble2;
                    }
                    this.w = d2;
                    this.x = d;
                    f = (float) d4;
                } catch (Throwable th5) {
                    th = th5;
                    randomAccessFile2 = randomAccessFile3;
                    f = 0.0f;
                    try {
                        th.printStackTrace();
                        this.q.writeLock().unlock();
                        return f;
                    } finally {
                    }
                }
                try {
                    this.n = f;
                    a(randomAccessFile3);
                } catch (Throwable th6) {
                    th = th6;
                    randomAccessFile2 = randomAccessFile3;
                    th.printStackTrace();
                    this.q.writeLock().unlock();
                    return f;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
        this.q.writeLock().unlock();
        return f;
    }

    public float g() {
        float f;
        Exception e;
        if (this.l == null || this.m == null) {
            Log.e(y, "readProcFile : " + this.l + ", statFile : " + this.m);
            return 0.0f;
        }
        this.r.writeLock().lock();
        try {
            try {
                if (!((Boolean) this.l.invoke(null, this.m, A, null, this.j, null)).booleanValue() || !((Boolean) this.l.invoke(null, "/proc/stat", B, null, this.k, null)).booleanValue()) {
                    this.r.writeLock().unlock();
                    return 0.0f;
                }
                long[] jArr = this.j;
                int i = (int) (jArr[2] - this.g);
                int i2 = (int) (jArr[3] - this.h);
                long[] jArr2 = this.k;
                long j = jArr2[0] + jArr2[1];
                long j2 = jArr2[2];
                long j3 = jArr2[3];
                long j4 = jArr2[4];
                long j5 = jArr2[5];
                long j6 = jArr2[6];
                int i3 = (int) (j - this.f22136a);
                int i4 = (int) (j2 - this.b);
                int i5 = (int) (j4 - this.c);
                int i6 = (int) (j5 - this.d);
                int i7 = (int) (j6 - this.e);
                int i8 = (int) (j3 - this.f);
                if (i8 <= 1) {
                    i8 = this.i;
                }
                int i9 = i3 + i4 + i5 + i6 + i7 + i8;
                if (i9 > 1) {
                    f = ia2.b((i + i2) * 100, i9, 2);
                    try {
                        this.o = f;
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        this.r.writeLock().unlock();
                        return f;
                    }
                } else {
                    f = 0.0f;
                }
                long[] jArr3 = this.j;
                this.g = jArr3[2];
                this.h = jArr3[3];
                this.f22136a = j;
                this.b = j2;
                this.f = j3;
                this.c = j4;
                this.d = j5;
                this.e = j6;
                this.i = i8;
                this.r.writeLock().unlock();
                return f;
            } catch (Exception e3) {
                e = e3;
                f = 0.0f;
            }
        } catch (Throwable th) {
            this.r.writeLock().unlock();
            throw th;
        }
    }

    public jp0(int i) {
        this.j = new long[4];
        this.k = new long[7];
        this.n = -1.0f;
        this.o = -1.0f;
        this.q = new ReentrantReadWriteLock();
        this.r = new ReentrantReadWriteLock();
        this.s = 7000L;
        this.t = 2000L;
        this.u = true;
        this.v = true;
        this.w = vu3.b.GEO_NOT_SUPPORT;
        this.x = vu3.b.GEO_NOT_SUPPORT;
        HandlerThread handlerThread = new HandlerThread(y);
        handlerThread.start();
        this.p = new Handler(handlerThread.getLooper());
        b(i);
    }
}
