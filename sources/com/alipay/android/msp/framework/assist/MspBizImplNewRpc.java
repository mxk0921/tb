package com.alipay.android.msp.framework.assist;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.network.pb.Pbv3SDKRpcRequest;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.transport.AlipayNetStarter;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.alipay.mobile.framework.service.ext.SimpleRpcService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspBizImplNewRpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static JSONObject sendRpcUsingStandaloneRpcLibMaybeThrow(Context context, boolean z, String str, String str2, Map<String, String> map) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("da0480b4", new Object[]{context, new Boolean(z), str, str2, map});
        }
        AlipayNetStarter.getInstance().initNetwork(context);
        MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(context);
        SimpleRpcService simpleRpcService = (SimpleRpcService) mpaasRpcServiceImpl.getRpcProxy(SimpleRpcService.class);
        RpcInvokeContext rpcInvokeContext = mpaasRpcServiceImpl.getRpcInvokeContext(simpleRpcService);
        if (rpcInvokeContext != null) {
            rpcInvokeContext.setRpcLoggerLevel(1);
            String configSDKAppId = GlobalHelper.getInstance().getConfigSDKAppId();
            if (!TextUtils.isEmpty(configSDKAppId)) {
                rpcInvokeContext.setAppId(configSDKAppId);
                rpcInvokeContext.setAppKey(configSDKAppId);
            } else {
                rpcInvokeContext.setAppId("TAOBAO_AND");
            }
            rpcInvokeContext.setGwUrl("https://mobilegw.alipay.com/mgw.htm");
            if (GlobalConstant.DEBUG) {
                Pbv3SDKRpcRequest.switchEnvironment(rpcInvokeContext);
            }
            if (map == null) {
                map = new HashMap<>();
            }
            rpcInvokeContext.setRequestHeaders(map);
            if (z) {
                str3 = Base64.encodeToString(simpleRpcService.executeRPC(str, Base64.decode(str2, 2), (Map<String, String>) null), 2);
            } else {
                str3 = simpleRpcService.executeRPC(str, str2, (Map<String, String>) null);
            }
            LogUtil.record(8, "MspSdkEngine:executeRpc", "resp : ".concat(String.valueOf(str3)));
            if (str3 != null) {
                return JSON.parseObject(str3);
            }
            return null;
        }
        DrmKey.sRpcExCount++;
        throw new NullPointerException("getRpcInvokeContext null");
    }
}
