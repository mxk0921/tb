package tb;

import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.java.JSRuntimeException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gsf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dqf f20191a;
    public final lpf b;
    public final Map<a, Object> c = new WeakHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final dqf f20192a;
        public yrf b;
        public final String c;

        static {
            t2o.a(921698328);
        }

        public a(dqf dqfVar, yrf yrfVar, String str) {
            this.f20192a = dqfVar;
            this.b = yrfVar;
            this.c = str;
        }

        public final Object a(Method method, Object[] objArr) {
            ksf[] ksfVarArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("bbf43db1", new Object[]{this, method, objArr});
            }
            ye8 ye8Var = new ye8(this.f20192a.k());
            try {
                ksf y = this.b.y(this.f20192a, method.getName());
                if (y == null) {
                    throw new RuntimeException("No JS method named \"" + method.getName() + "\" in \"" + this.c + "\"");
                } else if (y instanceof oqf) {
                    kqf g = this.f20192a.g();
                    if (g != null) {
                        a0y.o("Clear previous pending JS exception: " + g.b(this.f20192a));
                        a0y.o("JS stack: " + g.d(this.f20192a));
                        g.delete();
                    }
                    oqf oqfVar = (oqf) y;
                    if (objArr != null) {
                        ksfVarArr = new ksf[objArr.length];
                        int length = objArr.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            ksfVarArr[i2] = gsf.a(gsf.this).D(this.f20192a, objArr[i]);
                            i++;
                            i2++;
                        }
                    } else {
                        ksfVarArr = null;
                    }
                    ksf M = oqfVar.M(this.f20192a, this.b, ksfVarArr);
                    y.delete();
                    if (ksfVarArr != null) {
                        for (ksf ksfVar : ksfVarArr) {
                            if (ksfVar != null) {
                                ksfVar.delete();
                            }
                        }
                    }
                    if (this.f20192a.q()) {
                        if (M != null) {
                            M.delete();
                        }
                        dqf dqfVar = this.f20192a;
                        throw new JSRuntimeException(dqfVar, dqfVar.g());
                    }
                    Object F = gsf.a(gsf.this).F(this.f20192a, M);
                    if (M != null) {
                        M.delete();
                    }
                    ye8Var.c();
                    return F;
                } else {
                    y.delete();
                    throw new RuntimeException("\"" + method.getName() + "\" in \"" + this.c + "\" is not a function");
                }
            } catch (Throwable th) {
                ye8Var.c();
                throw th;
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
                return;
            }
            yrf yrfVar = this.b;
            if (yrfVar != null) {
                yrfVar.delete();
                this.b = null;
            }
        }

        public void finalize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            if (this.b != null) {
                gsf.a(gsf.this).H(this.b);
                this.b = null;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            dqf dqfVar = this.f20192a;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            try {
                JSEngine k = dqfVar.k();
                if (k.isDisposed()) {
                    throw new RuntimeException("JSEngine \"" + k.getEmbedderName() + "\" has been disposed");
                } else if (dqfVar.r()) {
                    throw new RuntimeException("JSContext {" + dqfVar.o() + ", id " + dqfVar.i() + "} has been disposed");
                } else if (this.b != null) {
                    return a(method, objArr);
                } else {
                    throw new RuntimeException("JSIProxy \"" + this.c + "\" has been detached");
                }
            } catch (Throwable th) {
                vl8 f = dqfVar.f();
                if (f == null || !f.onJSSupportException(dqfVar, th)) {
                    throw th;
                }
                Class<?> returnType = method.getReturnType();
                if (returnType == Void.TYPE || !returnType.isPrimitive()) {
                    return null;
                }
                if (returnType == Boolean.TYPE) {
                    return Boolean.FALSE;
                }
                if (returnType == Integer.TYPE || returnType == Long.TYPE) {
                    return 0;
                }
                if (returnType == Float.TYPE || returnType == Double.TYPE) {
                    return 0;
                }
                if (returnType == Short.TYPE) {
                    return (short) 0;
                }
                if (returnType == Character.TYPE) {
                    return (char) 0;
                }
                return returnType == Byte.TYPE ? (byte) 0 : null;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "JSIProxy@" + this.c + "@" + Integer.toHexString(hashCode());
        }
    }

    static {
        t2o.a(921698327);
    }

    public gsf(dqf dqfVar, lpf lpfVar) {
        this.f20191a = dqfVar;
        this.b = lpfVar;
    }

    public static /* synthetic */ lpf a(gsf gsfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpf) ipChange.ipc$dispatch("628e9408", new Object[]{gsfVar});
        }
        return gsfVar.b;
    }

    public <T> T b(yrf yrfVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("37067551", new Object[]{this, yrfVar, cls});
        }
        return (T) c(this.f20191a, yrfVar, cls.getName(), cls);
    }

    public final <T> T c(dqf dqfVar, yrf yrfVar, String str, Class<T> cls) {
        Throwable th;
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("606b1766", new Object[]{this, dqfVar, yrfVar, str, cls});
        }
        T t = null;
        try {
            aVar = new a(dqfVar, yrfVar, str);
            try {
                try {
                    T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, aVar);
                    try {
                        ((WeakHashMap) this.c).put(aVar, null);
                        if (t2 == null) {
                            aVar.b();
                        }
                        return t2;
                    } catch (Throwable th2) {
                        th = th2;
                        t = t2;
                        if (t == null && aVar != null) {
                            aVar.b();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            aVar = null;
        }
    }

    public <T> T d(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3e8a6d3c", new Object[]{this, str, cls});
        }
        ye8 ye8Var = new ye8(this.f20191a.k());
        yrf yrfVar = null;
        try {
            yrfVar = this.f20191a.p();
            return (T) e(this.f20191a, yrfVar, str, cls);
        } finally {
            if (yrfVar != null) {
                yrfVar.delete();
            }
            ye8Var.c();
        }
    }

    public final <T> T e(dqf dqfVar, yrf yrfVar, String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("11b86f8a", new Object[]{this, dqfVar, yrfVar, str, cls});
        }
        ksf y = yrfVar.y(dqfVar, str);
        if (y == null) {
            return null;
        }
        if (y instanceof yrf) {
            return (T) c(dqfVar, (yrf) y, str, cls);
        }
        y.delete();
        return null;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        for (a aVar : ((WeakHashMap) this.c).keySet()) {
            aVar.b();
        }
        ((WeakHashMap) this.c).clear();
    }
}
