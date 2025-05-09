package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ads {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ads INSTANCE = new ads();

    static {
        t2o.a(850395192);
    }

    public final ViewGroup a(bbs bbsVar) {
        swd W;
        ITMSPage topPage;
        tll pageContext;
        x5d pageContainer;
        zcs zcsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d3256bf0", new Object[]{this, bbsVar});
        }
        if (bbsVar == null || (W = bbsVar.W()) == null || (topPage = W.getTopPage()) == null || (pageContext = topPage.getPageContext()) == null || (pageContainer = pageContext.getPageContainer()) == null) {
            return null;
        }
        if (pageContainer instanceof zcs) {
            zcsVar = (zcs) pageContainer;
        } else {
            zcsVar = null;
        }
        if (zcsVar == null) {
            return null;
        }
        return zcsVar.f();
    }
}
