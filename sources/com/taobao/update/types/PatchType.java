package com.taobao.update.types;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gjv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum PatchType {
    INSTANTPATCH(0, gjv.HOTPATCH),
    CPPINLINEPATCH(1, gjv.CPPINLINEPATCH),
    MAIN(2, "main"),
    DYNAMICUPDATE(3, gjv.DYNAMICUPDATE),
    TESTURL(4, gjv.TEST_URL),
    PRELOAD(5, "preload");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String key;
    private int priority;

    PatchType(int i, String str) {
        this.priority = i;
        this.key = str;
    }

    public static /* synthetic */ Object ipc$super(PatchType patchType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/types/PatchType");
    }

    public static PatchType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchType) ipChange.ipc$dispatch("67867131", new Object[]{str});
        }
        return (PatchType) Enum.valueOf(PatchType.class, str);
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.key;
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.priority;
    }
}
