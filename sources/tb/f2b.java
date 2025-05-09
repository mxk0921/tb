package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.LimitedConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f2b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_PAGE_ADS_KEY = "home-page-ads";
    public static final String HOME_PAGE_ICONS_KEY = "home-page-icon";
    public static volatile f2b i;
    public static volatile boolean j = false;

    /* renamed from: a  reason: collision with root package name */
    public RandomAccessFile f18959a;
    public RandomAccessFile b;
    public File c;
    public File d;
    public final ConcurrentHashMap<String, Bitmap> e = new ConcurrentHashMap<>();
    public final LimitedConcurrentHashMap<String, bc2> f = new LimitedConcurrentHashMap<>(25);
    public final ConcurrentHashMap<String, Bitmap> g = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, bc2> h = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            f2b.a(f2b.this, "phenix_home_cache", true);
            if (!f2b.b(f2b.this).isEmpty()) {
                f2b.b(f2b.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            f2b.a(f2b.this, "phenix_home_icon", false);
            if (!f2b.c(f2b.this).isEmpty()) {
                f2b.c(f2b.this).clear();
            }
        }
    }

    static {
        t2o.a(620757128);
    }

    public static /* synthetic */ void a(f2b f2bVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b637866b", new Object[]{f2bVar, str, new Boolean(z)});
        } else {
            f2bVar.o(str, z);
        }
    }

    public static /* synthetic */ ConcurrentHashMap b(f2b f2bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("dd628d26", new Object[]{f2bVar});
        }
        return f2bVar.e;
    }

    public static /* synthetic */ ConcurrentHashMap c(f2b f2bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("ad22c0c5", new Object[]{f2bVar});
        }
        return f2bVar.g;
    }

    public static f2b h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f2b) ipChange.ipc$dispatch("8ead93cc", new Object[0]);
        }
        if (i == null) {
            synchronized (f2b.class) {
                try {
                    if (i == null) {
                        i = new f2b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public final void d(String str, bc2 bc2Var, RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f894a5", new Object[]{this, str, bc2Var, randomAccessFile});
            return;
        }
        randomAccessFile.seek(0L);
        int readInt = randomAccessFile.readInt();
        randomAccessFile.seek(0L);
        randomAccessFile.writeInt(readInt + 1);
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.writeUTF(str);
        randomAccessFile.writeInt(bc2Var.f16311a);
        randomAccessFile.writeInt(bc2Var.b);
        randomAccessFile.writeUTF(bc2Var.d);
        randomAccessFile.writeInt(bc2Var.c);
        randomAccessFile.write(bc2Var.e);
    }

    public final void e(Context context, String str) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db409701", new Object[]{this, context, str});
            return;
        }
        this.c = new File(context.getFilesDir(), str);
        this.f18959a = new RandomAccessFile(this.c, "rw");
    }

    public final void f(Context context, String str) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d2626b", new Object[]{this, context, str});
            return;
        }
        this.d = new File(context.getFilesDir(), str);
        this.b = new RandomAccessFile(this.d, "rw");
    }

    public Bitmap g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c8935f4c", new Object[]{this, str, str2});
        }
        if (!j) {
            return null;
        }
        if (TextUtils.equals("home-page-ads", str)) {
            if (this.e.size() <= 0) {
                return null;
            }
            return this.e.get(str2);
        } else if (!TextUtils.equals("home-page-icon", str) || this.g.size() <= 0) {
            return null;
        } else {
            return this.g.get(str2);
        }
    }

    public boolean i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2504aa5", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str2) && (TextUtils.equals(str, "home-page-ads") || TextUtils.equals(str, "home-page-icon"))) {
                if (TextUtils.equals(str, "home-page-icon")) {
                    if (this.g.isEmpty()) {
                        return false;
                    }
                    for (String str3 : this.g.keySet()) {
                        if (!TextUtils.isEmpty(str3) && str3.contains(str2)) {
                            return true;
                        }
                    }
                } else if (this.e.isEmpty()) {
                    return false;
                } else {
                    for (String str4 : this.e.keySet()) {
                        if (!TextUtils.isEmpty(str4) && str4.contains(str2)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void k(RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694ecdd0", new Object[]{this, randomAccessFile});
            return;
        }
        randomAccessFile.seek(0L);
        randomAccessFile.writeInt(0);
    }

    public final void l(RandomAccessFile randomAccessFile, ConcurrentHashMap<String, Bitmap> concurrentHashMap) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134eb9b", new Object[]{this, randomAccessFile, concurrentHashMap});
        } else if (randomAccessFile != null && randomAccessFile.length() > 0) {
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
            }
            randomAccessFile.seek(0L);
            int readInt = randomAccessFile.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                String readUTF = randomAccessFile.readUTF();
                int readInt2 = randomAccessFile.readInt();
                int readInt3 = randomAccessFile.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(randomAccessFile.readUTF());
                byte[] bArr = new byte[randomAccessFile.readInt()];
                randomAccessFile.readFully(bArr);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt2, readInt3, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                concurrentHashMap.put(readUTF, createBitmap);
            }
        }
    }

    public void m(String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab2ccb8", new Object[]{this, str, str2, bitmap});
        } else if (bitmap != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            boolean equals = "home-page-ads".equals(str);
            boolean equals2 = "home-page-icon".equals(str);
            if (equals || equals2) {
                ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
                bitmap.copyPixelsToBuffer(allocate);
                bc2 bc2Var = new bc2(bitmap.getWidth(), bitmap.getHeight(), bitmap.getByteCount(), bitmap.getConfig().toString(), allocate.array());
                try {
                    if (equals) {
                        this.f.put(str2, bc2Var);
                        lt2.a(new a(), 3L);
                    } else {
                        this.h.put(str2, bc2Var);
                        lt2.a(new b(), 3L);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void n(ConcurrentHashMap<String, bc2> concurrentHashMap, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b236c72", new Object[]{this, concurrentHashMap, str, bitmap});
            return;
        }
        if (bitmap != null && !TextUtils.isEmpty(str)) {
            try {
                ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
                bitmap.copyPixelsToBuffer(allocate);
                concurrentHashMap.put(str, new bc2(bitmap.getWidth(), bitmap.getHeight(), bitmap.getByteCount(), bitmap.getConfig().toString(), allocate.array()));
            } catch (Throwable unused) {
            }
        }
    }

    public final void o(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aedc40", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            if (z) {
                File file = this.c;
                if (file != null && file.exists()) {
                    this.c.delete();
                }
                e(s0m.B().b(), str);
                fiv.c("Phenix", "HomePageCache saveBitmapToAdFile. path=" + str + ", size =  " + this.f.size(), new Object[0]);
                p(this.f, this.f18959a);
                return;
            }
            File file2 = this.d;
            if (file2 != null && file2.exists()) {
                this.d.delete();
            }
            f(s0m.B().b(), str);
            fiv.c("Phenix", "HomePageCache saveBitmapToIconFile. path=" + str + ", size =  " + this.h.size(), new Object[0]);
            p(this.h, this.b);
        } catch (Throwable unused) {
        }
    }

    public final void p(ConcurrentHashMap<String, bc2> concurrentHashMap, RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8636b1c", new Object[]{this, concurrentHashMap, randomAccessFile});
        } else if (concurrentHashMap != null && concurrentHashMap.size() != 0 && randomAccessFile != null) {
            k(randomAccessFile);
            for (Map.Entry<String, bc2> entry : concurrentHashMap.entrySet()) {
                d(entry.getKey(), entry.getValue(), randomAccessFile);
            }
        }
    }

    public void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!j) {
            try {
                fiv.c("Phenix", "HomePageCacheManager buildBitmapInfoMapFromFile start", new Object[0]);
                sz8.b("phenix", "home_page_ads");
                long currentTimeMillis = System.currentTimeMillis();
                e(context, "phenix_home_cache");
                l(this.f18959a, this.e);
                sz8.e();
                sz8.b("phenix", "home_page_icons");
                long currentTimeMillis2 = System.currentTimeMillis();
                f(context, "phenix_home_icon");
                l(this.b, this.g);
                for (Map.Entry<String, Bitmap> entry : this.g.entrySet()) {
                    n(this.h, entry.getKey(), entry.getValue());
                }
                sz8.e();
                j = true;
                fiv.c("Phenix", "HomePageCacheManager buildBitmapInfoMapFromFile t1 = " + (System.currentTimeMillis() - currentTimeMillis) + ", t2 = " + (System.currentTimeMillis() - currentTimeMillis2) + ", AdSize = " + this.e.size() + ", iconSize = " + this.g.size(), new Object[0]);
            } catch (Throwable th) {
                fiv.c("Phenix", "HomePageCacheManager buildBitmapInfoMapFromFile " + th.getMessage(), new Object[0]);
            }
        }
    }
}
