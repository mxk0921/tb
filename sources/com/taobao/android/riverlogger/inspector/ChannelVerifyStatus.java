package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum ChannelVerifyStatus {
    NotVerified,
    Verifying,
    VerifySuccess,
    VerifyFailed;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ChannelVerifyStatus channelVerifyStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/riverlogger/inspector/ChannelVerifyStatus");
    }

    public static ChannelVerifyStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChannelVerifyStatus) ipChange.ipc$dispatch("fee8c75c", new Object[]{str});
        }
        return (ChannelVerifyStatus) Enum.valueOf(ChannelVerifyStatus.class, str);
    }
}
