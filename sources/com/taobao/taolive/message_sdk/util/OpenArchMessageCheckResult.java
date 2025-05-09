package com.taobao.taolive.message_sdk.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum OpenArchMessageCheckResult {
    MessageCheckResultPassed(0),
    MessageCheckResultTopicNotMatch(-1),
    MessageCheckResultMsgIDDuplicated(-2),
    MessageCheckResultMsgDataEmpty(-3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;

    OpenArchMessageCheckResult(int i) {
        this.code = i;
    }

    public static /* synthetic */ Object ipc$super(OpenArchMessageCheckResult openArchMessageCheckResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/util/OpenArchMessageCheckResult");
    }

    public static OpenArchMessageCheckResult valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageCheckResult) ipChange.ipc$dispatch("e48ac322", new Object[]{str});
        }
        return (OpenArchMessageCheckResult) Enum.valueOf(OpenArchMessageCheckResult.class, str);
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }
}
