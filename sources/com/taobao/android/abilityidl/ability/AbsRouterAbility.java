package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cho;
import tb.jdb;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsRouterAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336646);
    }

    public static /* synthetic */ Object ipc$super(AbsRouterAbility absRouterAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsRouterAbility");
    }

    public abstract void closeApp(kdb kdbVar, jdb jdbVar);

    public abstract tao<Map<String, Object>, ErrorResult> getPageProps(kdb kdbVar);

    public abstract void popPage(kdb kdbVar, jdb jdbVar);

    public abstract void popToRoot(kdb kdbVar, jdb jdbVar);

    public abstract void pushPage(kdb kdbVar, cho choVar, jdb jdbVar);

    public abstract void replacePage(kdb kdbVar, cho choVar, jdb jdbVar);

    public abstract void resetToPage(kdb kdbVar, cho choVar, jdb jdbVar);
}
