package tb;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.Application;
import android.app.TabActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.exposure.TrackerFrameLayout;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ccu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ccu e = null;

    /* renamed from: a  reason: collision with root package name */
    public b f16976a;
    public final Handler b;
    public up8 c;
    public final Set<Class> d = Collections.synchronizedSet(new HashSet());
    public HashMap<String, String> commonInfoMap = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593289);
        }

        public b() {
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
            } else if (activity != null && !(activity instanceof TabActivity) && !(activity instanceof ActivityGroup)) {
                if ("com.taobao.weex.WXActivity".equalsIgnoreCase(activity.getClass().getName()) || ccu.access$100(ccu.this).contains(activity.getClass())) {
                    try {
                        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                        if (viewGroup != null && (viewGroup.getChildAt(0) instanceof TrackerFrameLayout)) {
                            viewGroup.removeViewAt(0);
                        }
                    } catch (Exception e) {
                        un8.e(null, e, new Object[0]);
                    }
                }
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
            } else {
                ccu.this.addTrackerFrameLayout(activity);
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
        t2o.a(962593287);
    }

    public ccu() {
        if (this.b == null) {
            HandlerThread handlerThread = new HandlerThread("ut_exposure");
            handlerThread.start();
            this.b = new Handler(handlerThread.getLooper());
        }
    }

    public static /* synthetic */ Set access$100(ccu ccuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2c9e1bf1", new Object[]{ccuVar});
        }
        return ccuVar.d;
    }

    public static ccu getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ccu) ipChange.ipc$dispatch("cf6f077c", new Object[0]);
        }
        if (e == null) {
            synchronized (ccu.class) {
                try {
                    if (e == null) {
                        e = new ccu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public boolean addToTrack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5d39f8c", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        return this.d.add(activity.getClass());
    }

    public void enableExposureLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ad7433", new Object[]{this, new Boolean(z)});
        } else {
            un8.enableLog = z;
        }
    }

    public up8 getExposureViewHandle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (up8) ipChange.ipc$dispatch("4948c5d2", new Object[]{this});
        }
        return this.c;
    }

    public Handler getThreadHandle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("bac4ba97", new Object[]{this});
        }
        return this.b;
    }

    public void init(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        if (op8.trackerExposureOpen) {
            b bVar = new b();
            this.f16976a = bVar;
            application.registerActivityLifecycleCallbacks(bVar);
        }
        op8.init();
    }

    public void registerExposureViewHandler(up8 up8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc219cf", new Object[]{this, up8Var});
        } else {
            this.c = up8Var;
        }
    }

    public boolean removeToTrack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c020e809", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        return this.d.remove(activity.getClass());
    }

    public void setCommonInfoMap(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b808b", new Object[]{this, hashMap});
            return;
        }
        this.commonInfoMap.clear();
        this.commonInfoMap.putAll(hashMap);
    }

    public void unRegisterExposureViewHandler(up8 up8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32a9b88", new Object[]{this, up8Var});
        } else {
            this.c = null;
        }
    }

    public void unregisterActivityLifecycleCallbacks(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24701f49", new Object[]{this, application});
            return;
        }
        b bVar = this.f16976a;
        if (bVar != null) {
            application.unregisterActivityLifecycleCallbacks(bVar);
        }
    }

    public void addTrackerFrameLayout(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c247bb9", new Object[]{this, activity});
        } else if (activity != null && !(activity instanceof TabActivity) && !(activity instanceof ActivityGroup)) {
            if (("com.taobao.weex.WXActivity".equalsIgnoreCase(activity.getClass().getName()) || this.d.contains(activity.getClass())) && op8.trackerExposureOpen) {
                try {
                    ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                    if (viewGroup == null || viewGroup.getChildCount() <= 0) {
                        return;
                    }
                    if (viewGroup.getChildAt(0) instanceof TrackerFrameLayout) {
                        un8.d(null, "no attachTrackerFrameLayout ", activity.toString());
                        return;
                    }
                    TrackerFrameLayout trackerFrameLayout = new TrackerFrameLayout(activity);
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        trackerFrameLayout.addView(childAt, childAt.getLayoutParams());
                    }
                    viewGroup.addView(trackerFrameLayout, new ViewGroup.LayoutParams(-1, -1));
                } catch (Exception e2) {
                    un8.e(null, e2, new Object[0]);
                }
            }
        }
    }
}
