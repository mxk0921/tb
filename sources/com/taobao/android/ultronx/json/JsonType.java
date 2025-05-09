package com.taobao.android.ultronx.json;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum JsonType {
    INVALID(0),
    BOOL(1),
    NUMBER(2),
    STRING(3),
    ARRAY(4),
    OBJECT(5);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int val;

    JsonType(int i) {
        this.val = i;
    }

    public static /* synthetic */ Object ipc$super(JsonType jsonType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultronx/json/JsonType");
    }

    public static JsonType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonType) ipChange.ipc$dispatch("d26c2de1", new Object[]{str});
        }
        return (JsonType) Enum.valueOf(JsonType.class, str);
    }
}
