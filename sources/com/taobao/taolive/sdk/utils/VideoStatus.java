package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum VideoStatus {
    VIDEO_NORMAL_STATUS,
    VIDEO_TIMESHIFT_STATUS,
    VIDEO_HEIGHLIGHT_STATUS;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(VideoStatus videoStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/utils/VideoStatus");
    }

    public static VideoStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("7b811206", new Object[]{str});
        }
        return (VideoStatus) Enum.valueOf(VideoStatus.class, str);
    }
}
