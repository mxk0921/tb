package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kdb;
import tb.lep;
import tb.mep;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsSessionKVStorageAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336649);
    }

    public static /* synthetic */ Object ipc$super(AbsSessionKVStorageAbility absSessionKVStorageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsSessionKVStorageAbility");
    }

    public abstract tao<Object, ErrorResult> clear(kdb kdbVar);

    public abstract tao<List<String>, ErrorResult> getAllKeys(kdb kdbVar);

    public abstract tao<SessionKVStorageCurrentInfo, ErrorResult> getCurrentInfo(kdb kdbVar);

    public abstract tao<String, ErrorResult> getItem(kdb kdbVar, lep lepVar);

    public abstract tao<Object, ErrorResult> removeItem(kdb kdbVar, lep lepVar);

    public abstract tao<Object, ErrorResult> setItem(kdb kdbVar, mep mepVar);
}
