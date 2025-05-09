package com.alipay.mobile.framework.service.common;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MpaasRpcServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MpaasRpcService f4220a;

    public static MpaasRpcService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MpaasRpcService) ipChange.ipc$dispatch("e4909cf6", new Object[0]);
        }
        Context context = TransportEnvUtil.getContext();
        if (context != null) {
            return getInstance(context);
        }
        throw new RuntimeException("Context is null from TransportEnvUtil#getContext");
    }

    public static void setMpaasRpcService(MpaasRpcService mpaasRpcService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aacd877", new Object[]{mpaasRpcService});
        } else {
            f4220a = mpaasRpcService;
        }
    }

    public static MpaasRpcService getInstance(Context context) {
        MpaasRpcService mpaasRpcService = f4220a;
        if (mpaasRpcService != null) {
            return mpaasRpcService;
        }
        synchronized (MpaasRpcService.class) {
            try {
                MpaasRpcService mpaasRpcService2 = f4220a;
                if (mpaasRpcService2 != null) {
                    return mpaasRpcService2;
                }
                if (context != null) {
                    String stringFromMetaData = MiscUtils.getStringFromMetaData(context, "mpaas_rpc_service_class");
                    if (!TextUtils.isEmpty(stringFromMetaData)) {
                        f4220a = (MpaasRpcService) Class.forName(stringFromMetaData, true, context.getClassLoader()).getConstructor(Context.class).newInstance(context);
                        LogCatUtil.info("MpaasRpcServiceFactory", "Loaded mpaas rpc service: " + stringFromMetaData + ", object hashcode: " + f4220a.hashCode());
                        return f4220a;
                    }
                    MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(TransportEnvUtil.getContext());
                    f4220a = mpaasRpcServiceImpl;
                    return mpaasRpcServiceImpl;
                }
                throw new RuntimeException("Context parameter is null.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
