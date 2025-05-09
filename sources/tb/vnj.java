package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322190);
    }

    public static ue7 a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ue7) ipChange.ipc$dispatch("e0463992", new Object[]{aVar});
        }
        String s = aVar.s();
        String E = aVar.E(s);
        txj.e(txj.TAG_RENDER, "createFirstNodeWithSimpleDeliver, cardType: " + s + ", cacheMainPicUrl: " + E + ", contentExp: " + aVar.R().m);
        ue7 ue7Var = new ue7(aVar);
        ue7Var.F = true;
        ue7Var.f31127a = 0;
        ue7Var.h = aVar.u();
        ue7Var.b = aVar.s();
        ue7Var.z = false;
        if (!TextUtils.isEmpty(E)) {
            ue7Var.s0(E);
        }
        if (aVar.M().b(aVar.R().x)) {
            if (aVar.Y() != null) {
                ue7Var.r0(x3w.k0);
            }
            if (aVar.Y() == null || aVar.b0() == null) {
                txj.e(txj.TAG_RENDER, "generateOpenImmediatelyNodeOld simpleDeliverData为空, nid: " + aVar.u());
            } else {
                txj.e(txj.TAG_RENDER, "generateOpenImmediatelyNodeOld simpleDeliverData不为空");
                if (TextUtils.isEmpty(aVar.e0()) || TextUtils.isEmpty(aVar.a0())) {
                    q0j.p(q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_DELIVER_DATA_ABSENT, "simpledeliverdata缺失，url: " + aVar.e0() + ", dimension: " + aVar.a0(), null);
                } else if (aVar.Z() == null) {
                    q0j.p(q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_DELIVER_DATA_ABSENT, "simpledeliverdata feature缺失", null);
                }
                ue7Var.a1(aVar.d0(), aVar.e0(), aVar.a0(), aVar.Z());
            }
        }
        return ue7Var;
    }
}
