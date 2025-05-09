package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bhy;
import tb.ckf;
import tb.kdb;
import tb.mo4;
import tb.no4;
import tb.oo4;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ContentCommissionAbilityWrapper extends AbsAbilityWrapper<AbsContentCommissionAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336838);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCommissionAbilityWrapper(AbsContentCommissionAbility absContentCommissionAbility) {
        super(absContentCommissionAbility);
        ckf.g(absContentCommissionAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(ContentCommissionAbilityWrapper contentCommissionAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/ContentCommissionAbilityWrapper");
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
        if (hashCode != -1659392772) {
            if (hashCode != -701643906) {
                if (hashCode != 973438429 || !str.equals("commitLiveCommissionTrack")) {
                    return null;
                }
                try {
                    getAbilityImpl().commitLiveCommissionTrack(kdbVar, new no4(map), new bhy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            } else if (!str.equals("commitContentCommissionTrack")) {
                return null;
            } else {
                try {
                    getAbilityImpl().commitContentCommissionTrack(kdbVar, new mo4(map), new bhy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            }
        } else if (!str.equals("commitOuterCommissionTrack")) {
            return null;
        } else {
            try {
                getAbilityImpl().commitOuterCommissionTrack(kdbVar, new oo4(map), new bhy(vqVar));
                return null;
            } catch (Throwable th3) {
                return ErrorResult.a.Companion.g(th3.getMessage());
            }
        }
    }
}
