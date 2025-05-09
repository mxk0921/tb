package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dwa extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DISMISS = 4766907290255913603L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782473);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public dwa build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dwa) ipChange.ipc$dispatch("4acb594d", new Object[]{this, obj});
            }
            return new dwa();
        }
    }

    static {
        t2o.a(491782472);
    }

    public static /* synthetic */ Object ipc$super(dwa dwaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/ability/HideOverlayAbility");
    }

    public final void i(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d72ff6b", new Object[]{this, cfcVar});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) cfcVar.a(ICardOverlayService.class);
        if (iCardOverlayService != null) {
            iCardOverlayService.hideOverlay();
        }
    }

    /* renamed from: j */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        cfc c = j18.c(tk6Var.p());
        if (c == null) {
            return null;
        }
        i(c);
        return new f8();
    }
}
