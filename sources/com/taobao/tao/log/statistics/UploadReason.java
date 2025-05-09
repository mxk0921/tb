package com.taobao.tao.log.statistics;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum UploadReason {
    UNKNOWN(0),
    SERVER_PULL(1),
    LOCAL_PUSH(2);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int value;

    UploadReason(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(UploadReason uploadReason, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/statistics/UploadReason");
    }

    public static UploadReason valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadReason) ipChange.ipc$dispatch("3cbf7c06", new Object[]{str});
        }
        return (UploadReason) Enum.valueOf(UploadReason.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return String.valueOf(this.value);
    }
}
