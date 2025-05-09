package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a96 extends ax {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ROVERLAYGUIDE = -9200576388575376305L;

    static {
        t2o.a(491782477);
    }

    public static /* synthetic */ Object ipc$super(a96 a96Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/event/DXROverlayGuideEventHandler");
    }

    @Override // tb.ax
    public void b(cfc cfcVar, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7fa716", new Object[]{this, cfcVar, view, baseSectionModel, baseSectionModel2, view2});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) cfcVar.a(ICardOverlayService.class);
        if (iCardOverlayService != null) {
            if (baseSectionModel2 == null || view2 == null) {
                iCardOverlayService.showOverlay("guide", view, baseSectionModel);
            } else {
                iCardOverlayService.showOverlayWithOverlayData("guide", view, baseSectionModel, baseSectionModel2, view2);
            }
        }
    }
}
