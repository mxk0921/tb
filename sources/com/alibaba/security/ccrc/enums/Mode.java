package com.alibaba.security.ccrc.enums;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum Mode {
    LOCAL(1, "端处置模式"),
    DEFAULT(2, "端云模式");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int code;
    public final String desc;

    Mode(int i, String str) {
        this.code = i;
        this.desc = str;
    }

    public static Mode get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("a0cfa04f", new Object[]{new Integer(i)});
        }
        Mode mode = LOCAL;
        if (i == mode.code) {
            return mode;
        }
        return DEFAULT;
    }

    public static /* synthetic */ Object ipc$super(Mode mode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/enums/Mode");
    }

    public static Mode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("cc45123c", new Object[]{str});
        }
        return (Mode) Enum.valueOf(Mode.class, str);
    }
}
