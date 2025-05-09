package com.alibaba.ability.impl.appedition;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.jpu;
import tb.kdb;
import tb.n78;
import tb.t1c;
import tb.t2o;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AppEditionAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CHECK_VERSION_CODE = "checkVersionCode";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f1900a = "1001";
    public final String b = "The edition_switcher is missing";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(97517570);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(97517569);
    }

    public static /* synthetic */ Object ipc$super(AppEditionAbility appEditionAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/appedition/AppEditionAbility");
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a369dca2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b66afd6", new Object[]{this, str})).booleanValue();
        }
        return ((t1c) n78.a(t1c.class)).isSpecifyVersionCode(str);
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
        if (str.hashCode() != -647176003 || !str.equals(API_CHECK_VERSION_CODE)) {
            return ErrorResult.a.Companion.a("Api not found");
        }
        if (!a()) {
            return new ErrorResult(this.f1900a, this.b, (Map) null, 4, (a07) null);
        }
        String w = MegaUtils.w(map, "version", "");
        ckf.d(w);
        return new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("result", Boolean.valueOf(b(w))))), null, 2, null);
    }
}
