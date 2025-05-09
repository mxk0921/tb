package com.taobao.themis.kernel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSContainerType extends Enum<TMSContainerType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSContainerType GENERIC = new TMSContainerType("GENERIC", 0);
    public static final TMSContainerType EMBEDDED = new TMSContainerType("EMBEDDED", 1);
    private static final /* synthetic */ TMSContainerType[] $VALUES = $values();

    private static final /* synthetic */ TMSContainerType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSContainerType[]) ipChange.ipc$dispatch("b50f01d8", new Object[0]) : new TMSContainerType[]{GENERIC, EMBEDDED};
    }

    private TMSContainerType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(TMSContainerType tMSContainerType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/TMSContainerType");
    }

    public static TMSContainerType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("7485588d", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(TMSContainerType.class, str);
        }
        return (TMSContainerType) valueOf;
    }

    public static TMSContainerType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("931337c", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (TMSContainerType[]) clone;
    }
}
