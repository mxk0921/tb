package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.iqj;
import tb.kdb;
import tb.kqj;
import tb.lny;
import tb.mny;
import tb.mx6;
import tb.nny;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class NavigatorAbilityWrapper extends AbsAbilityWrapper<AbsNavigatorAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525337301);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorAbilityWrapper(AbsNavigatorAbility absNavigatorAbility) {
        super(absNavigatorAbility);
        ckf.g(absNavigatorAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(NavigatorAbilityWrapper navigatorAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/NavigatorAbilityWrapper");
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
            case -1947220185:
                if (!str.equals("removeSystemBackBlockListener")) {
                    return null;
                }
                getAbilityImpl().removeSystemBackBlockListener(kdbVar, new mx6(vqVar));
                return null;
            case -1263204667:
                if (!str.equals("openURL")) {
                    return null;
                }
                try {
                    getAbilityImpl().openURL(kdbVar, new kqj(map), new lny(vqVar));
                    return null;
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -1062762103:
                if (!str.equals("setSystemBackBlockListener")) {
                    return null;
                }
                getAbilityImpl().setSystemBackBlockListener(kdbVar, new nny(vqVar));
                return null;
            case 94756344:
                if (!str.equals("close")) {
                    return null;
                }
                try {
                    getAbilityImpl().close(kdbVar, new iqj(map), new lny(vqVar));
                    return null;
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case 1094496948:
                if (!str.equals("replace")) {
                    return null;
                }
                try {
                    getAbilityImpl().replace(kdbVar, new kqj(map), new lny(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case 1306582266:
                if (!str.equals("openExternalURL")) {
                    return null;
                }
                try {
                    getAbilityImpl().openExternalURL(kdbVar, new kqj(map), new mny(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            default:
                return null;
        }
    }
}
