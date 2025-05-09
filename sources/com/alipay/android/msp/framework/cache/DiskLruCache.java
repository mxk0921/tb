package com.alipay.android.msp.framework.cache;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DiskLruCache implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TMP = "journal.tmp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";

    /* renamed from: a  reason: collision with root package name */
    public final File f3586a;
    public final File b;
    public final File c;
    public final int d;
    public final long e;
    public final int f;
    public Writer h;
    public int j;
    public final ThreadPoolExecutor l;
    public long g = 0;
    public final LinkedHashMap<String, Entry> i = new LinkedHashMap<>(0, 0.75f, true);
    public long k = 0;
    public final Callable<Void> m = new Callable<Void>() { // from class: com.alipay.android.msp.framework.cache.DiskLruCache.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("b898ca78", new Object[]{this});
            }
            synchronized (DiskLruCache.this) {
                try {
                    if (DiskLruCache.access$000(DiskLruCache.this) == null) {
                        return null;
                    }
                    DiskLruCache.access$100(DiskLruCache.this);
                    if (DiskLruCache.access$200(DiskLruCache.this)) {
                        DiskLruCache.access$300(DiskLruCache.this);
                        DiskLruCache.access$402(DiskLruCache.this, 0);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Entry f3588a;
        public boolean b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class FaultHidingOutputStream extends FilterOutputStream {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(FaultHidingOutputStream faultHidingOutputStream, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/cache/DiskLruCache$Editor$FaultHidingOutputStream");
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                    return;
                }
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    Editor.access$1902(Editor.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
                    return;
                }
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    Editor.access$1902(Editor.this, true);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
                    return;
                }
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    Editor.access$1902(Editor.this, true);
                }
            }

            public FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
                    return;
                }
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    Editor.access$1902(Editor.this, true);
                }
            }
        }

        public static /* synthetic */ Entry access$1400(Editor editor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Entry) ipChange.ipc$dispatch("8760aa0b", new Object[]{editor});
            }
            return editor.f3588a;
        }

        public static /* synthetic */ boolean access$1902(Editor editor, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e3811a7f", new Object[]{editor, new Boolean(z)})).booleanValue();
            }
            editor.b = z;
            return z;
        }

        public final void abort() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaf58fb7", new Object[]{this});
            } else {
                DiskLruCache.access$1800(DiskLruCache.this, this, false);
            }
        }

        public final void commit() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (this.b) {
                DiskLruCache.access$1800(DiskLruCache.this, this, false);
                DiskLruCache.this.remove(Entry.access$1100(this.f3588a));
            } else {
                DiskLruCache.access$1800(DiskLruCache.this, this, true);
            }
        }

        public final String getString(int i) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
            }
            InputStream newInputStream = newInputStream(i);
            if (newInputStream != null) {
                return DiskLruCache.access$1600(newInputStream);
            }
            return null;
        }

        public final InputStream newInputStream(int i) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("9b080975", new Object[]{this, new Integer(i)});
            }
            synchronized (DiskLruCache.this) {
                try {
                    if (Entry.access$700(this.f3588a) != this) {
                        throw new IllegalStateException();
                    } else if (!Entry.access$600(this.f3588a)) {
                        return null;
                    } else {
                        return new FileInputStream(this.f3588a.getCleanFile(i));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final OutputStream newOutputStream(int i) throws IOException {
            FaultHidingOutputStream faultHidingOutputStream;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OutputStream) ipChange.ipc$dispatch("b00c21cd", new Object[]{this, new Integer(i)});
            }
            synchronized (DiskLruCache.this) {
                try {
                    if (Entry.access$700(this.f3588a) == this) {
                        faultHidingOutputStream = new FaultHidingOutputStream(new FileOutputStream(this.f3588a.getDirtyFile(i)));
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return faultHidingOutputStream;
        }

        public final void set(int i, String str) throws IOException {
            Throwable th;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0bd7f84", new Object[]{this, new Integer(i), str});
                return;
            }
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i), "UTF-8");
                try {
                    outputStreamWriter2.write(str);
                    DiskLruCache.closeQuietly(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    DiskLruCache.closeQuietly(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public Editor(Entry entry) {
            this.f3588a = entry;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class Entry {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f3589a;
        public final long[] b;
        public boolean c;
        public Editor d;
        public long e;

        public static IOException a(String[] strArr) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IOException) ipChange.ipc$dispatch("a22b8f38", new Object[]{strArr});
            }
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public static /* synthetic */ long[] access$1000(Entry entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (long[]) ipChange.ipc$dispatch("eafe8602", new Object[]{entry});
            }
            return entry.b;
        }

        public static /* synthetic */ String access$1100(Entry entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8348797e", new Object[]{entry});
            }
            return entry.f3589a;
        }

        public static /* synthetic */ long access$1200(Entry entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("811cf375", new Object[]{entry})).longValue();
            }
            return entry.e;
        }

        public static /* synthetic */ long access$1202(Entry entry, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3e00e359", new Object[]{entry, new Long(j)})).longValue();
            }
            entry.e = j;
            return j;
        }

        public static /* synthetic */ boolean access$600(Entry entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d175ca90", new Object[]{entry})).booleanValue();
            }
            return entry.c;
        }

        public static /* synthetic */ boolean access$602(Entry entry, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f8c329ce", new Object[]{entry, new Boolean(z)})).booleanValue();
            }
            entry.c = z;
            return z;
        }

        public static /* synthetic */ Editor access$700(Entry entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Editor) ipChange.ipc$dispatch("f0e47313", new Object[]{entry});
            }
            return entry.d;
        }

        public static /* synthetic */ Editor access$702(Entry entry, Editor editor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Editor) ipChange.ipc$dispatch("2bd3bd0d", new Object[]{entry, editor});
            }
            entry.d = editor;
            return editor;
        }

        public static /* synthetic */ void access$800(Entry entry, String[] strArr) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b05b5215", new Object[]{entry, strArr});
            } else if (strArr.length == DiskLruCache.access$2000(DiskLruCache.this)) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        entry.b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw a(strArr);
                    }
                }
            } else {
                throw a(strArr);
            }
        }

        public final File getCleanFile(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("74813220", new Object[]{this, new Integer(i)});
            }
            File access$2100 = DiskLruCache.access$2100(DiskLruCache.this);
            return new File(access$2100, this.f3589a + "." + i);
        }

        public final File getDirtyFile(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("42f962e9", new Object[]{this, new Integer(i)});
            }
            File access$2100 = DiskLruCache.access$2100(DiskLruCache.this);
            return new File(access$2100, this.f3589a + "." + i + ".tmp");
        }

        public final String getLengths() throws IOException {
            long[] jArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f60f5542", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public Entry(String str) {
            this.f3589a = str;
            this.b = new long[DiskLruCache.access$2000(DiskLruCache.this)];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class Snapshot implements Closeable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f3590a;
        public final long b;
        public final InputStream[] c;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            for (InputStream inputStream : this.c) {
                DiskLruCache.closeQuietly(inputStream);
            }
        }

        public final Editor edit() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Editor) ipChange.ipc$dispatch("e109606d", new Object[]{this});
            }
            return DiskLruCache.access$1500(DiskLruCache.this, this.f3590a, this.b);
        }

        public final InputStream getInputStream(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("e109cc2b", new Object[]{this, new Integer(i)});
            }
            return this.c[i];
        }

        public final String getString(int i) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
            }
            return DiskLruCache.access$1600(getInputStream(i));
        }

        public Snapshot(String str, long j, InputStream[] inputStreamArr) {
            this.f3590a = str;
            this.b = j;
            this.c = inputStreamArr;
        }
    }

    public static void L(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
        } else if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static /* synthetic */ Writer access$000(DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Writer) ipChange.ipc$dispatch("ccca4836", new Object[]{diskLruCache});
        }
        return diskLruCache.h;
    }

    public static /* synthetic */ void access$100(DiskLruCache diskLruCache) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d7549f", new Object[]{diskLruCache});
        } else {
            diskLruCache.f0();
        }
    }

    public static /* synthetic */ Editor access$1500(DiskLruCache diskLruCache, String str, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Editor) ipChange.ipc$dispatch("7a8c1970", new Object[]{diskLruCache, str, new Long(j)});
        }
        return diskLruCache.C(str, j);
    }

    public static /* synthetic */ String access$1600(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da7f1999", new Object[]{inputStream});
        }
        return readFully(new InputStreamReader(inputStream, "UTF-8"));
    }

    public static /* synthetic */ void access$1800(DiskLruCache diskLruCache, Editor editor, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6667003", new Object[]{diskLruCache, editor, new Boolean(z)});
        } else {
            diskLruCache.F(editor, z);
        }
    }

    public static /* synthetic */ boolean access$200(DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cedb2002", new Object[]{diskLruCache})).booleanValue();
        }
        return diskLruCache.A();
    }

    public static /* synthetic */ int access$2000(DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7fa9be5", new Object[]{diskLruCache})).intValue();
        }
        return diskLruCache.f;
    }

    public static /* synthetic */ File access$2100(DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4531895c", new Object[]{diskLruCache});
        }
        return diskLruCache.f3586a;
    }

    public static /* synthetic */ void access$300(DiskLruCache diskLruCache) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4deeb5d", new Object[]{diskLruCache});
        } else {
            diskLruCache.w();
        }
    }

    public static /* synthetic */ int access$402(DiskLruCache diskLruCache, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2e02d3c", new Object[]{diskLruCache, new Integer(i)})).intValue();
        }
        diskLruCache.j = i;
        return i;
    }

    public static void c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bfe042", new Object[]{str});
        } else if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    public static void closeQuietly(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d37bb", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static String readAsciiLine(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("746440e3", new Object[]{inputStream});
        }
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == '\r') {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            }
        }
    }

    public static String readFully(Reader reader) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50cc1195", new Object[]{reader});
        }
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    String stringWriter2 = stringWriter.toString();
                    reader.close();
                    return stringWriter2;
                }
            }
        } catch (Throwable th) {
            reader.close();
            throw th;
        }
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        int i = this.j;
        if (i < 2000 || i < this.i.size()) {
            return false;
        }
        return true;
    }

    public final synchronized Editor C(String str, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Editor) ipChange.ipc$dispatch("f3e7508c", new Object[]{this, str, new Long(j)});
        }
        Z();
        c0(str);
        Entry entry = this.i.get(str);
        if (j != -1 && (entry == null || Entry.access$1200(entry) != j)) {
            return null;
        }
        if (entry == null) {
            entry = new Entry(str);
            this.i.put(str, entry);
        } else if (Entry.access$700(entry) != null) {
            return null;
        }
        Editor editor = new Editor(entry);
        Entry.access$702(entry, editor);
        Writer writer = this.h;
        writer.write("DIRTY " + str + '\n');
        this.h.flush();
        return editor;
    }

    public final synchronized void F(Editor editor, boolean z) throws IOException {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc96aa64", new Object[]{this, editor, new Boolean(z)});
                return;
            }
            Entry access$1400 = Editor.access$1400(editor);
            if (Entry.access$700(access$1400) == editor) {
                if (z && !Entry.access$600(access$1400)) {
                    for (int i = 0; i < this.f; i++) {
                        if (!access$1400.getDirtyFile(i).exists()) {
                            editor.abort();
                            throw new IllegalStateException("edit didn't create file ".concat(String.valueOf(i)));
                        }
                    }
                }
                for (int i2 = 0; i2 < this.f; i2++) {
                    File dirtyFile = access$1400.getDirtyFile(i2);
                    if (!z) {
                        L(dirtyFile);
                    } else if (dirtyFile.exists()) {
                        File cleanFile = access$1400.getCleanFile(i2);
                        dirtyFile.renameTo(cleanFile);
                        long j = Entry.access$1000(access$1400)[i2];
                        long length = cleanFile.length();
                        Entry.access$1000(access$1400)[i2] = length;
                        this.g = (this.g - j) + length;
                    }
                }
                this.j++;
                Entry.access$702(access$1400, null);
                if (Entry.access$600(access$1400) || z) {
                    Entry.access$602(access$1400, true);
                    this.h.write("CLEAN " + Entry.access$1100(access$1400) + access$1400.getLengths() + '\n');
                    if (z) {
                        long j2 = this.k;
                        this.k = 1 + j2;
                        Entry.access$1202(access$1400, j2);
                    }
                } else {
                    this.i.remove(Entry.access$1100(access$1400));
                    this.h.write("REMOVE " + Entry.access$1100(access$1400) + '\n');
                }
                if (this.g > this.e || A()) {
                    this.l.submit(this.m);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6530e2fe", new Object[]{this});
        } else if (this.h == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.h != null) {
            Iterator it = new ArrayList(this.i.values()).iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (Entry.access$700(entry) != null) {
                    Entry.access$700(entry).abort();
                }
            }
            f0();
            this.h.close();
            this.h = null;
        }
    }

    public final void delete() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
            return;
        }
        close();
        deleteContents(this.f3586a);
    }

    public final Editor edit(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Editor) ipChange.ipc$dispatch("eeb35aa3", new Object[]{this, str});
        }
        return C(str, -1L);
    }

    public final void f0() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41e5165", new Object[]{this});
            return;
        }
        while (this.g > this.e) {
            remove(this.i.entrySet().iterator().next().getKey());
        }
    }

    public final synchronized void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            return;
        }
        Z();
        f0();
        this.h.flush();
    }

    public final void g() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        L(this.c);
        Iterator<Entry> it = this.i.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            if (Entry.access$700(next) == null) {
                for (int i = 0; i < this.f; i++) {
                    this.g += Entry.access$1000(next)[i];
                }
            } else {
                Entry.access$702(next, null);
                for (int i2 = 0; i2 < this.f; i2++) {
                    L(next.getCleanFile(i2));
                    L(next.getDirtyFile(i2));
                }
                it.remove();
            }
        }
    }

    public final synchronized Snapshot get(String str) throws IOException {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Snapshot) ipChange.ipc$dispatch("e1e8bb20", new Object[]{this, str});
            }
            Z();
            c0(str);
            Entry entry = this.i.get(str);
            if (entry == null) {
                return null;
            }
            if (!Entry.access$600(entry)) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.f];
            for (int i = 0; i < this.f; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(entry.getCleanFile(i));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
            this.j++;
            this.h.append((CharSequence) ("READ " + str + '\n'));
            if (A()) {
                this.l.submit(this.m);
            }
            return new Snapshot(str, Entry.access$1200(entry), inputStreamArr);
        }
    }

    public final File getDirectory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9c45090f", new Object[]{this});
        }
        return this.f3586a;
    }

    public final boolean isClosed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue();
        }
        if (this.h == null) {
            return true;
        }
        return false;
    }

    public final long maxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8be180", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public final synchronized boolean remove(String str) throws IOException {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{this, str})).booleanValue();
            }
            Z();
            c0(str);
            Entry entry = this.i.get(str);
            if (entry != null && Entry.access$700(entry) == null) {
                for (int i = 0; i < this.f; i++) {
                    File cleanFile = entry.getCleanFile(i);
                    if (cleanFile.delete()) {
                        this.g -= Entry.access$1000(entry)[i];
                        Entry.access$1000(entry)[i] = 0;
                    } else {
                        throw new IOException("failed to delete ".concat(String.valueOf(cleanFile)));
                    }
                }
                this.j++;
                this.h.append((CharSequence) ("REMOVE " + str + '\n'));
                this.i.remove(str);
                if (A()) {
                    this.l.submit(this.m);
                }
                return true;
            }
            return false;
        }
    }

    public final synchronized long size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfc", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public static DiskLruCache open(File file, int i, int i2, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiskLruCache) ipChange.ipc$dispatch("e98c93a3", new Object[]{file, new Integer(i), new Integer(i2), new Long(j)});
        }
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
            if (diskLruCache.b.exists()) {
                try {
                    diskLruCache.e();
                    diskLruCache.g();
                    diskLruCache.h = new BufferedWriter(new FileWriter(diskLruCache.b, true), 4096);
                    return diskLruCache;
                } catch (IOException unused) {
                    diskLruCache.delete();
                }
            }
            file.mkdirs();
            DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
            diskLruCache2.w();
            return diskLruCache2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public final synchronized void w() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        Writer writer = this.h;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.c), 4096);
        bufferedWriter.write(MAGIC);
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.d));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (Entry entry : this.i.values()) {
            if (Entry.access$700(entry) != null) {
                bufferedWriter.write("DIRTY " + Entry.access$1100(entry) + '\n');
            } else {
                bufferedWriter.write("CLEAN " + Entry.access$1100(entry) + entry.getLengths() + '\n');
            }
        }
        bufferedWriter.close();
        this.c.renameTo(this.b);
        this.h = new BufferedWriter(new FileWriter(this.b, true), 4096);
    }

    public static void deleteContents(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1b3063", new Object[]{file});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(file)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0119, code lost:
        throw new java.io.IOException("unexpected journal line: ".concat(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.cache.DiskLruCache.e():void");
    }

    public DiskLruCache(File file, int i, int i2, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.android.msp.framework.cache.DiskLruCache.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final AtomicInteger f3587a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "MspDiskLru #" + this.f3587a.getAndIncrement());
            }
        });
        this.l = threadPoolExecutor;
        this.f3586a = file;
        this.d = i;
        this.b = new File(file, JOURNAL_FILE);
        this.c = new File(file, JOURNAL_FILE_TMP);
        this.f = i2;
        this.e = j;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
