package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sb2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BitmapCache";
    public static final ThreadPoolExecutor sThreadPool;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27921a = true;
    public static final int CACHE_SIZE = 54000000;
    public static final LruCache<String, BitmapDrawable> sDrawableCache = new a(CACHE_SIZE);
    public static final LruCache<String, BitmapDrawable> sAlbumDrawableCache = new b(27000000);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends LruCache<String, BitmapDrawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/uikit/album/loader/BitmapCache$1");
        }

        /* renamed from: a */
        public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dc8485f1", new Object[]{this, str, bitmapDrawable})).intValue();
            }
            return sb2.a(str, bitmapDrawable);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends LruCache<String, BitmapDrawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/uikit/album/loader/BitmapCache$2");
        }

        /* renamed from: a */
        public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dc8485f1", new Object[]{this, str, bitmapDrawable})).intValue();
            }
            return sb2.a(str, bitmapDrawable) / 2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f27922a = 1;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable);
            thread.setName("GG-Pub-ThumbnailLoaderThread-" + this.f27922a);
            this.f27922a = this.f27922a + 1;
            return thread;
        }
    }

    static {
        t2o.a(511705583);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 16, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100), new c(), new ThreadPoolExecutor.DiscardPolicy());
        sThreadPool = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ int a(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd185329", new Object[]{str, bitmapDrawable})).intValue();
        }
        return d(str, bitmapDrawable);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("578cc1b0", new Object[0])).booleanValue();
        }
        return f27921a;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
            return;
        }
        f(sAlbumDrawableCache, "sAlbumDrawableCache");
        f(sDrawableCache, "sDrawableCache");
    }

    public static int d(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0cd942f", new Object[]{str, bitmapDrawable})).intValue();
        }
        if (bitmapDrawable instanceof cy0) {
            return bitmapDrawable.getIntrinsicWidth() * bitmapDrawable.getIntrinsicHeight() * ((cy0) bitmapDrawable).r() * 4;
        }
        if (bitmapDrawable == null || bitmapDrawable.getBitmap() == null) {
            return 0;
        }
        return bitmapDrawable.getBitmap().getWidth() * bitmapDrawable.getBitmap().getHeight() * 4;
    }

    public static void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec9af34", new Object[]{new Integer(i)});
            return;
        }
        sAlbumDrawableCache.resize(i);
        sDrawableCache.resize(i);
    }

    public static void f(LruCache<String, BitmapDrawable> lruCache, String str) {
        BitmapDrawable value;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7834ce7", new Object[]{lruCache, str});
            return;
        }
        int size = lruCache.size();
        for (Map.Entry<String, BitmapDrawable> entry : sDrawableCache.snapshot().entrySet()) {
            if (!(entry == null || entry.getValue() == null || (value = entry.getValue()) == null || value.getBitmap() == null || (bitmap = value.getBitmap()) == null || bitmap.isRecycled())) {
                bitmap.recycle();
            }
        }
        lruCache.evictAll();
        int size2 = lruCache.size();
        odg.d(TAG, "AImageLoader： " + str + " : beforeSize=" + size + " ,afterSize=" + size2);
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e1232a", new Object[]{new Boolean(z)});
        } else {
            f27921a = z;
        }
    }
}
