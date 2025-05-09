package com.alipay.mobile.common.rpc.protocol.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.protocol.AbstractDeserializer;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import org.apache.http.util.EncodingUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JsonDeserializerV2 extends AbstractDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Response f4036a;

    public JsonDeserializerV2(Type type, byte[] bArr) {
        super(type, bArr);
    }

    public static /* synthetic */ Object ipc$super(JsonDeserializerV2 jsonDeserializerV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/protocol/json/JsonDeserializerV2");
    }

    public final void a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder("threadid = ");
        sb.append(Thread.currentThread().getId());
        sb.append("; rpc response:  ");
        sb.append(str);
        sb.append(" mType=");
        Type type = this.mType;
        if (type != null) {
            str2 = type.getClass().getSimpleName();
        } else {
            str2 = " is null ";
        }
        sb.append(str2);
        LogCatUtil.verbose("JsonDeserializerV2", sb.toString());
    }

    public JsonDeserializerV2(Type type, Response response) {
        super(type, response.getResData());
        this.f4036a = response;
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Deserializer
    public Object parser() {
        String str;
        RpcException th;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("caac2ecc", new Object[]{this});
        }
        try {
            RpcInvokerUtil.preProcessResponse(this.f4036a);
            if (this.mType == Void.TYPE) {
                return null;
            }
            str = EncodingUtils.getString(this.mData, "UTF-8");
            try {
                return JSON.parseObject(str, this.mType, new Feature[0]);
            } catch (Throwable th2) {
                th = th2;
                if (!(th instanceof RpcException)) {
                    MonitorErrorLogHelper.log("JsonDeserializerV2", MiscUtils.getRootCause(th));
                    if (("response  =" + str + ":" + th) != null) {
                        str2 = th.getMessage();
                    }
                    RpcException rpcException = new RpcException((Integer) 10, str2);
                    rpcException.initCause(th);
                    a(str);
                    throw rpcException;
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            str = str2;
        }
    }
}
