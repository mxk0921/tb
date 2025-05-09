package tb;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fip extends qr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c Companion = new c(null);
    public ValueAnimator c;
    public int d;
    public final int v = R.drawable.top_bar_share_icon;

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
                fip.m(fip.this);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TUrlImageView b;

        public b(TUrlImageView tUrlImageView) {
            this.b = tUrlImageView;
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
                fip.n(fip.this, ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c {
        static {
            t2o.a(916455689);
        }

        public c() {
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455688);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fip(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(fip fipVar, String str, Object... objArr) {
        if (str.hashCode() == -41557118) {
            super.l(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/topbar/component/ShareButtonComponent");
    }

    public static final /* synthetic */ void m(fip fipVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb7d0c5", new Object[]{fipVar});
        } else {
            fipVar.q();
        }
    }

    public static final /* synthetic */ void n(fip fipVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75f7887", new Object[]{fipVar, new Integer(i)});
        } else {
            fipVar.d = i;
        }
    }

    /* renamed from: a */
    public TUrlImageView createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("829b8b74", new Object[]{this});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        tUrlImageView.setImageResource(this.v);
        tUrlImageView.setContentDescription(sqj.SHARE_BUTTON);
        tUrlImageView.setOnClickListener(new a());
        tUrlImageView.post(new b(tUrlImageView));
        return tUrlImageView;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f39eef", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) getView();
        if (tUrlImageView != null) {
            tUrlImageView.setImageResource(this.v);
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("accee1f3", new Object[]{this, str});
            return;
        }
        ckf.g(str, "iconUrl");
        if (str.length() > 0) {
            TUrlImageView tUrlImageView = (TUrlImageView) getView();
            if (tUrlImageView != null) {
                tUrlImageView.setImageDrawable(null);
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) getView();
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(str);
            }
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
        TUrlImageView tUrlImageView = (TUrlImageView) getView();
        if (tUrlImageView != null) {
            tUrlImageView.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final void o(View view, boolean z) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b8a9b5", new Object[]{this, view, new Boolean(z)});
            return;
        }
        ValueAnimator valueAnimator2 = this.c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginStart = marginLayoutParams.width + marginLayoutParams.getMarginStart();
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "ShareButtonComponent", "执行结尾边距动画，isShow=" + z + "，offsetX=" + marginStart + "，initialMarginEnd=" + this.d, null, 4, null);
            if (z) {
                valueAnimator = ValueAnimator.ofInt(-marginStart, this.d);
            } else {
                valueAnimator = ValueAnimator.ofInt(this.d, -marginStart);
            }
            ckf.f(valueAnimator, "valueAnimator");
            valueAnimator.setDuration(300L);
            valueAnimator.addUpdateListener(new dip(marginLayoutParams, view));
            valueAnimator.start();
            this.c = valueAnimator;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79264c7", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "ShareButtonComponent", "处理点击", null, 4, null);
        ((xwc) k().getService(xwc.class)).L0();
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public boolean hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9631f0cd", new Object[]{this})).booleanValue();
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "ShareButtonComponent", "隐藏分享按钮", null, 4, null);
        TUrlImageView tUrlImageView = (TUrlImageView) getView();
        if (tUrlImageView == null) {
            tpu.a.b(aVar, "ShareButtonComponent", "隐藏分享按钮，view为空", null, 4, null);
            return false;
        } else if (!isShowing()) {
            tpu.a.b(aVar, "ShareButtonComponent", "隐藏分享按钮，当前未显示", null, 4, null);
            return false;
        } else {
            ViewParent parent = tUrlImageView.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null ? viewGroup.isLaidOut() : false) {
                o(tUrlImageView, false);
            } else {
                tUrlImageView.setVisibility(8);
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
        tpu.a.b(aVar, "ShareButtonComponent", "显示分享按钮", null, 4, null);
        TUrlImageView tUrlImageView = (TUrlImageView) getView();
        if (tUrlImageView == null) {
            tpu.a.b(aVar, "ShareButtonComponent", "显示分享按钮，view为空", null, 4, null);
            return false;
        } else if (isShowing()) {
            tpu.a.b(aVar, "ShareButtonComponent", "显示分享按钮，当前已显示", null, 4, null);
            return false;
        } else {
            tUrlImageView.setVisibility(0);
            ViewParent parent = tUrlImageView.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                z = viewGroup.isLaidOut();
            }
            if (z) {
                o(tUrlImageView, true);
            }
            setShowing(true);
            return true;
        }
    }
}
