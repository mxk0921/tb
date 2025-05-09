package org.android.spdy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum RequestPriority {
    HIGHEST(1),
    HIGH(2),
    MEDIUM(3),
    LOW(4),
    LOWEST(5),
    IDLE(6),
    DEFAULT_PRIORITY(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int priority;

    RequestPriority(int i) {
        this.priority = i;
    }

    public static /* synthetic */ Object ipc$super(RequestPriority requestPriority, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/spdy/RequestPriority");
    }

    public static RequestPriority valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestPriority) ipChange.ipc$dispatch("8963facb", new Object[]{str});
        }
        return (RequestPriority) Enum.valueOf(RequestPriority.class, str);
    }

    public int getPriorityInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93241c6f", new Object[]{this})).intValue();
        }
        return this.priority;
    }
}
