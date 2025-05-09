package tb;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.android.ultron.common.widget.RefreshCustomProgressBar;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zua implements l2n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int m = 24;
    private static final int n = 48;
    private static final int o = 64;

    /* renamed from: a  reason: collision with root package name */
    private Context f33018a;
    private View b;
    private int c;
    private int d;
    private int e;
    private View f;
    private TextView g;
    private ImageView h;
    private ProgressBar i;
    private RefreshCustomProgressBar j;
    private int k = -1;
    private int l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f33019a;

        public a(View view) {
            this.f33019a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                this.f33019a.setVisibility(8);
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
        t2o.a(153092155);
        t2o.a(632291344);
    }

    public zua(Context context, View view) {
        this.f33018a = context;
        this.b = view;
        this.d = d(context, 24);
        this.e = (int) TypedValue.applyDimension(1, 64.0f, context.getResources().getDisplayMetrics());
        this.c = ((int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics())) + this.d;
    }

    private float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de251b6d", new Object[]{this, new Float(f)})).floatValue();
        }
        return Math.abs(f) / b(this.l);
    }

    private void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc4558b", new Object[]{this, view});
        } else if (view != null) {
            view.clearAnimation();
            view.setVisibility(0);
        }
    }

    private void f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b26975b", new Object[]{this, view});
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

    private void g(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c3ebcd", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.g;
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
    }

    @Override // tb.l2n
    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40eac2eb", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.b.getVisibility() == 0) {
            return this.c + this.e;
        }
        return this.c;
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f16f81", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    @Override // tb.l2n
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
            return;
        }
        RefreshCustomProgressBar refreshCustomProgressBar = this.j;
        if (refreshCustomProgressBar != null) {
            refreshCustomProgressBar.setVisibility(0);
        }
        ProgressBar progressBar = this.i;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // tb.l2n
    public void onPull(float f) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
            return;
        }
        float c = c(f);
        if (c < 1.0d) {
            TextView textView = this.g;
            if (textView != null) {
                textView.setText("下拉刷新页面...");
            }
        } else {
            TextView textView2 = this.g;
            if (textView2 != null) {
                textView2.setText("释放刷新页面...");
            }
        }
        TextView textView3 = this.g;
        if (textView3 != null && (i = this.k) > 0) {
            textView3.setTextColor(i);
        }
        e(this.h);
        RefreshCustomProgressBar refreshCustomProgressBar = this.j;
        if (refreshCustomProgressBar != null && refreshCustomProgressBar.getVisibility() == 0) {
            this.j.onPullDownDistance(c);
        }
        ProgressBar progressBar = this.i;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.i.setVisibility(8);
        }
    }

    @Override // tb.l2n
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
        } else if (c(f) >= 1.0d) {
            f(this.h);
        }
    }

    @Override // tb.l2n
    public void onUpdateDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    @Override // tb.l2n
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("15436c13", new Object[]{this, viewGroup});
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.common_page_refresh_ptr_loading_vertical, viewGroup, false);
        this.f = inflate;
        View findViewById = inflate.findViewById(R.id.tv_ptr_label);
        if (findViewById instanceof TextView) {
            TextView textView = (TextView) findViewById;
            this.g = textView;
            textView.setTextColor(-16777216);
        }
        View findViewById2 = this.f.findViewById(R.id.iv_ptr_indicator);
        if (findViewById2 instanceof ImageView) {
            this.h = (ImageView) findViewById2;
        }
        View findViewById3 = this.f.findViewById(R.id.pb_ptr_progress);
        if (findViewById3 instanceof ProgressBar) {
            this.i = (ProgressBar) findViewById3;
        }
        g("下拉刷新页面...");
        return this.f;
    }

    @Override // tb.l2n
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
        } else if (z) {
            RefreshCustomProgressBar refreshCustomProgressBar = this.j;
            if (refreshCustomProgressBar != null) {
                refreshCustomProgressBar.setVisibility(8);
            }
            ProgressBar progressBar = this.i;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.g;
            if (textView != null) {
                textView.setText(charSequence);
            }
        } else {
            RefreshCustomProgressBar refreshCustomProgressBar2 = this.j;
            if (refreshCustomProgressBar2 != null) {
                refreshCustomProgressBar2.setVisibility(0);
            }
            ProgressBar progressBar2 = this.i;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            TextView textView2 = this.g;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.g.setText("下拉刷新页面...");
            }
        }
    }

    @Override // tb.l2n
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
            return;
        }
        TextView textView = this.g;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.g.setVisibility(0);
            }
            this.g.setText("加载中...");
        }
        RefreshCustomProgressBar refreshCustomProgressBar = this.j;
        if (refreshCustomProgressBar != null && refreshCustomProgressBar.getVisibility() == 0) {
            this.j.setVisibility(8);
        }
        ProgressBar progressBar = this.i;
        if (progressBar != null && progressBar.getVisibility() == 8) {
            this.i.setVisibility(0);
        }
    }

    @Override // tb.l2n
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
            return;
        }
        TextView textView = this.g;
        if (textView != null) {
            if (textView.getVisibility() == 8) {
                this.g.setVisibility(0);
            }
            this.g.setText("下拉刷新页面...");
        }
        e(this.h);
        RefreshCustomProgressBar refreshCustomProgressBar = this.j;
        if (refreshCustomProgressBar != null) {
            refreshCustomProgressBar.reset();
            if (this.j.getVisibility() == 8) {
                this.j.setVisibility(0);
            }
        }
        ProgressBar progressBar = this.i;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.i.setVisibility(8);
        }
    }

    private int d(Context context, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b4a5f87", new Object[]{this, context, new Integer(i)})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = resources.getDimensionPixelSize(identifier);
        }
        return i2 <= 0 ? (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()) : i2;
    }
}
