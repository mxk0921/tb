package com.taobao.taolive.room.openarchitecture.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum H5PlatfomListenerEnum {
    subscribePM,
    unsubscribePM,
    getConfiguration,
    setConfiguration,
    play,
    stop,
    resume,
    setMuted,
    isMuted,
    onAttachedToWebView,
    onDetachedFromWebView,
    onPause,
    onResume,
    onVisibilityChanged,
    getSessionInfo,
    onDestroy;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(H5PlatfomListenerEnum h5PlatfomListenerEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/listener/H5PlatfomListenerEnum");
    }

    public static H5PlatfomListenerEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H5PlatfomListenerEnum) ipChange.ipc$dispatch("34d0c2f6", new Object[]{str});
        }
        return (H5PlatfomListenerEnum) Enum.valueOf(H5PlatfomListenerEnum.class, str);
    }
}
