package com.taobao.client.isv.config.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum DefaultConfigManager$ConfigSource {
    auks,
    person;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DefaultConfigManager$ConfigSource defaultConfigManager$ConfigSource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/client/isv/config/manager/DefaultConfigManager$ConfigSource");
    }

    public static DefaultConfigManager$ConfigSource valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultConfigManager$ConfigSource) ipChange.ipc$dispatch("5a9205b0", new Object[]{str});
        }
        return (DefaultConfigManager$ConfigSource) Enum.valueOf(DefaultConfigManager$ConfigSource.class, str);
    }
}
