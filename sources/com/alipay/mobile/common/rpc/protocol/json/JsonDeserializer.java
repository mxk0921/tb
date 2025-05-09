package com.alipay.mobile.common.rpc.protocol.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.protocol.AbstractDeserializer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.lang.reflect.Type;

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
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/protocol/json/JsonDeserializer");
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Deserializer
    public Object parser() {
        String str;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("caac2ecc", new Object[]{this});
        }
        try {
            JSONObject parseObject = JSON.parseObject(new String(this.mData));
            int intValue = parseObject.getIntValue("resultStatus");
            String string = parseObject.getString("tips");
            if (intValue != 1000) {
                RpcException rpcException = new RpcException(Integer.valueOf(intValue), string);
                if (intValue == 1002 && (jSONObject = parseObject.getJSONObject(Constants.KEY_CONTROL)) != null) {
                    rpcException.setControl(jSONObject.toJSONString());
                }
                throw rpcException;
            } else if (this.mType == String.class) {
                return parseObject.getString("result");
            } else {
                return JSON.parseObject(parseObject.getString("result"), this.mType, new Feature[0]);
            }
        } catch (JSONException e) {
            if (("response  =" + new String(this.mData) + ":" + e) == null) {
                str = "";
            } else {
                str = e.getMessage();
            }
            throw new RpcException((Integer) 10, str);
        }
    }
}
