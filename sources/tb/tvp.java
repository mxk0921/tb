package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tvp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f28988a = {54.0f, 54.0f, 54.0f, 54.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] b = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f28989a;
        public final /* synthetic */ x3q b;

        public a(ViewGroup viewGroup, x3q x3qVar) {
            this.f28989a = viewGroup;
            this.b = x3qVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                tvp.a(this.f28989a, ((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f28990a;
        public final /* synthetic */ int b;
        public final /* synthetic */ x3q c;
        public final /* synthetic */ int d;

        public b(ViewGroup viewGroup, int i, x3q x3qVar, int i2) {
            this.f28990a = viewGroup;
            this.b = i;
            this.c = x3qVar;
            this.d = i2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                tvp.a(this.f28990a, this.d, this.c);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            tvp.a(this.f28990a, this.b, this.c);
            tvp.b(this.f28990a, this.c);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    static {
        t2o.a(468713951);
    }

    public static /* synthetic */ void a(ViewGroup viewGroup, float f, x3q x3qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c84a563", new Object[]{viewGroup, new Float(f), x3qVar});
        } else {
            g(viewGroup, f, x3qVar);
        }
    }

    public static /* synthetic */ void b(ViewGroup viewGroup, x3q x3qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41bc3456", new Object[]{viewGroup, x3qVar});
        } else {
            f(viewGroup, x3qVar);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48e0bd7c", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableCellShowRoundCardAfterMove", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("461c5367", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableUseWeexCardIdToMove", true);
    }

    public static boolean e(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("875339f6", new Object[]{new Boolean(z), view})).booleanValue();
        }
        if (z) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (!d()) {
            return TextUtils.equals("FlutterSplashView", view.getClass().getSimpleName());
        }
        if (view.getId() == R.id.fluid_sdk_weex_interactive_card) {
            return true;
        }
        return false;
    }

    public static void f(ViewGroup viewGroup, x3q x3qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1175c9", new Object[]{viewGroup, x3qVar});
        } else if (c() && viewGroup != null && x3qVar != null && x3qVar.i()) {
            boolean h = x3qVar.h();
            String b2 = x3qVar.b();
            VideoRoundCornerLayout videoRoundCornerLayout = (VideoRoundCornerLayout) viewGroup.findViewById(R.id.video_host);
            VideoRoundCornerLayout videoRoundCornerLayout2 = (VideoRoundCornerLayout) viewGroup.findViewById(R.id.live_host);
            if (videoRoundCornerLayout != null) {
                h(h, videoRoundCornerLayout, b2);
            } else if (videoRoundCornerLayout2 != null) {
                h(h, videoRoundCornerLayout2, b2);
            }
        }
    }

    public static void g(ViewGroup viewGroup, float f, x3q x3qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb0413d", new Object[]{viewGroup, new Float(f), x3qVar});
        } else if (viewGroup != null && x3qVar != null) {
            boolean i = x3qVar.i();
            boolean j = x3qVar.j();
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (i) {
                    if (e(j, childAt)) {
                    }
                    childAt.setTranslationY(f);
                } else {
                    if (childAt instanceof TNodeView) {
                    }
                    childAt.setTranslationY(f);
                }
            }
        }
    }

    public static void h(boolean z, VideoRoundCornerLayout videoRoundCornerLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc18068", new Object[]{new Boolean(z), videoRoundCornerLayout, str});
        } else if (videoRoundCornerLayout != null) {
            try {
                if (z) {
                    videoRoundCornerLayout.setCornerRadii(b);
                    videoRoundCornerLayout.setBackgroundColor(0);
                } else {
                    videoRoundCornerLayout.setCornerRadii(f28988a);
                    if (!TextUtils.isEmpty(str)) {
                        videoRoundCornerLayout.setBackgroundColor(Color.parseColor(str));
                    }
                }
            } catch (Throwable th) {
                ir9.c("ShowSlidedownBarHelper", "", th);
            }
        }
    }

    public static void i(x3q x3qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bbea40", new Object[]{x3qVar});
        } else if (x3qVar != null) {
            ir9.b("ShowSlidedownBarHelper", "收到VSMSG_screenMove消息,SlideDownParam:" + x3qVar.toString());
            ViewGroup d = x3qVar.d();
            if (d != null) {
                int f = x3qVar.f();
                int e = x3qVar.e() + f;
                if (!x3qVar.g()) {
                    g(d, e, x3qVar);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, e);
                ofFloat.setInterpolator(hfs.k(x3qVar.c()));
                ofFloat.addUpdateListener(new a(d, x3qVar));
                ofFloat.setDuration(x3qVar.a());
                ofFloat.addListener(new b(d, e, x3qVar, f));
                ofFloat.start();
            }
        }
    }
}
