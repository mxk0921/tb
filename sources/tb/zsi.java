package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IServiceProxy;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zsi extends a02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;
    public final Object c;
    public final String d;
    public final Method e;

    static {
        t2o.a(393216037);
    }

    public zsi(Call call) throws IPCException {
        super(call);
        String timeStamp = call.getServiceWrapper().getTimeStamp();
        this.b = timeStamp;
        Pair<Class, Object> c = gdp.b().c(timeStamp);
        if (c != null) {
            Class<?> cls = (Class) c.first;
            Object obj = c.second;
            this.c = obj;
            if (obj instanceof IServiceProxy) {
                this.d = TypeUtils.getMethodId(call.getMethodWrapper().getName(), call.getParameterWrappers());
            } else {
                this.e = equ.e().f(cls, call.getMethodWrapper(), call.getParameterWrappers());
            }
        } else {
            b5d.i("MethodInvokeReplyHandler", "[MethodInvokeReplyHandler][invoke] proxy is null", "timeStamp", timeStamp);
            throw new IPCException(22, "can't find ipc object proxy");
        }
    }

    public static /* synthetic */ Object ipc$super(zsi zsiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/handler/reply/impl/MethodInvokeReplyHandler");
    }

    @Override // tb.a02
    public Object b(Object[] objArr) throws IPCException {
        try {
            Object obj = this.c;
            if (obj instanceof IServiceProxy) {
                return ((IServiceProxy) obj).invoke(this.d, objArr);
            }
            return this.e.invoke(obj, objArr);
        } catch (Exception e) {
            b5d.h("MethodInvokeReplyHandler", "[MethodInvokeReplyHandler][invoke]", e, "timeStamp", this.b);
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            throw new IPCException(3, e);
        }
    }
}
