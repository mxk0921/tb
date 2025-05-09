package tb;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c4n extends qr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c Companion = new c(null);
    public ImageView c;
    public ValueAnimator d;
    public int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                c4n.m(c4n.this);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FrameLayout b;

        public b(FrameLayout frameLayout) {
            this.b = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            if (layoutParams != null) {
                c4n.n(c4n.this, ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c {
        static {
            t2o.a(916455681);
        }

        public c() {
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455680);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4n(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(c4n c4nVar, String str, Object... objArr) {
        if (str.hashCode() == -41557118) {
            super.l(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/topbar/component/PublishButtonComponent");
    }

    public static final /* synthetic */ void m(c4n c4nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc24f3b5", new Object[]{c4nVar});
        } else {
            c4nVar.p();
        }
    }

    public static final /* synthetic */ void n(c4n c4nVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35ded57", new Object[]{c4nVar, new Integer(i)});
        } else {
            c4nVar.e = i;
        }
    }

    @Override // tb.qr1
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd85e382", new Object[]{this, new Integer(i)});
            return;
        }
        super.l(i);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final void o(View view, boolean z) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b8a9b5", new Object[]{this, view, new Boolean(z)});
            return;
        }
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int width = view.getWidth() + marginLayoutParams.getMarginStart();
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "PublishButtonComponent", "执行结尾边距动画，isShow=" + z + "，offsetX=" + width + "，initialMarginEnd=" + this.e, null, 4, null);
            if (z) {
                valueAnimator = ValueAnimator.ofInt(-width, this.e);
            } else {
                valueAnimator = ValueAnimator.ofInt(this.e, -width);
            }
            ckf.f(valueAnimator, "valueAnimator");
            valueAnimator.setDuration(300L);
            valueAnimator.addUpdateListener(new b4n(marginLayoutParams, view));
            valueAnimator.start();
            this.d = valueAnimator;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79264c7", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "PublishButtonComponent", "处理点击", null, 4, null);
        ((fed) k().getService(fed.class)).f(null);
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setContentDescription("发布，按钮");
        frameLayout.setOnClickListener(new a());
        frameLayout.post(new b(frameLayout));
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setImageResource(R.drawable.top_bar_publish_main_icon);
        frameLayout.addView(imageView);
        this.c = imageView;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView2.setImageResource(R.drawable.top_bar_publish_add_icon);
        frameLayout.addView(imageView2);
        return frameLayout;
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public boolean hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9631f0cd", new Object[]{this})).booleanValue();
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "PublishButtonComponent", "隐藏发布按钮", null, 4, null);
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            tpu.a.b(aVar, "PublishButtonComponent", "隐藏发布按钮，view为空", null, 4, null);
            return false;
        } else if (!isShowing()) {
            tpu.a.b(aVar, "PublishButtonComponent", "隐藏发布按钮，当前未显示", null, 4, null);
            return false;
        } else {
            ViewParent parent = frameLayout.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null ? viewGroup.isLaidOut() : false) {
                o(frameLayout, false);
            } else {
                frameLayout.setVisibility(8);
            }
            setShowing(false);
            return true;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public boolean show() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "PublishButtonComponent", "显示发布按钮", null, 4, null);
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            tpu.a.b(aVar, "PublishButtonComponent", "显示发布按钮，view为空", null, 4, null);
            return false;
        } else if (isShowing()) {
            tpu.a.b(aVar, "PublishButtonComponent", "显示发布按钮，当前已显示", null, 4, null);
            return false;
        } else {
            frameLayout.setVisibility(0);
            ViewParent parent = frameLayout.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                z = viewGroup.isLaidOut();
            }
            if (z) {
                o(frameLayout, true);
            }
            setShowing(true);
            return true;
        }
    }
}
