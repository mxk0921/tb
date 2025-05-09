package com.taobao.android.artry.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum EffectType {
    TRY_GLASS,
    INTERACT_3D,
    TRY_SHOE,
    TRY_WATCH,
    NO_SUPPORT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(EffectType effectType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/common/EffectType");
    }

    public static EffectType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EffectType) ipChange.ipc$dispatch("da87e7f5", new Object[]{str});
        }
        return (EffectType) Enum.valueOf(EffectType.class, str);
    }
}
