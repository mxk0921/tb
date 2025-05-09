package tb;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g27 implements h7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public n6h f19691a;
    public final Handler b = new Handler();
    public Runnable c;
    public TextView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19692a;

        public a(Context context) {
            this.f19692a = context;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            if (!(dialogInterface == null || g27.d(g27.this) == null || !g27.d(g27.this).isShowing())) {
                dialogInterface.dismiss();
            }
            hh.d(this.f19692a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Boolean f19693a;

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
                } else if (g27.e(g27.this) != null) {
                    g27.e(g27.this).setText(str);
                }
            }
        }

        public b(Boolean bool) {
            this.f19693a = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (g27.d(g27.this) != null && g27.d(g27.this).isShowing()) {
                g27.d(g27.this).setContentView(R.layout.alibuy_build_loading_layout);
                AliBuyProgressBar aliBuyProgressBar = (AliBuyProgressBar) g27.d(g27.this).findViewById(R.id.alibuy_progress_bar);
                aliBuyProgressBar.isAdjust(this.f19693a.booleanValue());
                aliBuyProgressBar.setmProgressUpdateListener(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements AliBuyProgressBar.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                g27.f(g27.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements AliBuyProgressBar.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cec285e6", new Object[]{this, str});
            } else if (g27.e(g27.this) != null) {
                g27.e(g27.this).setText(str);
            }
        }
    }

    static {
        t2o.a(301990049);
        t2o.a(301990061);
    }

    public static /* synthetic */ n6h d(g27 g27Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n6h) ipChange.ipc$dispatch("6871403e", new Object[]{g27Var});
        }
        return g27Var.f19691a;
    }

    public static /* synthetic */ TextView e(g27 g27Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("3648cf33", new Object[]{g27Var});
        }
        return g27Var.d;
    }

    public static /* synthetic */ void f(g27 g27Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b14340", new Object[]{g27Var});
        } else {
            g27Var.g();
        }
    }

    @Override // tb.h7d
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3492ebd7", new Object[]{this, context});
            return;
        }
        n6h n6hVar = this.f19691a;
        if (n6hVar != null) {
            try {
                AliBuyProgressBar aliBuyProgressBar = (AliBuyProgressBar) n6hVar.findViewById(R.id.alibuy_progress_bar);
                if (aliBuyProgressBar != null) {
                    aliBuyProgressBar.finishLoading(new c());
                    aliBuyProgressBar.setmProgressUpdateListener(new d());
                } else {
                    g();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                vm0.e("onFinishLoading", th.getMessage());
            }
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
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c70222", new Object[]{this, context, new Integer(i)});
            return;
        }
        try {
            if (this.f19691a == null) {
                this.f19691a = new n6h(context, R.style.Dialog_Status_Container);
                Runnable runnable = this.c;
                if (runnable != null) {
                    this.b.removeCallbacks(runnable);
                }
                if (AliBuyPerfSwitcher.enablePreloadView()) {
                    this.f19691a.setContentView(ef1.i(context, R.layout.alibuy_progressbar_layout));
                } else {
                    this.f19691a.setContentView(R.layout.alibuy_progressbar_layout);
                }
                this.d = (TextView) this.f19691a.findViewById(R.id.loading_text_view);
                i();
                if (i != 2) {
                    if (i != 1) {
                        z = false;
                    }
                    h(context, Boolean.valueOf(z));
                    this.b.postDelayed(this.c, 3000L);
                }
                this.f19691a.c();
                this.f19691a.setOnCancelListener(new a(context));
                this.f19691a.show();
            }
        } catch (Throwable th) {
            ck.g().e(th.toString());
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d068c8f", new Object[]{this});
            return;
        }
        n6h n6hVar = this.f19691a;
        if (n6hVar != null) {
            try {
                n6hVar.dismiss();
                this.f19691a.setOnCancelListener(null);
                this.f19691a = null;
            } catch (Throwable unused) {
            }
        }
    }

    public final void h(Context context, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e255d2d9", new Object[]{this, context, bool});
        } else {
            this.c = new b(bool);
        }
    }

    public final void i() {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b9d829", new Object[]{this});
            return;
        }
        n6h n6hVar = this.f19691a;
        if (n6hVar != null && (imageView = (ImageView) n6hVar.findViewById(R.id.loading_progressbar)) != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, Key.ROTATION, 0.0f, 360.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.start();
        }
    }
}
