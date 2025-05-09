package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;
import tb.kdb;
import tb.soh;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.toh;
import tb.uoh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsMEMKVStorageAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336629);
    }

    public static /* synthetic */ Object ipc$super(AbsMEMKVStorageAbility absMEMKVStorageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsMEMKVStorageAbility");
    }

    public abstract tao<String, ErrorResult> getItem(kdb kdbVar, soh sohVar);

    public abstract tao<Long, ErrorResult> getItemTTL(kdb kdbVar, soh sohVar);

    public abstract void removeItem(kdb kdbVar, soh sohVar, jdb jdbVar);

    public abstract void setItem(kdb kdbVar, toh tohVar, jdb jdbVar);

    public abstract void setItemTTL(kdb kdbVar, uoh uohVar, jdb jdbVar);
}
