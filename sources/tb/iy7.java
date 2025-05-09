package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.model.DrawerModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class iy7 implements b1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<d1c> f21643a = new ArrayList();
    public final List<a1c> b = new ArrayList();
    public final Map<String, Integer> c = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455542);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455541);
        t2o.a(916455440);
    }

    public final void a(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ceffd4", new Object[]{this, drawerGravity});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerRegistry", "在抽屉关闭时通知，drawerGravity=" + drawerGravity, null, 4, null);
        for (a1c a1cVar : this.b) {
            a1cVar.U0(drawerGravity);
        }
    }

    public final void c(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbbfc189", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerRegistry", "在抽屉销毁时通知，drawerId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.c.remove(str);
        for (d1c d1cVar : this.f21643a) {
            d1cVar.onDrawerDestroy(str, iComponentLifecycle$TriggerType);
        }
    }

    @Override // tb.b1c
    public void d(a1c a1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0ae613", new Object[]{this, a1cVar});
            return;
        }
        ckf.g(a1cVar, DataReceiveMonitor.CB_LISTENER);
        ((ArrayList) this.b).remove(a1cVar);
    }

    @Override // tb.b1c
    public void e(d1c d1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a604a482", new Object[]{this, d1cVar});
            return;
        }
        ckf.g(d1cVar, DataReceiveMonitor.CB_LISTENER);
        ((ArrayList) this.f21643a).add(d1cVar);
    }

    public final void f(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d641a11", new Object[]{this, drawerGravity});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerRegistry", "在抽屉打开时通知，drawerGravity=" + drawerGravity, null, 4, null);
        for (a1c a1cVar : this.b) {
            a1cVar.M(drawerGravity);
        }
    }

    public final void j(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90617c2f", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerRegistry", "在抽屉停止时通知，drawerId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.c.put(str, 4);
        for (d1c d1cVar : this.f21643a) {
            d1cVar.onDrawerStop(str, iComponentLifecycle$TriggerType);
        }
    }

    @Override // tb.b1c
    public void p(a1c a1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8429b7fa", new Object[]{this, a1cVar});
            return;
        }
        ckf.g(a1cVar, DataReceiveMonitor.CB_LISTENER);
        ((ArrayList) this.b).add(a1cVar);
    }

    public final void b(DrawerModel drawerModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c84c3e", new Object[]{this, drawerModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(drawerModel, "drawerData");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerRegistry", "在抽屉创建时通知，drawerId=" + drawerModel.getId() + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.c.put(drawerModel.getId(), 0);
        for (d1c d1cVar : this.f21643a) {
            d1cVar.onDrawerCreate(drawerModel, iComponentLifecycle$TriggerType);
        }
    }

    public final void g(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daade64d", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerRegistry", "在抽屉暂停时通知，drawerId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.c.put(str, 3);
        for (d1c d1cVar : this.f21643a) {
            d1cVar.onDrawerPause(str, iComponentLifecycle$TriggerType);
        }
    }

    public final void h(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741320e4", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerRegistry", "在抽屉恢复时通知，drawerId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.c.put(str, 2);
        for (d1c d1cVar : this.f21643a) {
            d1cVar.onDrawerResume(str, iComponentLifecycle$TriggerType);
        }
    }

    public final void i(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457da61", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, "drawerId");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerContainerRegistry", "在抽屉启动时通知，drawerId=" + str + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        this.c.put(str, 1);
        for (d1c d1cVar : this.f21643a) {
            d1cVar.onDrawerStart(str, iComponentLifecycle$TriggerType);
        }
    }
}
