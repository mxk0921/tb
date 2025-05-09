package com.taobao.android.tbuprofen.plugin;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum PluginEvent {
    CUSTOM_EVENT_BIG_MEM_ALLOC("BIG_MEM_ALLOC", 1000),
    CUSTOM_EVENT_MAIN_THREAD_LONG_BLOCK("MAIN_THREAD_LONG_BLOCK", 1001);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int index;
    private final String name;

    PluginEvent(String str, int i) {
        this.name = str;
        this.index = i;
    }

    public static /* synthetic */ Object ipc$super(PluginEvent pluginEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/plugin/PluginEvent");
    }

    public static PluginEvent valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PluginEvent) ipChange.ipc$dispatch("a9eb7866", new Object[]{str});
        }
        return (PluginEvent) Enum.valueOf(PluginEvent.class, str);
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
