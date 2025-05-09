package tb;

import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.service.multitab.handler.TabLifecycleHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class krs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String RENDER_TYPE_TAB_SELECTED = "tabSelected";
    public int b;
    public final qpu d;
    public final kqs e;
    public final TabLifecycleHandler f;
    public final List<MessageQueue.IdleHandler> c = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22872a = ((Boolean) ud0.Companion.b().c("weitao_switch.enableTabPreRender", Boolean.TRUE)).booleanValue();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ TabModel c;
        public final /* synthetic */ FrameLayout d;

        public a(int i, TabModel tabModel, FrameLayout frameLayout) {
            this.b = i;
            this.c = tabModel;
            this.d = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c cVar = new c(krs.this, this.b, this.c, this.d);
            krs.a(krs.this).add(cVar);
            Looper.myQueue().addIdleHandler(cVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        static {
            t2o.a(916455562);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455561);
    }

    public krs(qpu qpuVar, kqs kqsVar, TabLifecycleHandler tabLifecycleHandler) {
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(kqsVar, "tabComponentManager");
        ckf.g(tabLifecycleHandler, "tabLifecycleHandler");
        this.d = qpuVar;
        this.e = kqsVar;
        this.f = tabLifecycleHandler;
    }

    public static final /* synthetic */ List a(krs krsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("382ac476", new Object[]{krsVar});
        }
        return krsVar.c;
    }

    public static final /* synthetic */ qpu b(krs krsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("ca809f80", new Object[]{krsVar});
        }
        return krsVar.d;
    }

    public final IComponentLifecycle$TriggerType c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IComponentLifecycle$TriggerType) ipChange.ipc$dispatch("c8af71fc", new Object[]{this, str});
        }
        int hashCode = str.hashCode();
        if (hashCode != -1249299743) {
            if (hashCode != 3227604) {
                if (hashCode == 344437072 && str.equals("tabSelected")) {
                    return IComponentLifecycle$TriggerType.TAB_SELECT;
                }
            } else if (str.equals("idle")) {
                return IComponentLifecycle$TriggerType.IDLE;
            }
        } else if (str.equals("tabScrolled")) {
            return IComponentLifecycle$TriggerType.TAB_SCROLL;
        }
        return IComponentLifecycle$TriggerType.UNSPECIFIED;
    }

    public final void e(int i, float f, TabModel tabModel, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3563f7d9", new Object[]{this, new Integer(i), new Float(f), tabModel, frameLayout});
            return;
        }
        ckf.g(tabModel, "nextTabData");
        ckf.g(frameLayout, "nextTabRootView");
        if (this.f22872a && f >= 0.01d) {
            tpu.a aVar = tpu.Companion;
            aVar.c("TabRenderHelper", "在Tab滚动时预渲染Tab，下一个Tab的像素偏移量满足条件，nextPosition=" + i);
            f(i, tabModel, frameLayout, "tabScrolled");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.taobao.android.turbo.service.multitab.handler.TabLifecycleHandler] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v9, types: [tb.kqs] */
    public final void f(int i, TabModel tabModel, FrameLayout frameLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ed04ca", new Object[]{this, new Integer(i), tabModel, frameLayout, str});
            return;
        }
        ckf.g(tabModel, "tabData");
        ckf.g(frameLayout, "tabRootView");
        ckf.g(str, "renderType");
        String id = tabModel.getId();
        tpu.a aVar = tpu.Companion;
        aVar.c("TabRenderHelper", "渲染Tab，position=" + i + "，tabId=" + id);
        BaseSubPageComponent<TabModel, ?> b2 = this.e.b(id);
        BaseSubPageComponent<?, ?> baseSubPageComponent = 0;
        if (b2 == null) {
            tpu.a.b(aVar, "TabRenderHelper", "渲染Tab，组件不存在，准备创建", null, 4, null);
            BaseSubPageComponent<?, ?> a2 = guq.INSTANCE.a(BaseOuterComponent.OuterComponentType.TAB, id, tabModel.getType(), this.d, new dps(this.d));
            if (a2 instanceof BaseSubPageComponent) {
                baseSubPageComponent = a2;
            }
            if (baseSubPageComponent != null) {
                this.f.d(tabModel, baseSubPageComponent, c(str));
                View a3 = this.e.a(this.d.getContext(), id, baseSubPageComponent);
                frameLayout.removeAllViews();
                frameLayout.addView(a3);
                return;
            }
            return;
        }
        aVar.c("TabRenderHelper", "渲染Tab，组件已存在，无需创建");
        View d = this.e.d(b2);
        if (d == null) {
            return;
        }
        if (d.getParent() == null) {
            frameLayout.removeAllViews();
            frameLayout.addView(d);
        } else if (!ckf.b(d.getParent(), frameLayout)) {
            ViewParent parent = d.getParent();
            if (parent instanceof ViewGroup) {
                baseSubPageComponent = parent;
            }
            ViewGroup viewGroup = (ViewGroup) baseSubPageComponent;
            if (viewGroup != null) {
                viewGroup.removeView(d);
            }
            frameLayout.removeAllViews();
            frameLayout.addView(d);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        for (MessageQueue.IdleHandler idleHandler : this.c) {
            Looper.myQueue().removeIdleHandler(idleHandler);
        }
        ((ArrayList) this.c).clear();
        this.b = 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class c implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f22874a;
        public final TabModel b;
        public final FrameLayout c;
        public final /* synthetic */ krs d;

        static {
            t2o.a(916455563);
        }

        public c(krs krsVar, int i, TabModel tabModel, FrameLayout frameLayout) {
            ckf.g(tabModel, "tabData");
            ckf.g(frameLayout, "tabRootView");
            this.d = krsVar;
            this.f22874a = i;
            this.b = tabModel;
            this.c = frameLayout;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            q2c q2cVar = (q2c) krs.b(this.d).getService(q2c.class);
            if (((b7d) krs.b(this.d).getService(b7d.class)).getPageState() == 5) {
                return false;
            }
            if (q2cVar.t0().compareTo(EngineState.INIT) <= 0) {
                return true;
            }
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "TabRenderHelper", "在空闲时预渲染Tab，position=" + this.f22874a, null, 4, null);
            this.d.f(this.f22874a, this.b, this.c, "idle");
            return false;
        }
    }

    public final void d(int i, TabModel tabModel, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0c67b6", new Object[]{this, new Integer(i), tabModel, frameLayout});
            return;
        }
        ckf.g(tabModel, "tabData");
        ckf.g(frameLayout, "tabRootView");
        if (this.f22872a && this.b < 2) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "TabRenderHelper", "在空闲时预渲染Tab，预渲染Tab数量满足条件，position=" + i, null, 4, null);
            this.b = this.b + 1;
            zrt.Companion.d(new a(i, tabModel, frameLayout), 1000L);
        }
    }
}
