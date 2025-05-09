package com.taobao.alivfssdk.fresco.cache.disk;

import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import com.taobao.alivfssdk.fresco.cache.disk.a;
import com.taobao.alivfssdk.fresco.common.file.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tb.cpl;
import tb.cpm;
import tb.de9;
import tb.ee9;
import tb.f7l;
import tb.gv4;
import tb.mjx;
import tb.ps2;
import tb.sa2;
import tb.t2o;
import tb.ub9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefaultDiskStorage implements com.taobao.alivfssdk.fresco.cache.disk.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long TEMP_FILE_LIFETIME_MS = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final File f6194a;
    public final boolean b;
    public final File c;
    public final CacheErrorLogger d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum FileType {
        CONTENT(".cnt"),
        TEMP(".tmp");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String extension;

        FileType(String str) {
            this.extension = str;
        }

        public static FileType fromExtension(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FileType) ipChange.ipc$dispatch("2441946b", new Object[]{str});
            }
            if (".cnt".equals(str)) {
                return CONTENT;
            }
            if (".tmp".equals(str)) {
                return TEMP;
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(FileType fileType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/fresco/cache/disk/DefaultDiskStorage$FileType");
        }

        public static FileType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FileType) ipChange.ipc$dispatch("4a150458", new Object[]{str});
            }
            return (FileType) Enum.valueOf(FileType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class IncompleteFileException extends IOException {
        public final long actual;
        public final long expected;

        static {
            t2o.a(374341716);
        }

        public IncompleteFileException(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
            this.expected = j;
            this.actual = j2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ee9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<a.AbstractC0322a> f6195a;

        static {
            t2o.a(374341712);
            t2o.a(374341740);
        }

        public b() {
            this.f6195a = new ArrayList();
        }

        public List<a.AbstractC0322a> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f2816c46", new Object[]{this});
            }
            return Collections.unmodifiableList(this.f6195a);
        }

        public void b(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faed9360", new Object[]{this, file});
            }
        }

        public void c(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e959e163", new Object[]{this, file});
            }
        }

        public void d(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f725c365", new Object[]{this, file});
                return;
            }
            d a2 = DefaultDiskStorage.a(DefaultDiskStorage.this, file);
            if (a2 != null && a2.f6197a == FileType.CONTENT) {
                ((ArrayList) this.f6195a).add(new c(a2.b, file));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements a.AbstractC0322a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6196a;
        public final ub9 b;
        public long c;
        public long d;

        static {
            t2o.a(374341713);
            t2o.a(374341724);
        }

        public ub9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ub9) ipChange.ipc$dispatch("93c64b4d", new Object[]{this});
            }
            return this.b;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.AbstractC0322a
        public String getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return this.f6196a;
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.AbstractC0322a
        public long getSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
            }
            if (this.c < 0) {
                this.c = this.b.size();
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
                this.d = this.b.c().lastModified();
            }
            return this.d;
        }

        public c(String str, File file) {
            cpm.a(file);
            this.f6196a = (String) cpm.a(str);
            this.b = ub9.b(file);
            this.c = -1L;
            this.d = -1L;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FileType f6197a;
        public final String b;
        public final String c;

        static {
            t2o.a(374341714);
        }

        public static d b(File file) {
            FileType fromExtension;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("4a9580b9", new Object[]{file});
            }
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            String str = null;
            if (lastIndexOf <= 0 || (fromExtension = FileType.fromExtension(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (fromExtension.equals(FileType.TEMP)) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            int lastIndexOf3 = substring.lastIndexOf(33);
            if (lastIndexOf3 > 0) {
                str = substring.substring(1 + lastIndexOf3);
                substring = substring.substring(0, lastIndexOf3);
            }
            return new d(fromExtension, substring, str);
        }

        public File a(File file) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("346f7603", new Object[]{this, file});
            }
            String str = this.b;
            if (!TextUtils.isEmpty(this.c)) {
                str = str + f7l.AND_NOT + this.c + ".";
            }
            return File.createTempFile(str, ".tmp", file);
        }

        public String c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2b7df4ef", new Object[]{this, str});
            }
            String str2 = str + File.separator + this.b;
            if (!TextUtils.isEmpty(this.c)) {
                str2 = str2 + f7l.AND_NOT + this.c;
            }
            return str2 + this.f6197a.extension;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.f6197a + f7l.BRACKET_START_STR + this.b + f7l.BRACKET_END_STR;
        }

        public d(FileType fileType, String str, ps2 ps2Var) {
            this.f6197a = fileType;
            this.b = str;
            if (!(ps2Var instanceof cpl) || TextUtils.isEmpty(((cpl) ps2Var).b)) {
                this.c = null;
                return;
            }
            try {
                this.c = Base64.encodeToString(((cpl) ps2Var).b.getBytes("UTF-8"), 11);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }

        public d(FileType fileType, String str, String str2) {
            this.f6197a = fileType;
            this.b = str;
            this.c = str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6198a;
        public final File b;

        static {
            t2o.a(374341717);
            t2o.a(374341725);
        }

        public e(String str, File file) {
            this.f6198a = str;
            this.b = file;
        }

        /* JADX WARN: Finally extract failed */
        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public void a(mjx mjxVar, ps2 ps2Var, Object obj) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f80a347", new Object[]{this, mjxVar, ps2Var, obj});
                return;
            }
            try {
                OutputStream fileOutputStream = new FileOutputStream(this.b);
                try {
                    gv4 gv4Var = new gv4(fileOutputStream);
                    fileOutputStream = mjxVar.a(gv4Var);
                    fileOutputStream.flush();
                    long e = gv4Var.e();
                    fileOutputStream.close();
                    if (this.b.length() != e) {
                        throw new IncompleteFileException(e, this.b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                DefaultDiskStorage.b(DefaultDiskStorage.this).a(CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, "DefaultDiskStorage", "updateResource", e2);
                throw e2;
            }
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public sa2 b(ps2 ps2Var, Object obj) throws IOException {
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sa2) ipChange.ipc$dispatch("110e0ba5", new Object[]{this, ps2Var, obj});
            }
            File e = DefaultDiskStorage.this.e(this.f6198a, ps2Var);
            try {
                FileUtils.b(this.b, e);
                if (e.exists()) {
                    e.setLastModified(System.currentTimeMillis());
                }
                return ub9.b(e);
            } catch (FileUtils.RenameException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof FileUtils.ParentDirNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                DefaultDiskStorage.b(DefaultDiskStorage.this).a(cacheErrorCategory, "DefaultDiskStorage", "commit", e2);
                throw e2;
            }
        }

        @Override // com.taobao.alivfssdk.fresco.cache.disk.a.b
        public boolean cleanUp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0f7d54f", new Object[]{this})).booleanValue();
            }
            if (!this.b.exists() || this.b.delete()) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(374341710);
        t2o.a(374341721);
    }

    public DefaultDiskStorage(File file, int i, CacheErrorLogger cacheErrorLogger) {
        cpm.a(file);
        this.f6194a = file;
        this.b = Z(file, cacheErrorLogger);
        this.c = new File(file, L(i));
        this.d = cacheErrorLogger;
        i0();
    }

    public static String L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1500fa5e", new Object[]{new Integer(i)});
        }
        return "v2.ols100." + i;
    }

    public static boolean Z(File file, CacheErrorLogger cacheErrorLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7994041", new Object[]{file, cacheErrorLogger})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ d a(DefaultDiskStorage defaultDiskStorage, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ab858e02", new Object[]{defaultDiskStorage, file});
        }
        return defaultDiskStorage.A(file);
    }

    public static /* synthetic */ CacheErrorLogger b(DefaultDiskStorage defaultDiskStorage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheErrorLogger) ipChange.ipc$dispatch("599e243e", new Object[]{defaultDiskStorage});
        }
        return defaultDiskStorage.d;
    }

    public final d A(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("8a41ed", new Object[]{this, file});
        }
        d b2 = d.b(file);
        if (b2 != null && C(b2.b).equals(file.getParentFile())) {
            return b2;
        }
        return null;
    }

    public final File C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9b81a899", new Object[]{this, str});
        }
        return new File(F(str));
    }

    public final String F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("174fffc7", new Object[]{this, str});
        }
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.c + File.separator + valueOf;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public void J() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1888e30", new Object[]{this});
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public a.b P(String str, ps2 ps2Var, Object obj) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("cf4e7517", new Object[]{this, str, ps2Var, obj});
        }
        d dVar = new d(FileType.TEMP, str, ps2Var);
        File C = C(str);
        if (!C.exists()) {
            c0(C, "insert");
        }
        try {
            return new e(str, dVar.a(C));
        } catch (IOException e2) {
            this.d.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, "DefaultDiskStorage", "insert", e2);
            throw e2;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public long Q(String str, ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57fbe968", new Object[]{this, str, ps2Var})).longValue();
        }
        return c(e(str, ps2Var));
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public boolean b0(String str, ps2 ps2Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e415d9", new Object[]{this, str, ps2Var, obj})).booleanValue();
        }
        return f0(str, ps2Var, false);
    }

    public final long c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b03f4e1", new Object[]{this, file})).longValue();
        }
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    public final void c0(File file, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e75e62c", new Object[]{this, file, str});
            return;
        }
        try {
            FileUtils.a(file);
        } catch (FileUtils.CreateDirectoryException e2) {
            this.d.a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, "DefaultDiskStorage", str, e2);
            throw e2;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public void clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
        } else {
            de9.a(this.f6194a);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    public File e(String str, ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("882bc2ff", new Object[]{this, str, ps2Var});
        }
        return new File(w(str, ps2Var));
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public List<String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9fc5f8a6", new Object[]{this, str});
        }
        File[] listFiles = C(str).listFiles();
        ArrayList arrayList = new ArrayList();
        if (listFiles != null) {
            for (File file : listFiles) {
                d b2 = d.b(file);
                if (b2 != null && b2.f6197a == FileType.CONTENT && str.equals(b2.b) && !TextUtils.isEmpty(b2.c)) {
                    try {
                        arrayList.add(new String(Base64.decode(b2.c, 11), "UTF-8"));
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean f0(String str, ps2 ps2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8417328", new Object[]{this, str, ps2Var, new Boolean(z)})).booleanValue();
        }
        File e2 = e(str, ps2Var);
        boolean exists = e2.exists();
        if (z && exists) {
            e2.setLastModified(System.currentTimeMillis());
        }
        return exists;
    }

    /* renamed from: g */
    public List<a.AbstractC0322a> K0() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f2816c46", new Object[]{this});
        }
        b bVar = new b();
        de9.c(this.c, bVar);
        return bVar.a();
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public sa2 h(String str, ps2 ps2Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sa2) ipChange.ipc$dispatch("ae327dee", new Object[]{this, str, ps2Var, obj});
        }
        File e2 = e(str, ps2Var);
        if (!e2.exists()) {
            return null;
        }
        e2.setLastModified(System.currentTimeMillis());
        return ub9.b(e2);
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa5052d", new Object[]{this});
        } else if (!this.f6194a.exists() || !this.c.exists()) {
            try {
                FileUtils.a(this.c);
            } catch (FileUtils.CreateDirectoryException unused) {
                CacheErrorLogger cacheErrorLogger = this.d;
                if (cacheErrorLogger != null) {
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
                    cacheErrorLogger.a(cacheErrorCategory, "DefaultDiskStorage", "version directory could not be created: " + this.c, null);
                }
            }
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
        return c(((c) aVar).a().c());
    }

    @Override // com.taobao.alivfssdk.fresco.cache.disk.a
    public String r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41a5289", new Object[]{this});
        }
        String absolutePath = this.f6194a.getAbsolutePath();
        return "_" + absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()) + "_" + absolutePath.hashCode();
    }

    public final String w(String str, ps2 ps2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd0abb65", new Object[]{this, str, ps2Var});
        }
        return new d(FileType.CONTENT, str, ps2Var).c(F(str));
    }
}
