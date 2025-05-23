package com.taobao.aranger.core.handler.invoc;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.parameter.inout;
import com.taobao.aranger.annotation.parameter.out;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IDataFlow;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.b5d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BaseInvocationHandler implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f10061a = BaseInvocationHandler.class.getName();

    static {
        t2o.a(393216030);
    }

    public abstract Reply a(Method method, Object[] objArr) throws IPCException;

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws IPCException {
        if (method.getDeclaringClass() == Object.class) {
            try {
                return method.invoke(this, objArr);
            } catch (Exception e) {
                b5d.h(f10061a, "[BaseInvocationHandler][invoke]", e, new Object[0]);
                throw new IPCException(18, e);
            }
        } else {
            Reply a2 = a(method, objArr);
            if (TypeUtils.o(method.getReturnType())) {
                return null;
            }
            return b(a2, method, objArr);
        }
    }

    public final Object b(Reply reply, Method method, Object[] objArr) throws IPCException {
        ParameterWrapper[] flowParameterWrappers = reply.getFlowParameterWrappers();
        String str = f10061a;
        if (!(flowParameterWrappers == null || reply.getFlowParameterWrappers().length == 0)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int i = 0;
            for (int i2 = 0; i2 < objArr.length; i2++) {
                try {
                    if (!TypeUtils.a(parameterAnnotations[i2], out.class) && !TypeUtils.a(parameterAnnotations[i2], inout.class)) {
                    }
                    i++;
                    Object data = reply.getFlowParameterWrappers()[i].getData();
                    if (objArr[i2] == null) {
                        objArr[i2] = data;
                    } else if (parameterTypes[i2].isArray()) {
                        TypeUtils.e(parameterTypes[i2].getName(), objArr[i2], data);
                    } else if (List.class.isAssignableFrom(parameterTypes[i2])) {
                        Collections.copy((List) objArr[i2], (List) data);
                    } else if (Map.class.isAssignableFrom(parameterTypes[i2])) {
                        Map map = (Map) data;
                        Map map2 = (Map) objArr[i2];
                        map2.clear();
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                map2.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } else if (IDataFlow.class.isAssignableFrom(parameterTypes[i2])) {
                        ((IDataFlow) objArr[i2]).readFromObject(data);
                    } else if (Parcelable.class.isAssignableFrom(parameterTypes[i2])) {
                        Method declaredMethod = parameterTypes[i2].getDeclaredMethod("readFromParcel", Parcel.class);
                        declaredMethod.setAccessible(true);
                        Parcel obtain = Parcel.obtain();
                        ((Parcelable) data).writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        declaredMethod.invoke(objArr[i2], obtain);
                        obtain.recycle();
                    }
                } catch (Exception e) {
                    b5d.h(str, "[processReply]", e, new Object[0]);
                    throw new IPCException(26, e);
                }
            }
        }
        if (reply.getResult() == null && method.getReturnType().isPrimitive()) {
            b5d.i(str, "[processReply] the primitive result is null!", new Object[0]);
            throw new IPCException(31, "the primitive result is null!");
        } else if (reply.getResult() == null || TypeUtils.d(method.getReturnType(), reply.getResult().getClass()) || method.getReturnType().isAssignableFrom(reply.getResult().getClass())) {
            return reply.getResult();
        } else {
            throw new IPCException(32, reply.getResult().getClass().getName() + " can't cast to " + method.getReturnType());
        }
    }
}
