package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pca implements cac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f26011a;

    static {
        t2o.a(486539584);
        t2o.a(488636443);
    }

    public pca(cfc cfcVar) {
        this.f26011a = cfcVar;
    }

    @Override // tb.cac
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
            return;
        }
        IThemeService iThemeService = (IThemeService) this.f26011a.a(IThemeService.class);
        if (iThemeService == null) {
            fve.e("GlobalThemeInvokerImpl", "onFestivalRefresh themeService is null");
        } else {
            iThemeService.onFestivalRefresh();
        }
    }
}
