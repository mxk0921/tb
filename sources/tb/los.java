package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TBSkuWrapper;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.a;
import tb.atz;
import tb.btz;
import tb.gkv;
import tb.hkv;
import tb.o3l;
import tb.xt3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class los {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262857);
    }

    public static void a(ze7 ze7Var, Context context, TBSkuWrapper tBSkuWrapper, xt3.a aVar, OpenSkuImplementor.c cVar, o3l.a aVar2, hkv.a aVar3, UpdateItemImplementor.b bVar, UpdateItemImplementor.a aVar4, gkv.a aVar5, btz.a aVar6, atz.a aVar7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20225bf", new Object[]{ze7Var, context, tBSkuWrapper, aVar, cVar, aVar2, aVar3, bVar, aVar4, aVar5, aVar6, aVar7});
            return;
        }
        ze7Var.b().i(xt3.EVENT_TYPE, new xt3(context, ze7Var, aVar));
        ze7Var.b().i(btz.EVENT_TYPE, new btz(context, ze7Var, aVar6));
        ze7Var.b().i(atz.EVENT_TYPE, new atz(context, ze7Var, aVar7));
        OpenSkuImplementor openSkuImplementor = new OpenSkuImplementor(context, ze7Var, tBSkuWrapper, cVar);
        ze7Var.b().i(OpenSkuImplementor.EVENT_TYPE, openSkuImplementor);
        ze7Var.b().i(OpenSkuImplementor.EVENT_TYPE_ALTERNATIVE, openSkuImplementor);
        ze7Var.b().i(ho2.EVENT_TYPE, new ho2(context, ze7Var, tBSkuWrapper));
        ze7Var.b().i(crm.EVENT_TYPE, new crm(ze7Var));
        o3l o3lVar = new o3l(context, ze7Var, aVar2);
        ze7Var.b().i(o3l.EVENT_TYPE_OPENFLOATDIALOG, o3lVar);
        ze7Var.b().i(o3l.EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE, o3lVar);
        ze7Var.b().i(o3l.EVENT_TYPE_OPENWEEXFLOAT, o3lVar);
        ze7Var.b().i(hkv.EVENT_TYPE, new hkv(context, ze7Var, aVar3));
        ze7Var.b().i(UpdateItemImplementor.EVENT_TYPE, new UpdateItemImplementor(context, ze7Var, bVar, aVar4));
        ze7Var.b().i(a.EVENT_TYPE, new a(context, ze7Var, bVar));
        ze7Var.b().i(gkv.EVENT_TYPE, new gkv(context, ze7Var, aVar5));
    }
}
