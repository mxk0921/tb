package com.alibaba.security.ccrc.enums;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum InitState {
    UNINIT(-1, "未初始化"),
    INIT_ING(0, "初始化中..."),
    INITED(1, "已经初始化"),
    INIT_SUCCESS(2, "初始化成功"),
    INIT_FAIL(3, "初始化失败");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String msg;
    public final int state;

    InitState(int i, String str) {
        this.state = i;
        this.msg = str;
    }

    public static /* synthetic */ Object ipc$super(InitState initState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/enums/InitState");
    }

    public static InitState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InitState) ipChange.ipc$dispatch("1f76e636", new Object[]{str});
        }
        return (InitState) Enum.valueOf(InitState.class, str);
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.state;
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.msg;
    }
}
