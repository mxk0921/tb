package com.taobao.aranger.core.handler.invoc;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.method.AutoRecover;
import com.taobao.aranger.annotation.method.MethodName;
import com.taobao.aranger.annotation.method.oneway;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.core.wrapper.ServiceWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Method;
import tb.f5d;
import tb.fql;
import tb.h5d;
import tb.mut;
import tb.t2o;
import tb.ui3;
import tb.wz1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MethodInvocationHandler extends BaseInvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Call b;
    public final ServiceWrapper c;
    public final Uri d;
    public final wz1 e;

    static {
        t2o.a(393216032);
    }

    public MethodInvocationHandler(Call call) {
        this.b = call;
        Uri remoteProviderUri = call.getRemoteProviderUri();
        this.d = remoteProviderUri;
        this.c = ServiceWrapper.obtain().setTimeStamp(call.getServiceWrapper().getTimeStamp()).setServiceInterfaceClass(call.getServiceWrapper().getServiceInterfaceClass()).setServiceName(call.getServiceWrapper().getName()).setType(3);
        this.e = ui3.b(remoteProviderUri);
    }

    public static /* synthetic */ Object ipc$super(MethodInvocationHandler methodInvocationHandler, String str, Object... objArr) {
        if (str.hashCode() == -1979325148) {
            return super.invoke(objArr[0], (Method) objArr[1], (Object[]) objArr[2]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/handler/invoc/MethodInvocationHandler");
    }

    @Override // com.taobao.aranger.core.handler.invoc.BaseInvocationHandler
    public Reply a(Method method, Object[] objArr) throws IPCException {
        String str;
        boolean z;
        String str2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("d985a196", new Object[]{this, method, objArr});
        }
        ParameterWrapper[] b = fql.b(method, objArr);
        MethodName methodName = (MethodName) method.getAnnotation(MethodName.class);
        AutoRecover autoRecover = (AutoRecover) method.getAnnotation(AutoRecover.class);
        oneway onewayVar = (oneway) method.getAnnotation(oneway.class);
        MethodWrapper obtain = MethodWrapper.obtain();
        if (methodName == null) {
            str = method.getName();
        } else {
            str = methodName.value();
        }
        MethodWrapper methodWrapper = obtain.setMethodName(str).setVoid(TypeUtils.o(method.getReturnType()));
        if (!methodWrapper.isVoid()) {
            methodWrapper.setReturnType(TypeUtils.f(method.getReturnType()));
        }
        Call remoteProviderUri = Call.obtain().setServiceWrapper(this.c).setParameterWrappers(b).setMethodWrapper(methodWrapper).setRemoteProviderUri(this.d);
        if (autoRecover != null) {
            z = true;
        } else {
            z = false;
        }
        Call autoRecover2 = remoteProviderUri.setAutoRecover(z);
        if (onewayVar == null) {
            z2 = false;
        }
        Call oneWay = autoRecover2.setOneWay(z2);
        try {
            return this.e.e(oneWay);
        } catch (IPCException e) {
            if (autoRecover == null || e.getErrorCode() != 22) {
                throw e;
            }
            synchronized (this) {
                try {
                    if (this.b.isSameApp()) {
                        str2 = mut.a();
                    } else {
                        str2 = mut.b(h5d.f());
                    }
                    this.b.getServiceWrapper().setTimeStamp(str2);
                    this.e.e(this.b);
                    f5d.b().g(this.b.getRemoteProviderUri(), str2, this);
                    this.c.setTimeStamp(str2);
                    oneWay.setAutoRecover(false);
                    return this.e.e(oneWay);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.taobao.aranger.core.handler.invoc.BaseInvocationHandler, java.lang.reflect.InvocationHandler
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) throws IPCException {
        return super.invoke(obj, method, objArr);
    }
}
