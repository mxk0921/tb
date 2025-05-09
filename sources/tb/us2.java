package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class us2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile us2 i;
    public static volatile boolean j = false;

    /* renamed from: a  reason: collision with root package name */
    public RandomAccessFile f29584a;
    public File b;
    public final ConcurrentSkipListMap<String, Bitmap> c = new ConcurrentSkipListMap<>();
    public final ConcurrentSkipListMap<String, bc2> d = new ConcurrentSkipListMap<>();
    public final AtomicInteger e = new AtomicInteger(0);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);

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
            } else {
                us2.a(us2.this);
            }
        }
    }

    static {
        t2o.a(620757124);
    }

    public static /* synthetic */ void a(us2 us2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a856af6d", new Object[]{us2Var});
        } else {
            us2Var.k();
        }
    }

    public static us2 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (us2) ipChange.ipc$dispatch("3eaf2b3a", new Object[0]);
        }
        if (i == null) {
            synchronized (us2.class) {
                try {
                    if (i == null) {
                        i = new us2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public final void b(String str, bc2 bc2Var, RandomAccessFile randomAccessFile) throws IOException {
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

    public final void c(Context context) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02c61df", new Object[]{this, context});
            return;
        }
        this.b = new File(context.getFilesDir(), "phenix_home_cache");
        this.f29584a = new RandomAccessFile(this.b, "rw");
    }

    public Bitmap d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c8935f4c", new Object[]{this, str, str2});
        }
        if (j && this.c.size() > 0) {
            if (this.f.get() <= 120 && "homepage-ads".equals(str)) {
                return this.c.remove(str2);
            }
            if (this.f.get() <= 120) {
                this.f.getAndAdd(1);
            }
            if (this.f.get() >= 120 && this.c.size() > 0 && this.h.compareAndSet(false, true)) {
                this.c.clear();
            }
        }
        return null;
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e79789b", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : this.c.keySet()) {
            if (!TextUtils.isEmpty(str2) && str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!j) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                c(context);
                i(this.f29584a, this.c);
                j = true;
                fiv.c("Phenix", "CacheManager buildBitmapInfoMapFromFile finish duration = " + (System.currentTimeMillis() - currentTimeMillis) + ", hashMap size = " + this.c.size(), new Object[0]);
            } catch (Throwable unused) {
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

    public final void i(RandomAccessFile randomAccessFile, ConcurrentSkipListMap<String, Bitmap> concurrentSkipListMap) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a28b58a", new Object[]{this, randomAccessFile, concurrentSkipListMap});
        } else if (randomAccessFile != null && randomAccessFile.length() > 0) {
            if (concurrentSkipListMap == null) {
                concurrentSkipListMap = new ConcurrentSkipListMap<>();
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
                concurrentSkipListMap.put(readUTF, createBitmap);
            }
        }
    }

    public void j(String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab2ccb8", new Object[]{this, str, str2, bitmap});
        } else if (bitmap != null && !TextUtils.isEmpty(str2) && !this.g.get()) {
            try {
                if (this.e.get() <= 120 && this.d.size() < 40 && "homepage-ads".equals(str)) {
                    ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
                    bitmap.copyPixelsToBuffer(allocate);
                    this.d.put(str2, new bc2(bitmap.getWidth(), bitmap.getHeight(), bitmap.getByteCount(), bitmap.getConfig().toString(), allocate.array()));
                } else if (this.e.get() < 120) {
                    this.e.getAndAdd(1);
                }
                if ((this.e.get() < 120 && this.d.size() < 40) || !this.g.compareAndSet(false, true)) {
                    return;
                }
                if (jjo.b()) {
                    drt.a(new a());
                } else {
                    k();
                }
            } catch (Throwable unused) {
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
            fiv.c("Phenix", "CacheManager saveBitmapToFile. path=phenix_home_cache, size =  " + this.d.size(), new Object[0]);
            c(s0m.B().b());
            l(this.d, this.f29584a);
            this.d.clear();
        } catch (Throwable unused) {
        }
    }

    public final void l(ConcurrentSkipListMap<String, bc2> concurrentSkipListMap, RandomAccessFile randomAccessFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5a07cb", new Object[]{this, concurrentSkipListMap, randomAccessFile});
        } else if (concurrentSkipListMap != null && concurrentSkipListMap.size() != 0 && randomAccessFile != null) {
            h(randomAccessFile);
            for (Map.Entry<String, bc2> entry : concurrentSkipListMap.entrySet()) {
                b(entry.getKey(), entry.getValue(), randomAccessFile);
            }
        }
    }
}
