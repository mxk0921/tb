package tb;

import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xtn {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601431);
        }

        public a() {
        }

        public final void c(Class<?> cls, String str, Object obj, Object obj2) {
            ckf.g(cls, "clazz");
            ckf.g(str, "fieldName");
            ckf.g(obj, o.b);
            try {
                Field declaredField = cls.getDeclaredField(str);
                ckf.f(declaredField, "e");
                declaredField.setAccessible(true);
                declaredField.set(obj, obj2);
            } catch (Exception unused) {
                tpu.a.b(tpu.Companion, "ReflectUtil", "failed to setField ".concat(str), null, 4, null);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final Method b(String str, Class<?> cls, Class<?>... clsArr) {
            Method method;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Method) ipChange.ipc$dispatch("58c6a10a", new Object[]{this, str, cls, clsArr});
            }
            ckf.g(str, FluidException.METHOD_NAME);
            ckf.g(cls, "clazz");
            ckf.g(clsArr, "paramsTypes");
            try {
                method = cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                method = null;
            }
            if (method != null) {
                return method;
            }
            try {
                method = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                ckf.f(method, "method");
                method.setAccessible(true);
                return method;
            } catch (Exception e) {
                tpu.Companion.a("ReflectUtil", "failed to getMethod ".concat(str), e);
                return method;
            }
        }

        public final Method a(String str, Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Method) ipChange.ipc$dispatch("ca205709", new Object[]{this, str, cls});
            }
            ckf.g(str, FluidException.METHOD_NAME);
            ckf.g(cls, "clazz");
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
                ckf.f(declaredMethod, "method");
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Exception e) {
                tpu.Companion.a("ReflectUtil", "failed to getMethod ".concat(str), e);
                return null;
            }
        }
    }

    static {
        t2o.a(919601430);
    }
}
