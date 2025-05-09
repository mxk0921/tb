package com.alipay.android.msp.network.decorator;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.encrypt.TriDesCBC;
import com.alipay.android.msp.framework.exception.GzipException;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.utils.GzipUtils;
import com.alipay.android.msp.utils.net.LogicUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BytesEncryptDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BytesEncryptDecorator() {
    }

    public static /* synthetic */ Object ipc$super(BytesEncryptDecorator bytesEncryptDecorator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/decorator/BytesEncryptDecorator");
    }

    public BytesEncryptDecorator(int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
        try {
            bArr = GzipUtils.toGzip(bArr);
            this.mRequestConfig.isSupportGzip(true);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addEvent(new StEvent(WeexZipModule.NAME, "1", ""));
            }
        } catch (GzipException unused) {
            this.mRequestConfig.isSupportGzip(false);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addEvent(new StEvent(WeexZipModule.NAME, "0", ""));
            }
        }
        byte[] encryptedData = LogicUtil.getEncryptedData(this.mRequestConfig.getTridesKey(), bArr);
        BaseDecorator baseDecorator = this.mDecorator;
        if (baseDecorator == null) {
            return encryptedData;
        }
        baseDecorator.setRequestConfig(this.mRequestConfig);
        return this.mDecorator.todo(encryptedData, str);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public Object undo(Object obj) throws Exception {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e30bf8b", new Object[]{this, obj});
        }
        JSONObject jSONObject = (JSONObject) obj;
        try {
            string = jSONObject.getJSONObject("data").getJSONObject("params").getString("res_data");
        } catch (Exception unused) {
            this.mRequestConfig.isSupportGzip(false);
        }
        if (TextUtils.isEmpty(string)) {
            return jSONObject;
        }
        byte[] decrypt = TriDesCBC.decrypt(this.mRequestConfig.getTridesKey(), Base64.decode(string, 2));
        if (this.mRequestConfig.ismResponseHeaderGzipFlag()) {
            JSONObject parseObject = JSON.parseObject(new String(GzipUtils.unGZip(decrypt), "utf-8"));
            if (parseObject.containsKey(MspGlobalDefine.SESSION)) {
                this.mRequestConfig.setSessionId(parseObject.getString(MspGlobalDefine.SESSION));
            }
            if (parseObject.containsKey(MspGlobalDefine.UAC)) {
                this.mRequestConfig.setmUac(parseObject.getIntValue(MspGlobalDefine.UAC));
            } else {
                this.mRequestConfig.setmUac(0);
            }
            if (parseObject.containsKey("trade_no")) {
                this.mRequestConfig.setmTradeNo(parseObject.getString("trade_no"));
            }
            jSONObject = parseObject;
        } else {
            this.mRequestConfig.isSupportGzip(false);
        }
        BaseDecorator baseDecorator = this.mDecorator;
        if (baseDecorator == null) {
            return jSONObject.toString();
        }
        baseDecorator.setRequestConfig(this.mRequestConfig);
        return this.mDecorator.undo(jSONObject);
    }
}
