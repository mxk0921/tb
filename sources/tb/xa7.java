package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IFeedbackService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xa7 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DELETECARDBYBIZCODE = 7527218175802164027L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782467);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public xa7 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xa7) ipChange.ipc$dispatch("2ce292cd", new Object[]{this, obj});
            }
            return new xa7();
        }
    }

    static {
        t2o.a(491782466);
    }

    public static /* synthetic */ Object ipc$super(xa7 xa7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/ability/DeleteCardByBizCodeAbility");
    }

    public final void i(cfc cfcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f58ea0", new Object[]{this, cfcVar, str});
            return;
        }
        IFeedbackService iFeedbackService = (IFeedbackService) cfcVar.a(IFeedbackService.class);
        if (iFeedbackService != null) {
            iFeedbackService.deleteHostCardByBizCode(str);
        }
    }

    /* renamed from: j */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        cfc c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (n8Var == null || (c = j18.c(tk6Var.p())) == null) {
            return null;
        }
        i(c, n8Var.i("sectionBizCode"));
        return new f8();
    }
}
