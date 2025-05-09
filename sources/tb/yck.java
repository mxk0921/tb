package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f31988a;
    public final Class b;

    public yck(Object obj, Class cls) {
        this.f31988a = obj;
        this.b = cls;
    }

    public static yck h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yck) ipChange.ipc$dispatch("9971ec6a", new Object[]{obj});
        }
        obj.getClass();
        if (obj instanceof Class) {
            return new yck(null, (Class) obj);
        }
        return new yck(obj, obj.getClass());
    }

    public final Field a(String str) throws NoSuchFieldException {
        Field field;
        Class cls = this.b;
        Class cls2 = cls;
        while (true) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
                declaredMethod.setAccessible(true);
                field = (Field) declaredMethod.invoke(cls2, str);
                break;
            } catch (Exception unused) {
                cls2 = cls2.getSuperclass();
                if (cls2 == Object.class) {
                    field = null;
                    break;
                }
            }
        }
        if (field != null) {
            return field;
        }
        throw new NoSuchFieldException(cls.getName() + ":" + str);
    }

    public yck b(String str) throws NoSuchFieldException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yck) ipChange.ipc$dispatch("2c73eee4", new Object[]{this, str});
        }
        return c(a(str));
    }

    public final yck c(Field field) throws IllegalAccessException {
        Object obj;
        field.setAccessible(true);
        if (Modifier.isStatic(field.getModifiers())) {
            obj = null;
        } else {
            obj = this.f31988a;
        }
        return new yck(field.get(obj), field.getType());
    }

    public yck d(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yck) ipChange.ipc$dispatch("e52f3306", new Object[]{this, str});
        }
        return e(str, new Class[0], new Object[0]);
    }

    public yck e(String str, Class<?>[] clsArr, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        Object obj;
        Method f = f(str, clsArr);
        f.setAccessible(true);
        Class<?> returnType = f.getReturnType();
        if (Modifier.isStatic(f.getModifiers())) {
            obj = null;
        } else {
            obj = this.f31988a;
        }
        if (f.getReturnType() != Void.TYPE) {
            return new yck(f.invoke(obj, objArr), returnType);
        }
        f.invoke(obj, objArr);
        return null;
    }

    public final Method f(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Method method;
        Class cls = this.b;
        Class cls2 = cls;
        while (true) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                declaredMethod.setAccessible(true);
                method = (Method) declaredMethod.invoke(cls2, str, clsArr);
                break;
            } catch (Exception unused) {
                cls2 = cls2.getSuperclass();
                if (cls2 == Object.class) {
                    method = null;
                    break;
                }
            }
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(cls.getName() + ":" + str);
    }

    public <T> T g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1af82031", new Object[]{this});
        }
        return (T) this.f31988a;
    }
}
