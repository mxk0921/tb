package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.turbo.base.service.multitab.ITabStyleListener;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.model.TabModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class bbj implements wwc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<byd> f16297a = new ArrayList();
    public final List<pxd> b = new ArrayList();
    public final List<ITabStyleListener> c = new ArrayList();
    public final Map<String, Integer> d = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455568);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455567);
        t2o.a(916455445);
    }

    public final Map<String, Integer> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("59432d6e", new Object[]{this});
        }
        return this.d;
    }

    public final void c(int i, float f, boolean z, boolean z2, ITabStyleListener.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57a0458", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Boolean(z2), triggerType});
            return;
        }
        ckf.g(triggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        aVar.c("MultiTabRegistry", "在Tab暗黑状态更新时通知，leftPosition=" + i + "，leftPositionOffset=" + f + "，isLeftTabDark=" + z + "，isRightTabDark=" + z2 + "，triggerType=" + triggerType);
        for (ITabStyleListener iTabStyleListener : this.c) {
            iTabStyleListener.a(i, f, z, z2, triggerType);
        }
    }

    public final void d(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666127dd", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabRegistry", "在Tab销毁时通知，tabId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.d.remove(str);
        for (byd bydVar : this.f16297a) {
            bydVar.onTabDestroy(str, iComponentLifecycle$TriggerType);
        }
    }

    public final void g(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a816c6", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        aVar.c("MultiTabRegistry", "在Tab滚动时通知，position=" + i + "，positionOffset=" + f + "，positionOffsetPixels=" + i2);
        for (pxd pxdVar : this.b) {
            pxdVar.B(i, f, i2);
        }
    }

    public final void h(int i, String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83f494f", new Object[]{this, new Integer(i), str, new Integer(i2), str2});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabRegistry", "在Tab选中时通知，lastPosition=" + i + "，lastTabId=" + str + "，currentPosition=" + i2 + "，currentTabId=" + str2, null, 4, null);
        for (pxd pxdVar : this.b) {
            pxdVar.x(i, str, i2, str2);
        }
    }

    public final void j(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313dd65b", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabRegistry", "在Tab停止时通知，tabId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.d.put(str, 4);
        for (byd bydVar : this.f16297a) {
            bydVar.onTabStop(str, iComponentLifecycle$TriggerType);
        }
    }

    @Override // tb.wwc
    public void t(byd bydVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8df18f", new Object[]{this, bydVar});
            return;
        }
        ckf.g(bydVar, DataReceiveMonitor.CB_LISTENER);
        ((ArrayList) this.f16297a).add(bydVar);
    }

    @Override // tb.wwc
    public void u(pxd pxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d56835", new Object[]{this, pxdVar});
            return;
        }
        ckf.g(pxdVar, DataReceiveMonitor.CB_LISTENER);
        ((ArrayList) this.b).add(pxdVar);
    }

    @Override // tb.wwc
    public void v(byd bydVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3edbfd68", new Object[]{this, bydVar});
            return;
        }
        ckf.g(bydVar, DataReceiveMonitor.CB_LISTENER);
        ((ArrayList) this.f16297a).remove(bydVar);
    }

    @Override // tb.wwc
    public void w(pxd pxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2b8ace", new Object[]{this, pxdVar});
            return;
        }
        ckf.g(pxdVar, DataReceiveMonitor.CB_LISTENER);
        ((ArrayList) this.b).remove(pxdVar);
    }

    @Override // tb.wwc
    public void x(ITabStyleListener iTabStyleListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a63006f", new Object[]{this, iTabStyleListener});
            return;
        }
        ckf.g(iTabStyleListener, DataReceiveMonitor.CB_LISTENER);
        ((ArrayList) this.c).add(iTabStyleListener);
    }

    public final void b(TabModel tabModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad89928", new Object[]{this, tabModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(tabModel, "tabData");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabRegistry", "在Tab创建时通知，tabId=" + tabModel.getId() + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.d.put(tabModel.getId(), 0);
        for (byd bydVar : this.f16297a) {
            bydVar.onTabCreate(tabModel, iComponentLifecycle$TriggerType);
        }
    }

    public final void e(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555cd1a1", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabRegistry", "在Tab暂停时通知，tabId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.d.put(str, 3);
        for (byd bydVar : this.f16297a) {
            bydVar.onTabPause(str, iComponentLifecycle$TriggerType);
        }
    }

    public final void f(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f41a010", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabRegistry", "在Tab恢复时通知，tabId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.d.put(str, 2);
        for (byd bydVar : this.f16297a) {
            bydVar.onTabResume(str, iComponentLifecycle$TriggerType);
        }
    }

    public final void i(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f06c5b5", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "MultiTabRegistry", "在Tab启动时通知，tabId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.d.put(str, 1);
        for (byd bydVar : this.f16297a) {
            bydVar.onTabStart(str, iComponentLifecycle$TriggerType);
        }
    }
}
