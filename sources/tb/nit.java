package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.cache.db.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24763a;
    public final Context b;
    public final File c;
    public final com.taobao.android.ultron.datamodel.cache.db.b d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24764a;
        public final /* synthetic */ byte[] b;

        public a(String str, byte[] bArr) {
            this.f24764a = str;
            this.b = bArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/cache/TemplateCache$1");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            String str = this.f24764a;
            synchronized (nit.class) {
                File file = new File(nit.this.c, str);
                if (file.exists()) {
                    return null;
                }
                nit.a(nit.this, this.b, file);
                if (file.isFile() && file.length() > 0) {
                    try {
                        nit.this.d.j(this.f24764a, file);
                    } catch (Throwable th) {
                        Log.e(o71.POINT_TEMPLATE_CACHE, "File cache store exception", th);
                    }
                }
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f24765a;
        public String b;
        public String c;
        public int d = 8;
        public long e = 4194304;
        public final boolean f = true;

        static {
            t2o.a(83886137);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4d3c08f0", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ Context b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("a42b9887", new Object[]{bVar});
            }
            return bVar.f24765a;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1f4b92f2", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ int d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("937ba040", new Object[]{bVar})).intValue();
            }
            return bVar.d;
        }

        public static /* synthetic */ long e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("15c65520", new Object[]{bVar})).longValue();
            }
            return bVar.e;
        }

        public static /* synthetic */ boolean f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("98110a0f", new Object[]{bVar})).booleanValue();
            }
            return bVar.f;
        }

        public nit g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nit) ipChange.ipc$dispatch("40472823", new Object[]{this});
            }
            if (this.f24765a != null && !TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.c)) {
                return new nit(this, null);
            }
            throw new IllegalArgumentException();
        }

        public b h(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("54cd9bef", new Object[]{this, context});
            }
            this.f24765a = context;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4d9b5a17", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b j(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5d95ca98", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }

        public b k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bbc80fdf", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6896b798", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(83886135);
    }

    public /* synthetic */ nit(b bVar, a aVar) {
        this(bVar);
    }

    public static /* synthetic */ File a(nit nitVar, byte[] bArr, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("fa18394e", new Object[]{nitVar, bArr, file});
        }
        return nitVar.j(bArr, file);
    }

    public final File b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("dd4d9c17", new Object[]{this});
        }
        File e = e();
        if (e == null) {
            return null;
        }
        File file = new File(e, this.f24763a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1436ae68", new Object[]{this, str});
        } else {
            this.d.d(str);
        }
    }

    public byte[] d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e0b17c98", new Object[]{this, str});
        }
        b.C0510b h = this.d.h(str);
        if (h != null) {
            return h(h.c);
        }
        return null;
    }

    public final File e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("bedfb536", new Object[]{this});
        }
        File filesDir = this.b.getFilesDir();
        if (filesDir != null && filesDir.canWrite()) {
            return filesDir;
        }
        File cacheDir = this.b.getCacheDir();
        if (cacheDir != null && cacheDir.canWrite()) {
            return cacheDir;
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                File externalFilesDir = this.b.getExternalFilesDir(null);
                if (externalFilesDir != null && externalFilesDir.canWrite()) {
                    return externalFilesDir;
                }
                File externalCacheDir = this.b.getExternalCacheDir();
                if (externalCacheDir != null) {
                    if (externalCacheDir.canWrite()) {
                        return externalCacheDir;
                    }
                }
            } catch (Exception e) {
                Log.e(o71.POINT_TEMPLATE_CACHE, "get external files dir exception", e);
            }
        }
        return null;
    }

    public List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ff12f38", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        List<b.C0510b> e = this.d.e();
        if (!(e == null || e.size() == 0)) {
            for (b.C0510b bVar : e) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }

    public final byte[] g(File file) throws IOException {
        int read;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6ee147df", new Object[]{this, file});
        }
        long length = file.length();
        if (length <= 2147483639) {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i2 = (int) length;
            byte[] bArr = new byte[i2];
            while (true) {
                int read2 = fileInputStream.read(bArr, i, i2 - i);
                if (read2 > 0) {
                    i += read2;
                } else if (read2 < 0 || (read = fileInputStream.read()) < 0) {
                    break;
                } else {
                    if (i2 <= 2147483639 - i2) {
                        i2 = Math.max(i2 << 1, 8192);
                    } else if (i2 != 2147483639) {
                        i2 = 2147483639;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    bArr = Arrays.copyOf(bArr, i2);
                    bArr[i] = (byte) read;
                    i++;
                }
            }
            fileInputStream.close();
            if (i2 == i) {
                return bArr;
            }
            return Arrays.copyOf(bArr, i);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public byte[] h(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e29bda89", new Object[]{this, file});
        }
        try {
            return g(file);
        } catch (IOException e) {
            Log.e(o71.POINT_TEMPLATE_CACHE, "Read all bytes exception:", e);
            return null;
        }
    }

    public void i(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e95f2f", new Object[]{this, str, bArr});
        } else if (bArr != null) {
            new a(str, bArr).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r1 != null) goto L_0x0029;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File j(byte[] r5, java.io.File r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.nit.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "90bd1d38"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.io.File r5 = (java.io.File) r5
            return r5
        L_0x001b:
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: all -> 0x0032, Exception -> 0x0034
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: all -> 0x0032, Exception -> 0x0034
            r2.<init>(r6)     // Catch: all -> 0x0032, Exception -> 0x0034
            r1.<init>(r2)     // Catch: all -> 0x0032, Exception -> 0x0034
            r1.write(r5)     // Catch: all -> 0x002d, Exception -> 0x0030
        L_0x0029:
            r1.close()     // Catch: IOException -> 0x0046
            goto L_0x0046
        L_0x002d:
            r5 = move-exception
            r0 = r1
            goto L_0x003d
        L_0x0030:
            goto L_0x0036
        L_0x0032:
            r5 = move-exception
            goto L_0x003d
        L_0x0034:
            r1 = r0
        L_0x0036:
            if (r6 == 0) goto L_0x0043
            r6.delete()     // Catch: all -> 0x002d
            r6 = r0
            goto L_0x0043
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()     // Catch: IOException -> 0x0042
        L_0x0042:
            throw r5
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            goto L_0x0029
        L_0x0046:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nit.j(byte[], java.io.File):java.io.File");
    }

    public nit(b bVar) {
        this.f24763a = b.a(bVar);
        Context b2 = b.b(bVar);
        this.b = b2;
        String c = b.c(bVar);
        b.d(bVar);
        long e = b.e(bVar);
        b.f(bVar);
        File b3 = b();
        this.c = b3;
        this.d = new com.taobao.android.ultron.datamodel.cache.db.b(b2, b3, c, e);
    }
}
