package com.taobao.weex.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MethodInvoker implements Invoker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Method mMethod;
    public Type[] mParam;
    public final boolean mRunOnUIThread;

    static {
        t2o.a(985661546);
        t2o.a(985661543);
    }

    public MethodInvoker(Method method) {
        this(method, false);
    }

    @Override // com.taobao.weex.bridge.Invoker
    public Type[] getParameterTypes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type[]) ipChange.ipc$dispatch("d64fca01", new Object[]{this});
        }
        if (this.mParam == null) {
            this.mParam = this.mMethod.getGenericParameterTypes();
        }
        return this.mParam;
    }

    @Override // com.taobao.weex.bridge.Invoker
    public Object invoke(Object obj, Object... objArr) throws InvocationTargetException, IllegalAccessException {
        return this.mMethod.invoke(obj, objArr);
    }

    @Override // com.taobao.weex.bridge.Invoker
    public boolean isRunOnUIThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95d51609", new Object[]{this})).booleanValue();
        }
        return this.mRunOnUIThread;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mMethod.getName();
    }

    public MethodInvoker(Method method, boolean z) {
        this.mMethod = method;
        this.mParam = method.getGenericParameterTypes();
        this.mRunOnUIThread = z;
    }
}
