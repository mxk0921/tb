package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.kdb;
import tb.pvy;
import tb.qvy;
import tb.rjp;
import tb.rvy;
import tb.sjp;
import tb.t2o;
import tb.tjp;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class SharePannelAbilityWrapper extends AbsAbilityWrapper<AbsSharePannelAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337500);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePannelAbilityWrapper(AbsSharePannelAbility absSharePannelAbility) {
        super(absSharePannelAbility);
        ckf.g(absSharePannelAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(SharePannelAbilityWrapper sharePannelAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/SharePannelAbilityWrapper");
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
        if (hashCode != -190125259) {
            if (hashCode != 3417674) {
                if (hashCode != 163601886 || !str.equals("saveImage")) {
                    return null;
                }
                try {
                    getAbilityImpl().saveImage(kdbVar, new tjp(map), new rvy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            } else if (!str.equals("open")) {
                return null;
            } else {
                try {
                    getAbilityImpl().open(kdbVar, new rjp(map), new pvy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            }
        } else if (!str.equals("requestShortLinkQRCode")) {
            return null;
        } else {
            try {
                getAbilityImpl().requestShortLinkQRCode(kdbVar, new sjp(map), new qvy(vqVar));
                return null;
            } catch (Throwable th3) {
                return ErrorResult.a.Companion.g(th3.getMessage());
            }
        }
    }
}
