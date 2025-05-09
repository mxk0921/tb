package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum ShowcaseType {
    TYPE_NORMAL,
    TYPE_SECKILL,
    TYPE_EXPLAININT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ShowcaseType showcaseType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/ShowcaseType");
    }

    public static ShowcaseType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShowcaseType) ipChange.ipc$dispatch("b68afbe9", new Object[]{str});
        }
        return (ShowcaseType) Enum.valueOf(ShowcaseType.class, str);
    }
}
