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
public class jcu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile jcu e;
    public static volatile boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public RandomAccessFile f21922a;
    public File b;
    public final ConcurrentHashMap<String, Bitmap> c = new ConcurrentHashMap<>();
    public final LimitedConcurrentHashMap<String, bc2> d = new LimitedConcurrentHashMap<>(5);

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
            fiv.c("Phenix", "TradeCacheManager writeToFile. size:  " + jcu.a(jcu.this).size(), new Object[0]);
            jcu.b(jcu.this);
        }
    }

    static {
        t2o.a(620757135);
    }

    public static /* synthetic */ LimitedConcurrentHashMap a(jcu jcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitedConcurrentHashMap) ipChange.ipc$dispatch("7dfee3a8", new Object[]{jcuVar});
        }
        return jcuVar.d;
    }

    public static /* synthetic */ void b(jcu jcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50c0128", new Object[]{jcuVar});
        } else {
            jcuVar.k();
        }
    }

    public static jcu f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcu) ipChange.ipc$dispatch("8322b7a2", new Object[0]);
        }
        if (e == null) {
            synchronized (jcu.class) {
                try {
                    if (e == null) {
                        e = new jcu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final void c(String str, bc2 bc2Var, RandomAccessFile randomAccessFile) throws IOException {
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

    public final void d(Context context) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02c61df", new Object[]{this, context});
            return;
        }
        this.b = new File(context.getFilesDir(), "phenix_trade_cache");
        this.f21922a = new RandomAccessFile(this.b, "rw");
    }

    public Bitmap e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c8935f4c", new Object[]{this, str, str2});
        }
        if (!f || this.c.isEmpty() || !"32001".equals(str)) {
            return null;
        }
        return this.c.remove(str2);
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!f) {
            try {
                fiv.c("Phenix", "TradeCacheManager buildBitmapInfoMapFromFile start", new Object[0]);
                long currentTimeMillis = System.currentTimeMillis();
                d(context);
                i(this.f21922a, this.c);
                f = true;
                fiv.c("Phenix", "TradeCacheManager buildBitmapInfoMapFromFile finish duration = " + (System.currentTimeMillis() - currentTimeMillis) + ", hashMap size = " + this.c.size(), new Object[0]);
            } catch (Throwable th) {
                fiv.c("Phenix", "TradeCacheManager buildBitmapInfoMapFromFile", th);
            }
        }
    }

    public final void h(RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694ecdd0", new Object[]{this, randomAccessFile});
            return;
        }
        randomAccessFile.seek(0L);
        randomAccessFile.writeInt(0);
    }

    public final void i(RandomAccessFile randomAccessFile, ConcurrentHashMap<String, Bitmap> concurrentHashMap) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134eb9b", new Object[]{this, randomAccessFile, concurrentHashMap});
        } else if (randomAccessFile != null && randomAccessFile.length() > 0) {
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
            }
            randomAccessFile.seek(0L);
            int readInt = randomAccessFile.readInt();
            for (int i = 0; i < readInt; i++) {
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

    public void j(String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab2ccb8", new Object[]{this, str, str2, bitmap});
        } else if (bitmap != null && !TextUtils.isEmpty(str2)) {
            try {
                if ("32001".equals(str)) {
                    ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
                    bitmap.copyPixelsToBuffer(allocate);
                    this.d.put(str2, new bc2(bitmap.getWidth(), bitmap.getHeight(), bitmap.getByteCount(), bitmap.getConfig().toString(), allocate.array()));
                    fiv.c("Phenix", "TradeCacheManager saveBitmapToCache. bizId: " + str + " key: " + str2, new Object[0]);
                    lt2.b(new a());
                }
            } catch (Throwable th) {
                fiv.c("Phenix", "TradeCacheManager saveBitmapToCache. save bitmap error" + th.getMessage(), new Object[0]);
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7bedca", new Object[]{this});
            return;
        }
        try {
            File file = this.b;
            if (file != null && file.exists()) {
                this.b.delete();
            }
            d(s0m.B().b());
            l(this.d, this.f21922a);
        } catch (Throwable th) {
            fiv.c("Phenix", "TradeCacheManager resultImage. saveBitmapToFile" + th.getMessage(), new Object[0]);
        }
    }

    public final void l(ConcurrentHashMap<String, bc2> concurrentHashMap, RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8636b1c", new Object[]{this, concurrentHashMap, randomAccessFile});
        } else if (concurrentHashMap != null && !concurrentHashMap.isEmpty() && randomAccessFile != null) {
            h(randomAccessFile);
            for (Map.Entry<String, bc2> entry : concurrentHashMap.entrySet()) {
                c(entry.getKey(), entry.getValue(), randomAccessFile);
            }
        }
    }
}
