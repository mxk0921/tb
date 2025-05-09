package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.fdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sdg implements fdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final char c = '-';
    private static final short d = 255;

    /* renamed from: a  reason: collision with root package name */
    private final LSDB f27970a;
    private final int b;

    static {
        t2o.a(374341681);
        t2o.a(374341667);
    }

    private sdg(LSDB lsdb, int i) {
        this.f27970a = lsdb;
        this.b = i;
    }

    public static sdg D0(String str, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sdg) ipChange.ipc$dispatch("1131f174", new Object[]{str, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        Config config = new Config();
        config.walSize = i;
        config.ignoreTTLBeforeCompact = z;
        return new sdg(LSDB.open(str, config), i2);
    }

    private String Z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4052eeba", new Object[]{this, str, str2});
        }
        return str + c + str2;
    }

    private String c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3121f6a", new Object[]{this, str});
        }
        return str + c;
    }

    private String f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f25c1f8b", new Object[]{this, str});
        }
        return str + "-~";
    }

    private String i0(String str) {
        String d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53cea3ad", new Object[]{this, str});
        }
        if (str.length() <= 255 || (d2 = doh.d(str)) == null || d2.length() == 0) {
            return str;
        }
        return d2;
    }

    private String w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca880a25", new Object[]{this, str});
        }
        return str.substring(str.lastIndexOf(45) + 1);
    }

    public void A(String str, InputStream inputStream, fdb.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d8ccc2", new Object[]{this, str, inputStream, mVar});
        }
    }

    @Override // tb.fdb
    public boolean A0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74a4956e", new Object[]{this, str})).booleanValue();
        }
        return this.f27970a.delete(new k3g(str));
    }

    public void B(String str, String str2, InputStream inputStream, int i, fdb.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b549e15", new Object[]{this, str, str2, inputStream, new Integer(i), lVar});
        }
    }

    public void C(String str, String str2, InputStream inputStream, fdb.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a64e52", new Object[]{this, str, str2, inputStream, lVar});
        }
    }

    @Override // tb.fdb
    public void D(String str, fdb.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b68535f", new Object[]{this, str, gVar});
        }
    }

    @Override // tb.fdb
    public void E(fdb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48e82c7", new Object[]{this, aVar});
        }
    }

    public boolean F(String str, InputStream inputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b2a109d", new Object[]{this, str, inputStream, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public boolean G0(String str, String str2, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80aff7d9", new Object[]{this, str, str2, obj, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public InputStream H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("e71a2c74", new Object[]{this, str});
        }
        byte[] binary = this.f27970a.getBinary(new k3g(i0(str)));
        if (binary != null) {
            return new ByteArrayInputStream(binary);
        }
        return null;
    }

    @Override // tb.fdb
    public <T> T I0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f86e3322", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // tb.fdb
    public boolean J0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9daf8b8", new Object[]{this, str, str2})).booleanValue();
        }
        return this.f27970a.delete(new k3g(Z(i0(str), str2)));
    }

    @Override // tb.fdb
    public List<String> K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("67af1413", new Object[]{this, str});
        }
        jpf<k3g> keyIterator = this.f27970a.keyIterator(new k3g(c0(i0(str))), new k3g(f0(i0(str))));
        if (keyIterator == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            k3g next = keyIterator.next();
            if (next == null) {
                return arrayList;
            }
            arrayList.add(w(next.a()));
        }
    }

    @Override // tb.fdb
    public boolean N(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b32aefa8", new Object[]{this, str, obj})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public <T> T O(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ad6d1db", new Object[]{this, str, cls});
        }
        return null;
    }

    @Override // tb.fdb
    public boolean T(String str, String str2, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b92a9864", new Object[]{this, str, str2, inputStream})).booleanValue();
        }
        return this.f27970a.insertStream(new k3g(Z(i0(str), str2)), this.b, inputStream);
    }

    @Override // tb.fdb
    public long U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c068e1", new Object[]{this, str})).longValue();
        }
        return this.f27970a.getDataSize(new k3g(i0(str)));
    }

    @Override // tb.fdb
    public boolean V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ec1adbe", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public boolean W(String str, String str2, InputStream inputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c28e6a7", new Object[]{this, str, str2, inputStream, new Integer(i)})).booleanValue();
        }
        return false;
    }

    public void a(String str, fdb.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d14580", new Object[]{this, str, cVar});
        }
    }

    public void b(String str, String str2, fdb.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a88668", new Object[]{this, str, str2, bVar});
        }
    }

    public boolean c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9747c8d", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    public boolean d(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ef37683", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public <T> T d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ac08da2c", new Object[]{this, str});
        }
        return null;
    }

    public InputStream e(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("fcb7d5eb", new Object[]{this, str, str2, new Integer(i)});
        }
        return null;
    }

    @Override // tb.fdb
    public long e0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3af8116b", new Object[]{this, str, str2})).longValue();
        }
        return this.f27970a.getDataSize(new k3g(Z(i0(str), str2)));
    }

    public void f(String str, fdb.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06f44a7", new Object[]{this, str, kVar});
        }
    }

    public List<String> g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("29e59098", new Object[]{this, str, new Integer(i)});
        }
        return new ArrayList();
    }

    @Override // tb.fdb
    public <T> T g0(String str, String str2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7efbc3a5", new Object[]{this, str, str2, cls});
        }
        return null;
    }

    public void h(String str, String str2, fdb.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e11ebe1", new Object[]{this, str, str2, jVar});
        }
    }

    public long i(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("240a9060", new Object[]{this, str, str2, new Integer(i)})).longValue();
        }
        return 0L;
    }

    @Override // tb.fdb
    public boolean j(String str, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("250157ae", new Object[]{this, str, inputStream})).booleanValue();
        }
        return this.f27970a.insertStream(new k3g(i0(str)), this.b, inputStream);
    }

    @Override // tb.fdb
    public InputStream j0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("4c9d72fe", new Object[]{this, str, str2});
        }
        byte[] binary = this.f27970a.getBinary(new k3g(Z(i0(str), str2)));
        if (binary != null) {
            return new ByteArrayInputStream(binary);
        }
        return null;
    }

    public <T> T k(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("896746d5", new Object[]{this, str, new Integer(i)});
        }
        return null;
    }

    @Override // tb.fdb
    public Set<String> keySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        jpf<k3g> keyIterator = this.f27970a.keyIterator();
        HashSet hashSet = new HashSet();
        if (keyIterator != null) {
            while (true) {
                k3g next = keyIterator.next();
                if (next == null) {
                    break;
                }
                hashSet.add(next.a());
            }
        }
        return hashSet;
    }

    public <T> T l(String str, String str2, Class<T> cls, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("14d18c7c", new Object[]{this, str, str2, cls, new Integer(i)});
        }
        return null;
    }

    public <T> void m(String str, Class<T> cls, fdb.e<T> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fcdb420", new Object[]{this, str, cls, eVar});
        }
    }

    @Override // tb.fdb
    public void m0(String str, Object obj, fdb.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cbca07", new Object[]{this, str, obj, iVar});
        }
    }

    public <T> void n(String str, String str2, Class<T> cls, fdb.d<T> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94fe8af4", new Object[]{this, str, str2, cls, dVar});
        }
    }

    public void o(String str, String str2, fdb.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa329b15", new Object[]{this, str, str2, fVar});
        }
    }

    public boolean p(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fee8add", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        return false;
    }

    public boolean q(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("518490d3", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        return false;
    }

    public void r(String str, Object obj, int i, fdb.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ae20ec", new Object[]{this, str, obj, new Integer(i), iVar});
        }
    }

    @Override // tb.fdb
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ac1ea7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void t(String str, String str2, Object obj, int i, fdb.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11365ea8", new Object[]{this, str, str2, obj, new Integer(i), hVar});
        }
    }

    public void u(String str, String str2, Object obj, fdb.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1372c41", new Object[]{this, str, str2, obj, hVar});
        }
    }

    public boolean v(String str, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b23377e3", new Object[]{this, str, obj, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cdba1", new Object[]{this});
        }
    }

    public boolean x(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77c398f2", new Object[]{this, str, str2, obj})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public boolean y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75209d08", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    public void z(String str, InputStream inputStream, int i, fdb.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e67f273", new Object[]{this, str, inputStream, new Integer(i), mVar});
        }
    }
}
