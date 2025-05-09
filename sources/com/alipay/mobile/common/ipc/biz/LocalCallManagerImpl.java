package com.alipay.mobile.common.ipc.biz;

import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.mobile.common.ipc.api.LocalCallManager;
import com.alipay.mobile.common.ipc.api.LocalCallRetryHandler;
import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;
import com.alipay.mobile.common.ipc.biz.util.ObjSerializUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LocalCallManagerImpl implements LocalCallManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ServiceBeanManager f3929a;
    public LocalCallRetryHandler b;

    public LocalCallManagerImpl(ServiceBeanManager serviceBeanManager) {
        this.f3929a = serviceBeanManager;
    }

    public final boolean a(Class<?>[] clsArr, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1fb09d5", new Object[]{this, clsArr, strArr})).booleanValue();
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!TextUtils.equals(clsArr[i].getName(), strArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final Method b(IPCParameter iPCParameter, Object obj) {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("6bb3b04b", new Object[]{this, iPCParameter, obj});
        }
        for (Method method : obj.getClass().getMethods()) {
            if (TextUtils.equals(iPCParameter.methodName, method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                String[] strArr = iPCParameter.paramTypes;
                if (parameterTypes.length == strArr.length && a(parameterTypes, strArr)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // com.alipay.mobile.common.ipc.api.LocalCallManager
    public IPCResult call(IPCParameter iPCParameter) {
        LogCatUtil.debugOrLose("IPC_LocalCallManager", "start local call");
        String str = iPCParameter.className;
        ServiceBeanManager serviceBeanManager = this.f3929a;
        Object serviceBean = serviceBeanManager.getServiceBean(str);
        if (serviceBean == null) {
            LogCatUtil.warn("IPC_LocalCallManager", "Service not found,className=[" + iPCParameter.className + "] serviceBeanManager hashcode=[" + serviceBeanManager.hashCode() + "] service bean count=[" + serviceBeanManager.getServiceBeanCount() + "]");
            IPCResult iPCResult = new IPCResult();
            iPCResult.resultCode = 100;
            iPCResult.resultMsg = "Service bean not found";
            LocalCallRetryHandler localCallRetryHandler = this.b;
            if (localCallRetryHandler == null) {
                LogCatUtil.warn("IPC_LocalCallManager", "Service not found,localCallRetryHandler is null,no retry!");
                return iPCResult;
            } else if (!localCallRetryHandler.retryLocalCall(iPCParameter, iPCResult, serviceBeanManager, 1)) {
                LogCatUtil.warn("IPC_LocalCallManager", "Service not found. no retry!");
                return iPCResult;
            } else {
                LogCatUtil.info("IPC_LocalCallManager", "Service not found. ye retry!");
                Object serviceBean2 = serviceBeanManager.getServiceBean(iPCParameter.className);
                if (serviceBean2 == null) {
                    LogCatUtil.info("IPC_LocalCallManager", "Service not found. retry fail!");
                    return iPCResult;
                }
                serviceBean = serviceBean2;
            }
        }
        Method b = b(iPCParameter, serviceBean);
        if (b == null) {
            LogCatUtil.warn("IPC_LocalCallManager", "serviceBean=[" + serviceBean.getClass().getName() + "],Method not found,className=[" + iPCParameter.className + "]");
            IPCResult iPCResult2 = new IPCResult();
            iPCResult2.resultCode = 101;
            iPCResult2.resultMsg = "Method not found";
            return iPCResult2;
        }
        LogCatUtil.info("IPC_LocalCallManager", "serviceBean=[" + serviceBean.getClass().getName() + "],method=[" + b.getName() + "]");
        if (!TextUtils.equals(iPCParameter.returnType, b.getReturnType().getName())) {
            LogCatUtil.info("IPC_LocalCallManager", "Not the same returnType, peer returnType=[" + iPCParameter.returnType + "] local returnType=[" + b.getReturnType().getName() + "]");
            IPCResult iPCResult3 = new IPCResult();
            iPCResult3.resultCode = 105;
            iPCResult3.resultMsg = "Method not found";
            return iPCResult3;
        }
        List<byte[]> list = iPCParameter.paramValues;
        Class<?>[] parameterTypes = b.getParameterTypes();
        if (list == null || parameterTypes.length == list.size()) {
            Object[] objArr = new Object[parameterTypes.length];
            if (parameterTypes.length > 0) {
                try {
                    if (iPCParameter.serType == 2) {
                        objArr[0] = iPCParameter.parcelable;
                    } else {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            objArr[i] = ObjSerializUtil.deserializ(list.get(i), parameterTypes[i].getClassLoader());
                        }
                    }
                } catch (Exception e) {
                    LogCatUtil.error("IPC_LocalCallManager", "call Exception", e);
                    IPCResult iPCResult4 = new IPCResult();
                    iPCResult4.resultCode = 103;
                    iPCResult4.resultMsg = "Param deserializ error. exception: " + e.getMessage();
                    return iPCResult4;
                }
            }
            try {
                Object invoke = b.invoke(serviceBean, objArr);
                if (invoke == null) {
                    LogCatUtil.info("IPC_LocalCallManager", "invoke success, result is void");
                    return new IPCResult();
                }
                IPCResult iPCResult5 = new IPCResult();
                iPCResult5.resultType = invoke.getClass().getName();
                if (invoke instanceof Parcelable) {
                    iPCResult5.serType = (byte) 2;
                    iPCResult5.parcelable = (Parcelable) invoke;
                } else {
                    iPCResult5.resultValue = ObjSerializUtil.serializ((Serializable) invoke);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("invoke success, result type = ");
                String str2 = iPCResult5.resultType;
                if (str2 == null) {
                    str2 = "is null";
                }
                sb.append(str2);
                LogCatUtil.info("IPC_LocalCallManager", sb.toString());
                return iPCResult5;
            } catch (Throwable th) {
                LogCatUtil.error("IPC_LocalCallManager", "LocalCallManager Exception", th);
                IPCResult iPCResult6 = new IPCResult();
                iPCResult6.resultCode = 104;
                iPCResult6.resultMsg = "Invoke method error. exception: " + th.getMessage();
                return iPCResult6;
            }
        } else {
            IPCResult iPCResult7 = new IPCResult();
            iPCResult7.resultCode = 102;
            iPCResult7.resultMsg = "The number of parameters does not match";
            return iPCResult7;
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.LocalCallManager
    public void setLocalCallRetryHandler(LocalCallRetryHandler localCallRetryHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d07c1aa", new Object[]{this, localCallRetryHandler});
        } else {
            this.b = localCallRetryHandler;
        }
    }
}
