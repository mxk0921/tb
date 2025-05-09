package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.alibaba.ability.impl.audio.floatwindow.FloatWindowCanvas;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ko9 implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FloatWindowCanvas f22797a;
    public final Context b;

    static {
        t2o.a(98566209);
    }

    public ko9(Context context) {
        ckf.g(context, "context");
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        ckf.f(applicationContext, AdvanceSetting.NETWORK_TYPE);
        this.f22797a = new FloatWindowCanvas(applicationContext, null, 2, null);
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
    }

    public final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bdeae4", new Object[]{this, activity});
        } else if (activity != null) {
            FloatWindowCanvas floatWindowCanvas = this.f22797a;
            if (floatWindowCanvas != null) {
                ViewParent parent = floatWindowCanvas.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    FloatWindowCanvas floatWindowCanvas2 = this.f22797a;
                    if (floatWindowCanvas2 != null) {
                        viewGroup.removeView(floatWindowCanvas2);
                        FloatWindowCanvas floatWindowCanvas3 = this.f22797a;
                        if (floatWindowCanvas3 != null) {
                            floatWindowCanvas3.setAttachedActivityHash(-1);
                        } else {
                            ckf.y("floatWindowCanvas");
                            throw null;
                        }
                    } else {
                        ckf.y("floatWindowCanvas");
                        throw null;
                    }
                }
                Window window = activity.getWindow();
                ckf.f(window, "it.window");
                View decorView = window.getDecorView();
                if (decorView != null) {
                    FrameLayout frameLayout = (FrameLayout) decorView;
                    FloatWindowCanvas floatWindowCanvas4 = this.f22797a;
                    if (floatWindowCanvas4 != null) {
                        frameLayout.addView(floatWindowCanvas4);
                        FloatWindowCanvas floatWindowCanvas5 = this.f22797a;
                        if (floatWindowCanvas5 != null) {
                            floatWindowCanvas5.setAttachedActivityHash(activity.hashCode());
                        } else {
                            ckf.y("floatWindowCanvas");
                            throw null;
                        }
                    } else {
                        ckf.y("floatWindowCanvas");
                        throw null;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
            } else {
                ckf.y("floatWindowCanvas");
                throw null;
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865f0beb", new Object[]{this});
            return;
        }
        e(c21.i());
        Context applicationContext = this.b.getApplicationContext();
        if (applicationContext != null) {
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41951ff0", new Object[]{this});
        } else {
            a(c21.i());
        }
    }

    public final FloatWindowCanvas d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatWindowCanvas) ipChange.ipc$dispatch("d872c25c", new Object[]{this});
        }
        FloatWindowCanvas floatWindowCanvas = this.f22797a;
        if (floatWindowCanvas != null) {
            return floatWindowCanvas;
        }
        ckf.y("floatWindowCanvas");
        throw null;
    }

    public final void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d08ace1", new Object[]{this, activity});
            return;
        }
        FloatWindowCanvas floatWindowCanvas = this.f22797a;
        if (floatWindowCanvas != null) {
            ViewParent parent = floatWindowCanvas.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                FloatWindowCanvas floatWindowCanvas2 = this.f22797a;
                if (floatWindowCanvas2 != null) {
                    int attachedActivityHash = floatWindowCanvas2.getAttachedActivityHash();
                    if (activity != null && attachedActivityHash == activity.hashCode()) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        FloatWindowCanvas floatWindowCanvas3 = this.f22797a;
                        if (floatWindowCanvas3 != null) {
                            viewGroup.removeView(floatWindowCanvas3);
                            FloatWindowCanvas floatWindowCanvas4 = this.f22797a;
                            if (floatWindowCanvas4 != null) {
                                floatWindowCanvas4.setAttachedActivityHash(-1);
                            } else {
                                ckf.y("floatWindowCanvas");
                                throw null;
                            }
                        } else {
                            ckf.y("floatWindowCanvas");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("floatWindowCanvas");
                    throw null;
                }
            }
        } else {
            ckf.y("floatWindowCanvas");
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            ckf.g(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            ckf.g(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else {
            ckf.g(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        } else {
            ckf.g(activity, "activity");
        }
    }
}
