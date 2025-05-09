package com.taobao.tao.log.statistics;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum UploadStage {
    UNKNOWN(0),
    STAGE_REQ(1),
    STAGE_REQ_TOKEN(2),
    STAGE_RES_TOKEN(3),
    STAGE_UPLOAD(4),
    STAGE_DONE(5);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int value;

    UploadStage(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(UploadStage uploadStage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/statistics/UploadStage");
    }

    public static UploadStage valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadStage) ipChange.ipc$dispatch("5f54698e", new Object[]{str});
        }
        return (UploadStage) Enum.valueOf(UploadStage.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return String.valueOf(this.value);
    }
}
