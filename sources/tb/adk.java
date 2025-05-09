package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class adk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f15682a;
    public final Class b;

    static {
        t2o.a(411041800);
    }

    public adk(Object obj, Class cls) {
        this.f15682a = obj;
        this.b = obj != null ? obj.getClass() : cls;
    }

    public static adk i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (adk) ipChange.ipc$dispatch("f940a509", new Object[]{obj});
        }
        obj.getClass();
        if (obj instanceof Class) {
            return new adk(null, (Class) obj);
        }
        return new adk(obj, obj.getClass());
    }

    public final Field a(String str) throws NoSuchFieldException {
        Field field;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("f5045e08", new Object[]{this, str});
        }
        Class cls = this.b;
        while (true) {
            try {
                field = gun.a(cls, str);
                break;
            } catch (Exception unused) {
                cls = cls.getSuperclass();
                if (cls == Object.class) {
                    field = null;
                    break;
                }
            }
        }
        if (field != null) {
            return field;
        }
        throw new NoSuchFieldException(this.b.getName() + ":" + str);
    }

    public adk b(String str) throws NoSuchFieldException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (adk) ipChange.ipc$dispatch("a3a7c54f", new Object[]{this, str});
        }
        return c(a(str));
    }

    public final adk c(Field field) throws IllegalArgumentException, IllegalAccessException {
        Object obj;
        field.setAccessible(true);
        if (Modifier.isStatic(field.getModifiers())) {
            obj = null;
        } else {
            obj = this.f15682a;
        }
        return new adk(field.get(obj), field.getType());
    }

    public adk d(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (adk) ipChange.ipc$dispatch("4e5ff6ed", new Object[]{this, str});
        }
        return e(str, new Class[0], new Object[0]);
    }

    public adk e(String str, Class<?>[] clsArr, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        Object obj;
        Method c = gun.c(this.b, str, clsArr);
        if (c != null) {
            c.setAccessible(true);
            Class<?> returnType = c.getReturnType();
            if (Modifier.isStatic(c.getModifiers())) {
                obj = null;
            } else {
                obj = this.f15682a;
            }
            if (c.getReturnType() != Void.TYPE) {
                return new adk(c.invoke(obj, objArr), returnType);
            }
            c.invoke(obj, objArr);
            return null;
        }
        throw new NoSuchMethodException();
    }

    public adk f(String str, Object obj) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (adk) ipChange.ipc$dispatch("f87f7927", new Object[]{this, str, obj});
        }
        g(a(str), obj);
        return this;
    }

    public final adk g(Field field, Object obj) throws IllegalArgumentException, IllegalAccessException {
        field.setAccessible(true);
        if (Modifier.isStatic(field.getModifiers())) {
            field.set(null, obj);
        } else {
            field.set(this.f15682a, obj);
        }
        return this;
    }

    public <T> T h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1af82031", new Object[]{this});
        }
        return (T) this.f15682a;
    }
}
