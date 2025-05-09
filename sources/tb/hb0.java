package tb;

import android.app.Activity;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.orange.OrangeConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hb0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile hb0 c;

    /* renamed from: a  reason: collision with root package name */
    public final int f20526a;
    public final LinkedList<WeakReference<Activity>> b = new LinkedList<>();

    static {
        t2o.a(764411989);
    }

    public hb0() {
        this.f20526a = 2;
        try {
            this.f20526a = Integer.parseInt(OrangeConfig.getInstance().getConfig("shop_render", "shop_render_stack_size", "2"));
        } catch (NumberFormatException unused) {
        }
    }

    public static hb0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hb0) ipChange.ipc$dispatch("3205d0de", new Object[0]);
        }
        if (c == null) {
            c = new hb0();
        }
        return c;
    }

    public void a(Activity activity) {
        WeakReference<Activity> removeFirst;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c378e10", new Object[]{this, activity});
        } else if (activity != null && this.f20526a > 0) {
            try {
                this.b.addLast(new WeakReference<>(activity));
                Log.e("ActivityInstanceManager", "adding activity " + activity);
                if (!TBDeviceUtils.t(activity)) {
                    if (TBDeviceUtils.G(activity)) {
                    }
                    if (TBDeviceUtils.t(activity) || TBDeviceUtils.G(activity) || this.b.size() <= this.f20526a) {
                        return;
                    }
                    removeFirst = this.b.removeFirst();
                    if (removeFirst != null && removeFirst.get() != null) {
                        Log.e("ActivityInstanceManager", "activity stack is full. " + this.b.size() + " finishing " + removeFirst.get());
                        removeFirst.get().finish();
                        return;
                    }
                    return;
                }
                if (this.b.size() > this.f20526a * 3) {
                    removeFirst = this.b.removeFirst();
                    if (removeFirst != null) {
                        return;
                    }
                    return;
                }
                if (TBDeviceUtils.t(activity)) {
                }
            } catch (Throwable th) {
                Log.e("ActivityInstanceManager", "checkAtCreate exception " + activity, th);
            }
        }
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26553c92", new Object[]{this, activity});
        } else if (activity != null && this.f20526a > 0) {
            try {
                Iterator<WeakReference<Activity>> it = this.b.iterator();
                WeakReference<Activity> weakReference = null;
                while (it.hasNext()) {
                    WeakReference<Activity> next = it.next();
                    if (!(next == null || next.get() == null || !activity.equals(next.get()))) {
                        weakReference = next;
                    }
                }
                if (weakReference != null) {
                    Log.e("ActivityInstanceManager", "removing activity " + weakReference.get());
                    weakReference.clear();
                    this.b.remove(weakReference);
                }
            } catch (Throwable th) {
                Log.e("ActivityInstanceManager", "checkAtDestory exception " + activity, th);
            }
        }
    }
}
