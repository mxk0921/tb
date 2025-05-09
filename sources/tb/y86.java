package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IFeedbackService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y86 extends ax {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ROVERLAY = 6136827152325085276L;
    public static final String TAG = "rOverlay";

    static {
        t2o.a(491782476);
    }

    public static /* synthetic */ Object ipc$super(y86 y86Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/event/DXROverlayEvent");
    }

    @Override // tb.ax
    public void b(cfc cfcVar, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7fa716", new Object[]{this, cfcVar, view, baseSectionModel, baseSectionModel2, view2});
            return;
        }
        IFeedbackService iFeedbackService = (IFeedbackService) cfcVar.a(IFeedbackService.class);
        if (iFeedbackService != null) {
            phg.m("ROverlay");
            if (baseSectionModel2 == null || view2 == null) {
                iFeedbackService.showFeedbackOverlay(view, baseSectionModel);
            } else {
                iFeedbackService.showFeedbackOverlayWithData(view, baseSectionModel, baseSectionModel2, view2);
            }
            phg.l("ROverlay");
        }
    }
}
