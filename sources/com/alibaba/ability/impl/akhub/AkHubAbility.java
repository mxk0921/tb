package com.alibaba.ability.impl.akhub;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ckf;
import tb.cu;
import tb.k8;
import tb.kdb;
import tb.ldb;
import tb.pr;
import tb.t2o;
import tb.vq;
import tb.xhv;
import tb.y7;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AkHubAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public y7 f1890a;

    static {
        t2o.a(93323265);
    }

    public static /* synthetic */ Object ipc$super(AkHubAbility akHubAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/akhub/AkHubAbility");
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (this.f1890a == null) {
            ldb l = kdbVar.l();
            if (l != null) {
                this.f1890a = new y7((zq) l, null);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.env.AbilityEnv");
            }
        }
        JSONObject jSONObject = new JSONObject(map);
        k8 e = pr.e(kdbVar);
        if (e.a() == null) {
            e.g(this.f1890a);
        }
        xhv xhvVar = xhv.INSTANCE;
        ExecuteResult f = pr.f(pr.a(str, jSONObject, e, pr.b(vqVar), true));
        ckf.f(f, "toMegaResult(\n          …e\n            )\n        )");
        return f;
    }
}
