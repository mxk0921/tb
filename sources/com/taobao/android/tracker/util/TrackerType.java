package com.taobao.android.tracker.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum TrackerType {
    TrackerType_Click,
    TrackerType_Exposure;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TrackerType trackerType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tracker/util/TrackerType");
    }

    public static TrackerType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackerType) ipChange.ipc$dispatch("9f1c9b9b", new Object[]{str});
        }
        return (TrackerType) Enum.valueOf(TrackerType.class, str);
    }
}
