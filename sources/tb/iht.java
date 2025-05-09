package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.a06;
import tb.dra;
import tb.f06;
import tb.fra;
import tb.g06;
import tb.hra;
import tb.zz5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class iht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782635);
    }

    @Deprecated
    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5190d8b", new Object[]{dinamicXEngine});
        } else {
            b(dinamicXEngine, null);
        }
    }

    public static void b(DinamicXEngine dinamicXEngine, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee155", new Object[]{dinamicXEngine, cfcVar});
        } else if (dinamicXEngine == null) {
            fve.k("TbRecommendDxRegister", "dx3BaseRegister dxEngine == null");
        } else {
            sgl.a(dinamicXEngine);
            az3.a(dinamicXEngine);
            cge.a(dinamicXEngine);
            yl4.a(dinamicXEngine);
            dinamicXEngine.e1(f06.DXHVIDEOANIMATIONLAYOUT_HVIDEOANIMATIONLAYOUT, new f06.h());
            dinamicXEngine.e1(g06.DXHVIDEOANIMATION_HVIDEOANIMATION, new g06.b());
            d(cfcVar, dinamicXEngine);
            c(dinamicXEngine);
            try {
                xc0.a(dinamicXEngine);
            } catch (Throwable th) {
                fve.c("TbRecommendDxRegister", "AdD3Register.initFowAdDX error", th);
            }
            hht.d(dinamicXEngine);
            dinamicXEngine.V0(hm5.DX_PARSER_HICONPAGENUM, new h18(new hm5()));
        }
    }

    public static void c(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2050228b", new Object[]{dinamicXEngine});
        } else if (cve.b()) {
            fve.e("TbRecommendDxRegister", "直播组件降级到图片");
            dinamicXEngine.e1(-5996311416603680075L, new zz5.a());
        } else {
            fve.e("TbRecommendDxRegister", "加载真实直播组件");
            dinamicXEngine.e1(-5996311416603680075L, new a06.a());
        }
    }

    public static void d(cfc cfcVar, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c1170e", new Object[]{cfcVar, dinamicXEngine});
        } else if (!ncw.d()) {
            dinamicXEngine.e1(-8690577844899785500L, new hra.a());
        } else if (cfcVar == null || !ao4.a(cfcVar.getContainerType().getContainerId()) || mve.a("enableAfterBuyNewPlayControl", false)) {
            dinamicXEngine.e1(-8690577844899785500L, new fra.b());
        } else {
            dinamicXEngine.e1(-8690577844899785500L, new dra.a());
        }
    }
}
