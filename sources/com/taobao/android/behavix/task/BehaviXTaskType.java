package com.taobao.android.behavix.task;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum BehaviXTaskType {
    BATCH_TASK("batch", 1),
    UPLOAD_TASK("upload", 1),
    FEATURE_WRITE_TASK("featureWrite", 1);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String taskName;
    public int taskType;

    BehaviXTaskType(String str, int i) {
        this.taskName = str;
        this.taskType = i;
    }

    public static /* synthetic */ Object ipc$super(BehaviXTaskType behaviXTaskType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/task/BehaviXTaskType");
    }

    public static BehaviXTaskType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BehaviXTaskType) ipChange.ipc$dispatch("b8b65573", new Object[]{str});
        }
        return (BehaviXTaskType) Enum.valueOf(BehaviXTaskType.class, str);
    }
}
