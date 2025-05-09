package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ati {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Method f15990a;
    public Type[] b;

    static {
        t2o.a(982516204);
    }

    public ati(Method method, boolean z) {
        this.f15990a = method;
        this.b = method.getGenericParameterTypes();
    }

    public Type[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type[]) ipChange.ipc$dispatch("d64fca01", new Object[]{this});
        }
        if (this.b == null) {
            this.b = this.f15990a.getGenericParameterTypes();
        }
        return this.b;
    }

    public Object b(Object obj, Object... objArr) throws InvocationTargetException, IllegalAccessException {
        return this.f15990a.invoke(obj, objArr);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f15990a.getName();
    }
}
