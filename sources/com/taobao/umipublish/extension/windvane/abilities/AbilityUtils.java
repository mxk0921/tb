package com.taobao.umipublish.extension.windvane.abilities;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.kdp;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"umipublish_extends_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AbilityUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767145);
    }

    public static final BaseAbility a(Class<? extends IAbility> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseAbility) ipChange.ipc$dispatch("c306cd82", new Object[]{cls});
        }
        ckf.g(cls, "abilityClass");
        return (BaseAbility) kdp.a(cls, new Object[0]);
    }
}
