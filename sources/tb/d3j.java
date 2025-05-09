package tb;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import com.heytap.mspsdk.proxy.b;
import com.heytap.mspsdk.receiver.a;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.vsx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d3j {
    public static final String TAG = "MspSdk";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f17550a = new AtomicBoolean(false);

    static {
        t2o.a(253755405);
    }

    public static <T, R extends T> T a(R r) {
        b bVar = b.a.f5214a;
        bVar.getClass();
        if (r != null) {
            Class<?>[] interfaces = r.getClass().getInterfaces();
            if (interfaces == null || interfaces.length <= 0) {
                throw new RuntimeException("The instance of 'target' doesn't implement an interface, please add 'makeInterface=true' at your moudle's BridgeTarget annotation");
            }
            c3j.f(b9j.TAG, "interfaces length " + interfaces.length);
            for (Class<?> cls : interfaces) {
                c3j.f(b9j.TAG, "interfaces clazz name is ".concat(cls.getSimpleName()));
            }
            return (T) Proxy.newProxyInstance(r.getClass().getClassLoader(), new Class[]{r.getClass().getInterfaces()[0]}, new b.C0264b(r));
        }
        throw new RuntimeException("The instance of 'target' is null");
    }

    public static synchronized void b(Context context) {
        synchronized (d3j.class) {
            AtomicBoolean atomicBoolean = f17550a;
            if (atomicBoolean.get()) {
                c3j.f(TAG, "initing");
                return;
            }
            c3j.f(TAG, "init start");
            rwx f = rwx.f();
            Context applicationContext = context.getApplicationContext();
            if (f != null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                rwx.b = applicationContext2;
                ((Application) applicationContext2).registerActivityLifecycleCallbacks(vsx.a.f30236a);
                rwx.c = new a();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.heytap.mspsdk.start_intent");
                rwx.b.registerReceiver(rwx.c, intentFilter);
                rwx.d.set(true);
                atomicBoolean.set(true);
                c3j.f(TAG, "init finish, version:2.0.101.8");
                return;
            }
            throw null;
        }
    }
}
