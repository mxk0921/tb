package com.loc;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.alipay.android.msp.framework.cache.DiskLruCache;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bl implements Closeable {
    static ThreadPoolExecutor d;
    private static final ThreadFactory r;
    private final File e;
    private final File f;
    private final File g;
    private final File h;
    private long j;
    private Writer m;
    private int p;

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f5587a = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final Charset b = Charset.forName(EncodingUtils.US_ASCII);
    static final Charset c = Charset.forName("UTF-8");
    private static final OutputStream t = new OutputStream() { // from class: com.loc.bl.3
        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
        }
    };
    private long l = 0;
    private int n = 1000;
    private final LinkedHashMap<String, c> o = new LinkedHashMap<>(0, 0.75f, true);
    private long q = 0;
    private final Callable<Void> s = new Callable<Void>() { // from class: com.loc.bl.2
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (bl.this) {
                try {
                    if (bl.this.m == null) {
                        return null;
                    }
                    bl.this.l();
                    if (bl.this.j()) {
                        bl.this.i();
                        bl.this.p = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final int i = 1;
    private final int k = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class a {
        private final c b;
        private final boolean[] c;
        private boolean d;
        private boolean e;

        /* compiled from: Taobao */
        /* renamed from: com.loc.bl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0272a extends FilterOutputStream {
            private C0272a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    a.this.d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    a.this.d = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    a.this.d = true;
                }
            }

            public /* synthetic */ C0272a(a aVar, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    a.this.d = true;
                }
            }
        }

        private a(c cVar) {
            this.b = cVar;
            this.c = cVar.d ? null : new boolean[bl.this.k];
        }

        public final void b() throws IOException {
            if (this.d) {
                bl.this.a(this, false);
                bl.this.c(this.b.b);
            } else {
                bl.this.a(this, true);
            }
            this.e = true;
        }

        public final void c() throws IOException {
            bl.this.a(this, false);
        }

        public /* synthetic */ a(bl blVar, c cVar, byte b) {
            this(cVar);
        }

        public final OutputStream a() throws IOException {
            FileOutputStream fileOutputStream;
            C0272a aVar;
            if (bl.this.k > 0) {
                synchronized (bl.this) {
                    try {
                        if (this.b.e == this) {
                            if (!this.b.d) {
                                this.c[0] = true;
                            }
                            File b = this.b.b(0);
                            try {
                                fileOutputStream = new FileOutputStream(b);
                            } catch (FileNotFoundException unused) {
                                bl.this.e.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(b);
                                } catch (FileNotFoundException unused2) {
                                    return bl.t;
                                }
                            }
                            aVar = new C0272a(this, fileOutputStream, (byte) 0);
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return aVar;
            }
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + bl.this.k);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class b implements Closeable {
        private final String b;
        private final long c;
        private final InputStream[] d;
        private final long[] e;

        private b(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.b = str;
            this.c = j;
            this.d = inputStreamArr;
            this.e = jArr;
        }

        public final InputStream a() {
            return this.d[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.d) {
                bl.a(inputStream);
            }
        }

        public /* synthetic */ b(bl blVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, byte b) {
            this(str, j, inputStreamArr, jArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class c {
        private final String b;
        private final long[] c;
        private boolean d;
        private a e;
        private long f;

        private c(String str) {
            this.b = str;
            this.c = new long[bl.this.k];
        }

        public /* synthetic */ c(bl blVar, String str, byte b) {
            this(str);
        }

        public final File b(int i) {
            File file = bl.this.e;
            return new File(file, this.b + "." + i + ".tmp");
        }

        public final File a(int i) {
            File file = bl.this.e;
            return new File(file, this.b + "." + i);
        }

        private static IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final String a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.c) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public static /* synthetic */ void a(c cVar, String[] strArr) throws IOException {
            if (strArr.length == bl.this.k) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        cVar.c[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw a(strArr);
                    }
                }
                return;
            }
            throw a(strArr);
        }
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.loc.bl.1

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f5588a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "disklrucache#" + this.f5588a.getAndIncrement());
            }
        };
        r = threadFactory;
        d = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    private bl(File file, long j) {
        this.e = file;
        this.f = new File(file, DiskLruCache.JOURNAL_FILE);
        this.g = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.h = new File(file, "journal.bkp");
        this.j = j;
    }

    private synchronized a d(String str) throws IOException {
        try {
            k();
            e(str);
            c cVar = this.o.get(str);
            if (cVar == null) {
                cVar = new c(this, str, (byte) 0);
                this.o.put(str, cVar);
            } else if (cVar.e != null) {
                return null;
            }
            a aVar = new a(this, cVar, (byte) 0);
            cVar.e = aVar;
            Writer writer = this.m;
            writer.write("DIRTY " + str + '\n');
            this.m.flush();
            return aVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void h() throws IOException {
        a(this.g);
        Iterator<c> it = this.o.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i = 0;
            if (next.e == null) {
                while (i < this.k) {
                    this.l += next.c[i];
                    i++;
                }
            } else {
                next.e = null;
                while (i < this.k) {
                    a(next.a(i));
                    a(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() throws IOException {
        String str;
        try {
            Writer writer = this.m;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), b));
            bufferedWriter.write(DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.i));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (c cVar : this.o.values()) {
                if (cVar.e != null) {
                    str = "DIRTY " + cVar.b + '\n';
                } else {
                    str = "CLEAN " + cVar.b + cVar.a() + '\n';
                }
                bufferedWriter.write(str);
            }
            bufferedWriter.close();
            if (this.f.exists()) {
                a(this.f, this.h, true);
            }
            a(this.g, this.f, false);
            this.h.delete();
            this.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), b));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        int i = this.p;
        if (i < 2000 || i < this.o.size()) {
            return false;
        }
        return true;
    }

    private void k() {
        if (this.m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws IOException {
        while (true) {
            if (this.l > this.j || this.o.size() > this.n) {
                c(this.o.entrySet().iterator().next().getKey());
            } else {
                return;
            }
        }
    }

    public final synchronized b a(String str) throws IOException {
        InputStream inputStream;
        k();
        e(str);
        c cVar = this.o.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.d) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.k];
        for (int i = 0; i < this.k; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(cVar.a(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.k && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    a(inputStream);
                }
                return null;
            }
        }
        this.p++;
        this.m.append((CharSequence) ("READ " + str + '\n'));
        if (j()) {
            f().submit(this.s);
        }
        return new b(this, str, cVar.f, inputStreamArr, cVar.c, (byte) 0);
    }

    public final a b(String str) throws IOException {
        return d(str);
    }

    public final synchronized void c() throws IOException {
        k();
        l();
        this.m.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.m != null) {
                Iterator it = new ArrayList(this.o.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.e != null) {
                        cVar.e.c();
                    }
                }
                l();
                this.m.close();
                this.m = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static bl a(File file, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            bl blVar = new bl(file, j);
            if (blVar.f.exists()) {
                try {
                    blVar.g();
                    blVar.h();
                    blVar.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(blVar.f, true), b));
                    return blVar;
                } catch (Throwable unused) {
                    blVar.d();
                }
            }
            file.mkdirs();
            bl blVar2 = new bl(file, j);
            blVar2.i();
            return blVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static ThreadPoolExecutor f() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            threadPoolExecutor = d;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (threadPoolExecutor != null) {
            if (threadPoolExecutor.isShutdown()) {
            }
            return d;
        }
        d = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), r);
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
        throw new java.io.IOException("unexpected journal line: ".concat(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bl.g():void");
    }

    public final File b() {
        return this.e;
    }

    public final void d() throws IOException {
        close();
        b(this.e);
    }

    private static void e(String str) {
        if (!f5587a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public final synchronized boolean c(String str) throws IOException {
        try {
            k();
            e(str);
            c cVar = this.o.get(str);
            if (cVar != null && cVar.e == null) {
                for (int i = 0; i < this.k; i++) {
                    File a2 = cVar.a(i);
                    if (a2.exists() && !a2.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(a2)));
                    }
                    this.l -= cVar.c[i];
                    cVar.c[i] = 0;
                }
                this.p++;
                this.m.append((CharSequence) ("REMOVE " + str + '\n'));
                this.o.remove(str);
                if (j()) {
                    f().submit(this.s);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void a() {
        ThreadPoolExecutor threadPoolExecutor = d;
        if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
            d.shutdown();
        }
    }

    private static void b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
    }

    public final void a(int i) {
        if (i < 10) {
            i = 10;
        } else if (i > 10000) {
            i = 10000;
        }
        this.n = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(a aVar, boolean z) throws IOException {
        c cVar = aVar.b;
        if (cVar.e == aVar) {
            if (z && !cVar.d) {
                for (int i = 0; i < this.k; i++) {
                    if (!aVar.c[i]) {
                        aVar.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                    } else if (!cVar.b(i).exists()) {
                        aVar.c();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.k; i2++) {
                File b2 = cVar.b(i2);
                if (!z) {
                    a(b2);
                } else if (b2.exists()) {
                    File a2 = cVar.a(i2);
                    b2.renameTo(a2);
                    long j = cVar.c[i2];
                    long length = a2.length();
                    cVar.c[i2] = length;
                    this.l = (this.l - j) + length;
                }
            }
            this.p++;
            cVar.e = null;
            if (cVar.d || z) {
                cVar.d = true;
                this.m.write("CLEAN " + cVar.b + cVar.a() + '\n');
                if (z) {
                    long j2 = this.q;
                    this.q = 1 + j2;
                    cVar.f = j2;
                }
            } else {
                this.o.remove(cVar.b);
                this.m.write("REMOVE " + cVar.b + '\n');
            }
            this.m.flush();
            if (this.l > this.j || j()) {
                f().submit(this.s);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
