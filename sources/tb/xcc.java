package tb;

import com.taobao.tao.topmultitab.service.base.IHomePageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final /* synthetic */ class xcc {
    public static void a(IHomePageService iHomePageService, cfc cfcVar) {
        if (cfcVar instanceof pue) {
            cfcVar = ((pue) cfcVar).b();
        }
        if (cfcVar instanceof wcc) {
            iHomePageService.onCreateService((wcc) cfcVar);
        } else if (!cw6.b()) {
            bqa.d("IHomePageService", "iInfoFlowContext is not IHomePageContext");
            d4b.a(d4b.ERROR_CODE_ERROR_CONTEXT, "homepage context error", null);
        } else {
            throw new IllegalArgumentException("iInfoFlowContext is not IHomePageContext");
        }
    }
}
