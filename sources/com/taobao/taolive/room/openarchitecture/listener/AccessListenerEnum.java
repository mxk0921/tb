package com.taobao.taolive.room.openarchitecture.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum AccessListenerEnum {
    streamPlay,
    streamPause,
    playerFirstFrameRender,
    playerError,
    mtopRequestSuccess,
    mtopRequestFail,
    onLive,
    onReplay,
    onPrelive,
    liveRoomUserLeave,
    liveRoomEnd,
    onLiveRoomWatchCountChange,
    onFollowAction,
    onUnfollowAciton,
    onLiveRoomMuteAction,
    onClickCleanScreen,
    onVerticalScrollEnable,
    onVerticalScrollDisable,
    onHorizontalScrollEnable,
    onHorizontalScrollDisable,
    onRecieveDetailResponse,
    onFloatViewShow,
    postInteractiveMsg;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AccessListenerEnum accessListenerEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/listener/AccessListenerEnum");
    }

    public static AccessListenerEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessListenerEnum) ipChange.ipc$dispatch("69608a4a", new Object[]{str});
        }
        return (AccessListenerEnum) Enum.valueOf(AccessListenerEnum.class, str);
    }
}
