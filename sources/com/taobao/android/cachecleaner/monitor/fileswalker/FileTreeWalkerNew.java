package com.taobao.android.cachecleaner.monitor.fileswalker;

import androidx.core.util.Pools;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import tb.ge9;
import tb.hh9;
import tb.le9;
import tb.me9;
import tb.pe9;
import tb.qe9;
import tb.rt2;
import tb.t2o;
import tb.we9;
import tb.ze9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FileTreeWalkerNew implements Closeable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_TYPE_END_DIRECTORY = 2;
    public static final int EVENT_TYPE_ENTRY = 3;
    public static final int EVENT_TYPE_START_DIRECTORY = 1;
    public static final int VISIT_RESULT_CONTINUE = 0;
    public static final int VISIT_RESULT_SKIP_SIBLINGS = 3;
    public static final int VISIT_RESULT_SKIP_SUBTREE = 2;
    public static final int VISIT_RESULT_TERMINATE = 1;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6497a;
    public final LinkOption[] b;
    public final int c;
    public final ArrayDeque<b> d = new ArrayDeque<>();
    public final c e = new c();
    public final Pools.SimplePool<b> f;
    public boolean g;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface VisitResult {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$java$nio$file$FileVisitOption;

        static {
            FileVisitOption[] values;
            FileVisitOption fileVisitOption;
            int ordinal;
            values = FileVisitOption.values();
            int[] iArr = new int[values.length];
            $SwitchMap$java$nio$file$FileVisitOption = iArr;
            try {
                fileVisitOption = FileVisitOption.FOLLOW_LINKS;
                ordinal = fileVisitOption.ordinal();
                iArr[ordinal] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6499a;
        public Path b;
        public BasicFileAttributes c;
        public long d;
        public IOException e;

        static {
            t2o.a(737149045);
        }

        public BasicFileAttributes a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return le9.a(ipChange.ipc$dispatch("ed9bc42c", new Object[]{this}));
            }
            return this.c;
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("983287a9", new Object[]{this})).longValue();
            }
            return this.d;
        }

        public Path c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ge9.a(ipChange.ipc$dispatch("6e740812", new Object[]{this}));
            }
            return this.b;
        }

        public IOException d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IOException) ipChange.ipc$dispatch("430096fb", new Object[]{this});
            }
            return this.e;
        }

        public void e(int i, Path path, BasicFileAttributes basicFileAttributes, long j, IOException iOException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ca3f002", new Object[]{this, new Integer(i), path, basicFileAttributes, new Long(j), iOException});
                return;
            }
            this.f6499a = i;
            this.b = path;
            this.c = basicFileAttributes;
            this.d = j;
            this.e = iOException;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
            }
            return this.f6499a;
        }
    }

    static {
        t2o.a(737149042);
    }

    public FileTreeWalkerNew(Collection<FileVisitOption> collection, int i) {
        LinkOption[] linkOptionArr;
        LinkOption linkOption;
        int ordinal;
        boolean z = false;
        for (FileVisitOption fileVisitOption : collection) {
            FileVisitOption a2 = we9.a(fileVisitOption);
            int[] iArr = a.$SwitchMap$java$nio$file$FileVisitOption;
            ordinal = a2.ordinal();
            if (iArr[ordinal] == 1) {
                z = true;
            } else {
                throw new AssertionError("Should not get here");
            }
        }
        if (i >= 0) {
            this.f6497a = z;
            if (z) {
                linkOptionArr = new LinkOption[0];
            } else {
                linkOption = LinkOption.NOFOLLOW_LINKS;
                linkOptionArr = new LinkOption[]{linkOption};
            }
            this.b = linkOptionArr;
            this.c = i;
            this.f = new Pools.SimplePool<>(i + 1);
            return;
        }
        throw new IllegalArgumentException("'maxDepth' is negative");
    }

    public static Path c0(Path path, Set<FileVisitOption> set, int i, hh9<? super Path> hh9Var) throws IOException {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ge9.a(ipChange.ipc$dispatch("ab36cea6", new Object[]{path, set, new Integer(i), hh9Var}));
        }
        FileTreeWalkerNew fileTreeWalkerNew = new FileTreeWalkerNew(set, i);
        try {
            c Z = fileTreeWalkerNew.Z(path);
            do {
                int f = Z.f();
                if (f == 1) {
                    i2 = ((rt2.a) hh9Var).c(Z.c(), Z.a());
                    if (i2 == 2 || i2 == 3) {
                        fileTreeWalkerNew.A();
                    }
                } else if (f == 2) {
                    i2 = ((rt2.a) hh9Var).a(Z.c(), Z.a(), Z.b(), Z.d());
                    if (i2 == 3) {
                        i2 = 0;
                    }
                } else if (f == 3) {
                    IOException d = Z.d();
                    i2 = d == null ? ((rt2.a) hh9Var).e(Z.c(), Z.a()) : ((rt2.a) hh9Var).g(Z.c(), d);
                } else {
                    throw new AssertionError("Should not get here");
                }
                if (i2 != 0) {
                    if (i2 == 1) {
                        break;
                    } else if (i2 == 3) {
                        fileTreeWalkerNew.F();
                    }
                }
                Z = fileTreeWalkerNew.e();
            } while (Z != null);
            fileTreeWalkerNew.close();
            return path;
        } finally {
            try {
                throw th;
            } catch (Throwable th) {
            }
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e863a658", new Object[]{this});
        } else if (!this.d.isEmpty()) {
            b pop = this.d.pop();
            try {
                pop.j().close();
            } catch (IOException unused) {
            }
            C(pop);
        }
    }

    public final void C(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addd0f09", new Object[]{this, bVar});
            return;
        }
        bVar.g(null, null, null);
        this.f.release(bVar);
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711b6cf", new Object[]{this});
        } else if (!this.d.isEmpty()) {
            this.d.peek().h();
        }
    }

    public final c L(Path path, boolean z) {
        boolean isDirectory;
        long size;
        DirectoryStream<Path> newDirectoryStream;
        Object fileKey;
        String path2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7eb8710d", new Object[]{this, path, new Boolean(z)});
        }
        try {
            BasicFileAttributes a2 = a(path);
            int size2 = this.d.size();
            isDirectory = a2.isDirectory();
            if (size2 >= this.c || !isDirectory) {
                if (!isDirectory && !this.d.isEmpty()) {
                    size = a2.size();
                    this.d.peek().f(size);
                }
                return g(3, path, a2, 0L, null);
            }
            if (this.f6497a) {
                fileKey = a2.fileKey();
                if (f0(path, fileKey)) {
                    qe9.a();
                    path2 = path.toString();
                    return g(3, path, null, 0L, pe9.a(path2));
                }
            }
            try {
                newDirectoryStream = Files.newDirectoryStream(path);
                this.d.push(w(path, a2, newDirectoryStream));
                return g(1, path, a2, 0L, null);
            } catch (IOException e) {
                return g(3, path, null, 0L, e);
            } catch (SecurityException e2) {
                if (z) {
                    return null;
                }
                throw e2;
            }
        } catch (IOException e3) {
            return g(3, path, null, 0L, e3);
        } catch (SecurityException e4) {
            if (z) {
                return null;
            }
            throw e4;
        }
    }

    public c Z(Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b3c4fa79", new Object[]{this, path});
        }
        if (!this.g) {
            return L(path, false);
        }
        throw new IllegalStateException("Closed");
    }

    public final BasicFileAttributes a(Path path) throws IOException {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        BasicFileAttributes readAttributes2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return le9.a(ipChange.ipc$dispatch("46e72541", new Object[]{this, path}));
        }
        try {
            readAttributes2 = Files.readAttributes(path, me9.a(), this.b);
            return readAttributes2;
        } catch (IOException e) {
            if (this.f6497a) {
                Class a2 = me9.a();
                linkOption = LinkOption.NOFOLLOW_LINKS;
                readAttributes = Files.readAttributes(path, a2, linkOption);
                return readAttributes;
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (!this.g) {
            while (!this.d.isEmpty()) {
                A();
            }
            this.g = true;
        }
    }

    public c e() {
        IOException iOException;
        Path path;
        IOException iOException2;
        c L;
        IOException cause;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("392db484", new Object[]{this});
        }
        b peek = this.d.peek();
        if (peek == null) {
            return null;
        }
        do {
            if (!peek.i()) {
                Iterator<Path> d = peek.d();
                try {
                    if (d.hasNext()) {
                        path = ge9.a(d.next());
                    } else {
                        path = null;
                    }
                    iOException = null;
                } catch (DirectoryIteratorException e) {
                    cause = e.getCause();
                    iOException = cause;
                    path = null;
                }
            } else {
                path = null;
                iOException = null;
            }
            if (path == null) {
                try {
                    peek.j().close();
                } catch (IOException e2) {
                    if (iOException != null) {
                        iOException2 = e2;
                    } else {
                        iOException.addSuppressed(e2);
                    }
                }
                iOException2 = iOException;
                this.d.pop();
                c g = g(2, peek.c(), peek.a(), peek.b(), iOException2);
                if (!this.d.isEmpty()) {
                    this.d.peek().f(peek.b());
                }
                C(peek);
                return g;
            }
            L = L(path, true);
        } while (L == null);
        return L;
    }

    public final boolean f0(Path path, Object obj) {
        boolean isSameFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50239edf", new Object[]{this, path, obj})).booleanValue();
        }
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            Object e = next.e();
            if (obj == null || e == null) {
                try {
                    isSameFile = Files.isSameFile(path, next.c());
                    if (isSameFile) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                }
            } else if (obj.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public final c g(int i, Path path, BasicFileAttributes basicFileAttributes, long j, IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("cadea032", new Object[]{this, new Integer(i), path, basicFileAttributes, new Long(j), iOException});
        }
        this.e.e(i, path, basicFileAttributes, j, iOException);
        return this.e;
    }

    public final b w(Path path, BasicFileAttributes basicFileAttributes, DirectoryStream<Path> directoryStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("56c50f83", new Object[]{this, path, basicFileAttributes, directoryStream});
        }
        b acquire = this.f.acquire();
        if (acquire == null) {
            acquire = new b(null);
        }
        acquire.g(path, basicFileAttributes, directoryStream);
        return acquire;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Path f6498a;
        public BasicFileAttributes b;
        public Object c;
        public DirectoryStream<Path> d;
        public Iterator<Path> e;
        public long f;
        public boolean g;

        static {
            t2o.a(737149044);
        }

        public b() {
            this.f = 0L;
        }

        public BasicFileAttributes a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return le9.a(ipChange.ipc$dispatch("5b4298c6", new Object[]{this}));
            }
            return this.b;
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("983287a9", new Object[]{this})).longValue();
            }
            return this.f;
        }

        public Path c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ge9.a(ipChange.ipc$dispatch("e5ce6001", new Object[]{this}));
            }
            return this.f6498a;
        }

        public Iterator<Path> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
            }
            return this.e;
        }

        public Object e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("f3f5b48c", new Object[]{this});
            }
            return this.c;
        }

        public void f(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f853069", new Object[]{this, new Long(j)});
            } else {
                this.f += j;
            }
        }

        public void g(Path path, BasicFileAttributes basicFileAttributes, DirectoryStream<Path> directoryStream) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d709cfd6", new Object[]{this, path, basicFileAttributes, directoryStream});
                return;
            }
            this.f6498a = path;
            this.b = basicFileAttributes;
            Iterator<Path> it = null;
            if (basicFileAttributes != null) {
                obj = basicFileAttributes.fileKey();
            } else {
                obj = null;
            }
            this.c = obj;
            this.d = directoryStream;
            if (directoryStream != null) {
                it = directoryStream.iterator();
            }
            this.e = it;
            this.g = false;
            this.f = 0L;
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fce9286", new Object[]{this});
            } else {
                this.g = true;
            }
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16add3bb", new Object[]{this})).booleanValue();
            }
            return this.g;
        }

        public DirectoryStream<Path> j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ze9.a(ipChange.ipc$dispatch("dfd675b6", new Object[]{this}));
            }
            return this.d;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }
}
