package com.taobao.taolive.room.openarchitecture.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum PlatformListenerEnum {
    onFollowAction,
    onUnfollowAciton,
    callReportAction,
    callVideoStart,
    onCreate,
    onWillAppear,
    onDidAppear,
    onWillDisappear,
    onDidDisappear,
    onPause,
    onResume,
    onStop,
    onStart,
    onDestory,
    callFetchUTArgsWithParams,
    updateUserTrackData,
    setSmallWindowClickListener,
    needPresentAvatarPage,
    setContainerOffset,
    mute,
    getVideoInfo,
    onBindView,
    onViewHolderWillLoad,
    onViewHolderWillAppear,
    onViewHolderDidAppear,
    onViewHolderWillDisappear,
    onViewHolderDidDisappear,
    onViewHolderDestroy;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(PlatformListenerEnum platformListenerEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/listener/PlatformListenerEnum");
    }

    public static PlatformListenerEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlatformListenerEnum) ipChange.ipc$dispatch("d27c159b", new Object[]{str});
        }
        return (PlatformListenerEnum) Enum.valueOf(PlatformListenerEnum.class, str);
    }
}
