package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.heh;
import tb.kdb;
import tb.meh;
import tb.mx6;
import tb.t2o;
import tb.vq;
import tb.xeh;
import tb.ygh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class LogAbilityWrapper extends AbsAbilityWrapper<AbsLogAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337265);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogAbilityWrapper(AbsLogAbility absLogAbility) {
        super(absLogAbility);
        ckf.g(absLogAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(LogAbilityWrapper logAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/LogAbilityWrapper");
    }

    @Override // com.alibaba.ability.AbsAbilityWrapper, tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        switch (str.hashCode()) {
            case 3237038:
                if (!str.equals("info")) {
                    return null;
                }
                try {
                    getAbilityImpl().info(kdbVar, new xeh(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case 3641990:
                if (!str.equals("warn")) {
                    return null;
                }
                try {
                    getAbilityImpl().warn(kdbVar, new ygh(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 95458899:
                if (!str.equals("debug")) {
                    return null;
                }
                try {
                    getAbilityImpl().debug(kdbVar, new heh(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 96784904:
                if (!str.equals("error")) {
                    return null;
                }
                try {
                    getAbilityImpl().error(kdbVar, new meh(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            default:
                return null;
        }
    }
}
