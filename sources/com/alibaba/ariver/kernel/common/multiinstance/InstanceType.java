package com.alibaba.ariver.kernel.common.multiinstance;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum InstanceType {
    ALIPAY("ap"),
    TAOBAO("tb");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    InstanceType(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(InstanceType instanceType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/kernel/common/multiinstance/InstanceType");
    }

    public static InstanceType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceType) ipChange.ipc$dispatch("a7350985", new Object[]{str});
        }
        return (InstanceType) Enum.valueOf(InstanceType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
