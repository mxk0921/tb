package tb;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.refresh.CartCustomProgressBar;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yua implements l2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f32356a;
    private TextView b;
    private ImageView c;
    private ProgressBar d;
    private CartCustomProgressBar e;
    private int f;
    private View g;
    private boolean h;
    private final kmb i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f32357a;

        public a(View view) {
            this.f32357a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                this.f32357a.setVisibility(8);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(478151108);
        t2o.a(632291344);
    }

    public yua(Context context, kmb kmbVar) {
        this.f32356a = kmbVar.e().d0(20.0f) + SystemBarDecorator.SystemBarConfig.getStatusBarHeight(context);
        this.i = kmbVar;
    }

    private float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de251b6d", new Object[]{this, new Float(f)})).floatValue();
        }
        return Math.abs(f) / b(this.f);
    }

    private void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc4558b", new Object[]{this, view});
        } else if (view != null) {
            view.clearAnimation();
            view.setVisibility(0);
        }
    }

    public static void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b26975b", new Object[]{view});
        } else if (view != null) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setDuration(200L);
            animationSet.setAnimationListener(new a(view));
            view.clearAnimation();
            view.startAnimation(animationSet);
        }
    }

    private void f(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c3ebcd", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.b;
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6d4366", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override // tb.l2n
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("15436c13", new Object[]{this, viewGroup});
        }
        if (!vav.a(c9x.CART_BIZ_NAME, "enableReusePtrLoadingInflate", true)) {
            this.g = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icart_cart_ptr_loading_vertical, viewGroup, false);
            h();
        } else if (this.g == null) {
            this.g = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.icart_cart_ptr_loading_vertical, viewGroup, false);
            h();
        }
        ViewParent parent = this.g.getParent();
        if ((parent instanceof ViewGroup) && parent != viewGroup) {
            ((ViewGroup) parent).removeView(this.g);
        }
        KeyEvent.Callback callback = this.b;
        if (callback == null) {
            callback = this.g.findViewById(R.id.tv_ptr_label);
        }
        if (callback instanceof TextView) {
            this.b = (TextView) callback;
            if (eiv.a().d()) {
                this.b.setTextColor(-15658735);
            } else {
                this.b.setTextColor(-1);
            }
            if (ykl.a()) {
                ((LinearLayout.LayoutParams) this.b.getLayoutParams()).weight = 6.0f;
            }
        }
        if (this.c == null) {
            View findViewById = this.g.findViewById(R.id.iv_ptr_indicator);
            if (findViewById instanceof ImageView) {
                this.c = (ImageView) findViewById;
            }
        }
        if (this.d == null) {
            View findViewById2 = this.g.findViewById(R.id.pb_ptr_progress);
            if (findViewById2 instanceof ProgressBar) {
                this.d = (ProgressBar) findViewById2;
            }
        }
        if (this.e == null) {
            View findViewById3 = this.g.findViewById(R.id.cpb_ptr_progress);
            if (findViewById3 instanceof CartCustomProgressBar) {
                this.e = (CartCustomProgressBar) findViewById3;
            }
        }
        f(Localization.q(R.string.app_reload_page));
        return this.g;
    }

    @Override // tb.l2n
    public int b(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40eac2eb", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.h) {
            i2 = this.i.e().d0(36.0f);
        }
        return this.f32356a + i2;
    }

    public boolean g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7c15bd8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (c(i) > 1.0d) {
            return true;
        }
        return false;
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b38521", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void j(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8553cae9", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.g;
        if (view != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Override // tb.l2n
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
            return;
        }
        CartCustomProgressBar cartCustomProgressBar = this.e;
        if (cartCustomProgressBar != null) {
            cartCustomProgressBar.setVisibility(0);
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // tb.l2n
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
        } else if (z) {
            CartCustomProgressBar cartCustomProgressBar = this.e;
            if (cartCustomProgressBar != null) {
                cartCustomProgressBar.setVisibility(8);
            }
            ProgressBar progressBar = this.d;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setText(charSequence);
            }
        } else {
            CartCustomProgressBar cartCustomProgressBar2 = this.e;
            if (cartCustomProgressBar2 != null) {
                cartCustomProgressBar2.setVisibility(0);
            }
            ProgressBar progressBar2 = this.d;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            TextView textView2 = this.b;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.b.setText(Localization.q(R.string.app_reload_page));
            }
        }
    }

    @Override // tb.l2n
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
            return;
        }
        float c = c(f);
        if (c < 1.0d) {
            TextView textView = this.b;
            if (textView != null) {
                textView.setText(Localization.q(R.string.app_reload_page));
            }
        } else {
            TextView textView2 = this.b;
            if (textView2 != null) {
                textView2.setText(Localization.q(R.string.taobao_app_1028_1_21625));
            }
        }
        if (this.b != null) {
            if (eiv.a().d() || this.i.d().B().u()) {
                this.b.setTextColor(-15658735);
            } else {
                this.b.setTextColor(-1);
            }
        }
        d(this.c);
        CartCustomProgressBar cartCustomProgressBar = this.e;
        if (cartCustomProgressBar != null && cartCustomProgressBar.getVisibility() == 0) {
            this.e.onPullDownDistance(c);
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
    }

    @Override // tb.l2n
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
            return;
        }
        TextView textView = this.b;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.b.setVisibility(0);
            }
            this.b.setText(Localization.q(R.string.app_loading_progress));
        }
        CartCustomProgressBar cartCustomProgressBar = this.e;
        if (cartCustomProgressBar != null && cartCustomProgressBar.getVisibility() == 0) {
            this.e.setVisibility(8);
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && progressBar.getVisibility() == 8) {
            this.d.setVisibility(0);
        }
    }

    @Override // tb.l2n
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
        } else if (c(f) >= 1.0d) {
            e(this.c);
        }
    }

    @Override // tb.l2n
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
            return;
        }
        TextView textView = this.b;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.b.setVisibility(0);
            }
            this.b.setText(Localization.q(R.string.app_reload_page));
        }
        d(this.c);
        CartCustomProgressBar cartCustomProgressBar = this.e;
        if (cartCustomProgressBar != null) {
            cartCustomProgressBar.reset();
            if (this.e.getVisibility() == 8) {
                this.e.setVisibility(0);
            }
        }
        ProgressBar progressBar = this.d;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
    }

    @Override // tb.l2n
    public void onUpdateDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }
}
