package com.taobao.taolive.room.openarchitecture.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TaoliveOpenBizCodeEnum {
    TaoLiveOpenBizCode_ShopTab3,
    TaoLiveOpenBizCode_Shop2F,
    TaoLiveOpenBizCode_NewShop,
    TaoLiveOpenBizCode_H5VideoCard,
    TaoLiveOpenBizCode_OpenWatch,
    TaoLiveOpenBizCode_StandardOpenWatch,
    TaoLiveOpenBizCode_HomeTab,
    TaoLiveOpenBizCode_Tab2;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TaoliveOpenBizCodeEnum taoliveOpenBizCodeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/entity/TaoliveOpenBizCodeEnum");
    }

    public static TaoliveOpenBizCodeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenBizCodeEnum) ipChange.ipc$dispatch("59b90de9", new Object[]{str});
        }
        return (TaoliveOpenBizCodeEnum) Enum.valueOf(TaoliveOpenBizCodeEnum.class, str);
    }
}
