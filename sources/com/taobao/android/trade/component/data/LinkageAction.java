package com.taobao.android.trade.component.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum LinkageAction {
    REFRESH,
    REQUEST;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(LinkageAction linkageAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/component/data/LinkageAction");
    }

    public static LinkageAction valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkageAction) ipChange.ipc$dispatch("4eca9aa4", new Object[]{str});
        }
        return (LinkageAction) Enum.valueOf(LinkageAction.class, str);
    }
}
