package com.alibaba.ariver.kernel.api.extension;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum ExtensionType {
    NORMAL,
    BRIDGE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ExtensionType extensionType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/kernel/api/extension/ExtensionType");
    }

    public static ExtensionType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtensionType) ipChange.ipc$dispatch("d0196a5", new Object[]{str});
        }
        return (ExtensionType) Enum.valueOf(ExtensionType.class, str);
    }
}
