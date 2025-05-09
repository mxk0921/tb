package tb;

import android.os.Build;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.webkit.CookieManager;
import com.alibaba.android.patronus.simplecookie.CookieManagerAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class z1n implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CookieManager f32464a = new CookieManagerAdapter();
    public volatile Object b;
    public volatile Object c;
    public final boolean d;
    public final boolean e;

    public z1n(Object obj, boolean z, boolean z2) {
        this.b = obj;
        this.e = z;
        this.d = z2;
    }

    public final Object a() throws Throwable {
        Class cls;
        Method method;
        adk i = adk.i(Class.forName("android.webkit.WebViewFactory"));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 22) {
            cls = (Class) i.d("getFactoryClass").h();
        } else {
            cls = (Class) i.d("getProviderClass").h();
        }
        if (i2 == 21) {
            Object newInstance = cls.newInstance();
            new StringBuilder("Loaded provider: ").append(newInstance);
            return newInstance;
        }
        Class<?> cls2 = Class.forName("android.webkit.WebViewDelegate");
        Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        Object newInstance2 = declaredConstructor.newInstance(new Object[0]);
        if (i2 <= 25) {
            return cls.getConstructor(cls2).newInstance(newInstance2);
        }
        try {
            method = cls.getMethod("create", cls2);
        } catch (Exception unused) {
            method = null;
        }
        try {
            Object invoke = method.invoke(null, newInstance2);
            new StringBuilder("Loaded provider: ").append(invoke);
            return invoke;
        } catch (Exception e) {
            Log.e("ProviderHandler", "error instantiating provider", e);
            throw new AndroidRuntimeException(e);
        }
    }

    public final Object b() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c25355c", new Object[]{this});
        }
        return Proxy.newProxyInstance(z1n.class.getClassLoader(), new Class[]{Class.forName("android.webkit.WebViewFactoryProvider$Statics")}, new gkq());
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        if (this.e && method.getName().equals("getCookieManager")) {
            return this.f32464a;
        }
        if (!this.d || !method.getName().equals("getStatics")) {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = a();
                        }
                    } finally {
                    }
                }
            }
            crashCaughtHeader.addHeaderInfo("ProviderHandler", method.getName());
            return method.invoke(this.b, objArr);
        }
        Log.e("ProviderHandler", "getStatics");
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = b();
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}
