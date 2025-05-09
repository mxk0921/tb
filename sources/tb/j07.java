package tb;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.util.HttpConstant;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import tb.fgl;
import tb.l0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j07 implements m0c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ST_CANCELED = 2;
    public static final int ST_PAUSED = 1;
    public static File p;
    public static final AtomicInteger q = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    public v9f f21678a;
    public fgl b;
    public l55 c;
    public int d;
    public RandomAccessFile e;
    public RandomAccessFile[] f;
    public final AtomicLong g = new AtomicLong(0);
    public final AtomicLong h = new AtomicLong(0);
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicInteger l = new AtomicInteger(0);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final p55 o = new a();
    public final int n = q.getAndAdd(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements p55 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.j07$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0952a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f21680a;

            public RunnableC0952a(int i) {
                this.f21680a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  onResponseCode code invalid " + this.f21680a, new Object[0]);
                j07.k(j07.this).d.a(-12, this.f21680a, "http code invalid").b = true;
                j07.k(j07.this).a(j07.c(j07.this));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    j07.k(j07.this).a(j07.c(j07.this));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i0n f21682a;

            public c(i0n i0nVar) {
                this.f21682a = i0nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (j07.m(j07.this).get()) {
                    fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  onDataReceived interrupt", new Object[0]);
                } else {
                    j07 j07Var = j07.this;
                    int r = j07.r(j07Var, j07.q(j07Var).get());
                    if (r > 0) {
                        fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  onDataReceived stopped", new Object[0]);
                        j07.m(j07.this).set(true);
                        j07.k(j07.this).d.a(-20, r, "");
                        j07.k(j07.this).a(j07.c(j07.this));
                        return;
                    }
                    int i = this.f21682a.c;
                    if (j07.e(j07.this) == null || j07.e(j07.this).length <= i) {
                        fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  partRandomAccessFiles error", new Object[0]);
                        return;
                    }
                    if (j07.e(j07.this)[i] == null) {
                        try {
                            j07.e(j07.this)[i] = j07.c(j07.this).f(j07.c(j07.this).f[i]);
                        } catch (FileNotFoundException e) {
                            fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  partRandomAccessFile error: " + e, new Object[0]);
                        }
                    }
                    j07 j07Var2 = j07.this;
                    j07.f(j07Var2, this.f21682a, j07.e(j07Var2)[i]);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i0n f21683a;

            public d(i0n i0nVar) {
                this.f21683a = i0nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (j07.g(j07.this) == null) {
                    try {
                        j07 j07Var = j07.this;
                        j07.h(j07Var, j07.c(j07Var).f(j07.c(j07.this).d));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (j07.g(j07.this) == null) {
                        fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  getTempRandomAccessFile error", new Object[0]);
                        return;
                    }
                }
                j07 j07Var2 = j07.this;
                j07.f(j07Var2, this.f21683a, j07.g(j07Var2));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f21684a;
            public final /* synthetic */ String b;

            public e(int i, String str) {
                this.f21684a = i;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (j07.d(j07.this).get()) {
                    fs7.e("Downloader", "id: " + j07.b(j07.this) + ", onFinished 降级" + this.f21684a + ", " + this.b, new Object[0]);
                    j07.i(j07.this, this.f21684a);
                } else {
                    fs7.e("Downloader", "id: " + j07.b(j07.this) + ", onFinished 正常结束" + this.f21684a + ", " + this.b, new Object[0]);
                    j07.j(j07.this, this.f21684a);
                }
                j07.k(j07.this).a(j07.c(j07.this));
            }
        }

        public a() {
        }

        public void a(i0n i0nVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d22338b6", new Object[]{this, i0nVar, obj});
            } else if (j07.m(j07.this).get()) {
                if (j07.n(j07.this) != null) {
                    j07.n(j07.this).cancel();
                }
                fs7.e("Downloader", "id: " + j07.b(j07.this) + ", onDataReceived 提前中断", new Object[0]);
            } else if (i0nVar == null) {
                fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  onDataReceived progressEvent is null ", new Object[0]);
            } else {
                if (j07.p(j07.this).get() == 0) {
                    j07.p(j07.this).set(System.currentTimeMillis());
                    fs7.e("Downloader", "id: " + j07.b(j07.this) + ", onDataReceived 首次收到数据", new Object[0]);
                }
                j07 j07Var = j07.this;
                int r = j07.r(j07Var, j07.q(j07Var).get());
                if (r > 0) {
                    j07.m(j07.this).set(true);
                    j07.k(j07.this).d.a(-20, r, "");
                    fs7.e("Downloader", "id: " + j07.b(j07.this) + ", onDataReceived 任务被暂停 提前中断", new Object[0]);
                    q55.a(new b());
                } else if (j07.d(j07.this).get() || j07.e(j07.this) == null) {
                    if (!j07.d(j07.this).get()) {
                        fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  onDataReceived degrade !!!!!!!", new Object[0]);
                        j07.d(j07.this).set(true);
                    }
                    q55.a(new d(i0nVar));
                } else {
                    q55.a(new c(i0nVar));
                }
            }
        }

        public void b(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5587d795", new Object[]{this, new Integer(i), str});
            } else if (j07.m(j07.this).get()) {
                fs7.e("Downloader", "id: " + j07.b(j07.this) + ", onFinished 提前中断", new Object[0]);
            } else {
                fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  onFinished" + i + ", " + str + ", alltime = " + (System.currentTimeMillis() - j07.l(j07.this).get()) + ", url = " + j07.c(j07.this).b.e.f25507a, new Object[0]);
                l0j.a aVar = j07.k(j07.this).e;
                aVar.f = aVar.f + (System.currentTimeMillis() - j07.p(j07.this).get());
                q55.a(new e(i, str));
            }
        }

        public boolean c(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            fs7.e("Downloader", "id: " + j07.b(j07.this) + ", doBoostNetworkDownload  onResponseCode " + i + ", url = " + j07.c(j07.this).b.e.f25507a, new Object[0]);
            l0j.a aVar = j07.k(j07.this).e;
            aVar.e = aVar.e + (System.currentTimeMillis() - j07.l(j07.this).get());
            if (!j07.c(j07.this).i(0L, i)) {
                j07.m(j07.this).set(true);
                if (j07.n(j07.this) != null) {
                    j07.n(j07.this).cancel();
                }
                srt.a(new RunnableC0952a(i), false);
            }
            j07.o(j07.this, map);
            j07.k(j07.this).c.set(pw9.c(j07.c(j07.this).f, j07.b(j07.this)));
            return false;
        }
    }

    public static /* synthetic */ int b(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97de7ba4", new Object[]{j07Var})).intValue();
        }
        return j07Var.n;
    }

    public static /* synthetic */ v9f c(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v9f) ipChange.ipc$dispatch("463935ff", new Object[]{j07Var});
        }
        return j07Var.f21678a;
    }

    public static /* synthetic */ AtomicBoolean d(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("f1650822", new Object[]{j07Var});
        }
        return j07Var.j;
    }

    public static /* synthetic */ RandomAccessFile[] e(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RandomAccessFile[]) ipChange.ipc$dispatch("a2f40676", new Object[]{j07Var});
        }
        return j07Var.f;
    }

    public static /* synthetic */ void f(j07 j07Var, i0n i0nVar, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00d873b", new Object[]{j07Var, i0nVar, randomAccessFile});
        } else {
            j07Var.F(i0nVar, randomAccessFile);
        }
    }

    public static /* synthetic */ RandomAccessFile g(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RandomAccessFile) ipChange.ipc$dispatch("61dca827", new Object[]{j07Var});
        }
        return j07Var.e;
    }

    public static /* synthetic */ RandomAccessFile h(j07 j07Var, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RandomAccessFile) ipChange.ipc$dispatch("fa52e7f9", new Object[]{j07Var, randomAccessFile});
        }
        j07Var.e = randomAccessFile;
        return randomAccessFile;
    }

    public static /* synthetic */ void i(j07 j07Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f291e5", new Object[]{j07Var, new Integer(i)});
        } else {
            j07Var.B(i);
        }
    }

    public static /* synthetic */ void j(j07 j07Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b209e6", new Object[]{j07Var, new Integer(i)});
        } else {
            j07Var.v(i);
        }
    }

    public static /* synthetic */ fgl k(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fgl) ipChange.ipc$dispatch("e7a413c5", new Object[]{j07Var});
        }
        return j07Var.b;
    }

    public static /* synthetic */ AtomicLong l(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicLong) ipChange.ipc$dispatch("aacce124", new Object[]{j07Var});
        }
        return j07Var.g;
    }

    public static /* synthetic */ AtomicBoolean m(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("98bcb82d", new Object[]{j07Var});
        }
        return j07Var.i;
    }

    public static /* synthetic */ l55 n(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l55) ipChange.ipc$dispatch("64e8dc7c", new Object[]{j07Var});
        }
        return j07Var.c;
    }

    public static /* synthetic */ void o(j07 j07Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1db53a", new Object[]{j07Var, map});
        } else {
            j07Var.G(map);
        }
    }

    public static /* synthetic */ AtomicLong p(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicLong) ipChange.ipc$dispatch("b8669e28", new Object[]{j07Var});
        }
        return j07Var.h;
    }

    public static /* synthetic */ AtomicInteger q(j07 j07Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("f8d83a53", new Object[]{j07Var});
        }
        return j07Var.l;
    }

    public static /* synthetic */ int r(j07 j07Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1faca56e", new Object[]{j07Var, new Integer(i)})).intValue();
        }
        return j07Var.z(i);
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49c51c7", new Object[]{this})).booleanValue();
        }
        try {
            if ((xh4.f31395a.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean D(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c214bfa", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            if (p == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    p = xh4.f31395a.getExternalCacheDir();
                } else {
                    p = Environment.getExternalStorageDirectory();
                }
            }
            if (p.getFreeSpace() >= j) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void F(i0n i0nVar, RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e502ae", new Object[]{this, i0nVar, randomAccessFile});
            return;
        }
        try {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(randomAccessFile.length());
            channel.write(ByteBuffer.wrap(i0nVar.b, 0, i0nVar.f21018a));
            this.b.c.getAndAdd(i0nVar.b.length);
            fgl fglVar = this.b;
            fglVar.e.r += i0nVar.b.length;
            fglVar.b(this.f21678a.b.e.f25507a);
        } catch (IOException e) {
            fs7.d("Downloader", "id: " + this.n + ", saveDataAndCallbackProgress  ", e, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:12:0x0041, B:14:0x0047, B:17:0x0053, B:21:0x005f, B:23:0x0065, B:26:0x006e, B:28:0x00ad, B:30:0x00bd, B:32:0x00f4, B:34:0x00fa, B:36:0x00fe, B:37:0x0120, B:39:0x0126, B:41:0x0129, B:43:0x0154, B:44:0x017d, B:46:0x01aa, B:48:0x01ad, B:50:0x01b4, B:51:0x01d0, B:53:0x01d4, B:55:0x01d7, B:56:0x01dc), top: B:59:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:12:0x0041, B:14:0x0047, B:17:0x0053, B:21:0x005f, B:23:0x0065, B:26:0x006e, B:28:0x00ad, B:30:0x00bd, B:32:0x00f4, B:34:0x00fa, B:36:0x00fe, B:37:0x0120, B:39:0x0126, B:41:0x0129, B:43:0x0154, B:44:0x017d, B:46:0x01aa, B:48:0x01ad, B:50:0x01b4, B:51:0x01d0, B:53:0x01d4, B:55:0x01d7, B:56:0x01dc), top: B:59:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:12:0x0041, B:14:0x0047, B:17:0x0053, B:21:0x005f, B:23:0x0065, B:26:0x006e, B:28:0x00ad, B:30:0x00bd, B:32:0x00f4, B:34:0x00fa, B:36:0x00fe, B:37:0x0120, B:39:0x0126, B:41:0x0129, B:43:0x0154, B:44:0x017d, B:46:0x01aa, B:48:0x01ad, B:50:0x01b4, B:51:0x01d0, B:53:0x01d4, B:55:0x01d7, B:56:0x01dc), top: B:59:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017d A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:12:0x0041, B:14:0x0047, B:17:0x0053, B:21:0x005f, B:23:0x0065, B:26:0x006e, B:28:0x00ad, B:30:0x00bd, B:32:0x00f4, B:34:0x00fa, B:36:0x00fe, B:37:0x0120, B:39:0x0126, B:41:0x0129, B:43:0x0154, B:44:0x017d, B:46:0x01aa, B:48:0x01ad, B:50:0x01b4, B:51:0x01d0, B:53:0x01d4, B:55:0x01d7, B:56:0x01dc), top: B:59:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r18) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j07.G(java.util.Map):void");
    }

    public final boolean H() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89de4e05", new Object[]{this})).booleanValue();
        }
        try {
            if (xh4.m != null && (xh4.r || this.f21678a.b.e.b >= xh4.p)) {
                if (!xh4.q) {
                    fs7.e("Downloader", "id: " + this.n + ", supportBoostNetwork Orange开关" + xh4.q, new Object[0]);
                    return false;
                }
                v9f v9fVar = this.f21678a;
                if (v9fVar.b.e.b < xh4.p || v9fVar.c() <= 0) {
                    l55 b = k1r.b();
                    this.c = b;
                    if (b == null) {
                        fs7.e("Downloader", "id: " + this.n + ", supportBoostNetwork  AnetCallImpl init error", new Object[0]);
                        return false;
                    }
                    if (((Integer) zv7.a(xh4.f31395a, "degrade_" + this.f21678a.b.e.f25507a, 0)).intValue() >= 2) {
                        fs7.e("Downloader", "id: " + this.n + ", supportBoostNetwork  check md5 invalid more than 2 times degraded!!!", new Object[0]);
                        return false;
                    }
                    this.f21678a.b.f.getClass();
                    String str = xh4.o;
                    if (TextUtils.isEmpty(str) || (split = str.split(",")) == null || split.length <= 0) {
                        return false;
                    }
                    for (String str2 : split) {
                        if (TextUtils.equals(str2, this.f21678a.b.f.f29547a)) {
                            return true;
                        }
                    }
                    return false;
                }
                fs7.e("Downloader", "id: " + this.n + ", supportBoostNetwork 临时文件存在，不再分包", new Object[0]);
                return false;
            }
            fs7.e("Downloader", "id: " + this.n + ", supportBoostNetwork  init error or itemSize: " + this.f21678a.b.e.b + ", boostFileSize" + xh4.p + ", url " + this.f21678a.b.e.f25507a, new Object[0]);
            return false;
        } catch (Throwable th) {
            fs7.d("Downloader", "id: " + this.n + ", supportBoostNetwork", th, new Object[0]);
            return false;
        }
    }

    @Override // tb.m0c
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        int i = this.d | 2;
        this.d = i;
        this.l.set(i);
    }

    @Override // tb.m0c
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        int i = 1 | this.d;
        this.d = i;
        this.l.set(i);
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ec663e", new Object[]{this});
            return;
        }
        File[] fileArr = this.f21678a.f;
        if (fileArr != null && fileArr.length > 0) {
            for (File file : fileArr) {
                if (file.exists()) {
                    file.delete();
                }
            }
        }
    }

    public final void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab1a199", new Object[]{this, new Integer(i)});
        } else if (!s(this.f21678a.b.e.b, true)) {
            fs7.e("Downloader", "id: " + this.n + ", doFinishTask file check invalid url = " + this.f21678a.b.e.f25507a + " size =" + this.f21678a.b.e.b + ", md5 = " + this.b.e.l, new Object[0]);
            this.f21678a.d.delete();
            if (!this.f21678a.i(0L, i)) {
                fgl.a aVar = this.b.d;
                aVar.a(-12, i, "" + i);
                return;
            }
            fs7.e("Downloader", "id: " + this.n + ", doFinishTask file check invalid 删除分片文件 url = " + this.f21678a.b.e.f25507a, new Object[0]);
            t();
            if (xh4.s) {
                pw9.b(this.f21678a.b.e.f25507a);
                this.b.e.p = true;
            }
            fgl fglVar = this.b;
            fglVar.e.q = true;
            fglVar.d.a(this.f21678a.b(), 106, "download invalid");
        } else {
            pw9.b(this.f21678a.b.e.f25507a);
        }
    }

    public final String y(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37a5fba1", new Object[]{this, th});
        }
        if (!(th instanceof RuntimeException) || th.getMessage() == null || th.getMessage().length() >= 20) {
            return th.getClass().getSimpleName();
        }
        return th.getClass().getSimpleName() + ":" + th.getMessage();
    }

    public final int z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1e21d67", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i > 0) {
            if ((i & 1) == 1) {
                return 1;
            }
            if ((i & 2) == 2) {
                if (this.f21678a.d.exists()) {
                    this.f21678a.d.delete();
                }
                t();
                return 2;
            }
        }
        return 0;
    }

    public final String A(String str, int i) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77ce7153", new Object[]{this, str, new Integer(i)});
        }
        if (TextUtils.isEmpty(str)) {
            return "mid";
        }
        if (i == 41) {
            return "high";
        }
        if (TextUtils.isEmpty("featurepreload,remoteso_preload") || (split = "featurepreload,remoteso_preload".split(",")) == null || split.length <= 0) {
            return "mid";
        }
        for (String str2 : split) {
            if (TextUtils.equals(str2, str)) {
                return "low";
            }
        }
        return "mid";
    }

    public final void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a14a6653", new Object[]{this, new Integer(i)});
            return;
        }
        this.b.e.k = true;
        long currentTimeMillis = System.currentTimeMillis();
        Pair<Boolean, String> a2 = this.f21678a.a();
        if (((Boolean) a2.first).booleanValue()) {
            this.b.e.j = System.currentTimeMillis() - currentTimeMillis;
            v9f v9fVar = this.f21678a;
            if (mg9.f(v9fVar.d, v9fVar.e)) {
                this.b.f19278a = 10;
                fs7.e("Downloader", "id: " + this.n + ", handleBoostDegraded  checkTmpCacheValidity move file success", new Object[0]);
                return;
            }
            this.b.d.a(-11, this.f21678a.e.getParentFile().canWrite() ? 104 : 105, "rename tmp file error").getClass();
            fs7.e("Downloader", "id: " + this.n + ", handleBoostDegraded  checkTmpCacheValidity move file error", new Object[0]);
            return;
        }
        fs7.e("Downloader", "id: " + this.n + ", handleBoostDegraded file check invalid url = " + this.f21678a.b.e.f25507a + " size =" + this.f21678a.b.e.b, new Object[0]);
        if (!this.f21678a.i(0L, i)) {
            fgl.a aVar = this.b.d;
            aVar.a(-12, i, "" + i);
            return;
        }
        fs7.e("Downloader", "id: " + this.n + ", handleBoostDegraded  降级删除临时文件", new Object[0]);
        this.f21678a.d.delete();
        this.b.d.a(this.f21678a.b(), 106, "download invalid");
        l0j.a aVar2 = this.b.e;
        aVar2.l = this.f21678a.b.e.c + "," + ((String) a2.second);
        fs7.e("Downloader", "id: " + this.n + ", handleBoostDegraded  checkTmpCacheValidity url = " + this.f21678a.b.e.f25507a + " size =" + this.f21678a.b.e.b + ", md5 = " + this.b.e.l, new Object[0]);
    }

    public final boolean E(n55 n55Var, o55 o55Var, RandomAccessFile randomAccessFile) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d92b918a", new Object[]{this, n55Var, o55Var, randomAccessFile})).booleanValue();
        }
        if (o55Var == null || randomAccessFile == null) {
            fgl.a aVar = this.b.d;
            StringBuilder sb = new StringBuilder("savedataParam:");
            sb.append(o55Var == null);
            sb.append("|");
            if (randomAccessFile != null) {
                z = false;
            }
            sb.append(z);
            aVar.a(-19, 0, sb.toString());
            return false;
        }
        this.b.c.set(this.f21678a.d.length());
        FileChannel channel = randomAccessFile.getChannel();
        try {
            channel.position(randomAccessFile.length());
            byte[] bArr = new byte[k1r.d()];
            while (true) {
                int z2 = z(this.l.get());
                if (z2 > 0) {
                    fs7.e("Downloader", "id: " + this.n + ", saveData read task stop status=" + z2, new Object[0]);
                    this.b.d.a(-20, z2, "");
                    return false;
                }
                try {
                    int read = o55Var.read(bArr);
                    if (-1 == read) {
                        fs7.e("Downloader", "id: " + this.n + ", input.read file finished", new Object[0]);
                        if (n55Var != null) {
                            try {
                                if (!(n55Var.getStatusCode() == 200 || n55Var.getStatusCode() == 206)) {
                                    fs7.e("Downloader", "id: " + this.n + ", connection exception code", Integer.valueOf(n55Var.getStatusCode()));
                                    this.b.d.a(-12, n55Var.getStatusCode(), "" + n55Var.getStatusCode());
                                    return false;
                                }
                            } catch (Exception e) {
                                this.b.d.a(-12, 302, y(e)).b = true;
                                fs7.d("Downloader", "id: " + this.n + ", connection exception", e, new Object[0]);
                                return false;
                            }
                        }
                        return true;
                    }
                    this.b.getClass();
                    try {
                        int z3 = z(this.l.get());
                        if (z3 > 0) {
                            fs7.e("Downloader", "id: " + this.n + ", saveData write task stop status=" + z3, new Object[0]);
                            this.b.d.a(-20, z3, "");
                            return false;
                        }
                        channel.write(ByteBuffer.wrap(bArr, 0, read));
                        long j = read;
                        this.b.c.getAndAdd(j);
                        fgl fglVar = this.b;
                        fglVar.e.r += j;
                        fglVar.b(this.f21678a.b.e.f25507a);
                    } catch (IOException e2) {
                        fs7.d("Downloader", "id: " + this.n + ", fc.write exception", e2, new Object[0]);
                        this.b.d.a(-11, 102, y(e2)).getClass();
                        return false;
                    }
                } catch (Exception e3) {
                    fs7.d("Downloader", "id: " + this.n + ", input.read exception", e3, new Object[0]);
                    this.b.d.a(-12, 201, y(e3)).getClass();
                    return false;
                }
            }
        } catch (IOException e4) {
            fs7.d("Downloader", "id: " + this.n + ", fc.position exception", e4, new Object[0]);
            this.b.d.a(-11, 101, y(e4)).getClass();
            return false;
        }
    }

    @Override // tb.m0c
    public void a(zzp zzpVar, qkc qkcVar) {
        int z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aca2254", new Object[]{this, zzpVar, qkcVar});
            return;
        }
        this.f21678a = new v9f(zzpVar);
        this.b = new fgl(qkcVar);
        try {
            z = z(this.l.get());
        } catch (Throwable th) {
            try {
                fs7.d("Downloader", "id: " + this.n + ", do download exception", th, new Object[0]);
                this.b.d.a(-19, 301, y(th));
                if (this.k.get()) {
                    return;
                }
            } finally {
                if (!this.k.get()) {
                    this.b.a(this.f21678a);
                }
            }
        }
        if (z > 0) {
            this.b.d.a(-20, z, "");
            fs7.e("Downloader", "id: " + this.n + ", download status changed1 status = " + z, new Object[0]);
            if (z2) {
                return;
            }
            return;
        }
        this.f21678a.j();
        if (this.f21678a.g()) {
            fs7.e("Downloader", "id: " + this.n + ", download hitFileCache", new Object[0]);
            this.b.f19278a = 11;
            if (!this.k.get()) {
                this.b.a(this.f21678a);
            }
        } else if (this.f21678a.h()) {
            v9f v9fVar = this.f21678a;
            if (mg9.f(v9fVar.d, v9fVar.e)) {
                this.b.f19278a = 11;
            } else {
                this.b.d.a(-11, this.f21678a.e.getParentFile().canWrite() ? 104 : 105, "rename tmp file error").getClass();
            }
            fs7.e("Downloader", "id: " + this.n + ", download hitTmpCache", new Object[0]);
            if (!this.k.get()) {
                this.b.a(this.f21678a);
            }
        } else if (!D(zzpVar.e.b)) {
            fgl.a aVar = this.b.d;
            aVar.f19279a = false;
            aVar.c = -21;
            upl uplVar = this.f21678a.b.f;
            uplVar.j = 0;
            uplVar.d = 0;
            if (!this.k.get()) {
                this.b.a(this.f21678a);
            }
        } else {
            if (H()) {
                this.k.set(true);
                fs7.e("Downloader", "id: " + this.n + ", supportBoostNetwork 开始走分包请求 url " + this.f21678a.b.e.f25507a, new Object[0]);
                u();
            } else {
                fs7.e("Downloader", "id: " + this.n + ", 同步请求 url = " + this.f21678a.b.e.f25507a, new Object[0]);
                w();
            }
            if (this.k.get()) {
                return;
            }
            this.b.a(this.f21678a);
        }
    }

    public final void u() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4682e565", new Object[]{this});
            return;
        }
        try {
            upl uplVar = this.f21678a.b.f;
            String A = A(uplVar.f29547a, uplVar.b);
            l55 l55Var = this.c;
            v9f v9fVar = this.f21678a;
            l55Var.b(v9fVar.c, v9fVar.f29868a);
            l55 l55Var2 = this.c;
            l55Var2.addRequestHeader("f-refer", "download_" + this.f21678a.b.f.f29547a);
            l55 l55Var3 = this.c;
            this.f21678a.b.f.getClass();
            l55Var3.setExtProperty("prefetch", "false");
            this.c.setExtProperty(RequestConstant.KEY_BIZ_SCENE, this.f21678a.b.f.i);
            this.c.setExtProperty(RequestConstant.KEY_PRIORITY_LEVEL, A);
            l55 l55Var4 = this.c;
            if (xh4.r) {
                str = "async";
            } else {
                str = "";
            }
            l55Var4.setExtProperty(RequestConstant.KEY_QOS_ASYC_OPT, str);
            l0j.a aVar = this.b.e;
            v9f v9fVar2 = this.f21678a;
            zzp zzpVar = v9fVar2.b;
            aVar.n = zzpVar.f.i;
            aVar.o = A;
            String a2 = pw9.a(v9fVar2, zzpVar.e.f25507a);
            long j = this.f21678a.b.e.b;
            if (TextUtils.isEmpty(a2)) {
                this.b.e.d = false;
            } else {
                this.c.setExtProperty(HttpConstant.RANGE, a2);
                this.b.e.d = true;
                fs7.e("Downloader", "id: " + this.n + ", doBoostNetworkDownload", "add request property range", a2);
            }
            this.c.setExtProperty(RequestConstant.KEY_FILE_LENGTH, String.valueOf(j));
            this.c.setExtProperty(RequestConstant.KEY_OPEN_RANGE_BOOST, "enable");
            Context context = xh4.f31395a;
            if (((Integer) zv7.a(context, "degrade_" + this.f21678a.b.e.f25507a, 0)).intValue() == 1 || C()) {
                this.c.setExtProperty("f-calculate-md5", "enable");
            }
            if (s(j, false)) {
                fs7.e("Downloader", "id: " + this.n + ", doBoostNetworkDownload temp file valid merge part file success", new Object[0]);
                this.b.a(this.f21678a);
                pw9.b(this.f21678a.b.e.f25507a);
                return;
            }
            this.g.set(System.currentTimeMillis());
            fs7.e("Downloader", "id: " + this.n + ", supportBoostNetwork 开始走分包请求 enqueue request url " + this.f21678a.b.e.f25507a, new Object[0]);
            this.c.a(this.o);
        } catch (Throwable th) {
            fs7.d("Downloader", "id: " + this.n + ", doBoostNetworkDownload", th, new Object[0]);
            this.b.d.a(-12, 303, "boost network error").b = true;
            this.b.a(this.f21678a);
        }
    }

    public final n55 x() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n55) ipChange.ipc$dispatch("414e9c8d", new Object[]{this});
        }
        v9f v9fVar = this.f21678a;
        n55 c = k1r.c(v9fVar.b.e, v9fVar.f29868a);
        try {
            v9f v9fVar2 = this.f21678a;
            c.a(v9fVar2.c, v9fVar2.f29868a);
            upl uplVar = this.f21678a.b.f;
            String A = A(uplVar.f29547a, uplVar.b);
            c.b("f-refer", "download_" + this.f21678a.b.f.f29547a);
            this.f21678a.b.f.getClass();
            c.b("prefetch", "false");
            c.b(RequestConstant.KEY_BIZ_SCENE, this.f21678a.b.f.i);
            c.b(RequestConstant.KEY_PRIORITY_LEVEL, A);
            if (xh4.r) {
                str = "async";
            } else {
                str = "";
            }
            c.b(RequestConstant.KEY_QOS_ASYC_OPT, str);
            l0j.a aVar = this.b.e;
            v9f v9fVar3 = this.f21678a;
            aVar.n = v9fVar3.b.f.i;
            aVar.o = A;
            long c2 = v9fVar3.c();
            if (0 != c2) {
                String str2 = HttpConstant.RANGE_PRE + c2 + "-";
                fs7.g("Downloader", "getConnection", "add request property range", str2);
                c.b(HttpConstant.RANGE, str2);
                this.b.e.d = true;
            } else {
                this.b.e.d = false;
            }
            try {
                c.connect();
                try {
                    int statusCode = c.getStatusCode();
                    if (this.f21678a.i(c.c(), statusCode)) {
                        return c;
                    }
                    if (statusCode == 416) {
                        this.f21678a.d.delete();
                    }
                    this.b.d.a(-12, statusCode, c.d()).b = true;
                    fs7.e("Downloader", "id: " + this.n + ", conn.isHttpStatusCodeOk error " + statusCode, new Object[0]);
                    return null;
                } catch (Exception e) {
                    fs7.d("Downloader", "id: " + this.n + ", conn.getstatuscode exception", e, new Object[0]);
                    this.b.d.a(-12, 204, c.d()).b = true;
                    return null;
                }
            } catch (IOException e2) {
                fs7.d("Downloader", "id: " + this.n + ", conn.conn exception", e2, new Object[0]);
                this.b.d.a(-12, 203, c.d()).b = true;
                return null;
            }
        } catch (IOException e3) {
            fs7.d("Downloader", "id: " + this.n + ", conn.open exception", e3, new Object[0]);
            this.b.d.a(-12, 202, c.d()).b = true;
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x046b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x048a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r8v4, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w() {
        /*
            Method dump skipped, instructions count: 1223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j07.w():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce A[Catch: IOException -> 0x009d, TryCatch #0 {IOException -> 0x009d, blocks: (B:8:0x004f, B:10:0x0094, B:17:0x00a1, B:19:0x00ce, B:21:0x00fb, B:23:0x0119, B:27:0x0146, B:29:0x0154, B:33:0x01be), top: B:37:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154 A[Catch: IOException -> 0x009d, TryCatch #0 {IOException -> 0x009d, blocks: (B:8:0x004f, B:10:0x0094, B:17:0x00a1, B:19:0x00ce, B:21:0x00fb, B:23:0x0119, B:27:0x0146, B:29:0x0154, B:33:0x01be), top: B:37:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j07.s(long, boolean):boolean");
    }
}
