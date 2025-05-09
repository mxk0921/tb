package com.taobao.android.miniLive.state;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum MiniLiveState {
    LiveStatusClosed,
    LiveStatusSmallWindow,
    LiveStatusGlobalWindow,
    LiveStatusZoomWindow,
    LiveStatusHidden;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MiniLiveState miniLiveState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/state/MiniLiveState");
    }

    public static MiniLiveState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniLiveState) ipChange.ipc$dispatch("fd87cb53", new Object[]{str});
        }
        return (MiniLiveState) Enum.valueOf(MiniLiveState.class, str);
    }
}
