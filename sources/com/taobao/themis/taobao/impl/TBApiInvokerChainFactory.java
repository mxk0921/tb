package com.taobao.themis.taobao.impl;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.DefaultApiInvokerChainFactory;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.ArrayList;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.czl;
import tb.e11;
import tb.f11;
import tb.g11;
import tb.i04;
import tb.j8s;
import tb.m3n;
import tb.t2o;
import tb.x4k;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/taobao/impl/TBApiInvokerChainFactory;", "Lcom/taobao/themis/inside/adapter/DefaultApiInvokerChainFactory;", "<init>", "()V", "Ltb/x4k;", "node", "Ltb/j8s;", "abilityInstance", "Ltb/f11;", "apiMeta", "Lcom/alibaba/fastjson/JSONObject;", "params", "Ltb/e11;", "createApiInvokerChain", "(Ltb/x4k;Ltb/j8s;Ltb/f11;Lcom/alibaba/fastjson/JSONObject;)Ltb/e11;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TBApiInvokerChainFactory extends DefaultApiInvokerChainFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(847249447);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.MINIGAME.ordinal()] = 1;
            iArr[TMSSolutionType.WIDGET.ordinal()] = 2;
            iArr[TMSSolutionType.CLUSTER_WIDGET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(847249446);
    }

    public static /* synthetic */ Object ipc$super(TBApiInvokerChainFactory tBApiInvokerChainFactory, String str, Object... objArr) {
        if (str.hashCode() == 1012580311) {
            return super.createApiInvokerChain((x4k) objArr[0], (j8s) objArr[1], (f11) objArr[2], (JSONObject) objArr[3]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/impl/TBApiInvokerChainFactory");
    }

    @Override // com.taobao.themis.inside.adapter.DefaultApiInvokerChainFactory, com.taobao.themis.kernel.adapter.IApiInvokerChainFactory
    public e11 createApiInvokerChain(x4k x4kVar, j8s j8sVar, f11 f11Var, JSONObject jSONObject) {
        bbs bbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e11) ipChange.ipc$dispatch("3c5abfd7", new Object[]{this, x4kVar, j8sVar, f11Var, jSONObject});
        }
        ckf.g(x4kVar, "node");
        ckf.g(j8sVar, "abilityInstance");
        ckf.g(f11Var, "apiMeta");
        ckf.g(jSONObject, "params");
        e11 createApiInvokerChain = super.createApiInvokerChain(x4kVar, j8sVar, f11Var, jSONObject);
        if (x4kVar instanceof ITMSPage) {
            bbsVar = ((ITMSPage) x4kVar).getInstance();
        } else {
            bbsVar = (bbs) x4kVar;
        }
        ArrayList arrayList = new ArrayList();
        TMSSolutionType a0 = bbsVar.a0();
        int i = a0 == null ? -1 : a.$EnumSwitchMapping$0[a0.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            arrayList.add(0, new czl(f11Var, jSONObject));
        }
        if (TMSInstanceExtKt.r(bbsVar)) {
            arrayList.add(new m3n(f11Var));
        }
        arrayList.add(createApiInvokerChain);
        g11 g11Var = (g11) i04.a0(arrayList);
        for (e11 e11Var : i04.T(arrayList, 1)) {
            g11Var = g11Var.b((g11) e11Var);
            ckf.f(g11Var, "next.setNext(middleware as ApiMiddleware)");
        }
        return (e11) i04.a0(arrayList);
    }
}
