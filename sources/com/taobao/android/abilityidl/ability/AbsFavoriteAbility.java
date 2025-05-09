package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f39;
import tb.g39;
import tb.h39;
import tb.k5c;
import tb.kdb;
import tb.m5c;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsFavoriteAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336614);
    }

    public static /* synthetic */ Object ipc$super(AbsFavoriteAbility absFavoriteAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsFavoriteAbility");
    }

    public abstract void addFavorite(kdb kdbVar, h39 h39Var, m5c m5cVar);

    public abstract tao<String, ErrorResult> getFavoriteCount(kdb kdbVar, h39 h39Var);

    public abstract tao<String, ErrorResult> getFavoriteCountWithDefaultCount(kdb kdbVar, f39 f39Var);

    public abstract tao<Boolean, ErrorResult> getFavoriteStatus(kdb kdbVar, h39 h39Var);

    public abstract void markFavorite(kdb kdbVar, h39 h39Var, m5c m5cVar);

    public abstract void needShowGuide(kdb kdbVar, g39 g39Var, k5c k5cVar);

    public abstract void removeFavorite(kdb kdbVar, h39 h39Var, m5c m5cVar);

    public abstract void requestFavoriteStatus(kdb kdbVar, h39 h39Var, m5c m5cVar);
}
