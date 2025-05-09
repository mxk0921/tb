package com.alibaba.ut.abtest.internal.bucketing.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum ExperimentType {
    AbComponent(2),
    AbUri(3),
    Redirect(4);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;

    ExperimentType(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(ExperimentType experimentType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/bucketing/model/ExperimentType");
    }

    public static ExperimentType valueOf(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExperimentType) ipChange.ipc$dispatch("8cfc2c11", new Object[]{str}) : (ExperimentType) Enum.valueOf(ExperimentType.class, str);
    }

    public int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }

    public static ExperimentType valueOf(int i) {
        ExperimentType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentType) ipChange.ipc$dispatch("603a3c4c", new Object[]{new Integer(i)});
        }
        for (ExperimentType experimentType : values()) {
            if (experimentType.getValue() == i) {
                return experimentType;
            }
        }
        return AbComponent;
    }
}
