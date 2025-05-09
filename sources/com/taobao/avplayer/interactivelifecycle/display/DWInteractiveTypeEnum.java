package com.taobao.avplayer.interactivelifecycle.display;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum DWInteractiveTypeEnum {
    TIMELINE,
    COMPREHENSION,
    GOODSLIST,
    LABEL;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DWInteractiveTypeEnum dWInteractiveTypeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/interactivelifecycle/display/DWInteractiveTypeEnum");
    }

    public static DWInteractiveTypeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveTypeEnum) ipChange.ipc$dispatch("4b37adb0", new Object[]{str});
        }
        return (DWInteractiveTypeEnum) Enum.valueOf(DWInteractiveTypeEnum.class, str);
    }
}
