package com.alibaba.poplayer.utils;

import androidx.core.view.InputDeviceCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum ConsoleLogger$Level {
    V('v', -1),
    I('i', -16711936),
    W('w', InputDeviceCompat.SOURCE_ANY),
    E('e', -65536),
    D('d', tkt.DEFAULT_LINK_COLOR);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int color;
    public char sign;

    ConsoleLogger$Level(char c, int i) {
        this.sign = c;
        this.color = i;
    }

    public static ConsoleLogger$Level find(char c) {
        ConsoleLogger$Level[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConsoleLogger$Level) ipChange.ipc$dispatch("7ab3978d", new Object[]{new Character(c)});
        }
        for (ConsoleLogger$Level consoleLogger$Level : values()) {
            if (consoleLogger$Level.sign == c) {
                return consoleLogger$Level;
            }
        }
        return D;
    }

    public static /* synthetic */ Object ipc$super(ConsoleLogger$Level consoleLogger$Level, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/poplayer/utils/ConsoleLogger$Level");
    }

    public static ConsoleLogger$Level valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConsoleLogger$Level) ipChange.ipc$dispatch("26e91f11", new Object[]{str});
        }
        return (ConsoleLogger$Level) Enum.valueOf(ConsoleLogger$Level.class, str);
    }
}
