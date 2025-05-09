package com.alipay.literpc.android.phone.mrpc.core.gwprotocol;

import com.alipay.literpc.android.phone.mrpc.core.RpcException;
import com.alipay.literpc.jsoncodec.JSONCodec;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JsonDeserializer extends AbstractDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public JsonDeserializer(Type type, byte[] bArr) {
        super(type, bArr);
    }

    public static /* synthetic */ Object ipc$super(JsonDeserializer jsonDeserializer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/literpc/android/phone/mrpc/core/gwprotocol/JsonDeserializer");
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Deserializer
    public Object parser() throws RpcException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("caac2ecc", new Object[]{this});
        }
        try {
            String str2 = new String(this.mData);
            StringBuilder sb = new StringBuilder("threadid = ");
            sb.append(Thread.currentThread().getId());
            sb.append("; rpc response:  ");
            sb.append(str2);
            JSONObject jSONObject = new JSONObject(str2);
            int i = jSONObject.getInt("resultStatus");
            if (i != 1000) {
                throw new RpcException(Integer.valueOf(i), jSONObject.optString("tips"));
            } else if (this.mType == String.class) {
                return jSONObject.optString("result");
            } else {
                return JSONCodec.parseObject(jSONObject.optString("result"), this.mType);
            }
        } catch (Exception e) {
            if (("response  =" + new String(this.mData) + ":" + e) == null) {
                str = "";
            } else {
                str = e.getMessage();
            }
            throw new RpcException((Integer) 10, str);
        }
    }
}
