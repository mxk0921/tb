package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.ImmersiveRelativeLayout;
import com.taobao.search.searchdoor.TransparentSearchDoorActivity;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.rim;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yui extends tok {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TransparentSearchDoorActivity c;
    public boolean d;
    public ImmersiveRelativeLayout e;

    static {
        t2o.a(815792936);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yui(TransparentSearchDoorActivity transparentSearchDoorActivity) {
        super(transparentSearchDoorActivity);
        ckf.g(transparentSearchDoorActivity, "activity");
        this.c = transparentSearchDoorActivity;
    }

    public static /* synthetic */ Object ipc$super(yui yuiVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -257788861) {
            super.A();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/MiniSearchDoorActivity");
        }
    }

    public static final void p(yui yuiVar, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9057c153", new Object[]{yuiVar, valueAnimator});
            return;
        }
        ckf.g(yuiVar, "this$0");
        ImmersiveRelativeLayout immersiveRelativeLayout = yuiVar.e;
        ckf.d(immersiveRelativeLayout);
        Object animatedValue = valueAnimator.getAnimatedValue();
        ckf.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        immersiveRelativeLayout.setTranslationY(((Float) animatedValue).floatValue());
    }

    @Override // tb.tok, tb.und
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a27443", new Object[]{this});
            return;
        }
        super.A();
        rim.Companion.c(this.c);
        h();
        i(true, null);
    }

    @Override // tb.tok
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8d3cc2d", new Object[]{this})).intValue();
        }
        return R.layout.tbsearch_sf_searchdoor_popup;
    }

    @Override // tb.tok, tb.und
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        rim.b bVar = rim.Companion;
        TransparentSearchDoorActivity transparentSearchDoorActivity = this.c;
        ckf.e(transparentSearchDoorActivity, "null cannot be cast to non-null type com.taobao.search.sf.widgets.SearchPopupActivity");
        bVar.d(transparentSearchDoorActivity);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97a31ba6", new Object[]{this})).booleanValue();
        }
        if (this.d || b().p()) {
            return true;
        }
        return false;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6889d694", new Object[]{this});
            return;
        }
        this.d = true;
        this.c.finish();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58521de", new Object[]{this});
            return;
        }
        ImmersiveRelativeLayout immersiveRelativeLayout = this.e;
        ckf.d(immersiveRelativeLayout);
        immersiveRelativeLayout.setVisibility(8);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        ImmersiveRelativeLayout immersiveRelativeLayout = (ImmersiveRelativeLayout) this.c.findViewById(R.id.tbsearch_searchdoor);
        this.e = immersiveRelativeLayout;
        ckf.d(immersiveRelativeLayout);
        immersiveRelativeLayout.setTopRadius(p1p.a(24.0f));
        ImmersiveRelativeLayout immersiveRelativeLayout2 = this.e;
        ckf.d(immersiveRelativeLayout2);
        ViewGroup.LayoutParams layoutParams = immersiveRelativeLayout2.getLayoutParams();
        ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = SystemBarDecorator.getStatusBarHeight(this.c);
    }

    public final void i(boolean z, Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c962ffe6", new Object[]{this, new Boolean(z), animatorListener});
        } else if (b().C() && e()) {
            if (z) {
                valueAnimator = ValueAnimator.ofFloat(zuo.d(), 0.0f);
            } else {
                valueAnimator = ValueAnimator.ofFloat(0.0f, zuo.d());
            }
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.kfz
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    yui.p(yui.this, valueAnimator2);
                }
            });
            if (animatorListener != null) {
                valueAnimator.addListener(animatorListener);
            }
            valueAnimator.setDuration(300L);
            valueAnimator.start();
        }
    }

    @Override // tb.tok, tb.und
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("695dabf9", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
