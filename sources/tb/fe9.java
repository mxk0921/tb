package tb;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.FileWalkDirection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class fe9 implements sbp<File> {

    /* renamed from: a  reason: collision with root package name */
    public final File f19235a;
    public final FileWalkDirection b;
    public final int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            ckf.g(file, "rootDir");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class b extends y10<File> {
        public final ArrayDeque<c> c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public final class a extends a {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;
            public final /* synthetic */ b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                ckf.g(file, "rootDir");
                this.f = bVar;
            }

            @Override // tb.fe9.c
            public File b() {
                boolean z = this.e;
                b bVar = this.f;
                if (!z && this.c == null) {
                    fe9.this.getClass();
                    File[] listFiles = a().listFiles();
                    this.c = listFiles;
                    if (listFiles == null) {
                        fe9.this.getClass();
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null && this.d < fileArr.length) {
                    File[] fileArr2 = this.c;
                    ckf.d(fileArr2);
                    int i = this.d;
                    this.d = i + 1;
                    return fileArr2[i];
                } else if (!this.b) {
                    this.b = true;
                    return a();
                } else {
                    fe9.this.getClass();
                    return null;
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.fe9$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public final class C0926b extends c {
            public boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0926b(b bVar, File file) {
                super(file);
                ckf.g(file, "rootFile");
            }

            @Override // tb.fe9.c
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public final class c extends a {
            public boolean b;
            public File[] c;
            public int d;
            public final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                ckf.g(file, "rootDir");
                this.e = bVar;
            }

            @Override // tb.fe9.c
            public File b() {
                boolean z = this.b;
                b bVar = this.e;
                if (!z) {
                    fe9.this.getClass();
                    this.b = true;
                    return a();
                }
                File[] fileArr = this.c;
                if (fileArr == null || this.d < fileArr.length) {
                    if (this.c == null) {
                        File[] listFiles = a().listFiles();
                        this.c = listFiles;
                        if (listFiles == null) {
                            fe9.this.getClass();
                        }
                        File[] fileArr2 = this.c;
                        if (fileArr2 == null || fileArr2.length == 0) {
                            fe9.this.getClass();
                            return null;
                        }
                    }
                    File[] fileArr3 = this.c;
                    ckf.d(fileArr3);
                    int i = this.d;
                    this.d = i + 1;
                    return fileArr3[i];
                }
                fe9.this.getClass();
                return null;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public /* synthetic */ class d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.c = arrayDeque;
            if (fe9.this.f19235a.isDirectory()) {
                arrayDeque.push(f(fe9.this.f19235a));
            } else if (fe9.this.f19235a.isFile()) {
                arrayDeque.push(new C0926b(this, fe9.this.f19235a));
            } else {
                c();
            }
        }

        @Override // tb.y10
        public void a() {
            File g = g();
            if (g != null) {
                d(g);
            } else {
                c();
            }
        }

        public final a f(File file) {
            int i = d.$EnumSwitchMapping$0[fe9.this.b.ordinal()];
            if (i == 1) {
                return new c(this, file);
            }
            if (i == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final File g() {
            File b;
            while (true) {
                ArrayDeque<c> arrayDeque = this.c;
                c peek = arrayDeque.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.b();
                if (b == null) {
                    arrayDeque.pop();
                } else if (ckf.b(b, peek.a()) || !b.isDirectory() || arrayDeque.size() >= fe9.this.c) {
                    break;
                } else {
                    arrayDeque.push(f(b));
                }
            }
            return b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final File f19236a;

        public c(File file) {
            ckf.g(file, "root");
            this.f19236a = file;
        }

        public final File a() {
            return this.f19236a;
        }

        public abstract File b();
    }

    public fe9(File file, FileWalkDirection fileWalkDirection, g1a<? super File, Boolean> g1aVar, g1a<? super File, xhv> g1aVar2, u1a<? super File, ? super IOException, xhv> u1aVar, int i) {
        this.f19235a = file;
        this.b = fileWalkDirection;
        this.c = i;
    }

    @Override // tb.sbp
    public Iterator<File> iterator() {
        return new b();
    }

    public /* synthetic */ fe9(File file, FileWalkDirection fileWalkDirection, g1a g1aVar, g1a g1aVar2, u1a u1aVar, int i, int i2, a07 a07Var) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, g1aVar, g1aVar2, u1aVar, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fe9(File file, FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        ckf.g(file, "start");
        ckf.g(fileWalkDirection, "direction");
    }
}
