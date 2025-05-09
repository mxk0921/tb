package com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum GatewayPhaseEnum {
    networkTime,
    dataParserTime,
    uiRenderTime;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(GatewayPhaseEnum gatewayPhaseEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/clienttoservermonitorservice/impl/GatewayPhaseEnum");
    }

    public static GatewayPhaseEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GatewayPhaseEnum) ipChange.ipc$dispatch("9ca08e1b", new Object[]{str});
        }
        return (GatewayPhaseEnum) Enum.valueOf(GatewayPhaseEnum.class, str);
    }
}
