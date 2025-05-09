package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.f39;
import tb.g39;
import tb.h39;
import tb.iiy;
import tb.jiy;
import tb.kdb;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class FavoriteAbilityWrapper extends AbsAbilityWrapper<AbsFavoriteAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336903);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteAbilityWrapper(AbsFavoriteAbility absFavoriteAbility) {
        super(absFavoriteAbility);
        ckf.g(absFavoriteAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(FavoriteAbilityWrapper favoriteAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/FavoriteAbilityWrapper");
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
            case -2055361116:
                if (!str.equals("getFavoriteStatus")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFavoriteStatus(kdbVar, new h39(map)).e();
                } catch (Throwable th) {
                    return ErrorResult.a.Companion.g(th.getMessage());
                }
            case -2020870883:
                if (!str.equals("getFavoriteCount")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFavoriteCount(kdbVar, new h39(map)).e();
                } catch (Throwable th2) {
                    return ErrorResult.a.Companion.g(th2.getMessage());
                }
            case -1258576375:
                if (!str.equals("needShowGuide")) {
                    return null;
                }
                try {
                    getAbilityImpl().needShowGuide(kdbVar, new g39(map), new iiy(vqVar));
                    return null;
                } catch (Throwable th3) {
                    return ErrorResult.a.Companion.g(th3.getMessage());
                }
            case -1256843383:
                if (!str.equals("markFavorite")) {
                    return null;
                }
                try {
                    getAbilityImpl().markFavorite(kdbVar, new h39(map), new jiy(vqVar));
                    return null;
                } catch (Throwable th4) {
                    return ErrorResult.a.Companion.g(th4.getMessage());
                }
            case -671319779:
                if (!str.equals("requestFavoriteStatus")) {
                    return null;
                }
                try {
                    getAbilityImpl().requestFavoriteStatus(kdbVar, new h39(map), new jiy(vqVar));
                    return null;
                } catch (Throwable th5) {
                    return ErrorResult.a.Companion.g(th5.getMessage());
                }
            case -543661504:
                if (!str.equals("removeFavorite")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeFavorite(kdbVar, new h39(map), new jiy(vqVar));
                    return null;
                } catch (Throwable th6) {
                    return ErrorResult.a.Companion.g(th6.getMessage());
                }
            case 76510557:
                if (!str.equals("addFavorite")) {
                    return null;
                }
                try {
                    getAbilityImpl().addFavorite(kdbVar, new h39(map), new jiy(vqVar));
                    return null;
                } catch (Throwable th7) {
                    return ErrorResult.a.Companion.g(th7.getMessage());
                }
            case 1762113137:
                if (!str.equals("getFavoriteCountWithDefaultCount")) {
                    return null;
                }
                try {
                    return getAbilityImpl().getFavoriteCountWithDefaultCount(kdbVar, new f39(map)).e();
                } catch (Throwable th8) {
                    return ErrorResult.a.Companion.g(th8.getMessage());
                }
            default:
                return null;
        }
    }
}
