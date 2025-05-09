package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.monitor.Monitor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class kqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, BaseSubPageComponent<TabModel, ?>> f22856a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455556);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455555);
    }

    public final View a(Context context, String str, BaseSubPageComponent<TabModel, ?> baseSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8450cb30", new Object[]{this, context, str, baseSubPageComponent});
        }
        ckf.g(context, "context");
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(baseSubPageComponent, "tabComponent");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TabComponentManager", "创建Tab组件视图，tabComponent=" + baseSubPageComponent, null, 4, null);
        try {
            return baseSubPageComponent.createView();
        } catch (Exception e) {
            f(str, "createView", e);
            return new View(context);
        }
    }

    public final BaseSubPageComponent<TabModel, ?> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSubPageComponent) ipChange.ipc$dispatch("55e75073", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        BaseSubPageComponent<TabModel, ?> baseSubPageComponent = (BaseSubPageComponent) ((LinkedHashMap) this.f22856a).get(str);
        tpu.a aVar = tpu.Companion;
        aVar.c("TabComponentManager", "获取Tab组件，tabId=" + str + ", tabComponent=" + baseSubPageComponent);
        return baseSubPageComponent;
    }

    public final View d(BaseSubPageComponent<TabModel, ?> baseSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f6689a88", new Object[]{this, baseSubPageComponent});
        }
        ckf.g(baseSubPageComponent, "tabComponent");
        tpu.a aVar = tpu.Companion;
        aVar.c("TabComponentManager", "获取Tab组件视图，tabComponent=" + baseSubPageComponent);
        return baseSubPageComponent.getView();
    }

    public final void g(String str, BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("133fc71d", new Object[]{this, str, bVar});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(bVar, "message");
        BaseSubPageComponent<TabModel, ?> b = b(str);
        if (b != null) {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件处理外部消息，获取组件成功，tabId=".concat(str), null, 4, null);
            try {
                b.handleOuterMessage(bVar);
            } catch (Exception e) {
                f(str, "handleOuterMessage", e);
            }
        } else {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件处理外部消息，获取组件失败，tabId=".concat(str), null, 4, null);
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8fa9e8", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        BaseSubPageComponent<TabModel, ?> b = b(str);
        if (b != null) {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件处理分享，获取组件成功，tabId=".concat(str), null, 4, null);
            try {
                b.handleShare();
            } catch (Exception e) {
                f(str, "handleShare", e);
            }
        } else {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件处理分享，获取组件失败，tabId=".concat(str), null, 4, null);
        }
    }

    public final void i(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbaea8bc", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a.b(tpu.Companion, "TabComponentManager", "所有Tab组件销毁的时机", null, 4, null);
        for (BaseSubPageComponent baseSubPageComponent : ((LinkedHashMap) this.f22856a).values()) {
            baseSubPageComponent.onDestroy(iComponentLifecycle$TriggerType);
        }
        ((LinkedHashMap) this.f22856a).clear();
    }

    public final void j(TabModel tabModel, BaseSubPageComponent<TabModel, ?> baseSubPageComponent, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac72bf6", new Object[]{this, tabModel, baseSubPageComponent, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(tabModel, "tabData");
        ckf.g(baseSubPageComponent, "tabComponent");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        String id = tabModel.getId();
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TabComponentManager", "Tab组件创建的时机，tabId=" + id, null, 4, null);
        this.f22856a.put(id, baseSubPageComponent);
        try {
            baseSubPageComponent.onCreate(tabModel, iComponentLifecycle$TriggerType);
        } catch (Exception e) {
            f(id, "onCreate", e);
        }
    }

    public final void k(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902928cf", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<TabModel, ?> remove = this.f22856a.remove(str);
        if (remove != null) {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件销毁的时机，获取组件成功，tabId=".concat(str), null, 4, null);
            try {
                remove.onDestroy(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                f(str, "onDestroy", e);
            }
        } else {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件销毁的时机，获取组件失败，tabId=".concat(str), null, 4, null);
        }
    }

    public final void l(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b46713", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<TabModel, ?> b = b(str);
        if (b != null) {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件暂停的时机，获取组件成功，tabId=".concat(str), null, 4, null);
            try {
                b.onPause(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                f(str, "onPause", e);
            }
        } else {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件暂停的时机，获取组件失败，tabId=".concat(str), null, 4, null);
        }
    }

    public final Set<String> m(Set<String> set, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7af29875", new Object[]{this, set, iComponentLifecycle$TriggerType});
        }
        ckf.g(set, "retainTabIds");
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        Set<String> i = lfp.i(((LinkedHashMap) this.f22856a).keySet(), set);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TabComponentManager", "剩余Tab组件销毁的时机，retainTabIds=" + set + "，remainingTabIds=" + i, null, 4, null);
        for (String str : i) {
            k(str, iComponentLifecycle$TriggerType);
        }
        return i;
    }

    public final void n(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58dcb8de", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<TabModel, ?> b = b(str);
        if (b != null) {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件恢复的时机，获取组件成功，tabId=".concat(str), null, 4, null);
            try {
                b.onResume(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                f(str, "onResume", e);
            }
        } else {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件恢复的时机，获取组件失败，tabId=".concat(str), null, 4, null);
        }
    }

    public final void o(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505e5b27", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<TabModel, ?> b = b(str);
        if (b != null) {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件启动的时机，获取组件成功，tabId=".concat(str), null, 4, null);
            try {
                b.onStart(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                f(str, "onStart", e);
            }
        } else {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件启动的时机，获取组件失败，tabId=".concat(str), null, 4, null);
        }
    }

    public final void p(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4caa9", new Object[]{this, str, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent<TabModel, ?> b = b(str);
        if (b != null) {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件停止的时机，获取组件成功，tabId=".concat(str), null, 4, null);
            try {
                b.onStop(iComponentLifecycle$TriggerType);
            } catch (Exception e) {
                f(str, "onStop", e);
            }
        } else {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件停止的时机，获取组件失败，tabId=".concat(str), null, 4, null);
        }
    }

    public final void q(String str, TabModel tabModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d017df", new Object[]{this, str, tabModel});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(tabModel, "tabData");
        BaseSubPageComponent<TabModel, ?> b = b(str);
        if (b != null) {
            tpu.a.b(tpu.Companion, "TabComponentManager", "更新Tab组件数据，获取组件成功，tabId=".concat(str), null, 4, null);
            try {
                b.updateData(tabModel);
            } catch (Exception e) {
                f(str, "updateData", e);
            }
        } else {
            tpu.a.b(tpu.Companion, "TabComponentManager", "更新Tab组件数据，获取组件失败，tabId=".concat(str), null, 4, null);
        }
    }

    public final int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57f9e530", new Object[]{this, str})).intValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        BaseSubPageComponent<TabModel, ?> b = b(str);
        if (b != null) {
            tpu.Companion.c("TabComponentManager", "获取Tab组件恢复的次数，获取组件成功，tabId=".concat(str));
            try {
                return b.getResumeCount();
            } catch (Exception e) {
                f(str, "getResumeCount", e);
                return 0;
            }
        } else {
            tpu.Companion.c("TabComponentManager", "获取Tab组件恢复的次数，获取组件失败，tabId=".concat(str));
            return 0;
        }
    }

    public final boolean e(String str, IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("899b9d92", new Object[]{this, str, triggerType})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(triggerType, "triggerType");
        BaseSubPageComponent<TabModel, ?> b = b(str);
        if (b != null) {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件处理返回，获取组件成功，tabId=".concat(str), null, 4, null);
            try {
                return b.handleBack(triggerType);
            } catch (Exception e) {
                f(str, "handleBack", e);
                return false;
            }
        } else {
            tpu.a.b(tpu.Companion, "TabComponentManager", "Tab组件处理返回，获取组件失败，tabId=".concat(str), null, 4, null);
            return false;
        }
    }

    public final void f(String str, String str2, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d996da2", new Object[]{this, str, str2, exc});
        } else {
            gi8.INSTANCE.a("调用Tab组件异常", kotlin.collections.a.j(jpu.a(vaj.KEY_TAB_ID, str), jpu.a(FluidException.METHOD_NAME, str2)), Monitor.Type.TAB, Monitor.Code.EXCEPTION, true, exc);
        }
    }
}
