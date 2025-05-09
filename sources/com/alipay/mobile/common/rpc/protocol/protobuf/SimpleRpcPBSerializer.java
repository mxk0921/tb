package com.alipay.mobile.common.rpc.protocol.protobuf;

import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SimpleRpcPBSerializer extends PBSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SimpleRpcPBSerializer";
    public byte[] c;

    public SimpleRpcPBSerializer(int i, String str, Object obj) {
        super(i, str, obj);
    }

    public static /* synthetic */ Object ipc$super(SimpleRpcPBSerializer simpleRpcPBSerializer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/protocol/protobuf/SimpleRpcPBSerializer");
    }

    @Override // com.alipay.mobile.common.rpc.protocol.protobuf.PBSerializer, com.alipay.mobile.common.rpc.protocol.Serializer
    public byte[] packet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        try {
            LogCatUtil.debug("SimpleRpc", "====SimpleRpcPBSerializer====packet");
            byte[] bArr = this.c;
            if (bArr != null) {
                return bArr;
            }
            synchronized (this) {
                byte[] bArr2 = this.c;
                if (bArr2 != null) {
                    return bArr2;
                }
                Object obj = this.mParams;
                if (obj == null) {
                    LogCatUtil.warn(TAG, "mParams is null.");
                    byte[] bArr3 = new byte[0];
                    this.c = bArr3;
                    return bArr3;
                } else if (!(obj instanceof Object[])) {
                    LogCatUtil.warn(TAG, "mParams not instanceof Object[].");
                    byte[] bArr4 = new byte[0];
                    this.c = bArr4;
                    return bArr4;
                } else {
                    Object[] objArr = (Object[]) obj;
                    if (objArr.length <= 0) {
                        LogCatUtil.warn(TAG, "Protobuf mParams length=0");
                        byte[] bArr5 = new byte[0];
                        this.c = bArr5;
                        return bArr5;
                    } else if (objArr.length != 3) {
                        LogCatUtil.warn(TAG, "SimpleRpcService should be 3 params, params.length=" + objArr.length);
                        return null;
                    } else {
                        this.c = (byte[]) objArr[1];
                        try {
                            LogCatUtil.debug(TAG, "PB Data size=" + this.c.length + ",PB Data=" + this.c.toString());
                        } catch (Exception unused) {
                        }
                        return this.c;
                    }
                }
            }
        } catch (Throwable th) {
            MonitorErrorLogHelper.log(TAG, th);
            throw new RpcException((Integer) 20, th);
        }
    }
}
