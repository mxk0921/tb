package com.taobao.taolive.room.openarchitecture.gateway.command.type;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TaoliveGatewayEnum {
    TaoliveGateway_Create_OpenLiveRoom,
    TaoliveGateway_Create_OpenLiveRoomView,
    TaoliveGateway_Create_OpenLiveCompontent,
    TaoliveGateway_Create_OpenH5PlatformView,
    TaoliveGateway_Create_OpenH5Compontent,
    TaoliveGateway_Create_OpenWatchContainer,
    TaoliveGateway_Create_OpenWatchCompontent;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TaoliveGatewayEnum taoliveGatewayEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/gateway/command/type/TaoliveGatewayEnum");
    }

    public static TaoliveGatewayEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveGatewayEnum) ipChange.ipc$dispatch("829f821", new Object[]{str});
        }
        return (TaoliveGatewayEnum) Enum.valueOf(TaoliveGatewayEnum.class, str);
    }
}
