package com.taobao.tao.flexbox.layoutmanager.jsonpatch;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.EnumSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum CompatibilityFlags {
    MISSING_VALUES_AS_NULLS,
    REMOVE_NONE_EXISTING_ARRAY_ELEMENT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static EnumSet<CompatibilityFlags> defaults() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnumSet) ipChange.ipc$dispatch("7a1a3b29", new Object[0]);
        }
        return EnumSet.noneOf(CompatibilityFlags.class);
    }

    public static /* synthetic */ Object ipc$super(CompatibilityFlags compatibilityFlags, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/jsonpatch/CompatibilityFlags");
    }

    public static CompatibilityFlags valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompatibilityFlags) ipChange.ipc$dispatch("565a7b1b", new Object[]{str});
        }
        return (CompatibilityFlags) Enum.valueOf(CompatibilityFlags.class, str);
    }
}
