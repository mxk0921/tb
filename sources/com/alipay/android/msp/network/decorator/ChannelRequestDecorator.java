package com.alipay.android.msp.network.decorator;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ChannelRequestDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3703a;

    public ChannelRequestDecorator(Context context, int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
        this.f3703a = context;
    }

    public static /* synthetic */ Object ipc$super(ChannelRequestDecorator channelRequestDecorator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/decorator/ChannelRequestDecorator");
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public String undo(Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30f39cf9", new Object[]{this, obj});
        }
        return null;
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        MspContext mspContextByBizId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        String str2 = new String(bArr);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MspGlobalDefine.PA, (Object) MspConfig.getInstance().getPa(this.f3703a));
        String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(this.f3703a);
        if (TextUtils.isEmpty(apdidToken) || apdidToken.length() <= 15) {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 2));
        } else {
            jSONObject.put(MspGlobalDefine.UA, (Object) MspConfig.getInstance().getUserAgentByType(false, 1));
        }
        jSONObject.put("utdid", (Object) GlobalHelper.getInstance().getUtdid(this.f3703a));
        jSONObject.put(MspGlobalDefine.EXTERNAL_INFO, (Object) str2);
        String engineParams = PluginManager.getRender().getEngineParams();
        if (engineParams.contains("||") && (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId)) != null) {
            mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_BP_ARGS_ERROR, "bp:".concat(engineParams));
        }
        jSONObject.put("bp", (Object) engineParams);
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
