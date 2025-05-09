package com.taobao.aranger.core.handler.invoc;

import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.method.oneway;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Method;
import tb.fql;
import tb.js1;
import tb.t2o;
import tb.ui3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CallbackInvocationHandler extends BaseInvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;
    public final int c;
    public final js1 d;

    static {
        t2o.a(393216031);
    }

    public CallbackInvocationHandler(IBinder iBinder, String str, int i) {
        this.b = str;
        this.c = i;
        this.d = ui3.a(iBinder);
    }

    public static /* synthetic */ Object ipc$super(CallbackInvocationHandler callbackInvocationHandler, String str, Object... objArr) {
        if (str.hashCode() == -1979325148) {
            return super.invoke(objArr[0], (Method) objArr[1], (Object[]) objArr[2]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/aranger/core/handler/invoc/CallbackInvocationHandler");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.c;
    }

    @Override // com.taobao.aranger.core.handler.invoc.BaseInvocationHandler, java.lang.reflect.InvocationHandler
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) throws IPCException {
        return super.invoke(obj, method, objArr);
    }

    @Override // com.taobao.aranger.core.handler.invoc.BaseInvocationHandler
    public Reply a(Method method, Object[] objArr) throws IPCException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("d985a196", new Object[]{this, method, objArr});
        }
        ParameterWrapper[] b = fql.b(method, objArr);
        MethodWrapper methodWrapper = MethodWrapper.obtain().setMethodName(method.getName()).setVoid(TypeUtils.o(method.getReturnType()));
        if (!methodWrapper.isVoid()) {
            methodWrapper.setReturnType(TypeUtils.f(method.getReturnType()));
        }
        Callback timeStamp = Callback.obtain().setParameterWrappers(b).setMethodWrapper(methodWrapper).setTimeStamp(this.b);
        if (method.getAnnotation(oneway.class) == null) {
            z = false;
        }
        return this.d.d(timeStamp.setOneWay(z));
    }
}
