package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.UCCore;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kc0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static kc0 b = null;

    /* renamed from: a  reason: collision with root package name */
    public final List<WeakReference<Activity>> f22555a = new ArrayList();

    static {
        t2o.a(947912711);
    }

    public static synchronized kc0 getInstance() {
        synchronized (kc0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kc0) ipChange.ipc$dispatch("8575ab3b", new Object[0]);
            }
            if (b == null) {
                b = new kc0();
            }
            return b;
        }
    }

    public void clearActivityStack() {
        try {
            Object a2 = jra.a();
            Field declaredField = a2.getClass().getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((ArrayMap) declaredField.get(a2)).values()) {
                Field declaredField2 = obj.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                Activity activity = (Activity) declaredField2.get(obj);
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    activity.finish();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handleActivityStack(String str, Intent intent, int i, int i2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03e919f", new Object[]{this, str, intent, new Integer(i), new Integer(i2)});
            return;
        }
        if (((ArrayList) this.f22555a).size() > 0) {
            List<WeakReference<Activity>> list = this.f22555a;
            str2 = ((Activity) ((WeakReference) ((ArrayList) list).get(((ArrayList) list).size() - 1)).get()).getClass().getName();
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str2, str) && (i2 == 1 || (i & UCCore.VERIFY_POLICY_PAK_QUICK) == 536870912)) {
            intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
        } else if (i2 == 2 || i2 == 3 || (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 67108864) {
            for (int i3 = 0; i3 < ((ArrayList) this.f22555a).size(); i3++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) this.f22555a).get(i3);
                if (weakReference != null && weakReference.get() != null && ((Activity) weakReference.get()).getClass().getName().equals(str)) {
                    List<WeakReference<Activity>> list2 = this.f22555a;
                    int i4 = i3 + 1;
                    for (WeakReference weakReference2 : ((ArrayList) list2).subList(i4, ((ArrayList) list2).size())) {
                        if (!(weakReference2 == null || weakReference2.get() == null)) {
                            ((Activity) weakReference2.get()).finish();
                        }
                    }
                    List<WeakReference<Activity>> list3 = this.f22555a;
                    ((ArrayList) list3).subList(i4, ((ArrayList) list3).size()).clear();
                    intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
                    return;
                }
            }
        }
    }

    public boolean isActivityStackEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("726d2869", new Object[]{this})).booleanValue();
        }
        if (((ArrayList) this.f22555a).size() == 0) {
            return true;
        }
        return false;
    }

    public Activity peekTopActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f7a19d78", new Object[]{this});
        }
        List<WeakReference<Activity>> list = this.f22555a;
        if (list == null || ((ArrayList) list).size() <= 0) {
            return null;
        }
        List<WeakReference<Activity>> list2 = this.f22555a;
        WeakReference weakReference = (WeakReference) ((ArrayList) list2).get(((ArrayList) list2).size() - 1);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public void popFromActivityStack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c9f9f7", new Object[]{this, activity});
            return;
        }
        for (int i = 0; i < ((ArrayList) this.f22555a).size(); i++) {
            WeakReference weakReference = (WeakReference) ((ArrayList) this.f22555a).get(i);
            if (!(weakReference == null || weakReference.get() == null || weakReference.get() != activity)) {
                ((ArrayList) this.f22555a).remove(weakReference);
            }
        }
    }

    public void pushToActivityStack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69e931d", new Object[]{this, activity});
        } else {
            ((ArrayList) this.f22555a).add(new WeakReference(activity));
        }
    }

    public int sizeOfActivityStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a57969db", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f22555a).size();
    }
}
