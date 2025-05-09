package com.taobao.android.tbuprofen.plugin;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum PluginCapacity {
    FUN_UNKNOWN("UNKNOWN"),
    FUN_BIG_ALLOC_MONITOR("BIG_ALLOC"),
    FUNC_GC_MONITOR("GC"),
    FUNC_MAIN_LOCK_MONITOR("MAIN_LOCK"),
    FUNC_CAUGHT_EXCEPTION_MONITOR("CAUGHT_EXCEPTION"),
    FUNC_CLASS_PREPARED_MONITOR("CLASS_PREPARED"),
    FUNC_SIGQUIT_DUMP("SIGQUIT_DUMP"),
    FUNC_DUMP_HEAP("DUMP_HEAP"),
    FUNC_THREAD_MONITOR("THREAD_MONITOR");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String name;

    PluginCapacity(String str) {
        this.name = str;
    }

    public static /* synthetic */ Object ipc$super(PluginCapacity pluginCapacity, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/plugin/PluginCapacity");
    }

    public static PluginCapacity parse(String str) {
        PluginCapacity[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PluginCapacity) ipChange.ipc$dispatch("163a0df1", new Object[]{str});
        }
        for (PluginCapacity pluginCapacity : values()) {
            if (TextUtils.equals(pluginCapacity.name, str)) {
                return pluginCapacity;
            }
        }
        return FUN_UNKNOWN;
    }

    public static PluginCapacity valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PluginCapacity) ipChange.ipc$dispatch("41cb011c", new Object[]{str});
        }
        return (PluginCapacity) Enum.valueOf(PluginCapacity.class, str);
    }
}
