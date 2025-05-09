package com.alibaba.ariver.engine.api.resources;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum ResourceSourceType {
    ONLINE,
    OFFLINE,
    FALLBACK,
    SNAPSHOT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ResourceSourceType resourceSourceType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/engine/api/resources/ResourceSourceType");
    }

    public static ResourceSourceType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceSourceType) ipChange.ipc$dispatch("268e1220", new Object[]{str});
        }
        return (ResourceSourceType) Enum.valueOf(ResourceSourceType.class, str);
    }
}
