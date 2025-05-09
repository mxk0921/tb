package tb;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k17 implements h7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f22334a;
    public final Handler b = new Handler();
    public Runnable c;
    public TextView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(k17 k17Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f22335a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ int d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements AliBuyProgressBar.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar.c
            public void a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cec285e6", new Object[]{this, str});
                } else if (k17.d(k17.this) != null) {
                    k17.d(k17.this).setText(str);
                }
            }
        }

        public b(ImageView imageView, ViewGroup viewGroup, ViewGroup viewGroup2, int i) {
            this.f22335a = imageView;
            this.b = viewGroup;
            this.c = viewGroup2;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f22335a.setVisibility(8);
            this.b.setVisibility(0);
            AliBuyProgressBar aliBuyProgressBar = (AliBuyProgressBar) this.c.findViewById(R.id.alibuy_progress_bar);
            if (this.d == 1) {
                z = true;
            }
            aliBuyProgressBar.isAdjust(z);
            aliBuyProgressBar.setmProgressUpdateListener(new a());
        }
    }

    static {
        t2o.a(301990045);
        t2o.a(301990061);
    }

    public static /* synthetic */ TextView d(k17 k17Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("efdcf5bf", new Object[]{k17Var});
        }
        return k17Var.d;
    }

    @Override // tb.h7d
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3492ebd7", new Object[]{this, context});
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
        }
        ViewGroup viewGroup = this.f22334a;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f22334a.setVisibility(8);
        }
    }

    @Override // tb.h7d
    public void b(Context context, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea274ac", new Object[]{this, context, bool});
        } else {
            c(context, bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // tb.h7d
    public void c(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c70222", new Object[]{this, context, new Integer(i)});
        } else if (context instanceof Activity) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.alibuy_build_loading_layout, (ViewGroup) null);
            viewGroup.setOnClickListener(new a(this));
            ViewGroup e = e((Activity) context);
            this.f22334a = e;
            e.addView(viewGroup);
            this.f22334a.setVisibility(0);
            this.d = (TextView) this.f22334a.findViewById(R.id.loading_text_view);
            try {
                f(viewGroup, i);
            } catch (Throwable th) {
                rbb g = ck.g();
                g.e("onShowLoading exception !! " + th.toString());
            }
        }
    }

    public ViewGroup e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("fdecbd82", new Object[]{this, activity});
        }
        return (ViewGroup) activity.findViewById(16908290).getRootView();
    }

    public void f(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4139fb", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.alibuy_loading_box);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.loading_progressbar);
        viewGroup2.setVisibility(8);
        imageView.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, Key.ROTATION, 0.0f, 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        if (i != 2) {
            b bVar = new b(imageView, viewGroup2, viewGroup, i);
            this.c = bVar;
            this.b.removeCallbacks(bVar);
            this.b.postDelayed(this.c, 3000L);
        }
    }
}
