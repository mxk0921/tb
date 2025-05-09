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
public class ffx extends xs1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ffx(BasePopContainer basePopContainer, pfw pfwVar, e3b e3bVar) {
        super(basePopContainer, pfwVar, e3bVar);
        this.f = new dfx(basePopContainer);
    }

    public static /* synthetic */ Object ipc$super(ffx ffxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/view/container/window/WindowContainerTrigger");
    }

    @Override // tb.xs1
    public boolean b(thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b958eeb4", new Object[]{this, thmVar})).booleanValue();
        }
        if (thmVar != null) {
            return true;
        }
        vfm.f("WindowContainerTrigger ", "checkReTriggerValid failed, triggerModel invalid");
        return false;
    }

    @Override // tb.xs1
    public void i(thm thmVar, xs1.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2123b04", new Object[]{this, thmVar, dVar});
            return;
        }
        IPopData a2 = thmVar.a();
        if (!a2.isAllowShow()) {
            p(dVar, false);
            vfm.f("WindowContainerTrigger ", "trigger error, data has shown");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        IPopConfig popConfig = a2.getPopConfig();
        dbd a3 = this.e.a(popConfig.getPopContentType());
        if (a3 == null) {
            p(dVar, false);
            vfm.f("WindowContainerTrigger ", "no viewProvider by contentType=" + popConfig.getPopContentType());
            return;
        }
        IPopAnchorViewInfo d = this.f.d(a2, 0);
        if (d == null) {
            p(dVar, false);
            vfm.f("WindowContainerTrigger ", "no view info by contentType=" + popConfig.getPopContentType());
            return;
        }
        bgm.b("PopTargetCardValid", a2);
        BasePopView createPopView = this.d.createPopView(a2, a3, null, d, this.f, thmVar);
        if (createPopView == null) {
            p(dVar, false);
            vfm.f("WindowContainerTrigger ", "create popView error");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) createPopView.getLayoutParams();
        if (popConfig.getPointY() == 1) {
            layoutParams.gravity = 81;
        } else {
            layoutParams.gravity = 49;
        }
        this.d.bringToFront();
        p(dVar, true);
        vfm.f("WindowContainerTrigger ", "create new pop success, popView=" + createPopView.hashCode() + ", businessId=" + a2.getBusinessID() + ", useTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
    }
}
