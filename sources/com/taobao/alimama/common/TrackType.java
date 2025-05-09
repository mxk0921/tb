package com.taobao.alimama.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum TrackType {
    NONE("NONE"),
    IFS("IFS"),
    CPC("CPC"),
    CPM("CPM");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;

    TrackType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(TrackType trackType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/common/TrackType");
    }

    public static TrackType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrackType) ipChange.ipc$dispatch("10f3e0cd", new Object[]{str});
        }
        return (TrackType) Enum.valueOf(TrackType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
