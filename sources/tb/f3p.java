package tb;

import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.DensityUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f3p implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o5n f18980a;
    public final /* synthetic */ c3p b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.f3p$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class animation.Animation$AnimationListenerC0918a implements Animation.AnimationListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public animation.Animation$AnimationListenerC0918a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else if (c3p.E2(f3p.this.b) != null && c3p.F2(f3p.this.b) != null) {
                    c3p.E2(f3p.this.b).setVisibility(8);
                    c3p.F2(f3p.this.b).setVisibility(8);
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

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (c3p.E2(f3p.this.b) != null && c3p.F2(f3p.this.b) != null && c3p.E2(f3p.this.b).getVisibility() != 8) {
                AnimationSet x2 = c3p.x2(f3p.this.b);
                x2.setAnimationListener(new animation.Animation$AnimationListenerC0918a());
                c3p.E2(f3p.this.b).startAnimation(x2);
            }
        }
    }

    public f3p(c3p c3pVar, o5n o5nVar) {
        this.b = c3pVar;
        this.f18980a = o5nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (c3p.C2(this.b).getVisibility() != 8) {
            c3p.E2(this.b).setVisibility(0);
            int i = "promotion".equals(this.f18980a.l) ? 20 : 10;
            if (!TextUtils.isEmpty(this.f18980a.e)) {
                c3p.F2(this.b).setVisibility(0);
                c3p.F2(this.b).setImageUrl(this.f18980a.e);
                c3p.t2(this.b).setPadding(DensityUtil.dip2px(c3p.G2(this.b), i), 0, DensityUtil.dip2px(c3p.H2(this.b), 41.0f), 0);
            } else {
                c3p.F2(this.b).setVisibility(8);
                c3p.t2(this.b).setPadding(DensityUtil.dip2px(c3p.u2(this.b), i), 0, DensityUtil.dip2px(c3p.v2(this.b), 15.0f), 0);
            }
            c3p.t2(this.b).setText(this.f18980a.d);
            c3p.t2(this.b).setContentDescription(this.f18980a.d);
            c3p.E2(this.b).startAnimation(c3p.w2(this.b));
            c3p.E2(this.b).postDelayed(new a(), this.f18980a.g * 1000);
        }
    }
}
