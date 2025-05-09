package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import com.taobao.alivfssdk.fresco.cache.disk.a;
import com.taobao.alivfssdk.fresco.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.zp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uno implements com.taobao.alivfssdk.fresco.cache.disk.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f29515a;
    public final boolean b;
    public final boolean c;
    public final File d;
    public final CacheErrorLogger e;
    public up f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements a.AbstractC0322a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f29516a;
        public final zp b;
        public long c;
        public long d;

        static {
            t2o.a(374341688);
            t2o.a(374341724);
        }

        public zp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zp) ipChange.ipc$dispatch("eb847172", new Object[]{this});
            }
            return this.b;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.AbstractC0322a
        public String getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return this.f29516a;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.AbstractC0322a
        public long getSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
            }
            if (this.c < 0) {
                this.c = this.b.d;
            }
            return this.c;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.AbstractC0322a
        public long getTimestamp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
            }
            if (this.d < 0) {
                this.d = this.b.e;
            }
            return this.d;
        }

        public b(String str, zp zpVar) {
            cpm.a(zpVar);
            this.f29516a = (String) cpm.a(str);
            this.b = zpVar;
            this.c = -1L;
            this.d = -1L;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final zp f29517a;

        static {
            t2o.a(374341689);
            t2o.a(374341725);
        }

        public c(String str, ps2 ps2Var) {
            this.f29517a = new zp(str, ps2Var);
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public void a(mjx mjxVar, ps2 ps2Var, Object obj) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f80a347", new Object[]{this, mjxVar, ps2Var, obj});
                return;
            }
            zp zpVar = this.f29517a;
            zpVar.getClass();
            OutputStream aVar = new zp.a();
            try {
                aVar = mjxVar.a(aVar);
                aVar.flush();
            } finally {
                aVar.close();
            }
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public sa2 b(ps2 ps2Var, Object obj) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sa2) ipChange.ipc$dispatch("110e0ba5", new Object[]{this, ps2Var, obj});
            }
            this.f29517a.e = System.currentTimeMillis();
            this.f29517a.j(uno.this.g());
            return new dp2(this.f29517a.c);
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public boolean cleanUp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0f7d54f", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(374341686);
        t2o.a(374341721);
    }

    public uno(File file, int i, boolean z, CacheErrorLogger cacheErrorLogger) {
        cpm.a(file);
        this.f29515a = file;
        this.c = z;
        this.b = c(file, cacheErrorLogger);
        this.d = new File(file, w(i));
        this.e = cacheErrorLogger;
        L();
    }

    public static boolean c(File file, CacheErrorLogger cacheErrorLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7994041", new Object[]{file, cacheErrorLogger})).booleanValue();
        }
        return false;
    }

    public static String w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1500fa5e", new Object[]{new Integer(i)});
        }
        return "v2.sqlite." + i;
    }

    public final void C(File file, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e75e62c", new Object[]{this, file, str});
            return;
        }
        try {
            FileUtils.a(file);
        } catch (FileUtils.CreateDirectoryException e) {
            this.e.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, "SQLiteDefaultDiskStorage", str, e);
            throw e;
        }
    }

    public final boolean F(String str, ps2 ps2Var, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8417328", new Object[]{this, str, ps2Var, new Boolean(z)})).booleanValue();
        }
        zp b2 = b(str, ps2Var);
        if (b2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            try {
                b2.k(g(), System.currentTimeMillis());
            } catch (IOException e) {
                pp.e("SQLiteDefaultDiskStorage", e.getMessage(), e);
            }
        }
        return z2;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public void J() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1888e30", new Object[]{this});
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa5052d", new Object[]{this});
            return;
        }
        if (this.f29515a.exists()) {
            if (!this.d.exists()) {
                de9.b(this.f29515a);
            } else {
                return;
            }
        }
        try {
            FileUtils.a(this.d);
        } catch (FileUtils.CreateDirectoryException unused) {
            CacheErrorLogger cacheErrorLogger = this.e;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
            cacheErrorLogger.a(cacheErrorCategory, "SQLiteDefaultDiskStorage", "version directory could not be created: " + this.d, null);
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public a.b P(String str, ps2 ps2Var, Object obj) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("cf4e7517", new Object[]{this, str, ps2Var, obj});
        }
        return new c(str, ps2Var);
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public long Q(String str, ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57fbe968", new Object[]{this, str, ps2Var})).longValue();
        }
        return a(new zp(str, ps2Var));
    }

    public final long a(zp zpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f06cee8c", new Object[]{this, zpVar})).longValue();
        }
        try {
            if (zpVar.b(g())) {
                return zpVar.d;
            }
            return -1L;
        } catch (IOException e) {
            pp.e("SQLiteDefaultDiskStorage", e.getMessage(), e);
            return -1L;
        }
    }

    public zp b(String str, ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zp) ipChange.ipc$dispatch("365e4377", new Object[]{this, str, ps2Var});
        }
        try {
            return zp.f(g(), str, ps2Var);
        } catch (IOException e) {
            pp.e("SQLiteDefaultDiskStorage", e.getMessage(), e);
            return null;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public boolean b0(String str, ps2 ps2Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e415d9", new Object[]{this, str, ps2Var, obj})).booleanValue();
        }
        return F(str, ps2Var, false);
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public void clearAll() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
        } else {
            zp.c(g());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        up upVar = this.f;
        if (upVar != null) {
            upVar.a();
            this.f = null;
        }
    }

    /* renamed from: e */
    public List<a.AbstractC0322a> K0() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f2816c46", new Object[]{this});
        }
        zp[] g = zp.g(g());
        zp[] g2 = zp.g(g());
        ArrayList arrayList = new ArrayList();
        for (zp zpVar : g) {
            arrayList.add(new b(zpVar.f32916a, zpVar));
        }
        for (zp zpVar2 : g2) {
            arrayList.add(new b(zpVar2.f32916a, zpVar2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public List<String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9fc5f8a6", new Object[]{this, str});
        }
        try {
            return zp.d(g(), str);
        } catch (IOException e) {
            pp.e("SQLiteDefaultDiskStorage", e.getMessage(), e);
            return null;
        }
    }

    public up g() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (up) ipChange.ipc$dispatch("5472c016", new Object[]{this});
        }
        if (this.f == null) {
            if (!this.d.exists()) {
                C(this.d, "getDataBase");
            }
            if (this.c) {
                String absolutePath = new File(this.d, "alivfs_encrypt.sqlite").getAbsolutePath();
                try {
                    String replace = r0().replace('-', '_');
                    tp g = dp.h().g();
                    this.f = g.b(absolutePath, replace + "_Encrypt", 1);
                } catch (Exception e) {
                    throw new IOException(e);
                }
            } else {
                try {
                    this.f = dp.h().g().a(new File(this.d, "alivfs.sqlite").getAbsolutePath(), 1);
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            }
            zp.a(this.f);
        }
        return this.f;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public sa2 h(String str, ps2 ps2Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sa2) ipChange.ipc$dispatch("ae327dee", new Object[]{this, str, ps2Var, obj});
        }
        try {
            zp f = zp.f(g(), str, ps2Var);
            if (f == null || f.c == null) {
                return null;
            }
            return new dp2(f.c);
        } catch (IOException e) {
            pp.e("SQLiteDefaultDiskStorage", e.getMessage(), e);
            return null;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public boolean isExternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff0fd20", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public long k(a.AbstractC0322a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f033e78b", new Object[]{this, aVar})).longValue();
        }
        return a(((b) aVar).a());
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public String r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41a5289", new Object[]{this});
        }
        String absolutePath = this.f29515a.getAbsolutePath();
        return "_" + absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()) + "_" + absolutePath.hashCode();
    }
}
