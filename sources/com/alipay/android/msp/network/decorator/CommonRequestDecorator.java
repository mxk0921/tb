package com.alipay.android.msp.network.decorator;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CommonRequestDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CommonRequestDecorator() {
    }

    public static /* synthetic */ Object ipc$super(CommonRequestDecorator commonRequestDecorator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/decorator/CommonRequestDecorator");
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public String undo(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30f39cf9", new Object[]{this, obj});
        }
        return null;
    }

    public CommonRequestDecorator(int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
        JSONObject parseObject = JSON.parseObject(new String(bArr));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) this.mRequestConfig.getType());
        jSONObject.put("method", (Object) this.mRequestConfig.getMethod());
        parseObject.put("action", (Object) jSONObject);
        String engineParams = PluginManager.getRender().getEngineParams();
        if (engineParams.contains("||")) {
            LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "CommonRequestDecorator.todo", "bpArgsError:".concat(engineParams));
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_BP_ARGS_ERROR, "bp:".concat(engineParams));
            }
        }
        parseObject.put("bp", (Object) engineParams);
        if (this.mRequestConfig.ismNeedUa()) {
            parseObject.put(MspGlobalDefine.UAC, (Object) MspConfig.getInstance().getUserAgentC());
        }
        parseObject.put("gzip", (Object) Boolean.valueOf(this.mRequestConfig.isSupportGzip()));
        if (!TextUtils.isEmpty(this.mRequestConfig.getSessionId())) {
            parseObject.put(MspGlobalDefine.SESSION, (Object) this.mRequestConfig.getSessionId());
        }
        parseObject.put("tid", (Object) TidStorage.getInstance().getTid());
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CommonRequestDecorator.todo", "CommonRequest:".concat(String.valueOf(parseObject)));
        byte[] bytes = parseObject.toString().getBytes();
        BaseDecorator baseDecorator = this.mDecorator;
        if (baseDecorator == null) {
            return bytes;
        }
        baseDecorator.setRequestConfig(this.mRequestConfig);
        return this.mDecorator.todo(bytes, str);
    }
}
