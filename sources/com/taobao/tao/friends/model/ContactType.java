package com.taobao.tao.friends.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum ContactType {
    FRIEND,
    MORE_CONTACT,
    CONTINGENT,
    LINK;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ContactType contactType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/friends/model/ContactType");
    }

    public static ContactType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContactType) ipChange.ipc$dispatch("f37372b2", new Object[]{str});
        }
        return (ContactType) Enum.valueOf(ContactType.class, str);
    }
}
