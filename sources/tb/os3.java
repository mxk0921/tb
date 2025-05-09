package tb;

import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.lsposed.hiddenapibypass.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class os3 implements eun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Method f25611a;
    public final Method b;
    public final Method c;

    static {
        t2o.a(411041798);
        t2o.a(411041801);
    }

    @Override // tb.eun
    public Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        try {
            return (Method) this.c.invoke(cls, str, clsArr);
        } catch (Exception e) {
            throw e(e, cls, str);
        }
    }

    @Override // tb.eun
    public Field b(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            return (Field) this.f25611a.invoke(cls, str);
        } catch (Exception e) {
            throw d(e, cls, str);
        }
    }

    @Override // tb.eun
    public Field[] c(Class<?> cls) throws SecurityException {
        try {
            return (Field[]) this.b.invoke(cls, new Object[0]);
        } catch (Exception e) {
            throw f(cls, e);
        }
    }

    public final NoSuchFieldException d(Exception exc, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NoSuchFieldException) ipChange.ipc$dispatch("79634ffc", new Object[]{this, exc, cls, str});
        }
        boolean z = exc instanceof InvocationTargetException;
        Exception exc2 = exc;
        if (z) {
            exc2 = ((InvocationTargetException) exc).getTargetException();
        }
        if (exc2 instanceof NoSuchFieldException) {
            return (NoSuchFieldException) exc2;
        }
        NoSuchFieldException noSuchFieldException = new NoSuchFieldException(cls.getName() + ":" + str);
        noSuchFieldException.initCause(exc2);
        return noSuchFieldException;
    }

    public final NoSuchMethodException e(Exception exc, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NoSuchMethodException) ipChange.ipc$dispatch("1697a59a", new Object[]{this, exc, cls, str});
        }
        boolean z = exc instanceof InvocationTargetException;
        Exception exc2 = exc;
        if (z) {
            exc2 = ((InvocationTargetException) exc).getTargetException();
        }
        if (exc2 instanceof NoSuchMethodException) {
            return (NoSuchMethodException) exc2;
        }
        NoSuchMethodException noSuchMethodException = new NoSuchMethodException(cls.getName() + ":" + str);
        noSuchMethodException.initCause(exc2);
        return noSuchMethodException;
    }

    public final SecurityException f(Class<?> cls, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityException) ipChange.ipc$dispatch("20545b62", new Object[]{this, cls, exc});
        }
        if (exc instanceof InvocationTargetException) {
            return new SecurityException(cls.getName(), ((InvocationTargetException) exc).getTargetException());
        }
        return new SecurityException(cls.getName(), exc);
    }

    public os3() {
        Method method;
        Method method2;
        Method method3;
        Throwable th;
        try {
            try {
                Class.class.getDeclaredMethod("getField", String.class).setAccessible(true);
            } catch (Throwable th2) {
                th = th2;
                method3 = null;
                method2 = null;
                method = null;
                Log.wtf("ReflectionUtils", th);
                this.f25611a = method2;
                this.b = method;
                this.c = method3;
                Class cls = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                Method method4 = (Method) method3.invoke(cls, "getRuntime");
                method4.setAccessible(true);
                method4.setAccessible(true);
                ((Method) method3.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method4.invoke(null, new Object[0]), new String[]{"L"});
            }
            try {
                method2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                try {
                    method2.setAccessible(true);
                    Class.class.getDeclaredMethod("getFields", new Class[0]).setAccessible(true);
                    method = Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]);
                    try {
                        method.setAccessible(true);
                        try {
                            Class.class.getDeclaredMethod("getMethod", String.class, Class[].class).setAccessible(true);
                            try {
                                method3 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                                try {
                                    method3.setAccessible(true);
                                    Class.class.getDeclaredMethod("getMethods", new Class[0]).setAccessible(true);
                                    Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]).setAccessible(true);
                                } catch (Throwable th3) {
                                    th = th3;
                                    Log.wtf("ReflectionUtils", th);
                                    this.f25611a = method2;
                                    this.b = method;
                                    this.c = method3;
                                    Class cls2 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                                    Method method42 = (Method) method3.invoke(cls2, "getRuntime");
                                    method42.setAccessible(true);
                                    method42.setAccessible(true);
                                    ((Method) method3.invoke(cls2, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method42.invoke(null, new Object[0]), new String[]{"L"});
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                method3 = null;
                                Log.wtf("ReflectionUtils", th);
                                this.f25611a = method2;
                                this.b = method;
                                this.c = method3;
                                Class cls22 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                                Method method422 = (Method) method3.invoke(cls22, "getRuntime");
                                method422.setAccessible(true);
                                method422.setAccessible(true);
                                ((Method) method3.invoke(cls22, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method422.invoke(null, new Object[0]), new String[]{"L"});
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    method3 = null;
                    method = null;
                }
            } catch (Throwable th8) {
                th = th8;
                method3 = null;
                method2 = null;
                method = null;
                Log.wtf("ReflectionUtils", th);
                this.f25611a = method2;
                this.b = method;
                this.c = method3;
                Class cls222 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                Method method4222 = (Method) method3.invoke(cls222, "getRuntime");
                method4222.setAccessible(true);
                method4222.setAccessible(true);
                ((Method) method3.invoke(cls222, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method4222.invoke(null, new Object[0]), new String[]{"L"});
            }
        } catch (Throwable th9) {
            th = th9;
        }
        this.f25611a = method2;
        this.b = method;
        this.c = method3;
        try {
            Class cls2222 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
            Method method42222 = (Method) method3.invoke(cls2222, "getRuntime");
            method42222.setAccessible(true);
            method42222.setAccessible(true);
            ((Method) method3.invoke(cls2222, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method42222.invoke(null, new Object[0]), new String[]{"L"});
        } catch (Throwable th10) {
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    a.a(new String[]{"L"});
                } catch (Throwable unused) {
                    Log.wtf("ReflectionUtils", th10);
                }
            }
        }
    }
}
