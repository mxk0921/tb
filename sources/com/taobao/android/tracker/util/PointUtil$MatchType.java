package com.taobao.android.tracker.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum PointUtil$MatchType {
    MatchType_Null,
    MatchType_Id,
    MatchType_Class;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(PointUtil$MatchType pointUtil$MatchType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tracker/util/PointUtil$MatchType");
    }

    public static PointUtil$MatchType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointUtil$MatchType) ipChange.ipc$dispatch("f1b84180", new Object[]{str});
        }
        return (PointUtil$MatchType) Enum.valueOf(PointUtil$MatchType.class, str);
    }
}
