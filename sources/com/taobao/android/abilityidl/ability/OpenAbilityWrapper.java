package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.a5l;
import tb.b3l;
import tb.ckf;
import tb.d4l;
import tb.isy;
import tb.kdb;
import tb.lsy;
import tb.r3l;
import tb.t2o;
import tb.vq;
import tb.x2l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OpenAbilityWrapper extends AbsAbilityWrapper<AbsOpenAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337336);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAbilityWrapper(AbsOpenAbility absOpenAbility) {
        super(absOpenAbility);
        ckf.g(absOpenAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(OpenAbilityWrapper openAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/OpenAbilityWrapper");
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
            case -1272165862:
                if (!str.equals("getSetting")) {
                    return null;
                }
                try {
                    getAbilityImpl().getSetting(kdbVar, new r3l(map), new isy(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1234321556:
                if (!str.equals("loadSubPackage")) {
                    return null;
                }
                try {
                    getAbilityImpl().loadSubPackage(kdbVar, new a5l(map), new lsy(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -695678519:
                if (!str.equals("getAuthTokenInfo")) {
                    return null;
                }
                getAbilityImpl().getAuthTokenInfo(kdbVar, new isy(vqVar));
                return null;
            case 94627080:
                if (!str.equals("check")) {
                    return null;
                }
                try {
                    getAbilityImpl().check(kdbVar, new d4l(map), new isy(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 398029520:
                if (!str.equals("checkAuth")) {
                    return null;
                }
                try {
                    getAbilityImpl().checkAuth(kdbVar, new b3l(map), new isy(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case 847168104:
                if (!str.equals("clearAccessToken")) {
                    return null;
                }
                getAbilityImpl().clearAccessToken(kdbVar, new isy(vqVar));
                return null;
            case 1466005811:
                if (!str.equals("getAuthorize")) {
                    return null;
                }
                try {
                    getAbilityImpl().getAuthorize(kdbVar, new x2l(map), new isy(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            default:
                return null;
        }
    }
}
