package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sre implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f28230a;

        public a(Object obj) {
            this.f28230a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return method.invoke(this.f28230a, objArr);
            } catch (InvocationTargetException e) {
                if ("removeImeSurfaceFromWindowAsync".equals(method.getName())) {
                    return null;
                }
                throw e.getTargetException();
            }
        }
    }

    public sre(g1r g1rVar, loq loqVar) {
    }

    public static Field c(Class cls, String str) throws Exception {
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        declaredMethod.setAccessible(true);
        Field field = (Field) declaredMethod.invoke(cls, str);
        field.setAccessible(true);
        return field;
    }

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i == 31 || i == 32) {
            try {
                b(application);
                xhh.a("hook input succ", new Object[0]);
            } catch (Exception e) {
                xhh.c(e);
                xhh.a("hook input failed", new Object[0]);
            }
        }
        xhh.a("ImmCommand.execute()", new Object[0]);
    }

    public final void b(Context context) throws Exception {
        Object systemService;
        Class<?> cls = Class.forName("com.android.internal.view.IInputMethodManager");
        systemService = context.getSystemService(InputMethodManager.class);
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        Field c = c(InputMethodManager.class, "mService");
        c.set(inputMethodManager, Proxy.newProxyInstance(sre.class.getClassLoader(), new Class[]{cls}, new a(c.get(inputMethodManager))));
    }
}
