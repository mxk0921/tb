package com.taobao.android.fluid.core.exception;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidService;
import java.io.Serializable;
import tb.ar9;
import tb.br9;
import tb.ir9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class FluidException extends RuntimeException implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EMPTY_OBSERVER = "emptyObserver";
    public static final String METHOD_NAME = "methodName";
    public static final String OBSERVER_NAME = "observerName";
    public static final String SERVICE_NAME = "serviceName";
    private static final String TAG = "FluidException";
    private final String mErrorCode;

    static {
        t2o.a(468713789);
    }

    private FluidException(String str, String str2, Throwable th) {
        super(str2, th);
        this.mErrorCode = str;
    }

    public static /* synthetic */ Object ipc$super(FluidException fluidException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/core/exception/FluidException");
    }

    public static void throwException(FluidContext fluidContext, ar9 ar9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9260608e", new Object[]{fluidContext, ar9Var});
        } else {
            throwException(fluidContext, ar9Var, null, null);
        }
    }

    public static void throwObserverCallbackException(FluidContext fluidContext, Object obj, String str, Exception exc) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c3bf39", new Object[]{fluidContext, obj, str, exc});
            return;
        }
        ar9 ar9Var = FluidInstance.INSTANCE_LISTENER_CALLBACK_EXECUTE_ERROR;
        if (obj == null) {
            str2 = EMPTY_OBSERVER;
        } else {
            str2 = obj.getClass().getSimpleName();
        }
        ar9Var.a(OBSERVER_NAME, str2);
        ar9Var.a(METHOD_NAME, str);
        throwException(fluidContext, ar9Var, exc);
    }

    public static void throwServiceNotFoundException(FluidContext fluidContext, Class<? extends FluidService> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17f51d3", new Object[]{fluidContext, cls});
            return;
        }
        ar9 ar9Var = ar9.SERVICE_NOT_REGISTER;
        ar9Var.a(SERVICE_NAME, cls.getSimpleName());
        throwException(fluidContext, ar9Var, cls.getSimpleName().concat(" 未注册"));
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.mErrorCode;
    }

    public static void throwException(FluidContext fluidContext, ar9 ar9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364fc2d8", new Object[]{fluidContext, ar9Var, str});
        } else {
            throwException(fluidContext, ar9Var, str, null);
        }
    }

    public static void throwException(FluidContext fluidContext, ar9 ar9Var, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82411827", new Object[]{fluidContext, ar9Var, th});
        } else {
            throwException(fluidContext, ar9Var, null, th);
        }
    }

    public static void throwException(FluidContext fluidContext, ar9 ar9Var, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcae81d", new Object[]{fluidContext, ar9Var, str, th});
            return;
        }
        String c = ar9Var.c();
        String str2 = ar9Var.d() + ", errorMessage: " + str + ", throwableMessage: " + (th == null ? "" : th.getMessage());
        FluidException fluidException = new FluidException(c, str2, th);
        String str3 = "FluidSDK 发生异常，错误码：" + c + "，错误信息：" + str2;
        if (th == null) {
            th = fluidException;
        }
        ir9.c(TAG, str3, th);
        br9.b(fluidContext, ar9Var, str2);
    }
}
