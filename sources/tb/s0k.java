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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s0k extends a02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String g = s0k.class.getSimpleName();
    public final String b;
    public final Class c;
    public final String d;
    public final Constructor<?> e;
    public final Constructor<?> f;

    static {
        t2o.a(393216038);
    }

    public s0k(Call call) throws IPCException {
        super(call);
        boolean z;
        Class<?> cls;
        this.b = call.getServiceWrapper().getTimeStamp();
        Class<?> b = equ.e().b(call.getServiceWrapper());
        this.c = b;
        try {
            cls = equ.e().a(b.getName().concat(Constants.PROXY_SUFFIX));
            z = true;
        } catch (IPCException unused) {
            cls = null;
            z = false;
        }
        if (z) {
            this.d = TypeUtils.getMethodId(this.c.getSimpleName(), call.getParameterWrappers());
            this.e = TypeUtils.g(cls, new Class[0]);
            return;
        }
        this.f = TypeUtils.g(this.c, equ.e().c(call.getParameterWrappers()));
    }

    public static /* synthetic */ Object ipc$super(s0k s0kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/handler/reply/impl/NewInstanceReplyHandler");
    }

    @Override // tb.a02
    public Object b(Object[] objArr) throws IPCException {
        Object obj;
        String str = this.b;
        try {
            Constructor<?> constructor = this.e;
            if (constructor != null) {
                obj = constructor.newInstance(new Object[0]);
                ((IServiceProxy) obj).create(this.d, objArr);
            } else {
                int length = objArr.length;
                Constructor<?> constructor2 = this.f;
                if (length == 0) {
                    obj = constructor2.newInstance(new Object[0]);
                } else {
                    obj = constructor2.newInstance(objArr);
                }
            }
            gdp.b().d(str, new Pair<>(this.c, obj));
            return null;
        } catch (Exception e) {
            b5d.h(g, "[NewInstanceReplyHandler][invoke]", e, "timeStamp", str);
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            throw new IPCException(23, e);
        }
    }
}
