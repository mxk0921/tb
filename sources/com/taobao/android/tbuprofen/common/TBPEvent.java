package com.taobao.android.tbuprofen.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum TBPEvent {
    TBP_EVENT_UNKNOWN("UNKNOWN", -1),
    TBP_EVENT_THREAD_START("THREAD_START", 52),
    TBP_EVENT_THREAD_END("THREAD_END", 53),
    TBP_EVENT_CLASS_FILE_LOAD_HOOK("CLASS_FILE_LOAD_HOOK", 54),
    TBP_EVENT_CLASS_LOAD("CLASS_LOAD", 55),
    TBP_EVENT_CLASS_PREPARE("CLASS_PREPARE", 56),
    TBP_EVENT_EXCEPTION("EXCEPTION", 58),
    TBP_EVENT_EXCEPTION_CATCH("EXCEPTION_CATCH", 59),
    TBP_EVENT_METHOD_ENTRY("METHOD_ENTRY", 65),
    TBP_EVENT_METHOD_EXIT("METHOD_EXIT", 66),
    TBP_EVENT_NATIVE_METHOD_BIND("NATIVE_METHOD_BIND", 67),
    TBP_EVENT_DATA_DUMP_REQUEST("DATA_DUMP_REQUEST", 71),
    TBP_EVENT_MONITOR_WAIT("MONITOR_WAIT", 73),
    TBP_EVENT_MONITOR_WAITED("MONITOR_WAITED", 74),
    TBP_EVENT_MONITOR_CONTENDED_ENTER("MONITOR_CONTENDED_ENTER", 75),
    TBP_EVENT_MONITOR_CONTENDED_ENTERED("MONITOR_CONTENDED_ENTERED", 76),
    TBP_EVENT_GARBAGE_COLLECTION_START("GARBAGE_COLLECTION_START", 81),
    TBP_EVENT_GARBAGE_COLLECTION_FINISH("GARBAGE_COLLECTION_FINISH", 82),
    TBP_EVENT_OBJECT_FREE("OBJECT_FREE", 83),
    TBP_EVENT_VM_OBJECT_ALLOC("OBJECT_ALLOC", 84);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int index;
    private final String name;

    TBPEvent(String str, int i) {
        this.name = str;
        this.index = i;
    }

    public static /* synthetic */ Object ipc$super(TBPEvent tBPEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/common/TBPEvent");
    }

    public static TBPEvent valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPEvent) ipChange.ipc$dispatch("481ac9", new Object[]{str});
        }
        return (TBPEvent) Enum.valueOf(TBPEvent.class, str);
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.index;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }
}
