package com.alipay.vi.android.phone.mrpc.core.util;

import android.text.TextUtils;
import com.alipay.vi.mobile.framework.service.annotation.OperationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcInvokerUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIMPLE_RPC_OPERATION_TYPE = "alipay.client.executerpc";
    public static final String SIMPLE_RPC_OPERATION_TYPE_BYTES = "alipay.client.executerpc.bytes";

    public static Map<String, String> getHeadersValue(Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af019876", new Object[]{method, objArr});
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        if (operationType != null) {
            String value = operationType.value();
            if (isSimpleRpcAnnotation(value) || isSimpleRpcBytesAnnotation(value)) {
                return (Map) objArr[2];
            }
            return null;
        }
        throw new IllegalStateException("OperationType must be set.");
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
}
