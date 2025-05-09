package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.ir;
import tb.t2o;
import tb.tgh;
import tb.uug;
import tb.vbl;
import tb.xpc;
import tb.yzc;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends UpdateItemImplementor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "pre_update_item";
    public final boolean e = vbl.j1();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.handler.bizhandlers.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0371a implements yzc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0371a(a aVar) {
        }

        @Override // tb.yzc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97f869b2", new Object[]{this});
            }
        }

        @Override // tb.yzc
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(912261926);
    }

    public a(Context context, ze7 ze7Var, UpdateItemImplementor.b bVar) {
        super(context, ze7Var, bVar, null);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1378413285) {
            return new Boolean(super.a((ir) objArr[0], (RuntimeAbilityParam[]) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/bizhandlers/PreUpdateItemImplementor");
    }

    @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor, tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (this.e) {
            return true;
        }
        if (this.b.e().o()) {
            tgh.b("PreUpdateItemImplementor", "not execute in preload stage");
            return true;
        } else if (e(irVar) == null) {
            tgh.b("PreUpdateItemImplementor", "execute implementor pageKey is null");
            return true;
        } else {
            tgh.b("PreUpdateItemImplementor", xpc.RECORD_EXECUTE);
            return super.a(irVar, runtimeAbilityParamArr);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor
    public boolean d(String str, Map<String, String> map, RuntimeAbilityParam... runtimeAbilityParamArr) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f015ecce", new Object[]{this, str, map, runtimeAbilityParamArr})).booleanValue();
        }
        if (runtimeAbilityParamArr != null) {
            list = uug.a(runtimeAbilityParamArr);
        } else {
            list = new ArrayList();
        }
        list.add(new RuntimeAbilityParam("isPreLoadPageKey", Boolean.TRUE));
        ((TTDetailPageManager.h) this.c).a(map, new C0371a(this), RuntimeUtils.a((RuntimeAbilityParam[]) list.toArray(new RuntimeAbilityParam[0])));
        return true;
    }

    public final String e(ir irVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71e98b90", new Object[]{this, irVar});
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return null;
        }
        return a2.getString("pageKey");
    }
}
