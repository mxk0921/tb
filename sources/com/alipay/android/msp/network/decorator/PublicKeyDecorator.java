package com.alipay.android.msp.network.decorator;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.exception.PublicKeyException;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PublicKeyDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PublicKeyDecorator(int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
    }

    public static /* synthetic */ Object ipc$super(PublicKeyDecorator publicKeyDecorator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/decorator/PublicKeyDecorator");
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        BaseDecorator baseDecorator = this.mDecorator;
        if (baseDecorator == null) {
            return bArr;
        }
        baseDecorator.setRequestConfig(this.mRequestConfig);
        return this.mDecorator.todo(bArr, str);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public Object undo(Object obj) throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e30bf8b", new Object[]{this, obj});
        }
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            int intValue = jSONObject2.containsKey("code") ? jSONObject2.getIntValue("code") : 503;
            JSONObject jSONObject3 = jSONObject2.getJSONObject("params");
            if (intValue == 1000) {
                if (jSONObject3 != null) {
                    if (jSONObject3.containsKey("public_key")) {
                        str = jSONObject3.getString("public_key");
                    } else {
                        str = jSONObject3.getString(MspFlybirdDefine.FLYBIRD_PKEY);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        MspConfig.getInstance().setRsaPublicKey(str);
                        throw new PublicKeyException();
                    }
                    throw new AppErrorException(ExceptionUtils.createExceptionMsg(ExceptionUtils.ERROR_MSG_DATA_ERROR, 203));
                }
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
                if (mspContextByBizId != null) {
                    mspContextByBizId.getStatisticInfo().addError(ErrorType.DATA, ErrorCode.DATA_GET_RSA_KEY, "缺少RSA-KEY数据");
                }
                throw new AppErrorException(ExceptionUtils.createExceptionMsg(ExceptionUtils.ERROR_MSG_DATA_ERROR, 202));
            }
        }
        BaseDecorator baseDecorator = this.mDecorator;
        if (baseDecorator == null) {
            return jSONObject;
        }
        baseDecorator.setRequestConfig(this.mRequestConfig);
        return this.mDecorator.undo(jSONObject);
    }
}
