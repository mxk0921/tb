package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Init of enum CANAL_MAIN can be incorrect */
/* JADX WARN: Init of enum CANAL_SUB can be incorrect */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexInstanceInternalMode {
    DOM(WeexInstanceMode.DOM),
    MUS(WeexInstanceMode.MUS),
    XR(WeexInstanceMode.XR),
    CANAL_MAIN(r7),
    CANAL_SUB(r7),
    SCRIPT(WeexInstanceMode.SCRIPT);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final WeexInstanceMode instanceMode;

    static {
        WeexInstanceMode weexInstanceMode = WeexInstanceMode.CANAL;
    }

    WeexInstanceInternalMode(WeexInstanceMode weexInstanceMode) {
        this.instanceMode = weexInstanceMode;
    }

    public static /* synthetic */ Object ipc$super(WeexInstanceInternalMode weexInstanceInternalMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceInternalMode");
    }

    public static WeexInstanceInternalMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceInternalMode) ipChange.ipc$dispatch("cce0b93b", new Object[]{str});
        }
        return (WeexInstanceInternalMode) Enum.valueOf(WeexInstanceInternalMode.class, str);
    }
}
