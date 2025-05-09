package com.taobao.themis.kernel.ability.register;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum AbilityType {
    GLOBAL,
    INSTANCE,
    SUBPAGE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AbilityType abilityType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/ability/register/AbilityType");
    }

    public static AbilityType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityType) ipChange.ipc$dispatch("2f1b7e51", new Object[]{str});
        }
        return (AbilityType) Enum.valueOf(AbilityType.class, str);
    }
}
