package com.taobao.alimama;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum ResultCode {
    COMMITED,
    INVALID_URL,
    DUPLICATED,
    INTERNAL_ERROR;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ResultCode resultCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/ResultCode");
    }

    public static ResultCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultCode) ipChange.ipc$dispatch("95cba444", new Object[]{str});
        }
        return (ResultCode) Enum.valueOf(ResultCode.class, str);
    }
}
