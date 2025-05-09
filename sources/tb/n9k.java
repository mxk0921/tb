package tb;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n9k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f24593a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f24594a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Runnable f24595a;

            public a(Runnable runnable) {
                this.f24595a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    this.f24595a.run();
                } catch (WindowManager.BadTokenException unused) {
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.n9k$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class HandlerC1005b extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Handler f24596a;

            public HandlerC1005b(Handler handler) {
                this.f24596a = handler;
            }

            public static /* synthetic */ Object ipc$super(HandlerC1005b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/toast/NotificationManager7$ToastInvocationHandler$ToastHandlerProxy");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                try {
                    this.f24596a.handleMessage(message);
                } catch (WindowManager.BadTokenException unused) {
                }
            }
        }

        public final Handler a(Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("cbfb000a", new Object[]{this, handler});
            }
            return new HandlerC1005b(handler);
        }

        public final Runnable b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("92a67595", new Object[]{this, runnable});
            }
            return new a(runnable);
        }

        public final void c(Object obj) {
            Class<?> cls = obj.getClass();
            if ("android.widget.Toast$TN".equals(cls.getName())) {
                try {
                    int i = Build.VERSION.SDK_INT;
                    if (i == 25) {
                        Field declaredField = cls.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(obj, a((Handler) declaredField.get(obj)));
                    } else if (i == 24) {
                        Field declaredField2 = cls.getDeclaredField("mShow");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj, b((Runnable) declaredField2.get(obj)));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2;
            if ("enqueueToast".equals(method.getName()) && objArr.length == 3 && (obj2 = objArr[1]) != null) {
                c(obj2);
            }
            try {
                return method.invoke(this.f24594a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        }

        public b(Object obj) {
            this.f24594a = obj;
        }
    }

    public void b() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89332e2f", new Object[]{this});
            return;
        }
        if (!f24593a && ((i = Build.VERSION.SDK_INT) == 25 || i == 24)) {
            a();
        }
        f24593a = true;
    }

    public final void a() {
        try {
            Class<?> cls = Class.forName("android.app.INotificationManager");
            Method declaredMethod = Toast.class.getDeclaredMethod("getService", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = Toast.class.getDeclaredField("sService");
            declaredField.setAccessible(true);
            declaredField.set(Toast.class, Proxy.newProxyInstance(Toast.class.getClassLoader(), new Class[]{cls}, new b(invoke)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
