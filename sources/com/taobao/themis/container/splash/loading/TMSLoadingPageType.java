package com.taobao.themis.container.splash.loading;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import tb.bbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TMSLoadingPageType {
    GAME,
    PUB,
    NON;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static TMSLoadingPageType getType(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSLoadingPageType) ipChange.ipc$dispatch("76ffb2e2", new Object[]{bbsVar});
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

    public static /* synthetic */ Object ipc$super(TMSLoadingPageType tMSLoadingPageType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/splash/loading/TMSLoadingPageType");
    }

    public static TMSLoadingPageType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSLoadingPageType) ipChange.ipc$dispatch("e8427b08", new Object[]{str});
        }
        return (TMSLoadingPageType) Enum.valueOf(TMSLoadingPageType.class, str);
    }
}
