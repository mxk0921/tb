package com.taobao.taolive.lpm_android.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum EventType {
    USERACTION("UserAction"),
    MESSAGE("Message"),
    MTOP("Mtop"),
    ORANGE("Orange"),
    AB("AB"),
    MESSAGEUSERACTION("MessageUserAction"),
    VPM("VPM"),
    SYSTEM("System"),
    TAOLIVE_GOODS("TaoLiveGoods");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mName;

    EventType(String str) {
        this.mName = str;
    }

    public static /* synthetic */ Object ipc$super(EventType eventType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/lpm_android/event/EventType");
    }

    public static EventType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventType) ipChange.ipc$dispatch("972a4037", new Object[]{str});
        }
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }
}
