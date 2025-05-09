package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cra implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f17258a;
    public final WeakReference<TaoLiveVideoView> b;

    static {
        t2o.a(473956427);
    }

    public cra(Context context, TaoLiveVideoView taoLiveVideoView) {
        this.f17258a = new WeakReference<>(context);
        this.b = new WeakReference<>(taoLiveVideoView);
    }

    public final boolean a(Context context, Activity activity, TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52149791", new Object[]{this, context, activity, taoLiveVideoView})).booleanValue();
        }
        if (taoLiveVideoView == null) {
            return false;
        }
        if (context == activity) {
            return true;
        }
        if (!TextUtils.equals(TBMainHost.b().getSimpleName(), activity.getLocalClassName()) || context != context.getApplicationContext()) {
            return false;
        }
        return true;
    }

    public final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ed634d", new Object[]{this, context});
            return;
        }
        try {
            bqa.a("HVideoViewActivityLifecycleCallbacks", "unregisterMyself");
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        } catch (Throwable th) {
            bqa.d("HVideoViewActivityLifecycleCallbacks", "unregisterMyself is error" + th);
        }
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
            return;
        }
        Context context = this.f17258a.get();
        TaoLiveVideoView taoLiveVideoView = this.b.get();
        if (context != null) {
            if (a(context, activity, taoLiveVideoView)) {
                bqa.a("HVideoViewActivityLifecycleCallbacks", "videoView.release()");
                taoLiveVideoView.release();
            }
            b(context);
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
