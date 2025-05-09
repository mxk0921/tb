package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import com.taobao.alivfssdk.fresco.cache.common.CacheEventListener;
import com.taobao.alivfssdk.fresco.cache.disk.a;
import com.taobao.alivfssdk.fresco.cache.disk.b;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.StreamCorruptedException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.azi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vp extends hp implements CacheEventListener, CacheErrorLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30152a;
    public final com.taobao.alivfssdk.fresco.cache.disk.c b;
    public final np c;
    public final umh<ps2, byte[]> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "AVFSDiskCache #" + vp.w(vp.this).A();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends j6b<ps2, byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(vp vpVar, int i, float f) {
            super(i, f);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/cache/AVFSDiskCache$2");
        }

        /* renamed from: x */
        public int d(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c51c6b8", new Object[]{this, bArr})).intValue();
            }
            return bArr.length;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends BufferedInputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ps2 f30154a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InputStream inputStream, int i, ps2 ps2Var) {
            super(inputStream, i);
            this.f30154a = ps2Var;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -483678593) {
                super.close();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/cache/AVFSDiskCache$3");
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            vp.A(vp.this).put(this.f30154a, ((BufferedInputStream) this).buf);
            super.close();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e extends ObjectInputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ClassLoader f30157a;

        static {
            t2o.a(374341661);
        }

        public e(InputStream inputStream, ClassLoader classLoader) throws StreamCorruptedException, IOException {
            super(inputStream);
            this.f30157a = classLoader;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 1072899230) {
                return super.resolveClass((ObjectStreamClass) objArr[0]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/cache/AVFSDiskCache$ObjectInputStream");
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Class) ipChange.ipc$dispatch("3ff3249e", new Object[]{this, objectStreamClass});
            }
            try {
                return super.resolveClass(objectStreamClass);
            } catch (ClassNotFoundException unused) {
                return Class.forName(objectStreamClass.getName(), false, this.f30157a);
            }
        }
    }

    static {
        t2o.a(374341655);
        t2o.a(374341696);
        t2o.a(374341693);
    }

    public vp(np npVar, String str, com.taobao.alivfssdk.fresco.cache.disk.a aVar, b.c cVar, int i) {
        this.c = npVar;
        this.f30152a = str;
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(new a());
        if (newSingleThreadExecutor instanceof ThreadPoolExecutor) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newSingleThreadExecutor;
            threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        this.b = new com.taobao.alivfssdk.fresco.cache.disk.b(aVar, null, cVar, this, this, null, AVFSCacheManager.getInstance().getContext(), newSingleThreadExecutor);
        if (i > 0) {
            this.d = new b(this, i, 0.2f);
        }
    }

    public static /* synthetic */ umh A(vp vpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (umh) ipChange.ipc$dispatch("1a821e22", new Object[]{vpVar});
        }
        return vpVar.d;
    }

    public static /* synthetic */ Object ipc$super(vp vpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/cache/AVFSDiskCache");
    }

    public static /* synthetic */ np w(vp vpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np) ipChange.ipc$dispatch("42391342", new Object[]{vpVar});
        }
        return vpVar.c;
    }

    public void B0(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb598ed", new Object[]{this, aVar});
            return;
        }
        xp f = dp.h().f();
        if (f != null) {
            f.b(L("read").l(-2).m(((mfp) aVar).b().getMessage()).j());
        }
    }

    public boolean C(String str, String str2, int i) {
        ps2 ps2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ef37683", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (i == 268435456) {
            ps2Var = new y3k(str, str2);
        } else {
            ps2Var = new cpl(str, str2);
        }
        return ((com.taobao.alivfssdk.fresco.cache.disk.b) this.b).i0(ps2Var);
    }

    public void E0(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae47b58", new Object[]{this, aVar});
            return;
        }
        xp f = dp.h().f();
        if (f != null) {
            f.b(L("write").l(-2).m(((mfp) aVar).b().getMessage()).j());
        }
    }

    public List<String> F(String str, int i) {
        ps2 ps2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("29e59098", new Object[]{this, str, new Integer(i)});
        }
        if (i == 268435456) {
            ps2Var = new y3k(str, null);
        } else {
            ps2Var = new cpl(str, null);
        }
        System.currentTimeMillis();
        try {
            List<String> F = ((com.taobao.alivfssdk.fresco.cache.disk.b) this.b).F(ps2Var);
            System.currentTimeMillis();
            return F;
        } catch (Exception e2) {
            pp.d("AVFSCache", e2, new Object[0]);
            return null;
        }
    }

    @Override // tb.fdb
    public boolean G0(String str, String str2, Object obj, int i) {
        ps2 ps2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80aff7d9", new Object[]{this, str, str2, obj, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (obj == null) {
            return J0(str, str2);
        }
        if (i == 268435456) {
            ps2Var = new y3k(str, str2);
        } else {
            ps2Var = new cpl(str, str2);
        }
        try {
            ((com.taobao.alivfssdk.fresco.cache.disk.b) this.b).u0(ps2Var, new d(ps2Var, obj));
            return true;
        } catch (Exception e2) {
            pp.d("AVFSCache", e2, new Object[0]);
            return false;
        }
    }

    @Override // tb.fdb
    public <T> T I0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f86e3322", new Object[]{this, str, str2});
        }
        return (T) g0(str, str2, null);
    }

    @Override // tb.fdb
    public boolean J0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9daf8b8", new Object[]{this, str, str2})).booleanValue();
        }
        return M0(str, str2, 0);
    }

    @Override // tb.fdb
    public List<String> K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("67af1413", new Object[]{this, str});
        }
        return F(str, 0);
    }

    public azi.b L(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (azi.b) ipChange.ipc$dispatch("79478818", new Object[]{this, str});
        }
        String A = this.c.A();
        String str2 = this.f30152a;
        if (this.d == null) {
            z = false;
        }
        return azi.a(A, str2, z).o(str);
    }

    public void L0(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6810624", new Object[]{this, aVar});
            return;
        }
        xp f = dp.h().f();
        if (f != null) {
            f.b(L("write").k(((mfp) aVar).a()).j());
        }
    }

    public boolean M0(String str, String str2, int i) {
        ps2 ps2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("518490d3", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (i == 268435456) {
            ps2Var = new y3k(str, str2);
        } else {
            ps2Var = new cpl(str, str2);
        }
        umh<ps2, byte[]> umhVar = this.d;
        if (umhVar != null) {
            ((j6b) umhVar).o(ps2Var);
        }
        return ((com.taobao.alivfssdk.fresco.cache.disk.b) this.b).L0(ps2Var);
    }

    @Override // tb.fdb
    public boolean W(String str, String str2, InputStream inputStream, int i) {
        ps2 ps2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c28e6a7", new Object[]{this, str, str2, inputStream, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (i == 268435456) {
            ps2Var = new y3k(str, str2);
        } else {
            ps2Var = new cpl(str, str2);
        }
        try {
            System.currentTimeMillis();
            ((com.taobao.alivfssdk.fresco.cache.disk.b) this.b).u0(ps2Var, njx.a(inputStream));
            System.currentTimeMillis();
            return true;
        } catch (Exception e2) {
            pp.d("AVFSCache", e2, new Object[0]);
            return false;
        }
    }

    public InputStream Z(String str, String str2, int i) {
        ps2 ps2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("fcb7d5eb", new Object[]{this, str, str2, new Integer(i)});
        }
        if (str == null) {
            return null;
        }
        if (i == 268435456) {
            ps2Var = new y3k(str, str2);
        } else {
            ps2Var = new cpl(str, str2);
        }
        System.currentTimeMillis();
        try {
            sa2 Z = ((com.taobao.alivfssdk.fresco.cache.disk.b) this.b).Z(ps2Var);
            System.currentTimeMillis();
            if (Z != null) {
                pp.c("AVFSCache", "- inputStreamForKey: moduleName=" + this.c.A() + ", key1=" + str + ", key2=" + str2);
                return Z.a();
            }
        } catch (IOException e2) {
            pp.d("AVFSCache", e2, new Object[0]);
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger
    public void a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2989c7e", new Object[]{this, cacheErrorCategory, str, str2, th});
        } else {
            pp.d("AVFSCache", th, new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        v0();
        com.taobao.alivfssdk.fresco.cache.disk.c cVar = this.b;
        if (cVar != null) {
            ((com.taobao.alivfssdk.fresco.cache.disk.b) cVar).close();
        }
    }

    public boolean d(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ededb0d", new Object[]{this, aVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.fdb
    public long e0(String str, String str2) {
        sa2 Z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3af8116b", new Object[]{this, str, str2})).longValue();
        }
        if (str == null || (Z = ((com.taobao.alivfssdk.fresco.cache.disk.b) this.b).Z(new cpl(str, str2))) == null) {
            return -1L;
        }
        return Z.size();
    }

    public void f(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415754b3", new Object[]{this, aVar});
        }
    }

    @Override // tb.fdb
    public <T> T g0(String str, String str2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7efbc3a5", new Object[]{this, str, str2, cls});
        }
        return (T) c0(str, str2, cls, 0);
    }

    public void h(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd3ac4c", new Object[]{this, aVar});
        }
    }

    public void i(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68671027", new Object[]{this, aVar});
        }
    }

    @Override // tb.fdb
    public InputStream j0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("4c9d72fe", new Object[]{this, str, str2});
        }
        return Z(str, str2, 0);
    }

    public void k(com.taobao.alivfssdk.fresco.cache.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e819f29a", new Object[]{this, aVar});
        }
    }

    @Override // tb.fdb
    public Set<String> keySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        try {
            Collection<a.AbstractC0322a> K0 = ((com.taobao.alivfssdk.fresco.cache.disk.b) this.b).K0();
            HashSet hashSet = new HashSet(K0.size());
            for (a.AbstractC0322a aVar : K0) {
                hashSet.add(aVar.getId());
            }
            return hashSet;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void n0(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998add8c", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        xp f = dp.h().f();
        if (f != null) {
            f.a(this.c.A(), z);
        }
    }

    @Override // tb.fdb
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ac1ea7", new Object[]{this})).booleanValue();
        }
        umh<ps2, byte[]> umhVar = this.d;
        if (umhVar != null) {
            ((j6b) umhVar).b();
        }
        ((com.taobao.alivfssdk.fresco.cache.disk.b) this.b).clearAll();
        return true;
    }

    @Override // tb.fdb
    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cdba1", new Object[]{this});
            return;
        }
        umh<ps2, byte[]> umhVar = this.d;
        if (umhVar != null) {
            ((j6b) umhVar).b();
        }
    }

    @Override // tb.fdb
    public boolean y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75209d08", new Object[]{this, str, str2})).booleanValue();
        }
        return C(str, str2, 0);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements mjx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ps2 f30155a;
        public final /* synthetic */ Object b;

        public d(ps2 ps2Var, Object obj) {
            this.f30155a = ps2Var;
            this.b = obj;
        }

        @Override // tb.mjx
        public OutputStream a(OutputStream outputStream) throws IOException {
            ObjectOutputStream objectOutputStream;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OutputStream) ipChange.ipc$dispatch("e48a6df0", new Object[]{this, outputStream});
            }
            if (vp.A(vp.this) != null) {
                objectOutputStream = new ObjectOutputStream(new a(outputStream));
            } else {
                objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(outputStream));
            }
            objectOutputStream.writeObject(this.b);
            return objectOutputStream;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a extends BufferedOutputStream {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final ByteArrayOutputStream f30156a = new ByteArrayOutputStream();

            public a(OutputStream outputStream) {
                super(outputStream);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -683656483) {
                    super.write(((Number) objArr[0]).intValue());
                    return null;
                } else if (hashCode == -483678593) {
                    super.close();
                    return null;
                } else if (hashCode == 462729549) {
                    super.write((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/alivfssdk/cache/AVFSDiskCache$4$1");
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                    return;
                }
                vp.A(vp.this).put(d.this.f30155a, this.f30156a.toByteArray());
                super.close();
            }

            @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
            public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
                    return;
                }
                this.f30156a.write(bArr, i, i2);
                super.write(bArr, i, i2);
            }

            @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
            public synchronized void write(int i) throws IOException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
                    return;
                }
                this.f30156a.write(i);
                super.write(i);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0079: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:26:0x0079 */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168 A[Catch: all -> 0x0078, TryCatch #15 {all -> 0x0078, blocks: (B:24:0x0074, B:33:0x0086, B:35:0x0090, B:37:0x0098, B:47:0x00c0, B:53:0x00da, B:54:0x00de, B:55:0x00e2, B:57:0x00f4, B:62:0x010d, B:63:0x012f, B:65:0x0131, B:66:0x0154, B:73:0x015e, B:75:0x0168, B:76:0x0180, B:80:0x018c, B:82:0x0196, B:83:0x01b1), top: B:98:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0196 A[Catch: all -> 0x0078, TryCatch #15 {all -> 0x0078, blocks: (B:24:0x0074, B:33:0x0086, B:35:0x0090, B:37:0x0098, B:47:0x00c0, B:53:0x00da, B:54:0x00de, B:55:0x00e2, B:57:0x00f4, B:62:0x010d, B:63:0x012f, B:65:0x0131, B:66:0x0154, B:73:0x015e, B:75:0x0168, B:76:0x0180, B:80:0x018c, B:82:0x0196, B:83:0x01b1), top: B:98:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T c0(java.lang.String r17, java.lang.String r18, java.lang.Class<T> r19, int r20) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vp.c0(java.lang.String, java.lang.String, java.lang.Class, int):java.lang.Object");
    }
}
