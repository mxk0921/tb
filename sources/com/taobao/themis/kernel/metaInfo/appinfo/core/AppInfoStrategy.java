package com.taobao.themis.kernel.metaInfo.appinfo.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum AppInfoStrategy {
    ASYNC_LOAD("asyncLoad"),
    SYNC_LOAD("syncLoad"),
    LOCAL_LOAD("localLoad"),
    ALREADY_ASYNC_LOAD("alreadyAsyncLoad"),
    FORCE_SYNC_LOAD("forceSyncLoad");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String name;

    AppInfoStrategy(String str) {
        this.name = str;
    }

    public static /* synthetic */ Object ipc$super(AppInfoStrategy appInfoStrategy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/metaInfo/appinfo/core/AppInfoStrategy");
    }

    public static AppInfoStrategy valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoStrategy) ipChange.ipc$dispatch("882c0aba", new Object[]{str});
        }
        return (AppInfoStrategy) Enum.valueOf(AppInfoStrategy.class, str);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }
}
