package com.taobao.android.icart.weex.ability;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsCartAbility;
import com.taobao.android.abilityidl.ability.CartGetGlobalStatusResult;
import com.taobao.android.abilityidl.ability.CartSetGlobalStatusResult;
import com.taobao.android.icart.weex.call.CartMegaManager;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.ejj;
import tb.emb;
import tb.fmb;
import tb.g1a;
import tb.ha3;
import tb.ia3;
import tb.ja3;
import tb.jb3;
import tb.jdb;
import tb.kdb;
import tb.mw;
import tb.nd3;
import tb.t2o;
import tb.tao;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/taobao/android/icart/weex/ability/CartAbility;", "Lcom/taobao/android/abilityidl/ability/AbsCartAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/ha3;", "params", "Ltb/emb;", "callback", "Ltb/xhv;", "callMainInstance", "(Ltb/kdb;Ltb/ha3;Ltb/emb;)V", "Ltb/ja3;", "Ltb/fmb;", "callNative", "(Ltb/kdb;Ltb/ja3;Ltb/fmb;)V", "Ltb/jb3;", "Ltb/tao;", "Lcom/taobao/android/abilityidl/ability/CartGetGlobalStatusResult;", "Lcom/alibaba/ability/result/ErrorResult;", "getGlobalStatus", "(Ltb/kdb;Ltb/jb3;)Ltb/tao;", "Ltb/ia3;", "Ltb/jdb;", "mainInstanceCallback", "(Ltb/kdb;Ltb/ia3;Ltb/jdb;)V", "Ltb/nd3;", "Lcom/taobao/android/abilityidl/ability/CartSetGlobalStatusResult;", "setGlobalStatus", "(Ltb/kdb;Ltb/nd3;)Ltb/tao;", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartAbility extends AbsCartAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150915);
    }

    public static /* synthetic */ Object ipc$super(CartAbility cartAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/ability/CartAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCartAbility
    public void callMainInstance(kdb kdbVar, ha3 ha3Var, emb embVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52145302", new Object[]{this, kdbVar, ha3Var, embVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ha3Var, "params");
        ckf.g(embVar, "callback");
        CartMegaManager cartMegaManager = CartMegaManager.INSTANCE;
        String k = cartMegaManager.k(ha3Var.f20496a, embVar);
        String str = ha3Var.f20496a;
        String str2 = ha3Var.b;
        Map<String, ? extends Object> map = ha3Var.c;
        if (!(map instanceof JSONObject)) {
            map = null;
        }
        if (!cartMegaManager.c(str, k, str2, (JSONObject) map)) {
            throw new IllegalStateException(("callInstance api failed method=" + ha3Var.b).toString());
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCartAbility
    public void mainInstanceCallback(kdb kdbVar, ia3 ia3Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70098027", new Object[]{this, kdbVar, ia3Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ia3Var, "params");
        ckf.g(jdbVar, "callback");
        g1a<Map<String, ? extends Object>, xhv> f = CartMegaManager.INSTANCE.f(ia3Var.f21184a);
        if (f != null) {
            f.invoke(ia3Var.b);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCartAbility
    public void callNative(kdb kdbVar, ja3 ja3Var, fmb fmbVar) {
        String str;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e5f66b", new Object[]{this, kdbVar, ja3Var, fmbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ja3Var, "params");
        ckf.g(fmbVar, "callback");
        mw a2 = ejj.Companion.a(ja3Var.b);
        if (a2 == null || !a2.b()) {
            str = "";
        } else {
            str = CartMegaManager.INSTANCE.k(ja3Var.f21861a, fmbVar);
        }
        if (a2 != null) {
            String str2 = ja3Var.f21861a;
            String str3 = ja3Var.b;
            Map<String, ? extends Object> map = ja3Var.c;
            if (map != null) {
                bool = Boolean.valueOf(a2.a(str2, str3, (JSONObject) map, str));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        } else {
            bool = null;
        }
        if (ckf.b(bool, Boolean.FALSE)) {
            throw new IllegalStateException(("callNative api failed method=" + ja3Var.b).toString());
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCartAbility
    public tao<CartGetGlobalStatusResult, ErrorResult> getGlobalStatus(kdb kdbVar, jb3 jb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("cefabca9", new Object[]{this, kdbVar, jb3Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(jb3Var, "params");
        CartGetGlobalStatusResult cartGetGlobalStatusResult = new CartGetGlobalStatusResult();
        cartGetGlobalStatusResult.globalStatus = CartMegaManager.INSTANCE.g(jb3Var.f21880a);
        return new tao<>(cartGetGlobalStatusResult, null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCartAbility
    public tao<CartSetGlobalStatusResult, ErrorResult> setGlobalStatus(kdb kdbVar, nd3 nd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("58c47529", new Object[]{this, kdbVar, nd3Var});
        }
        ckf.g(kdbVar, "context");
        ckf.g(nd3Var, "params");
        CartSetGlobalStatusResult cartSetGlobalStatusResult = new CartSetGlobalStatusResult();
        Map<String, ? extends Object> map = nd3Var.f24654a;
        if (map == null || map.isEmpty()) {
            cartSetGlobalStatusResult.success = Boolean.FALSE;
            return new tao<>(cartSetGlobalStatusResult, null, 2, null);
        }
        CartMegaManager cartMegaManager = CartMegaManager.INSTANCE;
        Map<String, ? extends Object> map2 = nd3Var.f24654a;
        if (map2 != null) {
            cartSetGlobalStatusResult.success = Boolean.valueOf(cartMegaManager.m((JSONObject) map2));
            return new tao<>(cartSetGlobalStatusResult, null, 2, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
    }
}
