package com.taobao.tao.friends.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum SourceType {
    RECENT,
    RECOMMEND,
    NONE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(SourceType sourceType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/friends/model/SourceType");
    }

    public static SourceType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SourceType) ipChange.ipc$dispatch("3994a415", new Object[]{str});
        }
        return (SourceType) Enum.valueOf(SourceType.class, str);
    }
}
