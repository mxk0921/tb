package com.taobao.taolive.sdk.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum LiveEmbedType {
    NORMAL,
    SHOP_CARD,
    SHOP_CARD_UI_HIDE,
    SHOP_FULLSCREEN;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(LiveEmbedType liveEmbedType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/LiveEmbedType");
    }

    public static LiveEmbedType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveEmbedType) ipChange.ipc$dispatch("4309b7f4", new Object[]{str});
        }
        return (LiveEmbedType) Enum.valueOf(LiveEmbedType.class, str);
    }
}
