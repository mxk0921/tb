package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r75 implements ptb, ctb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWFrontCoverBean f27159a;
    public final DWContext b;
    public FrameLayout c;
    public ImageView d;
    public TextView e;
    public TextView f;
    public final vsb g = new s75();
    public DWLifecycleType h;
    public FrameLayout i;
    public FrameLayout j;
    public boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            r75 r75Var = r75.this;
            r75Var.k = false;
            r75.a(r75Var).setVisibility(8);
            if (r75.b(r75.this).mDWImageAdapter != null && r75.c(r75.this) != null) {
                ((z75) r75.b(r75.this).mDWImageAdapter).f(null, r75.c(r75.this));
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
        t2o.a(452985101);
        t2o.a(452985044);
        t2o.a(452985037);
    }

    public r75(DWContext dWContext) {
        this.b = dWContext;
        g();
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWFrontCoverManager);
    }

    public static /* synthetic */ FrameLayout a(r75 r75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8adfd01b", new Object[]{r75Var});
        }
        return r75Var.c;
    }

    public static /* synthetic */ DWContext b(r75 r75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("96d8fdf8", new Object[]{r75Var});
        }
        return r75Var.b;
    }

    public static /* synthetic */ ImageView c(r75 r75Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("878e7554", new Object[]{r75Var});
        }
        return r75Var.d;
    }

    public void d() {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        zsb zsbVar = this.b.mDWImageAdapter;
        if (zsbVar != null && (imageView = this.d) != null) {
            ((z75) zsbVar).f(null, imageView);
        }
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.c;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2875cbd", new Object[]{this});
        } else if (!this.k) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            this.c.startAnimation(alphaAnimation);
            this.k = true;
            alphaAnimation.setAnimationListener(new a());
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df54f0a", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.b.getActivity().getLayoutInflater().inflate(R.layout.dw_interactive_frontcover, (ViewGroup) null);
        this.c = frameLayout;
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.dw_frontcover_cover);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f = (TextView) this.c.findViewById(R.id.dw_frontcover_bottom_playtimes_textview);
        this.i = (FrameLayout) this.c.findViewById(R.id.dw_frontcover_bottom_playtimes_layout);
        this.e = (TextView) this.c.findViewById(R.id.dw_frontcover_bottom_videoduration_textview);
        this.j = (FrameLayout) this.c.findViewById(R.id.dw_frontcover_bottom_layout);
    }

    public void h(int i, DWResponse dWResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5899408a", new Object[]{this, new Integer(i), dWResponse});
        } else {
            this.c.setVisibility(8);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648bc54e", new Object[]{this});
        } else {
            ((s75) this.g).a(this.b, this);
        }
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.h = dWLifecycleType;
        DWLifecycleType dWLifecycleType2 = DWLifecycleType.BEFORE;
        if (dWLifecycleType != dWLifecycleType2 && this.c.getVisibility() == 0) {
            if (!this.b.needRequestFrontCoverData()) {
                f();
            } else {
                zsb zsbVar = this.b.mDWImageAdapter;
                if (!(zsbVar == null || (imageView = this.d) == null)) {
                    ((z75) zsbVar).f(null, imageView);
                }
            }
            this.c.setVisibility(8);
        } else if (this.b.isNeedFrontCover() && this.h == dWLifecycleType2) {
            this.c.setVisibility(0);
            DWFrontCoverBean dWFrontCoverBean = this.f27159a;
            if (dWFrontCoverBean != null) {
                i(dWFrontCoverBean);
            } else if (this.b.needRequestFrontCoverData()) {
                j();
            } else if (this.b.getFrontCoverData() != null && this.b.getFrontCoverData().a() != null) {
                this.c.removeAllViews();
                View a2 = this.b.getFrontCoverData().a();
                if (!(a2 == null || a2.getParent() == null)) {
                    ((ViewGroup) a2.getParent()).removeView(a2);
                }
                this.c.addView(this.b.getFrontCoverData().a(), new FrameLayout.LayoutParams(-1, -1));
            } else if (this.b.getFrontCoverData() != null && this.b.getFrontCoverData().b() != null) {
                i(this.b.getFrontCoverData().b());
            }
        }
    }

    public void i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438a102d", new Object[]{this, obj});
        } else if (obj != null && (obj instanceof DWFrontCoverBean)) {
            DWFrontCoverBean dWFrontCoverBean = (DWFrontCoverBean) obj;
            this.f27159a = dWFrontCoverBean;
            if (!TextUtils.isEmpty(dWFrontCoverBean.getCoverPicUrl()) && this.d != null) {
                ((z75) this.b.mDWImageAdapter).f(this.f27159a.getCoverPicUrl(), this.d);
                if (this.f27159a.getScaleType() != null) {
                    this.d.setScaleType(this.f27159a.getScaleType());
                }
            }
            if (this.f27159a.getPlayTimes() > 0) {
                StringBuilder a2 = z85.a(this.f27159a.getPlayTimes());
                a2.append("人已观看");
                this.j.setVisibility(0);
                this.i.setVisibility(0);
                this.f.setText(a2);
            }
            if (!TextUtils.isEmpty(this.f27159a.getVideoDuration())) {
                this.e.setText(this.f27159a.getVideoDuration());
                this.j.setVisibility(0);
            }
        }
    }
}
