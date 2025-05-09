package com.alibaba.android.ultron.ext.vlayout.extend;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum ViewLifeCycleHelper$STATUS {
    APPEARING,
    APPEARED,
    DISAPPEARING,
    DISAPPEARED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ViewLifeCycleHelper$STATUS viewLifeCycleHelper$STATUS, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/extend/ViewLifeCycleHelper$STATUS");
    }

    public static ViewLifeCycleHelper$STATUS valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewLifeCycleHelper$STATUS) ipChange.ipc$dispatch("8b88750b", new Object[]{str});
        }
        return (ViewLifeCycleHelper$STATUS) Enum.valueOf(ViewLifeCycleHelper$STATUS.class, str);
    }
}
