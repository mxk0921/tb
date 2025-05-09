package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.util.Map;
import tb.ckf;
import tb.e71;
import tb.g71;
import tb.i71;
import tb.kdb;
import tb.mx6;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AppMonitorAbilityWrapper extends AbsAbilityWrapper<AbsAppMonitorAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336713);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMonitorAbilityWrapper(AbsAppMonitorAbility absAppMonitorAbility) {
        super(absAppMonitorAbility);
        ckf.g(absAppMonitorAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(AppMonitorAbilityWrapper appMonitorAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AppMonitorAbilityWrapper");
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
        int hashCode = str.hashCode();
        if (hashCode != -724355825) {
            if (hashCode != 957830652) {
                if (hashCode != 2145800306 || !str.equals("alarmSuccess")) {
                    return null;
                }
                try {
                    getAbilityImpl().alarmSuccess(kdbVar, new i71(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            } else if (!str.equals(IWXUserTrackAdapter.COUNTER)) {
                return null;
            } else {
                try {
                    getAbilityImpl().counter(kdbVar, new e71(map), new mx6(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            }
        } else if (!str.equals("alarmFail")) {
            return null;
        } else {
            try {
                getAbilityImpl().alarmFail(kdbVar, new g71(map), new mx6(vqVar));
                return null;
            } catch (Throwable th3) {
                return ErrorResult.a.Companion.g(th3.getMessage());
            }
        }
    }
}
