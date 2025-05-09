package com.alipay.ariver.utils;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.remoterpc.serivce.RVRpcEnviromentService;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppInfoUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getAppId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[0]);
        }
        return ((RVRpcEnviromentService) RVProxy.get(RVRpcEnviromentService.class)).getAppId();
    }

    public static String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[0]);
        }
        return ((RVRpcEnviromentService) RVProxy.get(RVRpcEnviromentService.class)).getAppKey();
    }
}
