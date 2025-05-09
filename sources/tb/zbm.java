package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.viewmodel.PopDataViewModel;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zbm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ybm f32667a;
    public final e3b b;
    public boolean c = false;
    public boolean d = true;
    public boolean e = true;

    public zbm(e3b e3bVar, pfw pfwVar) {
        this.b = e3bVar;
        this.f32667a = new ybm(pfwVar);
    }

    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a9cc83", new Object[]{this, str});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.removePopView(str);
            }
        }
    }

    public void B(IPopData iPopData) {
        BasePopContainer e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41f8ec1", new Object[]{this, iPopData});
            return;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig != null && (e = e(popConfig.getHierarchy())) != null) {
            e.removeUcpPendingPop(iPopData);
        }
    }

    public void C(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8026db3", new Object[]{this, str, new Float(f)});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.setAlpha(str, f);
            }
        }
    }

    public void D(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b81b595", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.translate(f, f2);
            }
        }
    }

    public void E(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf50ba7", new Object[]{this, str, str2, jSONObject});
            return;
        }
        vfm.c("PopContainerManager ", "triggerPopMessage, message=" + str + ", businessId=" + str2);
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.triggerPopMessage(str, str2, jSONObject);
            }
        }
    }

    public void F(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708e292a", new Object[]{this, new Integer(i), str});
            return;
        }
        vfm.c("PopContainerManager ", "triggerPopViewEvent, eventType=" + i + ", businessId=" + str);
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.triggerPopViewEvent(i, str);
            }
        }
    }

    public BasePopContainer a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("3133f9ff", new Object[]{this, context, new Integer(i)});
        }
        return this.f32667a.b(context, i, this.b);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Map<Integer, WeakReference<BasePopContainer>> d = this.f32667a.d();
        for (WeakReference<BasePopContainer> weakReference : d.values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.destroy();
            }
        }
        d.clear();
    }

    public IPopAnchorViewInfo c(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("59da7512", new Object[]{this, iPopData});
        }
        BasePopContainer c = this.f32667a.c(iPopData.getPopConfig().getHierarchy());
        if (c == null) {
            return null;
        }
        return c.getAnchorInfo(iPopData);
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("851967ea", new Object[]{this});
        }
        Map<Integer, WeakReference<BasePopContainer>> d = this.f32667a.d();
        JSONObject jSONObject = new JSONObject(16);
        for (WeakReference<BasePopContainer> weakReference : d.values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.generateOnScreenBizParams(jSONObject);
            }
        }
        return jSONObject;
    }

    public BasePopContainer e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("59beb6ad", new Object[]{this, new Integer(i)});
        }
        return this.f32667a.c(i);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ebac364", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2148c90e", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final boolean h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("305179a1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!mve.a("fixPopTabSwitchLogicEnable", true)) {
            return false;
        }
        if (i == 4 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbf13cf2", new Object[]{this})).booleanValue();
        }
        return this.b.h().e();
    }

    public boolean j(IPopData iPopData) {
        BasePopContainer e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe7d1e4", new Object[]{this, iPopData})).booleanValue();
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig == null || (e = e(popConfig.getHierarchy())) == null) {
            return false;
        }
        return e.isUcpPendingTrigger(iPopData);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83930d7", new Object[]{this});
            return;
        }
        y(0);
        y(1);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onAppToBackground();
            }
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3baf87", new Object[]{this});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onAppToForeground();
            }
        }
    }

    public void n(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339efcd3", new Object[]{this, new Integer(i), view, str});
            return;
        }
        vfm.c("PopContainerManager ", "onCardDetached, sectionBiz=" + str);
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onCardAttached(i, view, str);
            }
        }
    }

    public void o(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8be921", new Object[]{this, new Integer(i), view, str});
            return;
        }
        vfm.c("PopContainerManager ", "onCardDetached, sectionBiz=" + str);
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onCardDetached(i, view, str);
            }
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73803697", new Object[]{this, new Integer(i)});
            return;
        }
        vfm.c("PopContainerManager ", "onIconScroll, offset=" + i);
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onIconScroll(i);
            }
        }
    }

    public void u(ViewGroup viewGroup, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0bc1a8", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        if (i == 0) {
            z = false;
        }
        if (this.c != z) {
            this.c = z;
            for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
                BasePopContainer basePopContainer = weakReference.get();
                if (basePopContainer != null) {
                    basePopContainer.onScrollStateChange(viewGroup, i);
                }
            }
        }
    }

    public void v(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352733f0", new Object[]{this, new Integer(i), str});
            return;
        }
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onTriggerShow(i, str);
            }
        }
    }

    public void x(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae61c13", new Object[]{this, iPopData});
            return;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig == null) {
            vfm.f("PopContainerManager ", "reTriggerByUCP, popConfig is null");
            osu.e(osu.b(this.b), "Error", 3, esu.ERROR_MSG_NO_POP_DATA);
            return;
        }
        BasePopContainer e = e(popConfig.getHierarchy());
        if (e == null) {
            osu.e(osu.b(this.b), "Error", 3, esu.ERROR_MSG_NO_POP_DATA);
            vfm.f("PopContainerManager ", "reTriggerByUCP, container is null");
            return;
        }
        e.reTriggerPopByUCP(iPopData);
        vfm.f("PopContainerManager ", "reTriggerByUCP");
    }

    public final void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8e36d0", new Object[]{this, new Integer(i)});
            return;
        }
        Map<Integer, WeakReference<BasePopContainer>> d = this.f32667a.d();
        vfm.f("PopContainerManager ", "reTriggerPop, triggerType=" + i + ", containerSize=" + d.size());
        for (WeakReference<BasePopContainer> weakReference : d.values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.reTriggerPop(i);
            }
        }
    }

    public void z(e3b e3bVar, PopDataViewModel popDataViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6cfa7c", new Object[]{this, e3bVar, popDataViewModel});
            return;
        }
        Map<Integer, WeakReference<BasePopContainer>> d = this.f32667a.d();
        vfm.f("PopContainerManager ", "refreshData, containerSize=" + d.size());
        for (WeakReference<BasePopContainer> weakReference : d.values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.refreshData(e3bVar, popDataViewModel);
            }
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb0d3df", new Object[]{this, new Integer(i)});
            return;
        }
        if (!h(i)) {
            this.d = true;
        }
        vfm.c("PopContainerManager ", "onInfoFlowEnter, switchType=" + i);
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onInfoFlowEnter(i);
            }
        }
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaf9f60", new Object[]{this, new Integer(i)});
            return;
        }
        if (!h(i)) {
            this.d = false;
        }
        vfm.c("PopContainerManager ", "onInfoFlowLeave, switchType=" + i);
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onInfoFlowLeave(i);
            }
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26527412", new Object[]{this});
            return;
        }
        this.e = true;
        vfm.c("PopContainerManager ", "onPopLayerDismiss");
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onPopLayerDismiss();
            }
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99562ea3", new Object[]{this});
            return;
        }
        this.e = false;
        vfm.c("PopContainerManager ", "onPopLayerShow");
        for (WeakReference<BasePopContainer> weakReference : this.f32667a.d().values()) {
            BasePopContainer basePopContainer = weakReference.get();
            if (basePopContainer != null) {
                basePopContainer.onPopLayerShow();
            }
        }
    }

    public boolean w(int i, IPopData<?> iPopData) {
        BasePopContainer basePopContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a213bb56", new Object[]{this, new Integer(i), iPopData})).booleanValue();
        }
        if (iPopData == null || iPopData.getPopConfig() == null) {
            vfm.f("PopContainerManager ", "popData inValid");
            return false;
        }
        WeakReference<BasePopContainer> weakReference = this.f32667a.d().get(Integer.valueOf(iPopData.getPopConfig().getHierarchy()));
        if (weakReference == null || (basePopContainer = weakReference.get()) == null) {
            return false;
        }
        vfm.f("PopContainerManager ", "trigger show by pop data");
        return basePopContainer.onTriggerShowByPopData(i, iPopData);
    }
}
