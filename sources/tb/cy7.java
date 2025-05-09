package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.monitor.Monitor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class cy7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Map<DrawerModel.DrawerGravity, BaseSubPageComponent<DrawerModel, ?>> f17431a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455536);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455535);
    }

    public final View a(Context context, DrawerModel.DrawerGravity drawerGravity, BaseSubPageComponent<DrawerModel, ?> baseSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("55fe50ce", new Object[]{this, context, drawerGravity, baseSubPageComponent});
        }
        ckf.g(context, "context");
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(baseSubPageComponent, "drawerComponent");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerComponentManager", "创建抽屉组件视图，drawerComponent=" + baseSubPageComponent, null, 4, null);
        try {
            return baseSubPageComponent.createView();
        } catch (Exception e) {
            e(drawerGravity, "createView", e);
            return new View(context);
        }
    }

    public final BaseSubPageComponent<DrawerModel, ?> b(DrawerModel.DrawerGravity drawerGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSubPageComponent) ipChange.ipc$dispatch("cfc3cf15", new Object[]{this, drawerGravity});
        }
        ckf.g(drawerGravity, "drawerGravity");
        BaseSubPageComponent<DrawerModel, ?> baseSubPageComponent = (BaseSubPageComponent) ((LinkedHashMap) this.f17431a).get(drawerGravity);
        tpu.a aVar = tpu.Companion;
        aVar.c("DrawerComponentManager", "获取抽屉组件，drawerGravity=" + drawerGravity + ", drawerComponent=" + baseSubPageComponent);
        return baseSubPageComponent;
    }

    public final View c(BaseSubPageComponent<DrawerModel, ?> baseSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f6689a88", new Object[]{this, baseSubPageComponent});
        }
        ckf.g(baseSubPageComponent, "drawerComponent");
        tpu.a aVar = tpu.Companion;
        aVar.c("DrawerComponentManager", "获取抽屉组件视图，drawerComponent=" + baseSubPageComponent);
        return baseSubPageComponent.getView();
    }

    public final void f(DrawerModel.DrawerGravity drawerGravity, BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c64dbf", new Object[]{this, drawerGravity, bVar});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(bVar, "message");
        BaseSubPageComponent<DrawerModel, ?> b = b(drawerGravity);
        if (b != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "DrawerComponentManager", "抽屉组件处理外部消息，获取组件成功，drawerGravity=" + drawerGravity, null, 4, null);
            try {
                b.handleOuterMessage(bVar);
            } catch (Exception e) {
                e(drawerGravity, "handleOuterMessage", e);
            }
        } else {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "DrawerComponentManager", "抽屉组件处理外部消息，获取组件失败，drawerGravity=" + drawerGravity, null, 4, null);
        }
    }

    public final void g(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbaea8bc", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a.b(tpu.Companion, "DrawerComponentManager", "所有抽屉组件销毁的时机", null, 4, null);
        i(DrawerModel.DrawerGravity.LEFT, iComponentLifecycle$TriggerType);
        i(DrawerModel.DrawerGravity.RIGHT, iComponentLifecycle$TriggerType);
    }

    public final void h(DrawerModel.DrawerGravity drawerGravity, DrawerModel drawerModel, BaseSubPageComponent<DrawerModel, ?> baseSubPageComponent, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a7c9ac", new Object[]{this, drawerGravity, drawerModel, baseSubPageComponent, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(drawerModel, "drawerData");
        ckf.g(baseSubPageComponent, "drawerComponent");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerComponentManager", "抽屉组件创建的时机，drawerGravity=" + drawerGravity, null, 4, null);
        this.f17431a.put(drawerGravity, baseSubPageComponent);
        try {
            baseSubPageComponent.onCreate(drawerModel, iComponentLifecycle$TriggerType);
        } catch (Exception e) {
            e(drawerGravity, "onCreate", e);
        }
    }

    public final void i(DrawerModel.DrawerGravity drawerGravity, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d297a271", new Object[]{this, drawerGravity, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<DrawerModel, ?> remove = this.f17431a.remove(drawerGravity);
        if (remove != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "DrawerComponentManager", "抽屉组件销毁的时机，获取组件成功，drawerGravity=" + drawerGravity, null, 4, null);
            try {
                remove.onDestroy(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                e(drawerGravity, "onDestroy", e);
            }
        } else {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "DrawerComponentManager", "抽屉组件销毁的时机，获取组件失败，drawerGravity=" + drawerGravity, null, 4, null);
        }
    }

    public final void j(DrawerModel.DrawerGravity drawerGravity, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37184cb5", new Object[]{this, drawerGravity, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<DrawerModel, ?> b = b(drawerGravity);
        if (b != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "DrawerComponentManager", "抽屉组件暂停的时机，获取组件成功，drawerGravity=" + drawerGravity, null, 4, null);
            try {
                b.onPause(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                e(drawerGravity, "onPause", e);
            }
        } else {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "DrawerComponentManager", "抽屉组件暂停的时机，获取组件失败，drawerGravity=" + drawerGravity, null, 4, null);
        }
    }

    public final Set<DrawerModel.DrawerGravity> k(Set<? extends DrawerModel.DrawerGravity> set, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7af29875", new Object[]{this, set, iComponentLifecycle$TriggerType});
        }
        ckf.g(set, "retainDrawerGravities");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        Set<DrawerModel.DrawerGravity> i = lfp.i(((LinkedHashMap) this.f17431a).keySet(), set);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "DrawerComponentManager", "剩余抽屉组件销毁的时机，retainDrawerGravities=" + set + "，remainingDrawerGravities=" + i, null, 4, null);
        for (DrawerModel.DrawerGravity drawerGravity : i) {
            i(drawerGravity, iComponentLifecycle$TriggerType);
        }
        return i;
    }

    public final void l(DrawerModel.DrawerGravity drawerGravity, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ddb780", new Object[]{this, drawerGravity, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<DrawerModel, ?> b = b(drawerGravity);
        if (b != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "DrawerComponentManager", "抽屉组件恢复的时机，获取组件成功，drawerGravity=" + drawerGravity, null, 4, null);
            try {
                b.onResume(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                e(drawerGravity, "onResume", e);
            }
        } else {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "DrawerComponentManager", "抽屉组件恢复的时机，获取组件失败，drawerGravity=" + drawerGravity, null, 4, null);
        }
    }

    public final void m(DrawerModel.DrawerGravity drawerGravity, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19419cc9", new Object[]{this, drawerGravity, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<DrawerModel, ?> b = b(drawerGravity);
        if (b != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "DrawerComponentManager", "抽屉组件启动的时机，获取组件成功，drawerGravity=" + drawerGravity, null, 4, null);
            try {
                b.onStart(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                e(drawerGravity, "onStart", e);
            }
        } else {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "DrawerComponentManager", "抽屉组件启动的时机，获取组件失败，drawerGravity=" + drawerGravity, null, 4, null);
        }
    }

    public final void n(DrawerModel.DrawerGravity drawerGravity, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a2e24b", new Object[]{this, drawerGravity, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<DrawerModel, ?> b = b(drawerGravity);
        if (b != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "DrawerComponentManager", "抽屉组件停止的时机，获取组件成功，drawerGravity=" + drawerGravity, null, 4, null);
            try {
                b.onStop(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                e(drawerGravity, "onStop", e);
            }
        } else {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "DrawerComponentManager", "抽屉组件停止的时机，获取组件失败，drawerGravity=" + drawerGravity, null, 4, null);
        }
    }

    public final void o(DrawerModel.DrawerGravity drawerGravity, DrawerModel drawerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab33d023", new Object[]{this, drawerGravity, drawerModel});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(drawerModel, "drawerData");
        BaseSubPageComponent<DrawerModel, ?> b = b(drawerGravity);
        if (b != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "DrawerComponentManager", "更新抽屉组件数据，获取组件成功，drawerGravity=" + drawerGravity, null, 4, null);
            try {
                b.updateData(drawerModel);
            } catch (Exception e) {
                e(drawerGravity, "updateData", e);
            }
        } else {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "DrawerComponentManager", "更新抽屉组件数据，获取组件失败，drawerGravity=" + drawerGravity, null, 4, null);
        }
    }

    public final boolean d(DrawerModel.DrawerGravity drawerGravity, IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9a45ab4", new Object[]{this, drawerGravity, triggerType})).booleanValue();
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(triggerType, "triggerType");
        BaseSubPageComponent<DrawerModel, ?> b = b(drawerGravity);
        if (b != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "DrawerComponentManager", "抽屉组件处理返回，获取组件成功，drawerGravity=" + drawerGravity, null, 4, null);
            try {
                return b.handleBack(triggerType);
            } catch (Exception e) {
                e(drawerGravity, "handleBack", e);
                return false;
            }
        } else {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, "DrawerComponentManager", "抽屉组件处理返回，获取组件失败，drawerGravity=" + drawerGravity, null, 4, null);
            return false;
        }
    }

    public final void e(DrawerModel.DrawerGravity drawerGravity, String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa675c4", new Object[]{this, drawerGravity, str, exc});
        } else {
            gi8.INSTANCE.a("调用抽屉组件异常", kotlin.collections.a.j(jpu.a("drawerGravity", drawerGravity), jpu.a(FluidException.METHOD_NAME, str)), Monitor.Type.DRAWER, Monitor.Code.EXCEPTION, true, exc);
        }
    }
}
