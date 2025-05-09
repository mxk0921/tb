package com.alibaba.ability.impl.loading;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsLoadingAbility;
import java.util.HashMap;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.jdb;
import tb.kdb;
import tb.r8;
import tb.t2o;
import tb.u6h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LoadingAbility extends AbsLoadingAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_HIDE = "hide";
    public static final String API_SHOW = "show";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public r8 f1962a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(112197635);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(112197634);
    }

    public static /* synthetic */ Object ipc$super(LoadingAbility loadingAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/loading/LoadingAbility");
    }

    public static /* synthetic */ void showLoading$default(LoadingAbility loadingAbility, kdb kdbVar, jdb jdbVar, u6h u6hVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9e0b85", new Object[]{loadingAbility, kdbVar, jdbVar, u6hVar, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            u6hVar = null;
        }
        loadingAbility.b(kdbVar, jdbVar, u6hVar);
    }

    public final HashMap<String, Object> a(u6h u6hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ce9418d8", new Object[]{this, u6hVar});
        }
        if (u6hVar == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        String str = u6hVar.f29179a;
        if (str != null) {
            hashMap.put("message", str);
        }
        String str2 = u6hVar.b;
        if (str2 == null) {
            return hashMap;
        }
        hashMap.put("style", str2);
        return hashMap;
    }

    public final void b(kdb kdbVar, jdb jdbVar, u6h u6hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc13e88", new Object[]{this, kdbVar, jdbVar, u6hVar});
            return;
        }
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (!(activity instanceof Activity)) {
            jdbVar.O(new ErrorResult("400", "NoActivity", (Map) null, 4, (a07) null));
            return;
        }
        r8 r8Var = this.f1962a;
        if (r8Var == null) {
            r8Var = new r8();
        }
        this.f1962a = r8Var;
        Dialog b = r8Var.b();
        if (b == null || !b.isShowing()) {
            r8Var.f(new JSONObject(a(u6hVar)), activity);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLoadingAbility
    public void hide(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5fd834", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        r8 r8Var = this.f1962a;
        if (r8Var != null) {
            r8Var.d();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLoadingAbility
    public void show(kdb kdbVar, u6h u6hVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f568104", new Object[]{this, kdbVar, u6hVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(u6hVar, "params");
        ckf.g(jdbVar, "callback");
        b(kdbVar, jdbVar, u6hVar);
    }
}
