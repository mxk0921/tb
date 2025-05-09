package com.taobao.android.detail.ttdetail.bizmessage;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum PageLifeCycleMessage$PageLifeCycle {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(PageLifeCycleMessage$PageLifeCycle pageLifeCycleMessage$PageLifeCycle, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/PageLifeCycleMessage$PageLifeCycle");
    }

    public static PageLifeCycleMessage$PageLifeCycle valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageLifeCycleMessage$PageLifeCycle) ipChange.ipc$dispatch("786a3dc1", new Object[]{str});
        }
        return (PageLifeCycleMessage$PageLifeCycle) Enum.valueOf(PageLifeCycleMessage$PageLifeCycle.class, str);
    }
}
