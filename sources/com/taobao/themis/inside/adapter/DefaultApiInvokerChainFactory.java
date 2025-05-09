package com.taobao.themis.inside.adapter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.adapter.IApiInvokerChainFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import tb.ckf;
import tb.e11;
import tb.f11;
import tb.fw2;
import tb.g11;
import tb.j8s;
import tb.jr;
import tb.t2o;
import tb.uq;
import tb.vpl;
import tb.wto;
import tb.x4k;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultApiInvokerChainFactory;", "Lcom/taobao/themis/kernel/adapter/IApiInvokerChainFactory;", "<init>", "()V", "Ltb/x4k;", "node", "Ltb/j8s;", "abilityInstance", "Ltb/f11;", "apiMeta", "Lcom/alibaba/fastjson/JSONObject;", "params", "Ltb/e11;", "createApiInvokerChain", "(Ltb/x4k;Ltb/j8s;Ltb/f11;Lcom/alibaba/fastjson/JSONObject;)Ltb/e11;", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DefaultApiInvokerChainFactory implements IApiInvokerChainFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a extends g11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ f11 c;
        public final /* synthetic */ j8s d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f11 f11Var, j8s j8sVar) {
            super(f11Var);
            this.c = f11Var;
            this.d = j8sVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/inside/adapter/DefaultApiInvokerChainFactory$createApiInvokerChain$finalApiInvoker$1");
        }

        @Override // tb.e11
        public Object a(ApiContext apiContext, Object[] objArr, uq uqVar) {
            ckf.g(apiContext, "context");
            ckf.g(objArr, "args");
            ckf.g(uqVar, "callback");
            try {
                return this.c.c.invoke(this.d, Arrays.copyOf(objArr, objArr.length));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                ckf.d(cause);
                uqVar.a(jr.e("6", cause.getMessage()), false);
                return null;
            }
        }
    }

    static {
        t2o.a(837812251);
        t2o.a(839909459);
    }

    @Override // com.taobao.themis.kernel.adapter.IApiInvokerChainFactory
    public e11 createApiInvokerChain(x4k x4kVar, j8s j8sVar, f11 f11Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e11) ipChange.ipc$dispatch("3c5abfd7", new Object[]{this, x4kVar, j8sVar, f11Var, jSONObject});
        }
        ckf.g(x4kVar, "node");
        ckf.g(j8sVar, "abilityInstance");
        ckf.g(f11Var, "apiMeta");
        ckf.g(jSONObject, "params");
        a aVar = new a(f11Var, j8sVar);
        wto wtoVar = new wto(f11Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vpl(f11Var, jSONObject));
        arrayList.add(new fw2(f11Var));
        arrayList.add(aVar);
        Iterator it = arrayList.iterator();
        g11 g11Var = wtoVar;
        while (it.hasNext()) {
            g11Var = g11Var.b((g11) ((e11) it.next()));
            ckf.f(g11Var, "next.setNext(middleware as ApiMiddleware)");
        }
        return wtoVar;
    }
}
