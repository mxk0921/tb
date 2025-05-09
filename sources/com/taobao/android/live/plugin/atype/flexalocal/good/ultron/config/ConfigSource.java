package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum ConfigSource {
    FILE(1),
    MT2(2),
    NETWORK(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;

    ConfigSource(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(ConfigSource configSource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/config/ConfigSource");
    }

    public static ConfigSource valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigSource) ipChange.ipc$dispatch("c76900f5", new Object[]{str});
        }
        return (ConfigSource) Enum.valueOf(ConfigSource.class, str);
    }

    public int getIntValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e178cb2", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
