package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public boolean f23523a;
    public long b;
    public long c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(106954780);
        }

        public a() {
        }

        public final void a(ZipFile zipFile) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88cf9c02", new Object[]{this, zipFile});
            } else if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final lqx b(String str) throws Exception {
            Throwable th;
            ZipFile zipFile;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lqx) ipChange.ipc$dispatch("2150ef14", new Object[]{this, str});
            }
            ZipFile zipFile2 = null;
            try {
                try {
                    zipFile = new ZipFile(str);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                lqx lqxVar = new lqx(null);
                lqxVar.g(str);
                lqxVar.i(true);
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    ckf.f(zipEntry, "zipEntry");
                    String name = zipEntry.getName();
                    if (!lqxVar.b()) {
                        ckf.f(name, "name");
                        if (!tsq.I(name, "../", false, 2, null) && !tsq.w(name, "/..", false, 2, null) && !wsq.O(name, "/../", false, 2, null)) {
                        }
                        lqxVar.f(true);
                    }
                    lqxVar.h(lqxVar.c() + zipEntry.getSize());
                    lqxVar.e(lqxVar.a() + zipEntry.getCompressedSize());
                }
                a(zipFile);
                return lqxVar;
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable th3) {
                th = th3;
                zipFile2 = zipFile;
                a(zipFile2);
                throw th;
            }
        }
    }

    static {
        t2o.a(106954779);
    }

    public lqx() {
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f47fd893", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33d2ef6a", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88f282be", new Object[]{this})).booleanValue();
        }
        return this.f23523a;
    }

    public final void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c07179", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364a663a", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600486f8", new Object[]{this, str});
        }
    }

    public final void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7687ad7a", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fb2292", new Object[]{this, new Boolean(z)});
        } else {
            this.f23523a = z;
        }
    }

    public /* synthetic */ lqx(a07 a07Var) {
        this();
    }
}
