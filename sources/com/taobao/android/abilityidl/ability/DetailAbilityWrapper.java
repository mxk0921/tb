package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.eg7;
import tb.fg7;
import tb.kdb;
import tb.qf7;
import tb.qhy;
import tb.t2o;
import tb.vq;
import tb.y3l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DetailAbilityWrapper extends AbsAbilityWrapper<AbsDetailAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336854);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAbilityWrapper(AbsDetailAbility absDetailAbility) {
        super(absDetailAbility);
        ckf.g(absDetailAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(DetailAbilityWrapper detailAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/DetailAbilityWrapper");
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
        if (hashCode != -1408046255) {
            if (hashCode != -814710557) {
                if (hashCode != 2133235287 || !str.equals("requestPicGallery")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestPicGallery(kdbVar, new qf7(map), new qhy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            } else if (!str.equals(y3l.EVENT_TYPE)) {
                return null;
            } else {
                try {
                    getAbilityImpl().openLightOff(kdbVar, new eg7(map), new qhy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            }
        } else if (!str.equals("openInnerSKU")) {
            return null;
        } else {
            try {
                getAbilityImpl().openInnerSKU(kdbVar, new fg7(map), new qhy(vqVar));
                return null;
            } catch (Throwable th3) {
                return ErrorResult.a.Companion.g(th3.getMessage());
            }
        }
    }
}
