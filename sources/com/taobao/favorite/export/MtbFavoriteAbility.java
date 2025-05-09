package com.taobao.favorite.export;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsFavoriteAbility;
import tb.f39;
import tb.g39;
import tb.h39;
import tb.k5c;
import tb.kdb;
import tb.m5c;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MtbFavoriteAbility extends AbsFavoriteAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(463470669);
    }

    public static /* synthetic */ Object ipc$super(MtbFavoriteAbility mtbFavoriteAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorite/export/MtbFavoriteAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFavoriteAbility
    public void addFavorite(kdb kdbVar, h39 h39Var, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22553be1", new Object[]{this, kdbVar, h39Var, m5cVar});
        } else {
            FavoriteFacade.addFavoriteItem(h39Var, m5cVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFavoriteAbility
    public tao<String, ErrorResult> getFavoriteCount(kdb kdbVar, h39 h39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ea16d233", new Object[]{this, kdbVar, h39Var});
        }
        return FavoriteFacade.getFavoriteCount(h39Var);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFavoriteAbility
    public tao<String, ErrorResult> getFavoriteCountWithDefaultCount(kdb kdbVar, f39 f39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("5cae0cda", new Object[]{this, kdbVar, f39Var});
        }
        return FavoriteFacade.getFavoriteCountWithDefaultCount(f39Var);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFavoriteAbility
    public tao<Boolean, ErrorResult> getFavoriteStatus(kdb kdbVar, h39 h39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("ac25883a", new Object[]{this, kdbVar, h39Var});
        }
        return FavoriteFacade.getFavoriteStatus(h39Var);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFavoriteAbility
    public void markFavorite(kdb kdbVar, h39 h39Var, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f8ec35", new Object[]{this, kdbVar, h39Var, m5cVar});
        } else {
            FavoriteFacade.markFavorite(h39Var, m5cVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFavoriteAbility
    public void needShowGuide(kdb kdbVar, g39 g39Var, k5c k5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da78519a", new Object[]{this, kdbVar, g39Var, k5cVar});
        } else {
            FavoriteFacade.needShowGuide(g39Var, k5cVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFavoriteAbility
    public void removeFavorite(kdb kdbVar, h39 h39Var, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186b889e", new Object[]{this, kdbVar, h39Var, m5cVar});
        } else {
            FavoriteFacade.removeFavorite(h39Var, m5cVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFavoriteAbility
    public void requestFavoriteStatus(kdb kdbVar, h39 h39Var, m5c m5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea34021", new Object[]{this, kdbVar, h39Var, m5cVar});
        } else {
            FavoriteFacade.requestFavoriteStatus(h39Var, m5cVar);
        }
    }
}
