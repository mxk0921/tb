package com.alibaba.wireless.aliprivacy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum AuthType {
    UNKNOWN,
    CAMERA,
    ALBUM,
    CONTACTS,
    LOCATION,
    MICROPHONE,
    CALENDAR,
    PHONE,
    SENSORS,
    SMS,
    STORAGE,
    PHYSICAL_ACTIVITY,
    SETTINGS;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AuthType authType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacy/AuthType");
    }

    public static AuthType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthType) ipChange.ipc$dispatch("c90a7535", new Object[]{str});
        }
        return (AuthType) Enum.valueOf(AuthType.class, str);
    }
}
