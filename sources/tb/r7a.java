package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IServiceProxy;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r7a extends a02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String h = r7a.class.getSimpleName();
    public static final ConcurrentHashMap<String, Object> i = new ConcurrentHashMap<>();
    public final String b;
    public Object c;
    public final String d;
    public final Constructor<?> e;
    public final Method f;
    public final Class<?> g;

    static {
        t2o.a(393216036);
    }

    public r7a(Call call) throws IPCException {
        super(call);
        boolean z;
        Class<?> cls;
        this.b = call.getServiceWrapper().getTimeStamp();
        Class<?> b = equ.e().b(call.getServiceWrapper());
        this.g = b;
        Object obj = i.get(b.getName());
        this.c = obj;
        if (obj == null) {
            try {
                cls = equ.e().a(b.getName().concat(Constants.PROXY_SUFFIX));
                z = true;
            } catch (IPCException unused) {
                cls = null;
                z = false;
            }
            if (z) {
                this.d = TypeUtils.getMethodId(call.getMethodWrapper().getName(), call.getParameterWrappers());
                this.e = TypeUtils.g(cls, new Class[0]);
                return;
            }
            Method j = TypeUtils.j(this.g, call.getMethodWrapper().getName(), equ.e().c(call.getParameterWrappers()));
            this.f = j;
            if (!Modifier.isStatic(j.getModifiers())) {
                throw new IPCException(38, "Method " + j.getName() + " of class " + this.g.getName() + " is not static. Only the static method can be invoked to get an instance.");
            }
        }
    }

    public static /* synthetic */ Object ipc$super(r7a r7aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/handler/reply/impl/GetInstanceReplyHandler");
    }

    @Override // tb.a02
    public Object b(Object[] objArr) throws IPCException {
        String str = this.b;
        try {
            Object obj = this.c;
            Class<?> cls = this.g;
            if (obj == null) {
                Constructor<?> constructor = this.e;
                if (constructor != null) {
                    Object newInstance = constructor.newInstance(new Object[0]);
                    this.c = newInstance;
                    ((IServiceProxy) newInstance).create(this.d, objArr);
                } else {
                    this.c = this.f.invoke(null, objArr);
                }
                i.putIfAbsent(cls.getName(), this.c);
            }
            gdp.b().d(str, new Pair<>(cls, this.c));
            return null;
        } catch (Exception e) {
            b5d.h(h, "[GetInstanceReplyHandler][invoke]", e, "timeStamp", str);
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            throw new IPCException(24, e);
        }
    }
}
