package com.ut.mini.behavior.data;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum DataType {
    Begin(TplMsg.VALUE_T_NATIVE_RETURN),
    Event("e");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;

    DataType(String str) {
        this.value = str;
    }

    public static DataType getDataType(String str) {
        DataType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataType) ipChange.ipc$dispatch("183134d8", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return Event;
        }
        for (DataType dataType : values()) {
            if (dataType.getValue().equals(str)) {
                return dataType;
            }
        }
        return Event;
    }

    public static /* synthetic */ Object ipc$super(DataType dataType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/data/DataType");
    }

    public static DataType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataType) ipChange.ipc$dispatch("4f8e14ea", new Object[]{str});
        }
        return (DataType) Enum.valueOf(DataType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
