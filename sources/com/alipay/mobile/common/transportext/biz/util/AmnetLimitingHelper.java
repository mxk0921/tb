package com.alipay.mobile.common.transportext.biz.util;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.models.MRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AmnetLimitingHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long getLimitingEndTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("151cbec6", new Object[0])).longValue();
        }
        return MRpcConnection.getInstance().getLimitingEndTime();
    }

    public static final MRpcResponse getLimitingMRpcResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRpcResponse) ipChange.ipc$dispatch("549b1099", new Object[0]);
        }
        String limitPrompt = MRpcConnection.getInstance().getLimitPrompt();
        LogCatUtil.info("MRpcStream", " createLimitMrpcResponse.  limitPrompt=[" + limitPrompt + "] ");
        HashMap hashMap = new HashMap(3);
        hashMap.put(HeaderConstant.HEADER_KEY_RESULT_STATUS, "1002");
        if (!TextUtils.isEmpty(limitPrompt)) {
            hashMap.put(HeaderConstant.HEADER_KEY_CONTROL, limitPrompt);
        }
        hashMap.put(HeaderConstant.HEADER_KEY_MEMO, "系统流量太大，请稍后再试！");
        MRpcResponse mRpcResponse = new MRpcResponse();
        mRpcResponse.headers = hashMap;
        mRpcResponse.body = new byte[0];
        return mRpcResponse;
    }

    public static boolean isServerLimiting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7fac0ff", new Object[0])).booleanValue();
        }
        return MRpcConnection.getInstance().isServerLimiting();
    }
}
