package com.taobao.phenix.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bui;
import tb.dpe;
import tb.f7l;
import tb.t2o;
import tb.wd8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ImageStatistics {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BITMAP_DECODE = "decode";
    public static final String KEY_BITMAP_PROCESS = "bitmapProcess";
    public static final String KEY_BITMAP_SCALE = "scaleTime";
    public static final String KEY_DECODE_WAIT_SIZE = "decodeWaitSize";
    public static final String KEY_MASTER_WAIT_SIZE = "masterWaitSize";
    public static final String KEY_NETWORK_CONNECT = "connect";
    public static final String KEY_NETWORK_DOWNLOAD = "download";
    public static final String KEY_NETWORK_WAIT_SIZE = "networkWaitSize";
    public static final String KEY_READ_DISK_CACHE = "cacheLookup";
    public static final String KEY_READ_LOCAL_FILE = "localFile";
    public static final String KEY_READ_MEMORY_CACHE = "memoryLookup";
    public static final String KEY_SCHEDULE_TIME = "scheduleTime";
    public static final String KEY_TOTAL_TIME = "totalTime";
    public static final String KEY_WAIT_FOR_MAIN = "waitForMain";
    public long A;
    public long B;
    public boolean C;
    public long D;
    public long E;
    public long F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public Map<String, String> M;
    public Object N;
    public boolean O;
    public boolean P;
    public boolean Q;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11477a;
    public boolean b;
    public final dpe c;
    public FromType d;
    public bui e;
    public int f;
    public int g;
    public Map<String, String> h;
    public Map<String, Integer> i;
    public long j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public String s;
    public String t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum FromType {
        FROM_UNKNOWN(-1),
        FROM_NETWORK(0),
        FROM_MEMORY_CACHE(1),
        FROM_DISK_CACHE(2),
        FROM_LARGE_SCALE(3),
        FROM_LOCAL_FILE(4),
        FROM_FAST_DISK_CACHE(5);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int value;

        FromType(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(FromType fromType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/request/ImageStatistics$FromType");
        }

        public static FromType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FromType) ipChange.ipc$dispatch("b2cfa516", new Object[]{str});
            }
            return (FromType) Enum.valueOf(FromType.class, str);
        }
    }

    static {
        t2o.a(620757139);
    }

    public ImageStatistics(dpe dpeVar, boolean z) {
        this.d = FromType.FROM_UNKNOWN;
        this.C = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.P = false;
        this.Q = false;
        this.O = false;
        this.c = dpeVar;
        this.f11477a = z;
    }

    public void A(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fbf47f", new Object[]{this, buiVar});
        } else {
            this.e = buiVar;
        }
    }

    public void B(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def04e5e", new Object[]{this, map});
        } else {
            this.i = map;
        }
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("917e3f55", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void D(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba0699", new Object[]{this, map});
        } else {
            this.h = map;
        }
    }

    public void E(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a8c7c8", new Object[]{this, map});
        } else {
            this.M = map;
        }
    }

    public void F(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7102f5b", new Object[]{this, new Long(j)});
        } else {
            this.j = j;
        }
    }

    public void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7687a9b9", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e8e102", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void b(FromType fromType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56cce4a4", new Object[]{this, fromType});
        } else {
            this.d = fromType;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9c9ddbc", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("175ba837", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("366a8c0c", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public Map<String, Integer> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2d93fd30", new Object[]{this});
        }
        return this.i;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6aacba85", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d3bc37e", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a83baeed", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public Map<String, String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf016b95", new Object[]{this});
        }
        return this.h;
    }

    public bui k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bui) ipChange.ipc$dispatch("b5f9e25", new Object[]{this});
        }
        if (this.e == null) {
            this.e = wd8.h(this.c.j());
        }
        return this.e;
    }

    public FromType l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FromType) ipChange.ipc$dispatch("e92e74ce", new Object[]{this});
        }
        return this.d;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9668379", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85bb190a", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e79d2786", new Object[]{this});
        }
        return this.M;
    }

    public long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a082971", new Object[]{this})).longValue();
        }
        return this.j;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public dpe r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dpe) ipChange.ipc$dispatch("6db1f0ef", new Object[]{this});
        }
        return this.c;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a08f5c8e", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f40a2401", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ImageStatistics(FromType=" + this.d + ",BizId=" + this.t + ", isPreRequest=" + this.O + ", HighQuality=" + this.P + ", HeightScale=" + this.Q + ", Duplicated=" + this.b + ", Retrying=" + this.f11477a + ", Size=" + this.f + ", Format=" + this.e + ", DetailCost=" + this.i + ", decideUrlTime=" + this.F + f7l.BRACKET_END_STR;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43085e0f", new Object[]{this})).booleanValue();
        }
        return this.f11477a;
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cbf70a", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.n++;
        } else {
            this.o++;
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1faaf8ee", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.l++;
        } else {
            this.m++;
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba551222", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e06dc8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.p++;
        } else {
            this.r++;
        }
    }

    public void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c57d66", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public ImageStatistics(dpe dpeVar) {
        this(dpeVar, false);
    }
}
