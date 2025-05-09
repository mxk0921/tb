package com.alipay.mobile.common.rpc.protocol.protobuf;

import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SimpleRpcPBDeserializer extends PBDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SimpleRpcPBDeserializer(Type type, Response response) {
        super(type, response);
    }

    public static /* synthetic */ Object ipc$super(SimpleRpcPBDeserializer simpleRpcPBDeserializer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/protocol/protobuf/SimpleRpcPBDeserializer");
    }

    @Override // com.alipay.mobile.common.rpc.protocol.protobuf.PBDeserializer, com.alipay.mobile.common.rpc.protocol.Deserializer
    public Object parser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("caac2ecc", new Object[]{this});
        }
        try {
            LogCatUtil.debug("SimpleRpc", "====SimpleRpcPBDeserializer====parser");
            RpcInvokerUtil.preProcessResponse(this.response);
            if (this.mType == Void.TYPE) {
                return null;
            }
            return this.mData;
        } catch (Throwable th) {
            if (th instanceof RpcException) {
                throw th;
            }
            MonitorErrorLogHelper.log("SimpleRpcPBDeserializer", MiscUtils.getRootCause(th));
            throw new RpcException((Integer) 10, (Throwable) th);
        }
    }
}
