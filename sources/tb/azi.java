package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class azi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_FILE = "file";
    public static final String CACHE_MMAP = "mmap";
    public static final String CACHE_SQL = "sql";
    public static final String OPERATION_READ = "read";
    public static final String OPERATION_WRITE = "write";
    public static final String RESOURCE_OBJECT = "object";
    public static final String RESOURCE_STREAM = "stream";

    /* renamed from: a  reason: collision with root package name */
    public final String f16090a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final long h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f16091a;
        public final String b;
        public String c;
        public int d;
        public String e;
        public final boolean f;
        public boolean g;
        public long h;

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a4ee3c8b", new Object[]{bVar});
            }
            return bVar.f16091a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e70569ea", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ Exception c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Exception) ipChange.ipc$dispatch("45a3b06d", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6b33c4a8", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ int e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8eacbac", new Object[]{bVar})).intValue();
            }
            return bVar.d;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef621f66", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ boolean g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2a56653f", new Object[]{bVar})).booleanValue();
            }
            return bVar.f;
        }

        public static /* synthetic */ boolean h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b0c3200", new Object[]{bVar})).booleanValue();
            }
            return bVar.g;
        }

        public static /* synthetic */ long i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4bc1feb1", new Object[]{bVar})).longValue();
            }
            return bVar.h;
        }

        public azi j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (azi) ipChange.ipc$dispatch("fb142eb6", new Object[]{this});
            }
            return new azi(this);
        }

        public b k(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d1393fa1", new Object[]{this, new Long(j)});
            }
            this.h = j;
            return this;
        }

        public b l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("aeec160d", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("803199a4", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("429727fb", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public b o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("90d80a1c", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b(String str, String str2, boolean z) {
            this.f16091a = str;
            this.b = str2;
            this.f = z;
        }
    }

    public static b a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1e295876", new Object[]{str, str2, new Boolean(z)});
        }
        return new b(str, str2, z);
    }

    public azi(b bVar) {
        this.f16090a = b.a(bVar);
        this.b = b.b(bVar);
        b.c(bVar);
        this.c = b.d(bVar);
        this.d = b.e(bVar);
        this.e = b.f(bVar);
        this.f = b.g(bVar);
        this.g = b.h(bVar);
        this.h = b.i(bVar);
    }
}
