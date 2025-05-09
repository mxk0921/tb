package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
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
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.gpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ebg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final eeq f18442a = new eeq(30.47f, 15.17f, false);
    public static final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f18443a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ d d;

        public a(Activity activity, String str, long j, d dVar) {
            this.f18443a = activity;
            this.b = str;
            this.c = j;
            this.d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ebg.a(this.f18443a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f18444a;
        public final /* synthetic */ String b;

        public b(Application application, String str) {
            this.f18444a = application;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ebg.b(this.f18444a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends gpl.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18445a;
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
                    ebg.d(c.this.f18445a);
                }
            }
        }

        public c(View view, long j) {
            this.f18445a = view;
            this.b = j;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/widget/LCToast$3");
        }

        @Override // tb.gpl.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ebg.c().removeCallbacksAndMessages(null);
            ebg.c().postDelayed(new a(), this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f18447a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public FrameLayout.LayoutParams h;

        static {
            t2o.a(511705676);
        }
    }

    static {
        t2o.a(511705671);
    }

    public static /* synthetic */ void a(Activity activity, String str, long j, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0344db", new Object[]{activity, str, new Long(j), dVar});
        } else {
            m(activity, str, j, dVar);
        }
    }

    public static /* synthetic */ void b(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27a131", new Object[]{application, str});
        } else {
            n(application, str);
        }
    }

    public static /* synthetic */ Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1907942d", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcbf158", new Object[]{view});
        } else {
            g(view);
        }
    }

    public static void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e11b8e0", new Object[]{view});
        } else if ((view.getTag() instanceof ObjectAnimator) && ((ObjectAnimator) view.getTag()).isRunning()) {
            ((ObjectAnimator) view.getTag()).cancel();
        }
    }

    public static void g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f81969", new Object[]{view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(ofFloat);
    }

    public static void h(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0875a0", new Object[]{activity, str});
        } else {
            i(activity, str, 3000L);
        }
    }

    public static void i(Activity activity, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7406b524", new Object[]{activity, str, new Long(j)});
            return;
        }
        d dVar = new d();
        dVar.f18447a = activity.getResources().getDrawable(R.drawable.drawable_common_toast_bg);
        dVar.h = new FrameLayout.LayoutParams(-2, -2, 17);
        dVar.b = -1;
        int a2 = t74.a(activity, 10.0f);
        dVar.g = a2;
        dVar.f = a2;
        int a3 = t74.a(activity, 25.0f);
        dVar.e = a3;
        dVar.d = a3;
        dVar.c = t74.a(activity, 15.0f);
        j(activity, str, j, dVar);
    }

    public static void j(Activity activity, String str, long j, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a082e", new Object[]{activity, str, new Long(j), dVar});
        } else {
            trt.h(new a(activity, str, j, dVar));
        }
    }

    public static void k(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45dd365", new Object[]{application, str});
        } else {
            trt.h(new b(application, str));
        }
    }

    public static void l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa33c00e", new Object[]{context, str});
        } else if (context instanceof Activity) {
            h((Activity) context, str);
        } else {
            k((Application) context.getApplicationContext(), str);
        }
    }

    public static void m(Activity activity, String str, long j, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b8ba52", new Object[]{activity, str, new Long(j), dVar});
            return;
        }
        int i = R.id.lc_toast;
        TextView textView = (TextView) activity.findViewById(i);
        if (textView == null) {
            textView = (TextView) LayoutInflater.from(activity).inflate(R.layout.layout_common_toast, (ViewGroup) null);
            textView.setId(i);
            activity.addContentView(textView, dVar.h);
        }
        textView.setLayoutParams(dVar.h);
        textView.setBackground(dVar.f18447a);
        textView.setText(str);
        textView.setTextSize(0, dVar.c);
        textView.setTextColor(dVar.b);
        textView.setPadding(dVar.d, dVar.g, dVar.e, dVar.f);
        textView.setCompoundDrawablePadding(0);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        f(textView, j);
    }

    public static void n(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ed4189", new Object[]{application, str});
            return;
        }
        Toast makeText = Toast.makeText(application, str, 1);
        TextView textView = (TextView) LayoutInflater.from(application).inflate(R.layout.layout_common_toast, (ViewGroup) null, false);
        textView.setText(str);
        makeText.setView(textView);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public static void f(View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11221975", new Object[]{view, new Long(j)});
            return;
        }
        b.removeCallbacksAndMessages(null);
        e(view);
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        ofPropertyValuesHolder.setInterpolator(f18442a.clone());
        ofPropertyValuesHolder.setDuration(600L);
        ofPropertyValuesHolder.addListener(new c(view, j));
        ofPropertyValuesHolder.start();
        view.setTag(ofPropertyValuesHolder);
    }
}
