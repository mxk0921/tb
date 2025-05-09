package com.taobao.mediaplay;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum MediaLifecycleType {
    BEFORE,
    PLAY,
    DEFAULT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MediaLifecycleType mediaLifecycleType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/MediaLifecycleType");
    }

    public static MediaLifecycleType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLifecycleType) ipChange.ipc$dispatch("491e33c0", new Object[]{str});
        }
        return (MediaLifecycleType) Enum.valueOf(MediaLifecycleType.class, str);
    }
}
