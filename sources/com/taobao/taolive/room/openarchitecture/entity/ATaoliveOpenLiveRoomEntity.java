package com.taobao.taolive.room.openarchitecture.entity;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.azd;
import tb.bzd;
import tb.cf;
import tb.czd;
import tb.jbt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ATaoliveOpenLiveRoomEntity implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public azd abilityCompontent;
    public bzd dataCompontent;
    public cf eventCompontent;
    public czd uiCompontent;

    static {
        t2o.a(806355719);
        t2o.a(806355930);
    }

    public abstract void accessListener(AccessListenerEnum accessListenerEnum, Object... objArr);

    public abstract void callLifeCycle(TaoliveLifeCycleEnum taoliveLifeCycleEnum, Object obj);

    public abstract Object callPlatform(PlatformListenerEnum platformListenerEnum, Object... objArr);

    public abstract Object callWatchPlatform(WatchPlatformListenerEnum watchPlatformListenerEnum, Object... objArr);

    public abstract Object invokeCommand(TaoliveGatewayEnum taoliveGatewayEnum, jbt jbtVar, Object... objArr);
}
