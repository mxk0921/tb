package tb;

import android.app.ActivityManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.anr.ANRHookListener;
import com.taobao.atools.StaticHook;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ja {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ja d;
    public jab b;

    /* renamed from: a  reason: collision with root package name */
    public final Set<Integer> f21857a = new CopyOnWriteArraySet();
    public final AtomicBoolean c = new AtomicBoolean();

    static {
        t2o.a(393216023);
    }

    public static ja c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ja) ipChange.ipc$dispatch("20834393", new Object[0]);
        }
        if (d == null) {
            synchronized (ja.class) {
                try {
                    if (d == null) {
                        d = new ja();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b1302a", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 26) {
            g5d.b(false, false, new Runnable() { // from class: tb.ha
                @Override // java.lang.Runnable
                public final void run() {
                    ja.this.f();
                }
            });
        }
    }

    public final /* synthetic */ void f() {
        if (!g.d() || !g.c()) {
            b5d.i("AMHooker", "hook closed", new Object[0]);
        } else if (!this.c.getAndSet(true)) {
            try {
                IpChange ipChange = ANRHookListener.$ipChange;
                jab jabVar = (jab) ANRHookListener.class.newInstance();
                this.b = jabVar;
                b5d.i("AMHooker", d5d.POINT_HOOK, "hookListener", jabVar);
            } catch (Throwable th) {
                b5d.h("AMHooker", "hook err", th, new Object[0]);
            }
            e();
        }
    }

    public final void e() {
        try {
            Field m = StaticHook.m(ActivityManager.class, "IActivityManagerSingleton");
            m.setAccessible(true);
            Object obj = m.get(null);
            Class<?> cls = Class.forName("android.util.Singleton");
            final Object invoke = StaticHook.g(cls, "get", new Class[0]).invoke(obj, new Object[0]);
            Class<?> cls2 = Class.forName("android.app.IActivityManager");
            Field i = StaticHook.i(cls, "mInstance");
            i.setAccessible(true);
            i.set(obj, Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: tb.ia
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    Object g;
                    g = ja.this.g(invoke, obj2, method, objArr);
                    return g;
                }
            }));
            b5d.i("AMHooker", "hookImpl success", new Object[0]);
        } catch (Throwable th) {
            b5d.h("AMHooker", "hookImpl err", th, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object g(java.lang.Object r26, java.lang.Object r27, java.lang.reflect.Method r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ja.g(java.lang.Object, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
