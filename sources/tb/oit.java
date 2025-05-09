package tb;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.tempate.db.FileCache;
import com.taobao.android.dinamicx.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oit {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f i = new d();

    /* renamed from: a  reason: collision with root package name */
    public final String f25414a;
    public final Context b;
    public final File c;
    public final boolean d;
    public final FileCache e;
    public LruCache<String, byte[]> f;
    public f g;
    public final String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25415a;
        public final /* synthetic */ String b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ DinamicTemplate d;
        public final /* synthetic */ ojt e;

        public a(String str, String str2, byte[] bArr, DinamicTemplate dinamicTemplate, ojt ojtVar) {
            this.f25415a = str;
            this.b = str2;
            this.c = bArr;
            this.d = dinamicTemplate;
            this.e = ojtVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/tempate/manager/TemplateCache$1");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            if (oit.this.d) {
                str = this.f25415a;
            } else {
                str = Uri.parse(Uri.decode(this.b)).getLastPathSegment();
            }
            synchronized (oit.class) {
                File file = new File(oit.this.c, str);
                if (file.exists()) {
                    return null;
                }
                oit.a(oit.this, this.c, file, this.d, this.e.b);
                if (file.isFile() && file.length() > 0) {
                    try {
                        oit.this.e.g(this.f25415a, file);
                    } catch (Throwable th) {
                        Log.e(o71.POINT_TEMPLATE_CACHE, "File cache store exception", th);
                    }
                }
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicTemplate f25416a;
        public final /* synthetic */ ojt b;
        public final /* synthetic */ boolean c;

        public b(DinamicTemplate dinamicTemplate, ojt ojtVar, boolean z) {
            this.f25416a = dinamicTemplate;
            this.b = ojtVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (tl7.f()) {
                ym7.a(tl7.TAG, "download template=" + this.f25416a + (((float) this.b.f25435a) / 1000000.0d));
            }
            dn7 d = f65.n().d();
            ojt ojtVar = this.b;
            d.f(ojtVar.b, this.f25416a, this.c, null, ojtVar.f25435a / 1000000.0d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DinamicTemplate f25417a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public c(DinamicTemplate dinamicTemplate, long j, String str, boolean z) {
            this.f25417a = dinamicTemplate;
            this.b = j;
            this.c = str;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (tl7.f()) {
                ym7.a(tl7.TAG, "write template=" + this.f25417a + (((float) this.b) / 1000000.0d));
            }
            f65.n().d().j(this.c, this.f25417a, this.d, null, this.b / 1000000.0d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
            if (r8 == null) goto L_0x009b;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0095 A[Catch: IOException -> 0x0091, TRY_LEAVE, TryCatch #4 {IOException -> 0x0091, blocks: (B:43:0x008d, B:46:0x0095), top: B:52:0x008d }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v13 */
        @Override // tb.oit.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public byte[] loadUrl(java.lang.String r8) {
            /*
                r7 = this;
                r0 = 0
                com.android.alibaba.ip.runtime.IpChange r1 = tb.oit.d.$ipChange
                boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r2 == 0) goto L_0x0018
                java.lang.String r2 = "a53a13a3"
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r0] = r7
                r0 = 1
                r3[r0] = r8
                java.lang.Object r8 = r1.ipc$dispatch(r2, r3)
                byte[] r8 = (byte[]) r8
                return r8
            L_0x0018:
                r1 = 0
                java.net.URL r2 = new java.net.URL     // Catch: all -> 0x0070, Exception -> 0x0074
                r2.<init>(r8)     // Catch: all -> 0x0070, Exception -> 0x0074
                java.net.URLConnection r8 = r2.openConnection()     // Catch: all -> 0x0070, Exception -> 0x0074
                java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch: all -> 0x0070, Exception -> 0x0074
                r2 = 10000(0x2710, float:1.4013E-41)
                r8.setConnectTimeout(r2)     // Catch: all -> 0x0069, Exception -> 0x006c
                r2 = 12000(0x2ee0, float:1.6816E-41)
                r8.setReadTimeout(r2)     // Catch: all -> 0x0069, Exception -> 0x006c
                r8.connect()     // Catch: all -> 0x0069, Exception -> 0x006c
                int r2 = r8.getResponseCode()     // Catch: all -> 0x0069, Exception -> 0x006c
                r3 = 200(0xc8, float:2.8E-43)
                if (r2 == r3) goto L_0x003d
                r8.disconnect()
                return r1
            L_0x003d:
                java.io.InputStream r2 = r8.getInputStream()     // Catch: all -> 0x0069, Exception -> 0x006c
                java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0064, Exception -> 0x0066
                r4 = 4096(0x1000, float:5.74E-42)
                r3.<init>(r4)     // Catch: all -> 0x0064, Exception -> 0x0066
                byte[] r4 = new byte[r4]     // Catch: all -> 0x0055, Exception -> 0x0058
            L_0x004a:
                int r5 = r2.read(r4)     // Catch: all -> 0x0055, Exception -> 0x0058
                r6 = -1
                if (r5 == r6) goto L_0x005a
                r3.write(r4, r0, r5)     // Catch: all -> 0x0055, Exception -> 0x0058
                goto L_0x004a
            L_0x0055:
                r0 = move-exception
                r1 = r3
                goto L_0x0078
            L_0x0058:
                goto L_0x008b
            L_0x005a:
                r3.close()     // Catch: IOException -> 0x0060
                r2.close()     // Catch: IOException -> 0x0060
            L_0x0060:
                r8.disconnect()
                goto L_0x009b
            L_0x0064:
                r0 = move-exception
                goto L_0x0078
            L_0x0066:
                r3 = r1
                goto L_0x008b
            L_0x0069:
                r0 = move-exception
                r2 = r1
                goto L_0x0078
            L_0x006c:
                r2 = r1
            L_0x006e:
                r3 = r2
                goto L_0x008b
            L_0x0070:
                r0 = move-exception
                r8 = r1
                r2 = r8
                goto L_0x0078
            L_0x0074:
                r8 = r1
                r2 = r8
                goto L_0x006e
            L_0x0078:
                if (r1 == 0) goto L_0x0080
                r1.close()     // Catch: IOException -> 0x007e
                goto L_0x0080
            L_0x007e:
                goto L_0x0085
            L_0x0080:
                if (r2 == 0) goto L_0x0085
                r2.close()     // Catch: IOException -> 0x007e
            L_0x0085:
                if (r8 == 0) goto L_0x008a
                r8.disconnect()
            L_0x008a:
                throw r0
            L_0x008b:
                if (r3 == 0) goto L_0x0093
                r3.close()     // Catch: IOException -> 0x0091
                goto L_0x0093
            L_0x0091:
                goto L_0x0098
            L_0x0093:
                if (r2 == 0) goto L_0x0098
                r2.close()     // Catch: IOException -> 0x0091
            L_0x0098:
                if (r8 == 0) goto L_0x009b
                goto L_0x0060
            L_0x009b:
                if (r3 == 0) goto L_0x00a1
                byte[] r1 = r3.toByteArray()
            L_0x00a1:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.oit.d.loadUrl(java.lang.String):byte[]");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f25418a;
        public String b;
        public String c;
        public int d = 8;
        public long e = 4194304;
        public final boolean f = true;
        public String g;

        static {
            t2o.a(444596404);
        }

        public static /* synthetic */ String a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4a6b4173", new Object[]{eVar});
            }
            return eVar.b;
        }

        public static /* synthetic */ Context b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("fd5cc2c6", new Object[]{eVar});
            }
            return eVar.f25418a;
        }

        public static /* synthetic */ String c(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ba4cf7b1", new Object[]{eVar});
            }
            return eVar.c;
        }

        public static /* synthetic */ int d(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e6c13bc3", new Object[]{eVar})).intValue();
            }
            return eVar.d;
        }

        public static /* synthetic */ long e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("adcd22c5", new Object[]{eVar})).longValue();
            }
            return eVar.e;
        }

        public static /* synthetic */ boolean f(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74d909d6", new Object[]{eVar})).booleanValue();
            }
            return eVar.f;
        }

        public static /* synthetic */ String g(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9a10642d", new Object[]{eVar});
            }
            return eVar.g;
        }

        public oit h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oit) ipChange.ipc$dispatch("1ccfb68e", new Object[]{this});
            }
            if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.c)) {
                return new oit(this, null);
            }
            throw new IllegalArgumentException();
        }

        public e i(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("3353d834", new Object[]{this, context});
            }
            this.f25418a = context;
            return this;
        }

        public e j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("543ddf0c", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public e k(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("43917eab", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }

        public e l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("aba7e244", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public e m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("9965f35e", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public e n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("98ae31ab", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
        byte[] loadUrl(String str);
    }

    static {
        t2o.a(444596398);
    }

    public /* synthetic */ oit(e eVar, a aVar) {
        this(eVar);
    }

    public static /* synthetic */ File a(oit oitVar, byte[] bArr, File file, DinamicTemplate dinamicTemplate, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("33583090", new Object[]{oitVar, bArr, file, dinamicTemplate, str});
        }
        return oitVar.n(bArr, file, dinamicTemplate, str);
    }

    public final File b() {
        File f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("dd4d9c17", new Object[]{this});
        }
        if (this.b == null || (f2 = f()) == null) {
            return null;
        }
        File file = new File(f2, this.f25414a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public byte[] c(String str, ojt ojtVar) throws IOException {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("56e964bf", new Object[]{this, str, ojtVar});
        }
        System.currentTimeMillis();
        FileCache.b e2 = this.e.e(str);
        if (e2 != null) {
            bArr = l(e2.b);
            if (bArr != null && bArr.length > 0) {
                this.f.put(str, bArr);
            }
        } else {
            bArr = null;
        }
        System.currentTimeMillis();
        ojtVar.getClass();
        return bArr;
    }

    public byte[] d(String str, ojt ojtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("296102a3", new Object[]{this, str, ojtVar});
        }
        System.currentTimeMillis();
        byte[] bArr = this.f.get(str);
        System.currentTimeMillis();
        ojtVar.getClass();
        StringBuilder sb = new StringBuilder("[getTemplateById #");
        sb.append(str);
        sb.append("] get template from memory.");
        return bArr;
    }

    public final byte[] e(DinamicTemplate dinamicTemplate, String str, String str2, ojt ojtVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e47e567c", new Object[]{this, dinamicTemplate, str, str2, ojtVar});
        }
        long nanoTime = System.nanoTime();
        byte[] loadUrl = this.g.loadUrl(str2);
        long nanoTime2 = System.nanoTime();
        ojtVar.getClass();
        ojtVar.f25435a = nanoTime2 - nanoTime;
        if (loadUrl == null) {
            z = false;
        }
        i(ojtVar, dinamicTemplate, z);
        if (loadUrl == null) {
            return null;
        }
        this.f.put(str, loadUrl);
        new a(str, str2, loadUrl, dinamicTemplate, ojtVar).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        return loadUrl;
    }

    public final File f() {
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
        if (zg5.J2()) {
            com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(this.h);
            f.a aVar = new f.a("Router", "DX_TEMPLATE_CACHE_ERROR", com.taobao.android.dinamicx.f.DXERROR_ROUTER_GET_EXTERNAL_DIR_ERROR);
            aVar.e = "module " + this.h;
            ((ArrayList) fVar.c).add(aVar);
            ic5.p(fVar);
        }
        return null;
    }

    public File g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2d7a9c71", new Object[]{this});
        }
        return this.c;
    }

    public byte[] h(DinamicTemplate dinamicTemplate, String str, String str2, ojt ojtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("761f29da", new Object[]{this, dinamicTemplate, str, str2, ojtVar});
        }
        byte[] d2 = d(str, ojtVar);
        if (d2 != null) {
            return d2;
        }
        try {
            d2 = c(str, ojtVar);
        } catch (IOException unused) {
        }
        if (d2 != null) {
            return d2;
        }
        return e(dinamicTemplate, str, str2, ojtVar);
    }

    public final void i(ojt ojtVar, DinamicTemplate dinamicTemplate, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6159c68d", new Object[]{this, ojtVar, dinamicTemplate, new Boolean(z)});
        } else if (f65.n().d() != null && zm7.a()) {
            zm7.b.a(new b(dinamicTemplate, ojtVar, z));
        }
    }

    public final void j(String str, DinamicTemplate dinamicTemplate, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fbd6ae0", new Object[]{this, str, dinamicTemplate, new Boolean(z), new Long(j)});
        } else if (f65.n().d() != null && zm7.a()) {
            zm7.b.a(new c(dinamicTemplate, j, str, z));
        }
    }

    public final byte[] k(File file) throws IOException {
        int read;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6ee147df", new Object[]{this, file});
        }
        long length = file.length();
        if (length <= 2147483639) {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i3 = (int) length;
            byte[] bArr = new byte[i3];
            while (true) {
                int read2 = fileInputStream.read(bArr, i2, i3 - i2);
                if (read2 > 0) {
                    i2 += read2;
                } else if (read2 < 0 || (read = fileInputStream.read()) < 0) {
                    break;
                } else {
                    if (i3 <= 2147483639 - i3) {
                        i3 = Math.max(i3 << 1, 8192);
                    } else if (i3 != 2147483639) {
                        i3 = 2147483639;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    bArr = Arrays.copyOf(bArr, i3);
                    bArr[i2] = (byte) read;
                    i2++;
                }
            }
            fileInputStream.close();
            if (i3 == i2) {
                return bArr;
            }
            return Arrays.copyOf(bArr, i2);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public byte[] l(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e29bda89", new Object[]{this, file});
        }
        return k(file);
    }

    public void m(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c90e605", new Object[]{this, new Integer(i2)});
        } else {
            this.f = new LruCache<>(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r5 == null) goto L_0x006a;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File n(byte[] r15, java.io.File r16, com.taobao.android.dinamic.tempate.DinamicTemplate r17, java.lang.String r18) {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            com.android.alibaba.ip.runtime.IpChange r2 = tb.oit.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = "23e5b824"
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r14
            r5 = 1
            r4[r5] = r0
            r0 = 2
            r4[r0] = r1
            r0 = 3
            r4[r0] = r17
            r0 = 4
            r4[r0] = r18
            java.lang.Object r0 = r2.ipc$dispatch(r3, r4)
            java.io.File r0 = (java.io.File) r0
            return r0
        L_0x0024:
            long r2 = java.lang.System.nanoTime()
            r4 = 0
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: all -> 0x004e, Exception -> 0x0050
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: all -> 0x004e, Exception -> 0x0050
            r6.<init>(r1)     // Catch: all -> 0x004e, Exception -> 0x0050
            r5.<init>(r6)     // Catch: all -> 0x004e, Exception -> 0x0050
            r5.write(r15)     // Catch: all -> 0x0049, Exception -> 0x004c
            long r6 = java.lang.System.nanoTime()     // Catch: all -> 0x0049, Exception -> 0x004c
            long r12 = r6 - r2
            r11 = 1
            r8 = r14
            r9 = r18
            r10 = r17
            r8.j(r9, r10, r11, r12)     // Catch: all -> 0x0049, Exception -> 0x004c
        L_0x0045:
            r5.close()     // Catch: IOException -> 0x006a
            goto L_0x006a
        L_0x0049:
            r0 = move-exception
            r4 = r5
            goto L_0x006b
        L_0x004c:
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            goto L_0x006b
        L_0x0050:
            r5 = r4
        L_0x0052:
            if (r1 == 0) goto L_0x0058
            r16.delete()     // Catch: all -> 0x0049
            r1 = r4
        L_0x0058:
            long r6 = java.lang.System.nanoTime()     // Catch: all -> 0x0049
            long r12 = r6 - r2
            r11 = 0
            r8 = r14
            r9 = r18
            r10 = r17
            r8.j(r9, r10, r11, r12)     // Catch: all -> 0x0049
            if (r5 == 0) goto L_0x006a
            goto L_0x0045
        L_0x006a:
            return r1
        L_0x006b:
            if (r4 == 0) goto L_0x0070
            r4.close()     // Catch: IOException -> 0x0070
        L_0x0070:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oit.n(byte[], java.io.File, com.taobao.android.dinamic.tempate.DinamicTemplate, java.lang.String):java.io.File");
    }

    public oit(e eVar) {
        this.g = i;
        this.f25414a = e.a(eVar);
        Context b2 = e.b(eVar);
        this.b = b2;
        String c2 = e.c(eVar);
        int d2 = e.d(eVar);
        long e2 = e.e(eVar);
        this.d = e.f(eVar);
        this.h = e.g(eVar);
        File b3 = b();
        this.c = b3;
        this.f = new LruCache<>(d2);
        this.e = new FileCache(b2, b3, c2, e2);
    }
}
