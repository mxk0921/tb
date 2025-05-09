package com.alibaba.ut.abtest;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum UTABEnvironment {
    Product(0),
    Prepare(1),
    Daily(2);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;

    UTABEnvironment(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(UTABEnvironment uTABEnvironment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/UTABEnvironment");
    }

    public static UTABEnvironment valueOf(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTABEnvironment) ipChange.ipc$dispatch("66ba68e4", new Object[]{str}) : (UTABEnvironment) Enum.valueOf(UTABEnvironment.class, str);
    }

    public int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }

    public static UTABEnvironment valueOf(int i) {
        UTABEnvironment[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABEnvironment) ipChange.ipc$dispatch("779ba1f", new Object[]{new Integer(i)});
        }
        for (UTABEnvironment uTABEnvironment : values()) {
            if (uTABEnvironment.getValue() == i) {
                return uTABEnvironment;
            }
        }
        return Product;
    }
}
