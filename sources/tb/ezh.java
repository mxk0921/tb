package tb;

import android.os.SystemClock;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.view.popview.BasePopView;
import tb.xs1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ezh extends xs1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ezh(BasePopContainer basePopContainer, pfw pfwVar, e3b e3bVar) {
        super(basePopContainer, pfwVar, e3bVar);
        this.f = new vyh(basePopContainer);
    }

    public static /* synthetic */ Object ipc$super(ezh ezhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/view/container/main/MainContainerTrigger");
    }

    @Override // tb.xs1
    public void i(thm thmVar, xs1.d dVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2123b04", new Object[]{this, thmVar, dVar});
            return;
        }
        IPopData a2 = thmVar.a();
        if (!a2.isAllowShow()) {
            q(dVar, false, esu.ERROR_MSG_SHOW_COUNT_INVALID);
            vfm.f("MainContainerTrigger ", "trigger error, data has shown");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        IPopConfig popConfig = a2.getPopConfig();
        dbd a3 = this.e.a(popConfig.getPopContentType());
        if (a3 == null) {
            if (popConfig.getPopContentType() == 1) {
                str2 = esu.ERROR_DX_RENDER_FAILED;
            } else {
                str2 = esu.ERROR_WEEX_RENDER_FAILED;
            }
            q(dVar, false, str2);
            vfm.f("MainContainerTrigger ", "no viewProvider by contentType=" + popConfig.getPopContentType());
            return;
        }
        IPopAnchorViewInfo d = this.f.d(a2, 0);
        if (d == null) {
            q(dVar, false, esu.ERROR_MSG_ANCHOR_VIEW_INVALID);
            vfm.f("MainContainerTrigger ", "no view info by contentType=" + popConfig.getPopContentType());
            return;
        }
        bgm.b("PopTargetCardValid", a2);
        BasePopView createPopView = this.d.createPopView(a2, a3, null, d, this.f, thmVar);
        if (createPopView == null) {
            if (popConfig.getPopContentType() == 1) {
                str = esu.ERROR_DX_RENDER_FAILED;
            } else {
                str = esu.ERROR_WEEX_RENDER_FAILED;
            }
            q(dVar, false, str);
            vfm.f("MainContainerTrigger ", "create popView error");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) createPopView.getLayoutParams();
        if (popConfig.getPointY() == 1) {
            layoutParams.gravity = 81;
        } else {
            layoutParams.gravity = 49;
        }
        p(dVar, true);
        vfm.f("MainContainerTrigger ", "create new pop success, popView=" + createPopView.hashCode() + ", businessId=" + a2.getBusinessID() + ", useTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
    }
}
