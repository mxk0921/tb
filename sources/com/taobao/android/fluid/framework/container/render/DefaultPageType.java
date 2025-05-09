package com.taobao.android.fluid.framework.container.render;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum DefaultPageType {
    LOADING,
    HIDE,
    NORMAL_ERROR,
    EMPTY_FOLLOW,
    NO_PERMISSION;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DefaultPageType defaultPageType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/container/render/DefaultPageType");
    }

    public static DefaultPageType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultPageType) ipChange.ipc$dispatch("e0ebeec2", new Object[]{str});
        }
        return (DefaultPageType) Enum.valueOf(DefaultPageType.class, str);
    }
}
