package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vxr implements h1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final feq f30319a = new feq(30.47f, 15.17f, false);
    public static final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f30320a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ d e;

        public a(Activity activity, ViewGroup viewGroup, String str, long j, d dVar) {
            this.f30320a = activity;
            this.b = viewGroup;
            this.c = str;
            this.d = j;
            this.e = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vxr.c(this.f30320a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f30321a;
        public final /* synthetic */ String b;

        public b(Application application, String str) {
            this.f30321a = application;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vxr.d(this.f30321a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f30322a;
        public final /* synthetic */ long b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    vxr.f(c.this.f30322a);
                }
            }
        }

        public c(View view, long j) {
            this.f30322a = view;
            this.b = j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (animator.getDuration() != 0) {
                vxr.e(this.f30322a);
                a aVar = new a();
                this.f30322a.setTag(R.id.toast_cancel_callback_tag, aVar);
                vxr.g().postDelayed(aVar, this.b);
            }
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f30324a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public FrameLayout.LayoutParams h;

        static {
            t2o.a(502267961);
        }
    }

    static {
        t2o.a(502267956);
        t2o.a(503316606);
    }

    public static /* synthetic */ void c(Activity activity, ViewGroup viewGroup, String str, long j, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fe9a1c", new Object[]{activity, viewGroup, str, new Long(j), dVar});
        } else {
            o(activity, viewGroup, str, j, dVar);
        }
    }

    public static /* synthetic */ void d(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27a131", new Object[]{application, str});
        } else {
            p(application, str);
        }
    }

    public static /* synthetic */ void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf29e39", new Object[]{view});
        } else {
            h(view);
        }
    }

    public static /* synthetic */ void f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcbf158", new Object[]{view});
        } else {
            k(view);
        }
    }

    public static /* synthetic */ Handler g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1cba3a6b", new Object[0]);
        }
        return b;
    }

    public static void h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710c968f", new Object[]{view});
        } else if (view != null) {
            int i = R.id.toast_cancel_anim_tag;
            if (view.getTag(i) instanceof ValueAnimator) {
                ((ValueAnimator) view.getTag(i)).setDuration(0L);
                ((ValueAnimator) view.getTag(i)).cancel();
                view.setTag(i, null);
            }
            int i2 = R.id.toast_cancel_callback_tag;
            if (view.getTag(i2) instanceof Runnable) {
                b.removeCallbacks((Runnable) view.getTag(i2));
                view.setTag(i2, null);
            }
        }
    }

    public static void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bde5674", new Object[]{view});
        } else if (view != null) {
            int i = R.id.toast_show_anim_tag;
            if (view.getTag(i) instanceof ValueAnimator) {
                ((ValueAnimator) view.getTag(i)).setDuration(0L);
                ((ValueAnimator) view.getTag(i)).cancel();
                view.setTag(i, null);
            }
        }
    }

    public static void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f81969", new Object[]{view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(R.id.toast_cancel_anim_tag, ofFloat);
    }

    public static void l(Activity activity, ViewGroup viewGroup, String str, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1787571e", new Object[]{activity, viewGroup, str, new Long(j), new Integer(i)});
            return;
        }
        d dVar = new d();
        dVar.f30324a = activity.getResources().getDrawable(R.drawable.tnode_drawable_common_toast_bg);
        dVar.h = new FrameLayout.LayoutParams(-2, -2, 17);
        dVar.b = -1;
        int c2 = s6o.c(activity, 10);
        dVar.g = c2;
        dVar.f = c2;
        int c3 = s6o.c(activity, 25);
        dVar.e = c3;
        dVar.d = c3;
        dVar.c = s6o.c(activity, 15);
        m(activity, viewGroup, str, j, dVar);
    }

    public static void m(Activity activity, ViewGroup viewGroup, String str, long j, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f96fef", new Object[]{activity, viewGroup, str, new Long(j), dVar});
        } else {
            nwv.y0(new a(activity, viewGroup, str, j, dVar));
        }
    }

    public static void n(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45dd365", new Object[]{application, str});
        } else {
            nwv.y0(new b(application, str));
        }
    }

    public static void o(Activity activity, ViewGroup viewGroup, String str, long j, d dVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee0e013", new Object[]{activity, viewGroup, str, new Long(j), dVar});
            return;
        }
        if (viewGroup == null) {
            view = activity.getWindow().getDecorView();
        } else {
            view = viewGroup;
        }
        int i = R.id.layout_manager_toast_id;
        TextView textView = (TextView) view.findViewById(i);
        if (textView == null) {
            textView = (TextView) LayoutInflater.from(activity).inflate(R.layout.tnode_layout_common_toast, (ViewGroup) null);
            textView.setId(i);
            if (viewGroup != null) {
                viewGroup.addView(textView, dVar.h);
            } else if (activity instanceof bod) {
                ((ViewGroup) activity.getWindow().getDecorView()).addView(textView, dVar.h);
            } else {
                activity.addContentView(textView, dVar.h);
            }
        }
        textView.setLayoutParams(dVar.h);
        textView.setBackground(dVar.f30324a);
        textView.setText(str);
        textView.setTextSize(0, dVar.c);
        textView.setTextColor(dVar.b);
        textView.setPadding(dVar.d, dVar.g, dVar.e, dVar.f);
        textView.setCompoundDrawablePadding(0);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        j(textView, j);
    }

    public static void p(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ed4189", new Object[]{application, str});
            return;
        }
        Toast makeText = Toast.makeText(application, str, 1);
        TextView textView = (TextView) LayoutInflater.from(application).inflate(R.layout.tnode_layout_common_toast, (ViewGroup) null, false);
        textView.setText(str);
        makeText.setView(textView);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    @Override // tb.h1e
    public void a(Context context, ViewGroup viewGroup, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21f2420", new Object[]{this, context, viewGroup, str, new Integer(i), new Integer(i2)});
        } else if (context instanceof Activity) {
            l((Activity) context, viewGroup, str, i, i2);
        } else {
            n((Application) context, str);
        }
    }

    @Override // tb.h1e
    public void b(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e680db0", new Object[]{this, context, str, new Integer(i), new Integer(i2)});
            return;
        }
        Toast toast = new Toast(context);
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.tnode_layout_common_toast, (ViewGroup) null, false);
        textView.setText(str);
        toast.setView(textView);
        toast.setDuration(i);
        toast.setGravity(i2, 0, 0);
        toast.show();
    }

    public static void j(View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11221975", new Object[]{view, new Long(j)});
            return;
        }
        i(view);
        h(view);
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        ofPropertyValuesHolder.setInterpolator(f30319a.clone());
        ofPropertyValuesHolder.setDuration(600L);
        ofPropertyValuesHolder.addListener(new c(view, j));
        ofPropertyValuesHolder.start();
        view.setTag(R.id.toast_show_anim_tag, ofPropertyValuesHolder);
    }
}
