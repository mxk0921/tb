package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SeekBarScrollInterceptView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class p8p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f25948a;
    public SeekBarScrollInterceptView b;

    static {
        t2o.a(468714170);
        t2o.a(468714169);
    }

    public p8p(FluidContext fluidContext) {
        this.f25948a = fluidContext;
    }

    public void b() {
        final ViewGroup c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6ee2eb", new Object[]{this});
            return;
        }
        ir9.b("SeekBarScrollInterceptManager", "添加SeekBarScrollInterceptView到视图树上");
        if (d() && (c = p91.c()) != null) {
            c.post(new Runnable() { // from class: tb.o8p
                @Override // java.lang.Runnable
                public final void run() {
                    p8p.this.h(c);
                }
            });
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("953e04c", new Object[]{this})).booleanValue();
        }
        if (!i() || !pto.q(this.f25948a)) {
            return false;
        }
        if (f2k.d(this.f25948a) || b93.n(this.f25948a)) {
            return true;
        }
        return false;
    }

    public SeekBarScrollInterceptView e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SeekBarScrollInterceptView) ipChange.ipc$dispatch("fbca515b", new Object[]{this});
        }
        return this.b;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca65cea6", new Object[]{this})).intValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("seekBarDraggableHeightOnTabBar", 20);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971e0383", new Object[]{this});
            return;
        }
        ir9.b("SeekBarScrollInterceptManager", "初始化SeekBarScrollInterceptView");
        if (d()) {
            SeekBarScrollInterceptView seekBarScrollInterceptView = new SeekBarScrollInterceptView(this.f25948a.getContext());
            this.b = seekBarScrollInterceptView;
            seekBarScrollInterceptView.init();
        }
    }

    public final /* synthetic */ void h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222ba45e", new Object[]{this, view});
        } else if (this.b != null && (view.getParent() instanceof FrameLayout)) {
            if (this.b.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            int b = jxv.b(this.f25948a.getContext(), f());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getWidth(), b);
            layoutParams.topMargin = view.getTop();
            layoutParams.leftMargin = view.getLeft();
            ir9.b("SeekBarScrollInterceptManager", "添加SeekBarScrollInterceptView到视图树上，height=" + b + "，topMargin=" + layoutParams.topMargin + "，leftMargin=" + layoutParams.leftMargin);
            ((FrameLayout) view.getParent()).addView(this.b, layoutParams);
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90b9c0be", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableDragSeekBarOnTabBar", false);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5794fb9", new Object[]{this});
            return;
        }
        ir9.b("SeekBarScrollInterceptManager", "从视图树上移除SeekBarScrollInterceptView");
        if (d()) {
            SeekBarScrollInterceptView seekBarScrollInterceptView = this.b;
            if (seekBarScrollInterceptView != null && (seekBarScrollInterceptView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            ViewGroup c = p91.c();
            if (c != null && (c.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) c.getParent();
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof SeekBarScrollInterceptView) {
                        viewGroup.removeView(childAt);
                    }
                }
            }
        }
    }
}
