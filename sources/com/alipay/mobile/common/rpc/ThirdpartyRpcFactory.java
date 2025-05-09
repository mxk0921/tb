package com.alipay.mobile.common.rpc;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ThirdpartyRpcFactory extends RpcFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ThirdpartyRpcFactory";

    public ThirdpartyRpcFactory(Config config) {
        super(config);
    }

    public static /* synthetic */ Object ipc$super(ThirdpartyRpcFactory thirdpartyRpcFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/ThirdpartyRpcFactory");
    }

    @Override // com.alipay.mobile.common.rpc.RpcFactory
    public void addRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896e0294", new Object[]{this, cls, rpcInterceptor});
        } else {
            LogCatUtil.debug(TAG, "addRpcInterceptor,do nothing");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcFactory
    public RpcInterceptor findRpcInterceptor(Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcInterceptor) ipChange.ipc$dispatch("57c86036", new Object[]{this, cls});
        }
        return null;
    }
}
