package com.alipay.mobile.common.rpc.protocol.protobuf;

import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.protocol.AbstractDeserializer;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.ext.ProtobufCodec;
import com.alipay.mobile.common.transport.ext.ProtobufCodecFactory;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PBDeserializer extends AbstractDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Response response;

    public PBDeserializer(Type type, Response response) {
        super(type, response.getResData());
        this.response = response;
    }

    public static /* synthetic */ Object ipc$super(PBDeserializer pBDeserializer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/protocol/protobuf/PBDeserializer");
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Deserializer
    public Object parser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("caac2ecc", new Object[]{this});
        }
        try {
            RpcInvokerUtil.preProcessResponse(this.response);
            if (this.mType == Void.TYPE) {
                return null;
            }
            ProtobufCodec defaultProtobufCodec = ProtobufCodecFactory.getDefaultProtobufCodec();
            if (defaultProtobufCodec != null) {
                return defaultProtobufCodec.deserialize(this.mType, this.mData);
            }
            throw new RuntimeException("protobufCodec == null");
        } catch (Throwable th) {
            if (th instanceof RpcException) {
                throw th;
            }
            MonitorErrorLogHelper.log("PBDeserializer", MiscUtils.getRootCause(th));
            throw new RpcException((Integer) 10, (Throwable) th);
        }
    }
}
