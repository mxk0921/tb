package com.taobao.themis.container.splash.titlebar;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import tb.bbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TMSLoadingTitleBarType {
    PUB,
    GAME,
    NON;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static TMSLoadingTitleBarType getType(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSLoadingTitleBarType) ipChange.ipc$dispatch("403b386b", new Object[]{bbsVar});
        }
        TMSSolutionType a0 = bbsVar.a0();
        if (a0 == TMSSolutionType.MIX) {
            return PUB;
        }
        if (a0 == TMSSolutionType.MINIGAME) {
            return GAME;
        }
        return NON;
    }

    public static /* synthetic */ Object ipc$super(TMSLoadingTitleBarType tMSLoadingTitleBarType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/splash/titlebar/TMSLoadingTitleBarType");
    }

    public static TMSLoadingTitleBarType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSLoadingTitleBarType) ipChange.ipc$dispatch("d24d9805", new Object[]{str});
        }
        return (TMSLoadingTitleBarType) Enum.valueOf(TMSLoadingTitleBarType.class, str);
    }
}
