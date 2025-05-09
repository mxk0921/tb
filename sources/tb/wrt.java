package tb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wrt {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f30880a = Executors.newSingleThreadExecutor();
    public static final Handler b = new Handler(Looper.getMainLooper());

    static {
        t2o.a(612368431);
    }

    public static void a(Runnable runnable) {
        f30880a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        b.post(runnable);
    }
}
