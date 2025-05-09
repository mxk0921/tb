package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.ImageStatistics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n1m implements mzm<com.taobao.phenix.request.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final s8d<dki> f24446a;
    public final mke b;
    public final com.taobao.phenix.request.a c;
    public buo d;
    public huo e;
    public final Map<String, Long> f = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends buo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(int i, kk4 kk4Var, yto ytoVar) {
            super(i, kk4Var, ytoVar);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/chain/PhenixProduceListener$1");
        }

        @Override // tb.buo
        public void t(kk4 kk4Var, yto ytoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c143d0b4", new Object[]{this, kk4Var, ytoVar});
                return;
            }
            dki dkiVar = new dki(n1m.c(n1m.this).Q());
            dkiVar.setUrl(n1m.c(n1m.this).O());
            n1m.d(n1m.this).onHappen(dkiVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f24447a;
        public final ImageStatistics.FromType b;

        static {
            t2o.a(620757072);
        }

        public b(String str, ImageStatistics.FromType fromType) {
            this.f24447a = str;
            this.b = fromType;
        }
    }

    static {
        t2o.a(620757070);
    }

    public n1m(com.taobao.phenix.request.a aVar, s8d<dki> s8dVar, mke mkeVar) {
        this.f24446a = s8dVar;
        this.c = aVar;
        this.b = mkeVar;
    }

    public static /* synthetic */ com.taobao.phenix.request.a c(n1m n1mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.phenix.request.a) ipChange.ipc$dispatch("941b2545", new Object[]{n1mVar});
        }
        return n1mVar.c;
    }

    public static /* synthetic */ s8d d(n1m n1mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8d) ipChange.ipc$dispatch("980bc87a", new Object[]{n1mVar});
        }
        return n1mVar.f24446a;
    }

    public final void e(Class cls, boolean z, boolean z2) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9036151c", new Object[]{this, cls, new Boolean(z), new Boolean(z2)});
        } else if (this.f24446a != null && !z && !z2 && cls == pki.class) {
            if (!s0m.B().G() || jjo.b() || this.c.U() == -1 || TextUtils.isEmpty(this.c.V())) {
                z3 = false;
            } else {
                fiv.q("Phenix", "callMemMissListenerIfNeed", this.c, true);
            }
            huo huoVar = this.e;
            if (huoVar == null || ((huoVar.f() && jjo.b()) || z3)) {
                this.f24446a.onHappen(new dki(this.c.Q()));
                return;
            }
            if (this.d == null) {
                this.d = new a(3, null, null);
            }
            this.e.a(this.d);
        }
    }

    public final b f(Class cls, boolean z) {
        String str;
        ImageStatistics.FromType fromType;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a8c971ef", new Object[]{this, cls, new Boolean(z)});
        }
        if (cls == pki.class) {
            return new b(ImageStatistics.KEY_READ_MEMORY_CACHE, ImageStatistics.FromType.FROM_MEMORY_CACHE);
        }
        if (cls == j8h.class) {
            return new b(ImageStatistics.KEY_READ_LOCAL_FILE, ImageStatistics.FromType.FROM_LOCAL_FILE);
        }
        if (cls == dq7.class) {
            return new b(ImageStatistics.KEY_READ_DISK_CACHE, ImageStatistics.FromType.FROM_DISK_CACHE);
        }
        if (cls == ntj.class) {
            if (z) {
                str2 = "download";
            } else {
                str2 = "connect";
            }
            return new b(str2, ImageStatistics.FromType.FROM_NETWORK);
        } else if (cls == zc2.class) {
            if (z) {
                str = ImageStatistics.KEY_BITMAP_PROCESS;
            } else {
                str = ImageStatistics.KEY_BITMAP_SCALE;
            }
            if (z) {
                fromType = ImageStatistics.FromType.FROM_UNKNOWN;
            } else {
                fromType = ImageStatistics.FromType.FROM_LARGE_SCALE;
            }
            return new b(str, fromType);
        } else if (cls == com.taobao.phenix.decode.a.class) {
            return new b("decode", ImageStatistics.FromType.FROM_UNKNOWN);
        } else {
            return null;
        }
    }

    public Map<String, Long> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a6c008c7", new Object[]{this});
        }
        return this.f;
    }

    /* renamed from: h */
    public void a(com.taobao.phenix.request.a aVar, Class cls, boolean z, boolean z2) {
        b f;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4e6be9", new Object[]{this, aVar, cls, new Boolean(z), new Boolean(z2)});
        } else if ((!z || z2) && (f = f(cls, z)) != null && (str = f.f24447a) != null) {
            ((ConcurrentHashMap) this.f).put(str, Long.valueOf(0 - System.currentTimeMillis()));
            mke mkeVar = this.b;
            if (mkeVar != null && cls == com.taobao.phenix.decode.a.class) {
                mkeVar.a(aVar.d(), aVar.O());
            }
        }
    }

    /* renamed from: i */
    public void b(com.taobao.phenix.request.a aVar, Class cls, boolean z, boolean z2, boolean z3) {
        b f;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb68733e", new Object[]{this, aVar, cls, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        e(cls, z, z2);
        if ((!z || z3) && (f = f(cls, z)) != null && (str = f.f24447a) != null) {
            Long l = (Long) ((ConcurrentHashMap) this.f).get(str);
            if (l != null && l.longValue() < 0) {
                ((ConcurrentHashMap) this.f).put(f.f24447a, Long.valueOf(currentTimeMillis + l.longValue()));
            }
            if (z2 && f.b != ImageStatistics.FromType.FROM_UNKNOWN) {
                this.c.Y().b(f.b);
            }
            mke mkeVar = this.b;
            if (mkeVar != null && cls == com.taobao.phenix.decode.a.class) {
                mkeVar.b(aVar.d(), aVar.O());
            }
        }
    }

    public void j(huo huoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d6cc50", new Object[]{this, huoVar});
        } else {
            this.e = huoVar;
        }
    }
}
