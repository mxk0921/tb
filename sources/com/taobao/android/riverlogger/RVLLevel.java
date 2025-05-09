package com.taobao.android.riverlogger;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum RVLLevel {
    Off(0, "Off"),
    Error(1, "Error"),
    Warn(2, "Warn"),
    Info(3, "Info"),
    Debug(4, "Debug"),
    Verbose(5, "Verbose");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String name;
    public final int value;
    private static final RVLLevel[] levelValues = {Off, Error, Warn, Info, Debug, Verbose};

    RVLLevel(int i, String str) {
        this.value = i;
        this.name = str;
    }

    public static /* synthetic */ Object ipc$super(RVLLevel rVLLevel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/riverlogger/RVLLevel");
    }

    public static RVLLevel parse(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLLevel) ipChange.ipc$dispatch("edec3445", new Object[]{obj});
        }
        if (obj == null) {
            return Info;
        }
        if (obj instanceof String) {
            try {
                return valueOf((String) obj);
            } catch (Exception unused) {
            }
        } else if (obj instanceof Number) {
            return valueOf(((Number) obj).intValue(), Info);
        }
        return Info;
    }

    public static RVLLevel valueOf(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RVLLevel) ipChange.ipc$dispatch("e60fc1e8", new Object[]{str}) : (RVLLevel) Enum.valueOf(RVLLevel.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.name;
    }

    public static RVLLevel valueOf(int i, RVLLevel rVLLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLLevel) ipChange.ipc$dispatch("760aa1ba", new Object[]{new Integer(i), rVLLevel});
        }
        if (i >= 0) {
            RVLLevel[] rVLLevelArr = levelValues;
            if (i < rVLLevelArr.length) {
                return rVLLevelArr[i];
            }
        }
        return rVLLevel;
    }
}
