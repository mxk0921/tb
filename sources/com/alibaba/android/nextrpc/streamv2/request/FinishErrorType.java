package com.alibaba.android.nextrpc.streamv2.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/FinishErrorType;", "", "(Ljava/lang/String;I)V", "FINISH_NONE", "MTOP_FAILURE", "TIMEOUT", "CANCEL", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum FinishErrorType {
    FINISH_NONE,
    MTOP_FAILURE,
    TIMEOUT,
    CANCEL;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FinishErrorType finishErrorType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/streamv2/request/FinishErrorType");
    }

    public static FinishErrorType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("75339fb2", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(FinishErrorType.class, str);
        }
        return (FinishErrorType) valueOf;
    }
}
