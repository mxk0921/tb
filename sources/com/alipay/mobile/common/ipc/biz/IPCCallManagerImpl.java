package com.alipay.mobile.common.ipc.biz;

import android.os.Parcelable;
import com.alipay.mobile.common.ipc.api.IPCCallManager;
import com.alipay.mobile.common.ipc.api.IPCException;
import com.alipay.mobile.common.ipc.api.IPCRetryHandler;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;
import com.alipay.mobile.common.ipc.biz.util.ObjSerializUtil;
import com.alipay.mobile.common.transport.ext.MMTPException;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IPCCallManagerImpl implements IPCCallManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IPCRetryHandler f3925a;
    public IIPCManager b;

    public static /* synthetic */ IIPCManager access$100(IPCCallManagerImpl iPCCallManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IIPCManager) ipChange.ipc$dispatch("854f2c79", new Object[]{iPCCallManagerImpl});
        }
        return iPCCallManagerImpl.b;
    }

    public static /* synthetic */ MMTPException access$200(IPCCallManagerImpl iPCCallManagerImpl, IPCException iPCException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MMTPException) ipChange.ipc$dispatch("fcafd74", new Object[]{iPCCallManagerImpl, iPCException});
        }
        return iPCCallManagerImpl.a(iPCException);
    }

    public static /* synthetic */ IPCRetryHandler access$300(IPCCallManagerImpl iPCCallManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCRetryHandler) ipChange.ipc$dispatch("7cd95326", new Object[]{iPCCallManagerImpl});
        }
        return iPCCallManagerImpl.f3925a;
    }

    public static /* synthetic */ boolean access$400(IPCCallManagerImpl iPCCallManagerImpl, Class[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac588b02", new Object[]{iPCCallManagerImpl, clsArr})).booleanValue();
        }
        return iPCCallManagerImpl.c(clsArr);
    }

    public static /* synthetic */ void access$500(IPCCallManagerImpl iPCCallManagerImpl, Object[] objArr, Class[] clsArr, IPCParameter iPCParameter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b930a5d", new Object[]{iPCCallManagerImpl, objArr, clsArr, iPCParameter});
        } else {
            iPCCallManagerImpl.b(objArr, clsArr, iPCParameter);
        }
    }

    public final MMTPException a(IPCException iPCException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MMTPException) ipChange.ipc$dispatch("39bd97c8", new Object[]{this, iPCException});
        }
        try {
            MMTPException mMTPException = new MMTPException();
            mMTPException.errorCode = 1004;
            mMTPException.errorMesage = iPCException.errorMsg;
            return mMTPException;
        } catch (Throwable th) {
            LogCatUtil.error("IPCCallManager", "convertToMMTPException ex:" + th.toString());
            return null;
        }
    }

    public final void b(Object[] objArr, Class<?>[] clsArr, IPCParameter iPCParameter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7045462", new Object[]{this, objArr, clsArr, iPCParameter});
            return;
        }
        for (int i = 0; i < clsArr.length; i++) {
            iPCParameter.paramTypes[i] = clsArr[i].getName();
        }
        if (iPCParameter.paramTypes.length > 0) {
            iPCParameter.paramValues = new ArrayList(iPCParameter.paramTypes.length);
            for (int i2 = 0; i2 < iPCParameter.paramTypes.length; i2++) {
                iPCParameter.paramValues.add(ObjSerializUtil.serializ((Serializable) objArr[i2]));
            }
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCCallManager
    public <T> T getIpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("666d3784", new Object[]{this, cls});
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new IPCCallProxyHandler());
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCCallManager
    public synchronized void setIIPCManager(IIPCManager iIPCManager) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f5a651", new Object[]{this, iIPCManager});
            return;
        }
        this.b = iIPCManager;
        if (iIPCManager == null) {
            str = " ipcManager is null";
        } else {
            str = "";
        }
        LogCatUtil.info("IPCCallManager", "[setIIPCManager] Finished. ".concat(str));
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCCallManager
    public void setIPCCallRetryHandler(IPCRetryHandler iPCRetryHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36a6ac8", new Object[]{this, iPCRetryHandler});
        } else {
            this.f3925a = iPCRetryHandler;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class IPCCallProxyHandler implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public IPCCallProxyHandler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
            }
            return a(method, objArr, 0);
        }

        public final Object a(Method method, Object[] objArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8aa9142e", new Object[]{this, method, objArr, new Integer(i)});
            }
            LogCatUtil.info("IPCCallManager", "IPCCallProxyHandler#invoke");
            if (IPCCallManagerImpl.access$100(IPCCallManagerImpl.this) == null) {
                LogCatUtil.info("IPCCallManager", "IPCCallProxyHandler#invoke, ipcManager==null.");
                IPCException iPCException = new IPCException("You must set IIPCManager. example: IPCCallManager#setIIPCManager");
                iPCException.errorCode = 2;
                iPCException.errorMsg = "IPC no bind， Please try again later";
                MMTPException access$200 = IPCCallManagerImpl.access$200(IPCCallManagerImpl.this, iPCException);
                if (IPCCallManagerImpl.access$300(IPCCallManagerImpl.this) == null) {
                    throw access$200;
                } else if (!IPCCallManagerImpl.access$300(IPCCallManagerImpl.this).retryIPCCall(method, objArr, iPCException, i)) {
                    throw access$200;
                } else if (IPCCallManagerImpl.access$100(IPCCallManagerImpl.this) == null) {
                    LogCatUtil.warn("IPCCallManager", "IPCCallProxyHandler#invoke, retry later, ipcManager still is null.");
                    throw access$200;
                }
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?>[] parameterTypes = method.getParameterTypes();
            IPCParameter iPCParameter = new IPCParameter();
            iPCParameter.className = declaringClass.getName();
            iPCParameter.methodName = method.getName();
            iPCParameter.returnType = method.getReturnType().getName();
            iPCParameter.paramTypes = new String[parameterTypes.length];
            if (IPCCallManagerImpl.access$400(IPCCallManagerImpl.this, parameterTypes)) {
                iPCParameter.serType = (byte) 2;
                iPCParameter.paramTypes[0] = parameterTypes[0].getName();
                iPCParameter.paramValues = new ArrayList(iPCParameter.paramTypes.length);
                iPCParameter.parcelable = (Parcelable) objArr[0];
            } else {
                IPCCallManagerImpl.access$500(IPCCallManagerImpl.this, objArr, parameterTypes, iPCParameter);
            }
            LogCatUtil.info("IPCCallManager", "start ipc call. ipcParameter=[" + iPCParameter.toString() + "]");
            IPCResult call = new IPCCallable(IPCCallManagerImpl.access$100(IPCCallManagerImpl.this)).call(iPCParameter);
            try {
                if (call == null) {
                    throw new IPCException(106, "Returns the ipcResult is null");
                } else if (call.resultCode != 0) {
                    throw new IPCException(call.resultCode, call.resultMsg);
                } else if (method.getGenericReturnType() == Void.TYPE) {
                    return null;
                } else {
                    if (call.serType == 2) {
                        return call.parcelable;
                    }
                    byte[] bArr = call.resultValue;
                    if (bArr != null) {
                        return ObjSerializUtil.deserializ(bArr, method.getReturnType().getClassLoader());
                    }
                    LogCatUtil.warn("IPCCallManager", "[doInvoke] ipcResult.resultValue is null.");
                    return null;
                }
            } catch (IPCException e) {
                if (IPCCallManagerImpl.access$300(IPCCallManagerImpl.this) == null) {
                    throw e;
                } else if (IPCCallManagerImpl.access$300(IPCCallManagerImpl.this).retryIPCCall(method, objArr, e, i)) {
                    return a(method, objArr, i);
                } else {
                    throw e;
                }
            }
        }
    }

    public final boolean c(Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aba956", new Object[]{this, clsArr})).booleanValue();
        }
        int length = clsArr.length;
        if (length == 0) {
            return false;
        }
        if (length == 1) {
            return Parcelable.class.isAssignableFrom(clsArr[0]);
        }
        int i = 0;
        for (Class<?> cls : clsArr) {
            if (Parcelable.class.isAssignableFrom(cls)) {
                i++;
            }
        }
        if (i == 0) {
            return false;
        }
        IPCException iPCException = new IPCException("parameter more than one,and not all Serialize,not support");
        iPCException.errorCode = 3;
        iPCException.errorMsg = "Parameter more than one,and not all Serialize,please check it";
        throw iPCException;
    }
}
