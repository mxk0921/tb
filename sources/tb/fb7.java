package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fb7 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long GATEWAYTRIGGEREVENT = -6988725130610969125L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782469);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public fb7 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fb7) ipChange.ipc$dispatch("8ddae826", new Object[]{this, obj});
            }
            return new fb7();
        }
    }

    static {
        t2o.a(491782468);
    }

    public static /* synthetic */ Object ipc$super(fb7 fb7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/ability/DeleteHostCardAbility");
    }

    public final void i(cfc cfcVar, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9a389e", new Object[]{this, cfcVar, baseSectionModel});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) cfcVar.a(ICardOverlayService.class);
        if (iCardOverlayService != null) {
            iCardOverlayService.deleteOverlayHostCard(baseSectionModel);
        }
    }

    /* renamed from: j */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXRuntimeContext p;
        cfc c;
        BaseSectionModel<?> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (n8Var == null || (c = j18.c((p = tk6Var.p()))) == null || (e = j18.e(p)) == null) {
            return null;
        }
        i(c, e);
        return new f8();
    }
}
