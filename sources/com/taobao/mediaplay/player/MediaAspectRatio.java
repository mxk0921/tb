package com.taobao.mediaplay.player;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum MediaAspectRatio {
    DW_FIT_CENTER,
    DW_CENTER_CROP,
    DW_FIT_X_Y;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MediaAspectRatio mediaAspectRatio, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mediaplay/player/MediaAspectRatio");
    }

    public static MediaAspectRatio valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaAspectRatio) ipChange.ipc$dispatch("d1585179", new Object[]{str});
        }
        return (MediaAspectRatio) Enum.valueOf(MediaAspectRatio.class, str);
    }
}
