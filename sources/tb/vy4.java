package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vy4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ESCAPE_MODE_BACKSLASH = 2;
    public static final int ESCAPE_MODE_DOUBLED = 1;

    /* renamed from: a  reason: collision with root package name */
    public Reader f30333a;
    public final e b;
    public final b c;
    public final a d;
    public final d e;
    public boolean[] f;
    public final c g;
    public boolean h;
    public boolean i;
    public boolean j;
    public char k;
    public boolean l;
    public int m;
    public long n;
    public String[] o;
    public boolean p;
    public boolean q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public char[] f30334a = new char[50];
        public int b = 0;

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public char[] f30335a = new char[1024];
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public String[] f30336a = null;
        public int b = 0;
        public HashMap c = new HashMap();

        public c() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public char[] f30337a = new char[500];
        public int b = 0;

        public d() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public char f30338a = ',';

        public e() {
        }
    }

    public vy4(Reader reader, char c2) {
        this.f30333a = null;
        e eVar = new e();
        this.b = eVar;
        this.c = new b();
        this.d = new a();
        this.e = new d();
        this.f = null;
        this.g = new c();
        this.h = false;
        this.i = false;
        this.j = true;
        this.k = (char) 0;
        this.l = false;
        this.m = 0;
        this.n = 0L;
        this.o = new String[10];
        this.p = false;
        this.q = false;
        if (reader != null) {
            this.f30333a = reader;
            eVar.f30338a = c2;
            this.p = true;
            this.f = new boolean[10];
            return;
        }
        throw new IllegalArgumentException("Parameter inputStream can not be null.");
    }

    public final void a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd05e71b", new Object[]{this});
        } else if (this.q) {
            throw new IOException("This instance of the CsvReader class has already been closed.");
        }
    }

    public final void b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1dedf", new Object[]{this});
            return;
        }
        if (!this.p) {
            this.p = true;
        }
        l();
        this.b.getClass();
        b bVar = this.c;
        int i = bVar.c;
        if (i > 0) {
            d dVar = this.e;
            char[] cArr = dVar.f30337a;
            int length = cArr.length - dVar.b;
            int i2 = i - bVar.e;
            if (length < i2) {
                char[] cArr2 = new char[cArr.length + Math.max(i2, cArr.length)];
                d dVar2 = this.e;
                System.arraycopy(dVar2.f30337a, 0, cArr2, 0, dVar2.b);
                this.e.f30337a = cArr2;
            }
            b bVar2 = this.c;
            char[] cArr3 = bVar2.f30335a;
            int i3 = bVar2.e;
            d dVar3 = this.e;
            System.arraycopy(cArr3, i3, dVar3.f30337a, dVar3.b, bVar2.c - i3);
            d dVar4 = this.e;
            int i4 = dVar4.b;
            b bVar3 = this.c;
            dVar4.b = i4 + (bVar3.c - bVar3.e);
        }
        try {
            b bVar4 = this.c;
            Reader reader = this.f30333a;
            char[] cArr4 = bVar4.f30335a;
            bVar4.c = reader.read(cArr4, 0, cArr4.length);
            b bVar5 = this.c;
            if (bVar5.c == -1) {
                this.j = false;
            }
            bVar5.b = 0;
            bVar5.e = 0;
            bVar5.d = 0;
        } catch (IOException e2) {
            c();
            throw e2;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (!this.q) {
            d(true);
            this.q = true;
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8249dc35", new Object[]{this, new Boolean(z)});
        } else if (!this.q) {
            if (z) {
                c cVar = this.g;
                cVar.f30336a = null;
                cVar.c = null;
                this.c.f30335a = null;
                this.d.f30334a = null;
                this.e.f30337a = null;
            }
            try {
                if (this.p) {
                    this.f30333a.close();
                }
            } catch (Exception unused) {
            }
            this.f30333a = null;
            this.q = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vy4.e():void");
    }

    public final void f() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e9af93", new Object[]{this});
            return;
        }
        this.l = true;
        this.n++;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            d(false);
        }
    }

    public String g(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae1f639a", new Object[]{this, new Integer(i)});
        }
        a();
        if (i <= -1 || i >= this.m) {
            return "";
        }
        return this.o[i];
    }

    public String[] h() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c9b833e6", new Object[]{this});
        }
        a();
        c cVar = this.g;
        String[] strArr = cVar.f30336a;
        if (strArr == null) {
            return null;
        }
        int i = cVar.b;
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public String[] i() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a13902ae", new Object[]{this});
        }
        a();
        int i = this.m;
        String[] strArr = new String[i];
        System.arraycopy(this.o, 0, strArr, 0, i);
        return strArr;
    }

    public boolean j() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c37559b", new Object[]{this})).booleanValue();
        }
        boolean k = k();
        c cVar = this.g;
        int i = this.m;
        cVar.b = i;
        cVar.f30336a = new String[i];
        for (int i2 = 0; i2 < this.g.b; i2++) {
            String g = g(i2);
            c cVar2 = this.g;
            cVar2.f30336a[i2] = g;
            cVar2.c.put(g, Integer.valueOf(i2));
        }
        if (k) {
            this.n--;
        }
        this.m = 0;
        return k;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0233 A[EDGE_INSN: B:120:0x0233->B:93:0x0233 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vy4.k():boolean");
    }

    public final void l() {
        b bVar;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fdf3ae8", new Object[]{this});
            return;
        }
        if (this.h && (i = (bVar = this.c).d) < (i2 = bVar.b)) {
            a aVar = this.d;
            char[] cArr = aVar.f30334a;
            if (cArr.length - aVar.b < i2 - i) {
                char[] cArr2 = new char[cArr.length + Math.max(i2 - i, cArr.length)];
                a aVar2 = this.d;
                System.arraycopy(aVar2.f30334a, 0, cArr2, 0, aVar2.b);
                this.d.f30334a = cArr2;
            }
            b bVar2 = this.c;
            char[] cArr3 = bVar2.f30335a;
            int i3 = bVar2.d;
            a aVar3 = this.d;
            System.arraycopy(cArr3, i3, aVar3.f30334a, aVar3.b, bVar2.b - i3);
            a aVar4 = this.d;
            int i4 = aVar4.b;
            b bVar3 = this.c;
            aVar4.b = i4 + (bVar3.b - bVar3.d);
        }
        b bVar4 = this.c;
        bVar4.d = bVar4.b + 1;
    }

    public vy4(InputStream inputStream, char c2, Charset charset) {
        this(new InputStreamReader(inputStream, charset), c2);
    }
}
