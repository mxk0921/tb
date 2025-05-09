package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cjy;
import tb.ckf;
import tb.kdb;
import tb.nqa;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class HTTPRequestAbilityWrapper extends AbsAbilityWrapper<AbsHTTPRequestAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(525336974);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTTPRequestAbilityWrapper(AbsHTTPRequestAbility absHTTPRequestAbility) {
        super(absHTTPRequestAbility);
        ckf.g(absHTTPRequestAbility, "impl");
    }

    public static /* synthetic */ Object ipc$super(HTTPRequestAbilityWrapper hTTPRequestAbilityWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilityidl/ability/HTTPRequestAbilityWrapper");
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
        if (str.hashCode() != 3526536 || !str.equals("send")) {
            return null;
        }
        try {
            getAbilityImpl().send(kdbVar, new nqa(map), new cjy(vqVar));
            return null;
        } catch (Throwable th) {
            return ErrorResult.a.Companion.g(th.getMessage());
        }
    }
}
