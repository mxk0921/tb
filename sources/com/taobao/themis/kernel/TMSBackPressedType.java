package com.taobao.themis.kernel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSBackPressedType extends Enum<TMSBackPressedType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSBackPressedType ON_KEY_DOWN = new TMSBackPressedType("ON_KEY_DOWN", 0);
    public static final TMSBackPressedType TITLE_BAR_BACK_ACTION = new TMSBackPressedType("TITLE_BAR_BACK_ACTION", 1);
    private static final /* synthetic */ TMSBackPressedType[] $VALUES = $values();

    private static final /* synthetic */ TMSBackPressedType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSBackPressedType[]) ipChange.ipc$dispatch("cedd6f5e", new Object[0]) : new TMSBackPressedType[]{ON_KEY_DOWN, TITLE_BAR_BACK_ACTION};
    }

    private TMSBackPressedType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(TMSBackPressedType tMSBackPressedType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/TMSBackPressedType");
    }

    public static TMSBackPressedType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("8a18ecd3", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(TMSBackPressedType.class, str);
        }
        return (TMSBackPressedType) valueOf;
    }

    public static TMSBackPressedType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("a339c802", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (TMSBackPressedType[]) clone;
    }
}
