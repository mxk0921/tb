package com.alipay.android.msp.network.decorator;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DynamicHostEnvelopDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DynamicHostEnvelopDecorator dynamicHostEnvelopDecorator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/decorator/DynamicHostEnvelopDecorator");
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, (Object) Build.MODEL);
        jSONObject2.put("namespace", (Object) this.mRequestConfig.getNamespace());
        jSONObject2.put("api_name", (Object) this.mRequestConfig.getApiName());
        jSONObject2.put("api_version", (Object) this.mRequestConfig.getApiVersion());
        jSONObject2.put("params", (Object) JSON.parseObject(new String(bArr)));
        jSONObject.put("data", (Object) jSONObject2);
        String json = jSONObject.toString();
        if (!TextUtils.isEmpty(this.mRequestConfig.getRequestKey())) {
            json = this.mRequestConfig.getRequestKey() + "=" + json;
        }
        byte[] bytes = json.getBytes();
        BaseDecorator baseDecorator = this.mDecorator;
        if (baseDecorator == null) {
            return bytes;
        }
        baseDecorator.setRequestConfig(this.mRequestConfig);
        return this.mDecorator.todo(bytes, str);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public Object undo(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e30bf8b", new Object[]{this, obj});
        }
        JSONObject jSONObject = (JSONObject) obj;
        try {
            LogUtil.record(2, "DynamicHostEnvelopDecorator.undo", jSONObject.toJSONString());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data").getJSONObject("params");
        if (jSONObject2.containsKey(MspGlobalDefine.SESSION)) {
            this.mRequestConfig.setSessionId(jSONObject2.getString(MspGlobalDefine.SESSION));
        }
        BaseDecorator baseDecorator = this.mDecorator;
        if (baseDecorator == null) {
            return jSONObject2.toString();
        }
        baseDecorator.setRequestConfig(this.mRequestConfig);
        return this.mDecorator.undo(jSONObject2);
    }
}
