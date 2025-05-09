package tb;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lbo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f23237a;
    public xud b;
    public String c;
    public TUrlImageView d;
    public final Application.ActivityLifecycleCallbacks e = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (activity == lbo.a(lbo.this)) {
                lbo.b(lbo.this, null);
                if (lbo.c(lbo.this) != null && !lbo.c(lbo.this).isDestroied()) {
                    lbo.c(lbo.this).destroy();
                }
                lbo.d(lbo.this, null);
            }
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

    static {
        t2o.a(779093221);
    }

    public static /* synthetic */ Activity a(lbo lboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("40855d7e", new Object[]{lboVar});
        }
        return lboVar.f23237a;
    }

    public static /* synthetic */ Activity b(lbo lboVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f420876e", new Object[]{lboVar, activity});
        }
        lboVar.f23237a = activity;
        return activity;
    }

    public static /* synthetic */ xud c(lbo lboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xud) ipChange.ipc$dispatch("bf6e6a2", new Object[]{lboVar});
        }
        return lboVar.b;
    }

    public static /* synthetic */ xud d(lbo lboVar, xud xudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xud) ipChange.ipc$dispatch("45445b0f", new Object[]{lboVar, xudVar});
        }
        lboVar.b = xudVar;
        return xudVar;
    }

    public void e(xud xudVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c653ae6d", new Object[]{this, xudVar, new Boolean(z)});
            return;
        }
        if (z) {
            Context context = xudVar.getContext();
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        } else {
            FrameLayout frameLayout = (FrameLayout) xudVar.getParent();
            ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
        }
        if (!xudVar.isDestroied()) {
            xudVar.destroy();
        }
    }

    public String f(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8de23af6", new Object[]{this, activity, str});
        }
        this.f23237a = activity;
        activity.registerActivityLifecycleCallbacks(this.e);
        TUrlImageView tUrlImageView = new TUrlImageView(activity);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01AKUr8H28y3QoauN5X_!!6000000008000-0-tps-1125-2436.jpg");
        this.d = tUrlImageView;
        this.c = "" + str.hashCode() + System.currentTimeMillis();
        w54 w54Var = new w54();
        w44 w44Var = new w44();
        String str2 = this.c;
        nkr nkrVar = new nkr(activity, "taolive_retention", w54Var, w44Var, new String[]{";window._retentionViewHashCode='" + str2 + "';"});
        nkrVar.k(str);
        this.b = nkrVar.d();
        return this.c;
    }

    public boolean g(String str) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e88da8e", new Object[]{this, str})).booleanValue();
        }
        if (this.b == null || !str.equals(this.c) || (activity = this.f23237a) == null) {
            return false;
        }
        FrameLayout frameLayout = new FrameLayout(this.f23237a);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(frameLayout.getBackground(), "alpha", 0, 255);
        ofInt.setDuration(160L);
        ofInt.start();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(280L);
        ofFloat.start();
        frameLayout.addView(this.b.getContainerView(), new ViewGroup.LayoutParams(-1, -1));
        this.b.pageAppear();
        this.b.onResume();
        return true;
    }
}
