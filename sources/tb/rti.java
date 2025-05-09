package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rti implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f27597a;
    public Object b = null;

    static {
        t2o.a(349175932);
    }

    public Object a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96924b14", new Object[]{this, cls});
        }
        this.b = cls.getInterfaces();
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        this.f27597a = newProxyInstance;
        return newProxyInstance;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff71bed", new Object[]{this})).intValue();
        }
        return hashCode();
    }

    public void c(int i) {
        throw null;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.b == null) {
            s55.i("MiBridge", "getProxy fisrt!", new Object[0]);
        }
        if (method.getName() == "onThermalLevelChanged" && objArr != null) {
            c(Integer.parseInt(String.valueOf(objArr[0])));
            return null;
        } else if (method.getName() == "getProxyHashCode") {
            return Integer.valueOf(b());
        } else {
            try {
                return method.invoke(this.b, objArr);
            } catch (Exception e) {
                s55.i("MiBridge", "method invoke failed, e: " + e, new Object[0]);
                return null;
            }
        }
    }
}
