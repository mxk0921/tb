package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.jdb;
import tb.kdb;
import tb.p8l;
import tb.r9l;
import tb.s9l;
import tb.st;
import tb.t2o;
import tb.tao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsOrangeAbility extends st {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336638);
    }

    public static /* synthetic */ Object ipc$super(AbsOrangeAbility absOrangeAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/AbsOrangeAbility");
    }

    public abstract void downloadConfigWithParams(kdb kdbVar, p8l p8lVar, jdb jdbVar);

    public abstract tao<String, ErrorResult> get(kdb kdbVar, s9l s9lVar);

    public abstract tao<String, ErrorResult> getCustomGroup(kdb kdbVar, r9l r9lVar);

    public abstract tao<Map<String, Object>, ErrorResult> getIndexAndConfigs(kdb kdbVar);

    public abstract tao<Map<String, Object>, ErrorResult> getStandardGroup(kdb kdbVar, r9l r9lVar);
}
