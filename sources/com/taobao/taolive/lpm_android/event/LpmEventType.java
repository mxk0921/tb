package com.taobao.taolive.lpm_android.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum LpmEventType {
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

    LpmEventType(String str) {
        this.mName = str;
    }

    public static /* synthetic */ Object ipc$super(LpmEventType lpmEventType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/lpm_android/event/LpmEventType");
    }

    public static LpmEventType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LpmEventType) ipChange.ipc$dispatch("eb2e85a0", new Object[]{str});
        }
        return (LpmEventType) Enum.valueOf(LpmEventType.class, str);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }
}
