package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.infoflow.protocol.subservice.biz.IOutLinkService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pfl implements m4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f26063a;

    static {
        t2o.a(486539587);
        t2o.a(488636447);
    }

    public pfl(cfc cfcVar) {
        this.f26063a = cfcVar;
    }

    @Override // tb.m4d
    public boolean isInQRCodePreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d96a47b6", new Object[]{this})).booleanValue();
        }
        IOutLinkService iOutLinkService = (IOutLinkService) this.f26063a.a(IOutLinkService.class);
        if (iOutLinkService != null) {
            return iOutLinkService.isInQRCodePreview();
        }
        return false;
    }

    @Override // tb.m4d
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        IOutLinkService iOutLinkService = (IOutLinkService) this.f26063a.a(IOutLinkService.class);
        if (iOutLinkService != null) {
            iOutLinkService.onOutLinkTrigger(str, intent);
            if (str.contains("outPushPlanId") && str.contains("up_nids")) {
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "Page_HomePage_PageControl_perform_NewFace", "notifyOutLinkParams", null, null);
            }
        }
    }
}
