package org.android.netutil;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum NetListenerType {
    NL_NULL(-1),
    NL_NEW_IP_ADDRESS(0),
    NL_INTERFACE_ON_OFF(1);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long value;

    NetListenerType(long j) {
        this.value = j;
    }

    public static /* synthetic */ Object ipc$super(NetListenerType netListenerType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/netutil/NetListenerType");
    }

    public static NetListenerType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetListenerType) ipChange.ipc$dispatch("b21e83fa", new Object[]{str});
        }
        return (NetListenerType) Enum.valueOf(NetListenerType.class, str);
    }

    public long getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b6", new Object[]{this})).longValue();
        }
        return this.value;
    }
}
