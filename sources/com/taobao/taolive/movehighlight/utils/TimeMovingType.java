package com.taobao.taolive.movehighlight.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum TimeMovingType {
    CONSTENTBASED("0"),
    ITEMBASED("1");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String code;

    TimeMovingType(String str) {
        this.code = str;
    }

    public static boolean checkContentTimeMove(VideoInfo videoInfo) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a4dd5b", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || (timeMovingPlayInfo = videoInfo.timeMovingPlayInfo) == null || !CONSTENTBASED.code.equals(timeMovingPlayInfo.timeMovingType)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(TimeMovingType timeMovingType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/utils/TimeMovingType");
    }

    public static TimeMovingType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeMovingType) ipChange.ipc$dispatch("1d483d57", new Object[]{str});
        }
        return (TimeMovingType) Enum.valueOf(TimeMovingType.class, str);
    }
}
