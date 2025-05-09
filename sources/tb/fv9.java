package tb;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fv9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, Typeface> f19550a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public CountDownLatch f19551a;
        public Typeface b;
        public String c;
        public String d;
        public int e;

        static {
            t2o.a(444597069);
        }

        public b(CountDownLatch countDownLatch, String str, int i, String str2) {
            this.f19551a = countDownLatch;
            this.c = str;
            this.e = i;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.b = Typeface.create(Typeface.createFromAsset(DinamicXEngine.x().getAssets(), this.c), this.e);
                fv9.a(fv9.this).put(this.d, this.b);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final fv9 f19552a = new fv9();

        static {
            t2o.a(444597070);
        }

        public static /* synthetic */ fv9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fv9) ipChange.ipc$dispatch("e2ec073e", new Object[0]);
            }
            return f19552a;
        }
    }

    static {
        t2o.a(444597067);
    }

    public static /* synthetic */ LruCache a(fv9 fv9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("cc40f46e", new Object[]{fv9Var});
        }
        return fv9Var.f19550a;
    }

    public static final fv9 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fv9) ipChange.ipc$dispatch("a79d8d18", new Object[0]);
        }
        return c.a();
    }

    public Typeface b(String str, int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("103dbaa", new Object[]{this, str, new Integer(i)});
        }
        String str2 = str + i;
        Typeface typeface = this.f19550a.get(str2);
        if (typeface != null) {
            return typeface;
        }
        if (Build.VERSION.SDK_INT > 28) {
            Typeface create = Typeface.create(Typeface.createFromAsset(DinamicXEngine.x().getAssets(), str), i);
            this.f19550a.put(str2, create);
            return create;
        } else if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            Typeface create2 = Typeface.create(Typeface.createFromAsset(DinamicXEngine.x().getAssets(), str), i);
            this.f19550a.put(str2, create2);
            return create2;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            b bVar = new b(countDownLatch, str, i, str2);
            jb6.p(bVar);
            countDownLatch.await(2L, TimeUnit.SECONDS);
            return bVar.b;
        }
    }

    public Typeface d(int i, boolean z) {
        Typeface create;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("b916f913", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        String str = "default" + i + z;
        Typeface typeface = this.f19550a.get(str);
        if (typeface != null) {
            return typeface;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        create = Typeface.create(null, i, z);
        this.f19550a.put(str, create);
        return create;
    }

    public fv9() {
        this.f19550a = null;
        this.f19550a = new LruCache<>(5);
    }
}
