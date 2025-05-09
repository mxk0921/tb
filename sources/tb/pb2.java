package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import tb.pb2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pb2 implements wct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f25991a;
    public final koq b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final LinkedList<Activity> f25992a = new LinkedList<>();
        public final /* synthetic */ i1r b;

        public a(i1r i1rVar) {
            this.b = i1rVar;
        }

        public final /* synthetic */ void b(WeakReference weakReference) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abe3aa5d", new Object[]{this, weakReference});
                return;
            }
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                pb2.a(pb2.this, activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Activity peek;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            String simpleName = activity.getClass().getSimpleName();
            if (!"Welcome".equals(simpleName) && !"TBMainActivity".equals(simpleName) && !"TBBuyActivity".equals(simpleName) && !"CashActivity".equals(simpleName)) {
                if (this.f25992a.size() > this.b.a("maxKeepActivity", 5) && (peek = this.f25992a.peek()) != null) {
                    peek.finish();
                }
                this.f25992a.add(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            this.f25992a.remove(activity);
            final WeakReference weakReference = new WeakReference(activity);
            new Handler().post(new Runnable() { // from class: tb.ob2
                @Override // java.lang.Runnable
                public final void run() {
                    pb2.a.this.b(weakReference);
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    public pb2(x0s x0sVar, koq koqVar) {
        this.f25991a = x0sVar;
        this.b = koqVar;
    }

    public static /* synthetic */ void a(pb2 pb2Var, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1256eba", new Object[]{pb2Var, activity});
        } else {
            pb2Var.b(activity);
        }
    }

    public final void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f276312e", new Object[]{this, activity});
            return;
        }
        try {
            Window window = activity.getWindow();
            if (window != null) {
                c(window.getDecorView());
            }
        } catch (Throwable th) {
            ehh.d(th);
        }
    }

    public final void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91380920", new Object[]{this, view});
        } else if (view != null) {
            view.setBackgroundDrawable(null);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    c(viewGroup.getChildAt(i));
                }
            } else if (view instanceof ImageView) {
                ((ImageView) view).setImageDrawable(null);
            }
        }
    }

    @Override // tb.wct
    public void execute() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 23) {
            i1r a2 = o1r.a(this.f25991a.g());
            is64Bit = Process.is64Bit();
            if (!is64Bit && a2.b("autoReleaseMemory", this.b.defaultValue())) {
                ehh.b("Bit32Task", "autoReleaseMemory open");
                this.f25991a.g().registerActivityLifecycleCallbacks(new a(a2));
            }
        }
    }
}
