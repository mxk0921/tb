package com.taobao.share.taopassword.constants;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kis;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum TPAction {
    COPY("copy"),
    SMS("sms"),
    OTHER(kis.TAO);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String type;

    TPAction(String str) {
        this.type = str;
    }

    public static /* synthetic */ Object ipc$super(TPAction tPAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/taopassword/constants/TPAction");
    }

    public static TPAction valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TPAction) ipChange.ipc$dispatch("73dbca43", new Object[]{str});
        }
        return (TPAction) Enum.valueOf(TPAction.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.type;
    }
}
