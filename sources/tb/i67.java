package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i67 implements h7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f21118a;
    public final ExecutorService b = dn.d(1, 1, 1, TimeUnit.MINUTES, "buy-mask-loading");
    public final Activity c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f21119a;

        /* compiled from: Taobao */
        /* renamed from: tb.i67$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0942a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f21120a;

            public RunnableC0942a(Bitmap bitmap) {
                this.f21120a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                i67.d(i67.this).addView(w0q.b(a.this.f21119a, this.f21120a));
                a aVar = a.this;
                ViewGroup f = i67.this.f(aVar.f21119a);
                if (f == null) {
                    ck.g().e("DefaultSkeletonHandler getParentViewGroupOfSkeleton is null!!");
                } else {
                    f.addView(i67.d(i67.this));
                }
            }
        }

        public a(Activity activity) {
            this.f21119a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                dn.f(new RunnableC0942a(w0q.a(this.f21119a)), 0L);
            } catch (Throwable th) {
                rbb g = ck.g();
                g.b("TBBuyLoading", "asyncLoad", "buy-mask-loading|异步加载配置失败,error=" + th.getMessage());
            }
        }
    }

    static {
        t2o.a(301990055);
        t2o.a(301990061);
    }

    public i67(Activity activity) {
        this.c = activity;
    }

    public static /* synthetic */ ViewGroup d(i67 i67Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("b45fd0ee", new Object[]{i67Var});
        }
        return i67Var.f21118a;
    }

    @Override // tb.h7d
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3492ebd7", new Object[]{this, context});
        } else if (this.f21118a != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(50L);
            this.f21118a.startAnimation(alphaAnimation);
            this.f21118a.setVisibility(8);
        }
    }

    @Override // tb.h7d
    public void b(Context context, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea274ac", new Object[]{this, context, bool});
            return;
        }
        ViewGroup viewGroup = this.f21118a;
        if (viewGroup == null) {
            e(this.c);
        } else {
            viewGroup.setVisibility(0);
        }
    }

    @Override // tb.h7d
    public void c(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c70222", new Object[]{this, context, new Integer(i)});
        } else {
            b(context, Boolean.FALSE);
        }
    }

    public void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f169af1", new Object[]{this, activity});
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        this.f21118a = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.b.execute(new a(activity));
    }

    public ViewGroup f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1c098b1e", new Object[]{this, activity});
        }
        View findViewById = activity.findViewById(16908290);
        if (findViewById == null) {
            return null;
        }
        return (ViewGroup) findViewById.getRootView();
    }
}
