package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcThreadParamsHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_RESPONSE_HEADER = "key_rpc_response_headers";

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Object>> f4569a = new ThreadLocal<Map<String, Object>>() { // from class: com.alipay.vi.android.phone.mrpc.core.RpcThreadParamsHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/vi/android/phone/mrpc/core/RpcThreadParamsHelper$1");
        }

        @Override // java.lang.ThreadLocal
        public final Map<String, Object> initialValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d848a9c9", new Object[]{this}) : new HashMap(1);
        }
    };

    public static final void clearThreadLocalValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7082bd", new Object[0]);
            return;
        }
        try {
            f4569a.remove();
        } catch (Throwable unused) {
        }
    }

    public static final HttpUrlHeader getResponseHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlHeader) ipChange.ipc$dispatch("5334adf2", new Object[0]);
        }
        Object obj = f4569a.get().get(KEY_RESPONSE_HEADER);
        if (obj == null || !(obj instanceof HttpUrlHeader)) {
            return null;
        }
        return (HttpUrlHeader) obj;
    }

    public static final ThreadLocal<Map<String, Object>> getThreadLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("1502a816", new Object[0]);
        }
        return f4569a;
    }

    public static final void setResponseHeaders(HttpUrlHeader httpUrlHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e2feb62", new Object[]{httpUrlHeader});
        } else {
            f4569a.get().put(KEY_RESPONSE_HEADER, httpUrlHeader);
        }
    }
}
