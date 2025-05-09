package com.alibaba.android.split.core.splitcompat;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Reflector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f2236a;
    public Object b;
    public Constructor c;
    public Field d;
    public Method e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ReflectedException extends Exception {
        static {
            t2o.a(676331579);
        }

        public ReflectedException(String str) {
            super(str);
        }

        public ReflectedException(String str, Throwable th) {
            super(str, th);
        }
    }

    static {
        t2o.a(676331577);
    }

    public static Reflector n(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("a96e3a33", new Object[]{cls});
        }
        Reflector reflector = new Reflector();
        reflector.f2236a = cls;
        return reflector;
    }

    public static Reflector o(String str) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("dc2f0ca", new Object[]{str});
        }
        return p(str, true, Reflector.class.getClassLoader());
    }

    public static Reflector p(String str, boolean z, ClassLoader classLoader) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("87c78d74", new Object[]{str, new Boolean(z), classLoader});
        }
        try {
            return n(Class.forName(str, z, classLoader));
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public static Reflector s(Object obj) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("25a54ba9", new Object[]{obj});
        }
        return n(obj.getClass()).a(obj);
    }

    public Reflector a(Object obj) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("82170fd2", new Object[]{this, obj});
        }
        this.b = e(obj);
        return this;
    }

    public <R> R b(Object... objArr) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("9b8d0586", new Object[]{this, objArr});
        }
        return (R) c(this.b, objArr);
    }

    public <R> R c(Object obj, Object... objArr) throws ReflectedException {
        d(obj, this.e, "Method");
        try {
            return (R) this.e.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw new ReflectedException("Oops!", e.getTargetException());
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public void d(Object obj, Member member, String str) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782a604", new Object[]{this, obj, member, str});
        } else if (member == null) {
            throw new ReflectedException(str + " was null!");
        } else if (obj != null || Modifier.isStatic(member.getModifiers())) {
            e(obj);
        } else {
            throw new ReflectedException("Need a caller!");
        }
    }

    public Object e(Object obj) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("498e8368", new Object[]{this, obj});
        }
        if (obj == null || this.f2236a.isInstance(obj)) {
            return obj;
        }
        throw new ReflectedException("Caller [" + obj + "] is not a instance of type [" + this.f2236a + "]!");
    }

    public Reflector f(Class<?>... clsArr) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("52c7a09", new Object[]{this, clsArr});
        }
        try {
            Constructor<?> declaredConstructor = this.f2236a.getDeclaredConstructor(clsArr);
            this.c = declaredConstructor;
            declaredConstructor.setAccessible(true);
            this.d = null;
            this.e = null;
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Reflector g(String str) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("c36db1c7", new Object[]{this, str});
        }
        try {
            Field h = h(str);
            this.d = h;
            h.setAccessible(true);
            this.c = null;
            this.e = null;
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("field not exists in :" + this.f2236a, th);
        }
    }

    public Field h(String str) throws NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("48561f8f", new Object[]{this, str});
        }
        try {
            return this.f2236a.getField(str);
        } catch (NoSuchFieldException e) {
            for (Class<?> cls = this.f2236a; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e;
        }
    }

    public Method i(String str, Class<?>... clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("7bf5924b", new Object[]{this, str, clsArr});
        }
        try {
            return this.f2236a.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            for (Class<?> cls = this.f2236a; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                }
            }
            throw e;
        }
    }

    public <R> R j() throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return (R) k(this.b);
    }

    public <R> R k(Object obj) throws ReflectedException {
        d(obj, this.d, "Field");
        try {
            return (R) this.d.get(obj);
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Reflector l(String str, Class<?>... clsArr) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("a5578bb8", new Object[]{this, str, clsArr});
        }
        try {
            Method i = i(str, clsArr);
            this.e = i;
            i.setAccessible(true);
            this.c = null;
            this.d = null;
            return this;
        } catch (NoSuchMethodException e) {
            throw new ReflectedException("Oops!", e);
        }
    }

    public <R> R m(Object... objArr) throws ReflectedException {
        Constructor constructor = this.c;
        if (constructor != null) {
            try {
                return (R) constructor.newInstance(objArr);
            } catch (InvocationTargetException e) {
                throw new ReflectedException("Oops!", e.getTargetException());
            } catch (Throwable th) {
                throw new ReflectedException("Oops!", th);
            }
        } else {
            throw new ReflectedException("Constructor was null!");
        }
    }

    public Reflector q(Object obj) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("d8ae068d", new Object[]{this, obj});
        }
        r(this.b, obj);
        return this;
    }

    public Reflector r(Object obj, Object obj2) throws ReflectedException {
        d(obj, this.d, "Field");
        try {
            this.d.set(obj, obj2);
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }
}
