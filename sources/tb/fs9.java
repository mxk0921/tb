package tb;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import io.unicorn.adapter.muise.UnicornMuiseJNI;
import io.unicorn.embedding.android.AndroidTouchProcessor;
import io.unicorn.embedding.android.RenderMode;
import io.unicorn.embedding.android.TransparencyMode;
import io.unicorn.embedding.android.UnicornSurfaceView;
import io.unicorn.embedding.android.UnicornView;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.network.ExternalAdapterNetwork;
import io.unicorn.plugin.platform.PlatformViewsController;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class fs9 {
    public static volatile boolean e = false;
    public static final Object f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f19497a = false;
    public volatile d b;
    public as9 c;
    public FutureTask<c> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FlutterJNI.nativePrefetchDefaultFontManager(w4x.h());
                Map<Integer, Integer> map = f5x.builtinDarkModeColorMaps;
                if (map.size() > 0) {
                    FlutterJNI.nativeSetDarkModeColorMap(map);
                }
                fs9.f();
            } catch (Throwable th) {
                dwh.i(th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Callable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19499a;

        public b(fs9 fs9Var, Context context) {
            this.f19499a = context;
        }

        /* renamed from: a */
        public c call() {
            Context context = this.f19499a;
            return new c(avl.b(context), avl.a(context), context.getCacheDir().getPath(), null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f19500a;
        public final String b;
        public final String c;

        static {
            t2o.a(945815700);
        }

        public /* synthetic */ c(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }

        public c(String str, String str2, String str3) {
            this.f19500a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class d {
        static {
            t2o.a(945815701);
        }
    }

    static {
        t2o.a(945815694);
    }

    public static void d() {
        synchronized (f) {
            if (!e) {
                if (0 < 3) {
                    es9.b().getClass();
                    System.loadLibrary("unicorn");
                    e = true;
                }
            }
        }
    }

    public static Object e() {
        return f;
    }

    public static void f() {
        UnicornView.preloadClass();
        io.unicorn.embedding.engine.a.y();
        bs9.b();
        PlatformViewsController.a0();
        p5m.b();
        n40.a();
        io.unicorn.embedding.android.a.a();
        ysi.l();
        ehv.h();
        khv.e();
        m40.f();
        t42.c();
        jqq.e();
        drf.g();
        crf.c();
        ke8.g();
        wsi.e();
        png.e();
        hs9.m();
        f5w.f();
        f7w.h();
        o47.a();
        m5m.c();
        n5m.c();
        dhv.R();
        RenderMode.values();
        TransparencyMode.values();
        zr9.x();
        t5m.b();
        UnicornSurfaceView.preloadClass();
        AndroidTouchProcessor.g();
        hdh.d("init", "preload Class");
    }

    public void b(Context context, String[] strArr) {
        if (!this.f19497a) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.b != null) {
                try {
                    c cVar = this.d.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    arrayList.add("--icu-native-lib-path=" + this.c.f15974a + File.separator + "libunicorn.so");
                    if (strArr != null) {
                        Collections.addAll(arrayList, strArr);
                    }
                    arrayList.add("--cache-dir-path=" + cVar.b);
                    this.b.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    es9.b().getClass();
                    FlutterJNI.nativeInit(context, (String[]) arrayList.toArray(new String[0]), cVar.c, cVar.f19500a, cVar.b, uptimeMillis);
                    this.f19497a = true;
                } catch (Exception e2) {
                    dwh.g("FlutterLoader", "Flutter initialization failed.", e2);
                    throw new RuntimeException(e2);
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        }
    }

    public boolean c() {
        return this.f19497a;
    }

    public void g(Context context) {
        oow oowVar;
        if (this.b == null) {
            Context applicationContext = context.getApplicationContext();
            this.b = new d();
            this.c = ga1.b(applicationContext);
            if (Build.VERSION.SDK_INT >= 23) {
                oowVar = oow.f((DisplayManager) applicationContext.getSystemService("display"));
            } else {
                oowVar = oow.e(((WindowManager) applicationContext.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRefreshRate());
            }
            oowVar.g();
            d();
            UnicornMuiseJNI.initAfterSDKLoad();
            FlutterJNI.onLoadedLibrary();
            FlutterJNI.updateRefreshRate();
            ExternalAdapterNetwork.instance().installDefaultProvider();
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a());
            FutureTask<c> futureTask = new FutureTask<>(new b(this, applicationContext));
            this.d = futureTask;
            futureTask.run();
        }
    }
}
