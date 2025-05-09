package com.ut.mini.behavior;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum UTEventId {
    PAGE(2001),
    EXPOSURE(2201),
    CLICK(2201),
    SCROLL(2601),
    SCENE(2701);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int eventId;

    UTEventId(int i) {
        this.eventId = i;
    }

    public static /* synthetic */ Object ipc$super(UTEventId uTEventId, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/UTEventId");
    }

    public static UTEventId valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTEventId) ipChange.ipc$dispatch("7b5763bd", new Object[]{str});
        }
        return (UTEventId) Enum.valueOf(UTEventId.class, str);
    }

    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return this.eventId;
    }
}
