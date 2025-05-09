package com.alipay.android.msp.network.decorator;

import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BytesEnvelopDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BytesEnvelopDecorator() {
    }

    public static /* synthetic */ Object ipc$super(BytesEnvelopDecorator bytesEnvelopDecorator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/decorator/BytesEnvelopDecorator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] todo(byte[] r6, java.lang.String r7) throws com.alibaba.fastjson.JSONException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.decorator.BytesEnvelopDecorator.todo(byte[], java.lang.String):byte[]");
    }

    public BytesEnvelopDecorator(int i, BaseDecorator baseDecorator) {
        super(i, baseDecorator);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public Object undo(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e30bf8b", new Object[]{this, obj});
        }
        byte[] bArr = new byte[5];
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) obj);
            byteArrayInputStream.read(bArr);
            byte[] bArr2 = new byte[Integer.parseInt(new String(bArr))];
            byteArrayInputStream.read(bArr2);
            JSONObject parseObject = JSON.parseObject(new String(bArr2));
            JSONObject jSONObject = parseObject.getJSONObject("data");
            byteArrayInputStream.read(bArr);
            int parseInt = Integer.parseInt(new String(bArr));
            byte[] bArr3 = new byte[parseInt];
            byteArrayInputStream.read(bArr3);
            LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "DataSourceDecorator.undo", " params length ".concat(String.valueOf(parseInt)));
            String encodeToString = Base64.encodeToString(bArr3, 2);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("res_data", (Object) encodeToString);
            jSONObject.put("params", (Object) jSONObject2);
            BaseDecorator baseDecorator = this.mDecorator;
            if (baseDecorator == null) {
                return parseObject;
            }
            baseDecorator.setRequestConfig(this.mRequestConfig);
            return this.mDecorator.undo(parseObject);
        } catch (IOException e) {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DATA, ErrorCode.DATA_DATASOURCE_DECORATOR_UNDO_EXCEPTION, e);
            }
            throw new AppErrorException(ExceptionUtils.createExceptionMsg(ExceptionUtils.ERROR_MSG_DATA_ERROR, 204));
        }
    }
}
