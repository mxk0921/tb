package tb;

import android.os.Build;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThreadPoolExecutor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class iok implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f21482a;

    static {
        t2o.a(970981397);
        t2o.a(970981409);
    }

    public iok(j1r j1rVar, yiw yiwVar) {
        this.f21482a = j1rVar;
    }

    public final void b() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Field field = (Field) declaredMethod2.invoke((Class) declaredMethod.invoke(null, "com.android.okhttp.internal.framed.FramedConnection"), BaseExecutor.EXECUTOR_SUFFIX);
            field.setAccessible(true);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) field.get(null);
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            field.set(null, new VirtualThreadPoolExecutor(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue(), threadPoolExecutor.getThreadFactory()));
            ghh.a("OkHttpTask", "Okhttp FramedConnection", "in virtual thread");
        } catch (Throwable th) {
            ghh.a("replaceFramedConnectionThread", "exception");
            ghh.c(th);
        }
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.f21482a.c("useOkHttpVirtualThread", true)) {
            if (Build.VERSION.SDK_INT > 23) {
                b();
            }
            a();
            ghh.a("OkHttpTask", "succ");
        } else {
            ghh.a("OkHttpTask", "failed");
        }
    }

    public final void a() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            declaredMethod.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "com.android.okhttp.ConnectionPool");
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            declaredMethod2.setAccessible(true);
            Method method = (Method) declaredMethod3.invoke(cls, "getDefault", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            Field field = (Field) declaredMethod2.invoke(cls, BaseExecutor.EXECUTOR_SUFFIX);
            field.setAccessible(true);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) field.get(invoke);
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            field.set(invoke, new VirtualThreadPoolExecutor(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue(), threadPoolExecutor.getThreadFactory()));
            ghh.a("OkHttpTask", "Okhttp ConnectionPool", "in virtual thread");
        } catch (Throwable th) {
            ghh.a("replaceConnectionPoolThread", "exception");
            ghh.c(th);
        }
    }
}
