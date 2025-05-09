package tb;

import android.app.Activity;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class whv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UniqueActivityManager";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, WeakReference<Activity>> f30707a = new HashMap<>();

    static {
        t2o.a(775946292);
    }

    public void a(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else if (activity instanceof l6e) {
            String uniqueActivityCode = ((l6e) activity).uniqueActivityCode();
            HashMap<String, WeakReference<Activity>> hashMap = f30707a;
            if (hashMap.containsKey(uniqueActivityCode)) {
                Activity activity2 = hashMap.get(uniqueActivityCode).get();
                if (activity2 != null && !activity2.isFinishing()) {
                    activity2.finish();
                    new StringBuilder("finish unique activity ").append(activity2.toString());
                }
                new StringBuilder("remove unique ").append(uniqueActivityCode);
                hashMap.remove(uniqueActivityCode);
            }
            hashMap.put(uniqueActivityCode, new WeakReference<>(activity));
            new StringBuilder("add unique activity ").append(activity.toString());
        }
    }
}
