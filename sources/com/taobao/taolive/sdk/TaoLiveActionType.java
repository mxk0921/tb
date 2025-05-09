package com.taobao.taolive.sdk;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TaoLiveActionType {
    ACTION_FOLLOW,
    ACTION_FOLLOW_AND_REWARD,
    ACTION_ITEM,
    ACTION_POCKET,
    ACTION_NAV,
    ACTION_OPEN_ALIVE,
    ACTION_SEND_COMMENT,
    ACTION_LIKE,
    ACTION_SHARE,
    ACTION_SHOP_WINDOW,
    ACTION_EXT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TaoLiveActionType taoLiveActionType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/TaoLiveActionType");
    }

    public static TaoLiveActionType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveActionType) ipChange.ipc$dispatch("c41d76f7", new Object[]{str});
        }
        return (TaoLiveActionType) Enum.valueOf(TaoLiveActionType.class, str);
    }
}
