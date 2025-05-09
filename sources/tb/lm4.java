package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.BaseActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lm4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile lm4 f23406a = null;
    public static int b = 5;
    public static final List<WeakReference<Activity>> c = new ArrayList();

    static {
        t2o.a(619708467);
    }

    public static lm4 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lm4) ipChange.ipc$dispatch("c4fe6cbd", new Object[0]);
        }
        if (f23406a == null) {
            synchronized (lm4.class) {
                try {
                    if (f23406a == null) {
                        lm4 lm4Var = new lm4();
                        f23406a = lm4Var;
                        return lm4Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23406a;
    }

    public synchronized void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47008769", new Object[]{this, activity});
            return;
        }
        boolean booleanValue = Boolean.valueOf(j9l.c("group_common_browser", "open_container_limit", "true")).booleanValue();
        if (activity != null && booleanValue) {
            List<WeakReference<Activity>> list = c;
            ((ArrayList) list).add(new WeakReference(activity));
            v7t.a("ContainerManager", "current activity size is " + ((ArrayList) list).size());
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25259ccf", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("WindVane", m7r.KEY_ORANGE_CONFIG_FIX_FIVE_TIME_FINISH_BNG, "true"));
    }

    public synchronized void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765c4e8c", new Object[]{this, activity});
            return;
        }
        boolean booleanValue = Boolean.valueOf(j9l.c("group_common_browser", "open_container_limit", "true")).booleanValue();
        if (activity != null && booleanValue) {
            Iterator it = ((ArrayList) c).iterator();
            while (it != null && it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || weakReference.get() == activity) {
                    it.remove();
                }
            }
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8aeaecb", new Object[]{this});
            return;
        }
        boolean booleanValue = Boolean.valueOf(j9l.c("group_common_browser", "open_container_limit", "true")).booleanValue();
        int intValue = Integer.valueOf(j9l.c("group_common_browser", "container_limit_num", "5")).intValue();
        if (intValue != 0) {
            b = intValue;
        }
        while (true) {
            List<WeakReference<Activity>> list = c;
            if (((ArrayList) list).size() <= b || !booleanValue) {
                break;
            }
            WeakReference weakReference = (WeakReference) ((ArrayList) list).remove(0);
            if (weakReference.get() != null) {
                v7t.a("ContainerManager", "finish last activity, current size is " + ((ArrayList) list).size());
                if (c()) {
                    ((BaseActivity) weakReference.get()).finish(!AfcLifeCycleCenter.isLauncherStart);
                } else {
                    ((Activity) weakReference.get()).finish();
                }
            }
        }
    }
}
