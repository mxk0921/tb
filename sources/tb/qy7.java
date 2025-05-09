package tb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.DrawerModel;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class qy7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final qpu f27000a;
    public final cy7 b;
    public final rzh c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455538);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455537);
    }

    public qy7(qpu qpuVar, cy7 cy7Var, rzh rzhVar) {
        ckf.g(qpuVar, "turboEngineContext");
        ckf.g(cy7Var, "drawerComponentManager");
        ckf.g(rzhVar, "mainDrawerLifecycleHandler");
        this.f27000a = qpuVar;
        this.b = cy7Var;
        this.c = rzhVar;
    }

    public final void a(DrawerModel.DrawerGravity drawerGravity, float f, DrawerModel drawerModel, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea59c0", new Object[]{this, drawerGravity, new Float(f), drawerModel, frameLayout});
            return;
        }
        ckf.g(drawerGravity, "nextDrawerGravity");
        ckf.g(drawerModel, "nextDrawerData");
        ckf.g(frameLayout, "nextDrawerRootView");
        if (f >= 0.01d) {
            tpu.a aVar = tpu.Companion;
            aVar.c("DrawerRenderHelper", "在抽屉滚动时预渲染抽屉，下一个抽屉的像素偏移量满足条件，nextDrawerGravity=" + drawerGravity);
            b(drawerGravity, drawerModel, frameLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [tb.cy7] */
    /* JADX WARN: Type inference failed for: r4v11, types: [tb.rzh] */
    public final void b(DrawerModel.DrawerGravity drawerGravity, DrawerModel drawerModel, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33cb4469", new Object[]{this, drawerGravity, drawerModel, frameLayout});
            return;
        }
        ckf.g(drawerGravity, "drawerGravity");
        ckf.g(drawerModel, "drawerData");
        ckf.g(frameLayout, "drawerRootView");
        tpu.a aVar = tpu.Companion;
        aVar.c("DrawerRenderHelper", "渲染抽屉，drawerGravity=" + drawerGravity);
        BaseSubPageComponent<DrawerModel, ?> b = this.b.b(drawerGravity);
        BaseSubPageComponent<?, ?> baseSubPageComponent = 0;
        if (b == null) {
            tpu.a.b(aVar, "DrawerRenderHelper", "渲染抽屉，组件不存在，准备创建", null, 4, null);
            BaseSubPageComponent<?, ?> a2 = guq.INSTANCE.a(BaseOuterComponent.OuterComponentType.DRAWER, drawerModel.getId(), drawerModel.getType(), this.f27000a, new dps(this.f27000a));
            if (a2 instanceof BaseSubPageComponent) {
                baseSubPageComponent = a2;
            }
            if (baseSubPageComponent != null) {
                this.c.h(drawerGravity, drawerModel, baseSubPageComponent, IComponentLifecycle$TriggerType.UNSPECIFIED);
                View a3 = this.b.a(this.f27000a.getContext(), drawerGravity, baseSubPageComponent);
                frameLayout.removeAllViews();
                frameLayout.addView(a3);
                return;
            }
            return;
        }
        aVar.c("DrawerRenderHelper", "渲染抽屉，组件已存在，无需创建");
        View c = this.b.c(b);
        if (c == null) {
            return;
        }
        if (c.getParent() == null) {
            frameLayout.removeAllViews();
            frameLayout.addView(c);
        } else if (!ckf.b(c.getParent(), frameLayout)) {
            ViewParent parent = c.getParent();
            if (parent instanceof ViewGroup) {
                baseSubPageComponent = parent;
            }
            ViewGroup viewGroup = (ViewGroup) baseSubPageComponent;
            if (viewGroup != null) {
                viewGroup.removeView(c);
            }
            frameLayout.removeAllViews();
            frameLayout.addView(c);
        }
    }
}
