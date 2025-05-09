package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Observable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ub0 extends Observable implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f29270a;

    public ub0(Object obj) {
        this.f29270a = obj;
    }

    public static /* synthetic */ Object ipc$super(ub0 ub0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/common/ActivityManagerProxy");
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().contains("startActivity") && Build.VERSION.SDK_INT <= 28) {
            nca.o = out.a();
        }
        try {
            return method.invoke(this.f29270a, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException != null && (targetException instanceof IllegalArgumentException) && method.getName().equals("reportSizeConfigurations")) {
                setChanged();
                notifyObservers(targetException);
                return null;
            } else if (targetException != null && method.getName().equals("isTopOfTask") && (targetException instanceof IllegalArgumentException)) {
                return Boolean.FALSE;
            } else {
                throw targetException;
            }
        }
    }
}
