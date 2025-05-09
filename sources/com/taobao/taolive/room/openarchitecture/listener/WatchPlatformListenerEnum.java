package com.taobao.taolive.room.openarchitecture.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum WatchPlatformListenerEnum {
    createOpenWatchContainer,
    openContainer_onCreate,
    openContainer_onStart,
    openContainer_onResume,
    openContainer_onPause,
    openContainer_onStop,
    openContainer_onDestroy,
    setClickCloseRoomListener,
    setClickMoreListener,
    setSmallWindowClickListener,
    onConfigurationChanged,
    onClickCloseBtn,
    onLowMemory,
    onTrimMemory,
    updateUri,
    isDestroyed,
    onKeyDown,
    processAddCartAction,
    processGoToDetailAction,
    processGoToBulkDetailAction,
    getUbeeContainer,
    refreshByIntent,
    refreshByUi,
    setOnScrollListener,
    setRoomFinishListener,
    setUTDelegateCallback,
    procResumeForH5Embed,
    sendBroadcasterForRecEngine,
    getGlobalContext,
    onCanProcessCustomBackAction,
    setEnableAutoShowZoomWindowAbility,
    getCurRoomIndex,
    getRecyclerView,
    isForceDestroy,
    isFloatViewShowing,
    fetchCurrentTppParams,
    isInSmallMode,
    clearScreen,
    onTabUnselected,
    onTab2MoreLiveGuideShow,
    getLiveAudioStatus;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WatchPlatformListenerEnum watchPlatformListenerEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/listener/WatchPlatformListenerEnum");
    }

    public static WatchPlatformListenerEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WatchPlatformListenerEnum) ipChange.ipc$dispatch("fa4d4c7c", new Object[]{str});
        }
        return (WatchPlatformListenerEnum) Enum.valueOf(WatchPlatformListenerEnum.class, str);
    }
}
