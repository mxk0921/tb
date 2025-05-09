package com.alipay.mobile.common.rpc.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.http.HttpUrlHeader;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.ext.annotation.Retryable;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RpcInvokerUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RPC_V1 = "V1";
    public static final String RPC_V2 = "V2";
    public static final String SIMPLE_RPC_OPERATION_TYPE = "alipay.client.executerpc";
    public static final String SIMPLE_RPC_OPERATION_TYPE_BYTES = "alipay.client.executerpc.bytes";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f4043a = new ArrayList();

    public static String a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{new Integer(i), str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (Exception e) {
            LogCatUtil.error("RpcInvokerUtil", "memo=[" + str + "]", e);
            return "很抱歉，系统错误 [" + i + "]。";
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Exception e) {
            LogCatUtil.error("RpcInvokerUtil", "control=[" + str + "]", e);
            return str;
        }
    }

    public static final String getOperationTypeValue(Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba3d4c24", new Object[]{method, objArr});
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        if (operationType != null) {
            String value = operationType.value();
            if (isSimpleRpcAnnotation(value) || isSimpleRpcBytesAnnotation(value)) {
                return String.valueOf(objArr[0]);
            }
            return value;
        }
        throw new IllegalStateException("OperationType must be set.");
    }

    public static String getRpcVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b056bb70", new Object[0]);
        }
        try {
            Context context = TransportEnvUtil.getContext();
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("mobilegw.rpcVersion");
            return !TextUtils.isEmpty(string) ? string : "V2";
        } catch (Exception e) {
            LogCatUtil.warn("RpcInvokerUtil", e);
            return null;
        }
    }

    public static boolean isRetryable(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("363d4eb", new Object[]{method})).booleanValue();
        }
        if (((Retryable) method.getAnnotation(Retryable.class)) != null) {
            return true;
        }
        return false;
    }

    public static final boolean isSimpleRpcAnnotation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe3c456d", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, "alipay.client.executerpc");
    }

    public static final boolean isSimpleRpcBytesAnnotation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("504bcdc6", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, "alipay.client.executerpc.bytes");
    }

    public static final void postHandleForBizInterceptor(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr, InnerRpcInvokeContext innerRpcInvokeContext, ThreadLocal<Object> threadLocal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be3a8015", new Object[]{obj, bArr, cls, method, objArr, annotationArr, innerRpcInvokeContext, threadLocal});
            return;
        }
        try {
            for (RpcInterceptor rpcInterceptor : innerRpcInvokeContext.getRpcInterceptorList()) {
                if (!rpcInterceptor.postHandle(obj, threadLocal, bArr, cls, method, objArr, null)) {
                    throw new RpcException((Integer) 21, rpcInterceptor + "postHandle stop this call.");
                }
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            RpcException rpcException = new RpcException((Integer) 21, th.toString());
            rpcException.initCause(th);
            throw rpcException;
        }
    }

    public static void postHandleForPacketSize(Method method, Object[] objArr, InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43df035d", new Object[]{method, objArr, innerRpcInvokeContext});
            return;
        }
        try {
            if (MiscUtils.isDebugger(TransportEnvUtil.getContext()) && MiscUtils.isInAlipayClient(TransportEnvUtil.getContext()) && TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RPC_PACKAGE_SIZE_INTERCEPT), "T")) {
                Map<String, String> map = innerRpcInvokeContext.responseHeader;
                if (!map.isEmpty()) {
                    String str = map.get(HeaderConstant.HEADER_KEY_PARAM_REQ_SIZE);
                    String str2 = map.get(HeaderConstant.HEADER_KEY_PARAM_RES_SIZE);
                    TransportConfigureManager instance = TransportConfigureManager.getInstance();
                    long longValue = instance.getLongValue(TransportConfigureItem.RPC_REQSIZE_LIMIT);
                    long longValue2 = instance.getLongValue(TransportConfigureItem.RPC_RESSIZE_LIMIT);
                    String operationTypeValue = getOperationTypeValue(method, objArr);
                    List<String> list = f4043a;
                    if (((ArrayList) list).contains(operationTypeValue)) {
                        LogCatUtil.debug("RpcInvokerUtil", "opeType:" + operationTypeValue + " ,not first time,ignore");
                    } else if (Long.parseLong(str) > longValue) {
                        String str3 = "operationType:" + operationTypeValue + ",RPC Request size: " + str + " more than " + longValue + " byte,please optimize";
                        LogCatUtil.debug("RpcInvokerUtil", str3);
                        ((ArrayList) list).add(operationTypeValue);
                        throw new RpcException((Integer) 22, str3);
                    } else if (Long.parseLong(str2) > longValue2) {
                        String str4 = "operationType:" + operationTypeValue + ",RPC Response size: " + str2 + " more than " + longValue2 + " byte,please optimize";
                        LogCatUtil.debug("RpcInvokerUtil", str4);
                        ((ArrayList) list).add(operationTypeValue);
                        throw new RpcException((Integer) 23, str4);
                    }
                }
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInvokerUtil", "postHandleForPacketSize ex:" + th.toString(), th);
        }
    }

    public static final void preHandleForBizInterceptor(Object obj, Class<?> cls, Method method, Object[] objArr, InnerRpcInvokeContext innerRpcInvokeContext, ThreadLocal<Map<String, Object>> threadLocal, ThreadLocal<Object> threadLocal2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e08a5e4", new Object[]{obj, cls, method, objArr, innerRpcInvokeContext, threadLocal, threadLocal2});
            return;
        }
        try {
            for (RpcInterceptor rpcInterceptor : innerRpcInvokeContext.getRpcInterceptorList()) {
                if (!rpcInterceptor.preHandle(obj, threadLocal2, new byte[0], cls, method, objArr, null, threadLocal)) {
                    throw new RpcException((Integer) 21, rpcInterceptor + " preHandle stop this call.");
                }
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            RpcException rpcException = new RpcException((Integer) 21, th.toString());
            rpcException.initCause(th);
            throw rpcException;
        }
    }

    public static void preProcessResponse(Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dc0158", new Object[]{response});
            return;
        }
        HttpUrlResponse httpUrlResponse = (HttpUrlResponse) response;
        HttpUrlHeader header = httpUrlResponse.getHeader();
        Integer valueOf = Integer.valueOf(header.getHead(HeaderConstant.HEADER_KEY_RESULT_STATUS));
        int intValue = valueOf.intValue();
        String head = header.getHead(HeaderConstant.HEADER_KEY_TIPS);
        if (intValue != 1000 && intValue != 8001) {
            RpcException rpcException = new RpcException(valueOf, a(intValue, head));
            String head2 = httpUrlResponse.getHeader().getHead("alert");
            if (!TextUtils.isEmpty(head2)) {
                if (TextUtils.equals(head2, String.valueOf(0))) {
                    LogCatUtil.debug("RpcInvokerUtil", "set alertValue NO_ALERT");
                    rpcException.setAlert(0);
                } else if (TextUtils.equals(head2, String.valueOf(1))) {
                    LogCatUtil.debug("RpcInvokerUtil", "set alertValue TOAST_ALERT");
                    rpcException.setAlert(1);
                }
            }
            if (intValue == 1002) {
                String head3 = header.getHead(HeaderConstant.HEADER_KEY_CONTROL);
                if (!TextUtils.isEmpty(head3)) {
                    rpcException.setControl(b(head3));
                }
            }
            LogCatUtil.debug("HttpCaller", "preProcessResponse, alertValue:" + head2 + ", rpcException hashcode: " + rpcException.hashCode() + ", errcode: " + rpcException.getCode() + ", errmsg: " + rpcException.getMsg() + ", alert: " + rpcException.getAlert() + ", control: " + rpcException.getControl());
            throw rpcException;
        }
    }
}
