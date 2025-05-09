package tb;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.annotation.parameter.WeakRef;
import com.taobao.aranger.annotation.parameter.inout;
import com.taobao.aranger.annotation.parameter.out;
import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.core.handler.invoc.CallbackInvocationHandler;
import com.taobao.aranger.core.ipc.provider.ClientServiceProvider;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.CallbackManager;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(393216099);
    }

    public static Object[] a(ParameterWrapper[] parameterWrapperArr, List<Integer> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("7f06c6a1", new Object[]{parameterWrapperArr, list});
        }
        if (parameterWrapperArr == null) {
            return new Object[0];
        }
        int length = parameterWrapperArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            ParameterWrapper parameterWrapper = parameterWrapperArr[i];
            Object obj = null;
            if (parameterWrapper == null) {
                objArr[i] = null;
            } else {
                Class<?> b = equ.e().b(parameterWrapper);
                if (b != null && b.isInterface() && b.getAnnotation(Callback.class) != null) {
                    String[] split = parameterWrapper.getTimeStamp().split(";");
                    String str = split[0];
                    objArr[i] = Proxy.newProxyInstance(b.getClassLoader(), new Class[]{b}, new CallbackInvocationHandler(parameterWrapper.getClientServiceBinder(), str, Integer.parseInt(split[1])));
                    f5d.b().g(parameterWrapper.getClientServiceBinder(), str, objArr[i]);
                } else if (b == null || !Context.class.isAssignableFrom(b)) {
                    if (parameterWrapper.getFlowFlag() != 0) {
                        list.add(Integer.valueOf(i));
                    }
                    if (b != null) {
                        obj = parameterWrapper.getData();
                    }
                    objArr[i] = obj;
                } else {
                    objArr[i] = re.r();
                }
            }
        }
        return objArr;
    }

    public static ParameterWrapper[] b(Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParameterWrapper[]) ipChange.ipc$dispatch("577609cf", new Object[]{method, objArr});
        }
        if (objArr == null) {
            return new ParameterWrapper[0];
        }
        ParameterWrapper[] parameterWrapperArr = new ParameterWrapper[objArr.length];
        Class<?>[] parameterTypes = method.getParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        for (int i = 0; i < objArr.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls != null && cls.isInterface() && parameterTypes[i].getAnnotation(Callback.class) != null) {
                Object obj = objArr[i];
                String a2 = mut.a();
                if (obj != null) {
                    ParameterWrapper clientServiceBinder = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName()).setClientServiceBinder(ClientServiceProvider.getClientService());
                    parameterWrapperArr[i] = clientServiceBinder.setTimeStamp(a2 + ";" + obj.hashCode());
                    CallbackManager.f().d(a2, obj, TypeUtils.a(parameterAnnotations[i], WeakRef.class));
                } else {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName());
                }
            } else if (objArr[i] instanceof Context) {
                parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(Context.class.getName());
            } else {
                boolean a3 = TypeUtils.a(parameterAnnotations[i], out.class);
                boolean a4 = TypeUtils.a(parameterAnnotations[i], inout.class);
                if (!a3 && !a4) {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName()).setData(objArr[i]);
                } else if (a4) {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName()).setFlowFlag(2).setData(objArr[i]);
                } else {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(parameterTypes[i].getName()).setFlowFlag(1).setData(objArr[i]);
                }
            }
        }
        return parameterWrapperArr;
    }

    public static ParameterWrapper[] c(Pair<Class<?>, Object>[] pairArr) throws IPCException {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParameterWrapper[]) ipChange.ipc$dispatch("e66c0333", new Object[]{pairArr});
        }
        if (pairArr == null) {
            return new ParameterWrapper[0];
        }
        ParameterWrapper[] parameterWrapperArr = new ParameterWrapper[pairArr.length];
        for (int i = 0; i < pairArr.length; i++) {
            Pair<Class<?>, Object> pair = pairArr[i];
            if (pair == null || (obj = pair.first) == null) {
                throw new IPCException(34, "the pair and parameter class can't be null!");
            }
            Class cls = (Class) obj;
            Object obj2 = pair.second;
            if (obj2 == null || cls.isAssignableFrom(obj2.getClass())) {
                if (cls.isInterface() && cls.getAnnotation(Callback.class) != null) {
                    String a2 = mut.a();
                    if (obj2 != null) {
                        ParameterWrapper clientServiceBinder = ParameterWrapper.obtain().setParameterName(cls.getName()).setClientServiceBinder(ClientServiceProvider.getClientService());
                        parameterWrapperArr[i] = clientServiceBinder.setTimeStamp(a2 + ";" + obj2.hashCode());
                        CallbackManager.f().d(a2, obj2, false);
                    } else {
                        parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(cls.getName());
                    }
                } else if (Context.class.isAssignableFrom(cls)) {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(Context.class.getName());
                } else if (obj2 != null) {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(cls.getName()).setData(obj2);
                } else {
                    parameterWrapperArr[i] = ParameterWrapper.obtain().setParameterName(cls.getName());
                }
            } else {
                throw new IPCException(39, "the parameter object " + obj2.getClass().getName() + " is not the instance of the " + cls.getName() + ", please check if you pair's value are correct!");
            }
        }
        return parameterWrapperArr;
    }
}
