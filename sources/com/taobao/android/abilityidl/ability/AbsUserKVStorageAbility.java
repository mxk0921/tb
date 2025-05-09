package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kdb;
import tb.st;
import tb.t2o;
import tb.tao;
import tb.vrv;
import tb.wrv;
import tb.xrv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsUserKVStorageAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336663);
    }

    public static /* synthetic */ Object ipc$super(AbsUserKVStorageAbility absUserKVStorageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsUserKVStorageAbility");
    }

    public abstract tao<Object, ErrorResult> clear(kdb kdbVar, vrv vrvVar);

    public abstract tao<List<String>, ErrorResult> getAllKeys(kdb kdbVar, vrv vrvVar);

    public abstract tao<UserKVStorageCurrentInfo, ErrorResult> getCurrentInfo(kdb kdbVar, vrv vrvVar);

    public abstract tao<String, ErrorResult> getItem(kdb kdbVar, wrv wrvVar);

    public abstract tao<Object, ErrorResult> removeItem(kdb kdbVar, wrv wrvVar);

    public abstract tao<Object, ErrorResult> setItem(kdb kdbVar, xrv xrvVar);
}
