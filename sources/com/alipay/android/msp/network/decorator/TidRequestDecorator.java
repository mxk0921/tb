package com.alipay.android.msp.network.decorator;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TidRequestDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TidRequestDecorator(int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
    }

    public static /* synthetic */ Object ipc$super(TidRequestDecorator tidRequestDecorator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/decorator/TidRequestDecorator");
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public String undo(Object obj) throws AppErrorException, JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30f39cf9", new Object[]{this, obj});
        }
        return null;
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        JSONObject jSONObject = new JSONObject();
        GlobalHelper instance = GlobalHelper.getInstance();
        jSONObject.put(MspGlobalDefine.PA, (Object) MspConfig.getInstance().getPa(instance.getContext()));
        String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(instance.getContext());
        if (TextUtils.isEmpty(apdidToken) || apdidToken.length() <= 15) {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(true, 2, true));
        } else {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(true, 1, true));
        }
        jSONObject.put("utdid", (Object) instance.getUtdid(instance.getContext()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) this.mRequestConfig.getType());
        jSONObject2.put("method", (Object) this.mRequestConfig.getMethod());
        jSONObject.put("action", (Object) jSONObject2);
        BaseDecorator baseDecorator = this.mDecorator;
        if (baseDecorator == null) {
            return jSONObject.toString().getBytes();
        }
        baseDecorator.setRequestConfig(this.mRequestConfig);
        return this.mDecorator.todo(jSONObject.toString().getBytes(), str);
    }
}
