package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.k1g;
import tb.kdb;
import tb.l1g;
import tb.n1g;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsKVStorageAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336623);
    }

    public static /* synthetic */ Object ipc$super(AbsKVStorageAbility absKVStorageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsKVStorageAbility");
    }

    public abstract tao<Object, ErrorResult> clear(kdb kdbVar, k1g k1gVar);

    public abstract tao<List<String>, ErrorResult> getAllKeys(kdb kdbVar, k1g k1gVar);

    public abstract tao<KVStorageCurrentInfo, ErrorResult> getCurrentInfo(kdb kdbVar, k1g k1gVar);

    public abstract tao<KVStorageCurrentInfoAndKeys, ErrorResult> getCurrentInfoAndKeys(kdb kdbVar, k1g k1gVar);

    public abstract tao<String, ErrorResult> getItem(kdb kdbVar, l1g l1gVar);

    public abstract tao<Object, ErrorResult> removeItem(kdb kdbVar, l1g l1gVar);

    public abstract tao<Object, ErrorResult> setItem(kdb kdbVar, n1g n1gVar);
}
