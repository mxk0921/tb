package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.hudong.TBHDActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class hzp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBHDSingleInstanceUtil";
    public static final hzp INSTANCE = new hzp();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, WeakReference<TBHDActivity>> f20990a = new ConcurrentHashMap<>();

    static {
        t2o.a(1031798829);
    }

    public final void a(String str, WeakReference<TBHDActivity> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f590ab0e", new Object[]{this, str, weakReference});
            return;
        }
        ckf.g(str, "uniqueTag");
        ckf.g(weakReference, "activityRef");
        f20990a.put(str, weakReference);
    }

    public final void b(String str, WeakReference<TBHDActivity> weakReference) {
        WeakReference<TBHDActivity> weakReference2;
        TBHDActivity tBHDActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61461b0a", new Object[]{this, str, weakReference});
            return;
        }
        ckf.g(str, "uniqueTag");
        ckf.g(weakReference, "activityRef");
        ConcurrentHashMap<String, WeakReference<TBHDActivity>> concurrentHashMap = f20990a;
        if (concurrentHashMap.containsKey(str) && (weakReference2 = concurrentHashMap.get(str)) != null && (tBHDActivity = weakReference2.get()) != null) {
            if (tBHDActivity == weakReference.get()) {
                tBHDActivity = null;
            }
            if (tBHDActivity != null) {
                tBHDActivity.finish();
                concurrentHashMap.remove(str);
                AppMonitor.Alarm.commitSuccess(TAG, "destroyDuplicateActivity", ckf.p("uniqueTag=", str));
            }
        }
    }
}
